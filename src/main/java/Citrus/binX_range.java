/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citrus;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author an
 */
public class binX_range {
    int block_no;
    int start_idx;
    int stop_idx;
    public binX_range(int block_no, int start_idx, int stop_idx){
        this.block_no = block_no;
        this.start_idx = start_idx;
        this.stop_idx = stop_idx;
//        this.stop_idx = stop_idx;
    }
    public String toString() {
        return block_no + ":" + start_idx + "-" + stop_idx;
    }
}

class cmp_rev_binX_range implements Comparator<binX_range>{

    @Override
    public int compare(binX_range o1, binX_range o2) {
        int ret = o2.block_no - o1.block_no;
        if(ret == 0){
            return o2.start_idx - o1.start_idx;
        }
        return ret;    }
}


class binX_idx {
    int block_no;
    int idx;
    public binX_idx(int block_no, int idx){
        this.block_no = block_no;
        this.idx = idx;
    }
    public String toString() {
        return block_no + ":" + idx;
    }
}
class cmp_rev_binX_idx implements Comparator<binX_idx>{

    @Override
    public int compare(binX_idx o1, binX_idx o2) {
        int ret = o2.block_no - o1.block_no;
        if(ret == 0){
            return o2.idx - o1.idx;
        }
        return ret;
    }
    
}
class cmp_binX_idx_list implements Comparator<List<binX_idx>>{

    @Override
    public int compare(List<binX_idx> o1, List<binX_idx> o2) {
        int ret = o2.get(0).block_no - o1.get(0).block_no;
        if(ret == 0){
            return o2.get(0).idx - o1.get(0).idx;
        }
        return ret;
    }
    
}