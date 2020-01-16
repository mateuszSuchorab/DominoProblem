package com.suchorab;


import com.suchorab.enums.Examples;

public class Main {

    public static void main(String[] args) {
        startApplication(Examples.FIRST);
        startApplication(Examples.SECOND);
        startApplication(Examples.THIRD);
        startApplication(Examples.FOURTH);
        startApplication(Examples.FIFTH);
        startApplication(Examples.SIXTH);
    }

    private static void  startApplication(Examples example){
        System.out.println("----- START -----");
        String values = example.getValue();
        int[][] tab = putValueToTable(values);
        int n = tab.length;
        long start = System.nanoTime();
        putDomino(tab, n);
        long finish = System.nanoTime() - start;
        showPlaces(tab, n);
        System.out.println("Done in : " + (finish) / 1000000000 + " s");
        System.out.println("Done in : " + (finish) / 1000000 + " ms");
        System.out.println("Done in : " + finish + " ns");
        System.out.println("----- FINISH -----");
    }

    private static int[][] putValueToTable(String values) {
        int[][] tab = new int[0][0];
        String[] lines = values.split("\n");
        boolean firstOneNumber = false;
        for (int i = 0; i < lines.length; i++) {
            String[] newLines = lines[i].split(" ");
            if (newLines.length <= 1) {
                if (newLines[0].equals("0")) {
                    return tab;
                } else {
                    tab = new int[Integer.parseInt(newLines[0])][Integer.parseInt(newLines[0])];
                    firstOneNumber = true;
                }
            } else if (firstOneNumber) {
                tab[Integer.parseInt(newLines[0])][Integer.parseInt(newLines[1])] = 3;
            }

        }
        return tab;
    }

    private static void putDomino(int tab[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + 1 < n) {
                    if (tab[i][j] == 0 && tab[i][j + 1] == 0) {
                        tab[i][j] = 1;
                        tab[i][j + 1] = 1;
                    }
                    if (i + 1 < n) {
                        if (tab[i][j] == 0 && tab[i + 1][j] == 0) {
                            tab[i + 1][j] = 1;
                            tab[i][j] = 1;
                        }
                    }
                }
                if (i + 1 < n) {
                    if (tab[i + 1][j] == 0 && tab[i][j] == 0) {
                        tab[i][j] = 1;
                        tab[i + 1][j] = 1;
                    }
                }
            }
        }
    }

    private static void showPlaces(int tab[][], int n) {
        boolean emptyPoints = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tab[i][j] + " ");
                if (tab[i][j] == 0) {
                    emptyPoints = true;
                }
            }
            System.out.println();
        }
        if (emptyPoints) {
            System.out.println("NIE");
        } else {
            System.out.println("TAK");
        }
    }

    private static void checkEmptyPoints(int tab[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tab[i][j] == 0) {
                    System.out.println("NIE");
                    return;
                }
            }
        }
        System.out.println("TAK");
    }

    private static void fillBlankTab(int tab[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tab[i][j] = 0;
            }
        }
    }
}
