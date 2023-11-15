public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        CPU.Harddisk AIDE = myKomputer.new Harddisk(1000, "Toshiba", "AIDE");

        CPU.Motherboard PapanInduk = myKomputer.new Motherboard(8, "Samsung");

        CPU.PowerSupply elektronik = myKomputer.new PowerSupply(104000, "2021");

        CPU.VGACard card = myKomputer.new VGACard("S3 ViRGE",153900);

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();
        AIDE.getInfoHarddisk();
        PapanInduk.getMotherboardInfo();
        elektronik.getInfoPowerSupply();
        card.getInfoVGACard();

    }
}