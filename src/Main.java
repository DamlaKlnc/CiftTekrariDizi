public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int sayac = 0;
        int[] arr = {4, 5, 8,11, 9, 11,10,10, 4, 11, 7};
        int[] duplicate = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if ((j != i) && (arr[i] == arr[j])) {
                    if (!isFind(duplicate, arr[i]))
                        duplicate[sayac++] = arr[i];
                    break;
                }

            }
        }
        for (int i : duplicate) {
            if(i!=0){
              if(i%2==0){
                  System.out.println(i);
              }
            }




        }
    }
}