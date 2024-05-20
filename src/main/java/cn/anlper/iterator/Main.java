package cn.anlper.iterator;

public class Main {
    public static void main(String[] args) {
        NameContainer nameContainer = new NameContainer();
        for (Iterator iter = nameContainer.getIterator(); iter.hasNext();) {
            String next = (String)iter.next();
            System.out.println("Name:" + next);
        }
    }
}
