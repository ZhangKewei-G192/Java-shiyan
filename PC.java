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
        System.out.println("CPU�ٶȣ�"+cpu.getSpeed());
        System.out.println("CPU�ͺţ�Intel Core i"+cpu.getNumber());
        System.out.println("Ӳ��������"+HD.getAmount());
        System.out.println("�Կ��ͺţ�GTX "+GC.getXianka());
    }
}
