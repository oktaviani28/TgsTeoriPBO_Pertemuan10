package Nestedclass;

import Nestedclass.CPU;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();

        // bikin object harddisk, vga, motherboard, powersupply
        CPU.Harddisk hd = myKomputer.new Harddisk(512, "Seagate");
        CPU.VGACard vga = myKomputer.new VGACard("NVIDIA", "GTX 3080");
        CPU.Motherboard mb = myKomputer.new Motherboard("ASUS", "Prime Z590");
        CPU.PowerSupply ps = myKomputer.new PowerSupply("Corsair", 750);

        hd.getHarddiskInfo();
        vga.getVGACardInfo();
        mb.getMotherboardInfo();
        ps.getPowerSupplyInfo();
    }
}
