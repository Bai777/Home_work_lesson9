
public class Home_work_lesson9 {

    public static String[][] array = {
        //{"5", "7", "9", "8", "11"},
        {"5", "7", "9", "8"},
        {"5", "7", "9", "8"},
       // {"ffk", "7", "9", "8"},
        {"5", "7", "9", "8"},
        {"5", "7", "9", "8"}
       // {"5", "7", "9", "8"}
    };

    public static void main(String[] args) {

        try {
            int customize = sumArray(array);
            System.out.println("Сумма массива = " + customize);
        } catch (MyArraySizeException e) {
            System.out.println("Вы передали неверный размер массива");;
        }catch (MyArrayDataException e){
            System.out.println("В массиве не должна содержаться строка или символ");
            System.out.println("Ошибка в ячейке " + (e.i + 1) + " x " + (e.j + 1));
        }

    }

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException{
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != 4)
                throw new MyArraySizeException();
            for (int j = 0; j < array.length; j++) {
                if (array[i].length != 4)
                    throw new MyArraySizeException();
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return result;
    }

}
