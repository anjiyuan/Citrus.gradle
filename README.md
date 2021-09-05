# Citrus: Editing HiC data for de novo genome assembly
using Hic sequencing data and scaffolds, [juicer](https://github.com/aidenlab/juicer) and [3D-DNA](https://github.com/aidenlab/3d-dna) 
are used to re-arrange HiC data (xxx.hic format) and 
split/re-ordered super-scaffold (xxx.assembly). The output usually need to be tuned
or adjust base on the HiC data. [juicebox](https://github.com/aidenlab/Juicebox) was developed
for this purpose. however, Current Juicebox does not have function to save updated Hic data and 
summrize chromosome sequence. 
Citrus edits super-scaffolds according to chromatin conformation 
in represented in xxx.hic. updated hic, assembly and chromosome level sequence will be 
saved.
## quick start
1. run Citrus
    1. **Linux or MacOs:**  > bash Citrus.sh
    2. **windows:** double click Citrus.bat
2. outlook of Citrus
    ![image](image/citrus.png)
    after starting Citrus, the figure above is generated, "**Resolution(BP)**" dropdown menu 
Zooms in/out Hic data. "**refresh**" button is clicked to make the changes. 
The slider bar of "**color range**" changes the depth of color.
3. how to select block/blocks of interest?
    1. shift + mouse-left-click: select one block (green block)
       ![image](image/block_select.png)
    2. control + mouse-left-click: select one chromosome block (blue block)
       ![image](image/ctrl_select.png)
4. how to move block?
    1. locate cursor to insert. if cursor cover more than one edge of blocks, popup 
   window "multi blocks in the area" appears. higher resolution is needed. when 
   two ends of arrow appears, left click to make the selected block to insert.
       ![image](image/insert_superscaffold.png)
5. how to transpose block, get sequence of selected block?
    1. after selecting blocks, right-clicking mouse shows menu to have various functions for
the selected block.
       ![image](image/menu.png)