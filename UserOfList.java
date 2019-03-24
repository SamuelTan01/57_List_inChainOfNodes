public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );


        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        String[] elements = new String[]{"y","u","t","S",};
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() + " list: " + list);
        }

        System.out.println( "populated list: " + list
                          + System.lineSeparator());
    }
}
