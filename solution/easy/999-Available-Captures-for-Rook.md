# 999. Available Captures for Rook

On an 8 x 8 chessboard, there is one white rook.  There also may be empty squares, white bishops, and black pawns.  These are given as characters 'R', '.', 'B', and 'p' respectively. Uppercase characters represent white pieces, and lowercase characters represent black pieces.

The rook moves as in the rules of Chess: it chooses one of four cardinal directions (north, east, west, and south), then moves in that direction until it chooses to stop, reaches the edge of the board, or captures an opposite colored pawn by moving to the same square it occupies.  Also, rooks cannot move into the same square as other friendly bishops.

Return the number of pawns the rook can capture in one move.

**Example 1:**
Input: 
[[".",".",".",".",".",".",".","."],
[".",".",".","p",".",".",".","."],
[".",".",".","R",".",".",".","p"],
[".",".",".",".",".",".",".","."],
[".",".",".",".",".",".",".","."],
[".",".",".","p",".",".",".","."],
[".",".",".",".",".",".",".","."],
[".",".",".",".",".",".",".","."]]
Output: 3
Explanation: 
In this example the rook is able to capture all the pawns.
Example 2:


**Example 2:**
Input: 
[[".",".",".",".",".",".",".","."],
[".","p","p","p","p","p",".","."],
[".","p","p","B","p","p",".","."],
[".","p","B","R","B","p",".","."],
[".","p","p","B","p","p",".","."],
[".","p","p","p","p","p",".","."],
[".",".",".",".",".",".",".","."],
[".",".",".",".",".",".",".","."]]
Output: 0
Explanation: 
Bishops are blocking the rook to capture any pawn.
Example 3:

**Example 3:**
Input: 
[[".",".",".",".",".",".",".","."],
[".",".",".","p",".",".",".","."],
[".",".",".","p",".",".",".","."],
["p","p",".","R",".","p","B","."],
[".",".",".",".",".",".",".","."],
[".",".",".","B",".",".",".","."],
[".",".",".","p",".",".",".","."],
[".",".",".",".",".",".",".","."]]
Output: 3
Explanation: 
The rook can capture the pawns at positions b5, d6 and f5.
 

**Note:**
board.length == board[i].length == 8
board[i][j] is either 'R', '.', 'B', or 'p'
There is exactly one cell with board[i][j] == 'R'


## Solution:

首先先用for loop 找到 Ｒ的位置，接者再透過Ｒ的座標上下左右延伸去尋找是否碰到p，落碰到則往另一邊走，直到四個方向都走完為止，即為答案．


## Code:


```js
/**
 * @param {character[][]} board
 * @return {number}
 */
var numRookCaptures = function(board) {
    var sum = 0;
    var row;
    var col;
    for (var x= 0 ; x<board.length;x++){
        for (var y= 0 ; y < board[x].length ; y++){
            var rIndex = board[x][y].indexOf('R');
            if(rIndex != -1){
                row = x;
                col = y;
                break;
            }
        }
    }
    console.log(row + ',' + col)
    
    //延伸
    for (var i = row+1 ; i< board.length ; i++){
        if(board[i][col]=="B"){
            break;
        }
        if(board[i][col]=="p"){
            console.log(i + ',' + col + ':' + board[i][col]);
            sum+=1;
            break;
        }
    }
    for (var i = row-1 ; i >= 0 ; i--){
        if(board[i][col]=="B"){
            break;
        }
        if(board[i][col]=="p"){
            console.log(i + ',' + col + ':' + board[i][col]);
            sum+=1;
            break;
        }
    }
    
    for (var i = col+1 ; i< board[row].length ; i++){
        if(board[row][i]=="B"){
            break;
        }
        if(board[row][i]=="p"){
            console.log(row + ',' + i + ':' + board[row][i]);
            sum+=1;
            break;
        }
    }
    
    for (var i = col-1 ; i>=0 ; i--){
        if(board[row][i]=="B"){
            break;
        }
        if(board[row][i]=="p"){
            console.log(row + ',' + i + ':' + board[row][i]);
            sum+=1;
            break;
        }
    }
    return sum;
};
```
