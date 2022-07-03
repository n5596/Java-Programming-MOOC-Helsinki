/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

/**
 *
 * @author naila
 */
public class TicTacToe {
    private String player;
    private String status;
    private String[][] board;
    private int moves_left;
    
    public TicTacToe(){
        this.player = "X";
        this.status = "unfinished";
        this.board = new String[3][3];
        this.moves_left = 9;
    }
    
    public void updatePlayer(){
        if (this.player.equals("X")){
            this.player = "O";
        } else {
            this.player = "X";
        }
    }
    
    public boolean checkHorizontal(int x){
        if (this.board[x][0] == null || this.board[x][1] == null || this.board[x][2] == null){
            return false;
        }
        if (this.board[x][0].equals(this.player) && this.board[x][1].equals(this.player) && this.board[x][2].equals(this.player)){
            return true;
        }
        return false;
    }
    
    public boolean checkVertical(int y){
        if (this.board[0][y] == null || this.board[1][y] == null || this.board[2][y] == null){
            return false;
        }
        if (this.board[0][y].equals(this.player) && this.board[1][y].equals(this.player) && this.board[2][y].equals(this.player)){
            return true;
        }
        return false;
    }
    
    public boolean checkDiagonal1(){
        if (this.board[0][0] == null || this.board[1][1] == null || this.board[2][2] == null){
            return false;
        }
        if (this.board[0][0].equals(this.player) && this.board[1][1].equals(this.player) && this.board[2][2].equals(this.player)){
            return true;
        }        
        return false;
    }
    
    public boolean checkDiagonal2(){
        if (this.board[2][0] == null || this.board[1][1] == null || this.board[0][2] == null){
            return false;
        }
        if (this.board[2][0].equals(this.player) && this.board[1][1].equals(this.player) && this.board[0][2].equals(this.player)){
            return true;
        }        
        return true;
    }
    
    public boolean checkDiagonals(){
        boolean b1 = this.checkDiagonal1();
        boolean b2 = this.checkDiagonal2();
        
        if (b1 == true || b2 == true){
            return true;
        }
        return false;
    }
    
    public void checkForVictory(int x, int y){
        if (this.checkHorizontal(x) || this.checkVertical(y) || this.checkDiagonals()){
            this.status = "finished";
        }
        if (this.moves_left == 0){
            this.status = "finished";
        }
    }
    
    public void move(int x, int y){
        if (this.board[x][y] != null){
            System.out.println("Invalid move");
            return;
        }
        this.board[x][y] = this.player;
        this.moves_left -= 1;
        
        this.checkForVictory(x, y);
        
        if (this.status.equals("unfinished")){
            this.updatePlayer();
        }
    }
    
    public String getPlayer(){
        return this.player;
    }
    
    public String getStatus(){
        return this.status;
    }
}
