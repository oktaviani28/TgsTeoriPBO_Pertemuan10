package Nestedclass;

import java.text.NumberFormat;
import java.util.Locale;
public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }

    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }

    // inner class Harddisk
    public class Harddisk {
        int capacity;
        String manufacturer;

        Harddisk(int capacity, String manufacturer) {
            this.capacity = capacity;
            this.manufacturer = manufacturer;
        }

        public void getHarddiskInfo() {
            System.out.println("Kapasitas Harddisk:" + this.capacity + "GB");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // inner class Motherboard
    public class Motherboard {
        String manufacturer;
        String model;

        Motherboard(String manufacturer, String model) {
            this.manufacturer = manufacturer;
            this.model = model;
        }

        public void getMotherboardInfo() {
            System.out.println("Pabrik Motherboard: " + this.manufacturer);
            System.out.println("Model: " + this.model);
        }
    }


    // inner class PowerSuply
    public class PowerSupply {
        String manufacturer;
        int wattage;

        PowerSupply(String manufacturer, int wattage) {
            this.manufacturer = manufacturer;
            this.wattage = wattage;
        }

        public void getPowerSupplyInfo() {
            System.out.println("Pabrik Power Supply: " + this.manufacturer);
            System.out.println("Daya: " + this.wattage + "W");
        }
    }

    // inner class VGACard
    public class VGACard {
        String manufacturer;
        String model;

        VGACard(String manufacturer, String model) {
            this.manufacturer = manufacturer;
            this.model = model;
        }

        public void getVGACardInfo() {
            System.out.println("Pabrik VGA Card: " + this.manufacturer);
            System.out.println("Model: " + this.model);
        }
    }
}