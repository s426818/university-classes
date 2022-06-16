
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver3HiddenTest {


  @Test
  public void test_texas_holdem_750_2s4sJhJsQd_8cAh_6d3d_TsJc_4cQs_KcAc_7h6h() {
    assertEquals(
      "6d3d 7h6h 8cAh KcAc 4cQs TsJc",
      Solver.process("texas-holdem 2s4sJhJsQd 8cAh 6d3d TsJc 4cQs KcAc 7h6h"));
  }

  @Test
  public void test_texas_holdem_751_3d7h8hQsTd_3c4s_7s2h_JdJh_5s4h_Jc2s_6dQd() {
    assertEquals(
      "5s4h Jc2s 3c4s 7s2h JdJh 6dQd",
      Solver.process("texas-holdem 3d7h8hQsTd 3c4s 7s2h JdJh 5s4h Jc2s 6dQd"));
  }

  @Test
  public void test_texas_holdem_752_2c5d5sKcTh_AhQs_6h3d_5h5c_KsKh_2dAs_Kd9c_3s8h() {
    assertEquals(
      "6h3d 3s8h AhQs 2dAs Kd9c KsKh 5h5c",
      Solver.process("texas-holdem 2c5d5sKcTh AhQs 6h3d 5h5c KsKh 2dAs Kd9c 3s8h"));
  }

  @Test
  public void test_texas_holdem_753_2c5d7cQcTc_3s9d_3hAs() {
    assertEquals(
      "3s9d 3hAs",
      Solver.process("texas-holdem 2c5d7cQcTc 3s9d 3hAs"));
  }

  @Test
  public void test_texas_holdem_754_4h7d8hJcQd_KcTd_8d7s_5dQh_3dTs_5s4c_4sQs_Jh5h_7cAh_9c9h() {
    assertEquals(
      "3dTs KcTd 5s4c 7cAh 9c9h Jh5h 5dQh 8d7s 4sQs",
      Solver.process("texas-holdem 4h7d8hJcQd KcTd 8d7s 5dQh 3dTs 5s4c 4sQs Jh5h 7cAh 9c9h"));
  }

  @Test
  public void test_texas_holdem_755_5c7c7d9d9s_9c6s_8c5h_3c8d_3sQh_Ts2h_Th4h_5s8s() {
    assertEquals(
      "3c8d=5s8s=8c5h Th4h=Ts2h 3sQh 9c6s",
      Solver.process("texas-holdem 5c7c7d9d9s 9c6s 8c5h 3c8d 3sQh Ts2h Th4h 5s8s"));
  }

  @Test
  public void test_texas_holdem_756_6s8sAsJhKh_9sQs_2sJs() {
    assertEquals(
      "2sJs 9sQs",
      Solver.process("texas-holdem 6s8sAsJhKh 9sQs 2sJs"));
  }

  @Test
  public void test_texas_holdem_757_2c3s7hAcKd_7c9c_4d5d_3h3c_9dKh_Jc8d_8sJs() {
    assertEquals(
      "8sJs=Jc8d 7c9c 9dKh 3h3c 4d5d",
      Solver.process("texas-holdem 2c3s7hAcKd 7c9c 4d5d 3h3c 9dKh Jc8d 8sJs"));
  }

  @Test
  public void test_texas_holdem_758_6h8sJcQhTh_3d8c_Jd9s_6d9c_2d7s_8dJh() {
    assertEquals(
      "2d7s 3d8c 8dJh 6d9c=Jd9s",
      Solver.process("texas-holdem 6h8sJcQhTh 3d8c Jd9s 6d9c 2d7s 8dJh"));
  }

  @Test
  public void test_texas_holdem_759_2h6s8cKcKh_5d9h_QsTh_4s6d_3s9c_KdJc() {
    assertEquals(
      "3s9c=5d9h QsTh 4s6d KdJc",
      Solver.process("texas-holdem 2h6s8cKcKh 5d9h QsTh 4s6d 3s9c KdJc"));
  }

  @Test
  public void test_texas_holdem_760_4d5d5h8hAh_8sAs_AcJc_Qc3h_6c6s_Kc9c_5cQh_TdQd_Jd4h() {
    assertEquals(
      "Qc3h TdQd Kc9c Jd4h 6c6s AcJc 8sAs 5cQh",
      Solver.process("texas-holdem 4d5d5h8hAh 8sAs AcJc Qc3h 6c6s Kc9c 5cQh TdQd Jd4h"));
  }

  @Test
  public void test_texas_holdem_761_6sAsJhKcKs_TcQs_7h5s_ThTs_4sJd() {
    assertEquals(
      "7h5s ThTs 4sJd TcQs",
      Solver.process("texas-holdem 6sAsJhKcKs TcQs 7h5s ThTs 4sJd"));
  }

  @Test
  public void test_texas_holdem_762_3h4cQcTcTh_5d6h_Qh4d_Js2d_3s8d() {
    assertEquals(
      "5d6h Js2d 3s8d Qh4d",
      Solver.process("texas-holdem 3h4cQcTcTh 5d6h Qh4d Js2d 3s8d"));
  }

  @Test
  public void test_texas_holdem_763_4d4s7sQhQs_KhQd_As9d_4c2s_JcTd_9s2h_5s8d_9hAc_3s6h_Ad5d() {
    assertEquals(
      "3s6h 5s8d 9s2h JcTd 9hAc=Ad5d=As9d 4c2s KhQd",
      Solver.process("texas-holdem 4d4s7sQhQs KhQd As9d 4c2s JcTd 9s2h 5s8d 9hAc 3s6h Ad5d"));
  }

  @Test
  public void test_texas_holdem_764_2s6h7sQdTs_5s2d_3d4h_7dJs_9d8c() {
    assertEquals(
      "3d4h 5s2d 7dJs 9d8c",
      Solver.process("texas-holdem 2s6h7sQdTs 5s2d 3d4h 7dJs 9d8c"));
  }

  @Test
  public void test_texas_holdem_765_2s6d6h8hKh_8s4s_6sQs_7d3s_JdAs_4d4h_3hQh() {
    assertEquals(
      "7d3s JdAs 4d4h 8s4s 6sQs 3hQh",
      Solver.process("texas-holdem 2s6d6h8hKh 8s4s 6sQs 7d3s JdAs 4d4h 3hQh"));
  }

  @Test
  public void test_texas_holdem_766_2h3s5dAsQc_Td5c_2c9s_4dAd_Qd3c_8dAc() {
    assertEquals(
      "2c9s Td5c 8dAc Qd3c 4dAd",
      Solver.process("texas-holdem 2h3s5dAsQc Td5c 2c9s 4dAd Qd3c 8dAc"));
  }

  @Test
  public void test_texas_holdem_767_2h7d7hJhJs_JdKd_4d4h() {
    assertEquals(
      "4d4h JdKd",
      Solver.process("texas-holdem 2h7d7hJhJs JdKd 4d4h"));
  }

  @Test
  public void test_texas_holdem_768_6s7c7sJsTc_Jh5s_Kd5d_8c8h_Kc7d_ThQc_9d2c_As4c() {
    assertEquals(
      "9d2c Kd5d As4c 8c8h ThQc Jh5s Kc7d",
      Solver.process("texas-holdem 6s7c7sJsTc Jh5s Kd5d 8c8h Kc7d ThQc 9d2c As4c"));
  }

  @Test
  public void test_texas_holdem_769_3d3h5d8cAc_3c4h_9sJh_7cQh_Ts5s_TdQd_Tc6c_2c4d_7d5c_7hKd() {
    assertEquals(
      "Tc6c 9sJh 7cQh TdQd 7hKd 7d5c=Ts5s 3c4h 2c4d",
      Solver.process("texas-holdem 3d3h5d8cAc 3c4h 9sJh 7cQh Ts5s TdQd Tc6c 2c4d 7d5c 7hKd"));
  }

  @Test
  public void test_texas_holdem_770_4c6d7dTcTd_3s8h_2d9h_5h6c_6h7h_5sKs_4hAh_2hTh_3d4s() {
    assertEquals(
      "3s8h 2d9h 5sKs 3d4s 4hAh 5h6c 6h7h 2hTh",
      Solver.process("texas-holdem 4c6d7dTcTd 3s8h 2d9h 5h6c 6h7h 5sKs 4hAh 2hTh 3d4s"));
  }

  @Test
  public void test_texas_holdem_771_7c8s9hKdTd_Ts5c_2d7h_Ac7s_Qc2s() {
    assertEquals(
      "Qc2s 2d7h Ac7s Ts5c",
      Solver.process("texas-holdem 7c8s9hKdTd Ts5c 2d7h Ac7s Qc2s"));
  }

  @Test
  public void test_texas_holdem_772_2h3h7s8dQd_5sTh_9s5d_2c2s() {
    assertEquals(
      "9s5d 5sTh 2c2s",
      Solver.process("texas-holdem 2h3h7s8dQd 5sTh 9s5d 2c2s"));
  }

  @Test
  public void test_texas_holdem_773_3d3h5s7dKs_Ad4d_5cJh_9sAc() {
    assertEquals(
      "Ad4d 9sAc 5cJh",
      Solver.process("texas-holdem 3d3h5s7dKs Ad4d 5cJh 9sAc"));
  }

  @Test
  public void test_texas_holdem_774_2h3s7h7s9d_4cTs_2c4s_Ks5s() {
    assertEquals(
      "4cTs Ks5s 2c4s",
      Solver.process("texas-holdem 2h3s7h7s9d 4cTs 2c4s Ks5s"));
  }

  @Test
  public void test_texas_holdem_775_2h7s8s9hTd_AcQs_3d5d_7d4c_Qh8h() {
    assertEquals(
      "3d5d AcQs 7d4c Qh8h",
      Solver.process("texas-holdem 2h7s8s9hTd AcQs 3d5d 7d4c Qh8h"));
  }

  @Test
  public void test_texas_holdem_776_7s8s9hAdKc_4dTh_TcJs_8h4h_Jc6c_6s3d() {
    assertEquals(
      "6s3d 4dTh Jc6c 8h4h TcJs",
      Solver.process("texas-holdem 7s8s9hAdKc 4dTh TcJs 8h4h Jc6c 6s3d"));
  }

  @Test
  public void test_texas_holdem_777_3d4d5cQcQh_TsKs_3c3h() {
    assertEquals(
      "TsKs 3c3h",
      Solver.process("texas-holdem 3d4d5cQcQh TsKs 3c3h"));
  }

  @Test
  public void test_texas_holdem_778_2h3d3sTdTs_8dKc_6hKs_3h6d_7d7h_9d4s_8hKd_As5c_6c4d() {
    assertEquals(
      "6c4d 9d4s 6hKs=8dKc=8hKd As5c 7d7h 3h6d",
      Solver.process("texas-holdem 2h3d3sTdTs 8dKc 6hKs 3h6d 7d7h 9d4s 8hKd As5c 6c4d"));
  }

  @Test
  public void test_texas_holdem_779_2d7h7s8dQs_Td5d_Ts9h_6dJh_Jd6s_4sTc_AhKd_Kh4c() {
    assertEquals(
      "4sTc=Td5d Ts9h 6dJh=Jd6s Kh4c AhKd",
      Solver.process("texas-holdem 2d7h7s8dQs Td5d Ts9h 6dJh Jd6s 4sTc AhKd Kh4c"));
  }

  @Test
  public void test_texas_holdem_780_4h7sJsKhKs_6c5d_9s3s_QsAc_AsKd_8hQc_2s7d() {
    assertEquals(
      "6c5d 8hQc QsAc 2s7d AsKd 9s3s",
      Solver.process("texas-holdem 4h7sJsKhKs 6c5d 9s3s QsAc AsKd 8hQc 2s7d"));
  }

  @Test
  public void test_texas_holdem_781_2d3s6dKsTc_8c6h_4dAd_JhQh_9sQd_2hJd() {
    assertEquals(
      "9sQd JhQh 4dAd 2hJd 8c6h",
      Solver.process("texas-holdem 2d3s6dKsTc 8c6h 4dAd JhQh 9sQd 2hJd"));
  }

  @Test
  public void test_texas_holdem_782_2s5s9cQdTc_9s3d_7h8h_3sTh_2d6d_Qh8c() {
    assertEquals(
      "7h8h 2d6d 9s3d 3sTh Qh8c",
      Solver.process("texas-holdem 2s5s9cQdTc 9s3d 7h8h 3sTh 2d6d Qh8c"));
  }

  @Test
  public void test_texas_holdem_783_4s6c9cKcQh_Kd6d_QcAs_3h5c_Td4h_Ks5d_9sTs_Tc9h() {
    assertEquals(
      "3h5c Td4h 9sTs=Tc9h QcAs Ks5d Kd6d",
      Solver.process("texas-holdem 4s6c9cKcQh Kd6d QcAs 3h5c Td4h Ks5d 9sTs Tc9h"));
  }

  @Test
  public void test_texas_holdem_784_3h5h9hKhQc_Kd5c_Js3d_8h7s_AdJd_9dQd() {
    assertEquals(
      "AdJd Js3d 9dQd Kd5c 8h7s",
      Solver.process("texas-holdem 3h5h9hKhQc Kd5c Js3d 8h7s AdJd 9dQd"));
  }

  @Test
  public void test_texas_holdem_785_2d6c6d9cJd_7h6h_2c4c_8sKs_5s2h_4d3c() {
    assertEquals(
      "4d3c 8sKs 2c4c=5s2h 7h6h",
      Solver.process("texas-holdem 2d6c6d9cJd 7h6h 2c4c 8sKs 5s2h 4d3c"));
  }

  @Test
  public void test_texas_holdem_786_2s7sJcKdTc_7c2c_Qh2d_Td8c_Ks6h_Ah8d() {
    assertEquals(
      "Ah8d Qh2d Td8c Ks6h 7c2c",
      Solver.process("texas-holdem 2s7sJcKdTc 7c2c Qh2d Td8c Ks6h Ah8d"));
  }

  @Test
  public void test_texas_holdem_787_7d7s8hJsKs_8dQs_9h7h_2h5c_Qh9c_4d4c_3hAh_5dTd_9dAc() {
    assertEquals(
      "2h5c 5dTd Qh9c 3hAh=9dAc 4d4c 8dQs 9h7h",
      Solver.process("texas-holdem 7d7s8hJsKs 8dQs 9h7h 2h5c Qh9c 4d4c 3hAh 5dTd 9dAc"));
  }

  @Test
  public void test_texas_holdem_788_2s3d4c5s8h_Th2h_7s9d_KcAd_QsJd_6hAs_Td6d() {
    assertEquals(
      "7s9d QsJd Th2h KcAd 6hAs=Td6d",
      Solver.process("texas-holdem 2s3d4c5s8h Th2h 7s9d KcAd QsJd 6hAs Td6d"));
  }

  @Test
  public void test_texas_holdem_789_2h4s8d8hAs_2c7c_8s5c_2s6c_7s5d_3h8c_5hJc_9h7h_Ad3s_2d6s() {
    assertEquals(
      "7s5d 9h7h 5hJc 2c7c=2d6s=2s6c Ad3s 3h8c 8s5c",
      Solver.process("texas-holdem 2h4s8d8hAs 2c7c 8s5c 2s6c 7s5d 3h8c 5hJc 9h7h Ad3s 2d6s"));
  }

  @Test
  public void test_texas_holdem_790_7h9dJdJhQd_9hKc_3dTs_Qh8h() {
    assertEquals(
      "3dTs 9hKc Qh8h",
      Solver.process("texas-holdem 7h9dJdJhQd 9hKc 3dTs Qh8h"));
  }

  @Test
  public void test_texas_holdem_791_2s4d8cKcQd_2dAs_TcJh_Ts8s() {
    assertEquals(
      "TcJh 2dAs Ts8s",
      Solver.process("texas-holdem 2s4d8cKcQd 2dAs TcJh Ts8s"));
  }

  @Test
  public void test_texas_holdem_792_6d7hAcJsKh_2dJd_As8s_4h8c() {
    assertEquals(
      "4h8c 2dJd As8s",
      Solver.process("texas-holdem 6d7hAcJsKh 2dJd As8s 4h8c"));
  }

  @Test
  public void test_texas_holdem_793_3d4d6d8c8h_Qd3s_Ks2s_Th2c_JhKc_Jc4h_TsQs_2d2h_TcAs() {
    assertEquals(
      "Th2c TsQs Ks2s JhKc TcAs 2d2h Qd3s Jc4h",
      Solver.process("texas-holdem 3d4d6d8c8h Qd3s Ks2s Th2c JhKc Jc4h TsQs 2d2h TcAs"));
  }

  @Test
  public void test_texas_holdem_794_4c5s8sJcJs_Tc2d_4dKc_Qs3c_9sAc_5dAs_3d7s_Ts3h() {
    assertEquals(
      "3d7s Tc2d=Ts3h Qs3c 9sAc 4dKc 5dAs",
      Solver.process("texas-holdem 4c5s8sJcJs Tc2d 4dKc Qs3c 9sAc 5dAs 3d7s Ts3h"));
  }

  @Test
  public void test_texas_holdem_795_2s4h5d8d8s_8hTd_9s5s_JcJs_7d7h_5cAs_Qd3c() {
    assertEquals(
      "Qd3c 9s5s 5cAs 7d7h JcJs 8hTd",
      Solver.process("texas-holdem 2s4h5d8d8s 8hTd 9s5s JcJs 7d7h 5cAs Qd3c"));
  }

  @Test
  public void test_texas_holdem_796_2c4s9cAdJd_Qs8d_8c9s_2dJh_6dTs_2hAc_4cKd_AhTc() {
    assertEquals(
      "6dTs Qs8d 4cKd 8c9s AhTc 2dJh 2hAc",
      Solver.process("texas-holdem 2c4s9cAdJd Qs8d 8c9s 2dJh 6dTs 2hAc 4cKd AhTc"));
  }

  @Test
  public void test_texas_holdem_797_5h6c7d8hJc_Ks4d_4h4c_2s8d_Qs4s_2h2c_ThQc_Qd8s_5dJd() {
    assertEquals(
      "ThQc 2h2c 2s8d Qd8s 5dJd 4h4c=Ks4d=Qs4s",
      Solver.process("texas-holdem 5h6c7d8hJc Ks4d 4h4c 2s8d Qs4s 2h2c ThQc Qd8s 5dJd"));
  }

  @Test
  public void test_texas_holdem_798_3c6c9dAsQd_ThJc_5d2d_3h5s_9h3s_9c4h_QhTc_TsQc() {
    assertEquals(
      "5d2d ThJc 3h5s 9c4h QhTc=TsQc 9h3s",
      Solver.process("texas-holdem 3c6c9dAsQd ThJc 5d2d 3h5s 9h3s 9c4h QhTc TsQc"));
  }

  @Test
  public void test_texas_holdem_799_3s5d6s7sKs_JhQs_8s2s_4s6d_2cQh_3d4h_JdAh_Td9h() {
    assertEquals(
      "Td9h 2cQh JdAh 3d4h 4s6d 8s2s JhQs",
      Solver.process("texas-holdem 3s5d6s7sKs JhQs 8s2s 4s6d 2cQh 3d4h JdAh Td9h"));
  }

  @Test
  public void test_texas_holdem_800_2c3hJdQcQd_7dTs_4s5c_8h2s_6h2h() {
    assertEquals(
      "4s5c 7dTs 6h2h=8h2s",
      Solver.process("texas-holdem 2c3hJdQcQd 7dTs 4s5c 8h2s 6h2h"));
  }

  @Test
  public void test_texas_holdem_801_2h3c8c9dTh_Qc2d_2c3d() {
    assertEquals(
      "Qc2d 2c3d",
      Solver.process("texas-holdem 2h3c8c9dTh Qc2d 2c3d"));
  }

  @Test
  public void test_texas_holdem_802_AsJdJhQcTd_4h2c_Qs5h_Ts7h_8d6c_9d8s_AhKd_9hJc_Ks8c() {
    assertEquals(
      "4h2c=8d6c Ts7h Qs5h 9hJc 9d8s AhKd=Ks8c",
      Solver.process("texas-holdem AsJdJhQcTd 4h2c Qs5h Ts7h 8d6c 9d8s AhKd 9hJc Ks8c"));
  }

  @Test
  public void test_texas_holdem_803_4hQhQsTdTh_4c2s_7sAh_7cJs_6dQc_6c9d_5c4d_7hAd() {
    assertEquals(
      "4c2s 5c4d 6c9d 7cJs 7hAd=7sAh 6dQc",
      Solver.process("texas-holdem 4hQhQsTdTh 4c2s 7sAh 7cJs 6dQc 6c9d 5c4d 7hAd"));
  }

  @Test
  public void test_texas_holdem_804_2c2h5c5d6h_Qc5s_Ts3d_Jh9d_7s4c_2sJd_3h8s_Ad7c_AcQd_9c8c() {
    assertEquals(
      "7s4c 3h8s 9c8c Ts3d Jh9d AcQd=Ad7c 2sJd Qc5s",
      Solver.process("texas-holdem 2c2h5c5d6h Qc5s Ts3d Jh9d 7s4c 2sJd 3h8s Ad7c AcQd 9c8c"));
  }

  @Test
  public void test_texas_holdem_805_2c2h8hQdTc_4sAd_QhKc_6d3h_6h3d_Ac5d_9sKs() {
    assertEquals(
      "6d3h=6h3d 9sKs 4sAd=Ac5d QhKc",
      Solver.process("texas-holdem 2c2h8hQdTc 4sAd QhKc 6d3h 6h3d Ac5d 9sKs"));
  }

  @Test
  public void test_texas_holdem_806_3h4d7h9dKc_Qs6c_2s9c_7sAd_8dKh() {
    assertEquals(
      "Qs6c 7sAd 2s9c 8dKh",
      Solver.process("texas-holdem 3h4d7h9dKc Qs6c 2s9c 7sAd 8dKh"));
  }

  @Test
  public void test_texas_holdem_807_2s5s8hQhQs_3hTc_5cAc_2h7c() {
    assertEquals(
      "3hTc 2h7c 5cAc",
      Solver.process("texas-holdem 2s5s8hQhQs 3hTc 5cAc 2h7c"));
  }

  @Test
  public void test_texas_holdem_808_4h5c6hQcTs_3cAc_7c8d() {
    assertEquals(
      "3cAc 7c8d",
      Solver.process("texas-holdem 4h5c6hQcTs 3cAc 7c8d"));
  }

  @Test
  public void test_texas_holdem_809_4cJcJsQsTs_KhAh_6d9c_Kc9s_Qd8c_4s8h_Ad5d() {
    assertEquals(
      "6d9c Ad5d 4s8h Qd8c Kc9s KhAh",
      Solver.process("texas-holdem 4cJcJsQsTs KhAh 6d9c Kc9s Qd8c 4s8h Ad5d"));
  }

  @Test
  public void test_texas_holdem_810_2s4d5hJhKd_8hKs_Ts6h_6d7h_Td6s_Qh7s_8d7d_4cQc() {
    assertEquals(
      "6d7h 8d7d Td6s=Ts6h Qh7s 4cQc 8hKs",
      Solver.process("texas-holdem 2s4d5hJhKd 8hKs Ts6h 6d7h Td6s Qh7s 8d7d 4cQc"));
  }

  @Test
  public void test_texas_holdem_811_2s5sAdQhTd_2c7s_9c8d_6cQd_7h9d() {
    assertEquals(
      "7h9d 9c8d 2c7s 6cQd",
      Solver.process("texas-holdem 2s5sAdQhTd 2c7s 9c8d 6cQd 7h9d"));
  }

  @Test
  public void test_texas_holdem_812_3c5c9hAhQh_2s9s_7hTd_KsJs_6hAc_Ad8h_Kh4d() {
    assertEquals(
      "7hTd Kh4d KsJs 2s9s 6hAc Ad8h",
      Solver.process("texas-holdem 3c5c9hAhQh 2s9s 7hTd KsJs 6hAc Ad8h Kh4d"));
  }

  @Test
  public void test_texas_holdem_813_3h5sAcKhQh_2c7c_9h8s_JdKs_KdAs() {
    assertEquals(
      "2c7c 9h8s JdKs KdAs",
      Solver.process("texas-holdem 3h5sAcKhQh 2c7c 9h8s JdKs KdAs"));
  }

  @Test
  public void test_texas_holdem_814_2h6sAsQcQh_3d6c_5d9s_Kc2c_8hJc() {
    assertEquals(
      "5d9s 8hJc Kc2c 3d6c",
      Solver.process("texas-holdem 2h6sAsQcQh 3d6c 5d9s Kc2c 8hJc"));
  }

  @Test
  public void test_texas_holdem_815_2d4c5hAsQc_3s8h_3h5d_QdJs_Th3c_8s7h_9hJh_7dTs_Tc9s() {
    assertEquals(
      "8s7h 7dTs Tc9s 9hJh QdJs 3h5d=3s8h=Th3c",
      Solver.process("texas-holdem 2d4c5hAsQc 3s8h 3h5d QdJs Th3c 8s7h 9hJh 7dTs Tc9s"));
  }

  @Test
  public void test_texas_holdem_816_2d4d4s8cAc_Tc6c_6h3h_Ad2h() {
    assertEquals(
      "6h3h Tc6c Ad2h",
      Solver.process("texas-holdem 2d4d4s8cAc Tc6c 6h3h Ad2h"));
  }

  @Test
  public void test_texas_holdem_817_5c5hAcJdTc_7h9c_9sKh_3hAh_QdQs_Ad2s_Kc3s_6h4c_Qc6s() {
    assertEquals(
      "6h4c=7h9c Qc6s 9sKh=Kc3s QdQs 3hAh=Ad2s",
      Solver.process("texas-holdem 5c5hAcJdTc 7h9c 9sKh 3hAh QdQs Ad2s Kc3s 6h4c Qc6s"));
  }

  @Test
  public void test_texas_holdem_818_6h8c8hKsQh_Th9s_4c2h_Kd8s_3hJd_Qd5d() {
    assertEquals(
      "4c2h Th9s 3hJd Qd5d Kd8s",
      Solver.process("texas-holdem 6h8c8hKsQh Th9s 4c2h Kd8s 3hJd Qd5d"));
  }

  @Test
  public void test_texas_holdem_819_4c4h8dQcQs_2hKh_QdKc_2s6s_4sJs_QhKs_Ac7d_5s7c_Ah3s() {
    assertEquals(
      "2s6s=5s7c 2hKh Ac7d=Ah3s 4sJs QdKc=QhKs",
      Solver.process("texas-holdem 4c4h8dQcQs 2hKh QdKc 2s6s 4sJs QhKs Ac7d 5s7c Ah3s"));
  }

  @Test
  public void test_texas_holdem_820_6c7d8d9sTs_6d9h_As9c_Jc5h_KcKd_8hTc() {
    assertEquals(
      "6d9h=8hTc=As9c=KcKd Jc5h",
      Solver.process("texas-holdem 6c7d8d9sTs 6d9h As9c Jc5h KcKd 8hTc"));
  }

  @Test
  public void test_texas_holdem_821_3c5s7c9dTd_Kc9h_9sJs() {
    assertEquals(
      "9sJs Kc9h",
      Solver.process("texas-holdem 3c5s7c9dTd Kc9h 9sJs"));
  }

  @Test
  public void test_texas_holdem_822_2h5d6c7cAs_QhQd_Ad5c_9s6s_Jd4d() {
    assertEquals(
      "Jd4d 9s6s QhQd Ad5c",
      Solver.process("texas-holdem 2h5d6c7cAs QhQd Ad5c 9s6s Jd4d"));
  }

  @Test
  public void test_texas_holdem_823_3d4dAcQcTd_7d7c_KsJd_3h2s_2d9d_9s8d_Qh6s_Th4h_3c8h() {
    assertEquals(
      "9s8d 3c8h=3h2s 7d7c Qh6s Th4h KsJd 2d9d",
      Solver.process("texas-holdem 3d4dAcQcTd 7d7c KsJd 3h2s 2d9d 9s8d Qh6s Th4h 3c8h"));
  }

  @Test
  public void test_texas_holdem_824_6c8hJdKcKd_9hAc_Ts5d_Kh2c_3dAd_KsAs() {
    assertEquals(
      "Ts5d 3dAd 9hAc Kh2c KsAs",
      Solver.process("texas-holdem 6c8hJdKcKd 9hAc Ts5d Kh2c 3dAd KsAs"));
  }

  @Test
  public void test_texas_holdem_825_2h6c8c8dQh_2sQd_Kc3s_3c7c_Ts5d_ThKs_Tc2d_JdKh_Qs6h_7d4d() {
    assertEquals(
      "3c7c=7d4d Ts5d Kc3s ThKs JdKh Tc2d 2sQd=Qs6h",
      Solver.process("texas-holdem 2h6c8c8dQh 2sQd Kc3s 3c7c Ts5d ThKs Tc2d JdKh Qs6h 7d4d"));
  }

  @Test
  public void test_texas_holdem_826_2h3h4d5c6h_9dQs_2cAc_Ad7c_3sAh_Ts4s_QhJd_2s6s_Js9s_8s4c() {
    assertEquals(
      "2cAc=2s6s=3sAh=8s4c=9dQs=Js9s=QhJd=Ts4s Ad7c",
      Solver.process("texas-holdem 2h3h4d5c6h 9dQs 2cAc Ad7c 3sAh Ts4s QhJd 2s6s Js9s 8s4c"));
  }

  @Test
  public void test_texas_holdem_827_3c4d7h7sTs_AhTc_6dAs_Kd5h_6sAc_5d2d_4hQd() {
    assertEquals(
      "5d2d Kd5h 6dAs=6sAc 4hQd AhTc",
      Solver.process("texas-holdem 3c4d7h7sTs AhTc 6dAs Kd5h 6sAc 5d2d 4hQd"));
  }

  @Test
  public void test_texas_holdem_828_2s3cAdAhKs_9c4c_7s5c_5dQs_3d7c_JhQh_8h4s() {
    assertEquals(
      "7s5c 8h4s 9c4c 5dQs JhQh 3d7c",
      Solver.process("texas-holdem 2s3cAdAhKs 9c4c 7s5c 5dQs 3d7c JhQh 8h4s"));
  }

  @Test
  public void test_texas_holdem_829_6hAdJcKcTd_3c9d_Jd2d_KdTs_2s2h_5d8d_JhKh() {
    assertEquals(
      "5d8d 3c9d 2s2h Jd2d KdTs JhKh",
      Solver.process("texas-holdem 6hAdJcKcTd 3c9d Jd2d KdTs 2s2h 5d8d JhKh"));
  }

  @Test
  public void test_texas_holdem_830_5s7s9dKcQh_9h3d_3s9c_Ks6h() {
    assertEquals(
      "3s9c=9h3d Ks6h",
      Solver.process("texas-holdem 5s7s9dKcQh 9h3d 3s9c Ks6h"));
  }

  @Test
  public void test_texas_holdem_831_4d8h9hJhTs_3h3d_2dKh_6s8d_Ks2s_JcQc() {
    assertEquals(
      "2dKh=Ks2s 3h3d 6s8d JcQc",
      Solver.process("texas-holdem 4d8h9hJhTs 3h3d 2dKh 6s8d Ks2s JcQc"));
  }

  @Test
  public void test_texas_holdem_832_2c9hJsKdQc_Th8h_2h7s_As8d() {
    assertEquals(
      "As8d 2h7s Th8h",
      Solver.process("texas-holdem 2c9hJsKdQc Th8h 2h7s As8d"));
  }

  @Test
  public void test_texas_holdem_833_3s5c8sJdJh_7hKd_2d9s_6s9c_8h5d_AdTs() {
    assertEquals(
      "2d9s 6s9c 7hKd AdTs 8h5d",
      Solver.process("texas-holdem 3s5c8sJdJh 7hKd 2d9s 6s9c 8h5d AdTs"));
  }

  @Test
  public void test_texas_holdem_834_4s5h5s9hTs_Ad6d_9d7h_AcQd_KcTd_3d8s_Jd2h_Qc7s_3c8h_Kh6s() {
    assertEquals(
      "3c8h=3d8s Jd2h Qc7s Kh6s Ad6d AcQd 9d7h KcTd",
      Solver.process("texas-holdem 4s5h5s9hTs Ad6d 9d7h AcQd KcTd 3d8s Jd2h Qc7s 3c8h Kh6s"));
  }

  @Test
  public void test_texas_holdem_835_3d3s8s9dQd_5hJh_Ac2d_7c6d_6s5d_4dTs_AhQs_Qh8c_8dKh_2c6c() {
    assertEquals(
      "2c6c=6s5d=7c6d 4dTs 5hJh Ac2d 8dKh AhQs Qh8c",
      Solver.process("texas-holdem 3d3s8s9dQd 5hJh Ac2d 7c6d 6s5d 4dTs AhQs Qh8c 8dKh 2c6c"));
  }

  @Test
  public void test_texas_holdem_836_6h7d8h9hQh_ThTs_KsAs_8cAc_3sAd_3h4c_2d4h() {
    assertEquals(
      "3sAd KsAs 8cAc 3h4c 2d4h ThTs",
      Solver.process("texas-holdem 6h7d8h9hQh ThTs KsAs 8cAc 3sAd 3h4c 2d4h"));
  }

  @Test
  public void test_texas_holdem_837_3d6s7dThTs_KcQh_Qd2h_KhQs_2s8h_9hJs() {
    assertEquals(
      "2s8h 9hJs Qd2h KcQh=KhQs",
      Solver.process("texas-holdem 3d6s7dThTs KcQh Qd2h KhQs 2s8h 9hJs"));
  }

  @Test
  public void test_texas_holdem_838_2h5h6sTcTs_9h3c_8cQc_AdTd_3s7s_Kc2d_9sKs_2cQd_7c8d_4c6c() {
    assertEquals(
      "3s7s 7c8d 9h3c 8cQc 9sKs 2cQd Kc2d 4c6c AdTd",
      Solver.process("texas-holdem 2h5h6sTcTs 9h3c 8cQc AdTd 3s7s Kc2d 9sKs 2cQd 7c8d 4c6c"));
  }

  @Test
  public void test_texas_holdem_839_3d6d7hKdQs_Th4s_5c7s_2s7d_9d4d_JsTd_6hAs_4cJd_KcQh() {
    assertEquals(
      "Th4s 4cJd JsTd 6hAs 2s7d=5c7s KcQh 9d4d",
      Solver.process("texas-holdem 3d6d7hKdQs Th4s 5c7s 2s7d 9d4d JsTd 6hAs 4cJd KcQh"));
  }

  @Test
  public void test_texas_holdem_840_2h2s3d3sAc_Kh4s_7dTs() {
    assertEquals(
      "7dTs=Kh4s",
      Solver.process("texas-holdem 2h2s3d3sAc Kh4s 7dTs"));
  }

  @Test
  public void test_texas_holdem_841_4c8h9c9hQs_7h6h_8sKd_Js2c() {
    assertEquals(
      "7h6h Js2c 8sKd",
      Solver.process("texas-holdem 4c8h9c9hQs 7h6h 8sKd Js2c"));
  }

  @Test
  public void test_texas_holdem_842_5h6hKcQdQh_7h4h_7s8c_4c4d_4sJh_2h9h_6sKs_3dQs() {
    assertEquals(
      "7s8c 4sJh 4c4d 6sKs 3dQs 7h4h 2h9h",
      Solver.process("texas-holdem 5h6hKcQdQh 7h4h 7s8c 4c4d 4sJh 2h9h 6sKs 3dQs"));
  }

  @Test
  public void test_texas_holdem_843_4c9dAhJsKd_6hKh_8d3d_Ts5d() {
    assertEquals(
      "8d3d Ts5d 6hKh",
      Solver.process("texas-holdem 4c9dAhJsKd 6hKh 8d3d Ts5d"));
  }

  @Test
  public void test_texas_holdem_844_2s8dAdKhTh_2d6d_5h9s_5c8h_Jc3h_QcKc() {
    assertEquals(
      "5h9s Jc3h 2d6d 5c8h QcKc",
      Solver.process("texas-holdem 2s8dAdKhTh 2d6d 5h9s 5c8h Jc3h QcKc"));
  }

  @Test
  public void test_texas_holdem_845_2d4s5d7sQs_JsKh_JhTc_AcQd_Th8d_Qc7d_3c5h() {
    assertEquals(
      "Th8d JhTc JsKh 3c5h AcQd Qc7d",
      Solver.process("texas-holdem 2d4s5d7sQs JsKh JhTc AcQd Th8d Qc7d 3c5h"));
  }

  @Test
  public void test_texas_holdem_846_6c6s7cAdKd_5s9s_8hTs() {
    assertEquals(
      "5s9s 8hTs",
      Solver.process("texas-holdem 6c6s7cAdKd 5s9s 8hTs"));
  }

  @Test
  public void test_texas_holdem_847_6d8cJdKhTc_QdTh_9d6h_5s6c_4c3h() {
    assertEquals(
      "4c3h 5s6c=9d6h QdTh",
      Solver.process("texas-holdem 6d8cJdKhTc QdTh 9d6h 5s6c 4c3h"));
  }

  @Test
  public void test_texas_holdem_848_5h8d9dQdQs_Kc9s_3h2c_AsQh() {
    assertEquals(
      "3h2c Kc9s AsQh",
      Solver.process("texas-holdem 5h8d9dQdQs Kc9s 3h2c AsQh"));
  }

  @Test
  public void test_texas_holdem_849_8h9c9dAdTs_9h3c_KhQh_5d3h_8sTh() {
    assertEquals(
      "5d3h KhQh 8sTh 9h3c",
      Solver.process("texas-holdem 8h9c9dAdTs 9h3c KhQh 5d3h 8sTh"));
  }

  @Test
  public void test_texas_holdem_850_4c4d4h5h5s_Kd6s_QcTc_KsTd_8s7c_AdJc_9h9d_Kh8h() {
    assertEquals(
      "8s7c=AdJc=Kd6s=Kh8h=KsTd=QcTc 9h9d",
      Solver.process("texas-holdem 4c4d4h5h5s Kd6s QcTc KsTd 8s7c AdJc 9h9d Kh8h"));
  }

  @Test
  public void test_texas_holdem_851_4c5h8h9cTd_8d3d_4hAs_8c2h_Kd4d_Js7c_Tc3s_9sJh() {
    assertEquals(
      "Kd4d 4hAs 8c2h=8d3d 9sJh Tc3s Js7c",
      Solver.process("texas-holdem 4c5h8h9cTd 8d3d 4hAs 8c2h Kd4d Js7c Tc3s 9sJh"));
  }

  @Test
  public void test_texas_holdem_852_4c4s5d9hAh_Jd2c_5h3c_7sQc_TsJh_Th8d_9s5c() {
    assertEquals(
      "Th8d Jd2c TsJh 7sQc 5h3c 9s5c",
      Solver.process("texas-holdem 4c4s5d9hAh Jd2c 5h3c 7sQc TsJh Th8d 9s5c"));
  }

  @Test
  public void test_texas_holdem_853_2h4c4d6hTd_Jh4h_8cKc_5cAd_AsTc() {
    assertEquals(
      "8cKc 5cAd AsTc Jh4h",
      Solver.process("texas-holdem 2h4c4d6hTd Jh4h 8cKc 5cAd AsTc"));
  }

  @Test
  public void test_texas_holdem_854_4s7c7s8c8h_Ad2c_2d6h_5d2s_5c9s() {
    assertEquals(
      "5d2s 2d6h 5c9s Ad2c",
      Solver.process("texas-holdem 4s7c7s8c8h Ad2c 2d6h 5d2s 5c9s"));
  }

  @Test
  public void test_texas_holdem_855_4d5c5d9cAs_Ah9s_4c6c_Qc7h_Th9h_8c5s_AcKc_5h7s_Qs7c_8sTc() {
    assertEquals(
      "8sTc Qc7h=Qs7c 4c6c Th9h AcKc Ah9s 5h7s=8c5s",
      Solver.process("texas-holdem 4d5c5d9cAs Ah9s 4c6c Qc7h Th9h 8c5s AcKc 5h7s Qs7c 8sTc"));
  }

  @Test
  public void test_texas_holdem_856_4c9cJdKdKs_8hJc_4sJs() {
    assertEquals(
      "4sJs=8hJc",
      Solver.process("texas-holdem 4c9cJdKdKs 8hJc 4sJs"));
  }

  @Test
  public void test_texas_holdem_857_3h5d6h6s7c_Jd5s_KdKs_QhKc_4hQc_3c8s_Th7d_5c9c() {
    assertEquals(
      "QhKc 3c8s 5c9c Jd5s Th7d KdKs 4hQc",
      Solver.process("texas-holdem 3h5d6h6s7c Jd5s KdKs QhKc 4hQc 3c8s Th7d 5c9c"));
  }

  @Test
  public void test_texas_holdem_858_4h8dJdJhTc_5d3d_TsQs_4s2h() {
    assertEquals(
      "5d3d 4s2h TsQs",
      Solver.process("texas-holdem 4h8dJdJhTc 5d3d TsQs 4s2h"));
  }

  @Test
  public void test_texas_holdem_859_3d4h9cJcTc_KdJd_Qd6s_Ac8h_As8d_3h6h() {
    assertEquals(
      "Qd6s Ac8h=As8d 3h6h KdJd",
      Solver.process("texas-holdem 3d4h9cJcTc KdJd Qd6s Ac8h As8d 3h6h"));
  }

  @Test
  public void test_texas_holdem_860_3c4h7dKhQc_Jd9c_2h8h_4c4d_3s7s_As8s_4sQd_9d8d_2s5h_Jh2c() {
    assertEquals(
      "2s5h 2h8h 9d8d Jh2c Jd9c As8s 3s7s 4sQd 4c4d",
      Solver.process("texas-holdem 3c4h7dKhQc Jd9c 2h8h 4c4d 3s7s As8s 4sQd 9d8d 2s5h Jh2c"));
  }

  @Test
  public void test_texas_holdem_861_4s5h7cAhQs_7h6c_9sQh_8sTd_5sTc_8hQc_4hAc_Kh6d_9dJh() {
    assertEquals(
      "8sTd 9dJh Kh6d 5sTc 7h6c 8hQc 9sQh 4hAc",
      Solver.process("texas-holdem 4s5h7cAhQs 7h6c 9sQh 8sTd 5sTc 8hQc 4hAc Kh6d 9dJh"));
  }

  @Test
  public void test_texas_holdem_862_AdQdQhThTs_8cAs_Jh7d_JcKs_Qs9s() {
    assertEquals(
      "Jh7d 8cAs JcKs Qs9s",
      Solver.process("texas-holdem AdQdQhThTs 8cAs Jh7d JcKs Qs9s"));
  }

  @Test
  public void test_texas_holdem_863_2c6dJcKsQc_Kc8c_6hQs_4c2s_Qh7h() {
    assertEquals(
      "4c2s Qh7h 6hQs Kc8c",
      Solver.process("texas-holdem 2c6dJcKsQc Kc8c 6hQs 4c2s Qh7h"));
  }

  @Test
  public void test_texas_holdem_864_3s8sAdKsTd_9c4h_Jc7s_Tc4s_Ac9s_Jh8d_Ts5c_2h2d_3c3h() {
    assertEquals(
      "9c4h Jc7s 2h2d Jh8d Tc4s=Ts5c Ac9s 3c3h",
      Solver.process("texas-holdem 3s8sAdKsTd 9c4h Jc7s Tc4s Ac9s Jh8d Ts5c 2h2d 3c3h"));
  }

  @Test
  public void test_texas_holdem_865_4s6h8hJsKh_Jd9s_Ac3h_8s4c_ThTd_7d3d_7cAs_Kd6s() {
    assertEquals(
      "7d3d Ac3h 7cAs ThTd Jd9s 8s4c Kd6s",
      Solver.process("texas-holdem 4s6h8hJsKh Jd9s Ac3h 8s4c ThTd 7d3d 7cAs Kd6s"));
  }

  @Test
  public void test_texas_holdem_866_4c7c9c9sAd_2h9d_KsAs_6cKh_KcAh_8s3s_8d7s_6hQs_Kd2c_Jh3h() {
    assertEquals(
      "8s3s Jh3h 6hQs 6cKh=Kd2c 8d7s KcAh=KsAs 2h9d",
      Solver.process("texas-holdem 4c7c9c9sAd 2h9d KsAs 6cKh KcAh 8s3s 8d7s 6hQs Kd2c Jh3h"));
  }

  @Test
  public void test_texas_holdem_867_5s7dJhKhKs_6h8d_9d5h_Kd8h_3c3h() {
    assertEquals(
      "6h8d 3c3h 9d5h Kd8h",
      Solver.process("texas-holdem 5s7dJhKhKs 6h8d 9d5h Kd8h 3c3h"));
  }

  @Test
  public void test_texas_holdem_868_2c2d2s8cTh_6hTc_KdQc() {
    assertEquals(
      "KdQc 6hTc",
      Solver.process("texas-holdem 2c2d2s8cTh 6hTc KdQc"));
  }

  @Test
  public void test_texas_holdem_869_5c8cAdAhJs_Qs8s_9hQc_2h9c_7h4h_5s3s_4sTh() {
    assertEquals(
      "7h4h 2h9c 4sTh 9hQc 5s3s Qs8s",
      Solver.process("texas-holdem 5c8cAdAhJs Qs8s 9hQc 2h9c 7h4h 5s3s 4sTh"));
  }

  @Test
  public void test_texas_holdem_870_5c6c7s9dQd_4hQh_7c3h_Jd4d_5dTc_JcJh_8h4c_6s2d_8dQs() {
    assertEquals(
      "Jd4d 5dTc 6s2d 7c3h JcJh 4hQh 8dQs=8h4c",
      Solver.process("texas-holdem 5c6c7s9dQd 4hQh 7c3h Jd4d 5dTc JcJh 8h4c 6s2d 8dQs"));
  }

  @Test
  public void test_texas_holdem_871_2h4s8hJcJh_4c9d_KdQd() {
    assertEquals(
      "KdQd 4c9d",
      Solver.process("texas-holdem 2h4s8hJcJh 4c9d KdQd"));
  }

  @Test
  public void test_texas_holdem_872_2d4s8cJcQh_7d6d_Qs8d_2hKc_4dTh_6h3c_5sJh_8s6s_Td7s_7h8h() {
    assertEquals(
      "6h3c 7d6d Td7s 2hKc 4dTh 8s6s 7h8h 5sJh Qs8d",
      Solver.process("texas-holdem 2d4s8cJcQh 7d6d Qs8d 2hKc 4dTh 6h3c 5sJh 8s6s Td7s 7h8h"));
  }

  @Test
  public void test_texas_holdem_873_8cJcKsTdTs_7h5s_4h7d_AcQh_Jh7c() {
    assertEquals(
      "4h7d=7h5s Jh7c AcQh",
      Solver.process("texas-holdem 8cJcKsTdTs 7h5s 4h7d AcQh Jh7c"));
  }

  @Test
  public void test_texas_holdem_874_5h7dAcAdQs_2c4h_3d6h_JhJs() {
    assertEquals(
      "2c4h 3d6h JhJs",
      Solver.process("texas-holdem 5h7dAcAdQs 2c4h 3d6h JhJs"));
  }

  @Test
  public void test_texas_holdem_875_4s5h8s9d9s_8c7c_3h7h_TsQc_3cKs_3d4d_4c2c_2s6s_4hKh() {
    assertEquals(
      "3h7h TsQc 3cKs 3d4d=4c2c 4hKh 8c7c 2s6s",
      Solver.process("texas-holdem 4s5h8s9d9s 8c7c 3h7h TsQc 3cKs 3d4d 4c2c 2s6s 4hKh"));
  }

  @Test
  public void test_texas_holdem_876_3c9dAhKdTc_2sJc_7dTs_9sQd_4h5d() {
    assertEquals(
      "4h5d 2sJc 9sQd 7dTs",
      Solver.process("texas-holdem 3c9dAhKdTc 2sJc 7dTs 9sQd 4h5d"));
  }

  @Test
  public void test_texas_holdem_877_6h6s7hQdTd_3cTs_JdAs_2c6d() {
    assertEquals(
      "JdAs 3cTs 2c6d",
      Solver.process("texas-holdem 6h6s7hQdTd 3cTs JdAs 2c6d"));
  }

  @Test
  public void test_texas_holdem_878_7s8d9c9hJs_9d4h_KsKc_4sQs_5s5c_3c6h() {
    assertEquals(
      "3c6h 4sQs 5s5c KsKc 9d4h",
      Solver.process("texas-holdem 7s8d9c9hJs 9d4h KsKc 4sQs 5s5c 3c6h"));
  }

  @Test
  public void test_texas_holdem_879_4c5c7dQcQh_5h8c_8s4d() {
    assertEquals(
      "8s4d 5h8c",
      Solver.process("texas-holdem 4c5c7dQcQh 5h8c 8s4d"));
  }

  @Test
  public void test_texas_holdem_880_5s6s7d8sJd_AdJs_5dQc_2dTd_Jc7s_7h9h() {
    assertEquals(
      "2dTd 5dQc AdJs Jc7s 7h9h",
      Solver.process("texas-holdem 5s6s7d8sJd AdJs 5dQc 2dTd Jc7s 7h9h"));
  }

  @Test
  public void test_texas_holdem_881_2h3h6hJcTc_Qs8c_8d9s_6c2c_9d3s_5cJh_Kh3d_7cKc_AcKd_8s4c() {
    assertEquals(
      "8s4c 8d9s Qs8c 7cKc AcKd 9d3s Kh3d 5cJh 6c2c",
      Solver.process("texas-holdem 2h3h6hJcTc Qs8c 8d9s 6c2c 9d3s 5cJh Kh3d 7cKc AcKd 8s4c"));
  }

  @Test
  public void test_texas_holdem_882_2s3d5h7d7s_4s4d_6d7h_JsAc() {
    assertEquals(
      "JsAc 4s4d 6d7h",
      Solver.process("texas-holdem 2s3d5h7d7s 4s4d 6d7h JsAc"));
  }

  @Test
  public void test_texas_holdem_883_6c7c8c9cTd_As2s_JsAd_Kd5s() {
    assertEquals(
      "As2s=Kd5s JsAd",
      Solver.process("texas-holdem 6c7c8c9cTd As2s JsAd Kd5s"));
  }

  @Test
  public void test_texas_holdem_884_2h2s9c9dJc_AhQc_AcJd_9s3d_QhJs_AsKd_3h5c_3c8d_JhKc_4d2c() {
    assertEquals(
      "3c8d=3h5c AhQc=AsKd QhJs JhKc AcJd 4d2c 9s3d",
      Solver.process("texas-holdem 2h2s9c9dJc AhQc AcJd 9s3d QhJs AsKd 3h5c 3c8d JhKc 4d2c"));
  }

  @Test
  public void test_texas_holdem_885_3c3h5h7dKh_8cJd_Kd2h_Ks7c_Ac3s_6s3d_ThTd_4sAd() {
    assertEquals(
      "8cJd 4sAd ThTd Kd2h Ks7c 6s3d Ac3s",
      Solver.process("texas-holdem 3c3h5h7dKh 8cJd Kd2h Ks7c Ac3s 6s3d ThTd 4sAd"));
  }

  @Test
  public void test_texas_holdem_886_5c5s6s7hAs_7d2s_9d5d_Kc2c() {
    assertEquals(
      "Kc2c 7d2s 9d5d",
      Solver.process("texas-holdem 5c5s6s7hAs 7d2s 9d5d Kc2c"));
  }

  @Test
  public void test_texas_holdem_887_4d5c5s8c9h_8hQd_4c7s_Td3d_KcTh_As8s_Jh4h_4sJd_Ad9d_TsKs() {
    assertEquals(
      "Td3d KcTh=TsKs 4c7s 4sJd=Jh4h 8hQd As8s Ad9d",
      Solver.process("texas-holdem 4d5c5s8c9h 8hQd 4c7s Td3d KcTh As8s Jh4h 4sJd Ad9d TsKs"));
  }

  @Test
  public void test_texas_holdem_888_3c7hAcAhQc_Jd4d_6sTs_4cJc_TdKs_7c4h_Kd2h_9s2s_9d8h() {
    assertEquals(
      "9s2s 9d8h 6sTs Jd4d Kd2h TdKs 7c4h 4cJc",
      Solver.process("texas-holdem 3c7hAcAhQc Jd4d 6sTs 4cJc TdKs 7c4h Kd2h 9s2s 9d8h"));
  }

  @Test
  public void test_texas_holdem_889_3h4c5d8d9h_5cAd_Qs3s() {
    assertEquals(
      "Qs3s 5cAd",
      Solver.process("texas-holdem 3h4c5d8d9h 5cAd Qs3s"));
  }

  @Test
  public void test_texas_holdem_890_2s5d5hAsJh_2d6s_Jd6h_5s6d_8d8s_7d9h_3d9d_7s7h_Ks4h() {
    assertEquals(
      "3d9d=7d9h Ks4h 2d6s 7s7h 8d8s Jd6h 5s6d",
      Solver.process("texas-holdem 2s5d5hAsJh 2d6s Jd6h 5s6d 8d8s 7d9h 3d9d 7s7h Ks4h"));
  }

  @Test
  public void test_texas_holdem_891_3s4hAcJcJd_8h7d_4d6s_5s9h_Qc3h_2c8s_2h7c() {
    assertEquals(
      "2h7c 2c8s 8h7d 5s9h Qc3h 4d6s",
      Solver.process("texas-holdem 3s4hAcJcJd 8h7d 4d6s 5s9h Qc3h 2c8s 2h7c"));
  }

  @Test
  public void test_texas_holdem_892_4h7d7s9dJd_8c5c_3sQc_6cTc_5sQd_2s6s() {
    assertEquals(
      "2s6s 8c5c 6cTc 3sQc=5sQd",
      Solver.process("texas-holdem 4h7d7s9dJd 8c5c 3sQc 6cTc 5sQd 2s6s"));
  }

  @Test
  public void test_texas_holdem_893_4s9c9sJcJs_4d9h_KsTs_7s6c() {
    assertEquals(
      "7s6c KsTs 4d9h",
      Solver.process("texas-holdem 4s9c9sJcJs 4d9h KsTs 7s6c"));
  }

  @Test
  public void test_texas_holdem_894_4cAcJdKhTs_5d6h_6d9h_7h5c_QhJs_8cKc_4d5s_2sQc_4sQd_5hJc() {
    assertEquals(
      "5d6h 7h5c 6d9h 4d5s 5hJc 8cKc 2sQc=4sQd=QhJs",
      Solver.process("texas-holdem 4cAcJdKhTs 5d6h 6d9h 7h5c QhJs 8cKc 4d5s 2sQc 4sQd 5hJc"));
  }

  @Test
  public void test_texas_holdem_895_2h5d6c8sTh_2c4c_AsKd_5s6d_Ah5c() {
    assertEquals(
      "AsKd 2c4c Ah5c 5s6d",
      Solver.process("texas-holdem 2h5d6c8sTh 2c4c AsKd 5s6d Ah5c"));
  }

  @Test
  public void test_texas_holdem_896_2c7s9hAdKc_3s9s_8c6d_ThAh_AcJd_Ts4s_Jc9c_QdKs() {
    assertEquals(
      "8c6d Ts4s 3s9s Jc9c QdKs ThAh AcJd",
      Solver.process("texas-holdem 2c7s9hAdKc 3s9s 8c6d ThAh AcJd Ts4s Jc9c QdKs"));
  }

  @Test
  public void test_texas_holdem_897_7s8s9cAcKd_8hAd_5sTh_9d2s_AhQc() {
    assertEquals(
      "5sTh 9d2s AhQc 8hAd",
      Solver.process("texas-holdem 7s8s9cAcKd 8hAd 5sTh 9d2s AhQc"));
  }

  @Test
  public void test_texas_holdem_898_4h6s7dAhAs_KhTd_Jd7s_9h3s_9sTs() {
    assertEquals(
      "9h3s 9sTs KhTd Jd7s",
      Solver.process("texas-holdem 4h6s7dAhAs KhTd Jd7s 9h3s 9sTs"));
  }

  @Test
  public void test_texas_holdem_899_2s3h9sKdQh_9h4d_Kh6s_TcJs() {
    assertEquals(
      "9h4d Kh6s TcJs",
      Solver.process("texas-holdem 2s3h9sKdQh 9h4d Kh6s TcJs"));
  }

  @Test
  public void test_texas_holdem_900_3c7c8hAcJc_9s8s_6s7s() {
    assertEquals(
      "6s7s 9s8s",
      Solver.process("texas-holdem 3c7c8hAcJc 9s8s 6s7s"));
  }

  @Test
  public void test_texas_holdem_901_2s3h9dAcAs_4dQs_KsTs_JdTd_4h9c_Qc5s() {
    assertEquals(
      "JdTd 4dQs Qc5s KsTs 4h9c",
      Solver.process("texas-holdem 2s3h9dAcAs 4dQs KsTs JdTd 4h9c Qc5s"));
  }

  @Test
  public void test_texas_holdem_902_3d6d9sAhKs_2dTc_4c5c_3c6c_Ad8c() {
    assertEquals(
      "4c5c 2dTc Ad8c 3c6c",
      Solver.process("texas-holdem 3d6d9sAhKs 2dTc 4c5c 3c6c Ad8c"));
  }

  @Test
  public void test_texas_holdem_903_2s3s4sAhQc_9d8s_KhJd_5cTd() {
    assertEquals(
      "9d8s KhJd 5cTd",
      Solver.process("texas-holdem 2s3s4sAhQc 9d8s KhJd 5cTd"));
  }

  @Test
  public void test_texas_holdem_904_5c5sAsKcQh_8cTd_KsTh_4h6d_7hKd_9hJs_9d2d() {
    assertEquals(
      "4h6d=8cTd=9d2d=9hJs 7hKd=KsTh",
      Solver.process("texas-holdem 5c5sAsKcQh 8cTd KsTh 4h6d 7hKd 9hJs 9d2d"));
  }

  @Test
  public void test_texas_holdem_905_3cAdAhJcTs_4s8d_7c9d_Jh9s_2dQd() {
    assertEquals(
      "4s8d 7c9d 2dQd Jh9s",
      Solver.process("texas-holdem 3cAdAhJcTs 4s8d 7c9d Jh9s 2dQd"));
  }

  @Test
  public void test_texas_holdem_906_3c3s8sAcKh_AsTh_4cKs_9s6d_4h8c_7s4s_Qc7h() {
    assertEquals(
      "7s4s 9s6d Qc7h 4h8c 4cKs AsTh",
      Solver.process("texas-holdem 3c3s8sAcKh AsTh 4cKs 9s6d 4h8c 7s4s Qc7h"));
  }

  @Test
  public void test_texas_holdem_907_2c7h8d9sTh_Ah8s_4dAc() {
    assertEquals(
      "4dAc Ah8s",
      Solver.process("texas-holdem 2c7h8d9sTh Ah8s 4dAc"));
  }

  @Test
  public void test_texas_holdem_908_2s4s7s9cAd_2c9h_Kc3d_8c8d_As2d_QcQh() {
    assertEquals(
      "Kc3d 8c8d QcQh 2c9h As2d",
      Solver.process("texas-holdem 2s4s7s9cAd 2c9h Kc3d 8c8d As2d QcQh"));
  }

  @Test
  public void test_texas_holdem_909_2s8h8s9sTs_Jc9h_8dQc_JdAd_9d6h_6d5h_4h6c_2h2c_Td6s() {
    assertEquals(
      "4h6c=6d5h JdAd 9d6h Jc9h 8dQc Td6s 2h2c",
      Solver.process("texas-holdem 2s8h8s9sTs Jc9h 8dQc JdAd 9d6h 6d5h 4h6c 2h2c Td6s"));
  }

  @Test
  public void test_texas_holdem_910_3s4s6cJcKd_5d5h_2h8h_Ks5c_9cQs_Ac7h_Kh9d_3d8c_9s3h() {
    assertEquals(
      "2h8h 9cQs Ac7h 3d8c 9s3h 5d5h Ks5c Kh9d",
      Solver.process("texas-holdem 3s4s6cJcKd 5d5h 2h8h Ks5c 9cQs Ac7h Kh9d 3d8c 9s3h"));
  }

  @Test
  public void test_texas_holdem_911_3h5d7dJsKc_3cTd_7h7c_JdKd_Ac4s_8h4c_Ks8s_3sJc_8d6c() {
    assertEquals(
      "8h4c 8d6c Ac4s 3cTd Ks8s 3sJc JdKd 7h7c",
      Solver.process("texas-holdem 3h5d7dJsKc 3cTd 7h7c JdKd Ac4s 8h4c Ks8s 3sJc 8d6c"));
  }

  @Test
  public void test_texas_holdem_912_3h5s7cAcQs_7sAd_Jh4h_Qh4d() {
    assertEquals(
      "Jh4h Qh4d 7sAd",
      Solver.process("texas-holdem 3h5s7cAcQs 7sAd Jh4h Qh4d"));
  }

  @Test
  public void test_texas_holdem_913_3c3h4h4sQh_7h8s_6dTh_8c3s_4d7c_6h2s_6s9h() {
    assertEquals(
      "6dTh=6h2s=6s9h=7h8s 8c3s 4d7c",
      Solver.process("texas-holdem 3c3h4h4sQh 7h8s 6dTh 8c3s 4d7c 6h2s 6s9h"));
  }

  @Test
  public void test_texas_holdem_914_4d6d7hAhJc_5hTs_Qs2d() {
    assertEquals(
      "5hTs Qs2d",
      Solver.process("texas-holdem 4d6d7hAhJc 5hTs Qs2d"));
  }

  @Test
  public void test_texas_holdem_915_3s6d8hAdQh_5s4c_Kd2h_4s4d_5c8c_2s6c_9sAh_AsJh_7cJd_JcTh() {
    assertEquals(
      "5s4c 7cJd JcTh Kd2h 4s4d 2s6c 5c8c 9sAh AsJh",
      Solver.process("texas-holdem 3s6d8hAdQh 5s4c Kd2h 4s4d 5c8c 2s6c 9sAh AsJh 7cJd JcTh"));
  }

  @Test
  public void test_texas_holdem_916_4cJhQsTcTs_AdJc_7d5d_Ks2c_9sQc_8c9h_9d5h_QdJs_4s2h() {
    assertEquals(
      "7d5d 9d5h Ks2c 4s2h AdJc 9sQc QdJs 8c9h",
      Solver.process("texas-holdem 4cJhQsTcTs AdJc 7d5d Ks2c 9sQc 8c9h 9d5h QdJs 4s2h"));
  }

  @Test
  public void test_texas_holdem_917_2s4h5c5h6d_8hTc_2h8c() {
    assertEquals(
      "8hTc 2h8c",
      Solver.process("texas-holdem 2s4h5c5h6d 8hTc 2h8c"));
  }

  @Test
  public void test_texas_holdem_918_3c4d6hJdTc_4h7h_Td2c_AhJh_Qs6c_9c5s_6sQc_AsKc_2sTh_2h8h() {
    assertEquals(
      "2h8h 9c5s AsKc 4h7h 6sQc=Qs6c 2sTh=Td2c AhJh",
      Solver.process("texas-holdem 3c4d6hJdTc 4h7h Td2c AhJh Qs6c 9c5s 6sQc AsKc 2sTh 2h8h"));
  }

  @Test
  public void test_texas_holdem_919_4c4s6h9dQd_7sAd_QsTd_5s8c_2s9c_7dAc_3cAs_8sAh_KcQh_Ks8h() {
    assertEquals(
      "5s8c Ks8h 3cAs=7dAc=7sAd=8sAh 2s9c QsTd KcQh",
      Solver.process("texas-holdem 4c4s6h9dQd 7sAd QsTd 5s8c 2s9c 7dAc 3cAs 8sAh KcQh Ks8h"));
  }

  @Test
  public void test_texas_holdem_920_2s3c4s9cTs_JcKh_6c4h() {
    assertEquals(
      "JcKh 6c4h",
      Solver.process("texas-holdem 2s3c4s9cTs JcKh 6c4h"));
  }

  @Test
  public void test_texas_holdem_921_4d9c9sAsKd_8h6s_7c2c_7h2h_4sAc() {
    assertEquals(
      "7c2c=7h2h 8h6s 4sAc",
      Solver.process("texas-holdem 4d9c9sAsKd 8h6s 7c2c 7h2h 4sAc"));
  }

  @Test
  public void test_texas_holdem_922_6c6d7sAsJs_Jh4s_7d6s() {
    assertEquals(
      "Jh4s 7d6s",
      Solver.process("texas-holdem 6c6d7sAsJs Jh4s 7d6s"));
  }

  @Test
  public void test_texas_holdem_923_2h7c9dQdQh_9sAd_KsKc_Js3h_AsKh_Ah8d_4hJh() {
    assertEquals(
      "4hJh=Js3h Ah8d AsKh 9sAd KsKc",
      Solver.process("texas-holdem 2h7c9dQdQh 9sAd KsKc Js3h AsKh Ah8d 4hJh"));
  }

  @Test
  public void test_texas_holdem_924_2d3h8sQsTh_9dKd_JdKc_3c7d_6s8c_9s5h_Jh2s_6dAs() {
    assertEquals(
      "9s5h 9dKd JdKc 6dAs Jh2s 3c7d 6s8c",
      Solver.process("texas-holdem 2d3h8sQsTh 9dKd JdKc 3c7d 6s8c 9s5h Jh2s 6dAs"));
  }

  @Test
  public void test_texas_holdem_925_3h4d5d7h9s_3d7c_ThTc_Ac7d_Jh2h() {
    assertEquals(
      "Jh2h Ac7d ThTc 3d7c",
      Solver.process("texas-holdem 3h4d5d7h9s 3d7c ThTc Ac7d Jh2h"));
  }

  @Test
  public void test_texas_holdem_926_3d5h7cAdJd_3h7h_Qd6h_4s3s_Qc5s_Js6c() {
    assertEquals(
      "Qd6h 4s3s Qc5s Js6c 3h7h",
      Solver.process("texas-holdem 3d5h7cAdJd 3h7h Qd6h 4s3s Qc5s Js6c"));
  }

  @Test
  public void test_texas_holdem_927_6d9cJdJsKh_7h2s_AcKd_4h5h_6s5c_8s7d_3cJh_Ad4c() {
    assertEquals(
      "4h5h 7h2s 8s7d Ad4c 6s5c AcKd 3cJh",
      Solver.process("texas-holdem 6d9cJdJsKh 7h2s AcKd 4h5h 6s5c 8s7d 3cJh Ad4c"));
  }

  @Test
  public void test_texas_holdem_928_5c5h6cKhQs_7h5d_JdAc() {
    assertEquals(
      "JdAc 7h5d",
      Solver.process("texas-holdem 5c5h6cKhQs 7h5d JdAc"));
  }

  @Test
  public void test_texas_holdem_929_6c6d7c8cTc_2cTh_Qd5s_Jd8h_TsJc() {
    assertEquals(
      "Qd5s Jd8h 2cTh TsJc",
      Solver.process("texas-holdem 6c6d7c8cTc 2cTh Qd5s Jd8h TsJc"));
  }

  @Test
  public void test_texas_holdem_930_7cAhKdTdTh_KcTs_6s8c_2c5s_Jh9h_8hQh() {
    assertEquals(
      "2c5s 6s8c Jh9h 8hQh KcTs",
      Solver.process("texas-holdem 7cAhKdTdTh KcTs 6s8c 2c5s Jh9h 8hQh"));
  }

  @Test
  public void test_texas_holdem_931_7c8hJsKdKs_7hAh_Tc2d() {
    assertEquals(
      "Tc2d 7hAh",
      Solver.process("texas-holdem 7c8hJsKdKs 7hAh Tc2d"));
  }

  @Test
  public void test_texas_holdem_932_6s7hAhTdTh_8c2h_Ks9s_4c5s_Jh3d_2s5c_QcTc_4d9c_6h6c() {
    assertEquals(
      "2s5c=4c5s 8c2h 4d9c Jh3d Ks9s QcTc 6h6c",
      Solver.process("texas-holdem 6s7hAhTdTh 8c2h Ks9s 4c5s Jh3d 2s5c QcTc 4d9c 6h6c"));
  }

  @Test
  public void test_texas_holdem_933_2dAdAhKhTc_8dJh_JdKs_6h4c() {
    assertEquals(
      "6h4c 8dJh JdKs",
      Solver.process("texas-holdem 2dAdAhKhTc 8dJh JdKs 6h4c"));
  }

  @Test
  public void test_texas_holdem_934_2c6d9cAdJs_2h8h_5sJc_Qc7s_6s8c_8d4h_Ac6c_As2s() {
    assertEquals(
      "8d4h Qc7s 2h8h 6s8c 5sJc As2s Ac6c",
      Solver.process("texas-holdem 2c6d9cAdJs 2h8h 5sJc Qc7s 6s8c 8d4h Ac6c As2s"));
  }

  @Test
  public void test_texas_holdem_935_4h9hQcTcTh_6d4d_4sJh_7dKd_3cKc_2h7h_Js8h_8c2d_JdAh_Ad3d() {
    assertEquals(
      "8c2d 3cKc=7dKd Ad3d JdAh 4sJh=6d4d Js8h 2h7h",
      Solver.process("texas-holdem 4h9hQcTcTh 6d4d 4sJh 7dKd 3cKc 2h7h Js8h 8c2d JdAh Ad3d"));
  }

  @Test
  public void test_texas_holdem_936_3c7d7s8sAs_2dKs_5s2s_4s5c() {
    assertEquals(
      "4s5c 2dKs 5s2s",
      Solver.process("texas-holdem 3c7d7s8sAs 2dKs 5s2s 4s5c"));
  }

  @Test
  public void test_texas_holdem_937_4s5c8c9cTc_Ah5d_5hAd_2cJc() {
    assertEquals(
      "5hAd=Ah5d 2cJc",
      Solver.process("texas-holdem 4s5c8c9cTc Ah5d 5hAd 2cJc"));
  }

  @Test
  public void test_texas_holdem_938_5d6c8cAcAs_5h6s_3d3s_Kh4h_5s4s_6hJh_7s7d() {
    assertEquals(
      "Kh4h 3d3s 5s4s 5h6s 6hJh 7s7d",
      Solver.process("texas-holdem 5d6c8cAcAs 5h6s 3d3s Kh4h 5s4s 6hJh 7s7d"));
  }

  @Test
  public void test_texas_holdem_939_3c4c6s9c9h_8s5c_Kd2d_As5s_QsJs_2hKc() {
    assertEquals(
      "8s5c QsJs 2hKc=Kd2d As5s",
      Solver.process("texas-holdem 3c4c6s9c9h 8s5c Kd2d As5s QsJs 2hKc"));
  }

  @Test
  public void test_texas_holdem_940_5c7h8hAcJc_4d5s_AsQd_4h4s() {
    assertEquals(
      "4h4s 4d5s AsQd",
      Solver.process("texas-holdem 5c7h8hAcJc 4d5s AsQd 4h4s"));
  }

  @Test
  public void test_texas_holdem_941_5h6c7c8dJd_6sKs_4h7h_Ac2c_Tc4c_3cAh_6d8h_2d8s_QcJh_2h3h() {
    assertEquals(
      "2h3h 3cAh=Ac2c 6sKs 2d8s QcJh 6d8h 4h7h=Tc4c",
      Solver.process("texas-holdem 5h6c7c8dJd 6sKs 4h7h Ac2c Tc4c 3cAh 6d8h 2d8s QcJh 2h3h"));
  }

  @Test
  public void test_texas_holdem_942_6d7cAhJdTh_5c8c_4s7d_Ad3d_8hQh_JcAs_Qc2h_KhQs_6h7s_AcKs() {
    assertEquals(
      "5c8c Qc2h 8hQh 4s7d Ad3d AcKs 6h7s JcAs KhQs",
      Solver.process("texas-holdem 6d7cAhJdTh 5c8c 4s7d Ad3d 8hQh JcAs Qc2h KhQs 6h7s AcKs"));
  }

  @Test
  public void test_texas_holdem_943_6c7d7sJcJh_8s5d_Kc7c_2d3h_Ts2h_6d4s_4h7h_4d3s_5s9c_4cTc() {
    assertEquals(
      "2d3h=4d3s=6d4s 8s5d 5s9c 4cTc=Ts2h 4h7h=Kc7c",
      Solver.process("texas-holdem 6c7d7sJcJh 8s5d Kc7c 2d3h Ts2h 6d4s 4h7h 4d3s 5s9c 4cTc"));
  }

  @Test
  public void test_texas_holdem_944_3d4c4s9cQd_7sQc_3s4d_Tc5c() {
    assertEquals(
      "Tc5c 7sQc 3s4d",
      Solver.process("texas-holdem 3d4c4s9cQd 7sQc 3s4d Tc5c"));
  }

  @Test
  public void test_texas_holdem_945_2d6s9h9sJh_Ad4h_Ac5h_7cJd_6d9c_KsAh_TsTh() {
    assertEquals(
      "Ac5h=Ad4h KsAh TsTh 7cJd 6d9c",
      Solver.process("texas-holdem 2d6s9h9sJh Ad4h Ac5h 7cJd 6d9c KsAh TsTh"));
  }

  @Test
  public void test_texas_holdem_946_3c4d5h6d9c_5cTd_Jd8s_KsJh_Ac9s_KhAs_Js2h() {
    assertEquals(
      "Jd8s KsJh KhAs 5cTd Ac9s Js2h",
      Solver.process("texas-holdem 3c4d5h6d9c 5cTd Jd8s KsJh Ac9s KhAs Js2h"));
  }

  @Test
  public void test_texas_holdem_947_5c5d7dAcQc_7s6h_AdQd_9dTc_8dJs_8cQs_3sAh_Qh6c() {
    assertEquals(
      "9dTc 8dJs 7s6h 8cQs=Qh6c 3sAh AdQd",
      Solver.process("texas-holdem 5c5d7dAcQc 7s6h AdQd 9dTc 8dJs 8cQs 3sAh Qh6c"));
  }

  @Test
  public void test_texas_holdem_948_2h6dAcJhQc_Tc4d_Qs3s_5cKc_2cJd_9c3d_Kd4s_7c6s_AhQd() {
    assertEquals(
      "9c3d Tc4d 5cKc=Kd4s 7c6s Qs3s 2cJd AhQd",
      Solver.process("texas-holdem 2h6dAcJhQc Tc4d Qs3s 5cKc 2cJd 9c3d Kd4s 7c6s AhQd"));
  }

  @Test
  public void test_texas_holdem_949_6c7s9dKdQh_Jd6d_6h4s() {
    assertEquals(
      "6h4s Jd6d",
      Solver.process("texas-holdem 6c7s9dKdQh Jd6d 6h4s"));
  }

  @Test
  public void test_texas_holdem_950_2hAcJhQcTd_Ad6d_7s9d_3cAh_Js6h_Kh2s_Kc3s_7d9c_QdQs() {
    assertEquals(
      "7d9c=7s9d Js6h 3cAh=Ad6d QdQs Kc3s=Kh2s",
      Solver.process("texas-holdem 2hAcJhQcTd Ad6d 7s9d 3cAh Js6h Kh2s Kc3s 7d9c QdQs"));
  }

  @Test
  public void test_texas_holdem_951_3s4d7s9sJh_5sQd_9dKh_3hTh() {
    assertEquals(
      "5sQd 3hTh 9dKh",
      Solver.process("texas-holdem 3s4d7s9sJh 5sQd 9dKh 3hTh"));
  }

  @Test
  public void test_texas_holdem_952_3cKcKsQcTh_5h4h_4sQh_5dTd_9cAs_7s6d() {
    assertEquals(
      "5h4h 7s6d 9cAs 5dTd 4sQh",
      Solver.process("texas-holdem 3cKcKsQcTh 5h4h 4sQh 5dTd 9cAs 7s6d"));
  }

  @Test
  public void test_texas_holdem_953_8cAhJdJsTs_Ac5d_2hQs_3s9c_Qh2c_9d8h_7sKs_9h9s_5hJc() {
    assertEquals(
      "3s9c 2hQs=Qh2c 7sKs 9d8h 9h9s Ac5d 5hJc",
      Solver.process("texas-holdem 8cAhJdJsTs Ac5d 2hQs 3s9c Qh2c 9d8h 7sKs 9h9s 5hJc"));
  }

  @Test
  public void test_texas_holdem_954_2h3s9dKdTc_6c7d_5c4d_Qd2s_QsKh() {
    assertEquals(
      "5c4d 6c7d Qd2s QsKh",
      Solver.process("texas-holdem 2h3s9dKdTc 6c7d 5c4d Qd2s QsKh"));
  }

  @Test
  public void test_texas_holdem_955_3s4c6cKsQc_2sQd_3dKh_3cTh_8hJd_9sAh_AsQh_2c9d() {
    assertEquals(
      "2c9d 8hJd 9sAh 3cTh 2sQd AsQh 3dKh",
      Solver.process("texas-holdem 3s4c6cKsQc 2sQd 3dKh 3cTh 8hJd 9sAh AsQh 2c9d"));
  }

  @Test
  public void test_texas_holdem_956_3s6c9hAsKc_2h7c_6d2s_7sTh_JhJc_8dKh_Ac7d_8cQd() {
    assertEquals(
      "2h7c 7sTh 8cQd 6d2s JhJc 8dKh Ac7d",
      Solver.process("texas-holdem 3s6c9hAsKc 2h7c 6d2s 7sTh JhJc 8dKh Ac7d 8cQd"));
  }

  @Test
  public void test_texas_holdem_957_2s4s8dJcKc_2d6d_5cTd_7sAh_7hTs() {
    assertEquals(
      "5cTd 7hTs 7sAh 2d6d",
      Solver.process("texas-holdem 2s4s8dJcKc 2d6d 5cTd 7sAh 7hTs"));
  }

  @Test
  public void test_texas_holdem_958_2h7dAcKdTs_2d5h_2c8d_Ks4h_9d7c_4s5s_5cAs() {
    assertEquals(
      "4s5s 2c8d=2d5h 9d7c Ks4h 5cAs",
      Solver.process("texas-holdem 2h7dAcKdTs 2d5h 2c8d Ks4h 9d7c 4s5s 5cAs"));
  }

  @Test
  public void test_texas_holdem_959_2s4d5hJcTs_3sJs_2d4h_AcAd_7hKd_4cJd() {
    assertEquals(
      "7hKd 3sJs AcAd 2d4h 4cJd",
      Solver.process("texas-holdem 2s4d5hJcTs 3sJs 2d4h AcAd 7hKd 4cJd"));
  }

  @Test
  public void test_texas_holdem_960_5s6s8d9sTd_9c5c_7hQs_8h4s_AsAc_Jd3d_2d2c_6d5d_Kc9h() {
    assertEquals(
      "Jd3d 2d2c 8h4s Kc9h AsAc 6d5d 9c5c 7hQs",
      Solver.process("texas-holdem 5s6s8d9sTd 9c5c 7hQs 8h4s AsAc Jd3d 2d2c 6d5d Kc9h"));
  }

  @Test
  public void test_texas_holdem_961_2c5c5s7d9s_AsJs_2dJh_Td7c_Jc8d_Kh6h_KcAc_3s9d_Th2s_Jd4s() {
    assertEquals(
      "Jd4s Jc8d Kh6h AsJs KcAc Th2s 2dJh Td7c 3s9d",
      Solver.process("texas-holdem 2c5c5s7d9s AsJs 2dJh Td7c Jc8d Kh6h KcAc 3s9d Th2s Jd4s"));
  }

  @Test
  public void test_texas_holdem_962_7s8h9hAcJh_Th3s_Qh2h_6h4h_KdJd_6s6d_KcTs_7hQc() {
    assertEquals(
      "6s6d 7hQc KdJd KcTs=Th3s 6h4h Qh2h",
      Solver.process("texas-holdem 7s8h9hAcJh Th3s Qh2h 6h4h KdJd 6s6d KcTs 7hQc"));
  }

  @Test
  public void test_texas_holdem_963_3s6c7sAhKc_5sJs_QhTh_8sTs_3hKh_2c5d() {
    assertEquals(
      "2c5d 8sTs 5sJs QhTh 3hKh",
      Solver.process("texas-holdem 3s6c7sAhKc 5sJs QhTh 8sTs 3hKh 2c5d"));
  }

  @Test
  public void test_texas_holdem_964_2d8sAhTdTh_Ts9c_2h9h_QhJh_7h5d_4cJd_5h8c() {
    assertEquals(
      "7h5d 4cJd QhJh 2h9h 5h8c Ts9c",
      Solver.process("texas-holdem 2d8sAhTdTh Ts9c 2h9h QhJh 7h5d 4cJd 5h8c"));
  }

  @Test
  public void test_texas_holdem_965_3d4h5c5dQd_Ks6s_Ac3h_6cJs_8sJh_Kc8h_9h4s_QcTc() {
    assertEquals(
      "6cJs 8sJh Ks6s Kc8h Ac3h 9h4s QcTc",
      Solver.process("texas-holdem 3d4h5c5dQd Ks6s Ac3h 6cJs 8sJh Kc8h 9h4s QcTc"));
  }

  @Test
  public void test_texas_holdem_966_2s3s6c6hJd_TcKc_5sJh_3c3d_4d7s_9hTs() {
    assertEquals(
      "4d7s 9hTs TcKc 5sJh 3c3d",
      Solver.process("texas-holdem 2s3s6c6hJd TcKc 5sJh 3c3d 4d7s 9hTs"));
  }

  @Test
  public void test_texas_holdem_967_4c7s9hAsQs_4h8d_TcJh_7h7d_2hQc_Ts9c_Jc4d_3h9d_5c7c_2d8s() {
    assertEquals(
      "2d8s TcJh 4h8d Jc4d 5c7c 3h9d Ts9c 2hQc 7h7d",
      Solver.process("texas-holdem 4c7s9hAsQs 4h8d TcJh 7h7d 2hQc Ts9c Jc4d 3h9d 5c7c 2d8s"));
  }

  @Test
  public void test_texas_holdem_968_3d5h6h9hKd_7h5d_JcJh_As7d_6c2s_3sQs_KcAh_KsTs_2c5c() {
    assertEquals(
      "As7d 3sQs 2c5c 7h5d 6c2s JcJh KsTs KcAh",
      Solver.process("texas-holdem 3d5h6h9hKd 7h5d JcJh As7d 6c2s 3sQs KcAh KsTs 2c5c"));
  }

  @Test
  public void test_texas_holdem_969_4h5h6hTdTs_Ad2d_5s8h_Th3s_9h9c_4c4d_Jc4s_QhAc_As5d_Jh6s() {
    assertEquals(
      "Ad2d QhAc Jc4s 5s8h As5d Jh6s 9h9c Th3s 4c4d",
      Solver.process("texas-holdem 4h5h6hTdTs Ad2d 5s8h Th3s 9h9c 4c4d Jc4s QhAc As5d Jh6s"));
  }

  @Test
  public void test_texas_holdem_970_2h3hQhQsTh_Js4h_QdAs_6d2c_Tc7h_Td6c_9dJh() {
    assertEquals(
      "6d2c Td6c QdAs Js4h Tc7h 9dJh",
      Solver.process("texas-holdem 2h3hQhQsTh Js4h QdAs 6d2c Tc7h Td6c 9dJh"));
  }

  @Test
  public void test_texas_holdem_971_5d8sJcJsQd_Td8c_2h3h() {
    assertEquals(
      "2h3h Td8c",
      Solver.process("texas-holdem 5d8sJcJsQd Td8c 2h3h"));
  }

  @Test
  public void test_texas_holdem_972_5s9dAcJsQh_QdTh_Ks3s() {
    assertEquals(
      "Ks3s QdTh",
      Solver.process("texas-holdem 5s9dAcJsQh QdTh Ks3s"));
  }

  @Test
  public void test_texas_holdem_973_4c5c6hAhQs_3s5d_7d3c_2h2d_7cJd_Js9c() {
    assertEquals(
      "7cJd Js9c 2h2d 3s5d 7d3c",
      Solver.process("texas-holdem 4c5c6hAhQs 3s5d 7d3c 2h2d 7cJd Js9c"));
  }

  @Test
  public void test_texas_holdem_974_7d7hKcQdTc_4cKs_7c9h() {
    assertEquals(
      "4cKs 7c9h",
      Solver.process("texas-holdem 7d7hKcQdTc 4cKs 7c9h"));
  }

  @Test
  public void test_texas_holdem_975_2h4s5s9sQc_3dJd_3h5h_2c9d_KcTh_QsKd_6c9h_5c3s_4c4d_QdJc() {
    assertEquals(
      "3dJd KcTh 3h5h=5c3s 6c9h QdJc QsKd 2c9d 4c4d",
      Solver.process("texas-holdem 2h4s5s9sQc 3dJd 3h5h 2c9d KcTh QsKd 6c9h 5c3s 4c4d QdJc"));
  }

  @Test
  public void test_texas_holdem_976_2h3hJhKhTh_8h3c_4h2c() {
    assertEquals(
      "4h2c 8h3c",
      Solver.process("texas-holdem 2h3hJhKhTh 8h3c 4h2c"));
  }

  @Test
  public void test_texas_holdem_977_7s9hAdJsKc_6h5h_Ah3h_Th5d_6cQh() {
    assertEquals(
      "6h5h Th5d 6cQh Ah3h",
      Solver.process("texas-holdem 7s9hAdJsKc 6h5h Ah3h Th5d 6cQh"));
  }

  @Test
  public void test_texas_holdem_978_2c6hQdQhTc_KcTs_9sKs_9dJc_5d7d_Ad4h_2s3d_Th6c_8h9c() {
    assertEquals(
      "5d7d 8h9c 9dJc 9sKs Ad4h 2s3d Th6c KcTs",
      Solver.process("texas-holdem 2c6hQdQhTc KcTs 9sKs 9dJc 5d7d Ad4h 2s3d Th6c 8h9c"));
  }

  @Test
  public void test_texas_holdem_979_4s5c8sAsJs_8hAc_9hTs_3d3h_4c7d_Jd6h() {
    assertEquals(
      "3d3h 4c7d Jd6h 8hAc 9hTs",
      Solver.process("texas-holdem 4s5c8sAsJs 8hAc 9hTs 3d3h 4c7d Jd6h"));
  }

  @Test
  public void test_texas_holdem_980_4s8cKhTcTh_6cQd_9d5h() {
    assertEquals(
      "9d5h 6cQd",
      Solver.process("texas-holdem 4s8cKhTcTh 6cQd 9d5h"));
  }

  @Test
  public void test_texas_holdem_981_2d6dKdKsTh_Qs7c_2s4h_Jd8c_3hAs_5c9d_Qh8d_Kc2h() {
    assertEquals(
      "5c9d Jd8c Qs7c Qh8d 3hAs 2s4h Kc2h",
      Solver.process("texas-holdem 2d6dKdKsTh Qs7c 2s4h Jd8c 3hAs 5c9d Qh8d Kc2h"));
  }

  @Test
  public void test_texas_holdem_982_5c5dAdAhJd_9h6h_4c6s_9c4s_Ts5s_Qs7h_2sKc_Ks8s() {
    assertEquals(
      "4c6s=9c4s=9h6h Qs7h 2sKc=Ks8s Ts5s",
      Solver.process("texas-holdem 5c5dAdAhJd 9h6h 4c6s 9c4s Ts5s Qs7h 2sKc Ks8s"));
  }

  @Test
  public void test_texas_holdem_983_2d3sAhQdTh_Qs5s_Kc9c_Jc4s_2s8s_3c7c_6s2h_Td4h_8cTc() {
    assertEquals(
      "Jc4s Kc9c 2s8s=6s2h 3c7c Td4h 8cTc Qs5s",
      Solver.process("texas-holdem 2d3sAhQdTh Qs5s Kc9c Jc4s 2s8s 3c7c 6s2h Td4h 8cTc"));
  }

  @Test
  public void test_texas_holdem_984_6s8sKcTcTd_As9s_JcQc_8c9c_7hKh_Ad6h_Kd5h_7dAh() {
    assertEquals(
      "JcQc 7dAh As9s Ad6h 8c9c 7hKh=Kd5h",
      Solver.process("texas-holdem 6s8sKcTcTd As9s JcQc 8c9c 7hKh Ad6h Kd5h 7dAh"));
  }

  @Test
  public void test_texas_holdem_985_4c4s9sAdKh_TcTd_ThAh_Js4d_3d2d_7sKc_3cTs_5c9c_Jc2s() {
    assertEquals(
      "3d2d 3cTs Jc2s 5c9c TcTd 7sKc ThAh Js4d",
      Solver.process("texas-holdem 4c4s9sAdKh TcTd ThAh Js4d 3d2d 7sKc 3cTs 5c9c Jc2s"));
  }

  @Test
  public void test_texas_holdem_986_3d7dKsThTs_9d2s_3s9s_3h7s_2hAs_5d9h() {
    assertEquals(
      "5d9h=9d2s 2hAs 3s9s 3h7s",
      Solver.process("texas-holdem 3d7dKsThTs 9d2s 3s9s 3h7s 2hAs 5d9h"));
  }

  @Test
  public void test_texas_holdem_987_3d8c8h8s9d_7sJd_TdJs_5h5s_7d4h_7cQh_2cAc_9h6h() {
    assertEquals(
      "7d4h 7sJd TdJs 7cQh 2cAc 5h5s 9h6h",
      Solver.process("texas-holdem 3d8c8h8s9d 7sJd TdJs 5h5s 7d4h 7cQh 2cAc 9h6h"));
  }

  @Test
  public void test_texas_holdem_988_4h8d9hJdJh_2c6s_Ts4s_2hTh_8cAd_4d5s() {
    assertEquals(
      "2c6s 4d5s Ts4s 8cAd 2hTh",
      Solver.process("texas-holdem 4h8d9hJdJh 2c6s Ts4s 2hTh 8cAd 4d5s"));
  }

  @Test
  public void test_texas_holdem_989_3h6c6s7sTc_5dQd_3dKd() {
    assertEquals(
      "5dQd 3dKd",
      Solver.process("texas-holdem 3h6c6s7sTc 5dQd 3dKd"));
  }

  @Test
  public void test_texas_holdem_990_2d2h4hJcTd_Kh7s_JhJd_AhKd_Qh4s_AcAd_Th6s_Ts2s() {
    assertEquals(
      "Kh7s AhKd Qh4s Th6s AcAd Ts2s JhJd",
      Solver.process("texas-holdem 2d2h4hJcTd Kh7s JhJd AhKd Qh4s AcAd Th6s Ts2s"));
  }

  @Test
  public void test_texas_holdem_991_2h3s9hAhKs_5h9d_6hAs() {
    assertEquals(
      "5h9d 6hAs",
      Solver.process("texas-holdem 2h3s9hAhKs 5h9d 6hAs"));
  }

  @Test
  public void test_texas_holdem_992_2c9dAhJsQh_3h3d_Tc2s() {
    assertEquals(
      "Tc2s 3h3d",
      Solver.process("texas-holdem 2c9dAhJsQh 3h3d Tc2s"));
  }

  @Test
  public void test_texas_holdem_993_2c2s4h5c9h_QsTh_2d6h_9d8c_3c8h() {
    assertEquals(
      "3c8h QsTh 9d8c 2d6h",
      Solver.process("texas-holdem 2c2s4h5c9h QsTh 2d6h 9d8c 3c8h"));
  }

  @Test
  public void test_texas_holdem_994_3h4s6s9cQd_4h2d_Qh3d_2h3s_QsTd_Kd7c_4c7h_9h3c_Tc5s_8c8d() {
    assertEquals(
      "Tc5s Kd7c 2h3s 4h2d 4c7h 8c8d QsTd 9h3c Qh3d",
      Solver.process("texas-holdem 3h4s6s9cQd 4h2d Qh3d 2h3s QsTd Kd7c 4c7h 9h3c Tc5s 8c8d"));
  }

  @Test
  public void test_texas_holdem_995_2d5d7d9hQc_As6h_5sTs_Qs7c_9sTc_Js6s_Td4h_6dKd() {
    assertEquals(
      "Td4h Js6s As6h 5sTs 9sTc Qs7c 6dKd",
      Solver.process("texas-holdem 2d5d7d9hQc As6h 5sTs Qs7c 9sTc Js6s Td4h 6dKd"));
  }

  @Test
  public void test_texas_holdem_996_2s4c4sAhTs_AsKs_2cKh_3h4d_5c5h_6h6s_8c3d_7d8s() {
    assertEquals(
      "7d8s=8c3d 2cKh 5c5h 6h6s 3h4d AsKs",
      Solver.process("texas-holdem 2s4c4sAhTs AsKs 2cKh 3h4d 5c5h 6h6s 8c3d 7d8s"));
  }

  @Test
  public void test_texas_holdem_997_2d5s7hJdQs_8h4d_6h5d() {
    assertEquals(
      "8h4d 6h5d",
      Solver.process("texas-holdem 2d5s7hJdQs 8h4d 6h5d"));
  }

  @Test
  public void test_texas_holdem_998_3c5d6sAsJc_7h2c_3s8c() {
    assertEquals(
      "7h2c 3s8c",
      Solver.process("texas-holdem 3c5d6sAsJc 7h2c 3s8c"));
  }

  @Test
  public void test_texas_holdem_999_5h6s9sAcAd_3h8h_Qc3d_9c6c_4c8d_2d2h_3s7d_7h4d_2cAs_Ts5s() {
    assertEquals(
      "3s7d=7h4d 3h8h=4c8d Qc3d 2d2h Ts5s 9c6c 2cAs",
      Solver.process("texas-holdem 5h6s9sAcAd 3h8h Qc3d 9c6c 4c8d 2d2h 3s7d 7h4d 2cAs Ts5s"));
  }

}
