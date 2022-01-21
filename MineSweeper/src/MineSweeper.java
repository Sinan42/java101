public class MineSweeper {
    char[][] map;
    char[][] gameMap;
    int col;
    int row;
    int cleanCell;
    int openedCell;

    MineSweeper(int col,int row){
        this.col=col;
        this.row=row;
        map=new char[row][col];
        gameMap=new char[row][col];
        createMap();
        printAllMap();
        calculateMap();
        openedCell = 0;
    }

    public void createMap(){
        for(int i=0;i<gameMap.length;i++){
            for(int j=0;j<gameMap[0].length;j++){
                gameMap[i][j]+='-';

            }
        }
    }
    public void printMap(){
        for(int i=0;i<gameMap.length;i++){
            for(int j=0;j<gameMap[0].length;j++){
                System.out.print(gameMap[i][j]+" ");
            }
            System.out.println();
        }

    }
    private void calculateMap() {
        int bombCount = (map.length * map[0].length) / 4;
        cleanCell = (map.length * map[0].length) - bombCount;

        for (int i = 0; i < bombCount; i++) {
            placeBomb();
        }

        for(int i=0; i<map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == '*')
                    continue;
                calcCell(i, j);
            }
        }
    }
    private void placeBomb() {
        int row = (int) (Math.random() * map.length);
        int column = (int) (Math.random() * map[0].length);
        if(map[row][column] == '*') {
            placeBomb();
            return;
        }

        map[row][column] = '*';
    }
    private void calcCell(int row, int column) {
        int value = 0;
        for(int i=row-1; i<=row+1; i++) {
            if (i < 0 || i >= map.length)
                continue;

            for(int j=column-1; j<=column+1; j++) {
                if(j < 0 || j >= map[0].length)
                    continue;

                if(map[i][j] == '*')
                    value++;
            }
        }
        map[row][column] = Character.forDigit(value, 10);
    }
    public boolean openCell(int row, int column) {
        try {
            gameMap[row][column] = map[row][column];
            printMap();
            System.out.println("************************************");

            if(map[row][column] == '*') {
                System.out.println("Game Over");
                return false;
            }

            openedCell++;
            if (openedCell == cleanCell) {
                System.out.println("Win");
                return false;
            }
            return true;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter in the borders");
            return true;
        }
    }

    public void printAllMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("****************************************");
    }


}
