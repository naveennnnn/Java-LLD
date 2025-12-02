package Machine_Coding.Tic_Tac_Toe.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Machine_Coding.Tic_Tac_Toe.Strategy.WinningStrategy;

public class Game {
    // To start the Game what are all required
    private Board board; // The dimensions are required
    private List<Player> players; // Players are required
    private GameState gameState;    // NOT ReQUIRED, INITIALLLY IT WILL BE START
    private List<Move> moves;       // NOT REQUIRED
    private int nextPlayerIndex;    // 0 INITIALLY
    private List<WinningStrategy> winningStrategies;
    private Player winner;
    
    public Game(int dimension,List<Player> player,List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = player;
        this.gameState = GameState.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.nextPlayerIndex = 0;
        this.winningStrategies = winningStrategies;
    }
    public Board getBoard() {
        return board;
    }
    public void setBoard(Board board) {
        this.board = board;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public GameState getGameState() {
        return gameState;
    }
    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
    public List<Move> getMoves() {
        return moves;
    }
    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }
    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }
    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }
    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }
    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
    public void makeMove(){
        Player currPlayer = players.get(nextPlayerIndex);
        Move newMove = currPlayer.makeMove(this.board);
        moves.add(newMove);
        for(WinningStrategy winningStrategy:winningStrategies){
            if(winningStrategy.checkWinner(board,newMove)){
                this.winner = currPlayer;
                this.gameState = GameState.WON;
            }
        }
        nextPlayerIndex += 1;
        nextPlayerIndex = nextPlayerIndex % players.size();
    }
    public void undo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'undo'");
    }
    public void printBoard() {
        this.board.display();
    }
    public Player getWinner() {
        return winner;
    }
}
