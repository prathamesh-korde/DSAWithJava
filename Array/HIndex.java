public class HIndex {
 
    // static int hIndex(int[] citations) {
        
    //  
    //O(n × logn) Time and O(1) Space

    //     Arrays.sort(citations);
    //     int n = citations.length;
    //     int idx = 0;

    //     // keep incrementing idx till citations[n - 1 - idx] > idx
    //     while (idx < n && citations[n - 1 - idx] > idx) {
    //         idx++;
    //     }
    //     return idx;
    // }


    //   O(n)
    static int hIndex(int[] citations) {
        int n = citations.length;
        int[] freq = new int[n + 1];

        // Count the frequency of citations
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n)
                freq[n] += 1;
            else
                freq[citations[i]] += 1;
        }

        int idx = n;
        
        // variable to keep track of the count of papers
        // having at least idx citations
        int s = freq[n]; 
        while (s < idx) {
            idx--;
            s += freq[idx];
        }
        
        // return the largest index for which the count of 
        // papers with at least idx citations becomes >= idx
        return idx;
    }


    public static void main(String[] args) {
        int[] citations = {6, 0, 3, 5, 3};
        System.out.println(hIndex(citations));
    }
}

