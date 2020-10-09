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

#实验过程

用类描述计算机中CPU的速度和硬盘的容量，要求Java应用程序由4个类，名字分别是PC、CPU、HardDisk、和Test，其中Test是主类。
其中，CPU类要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给speed；HardDisk类要求getAmount()返回amount的值，
要求setAmount（int m）方法将参数m的值赋值给amount；PC类要求setCPU(CPU c)将参数c的值赋值给CPU，要求setHardDisk(HardDisk h)方法将参数h的值赋值给HD，
要求show()方法能显示CPU的速度和硬盘的容量。
主类Test的要求
（1）main方法中创建一个CPU对象cpu，cpu将自己的speed设置为2200.
（2）main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200。
（3）main方法中创建一个PC对象pc。
（4）pc调用setCPU(CPU c)方法，调用时实参是cpu。
（5）pc调用setHardDisk(HardDisk h）方法，调用时实参是disk。
（6）pc调用show方法。
(新增内容同理)


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
