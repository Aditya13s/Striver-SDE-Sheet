class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if(i==0) {
                
                list.add(1);
                res.add(list);
                System.out.println(list.size());
            } else if(i==1) {
                list.add(1);
                list.add(1);
                res.add(list);
                
                System.out.println(list.size());
            } else {
                List<Integer> s = res.get(i-1);
                for(int j=0; j<=i; j++) {
                    if(j==0 || j==i) {
                        list.add(1);
                    }else {
                        int sum = s.get(j-1) + s.get(j);
                        list.add(sum);
                    }

                }
                res.add(list);
            }
        }
        return res;
    }
}
