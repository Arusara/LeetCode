class OrderedStream {
  
    int num;
    List<String> list= new ArrayList<>();

    int pointer = 0;


    public OrderedStream(int n) {
        num = n;
        for (int i=0;i<n;i++) {
           list.add("e");
        }
    }

    public List<String> insert(int idKey, String value) {

        list.set(idKey-1, value);
        List<String> result = new ArrayList<>();

        if (idKey-1==pointer) {
            for (int i=pointer;i<list.size();i++) {
                String str = list.get(i);
                if (str.equals("e")) {
                    break;
                }
                result.add(str);
                pointer++;
            }
            return result;
        } else {
            return new ArrayList<>();
        }
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
