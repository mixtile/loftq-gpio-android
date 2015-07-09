package com.mixtile.loftqgpio;

/**
 * Created by kurain on 7/9/15.
 */
public class GPIOLoftq extends GPIOCommon {
    static String[] gpios_j4 = {
            "PE04", //CSI-D0
            "PE05", //CSI-D1
            "PE06", //CSI-D2
            "PE07", //CSI-D3
            "PE08", //CSI-D4
            "PE09", //CSI-D5
            "PE10", //CSI-D6
            "PE11", //CSI-D7
            "PE12", //CSI-D8
            "PE13", //CSI-D9

            "PE14", //CSI-D10
            "PE15", //CSI-D11
            "GND",  //GND
            "PE02", //CSI_HSYNC
            "PE03", //CSI_VSYNC
            "PH14", //TWI0-SCK
            "PH15", //TWI0-SDA"
            "GND",  //GND
            "PE01", //CSI-MCLK
            "PE00", //CSI-PCLK

            "GND",  //GND
            "VDD1V8", //VDD1V8-CSI
            "VDD1V8", //VDD1V8-CSI
            "GND", //GND
            "VCC5V",
            "VCC5V",
            "GND",
            "VCC3V3",
            "VCC3V3",
            "GND",

            "PE16", //MCSI-MCLK
            "NC", //NC
            "NC", //NC
            "GND", //GND
            "DSI-D0N", //DSI-D0N
            "DSI-D0P", //DSI-D0P
            "GND", //GND
            "DSI-D1N", //DSI-D1N
            "DSI-D1P", //DSI-D1P
            "GND", //GND

            "DSI-D2N", //DSI-D2N
            "DSI-D2P", //DSI-D2P
            "GND", //GND
            "DSI-D3N", //DSI-D3N
            "DSI-D3P", //DSI-D3P
            "GND", //GND
            "DSI-CKN", //
            "DSI-CKP", //
            "GND", //
            "PH27", //SPDIF-IN

            "PH28", //SPDIF-OUT
            "GND", //GND
            "PG15", //I2S1-DIN
            "PG13", //I2S1-BCLK
            "PG14", //I2S1-LRCK
            "PG12", //I2S1-MCLK
            "GND", //EARGND2
            "LRADC0", //LRADC0
            "GND", //EARGND2
            "LRADC1", //LRADC1
    };

    static String[] gpios_j5 = {
            "VCC5V", //VCC-5V
            "VCC5V", //VCC-5V
            "GND", //GND
            "VCC", //VCC-LCD
            "GND", //GND
            "PG17", //UART4-TX
            "PG18", //UART4-RX
            "GND", //GND
            "VCC", //VCC-JTAG

            "VCC", //VCC-JTAG
            "RESET", //AP-RESET#
            "PL05", //TMS0
            "PL06", //TCK0
            "PL07", //TDO0
            "PL08", //TDI0
            "JTAG-SEL0", //JTAG-SEL0
            "GND", //GND
            "PC00", //SPI0-MOSI
            "PC01", //SPI0-MISO

            "PC02", //SPI0-CLK
            "PC27", //SPI0-CS0
            "GND", //GND
            "CSI2-D0N", //CSI2-D0N
            "CSI2-D0P", //CSI2-D0P
            "GND", //GND
            "CSI2-D1N", //CSI2-D1N
            "CSI2-D1P", //CSI2-D1P
            "GND", //GND
            "CSI2-D2N", //CSI2-D2N

            "CSI2-D2P", //CSI2-D2P
            "GND", //GND
            "CSI2-D3N", //CSI2-D3N
            "CSI2-D3P", //CSI2-D3P
            "GND", //GND
            "DSI-D0P", //DSI-D0P
            "CSI2-CKP", //CSI2-CKP
            "GND", //GND
            "PB05", //TWI3-SCK/UART3-TX
            "PB06", //TWI3-SDA/UART3-RX

            "GND", //GND
            "MCS-MCLK1", //MCS-MCLK1
            "GND", //GND
            "CAMSTB", //CAM-R-STBY-EN
            "CAMRST", //CAM-R-RESET#
            "GND", //GND
            "PH00",
            "PH01",
            "PH02",
            "PH03",

            "PH04",
            "PH05",
            "PH06",
            "PH07",
            "PH08",
            "PH29",
            "PH30",
            "GND",
            "UDP0", //USB-DP0
            "UDM0", //USB-DM0
    };
    static String[] gpios_j6 = {
            "PD00", //LCD0-D0
            "PD01", //LCD0-D1
            "GND", //GND
            "PD02", //LCD0-D2
            "PD03", //LCD0-D3
            "GND",
            "PD04", //LCD0-D4
            "PD05", //LCD0-D5
            "GND",
            "PD06", //LCD0-D6

            "PD07", //LCD0-D7
            "GND",
            "PD08", //LCD0-D8
            "PD09", //LCD0-D9
            "GND",
            "PD10", //LCD0-D10
            "PD11", //LCD0-D11
            "GND",
            "PD12", //LCD0-D12
            "PD13", //LCD0-D13

            "GND",
            "PD14", //LCD0-D14
            "PD15", //LCD0-D15
            "GND",
            "PD16", //LCD0-D16
            "PD17", //LCD0-D17
            "GND",
            "PD18", //LCD0-D18
            "PD19", //LCD0-D19
            "GND",

            "PD20", //LCD0-D20
            "PD21", //LCD0-D21
            "PD22", //LCD0-D22
            "PD23", //LCD0-D23
            "PD24", //LCD0-CLK
            "PD26", //LCD0-HSYNC
            "PD25", //LCD0-DE
            "PD27", //lCD0-VSYNC
            "PH13", //LCD-PWM
            "PC22", //LCD-BL-EN

            "GND", //GND
            "PL06", //CTP-WAKE
            "PL05", //CTP-INT
            "PH16", //TWI1-SCK
            "PH17", //TWI1-SDA
            "GND", //GND
            "RTPX1", //RTP-X1
            "RTPX2", //RTP-X2
            "RTPY1", //RTP-Y1
            "RTPY2", //RTP-Y2

            "GND", //GND
            "VCC2V8", //VCC2V8-LCD
            "VCC2V8", //VCC2V8-LCD
            "VCC2V8", //VCC2V8-LCD
            "GND", //GND
            "VCC1V8", //VCC1V8-LCD
            "VCC1V8", //VCC1V8-LCD
            "GND", //GND
            "VCC5V", //VCC-5V
            "vCC5V", //VCC-5V
    };

        public void GPIOCommom(){
        }

        private String get_name(String zone, int idx){
                if(idx < 0 || idx >= 60){
                        return "Unknown";
                }

                String lowstr = zone.toLowerCase();
                if(lowstr == "j4"){
                        return gpios_j4[idx];
                }else if(lowstr == "j5"){
                        return gpios_j5[idx];
                }else if(lowstr == "j6"){
                        return gpios_j6[idx];
                }else{
                        return "Unknown";
                }
        }

        private int get_gpio_id(String zone, int idx){
                String gpio_name = get_name(zone, idx).toLowerCase();
                if('p' == gpio_name.charAt(0)) {
                        return gpio_map(gpio_name);
                }else{
                        return -1;
                }
        }

        public int gpio_map(String gpio){
                gpio = gpio.toLowerCase();
                int io_num = Integer.parseInt(gpio.substring(2));
                int io_zone = gpio.charAt(1) - 'a';
                return io_zone*32 + io_num;
        }

        public String getDesc(String zone, int idx){
                return get_name(zone, idx);
        }

        public int export(String zone, int idx){
                int gpio_id = get_gpio_id(zone, idx);
                if(gpio_id < 0) {
                        return -1;
                }
                return export(gpio_id);
        }

        public int unexport(String zone, int idx){
                int gpio_id = get_gpio_id(zone, idx);
                if(gpio_id < 0) {
                        return -1;
                }
                return unexport(gpio_id);
        }

        public int enable_out(String zone, int idx){
                int gpio_id = get_gpio_id(zone, idx);
                if(gpio_id < 0) {
                        return -1;
                }
                return enable_out(gpio_id);
        }

        public int enable_in(String zone, int idx){
                int gpio_id = get_gpio_id(zone, idx);
                if(gpio_id < 0) {
                        return -1;
                }
                return enable_in(gpio_id);
        }

        public int read(String zone, int idx){
                int gpio_id = get_gpio_id(zone, idx);
                if(gpio_id < 0)
                {
                        return -1;
                }
                return read(gpio_id);
        }

        public int write(String zone, int idx, int value){
                int gpio_id = get_gpio_id(zone, idx);
                if(gpio_id < 0)
                {
                        return -1;
                }
                return write(gpio_id, value);
        }

}
