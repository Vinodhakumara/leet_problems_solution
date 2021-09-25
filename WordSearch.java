public class WordSearch {
    public static void main(String[] args) {
        String word="cdba";
        // char[][] arr={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        char[][] arr={{'a','b'},{'c','d'}};
        System.out.println(charSearch(arr,word));
    }

    public static boolean charSearch(char[][] board,String word) {
        int count=0,i;
        boolean flag=false;
        for(i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.println(count);
                if(board[i][j]== word.charAt(count)){
                    System.out.println(word.charAt(count));
                    board[i][j]=0;
                    if(count == word.length()-1){
                        flag=true;
                        break;
                        i=-1;
                    }
                    count++;
                }
            }
        }
        if (!flag) {
            // count=count-1;;
            for(i=0;i<board.length;i++){
                for(int j=0;j<board[i].length;j++){
                    if(board[i][j]== word.charAt(count)){
                        System.out.println(word.charAt(count));
                        board[i][j]=0;
                        if(count == word.length()-1){
                            return true;
                            
                        }
                        count++;
                    }
                }
            }
        }
        return flag;
    }
}
