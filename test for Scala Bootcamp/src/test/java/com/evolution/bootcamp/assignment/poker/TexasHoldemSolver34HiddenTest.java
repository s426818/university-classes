
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver34HiddenTest {


  @Test
  public void test_texas_holdem_8500_2s7h9sAdQh_8s7c_5dAc_6sTs_5c7d() {
    assertEquals(
      "6sTs 5c7d=8s7c 5dAc",
      Solver.process("texas-holdem 2s7h9sAdQh 8s7c 5dAc 6sTs 5c7d"));
  }

  @Test
  public void test_texas_holdem_8501_3cAdAsKhQd_6cKc_4c2d() {
    assertEquals(
      "4c2d 6cKc",
      Solver.process("texas-holdem 3cAdAsKhQd 6cKc 4c2d"));
  }

  @Test
  public void test_texas_holdem_8502_2d6c8dJhKs_4s3s_8c5c_Qd2c_Th8h_9hQh_7s5h_KcJc_Ac9d() {
    assertEquals(
      "4s3s 7s5h 9hQh Ac9d Qd2c 8c5c Th8h KcJc",
      Solver.process("texas-holdem 2d6c8dJhKs 4s3s 8c5c Qd2c Th8h 9hQh 7s5h KcJc Ac9d"));
  }

  @Test
  public void test_texas_holdem_8503_2d2h4d8cQd_Jc2c_Qs4h_KdTd_9c3d_7dJh_KcJs_8sJd_Ah5c() {
    assertEquals(
      "9c3d 7dJh KcJs Ah5c 8sJd Qs4h Jc2c KdTd",
      Solver.process("texas-holdem 2d2h4d8cQd Jc2c Qs4h KdTd 9c3d 7dJh KcJs 8sJd Ah5c"));
  }

  @Test
  public void test_texas_holdem_8504_2c3d5c7cJs_Th6c_8s5d_AhTd_Jc6h_QsTc_8d9h_2dAc_Ad5h_4c9d() {
    assertEquals(
      "4c9d 8d9h Th6c QsTc AhTd 2dAc 8s5d Ad5h Jc6h",
      Solver.process("texas-holdem 2c3d5c7cJs Th6c 8s5d AhTd Jc6h QsTc 8d9h 2dAc Ad5h 4c9d"));
  }

  @Test
  public void test_texas_holdem_8505_6s8d9cJhTc_2h6d_3d5s_4s5d_8hQs_7sQc_Kd2d_QdAs_9d4h_9s6c() {
    assertEquals(
      "3d5s=4s5d Kd2d 2h6d 9d4h 9s6c 7sQc=8hQs=QdAs",
      Solver.process("texas-holdem 6s8d9cJhTc 2h6d 3d5s 4s5d 8hQs 7sQc Kd2d QdAs 9d4h 9s6c"));
  }

  @Test
  public void test_texas_holdem_8506_5s7d8hQsTh_As9d_2s6h_2cAc_2dQh_9cAh_6sQd_Ad8d_7s3s() {
    assertEquals(
      "2s6h 2cAc 9cAh=As9d 7s3s Ad8d 2dQh=6sQd",
      Solver.process("texas-holdem 5s7d8hQsTh As9d 2s6h 2cAc 2dQh 9cAh 6sQd Ad8d 7s3s"));
  }

  @Test
  public void test_texas_holdem_8507_5h6h6sAhKd_9h2h_Qh6d_Js5s_2cQc() {
    assertEquals(
      "2cQc Js5s Qh6d 9h2h",
      Solver.process("texas-holdem 5h6h6sAhKd 9h2h Qh6d Js5s 2cQc"));
  }

  @Test
  public void test_texas_holdem_8508_7cAdJdQcQs_8hQd_5d6s_5s5c_9cKh_4cTh() {
    assertEquals(
      "5d6s 4cTh 9cKh 5s5c 8hQd",
      Solver.process("texas-holdem 7cAdJdQcQs 8hQd 5d6s 5s5c 9cKh 4cTh"));
  }

  @Test
  public void test_texas_holdem_8509_2s5s6d8dJs_4d3c_5cJc_2dKd_8cAs_Ah6s_5hQs_Ad9c_8sTc_TdTs() {
    assertEquals(
      "Ad9c 2dKd 5hQs Ah6s 8sTc 8cAs TdTs 5cJc 4d3c",
      Solver.process("texas-holdem 2s5s6d8dJs 4d3c 5cJc 2dKd 8cAs Ah6s 5hQs Ad9c 8sTc TdTs"));
  }

  @Test
  public void test_texas_holdem_8510_4hAhJsQsTs_7h6c_7dTh_8d8s_AcTd_5s6s_QhAd_9h8c_8h3h() {
    assertEquals(
      "7h6c 8h3h 8d8s 7dTh AcTd QhAd 9h8c 5s6s",
      Solver.process("texas-holdem 4hAhJsQsTs 7h6c 7dTh 8d8s AcTd 5s6s QhAd 9h8c 8h3h"));
  }

  @Test
  public void test_texas_holdem_8511_2d3s4s9sJc_3c7s_ThQc_2c9c_Kd8s_5hKc() {
    assertEquals(
      "ThQc 5hKc Kd8s 3c7s 2c9c",
      Solver.process("texas-holdem 2d3s4s9sJc 3c7s ThQc 2c9c Kd8s 5hKc"));
  }

  @Test
  public void test_texas_holdem_8512_4d5d6d7hQs_6c9d_9h8h_2hKs_Qc8c_KcKd_2s8s_Ah3h() {
    assertEquals(
      "2hKs 6c9d KcKd Ah3h 2s8s=Qc8c 9h8h",
      Solver.process("texas-holdem 4d5d6d7hQs 6c9d 9h8h 2hKs Qc8c KcKd 2s8s Ah3h"));
  }

  @Test
  public void test_texas_holdem_8513_2d3d4hJhTs_3c2s_ThAs_8c3s_9hTc_2c4s_KcKd_AhQd_5c5s() {
    assertEquals(
      "AhQd 8c3s 5c5s 9hTc ThAs KcKd 3c2s 2c4s",
      Solver.process("texas-holdem 2d3d4hJhTs 3c2s ThAs 8c3s 9hTc 2c4s KcKd AhQd 5c5s"));
  }

  @Test
  public void test_texas_holdem_8514_2d5s6c6sAs_QhTh_Kh8h_9c3d_8cQs_4h4c_3s5c_QdJd() {
    assertEquals(
      "9c3d 8cQs QhTh QdJd Kh8h 4h4c 3s5c",
      Solver.process("texas-holdem 2d5s6c6sAs QhTh Kh8h 9c3d 8cQs 4h4c 3s5c QdJd"));
  }

  @Test
  public void test_texas_holdem_8515_6d6h7dAcAd_Jh2s_4s5d_JsTd_KsKh() {
    assertEquals(
      "4s5d Jh2s=JsTd KsKh",
      Solver.process("texas-holdem 6d6h7dAcAd Jh2s 4s5d JsTd KsKh"));
  }

  @Test
  public void test_texas_holdem_8516_4d5d8hAsKc_7d5c_3h7h_6s9d_2h6c_AhJh_3d3c_3s6d_6hAc_Tc4s() {
    assertEquals(
      "2h6c=3s6d 3h7h 6s9d 3d3c Tc4s 7d5c 6hAc AhJh",
      Solver.process("texas-holdem 4d5d8hAsKc 7d5c 3h7h 6s9d 2h6c AhJh 3d3c 3s6d 6hAc Tc4s"));
  }

  @Test
  public void test_texas_holdem_8517_6h7c9dJcQh_8hQs_6dAs_TcKc() {
    assertEquals(
      "6dAs 8hQs TcKc",
      Solver.process("texas-holdem 6h7c9dJcQh 8hQs 6dAs TcKc"));
  }

  @Test
  public void test_texas_holdem_8518_3h4h5dKhQc_7s6s_6d8c_Jh5s_3sAs_6hQd_2c4d_Kc2h_JcTd_5hTh() {
    assertEquals(
      "6d8c JcTd 3sAs 2c4d Jh5s 6hQd Kc2h 7s6s 5hTh",
      Solver.process("texas-holdem 3h4h5dKhQc 7s6s 6d8c Jh5s 3sAs 6hQd 2c4d Kc2h JcTd 5hTh"));
  }

  @Test
  public void test_texas_holdem_8519_2s5c5d7d7h_Ac7c_5h5s_Kh2d_Kc9d_Kd4h_9hJc_4dAd_4s9c() {
    assertEquals(
      "4s9c 9hJc Kc9d=Kd4h=Kh2d 4dAd Ac7c 5h5s",
      Solver.process("texas-holdem 2s5c5d7d7h Ac7c 5h5s Kh2d Kc9d Kd4h 9hJc 4dAd 4s9c"));
  }

  @Test
  public void test_texas_holdem_8520_2c3d7d8hTc_Kh9c_2h6s() {
    assertEquals(
      "Kh9c 2h6s",
      Solver.process("texas-holdem 2c3d7d8hTc Kh9c 2h6s"));
  }

  @Test
  public void test_texas_holdem_8521_3d5s6hAsTs_KdJh_3s8d_Ah8s_ThAc_Jd2h() {
    assertEquals(
      "Jd2h KdJh 3s8d Ah8s ThAc",
      Solver.process("texas-holdem 3d5s6hAsTs KdJh 3s8d Ah8s ThAc Jd2h"));
  }

  @Test
  public void test_texas_holdem_8522_3d4c4s9dTh_QcKd_2s6h_2dJs_Jd8s() {
    assertEquals(
      "2s6h 2dJs=Jd8s QcKd",
      Solver.process("texas-holdem 3d4c4s9dTh QcKd 2s6h 2dJs Jd8s"));
  }

  @Test
  public void test_texas_holdem_8523_2s4d5hJcKs_5s4h_8sTh_9s6s_Jd8h_QcTs_6dJs_3c2c_9h5c() {
    assertEquals(
      "9s6s 8sTh QcTs 3c2c 9h5c 6dJs Jd8h 5s4h",
      Solver.process("texas-holdem 2s4d5hJcKs 5s4h 8sTh 9s6s Jd8h QcTs 6dJs 3c2c 9h5c"));
  }

  @Test
  public void test_texas_holdem_8524_2c3c3d6c8h_QdAh_5d4s() {
    assertEquals(
      "QdAh 5d4s",
      Solver.process("texas-holdem 2c3c3d6c8h QdAh 5d4s"));
  }

  @Test
  public void test_texas_holdem_8525_3c5c6s9cKc_3s3h_Kd2d_Jh2s() {
    assertEquals(
      "Jh2s Kd2d 3s3h",
      Solver.process("texas-holdem 3c5c6s9cKc 3s3h Kd2d Jh2s"));
  }

  @Test
  public void test_texas_holdem_8526_3h6d9sJcKc_KdTd_8c7c_3dAd() {
    assertEquals(
      "8c7c 3dAd KdTd",
      Solver.process("texas-holdem 3h6d9sJcKc KdTd 8c7c 3dAd"));
  }

  @Test
  public void test_texas_holdem_8527_2s3c5c8sAd_Ah3d_Qs4h() {
    assertEquals(
      "Ah3d Qs4h",
      Solver.process("texas-holdem 2s3c5c8sAd Ah3d Qs4h"));
  }

  @Test
  public void test_texas_holdem_8528_3c5d8cKcTc_7sQd_8d9c() {
    assertEquals(
      "7sQd 8d9c",
      Solver.process("texas-holdem 3c5d8cKcTc 7sQd 8d9c"));
  }

  @Test
  public void test_texas_holdem_8529_2d4h5h8c8h_Jd6c_3s6d_4s2c_5sQd_QcAh_6s9c() {
    assertEquals(
      "6s9c Jd6c QcAh 4s2c 5sQd 3s6d",
      Solver.process("texas-holdem 2d4h5h8c8h Jd6c 3s6d 4s2c 5sQd QcAh 6s9c"));
  }

  @Test
  public void test_texas_holdem_8530_6h6s7s9hTd_8cKd_JcAd_QcQd_9s4d() {
    assertEquals(
      "JcAd 9s4d QcQd 8cKd",
      Solver.process("texas-holdem 6h6s7s9hTd 8cKd JcAd QcQd 9s4d"));
  }

  @Test
  public void test_texas_holdem_8531_2d2h4c7dKs_9h4s_5hTs() {
    assertEquals(
      "5hTs 9h4s",
      Solver.process("texas-holdem 2d2h4c7dKs 9h4s 5hTs"));
  }

  @Test
  public void test_texas_holdem_8532_4h6h6s9dKs_4dKc_3dTc_9s5d() {
    assertEquals(
      "3dTc 9s5d 4dKc",
      Solver.process("texas-holdem 4h6h6s9dKs 4dKc 3dTc 9s5d"));
  }

  @Test
  public void test_texas_holdem_8533_2s4h7hJcTh_4d2h_KhQh_Tc3d_5s2d_Ks6s_Ad9s() {
    assertEquals(
      "Ks6s Ad9s 5s2d Tc3d 4d2h KhQh",
      Solver.process("texas-holdem 2s4h7hJcTh 4d2h KhQh Tc3d 5s2d Ks6s Ad9s"));
  }

  @Test
  public void test_texas_holdem_8534_6s8hAsKhTh_3d9s_Kc6h() {
    assertEquals(
      "3d9s Kc6h",
      Solver.process("texas-holdem 6s8hAsKhTh 3d9s Kc6h"));
  }

  @Test
  public void test_texas_holdem_8535_4c4s6s9cTs_7dAh_Kd7c_8sAc_As2c_3cTc_QhAd_6cKs() {
    assertEquals(
      "Kd7c 7dAh=8sAc=As2c QhAd 6cKs 3cTc",
      Solver.process("texas-holdem 4c4s6s9cTs 7dAh Kd7c 8sAc As2c 3cTc QhAd 6cKs"));
  }

  @Test
  public void test_texas_holdem_8536_2c6s7s9cQc_5h4h_2sAd_8hTc_Qd4c_Ac8c_6d5d_2d9s_Td6c_Th5s() {
    assertEquals(
      "5h4h Th5s 2sAd 6d5d Td6c Qd4c 2d9s 8hTc Ac8c",
      Solver.process("texas-holdem 2c6s7s9cQc 5h4h 2sAd 8hTc Qd4c Ac8c 6d5d 2d9s Td6c Th5s"));
  }

  @Test
  public void test_texas_holdem_8537_4h8c9sKdKs_AhAd_5hTc_As7h_Js4c_JdQs_7c5d_TdTh() {
    assertEquals(
      "7c5d 5hTc JdQs As7h Js4c TdTh AhAd",
      Solver.process("texas-holdem 4h8c9sKdKs AhAd 5hTc As7h Js4c JdQs 7c5d TdTh"));
  }

  @Test
  public void test_texas_holdem_8538_4s8d9hAhKc_9s9d_6s7d() {
    assertEquals(
      "6s7d 9s9d",
      Solver.process("texas-holdem 4s8d9hAhKc 9s9d 6s7d"));
  }

  @Test
  public void test_texas_holdem_8539_3s4h8cKhQd_2s6h_Ac2c_Td3h_6sTc() {
    assertEquals(
      "2s6h 6sTc Ac2c Td3h",
      Solver.process("texas-holdem 3s4h8cKhQd 2s6h Ac2c Td3h 6sTc"));
  }

  @Test
  public void test_texas_holdem_8540_4h5d7c8s9h_Jc3c_2dAh_5h8d_JhKh_Qs8c_4c7h_AdTs_6c8h() {
    assertEquals(
      "Jc3c JhKh 2dAh AdTs Qs8c 4c7h 5h8d 6c8h",
      Solver.process("texas-holdem 4h5d7c8s9h Jc3c 2dAh 5h8d JhKh Qs8c 4c7h AdTs 6c8h"));
  }

  @Test
  public void test_texas_holdem_8541_2s3dAdAsJc_Kd7c_5d2c_Td9c_JdTs_9d8s_8hKh_8c8d() {
    assertEquals(
      "9d8s Td9c Kd7c 8hKh 5d2c 8c8d JdTs",
      Solver.process("texas-holdem 2s3dAdAsJc Kd7c 5d2c Td9c JdTs 9d8s 8hKh 8c8d"));
  }

  @Test
  public void test_texas_holdem_8542_2h3c4c5sJh_6d7c_Ts9s_7d4s_3dQs_Ah2s() {
    assertEquals(
      "Ts9s 3dQs 7d4s Ah2s 6d7c",
      Solver.process("texas-holdem 2h3c4c5sJh 6d7c Ts9s 7d4s 3dQs Ah2s"));
  }

  @Test
  public void test_texas_holdem_8543_4s7h9sJhKc_5dKs_9c2d_9h6c_6d8c_5cJd_8dAc_Kd8h_6h5s_7s4d() {
    assertEquals(
      "6h5s 6d8c 8dAc 9c2d=9h6c 5cJd 5dKs Kd8h 7s4d",
      Solver.process("texas-holdem 4s7h9sJhKc 5dKs 9c2d 9h6c 6d8c 5cJd 8dAc Kd8h 6h5s 7s4d"));
  }

  @Test
  public void test_texas_holdem_8544_2s4s7sQdTh_4dJh_5c4h_7cQc_Qs2c_9d7d() {
    assertEquals(
      "5c4h 4dJh 9d7d Qs2c 7cQc",
      Solver.process("texas-holdem 2s4s7sQdTh 4dJh 5c4h 7cQc Qs2c 9d7d"));
  }

  @Test
  public void test_texas_holdem_8545_4d7c7s8dJd_Ah7h_9h2s_Td6d() {
    assertEquals(
      "9h2s Ah7h Td6d",
      Solver.process("texas-holdem 4d7c7s8dJd Ah7h 9h2s Td6d"));
  }

  @Test
  public void test_texas_holdem_8546_5c5d5h8sQs_3d9h_8h9d_4h2s_As4s_QhTc_TdTh_4c3s_9s2h() {
    assertEquals(
      "4c3s=4h2s 3d9h=9s2h As4s 8h9d TdTh QhTc",
      Solver.process("texas-holdem 5c5d5h8sQs 3d9h 8h9d 4h2s As4s QhTc TdTh 4c3s 9s2h"));
  }

  @Test
  public void test_texas_holdem_8547_2c5c9cAhKs_Jh5h_3d8d_2dKh_6h5s_4c6d_TdAs_AdQd_2s7h_Tc7d() {
    assertEquals(
      "4c6d 3d8d Tc7d 2s7h 6h5s Jh5h TdAs AdQd 2dKh",
      Solver.process("texas-holdem 2c5c9cAhKs Jh5h 3d8d 2dKh 6h5s 4c6d TdAs AdQd 2s7h Tc7d"));
  }

  @Test
  public void test_texas_holdem_8548_2d4h6c9cTs_AhKs_8c7s_5d5s() {
    assertEquals(
      "AhKs 5d5s 8c7s",
      Solver.process("texas-holdem 2d4h6c9cTs AhKs 8c7s 5d5s"));
  }

  @Test
  public void test_texas_holdem_8549_5c5h5s9dJh_Qd7h_Qs6d_KcTh_Ad3c_2dAc_3hJd() {
    assertEquals(
      "Qd7h=Qs6d KcTh 2dAc=Ad3c 3hJd",
      Solver.process("texas-holdem 5c5h5s9dJh Qd7h Qs6d KcTh Ad3c 2dAc 3hJd"));
  }

  @Test
  public void test_texas_holdem_8550_2c4d8h9cTs_5hJd_Qs8d_QdJh_2dJc_2sKs_6c4c_KdAc_5c6s_Qh3h() {
    assertEquals(
      "5c6s 5hJd Qh3h KdAc 2dJc 2sKs 6c4c Qs8d QdJh",
      Solver.process("texas-holdem 2c4d8h9cTs 5hJd Qs8d QdJh 2dJc 2sKs 6c4c KdAc 5c6s Qh3h"));
  }

  @Test
  public void test_texas_holdem_8551_6h6s9hQdQh_7h2d_JdAs_4dTh_6d4s_3c8c_Qs7s() {
    assertEquals(
      "3c8c=7h2d 4dTh JdAs 6d4s Qs7s",
      Solver.process("texas-holdem 6h6s9hQdQh 7h2d JdAs 4dTh 6d4s 3c8c Qs7s"));
  }

  @Test
  public void test_texas_holdem_8552_2c3d4h6s8h_Js6h_7s4d_4c9c_Td8s() {
    assertEquals(
      "7s4d 4c9c Js6h Td8s",
      Solver.process("texas-holdem 2c3d4h6s8h Js6h 7s4d 4c9c Td8s"));
  }

  @Test
  public void test_texas_holdem_8553_5h6c7cAhTs_4c3s_As5d_7s2h_6s4d_3c8d_JhTc_9dJc_7h4s() {
    assertEquals(
      "3c8d 9dJc 6s4d 7h4s=7s2h JhTc As5d 4c3s",
      Solver.process("texas-holdem 5h6c7cAhTs 4c3s As5d 7s2h 6s4d 3c8d JhTc 9dJc 7h4s"));
  }

  @Test
  public void test_texas_holdem_8554_5d8h8sJsQs_Ac3c_2h2s_3h5s_4cAd_3s3d_7cJd() {
    assertEquals(
      "4cAd=Ac3c 2h2s 3s3d 3h5s 7cJd",
      Solver.process("texas-holdem 5d8h8sJsQs Ac3c 2h2s 3h5s 4cAd 3s3d 7cJd"));
  }

  @Test
  public void test_texas_holdem_8555_3h5c7sKsTs_3dAh_6h4c_7cJh_Kd8s_Ac7d() {
    assertEquals(
      "3dAh 7cJh Ac7d Kd8s 6h4c",
      Solver.process("texas-holdem 3h5c7sKsTs 3dAh 6h4c 7cJh Kd8s Ac7d"));
  }

  @Test
  public void test_texas_holdem_8556_3c4d5h9hKc_6d7h_5s9d_2dKd_6c7s_4cQs_6hTh_3d2s() {
    assertEquals(
      "6hTh 3d2s 4cQs 2dKd 5s9d 6c7s=6d7h",
      Solver.process("texas-holdem 3c4d5h9hKc 6d7h 5s9d 2dKd 6c7s 4cQs 6hTh 3d2s"));
  }

  @Test
  public void test_texas_holdem_8557_3d3h6d7cKd_3c6s_Qs4s_9dKc_7sJs_Kh8c_2dTh() {
    assertEquals(
      "2dTh Qs4s 7sJs Kh8c 9dKc 3c6s",
      Solver.process("texas-holdem 3d3h6d7cKd 3c6s Qs4s 9dKc 7sJs Kh8c 2dTh"));
  }

  @Test
  public void test_texas_holdem_8558_2c4dAdAhQd_7dAc_3hTc_2h9h() {
    assertEquals(
      "3hTc 2h9h 7dAc",
      Solver.process("texas-holdem 2c4dAdAhQd 7dAc 3hTc 2h9h"));
  }

  @Test
  public void test_texas_holdem_8559_2s4d5cQcTc_4c6h_7dKd_JhKc_6s8h_8c3c_Ts5d_7s3h_9s5s_3sJs() {
    assertEquals(
      "7s3h 6s8h 3sJs 7dKd JhKc 4c6h 9s5s Ts5d 8c3c",
      Solver.process("texas-holdem 2s4d5cQcTc 4c6h 7dKd JhKc 6s8h 8c3c Ts5d 7s3h 9s5s 3sJs"));
  }

  @Test
  public void test_texas_holdem_8560_2c4s5c6hAd_8sAs_Ac7c_Th3c_6s2d_Qc6c() {
    assertEquals(
      "Qc6c Ac7c 8sAs 6s2d Th3c",
      Solver.process("texas-holdem 2c4s5c6hAd 8sAs Ac7c Th3c 6s2d Qc6c"));
  }

  @Test
  public void test_texas_holdem_8561_6s8sAcAhTh_KsTd_7hJc_9d7c_Ts5h_2dQd_6dAs() {
    assertEquals(
      "7hJc 2dQd Ts5h KsTd 9d7c 6dAs",
      Solver.process("texas-holdem 6s8sAcAhTh KsTd 7hJc 9d7c Ts5h 2dQd 6dAs"));
  }

  @Test
  public void test_texas_holdem_8562_4s5d8sAsKh_Kd3h_7c5h_Js2d_5s3c_8d6d_7hKc_5c7d_Qc6c_KsTc() {
    assertEquals(
      "Js2d Qc6c 5c7d=5s3c=7c5h 8d6d Kd3h 7hKc KsTc",
      Solver.process("texas-holdem 4s5d8sAsKh Kd3h 7c5h Js2d 5s3c 8d6d 7hKc 5c7d Qc6c KsTc"));
  }

  @Test
  public void test_texas_holdem_8563_6s9hAsQcQh_8sJh_5h7h() {
    assertEquals(
      "5h7h 8sJh",
      Solver.process("texas-holdem 6s9hAsQcQh 8sJh 5h7h"));
  }

  @Test
  public void test_texas_holdem_8564_5s6dJsQsTd_8d4d_6h7c_Jd3s_5d6s_3d9h_Qh2h_TcJh_AsQc_2c4c() {
    assertEquals(
      "2c4c 8d4d 3d9h 6h7c Jd3s Qh2h AsQc 5d6s TcJh",
      Solver.process("texas-holdem 5s6dJsQsTd 8d4d 6h7c Jd3s 5d6s 3d9h Qh2h TcJh AsQc 2c4c"));
  }

  @Test
  public void test_texas_holdem_8565_3c5s7s9h9s_4dTs_6hAc_8h9c_Tc2h_3hTd() {
    assertEquals(
      "4dTs=Tc2h 6hAc 3hTd 8h9c",
      Solver.process("texas-holdem 3c5s7s9h9s 4dTs 6hAc 8h9c Tc2h 3hTd"));
  }

  @Test
  public void test_texas_holdem_8566_4hAdJcQhTc_7d5c_AhAc_Td4s_7hKs_6d6c() {
    assertEquals(
      "7d5c 6d6c Td4s AhAc 7hKs",
      Solver.process("texas-holdem 4hAdJcQhTc 7d5c AhAc Td4s 7hKs 6d6c"));
  }

  @Test
  public void test_texas_holdem_8567_2h4h5dAcJc_6sTs_3c9d_JsJd_9c5s_7c8s_Kc2c_8c9s() {
    assertEquals(
      "7c8s 8c9s 6sTs Kc2c 9c5s JsJd 3c9d",
      Solver.process("texas-holdem 2h4h5dAcJc 6sTs 3c9d JsJd 9c5s 7c8s Kc2c 8c9s"));
  }

  @Test
  public void test_texas_holdem_8568_8c9cJcJhTc_Ts2d_4c9s_Qd6c_KdQh_8s8h() {
    assertEquals(
      "Ts2d KdQh 4c9s Qd6c 8s8h",
      Solver.process("texas-holdem 8c9cJcJhTc Ts2d 4c9s Qd6c KdQh 8s8h"));
  }

  @Test
  public void test_texas_holdem_8569_2d3c5c6h7c_5hKs_Jh2c() {
    assertEquals(
      "Jh2c 5hKs",
      Solver.process("texas-holdem 2d3c5c6h7c 5hKs Jh2c"));
  }

  @Test
  public void test_texas_holdem_8570_2dAsQdThTs_Kc4c_4dKs_3dAc_8hJs_Td5c_9d5s_Ah2c_3h6c() {
    assertEquals(
      "3h6c 9d5s 8hJs 4dKs=Kc4c 3dAc=Ah2c Td5c",
      Solver.process("texas-holdem 2dAsQdThTs Kc4c 4dKs 3dAc 8hJs Td5c 9d5s Ah2c 3h6c"));
  }

  @Test
  public void test_texas_holdem_8571_2s3h7sAsTd_5dQd_2cAh_9h3s_Ac9c_4h5h() {
    assertEquals(
      "5dQd 9h3s Ac9c 2cAh 4h5h",
      Solver.process("texas-holdem 2s3h7sAsTd 5dQd 2cAh 9h3s Ac9c 4h5h"));
  }

  @Test
  public void test_texas_holdem_8572_4cAhJdJsTh_4d7c_6c5s_2c8s_2s3c_KcJc_2dQc() {
    assertEquals(
      "2s3c 6c5s 2c8s 2dQc 4d7c KcJc",
      Solver.process("texas-holdem 4cAhJdJsTh 4d7c 6c5s 2c8s 2s3c KcJc 2dQc"));
  }

  @Test
  public void test_texas_holdem_8573_2c6d9hAcJc_6h4d_2hKs_3dQh_4c4h_AhQd_JdKc_Ts5h() {
    assertEquals(
      "Ts5h 3dQh 2hKs 4c4h 6h4d JdKc AhQd",
      Solver.process("texas-holdem 2c6d9hAcJc 6h4d 2hKs 3dQh 4c4h AhQd JdKc Ts5h"));
  }

  @Test
  public void test_texas_holdem_8574_4d8sJhQcTc_7h5h_3s9h_Ts5d_6h3c_Jd4s() {
    assertEquals(
      "6h3c 7h5h Ts5d Jd4s 3s9h",
      Solver.process("texas-holdem 4d8sJhQcTc 7h5h 3s9h Ts5d 6h3c Jd4s"));
  }

  @Test
  public void test_texas_holdem_8575_3d6cKhQcTh_6dKc_TsTc_4c4h_Jd8s_5h2h_9hQs_3sJs() {
    assertEquals(
      "5h2h Jd8s 3sJs 4c4h 9hQs 6dKc TsTc",
      Solver.process("texas-holdem 3d6cKhQcTh 6dKc TsTc 4c4h Jd8s 5h2h 9hQs 3sJs"));
  }

  @Test
  public void test_texas_holdem_8576_3d7s8cJcTc_Ks6d_9d4s() {
    assertEquals(
      "Ks6d 9d4s",
      Solver.process("texas-holdem 3d7s8cJcTc Ks6d 9d4s"));
  }

  @Test
  public void test_texas_holdem_8577_8dAcAdKsTc_4hKd_8cJh_8s2c_3d4d_6s4c_Qc2s_7s4s() {
    assertEquals(
      "3d4d=6s4c=7s4s Qc2s 8cJh=8s2c 4hKd",
      Solver.process("texas-holdem 8dAcAdKsTc 4hKd 8cJh 8s2c 3d4d 6s4c Qc2s 7s4s"));
  }

  @Test
  public void test_texas_holdem_8578_4c4h5cKdQc_3s6h_Ac4s() {
    assertEquals(
      "3s6h Ac4s",
      Solver.process("texas-holdem 4c4h5cKdQc 3s6h Ac4s"));
  }

  @Test
  public void test_texas_holdem_8579_2d3h5d8hQc_JcKs_5s6h() {
    assertEquals(
      "JcKs 5s6h",
      Solver.process("texas-holdem 2d3h5d8hQc JcKs 5s6h"));
  }

  @Test
  public void test_texas_holdem_8580_4h6hJdJhTs_7d8s_2sAc_Ks9h_Qs3c_6s3h_9s2h_8cQc() {
    assertEquals(
      "7d8s 9s2h Qs3c 8cQc Ks9h 2sAc 6s3h",
      Solver.process("texas-holdem 4h6hJdJhTs 7d8s 2sAc Ks9h Qs3c 6s3h 9s2h 8cQc"));
  }

  @Test
  public void test_texas_holdem_8581_3c5c7hKsTd_JhQc_2dTs_QhKc_3d8h_Kh6s_9cJc() {
    assertEquals(
      "9cJc JhQc 3d8h 2dTs Kh6s QhKc",
      Solver.process("texas-holdem 3c5c7hKsTd JhQc 2dTs QhKc 3d8h Kh6s 9cJc"));
  }

  @Test
  public void test_texas_holdem_8582_2c4h7hJhTd_4cJd_Ks3c() {
    assertEquals(
      "Ks3c 4cJd",
      Solver.process("texas-holdem 2c4h7hJhTd 4cJd Ks3c"));
  }

  @Test
  public void test_texas_holdem_8583_3h6s7h9sJd_Jc9d_2cJh_Ac8s_5d8c_KhAs_7s7d_Qh5c_4d6h_2d4s() {
    assertEquals(
      "2d4s Qh5c Ac8s KhAs 4d6h 2cJh Jc9d 7s7d 5d8c",
      Solver.process("texas-holdem 3h6s7h9sJd Jc9d 2cJh Ac8s 5d8c KhAs 7s7d Qh5c 4d6h 2d4s"));
  }

  @Test
  public void test_texas_holdem_8584_4c8cAhQhTc_Ks3h_Js6d_JdTs() {
    assertEquals(
      "Js6d Ks3h JdTs",
      Solver.process("texas-holdem 4c8cAhQhTc Ks3h Js6d JdTs"));
  }

  @Test
  public void test_texas_holdem_8585_3d4d5hTcTd_QdJs_Qs4h_As5d_8s3s_Qh9h() {
    assertEquals(
      "Qh9h QdJs 8s3s Qs4h As5d",
      Solver.process("texas-holdem 3d4d5hTcTd QdJs Qs4h As5d 8s3s Qh9h"));
  }

  @Test
  public void test_texas_holdem_8586_3h5h5s8c9d_3cJs_4h2d_AcTs_Td4c_8h4s_Qh6d_9h9c_Qc9s() {
    assertEquals(
      "4h2d Td4c Qh6d AcTs 3cJs 8h4s Qc9s 9h9c",
      Solver.process("texas-holdem 3h5h5s8c9d 3cJs 4h2d AcTs Td4c 8h4s Qh6d 9h9c Qc9s"));
  }

  @Test
  public void test_texas_holdem_8587_2h8dQhTdTh_5d8c_2cJc_5s3d() {
    assertEquals(
      "5s3d 2cJc 5d8c",
      Solver.process("texas-holdem 2h8dQhTdTh 5d8c 2cJc 5s3d"));
  }

  @Test
  public void test_texas_holdem_8588_3h5d6h7h8s_KdAd_6s5c_4d9c_Qh3d_JdTd() {
    assertEquals(
      "JdTd KdAd Qh3d 6s5c 4d9c",
      Solver.process("texas-holdem 3h5d6h7h8s KdAd 6s5c 4d9c Qh3d JdTd"));
  }

  @Test
  public void test_texas_holdem_8589_2h6h7h8sAc_TsJc_3dQd_AsQc_9sQs_4dTc_KcKd_4c3c() {
    assertEquals(
      "4c3c 4dTc TsJc 3dQd 9sQs KcKd AsQc",
      Solver.process("texas-holdem 2h6h7h8sAc TsJc 3dQd AsQc 9sQs 4dTc KcKd 4c3c"));
  }

  @Test
  public void test_texas_holdem_8590_2c4d5hAsQc_KsTc_5c8d_Kd4c_Qs8s_Td2s_Ah9h_Th8c_3c6s() {
    assertEquals(
      "Th8c KsTc Td2s Kd4c 5c8d Qs8s Ah9h 3c6s",
      Solver.process("texas-holdem 2c4d5hAsQc KsTc 5c8d Kd4c Qs8s Td2s Ah9h Th8c 3c6s"));
  }

  @Test
  public void test_texas_holdem_8591_JdQhQsTdTh_2c7h_5h5d_8s8d() {
    assertEquals(
      "2c7h=5h5d=8s8d",
      Solver.process("texas-holdem JdQhQsTdTh 2c7h 5h5d 8s8d"));
  }

  @Test
  public void test_texas_holdem_8592_3d4d5s7sKh_AdKs_9hAc() {
    assertEquals(
      "9hAc AdKs",
      Solver.process("texas-holdem 3d4d5s7sKh AdKs 9hAc"));
  }

  @Test
  public void test_texas_holdem_8593_3d4h5d7cKh_4c3h_Qd8d_6cAs_3s2d_2h9c_Kc6d_5c2s_6sAh_Qc6h() {
    assertEquals(
      "2h9c Qd8d 3s2d 5c2s 4c3h 6cAs=6sAh=Kc6d=Qc6h",
      Solver.process("texas-holdem 3d4h5d7cKh 4c3h Qd8d 6cAs 3s2d 2h9c Kc6d 5c2s 6sAh Qc6h"));
  }

  @Test
  public void test_texas_holdem_8594_5h7c7s9dQs_Ts7d_4dAd_2hTd_Kh4c_Qh5d() {
    assertEquals(
      "2hTd Kh4c 4dAd Qh5d Ts7d",
      Solver.process("texas-holdem 5h7c7s9dQs Ts7d 4dAd 2hTd Kh4c Qh5d"));
  }

  @Test
  public void test_texas_holdem_8595_5c8s9cAdKh_7s7d_As9s_Th6s_QdTd() {
    assertEquals(
      "Th6s QdTd 7s7d As9s",
      Solver.process("texas-holdem 5c8s9cAdKh 7s7d As9s Th6s QdTd"));
  }

  @Test
  public void test_texas_holdem_8596_3c4d5hJsKs_2dTh_Qh5s_Ac4s_7h9h_2s9d_As4h_9sTs_7cQc_Qs2c() {
    assertEquals(
      "2s9d 7h9h 2dTh 9sTs Qs2c 7cQc Ac4s=As4h Qh5s",
      Solver.process("texas-holdem 3c4d5hJsKs 2dTh Qh5s Ac4s 7h9h 2s9d As4h 9sTs 7cQc Qs2c"));
  }

  @Test
  public void test_texas_holdem_8597_7dJcKdQcQh_8hKs_6d9h_7c6h_2c5h_7h8c_8s2d_5s4c_AcTd_3h7s() {
    assertEquals(
      "2c5h=5s4c 8s2d 6d9h 3h7s=7c6h=7h8c 8hKs AcTd",
      Solver.process("texas-holdem 7dJcKdQcQh 8hKs 6d9h 7c6h 2c5h 7h8c 8s2d 5s4c AcTd 3h7s"));
  }

  @Test
  public void test_texas_holdem_8598_2h7h8cAsJc_5d3d_TcQd() {
    assertEquals(
      "5d3d TcQd",
      Solver.process("texas-holdem 2h7h8cAsJc 5d3d TcQd"));
  }

  @Test
  public void test_texas_holdem_8599_2c2s4dKcQs_6d4h_Kh7d_2hKd_8c5d_7c4s() {
    assertEquals(
      "8c5d 6d4h=7c4s Kh7d 2hKd",
      Solver.process("texas-holdem 2c2s4dKcQs 6d4h Kh7d 2hKd 8c5d 7c4s"));
  }

  @Test
  public void test_texas_holdem_8600_3s4d5d5hTs_7d9s_8hAd() {
    assertEquals(
      "7d9s 8hAd",
      Solver.process("texas-holdem 3s4d5d5hTs 7d9s 8hAd"));
  }

  @Test
  public void test_texas_holdem_8601_4h6h8dAcJd_AsQh_2hTc() {
    assertEquals(
      "2hTc AsQh",
      Solver.process("texas-holdem 4h6h8dAcJd AsQh 2hTc"));
  }

  @Test
  public void test_texas_holdem_8602_3h5d6cJcKc_3dKd_8c2s_6dQc_Js5s_6h4s_2dAh_8sTc_Td2c_7d9c() {
    assertEquals(
      "8c2s 7d9c Td2c 8sTc 2dAh 6h4s 6dQc Js5s 3dKd",
      Solver.process("texas-holdem 3h5d6cJcKc 3dKd 8c2s 6dQc Js5s 6h4s 2dAh 8sTc Td2c 7d9c"));
  }

  @Test
  public void test_texas_holdem_8603_5d5s7dKcTh_3h2h_Ah9s_7c9c_Qd3c_Kh3d_As6c_Ad4s_QcQh_KdJc() {
    assertEquals(
      "3h2h Qd3c Ad4s=Ah9s=As6c 7c9c QcQh Kh3d KdJc",
      Solver.process("texas-holdem 5d5s7dKcTh 3h2h Ah9s 7c9c Qd3c Kh3d As6c Ad4s QcQh KdJc"));
  }

  @Test
  public void test_texas_holdem_8604_3c7c9cJdTs_5cQc_3sJs_4dAh_5d9d() {
    assertEquals(
      "4dAh 5d9d 3sJs 5cQc",
      Solver.process("texas-holdem 3c7c9cJdTs 5cQc 3sJs 4dAh 5d9d"));
  }

  @Test
  public void test_texas_holdem_8605_5s9sAcJcTs_5cKd_Jh3h_9h8c_4dKc_Kh8h_9c2c_Ks7s() {
    assertEquals(
      "4dKc=Kh8h 5cKd 9c2c=9h8c Jh3h Ks7s",
      Solver.process("texas-holdem 5s9sAcJcTs 5cKd Jh3h 9h8c 4dKc Kh8h 9c2c Ks7s"));
  }

  @Test
  public void test_texas_holdem_8606_2c4c6h9c9d_AsJd_9sQh_3h7s() {
    assertEquals(
      "3h7s AsJd 9sQh",
      Solver.process("texas-holdem 2c4c6h9c9d AsJd 9sQh 3h7s"));
  }

  @Test
  public void test_texas_holdem_8607_2h3d8hAhQd_5d2c_8c5h_Qc7h() {
    assertEquals(
      "5d2c 8c5h Qc7h",
      Solver.process("texas-holdem 2h3d8hAhQd 5d2c 8c5h Qc7h"));
  }

  @Test
  public void test_texas_holdem_8608_3d6hAdAsQh_9cTh_QdTc_4hJd_7c7d() {
    assertEquals(
      "9cTh 4hJd 7c7d QdTc",
      Solver.process("texas-holdem 3d6hAdAsQh 9cTh QdTc 4hJd 7c7d"));
  }

  @Test
  public void test_texas_holdem_8609_6h7hAdKsTc_8dJc_8h2s_AsQs_Ac2h_6c9h_4hTh_Qh2d() {
    assertEquals(
      "8h2s 8dJc Qh2d 6c9h 4hTh Ac2h AsQs",
      Solver.process("texas-holdem 6h7hAdKsTc 8dJc 8h2s AsQs Ac2h 6c9h 4hTh Qh2d"));
  }

  @Test
  public void test_texas_holdem_8610_2d4h7d9sAd_8h3s_As7h_Ks8d() {
    assertEquals(
      "8h3s Ks8d As7h",
      Solver.process("texas-holdem 2d4h7d9sAd 8h3s As7h Ks8d"));
  }

  @Test
  public void test_texas_holdem_8611_2s3s7hAdJh_7sTc_2h8d_3d9h_5d6c_5c4d_4cAc_8hQh() {
    assertEquals(
      "5d6c 8hQh 2h8d 3d9h 7sTc 4cAc 5c4d",
      Solver.process("texas-holdem 2s3s7hAdJh 7sTc 2h8d 3d9h 5d6c 5c4d 4cAc 8hQh"));
  }

  @Test
  public void test_texas_holdem_8612_3d4c5c5dQh_4h8c_Kd9s_Jh5h() {
    assertEquals(
      "Kd9s 4h8c Jh5h",
      Solver.process("texas-holdem 3d4c5c5dQh 4h8c Kd9s Jh5h"));
  }

  @Test
  public void test_texas_holdem_8613_3d5sAsJdKd_KhKc_Js5h_KsQh_Th3c_7c2c_8h2s_5c3s_Qs6d() {
    assertEquals(
      "7c2c 8h2s Qs6d Th3c KsQh 5c3s Js5h KhKc",
      Solver.process("texas-holdem 3d5sAsJdKd KhKc Js5h KsQh Th3c 7c2c 8h2s 5c3s Qs6d"));
  }

  @Test
  public void test_texas_holdem_8614_5d7c7dAdTs_Tc4s_JsQc_KhKs_2c6h_7s8d_KdTh_Qd4h_6s4c_3c2d() {
    assertEquals(
      "3c2d 2c6h=6s4c Qd4h JsQc KdTh=Tc4s KhKs 7s8d",
      Solver.process("texas-holdem 5d7c7dAdTs Tc4s JsQc KhKs 2c6h 7s8d KdTh Qd4h 6s4c 3c2d"));
  }

  @Test
  public void test_texas_holdem_8615_3s4sKcQhQs_2c4d_Js9c_4h7h_6c8d_4cQd_7dJd() {
    assertEquals(
      "6c8d 7dJd Js9c 2c4d=4h7h 4cQd",
      Solver.process("texas-holdem 3s4sKcQhQs 2c4d Js9c 4h7h 6c8d 4cQd 7dJd"));
  }

  @Test
  public void test_texas_holdem_8616_2d6c7hAsKs_9s8d_7s6s() {
    assertEquals(
      "9s8d 7s6s",
      Solver.process("texas-holdem 2d6c7hAsKs 9s8d 7s6s"));
  }

  @Test
  public void test_texas_holdem_8617_2c3d8sJhKs_7s4s_3cAd_QsQd_Td2h_QcAh_Jd7c_4h6c_Qh4c() {
    assertEquals(
      "4h6c 7s4s Qh4c QcAh Td2h 3cAd Jd7c QsQd",
      Solver.process("texas-holdem 2c3d8sJhKs 7s4s 3cAd QsQd Td2h QcAh Jd7c 4h6c Qh4c"));
  }

  @Test
  public void test_texas_holdem_8618_2h2s3dQcTh_Jd8d_4s8h_Qs7d_Qh5d_6hAd_8sJc_5c2c() {
    assertEquals(
      "4s8h 8sJc=Jd8d 6hAd Qh5d=Qs7d 5c2c",
      Solver.process("texas-holdem 2h2s3dQcTh Jd8d 4s8h Qs7d Qh5d 6hAd 8sJc 5c2c"));
  }

  @Test
  public void test_texas_holdem_8619_4c4d5c5dTh_TcQh_5h3d_Kd8d_4hKh_QcAs_7dJd() {
    assertEquals(
      "7dJd Kd8d QcAs TcQh 4hKh 5h3d",
      Solver.process("texas-holdem 4c4d5c5dTh TcQh 5h3d Kd8d 4hKh QcAs 7dJd"));
  }

  @Test
  public void test_texas_holdem_8620_2h3s9d9sQc_Qh9h_Th7h_6c5h_5cTd_AdKs_4h4c() {
    assertEquals(
      "6c5h 5cTd Th7h AdKs 4h4c Qh9h",
      Solver.process("texas-holdem 2h3s9d9sQc Qh9h Th7h 6c5h 5cTd AdKs 4h4c"));
  }

  @Test
  public void test_texas_holdem_8621_2c3s4dAhQs_QcKd_6s8c_5cTd_4cQd_Ad7c_AsTs_Ks2h() {
    assertEquals(
      "6s8c Ks2h QcKd Ad7c AsTs 4cQd 5cTd",
      Solver.process("texas-holdem 2c3s4dAhQs QcKd 6s8c 5cTd 4cQd Ad7c AsTs Ks2h"));
  }

  @Test
  public void test_texas_holdem_8622_2h8h9dQcQh_7h5d_Ac5h_3s2c_6sKs() {
    assertEquals(
      "7h5d 6sKs Ac5h 3s2c",
      Solver.process("texas-holdem 2h8h9dQcQh 7h5d Ac5h 3s2c 6sKs"));
  }

  @Test
  public void test_texas_holdem_8623_3d4c5dJdQh_6hTh_Tc9c_3h7d_Qc8s_5s2s_Ac4s_Kc5c() {
    assertEquals(
      "6hTh Tc9c 3h7d Ac4s 5s2s Kc5c Qc8s",
      Solver.process("texas-holdem 3d4c5dJdQh 6hTh Tc9c 3h7d Qc8s 5s2s Ac4s Kc5c"));
  }

  @Test
  public void test_texas_holdem_8624_2h3s4s5dTh_6sQd_KcAs_Js7c_KdAc_Ks7s_TsJd() {
    assertEquals(
      "Js7c Ks7s TsJd KcAs=KdAc 6sQd",
      Solver.process("texas-holdem 2h3s4s5dTh 6sQd KcAs Js7c KdAc Ks7s TsJd"));
  }

  @Test
  public void test_texas_holdem_8625_4s6dAdAhKc_Qc2s_7c9c_5dKd_8d8s_3d8c_7d9d_5sQd_8hTc_Ts9s() {
    assertEquals(
      "3d8c 7c9c=7d9d 8hTc Ts9s 5sQd=Qc2s 8d8s 5dKd",
      Solver.process("texas-holdem 4s6dAdAhKc Qc2s 7c9c 5dKd 8d8s 3d8c 7d9d 5sQd 8hTc Ts9s"));
  }

  @Test
  public void test_texas_holdem_8626_3s6s8cAsJh_Qs9c_4d6d_3d9d_2s2h_7h5c_5sKh_5h2d_8sAh() {
    assertEquals(
      "5h2d 7h5c Qs9c 5sKh 2s2h 3d9d 4d6d 8sAh",
      Solver.process("texas-holdem 3s6s8cAsJh Qs9c 4d6d 3d9d 2s2h 7h5c 5sKh 5h2d 8sAh"));
  }

  @Test
  public void test_texas_holdem_8627_5s6c7h9sJs_Th5d_2s8s_2h8d() {
    assertEquals(
      "Th5d 2h8d 2s8s",
      Solver.process("texas-holdem 5s6c7h9sJs Th5d 2s8s 2h8d"));
  }

  @Test
  public void test_texas_holdem_8628_2s6h8dJhTd_3d9d_Qd8h_Ks2h_4h4s() {
    assertEquals(
      "3d9d Ks2h 4h4s Qd8h",
      Solver.process("texas-holdem 2s6h8dJhTd 3d9d Qd8h Ks2h 4h4s"));
  }

  @Test
  public void test_texas_holdem_8629_2d6d7c8h9h_2hAc_KhKd() {
    assertEquals(
      "2hAc KhKd",
      Solver.process("texas-holdem 2d6d7c8h9h 2hAc KhKd"));
  }

  @Test
  public void test_texas_holdem_8630_8sQdTdThTs_3cKc_3s4s_Tc8c_5d5h_6d4c_KhKs() {
    assertEquals(
      "3s4s=6d4c 3cKc 5d5h KhKs Tc8c",
      Solver.process("texas-holdem 8sQdTdThTs 3cKc 3s4s Tc8c 5d5h 6d4c KhKs"));
  }

  @Test
  public void test_texas_holdem_8631_3s4s6cKdKh_9d8c_2c8d_7cQd_Td5s_TcJc_JdJh_6s2h_8s3d_9s5d() {
    assertEquals(
      "2c8d 9s5d 9d8c Td5s TcJc 7cQd 8s3d 6s2h JdJh",
      Solver.process("texas-holdem 3s4s6cKdKh 9d8c 2c8d 7cQd Td5s TcJc JdJh 6s2h 8s3d 9s5d"));
  }

  @Test
  public void test_texas_holdem_8632_3c3h4sJdQd_6cKh_5d4d_9dTs_2h2s_Tc2d_7hKd_AhQs_Qh5s_7d2c() {
    assertEquals(
      "7d2c 9dTs=Tc2d 6cKh=7hKd 2h2s 5d4d Qh5s AhQs",
      Solver.process("texas-holdem 3c3h4sJdQd 6cKh 5d4d 9dTs 2h2s Tc2d 7hKd AhQs Qh5s 7d2c"));
  }

  @Test
  public void test_texas_holdem_8633_2c2d4dJdTd_Ah9h_8cJc_6s2h() {
    assertEquals(
      "Ah9h 8cJc 6s2h",
      Solver.process("texas-holdem 2c2d4dJdTd Ah9h 8cJc 6s2h"));
  }

  @Test
  public void test_texas_holdem_8634_3s8sQhThTs_4s7s_AhTc_6sQc_7dAd_9s2d_5c6h_4h4d_6cAc_QsTd() {
    assertEquals(
      "5c6h 9s2d 6cAc=7dAd 4h4d 6sQc AhTc 4s7s QsTd",
      Solver.process("texas-holdem 3s8sQhThTs 4s7s AhTc 6sQc 7dAd 9s2d 5c6h 4h4d 6cAc QsTd"));
  }

  @Test
  public void test_texas_holdem_8635_2c4c6s8sJc_Jd2s_QdQh_Th5h() {
    assertEquals(
      "Th5h QdQh Jd2s",
      Solver.process("texas-holdem 2c4c6s8sJc Jd2s QdQh Th5h"));
  }

  @Test
  public void test_texas_holdem_8636_4d4sAhAsTs_5d2c_2s3d_9hTh() {
    assertEquals(
      "2s3d=5d2c 9hTh",
      Solver.process("texas-holdem 4d4sAhAsTs 5d2c 2s3d 9hTh"));
  }

  @Test
  public void test_texas_holdem_8637_2c8sAcAdQs_9dKh_5sTh_7dKd_Kc3d_9s7s_6sAh_4d2d() {
    assertEquals(
      "9s7s 5sTh 7dKd=Kc3d 9dKh 4d2d 6sAh",
      Solver.process("texas-holdem 2c8sAcAdQs 9dKh 5sTh 7dKd Kc3d 9s7s 6sAh 4d2d"));
  }

  @Test
  public void test_texas_holdem_8638_2h4s7h9cAc_4cAh_9s4d_Jd3s_3c2d_Kc6h_QhTs_KhTh_Ad5c_5dQd() {
    assertEquals(
      "Jd3s 5dQd QhTs Kc6h KhTh 3c2d Ad5c 9s4d 4cAh",
      Solver.process("texas-holdem 2h4s7h9cAc 4cAh 9s4d Jd3s 3c2d Kc6h QhTs KhTh Ad5c 5dQd"));
  }

  @Test
  public void test_texas_holdem_8639_8dAdJhQcTc_9d3d_6dKs_2sJs_4cKh() {
    assertEquals(
      "2sJs 9d3d 4cKh=6dKs",
      Solver.process("texas-holdem 8dAdJhQcTc 9d3d 6dKs 2sJs 4cKh"));
  }

  @Test
  public void test_texas_holdem_8640_5h6s9cAcQh_2hQc_Ah4c_8s9s_2c2d_Ts4s_Jd3d_Jc8d() {
    assertEquals(
      "Ts4s Jd3d Jc8d 2c2d 8s9s 2hQc Ah4c",
      Solver.process("texas-holdem 5h6s9cAcQh 2hQc Ah4c 8s9s 2c2d Ts4s Jd3d Jc8d"));
  }

  @Test
  public void test_texas_holdem_8641_2h6c8sAcQs_Qd4d_Ts6s_4h9c_2sAs_6d7c_Ad5h_9hTc_6h8c_Jc3c() {
    assertEquals(
      "4h9c 9hTc Jc3c 6d7c Ts6s Qd4d Ad5h 6h8c 2sAs",
      Solver.process("texas-holdem 2h6c8sAcQs Qd4d Ts6s 4h9c 2sAs 6d7c Ad5h 9hTc 6h8c Jc3c"));
  }

  @Test
  public void test_texas_holdem_8642_4hJsKsQcQh_Ts9s_3cAc() {
    assertEquals(
      "3cAc Ts9s",
      Solver.process("texas-holdem 4hJsKsQcQh Ts9s 3cAc"));
  }

  @Test
  public void test_texas_holdem_8643_3h9sAcJdJh_Js2s_4hKc_6sTh_Qh7s_Td4c_5d4d() {
    assertEquals(
      "5d4d 6sTh=Td4c Qh7s 4hKc Js2s",
      Solver.process("texas-holdem 3h9sAcJdJh Js2s 4hKc 6sTh Qh7s Td4c 5d4d"));
  }

  @Test
  public void test_texas_holdem_8644_4h5s6c8cKh_Jd3s_2sAh_6s5c_7s3d() {
    assertEquals(
      "Jd3s 2sAh 6s5c 7s3d",
      Solver.process("texas-holdem 4h5s6c8cKh Jd3s 2sAh 6s5c 7s3d"));
  }

  @Test
  public void test_texas_holdem_8645_8h9hAhTcTd_7s8c_6d2c() {
    assertEquals(
      "6d2c 7s8c",
      Solver.process("texas-holdem 8h9hAhTcTd 7s8c 6d2c"));
  }

  @Test
  public void test_texas_holdem_8646_5c5dAcJdKs_Ts6c_KhQd_6s6d() {
    assertEquals(
      "Ts6c 6s6d KhQd",
      Solver.process("texas-holdem 5c5dAcJdKs Ts6c KhQd 6s6d"));
  }

  @Test
  public void test_texas_holdem_8647_3d6d6sKsTh_QhJd_Ts2s_Td8s_9cKd_4d8d_8h2d_3hTc_6h5c_Ah5h() {
    assertEquals(
      "4d8d=8h2d QhJd Ah5h 3hTc=Td8s=Ts2s 9cKd 6h5c",
      Solver.process("texas-holdem 3d6d6sKsTh QhJd Ts2s Td8s 9cKd 4d8d 8h2d 3hTc 6h5c Ah5h"));
  }

  @Test
  public void test_texas_holdem_8648_3s4c5c5hAd_Ts4d_ThKh() {
    assertEquals(
      "ThKh Ts4d",
      Solver.process("texas-holdem 3s4c5c5hAd Ts4d ThKh"));
  }

  @Test
  public void test_texas_holdem_8649_7s8h8s9dQc_4dKh_3s7h_8d6d_2dAs_AhJs_Qs4h_9h7c_JcQh() {
    assertEquals(
      "4dKh 2dAs AhJs 3s7h 9h7c Qs4h JcQh 8d6d",
      Solver.process("texas-holdem 7s8h8s9dQc 4dKh 3s7h 8d6d 2dAs AhJs Qs4h 9h7c JcQh"));
  }

  @Test
  public void test_texas_holdem_8650_6s7sKsQcTh_3hKh_3d5d_Kc7d_JhAh_7hTs() {
    assertEquals(
      "3d5d 3hKh 7hTs Kc7d JhAh",
      Solver.process("texas-holdem 6s7sKsQcTh 3hKh 3d5d Kc7d JhAh 7hTs"));
  }

  @Test
  public void test_texas_holdem_8651_2s3s8cAdJc_Qh5c_4cAh_5hTh_Js7s_5d6c_8h6h() {
    assertEquals(
      "5d6c 5hTh Qh5c 8h6h Js7s 4cAh",
      Solver.process("texas-holdem 2s3s8cAdJc Qh5c 4cAh 5hTh Js7s 5d6c 8h6h"));
  }

  @Test
  public void test_texas_holdem_8652_4s5c6cQcQs_8s4d_TsKs_8cAs() {
    assertEquals(
      "TsKs 8cAs 8s4d",
      Solver.process("texas-holdem 4s5c6cQcQs 8s4d TsKs 8cAs"));
  }

  @Test
  public void test_texas_holdem_8653_3h7sAcJhTs_4d3d_8c6d_5c7d_TcKc_6c4c() {
    assertEquals(
      "6c4c 8c6d 4d3d 5c7d TcKc",
      Solver.process("texas-holdem 3h7sAcJhTs 4d3d 8c6d 5c7d TcKc 6c4c"));
  }

  @Test
  public void test_texas_holdem_8654_4s5h6s9dJs_KhTd_2dTc_Qd3d_6d2h() {
    assertEquals(
      "2dTc Qd3d KhTd 6d2h",
      Solver.process("texas-holdem 4s5h6s9dJs KhTd 2dTc Qd3d 6d2h"));
  }

  @Test
  public void test_texas_holdem_8655_6h8s9sKhTd_3c5c_AhJh() {
    assertEquals(
      "3c5c AhJh",
      Solver.process("texas-holdem 6h8s9sKhTd 3c5c AhJh"));
  }

  @Test
  public void test_texas_holdem_8656_5c6c7dQdTd_9s2h_6dJh_8c2d() {
    assertEquals(
      "8c2d 9s2h 6dJh",
      Solver.process("texas-holdem 5c6c7dQdTd 9s2h 6dJh 8c2d"));
  }

  @Test
  public void test_texas_holdem_8657_4c5d7c9cAs_5sTs_Ah5h_8sAc_8hJh() {
    assertEquals(
      "8hJh 5sTs 8sAc Ah5h",
      Solver.process("texas-holdem 4c5d7c9cAs 5sTs Ah5h 8sAc 8hJh"));
  }

  @Test
  public void test_texas_holdem_8658_3c3h3s6hTh_Kd2d_TcQd_7s9c_5d5h_AcKs() {
    assertEquals(
      "7s9c Kd2d AcKs 5d5h TcQd",
      Solver.process("texas-holdem 3c3h3s6hTh Kd2d TcQd 7s9c 5d5h AcKs"));
  }

  @Test
  public void test_texas_holdem_8659_3c3hAcKsQd_5d2c_9hTs_8s8d_Jh2h_QhAh_2s8c() {
    assertEquals(
      "2s8c=5d2c=9hTs=Jh2h 8s8d QhAh",
      Solver.process("texas-holdem 3c3hAcKsQd 5d2c 9hTs 8s8d Jh2h QhAh 2s8c"));
  }

  @Test
  public void test_texas_holdem_8660_2h8c8s9sTs_JhAd_2sTh_3d3s_JcKc() {
    assertEquals(
      "JcKc JhAd 3d3s 2sTh",
      Solver.process("texas-holdem 2h8c8s9sTs JhAd 2sTh 3d3s JcKc"));
  }

  @Test
  public void test_texas_holdem_8661_3h3s7c9d9h_9sQs_Qh5s_7hKd_3cAs_6h9c_ThJh_4s7s() {
    assertEquals(
      "ThJh Qh5s 4s7s 7hKd 3cAs 6h9c=9sQs",
      Solver.process("texas-holdem 3h3s7c9d9h 9sQs Qh5s 7hKd 3cAs 6h9c ThJh 4s7s"));
  }

  @Test
  public void test_texas_holdem_8662_2s8h9dJcQs_3s6h_Th7s_3c3d_9s5c_KdAd() {
    assertEquals(
      "3s6h KdAd 3c3d 9s5c Th7s",
      Solver.process("texas-holdem 2s8h9dJcQs 3s6h Th7s 3c3d 9s5c KdAd"));
  }

  @Test
  public void test_texas_holdem_8663_4h4s5s7h9s_9c8d_6cKs_7s2d_8s3s_Js2c() {
    assertEquals(
      "Js2c 6cKs 7s2d 9c8d 8s3s",
      Solver.process("texas-holdem 4h4s5s7h9s 9c8d 6cKs 7s2d 8s3s Js2c"));
  }

  @Test
  public void test_texas_holdem_8664_4d8cJsQsTd_Kh2c_5s2d_3cQc_9hAs_6s5d_7sQh() {
    assertEquals(
      "5s2d 6s5d Kh2c 3cQc=7sQh 9hAs",
      Solver.process("texas-holdem 4d8cJsQsTd Kh2c 5s2d 3cQc 9hAs 6s5d 7sQh"));
  }

  @Test
  public void test_texas_holdem_8665_4h4s5c5dKd_4d5h_3dQd_Js9s_2cKc_3sKs_8c7s_5s9c_ThTd() {
    assertEquals(
      "3dQd=8c7s=Js9s ThTd 2cKc=3sKs 4d5h=5s9c",
      Solver.process("texas-holdem 4h4s5c5dKd 4d5h 3dQd Js9s 2cKc 3sKs 8c7s 5s9c ThTd"));
  }

  @Test
  public void test_texas_holdem_8666_3h6d6h9sTh_TcTs_2hKs_8h9d_Js2d_AdJd() {
    assertEquals(
      "Js2d 2hKs AdJd 8h9d TcTs",
      Solver.process("texas-holdem 3h6d6h9sTh TcTs 2hKs 8h9d Js2d AdJd"));
  }

  @Test
  public void test_texas_holdem_8667_7c9hAdKhQd_5d6c_8c5h() {
    assertEquals(
      "5d6c 8c5h",
      Solver.process("texas-holdem 7c9hAdKhQd 5d6c 8c5h"));
  }

  @Test
  public void test_texas_holdem_8668_AcAhAsKsTc_Ad7d_4d9c_Ts3s_3c6s() {
    assertEquals(
      "3c6s=4d9c Ts3s Ad7d",
      Solver.process("texas-holdem AcAhAsKsTc Ad7d 4d9c Ts3s 3c6s"));
  }

  @Test
  public void test_texas_holdem_8669_2c2s8c8hAc_6c5c_4h9s_As5d_7h2h_Js7c_6d2d_4d6s_KhAh() {
    assertEquals(
      "4d6s=4h9s=Js7c As5d KhAh 6c5c 6d2d=7h2h",
      Solver.process("texas-holdem 2c2s8c8hAc 6c5c 4h9s As5d 7h2h Js7c 6d2d 4d6s KhAh"));
  }

  @Test
  public void test_texas_holdem_8670_7dAcQcQsTd_KdKc_JsAs_Qh3d_Qd3h_Ah4d() {
    assertEquals(
      "KdKc Ah4d JsAs Qd3h=Qh3d",
      Solver.process("texas-holdem 7dAcQcQsTd KdKc JsAs Qh3d Qd3h Ah4d"));
  }

  @Test
  public void test_texas_holdem_8671_5hAsJhQdTd_9dTh_Ks2d_7cTs_3s3h_AhAd_6s8h_4c6c_TcAc_9s2c() {
    assertEquals(
      "4c6c 6s8h 9s2c 3s3h 7cTs=9dTh TcAc AhAd Ks2d",
      Solver.process("texas-holdem 5hAsJhQdTd 9dTh Ks2d 7cTs 3s3h AhAd 6s8h 4c6c TcAc 9s2c"));
  }

  @Test
  public void test_texas_holdem_8672_3h5s6d9cQc_5h5d_Tc6s_ThQh() {
    assertEquals(
      "Tc6s ThQh 5h5d",
      Solver.process("texas-holdem 3h5s6d9cQc 5h5d Tc6s ThQh"));
  }

  @Test
  public void test_texas_holdem_8673_4dJdQcQdQh_9h2s_2h4h_8hKh() {
    assertEquals(
      "9h2s 8hKh 2h4h",
      Solver.process("texas-holdem 4dJdQcQdQh 9h2s 2h4h 8hKh"));
  }

  @Test
  public void test_texas_holdem_8674_6d7s8dKsTh_6s3s_Jd8c_4s5d_Qc3c_QsKd_Ad8s_9d9h_KhQd() {
    assertEquals(
      "Qc3c 6s3s Jd8c Ad8s KhQd=QsKd 4s5d 9d9h",
      Solver.process("texas-holdem 6d7s8dKsTh 6s3s Jd8c 4s5d Qc3c QsKd Ad8s 9d9h KhQd"));
  }

  @Test
  public void test_texas_holdem_8675_3h4d8dAcQh_7s9s_7c3s_TdTc_7h2d() {
    assertEquals(
      "7h2d 7s9s 7c3s TdTc",
      Solver.process("texas-holdem 3h4d8dAcQh 7s9s 7c3s TdTc 7h2d"));
  }

  @Test
  public void test_texas_holdem_8676_5cAsJhKhQc_9d7c_AcAd_Qd2h_4cJc_8hAh_JdKc_9sQs_Tc5h_8c6c() {
    assertEquals(
      "8c6c 9d7c 4cJc 9sQs=Qd2h 8hAh JdKc AcAd Tc5h",
      Solver.process("texas-holdem 5cAsJhKhQc 9d7c AcAd Qd2h 4cJc 8hAh JdKc 9sQs Tc5h 8c6c"));
  }

  @Test
  public void test_texas_holdem_8677_6h7s9cAdTh_Qs9h_3d8c_6c8d_AhQh_3s4c_5sQc_Jc5d_JdKh_2hQd() {
    assertEquals(
      "3s4c Jc5d 2hQd=5sQc JdKh Qs9h AhQh 3d8c=6c8d",
      Solver.process("texas-holdem 6h7s9cAdTh Qs9h 3d8c 6c8d AhQh 3s4c 5sQc Jc5d JdKh 2hQd"));
  }

  @Test
  public void test_texas_holdem_8678_5c8sKcTdTs_6dJc_3dAd_9dTh_5sTc_3h7s_2h5h() {
    assertEquals(
      "3h7s 6dJc 3dAd 2h5h 9dTh 5sTc",
      Solver.process("texas-holdem 5c8sKcTdTs 6dJc 3dAd 9dTh 5sTc 3h7s 2h5h"));
  }

  @Test
  public void test_texas_holdem_8679_3h4h6c9dAc_8s5c_7c2d_TcKd_3sTh_8dKs_2cQc_Td6d_7h9s() {
    assertEquals(
      "7c2d 8s5c 2cQc 8dKs TcKd 3sTh Td6d 7h9s",
      Solver.process("texas-holdem 3h4h6c9dAc 8s5c 7c2d TcKd 3sTh 8dKs 2cQc Td6d 7h9s"));
  }

  @Test
  public void test_texas_holdem_8680_3d6s9sAdKc_9h3h_4d7d_9cKd() {
    assertEquals(
      "4d7d 9h3h 9cKd",
      Solver.process("texas-holdem 3d6s9sAdKc 9h3h 4d7d 9cKd"));
  }

  @Test
  public void test_texas_holdem_8681_3c7h8cJhQc_7cQs_Qh8h_2c4h() {
    assertEquals(
      "2c4h 7cQs Qh8h",
      Solver.process("texas-holdem 3c7h8cJhQc 7cQs Qh8h 2c4h"));
  }

  @Test
  public void test_texas_holdem_8682_4c5c8h8sQc_2h2d_9s3c_2s3d_6cKc() {
    assertEquals(
      "2s3d 9s3c 2h2d 6cKc",
      Solver.process("texas-holdem 4c5c8h8sQc 2h2d 9s3c 2s3d 6cKc"));
  }

  @Test
  public void test_texas_holdem_8683_2c6hKsQdTh_7d7h_8d3h_7s3d_As5h() {
    assertEquals(
      "7s3d 8d3h As5h 7d7h",
      Solver.process("texas-holdem 2c6hKsQdTh 7d7h 8d3h 7s3d As5h"));
  }

  @Test
  public void test_texas_holdem_8684_5d9h9sQhQs_AsKs_Jd4c_6c9c_AcTd() {
    assertEquals(
      "Jd4c AcTd=AsKs 6c9c",
      Solver.process("texas-holdem 5d9h9sQhQs AsKs Jd4c 6c9c AcTd"));
  }

  @Test
  public void test_texas_holdem_8685_4h5c9cKsQd_2c6s_KdQh() {
    assertEquals(
      "2c6s KdQh",
      Solver.process("texas-holdem 4h5c9cKsQd 2c6s KdQh"));
  }

  @Test
  public void test_texas_holdem_8686_3c4h6s9hQc_8d6h_Ks4c_AhQd() {
    assertEquals(
      "Ks4c 8d6h AhQd",
      Solver.process("texas-holdem 3c4h6s9hQc 8d6h Ks4c AhQd"));
  }

  @Test
  public void test_texas_holdem_8687_2dAhJhQsTh_5hTd_6dAd_Qd9c_8hAc() {
    assertEquals(
      "5hTd Qd9c 6dAd=8hAc",
      Solver.process("texas-holdem 2dAhJhQsTh 5hTd 6dAd Qd9c 8hAc"));
  }

  @Test
  public void test_texas_holdem_8688_2h3s7h9cTc_4d9h_JhAd_5d3h_5cJs_9s7s_5sKh() {
    assertEquals(
      "5cJs 5sKh JhAd 5d3h 4d9h 9s7s",
      Solver.process("texas-holdem 2h3s7h9cTc 4d9h JhAd 5d3h 5cJs 9s7s 5sKh"));
  }

  @Test
  public void test_texas_holdem_8689_4c6c6dQsTs_6h9h_2hTh() {
    assertEquals(
      "2hTh 6h9h",
      Solver.process("texas-holdem 4c6c6dQsTs 6h9h 2hTh"));
  }

  @Test
  public void test_texas_holdem_8690_4d4h5s8hKh_9cTd_2cAh_Kc5c_6dKs_8cJc_7c4c_9dAc_9h8d() {
    assertEquals(
      "9cTd 2cAh 9dAc 8cJc=9h8d 6dKs Kc5c 7c4c",
      Solver.process("texas-holdem 4d4h5s8hKh 9cTd 2cAh Kc5c 6dKs 8cJc 7c4c 9dAc 9h8d"));
  }

  @Test
  public void test_texas_holdem_8691_6s9hAsJdTd_7h2h_2cKh_Jc4c_Ts5h_9sAh_5sAc() {
    assertEquals(
      "7h2h 2cKh Ts5h Jc4c 5sAc 9sAh",
      Solver.process("texas-holdem 6s9hAsJdTd 7h2h 2cKh Jc4c Ts5h 9sAh 5sAc"));
  }

  @Test
  public void test_texas_holdem_8692_2h5sJhQhTh_Ad4d_8dKc_7d3s_4c9d_2sTc_6h8h_9sKs() {
    assertEquals(
      "7d3s 4c9d 8dKc Ad4d 2sTc 9sKs 6h8h",
      Solver.process("texas-holdem 2h5sJhQhTh Ad4d 8dKc 7d3s 4c9d 2sTc 6h8h 9sKs"));
  }

  @Test
  public void test_texas_holdem_8693_2d2h3c9hJd_7d2c_8d6h_2s4h_8sTc() {
    assertEquals(
      "8d6h 8sTc 2s4h=7d2c",
      Solver.process("texas-holdem 2d2h3c9hJd 7d2c 8d6h 2s4h 8sTc"));
  }

  @Test
  public void test_texas_holdem_8694_4c4dJhJsKh_Kd9c_6s6h_7d9h_Ac5d_Qc7s_4h9s_Tc3d_2cJc_8h7h() {
    assertEquals(
      "7d9h=8h7h=Qc7s=Tc3d Ac5d 6s6h Kd9c 4h9s 2cJc",
      Solver.process("texas-holdem 4c4dJhJsKh Kd9c 6s6h 7d9h Ac5d Qc7s 4h9s Tc3d 2cJc 8h7h"));
  }

  @Test
  public void test_texas_holdem_8695_3c3d7h8h9h_6cTh_9sJs_Jd5c_9c8s_6hTs() {
    assertEquals(
      "Jd5c 9sJs 9c8s 6cTh=6hTs",
      Solver.process("texas-holdem 3c3d7h8h9h 6cTh 9sJs Jd5c 9c8s 6hTs"));
  }

  @Test
  public void test_texas_holdem_8696_4d5d9dKsQs_Qh5h_7h3s() {
    assertEquals(
      "7h3s Qh5h",
      Solver.process("texas-holdem 4d5d9dKsQs Qh5h 7h3s"));
  }

  @Test
  public void test_texas_holdem_8697_4s5h7sTcTh_9s3s_Jc5c_2dTs_5d8d_Ah9h_JsQs() {
    assertEquals(
      "9s3s JsQs Ah9h 5d8d Jc5c 2dTs",
      Solver.process("texas-holdem 4s5h7sTcTh 9s3s Jc5c 2dTs 5d8d Ah9h JsQs"));
  }

  @Test
  public void test_texas_holdem_8698_3h5h9sJcQd_5c8h_3sJh_2s6s_5d7s_6d4h_Ks9h_2d7h_3dAs() {
    assertEquals(
      "2s6s=6d4h 2d7h 3dAs 5c8h=5d7s Ks9h 3sJh",
      Solver.process("texas-holdem 3h5h9sJcQd 5c8h 3sJh 2s6s 5d7s 6d4h Ks9h 2d7h 3dAs"));
  }

  @Test
  public void test_texas_holdem_8699_3d5c6dJcTs_Tc8h_Js8s() {
    assertEquals(
      "Tc8h Js8s",
      Solver.process("texas-holdem 3d5c6dJcTs Tc8h Js8s"));
  }

  @Test
  public void test_texas_holdem_8700_4s7h9sAsKs_9h3s_3hJc_QdAh_5sKh_7cQc_4dKd_8cTs_4cTh_2s5d() {
    assertEquals(
      "3hJc 4cTh 7cQc QdAh 4dKd 2s5d 9h3s 5sKh 8cTs",
      Solver.process("texas-holdem 4s7h9sAsKs 9h3s 3hJc QdAh 5sKh 7cQc 4dKd 8cTs 4cTh 2s5d"));
  }

  @Test
  public void test_texas_holdem_8701_2c2h8d8sAc_Ah9s_Qs6s_JhJs_2s5h() {
    assertEquals(
      "Qs6s JhJs Ah9s 2s5h",
      Solver.process("texas-holdem 2c2h8d8sAc Ah9s Qs6s JhJs 2s5h"));
  }

  @Test
  public void test_texas_holdem_8702_3c3d4dKcKh_As9s_6h2h_8s9d_6dTs_Ah7d_8dJc() {
    assertEquals(
      "6h2h 8s9d 6dTs 8dJc Ah7d=As9s",
      Solver.process("texas-holdem 3c3d4dKcKh As9s 6h2h 8s9d 6dTs Ah7d 8dJc"));
  }

  @Test
  public void test_texas_holdem_8703_6s8dQcQsTh_Jh6h_6cAh_Td3d_7h3c_8cAs_9sQd_5s2h_Jc3h_QhJs() {
    assertEquals(
      "5s2h 7h3c Jc3h Jh6h 6cAh 8cAs Td3d 9sQd QhJs",
      Solver.process("texas-holdem 6s8dQcQsTh Jh6h 6cAh Td3d 7h3c 8cAs 9sQd 5s2h Jc3h QhJs"));
  }

  @Test
  public void test_texas_holdem_8704_8s9sKcKhTd_Qs8h_TsAc_9cJd_2c5s_7s4c_Jh7d_Ah5h() {
    assertEquals(
      "2c5s=7s4c Ah5h Qs8h 9cJd TsAc Jh7d",
      Solver.process("texas-holdem 8s9sKcKhTd Qs8h TsAc 9cJd 2c5s 7s4c Jh7d Ah5h"));
  }

  @Test
  public void test_texas_holdem_8705_3d5h7dAhTh_JcQs_3sAc_8c5s_9h5d_9dKd_2s2h_7hKc_8h9s() {
    assertEquals(
      "8h9s JcQs 9dKd 2s2h 8c5s 9h5d 7hKc 3sAc",
      Solver.process("texas-holdem 3d5h7dAhTh JcQs 3sAc 8c5s 9h5d 9dKd 2s2h 7hKc 8h9s"));
  }

  @Test
  public void test_texas_holdem_8706_5h8hJhKsTd_QdTc_3cAc_Jc4d_Jd6c_6hKc_3d6d() {
    assertEquals(
      "3d6d 3cAc QdTc Jc4d=Jd6c 6hKc",
      Solver.process("texas-holdem 5h8hJhKsTd QdTc 3cAc Jc4d Jd6c 6hKc 3d6d"));
  }

  @Test
  public void test_texas_holdem_8707_9cAdKcQhTd_6d5h_Ac3h_3sQs_Jh4d_6hAh_6sKd_9dKh_2h9h_4sJd() {
    assertEquals(
      "6d5h 2h9h 3sQs 6sKd 6hAh=Ac3h 9dKh 4sJd=Jh4d",
      Solver.process("texas-holdem 9cAdKcQhTd 6d5h Ac3h 3sQs Jh4d 6hAh 6sKd 9dKh 2h9h 4sJd"));
  }

  @Test
  public void test_texas_holdem_8708_5d9c9sKhKs_6d3h_8dTs_7h5s_8h3c_JhAh_4h4s() {
    assertEquals(
      "4h4s 6d3h 7h5s 8h3c 8dTs JhAh",
      Solver.process("texas-holdem 5d9c9sKhKs 6d3h 8dTs 7h5s 8h3c JhAh 4h4s"));
  }

  @Test
  public void test_texas_holdem_8709_4c4s7sJsQc_9sAd_Td6d_QdTh_5c3d_Jd9h_AsKc_2sTs() {
    assertEquals(
      "5c3d Td6d 9sAd AsKc Jd9h QdTh 2sTs",
      Solver.process("texas-holdem 4c4s7sJsQc 9sAd Td6d QdTh 5c3d Jd9h AsKc 2sTs"));
  }

  @Test
  public void test_texas_holdem_8710_3h4c6hJhKc_9sJc_8h6c_Tc6s_4h3d_Jd7c_AcAh() {
    assertEquals(
      "8h6c Tc6s Jd7c 9sJc AcAh 4h3d",
      Solver.process("texas-holdem 3h4c6hJhKc 9sJc 8h6c Tc6s 4h3d Jd7c AcAh"));
  }

  @Test
  public void test_texas_holdem_8711_5d6s8d8h9c_TdKd_4d5h_7c8c() {
    assertEquals(
      "TdKd 4d5h 7c8c",
      Solver.process("texas-holdem 5d6s8d8h9c TdKd 4d5h 7c8c"));
  }

  @Test
  public void test_texas_holdem_8712_7s8dAhKsQc_JsAc_Td9c_AsQs() {
    assertEquals(
      "Td9c JsAc AsQs",
      Solver.process("texas-holdem 7s8dAhKsQc JsAc Td9c AsQs"));
  }

  @Test
  public void test_texas_holdem_8713_4c5h6sKsTc_Ah6h_2s7h_Js5d_7c6c_JhTh_2h2d() {
    assertEquals(
      "2s7h 2h2d Js5d 7c6c Ah6h JhTh",
      Solver.process("texas-holdem 4c5h6sKsTc Ah6h 2s7h Js5d 7c6c JhTh 2h2d"));
  }

  @Test
  public void test_texas_holdem_8714_6c7h8s9sAs_9h3h_5s8c_5c7c_4hTd_3sQh_8dKh_4c5h() {
    assertEquals(
      "3sQh 8dKh 9h3h 4c5h=5c7c=5s8c 4hTd",
      Solver.process("texas-holdem 6c7h8s9sAs 9h3h 5s8c 5c7c 4hTd 3sQh 8dKh 4c5h"));
  }

  @Test
  public void test_texas_holdem_8715_2d7cJdKhTc_3h8s_Th2h_9d4s_8d6d_Ah2c_5s8h() {
    assertEquals(
      "3h8s=5s8h=8d6d 9d4s Ah2c Th2h",
      Solver.process("texas-holdem 2d7cJdKhTc 3h8s Th2h 9d4s 8d6d Ah2c 5s8h"));
  }

  @Test
  public void test_texas_holdem_8716_5d7dAcTcTd_Ah6h_Kd4s_Ks3d_3h9c_3c2h_9sJs_Ts8c_3sJd() {
    assertEquals(
      "3c2h 3h9c 3sJd 9sJs Kd4s=Ks3d Ah6h Ts8c",
      Solver.process("texas-holdem 5d7dAcTcTd Ah6h Kd4s Ks3d 3h9c 3c2h 9sJs Ts8c 3sJd"));
  }

  @Test
  public void test_texas_holdem_8717_2h6d7cQdTs_Ks4s_6sAc_6cAd_8d8c_Tc8h_7d7s_QhTd_4dQs_2sKc() {
    assertEquals(
      "Ks4s 2sKc 6cAd=6sAc 8d8c Tc8h 4dQs QhTd 7d7s",
      Solver.process("texas-holdem 2h6d7cQdTs Ks4s 6sAc 6cAd 8d8c Tc8h 7d7s QhTd 4dQs 2sKc"));
  }

  @Test
  public void test_texas_holdem_8718_4d8hJcJhTd_Qd6h_9d7s_3h2h_4hTc() {
    assertEquals(
      "3h2h Qd6h 4hTc 9d7s",
      Solver.process("texas-holdem 4d8hJcJhTd Qd6h 9d7s 3h2h 4hTc"));
  }

  @Test
  public void test_texas_holdem_8719_2c4c6hKhTs_9c5c_9s9d() {
    assertEquals(
      "9c5c 9s9d",
      Solver.process("texas-holdem 2c4c6hKhTs 9c5c 9s9d"));
  }

  @Test
  public void test_texas_holdem_8720_2s5s8cQsTh_AhTd_Qh4d_4c6h_Ad6c_JsKc_Ts6s_Ks4h_8d7d() {
    assertEquals(
      "4c6h Ks4h JsKc Ad6c 8d7d AhTd Qh4d Ts6s",
      Solver.process("texas-holdem 2s5s8cQsTh AhTd Qh4d 4c6h Ad6c JsKc Ts6s Ks4h 8d7d"));
  }

  @Test
  public void test_texas_holdem_8721_6sAsJdTcTs_Qd2s_3dQs_5dAc() {
    assertEquals(
      "3dQs=Qd2s 5dAc",
      Solver.process("texas-holdem 6sAsJdTcTs Qd2s 3dQs 5dAc"));
  }

  @Test
  public void test_texas_holdem_8722_9sAsJcKsTc_7s4c_6s3s_8hQh_8cTs_ThJh_7hQc_Kd6c_JsKh_7cAd() {
    assertEquals(
      "7s4c 8cTs Kd6c 7cAd ThJh JsKh 7hQc=8hQh 6s3s",
      Solver.process("texas-holdem 9sAsJcKsTc 7s4c 6s3s 8hQh 8cTs ThJh 7hQc Kd6c JsKh 7cAd"));
  }

  @Test
  public void test_texas_holdem_8723_2c8cAsKhQd_9s2h_5c5d_5s4s_7hAd_9c6d_Ac8h() {
    assertEquals(
      "5s4s 9c6d 9s2h 5c5d 7hAd Ac8h",
      Solver.process("texas-holdem 2c8cAsKhQd 9s2h 5c5d 5s4s 7hAd 9c6d Ac8h"));
  }

  @Test
  public void test_texas_holdem_8724_2s4h5s6hQs_8d6c_TsJh_7h9d() {
    assertEquals(
      "7h9d TsJh 8d6c",
      Solver.process("texas-holdem 2s4h5s6hQs 8d6c TsJh 7h9d"));
  }

  @Test
  public void test_texas_holdem_8725_4s7s8c9dAd_TdTs_Tc3d_5d2d() {
    assertEquals(
      "5d2d Tc3d TdTs",
      Solver.process("texas-holdem 4s7s8c9dAd TdTs Tc3d 5d2d"));
  }

  @Test
  public void test_texas_holdem_8726_3h6s7h8hQd_9s7c_Ad9c() {
    assertEquals(
      "Ad9c 9s7c",
      Solver.process("texas-holdem 3h6s7h8hQd 9s7c Ad9c"));
  }

  @Test
  public void test_texas_holdem_8727_7h8dAdAsKh_2dQs_3s6s_9cTd_Qd5s() {
    assertEquals(
      "3s6s 9cTd 2dQs=Qd5s",
      Solver.process("texas-holdem 7h8dAdAsKh 2dQs 3s6s 9cTd Qd5s"));
  }

  @Test
  public void test_texas_holdem_8728_2s5hJdQdTc_Jc8h_9s6h_4d9c() {
    assertEquals(
      "4d9c 9s6h Jc8h",
      Solver.process("texas-holdem 2s5hJdQdTc Jc8h 9s6h 4d9c"));
  }

  @Test
  public void test_texas_holdem_8729_2c4d7c8h8s_3sQc_Ks4h_5c5h_Ts9d_6hAh_2d5s_Ac9s_KdAd_4sAs() {
    assertEquals(
      "Ts9d 3sQc 6hAh Ac9s KdAd 2d5s Ks4h 4sAs 5c5h",
      Solver.process("texas-holdem 2c4d7c8h8s 3sQc Ks4h 5c5h Ts9d 6hAh 2d5s Ac9s KdAd 4sAs"));
  }

  @Test
  public void test_texas_holdem_8730_4s6dJcQsTd_7h6h_3s6s_2d4d() {
    assertEquals(
      "2d4d 3s6s=7h6h",
      Solver.process("texas-holdem 4s6dJcQsTd 7h6h 3s6s 2d4d"));
  }

  @Test
  public void test_texas_holdem_8731_7h8c9cJsKs_3h6c_8s3s_AsTs_8h4d_5hAd_9hKd() {
    assertEquals(
      "3h6c 5hAd 8h4d=8s3s 9hKd AsTs",
      Solver.process("texas-holdem 7h8c9cJsKs 3h6c 8s3s AsTs 8h4d 5hAd 9hKd"));
  }

  @Test
  public void test_texas_holdem_8732_3h5d6d6hAc_TcTh_4s2h_4c7h_2s5h_QhKd() {
    assertEquals(
      "QhKd 2s5h TcTh 4s2h 4c7h",
      Solver.process("texas-holdem 3h5d6d6hAc TcTh 4s2h 4c7h 2s5h QhKd"));
  }

  @Test
  public void test_texas_holdem_8733_2d3c3hAsTd_4h5c_8c6h() {
    assertEquals(
      "8c6h 4h5c",
      Solver.process("texas-holdem 2d3c3hAsTd 4h5c 8c6h"));
  }

  @Test
  public void test_texas_holdem_8734_3c3d4s5cKc_As8s_8dAd_JsJc() {
    assertEquals(
      "8dAd=As8s JsJc",
      Solver.process("texas-holdem 3c3d4s5cKc As8s 8dAd JsJc"));
  }

  @Test
  public void test_texas_holdem_8735_4h6h8h9sKh_Jc5s_4cTc_8s3h_2dAh_3sJs_5c7h_5h9d_Th6d() {
    assertEquals(
      "3sJs=Jc5s 4cTc 8s3h 5h9d 5c7h Th6d 2dAh",
      Solver.process("texas-holdem 4h6h8h9sKh Jc5s 4cTc 8s3h 2dAh 3sJs 5c7h 5h9d Th6d"));
  }

  @Test
  public void test_texas_holdem_8736_2c6dJhKcTc_Ks2d_Qs3c_8c5d_9c9s() {
    assertEquals(
      "8c5d Qs3c 9c9s Ks2d",
      Solver.process("texas-holdem 2c6dJhKcTc Ks2d Qs3c 8c5d 9c9s"));
  }

  @Test
  public void test_texas_holdem_8737_6h7h8sQdTh_TsJs_6c5c() {
    assertEquals(
      "6c5c TsJs",
      Solver.process("texas-holdem 6h7h8sQdTh TsJs 6c5c"));
  }

  @Test
  public void test_texas_holdem_8738_5d6s8s9dQs_6d3c_6cJc() {
    assertEquals(
      "6d3c 6cJc",
      Solver.process("texas-holdem 5d6s8s9dQs 6d3c 6cJc"));
  }

  @Test
  public void test_texas_holdem_8739_4d5c9cQdTh_JhAc_Ah3d_Tc6s_Kc7d_7h5d() {
    assertEquals(
      "Kc7d Ah3d JhAc 7h5d Tc6s",
      Solver.process("texas-holdem 4d5c9cQdTh JhAc Ah3d Tc6s Kc7d 7h5d"));
  }

  @Test
  public void test_texas_holdem_8740_2c3c4dQdQh_7c8h_ThTd_9s3h_5h8d_9c6c_QcAs_4h5s() {
    assertEquals(
      "5h8d 7c8h 9c6c 9s3h 4h5s ThTd QcAs",
      Solver.process("texas-holdem 2c3c4dQdQh 7c8h ThTd 9s3h 5h8d 9c6c QcAs 4h5s"));
  }

  @Test
  public void test_texas_holdem_8741_2d8h9dAdQc_Qs4c_5d4h_3h6s_8sTh_6c5s_Kc7d() {
    assertEquals(
      "5d4h 3h6s=6c5s Kc7d 8sTh Qs4c",
      Solver.process("texas-holdem 2d8h9dAdQc Qs4c 5d4h 3h6s 8sTh 6c5s Kc7d"));
  }

  @Test
  public void test_texas_holdem_8742_3c3h6d6sTc_9hAs_Ts6c_4h8h_9d7h_3sKs_2sAh_7s7d_2hKc_8c5c() {
    assertEquals(
      "4h8h=8c5c=9d7h 2hKc 2sAh=9hAs 7s7d 3sKs Ts6c",
      Solver.process("texas-holdem 3c3h6d6sTc 9hAs Ts6c 4h8h 9d7h 3sKs 2sAh 7s7d 2hKc 8c5c"));
  }

  @Test
  public void test_texas_holdem_8743_2s5h6c8cAc_Ks4h_6sTd_Qh3s() {
    assertEquals(
      "Qh3s Ks4h 6sTd",
      Solver.process("texas-holdem 2s5h6c8cAc Ks4h 6sTd Qh3s"));
  }

  @Test
  public void test_texas_holdem_8744_2h3h4s5d6h_AsJh_5c8c_3s9c() {
    assertEquals(
      "3s9c=5c8c=AsJh",
      Solver.process("texas-holdem 2h3h4s5d6h AsJh 5c8c 3s9c"));
  }

  @Test
  public void test_texas_holdem_8745_3c6s9dJcJd_8dQc_Ac3d_9hTd_7c2h_9s6d_5hAd_4d7h_3h6c() {
    assertEquals(
      "4d7h=7c2h 8dQc 5hAd Ac3d 3h6c 9s6d 9hTd",
      Solver.process("texas-holdem 3c6s9dJcJd 8dQc Ac3d 9hTd 7c2h 9s6d 5hAd 4d7h 3h6c"));
  }

  @Test
  public void test_texas_holdem_8746_2c3c7h8c8s_7sTc_5hKc_3h3s_8h6c_7dAd_KsJs_6d2h() {
    assertEquals(
      "5hKc KsJs 6d2h 7sTc 7dAd 8h6c 3h3s",
      Solver.process("texas-holdem 2c3c7h8c8s 7sTc 5hKc 3h3s 8h6c 7dAd KsJs 6d2h"));
  }

  @Test
  public void test_texas_holdem_8747_5c8c8sAdTh_Ac8d_JdJc_2s4h_Tc7h_2cQs() {
    assertEquals(
      "2s4h 2cQs Tc7h JdJc Ac8d",
      Solver.process("texas-holdem 5c8c8sAdTh Ac8d JdJc 2s4h Tc7h 2cQs"));
  }

  @Test
  public void test_texas_holdem_8748_7c7h8cAdJh_3hQs_8d5h_2c9h_5s2d_3dKs() {
    assertEquals(
      "5s2d 2c9h 3hQs 3dKs 8d5h",
      Solver.process("texas-holdem 7c7h8cAdJh 3hQs 8d5h 2c9h 5s2d 3dKs"));
  }

  @Test
  public void test_texas_holdem_8749_2h2s5d9cAc_ThAs_5sQc_7c7s_5c2c_4h7d_Ad3d_8hAh_8sKd() {
    assertEquals(
      "4h7d 8sKd 5sQc 7c7s 8hAh=Ad3d ThAs 5c2c",
      Solver.process("texas-holdem 2h2s5d9cAc ThAs 5sQc 7c7s 5c2c 4h7d Ad3d 8hAh 8sKd"));
  }

}
