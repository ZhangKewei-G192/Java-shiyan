package bianchenti;

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
