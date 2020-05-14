package com.liu.utils;

public class IncrementUtil {
    public static String newEquipmentNo = "00000";
    public static String newPoPosalNo = "000000";

    public static String getNewEquipmentNo(String equipmentType, String equipmentNo){


        if(equipmentNo != null && !equipmentNo.isEmpty()){
            int newEquipment = Integer.parseInt(equipmentNo) + 1;
            newEquipmentNo = String.format(equipmentType + "%06d", newEquipment);
        }
        return newEquipmentNo;
    }

    public static String getPoPosalNo(String qianzui, String increment){


        if(increment != null && !increment.isEmpty()){
            int newEquipment = Integer.parseInt(increment) + 1;
            newPoPosalNo = String.format(qianzui + "%06d", newEquipment);
        }
        return newPoPosalNo;
    }


}
