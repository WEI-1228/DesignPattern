package cn.anlper.respchain;

public class FileLogger extends AbstractLogger{
    public FileLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("文件输出：" + message);
    }
}
