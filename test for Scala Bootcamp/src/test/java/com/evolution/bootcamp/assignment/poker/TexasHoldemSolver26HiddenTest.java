
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver26HiddenTest {


  @Test
  public void test_texas_holdem_6500_3d3sAsKhTs_Td8d_7dAc_5h6c() {
    assertEquals(
      "5h6c Td8d 7dAc",
      Solver.process("texas-holdem 3d3sAsKhTs Td8d 7dAc 5h6c"));
  }

  @Test
  public void test_texas_holdem_6501_3c3h6h7cTd_5h3d_7s2s_8h4h_5dQs_6dJh() {
    assertEquals(
      "8h4h 5dQs 6dJh 7s2s 5h3d",
      Solver.process("texas-holdem 3c3h6h7cTd 5h3d 7s2s 8h4h 5dQs 6dJh"));
  }

  @Test
  public void test_texas_holdem_6502_7c9cKcKsTh_8c7s_9h3h_5h7h_QdKd_Ac5d_2c5s_8dTs_8hQs_TcJh() {
    assertEquals(
      "2c5s 8hQs Ac5d 5h7h=8c7s 9h3h 8dTs TcJh QdKd",
      Solver.process("texas-holdem 7c9cKcKsTh 8c7s 9h3h 5h7h QdKd Ac5d 2c5s 8dTs 8hQs TcJh"));
  }

  @Test
  public void test_texas_holdem_6503_3c5s7sJdKs_5d7d_3s9s() {
    assertEquals(
      "5d7d 3s9s",
      Solver.process("texas-holdem 3c5s7sJdKs 5d7d 3s9s"));
  }

  @Test
  public void test_texas_holdem_6504_2h2s9dAcJc_6s7c_KcQc_4s3s_TcAd_5hKd_9sJd_Jh5c_8h7d_3h2c() {
    assertEquals(
      "4s3s=6s7c=8h7d 5hKd KcQc Jh5c 9sJd TcAd 3h2c",
      Solver.process("texas-holdem 2h2s9dAcJc 6s7c KcQc 4s3s TcAd 5hKd 9sJd Jh5c 8h7d 3h2c"));
  }

  @Test
  public void test_texas_holdem_6505_2h8dKdKsQs_8s7s_4sAs_5s4h_Td3d_6c6s_JsKh_Ts7h() {
    assertEquals(
      "5s4h Td3d=Ts7h 4sAs 6c6s 8s7s JsKh",
      Solver.process("texas-holdem 2h8dKdKsQs 8s7s 4sAs 5s4h Td3d 6c6s JsKh Ts7h"));
  }

  @Test
  public void test_texas_holdem_6506_3d3h9cJdTc_8s5s_2d8c() {
    assertEquals(
      "2d8c=8s5s",
      Solver.process("texas-holdem 3d3h9cJdTc 8s5s 2d8c"));
  }

  @Test
  public void test_texas_holdem_6507_7c7dJcQhTs_Ad3s_6h6s_9sJd_4d4h_2d9d_6d3c() {
    assertEquals(
      "2d9d=6d3c Ad3s 4d4h 6h6s 9sJd",
      Solver.process("texas-holdem 7c7dJcQhTs Ad3s 6h6s 9sJd 4d4h 2d9d 6d3c"));
  }

  @Test
  public void test_texas_holdem_6508_3d7s9d9hTh_2d5h_Qh2h_TdJd() {
    assertEquals(
      "2d5h Qh2h TdJd",
      Solver.process("texas-holdem 3d7s9d9hTh 2d5h Qh2h TdJd"));
  }

  @Test
  public void test_texas_holdem_6509_3hAsJsKsTh_Td9c_4s8c_Qd7d_4d8s_9sAd_9h2h_2sJd_8h5d() {
    assertEquals(
      "4d8s=4s8c=8h5d 9h2h Td9c 2sJd 9sAd Qd7d",
      Solver.process("texas-holdem 3hAsJsKsTh Td9c 4s8c Qd7d 4d8s 9sAd 9h2h 2sJd 8h5d"));
  }

  @Test
  public void test_texas_holdem_6510_4c9h9sQcQs_6d5d_3h6c_7cTs_Js6s_9d5h_Qd6h() {
    assertEquals(
      "3h6c=6d5d 7cTs Js6s 9d5h Qd6h",
      Solver.process("texas-holdem 4c9h9sQcQs 6d5d 3h6c 7cTs Js6s 9d5h Qd6h"));
  }

  @Test
  public void test_texas_holdem_6511_8c9dJcJsQc_3h8s_4h7d_6s3d_ThQd_JhQh_7s7c_9sJd_2d5d() {
    assertEquals(
      "2d5d=4h7d=6s3d 7s7c 3h8s ThQd 9sJd JhQh",
      Solver.process("texas-holdem 8c9dJcJsQc 3h8s 4h7d 6s3d ThQd JhQh 7s7c 9sJd 2d5d"));
  }

  @Test
  public void test_texas_holdem_6512_4d4h7dAhJs_5s5c_Qd6c_8h2h_8c2d_AcJc_QhJh_7sTd_3hTh() {
    assertEquals(
      "8c2d=8h2h 3hTh Qd6c 5s5c 7sTd QhJh AcJc",
      Solver.process("texas-holdem 4d4h7dAhJs 5s5c Qd6c 8h2h 8c2d AcJc QhJh 7sTd 3hTh"));
  }

  @Test
  public void test_texas_holdem_6513_3h5d7s8dTh_8hQs_7h5s_8c3c_9h2d_Jd6s() {
    assertEquals(
      "9h2d Jd6s 8hQs 7h5s 8c3c",
      Solver.process("texas-holdem 3h5d7s8dTh 8hQs 7h5s 8c3c 9h2d Jd6s"));
  }

  @Test
  public void test_texas_holdem_6514_2d5cJhKsTc_AsTh_Js3s_Jc3h_Ts4s() {
    assertEquals(
      "Ts4s AsTh Jc3h=Js3s",
      Solver.process("texas-holdem 2d5cJhKsTc AsTh Js3s Jc3h Ts4s"));
  }

  @Test
  public void test_texas_holdem_6515_2s5c6cAcKs_9h4h_5s5d_9c3d_4c7d_Ah6d_4sAd_TcTd_2dTh_7cJc() {
    assertEquals(
      "4c7d 9c3d=9h4h 2dTh TcTd 4sAd Ah6d 5s5d 7cJc",
      Solver.process("texas-holdem 2s5c6cAcKs 9h4h 5s5d 9c3d 4c7d Ah6d 4sAd TcTd 2dTh 7cJc"));
  }

  @Test
  public void test_texas_holdem_6516_2c3s4h7sKd_4s5s_3d3h_Js9c_7c9d_7hTh_AcQc_KcKs_6h2d_Qh2h() {
    assertEquals(
      "Js9c AcQc 6h2d Qh2h 4s5s 7c9d 7hTh 3d3h KcKs",
      Solver.process("texas-holdem 2c3s4h7sKd 4s5s 3d3h Js9c 7c9d 7hTh AcQc KcKs 6h2d Qh2h"));
  }

  @Test
  public void test_texas_holdem_6517_3d5d8hKcTs_9cQs_2dJc_8sQh_4h7c_AdTh() {
    assertEquals(
      "4h7c 2dJc 9cQs 8sQh AdTh",
      Solver.process("texas-holdem 3d5d8hKcTs 9cQs 2dJc 8sQh 4h7c AdTh"));
  }

  @Test
  public void test_texas_holdem_6518_7h8h9sQcQd_ThAh_9c2s_Ks9h_5sJs() {
    assertEquals(
      "5sJs ThAh 9c2s Ks9h",
      Solver.process("texas-holdem 7h8h9sQcQd ThAh 9c2s Ks9h 5sJs"));
  }

  @Test
  public void test_texas_holdem_6519_5d6hAdJhJs_ThQs_Ac3h() {
    assertEquals(
      "ThQs Ac3h",
      Solver.process("texas-holdem 5d6hAdJhJs ThQs Ac3h"));
  }

  @Test
  public void test_texas_holdem_6520_2d3c6dAdJh_KcTd_Qd6c_AcQs_AhJc_9s8h_5hKd_9c8d() {
    assertEquals(
      "9c8d=9s8h 5hKd KcTd Qd6c AcQs AhJc",
      Solver.process("texas-holdem 2d3c6dAdJh KcTd Qd6c AcQs AhJc 9s8h 5hKd 9c8d"));
  }

  @Test
  public void test_texas_holdem_6521_4s9c9sJcQd_Ah9d_Kd3c_3s6d_Jh8h_5h2c() {
    assertEquals(
      "5h2c 3s6d Kd3c Jh8h Ah9d",
      Solver.process("texas-holdem 4s9c9sJcQd Ah9d Kd3c 3s6d Jh8h 5h2c"));
  }

  @Test
  public void test_texas_holdem_6522_6c6sAsKsTh_QhQs_2c5c_5sAd() {
    assertEquals(
      "2c5c QhQs 5sAd",
      Solver.process("texas-holdem 6c6sAsKsTh QhQs 2c5c 5sAd"));
  }

  @Test
  public void test_texas_holdem_6523_6h9d9hKdQs_JcTd_Qd6c_2c8d_ThKh_As5c_Ks6d_3s5s() {
    assertEquals(
      "3s5s 2c8d As5c Qd6c Ks6d=ThKh JcTd",
      Solver.process("texas-holdem 6h9d9hKdQs JcTd Qd6c 2c8d ThKh As5c Ks6d 3s5s"));
  }

  @Test
  public void test_texas_holdem_6524_2c2d2s3d4s_9c8d_4d7s() {
    assertEquals(
      "9c8d 4d7s",
      Solver.process("texas-holdem 2c2d2s3d4s 9c8d 4d7s"));
  }

  @Test
  public void test_texas_holdem_6525_4s6s7dAdJd_8h7c_3h9d_5dJh_4cTs_Td3d_Qs2d() {
    assertEquals(
      "3h9d Qs2d 4cTs 8h7c 5dJh Td3d",
      Solver.process("texas-holdem 4s6s7dAdJd 8h7c 3h9d 5dJh 4cTs Td3d Qs2d"));
  }

  @Test
  public void test_texas_holdem_6526_2h3h9sKdTh_5hKc_JcTd_3dKs_5d6c_6dQc_JhTs() {
    assertEquals(
      "5d6c 6dQc JcTd=JhTs 5hKc 3dKs",
      Solver.process("texas-holdem 2h3h9sKdTh 5hKc JcTd 3dKs 5d6c 6dQc JhTs"));
  }

  @Test
  public void test_texas_holdem_6527_2d2s6cJhKs_3d5d_9c9h_Ad7d_4dKh_Kc6s_7h8d() {
    assertEquals(
      "3d5d 7h8d Ad7d 9c9h 4dKh Kc6s",
      Solver.process("texas-holdem 2d2s6cJhKs 3d5d 9c9h Ad7d 4dKh Kc6s 7h8d"));
  }

  @Test
  public void test_texas_holdem_6528_5s6s9dJdQh_3s2d_3h7h() {
    assertEquals(
      "3s2d 3h7h",
      Solver.process("texas-holdem 5s6s9dJdQh 3s2d 3h7h"));
  }

  @Test
  public void test_texas_holdem_6529_7s8dAhJsQh_2hAc_Th3s_JhJc_QsKs_6c9h_6sQc() {
    assertEquals(
      "6c9h Th3s 6sQc QsKs 2hAc JhJc",
      Solver.process("texas-holdem 7s8dAhJsQh 2hAc Th3s JhJc QsKs 6c9h 6sQc"));
  }

  @Test
  public void test_texas_holdem_6530_2d2s4cAdQs_2c4d_Td7d_QdJd_AcKs_As7h() {
    assertEquals(
      "Td7d QdJd As7h AcKs 2c4d",
      Solver.process("texas-holdem 2d2s4cAdQs 2c4d Td7d QdJd AcKs As7h"));
  }

  @Test
  public void test_texas_holdem_6531_3h8dAcAhTh_6c4s_5hJd_JhQh_JcJs_3d7c_3c8s() {
    assertEquals(
      "6c4s 5hJd 3d7c 3c8s JcJs JhQh",
      Solver.process("texas-holdem 3h8dAcAhTh 6c4s 5hJd JhQh JcJs 3d7c 3c8s"));
  }

  @Test
  public void test_texas_holdem_6532_4c5d7sTcTd_TsKd_5cJd_9s2h_5s9c_3s6h_Qd8c_2c6d() {
    assertEquals(
      "2c6d 9s2h Qd8c 5s9c 5cJd TsKd 3s6h",
      Solver.process("texas-holdem 4c5d7sTcTd TsKd 5cJd 9s2h 5s9c 3s6h Qd8c 2c6d"));
  }

  @Test
  public void test_texas_holdem_6533_4s9cJsKdQc_Jd9h_Ad7c_Ks8h_Ts6h_TdJc_Qd5d() {
    assertEquals(
      "Ad7c Qd5d Ks8h Jd9h TdJc=Ts6h",
      Solver.process("texas-holdem 4s9cJsKdQc Jd9h Ad7c Ks8h Ts6h TdJc Qd5d"));
  }

  @Test
  public void test_texas_holdem_6534_2d2h3c4h5s_8hTh_9h3d_Qd3s_3hKh_KcQc_9dAd_6s5h_Ks6c() {
    assertEquals(
      "8hTh KcQc 9h3d Qd3s 3hKh 9dAd 6s5h=Ks6c",
      Solver.process("texas-holdem 2d2h3c4h5s 8hTh 9h3d Qd3s 3hKh KcQc 9dAd 6s5h Ks6c"));
  }

  @Test
  public void test_texas_holdem_6535_2c4h4s6c8h_Jc7h_9s8d_Td6s_JhQd_Jd2h_7dAs_Kh7c() {
    assertEquals(
      "Jc7h JhQd Kh7c 7dAs Jd2h Td6s 9s8d",
      Solver.process("texas-holdem 2c4h4s6c8h Jc7h 9s8d Td6s JhQd Jd2h 7dAs Kh7c"));
  }

  @Test
  public void test_texas_holdem_6536_2s9sJcKsTd_9d8c_3s5s_5d3d_4dQc_8dTs_2d5c_6hAc_Qd3h() {
    assertEquals(
      "5d3d 6hAc 2d5c 9d8c 8dTs 4dQc=Qd3h 3s5s",
      Solver.process("texas-holdem 2s9sJcKsTd 9d8c 3s5s 5d3d 4dQc 8dTs 2d5c 6hAc Qd3h"));
  }

  @Test
  public void test_texas_holdem_6537_7c9dAsJcKs_Qs9c_7d7h_Td2h_4sQh_5h3s_AdQd() {
    assertEquals(
      "5h3s Td2h 4sQh Qs9c AdQd 7d7h",
      Solver.process("texas-holdem 7c9dAsJcKs Qs9c 7d7h Td2h 4sQh 5h3s AdQd"));
  }

  @Test
  public void test_texas_holdem_6538_2c9hAdJdKc_7dJh_6h2s_6cJs() {
    assertEquals(
      "6h2s 6cJs=7dJh",
      Solver.process("texas-holdem 2c9hAdJdKc 7dJh 6h2s 6cJs"));
  }

  @Test
  public void test_texas_holdem_6539_5d6c6d8sJs_6sKd_3d5s_Td4c_2s2d_Kc3c_9c4d() {
    assertEquals(
      "9c4d Td4c Kc3c 2s2d 3d5s 6sKd",
      Solver.process("texas-holdem 5d6c6d8sJs 6sKd 3d5s Td4c 2s2d Kc3c 9c4d"));
  }

  @Test
  public void test_texas_holdem_6540_3s6d9hAcJd_Kc8h_JsTd_Qc4s() {
    assertEquals(
      "Qc4s Kc8h JsTd",
      Solver.process("texas-holdem 3s6d9hAcJd Kc8h JsTd Qc4s"));
  }

  @Test
  public void test_texas_holdem_6541_3s8hKhKsTd_6s4h_5d8s_4cTc_Kd9c_6h8c_Kc2h() {
    assertEquals(
      "6s4h 5d8s=6h8c 4cTc Kc2h Kd9c",
      Solver.process("texas-holdem 3s8hKhKsTd 6s4h 5d8s 4cTc Kd9c 6h8c Kc2h"));
  }

  @Test
  public void test_texas_holdem_6542_5d5h8cAhKc_6h8s_8dKh() {
    assertEquals(
      "6h8s 8dKh",
      Solver.process("texas-holdem 5d5h8cAhKc 6h8s 8dKh"));
  }

  @Test
  public void test_texas_holdem_6543_2s4s7d8dAs_TdTc_Js9c() {
    assertEquals(
      "Js9c TdTc",
      Solver.process("texas-holdem 2s4s7d8dAs TdTc Js9c"));
  }

  @Test
  public void test_texas_holdem_6544_4h5d5h7dAs_Ad9c_7cJh_6sTh_Ks2h_3h3c() {
    assertEquals(
      "6sTh Ks2h 3h3c 7cJh Ad9c",
      Solver.process("texas-holdem 4h5d5h7dAs Ad9c 7cJh 6sTh Ks2h 3h3c"));
  }

  @Test
  public void test_texas_holdem_6545_5c7c8s9cTc_2d3s_AcTh_2sKd_3hQd_8dJc_7hTs_TdKh_QsQc_Kc5h() {
    assertEquals(
      "2d3s 3hQd 2sKd TdKh 7hTs 8dJc QsQc Kc5h AcTh",
      Solver.process("texas-holdem 5c7c8s9cTc 2d3s AcTh 2sKd 3hQd 8dJc 7hTs TdKh QsQc Kc5h"));
  }

  @Test
  public void test_texas_holdem_6546_2c4c5h8sQc_4sQh_3c6s_As7h_KcJc_6hAc() {
    assertEquals(
      "6hAc As7h 4sQh 3c6s KcJc",
      Solver.process("texas-holdem 2c4c5h8sQc 4sQh 3c6s As7h KcJc 6hAc"));
  }

  @Test
  public void test_texas_holdem_6547_4c7h7s8hTc_QcQd_8d3h_2sKd_AhAd_8c5c_2dJd_7c6c() {
    assertEquals(
      "2dJd 2sKd 8c5c=8d3h QcQd AhAd 7c6c",
      Solver.process("texas-holdem 4c7h7s8hTc QcQd 8d3h 2sKd AhAd 8c5c 2dJd 7c6c"));
  }

  @Test
  public void test_texas_holdem_6548_5s9sJcKhQd_Qs9c_4h8h_2d2h_AcTc_KcTh_7h5d() {
    assertEquals(
      "4h8h 2d2h 7h5d Qs9c KcTh AcTc",
      Solver.process("texas-holdem 5s9sJcKhQd Qs9c 4h8h 2d2h AcTc KcTh 7h5d"));
  }

  @Test
  public void test_texas_holdem_6549_2d2h5sKcTc_5hTh_9d6c() {
    assertEquals(
      "9d6c 5hTh",
      Solver.process("texas-holdem 2d2h5sKcTc 5hTh 9d6c"));
  }

  @Test
  public void test_texas_holdem_6550_5s6sAdAsTd_KhAh_3cQh_KcQd_ThJc_5h7c_KsAc() {
    assertEquals(
      "3cQh KcQd 5h7c ThJc KhAh=KsAc",
      Solver.process("texas-holdem 5s6sAdAsTd KhAh 3cQh KcQd ThJc 5h7c KsAc"));
  }

  @Test
  public void test_texas_holdem_6551_4s6h6s9sAh_7sQd_Qs2h_9c5d() {
    assertEquals(
      "7sQd=Qs2h 9c5d",
      Solver.process("texas-holdem 4s6h6s9sAh 7sQd Qs2h 9c5d"));
  }

  @Test
  public void test_texas_holdem_6552_2h8c8d8s9c_4h4c_5c2c_KhAh_9d7d_6h5d_Ks6s() {
    assertEquals(
      "6h5d Ks6s KhAh 5c2c 4h4c 9d7d",
      Solver.process("texas-holdem 2h8c8d8s9c 4h4c 5c2c KhAh 9d7d 6h5d Ks6s"));
  }

  @Test
  public void test_texas_holdem_6553_2s8dJhQhTd_Jc6h_9dJd_Th4c_7dKd_Qc7s_TcKs_Qd7h() {
    assertEquals(
      "7dKd Th4c TcKs Jc6h Qc7s=Qd7h 9dJd",
      Solver.process("texas-holdem 2s8dJhQhTd Jc6h 9dJd Th4c 7dKd Qc7s TcKs Qd7h"));
  }

  @Test
  public void test_texas_holdem_6554_4h5c7h7s8h_7d6s_4dJh_As9s_3d6c_8d3h_8s5d_3sKs_5hAd() {
    assertEquals(
      "3sKs As9s 4dJh 5hAd 8d3h=8s5d 3d6c=7d6s",
      Solver.process("texas-holdem 4h5c7h7s8h 7d6s 4dJh As9s 3d6c 8d3h 8s5d 3sKs 5hAd"));
  }

  @Test
  public void test_texas_holdem_6555_2s3c7hQhTs_4hKc_7s8c_As8d_Ad4d() {
    assertEquals(
      "4hKc Ad4d As8d 7s8c",
      Solver.process("texas-holdem 2s3c7hQhTs 4hKc 7s8c As8d Ad4d"));
  }

  @Test
  public void test_texas_holdem_6556_2c6c6s7dTc_4s5c_5d4h_4cJd_Jh9c_Qd2h_KsKd() {
    assertEquals(
      "4s5c=5d4h 4cJd Jh9c Qd2h KsKd",
      Solver.process("texas-holdem 2c6c6s7dTc 4s5c 5d4h 4cJd Jh9c Qd2h KsKd"));
  }

  @Test
  public void test_texas_holdem_6557_3h5h6c8dQc_8s6d_9d9h_5dQs_3sJs_7cQd() {
    assertEquals(
      "3sJs 9d9h 7cQd 8s6d 5dQs",
      Solver.process("texas-holdem 3h5h6c8dQc 8s6d 9d9h 5dQs 3sJs 7cQd"));
  }

  @Test
  public void test_texas_holdem_6558_2h6c7sAdTh_6d5c_8h3d_KcKh_9c2c_2dJc_5h9d() {
    assertEquals(
      "8h3d 5h9d 9c2c 2dJc 6d5c KcKh",
      Solver.process("texas-holdem 2h6c7sAdTh 6d5c 8h3d KcKh 9c2c 2dJc 5h9d"));
  }

  @Test
  public void test_texas_holdem_6559_4h6c7dJsTh_9c3s_3h5d() {
    assertEquals(
      "9c3s 3h5d",
      Solver.process("texas-holdem 4h6c7dJsTh 9c3s 3h5d"));
  }

  @Test
  public void test_texas_holdem_6560_2d5h7dKdTs_3cAs_QsQd_Qh6s_Ks8h_Ac5s_6d6c_2s9s() {
    assertEquals(
      "Qh6s 3cAs 2s9s Ac5s 6d6c QsQd Ks8h",
      Solver.process("texas-holdem 2d5h7dKdTs 3cAs QsQd Qh6s Ks8h Ac5s 6d6c 2s9s"));
  }

  @Test
  public void test_texas_holdem_6561_3h3s4d4sTs_7sTd_9hQh_2d5d_QsQc_6s7d() {
    assertEquals(
      "2d5d=6s7d 9hQh 7sTd QsQc",
      Solver.process("texas-holdem 3h3s4d4sTs 7sTd 9hQh 2d5d QsQc 6s7d"));
  }

  @Test
  public void test_texas_holdem_6562_4c8d9d9sJc_ThQc_8s4s_5sJh_KcTd_2h3c_5dQd() {
    assertEquals(
      "2h3c 5dQd KcTd 8s4s 5sJh ThQc",
      Solver.process("texas-holdem 4c8d9d9sJc ThQc 8s4s 5sJh KcTd 2h3c 5dQd"));
  }

  @Test
  public void test_texas_holdem_6563_2d6d7s9cJc_5hQs_ThTs_7d5d_7h6c() {
    assertEquals(
      "5hQs 7d5d ThTs 7h6c",
      Solver.process("texas-holdem 2d6d7s9cJc 5hQs ThTs 7d5d 7h6c"));
  }

  @Test
  public void test_texas_holdem_6564_2d2h5h9hAh_JhTc_QsAd_Jd7d() {
    assertEquals(
      "Jd7d QsAd JhTc",
      Solver.process("texas-holdem 2d2h5h9hAh JhTc QsAd Jd7d"));
  }

  @Test
  public void test_texas_holdem_6565_4c4d5s7dAc_Jd4h_Td5h_6d2h_3c7s_7h4s_Jh5c_AsKd_2s6s() {
    assertEquals(
      "2s6s=6d2h Jh5c=Td5h 3c7s AsKd Jd4h 7h4s",
      Solver.process("texas-holdem 4c4d5s7dAc Jd4h Td5h 6d2h 3c7s 7h4s Jh5c AsKd 2s6s"));
  }

  @Test
  public void test_texas_holdem_6566_4h6cAcKhTh_4cJd_5d8c_9d8s_9s9h_TcQh_5cJh_8hKd_AdKs_7hJs() {
    assertEquals(
      "5d8c 9d8s 5cJh 7hJs 4cJd 9s9h TcQh 8hKd AdKs",
      Solver.process("texas-holdem 4h6cAcKhTh 4cJd 5d8c 9d8s 9s9h TcQh 5cJh 8hKd AdKs 7hJs"));
  }

  @Test
  public void test_texas_holdem_6567_2c2h6c8sKd_5hQd_6h7c_7sAh_5dQc_AsQh_Jd6d_8c3d_9d4d() {
    assertEquals(
      "9d4d 5dQc=5hQd 7sAh AsQh 6h7c=Jd6d 8c3d",
      Solver.process("texas-holdem 2c2h6c8sKd 5hQd 6h7c 7sAh 5dQc AsQh Jd6d 8c3d 9d4d"));
  }

  @Test
  public void test_texas_holdem_6568_3h6c6d9sJc_5dJh_8sAc_5hQs_2c3c_3sJs_As7c_4c7h() {
    assertEquals(
      "4c7h 5hQs 8sAc=As7c 2c3c 3sJs=5dJh",
      Solver.process("texas-holdem 3h6c6d9sJc 5dJh 8sAc 5hQs 2c3c 3sJs As7c 4c7h"));
  }

  @Test
  public void test_texas_holdem_6569_AhJcJhTdTs_7h2c_8s6h_2d6c_9sKh_Ks4h() {
    assertEquals(
      "2d6c=7h2c=8s6h=9sKh=Ks4h",
      Solver.process("texas-holdem AhJcJhTdTs 7h2c 8s6h 2d6c 9sKh Ks4h"));
  }

  @Test
  public void test_texas_holdem_6570_3d7d7h9hTc_9s3c_JcKd() {
    assertEquals(
      "JcKd 9s3c",
      Solver.process("texas-holdem 3d7d7h9hTc 9s3c JcKd"));
  }

  @Test
  public void test_texas_holdem_6571_2d2h9dAsTs_Ah8h_Qs4c_3d4d_9sKs_6cQh() {
    assertEquals(
      "3d4d 6cQh=Qs4c 9sKs Ah8h",
      Solver.process("texas-holdem 2d2h9dAsTs Ah8h Qs4c 3d4d 9sKs 6cQh"));
  }

  @Test
  public void test_texas_holdem_6572_2s7cJcJsQd_AdJd_5sQs_3h6h_5cQh() {
    assertEquals(
      "3h6h 5cQh=5sQs AdJd",
      Solver.process("texas-holdem 2s7cJcJsQd AdJd 5sQs 3h6h 5cQh"));
  }

  @Test
  public void test_texas_holdem_6573_AdJcKhKsQs_KdQd_4c3d_2sKc_3c4s() {
    assertEquals(
      "3c4s=4c3d 2sKc KdQd",
      Solver.process("texas-holdem AdJcKhKsQs KdQd 4c3d 2sKc 3c4s"));
  }

  @Test
  public void test_texas_holdem_6574_6c6d9c9hJc_Qs3c_6s4c_TcAs_Qh3h_2d7d_KsKh_Kd7s_3s9d_5hQd() {
    assertEquals(
      "2d7d 5hQd=Qh3h=Qs3c Kd7s TcAs KsKh 6s4c 3s9d",
      Solver.process("texas-holdem 6c6d9c9hJc Qs3c 6s4c TcAs Qh3h 2d7d KsKh Kd7s 3s9d 5hQd"));
  }

  @Test
  public void test_texas_holdem_6575_6h7h8c8dTc_8sKh_Jc5s_JdJs_9h3d_Qs2d_QdAd_2h6d_2c9c_4s6s() {
    assertEquals(
      "Jc5s Qs2d QdAd 2h6d=4s6s JdJs 8sKh 2c9c=9h3d",
      Solver.process("texas-holdem 6h7h8c8dTc 8sKh Jc5s JdJs 9h3d Qs2d QdAd 2h6d 2c9c 4s6s"));
  }

  @Test
  public void test_texas_holdem_6576_4d6d8dAhAs_7h9s_2h3c_4s9d_9hKd_Th2c_Ad3d() {
    assertEquals(
      "2h3c 7h9s Th2c 9hKd 4s9d Ad3d",
      Solver.process("texas-holdem 4d6d8dAhAs 7h9s 2h3c 4s9d 9hKd Th2c Ad3d"));
  }

  @Test
  public void test_texas_holdem_6577_7d8hJhQdQh_Ts3s_Jc2c_4cKs_2h4s() {
    assertEquals(
      "2h4s Ts3s 4cKs Jc2c",
      Solver.process("texas-holdem 7d8hJhQdQh Ts3s Jc2c 4cKs 2h4s"));
  }

  @Test
  public void test_texas_holdem_6578_4c4h5d8c8d_Kc7s_7hQh_6h7c_As8h_Js4s_5c6c_4dAd_9d5h_Ks2c() {
    assertEquals(
      "7hQh Kc7s=Ks2c 5c6c 9d5h 6h7c 4dAd=Js4s As8h",
      Solver.process("texas-holdem 4c4h5d8c8d Kc7s 7hQh 6h7c As8h Js4s 5c6c 4dAd 9d5h Ks2c"));
  }

  @Test
  public void test_texas_holdem_6579_6c7dKcQcQd_5dKd_2cQs() {
    assertEquals(
      "5dKd 2cQs",
      Solver.process("texas-holdem 6c7dKcQcQd 5dKd 2cQs"));
  }

  @Test
  public void test_texas_holdem_6580_5c6d6s9sTs_2sKh_8cAh_Jd4d_4h9h_Tc5d_QcAd_7dKs_4cTh() {
    assertEquals(
      "Jd4d 2sKh=7dKs 8cAh QcAd 4h9h 4cTh=Tc5d",
      Solver.process("texas-holdem 5c6d6s9sTs 2sKh 8cAh Jd4d 4h9h Tc5d QcAd 7dKs 4cTh"));
  }

  @Test
  public void test_texas_holdem_6581_2c2d4d9sTc_6cTh_9h8d_QhJh_Ac8s_TdAh_3h3d() {
    assertEquals(
      "QhJh Ac8s 3h3d 9h8d 6cTh TdAh",
      Solver.process("texas-holdem 2c2d4d9sTc 6cTh 9h8d QhJh Ac8s TdAh 3h3d"));
  }

  @Test
  public void test_texas_holdem_6582_2d3h4sTdTs_7s9c_6c6s_JsKc_5c9h() {
    assertEquals(
      "5c9h 7s9c JsKc 6c6s",
      Solver.process("texas-holdem 2d3h4sTdTs 7s9c 6c6s JsKc 5c9h"));
  }

  @Test
  public void test_texas_holdem_6583_2h8hKcTcTh_8d9d_7cJc_4s8s_3cAh_Qs8c_QhKh_9s7h() {
    assertEquals(
      "9s7h 7cJc 3cAh 4s8s=8d9d=Qs8c QhKh",
      Solver.process("texas-holdem 2h8hKcTcTh 8d9d 7cJc 4s8s 3cAh Qs8c QhKh 9s7h"));
  }

  @Test
  public void test_texas_holdem_6584_4h9hAdAsQs_Jh6s_6c9c_5d7c_8h6d_Qh2d_7h2c() {
    assertEquals(
      "5d7c=7h2c 8h6d Jh6s 6c9c Qh2d",
      Solver.process("texas-holdem 4h9hAdAsQs Jh6s 6c9c 5d7c 8h6d Qh2d 7h2c"));
  }

  @Test
  public void test_texas_holdem_6585_6c8sAhJhQc_QhJs_9cJd() {
    assertEquals(
      "9cJd QhJs",
      Solver.process("texas-holdem 6c8sAhJhQc QhJs 9cJd"));
  }

  @Test
  public void test_texas_holdem_6586_5s6s9hAcKs_9d4s_4c5d_3d2d_Kd7s_7cJd_As4h_8cKh_5cAh() {
    assertEquals(
      "3d2d 7cJd 4c5d 9d4s Kd7s 8cKh As4h 5cAh",
      Solver.process("texas-holdem 5s6s9hAcKs 9d4s 4c5d 3d2d Kd7s 7cJd As4h 8cKh 5cAh"));
  }

  @Test
  public void test_texas_holdem_6587_2c4c9hKcQc_5dAh_6c9d_8c5s() {
    assertEquals(
      "5dAh 6c9d 8c5s",
      Solver.process("texas-holdem 2c4c9hKcQc 5dAh 6c9d 8c5s"));
  }

  @Test
  public void test_texas_holdem_6588_2c5h9cAhAs_7s2h_Qd6c_6s3c_Js5s_AcQh_2dTc_6d2s_Qc9s_JdTd() {
    assertEquals(
      "6s3c JdTd Qd6c 6d2s=7s2h 2dTc Js5s Qc9s AcQh",
      Solver.process("texas-holdem 2c5h9cAhAs 7s2h Qd6c 6s3c Js5s AcQh 2dTc 6d2s Qc9s JdTd"));
  }

  @Test
  public void test_texas_holdem_6589_5c6cKdQdTs_Kh9d_Ad2s_4c7d() {
    assertEquals(
      "4c7d Ad2s Kh9d",
      Solver.process("texas-holdem 5c6cKdQdTs Kh9d Ad2s 4c7d"));
  }

  @Test
  public void test_texas_holdem_6590_3s7hJsKdTs_6s5s_3c8h_6d5c_6hJh_2h3d_Ad7d_3h9s_8sAs_KhTc() {
    assertEquals(
      "6d5c 2h3d=3c8h=3h9s Ad7d 6hJh KhTc 6s5s 8sAs",
      Solver.process("texas-holdem 3s7hJsKdTs 6s5s 3c8h 6d5c 6hJh 2h3d Ad7d 3h9s 8sAs KhTc"));
  }

  @Test
  public void test_texas_holdem_6591_5c6hAsJcKh_Th3s_6c2d_Jh7h_8hTc_6dAh_8c8s_AdQh() {
    assertEquals(
      "Th3s 8hTc 6c2d 8c8s Jh7h AdQh 6dAh",
      Solver.process("texas-holdem 5c6hAsJcKh Th3s 6c2d Jh7h 8hTc 6dAh 8c8s AdQh"));
  }

  @Test
  public void test_texas_holdem_6592_2c4c6d9dKh_Ah5c_Kc8s() {
    assertEquals(
      "Ah5c Kc8s",
      Solver.process("texas-holdem 2c4c6d9dKh Ah5c Kc8s"));
  }

  @Test
  public void test_texas_holdem_6593_2s7h8c8dQd_9dJh_5h5d_7dAs_Jc9c_Ah8s() {
    assertEquals(
      "9dJh=Jc9c 5h5d 7dAs Ah8s",
      Solver.process("texas-holdem 2s7h8c8dQd 9dJh 5h5d 7dAs Jc9c Ah8s"));
  }

  @Test
  public void test_texas_holdem_6594_2d7dJsQdTc_5c7c_3c5d_8hKh_4s2h_AdKd_4h4c_Jc6d_7h6s_5s3d() {
    assertEquals(
      "3c5d=5s3d 8hKh 4s2h 4h4c 5c7c=7h6s Jc6d AdKd",
      Solver.process("texas-holdem 2d7dJsQdTc 5c7c 3c5d 8hKh 4s2h AdKd 4h4c Jc6d 7h6s 5s3d"));
  }

  @Test
  public void test_texas_holdem_6595_4d4sJcKdQc_Ts6d_6cQs() {
    assertEquals(
      "Ts6d 6cQs",
      Solver.process("texas-holdem 4d4sJcKdQc Ts6d 6cQs"));
  }

  @Test
  public void test_texas_holdem_6596_4cAcAdAhJh_Js4s_KsAs_ThTs_4dKh_2c9c_5s8h() {
    assertEquals(
      "5s8h 2c9c 4dKh ThTs Js4s KsAs",
      Solver.process("texas-holdem 4cAcAdAhJh Js4s KsAs ThTs 4dKh 2c9c 5s8h"));
  }

  @Test
  public void test_texas_holdem_6597_3c8d8s9hJs_8hTd_Qd9s_4d3s() {
    assertEquals(
      "4d3s Qd9s 8hTd",
      Solver.process("texas-holdem 3c8d8s9hJs 8hTd Qd9s 4d3s"));
  }

  @Test
  public void test_texas_holdem_6598_4h4s6cAdQh_Js8s_Th5h_Qd6h_9h9s_Kd2d() {
    assertEquals(
      "Th5h Js8s Kd2d 9h9s Qd6h",
      Solver.process("texas-holdem 4h4s6cAdQh Js8s Th5h Qd6h 9h9s Kd2d"));
  }

  @Test
  public void test_texas_holdem_6599_3c4c7c9dTc_5c9s_5hKh_Jh4h_Ts7h_8s2d_2sTh_QdAs_Td3h() {
    assertEquals(
      "8s2d 5hKh QdAs Jh4h 2sTh Td3h Ts7h 5c9s",
      Solver.process("texas-holdem 3c4c7c9dTc 5c9s 5hKh Jh4h Ts7h 8s2d 2sTh QdAs Td3h"));
  }

  @Test
  public void test_texas_holdem_6600_3c3dJdKdQs_5d3h_7h3s_AhJh_8c7s_AsJs() {
    assertEquals(
      "8c7s AhJh=AsJs 5d3h=7h3s",
      Solver.process("texas-holdem 3c3dJdKdQs 5d3h 7h3s AhJh 8c7s AsJs"));
  }

  @Test
  public void test_texas_holdem_6601_2d5dAdJhKd_4d3d_8hTc_2cAh_7h4c_Ac5h_Js3s() {
    assertEquals(
      "7h4c 8hTc Js3s 2cAh Ac5h 4d3d",
      Solver.process("texas-holdem 2d5dAdJhKd 4d3d 8hTc 2cAh 7h4c Ac5h Js3s"));
  }

  @Test
  public void test_texas_holdem_6602_3c7d7hJhKh_9d4c_Ks3s_7s8d_2cAs_4sAh() {
    assertEquals(
      "9d4c 2cAs=4sAh Ks3s 7s8d",
      Solver.process("texas-holdem 3c7d7hJhKh 9d4c Ks3s 7s8d 2cAs 4sAh"));
  }

  @Test
  public void test_texas_holdem_6603_3d4c5d6dTc_5h3s_KdJd_2c4h_9d4d_JhAd_Qh7h_7c7d_9sTd() {
    assertEquals(
      "JhAd 9sTd 5h3s 2c4h 7c7d=Qh7h 9d4d KdJd",
      Solver.process("texas-holdem 3d4c5d6dTc 5h3s KdJd 2c4h 9d4d JhAd Qh7h 7c7d 9sTd"));
  }

  @Test
  public void test_texas_holdem_6604_5c6d7dKsTs_Ah6s_Kd5d() {
    assertEquals(
      "Ah6s Kd5d",
      Solver.process("texas-holdem 5c6d7dKsTs Ah6s Kd5d"));
  }

  @Test
  public void test_texas_holdem_6605_3h4h6d9sJc_8sTh_2sKc_Kd8c_5sTd_QdKs_Qs5d_Jh4s_3dAc() {
    assertEquals(
      "5sTd 8sTh Qs5d 2sKc Kd8c QdKs 3dAc Jh4s",
      Solver.process("texas-holdem 3h4h6d9sJc 8sTh 2sKc Kd8c 5sTd QdKs Qs5d Jh4s 3dAc"));
  }

  @Test
  public void test_texas_holdem_6606_3s5c7hAdJd_Tc2s_8h9s_Ah6h_6sTd_2cKd_QdJh_2h8c_8sAc() {
    assertEquals(
      "2h8c 8h9s Tc2s 6sTd 2cKd QdJh Ah6h 8sAc",
      Solver.process("texas-holdem 3s5c7hAdJd Tc2s 8h9s Ah6h 6sTd 2cKd QdJh 2h8c 8sAc"));
  }

  @Test
  public void test_texas_holdem_6607_4c6c6d6hJh_5h7c_6s7s_QcKs_7d2c_3h3c_2s5s_As9h_Th8d_2h8h() {
    assertEquals(
      "2s5s 5h7c=7d2c 2h8h Th8d QcKs As9h 3h3c 6s7s",
      Solver.process("texas-holdem 4c6c6d6hJh 5h7c 6s7s QcKs 7d2c 3h3c 2s5s As9h Th8d 2h8h"));
  }

  @Test
  public void test_texas_holdem_6608_4d5h9dAhKc_3cAd_6cJd_8h2s_2dQs_5c4s_Qc7d_4cTd_Ac6h_9s5d() {
    assertEquals(
      "8h2s 6cJd 2dQs Qc7d 4cTd 3cAd Ac6h 5c4s 9s5d",
      Solver.process("texas-holdem 4d5h9dAhKc 3cAd 6cJd 8h2s 2dQs 5c4s Qc7d 4cTd Ac6h 9s5d"));
  }

  @Test
  public void test_texas_holdem_6609_2d3s9sJcJs_TdJh_9c9d_4sQd_Qs8c_4dKs() {
    assertEquals(
      "4sQd Qs8c 4dKs TdJh 9c9d",
      Solver.process("texas-holdem 2d3s9sJcJs TdJh 9c9d 4sQd Qs8c 4dKs"));
  }

  @Test
  public void test_texas_holdem_6610_2c7s8h8sTh_JsAs_TdAh_Qc5s() {
    assertEquals(
      "Qc5s JsAs TdAh",
      Solver.process("texas-holdem 2c7s8h8sTh JsAs TdAh Qc5s"));
  }

  @Test
  public void test_texas_holdem_6611_7c7hJdKcTs_Ks6s_2c4c_Ah7s_3d9d_5c4h_6h8d_Js7d() {
    assertEquals(
      "2c4c=3d9d=5c4h=6h8d Ks6s Ah7s Js7d",
      Solver.process("texas-holdem 7c7hJdKcTs Ks6s 2c4c Ah7s 3d9d 5c4h 6h8d Js7d"));
  }

  @Test
  public void test_texas_holdem_6612_3d5d5sAdKh_KcQh_3h3c_Jh6h_6dAh_Tc7s_6s9h_Qs4c_8c9d_5cKs() {
    assertEquals(
      "6s9h=8c9d Tc7s Jh6h Qs4c KcQh 6dAh 3h3c 5cKs",
      Solver.process("texas-holdem 3d5d5sAdKh KcQh 3h3c Jh6h 6dAh Tc7s 6s9h Qs4c 8c9d 5cKs"));
  }

  @Test
  public void test_texas_holdem_6613_5h7hJsKcQd_KhAd_5s3d_3h4s_9s8s_2s8h_Jd7d_Jh6d() {
    assertEquals(
      "3h4s 2s8h 9s8s 5s3d Jh6d KhAd Jd7d",
      Solver.process("texas-holdem 5h7hJsKcQd KhAd 5s3d 3h4s 9s8s 2s8h Jd7d Jh6d"));
  }

  @Test
  public void test_texas_holdem_6614_6sJsKcQdTd_Ks4d_KhTs_2h6h_QcQh_4s3d_9c2c_8d6d_Jh6c_Th2d() {
    assertEquals(
      "4s3d 2h6h=8d6d Th2d Ks4d Jh6c KhTs QcQh 9c2c",
      Solver.process("texas-holdem 6sJsKcQdTd Ks4d KhTs 2h6h QcQh 4s3d 9c2c 8d6d Jh6c Th2d"));
  }

  @Test
  public void test_texas_holdem_6615_3c3h6s7cQd_3sQh_AsJd_Qs3d() {
    assertEquals(
      "AsJd 3sQh=Qs3d",
      Solver.process("texas-holdem 3c3h6s7cQd 3sQh AsJd Qs3d"));
  }

  @Test
  public void test_texas_holdem_6616_2s7d8dJsQh_Qc7s_4h3s_2h3d_6c5d_Ts6s_2d5h() {
    assertEquals(
      "4h3s 6c5d Ts6s 2d5h=2h3d Qc7s",
      Solver.process("texas-holdem 2s7d8dJsQh Qc7s 4h3s 2h3d 6c5d Ts6s 2d5h"));
  }

  @Test
  public void test_texas_holdem_6617_4hAhJcTcTh_Kc2c_5h6d_3d6h_6c6s() {
    assertEquals(
      "3d6h=5h6d Kc2c 6c6s",
      Solver.process("texas-holdem 4hAhJcTcTh Kc2c 5h6d 3d6h 6c6s"));
  }

  @Test
  public void test_texas_holdem_6618_4d5d5s8cTs_QcJc_Kd4c_TdQs_6sJs_Ad4h_Ac3s_9cQh() {
    assertEquals(
      "6sJs 9cQh QcJc Ac3s Kd4c Ad4h TdQs",
      Solver.process("texas-holdem 4d5d5s8cTs QcJc Kd4c TdQs 6sJs Ad4h Ac3s 9cQh"));
  }

  @Test
  public void test_texas_holdem_6619_2c5hAdAhKs_Kh5d_AcTc_Jh9c() {
    assertEquals(
      "Jh9c Kh5d AcTc",
      Solver.process("texas-holdem 2c5hAdAhKs Kh5d AcTc Jh9c"));
  }

  @Test
  public void test_texas_holdem_6620_7c9c9sJsQh_4c8s_8cJh() {
    assertEquals(
      "4c8s 8cJh",
      Solver.process("texas-holdem 7c9c9sJsQh 4c8s 8cJh"));
  }

  @Test
  public void test_texas_holdem_6621_3c6h9sAhQd_4s8h_3s9d_Jd2h_2d7s_2s5d() {
    assertEquals(
      "2s5d 2d7s 4s8h Jd2h 3s9d",
      Solver.process("texas-holdem 3c6h9sAhQd 4s8h 3s9d Jd2h 2d7s 2s5d"));
  }

  @Test
  public void test_texas_holdem_6622_8hAcAsJhTh_TdKh_TsKs_6h4c_6s9h_4d7d_Qd2c_2h5c_5h6d_3d7s() {
    assertEquals(
      "2h5c=3d7s=4d7d=5h6d=6h4c 6s9h Qd2c TdKh=TsKs",
      Solver.process("texas-holdem 8hAcAsJhTh TdKh TsKs 6h4c 6s9h 4d7d Qd2c 2h5c 5h6d 3d7s"));
  }

  @Test
  public void test_texas_holdem_6623_9dAcKsQdQs_3cJd_Qh9s_4d9c_8h8s_Kd3s_6s7h_7d3h_As2c() {
    assertEquals(
      "6s7h=7d3h 3cJd 8h8s 4d9c Kd3s As2c Qh9s",
      Solver.process("texas-holdem 9dAcKsQdQs 3cJd Qh9s 4d9c 8h8s Kd3s 6s7h 7d3h As2c"));
  }

  @Test
  public void test_texas_holdem_6624_3c4d4hKdQs_9sQc_Js8s_KhTc_7cQh_Jd5c_9h8h_Jh4s_7d6h() {
    assertEquals(
      "7d6h 9h8h Jd5c=Js8s 7cQh=9sQc KhTc Jh4s",
      Solver.process("texas-holdem 3c4d4hKdQs 9sQc Js8s KhTc 7cQh Jd5c 9h8h Jh4s 7d6h"));
  }

  @Test
  public void test_texas_holdem_6625_2c5h6dAhKd_Qh4h_As3d_JhQc_2sAd_5d8c_2d5s_7c3h_Ks7s_7d8h() {
    assertEquals(
      "7c3h 7d8h Qh4h JhQc 5d8c Ks7s As3d 2d5s 2sAd",
      Solver.process("texas-holdem 2c5h6dAhKd Qh4h As3d JhQc 2sAd 5d8c 2d5s 7c3h Ks7s 7d8h"));
  }

  @Test
  public void test_texas_holdem_6626_3c7h9c9hJs_9s6s_5d8d_4dKc_Kh2s() {
    assertEquals(
      "5d8d 4dKc=Kh2s 9s6s",
      Solver.process("texas-holdem 3c7h9c9hJs 9s6s 5d8d 4dKc Kh2s"));
  }

  @Test
  public void test_texas_holdem_6627_3c4d5s6d9s_8h6h_9d2c_Kh9h_5h5d_7d3s() {
    assertEquals(
      "8h6h Kh9h 5h5d 9d2c 7d3s",
      Solver.process("texas-holdem 3c4d5s6d9s 8h6h 9d2c Kh9h 5h5d 7d3s"));
  }

  @Test
  public void test_texas_holdem_6628_4h5hJcJsTh_3hQs_9d6d_2c4c_7sQd_3sJh_2sQh_5cAs_4dKs() {
    assertEquals(
      "9d6d 2sQh=3hQs 7sQd 2c4c 4dKs 5cAs 3sJh",
      Solver.process("texas-holdem 4h5hJcJsTh 3hQs 9d6d 2c4c 7sQd 3sJh 2sQh 5cAs 4dKs"));
  }

  @Test
  public void test_texas_holdem_6629_2c2h6hKhQd_QsTh_KdJd_5h5s_7c3h_8s9s() {
    assertEquals(
      "7c3h 8s9s 5h5s QsTh KdJd",
      Solver.process("texas-holdem 2c2h6hKhQd QsTh KdJd 5h5s 7c3h 8s9s"));
  }

  @Test
  public void test_texas_holdem_6630_4h7hAcJsKd_4dKc_Ts5c_Ad6c() {
    assertEquals(
      "Ts5c Ad6c 4dKc",
      Solver.process("texas-holdem 4h7hAcJsKd 4dKc Ts5c Ad6c"));
  }

  @Test
  public void test_texas_holdem_6631_2c3s8s9hJs_QdKs_Tc8c_6sTd_2s9c_5s9s_QhTh_Qs3h() {
    assertEquals(
      "6sTd QdKs Qs3h Tc8c 2s9c QhTh 5s9s",
      Solver.process("texas-holdem 2c3s8s9hJs QdKs Tc8c 6sTd 2s9c 5s9s QhTh Qs3h"));
  }

  @Test
  public void test_texas_holdem_6632_5s7c8sAsJs_8cQd_Ah9c_7dQh_2h3d_Th6h_KhAc_3sJc_3c4d() {
    assertEquals(
      "2h3d=3c4d Th6h 7dQh 8cQd Ah9c KhAc 3sJc",
      Solver.process("texas-holdem 5s7c8sAsJs 8cQd Ah9c 7dQh 2h3d Th6h KhAc 3sJc 3c4d"));
  }

  @Test
  public void test_texas_holdem_6633_4s5s8s9sAs_3c7s_5d7c_KdAd() {
    assertEquals(
      "5d7c=KdAd 3c7s",
      Solver.process("texas-holdem 4s5s8s9sAs 3c7s 5d7c KdAd"));
  }

  @Test
  public void test_texas_holdem_6634_7s8cAcAhJs_7h7d_2dQh_QdKs_QcKc_Ts2s_KhAd_9c5h_9sJc() {
    assertEquals(
      "9c5h Ts2s 2dQh QcKc=QdKs 9sJc KhAd 7h7d",
      Solver.process("texas-holdem 7s8cAcAhJs 7h7d 2dQh QdKs QcKc Ts2s KhAd 9c5h 9sJc"));
  }

  @Test
  public void test_texas_holdem_6635_7h8dKsQhTc_QdJh_7s4c_Ts4h_6s7c_2h3d_6dAs_2cJc_Js2d() {
    assertEquals(
      "2h3d 2cJc=Js2d 6dAs 6s7c=7s4c Ts4h QdJh",
      Solver.process("texas-holdem 7h8dKsQhTc QdJh 7s4c Ts4h 6s7c 2h3d 6dAs 2cJc Js2d"));
  }

  @Test
  public void test_texas_holdem_6636_6h7h9dJsTc_5c8h_AdJd_QdJh_2d9s() {
    assertEquals(
      "2d9s QdJh AdJd 5c8h",
      Solver.process("texas-holdem 6h7h9dJsTc 5c8h AdJd QdJh 2d9s"));
  }

  @Test
  public void test_texas_holdem_6637_8sJcQsTcTd_AdJd_6hTs_7s5c_3d6s_3s7c_2sQh_4c9h_4hAs_9s8c() {
    assertEquals(
      "3d6s=3s7c=7s5c 4hAs AdJd 2sQh 6hTs 4c9h=9s8c",
      Solver.process("texas-holdem 8sJcQsTcTd AdJd 6hTs 7s5c 3d6s 3s7c 2sQh 4c9h 4hAs 9s8c"));
  }

  @Test
  public void test_texas_holdem_6638_3c3h4c7c9d_7sKh_6cTd_7hAs_5s8c_Kd8s() {
    assertEquals(
      "5s8c 6cTd Kd8s 7sKh 7hAs",
      Solver.process("texas-holdem 3c3h4c7c9d 7sKh 6cTd 7hAs 5s8c Kd8s"));
  }

  @Test
  public void test_texas_holdem_6639_2d7d9cKsTh_6sTc_9dJh_6h7h_8h8d_Kh4c_TdAc_2s4h_Kd9h_4sQc() {
    assertEquals(
      "4sQc 2s4h 6h7h 8h8d 9dJh 6sTc TdAc Kh4c Kd9h",
      Solver.process("texas-holdem 2d7d9cKsTh 6sTc 9dJh 6h7h 8h8d Kh4c TdAc 2s4h Kd9h 4sQc"));
  }

  @Test
  public void test_texas_holdem_6640_2c4d6sAcKs_6hTd_QdJc_7c8h_Tc8c_5cAh_6c7s_3cQs_2d9d_As3d() {
    assertEquals(
      "7c8h Tc8c 3cQs QdJc 2d9d 6c7s 6hTd As3d 5cAh",
      Solver.process("texas-holdem 2c4d6sAcKs 6hTd QdJc 7c8h Tc8c 5cAh 6c7s 3cQs 2d9d As3d"));
  }

  @Test
  public void test_texas_holdem_6641_7s9c9hJsTd_AhAd_3sJd_8s2d_6s4h_8d7c_TcJc_6h6c_KcKs() {
    assertEquals(
      "6s4h 6h6c 3sJd TcJc KcKs AhAd 8d7c=8s2d",
      Solver.process("texas-holdem 7s9c9hJsTd AhAd 3sJd 8s2d 6s4h 8d7c TcJc 6h6c KcKs"));
  }

  @Test
  public void test_texas_holdem_6642_2s3d3h6hJc_8s3s_5cAs_9d6c_2hJs() {
    assertEquals(
      "5cAs 9d6c 2hJs 8s3s",
      Solver.process("texas-holdem 2s3d3h6hJc 8s3s 5cAs 9d6c 2hJs"));
  }

  @Test
  public void test_texas_holdem_6643_2h5dAhJdKh_KcAs_Qs3d_8d9d_TdKs_ThTc_4sJs_7dQh() {
    assertEquals(
      "8d9d Qs3d 7dQh ThTc 4sJs TdKs KcAs",
      Solver.process("texas-holdem 2h5dAhJdKh KcAs Qs3d 8d9d TdKs ThTc 4sJs 7dQh"));
  }

  @Test
  public void test_texas_holdem_6644_3c3d5dQdQs_Ks4d_JsTc_5h3s_Ac2h_9h2c_3h6c() {
    assertEquals(
      "9h2c JsTc Ks4d Ac2h 3h6c=5h3s",
      Solver.process("texas-holdem 3c3d5dQdQs Ks4d JsTc 5h3s Ac2h 9h2c 3h6c"));
  }

  @Test
  public void test_texas_holdem_6645_3s8c8h9d9s_4dTd_JcKc_5c7s() {
    assertEquals(
      "5c7s 4dTd JcKc",
      Solver.process("texas-holdem 3s8c8h9d9s 4dTd JcKc 5c7s"));
  }

  @Test
  public void test_texas_holdem_6646_2c3s5h5sKs_Kd3d_7hAs_4s9c_2d6h_6dQc_QhAd_Jc6c_TsAc_9sKc() {
    assertEquals(
      "4s9c Jc6c 6dQc 7hAs TsAc QhAd 2d6h Kd3d 9sKc",
      Solver.process("texas-holdem 2c3s5h5sKs Kd3d 7hAs 4s9c 2d6h 6dQc QhAd Jc6c TsAc 9sKc"));
  }

  @Test
  public void test_texas_holdem_6647_6dKcKhQhTs_AdQd_8sAs_6c4h() {
    assertEquals(
      "8sAs 6c4h AdQd",
      Solver.process("texas-holdem 6dKcKhQhTs AdQd 8sAs 6c4h"));
  }

  @Test
  public void test_texas_holdem_6648_6h9hJdKcQd_TcTh_8dAc_Kd9d_As3s_Qh5s_5d2h_2dQs() {
    assertEquals(
      "5d2h 8dAc=As3s 2dQs=Qh5s Kd9d TcTh",
      Solver.process("texas-holdem 6h9hJdKcQd TcTh 8dAc Kd9d As3s Qh5s 5d2h 2dQs"));
  }

  @Test
  public void test_texas_holdem_6649_3h4d8c9sJs_7d3c_6h3d_9cKh_8dKc() {
    assertEquals(
      "6h3d=7d3c 8dKc 9cKh",
      Solver.process("texas-holdem 3h4d8c9sJs 7d3c 6h3d 9cKh 8dKc"));
  }

  @Test
  public void test_texas_holdem_6650_6h9dAcJcQd_4cJd_TdQc() {
    assertEquals(
      "4cJd TdQc",
      Solver.process("texas-holdem 6h9dAcJcQd 4cJd TdQc"));
  }

  @Test
  public void test_texas_holdem_6651_7c7s9h9sAd_3d5d_6d3h_KdTs_4c7d_5sKs() {
    assertEquals(
      "3d5d=5sKs=6d3h=KdTs 4c7d",
      Solver.process("texas-holdem 7c7s9h9sAd 3d5d 6d3h KdTs 4c7d 5sKs"));
  }

  @Test
  public void test_texas_holdem_6652_4c5sKsQcTs_8s8h_3h7d_AdQd() {
    assertEquals(
      "3h7d 8s8h AdQd",
      Solver.process("texas-holdem 4c5sKsQcTs 8s8h 3h7d AdQd"));
  }

  @Test
  public void test_texas_holdem_6653_4h5dJhQsTc_QhTd_8c2h_6hKs_AhKh_6s2c_8s7s_5s6d_4sKc_7d3s() {
    assertEquals(
      "6s2c 7d3s 8c2h 8s7s 6hKs 4sKc 5s6d QhTd AhKh",
      Solver.process("texas-holdem 4h5dJhQsTc QhTd 8c2h 6hKs AhKh 6s2c 8s7s 5s6d 4sKc 7d3s"));
  }

  @Test
  public void test_texas_holdem_6654_2h2s5c6h7d_3h6s_4c8d_KhQh_4hAh_5h7c_5d3d_5sTd() {
    assertEquals(
      "KhQh 4hAh 5d3d 5sTd 3h6s 5h7c 4c8d",
      Solver.process("texas-holdem 2h2s5c6h7d 3h6s 4c8d KhQh 4hAh 5h7c 5d3d 5sTd"));
  }

  @Test
  public void test_texas_holdem_6655_5h6h6sAsTd_4s2c_Kh6d() {
    assertEquals(
      "4s2c Kh6d",
      Solver.process("texas-holdem 5h6h6sAsTd 4s2c Kh6d"));
  }

  @Test
  public void test_texas_holdem_6656_3c4hJdQcTs_2c6c_7s7c_Th9s_4c7d_8d6h_QdJc_Kh3h_3s5c() {
    assertEquals(
      "2c6c 8d6h 3s5c Kh3h 4c7d 7s7c Th9s QdJc",
      Solver.process("texas-holdem 3c4hJdQcTs 2c6c 7s7c Th9s 4c7d 8d6h QdJc Kh3h 3s5c"));
  }

  @Test
  public void test_texas_holdem_6657_4d7c8s9sJs_6dQd_2h4c_TdTs_5dJc_7sQc_TcAd_9cJd_Kd3c_8d9h() {
    assertEquals(
      "6dQd Kd3c 2h4c 7sQc 5dJc 8d9h 9cJd TcAd=TdTs",
      Solver.process("texas-holdem 4d7c8s9sJs 6dQd 2h4c TdTs 5dJc 7sQc TcAd 9cJd Kd3c 8d9h"));
  }

  @Test
  public void test_texas_holdem_6658_2h4c6h9cAh_6dTc_Ts6c_Ad7s_QsAs_3h8c_JsTd_9sJc_6sJd() {
    assertEquals(
      "3h8c JsTd 6dTc=Ts6c 6sJd 9sJc Ad7s QsAs",
      Solver.process("texas-holdem 2h4c6h9cAh 6dTc Ts6c Ad7s QsAs 3h8c JsTd 9sJc 6sJd"));
  }

  @Test
  public void test_texas_holdem_6659_5dJsKsQcTc_7cAd_Jh5s_3h4c_6h4s_9d2s_Kc7d_8s3s_Qs5h_2hJd() {
    assertEquals(
      "3h4c 6h4s 8s3s 2hJd Kc7d Jh5s Qs5h 9d2s 7cAd",
      Solver.process("texas-holdem 5dJsKsQcTc 7cAd Jh5s 3h4c 6h4s 9d2s Kc7d 8s3s Qs5h 2hJd"));
  }

  @Test
  public void test_texas_holdem_6660_5c8h9d9sTd_6c7d_Qc6h_Qd7c_Ah4c_9hAd_Js9c_6sJc_4s3h_5hAc() {
    assertEquals(
      "4s3h 6sJc Qc6h=Qd7c Ah4c 5hAc Js9c 9hAd 6c7d",
      Solver.process("texas-holdem 5c8h9d9sTd 6c7d Qc6h Qd7c Ah4c 9hAd Js9c 6sJc 4s3h 5hAc"));
  }

  @Test
  public void test_texas_holdem_6661_6h7h8cJcQs_9d3c_4dQh() {
    assertEquals(
      "9d3c 4dQh",
      Solver.process("texas-holdem 6h7h8cJcQs 9d3c 4dQh"));
  }

  @Test
  public void test_texas_holdem_6662_3d4h6dAdQc_TcJc_Td9h_8hKd_Kc5c_5d2c_8cAs_QsJd_5s8s_Qd4d() {
    assertEquals(
      "5s8s Td9h TcJc Kc5c 8hKd QsJd 8cAs 5d2c Qd4d",
      Solver.process("texas-holdem 3d4h6dAdQc TcJc Td9h 8hKd Kc5c 5d2c 8cAs QsJd 5s8s Qd4d"));
  }

  @Test
  public void test_texas_holdem_6663_2h2s7cAhAs_8d4c_7dJd_Qc8c_Ac9h_9s5c_3s6d() {
    assertEquals(
      "3s6d 8d4c 9s5c Qc8c 7dJd Ac9h",
      Solver.process("texas-holdem 2h2s7cAhAs 8d4c 7dJd Qc8c Ac9h 9s5c 3s6d"));
  }

  @Test
  public void test_texas_holdem_6664_4d4h7dQhTc_QcKs_6cAd() {
    assertEquals(
      "6cAd QcKs",
      Solver.process("texas-holdem 4d4h7dQhTc QcKs 6cAd"));
  }

  @Test
  public void test_texas_holdem_6665_2h3dJhKhTd_3sAc_8h5s_7cJd_7hKd_3hTh() {
    assertEquals(
      "8h5s 3sAc 7cJd 7hKd 3hTh",
      Solver.process("texas-holdem 2h3dJhKhTd 3sAc 8h5s 7cJd 7hKd 3hTh"));
  }

  @Test
  public void test_texas_holdem_6666_3s5d5hKsTd_Kd6h_5cKc() {
    assertEquals(
      "Kd6h 5cKc",
      Solver.process("texas-holdem 3s5d5hKsTd Kd6h 5cKc"));
  }

  @Test
  public void test_texas_holdem_6667_3s5h7h8h8s_8dTc_Th6d_5c3h_Qs7d_6hJc_8c7s_5sKs() {
    assertEquals(
      "Th6d 6hJc 5c3h 5sKs Qs7d 8dTc 8c7s",
      Solver.process("texas-holdem 3s5h7h8h8s 8dTc Th6d 5c3h Qs7d 6hJc 8c7s 5sKs"));
  }

  @Test
  public void test_texas_holdem_6668_2h7d8dAsQs_JdJh_Js2c_3h8c_7cJc_8sAc_8h4c_5dQh() {
    assertEquals(
      "Js2c 7cJc 3h8c=8h4c JdJh 5dQh 8sAc",
      Solver.process("texas-holdem 2h7d8dAsQs JdJh Js2c 3h8c 7cJc 8sAc 8h4c 5dQh"));
  }

  @Test
  public void test_texas_holdem_6669_5s6d6s8hAd_As9h_AhQs() {
    assertEquals(
      "As9h AhQs",
      Solver.process("texas-holdem 5s6d6s8hAd As9h AhQs"));
  }

  @Test
  public void test_texas_holdem_6670_3h5d6d7dKd_Jd8h_Qd9c_4d8s_4hTd_Kc5h_2dTs_QhQs_5s8c_3s4s() {
    assertEquals(
      "5s8c QhQs Kc5h 3s4s 2dTs 4d8s 4hTd Jd8h Qd9c",
      Solver.process("texas-holdem 3h5d6d7dKd Jd8h Qd9c 4d8s 4hTd Kc5h 2dTs QhQs 5s8c 3s4s"));
  }

  @Test
  public void test_texas_holdem_6671_2s4cKdQsTs_9d3s_Js5d_2dQc_4h7s_4sQh_9cTh_5hAd_6s2h_Td2c() {
    assertEquals(
      "9d3s Js5d 5hAd 6s2h 4h7s 9cTh Td2c 2dQc 4sQh",
      Solver.process("texas-holdem 2s4cKdQsTs 9d3s Js5d 2dQc 4h7s 4sQh 9cTh 5hAd 6s2h Td2c"));
  }

  @Test
  public void test_texas_holdem_6672_4h6s8c8sJd_Qc6d_As4d_Jc7d_4cAd() {
    assertEquals(
      "4cAd=As4d Qc6d Jc7d",
      Solver.process("texas-holdem 4h6s8c8sJd Qc6d As4d Jc7d 4cAd"));
  }

  @Test
  public void test_texas_holdem_6673_2h4d5c6dQc_2d5s_6sQs_JdTs_Ks8s_9s7d() {
    assertEquals(
      "9s7d JdTs Ks8s 2d5s 6sQs",
      Solver.process("texas-holdem 2h4d5c6dQc 2d5s 6sQs JdTs Ks8s 9s7d"));
  }

  @Test
  public void test_texas_holdem_6674_5c6d8hJhQd_3h7d_3c9d_Ad5d_As8d_ThKc_9h6c_4h5h_4dJd_6sTc() {
    assertEquals(
      "3h7d 3c9d ThKc 4h5h Ad5d 9h6c 6sTc As8d 4dJd",
      Solver.process("texas-holdem 5c6d8hJhQd 3h7d 3c9d Ad5d As8d ThKc 9h6c 4h5h 4dJd 6sTc"));
  }

  @Test
  public void test_texas_holdem_6675_2h4cAcKdTd_8d7c_6h5c_Kc4s_8cAd_7hJd() {
    assertEquals(
      "6h5c 8d7c 7hJd 8cAd Kc4s",
      Solver.process("texas-holdem 2h4cAcKdTd 8d7c 6h5c Kc4s 8cAd 7hJd"));
  }

  @Test
  public void test_texas_holdem_6676_5h6hAhAsTh_7hAd_2dTd_8d6d() {
    assertEquals(
      "8d6d 2dTd 7hAd",
      Solver.process("texas-holdem 5h6hAhAsTh 7hAd 2dTd 8d6d"));
  }

  @Test
  public void test_texas_holdem_6677_4h4s8s9cTh_JhTs_JcQh() {
    assertEquals(
      "JhTs JcQh",
      Solver.process("texas-holdem 4h4s8s9cTh JhTs JcQh"));
  }

  @Test
  public void test_texas_holdem_6678_2s8sAsKhQc_3sJh_7s4d_AcKd() {
    assertEquals(
      "7s4d 3sJh AcKd",
      Solver.process("texas-holdem 2s8sAsKhQc 3sJh 7s4d AcKd"));
  }

  @Test
  public void test_texas_holdem_6679_3d3h4d5d8s_7d6h_7c4s_Kc9c() {
    assertEquals(
      "Kc9c 7c4s 7d6h",
      Solver.process("texas-holdem 3d3h4d5d8s 7d6h 7c4s Kc9c"));
  }

  @Test
  public void test_texas_holdem_6680_2h7hJhQcTd_Jc3s_2s4s_Kc6s_Kd8d_JsKh_9hQs_7dAs_8c6h() {
    assertEquals(
      "8c6h Kc6s Kd8d 2s4s 7dAs Jc3s JsKh 9hQs",
      Solver.process("texas-holdem 2h7hJhQcTd Jc3s 2s4s Kc6s Kd8d JsKh 9hQs 7dAs 8c6h"));
  }

  @Test
  public void test_texas_holdem_6681_9dAdAsJhQh_3h7c_Jd4d_KhAh_Qs9h_7hTd_6dJs_6h3s() {
    assertEquals(
      "3h7c=6h3s 7hTd 6dJs=Jd4d Qs9h KhAh",
      Solver.process("texas-holdem 9dAdAsJhQh 3h7c Jd4d KhAh Qs9h 7hTd 6dJs 6h3s"));
  }

  @Test
  public void test_texas_holdem_6682_5c7cAhJsTs_7sKs_2h6c_6s2c_Kc9h_JcJd_5d3s() {
    assertEquals(
      "2h6c=6s2c Kc9h 5d3s 7sKs JcJd",
      Solver.process("texas-holdem 5c7cAhJsTs 7sKs 2h6c 6s2c Kc9h JcJd 5d3s"));
  }

  @Test
  public void test_texas_holdem_6683_3d6c6h9dAh_5h9h_Qs9s_Kh5d_2h2d_5c6d_8d7d_Qh7s() {
    assertEquals(
      "8d7d Qh7s Kh5d 2h2d 5h9h=Qs9s 5c6d",
      Solver.process("texas-holdem 3d6c6h9dAh 5h9h Qs9s Kh5d 2h2d 5c6d 8d7d Qh7s"));
  }

  @Test
  public void test_texas_holdem_6684_3cAcJhKcTh_6c4h_3s6h_Ad7s_As4c_9dTs_2sAh() {
    assertEquals(
      "6c4h 3s6h 9dTs 2sAh=Ad7s=As4c",
      Solver.process("texas-holdem 3cAcJhKcTh 6c4h 3s6h Ad7s As4c 9dTs 2sAh"));
  }

  @Test
  public void test_texas_holdem_6685_3h5h5sQcTd_8h9c_Ks9d_6c9h_8dJd_KcTh_2cJh_8s3s() {
    assertEquals(
      "6c9h=8h9c 2cJh=8dJd Ks9d 8s3s KcTh",
      Solver.process("texas-holdem 3h5h5sQcTd 8h9c Ks9d 6c9h 8dJd KcTh 2cJh 8s3s"));
  }

  @Test
  public void test_texas_holdem_6686_4cAcAhJsQd_8sQs_6s7h_AsKd_ThAd_Jd7d_8h3s_5c4d_8dTd_Tc7s() {
    assertEquals(
      "6s7h 8h3s 8dTd=Tc7s 5c4d Jd7d 8sQs ThAd AsKd",
      Solver.process("texas-holdem 4cAcAhJsQd 8sQs 6s7h AsKd ThAd Jd7d 8h3s 5c4d 8dTd Tc7s"));
  }

  @Test
  public void test_texas_holdem_6687_2h6sAcAsJh_Qh7c_2s8d_Kc7s_8sJs_9h6h_7hAh_KhJc_9c4h() {
    assertEquals(
      "9c4h Qh7c Kc7s 2s8d 9h6h 8sJs KhJc 7hAh",
      Solver.process("texas-holdem 2h6sAcAsJh Qh7c 2s8d Kc7s 8sJs 9h6h 7hAh KhJc 9c4h"));
  }

  @Test
  public void test_texas_holdem_6688_4h6s9dJsTs_Qc8s_Qd4s_6h7h_4d9c_8dKd() {
    assertEquals(
      "8dKd Qd4s 6h7h 4d9c Qc8s",
      Solver.process("texas-holdem 4h6s9dJsTs Qc8s Qd4s 6h7h 4d9c 8dKd"));
  }

  @Test
  public void test_texas_holdem_6689_2h7h9c9hTh_JsKc_AsKh_3c8c_QdAh_AdQc_6d3d_Jh7c() {
    assertEquals(
      "6d3d 3c8c JsKc AdQc Jh7c AsKh QdAh",
      Solver.process("texas-holdem 2h7h9c9hTh JsKc AsKh 3c8c QdAh AdQc 6d3d Jh7c"));
  }

  @Test
  public void test_texas_holdem_6690_3d3h6c7sAs_Td4s_2sQc_JdAh_6hJs_3s9d_Qs2d() {
    assertEquals(
      "Td4s 2sQc=Qs2d 6hJs JdAh 3s9d",
      Solver.process("texas-holdem 3d3h6c7sAs Td4s 2sQc JdAh 6hJs 3s9d Qs2d"));
  }

  @Test
  public void test_texas_holdem_6691_3h6hQdQsTs_7s7h_JdKd_3sJc_6c2d() {
    assertEquals(
      "JdKd 3sJc 6c2d 7s7h",
      Solver.process("texas-holdem 3h6hQdQsTs 7s7h JdKd 3sJc 6c2d"));
  }

  @Test
  public void test_texas_holdem_6692_5cAcAhQsTd_JhTc_2s4h_Qh9h_7h4d() {
    assertEquals(
      "2s4h 7h4d JhTc Qh9h",
      Solver.process("texas-holdem 5cAcAhQsTd JhTc 2s4h Qh9h 7h4d"));
  }

  @Test
  public void test_texas_holdem_6693_9c9h9sAcQd_Js5s_Ks8h_7d2d_5hQc_8s3c_4h6s_Jc6d_7c8c_5d3h() {
    assertEquals(
      "4h6s=5d3h=7c8c=7d2d=8s3c=Jc6d=Js5s Ks8h 5hQc",
      Solver.process("texas-holdem 9c9h9sAcQd Js5s Ks8h 7d2d 5hQc 8s3c 4h6s Jc6d 7c8c 5d3h"));
  }

  @Test
  public void test_texas_holdem_6694_2d4c5d8dTd_7sQd_KhAs_Qc6d_5cTc_9s3d_Ks3s_Kc7c() {
    assertEquals(
      "Ks3s Kc7c KhAs 5cTc 9s3d Qc6d 7sQd",
      Solver.process("texas-holdem 2d4c5d8dTd 7sQd KhAs Qc6d 5cTc 9s3d Ks3s Kc7c"));
  }

  @Test
  public void test_texas_holdem_6695_3d4c7h9sKh_4d5h_QdKs_8h2s_Qh6s_Qs7d_As9h_8s2h_Jh7s() {
    assertEquals(
      "8h2s=8s2h Qh6s 4d5h Jh7s Qs7d As9h QdKs",
      Solver.process("texas-holdem 3d4c7h9sKh 4d5h QdKs 8h2s Qh6s Qs7d As9h 8s2h Jh7s"));
  }

  @Test
  public void test_texas_holdem_6696_3h4h7sKdKs_JsAd_8sQc_6s9h_8c7c_Td3d_2s5c_6h3s_Ts9d_9c3c() {
    assertEquals(
      "2s5c 6s9h Ts9d 8sQc JsAd 6h3s 9c3c Td3d 8c7c",
      Solver.process("texas-holdem 3h4h7sKdKs JsAd 8sQc 6s9h 8c7c Td3d 2s5c 6h3s Ts9d 9c3c"));
  }

  @Test
  public void test_texas_holdem_6697_3c7dKdQcTd_5s4s_5dJc_Jd4d_3h2c_7hKs_4cJs_Qd2d_9dQh() {
    assertEquals(
      "5s4s 4cJs=5dJc 3h2c 9dQh 7hKs Jd4d Qd2d",
      Solver.process("texas-holdem 3c7dKdQcTd 5s4s 5dJc Jd4d 3h2c 7hKs 4cJs Qd2d 9dQh"));
  }

  @Test
  public void test_texas_holdem_6698_5c6dJdQcTh_7d9c_6s9s_QsTc() {
    assertEquals(
      "7d9c 6s9s QsTc",
      Solver.process("texas-holdem 5c6dJdQcTh 7d9c 6s9s QsTc"));
  }

  @Test
  public void test_texas_holdem_6699_5cJcJdJsTh_5sKs_3c5h_7s3d_3h4d_4c6c_Td9d() {
    assertEquals(
      "3h4d 4c6c 7s3d 3c5h=5sKs Td9d",
      Solver.process("texas-holdem 5cJcJdJsTh 5sKs 3c5h 7s3d 3h4d 4c6c Td9d"));
  }

  @Test
  public void test_texas_holdem_6700_5c5dAcAhKc_4sTc_3s5s_As3c_6hJh_KdQc_7dJd() {
    assertEquals(
      "4sTc=6hJh=7dJd KdQc 3s5s As3c",
      Solver.process("texas-holdem 5c5dAcAhKc 4sTc 3s5s As3c 6hJh KdQc 7dJd"));
  }

  @Test
  public void test_texas_holdem_6701_5d6s8cTcTh_8sQh_8hJc_TsKs_8d3c() {
    assertEquals(
      "8d3c 8hJc 8sQh TsKs",
      Solver.process("texas-holdem 5d6s8cTcTh 8sQh 8hJc TsKs 8d3c"));
  }

  @Test
  public void test_texas_holdem_6702_2h4c7sQcTc_KcKs_Ad6h_Ac4d_8dTs() {
    assertEquals(
      "Ad6h Ac4d 8dTs KcKs",
      Solver.process("texas-holdem 2h4c7sQcTc KcKs Ad6h Ac4d 8dTs"));
  }

  @Test
  public void test_texas_holdem_6703_4d6d7sKhTs_3dAh_9dAc_Qc6h_7c3c() {
    assertEquals(
      "3dAh 9dAc Qc6h 7c3c",
      Solver.process("texas-holdem 4d6d7sKhTs 3dAh 9dAc Qc6h 7c3c"));
  }

  @Test
  public void test_texas_holdem_6704_6c8cJsQcQd_3d6d_4hTc_9d9h_7h9c_AsKh_Qh3c_2dJd_7c6s_Th2h() {
    assertEquals(
      "7h9c 4hTc=Th2h AsKh 3d6d=7c6s 9d9h 2dJd Qh3c",
      Solver.process("texas-holdem 6c8cJsQcQd 3d6d 4hTc 9d9h 7h9c AsKh Qh3c 2dJd 7c6s Th2h"));
  }

  @Test
  public void test_texas_holdem_6705_8h9hJsQsTs_2h4c_5d6s_6cKc_7sTd_As5h_Jc5s_7c3c() {
    assertEquals(
      "2h4c=5d6s=7c3c=7sTd=As5h=Jc5s 6cKc",
      Solver.process("texas-holdem 8h9hJsQsTs 2h4c 5d6s 6cKc 7sTd As5h Jc5s 7c3c"));
  }

  @Test
  public void test_texas_holdem_6706_3s8s9cJsTd_3d6s_3h8c_5c3c_Qs2d_Ah8h_7h2s_Ad2c() {
    assertEquals(
      "Ad2c 3d6s=5c3c Ah8h 3h8c 7h2s Qs2d",
      Solver.process("texas-holdem 3s8s9cJsTd 3d6s 3h8c 5c3c Qs2d Ah8h 7h2s Ad2c"));
  }

  @Test
  public void test_texas_holdem_6707_4s8hJcKsQs_Kh9s_8s3s_2sTs_5h9h_Ah7h_6s5s_Th3d_Js5d() {
    assertEquals(
      "5h9h Th3d Ah7h Js5d Kh9s 6s5s 8s3s 2sTs",
      Solver.process("texas-holdem 4s8hJcKsQs Kh9s 8s3s 2sTs 5h9h Ah7h 6s5s Th3d Js5d"));
  }

  @Test
  public void test_texas_holdem_6708_7h8d9d9hKh_4h7d_2dQd_Tc6d_As7c_3cKd() {
    assertEquals(
      "2dQd 4h7d As7c 3cKd Tc6d",
      Solver.process("texas-holdem 7h8d9d9hKh 4h7d 2dQd Tc6d As7c 3cKd"));
  }

  @Test
  public void test_texas_holdem_6709_3h6h6s7c9s_4h3c_QhKh_5d7d_AhKd_2d4c_9c9h_TcAs() {
    assertEquals(
      "2d4c QhKh TcAs AhKd 4h3c 5d7d 9c9h",
      Solver.process("texas-holdem 3h6h6s7c9s 4h3c QhKh 5d7d AhKd 2d4c 9c9h TcAs"));
  }

  @Test
  public void test_texas_holdem_6710_2h5h7hJcTd_2dQd_Ah3c_6s2s_Ks9d_4d6h_3h5d() {
    assertEquals(
      "4d6h Ks9d Ah3c 6s2s 2dQd 3h5d",
      Solver.process("texas-holdem 2h5h7hJcTd 2dQd Ah3c 6s2s Ks9d 4d6h 3h5d"));
  }

  @Test
  public void test_texas_holdem_6711_2h3d4s5hTc_8h6s_Jd8d_9sAc_9d7s_As2c() {
    assertEquals(
      "9d7s Jd8d 9sAc=As2c 8h6s",
      Solver.process("texas-holdem 2h3d4s5hTc 8h6s Jd8d 9sAc 9d7s As2c"));
  }

  @Test
  public void test_texas_holdem_6712_5c6sJsKhKs_5h5s_2hTd_3s2c() {
    assertEquals(
      "3s2c 2hTd 5h5s",
      Solver.process("texas-holdem 5c6sJsKhKs 5h5s 2hTd 3s2c"));
  }

  @Test
  public void test_texas_holdem_6713_3s6dQsTcTh_5h4d_3c5c_Qd3h_JhKd_4c8c() {
    assertEquals(
      "5h4d 4c8c JhKd 3c5c Qd3h",
      Solver.process("texas-holdem 3s6dQsTcTh 5h4d 3c5c Qd3h JhKd 4c8c"));
  }

  @Test
  public void test_texas_holdem_6714_2dAcJcJhTh_QdAd_8cKd_6d5h_Td7d_3h2c_Qh4s_Qc4h_Kh9s_Ah9d() {
    assertEquals(
      "6d5h Qc4h=Qh4s 8cKd=Kh9s 3h2c Td7d Ah9d QdAd",
      Solver.process("texas-holdem 2dAcJcJhTh QdAd 8cKd 6d5h Td7d 3h2c Qh4s Qc4h Kh9s Ah9d"));
  }

  @Test
  public void test_texas_holdem_6715_2c2h4h8sQs_Th8c_8d4s() {
    assertEquals(
      "Th8c 8d4s",
      Solver.process("texas-holdem 2c2h4h8sQs Th8c 8d4s"));
  }

  @Test
  public void test_texas_holdem_6716_AcKcKdQhQs_Ts3c_5d3d_4sJs_6sJh_Qc9h_7hAh_Jc9c() {
    assertEquals(
      "4sJs=5d3d=6sJh=Jc9c=Ts3c 7hAh Qc9h",
      Solver.process("texas-holdem AcKcKdQhQs Ts3c 5d3d 4sJs 6sJh Qc9h 7hAh Jc9c"));
  }

  @Test
  public void test_texas_holdem_6717_4s6c7sKdKs_8s9h_5sTs() {
    assertEquals(
      "8s9h 5sTs",
      Solver.process("texas-holdem 4s6c7sKdKs 8s9h 5sTs"));
  }

  @Test
  public void test_texas_holdem_6718_3d5d5sJsQh_6h9s_AsAh_5cTs() {
    assertEquals(
      "6h9s AsAh 5cTs",
      Solver.process("texas-holdem 3d5d5sJsQh 6h9s AsAh 5cTs"));
  }

  @Test
  public void test_texas_holdem_6719_2c2h7d7hTs_3h5s_2d3d_Th8h_9c3s() {
    assertEquals(
      "3h5s=9c3s Th8h 2d3d",
      Solver.process("texas-holdem 2c2h7d7hTs 3h5s 2d3d Th8h 9c3s"));
  }

  @Test
  public void test_texas_holdem_6720_4s8sAdAsQc_7c8h_7d5d_9dTc_Kd9s_2s5c() {
    assertEquals(
      "2s5c 7d5d 9dTc Kd9s 7c8h",
      Solver.process("texas-holdem 4s8sAdAsQc 7c8h 7d5d 9dTc Kd9s 2s5c"));
  }

  @Test
  public void test_texas_holdem_6721_4h5h8sJhTs_7h3s_2s6c_5dQd_Tc2h_3hTh_8dQs() {
    assertEquals(
      "2s6c 7h3s 5dQd 8dQs Tc2h 3hTh",
      Solver.process("texas-holdem 4h5h8sJhTs 7h3s 2s6c 5dQd Tc2h 3hTh 8dQs"));
  }

  @Test
  public void test_texas_holdem_6722_2c2h5cAcJh_7hTd_8h8s_5hAs_Ts6h_Jd2d() {
    assertEquals(
      "7hTd=Ts6h 8h8s 5hAs Jd2d",
      Solver.process("texas-holdem 2c2h5cAcJh 7hTd 8h8s 5hAs Ts6h Jd2d"));
  }

  @Test
  public void test_texas_holdem_6723_2d3s7h8hKh_5c7d_6cQc_KsQd_Jd8s_6hAs() {
    assertEquals(
      "6cQc 6hAs 5c7d Jd8s KsQd",
      Solver.process("texas-holdem 2d3s7h8hKh 5c7d 6cQc KsQd Jd8s 6hAs"));
  }

  @Test
  public void test_texas_holdem_6724_2d5c6c8dKc_4cJh_Js2s_Th7s_3s5h_Kd8h_3d9s() {
    assertEquals(
      "3d9s Th7s 4cJh Js2s 3s5h Kd8h",
      Solver.process("texas-holdem 2d5c6c8dKc 4cJh Js2s Th7s 3s5h Kd8h 3d9s"));
  }

  @Test
  public void test_texas_holdem_6725_4h5hKcKhQh_8cTd_Ts2c_9hAs() {
    assertEquals(
      "Ts2c 8cTd 9hAs",
      Solver.process("texas-holdem 4h5hKcKhQh 8cTd Ts2c 9hAs"));
  }

  @Test
  public void test_texas_holdem_6726_2h9h9sJhTh_7sAs_Qd7c_4sJs() {
    assertEquals(
      "Qd7c 7sAs 4sJs",
      Solver.process("texas-holdem 2h9h9sJhTh 7sAs Qd7c 4sJs"));
  }

  @Test
  public void test_texas_holdem_6727_5d6c6d8hAs_4hKc_9dJd() {
    assertEquals(
      "9dJd 4hKc",
      Solver.process("texas-holdem 5d6c6d8hAs 4hKc 9dJd"));
  }

  @Test
  public void test_texas_holdem_6728_2s4d9hAdTs_Qh6h_Ah7d_5c6s_8hKd_2d6d_4sJc_5d6c_ThAs() {
    assertEquals(
      "5c6s=5d6c Qh6h 8hKd 2d6d 4sJc Ah7d ThAs",
      Solver.process("texas-holdem 2s4d9hAdTs Qh6h Ah7d 5c6s 8hKd 2d6d 4sJc 5d6c ThAs"));
  }

  @Test
  public void test_texas_holdem_6729_3s5c5dKhTs_KdTd_9dJh_2hAc_8s6d_9s3h_JcAh() {
    assertEquals(
      "8s6d 9dJh 2hAc JcAh 9s3h KdTd",
      Solver.process("texas-holdem 3s5c5dKhTs KdTd 9dJh 2hAc 8s6d 9s3h JcAh"));
  }

  @Test
  public void test_texas_holdem_6730_2h3c4c5cJc_Js3s_6h6d_6sJd_8h3d_8s7c() {
    assertEquals(
      "8h3d Js3s 6h6d=6sJd 8s7c",
      Solver.process("texas-holdem 2h3c4c5cJc Js3s 6h6d 6sJd 8h3d 8s7c"));
  }

  @Test
  public void test_texas_holdem_6731_2d3s9d9sJh_4hQc_Qs9c_5c2h_7sTh_8s6d_5s6c_4d4c() {
    assertEquals(
      "5s6c 8s6d 7sTh 4hQc 5c2h 4d4c Qs9c",
      Solver.process("texas-holdem 2d3s9d9sJh 4hQc Qs9c 5c2h 7sTh 8s6d 5s6c 4d4c"));
  }

  @Test
  public void test_texas_holdem_6732_AcJdKcKhTh_Qh4s_9hKd_JhTc() {
    assertEquals(
      "JhTc 9hKd Qh4s",
      Solver.process("texas-holdem AcJdKcKhTh Qh4s 9hKd JhTc"));
  }

  @Test
  public void test_texas_holdem_6733_2c3hKcKhQd_5h8c_Jd4h_Qc6s_9d9s_9hAc_4d2d() {
    assertEquals(
      "5h8c Jd4h 9hAc 4d2d 9d9s Qc6s",
      Solver.process("texas-holdem 2c3hKcKhQd 5h8c Jd4h Qc6s 9d9s 9hAc 4d2d"));
  }

  @Test
  public void test_texas_holdem_6734_3h7c8sJcQc_5dQd_Qh4c_6cTs_3s2d() {
    assertEquals(
      "6cTs 3s2d 5dQd=Qh4c",
      Solver.process("texas-holdem 3h7c8sJcQc 5dQd Qh4c 6cTs 3s2d"));
  }

  @Test
  public void test_texas_holdem_6735_3c3s4d6sAc_8h9d_4c5c_3d2h_AdKs_QcTh() {
    assertEquals(
      "8h9d QcTh 4c5c AdKs 3d2h",
      Solver.process("texas-holdem 3c3s4d6sAc 8h9d 4c5c 3d2h AdKs QcTh"));
  }

  @Test
  public void test_texas_holdem_6736_5s7d8dTcTh_3cTs_As7c_Ad7h_8cQs_9dAc_JcTd_5d6c_8h3s() {
    assertEquals(
      "9dAc 5d6c Ad7h=As7c 8h3s 8cQs 3cTs JcTd",
      Solver.process("texas-holdem 5s7d8dTcTh 3cTs As7c Ad7h 8cQs 9dAc JcTd 5d6c 8h3s"));
  }

  @Test
  public void test_texas_holdem_6737_3s5d6c6d7d_9hKc_2h9c_Jh2c_9dAc_As8c_Qs3d() {
    assertEquals(
      "2h9c Jh2c 9hKc As8c 9dAc Qs3d",
      Solver.process("texas-holdem 3s5d6c6d7d 9hKc 2h9c Jh2c 9dAc As8c Qs3d"));
  }

  @Test
  public void test_texas_holdem_6738_2c5c5d9dAs_KdTd_2h6d_7h8h() {
    assertEquals(
      "7h8h KdTd 2h6d",
      Solver.process("texas-holdem 2c5c5d9dAs KdTd 2h6d 7h8h"));
  }

  @Test
  public void test_texas_holdem_6739_7s9sJhQdTh_4d6s_Td6h_8s4h_5s5h_QcTc_Qh3c_Kh9h_2d5d() {
    assertEquals(
      "2d5d=4d6s 5s5h Td6h Qh3c QcTc 8s4h Kh9h",
      Solver.process("texas-holdem 7s9sJhQdTh 4d6s Td6h 8s4h 5s5h QcTc Qh3c Kh9h 2d5d"));
  }

  @Test
  public void test_texas_holdem_6740_3h7sAdAsKs_8h7c_JsJc() {
    assertEquals(
      "8h7c JsJc",
      Solver.process("texas-holdem 3h7sAdAsKs 8h7c JsJc"));
  }

  @Test
  public void test_texas_holdem_6741_6d7c7hKcTh_2cAd_2dKd_9hKs_2hAs_2s7s_3hJs_5cQs_9c7d() {
    assertEquals(
      "3hJs 5cQs 2cAd=2hAs 2dKd=9hKs 2s7s=9c7d",
      Solver.process("texas-holdem 6d7c7hKcTh 2cAd 2dKd 9hKs 2hAs 2s7s 3hJs 5cQs 9c7d"));
  }

  @Test
  public void test_texas_holdem_6742_3d5h6h7hAh_7s5d_KcTc_Jd3s_8cKd_3h9d_Jc2h_8sAc_9h4h_Kh4s() {
    assertEquals(
      "8cKd KcTc Jd3s 8sAc 7s5d Jc2h 3h9d 9h4h Kh4s",
      Solver.process("texas-holdem 3d5h6h7hAh 7s5d KcTc Jd3s 8cKd 3h9d Jc2h 8sAc 9h4h Kh4s"));
  }

  @Test
  public void test_texas_holdem_6743_5d5s7h8dAd_3s2d_4sTd_9d3c_2hKh_KcTs_Kd3d_2c3h() {
    assertEquals(
      "2c3h=3s2d 9d3c 4sTd 2hKh KcTs Kd3d",
      Solver.process("texas-holdem 5d5s7h8dAd 3s2d 4sTd 9d3c 2hKh KcTs Kd3d 2c3h"));
  }

  @Test
  public void test_texas_holdem_6744_6c8c8dAsTs_4c5c_3h2h_5s5h() {
    assertEquals(
      "3h2h=4c5c 5s5h",
      Solver.process("texas-holdem 6c8c8dAsTs 4c5c 3h2h 5s5h"));
  }

  @Test
  public void test_texas_holdem_6745_4d4h6c6dAh_7d3c_8sQc_7c5d_8h4s_9d6h_3dQd() {
    assertEquals(
      "3dQd=7c5d=7d3c=8sQc 8h4s 9d6h",
      Solver.process("texas-holdem 4d4h6c6dAh 7d3c 8sQc 7c5d 8h4s 9d6h 3dQd"));
  }

  @Test
  public void test_texas_holdem_6746_2s5h8s9sAc_Ks3c_2d4h_3d7d_8h5c_Ah7h_QdKh_Js8d_5dTc_QsAs() {
    assertEquals(
      "3d7d Ks3c QdKh 2d4h 5dTc Js8d Ah7h 8h5c QsAs",
      Solver.process("texas-holdem 2s5h8s9sAc Ks3c 2d4h 3d7d 8h5c Ah7h QdKh Js8d 5dTc QsAs"));
  }

  @Test
  public void test_texas_holdem_6747_4d4h9hJcKh_4cTh_8c3c_9sAd_5d3s_7c2h_JsTs_7hQc_QhAc() {
    assertEquals(
      "5d3s=7c2h=8c3c 7hQc QhAc 9sAd JsTs 4cTh",
      Solver.process("texas-holdem 4d4h9hJcKh 4cTh 8c3c 9sAd 5d3s 7c2h JsTs 7hQc QhAc"));
  }

  @Test
  public void test_texas_holdem_6748_3h7hKcKdKh_2sQd_3cAh() {
    assertEquals(
      "2sQd 3cAh",
      Solver.process("texas-holdem 3h7hKcKdKh 2sQd 3cAh"));
  }

  @Test
  public void test_texas_holdem_6749_7h8d8h9sAd_3h8c_Kc6d_2d6h_5sTc_9c9d_Jc2h_8sJd() {
    assertEquals(
      "2d6h 5sTc Jc2h Kc6d 3h8c 8sJd 9c9d",
      Solver.process("texas-holdem 7h8d8h9sAd 3h8c Kc6d 2d6h 5sTc 9c9d Jc2h 8sJd"));
  }

}
