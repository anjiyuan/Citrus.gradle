/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citrus;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author an
 */
public class numContact_X_Y_per_resolution_str {
    Map<Integer, List<ContactRecord>> contactRec_per_block;
//    Map<Integer, float[][]> contactRec_per_block;
    float maxCount_contact_X_Y, minCount_contact_X_Y;
    String hicUnitStr;
    int blockBinCount, blockColumnCount;
    int resIdx;
    float sumCounts;
    float occupiedCellCount;
    float stdDev, percent95;
    int binSize;
    int nBlocks;
    long blockIndexPosition;
    public numContact_X_Y_per_resolution_str(){
        this.maxCount_contact_X_Y = 0;
        this.minCount_contact_X_Y = 0;
        this.blockBinCount = 0;
        this.blockColumnCount = 0;
        this.contactRec_per_block = new TreeMap();
    }
    
}
