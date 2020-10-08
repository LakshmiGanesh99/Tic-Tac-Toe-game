package com.capg.game;

import java.util.Scanner;

public class TicTacToeGame {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		createBoard();
		System.out.println("Enter your choice 'X' or 'O'");
		playerChoice(sc.next().charAt(0));
	}

	public static char[] createBoard() {
		char[] ticTacBoard = new char[10];
		for (int i = 0; i < 10; i++) {
			ticTacBoard[i] = ' ';
		}
		return ticTacBoard;
	}

	public static void playerChoice(char choice) {
		if(choice == 'X') {
			System.out.println("Computer choice is 'O'");
		}else {
			System.out.println("Computer choice is 'X'");
		}
	}
}
