public class QuickSelect {
    public int quickSelect(int[] a, int k, int low, int high) {
        if (low >= high) {
            return a[k];
        }
        int[] newArr = new int[a.length];
        int pivotIndex = (int) ((high - low) * Math.random() + low);
        System.out.println("Random pivotIndex: " + pivotIndex);
        int pivot = a[pivotIndex];
        int lowIndex = low, highIndex = high;
        for (int i = low;i <= high;i++) {
            if (i == pivotIndex)
                continue;
            if (a[i] > pivot) {
                newArr[highIndex--] = a[i];
            }
            else {
                newArr[lowIndex++] = a[i];
            }
        }
        newArr[lowIndex] = pivot;
        if (newArr[k] == pivot)
            return newArr[k];
        else {
            if (newArr[k] > pivot)
                return quickSelect(newArr, k, pivotIndex, high);
            else
                return quickSelect(newArr, k, low, pivotIndex);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 5, 3, 2};
        QuickSelect qs = new QuickSelect();
        int result = qs.quickSelect(a, 1, 0, a.length - 1);
        System.out.println("QuickSelect on a: " + result);
        if (result != 2) {
            System.out.println("FAILED!");
        }
        else {
            System.out.println("SUCCESS!");
        }
        
    }
}
