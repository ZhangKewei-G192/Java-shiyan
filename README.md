# Java-shiyan
Java实验报告仓库
#计192 张可为
 学号：2019310186


#阅读程序
public class PC {
	CPU cpu;
    HardDisk HD;
    Card GC;
    void setCPU(CPU cpu){
        this.cpu = cpu;
    }
    void setHardDisk(HardDisk HD){
        this.HD = HD;
    }
    void setCard(Card GC){
        this.GC = GC;
    }
    void show(){
        System.out.println("CPU速度："+cpu.getSpeed());
        System.out.println("CPU型号：Intel Core i"+cpu.getNumber());
        System.out.println("硬盘容量："+HD.getAmount());
        System.out.println("显卡型号：GTX "+GC.getXianka());
    }
}

#实验目的
用类描述计算机中CPU速度与型号，硬盘容量，显卡型号。
要求Java应用程序有五个类，名字是CPU,HardDisk，PC,Card和Test(主类)。

#核心方法
1.方法调用

2.参数赋值

3.类的编写

#实验感想
通过本次实验我初步学习了类的编写，方法的调用，属性定义，对构造方法的学习与认识以及使用。
虽然只是初步学习，但仍有很多收获，增加了对Java的学习欲望。
