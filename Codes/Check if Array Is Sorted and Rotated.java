class Solution {
    public static void reverse(int arr[], int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    public boolean check(int[] a) {
        int[] temp = a;
        int idx = a.length - 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                idx = i;
                break;
            }
        }

        reverse(a, 0, idx);
        reverse(a, idx + 1, a.length - 1);
        reverse(a, 0, a.length - 1);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                return false;
        }
        return true;

    }
}
