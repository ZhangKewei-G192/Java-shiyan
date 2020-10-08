package bianchenti;

public class Test {
	public static void main(String args[]){
        CPU cpu = new CPU();
        HardDisk HD = new HardDisk();
        Card GC =new Card();
        cpu.setSpeed(2200);
        cpu.setNumber(7);
        HD.setAmount(200);
        GC.setXianka(1650);
        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(HD);
        pc.setCard(GC);
        pc.show();
    }
}
