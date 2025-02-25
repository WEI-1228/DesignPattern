package cn.anlper.iterator;

public class NameContainer implements Container{
    public String[] names = {"小明", "小红", "小王"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return names[index++];
            return null;
        }
    }
}
