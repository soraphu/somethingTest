package doublylinktest;

public class DoublyLinkTest {

    public static void main(String[] args) {
        Execute ls = new Execute() ;
        nodeLine dataSet1 = new nodeLine() ;
        ls.append(dataSet1, "1");
        ls.append(dataSet1, "2");
        ls.append(dataSet1, "3");
        ls.append(dataSet1, "4");
        ls.append(dataSet1, "5");
        ls.append(dataSet1, "5");
        ls.showNode( dataSet1 ) ;
    }
}
