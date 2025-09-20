package doublylinktest;

public class Execute {

    void showNode( nodeLine dts ){
        Node walk = dts.head ;
        if( dts.head != null ){
            while( (walk != null) && (walk != dts.tail.Flink) ){
                System.out.println( "Data: " + walk.data ) ;
                walk = walk.Flink ;
            }//while:
        } else System.out.println("Empty Node.");
    }//showNode:
    
    void append( nodeLine dts, String data ){
        Node newNode = new Node() ;
        newNode.data = data ;
        if( dts.head == null ){
            dts.head = newNode ;
            dts.tail = newNode ;
        } else {
            dts.tail.Flink = newNode ;
            newNode.Blink = dts.tail ;
            dts.tail = newNode ;
        }//ifelse:
    }//append:
    
    void prepend( nodeLine dts, String data ){
        Node newNode = new Node() ;
        newNode.data = data ;
        if( dts.head != null ) {
            dts.head.Blink = newNode ;
            newNode.Flink = dts.head ;
            dts.head = newNode ;
        } else append( dts, data ) ;
    }
    
    void insert( nodeLine dts, String pos, String data ){
        Node newNode = new Node() ;
        newNode.data = data ;
        Node walk = dts.head ;
        while( (walk != null) && (walk.data != pos) ) {
            walk = walk.Flink ;
        }//while:
        if( walk == null ) {
            System.out.println( "Node not found." ) ;
        } else {
            newNode.Blink = walk.Blink ;
            newNode.Flink = walk ;
            walk.Blink.Flink = newNode ;
            walk.Blink = newNode ;
        }//ifelse:
    }//insertNode:
    
    void delNode( nodeLine dts, String pos ){
        Node walk = dts.head ;
        while( (walk != null) && (walk.data != pos) ){
            walk = walk.Flink ;
        }//while:
        if( walk == null ) {
            System.out.println( "Node not found." ) ;
            return ;
        } else {
            if( walk == dts.tail ) {
                dts.tail = walk.Blink ;
                dts.tail.Flink.Blink = null ;
                dts.tail.Flink = null ;
            } else {
                walk.Flink.Blink = walk.Blink ;
                walk.Blink.Flink = walk.Flink ;
                walk.Flink = null ;
                walk.Blink = null ;
            }
        }
    }//delNode:
}
