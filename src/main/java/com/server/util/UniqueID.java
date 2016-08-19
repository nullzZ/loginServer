/**
 * UniqueID.java 2012-6-30下午1:41:30
 */
package com.server.util;

/**
 * @author ddoq
 * @version 1.0.0
 *
 */
public class UniqueID {
    private int m_Seed;
    private int m_BitNum;
    private int m_BitOffset;
    private int m_Index = 1;
    private int m_IndexMax;

    public UniqueID(int serverID) {
	m_Seed = serverID;
	m_BitNum = 11; // 默认种子占用11位
	m_BitOffset = 64 - m_BitNum - 2; // 设置种子在ID中的位置偏移量
	m_Seed &= 0x000007FF; // 取种子里的低11位
	m_IndexMax = (int) Math.pow(2, 24) - 1; // 默认自增索引占用24位，支持最大索引数值2^24-1
    }

    // public UniqueID(int seed,int bitnum)
    // {
    // m_Seed = seed;
    // m_BitNum = bitnum;
    // Debug.Assert(bitnum < 32 && bitnum > 0, "");
    // m_IndexMax = (int) Math.pow(2, 35-m_BitNum);
    // }

    /**
     * 获取唯一值
     *
     * <br>
     * 测试代码:{@link TestUniqueID#TestBuildMoment}
     */
    public long Get() {
	long v = 0x4000000000000000L; // ID最高位留0，避免出现负数，次高位置1，兼容老版本ID （64，63）
	v |= _GetTime(); // 低27位是时间 （27～1）
	v |= (long) m_Seed << m_BitOffset; // 种子（服务器ID）占用次高位往下的11位（默认情况下）
					   // （62～52）
	v |= (long) m_Index++ << 27; // 从第28位开始的24位是自增索引（默认情况下） （51～28）
	if (m_Index >= m_IndexMax) {
	    m_Index = 1;
	}
	return v;
    }

    private long _GetTime() {
	long tm = System.currentTimeMillis() / 1000; // 取当前时间，单位秒
	return tm & 0x0000000007ffffffL; // 时间取低27位，支持1553天左右
    }
}
