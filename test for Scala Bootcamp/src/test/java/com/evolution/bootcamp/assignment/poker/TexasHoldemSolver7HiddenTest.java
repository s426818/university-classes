
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver7HiddenTest {


  @Test
  public void test_texas_holdem_1750_5c5s6s7dAc_Kd8c_7c7h_2dJd_3dAh_Th2c_JcAs_6hTc() {
    assertEquals(
      "Th2c 2dJd Kd8c 6hTc 3dAh JcAs 7c7h",
      Solver.process("texas-holdem 5c5s6s7dAc Kd8c 7c7h 2dJd 3dAh Th2c JcAs 6hTc"));
  }

  @Test
  public void test_texas_holdem_1751_6h7dAhQsTs_Tc8s_6d2h_JsAs_2dTh_5cJc_5d4s_2c4c_7c9c() {
    assertEquals(
      "2c4c=5d4s 5cJc 6d2h 7c9c 2dTh Tc8s JsAs",
      Solver.process("texas-holdem 6h7dAhQsTs Tc8s 6d2h JsAs 2dTh 5cJc 5d4s 2c4c 7c9c"));
  }

  @Test
  public void test_texas_holdem_1752_3h6d7c7hKd_TsJs_5dKc_JhTc_Qs5s_6c4h() {
    assertEquals(
      "JhTc=TsJs Qs5s 6c4h 5dKc",
      Solver.process("texas-holdem 3h6d7c7hKd TsJs 5dKc JhTc Qs5s 6c4h"));
  }

  @Test
  public void test_texas_holdem_1753_3h5d5hKsTh_Jh6d_5s2h_Jd4d() {
    assertEquals(
      "Jd4d=Jh6d 5s2h",
      Solver.process("texas-holdem 3h5d5hKsTh Jh6d 5s2h Jd4d"));
  }

  @Test
  public void test_texas_holdem_1754_6d7cAcQsTs_7h8c_KhJc_Js8d_As3s() {
    assertEquals(
      "Js8d 7h8c As3s KhJc",
      Solver.process("texas-holdem 6d7cAcQsTs 7h8c KhJc Js8d As3s"));
  }

  @Test
  public void test_texas_holdem_1755_2d4d6cAsTc_AhQd_3c5h_5s7d_Qh8h() {
    assertEquals(
      "5s7d Qh8h AhQd 3c5h",
      Solver.process("texas-holdem 2d4d6cAsTc AhQd 3c5h 5s7d Qh8h"));
  }

  @Test
  public void test_texas_holdem_1756_4c5s6s8cTh_8dTc_KhJd_3hAs_5d6d_3c9c_9d7c_Ts8h_4h7h_5h2h() {
    assertEquals(
      "3c9c KhJd 3hAs 5h2h 5d6d 8dTc=Ts8h 4h7h 9d7c",
      Solver.process("texas-holdem 4c5s6s8cTh 8dTc KhJd 3hAs 5d6d 3c9c 9d7c Ts8h 4h7h 5h2h"));
  }

  @Test
  public void test_texas_holdem_1757_6cJhJsQdTs_9sKs_2s4h_Kh4d_Qh2d_Ac8d_Kd3h_3c8s_QsAd() {
    assertEquals(
      "2s4h 3c8s Kd3h=Kh4d Ac8d Qh2d QsAd 9sKs",
      Solver.process("texas-holdem 6cJhJsQdTs 9sKs 2s4h Kh4d Qh2d Ac8d Kd3h 3c8s QsAd"));
  }

  @Test
  public void test_texas_holdem_1758_2h4c4d4h7c_TcAh_2d8c_Jh9s_3s3d_AsQh() {
    assertEquals(
      "Jh9s TcAh AsQh 2d8c 3s3d",
      Solver.process("texas-holdem 2h4c4d4h7c TcAh 2d8c Jh9s 3s3d AsQh"));
  }

  @Test
  public void test_texas_holdem_1759_2c2d3h4c5d_3dKs_QhQs() {
    assertEquals(
      "3dKs QhQs",
      Solver.process("texas-holdem 2c2d3h4c5d 3dKs QhQs"));
  }

  @Test
  public void test_texas_holdem_1760_7s8c9sQhTc_6s9d_QdAh_3sAc_6dAd() {
    assertEquals(
      "3sAc QdAh 6dAd=6s9d",
      Solver.process("texas-holdem 7s8c9sQhTc 6s9d QdAh 3sAc 6dAd"));
  }

  @Test
  public void test_texas_holdem_1761_6d9sQdQhTd_Js7s_9h8s_2dTc_2c7h_Ad8d_5cKh_8h5s_As4h() {
    assertEquals(
      "2c7h 8h5s Js7s 5cKh As4h 9h8s 2dTc Ad8d",
      Solver.process("texas-holdem 6d9sQdQhTd Js7s 9h8s 2dTc 2c7h Ad8d 5cKh 8h5s As4h"));
  }

  @Test
  public void test_texas_holdem_1762_2s3h5s6s7c_6h4d_6c8s_9dQs_2cTc_Kc5d_Jh8d_JdAd() {
    assertEquals(
      "Jh8d 9dQs JdAd 2cTc Kc5d 6c8s 6h4d",
      Solver.process("texas-holdem 2s3h5s6s7c 6h4d 6c8s 9dQs 2cTc Kc5d Jh8d JdAd"));
  }

  @Test
  public void test_texas_holdem_1763_3h3sJcJsTc_2c8s_4sKs_8dQs() {
    assertEquals(
      "2c8s 8dQs 4sKs",
      Solver.process("texas-holdem 3h3sJcJsTc 2c8s 4sKs 8dQs"));
  }

  @Test
  public void test_texas_holdem_1764_2h3s7hAhKd_JcJd_2s8h_7cTh_TcTs_Qh4c_As9d() {
    assertEquals(
      "Qh4c 2s8h 7cTh TcTs JcJd As9d",
      Solver.process("texas-holdem 2h3s7hAhKd JcJd 2s8h 7cTh TcTs Qh4c As9d"));
  }

  @Test
  public void test_texas_holdem_1765_3c3s5d5hJd_As2c_Kd8s_4dAc_5c7h_9sAd() {
    assertEquals(
      "Kd8s 4dAc=9sAd=As2c 5c7h",
      Solver.process("texas-holdem 3c3s5d5hJd As2c Kd8s 4dAc 5c7h 9sAd"));
  }

  @Test
  public void test_texas_holdem_1766_9c9h9sKsQh_6s5c_2d2s_3s2c_2hAh_7s8s_5h3d_4hAd_4cJs_7cTs() {
    assertEquals(
      "3s2c=4cJs=5h3d=6s5c=7cTs=7s8s 2hAh=4hAd 2d2s",
      Solver.process("texas-holdem 9c9h9sKsQh 6s5c 2d2s 3s2c 2hAh 7s8s 5h3d 4hAd 4cJs 7cTs"));
  }

  @Test
  public void test_texas_holdem_1767_3h5c5d9cQs_8d4s_2dKd_Td4d() {
    assertEquals(
      "8d4s Td4d 2dKd",
      Solver.process("texas-holdem 3h5c5d9cQs 8d4s 2dKd Td4d"));
  }

  @Test
  public void test_texas_holdem_1768_2c6c8sAcKh_7c7d_8d3c_4c6s() {
    assertEquals(
      "4c6s 7c7d 8d3c",
      Solver.process("texas-holdem 2c6c8sAcKh 7c7d 8d3c 4c6s"));
  }

  @Test
  public void test_texas_holdem_1769_2s3s6dJcJs_Ah4d_8sAs() {
    assertEquals(
      "Ah4d 8sAs",
      Solver.process("texas-holdem 2s3s6dJcJs Ah4d 8sAs"));
  }

  @Test
  public void test_texas_holdem_1770_3h8dAcAdAs_JcJs_7c8h_4cTh_4hQh_7dQd_Qs9c_2d9s() {
    assertEquals(
      "2d9s 4cTh 4hQh=7dQd Qs9c 7c8h JcJs",
      Solver.process("texas-holdem 3h8dAcAdAs JcJs 7c8h 4cTh 4hQh 7dQd Qs9c 2d9s"));
  }

  @Test
  public void test_texas_holdem_1771_2h5s9dKdQd_7h3d_8dQc_4s4d_Jd4c() {
    assertEquals(
      "7h3d Jd4c 4s4d 8dQc",
      Solver.process("texas-holdem 2h5s9dKdQd 7h3d 8dQc 4s4d Jd4c"));
  }

  @Test
  public void test_texas_holdem_1772_3h5s6s9dQc_6c6h_AhJs_Tc7c_8h4c_6dTs() {
    assertEquals(
      "8h4c Tc7c AhJs 6dTs 6c6h",
      Solver.process("texas-holdem 3h5s6s9dQc 6c6h AhJs Tc7c 8h4c 6dTs"));
  }

  @Test
  public void test_texas_holdem_1773_4c5s7cAcQh_2sTc_Js3h_6s3s_9cKd_3d8h_8c4d_2hTs() {
    assertEquals(
      "3d8h 2hTs=2sTc Js3h 9cKd 8c4d 6s3s",
      Solver.process("texas-holdem 4c5s7cAcQh 2sTc Js3h 6s3s 9cKd 3d8h 8c4d 2hTs"));
  }

  @Test
  public void test_texas_holdem_1774_5c6c6s9hKc_4h8h_4sJd_4d2d_9sTd_9d2h_8s6h() {
    assertEquals(
      "4d2d 4h8h 4sJd 9d2h=9sTd 8s6h",
      Solver.process("texas-holdem 5c6c6s9hKc 4h8h 4sJd 4d2d 9sTd 9d2h 8s6h"));
  }

  @Test
  public void test_texas_holdem_1775_2h7cAdJcTd_3s2d_5d7d_Th4s_TcQs_6dQc_As2s_Ks3h() {
    assertEquals(
      "6dQc Ks3h 3s2d 5d7d Th4s TcQs As2s",
      Solver.process("texas-holdem 2h7cAdJcTd 3s2d 5d7d Th4s TcQs 6dQc As2s Ks3h"));
  }

  @Test
  public void test_texas_holdem_1776_3s6d6h6sKd_2hJc_TsTc() {
    assertEquals(
      "2hJc TsTc",
      Solver.process("texas-holdem 3s6d6h6sKd 2hJc TsTc"));
  }

  @Test
  public void test_texas_holdem_1777_4c6d9dAdAs_2c4h_3h2d_Ts8s_Kh5c() {
    assertEquals(
      "3h2d Ts8s Kh5c 2c4h",
      Solver.process("texas-holdem 4c6d9dAdAs 2c4h 3h2d Ts8s Kh5c"));
  }

  @Test
  public void test_texas_holdem_1778_2h3c7hAdAh_5h2d_5c2s_Js9d_7d8c_9sTs_Jh8d_4s4h_AcQs() {
    assertEquals(
      "9sTs Jh8d Js9d 5c2s=5h2d 4s4h 7d8c AcQs",
      Solver.process("texas-holdem 2h3c7hAdAh 5h2d 5c2s Js9d 7d8c 9sTs Jh8d 4s4h AcQs"));
  }

  @Test
  public void test_texas_holdem_1779_2d6c8d9sTs_7c3c_5c4h() {
    assertEquals(
      "5c4h 7c3c",
      Solver.process("texas-holdem 2d6c8d9sTs 7c3c 5c4h"));
  }

  @Test
  public void test_texas_holdem_1780_2c2d2s4dQh_Ac6d_3cKs_3h8d_9s5s_JsJd() {
    assertEquals(
      "3h8d 9s5s 3cKs Ac6d JsJd",
      Solver.process("texas-holdem 2c2d2s4dQh Ac6d 3cKs 3h8d 9s5s JsJd"));
  }

  @Test
  public void test_texas_holdem_1781_6hKcKdTdTh_6s7s_QhQc_3s3c() {
    assertEquals(
      "3s3c 6s7s QhQc",
      Solver.process("texas-holdem 6hKcKdTdTh 6s7s QhQc 3s3c"));
  }

  @Test
  public void test_texas_holdem_1782_4c6c6s9dQc_5c8h_4d8d_3cJc_Qh2s_Td9h_2hQs_7cAs_4sKc_Jh5d() {
    assertEquals(
      "5c8h Jh5d 7cAs 4d8d 4sKc Td9h 2hQs=Qh2s 3cJc",
      Solver.process("texas-holdem 4c6c6s9dQc 5c8h 4d8d 3cJc Qh2s Td9h 2hQs 7cAs 4sKc Jh5d"));
  }

  @Test
  public void test_texas_holdem_1783_2h8d9dJsTh_Jh3h_Kd8h_5hKh_7h6c_6h2s() {
    assertEquals(
      "5hKh 6h2s Kd8h Jh3h 7h6c",
      Solver.process("texas-holdem 2h8d9dJsTh Jh3h Kd8h 5hKh 7h6c 6h2s"));
  }

  @Test
  public void test_texas_holdem_1784_2s6c7dKdTc_6s8s_4d6h_5cQs_Js3d_9c4s_5h3c_6d7h() {
    assertEquals(
      "5h3c 9c4s Js3d 5cQs 4d6h 6s8s 6d7h",
      Solver.process("texas-holdem 2s6c7dKdTc 6s8s 4d6h 5cQs Js3d 9c4s 5h3c 6d7h"));
  }

  @Test
  public void test_texas_holdem_1785_3h3s8sAdAh_8hQs_4hTc() {
    assertEquals(
      "4hTc 8hQs",
      Solver.process("texas-holdem 3h3s8sAdAh 8hQs 4hTc"));
  }

  @Test
  public void test_texas_holdem_1786_5h6h8sQdQs_8dTs_6d4h_5c7d_Td3h_9dKs_9cJh_Qh8c() {
    assertEquals(
      "Td3h 9cJh 9dKs 5c7d 6d4h 8dTs Qh8c",
      Solver.process("texas-holdem 5h6h8sQdQs 8dTs 6d4h 5c7d Td3h 9dKs 9cJh Qh8c"));
  }

  @Test
  public void test_texas_holdem_1787_3d5c5d9dJc_7d7h_5s8h_AdKd_4d8c() {
    assertEquals(
      "4d8c 7d7h 5s8h AdKd",
      Solver.process("texas-holdem 3d5c5d9dJc 7d7h 5s8h AdKd 4d8c"));
  }

  @Test
  public void test_texas_holdem_1788_8s9hAsJcQc_7h5h_Td8c_Kh7d_Qs5s_Jd8d_2sQd_3cTh_2hKs_4hTs() {
    assertEquals(
      "7h5h 2hKs=Kh7d 2sQd=Qs5s Jd8d 3cTh=4hTs=Td8c",
      Solver.process("texas-holdem 8s9hAsJcQc 7h5h Td8c Kh7d Qs5s Jd8d 2sQd 3cTh 2hKs 4hTs"));
  }

  @Test
  public void test_texas_holdem_1789_3d3h5d5hTd_Ah9c_Kh6s_4s7s() {
    assertEquals(
      "4s7s Kh6s Ah9c",
      Solver.process("texas-holdem 3d3h5d5hTd Ah9c Kh6s 4s7s"));
  }

  @Test
  public void test_texas_holdem_1790_4s5h9sAcTs_9d9h_5cTc_Th7h_As6c_Kd4h() {
    assertEquals(
      "Kd4h Th7h As6c 5cTc 9d9h",
      Solver.process("texas-holdem 4s5h9sAcTs 9d9h 5cTc Th7h As6c Kd4h"));
  }

  @Test
  public void test_texas_holdem_1791_7h7sAdJdTs_6h2d_5s8h() {
    assertEquals(
      "5s8h=6h2d",
      Solver.process("texas-holdem 7h7sAdJdTs 6h2d 5s8h"));
  }

  @Test
  public void test_texas_holdem_1792_3c3sKsQdTs_Tc2h_7cQs_8s5d() {
    assertEquals(
      "8s5d Tc2h 7cQs",
      Solver.process("texas-holdem 3c3sKsQdTs Tc2h 7cQs 8s5d"));
  }

  @Test
  public void test_texas_holdem_1793_2c4h9hAdQd_Kd2s_Qs8c_6cKs() {
    assertEquals(
      "6cKs Kd2s Qs8c",
      Solver.process("texas-holdem 2c4h9hAdQd Kd2s Qs8c 6cKs"));
  }

  @Test
  public void test_texas_holdem_1794_5s7hKdQcTh_4hJh_Tc4d_8cKh_9dKs() {
    assertEquals(
      "4hJh Tc4d 8cKh 9dKs",
      Solver.process("texas-holdem 5s7hKdQcTh 4hJh Tc4d 8cKh 9dKs"));
  }

  @Test
  public void test_texas_holdem_1795_4c5d7hQdQs_6dTs_2d2c_2sTc_5h6s_6c8h_Kc4d_Kd6h_7sKs() {
    assertEquals(
      "2sTc 6dTs Kd6h 2d2c Kc4d 5h6s 7sKs 6c8h",
      Solver.process("texas-holdem 4c5d7hQdQs 6dTs 2d2c 2sTc 5h6s 6c8h Kc4d Kd6h 7sKs"));
  }

  @Test
  public void test_texas_holdem_1796_2h6s8sQdTh_6c2s_AcAh() {
    assertEquals(
      "AcAh 6c2s",
      Solver.process("texas-holdem 2h6s8sQdTh 6c2s AcAh"));
  }

  @Test
  public void test_texas_holdem_1797_3c6d7hJhTs_Th8s_2d7d_Js9d_3dJd_9sQs_9h5c_2s7c() {
    assertEquals(
      "9h5c 9sQs 2d7d=2s7c Th8s Js9d 3dJd",
      Solver.process("texas-holdem 3c6d7hJhTs Th8s 2d7d Js9d 3dJd 9sQs 9h5c 2s7c"));
  }

  @Test
  public void test_texas_holdem_1798_4h5s8sJhKd_Kh9h_9cAh_3h4d_8c9d_JcAc() {
    assertEquals(
      "9cAh 3h4d 8c9d JcAc Kh9h",
      Solver.process("texas-holdem 4h5s8sJhKd Kh9h 9cAh 3h4d 8c9d JcAc"));
  }

  @Test
  public void test_texas_holdem_1799_2h6c7cJsKs_AsTh_Kc4c() {
    assertEquals(
      "AsTh Kc4c",
      Solver.process("texas-holdem 2h6c7cJsKs AsTh Kc4c"));
  }

  @Test
  public void test_texas_holdem_1800_8cAdJcQhTh_6s7s_2s3s_Qd8d_4h4d() {
    assertEquals(
      "2s3s=6s7s 4h4d Qd8d",
      Solver.process("texas-holdem 8cAdJcQhTh 6s7s 2s3s Qd8d 4h4d"));
  }

  @Test
  public void test_texas_holdem_1801_2c6c8d8hKd_5cTc_Ks9h_Th2h_Kh7s_Ac6s_QdJd_TdJs_TsAh_Kc9c() {
    assertEquals(
      "5cTc TdJs QdJd TsAh Th2h Ac6s Kh7s Kc9c=Ks9h",
      Solver.process("texas-holdem 2c6c8d8hKd 5cTc Ks9h Th2h Kh7s Ac6s QdJd TdJs TsAh Kc9c"));
  }

  @Test
  public void test_texas_holdem_1802_3h4h6s9cKd_Tc8h_7c7s_2s4s_5h2h_9d3c_5cQd() {
    assertEquals(
      "Tc8h 5cQd 2s4s 7c7s 9d3c 5h2h",
      Solver.process("texas-holdem 3h4h6s9cKd Tc8h 7c7s 2s4s 5h2h 9d3c 5cQd"));
  }

  @Test
  public void test_texas_holdem_1803_3s9cJdQcQh_7cQs_6c2s_Td5s_QdJh_4h8d_Kc5c() {
    assertEquals(
      "6c2s 4h8d Td5s Kc5c 7cQs QdJh",
      Solver.process("texas-holdem 3s9cJdQcQh 7cQs 6c2s Td5s QdJh 4h8d Kc5c"));
  }

  @Test
  public void test_texas_holdem_1804_6c6dAdJdKs_8c4s_Qc2s_5hTh_5d7h() {
    assertEquals(
      "5d7h=5hTh=8c4s Qc2s",
      Solver.process("texas-holdem 6c6dAdJdKs 8c4s Qc2s 5hTh 5d7h"));
  }

  @Test
  public void test_texas_holdem_1805_2s3h4c6c7d_8d5h_6sJd_3s9c_8sKd_9d9s_2h3d_KcTc_3cQs_Td2d() {
    assertEquals(
      "8sKd KcTc Td2d 3s9c 3cQs 6sJd 9d9s 2h3d 8d5h",
      Solver.process("texas-holdem 2s3h4c6c7d 8d5h 6sJd 3s9c 8sKd 9d9s 2h3d KcTc 3cQs Td2d"));
  }

  @Test
  public void test_texas_holdem_1806_2d6d8c9hJd_As2s_QsQd_3sJs_Ac5h_Ts8s() {
    assertEquals(
      "Ac5h As2s Ts8s 3sJs QsQd",
      Solver.process("texas-holdem 2d6d8c9hJd As2s QsQd 3sJs Ac5h Ts8s"));
  }

  @Test
  public void test_texas_holdem_1807_6d7c8sAhQc_7dAc_JdKc_6h9s_Kh8h_TdQs_Ts3d() {
    assertEquals(
      "Ts3d JdKc 6h9s Kh8h TdQs 7dAc",
      Solver.process("texas-holdem 6d7c8sAhQc 7dAc JdKc 6h9s Kh8h TdQs Ts3d"));
  }

  @Test
  public void test_texas_holdem_1808_2h5c7sQdTc_Ac8s_6h6d_7h2s_2cQh() {
    assertEquals(
      "Ac8s 6h6d 7h2s 2cQh",
      Solver.process("texas-holdem 2h5c7sQdTc Ac8s 6h6d 7h2s 2cQh"));
  }

  @Test
  public void test_texas_holdem_1809_3c4c6c8cTd_4d9s_5sKd() {
    assertEquals(
      "5sKd 4d9s",
      Solver.process("texas-holdem 3c4c6c8cTd 4d9s 5sKd"));
  }

  @Test
  public void test_texas_holdem_1810_5c5h5sJsKc_TdAh_Qc2c() {
    assertEquals(
      "Qc2c TdAh",
      Solver.process("texas-holdem 5c5h5sJsKc TdAh Qc2c"));
  }

  @Test
  public void test_texas_holdem_1811_2s4s7h8cJs_Ts7d_6d5s_6cKc_3s3h_5d2c() {
    assertEquals(
      "6cKc 5d2c 3s3h Ts7d 6d5s",
      Solver.process("texas-holdem 2s4s7h8cJs Ts7d 6d5s 6cKc 3s3h 5d2c"));
  }

  @Test
  public void test_texas_holdem_1812_2d3c6c7s9d_Qc5d_AsKs() {
    assertEquals(
      "Qc5d AsKs",
      Solver.process("texas-holdem 2d3c6c7s9d Qc5d AsKs"));
  }

  @Test
  public void test_texas_holdem_1813_3s4s6sAsTc_8s4h_2c5c_6c2d() {
    assertEquals(
      "6c2d 2c5c 8s4h",
      Solver.process("texas-holdem 3s4s6sAsTc 8s4h 2c5c 6c2d"));
  }

  @Test
  public void test_texas_holdem_1814_2c5dKsQhTc_3dKh_5s8c_6sAh_3c9h_8h7h_7sTs_8s6c_JcQc() {
    assertEquals(
      "8s6c 8h7h 3c9h 6sAh 5s8c 7sTs JcQc 3dKh",
      Solver.process("texas-holdem 2c5dKsQhTc 3dKh 5s8c 6sAh 3c9h 8h7h 7sTs 8s6c JcQc"));
  }

  @Test
  public void test_texas_holdem_1815_4c4d5dAhKs_6dJs_6c6h_7s5h_Qd8s_Ts9c_JhJd_4h6s_4sAs() {
    assertEquals(
      "Ts9c 6dJs Qd8s 7s5h 6c6h JhJd 4h6s 4sAs",
      Solver.process("texas-holdem 4c4d5dAhKs 6dJs 6c6h 7s5h Qd8s Ts9c JhJd 4h6s 4sAs"));
  }

  @Test
  public void test_texas_holdem_1816_2h4c5cKcTh_8sJs_KdJh_TdAc_9c9d_4d6c_2cJc_7d7h_8h5s_8d2s() {
    assertEquals(
      "8sJs 8d2s 4d6c 8h5s 7d7h 9c9d TdAc KdJh 2cJc",
      Solver.process("texas-holdem 2h4c5cKcTh 8sJs KdJh TdAc 9c9d 4d6c 2cJc 7d7h 8h5s 8d2s"));
  }

  @Test
  public void test_texas_holdem_1817_5h7hAhKsQd_5dAd_9hJd_JsAc() {
    assertEquals(
      "9hJd JsAc 5dAd",
      Solver.process("texas-holdem 5h7hAhKsQd 5dAd 9hJd JsAc"));
  }

  @Test
  public void test_texas_holdem_1818_4c4h7d8d8s_9c8c_3sJd_Ks6h() {
    assertEquals(
      "3sJd Ks6h 9c8c",
      Solver.process("texas-holdem 4c4h7d8d8s 9c8c 3sJd Ks6h"));
  }

  @Test
  public void test_texas_holdem_1819_3d6d6h9hJc_Qs7s_2dQh_8sKs_Th2s_3s9c() {
    assertEquals(
      "Th2s 2dQh=Qs7s 8sKs 3s9c",
      Solver.process("texas-holdem 3d6d6h9hJc Qs7s 2dQh 8sKs Th2s 3s9c"));
  }

  @Test
  public void test_texas_holdem_1820_6d7c7hAcKh_9d9h_3cTc_4s7d() {
    assertEquals(
      "3cTc 9d9h 4s7d",
      Solver.process("texas-holdem 6d7c7hAcKh 9d9h 3cTc 4s7d"));
  }

  @Test
  public void test_texas_holdem_1821_5c6s7s8cAs_Tc9c_Ad6h_AcQc_QhQs_2c7h() {
    assertEquals(
      "2c7h QhQs AcQc Ad6h Tc9c",
      Solver.process("texas-holdem 5c6s7s8cAs Tc9c Ad6h AcQc QhQs 2c7h"));
  }

  @Test
  public void test_texas_holdem_1822_2s4c4d5h6c_8hKs_5cQs_3h2d_KhAd_4h6h() {
    assertEquals(
      "8hKs KhAd 5cQs 3h2d 4h6h",
      Solver.process("texas-holdem 2s4c4d5h6c 8hKs 5cQs 3h2d KhAd 4h6h"));
  }

  @Test
  public void test_texas_holdem_1823_2s7h7sAhAs_Qc4d_5c7d_Kc3c_Kh9d_Kd5d_5h5s() {
    assertEquals(
      "5h5s Qc4d Kc3c=Kd5d=Kh9d 5c7d",
      Solver.process("texas-holdem 2s7h7sAhAs Qc4d 5c7d Kc3c Kh9d Kd5d 5h5s"));
  }

  @Test
  public void test_texas_holdem_1824_AcAsJcJhTd_2c9d_7sTh_Kd4s_Qc7c_4h9s() {
    assertEquals(
      "2c9d=4h9s=7sTh Qc7c Kd4s",
      Solver.process("texas-holdem AcAsJcJhTd 2c9d 7sTh Kd4s Qc7c 4h9s"));
  }

  @Test
  public void test_texas_holdem_1825_4h9c9hAhKs_AdTs_8sTh_8cJc_3cKd_3hTc_Kc2h() {
    assertEquals(
      "3hTc=8sTh 8cJc 3cKd=Kc2h AdTs",
      Solver.process("texas-holdem 4h9c9hAhKs AdTs 8sTh 8cJc 3cKd 3hTc Kc2h"));
  }

  @Test
  public void test_texas_holdem_1826_2s5c5h7sQh_7h6s_9c6c_7c4s_JsKc() {
    assertEquals(
      "9c6c JsKc 7c4s=7h6s",
      Solver.process("texas-holdem 2s5c5h7sQh 7h6s 9c6c 7c4s JsKc"));
  }

  @Test
  public void test_texas_holdem_1827_2h3d6h9sAh_Ad4h_QcAc_TdKd() {
    assertEquals(
      "TdKd Ad4h QcAc",
      Solver.process("texas-holdem 2h3d6h9sAh Ad4h QcAc TdKd"));
  }

  @Test
  public void test_texas_holdem_1828_3c6s7sAhTh_Jc5d_5c3s_Qs9h() {
    assertEquals(
      "Jc5d Qs9h 5c3s",
      Solver.process("texas-holdem 3c6s7sAhTh Jc5d 5c3s Qs9h"));
  }

  @Test
  public void test_texas_holdem_1829_3d4h8hAdQs_Js7h_Ah9d_8d6d() {
    assertEquals(
      "Js7h 8d6d Ah9d",
      Solver.process("texas-holdem 3d4h8hAdQs Js7h Ah9d 8d6d"));
  }

  @Test
  public void test_texas_holdem_1830_2c3h4h8cAd_As7d_TdTh_9c9d_QdJc_8hKd_4dKc_Js4c() {
    assertEquals(
      "QdJc Js4c 4dKc 8hKd 9c9d TdTh As7d",
      Solver.process("texas-holdem 2c3h4h8cAd As7d TdTh 9c9d QdJc 8hKd 4dKc Js4c"));
  }

  @Test
  public void test_texas_holdem_1831_3d3s7d9sTh_Ad2s_6d8d_4s5s_6h4h_7cJc() {
    assertEquals(
      "4s5s=6h4h Ad2s 7cJc 6d8d",
      Solver.process("texas-holdem 3d3s7d9sTh Ad2s 6d8d 4s5s 6h4h 7cJc"));
  }

  @Test
  public void test_texas_holdem_1832_2s6s7s9cTs_Td4d_Ad3h_Jc2c_KdJs_4sJh_ThKs_AhQs_AcQc_8d5s() {
    assertEquals(
      "Ad3h AcQc Jc2c Td4d 4sJh 8d5s KdJs AhQs ThKs",
      Solver.process("texas-holdem 2s6s7s9cTs Td4d Ad3h Jc2c KdJs 4sJh ThKs AhQs AcQc 8d5s"));
  }

  @Test
  public void test_texas_holdem_1833_7c7sJcQsTd_Ad3h_3sQd_AsAh_Kh5d_6h7d_2s8c() {
    assertEquals(
      "2s8c Kh5d Ad3h 3sQd AsAh 6h7d",
      Solver.process("texas-holdem 7c7sJcQsTd Ad3h 3sQd AsAh Kh5d 6h7d 2s8c"));
  }

  @Test
  public void test_texas_holdem_1834_4c4s5s9dJc_7s4d_7dKc() {
    assertEquals(
      "7dKc 7s4d",
      Solver.process("texas-holdem 4c4s5s9dJc 7s4d 7dKc"));
  }

  @Test
  public void test_texas_holdem_1835_3s4h5h9cQc_Ah6s_Qs7c_Td9s_8c3h_ThKd_2c4c_2dAd() {
    assertEquals(
      "ThKd Ah6s 8c3h 2c4c Td9s Qs7c 2dAd",
      Solver.process("texas-holdem 3s4h5h9cQc Ah6s Qs7c Td9s 8c3h ThKd 2c4c 2dAd"));
  }

  @Test
  public void test_texas_holdem_1836_2c9c9dAhTd_3dQc_8d2d_5hQh_2s6h_3cKd_7s5c_3h5d_KsAs_AdKh() {
    assertEquals(
      "3h5d 7s5c 3dQc=5hQh 3cKd 2s6h=8d2d AdKh=KsAs",
      Solver.process("texas-holdem 2c9c9dAhTd 3dQc 8d2d 5hQh 2s6h 3cKd 7s5c 3h5d KsAs AdKh"));
  }

  @Test
  public void test_texas_holdem_1837_5s8c9sKdKh_QdAc_9d8d_Jc9c() {
    assertEquals(
      "QdAc 9d8d Jc9c",
      Solver.process("texas-holdem 5s8c9sKdKh QdAc 9d8d Jc9c"));
  }

  @Test
  public void test_texas_holdem_1838_3h4hJcJsKs_6dTs_2dQh_Jd6s_8hJh_7hAh_Td5h_9s3c() {
    assertEquals(
      "Td5h 6dTs 2dQh 7hAh 9s3c Jd6s 8hJh",
      Solver.process("texas-holdem 3h4hJcJsKs 6dTs 2dQh Jd6s 8hJh 7hAh Td5h 9s3c"));
  }

  @Test
  public void test_texas_holdem_1839_5d6dAcKsTd_4sJc_7d2s_4cJd_4dKc_9s2h_7hAh() {
    assertEquals(
      "7d2s 9s2h 4cJd=4sJc 4dKc 7hAh",
      Solver.process("texas-holdem 5d6dAcKsTd 4sJc 7d2s 4cJd 4dKc 9s2h 7hAh"));
  }

  @Test
  public void test_texas_holdem_1840_4c4d5sJhKc_TdAc_6sAh_6c9c_Th7h_5d9s_8h2h() {
    assertEquals(
      "8h2h 6c9c Th7h 6sAh=TdAc 5d9s",
      Solver.process("texas-holdem 4c4d5sJhKc TdAc 6sAh 6c9c Th7h 5d9s 8h2h"));
  }

  @Test
  public void test_texas_holdem_1841_4h6d9cQcTc_AsKc_2s4s_8dAc_7h3c_9hJc_5c6s_JsTs_8h3s_KsJh() {
    assertEquals(
      "7h3c 8h3s 8dAc AsKc 2s4s 5c6s 9hJc JsTs KsJh",
      Solver.process("texas-holdem 4h6d9cQcTc AsKc 2s4s 8dAc 7h3c 9hJc 5c6s JsTs 8h3s KsJh"));
  }

  @Test
  public void test_texas_holdem_1842_2c2d6h8dJh_ThAd_4h9h_7cKh_TcJs() {
    assertEquals(
      "4h9h 7cKh ThAd TcJs",
      Solver.process("texas-holdem 2c2d6h8dJh ThAd 4h9h 7cKh TcJs"));
  }

  @Test
  public void test_texas_holdem_1843_4dJcKsQdTc_5hQh_5s2s() {
    assertEquals(
      "5s2s 5hQh",
      Solver.process("texas-holdem 4dJcKsQdTc 5hQh 5s2s"));
  }

  @Test
  public void test_texas_holdem_1844_5h8dAdKdQd_9s7h_3c2d_5s9d_4s2c_3d8s_7dAs_9c2s() {
    assertEquals(
      "4s2c 9c2s=9s7h 3c2d 3d8s 7dAs 5s9d",
      Solver.process("texas-holdem 5h8dAdKdQd 9s7h 3c2d 5s9d 4s2c 3d8s 7dAs 9c2s"));
  }

  @Test
  public void test_texas_holdem_1845_3dAcAdKhTs_7d3s_6c6d() {
    assertEquals(
      "7d3s 6c6d",
      Solver.process("texas-holdem 3dAcAdKhTs 7d3s 6c6d"));
  }

  @Test
  public void test_texas_holdem_1846_4c6s7dAcJd_3h2s_ThKc_Ah2h_8s8h_9cJc_7hQh_3cAs() {
    assertEquals(
      "3h2s ThKc 7hQh 8s8h 9cJc 3cAs=Ah2h",
      Solver.process("texas-holdem 4c6s7dAcJd 3h2s ThKc Ah2h 8s8h 9cJc 7hQh 3cAs"));
  }

  @Test
  public void test_texas_holdem_1847_3d6cJdQcQs_9c9s_Qd6s_7h4h() {
    assertEquals(
      "7h4h 9c9s Qd6s",
      Solver.process("texas-holdem 3d6cJdQcQs 9c9s Qd6s 7h4h"));
  }

  @Test
  public void test_texas_holdem_1848_8c8dAcJcJs_8s9c_6h5h_9s7h_4h6c_9h7s_7c4s_Jd6s() {
    assertEquals(
      "4h6c=6h5h=7c4s=9h7s=9s7h 8s9c Jd6s",
      Solver.process("texas-holdem 8c8dAcJcJs 8s9c 6h5h 9s7h 4h6c 9h7s 7c4s Jd6s"));
  }

  @Test
  public void test_texas_holdem_1849_7c7d7s8s9c_4s5d_Kc6h_QhAd_3s6c_KhJh_7hQd_3c4d_QsKd_5cQc() {
    assertEquals(
      "3c4d=3s6c=4s5d 5cQc Kc6h KhJh QsKd QhAd 7hQd",
      Solver.process("texas-holdem 7c7d7s8s9c 4s5d Kc6h QhAd 3s6c KhJh 7hQd 3c4d QsKd 5cQc"));
  }

  @Test
  public void test_texas_holdem_1850_2h3h5c9cKs_7dAd_5dTs() {
    assertEquals(
      "7dAd 5dTs",
      Solver.process("texas-holdem 2h3h5c9cKs 7dAd 5dTs"));
  }

  @Test
  public void test_texas_holdem_1851_5h6h7sAsTd_KcTh_7dKd_8c2d_8d4c() {
    assertEquals(
      "8c2d 7dKd KcTh 8d4c",
      Solver.process("texas-holdem 5h6h7sAsTd KcTh 7dKd 8c2d 8d4c"));
  }

  @Test
  public void test_texas_holdem_1852_3d3h3s9d9s_7hQd_4c5s_7cJh_TcKd() {
    assertEquals(
      "4c5s=7cJh=7hQd=TcKd",
      Solver.process("texas-holdem 3d3h3s9d9s 7hQd 4c5s 7cJh TcKd"));
  }

  @Test
  public void test_texas_holdem_1853_3d4c5c6hJd_5s6c_Kh9c_Qc7d_3sJc_4s7h() {
    assertEquals(
      "Kh9c 5s6c 3sJc 4s7h=Qc7d",
      Solver.process("texas-holdem 3d4c5c6hJd 5s6c Kh9c Qc7d 3sJc 4s7h"));
  }

  @Test
  public void test_texas_holdem_1854_7hAhJdJsKd_5hQd_9d9h() {
    assertEquals(
      "5hQd 9d9h",
      Solver.process("texas-holdem 7hAhJdJsKd 5hQd 9d9h"));
  }

  @Test
  public void test_texas_holdem_1855_4hAcKdKhTd_8c7d_3s3h_8sTc_Qh2c_AsQd_5d9s_7cQs() {
    assertEquals(
      "8c7d 5d9s 7cQs=Qh2c 3s3h 8sTc AsQd",
      Solver.process("texas-holdem 4hAcKdKhTd 8c7d 3s3h 8sTc Qh2c AsQd 5d9s 7cQs"));
  }

  @Test
  public void test_texas_holdem_1856_3dAhQsTcTd_4s6c_9c5c() {
    assertEquals(
      "4s6c 9c5c",
      Solver.process("texas-holdem 3dAhQsTcTd 4s6c 9c5c"));
  }

  @Test
  public void test_texas_holdem_1857_3d8h9hTcTh_2c7h_9dKc_JsQh_4h5s_8s3c_As8c_8dAd_Ac2s_7s5c() {
    assertEquals(
      "4h5s 2c7h=7s5c Ac2s 8s3c 8dAd=As8c 9dKc JsQh",
      Solver.process("texas-holdem 3d8h9hTcTh 2c7h 9dKc JsQh 4h5s 8s3c As8c 8dAd Ac2s 7s5c"));
  }

  @Test
  public void test_texas_holdem_1858_4sJdJhQdTc_4cJc_2cTd() {
    assertEquals(
      "2cTd 4cJc",
      Solver.process("texas-holdem 4sJdJhQdTc 4cJc 2cTd"));
  }

  @Test
  public void test_texas_holdem_1859_6cAcQcQsTs_Td9h_Jh3d_Qd8c_4sAh() {
    assertEquals(
      "Jh3d Td9h 4sAh Qd8c",
      Solver.process("texas-holdem 6cAcQcQsTs Td9h Jh3d Qd8c 4sAh"));
  }

  @Test
  public void test_texas_holdem_1860_2s9cKsQcTc_9d4h_5h3d_8s2h_3sJc_3cAh_JhAs_AcQh_4c8c_8h8d() {
    assertEquals(
      "5h3d 3cAh 8s2h 8h8d 9d4h AcQh 3sJc JhAs 4c8c",
      Solver.process("texas-holdem 2s9cKsQcTc 9d4h 5h3d 8s2h 3sJc 3cAh JhAs AcQh 4c8c 8h8d"));
  }

  @Test
  public void test_texas_holdem_1861_3c5c7d8hAc_3sTs_2cTc_Qs2d_QcAh_8s9s_4c6c_Jd7h_Ks9d_Th3h() {
    assertEquals(
      "Qs2d Ks9d 3sTs=Th3h Jd7h 8s9s QcAh 4c6c 2cTc",
      Solver.process("texas-holdem 3c5c7d8hAc 3sTs 2cTc Qs2d QcAh 8s9s 4c6c Jd7h Ks9d Th3h"));
  }

  @Test
  public void test_texas_holdem_1862_5d5h8dKcQd_Ad2s_6dQc_3d7h_Ks4d_Kh4c_8cTs_5c4h_3sTh_2dQh() {
    assertEquals(
      "3d7h 3sTh Ad2s 8cTs 2dQh=6dQc Kh4c=Ks4d 5c4h",
      Solver.process("texas-holdem 5d5h8dKcQd Ad2s 6dQc 3d7h Ks4d Kh4c 8cTs 5c4h 3sTh 2dQh"));
  }

  @Test
  public void test_texas_holdem_1863_3c6h8sJdTs_Ad9c_5d7h_Ah4d_8d3d_AcQh() {
    assertEquals(
      "5d7h Ah4d Ad9c AcQh 8d3d",
      Solver.process("texas-holdem 3c6h8sJdTs Ad9c 5d7h Ah4d 8d3d AcQh"));
  }

  @Test
  public void test_texas_holdem_1864_3c3s7sJcTc_TdQc_4d5s_4sAd_8s4c() {
    assertEquals(
      "4d5s 8s4c 4sAd TdQc",
      Solver.process("texas-holdem 3c3s7sJcTc TdQc 4d5s 4sAd 8s4c"));
  }

  @Test
  public void test_texas_holdem_1865_2s4d7c8dJd_Ac4c_6sKs_KdTh_8sTd_TsQh_Jh5c() {
    assertEquals(
      "TsQh 6sKs KdTh Ac4c 8sTd Jh5c",
      Solver.process("texas-holdem 2s4d7c8dJd Ac4c 6sKs KdTh 8sTd TsQh Jh5c"));
  }

  @Test
  public void test_texas_holdem_1866_6h6s7s8sQd_Th4c_9hAs_3cKd_2cJh_Ah4s() {
    assertEquals(
      "Th4c 2cJh 3cKd Ah4s 9hAs",
      Solver.process("texas-holdem 6h6s7s8sQd Th4c 9hAs 3cKd 2cJh Ah4s"));
  }

  @Test
  public void test_texas_holdem_1867_2d4d5h6cKc_Kh4h_9h6h_8hAs_3cAc_Ts7h() {
    assertEquals(
      "Ts7h 8hAs 9h6h Kh4h 3cAc",
      Solver.process("texas-holdem 2d4d5h6cKc Kh4h 9h6h 8hAs 3cAc Ts7h"));
  }

  @Test
  public void test_texas_holdem_1868_3s7dJcJsQd_2h5s_8sAs_3h8d() {
    assertEquals(
      "2h5s 8sAs 3h8d",
      Solver.process("texas-holdem 3s7dJcJsQd 2h5s 8sAs 3h8d"));
  }

  @Test
  public void test_texas_holdem_1869_2c6c9dAcAh_7sJh_7h2s_AdKs_6sTh_5dJc_5c3c() {
    assertEquals(
      "5dJc 7sJh 7h2s 6sTh AdKs 5c3c",
      Solver.process("texas-holdem 2c6c9dAcAh 7sJh 7h2s AdKs 6sTh 5dJc 5c3c"));
  }

  @Test
  public void test_texas_holdem_1870_3d3h4hKcQc_Ts5s_7c9h_5c6d() {
    assertEquals(
      "5c6d 7c9h Ts5s",
      Solver.process("texas-holdem 3d3h4hKcQc Ts5s 7c9h 5c6d"));
  }

  @Test
  public void test_texas_holdem_1871_3s9cKsQcTh_JdKh_3dJs_4cAs_AcAh_QdJh() {
    assertEquals(
      "4cAs AcAh 3dJs=JdKh=QdJh",
      Solver.process("texas-holdem 3s9cKsQcTh JdKh 3dJs 4cAs AcAh QdJh"));
  }

  @Test
  public void test_texas_holdem_1872_3sJdKcQdQh_4s4c_4d6s() {
    assertEquals(
      "4d6s 4s4c",
      Solver.process("texas-holdem 3sJdKcQdQh 4s4c 4d6s"));
  }

  @Test
  public void test_texas_holdem_1873_3h4d6cJsKd_Qd5c_8s2d_As3d_7sTh() {
    assertEquals(
      "8s2d 7sTh Qd5c As3d",
      Solver.process("texas-holdem 3h4d6cJsKd Qd5c 8s2d As3d 7sTh"));
  }

  @Test
  public void test_texas_holdem_1874_2s7s8hAsJc_6h9s_3sTs_AhTd_9c6c() {
    assertEquals(
      "6h9s=9c6c AhTd 3sTs",
      Solver.process("texas-holdem 2s7s8hAsJc 6h9s 3sTs AhTd 9c6c"));
  }

  @Test
  public void test_texas_holdem_1875_3d4d5c6cAh_9cTd_As3c_9d7c() {
    assertEquals(
      "9cTd As3c 9d7c",
      Solver.process("texas-holdem 3d4d5c6cAh 9cTd As3c 9d7c"));
  }

  @Test
  public void test_texas_holdem_1876_2c3s4cAcQh_3d6h_8cAd() {
    assertEquals(
      "3d6h 8cAd",
      Solver.process("texas-holdem 2c3s4cAcQh 3d6h 8cAd"));
  }

  @Test
  public void test_texas_holdem_1877_6d7d9d9sQc_AhJc_8s5s_5c6c_6s2d_KsAc_4dTc_KhJh_2c9c_Js7c() {
    assertEquals(
      "4dTc KhJh AhJc KsAc 5c6c=6s2d Js7c 2c9c 8s5s",
      Solver.process("texas-holdem 6d7d9d9sQc AhJc 8s5s 5c6c 6s2d KsAc 4dTc KhJh 2c9c Js7c"));
  }

  @Test
  public void test_texas_holdem_1878_5d5hJhJsKs_Ah6h_7hAd_4h4d_2cJd_JcTs_QsQd_8dTd() {
    assertEquals(
      "4h4d=8dTd 7hAd=Ah6h QsQd 2cJd=JcTs",
      Solver.process("texas-holdem 5d5hJhJsKs Ah6h 7hAd 4h4d 2cJd JcTs QsQd 8dTd"));
  }

  @Test
  public void test_texas_holdem_1879_3s4sAcAsTc_Jh2s_9d8s_7hTd_Kc4h_6dAh_5h2h_Ad9s() {
    assertEquals(
      "9d8s Jh2s Kc4h 7hTd 6dAh Ad9s 5h2h",
      Solver.process("texas-holdem 3s4sAcAsTc Jh2s 9d8s 7hTd Kc4h 6dAh 5h2h Ad9s"));
  }

  @Test
  public void test_texas_holdem_1880_3d6h7hJdJh_3c9c_9s4h_3sQc_8c6s_QdKs_3h5d() {
    assertEquals(
      "9s4h QdKs 3h5d 3c9c 3sQc 8c6s",
      Solver.process("texas-holdem 3d6h7hJdJh 3c9c 9s4h 3sQc 8c6s QdKs 3h5d"));
  }

  @Test
  public void test_texas_holdem_1881_2c2h6c9hQc_Qh2s_7c5s_5dAc_3cTh_2d4s() {
    assertEquals(
      "7c5s 3cTh 5dAc 2d4s Qh2s",
      Solver.process("texas-holdem 2c2h6c9hQc Qh2s 7c5s 5dAc 3cTh 2d4s"));
  }

  @Test
  public void test_texas_holdem_1882_6dJsKcQhTh_TcJh_4c5h_TsKh_8d2h_Td6h() {
    assertEquals(
      "4c5h 8d2h Td6h TcJh TsKh",
      Solver.process("texas-holdem 6dJsKcQhTh TcJh 4c5h TsKh 8d2h Td6h"));
  }

  @Test
  public void test_texas_holdem_1883_3h4c7sKcKh_Jh9c_TsAs_8sTc_6d6h_Kd4s_Ks9d_6c2d_2s9h_4hAc() {
    assertEquals(
      "6c2d 2s9h 8sTc Jh9c TsAs 4hAc 6d6h Ks9d Kd4s",
      Solver.process("texas-holdem 3h4c7sKcKh Jh9c TsAs 8sTc 6d6h Kd4s Ks9d 6c2d 2s9h 4hAc"));
  }

  @Test
  public void test_texas_holdem_1884_AcAdJhKsQs_2d3s_8sTs_9d6c_5s5c_2hTd_Qd9c_7s5d_6h9h_JdKd() {
    assertEquals(
      "2d3s=6h9h=7s5d=9d6c 5s5c Qd9c JdKd 2hTd=8sTs",
      Solver.process("texas-holdem AcAdJhKsQs 2d3s 8sTs 9d6c 5s5c 2hTd Qd9c 7s5d 6h9h JdKd"));
  }

  @Test
  public void test_texas_holdem_1885_2h3c3s5cJd_2s5d_TsQh() {
    assertEquals(
      "TsQh 2s5d",
      Solver.process("texas-holdem 2h3c3s5cJd 2s5d TsQh"));
  }

  @Test
  public void test_texas_holdem_1886_2d3h3s4h7h_Ah7s_JcTd_7dAs() {
    assertEquals(
      "JcTd 7dAs=Ah7s",
      Solver.process("texas-holdem 2d3h3s4h7h Ah7s JcTd 7dAs"));
  }

  @Test
  public void test_texas_holdem_1887_3c3dKcQcQd_6s2c_8cJs_4h7d_Qh8d_Jd5c_Td7h_8s6c_Jh9h_7s2h() {
    assertEquals(
      "4h7d=6s2c=7s2h=8cJs=8s6c=Jd5c=Jh9h=Td7h Qh8d",
      Solver.process("texas-holdem 3c3dKcQcQd 6s2c 8cJs 4h7d Qh8d Jd5c Td7h 8s6c Jh9h 7s2h"));
  }

  @Test
  public void test_texas_holdem_1888_2c2d5c7hAs_QdAc_Th8d_Tc2h_Ts5s() {
    assertEquals(
      "Th8d Ts5s QdAc Tc2h",
      Solver.process("texas-holdem 2c2d5c7hAs QdAc Th8d Tc2h Ts5s"));
  }

  @Test
  public void test_texas_holdem_1889_2d3h5d7dTs_2s4s_QsJh_6s8s_3d8h_7cJc() {
    assertEquals(
      "6s8s QsJh 2s4s 3d8h 7cJc",
      Solver.process("texas-holdem 2d3h5d7dTs 2s4s QsJh 6s8s 3d8h 7cJc"));
  }

  @Test
  public void test_texas_holdem_1890_3d5sKsQcTh_9d9s_8sKh_5dTs_Tc7h_Kc3h_2dQd_JsAh() {
    assertEquals(
      "9d9s Tc7h 2dQd 8sKh 5dTs Kc3h JsAh",
      Solver.process("texas-holdem 3d5sKsQcTh 9d9s 8sKh 5dTs Tc7h Kc3h 2dQd JsAh"));
  }

  @Test
  public void test_texas_holdem_1891_2c9hKcKsTd_7dQc_QdJs_2sJh() {
    assertEquals(
      "7dQc 2sJh QdJs",
      Solver.process("texas-holdem 2c9hKcKsTd 7dQc QdJs 2sJh"));
  }

  @Test
  public void test_texas_holdem_1892_6s8h9hJcTd_KdJh_Js2d_7cTc_8d4s_Ts9s_Jd4h_5dAh() {
    assertEquals(
      "5dAh 8d4s Jd4h=Js2d KdJh Ts9s 7cTc",
      Solver.process("texas-holdem 6s8h9hJcTd KdJh Js2d 7cTc 8d4s Ts9s Jd4h 5dAh"));
  }

  @Test
  public void test_texas_holdem_1893_6d7c9sJcKh_6c5d_8cAc_Ks8h_Ad2s_Jd9c() {
    assertEquals(
      "Ad2s 8cAc 6c5d Ks8h Jd9c",
      Solver.process("texas-holdem 6d7c9sJcKh 6c5d 8cAc Ks8h Ad2s Jd9c"));
  }

  @Test
  public void test_texas_holdem_1894_4s6h8dAsTh_TsAc_5s6d_Tc5c_8c9c_JhKs_2cJd_3s8h_6c9h_7h2h() {
    assertEquals(
      "7h2h 2cJd JhKs 5s6d 6c9h 3s8h 8c9c Tc5c TsAc",
      Solver.process("texas-holdem 4s6h8dAsTh TsAc 5s6d Tc5c 8c9c JhKs 2cJd 3s8h 6c9h 7h2h"));
  }

  @Test
  public void test_texas_holdem_1895_3d6d6h7sAc_Kd9s_7d5h_8c2d_Kh6c_Ad5d() {
    assertEquals(
      "8c2d Kd9s 7d5h Ad5d Kh6c",
      Solver.process("texas-holdem 3d6d6h7sAc Kd9s 7d5h 8c2d Kh6c Ad5d"));
  }

  @Test
  public void test_texas_holdem_1896_2d3h6c9cAh_8d7s_Ac3d_KcAd() {
    assertEquals(
      "8d7s KcAd Ac3d",
      Solver.process("texas-holdem 2d3h6c9cAh 8d7s Ac3d KcAd"));
  }

  @Test
  public void test_texas_holdem_1897_5h8sAcAdQc_Js6d_Jh7h_4s9h_JdKs_3h4h() {
    assertEquals(
      "3h4h 4s9h Jh7h=Js6d JdKs",
      Solver.process("texas-holdem 5h8sAcAdQc Js6d Jh7h 4s9h JdKs 3h4h"));
  }

  @Test
  public void test_texas_holdem_1898_2d2h3h9c9h_7hTh_6cAd_KsQh_4c7s_4hQs_8s9s() {
    assertEquals(
      "4c7s 4hQs KsQh 6cAd 7hTh 8s9s",
      Solver.process("texas-holdem 2d2h3h9c9h 7hTh 6cAd KsQh 4c7s 4hQs 8s9s"));
  }

  @Test
  public void test_texas_holdem_1899_3c6d8sAhKc_JdJh_6sJc_TcQs_9sAc_Th2c() {
    assertEquals(
      "Th2c TcQs 6sJc JdJh 9sAc",
      Solver.process("texas-holdem 3c6d8sAhKc JdJh 6sJc TcQs 9sAc Th2c"));
  }

  @Test
  public void test_texas_holdem_1900_5c8hAcKdTs_2d2h_8c4s_5d6s_3s5h_9h6c_9cAs() {
    assertEquals(
      "9h6c 2d2h 3s5h=5d6s 8c4s 9cAs",
      Solver.process("texas-holdem 5c8hAcKdTs 2d2h 8c4s 5d6s 3s5h 9h6c 9cAs"));
  }

  @Test
  public void test_texas_holdem_1901_9dAsQcThTs_6c3d_Qd8d_Td8s_3h4h_6hKs_7s2h_2dAd_JcQs() {
    assertEquals(
      "3h4h=6c3d=7s2h 6hKs JcQs=Qd8d 2dAd Td8s",
      Solver.process("texas-holdem 9dAsQcThTs 6c3d Qd8d Td8s 3h4h 6hKs 7s2h 2dAd JcQs"));
  }

  @Test
  public void test_texas_holdem_1902_4c6dJcQcTs_Td6h_3dAc_5h7c_4sJs_2h2c_Qh9c_Ks2d() {
    assertEquals(
      "5h7c Ks2d 3dAc 2h2c Qh9c Td6h 4sJs",
      Solver.process("texas-holdem 4c6dJcQcTs Td6h 3dAc 5h7c 4sJs 2h2c Qh9c Ks2d"));
  }

  @Test
  public void test_texas_holdem_1903_5c8sAdAhJh_2cKh_9h8c_AsTs_JsJc() {
    assertEquals(
      "2cKh 9h8c AsTs JsJc",
      Solver.process("texas-holdem 5c8sAdAhJh 2cKh 9h8c AsTs JsJc"));
  }

  @Test
  public void test_texas_holdem_1904_2c3h4s6sQc_9h2s_Th7d_Qh8c_Kh9s_5s5c_8sAh_Ad3s_Kd2h() {
    assertEquals(
      "Th7d Kh9s 8sAh 9h2s Kd2h Ad3s Qh8c 5s5c",
      Solver.process("texas-holdem 2c3h4s6sQc 9h2s Th7d Qh8c Kh9s 5s5c 8sAh Ad3s Kd2h"));
  }

  @Test
  public void test_texas_holdem_1905_2d3h8hQhTs_As5c_Jh4c_Jd2c() {
    assertEquals(
      "Jh4c As5c Jd2c",
      Solver.process("texas-holdem 2d3h8hQhTs As5c Jh4c Jd2c"));
  }

  @Test
  public void test_texas_holdem_1906_3h7c8dJsQc_7h4d_Td6c() {
    assertEquals(
      "Td6c 7h4d",
      Solver.process("texas-holdem 3h7c8dJsQc 7h4d Td6c"));
  }

  @Test
  public void test_texas_holdem_1907_2s4s6dAcKd_QdTh_3sJd_Qs9s() {
    assertEquals(
      "3sJd Qs9s QdTh",
      Solver.process("texas-holdem 2s4s6dAcKd QdTh 3sJd Qs9s"));
  }

  @Test
  public void test_texas_holdem_1908_3c3sJdJsTd_Qd9c_7h2c_5d6d_2hAh_4h5h() {
    assertEquals(
      "4h5h=5d6d=7h2c Qd9c 2hAh",
      Solver.process("texas-holdem 3c3sJdJsTd Qd9c 7h2c 5d6d 2hAh 4h5h"));
  }

  @Test
  public void test_texas_holdem_1909_4h4s8h9dAh_Kh8d_9s7h_KsQd_AdJs_Jd2c_7dTd_4c3c_9c2d_Ac5d() {
    assertEquals(
      "7dTd Jd2c KsQd Kh8d 9c2d=9s7h Ac5d AdJs 4c3c",
      Solver.process("texas-holdem 4h4s8h9dAh Kh8d 9s7h KsQd AdJs Jd2c 7dTd 4c3c 9c2d Ac5d"));
  }

  @Test
  public void test_texas_holdem_1910_2c4s6c7sJd_Ks2d_9hTc_Jc3s_4c9d_QhQs_Th4h() {
    assertEquals(
      "9hTc Ks2d 4c9d Th4h Jc3s QhQs",
      Solver.process("texas-holdem 2c4s6c7sJd Ks2d 9hTc Jc3s 4c9d QhQs Th4h"));
  }

  @Test
  public void test_texas_holdem_1911_3c3hAcKdTh_AhQh_JsTc_5c9d_8s8h_9cTd_KhKc_2d7s_KsQs_2s5s() {
    assertEquals(
      "2d7s=2s5s=5c9d 8s8h 9cTd=JsTc KsQs AhQh KhKc",
      Solver.process("texas-holdem 3c3hAcKdTh AhQh JsTc 5c9d 8s8h 9cTd KhKc 2d7s KsQs 2s5s"));
  }

  @Test
  public void test_texas_holdem_1912_3s6dJhKcQh_AdTh_4c4h_5dAh_6c8h_Qd5s_3cQc_6s7s() {
    assertEquals(
      "5dAh 4c4h 6c8h=6s7s Qd5s 3cQc AdTh",
      Solver.process("texas-holdem 3s6dJhKcQh AdTh 4c4h 5dAh 6c8h Qd5s 3cQc 6s7s"));
  }

  @Test
  public void test_texas_holdem_1913_5s6c6d9hJd_Jc2h_3c5d_Qs9s_9d7c_Ts7d() {
    assertEquals(
      "Ts7d 3c5d 9d7c Qs9s Jc2h",
      Solver.process("texas-holdem 5s6c6d9hJd Jc2h 3c5d Qs9s 9d7c Ts7d"));
  }

  @Test
  public void test_texas_holdem_1914_3h4s5dAhJc_4dKd_JdKh_Qs7c_8h8c_2c5c_QcTh_JsAc_8d6h_QdKs() {
    assertEquals(
      "8d6h Qs7c QcTh QdKs 4dKd 8h8c JdKh JsAc 2c5c",
      Solver.process("texas-holdem 3h4s5dAhJc 4dKd JdKh Qs7c 8h8c 2c5c QcTh JsAc 8d6h QdKs"));
  }

  @Test
  public void test_texas_holdem_1915_4dAdJsTcTd_2d4h_QhAh_As3d_6s8s_JhTs_Ac8c_8dJc_9s3c_Kh2s() {
    assertEquals(
      "6s8s 9s3c Kh2s 2d4h 8dJc Ac8c=As3d QhAh JhTs",
      Solver.process("texas-holdem 4dAdJsTcTd 2d4h QhAh As3d 6s8s JhTs Ac8c 8dJc 9s3c Kh2s"));
  }

  @Test
  public void test_texas_holdem_1916_3s6c7c8d9s_3d7h_5d5h_Ah8h_QhQd_Qc8s_Jc2c_Jd4d() {
    assertEquals(
      "Jc2c=Jd4d Qc8s Ah8h QhQd 3d7h 5d5h",
      Solver.process("texas-holdem 3s6c7c8d9s 3d7h 5d5h Ah8h QhQd Qc8s Jc2c Jd4d"));
  }

  @Test
  public void test_texas_holdem_1917_6dJdKdQcQd_6c5c_4h7s_Tc4d_Qs2s_2d9c() {
    assertEquals(
      "4h7s 6c5c Qs2s 2d9c Tc4d",
      Solver.process("texas-holdem 6dJdKdQcQd 6c5c 4h7s Tc4d Qs2s 2d9c"));
  }

  @Test
  public void test_texas_holdem_1918_6c6sKhQdTh_4h3d_8h7h_5dTd() {
    assertEquals(
      "4h3d=8h7h 5dTd",
      Solver.process("texas-holdem 6c6sKhQdTh 4h3d 8h7h 5dTd"));
  }

  @Test
  public void test_texas_holdem_1919_4h7cJcKdQc_7dAd_4s9h_5cAh_6hTd_Ac8d_4d8h() {
    assertEquals(
      "6hTd 5cAh Ac8d 4d8h=4s9h 7dAd",
      Solver.process("texas-holdem 4h7cJcKdQc 7dAd 4s9h 5cAh 6hTd Ac8d 4d8h"));
  }

  @Test
  public void test_texas_holdem_1920_4c4dAcKcTc_Jd7s_9sAs() {
    assertEquals(
      "Jd7s 9sAs",
      Solver.process("texas-holdem 4c4dAcKcTc Jd7s 9sAs"));
  }

  @Test
  public void test_texas_holdem_1921_5c8s9sJdJs_Tc9c_Jh7d_6hJc_Ac3d_4cAd_KcTd() {
    assertEquals(
      "KcTd 4cAd=Ac3d Tc9c 6hJc=Jh7d",
      Solver.process("texas-holdem 5c8s9sJdJs Tc9c Jh7d 6hJc Ac3d 4cAd KcTd"));
  }

  @Test
  public void test_texas_holdem_1922_3d6c7hAdTh_8s5h_4d3h_9h6d_8dJh_Ks8h_4cJd() {
    assertEquals(
      "8s5h 4cJd 8dJh Ks8h 4d3h 9h6d",
      Solver.process("texas-holdem 3d6c7hAdTh 8s5h 4d3h 9h6d 8dJh Ks8h 4cJd"));
  }

  @Test
  public void test_texas_holdem_1923_9dJcJhKdQd_8s5h_As8d_6d9s_AcTh_JsKc_4c5s_3d7s_9h2s() {
    assertEquals(
      "3d7s=4c5s=8s5h As8d 6d9s=9h2s AcTh JsKc",
      Solver.process("texas-holdem 9dJcJhKdQd 8s5h As8d 6d9s AcTh JsKc 4c5s 3d7s 9h2s"));
  }

  @Test
  public void test_texas_holdem_1924_8h9hJhJsTh_TsAh_7c3s_QhAd_Qc4h_As2d_2c4d_Ks9s_5dAc() {
    assertEquals(
      "2c4d 5dAc=As2d Ks9s 7c3s Qc4h TsAh QhAd",
      Solver.process("texas-holdem 8h9hJhJsTh TsAh 7c3s QhAd Qc4h As2d 2c4d Ks9s 5dAc"));
  }

  @Test
  public void test_texas_holdem_1925_2c3d5s7hQh_9h6d_2hTh_3cAh() {
    assertEquals(
      "9h6d 2hTh 3cAh",
      Solver.process("texas-holdem 2c3d5s7hQh 9h6d 2hTh 3cAh"));
  }

  @Test
  public void test_texas_holdem_1926_5s6s7h8cQc_2c9s_3h7s_6dTh_2s7c_JhKc_Td2h_AcJd_9d6c() {
    assertEquals(
      "Td2h JhKc AcJd 6dTh 2s7c=3h7s 2c9s=9d6c",
      Solver.process("texas-holdem 5s6s7h8cQc 2c9s 3h7s 6dTh 2s7c JhKc Td2h AcJd 9d6c"));
  }

  @Test
  public void test_texas_holdem_1927_2h3s4c5dQd_8sKc_AsJd_QsAd_8cJs_Th9c_7h5h() {
    assertEquals(
      "Th9c 8cJs 8sKc 7h5h AsJd=QsAd",
      Solver.process("texas-holdem 2h3s4c5dQd 8sKc AsJd QsAd 8cJs Th9c 7h5h"));
  }

  @Test
  public void test_texas_holdem_1928_5h7c8dJcTc_8hJh_3c2c_AcQh_5cJd_2dKd_Kh9c_ThKc() {
    assertEquals(
      "2dKd AcQh ThKc 5cJd 8hJh Kh9c 3c2c",
      Solver.process("texas-holdem 5h7c8dJcTc 8hJh 3c2c AcQh 5cJd 2dKd Kh9c ThKc"));
  }

  @Test
  public void test_texas_holdem_1929_4d7h9h9sQs_6c8c_5sTc_Ah3d_AdJd_7cAc_KcTh_7d5c_6h6s() {
    assertEquals(
      "6c8c 5sTc KcTh Ah3d AdJd 6h6s 7d5c 7cAc",
      Solver.process("texas-holdem 4d7h9h9sQs 6c8c 5sTc Ah3d AdJd 7cAc KcTh 7d5c 6h6s"));
  }

  @Test
  public void test_texas_holdem_1930_5h8c8hJcTc_Kc7c_6s8d_Kh7h_Ks6c_Th8s_AhAc_7dJd() {
    assertEquals(
      "Kh7h=Ks6c 7dJd AhAc 6s8d Kc7c Th8s",
      Solver.process("texas-holdem 5h8c8hJcTc Kc7c 6s8d Kh7h Ks6c Th8s AhAc 7dJd"));
  }

  @Test
  public void test_texas_holdem_1931_3c5h6c8h9d_JhJs_2h3h_6d2c_QhAc_3d4s_7cTs_9sKh() {
    assertEquals(
      "QhAc 2h3h=3d4s 6d2c 9sKh JhJs 7cTs",
      Solver.process("texas-holdem 3c5h6c8h9d JhJs 2h3h 6d2c QhAc 3d4s 7cTs 9sKh"));
  }

  @Test
  public void test_texas_holdem_1932_2s3h4s6c8s_6d7h_JsTs_9cKh_3dJd_6sQc_KcKd_Th8h() {
    assertEquals(
      "9cKh 3dJd 6d7h 6sQc Th8h KcKd JsTs",
      Solver.process("texas-holdem 2s3h4s6c8s 6d7h JsTs 9cKh 3dJd 6sQc KcKd Th8h"));
  }

  @Test
  public void test_texas_holdem_1933_2c3c4h5hJs_Th8h_4dQc_Kc3s_JcAs_8c2h() {
    assertEquals(
      "Th8h 8c2h Kc3s 4dQc JcAs",
      Solver.process("texas-holdem 2c3c4h5hJs Th8h 4dQc Kc3s JcAs 8c2h"));
  }

  @Test
  public void test_texas_holdem_1934_2s5h6h8dJh_6sKs_4d3h_4c7c_KdKc_7d2h_3c4s_5cTs() {
    assertEquals(
      "7d2h 5cTs 6sKs KdKc 3c4s=4d3h 4c7c",
      Solver.process("texas-holdem 2s5h6h8dJh 6sKs 4d3h 4c7c KdKc 7d2h 3c4s 5cTs"));
  }

  @Test
  public void test_texas_holdem_1935_2c9dAsQcTc_3h9c_TdKc_4hJs_2hKs_5hJc_8d5s() {
    assertEquals(
      "8d5s 4hJs=5hJc 2hKs 3h9c TdKc",
      Solver.process("texas-holdem 2c9dAsQcTc 3h9c TdKc 4hJs 2hKs 5hJc 8d5s"));
  }

  @Test
  public void test_texas_holdem_1936_3s8d8sAdKh_3hJh_TdAc() {
    assertEquals(
      "3hJh TdAc",
      Solver.process("texas-holdem 3s8d8sAdKh 3hJh TdAc"));
  }

  @Test
  public void test_texas_holdem_1937_5c9cAsJsQh_Ts6h_8h8c_Qs8d_5s2c_2dTh_4h7h_9d5h_Tc9s() {
    assertEquals(
      "4h7h 2dTh=Ts6h 5s2c 8h8c Tc9s Qs8d 9d5h",
      Solver.process("texas-holdem 5c9cAsJsQh Ts6h 8h8c Qs8d 5s2c 2dTh 4h7h 9d5h Tc9s"));
  }

  @Test
  public void test_texas_holdem_1938_2d6sAhKcTd_8s7d_9h4h_9s5h_4cAc_7hTc_9d6h_Kd7c_3d9c_6cKh() {
    assertEquals(
      "8s7d 3d9c=9h4h=9s5h 9d6h 7hTc Kd7c 4cAc 6cKh",
      Solver.process("texas-holdem 2d6sAhKcTd 8s7d 9h4h 9s5h 4cAc 7hTc 9d6h Kd7c 3d9c 6cKh"));
  }

  @Test
  public void test_texas_holdem_1939_3c7d8d8hQd_QsJh_5d7c_8sAd_8cQh_3hKh_9h6c() {
    assertEquals(
      "9h6c 3hKh 5d7c QsJh 8sAd 8cQh",
      Solver.process("texas-holdem 3c7d8d8hQd QsJh 5d7c 8sAd 8cQh 3hKh 9h6c"));
  }

  @Test
  public void test_texas_holdem_1940_5s6s9sJcTs_8s6c_AsQs_5h6h_2c8h_AcQc_9c4h_3sKs_7h2d() {
    assertEquals(
      "7h2d 2c8h AcQc 9c4h 5h6h 8s6c 3sKs AsQs",
      Solver.process("texas-holdem 5s6s9sJcTs 8s6c AsQs 5h6h 2c8h AcQc 9c4h 3sKs 7h2d"));
  }

  @Test
  public void test_texas_holdem_1941_4c6dAdJcKs_AsJs_5h6h_9dQh_JdAh_3s6c_7dKh_8h2d_5d8d() {
    assertEquals(
      "5d8d=8h2d 9dQh 3s6c=5h6h 7dKh AsJs=JdAh",
      Solver.process("texas-holdem 4c6dAdJcKs AsJs 5h6h 9dQh JdAh 3s6c 7dKh 8h2d 5d8d"));
  }

  @Test
  public void test_texas_holdem_1942_3c3d7cAhQs_5c3h_8d4h_5sTd_As7d_Jc8c() {
    assertEquals(
      "8d4h 5sTd Jc8c As7d 5c3h",
      Solver.process("texas-holdem 3c3d7cAhQs 5c3h 8d4h 5sTd As7d Jc8c"));
  }

  @Test
  public void test_texas_holdem_1943_3h5c6cKsTh_Td2d_AcTc_3c4h_6hKh_3d6s_4s4d_7hKd_9c8d() {
    assertEquals(
      "9c8d 3c4h 4s4d Td2d AcTc 7hKd 3d6s 6hKh",
      Solver.process("texas-holdem 3h5c6cKsTh Td2d AcTc 3c4h 6hKh 3d6s 4s4d 7hKd 9c8d"));
  }

  @Test
  public void test_texas_holdem_1944_2h3c4h5c6d_2cQc_3sQd_2s8c_5d7s_9c9d_TcKd_JsQh_Ts5s() {
    assertEquals(
      "2cQc=2s8c=3sQd=9c9d=JsQh=TcKd=Ts5s 5d7s",
      Solver.process("texas-holdem 2h3c4h5c6d 2cQc 3sQd 2s8c 5d7s 9c9d TcKd JsQh Ts5s"));
  }

  @Test
  public void test_texas_holdem_1945_4c7h7s9sAd_3d9d_6sQs_AcAs_7d7c_8d2d_Kc8c_JcKd() {
    assertEquals(
      "8d2d 6sQs Kc8c JcKd 3d9d AcAs 7d7c",
      Solver.process("texas-holdem 4c7h7s9sAd 3d9d 6sQs AcAs 7d7c 8d2d Kc8c JcKd"));
  }

  @Test
  public void test_texas_holdem_1946_2h3d5dKhQh_Ad7h_7d4d() {
    assertEquals(
      "7d4d Ad7h",
      Solver.process("texas-holdem 2h3d5dKhQh Ad7h 7d4d"));
  }

  @Test
  public void test_texas_holdem_1947_4c7dAhTdTh_9sAd_6sJs_7h3c() {
    assertEquals(
      "6sJs 7h3c 9sAd",
      Solver.process("texas-holdem 4c7dAhTdTh 9sAd 6sJs 7h3c"));
  }

  @Test
  public void test_texas_holdem_1948_2c7c8hAhTd_Qh6h_KcJs_7s4c_Jc3s_9d3d() {
    assertEquals(
      "9d3d Jc3s Qh6h KcJs 7s4c",
      Solver.process("texas-holdem 2c7c8hAhTd Qh6h KcJs 7s4c Jc3s 9d3d"));
  }

  @Test
  public void test_texas_holdem_1949_4s7s8c9dTs_Kh7d_7c5s_6cJd() {
    assertEquals(
      "7c5s Kh7d 6cJd",
      Solver.process("texas-holdem 4s7s8c9dTs Kh7d 7c5s 6cJd"));
  }

  @Test
  public void test_texas_holdem_1950_3s4d6s8cJc_KcJd_3hAh_9hQs_JsKh_3cAc_Tc4h_7sTd() {
    assertEquals(
      "7sTd 9hQs 3cAc=3hAh Tc4h JsKh=KcJd",
      Solver.process("texas-holdem 3s4d6s8cJc KcJd 3hAh 9hQs JsKh 3cAc Tc4h 7sTd"));
  }

  @Test
  public void test_texas_holdem_1951_4s6d6s9hAd_Qs9s_8cJs_Tc5d_3sAh_Kc9c_Jh2s_3h2d_Qc6h_5hAs() {
    assertEquals(
      "3h2d Tc5d 8cJs=Jh2s Kc9c=Qs9s 3sAh=5hAs Qc6h",
      Solver.process("texas-holdem 4s6d6s9hAd Qs9s 8cJs Tc5d 3sAh Kc9c Jh2s 3h2d Qc6h 5hAs"));
  }

  @Test
  public void test_texas_holdem_1952_2d5h6s8sKc_4sQs_Ah8h_Qc2c_3c7d_Qd4h() {
    assertEquals(
      "3c7d 4sQs=Qd4h Qc2c Ah8h",
      Solver.process("texas-holdem 2d5h6s8sKc 4sQs Ah8h Qc2c 3c7d Qd4h"));
  }

  @Test
  public void test_texas_holdem_1953_5s6s7h8sQh_7s6c_9s6d_Ah9h() {
    assertEquals(
      "7s6c 9s6d=Ah9h",
      Solver.process("texas-holdem 5s6s7h8sQh 7s6c 9s6d Ah9h"));
  }

  @Test
  public void test_texas_holdem_1954_2d4c5d5s6c_Kc2c_ThJd_5c2h_Jh8d_6d4s() {
    assertEquals(
      "Jh8d ThJd Kc2c 6d4s 5c2h",
      Solver.process("texas-holdem 2d4c5d5s6c Kc2c ThJd 5c2h Jh8d 6d4s"));
  }

  @Test
  public void test_texas_holdem_1955_AcJcJdKdQh_4c5c_3sTc_8h3d_Ks4s_Th6s_KcKh_6h4d_JsAs() {
    assertEquals(
      "4c5c=6h4d=8h3d Ks4s 3sTc=Th6s JsAs KcKh",
      Solver.process("texas-holdem AcJcJdKdQh 4c5c 3sTc 8h3d Ks4s Th6s KcKh 6h4d JsAs"));
  }

  @Test
  public void test_texas_holdem_1956_3d3s7sQhQs_Qd9c_7c6h_8s9s_Ks5h_Jd6c_7h2d() {
    assertEquals(
      "Jd6c Ks5h 7h2d 7c6h 8s9s Qd9c",
      Solver.process("texas-holdem 3d3s7sQhQs Qd9c 7c6h 8s9s Ks5h Jd6c 7h2d"));
  }

  @Test
  public void test_texas_holdem_1957_2s5c5d5h9s_9d8h_Ad3h_4c5s_4dJd_7c4h() {
    assertEquals(
      "7c4h 4dJd Ad3h 9d8h 4c5s",
      Solver.process("texas-holdem 2s5c5d5h9s 9d8h Ad3h 4c5s 4dJd 7c4h"));
  }

  @Test
  public void test_texas_holdem_1958_4cAsKcKdTh_6sAh_AcQh_4h9c_7d8c_9h5d_AdTs_Qs8h() {
    assertEquals(
      "7d8c 9h5d Qs8h 4h9c 6sAh=AdTs AcQh",
      Solver.process("texas-holdem 4cAsKcKdTh 6sAh AcQh 4h9c 7d8c 9h5d AdTs Qs8h"));
  }

  @Test
  public void test_texas_holdem_1959_3s4c5d6d9d_Js7c_Jd4h_8s9s_AcAd_7s3c_5c3h_AsQh_2cTd_Ks3d() {
    assertEquals(
      "AsQh Ks3d Jd4h 8s9s AcAd 5c3h 2cTd 7s3c=Js7c",
      Solver.process("texas-holdem 3s4c5d6d9d Js7c Jd4h 8s9s AcAd 7s3c 5c3h AsQh 2cTd Ks3d"));
  }

  @Test
  public void test_texas_holdem_1960_4s5h9hAsQs_5d7s_Qh4c_KsQc_6sTd_Qd8d_3s5s_JdAc() {
    assertEquals(
      "6sTd 5d7s Qd8d KsQc JdAc Qh4c 3s5s",
      Solver.process("texas-holdem 4s5h9hAsQs 5d7s Qh4c KsQc 6sTd Qd8d 3s5s JdAc"));
  }

  @Test
  public void test_texas_holdem_1961_2d5s7s8sQd_JdKh_9cQc_6sTs_Js2s_7dTh_Td8c() {
    assertEquals(
      "JdKh 7dTh Td8c 9cQc 6sTs Js2s",
      Solver.process("texas-holdem 2d5s7s8sQd JdKh 9cQc 6sTs Js2s 7dTh Td8c"));
  }

  @Test
  public void test_texas_holdem_1962_5d5h8d8sTh_7dJd_6d7s_4dAh_Jh9c_3sJc() {
    assertEquals(
      "6d7s 3sJc=7dJd=Jh9c 4dAh",
      Solver.process("texas-holdem 5d5h8d8sTh 7dJd 6d7s 4dAh Jh9c 3sJc"));
  }

  @Test
  public void test_texas_holdem_1963_2s5c5s7hQc_7s8d_4s5d_6h6d_6cAd() {
    assertEquals(
      "6cAd 6h6d 7s8d 4s5d",
      Solver.process("texas-holdem 2s5c5s7hQc 7s8d 4s5d 6h6d 6cAd"));
  }

  @Test
  public void test_texas_holdem_1964_3h3s4dJdKh_6hJh_ThAs_Js6d_Ks4s_Qd7c_2s5d_Qh8c_9s6c() {
    assertEquals(
      "2s5d 9s6c Qd7c=Qh8c ThAs 6hJh=Js6d Ks4s",
      Solver.process("texas-holdem 3h3s4dJdKh 6hJh ThAs Js6d Ks4s Qd7c 2s5d Qh8c 9s6c"));
  }

  @Test
  public void test_texas_holdem_1965_3d7c8d8sKc_6cKs_8c2c_6sQs_7s5s_6h7h_9d4s_9h2h_As6d_JsTc() {
    assertEquals(
      "9d4s=9h2h JsTc 6sQs As6d 6h7h=7s5s 6cKs 8c2c",
      Solver.process("texas-holdem 3d7c8d8sKc 6cKs 8c2c 6sQs 7s5s 6h7h 9d4s 9h2h As6d JsTc"));
  }

  @Test
  public void test_texas_holdem_1966_3c5d6c7dKs_Kh7c_TsQc_JdAs_8d4c_9c9s_7h5s_6s9h() {
    assertEquals(
      "TsQc JdAs 6s9h 9c9s 7h5s Kh7c 8d4c",
      Solver.process("texas-holdem 3c5d6c7dKs Kh7c TsQc JdAs 8d4c 9c9s 7h5s 6s9h"));
  }

  @Test
  public void test_texas_holdem_1967_3d3h7sTdTh_7dQd_4sQs_2h9c_8d2s_3s2d_6h8s_KcAs_AcQc_2c5s() {
    assertEquals(
      "2c5s 6h8s=8d2s 2h9c 4sQs AcQc=KcAs 7dQd 3s2d",
      Solver.process("texas-holdem 3d3h7sTdTh 7dQd 4sQs 2h9c 8d2s 3s2d 6h8s KcAs AcQc 2c5s"));
  }

  @Test
  public void test_texas_holdem_1968_2s8hKcQdQs_TcKh_JhJs() {
    assertEquals(
      "JhJs TcKh",
      Solver.process("texas-holdem 2s8hKcQdQs TcKh JhJs"));
  }

  @Test
  public void test_texas_holdem_1969_2s3h5s6hAs_AcJh_2c5h_2h7c_5dQd_KdKh_6dQh_6c7d_3cKs_4s9d() {
    assertEquals(
      "2h7c 3cKs 5dQd 6c7d 6dQh KdKh AcJh 2c5h 4s9d",
      Solver.process("texas-holdem 2s3h5s6hAs AcJh 2c5h 2h7c 5dQd KdKh 6dQh 6c7d 3cKs 4s9d"));
  }

  @Test
  public void test_texas_holdem_1970_3c5d7sKcTd_4c2d_8h9c_2c3h_Ac6h() {
    assertEquals(
      "4c2d 8h9c Ac6h 2c3h",
      Solver.process("texas-holdem 3c5d7sKcTd 4c2d 8h9c 2c3h Ac6h"));
  }

  @Test
  public void test_texas_holdem_1971_3c4h4s5cQs_6d7h_4d2h_TcJc_9c6h_Ts3h_3s5s_9sAc_Kd5d() {
    assertEquals(
      "9c6h TcJc 9sAc Ts3h 3s5s Kd5d 4d2h 6d7h",
      Solver.process("texas-holdem 3c4h4s5cQs 6d7h 4d2h TcJc 9c6h Ts3h 3s5s 9sAc Kd5d"));
  }

  @Test
  public void test_texas_holdem_1972_3c7d9cJdTs_4d4c_9s5s_6sAd_Ks7s_5dJh_Qs2c_As5h_2h3d() {
    assertEquals(
      "Qs2c 6sAd=As5h 2h3d 4d4c Ks7s 9s5s 5dJh",
      Solver.process("texas-holdem 3c7d9cJdTs 4d4c 9s5s 6sAd Ks7s 5dJh Qs2c As5h 2h3d"));
  }

  @Test
  public void test_texas_holdem_1973_2d5c7h9cTc_8hTh_5sQc_KdQd_8cKh() {
    assertEquals(
      "8cKh KdQd 5sQc 8hTh",
      Solver.process("texas-holdem 2d5c7h9cTc 8hTh 5sQc KdQd 8cKh"));
  }

  @Test
  public void test_texas_holdem_1974_2c7d9sQcQh_2h6h_7c9c_5cTh_3cKh() {
    assertEquals(
      "5cTh 3cKh 2h6h 7c9c",
      Solver.process("texas-holdem 2c7d9sQcQh 2h6h 7c9c 5cTh 3cKh"));
  }

  @Test
  public void test_texas_holdem_1975_5dAhKsTdTs_6h7h_7c2c_9d4h_Jc5c_3s3d_6cKc_8c6d_9hKd() {
    assertEquals(
      "6h7h=7c2c 8c6d 9d4h 3s3d Jc5c 6cKc=9hKd",
      Solver.process("texas-holdem 5dAhKsTdTs 6h7h 7c2c 9d4h Jc5c 3s3d 6cKc 8c6d 9hKd"));
  }

  @Test
  public void test_texas_holdem_1976_2d6cKdKsQd_2c9h_AdTh_Qc8s_Ts8h_4s8c_JsQs_5cAh_5sTc_3c9d() {
    assertEquals(
      "4s8c 3c9d 5sTc Ts8h 5cAh AdTh 2c9h Qc8s JsQs",
      Solver.process("texas-holdem 2d6cKdKsQd 2c9h AdTh Qc8s Ts8h 4s8c JsQs 5cAh 5sTc 3c9d"));
  }

  @Test
  public void test_texas_holdem_1977_4h5s6cKdQs_2hKs_Tc4c_3d7h_Jd3h_3cTd_3s8d_7d9c_2sJc() {
    assertEquals(
      "3s8d 7d9c 3cTd 2sJc=Jd3h Tc4c 2hKs 3d7h",
      Solver.process("texas-holdem 4h5s6cKdQs 2hKs Tc4c 3d7h Jd3h 3cTd 3s8d 7d9c 2sJc"));
  }

  @Test
  public void test_texas_holdem_1978_3h8cKcKdTd_Ts7h_5cAd_6c7c_7s6d_3cTc_Jc4c() {
    assertEquals(
      "6c7c=7s6d Jc4c 5cAd 3cTc=Ts7h",
      Solver.process("texas-holdem 3h8cKcKdTd Ts7h 5cAd 6c7c 7s6d 3cTc Jc4c"));
  }

  @Test
  public void test_texas_holdem_1979_2c8hJcKcQs_2h6h_9c6d() {
    assertEquals(
      "9c6d 2h6h",
      Solver.process("texas-holdem 2c8hJcKcQs 2h6h 9c6d"));
  }

  @Test
  public void test_texas_holdem_1980_2hJsKhTdTh_8c2s_6c9s_2cAd_3sTc_KsKd_JdJc_8d7s_9c7c_AcJh() {
    assertEquals(
      "8d7s 6c9s=9c7c 8c2s 2cAd AcJh 3sTc JdJc KsKd",
      Solver.process("texas-holdem 2hJsKhTdTh 8c2s 6c9s 2cAd 3sTc KsKd JdJc 8d7s 9c7c AcJh"));
  }

  @Test
  public void test_texas_holdem_1981_4h8hAsKcTs_8d2s_9dKd_AhQc_8c3h_3c4s_7h5c() {
    assertEquals(
      "7h5c 3c4s 8c3h=8d2s 9dKd AhQc",
      Solver.process("texas-holdem 4h8hAsKcTs 8d2s 9dKd AhQc 8c3h 3c4s 7h5c"));
  }

  @Test
  public void test_texas_holdem_1982_4d7cKcKhTh_Jd8h_5dQh_7sJs_Jh3h_Ah4c() {
    assertEquals(
      "Jh3h Jd8h 5dQh Ah4c 7sJs",
      Solver.process("texas-holdem 4d7cKcKhTh Jd8h 5dQh 7sJs Jh3h Ah4c"));
  }

  @Test
  public void test_texas_holdem_1983_2c6h6s7sAh_Js9c_As8s_JdTc_TdTs_Th2s_6cKc() {
    assertEquals(
      "Js9c JdTc Th2s TdTs As8s 6cKc",
      Solver.process("texas-holdem 2c6h6s7sAh Js9c As8s JdTc TdTs Th2s 6cKc"));
  }

  @Test
  public void test_texas_holdem_1984_2d2h2s9c9s_2cTd_6d9h_Kc4s() {
    assertEquals(
      "Kc4s 6d9h 2cTd",
      Solver.process("texas-holdem 2d2h2s9c9s 2cTd 6d9h Kc4s"));
  }

  @Test
  public void test_texas_holdem_1985_5d6s8dJdJh_8cTd_Kc6d_Th2c_Ts7c_QdKh_3h4d_7hAd_9h2s() {
    assertEquals(
      "3h4d 9h2s Th2c Ts7c QdKh 7hAd Kc6d 8cTd",
      Solver.process("texas-holdem 5d6s8dJdJh 8cTd Kc6d Th2c Ts7c QdKh 3h4d 7hAd 9h2s"));
  }

  @Test
  public void test_texas_holdem_1986_3s9cJcKcKs_QsAc_TdQh_KdTc() {
    assertEquals(
      "QsAc KdTc TdQh",
      Solver.process("texas-holdem 3s9cJcKcKs QsAc TdQh KdTc"));
  }

  @Test
  public void test_texas_holdem_1987_5d6h7d7sAd_6d5c_2h7c_Ts4s() {
    assertEquals(
      "Ts4s 6d5c 2h7c",
      Solver.process("texas-holdem 5d6h7d7sAd 6d5c 2h7c Ts4s"));
  }

  @Test
  public void test_texas_holdem_1988_2d5d8sKhTs_As6s_2hKd() {
    assertEquals(
      "As6s 2hKd",
      Solver.process("texas-holdem 2d5d8sKhTs As6s 2hKd"));
  }

  @Test
  public void test_texas_holdem_1989_4c5s7dKhQd_Qc9d_3sAd_Js6s_Ac4s_6dQs_5h9c_KcKd_7cJh() {
    assertEquals(
      "Js6s 3sAd Ac4s 5h9c 7cJh 6dQs Qc9d KcKd",
      Solver.process("texas-holdem 4c5s7dKhQd Qc9d 3sAd Js6s Ac4s 6dQs 5h9c KcKd 7cJh"));
  }

  @Test
  public void test_texas_holdem_1990_4d6c7cJdTs_9s7h_2s6s_2hKc_Ah3d_4c9h_9cTh_Qc6h_Js5c() {
    assertEquals(
      "2hKc Ah3d 4c9h 2s6s Qc6h 9s7h 9cTh Js5c",
      Solver.process("texas-holdem 4d6c7cJdTs 9s7h 2s6s 2hKc Ah3d 4c9h 9cTh Qc6h Js5c"));
  }

  @Test
  public void test_texas_holdem_1991_3h3s4c4h8d_JhKd_Qd4d_7h7s_7c3c() {
    assertEquals(
      "JhKd 7h7s 7c3c Qd4d",
      Solver.process("texas-holdem 3h3s4c4h8d JhKd Qd4d 7h7s 7c3c"));
  }

  @Test
  public void test_texas_holdem_1992_8d9cAcJcTh_Kh4s_6cKs_6hAd_Kc3c_Td7h_JsJd_3d7d_2h8h() {
    assertEquals(
      "6cKs=Kh4s 2h8h 6hAd JsJd 3d7d=Td7h Kc3c",
      Solver.process("texas-holdem 8d9cAcJcTh Kh4s 6cKs 6hAd Kc3c Td7h JsJd 3d7d 2h8h"));
  }

  @Test
  public void test_texas_holdem_1993_4c5c5sAhKs_3d9s_6s8h_6dJd() {
    assertEquals(
      "6s8h 3d9s 6dJd",
      Solver.process("texas-holdem 4c5c5sAhKs 3d9s 6s8h 6dJd"));
  }

  @Test
  public void test_texas_holdem_1994_5h6d8s9dJd_9c6h_TsJh_Kd7h() {
    assertEquals(
      "TsJh 9c6h Kd7h",
      Solver.process("texas-holdem 5h6d8s9dJd 9c6h TsJh Kd7h"));
  }

  @Test
  public void test_texas_holdem_1995_2d2h5dKhTs_AcTc_3s7s_Jh2c_QhTh_6sAd_4c2s() {
    assertEquals(
      "3s7s 6sAd QhTh AcTc 4c2s Jh2c",
      Solver.process("texas-holdem 2d2h5dKhTs AcTc 3s7s Jh2c QhTh 6sAd 4c2s"));
  }

  @Test
  public void test_texas_holdem_1996_2h3c3h9cKc_JhQd_4cKh() {
    assertEquals(
      "JhQd 4cKh",
      Solver.process("texas-holdem 2h3c3h9cKc JhQd 4cKh"));
  }

  @Test
  public void test_texas_holdem_1997_5hKsTdThTs_QsAd_5s9d_As4s_Kh8c_9sQd_3sJs() {
    assertEquals(
      "3sJs 9sQd As4s=QsAd 5s9d Kh8c",
      Solver.process("texas-holdem 5hKsTdThTs QsAd 5s9d As4s Kh8c 9sQd 3sJs"));
  }

  @Test
  public void test_texas_holdem_1998_2s4d6sJdTd_8h5c_7dKh_Ts6h_4s3h_KcKs_Tc9h() {
    assertEquals(
      "8h5c 7dKh 4s3h Tc9h KcKs Ts6h",
      Solver.process("texas-holdem 2s4d6sJdTd 8h5c 7dKh Ts6h 4s3h KcKs Tc9h"));
  }

  @Test
  public void test_texas_holdem_1999_3c6h7dJcQd_9hAs_8hJh_5dQc_2c6d_KsTd_JsTs_2d2h_6s5h_4dTc() {
    assertEquals(
      "4dTc KsTd 9hAs 2d2h 2c6d=6s5h 8hJh JsTs 5dQc",
      Solver.process("texas-holdem 3c6h7dJcQd 9hAs 8hJh 5dQc 2c6d KsTd JsTs 2d2h 6s5h 4dTc"));
  }

}
