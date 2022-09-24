package src.Week_6;

import org.junit.Test;
import org.junit.Assert;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        Assert.assertEquals(0, Week4.max2Int(2, 0));
    }

    @Test
    public void testMax2Int2(){
        Assert.assertEquals(20, Week4.max2Int(20, 100));
    }

    @Test
    public void testMax2Int3(){
        Assert.assertEquals(11, Week4.max2Int(11, -10));
    }

    @Test
    public void testMax2Int4(){
        Assert.assertEquals(-11, Week4.max2Int(-11, -12));
    }

    @Test
    public void testMax2Int5(){
        Assert.assertEquals(0, Week4.max2Int(0, -12));
    }

    @Test
    public void testMinArray1(){
        Assert.assertEquals(-9, Week4.minArray(new int[]{3, 5, 99, 0, 22
                , 56, -9, 33, 0, -7, 32}));
    }

    @Test
    public void testMinArray2(){
        Assert.assertEquals(-248, Week4.minArray(new int[]{-177, 244, 29, 123, 224, -248
                , -94, -102, 186, 156, -160, -238, 0}));
    }

    @Test
    public void testMinArray3(){
        Assert.assertEquals(-188, Week4.minArray(new int[]{85, -188, -23, 148, 111, -57
                , 144, 152, 195, -150, -72, 73, -21, 11}));
    }

    @Test
    public void testMinArray4(){
        Assert.assertEquals(-189, Week4.minArray(new int[]{104, 138, 154, -189, 111, 92
                , -36, -143, -141, -32}));
    }

    @Test
    public void testMinArray5(){
        Assert.assertEquals(-245, Week4.minArray(new int[]{130, 229, -8, 160, 237, 44
                , -134, -79, 16, -224, -220, 19, 133, -231, -7, -100, -53, -126, 160
                , -245, 31, 18}));
    }

    @Test
    public void testCalculateBMI1(){
        Assert.assertEquals("Thiếu cân", Week4.calculateBMI(45.5, 1.8));
    }

    @Test
    public void testCalculateBMI2(){
        Assert.assertEquals("Béo phì", Week4.calculateBMI(84, 1.6));
    }

    @Test
    public void testCalculateBMI3(){
        Assert.assertEquals("Bình thường", Week4.calculateBMI(61, 1.7));
    }

    @Test
    public void testCalculateBMI4(){
        Assert.assertEquals("Béo phì", Week4.calculateBMI(88, 1.6));
    }

    @Test
    public void testCalculateBMI5(){
        Assert.assertEquals("Béo phì", Week4.calculateBMI(93, 1.9));
    }
}