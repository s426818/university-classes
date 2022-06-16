
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver38HiddenTest {


  @Test
  public void test_texas_holdem_9500_3s6c7sKcQh_Tc5d_Js3h_5c2s_2hQc_6s6d_TdJc_5hJd_3c6h_2c5s() {
    assertEquals(
      "2c5s=5c2s Tc5d 5hJd TdJc Js3h 2hQc 3c6h 6s6d",
      Solver.process("texas-holdem 3s6c7sKcQh Tc5d Js3h 5c2s 2hQc 6s6d TdJc 5hJd 3c6h 2c5s"));
  }

  @Test
  public void test_texas_holdem_9501_3c3h7sQdQs_QhKh_Tc2c_6h6d() {
    assertEquals(
      "Tc2c 6h6d QhKh",
      Solver.process("texas-holdem 3c3h7sQdQs QhKh Tc2c 6h6d"));
  }

  @Test
  public void test_texas_holdem_9502_4d6h7hJhTd_Jc7d_2s9s_6d2d_2cQc_5sAc_4c9d() {
    assertEquals(
      "2s9s 2cQc 5sAc 4c9d 6d2d Jc7d",
      Solver.process("texas-holdem 4d6h7hJhTd Jc7d 2s9s 6d2d 2cQc 5sAc 4c9d"));
  }

  @Test
  public void test_texas_holdem_9503_3d5d7dKhTh_4d9c_AhTc_As3h_7cTd_Qh8h_7hQs() {
    assertEquals(
      "4d9c Qh8h As3h 7hQs AhTc 7cTd",
      Solver.process("texas-holdem 3d5d7dKhTh 4d9c AhTc As3h 7cTd Qh8h 7hQs"));
  }

  @Test
  public void test_texas_holdem_9504_4h6dAhJhTd_QsJd_2c9s_QcJs_5s7c_Ks6h_8d9c_2dQd_2sJc() {
    assertEquals(
      "5s7c 2c9s 8d9c 2dQd Ks6h 2sJc QcJs=QsJd",
      Solver.process("texas-holdem 4h6dAhJhTd QsJd 2c9s QcJs 5s7c Ks6h 8d9c 2dQd 2sJc"));
  }

  @Test
  public void test_texas_holdem_9505_3c5c7d7hQs_Qd2h_TsTh_6h2d_2sJd() {
    assertEquals(
      "6h2d 2sJd TsTh Qd2h",
      Solver.process("texas-holdem 3c5c7d7hQs Qd2h TsTh 6h2d 2sJd"));
  }

  @Test
  public void test_texas_holdem_9506_3d4s7h9hAd_AsKd_TcQs_8c7c_6hKs_8sJh_Jc6c_5sAc_7d8d_ThTd() {
    assertEquals(
      "Jc6c 8sJh TcQs 6hKs 7d8d=8c7c ThTd 5sAc AsKd",
      Solver.process("texas-holdem 3d4s7h9hAd AsKd TcQs 8c7c 6hKs 8sJh Jc6c 5sAc 7d8d ThTd"));
  }

  @Test
  public void test_texas_holdem_9507_3s4hAdJhTd_7c3d_AcJd_8hJs_4c6s_9h5c_Jc3c() {
    assertEquals(
      "9h5c 7c3d 4c6s 8hJs Jc3c AcJd",
      Solver.process("texas-holdem 3s4hAdJhTd 7c3d AcJd 8hJs 4c6s 9h5c Jc3c"));
  }

  @Test
  public void test_texas_holdem_9508_3h5d7dAcTd_TsQh_5hTc_3sJh_AdQs_JcQd_7h8s_9sAs_3d9h_KhJd() {
    assertEquals(
      "JcQd KhJd 3d9h 3sJh 7h8s TsQh 9sAs AdQs 5hTc",
      Solver.process("texas-holdem 3h5d7dAcTd TsQh 5hTc 3sJh AdQs JcQd 7h8s 9sAs 3d9h KhJd"));
  }

  @Test
  public void test_texas_holdem_9509_6s8s9d9hQh_Th2c_Ad6c_2dQc() {
    assertEquals(
      "Th2c Ad6c 2dQc",
      Solver.process("texas-holdem 6s8s9d9hQh Th2c Ad6c 2dQc"));
  }

  @Test
  public void test_texas_holdem_9510_2s4h8h9cTd_5h2h_9s9d_4sKc_6hAh_7h4c_6s3d_Jc5s_QdTh() {
    assertEquals(
      "6s3d Jc5s 6hAh 5h2h 7h4c 4sKc QdTh 9s9d",
      Solver.process("texas-holdem 2s4h8h9cTd 5h2h 9s9d 4sKc 6hAh 7h4c 6s3d Jc5s QdTh"));
  }

  @Test
  public void test_texas_holdem_9511_3h5h8sAcTd_2dTh_3d3s_8hJs_7h7c() {
    assertEquals(
      "7h7c 8hJs 2dTh 3d3s",
      Solver.process("texas-holdem 3h5h8sAcTd 2dTh 3d3s 8hJs 7h7c"));
  }

  @Test
  public void test_texas_holdem_9512_3h7c7dKcTs_Tc8c_Kd4d_As9d_Qs6s() {
    assertEquals(
      "Qs6s As9d Tc8c Kd4d",
      Solver.process("texas-holdem 3h7c7dKcTs Tc8c Kd4d As9d Qs6s"));
  }

  @Test
  public void test_texas_holdem_9513_4h6c7cTcTd_9hAc_4dKs_3h6d_QhTh_Jh5c_9s8d() {
    assertEquals(
      "Jh5c 9hAc 4dKs 3h6d QhTh 9s8d",
      Solver.process("texas-holdem 4h6c7cTcTd 9hAc 4dKs 3h6d QhTh Jh5c 9s8d"));
  }

  @Test
  public void test_texas_holdem_9514_2h3h4d7dKd_2cAd_7sJs_Qs2d_JcTc_3d7c_Td7h_8d4c_4h9d_6s4s() {
    assertEquals(
      "JcTc Qs2d 2cAd 6s4s 8d4c 4h9d Td7h 7sJs 3d7c",
      Solver.process("texas-holdem 2h3h4d7dKd 2cAd 7sJs Qs2d JcTc 3d7c Td7h 8d4c 4h9d 6s4s"));
  }

  @Test
  public void test_texas_holdem_9515_2h3h6cAdAs_Kd5c_2sQh_4dAc_8d8h_9d7h_2c9c_5h7c_7sQs() {
    assertEquals(
      "5h7c 9d7h 7sQs Kd5c 2c9c 2sQh 8d8h 4dAc",
      Solver.process("texas-holdem 2h3h6cAdAs Kd5c 2sQh 4dAc 8d8h 9d7h 2c9c 5h7c 7sQs"));
  }

  @Test
  public void test_texas_holdem_9516_2d4hJcKcKd_Jh4c_Ah8d_Th3s_Td9h_7c6d_8h5c_Ad4s_Ac2s() {
    assertEquals(
      "7c6d 8h5c Th3s Td9h Ah8d Ac2s Ad4s Jh4c",
      Solver.process("texas-holdem 2d4hJcKcKd Jh4c Ah8d Th3s Td9h 7c6d 8h5c Ad4s Ac2s"));
  }

  @Test
  public void test_texas_holdem_9517_5h6s7c9dTd_6c9c_Kc8h_4h2h_9sQh_Ad4s() {
    assertEquals(
      "4h2h Ad4s 9sQh 6c9c Kc8h",
      Solver.process("texas-holdem 5h6s7c9dTd 6c9c Kc8h 4h2h 9sQh Ad4s"));
  }

  @Test
  public void test_texas_holdem_9518_2s4d5hAsKh_Ts9d_Td9c() {
    assertEquals(
      "Td9c=Ts9d",
      Solver.process("texas-holdem 2s4d5hAsKh Ts9d Td9c"));
  }

  @Test
  public void test_texas_holdem_9519_2d5s8c8dJh_6hTh_JdQs_7cKd_3d5h_6sQd() {
    assertEquals(
      "6hTh 6sQd 7cKd 3d5h JdQs",
      Solver.process("texas-holdem 2d5s8c8dJh 6hTh JdQs 7cKd 3d5h 6sQd"));
  }

  @Test
  public void test_texas_holdem_9520_4s5c8cAhQh_3cTc_Ad8s() {
    assertEquals(
      "3cTc Ad8s",
      Solver.process("texas-holdem 4s5c8cAhQh 3cTc Ad8s"));
  }

  @Test
  public void test_texas_holdem_9521_2s4s6d7sAc_Jh3d_2cTc_7hAh_QdTs_3s5h_QhKd_As9d_9h8h_7c8d() {
    assertEquals(
      "9h8h Jh3d QdTs QhKd 2cTc 7c8d As9d 7hAh 3s5h",
      Solver.process("texas-holdem 2s4s6d7sAc Jh3d 2cTc 7hAh QdTs 3s5h QhKd As9d 9h8h 7c8d"));
  }

  @Test
  public void test_texas_holdem_9522_2d5s6cKcQh_6hTs_Ac8c_AsTh_9s4s_Jh3s_5cQd_3hAh_Jd9c() {
    assertEquals(
      "9s4s Jh3s Jd9c 3hAh Ac8c AsTh 6hTs 5cQd",
      Solver.process("texas-holdem 2d5s6cKcQh 6hTs Ac8c AsTh 9s4s Jh3s 5cQd 3hAh Jd9c"));
  }

  @Test
  public void test_texas_holdem_9523_6d9sAcKhQd_As5c_8d5h_4h2s_7s8c_TdAd_Jd8s() {
    assertEquals(
      "4h2s 7s8c=8d5h Jd8s As5c TdAd",
      Solver.process("texas-holdem 6d9sAcKhQd As5c 8d5h 4h2s 7s8c TdAd Jd8s"));
  }

  @Test
  public void test_texas_holdem_9524_5d6d7d7sJh_2d7h_Jc5c_3c4d_Kh5h_2hKc_4h8c_8s5s_4s9h() {
    assertEquals(
      "4s9h 2hKc 8s5s Kh5h Jc5c 2d7h 3c4d 4h8c",
      Solver.process("texas-holdem 5d6d7d7sJh 2d7h Jc5c 3c4d Kh5h 2hKc 4h8c 8s5s 4s9h"));
  }

  @Test
  public void test_texas_holdem_9525_6h8d8s9hJh_4s7s_Kh3s_TcKs_2h8c_7cQh_6d5d() {
    assertEquals(
      "4s7s 7cQh Kh3s TcKs 6d5d 2h8c",
      Solver.process("texas-holdem 6h8d8s9hJh 4s7s Kh3s TcKs 2h8c 7cQh 6d5d"));
  }

  @Test
  public void test_texas_holdem_9526_2s4h4s9dAs_4cKs_6d7h_8h8c_2dTc_7sQc_3s3d() {
    assertEquals(
      "6d7h 7sQc 2dTc 3s3d 8h8c 4cKs",
      Solver.process("texas-holdem 2s4h4s9dAs 4cKs 6d7h 8h8c 2dTc 7sQc 3s3d"));
  }

  @Test
  public void test_texas_holdem_9527_4c5d8cAdKc_7d7c_4dTh_Ts5h_4s2d_7h2s_9sQc() {
    assertEquals(
      "7h2s 9sQc 4s2d 4dTh Ts5h 7d7c",
      Solver.process("texas-holdem 4c5d8cAdKc 7d7c 4dTh Ts5h 4s2d 7h2s 9sQc"));
  }

  @Test
  public void test_texas_holdem_9528_3s4c6s7sJd_KcQs_7h3h_As3d_7c5h_Qc9h_9s6h_TcAh() {
    assertEquals(
      "Qc9h KcQs TcAh As3d 9s6h 7h3h 7c5h",
      Solver.process("texas-holdem 3s4c6s7sJd KcQs 7h3h As3d 7c5h Qc9h 9s6h TcAh"));
  }

  @Test
  public void test_texas_holdem_9529_3s4c7cAhAs_4sKh_Jd9d_5cTc_Qd7h() {
    assertEquals(
      "5cTc Jd9d 4sKh Qd7h",
      Solver.process("texas-holdem 3s4c7cAhAs 4sKh Jd9d 5cTc Qd7h"));
  }

  @Test
  public void test_texas_holdem_9530_3s8dJcQhTs_7d5d_4cKs_3h5s_Ah6c_2h2c() {
    assertEquals(
      "7d5d 4cKs Ah6c 2h2c 3h5s",
      Solver.process("texas-holdem 3s8dJcQhTs 7d5d 4cKs 3h5s Ah6c 2h2c"));
  }

  @Test
  public void test_texas_holdem_9531_7h8h9c9dKd_6s5d_8d4h_5h3h_6d4c_Ah3c_2sQc() {
    assertEquals(
      "5h3h=6d4c 2sQc Ah3c 8d4h 6s5d",
      Solver.process("texas-holdem 7h8h9c9dKd 6s5d 8d4h 5h3h 6d4c Ah3c 2sQc"));
  }

  @Test
  public void test_texas_holdem_9532_2h8d9sQcQh_Ad9c_7c4d() {
    assertEquals(
      "7c4d Ad9c",
      Solver.process("texas-holdem 2h8d9sQcQh Ad9c 7c4d"));
  }

  @Test
  public void test_texas_holdem_9533_3c3s4s5d7s_6sJh_Qd7h_9s3d() {
    assertEquals(
      "Qd7h 9s3d 6sJh",
      Solver.process("texas-holdem 3c3s4s5d7s 6sJh Qd7h 9s3d"));
  }

  @Test
  public void test_texas_holdem_9534_3h4c6d7cTh_Tc5h_Ah7s_6cQs_4dQd_6h8h_7h5s() {
    assertEquals(
      "4dQd 6h8h 6cQs Ah7s 7h5s=Tc5h",
      Solver.process("texas-holdem 3h4c6d7cTh Tc5h Ah7s 6cQs 4dQd 6h8h 7h5s"));
  }

  @Test
  public void test_texas_holdem_9535_2s4h6sTcTs_4s8d_9hAc_4c5d_Ah7d_Jc6d() {
    assertEquals(
      "Ah7d 9hAc 4c5d 4s8d Jc6d",
      Solver.process("texas-holdem 2s4h6sTcTs 4s8d 9hAc 4c5d Ah7d Jc6d"));
  }

  @Test
  public void test_texas_holdem_9536_2s9sJcKcTh_JhTc_QdJs_8d9h() {
    assertEquals(
      "8d9h JhTc QdJs",
      Solver.process("texas-holdem 2s9sJcKcTh JhTc QdJs 8d9h"));
  }

  @Test
  public void test_texas_holdem_9537_3d4hJdQhQs_7s6c_Kc5c_2d6s_8hKd_JcAs() {
    assertEquals(
      "2d6s 7s6c Kc5c 8hKd JcAs",
      Solver.process("texas-holdem 3d4hJdQhQs 7s6c Kc5c 2d6s 8hKd JcAs"));
  }

  @Test
  public void test_texas_holdem_9538_2c6s8hKhQc_5c8d_Tc6d_Js5d_AsQh_8c7h() {
    assertEquals(
      "Js5d Tc6d 5c8d 8c7h AsQh",
      Solver.process("texas-holdem 2c6s8hKhQc 5c8d Tc6d Js5d AsQh 8c7h"));
  }

  @Test
  public void test_texas_holdem_9539_3s8cAhJcTd_9d9s_8h6h_2hKc_Jd6c_3hQh_2c4d_Ac9h() {
    assertEquals(
      "2c4d 2hKc 3hQh 8h6h 9d9s Jd6c Ac9h",
      Solver.process("texas-holdem 3s8cAhJcTd 9d9s 8h6h 2hKc Jd6c 3hQh 2c4d Ac9h"));
  }

  @Test
  public void test_texas_holdem_9540_5h7h7sAdKd_Jh4h_5c3d_9cJd_AcTc_9s3h_4d9d_3cTd_2s2c_4sQs() {
    assertEquals(
      "4d9d=9s3h 3cTd 9cJd=Jh4h 4sQs 2s2c 5c3d AcTc",
      Solver.process("texas-holdem 5h7h7sAdKd Jh4h 5c3d 9cJd AcTc 9s3h 4d9d 3cTd 2s2c 4sQs"));
  }

  @Test
  public void test_texas_holdem_9541_6dAcJdJsKh_8dTd_QhTs_2d4d_3dKs_7d2c_Jc5d_QdAh_Qs3h_QcTh() {
    assertEquals(
      "2d4d 7d2c 8dTd Qs3h 3dKs QdAh Jc5d QcTh=QhTs",
      Solver.process("texas-holdem 6dAcJdJsKh 8dTd QhTs 2d4d 3dKs 7d2c Jc5d QdAh Qs3h QcTh"));
  }

  @Test
  public void test_texas_holdem_9542_8c8hJhQhQs_9s9c_QdTd_2sKs_3d6c_Kd5d_7s6h_2hTc_Th2d() {
    assertEquals(
      "2hTc=3d6c=7s6h=Th2d 2sKs=Kd5d 9s9c QdTd",
      Solver.process("texas-holdem 8c8hJhQhQs 9s9c QdTd 2sKs 3d6c Kd5d 7s6h 2hTc Th2d"));
  }

  @Test
  public void test_texas_holdem_9543_2c3s5dTcTs_8hAc_Th8c_7c7h_JdQc_Kd8d() {
    assertEquals(
      "JdQc Kd8d 8hAc 7c7h Th8c",
      Solver.process("texas-holdem 2c3s5dTcTs 8hAc Th8c 7c7h JdQc Kd8d"));
  }

  @Test
  public void test_texas_holdem_9544_4s5h8c8sJs_AdQc_TdJh_2hQs_Ah3d_7d3c() {
    assertEquals(
      "7d3c 2hQs Ah3d AdQc TdJh",
      Solver.process("texas-holdem 4s5h8c8sJs AdQc TdJh 2hQs Ah3d 7d3c"));
  }

  @Test
  public void test_texas_holdem_9545_4h4s7cJcKd_Tc7d_7s8s_8hTd_Qh3d_2c3c_Th4c_QsAd_JsQc() {
    assertEquals(
      "2c3c 8hTd Qh3d QsAd 7s8s=Tc7d JsQc Th4c",
      Solver.process("texas-holdem 4h4s7cJcKd Tc7d 7s8s 8hTd Qh3d 2c3c Th4c QsAd JsQc"));
  }

  @Test
  public void test_texas_holdem_9546_4d4h9dQcQs_6dQd_Kd5d_Js3d_8hTc_QhKc() {
    assertEquals(
      "8hTc Js3d Kd5d 6dQd=QhKc",
      Solver.process("texas-holdem 4d4h9dQcQs 6dQd Kd5d Js3d 8hTc QhKc"));
  }

  @Test
  public void test_texas_holdem_9547_3d5d9dKcQs_9sKd_8h7d_Tc4s() {
    assertEquals(
      "8h7d Tc4s 9sKd",
      Solver.process("texas-holdem 3d5d9dKcQs 9sKd 8h7d Tc4s"));
  }

  @Test
  public void test_texas_holdem_9548_3c4h7dQdTc_9h5h_5sKs_4c9d_Kd8s_8dTs_5cQs_7c4s() {
    assertEquals(
      "9h5h 5sKs Kd8s 4c9d 8dTs 5cQs 7c4s",
      Solver.process("texas-holdem 3c4h7dQdTc 9h5h 5sKs 4c9d Kd8s 8dTs 5cQs 7c4s"));
  }

  @Test
  public void test_texas_holdem_9549_2c2h4h8sAs_JcJh_9dTh_4d5h_3hKd() {
    assertEquals(
      "9dTh 3hKd 4d5h JcJh",
      Solver.process("texas-holdem 2c2h4h8sAs JcJh 9dTh 4d5h 3hKd"));
  }

  @Test
  public void test_texas_holdem_9550_2d6c6h7d9s_6dQd_8sQc() {
    assertEquals(
      "8sQc 6dQd",
      Solver.process("texas-holdem 2d6c6h7d9s 6dQd 8sQc"));
  }

  @Test
  public void test_texas_holdem_9551_6s9d9hKcQc_Ah4d_Jh6d_9c4h_4c7d_2c5h_8s3h_Jc9s() {
    assertEquals(
      "2c5h 4c7d 8s3h Ah4d Jh6d 9c4h=Jc9s",
      Solver.process("texas-holdem 6s9d9hKcQc Ah4d Jh6d 9c4h 4c7d 2c5h 8s3h Jc9s"));
  }

  @Test
  public void test_texas_holdem_9552_2c4d6d7cAc_9dTd_TcTs_KcTh_9sAh_3s6h_Qc6s_5cAs_3hJh_Qd8d() {
    assertEquals(
      "9dTd 3hJh Qd8d KcTh 3s6h Qc6s TcTs 5cAs 9sAh",
      Solver.process("texas-holdem 2c4d6d7cAc 9dTd TcTs KcTh 9sAh 3s6h Qc6s 5cAs 3hJh Qd8d"));
  }

  @Test
  public void test_texas_holdem_9553_8h8sAcKsQc_Jd3h_QhJc_5d2d_Th9s_Tc4h_2c7s_2hAs_4dKc_9c8c() {
    assertEquals(
      "2c7s=5d2d=Jd3h=Tc4h=Th9s QhJc 4dKc 2hAs 9c8c",
      Solver.process("texas-holdem 8h8sAcKsQc Jd3h QhJc 5d2d Th9s Tc4h 2c7s 2hAs 4dKc 9c8c"));
  }

  @Test
  public void test_texas_holdem_9554_3d3s8d8hAd_7c5c_4c9d_As6s_4dQs() {
    assertEquals(
      "4c9d=4dQs=7c5c As6s",
      Solver.process("texas-holdem 3d3s8d8hAd 7c5c 4c9d As6s 4dQs"));
  }

  @Test
  public void test_texas_holdem_9555_2c2d7h8cAs_Kh3h_AcJh_KcTc_7cJc_2sQd_9d5s_8h6h_8d4c_8sAd() {
    assertEquals(
      "9d5s Kh3h KcTc 7cJc 8d4c=8h6h AcJh 8sAd 2sQd",
      Solver.process("texas-holdem 2c2d7h8cAs Kh3h AcJh KcTc 7cJc 2sQd 9d5s 8h6h 8d4c 8sAd"));
  }

  @Test
  public void test_texas_holdem_9556_2h8sAdKcQs_7s6c_As5s_4s8h_5h8d_6s3h() {
    assertEquals(
      "6s3h 7s6c 4s8h=5h8d As5s",
      Solver.process("texas-holdem 2h8sAdKcQs 7s6c As5s 4s8h 5h8d 6s3h"));
  }

  @Test
  public void test_texas_holdem_9557_2s4hAhAsQh_2cKc_Qc7h_7d2h_2d8c_7s3h_3dQs_8d9h_5d6s() {
    assertEquals(
      "5d6s 7s3h 8d9h 2d8c=7d2h 2cKc 3dQs Qc7h",
      Solver.process("texas-holdem 2s4hAhAsQh 2cKc Qc7h 7d2h 2d8c 7s3h 3dQs 8d9h 5d6s"));
  }

  @Test
  public void test_texas_holdem_9558_3s4d7cQhTd_KhAh_2s6h_Js7h_7dQc_5h9c_9d8d() {
    assertEquals(
      "2s6h 5h9c 9d8d KhAh Js7h 7dQc",
      Solver.process("texas-holdem 3s4d7cQhTd KhAh 2s6h Js7h 7dQc 5h9c 9d8d"));
  }

  @Test
  public void test_texas_holdem_9559_2s5dKsQcTc_Jc9h_Qh7h_2d9s_6d8c() {
    assertEquals(
      "6d8c 2d9s Qh7h Jc9h",
      Solver.process("texas-holdem 2s5dKsQcTc Jc9h Qh7h 2d9s 6d8c"));
  }

  @Test
  public void test_texas_holdem_9560_2h8hAdJsQh_7dTd_2cAc_9h5c_Ts5d_9s9d_6h4d() {
    assertEquals(
      "6h4d 9h5c 7dTd=Ts5d 9s9d 2cAc",
      Solver.process("texas-holdem 2h8hAdJsQh 7dTd 2cAc 9h5c Ts5d 9s9d 6h4d"));
  }

  @Test
  public void test_texas_holdem_9561_8s9sJcQsTd_Tc6h_7d6d_Jd8h_4s7c_Ad6s() {
    assertEquals(
      "4s7c=7d6d=Ad6s=Jd8h=Tc6h",
      Solver.process("texas-holdem 8s9sJcQsTd Tc6h 7d6d Jd8h 4s7c Ad6s"));
  }

  @Test
  public void test_texas_holdem_9562_4h5dJcKsQd_3s7h_3hQh_Ad3c_Ts6c_AsJd() {
    assertEquals(
      "3s7h Ts6c Ad3c AsJd 3hQh",
      Solver.process("texas-holdem 4h5dJcKsQd 3s7h 3hQh Ad3c Ts6c AsJd"));
  }

  @Test
  public void test_texas_holdem_9563_3s8sAcKdQd_As9c_TcQs_JhAd_2h8c_6c4h_Qc7c_9h5h_3h4s_2sKc() {
    assertEquals(
      "6c4h 9h5h 3h4s 2h8c Qc7c TcQs 2sKc As9c JhAd",
      Solver.process("texas-holdem 3s8sAcKdQd As9c TcQs JhAd 2h8c 6c4h Qc7c 9h5h 3h4s 2sKc"));
  }

  @Test
  public void test_texas_holdem_9564_7sAsJsQhQs_5s4s_6d3h_3dJc() {
    assertEquals(
      "6d3h 3dJc 5s4s",
      Solver.process("texas-holdem 7sAsJsQhQs 5s4s 6d3h 3dJc"));
  }

  @Test
  public void test_texas_holdem_9565_2c4d4h9hJc_8sTc_7d4s_QdJh_KsTd() {
    assertEquals(
      "8sTc KsTd QdJh 7d4s",
      Solver.process("texas-holdem 2c4d4h9hJc 8sTc 7d4s QdJh KsTd"));
  }

  @Test
  public void test_texas_holdem_9566_3d3h7cAdJc_JhTc_6h6d() {
    assertEquals(
      "6h6d JhTc",
      Solver.process("texas-holdem 3d3h7cAdJc JhTc 6h6d"));
  }

  @Test
  public void test_texas_holdem_9567_2h9dAsKhQd_6hKd_9c2c() {
    assertEquals(
      "6hKd 9c2c",
      Solver.process("texas-holdem 2h9dAsKhQd 6hKd 9c2c"));
  }

  @Test
  public void test_texas_holdem_9568_3h6s9c9dKh_4d9h_JcQd_QsQc_Kc4c_Ad4s() {
    assertEquals(
      "JcQd Ad4s QsQc Kc4c 4d9h",
      Solver.process("texas-holdem 3h6s9c9dKh 4d9h JcQd QsQc Kc4c Ad4s"));
  }

  @Test
  public void test_texas_holdem_9569_3h6c6d9hAd_TdQc_JdJh_Ks9c() {
    assertEquals(
      "TdQc Ks9c JdJh",
      Solver.process("texas-holdem 3h6c6d9hAd TdQc JdJh Ks9c"));
  }

  @Test
  public void test_texas_holdem_9570_2s4s8c9sAd_Qs7s_Ah4c_7dKh_Qc3d_7hTs_Ac5s_6hQh_5h6d_KdJh() {
    assertEquals(
      "5h6d 7hTs Qc3d 6hQh 7dKh KdJh Ac5s Ah4c Qs7s",
      Solver.process("texas-holdem 2s4s8c9sAd Qs7s Ah4c 7dKh Qc3d 7hTs Ac5s 6hQh 5h6d KdJh"));
  }

  @Test
  public void test_texas_holdem_9571_2c2s4cAsQd_7h6s_8h9c_3c2h_7cTh_2dQc_6cJd_5c3s_Kd7d() {
    assertEquals(
      "7h6s 8h9c 7cTh 6cJd Kd7d 3c2h 5c3s 2dQc",
      Solver.process("texas-holdem 2c2s4cAsQd 7h6s 8h9c 3c2h 7cTh 2dQc 6cJd 5c3s Kd7d"));
  }

  @Test
  public void test_texas_holdem_9572_2d4s5c9sKd_KsJh_2s6h_9hAh() {
    assertEquals(
      "2s6h 9hAh KsJh",
      Solver.process("texas-holdem 2d4s5c9sKd KsJh 2s6h 9hAh"));
  }

  @Test
  public void test_texas_holdem_9573_2c4s9dKhTs_Ah8d_5sQc_9s2d_TcKs_QdTd() {
    assertEquals(
      "5sQc Ah8d QdTd 9s2d TcKs",
      Solver.process("texas-holdem 2c4s9dKhTs Ah8d 5sQc 9s2d TcKs QdTd"));
  }

  @Test
  public void test_texas_holdem_9574_4h9c9hQdQh_Js8c_4cJh_6s5c() {
    assertEquals(
      "6s5c 4cJh=Js8c",
      Solver.process("texas-holdem 4h9c9hQdQh Js8c 4cJh 6s5c"));
  }

  @Test
  public void test_texas_holdem_9575_5d6d6h9sTh_6s5h_7s5s_2c8c_2sTc_QdQh_AcJd_KdAd() {
    assertEquals(
      "2c8c AcJd KdAd 7s5s 2sTc QdQh 6s5h",
      Solver.process("texas-holdem 5d6d6h9sTh 6s5h 7s5s 2c8c 2sTc QdQh AcJd KdAd"));
  }

  @Test
  public void test_texas_holdem_9576_3c4s5d6sAc_5h7s_8hJc_3hJh_6dQs_Qc8c_Qd7d_7c2d_Td8d() {
    assertEquals(
      "Td8d 8hJc Qc8c 3hJh 6dQs 5h7s=7c2d=Qd7d",
      Solver.process("texas-holdem 3c4s5d6sAc 5h7s 8hJc 3hJh 6dQs Qc8c Qd7d 7c2d Td8d"));
  }

  @Test
  public void test_texas_holdem_9577_2s3d3s9hKd_4c6d_5cKh_7h3h_6h3c_JdTc_8c2c_5s6c() {
    assertEquals(
      "4c6d=5s6c JdTc 8c2c 5cKh 6h3c=7h3h",
      Solver.process("texas-holdem 2s3d3s9hKd 4c6d 5cKh 7h3h 6h3c JdTc 8c2c 5s6c"));
  }

  @Test
  public void test_texas_holdem_9578_6h7s8cKhQc_2c2d_AdJh_4sQd_8dAc_8h6d_2s6s() {
    assertEquals(
      "AdJh 2c2d 2s6s 8dAc 4sQd 8h6d",
      Solver.process("texas-holdem 6h7s8cKhQc 2c2d AdJh 4sQd 8dAc 8h6d 2s6s"));
  }

  @Test
  public void test_texas_holdem_9579_3d5s7c9sQs_3hKs_7h7s_5h9c_4d2c_AcQc_ThJs_Ad8s_8dTs_As9h() {
    assertEquals(
      "4d2c 8dTs ThJs Ad8s 3hKs As9h AcQc 5h9c 7h7s",
      Solver.process("texas-holdem 3d5s7c9sQs 3hKs 7h7s 5h9c 4d2c AcQc ThJs Ad8s 8dTs As9h"));
  }

  @Test
  public void test_texas_holdem_9580_2sQhQsTcTs_Jh9s_4c8d_3dAs_Qc5d() {
    assertEquals(
      "4c8d Jh9s 3dAs Qc5d",
      Solver.process("texas-holdem 2sQhQsTcTs Jh9s 4c8d 3dAs Qc5d"));
  }

  @Test
  public void test_texas_holdem_9581_2h3h3s9dTs_5d8s_Td2d() {
    assertEquals(
      "5d8s Td2d",
      Solver.process("texas-holdem 2h3h3s9dTs 5d8s Td2d"));
  }

  @Test
  public void test_texas_holdem_9582_2d3h4hKdTs_Ks7c_6s2h_3cQc() {
    assertEquals(
      "6s2h 3cQc Ks7c",
      Solver.process("texas-holdem 2d3h4hKdTs Ks7c 6s2h 3cQc"));
  }

  @Test
  public void test_texas_holdem_9583_2c6c6sKcTh_TcAc_8h9d_5h2s() {
    assertEquals(
      "8h9d 5h2s TcAc",
      Solver.process("texas-holdem 2c6c6sKcTh TcAc 8h9d 5h2s"));
  }

  @Test
  public void test_texas_holdem_9584_2c3c5c9dTd_Kc7h_Jc6d_Ac3d_3s6h_2sQs_Ts9c() {
    assertEquals(
      "Jc6d Kc7h 2sQs 3s6h Ac3d Ts9c",
      Solver.process("texas-holdem 2c3c5c9dTd Kc7h Jc6d Ac3d 3s6h 2sQs Ts9c"));
  }

  @Test
  public void test_texas_holdem_9585_3c8dJcQsTh_Ad7s_8s6h() {
    assertEquals(
      "Ad7s 8s6h",
      Solver.process("texas-holdem 3c8dJcQsTh Ad7s 8s6h"));
  }

  @Test
  public void test_texas_holdem_9586_6c7s9c9dKs_9h7d_6dAh_Th5d_2cJc_8dTc() {
    assertEquals(
      "Th5d 2cJc 6dAh 8dTc 9h7d",
      Solver.process("texas-holdem 6c7s9c9dKs 9h7d 6dAh Th5d 2cJc 8dTc"));
  }

  @Test
  public void test_texas_holdem_9587_3s4c7sTdTs_9s6c_5s7h_AsQd_8d3h_JcQs() {
    assertEquals(
      "9s6c JcQs AsQd 8d3h 5s7h",
      Solver.process("texas-holdem 3s4c7sTdTs 9s6c 5s7h AsQd 8d3h JcQs"));
  }

  @Test
  public void test_texas_holdem_9588_3d9hAcQhTh_4cAd_6cTc_7d7c_KcKh() {
    assertEquals(
      "7d7c 6cTc KcKh 4cAd",
      Solver.process("texas-holdem 3d9hAcQhTh 4cAd 6cTc 7d7c KcKh"));
  }

  @Test
  public void test_texas_holdem_9589_4h8h8sAdJd_6hQs_5h6s_8d6d_3sTh_TdQc_3d7h_5c5d() {
    assertEquals(
      "5h6s 3d7h 3sTh 6hQs=TdQc 5c5d 8d6d",
      Solver.process("texas-holdem 4h8h8sAdJd 6hQs 5h6s 8d6d 3sTh TdQc 3d7h 5c5d"));
  }

  @Test
  public void test_texas_holdem_9590_2hAsKhQcQd_Kd6h_9hTs_7h7c_8d6d_7d8s() {
    assertEquals(
      "7d8s=8d6d 9hTs 7h7c Kd6h",
      Solver.process("texas-holdem 2hAsKhQcQd Kd6h 9hTs 7h7c 8d6d 7d8s"));
  }

  @Test
  public void test_texas_holdem_9591_2h5dJsKhQc_TdQd_6s7h_4c2s_3d8d_6d3h_5hJd_2c9h_3sTh_AdQs() {
    assertEquals(
      "6d3h 6s7h 3d8d 3sTh 2c9h=4c2s TdQd AdQs 5hJd",
      Solver.process("texas-holdem 2h5dJsKhQc TdQd 6s7h 4c2s 3d8d 6d3h 5hJd 2c9h 3sTh AdQs"));
  }

  @Test
  public void test_texas_holdem_9592_2h3h7c8sAs_Ts8c_6h5h_9dAh_TdJc_JdTc_7s9s_9h4c_5c7h_4d5d() {
    assertEquals(
      "6h5h 9h4c JdTc=TdJc 5c7h 7s9s Ts8c 9dAh 4d5d",
      Solver.process("texas-holdem 2h3h7c8sAs Ts8c 6h5h 9dAh TdJc JdTc 7s9s 9h4c 5c7h 4d5d"));
  }

  @Test
  public void test_texas_holdem_9593_5c6s7s8sJs_AhTh_2d7c_JhAs_3c7h_3s5d_2h7d_Qd5s_Kd4s() {
    assertEquals(
      "AhTh 2d7c=2h7d=3c7h 3s5d Kd4s Qd5s JhAs",
      Solver.process("texas-holdem 5c6s7s8sJs AhTh 2d7c JhAs 3c7h 3s5d 2h7d Qd5s Kd4s"));
  }

  @Test
  public void test_texas_holdem_9594_3d4c8dThTs_Kd2d_As9h_3s4h() {
    assertEquals(
      "Kd2d As9h 3s4h",
      Solver.process("texas-holdem 3d4c8dThTs Kd2d As9h 3s4h"));
  }

  @Test
  public void test_texas_holdem_9595_3h4cAdJcQc_Tc6s_2d9h_9s7d_Th4s_2s3s() {
    assertEquals(
      "2d9h 9s7d Tc6s 2s3s Th4s",
      Solver.process("texas-holdem 3h4cAdJcQc Tc6s 2d9h 9s7d Th4s 2s3s"));
  }

  @Test
  public void test_texas_holdem_9596_2h3d3h4h9d_7d8h_4c6d_8c5d_JsJd() {
    assertEquals(
      "8c5d 7d8h 4c6d JsJd",
      Solver.process("texas-holdem 2h3d3h4h9d 7d8h 4c6d 8c5d JsJd"));
  }

  @Test
  public void test_texas_holdem_9597_2h2s4cQhQs_Jc3h_4s3d_6c6s_2cQc() {
    assertEquals(
      "Jc3h 4s3d 6c6s 2cQc",
      Solver.process("texas-holdem 2h2s4cQhQs Jc3h 4s3d 6c6s 2cQc"));
  }

  @Test
  public void test_texas_holdem_9598_3c3sAdQsTd_Jh3d_6cQd_7d4h_9hQh() {
    assertEquals(
      "7d4h 6cQd=9hQh Jh3d",
      Solver.process("texas-holdem 3c3sAdQsTd Jh3d 6cQd 7d4h 9hQh"));
  }

  @Test
  public void test_texas_holdem_9599_5d8c8dAhAs_6hQh_3dQs_Qc5s_4hTd_TcKh_Ks9s_5cTh_7hAd_Jc3c() {
    assertEquals(
      "4hTd=5cTh Jc3c 3dQs=6hQh=Qc5s Ks9s=TcKh 7hAd",
      Solver.process("texas-holdem 5d8c8dAhAs 6hQh 3dQs Qc5s 4hTd TcKh Ks9s 5cTh 7hAd Jc3c"));
  }

  @Test
  public void test_texas_holdem_9600_5s6d9hKhTs_Ac6s_7h3c_Ks7s_4hTc_Qc9s() {
    assertEquals(
      "7h3c Ac6s Qc9s 4hTc Ks7s",
      Solver.process("texas-holdem 5s6d9hKhTs Ac6s 7h3c Ks7s 4hTc Qc9s"));
  }

  @Test
  public void test_texas_holdem_9601_8cKdKhQhTs_4c4s_AhAs_5h2c_Qc8s_7c5s() {
    assertEquals(
      "5h2c=7c5s 4c4s Qc8s AhAs",
      Solver.process("texas-holdem 8cKdKhQhTs 4c4s AhAs 5h2c Qc8s 7c5s"));
  }

  @Test
  public void test_texas_holdem_9602_2d7c7dTdTs_7hQc_Ks2c_Kc6d() {
    assertEquals(
      "Kc6d=Ks2c 7hQc",
      Solver.process("texas-holdem 2d7c7dTdTs 7hQc Ks2c Kc6d"));
  }

  @Test
  public void test_texas_holdem_9603_2h3h4h6cAd_9h9c_8c9d_7s5d_Kh6h_8dAh_5sJh() {
    assertEquals(
      "8c9d 9h9c 8dAh 5sJh 7s5d Kh6h",
      Solver.process("texas-holdem 2h3h4h6cAd 9h9c 8c9d 7s5d Kh6h 8dAh 5sJh"));
  }

  @Test
  public void test_texas_holdem_9604_2s5h6c7cTh_5c2d_7sKh_TcJc_3d3c() {
    assertEquals(
      "3d3c 7sKh TcJc 5c2d",
      Solver.process("texas-holdem 2s5h6c7cTh 5c2d 7sKh TcJc 3d3c"));
  }

  @Test
  public void test_texas_holdem_9605_3s5h6dJcTc_6h9c_QdJh_8h3d() {
    assertEquals(
      "8h3d 6h9c QdJh",
      Solver.process("texas-holdem 3s5h6dJcTc 6h9c QdJh 8h3d"));
  }

  @Test
  public void test_texas_holdem_9606_3c4hQcQhTc_2h8s_9s6s_JsKc_4s8c_2c7s_4cAd() {
    assertEquals(
      "2c7s 2h8s 9s6s JsKc 4s8c 4cAd",
      Solver.process("texas-holdem 3c4hQcQhTc 2h8s 9s6s JsKc 4s8c 2c7s 4cAd"));
  }

  @Test
  public void test_texas_holdem_9607_2d4c8cAhTh_TdQs_7dKh_2s4s_4hJd_7c5d_6d6h_9d5s_Jc7h_9sKd() {
    assertEquals(
      "7c5d 9d5s Jc7h 7dKh 9sKd 4hJd 6d6h TdQs 2s4s",
      Solver.process("texas-holdem 2d4c8cAhTh TdQs 7dKh 2s4s 4hJd 7c5d 6d6h 9d5s Jc7h 9sKd"));
  }

  @Test
  public void test_texas_holdem_9608_2h3cAcKdTh_KcKs_QcQh_4cQs_6c3d_Js5s_9sJc_9d5h_Ah4s_7d2c() {
    assertEquals(
      "9d5h Js5s 9sJc 4cQs 7d2c 6c3d QcQh Ah4s KcKs",
      Solver.process("texas-holdem 2h3cAcKdTh KcKs QcQh 4cQs 6c3d Js5s 9sJc 9d5h Ah4s 7d2c"));
  }

  @Test
  public void test_texas_holdem_9609_2d4cAsKdQc_Ks5c_7hQd_9d8s_TdTc_Qh6d_Ah3h_6c5h() {
    assertEquals(
      "6c5h 9d8s TdTc Qh6d 7hQd Ks5c Ah3h",
      Solver.process("texas-holdem 2d4cAsKdQc Ks5c 7hQd 9d8s TdTc Qh6d Ah3h 6c5h"));
  }

  @Test
  public void test_texas_holdem_9610_2c3c6s8cAd_9dKd_6cTs_AcQc_7h8h_5d7c() {
    assertEquals(
      "5d7c 9dKd 6cTs 7h8h AcQc",
      Solver.process("texas-holdem 2c3c6s8cAd 9dKd 6cTs AcQc 7h8h 5d7c"));
  }

  @Test
  public void test_texas_holdem_9611_3h7c7dQhTd_9cKs_2hTh_9dQc_JsAh_Ac2c_9sQs_6s3c_4c3d() {
    assertEquals(
      "9cKs Ac2c JsAh 4c3d=6s3c 2hTh 9dQc=9sQs",
      Solver.process("texas-holdem 3h7c7dQhTd 9cKs 2hTh 9dQc JsAh Ac2c 9sQs 6s3c 4c3d"));
  }

  @Test
  public void test_texas_holdem_9612_2h4c4sAdTd_4d8s_Ac7h_6dKc() {
    assertEquals(
      "6dKc Ac7h 4d8s",
      Solver.process("texas-holdem 2h4c4sAdTd 4d8s Ac7h 6dKc"));
  }

  @Test
  public void test_texas_holdem_9613_4h5c6d9c9d_QsKh_Ks8d_QcTs_Td5h_3d9s_AdQh() {
    assertEquals(
      "QcTs Ks8d QsKh AdQh Td5h 3d9s",
      Solver.process("texas-holdem 4h5c6d9c9d QsKh Ks8d QcTs Td5h 3d9s AdQh"));
  }

  @Test
  public void test_texas_holdem_9614_6h7hAdJhKh_6s6c_TdTs_9s3c_Js5c() {
    assertEquals(
      "9s3c TdTs Js5c 6s6c",
      Solver.process("texas-holdem 6h7hAdJhKh 6s6c TdTs 9s3c Js5c"));
  }

  @Test
  public void test_texas_holdem_9615_4h7hAcTdTs_KhJd_8c2h_5d5s_TcJh_5h6c_2dKc_3d6d_4d3c_Ad3s() {
    assertEquals(
      "3d6d=5h6c 8c2h 2dKc KhJd 4d3c 5d5s Ad3s TcJh",
      Solver.process("texas-holdem 4h7hAcTdTs KhJd 8c2h 5d5s TcJh 5h6c 2dKc 3d6d 4d3c Ad3s"));
  }

  @Test
  public void test_texas_holdem_9616_2s8c8hQdTc_Qs4h_8d2c_Jc5s_5h5d_KdTh_Ah7h_9h4d_3c9d() {
    assertEquals(
      "3c9d=9h4d Jc5s Ah7h 5h5d KdTh Qs4h 8d2c",
      Solver.process("texas-holdem 2s8c8hQdTc Qs4h 8d2c Jc5s 5h5d KdTh Ah7h 9h4d 3c9d"));
  }

  @Test
  public void test_texas_holdem_9617_5c7dJcQhTc_Qs2c_8sTh_AsKd_7h3h_2d9h_JsKh_6s5d() {
    assertEquals(
      "2d9h 6s5d 7h3h 8sTh JsKh Qs2c AsKd",
      Solver.process("texas-holdem 5c7dJcQhTc Qs2c 8sTh AsKd 7h3h 2d9h JsKh 6s5d"));
  }

  @Test
  public void test_texas_holdem_9618_2d8c8d9dKs_Jh2s_Js7h_9hAd_Th4c_5h3s_JdQc() {
    assertEquals(
      "5h3s Th4c Js7h JdQc Jh2s 9hAd",
      Solver.process("texas-holdem 2d8c8d9dKs Jh2s Js7h 9hAd Th4c 5h3s JdQc"));
  }

  @Test
  public void test_texas_holdem_9619_5c6h7hJsTh_8s7c_TcJd_As9d_3d4s() {
    assertEquals(
      "As9d 8s7c TcJd 3d4s",
      Solver.process("texas-holdem 5c6h7hJsTh 8s7c TcJd As9d 3d4s"));
  }

  @Test
  public void test_texas_holdem_9620_2c7d8dKcTs_4c8c_2d6s_KdQh() {
    assertEquals(
      "2d6s 4c8c KdQh",
      Solver.process("texas-holdem 2c7d8dKcTs 4c8c 2d6s KdQh"));
  }

  @Test
  public void test_texas_holdem_9621_2s9c9hAcKd_TcJc_6h8c_5c9d_5s7d_6s8s() {
    assertEquals(
      "5s7d 6h8c=6s8s TcJc 5c9d",
      Solver.process("texas-holdem 2s9c9hAcKd TcJc 6h8c 5c9d 5s7d 6s8s"));
  }

  @Test
  public void test_texas_holdem_9622_3d5sJcQhQs_7sKh_2s6h_9c6d_8s2d_9d9s_KsTs() {
    assertEquals(
      "2s6h 8s2d 9c6d 7sKh KsTs 9d9s",
      Solver.process("texas-holdem 3d5sJcQhQs 7sKh 2s6h 9c6d 8s2d 9d9s KsTs"));
  }

  @Test
  public void test_texas_holdem_9623_4h4s5d9hKd_Jh3s_7dQc_Jc2h_6cJd() {
    assertEquals(
      "6cJd=Jc2h=Jh3s 7dQc",
      Solver.process("texas-holdem 4h4s5d9hKd Jh3s 7dQc Jc2h 6cJd"));
  }

  @Test
  public void test_texas_holdem_9624_7s8d9sJcQc_KsTc_As8c_Jd5c_6d4c() {
    assertEquals(
      "6d4c As8c Jd5c KsTc",
      Solver.process("texas-holdem 7s8d9sJcQc KsTc As8c Jd5c 6d4c"));
  }

  @Test
  public void test_texas_holdem_9625_2h5c6c7h8h_3cQd_5h3s_Qc7s_7cTd_Jc6d() {
    assertEquals(
      "3cQd 5h3s Jc6d 7cTd Qc7s",
      Solver.process("texas-holdem 2h5c6c7h8h 3cQd 5h3s Qc7s 7cTd Jc6d"));
  }

  @Test
  public void test_texas_holdem_9626_2s3c4h8h9h_KcAd_6d8d_Kd8c_7c2c_9c8s() {
    assertEquals(
      "KcAd 7c2c 6d8d Kd8c 9c8s",
      Solver.process("texas-holdem 2s3c4h8h9h KcAd 6d8d Kd8c 7c2c 9c8s"));
  }

  @Test
  public void test_texas_holdem_9627_4c7d7s9h9s_9d8h_5hAc() {
    assertEquals(
      "5hAc 9d8h",
      Solver.process("texas-holdem 4c7d7s9h9s 9d8h 5hAc"));
  }

  @Test
  public void test_texas_holdem_9628_3sAhKsQsTh_6h9d_JhAs_2d5s_2sKc_Kd3h_9cAc_Qd8c_7d4c_Ts7h() {
    assertEquals(
      "2d5s 7d4c 6h9d Ts7h Qd8c 2sKc 9cAc Kd3h JhAs",
      Solver.process("texas-holdem 3sAhKsQsTh 6h9d JhAs 2d5s 2sKc Kd3h 9cAc Qd8c 7d4c Ts7h"));
  }

  @Test
  public void test_texas_holdem_9629_2c2s6hAdQd_9s7d_3dKs() {
    assertEquals(
      "9s7d 3dKs",
      Solver.process("texas-holdem 2c2s6hAdQd 9s7d 3dKs"));
  }

  @Test
  public void test_texas_holdem_9630_6c8h9cQhTc_Ks4c_4d3s_7hKd_2d3h_9h2s_As9d_Kc7c() {
    assertEquals(
      "2d3h=4d3s Ks4c 9h2s As9d 7hKd Kc7c",
      Solver.process("texas-holdem 6c8h9cQhTc Ks4c 4d3s 7hKd 2d3h 9h2s As9d Kc7c"));
  }

  @Test
  public void test_texas_holdem_9631_4s5s8h9hKs_AdTh_8cAs_5cQd_Kh5d_7d6h() {
    assertEquals(
      "AdTh 5cQd 8cAs Kh5d 7d6h",
      Solver.process("texas-holdem 4s5s8h9hKs AdTh 8cAs 5cQd Kh5d 7d6h"));
  }

  @Test
  public void test_texas_holdem_9632_2d5dAdQdTs_Jc8h_QsTh_3dTd_3c7h_6s9h_Jd2s_KcAc() {
    assertEquals(
      "3c7h 6s9h Jc8h KcAc QsTh 3dTd Jd2s",
      Solver.process("texas-holdem 2d5dAdQdTs Jc8h QsTh 3dTd 3c7h 6s9h Jd2s KcAc"));
  }

  @Test
  public void test_texas_holdem_9633_2c3c4cAdTd_Ah8s_4s4d_3d5c_Th2d_Jc2s_Ac9h_3hTs() {
    assertEquals(
      "Jc2s Ah8s Ac9h Th2d 3hTs 4s4d 3d5c",
      Solver.process("texas-holdem 2c3c4cAdTd Ah8s 4s4d 3d5c Th2d Jc2s Ac9h 3hTs"));
  }

  @Test
  public void test_texas_holdem_9634_4h5d7d9d9s_KcTs_Tc4s_7cTh_Kd5s_2c7h_2h3h_8s8d_4d3c() {
    assertEquals(
      "2h3h KcTs 4d3c Tc4s Kd5s 2c7h 7cTh 8s8d",
      Solver.process("texas-holdem 4h5d7d9d9s KcTs Tc4s 7cTh Kd5s 2c7h 2h3h 8s8d 4d3c"));
  }

  @Test
  public void test_texas_holdem_9635_6d7hJdJhQh_JcTd_6hQd_Ah5s_4d5c_AdAc_As3c_8d7d_8c9s_KsTc() {
    assertEquals(
      "4d5c 8c9s KsTc Ah5s=As3c 8d7d 6hQd AdAc JcTd",
      Solver.process("texas-holdem 6d7hJdJhQh JcTd 6hQd Ah5s 4d5c AdAc As3c 8d7d 8c9s KsTc"));
  }

  @Test
  public void test_texas_holdem_9636_3s7c8hAdKd_6sKh_8cTd_2c5c_Th4s_4dAh_6d7d_QcJc() {
    assertEquals(
      "2c5c Th4s QcJc 6d7d 8cTd 6sKh 4dAh",
      Solver.process("texas-holdem 3s7c8hAdKd 6sKh 8cTd 2c5c Th4s 4dAh 6d7d QcJc"));
  }

  @Test
  public void test_texas_holdem_9637_5s8dAhKdTs_QdQh_6s5d_Kh4c_3c9h_2d3s_Qc9d() {
    assertEquals(
      "2d3s 3c9h Qc9d 6s5d QdQh Kh4c",
      Solver.process("texas-holdem 5s8dAhKdTs QdQh 6s5d Kh4c 3c9h 2d3s Qc9d"));
  }

  @Test
  public void test_texas_holdem_9638_3d6d6h9cTd_JhQs_4c2c() {
    assertEquals(
      "4c2c JhQs",
      Solver.process("texas-holdem 3d6d6h9cTd JhQs 4c2c"));
  }

  @Test
  public void test_texas_holdem_9639_7s8d9hKdTh_Tc2s_5dJs_Ac3h_5cQs_2h9s() {
    assertEquals(
      "5cQs Ac3h 2h9s Tc2s 5dJs",
      Solver.process("texas-holdem 7s8d9hKdTh Tc2s 5dJs Ac3h 5cQs 2h9s"));
  }

  @Test
  public void test_texas_holdem_9640_3h5s6c9h9s_2hQs_5d7c_4d5h_Ah6d_7s4c_Ts5c() {
    assertEquals(
      "2hQs 4d5h 5d7c Ts5c Ah6d 7s4c",
      Solver.process("texas-holdem 3h5s6c9h9s 2hQs 5d7c 4d5h Ah6d 7s4c Ts5c"));
  }

  @Test
  public void test_texas_holdem_9641_3s4d6dQcQs_2d7h_JcJs_5d8d_KsKc_2cAs_9h4c_Ac6s_5h8s() {
    assertEquals(
      "2d7h 5d8d=5h8s 2cAs 9h4c Ac6s JcJs KsKc",
      Solver.process("texas-holdem 3s4d6dQcQs 2d7h JcJs 5d8d KsKc 2cAs 9h4c Ac6s 5h8s"));
  }

  @Test
  public void test_texas_holdem_9642_6c7c9sKhTs_3s5c_5hQc_2h6h_AcJs_4s7d_QsTh() {
    assertEquals(
      "3s5c 5hQc AcJs 2h6h 4s7d QsTh",
      Solver.process("texas-holdem 6c7c9sKhTs 3s5c 5hQc 2h6h AcJs 4s7d QsTh"));
  }

  @Test
  public void test_texas_holdem_9643_9d9hAhJhQh_7c6d_Kd5s_KcJd_Ac8h_KsTd_As6c() {
    assertEquals(
      "7c6d Kd5s KcJd As6c KsTd Ac8h",
      Solver.process("texas-holdem 9d9hAhJhQh 7c6d Kd5s KcJd Ac8h KsTd As6c"));
  }

  @Test
  public void test_texas_holdem_9644_2s8c9dKcKh_5sJc_6s2c_5hKd_6cJd_9sQs_QdAs_TsTh() {
    assertEquals(
      "5sJc=6cJd QdAs 6s2c 9sQs TsTh 5hKd",
      Solver.process("texas-holdem 2s8c9dKcKh 5sJc 6s2c 5hKd 6cJd 9sQs QdAs TsTh"));
  }

  @Test
  public void test_texas_holdem_9645_8d9dKcQsTc_7s9s_Qh7h_3dKd_Jd3h_As8c_3c8s_8hAc() {
    assertEquals(
      "3c8s 8hAc=As8c 7s9s Qh7h 3dKd Jd3h",
      Solver.process("texas-holdem 8d9dKcQsTc 7s9s Qh7h 3dKd Jd3h As8c 3c8s 8hAc"));
  }

  @Test
  public void test_texas_holdem_9646_3h4d5h6d6h_9d2c_3s8s_Td5c_9h7s_Kd7h_7cJc_5sAd_Jd8h_KsAs() {
    assertEquals(
      "Jd8h KsAs 3s8s Td5c 5sAd 9d2c 7cJc=9h7s=Kd7h",
      Solver.process("texas-holdem 3h4d5h6d6h 9d2c 3s8s Td5c 9h7s Kd7h 7cJc 5sAd Jd8h KsAs"));
  }

  @Test
  public void test_texas_holdem_9647_5c9cAdJcQc_Ah5d_9d6h_9s3d_KdTs_2s7s_7h6d() {
    assertEquals(
      "2s7s=7h6d 9d6h=9s3d Ah5d KdTs",
      Solver.process("texas-holdem 5c9cAdJcQc Ah5d 9d6h 9s3d KdTs 2s7s 7h6d"));
  }

  @Test
  public void test_texas_holdem_9648_4d7cAdKcTd_5sQh_Jc6c() {
    assertEquals(
      "Jc6c 5sQh",
      Solver.process("texas-holdem 4d7cAdKcTd 5sQh Jc6c"));
  }

  @Test
  public void test_texas_holdem_9649_3s5s6h8dQc_Jh5d_4d9c_Ks7s_Kc2d() {
    assertEquals(
      "4d9c Kc2d Ks7s Jh5d",
      Solver.process("texas-holdem 3s5s6h8dQc Jh5d 4d9c Ks7s Kc2d"));
  }

  @Test
  public void test_texas_holdem_9650_2d2h3c8h9h_Kd4h_2s5c_Kc2c_4sTc() {
    assertEquals(
      "4sTc Kd4h 2s5c Kc2c",
      Solver.process("texas-holdem 2d2h3c8h9h Kd4h 2s5c Kc2c 4sTc"));
  }

  @Test
  public void test_texas_holdem_9651_5c5dAhQdQs_7s7d_Ts6c() {
    assertEquals(
      "Ts6c 7s7d",
      Solver.process("texas-holdem 5c5dAhQdQs 7s7d Ts6c"));
  }

  @Test
  public void test_texas_holdem_9652_5d7s8c9hJh_Kd8h_Ac7c_4s5c_Td3d_Ks4c_2s7d_Th6d_Kc4h_2h3c() {
    assertEquals(
      "2h3c Kc4h=Ks4c 4s5c 2s7d Ac7c Kd8h Td3d=Th6d",
      Solver.process("texas-holdem 5d7s8c9hJh Kd8h Ac7c 4s5c Td3d Ks4c 2s7d Th6d Kc4h 2h3c"));
  }

  @Test
  public void test_texas_holdem_9653_2s5d6hAhKs_4sQd_Qs9h_AsQc_2dTd_7h8c_2h7s_JdTc_Jh8h_Kh6d() {
    assertEquals(
      "7h8c Jh8h JdTc 4sQd Qs9h 2h7s 2dTd AsQc Kh6d",
      Solver.process("texas-holdem 2s5d6hAhKs 4sQd Qs9h AsQc 2dTd 7h8c 2h7s JdTc Jh8h Kh6d"));
  }

  @Test
  public void test_texas_holdem_9654_4d6h8cJsKc_4h2d_9h7d_3cQh_9dQc_7c6d() {
    assertEquals(
      "9h7d 3cQh 9dQc 4h2d 7c6d",
      Solver.process("texas-holdem 4d6h8cJsKc 4h2d 9h7d 3cQh 9dQc 7c6d"));
  }

  @Test
  public void test_texas_holdem_9655_2d6cJhQdQs_8h8d_4d9c_Th9d_7c6s_AdKc_5s9s_5d3c_Qc3s_JcTc() {
    assertEquals(
      "5d3c 4d9c=5s9s Th9d AdKc 7c6s 8h8d JcTc Qc3s",
      Solver.process("texas-holdem 2d6cJhQdQs 8h8d 4d9c Th9d 7c6s AdKc 5s9s 5d3c Qc3s JcTc"));
  }

  @Test
  public void test_texas_holdem_9656_2c3h4s8sJh_4h2h_7c7s_3sTd_TcJc_5hKc_Ah6d() {
    assertEquals(
      "5hKc Ah6d 3sTd 7c7s TcJc 4h2h",
      Solver.process("texas-holdem 2c3h4s8sJh 4h2h 7c7s 3sTd TcJc 5hKc Ah6d"));
  }

  @Test
  public void test_texas_holdem_9657_3h5c7c7dAc_Qd2c_7hQs_2sJc_5s6d_5h4c_6cTs_Qc3s_KhAs() {
    assertEquals(
      "6cTs 2sJc Qd2c Qc3s 5h4c=5s6d KhAs 7hQs",
      Solver.process("texas-holdem 3h5c7c7dAc Qd2c 7hQs 2sJc 5s6d 5h4c 6cTs Qc3s KhAs"));
  }

  @Test
  public void test_texas_holdem_9658_5c7sQdTcTs_8h8d_3cAh_2s3h_Jc8s_KhKd() {
    assertEquals(
      "2s3h Jc8s 3cAh 8h8d KhKd",
      Solver.process("texas-holdem 5c7sQdTcTs 8h8d 3cAh 2s3h Jc8s KhKd"));
  }

  @Test
  public void test_texas_holdem_9659_4c4s5cKdTh_9dQc_5hAs_2c4d_AhKc_6d6h_5s6s_Td9s_4hQh_5d9h() {
    assertEquals(
      "9dQc 5d9h=5s6s 5hAs 6d6h Td9s AhKc 2c4d 4hQh",
      Solver.process("texas-holdem 4c4s5cKdTh 9dQc 5hAs 2c4d AhKc 6d6h 5s6s Td9s 4hQh 5d9h"));
  }

  @Test
  public void test_texas_holdem_9660_2s3c6sAcJc_7h8d_2c9s_Kh7d_Jh4h() {
    assertEquals(
      "7h8d Kh7d 2c9s Jh4h",
      Solver.process("texas-holdem 2s3c6sAcJc 7h8d 2c9s Kh7d Jh4h"));
  }

  @Test
  public void test_texas_holdem_9661_5c5h9dKcTc_9cJc_8s6h_TsAh_7sJs_2hQh_KdJh_KsQd_9h3h_8dAd() {
    assertEquals(
      "8s6h 7sJs 2hQh 8dAd 9h3h TsAh KdJh KsQd 9cJc",
      Solver.process("texas-holdem 5c5h9dKcTc 9cJc 8s6h TsAh 7sJs 2hQh KdJh KsQd 9h3h 8dAd"));
  }

  @Test
  public void test_texas_holdem_9662_3d3s5h8hAc_4s2d_AdJh_7d2c() {
    assertEquals(
      "7d2c AdJh 4s2d",
      Solver.process("texas-holdem 3d3s5h8hAc 4s2d AdJh 7d2c"));
  }

  @Test
  public void test_texas_holdem_9663_6h8s9cAhJc_3d7d_2h2c_As5d_Qh3h_9hJs_AdKc_Tc5h() {
    assertEquals(
      "3d7d Tc5h Qh3h 2h2c As5d AdKc 9hJs",
      Solver.process("texas-holdem 6h8s9cAhJc 3d7d 2h2c As5d Qh3h 9hJs AdKc Tc5h"));
  }

  @Test
  public void test_texas_holdem_9664_3d4d4s9hKs_6sAc_2h7s_7dJh_Kc6d_TcJs_6hAh_Kh9d_AdJc_5sQd() {
    assertEquals(
      "2h7s 7dJh TcJs 5sQd 6hAh=6sAc AdJc Kc6d Kh9d",
      Solver.process("texas-holdem 3d4d4s9hKs 6sAc 2h7s 7dJh Kc6d TcJs 6hAh Kh9d AdJc 5sQd"));
  }

  @Test
  public void test_texas_holdem_9665_5c7h7sQcTh_9sAc_8hKh_9d3h_6s3c() {
    assertEquals(
      "6s3c 9d3h 8hKh 9sAc",
      Solver.process("texas-holdem 5c7h7sQcTh 9sAc 8hKh 9d3h 6s3c"));
  }

  @Test
  public void test_texas_holdem_9666_4c7c8dKdQc_4d3c_6d6h_9s6s_8h3d_7d9c_AsTs_2c5h_KsJs() {
    assertEquals(
      "2c5h 9s6s AsTs 4d3c 6d6h 7d9c 8h3d KsJs",
      Solver.process("texas-holdem 4c7c8dKdQc 4d3c 6d6h 9s6s 8h3d 7d9c AsTs 2c5h KsJs"));
  }

  @Test
  public void test_texas_holdem_9667_4s6c6s8c8d_JdTd_Ts7h_7s2d_3c9h_2h4c_Kh2s_4h3h() {
    assertEquals(
      "2h4c=4h3h 7s2d 3c9h Ts7h JdTd Kh2s",
      Solver.process("texas-holdem 4s6c6s8c8d JdTd Ts7h 7s2d 3c9h 2h4c Kh2s 4h3h"));
  }

  @Test
  public void test_texas_holdem_9668_5s6h8hAhJd_4s2d_3s9h_KhQh_6d5h_JhTs_2h3d() {
    assertEquals(
      "2h3d=4s2d 3s9h JhTs 6d5h KhQh",
      Solver.process("texas-holdem 5s6h8hAhJd 4s2d 3s9h KhQh 6d5h JhTs 2h3d"));
  }

  @Test
  public void test_texas_holdem_9669_3c5d9sJdKh_5hTh_7cQh_4dAd_9d2d_Tc4c() {
    assertEquals(
      "Tc4c 7cQh 4dAd 5hTh 9d2d",
      Solver.process("texas-holdem 3c5d9sJdKh 5hTh 7cQh 4dAd 9d2d Tc4c"));
  }

  @Test
  public void test_texas_holdem_9670_3h4sJdQdTs_2cTh_QcTd_2sTc_4d7d_7h7s_Ah8d_2hAc_3s8s_2d9c() {
    assertEquals(
      "2d9c 2hAc Ah8d 3s8s 4d7d 7h7s 2cTh=2sTc QcTd",
      Solver.process("texas-holdem 3h4sJdQdTs 2cTh QcTd 2sTc 4d7d 7h7s Ah8d 2hAc 3s8s 2d9c"));
  }

  @Test
  public void test_texas_holdem_9671_4d6h6s8sAs_5c3s_Ac5s_TsKs_7d5d() {
    assertEquals(
      "5c3s Ac5s 7d5d TsKs",
      Solver.process("texas-holdem 4d6h6s8sAs 5c3s Ac5s TsKs 7d5d"));
  }

  @Test
  public void test_texas_holdem_9672_6h7s8cQcQh_QdJd_AsKd_2s2c_4h8d_6sTc() {
    assertEquals(
      "AsKd 2s2c 6sTc 4h8d QdJd",
      Solver.process("texas-holdem 6h7s8cQcQh QdJd AsKd 2s2c 4h8d 6sTc"));
  }

  @Test
  public void test_texas_holdem_9673_2c4s6hTcTs_2s3h_AhKd_4cAs() {
    assertEquals(
      "AhKd 2s3h 4cAs",
      Solver.process("texas-holdem 2c4s6hTcTs 2s3h AhKd 4cAs"));
  }

  @Test
  public void test_texas_holdem_9674_3d7d9dAcKc_2s7c_8h9c() {
    assertEquals(
      "2s7c 8h9c",
      Solver.process("texas-holdem 3d7d9dAcKc 2s7c 8h9c"));
  }

  @Test
  public void test_texas_holdem_9675_3s4s7c7d8c_QhKd_TdJh() {
    assertEquals(
      "TdJh QhKd",
      Solver.process("texas-holdem 3s4s7c7d8c QhKd TdJh"));
  }

  @Test
  public void test_texas_holdem_9676_6s7c8s9d9h_Kd9c_5sJh_Kc5c() {
    assertEquals(
      "Kd9c 5sJh=Kc5c",
      Solver.process("texas-holdem 6s7c8s9d9h Kd9c 5sJh Kc5c"));
  }

  @Test
  public void test_texas_holdem_9677_6c7d9cQcTc_5h6h_4dJs_7hAh_8h3s_3dAc_9dJd_QhTd() {
    assertEquals(
      "4dJs 5h6h 7hAh 9dJd QhTd 8h3s 3dAc",
      Solver.process("texas-holdem 6c7d9cQcTc 5h6h 4dJs 7hAh 8h3s 3dAc 9dJd QhTd"));
  }

  @Test
  public void test_texas_holdem_9678_2d5h8sQdTc_6hKc_7h6d_2h4d_7s4h_ThJs_8dQs_Kd7c_3hTd_4s5c() {
    assertEquals(
      "7s4h 7h6d 6hKc Kd7c 2h4d 4s5c 3hTd ThJs 8dQs",
      Solver.process("texas-holdem 2d5h8sQdTc 6hKc 7h6d 2h4d 7s4h ThJs 8dQs Kd7c 3hTd 4s5c"));
  }

  @Test
  public void test_texas_holdem_9679_8h9hAcQcTh_8c4h_4s5s() {
    assertEquals(
      "4s5s 8c4h",
      Solver.process("texas-holdem 8h9hAcQcTh 8c4h 4s5s"));
  }

  @Test
  public void test_texas_holdem_9680_2d3d6h9dAd_Jc4h_2sJd_Kd3s_6dJs_Ac8s_Qd4d_2c4c() {
    assertEquals(
      "Jc4h 2c4c Ac8s 6dJs 2sJd Qd4d Kd3s",
      Solver.process("texas-holdem 2d3d6h9dAd Jc4h 2sJd Kd3s 6dJs Ac8s Qd4d 2c4c"));
  }

  @Test
  public void test_texas_holdem_9681_4c6hAhJcQd_JsAc_5dTh_6dKd() {
    assertEquals(
      "5dTh 6dKd JsAc",
      Solver.process("texas-holdem 4c6hAhJcQd JsAc 5dTh 6dKd"));
  }

  @Test
  public void test_texas_holdem_9682_3c5c5h8hAs_Ts5d_4h4s_Kd5s_6cQs_KcKh_Ac6s() {
    assertEquals(
      "6cQs 4h4s KcKh Ac6s Ts5d Kd5s",
      Solver.process("texas-holdem 3c5c5h8hAs Ts5d 4h4s Kd5s 6cQs KcKh Ac6s"));
  }

  @Test
  public void test_texas_holdem_9683_3s7h9sAcAs_Th5d_4d2s_5h7d_JhJs_Qc6s_Ts8c_8d4c_QdKd() {
    assertEquals(
      "4d2s 8d4c Th5d Ts8c Qc6s QdKd 5h7d JhJs",
      Solver.process("texas-holdem 3s7h9sAcAs Th5d 4d2s 5h7d JhJs Qc6s Ts8c 8d4c QdKd"));
  }

  @Test
  public void test_texas_holdem_9684_2d4c6dJcQs_Ts4s_8s4h_JhTh_QcKd_2h2c_QhTc_4dQd_Kc8c_8h9c() {
    assertEquals(
      "8h9c Kc8c 8s4h Ts4s JhTh QhTc QcKd 4dQd 2h2c",
      Solver.process("texas-holdem 2d4c6dJcQs Ts4s 8s4h JhTh QcKd 2h2c QhTc 4dQd Kc8c 8h9c"));
  }

  @Test
  public void test_texas_holdem_9685_2d7c8hQcQh_5d9c_Ts6c_TcAs_7dQs_2sAd_Th9d_JdAh() {
    assertEquals(
      "5d9c Ts6c Th9d TcAs JdAh 2sAd 7dQs",
      Solver.process("texas-holdem 2d7c8hQcQh 5d9c Ts6c TcAs 7dQs 2sAd Th9d JdAh"));
  }

  @Test
  public void test_texas_holdem_9686_4d7sQcTcTd_7hQh_Kh9d_6s3s_Jh3c_Kc2c_Jc2s_Ts6c() {
    assertEquals(
      "6s3s Jc2s=Jh3c Kc2c Kh9d 7hQh Ts6c",
      Solver.process("texas-holdem 4d7sQcTcTd 7hQh Kh9d 6s3s Jh3c Kc2c Jc2s Ts6c"));
  }

  @Test
  public void test_texas_holdem_9687_2c3c9hQsTs_3h6c_Ac9d_7h5d_7cKc_5cTc() {
    assertEquals(
      "7h5d 7cKc 3h6c Ac9d 5cTc",
      Solver.process("texas-holdem 2c3c9hQsTs 3h6c Ac9d 7h5d 7cKc 5cTc"));
  }

  @Test
  public void test_texas_holdem_9688_2s5d8sQcTc_5cKc_Jc4h() {
    assertEquals(
      "Jc4h 5cKc",
      Solver.process("texas-holdem 2s5d8sQcTc 5cKc Jc4h"));
  }

  @Test
  public void test_texas_holdem_9689_2s3s7d8cTc_9sAs_Qd8s() {
    assertEquals(
      "9sAs Qd8s",
      Solver.process("texas-holdem 2s3s7d8cTc 9sAs Qd8s"));
  }

  @Test
  public void test_texas_holdem_9690_3c3h4c8cQc_8d7c_Ac7s_JcKc_TdJd() {
    assertEquals(
      "TdJd 8d7c JcKc Ac7s",
      Solver.process("texas-holdem 3c3h4c8cQc 8d7c Ac7s JcKc TdJd"));
  }

  @Test
  public void test_texas_holdem_9691_2c5c9cAcTc_5s3c_AsAd_Qs4h_5dQc_7c7d_2sJc_6h4c_7s7h() {
    assertEquals(
      "7s7h=AsAd=Qs4h 5s3c 6h4c 7c7d 2sJc 5dQc",
      Solver.process("texas-holdem 2c5c9cAcTc 5s3c AsAd Qs4h 5dQc 7c7d 2sJc 6h4c 7s7h"));
  }

  @Test
  public void test_texas_holdem_9692_3s5h6cKdQs_5cQd_6d9c_KsAs_8h9h_3h4h_Td2c() {
    assertEquals(
      "8h9h Td2c 3h4h 6d9c KsAs 5cQd",
      Solver.process("texas-holdem 3s5h6cKdQs 5cQd 6d9c KsAs 8h9h 3h4h Td2c"));
  }

  @Test
  public void test_texas_holdem_9693_2c8cJdKsQd_6d5c_6hQh_Th2h_4cJs_2d4h_Ah3d_TcKc() {
    assertEquals(
      "6d5c Ah3d 2d4h=Th2h 4cJs 6hQh TcKc",
      Solver.process("texas-holdem 2c8cJdKsQd 6d5c 6hQh Th2h 4cJs 2d4h Ah3d TcKc"));
  }

  @Test
  public void test_texas_holdem_9694_3d6c7c7sKd_TdKc_9d4h_Qs7h_2c6s_9s2s_7d9h() {
    assertEquals(
      "9d4h=9s2s 2c6s TdKc 7d9h Qs7h",
      Solver.process("texas-holdem 3d6c7c7sKd TdKc 9d4h Qs7h 2c6s 9s2s 7d9h"));
  }

  @Test
  public void test_texas_holdem_9695_6c8sAcJcTc_2sJd_Qc7s_2h9c() {
    assertEquals(
      "2sJd 2h9c Qc7s",
      Solver.process("texas-holdem 6c8sAcJcTc 2sJd Qc7s 2h9c"));
  }

  @Test
  public void test_texas_holdem_9696_2c2dJdKdQc_TdJs_3sAd_3cTh_5h4d_Tc4s_5dKc() {
    assertEquals(
      "3cTh=5h4d=Tc4s 3sAd TdJs 5dKc",
      Solver.process("texas-holdem 2c2dJdKdQc TdJs 3sAd 3cTh 5h4d Tc4s 5dKc"));
  }

  @Test
  public void test_texas_holdem_9697_3d7h8s9cKh_KsQs_Jd3h() {
    assertEquals(
      "Jd3h KsQs",
      Solver.process("texas-holdem 3d7h8s9cKh KsQs Jd3h"));
  }

  @Test
  public void test_texas_holdem_9698_3d4h5d6dJc_7sTc_8c5h_Ks2s_6h7d_4c9c() {
    assertEquals(
      "4c9c 8c5h Ks2s 6h7d=7sTc",
      Solver.process("texas-holdem 3d4h5d6dJc 7sTc 8c5h Ks2s 6h7d 4c9c"));
  }

  @Test
  public void test_texas_holdem_9699_3d3h4d7d8c_5dJd_9cTh_8hJs_6c9s_7s5s_7c3c_Td2d() {
    assertEquals(
      "6c9s 9cTh 7s5s 8hJs Td2d 5dJd 7c3c",
      Solver.process("texas-holdem 3d3h4d7d8c 5dJd 9cTh 8hJs 6c9s 7s5s 7c3c Td2d"));
  }

  @Test
  public void test_texas_holdem_9700_3c9dAcJsQs_6d4h_KcKs_4c5d() {
    assertEquals(
      "4c5d 6d4h KcKs",
      Solver.process("texas-holdem 3c9dAcJsQs 6d4h KcKs 4c5d"));
  }

  @Test
  public void test_texas_holdem_9701_4d4s5c9dJd_TsJc_8hQh() {
    assertEquals(
      "8hQh TsJc",
      Solver.process("texas-holdem 4d4s5c9dJd TsJc 8hQh"));
  }

  @Test
  public void test_texas_holdem_9702_2s5d7hTcTh_3sJs_Ah3h_6d8h_Kh6c_2cJc_4h8s_KsTd_9s8c_3cAd() {
    assertEquals(
      "4h8s 6d8h 9s8c 3sJs Kh6c 3cAd=Ah3h 2cJc KsTd",
      Solver.process("texas-holdem 2s5d7hTcTh 3sJs Ah3h 6d8h Kh6c 2cJc 4h8s KsTd 9s8c 3cAd"));
  }

  @Test
  public void test_texas_holdem_9703_2d5sAhJsQc_KsAd_KdQh_QsTh_5cTc_Kc8s_6cKh_8h2s_8cAs_7h7s() {
    assertEquals(
      "6cKh Kc8s 8h2s 5cTc 7h7s QsTh KdQh 8cAs KsAd",
      Solver.process("texas-holdem 2d5sAhJsQc KsAd KdQh QsTh 5cTc Kc8s 6cKh 8h2s 8cAs 7h7s"));
  }

  @Test
  public void test_texas_holdem_9704_3dJcKcQcTd_7s5h_QhAd_9s7c_4cKh() {
    assertEquals(
      "7s5h 4cKh 9s7c QhAd",
      Solver.process("texas-holdem 3dJcKcQcTd 7s5h QhAd 9s7c 4cKh"));
  }

  @Test
  public void test_texas_holdem_9705_2d5sAsJcKc_4dAd_Ts4s_Td8h_QcAc_7hJs() {
    assertEquals(
      "Ts4s Td8h 7hJs 4dAd QcAc",
      Solver.process("texas-holdem 2d5sAsJcKc 4dAd Ts4s Td8h QcAc 7hJs"));
  }

  @Test
  public void test_texas_holdem_9706_2s4d5h5sKc_Qs2c_Tc3s() {
    assertEquals(
      "Tc3s Qs2c",
      Solver.process("texas-holdem 2s4d5h5sKc Qs2c Tc3s"));
  }

  @Test
  public void test_texas_holdem_9707_2c2h7c8d8h_Ah7d_2dKs_4dJs_8sJc() {
    assertEquals(
      "4dJs Ah7d 2dKs 8sJc",
      Solver.process("texas-holdem 2c2h7c8d8h Ah7d 2dKs 4dJs 8sJc"));
  }

  @Test
  public void test_texas_holdem_9708_2dAhAsJcKc_5s3s_3hJh() {
    assertEquals(
      "5s3s 3hJh",
      Solver.process("texas-holdem 2dAhAsJcKc 5s3s 3hJh"));
  }

  @Test
  public void test_texas_holdem_9709_2s7s8c9cTs_6sKd_2d4d_TcAc_4sQc_3d3c_JhQd() {
    assertEquals(
      "4sQc 2d4d 3d3c TcAc 6sKd JhQd",
      Solver.process("texas-holdem 2s7s8c9cTs 6sKd 2d4d TcAc 4sQc 3d3c JhQd"));
  }

  @Test
  public void test_texas_holdem_9710_7h9hJcJsQs_8s6h_8c4c_9c5d() {
    assertEquals(
      "8c4c=8s6h 9c5d",
      Solver.process("texas-holdem 7h9hJcJsQs 8s6h 8c4c 9c5d"));
  }

  @Test
  public void test_texas_holdem_9711_9c9d9sKdTd_4dAs_5hJd_Js5s_8dKs_3dTs_7d2s_5cJh_QcKh() {
    assertEquals(
      "7d2s 5cJh=5hJd=Js5s 4dAs 3dTs 8dKs=QcKh",
      Solver.process("texas-holdem 9c9d9sKdTd 4dAs 5hJd Js5s 8dKs 3dTs 7d2s 5cJh QcKh"));
  }

  @Test
  public void test_texas_holdem_9712_8hJcKcKhTh_6d8d_4sTc_3c7d_Jd9h_Qh6s_7c2s_9d2d() {
    assertEquals(
      "3c7d=7c2s 9d2d Qh6s 6d8d 4sTc Jd9h",
      Solver.process("texas-holdem 8hJcKcKhTh 6d8d 4sTc 3c7d Jd9h Qh6s 7c2s 9d2d"));
  }

  @Test
  public void test_texas_holdem_9713_8d8s9sKsQh_Jd7d_6hAd_7h2s_7c5s_QcAh_2c8c() {
    assertEquals(
      "7c5s=7h2s Jd7d 6hAd QcAh 2c8c",
      Solver.process("texas-holdem 8d8s9sKsQh Jd7d 6hAd 7h2s 7c5s QcAh 2c8c"));
  }

  @Test
  public void test_texas_holdem_9714_3s4sAhKhQh_Ac9h_As4c() {
    assertEquals(
      "Ac9h As4c",
      Solver.process("texas-holdem 3s4sAhKhQh Ac9h As4c"));
  }

  @Test
  public void test_texas_holdem_9715_3h4d7h8cKs_3d7c_8sTd() {
    assertEquals(
      "8sTd 3d7c",
      Solver.process("texas-holdem 3h4d7h8cKs 3d7c 8sTd"));
  }

  @Test
  public void test_texas_holdem_9716_5s8s9cJdJh_6s2s_4d7s_Qd9d_5c7h_2d2c() {
    assertEquals(
      "6s2s 4d7s 2d2c 5c7h Qd9d",
      Solver.process("texas-holdem 5s8s9cJdJh 6s2s 4d7s Qd9d 5c7h 2d2c"));
  }

  @Test
  public void test_texas_holdem_9717_3d5s6d8hJd_6sAc_7dQc_4s5c_9cAs_QsKc_Tc5h() {
    assertEquals(
      "7dQc QsKc 9cAs 4s5c Tc5h 6sAc",
      Solver.process("texas-holdem 3d5s6d8hJd 6sAc 7dQc 4s5c 9cAs QsKc Tc5h"));
  }

  @Test
  public void test_texas_holdem_9718_4s7c7h8hQh_2hJc_8s3c_7d2c_Js9c_4hQc() {
    assertEquals(
      "2hJc Js9c 8s3c 4hQc 7d2c",
      Solver.process("texas-holdem 4s7c7h8hQh 2hJc 8s3c 7d2c Js9c 4hQc"));
  }

  @Test
  public void test_texas_holdem_9719_2h7hAhJsQc_4h9d_5c4s_AsJc_8h8c_5h9s_6h2s_3s4d_6s2c() {
    assertEquals(
      "3s4d 5c4s 4h9d=5h9s 6h2s=6s2c 8h8c AsJc",
      Solver.process("texas-holdem 2h7hAhJsQc 4h9d 5c4s AsJc 8h8c 5h9s 6h2s 3s4d 6s2c"));
  }

  @Test
  public void test_texas_holdem_9720_5h6c9hAcJh_7h7d_4dQd_Th3s_Kc2d() {
    assertEquals(
      "Th3s 4dQd Kc2d 7h7d",
      Solver.process("texas-holdem 5h6c9hAcJh 7h7d 4dQd Th3s Kc2d"));
  }

  @Test
  public void test_texas_holdem_9721_8d9sAdJsQd_Kh3c_7h3h_KsQc_7dTs_5s9h() {
    assertEquals(
      "7h3h Kh3c 5s9h KsQc 7dTs",
      Solver.process("texas-holdem 8d9sAdJsQd Kh3c 7h3h KsQc 7dTs 5s9h"));
  }

  @Test
  public void test_texas_holdem_9722_3c3s5c6c7h_Qh6s_5hAs_Tc7d_KhAd_4sQs_6h2d_9c8c_9h4c_7sKd() {
    assertEquals(
      "KhAd 5hAs 6h2d Qh6s Tc7d 7sKd 4sQs=9h4c 9c8c",
      Solver.process("texas-holdem 3c3s5c6c7h Qh6s 5hAs Tc7d KhAd 4sQs 6h2d 9c8c 9h4c 7sKd"));
  }

  @Test
  public void test_texas_holdem_9723_6d8sQhTcTh_4dQc_7c8h_Kc7d_JcJs_5hAh_6hKh() {
    assertEquals(
      "Kc7d 5hAh 6hKh 7c8h JcJs 4dQc",
      Solver.process("texas-holdem 6d8sQhTcTh 4dQc 7c8h Kc7d JcJs 5hAh 6hKh"));
  }

  @Test
  public void test_texas_holdem_9724_6h6s8sAcKc_2h3d_Ah2s() {
    assertEquals(
      "2h3d Ah2s",
      Solver.process("texas-holdem 6h6s8sAcKc 2h3d Ah2s"));
  }

  @Test
  public void test_texas_holdem_9725_2s4d5h6cTc_Qc3d_Jh7s_KhKc_5dKs_8hKd() {
    assertEquals(
      "Jh7s 8hKd 5dKs KhKc Qc3d",
      Solver.process("texas-holdem 2s4d5h6cTc Qc3d Jh7s KhKc 5dKs 8hKd"));
  }

  @Test
  public void test_texas_holdem_9726_6h9hJsTdTh_Kd9d_7c5c_3d2d_KhKs_2h8s_5h5d() {
    assertEquals(
      "3d2d 7c5c 2h8s 5h5d Kd9d KhKs",
      Solver.process("texas-holdem 6h9hJsTdTh Kd9d 7c5c 3d2d KhKs 2h8s 5h5d"));
  }

  @Test
  public void test_texas_holdem_9727_6d8sAhKcQc_6c9s_5h8d_9c8c_8hAc_JsTc_4dKd() {
    assertEquals(
      "6c9s 5h8d=9c8c 4dKd 8hAc JsTc",
      Solver.process("texas-holdem 6d8sAhKcQc 6c9s 5h8d 9c8c 8hAc JsTc 4dKd"));
  }

  @Test
  public void test_texas_holdem_9728_4s6s9hJhKs_As7s_Kd6h_3s8s_5sTh_Qc2d_Qs3c_Jc8c_9c9s() {
    assertEquals(
      "5sTh Qc2d=Qs3c Jc8c Kd6h 9c9s 3s8s As7s",
      Solver.process("texas-holdem 4s6s9hJhKs As7s Kd6h 3s8s 5sTh Qc2d Qs3c Jc8c 9c9s"));
  }

  @Test
  public void test_texas_holdem_9729_4d5c7d8s9d_6sAd_7sAs_JhJc_5d6h() {
    assertEquals(
      "7sAs JhJc 5d6h=6sAd",
      Solver.process("texas-holdem 4d5c7d8s9d 6sAd 7sAs JhJc 5d6h"));
  }

  @Test
  public void test_texas_holdem_9730_4c5d8dJhJs_2d7c_5c4d_7hQs() {
    assertEquals(
      "2d7c 7hQs 5c4d",
      Solver.process("texas-holdem 4c5d8dJhJs 2d7c 5c4d 7hQs"));
  }

  @Test
  public void test_texas_holdem_9731_3d7d9hAdAs_JsTs_7c8d_7sAc_Td9s_Ah5d() {
    assertEquals(
      "JsTs 7c8d Td9s Ah5d 7sAc",
      Solver.process("texas-holdem 3d7d9hAdAs JsTs 7c8d 7sAc Td9s Ah5d"));
  }

  @Test
  public void test_texas_holdem_9732_2c2d2s4hTc_6h9s_3h5c_QsKh_Kd8c_Js6s_QdQh_9c8s_5sAd_QcAh() {
    assertEquals(
      "3h5c 6h9s=9c8s Js6s Kd8c QsKh 5sAd QcAh QdQh",
      Solver.process("texas-holdem 2c2d2s4hTc 6h9s 3h5c QsKh Kd8c Js6s QdQh 9c8s 5sAd QcAh"));
  }

  @Test
  public void test_texas_holdem_9733_3h5s8c9hKs_AsJc_Jh8d_AdAh_2hTh() {
    assertEquals(
      "2hTh AsJc Jh8d AdAh",
      Solver.process("texas-holdem 3h5s8c9hKs AsJc Jh8d AdAh 2hTh"));
  }

  @Test
  public void test_texas_holdem_9734_2s5c7cKhTd_4c3s_Js5d_Ac8d() {
    assertEquals(
      "4c3s Ac8d Js5d",
      Solver.process("texas-holdem 2s5c7cKhTd 4c3s Js5d Ac8d"));
  }

  @Test
  public void test_texas_holdem_9735_2d9hAcAdJh_6s2c_9c4h_Qc6c_7s8c_4c3c_AhTh_Kh9s_6h7d() {
    assertEquals(
      "4c3c 6h7d 7s8c Qc6c 6s2c 9c4h Kh9s AhTh",
      Solver.process("texas-holdem 2d9hAcAdJh 6s2c 9c4h Qc6c 7s8c 4c3c AhTh Kh9s 6h7d"));
  }

  @Test
  public void test_texas_holdem_9736_5dJsKcKsQh_6cTh_TcJh_9h7s_Kh2c_6s2d() {
    assertEquals(
      "6s2d 9h7s 6cTh TcJh Kh2c",
      Solver.process("texas-holdem 5dJsKcKsQh 6cTh TcJh 9h7s Kh2c 6s2d"));
  }

  @Test
  public void test_texas_holdem_9737_6cAdJcJhJs_7cKc_9c8h_4h9s_7s2c_KhQh_Jd5h() {
    assertEquals(
      "7s2c 4h9s=9c8h 7cKc=KhQh Jd5h",
      Solver.process("texas-holdem 6cAdJcJhJs 7cKc 9c8h 4h9s 7s2c KhQh Jd5h"));
  }

  @Test
  public void test_texas_holdem_9738_3h4s5dJhTs_7dJd_8d2c_Kc8c_7s5s_Qc9s() {
    assertEquals(
      "8d2c Qc9s Kc8c 7s5s 7dJd",
      Solver.process("texas-holdem 3h4s5dJhTs 7dJd 8d2c Kc8c 7s5s Qc9s"));
  }

  @Test
  public void test_texas_holdem_9739_3h4h4sJcTc_4c5s_6s4d_9c8c_KsQd_9h3d_8sQc_Kd5d_Kc3s() {
    assertEquals(
      "9c8c 8sQc Kd5d KsQd 9h3d Kc3s 4c5s=6s4d",
      Solver.process("texas-holdem 3h4h4sJcTc 4c5s 6s4d 9c8c KsQd 9h3d 8sQc Kd5d Kc3s"));
  }

  @Test
  public void test_texas_holdem_9740_4h7c8d8hAd_6hAs_Ks6c_3s7d() {
    assertEquals(
      "Ks6c 3s7d 6hAs",
      Solver.process("texas-holdem 4h7c8d8hAd 6hAs Ks6c 3s7d"));
  }

  @Test
  public void test_texas_holdem_9741_2s4h5s8hKs_Qd3s_3h8s_TdTs_9cJh() {
    assertEquals(
      "9cJh Qd3s 3h8s TdTs",
      Solver.process("texas-holdem 2s4h5s8hKs Qd3s 3h8s TdTs 9cJh"));
  }

  @Test
  public void test_texas_holdem_9742_2h3d6s7cQc_5dJc_9h5s_4h3s_Jd2d_JsKc_4sQd_9dKd_2cTh() {
    assertEquals(
      "9h5s 5dJc 9dKd JsKc 2cTh Jd2d 4h3s 4sQd",
      Solver.process("texas-holdem 2h3d6s7cQc 5dJc 9h5s 4h3s Jd2d JsKc 4sQd 9dKd 2cTh"));
  }

  @Test
  public void test_texas_holdem_9743_2d3c4c9cKc_6hJd_6cTc_8c2h_9d9s_5hTh() {
    assertEquals(
      "5hTh 6hJd 9d9s 8c2h 6cTc",
      Solver.process("texas-holdem 2d3c4c9cKc 6hJd 6cTc 8c2h 9d9s 5hTh"));
  }

  @Test
  public void test_texas_holdem_9744_2d3c4d9hTd_8sJs_7cJh_7h5c_AdJd_AcQd_AsQh_7d5h_5d8c_Ah6h() {
    assertEquals(
      "7d5h=7h5c 5d8c 7cJh 8sJs Ah6h AcQd=AsQh AdJd",
      Solver.process("texas-holdem 2d3c4d9hTd 8sJs 7cJh 7h5c AdJd AcQd AsQh 7d5h 5d8c Ah6h"));
  }

  @Test
  public void test_texas_holdem_9745_5s6c6s8cJh_7c7s_Ac3d() {
    assertEquals(
      "Ac3d 7c7s",
      Solver.process("texas-holdem 5s6c6s8cJh 7c7s Ac3d"));
  }

  @Test
  public void test_texas_holdem_9746_2s7h9dKhKs_4c9h_7dQs_6h2c_7s4s_Js6c_5cQd() {
    assertEquals(
      "Js6c 5cQd 6h2c 7s4s 7dQs 4c9h",
      Solver.process("texas-holdem 2s7h9dKhKs 4c9h 7dQs 6h2c 7s4s Js6c 5cQd"));
  }

  @Test
  public void test_texas_holdem_9747_3dAcJcJhKs_Th8h_6cQc_9d8d_8sAs() {
    assertEquals(
      "9d8d Th8h 6cQc 8sAs",
      Solver.process("texas-holdem 3dAcJcJhKs Th8h 6cQc 9d8d 8sAs"));
  }

  @Test
  public void test_texas_holdem_9748_4s7d8dAdKs_4c9c_2h2d_3d7c_Td3h_6sAs_Qc9d_3c2s() {
    assertEquals(
      "3c2s Td3h Qc9d 2h2d 4c9c 3d7c 6sAs",
      Solver.process("texas-holdem 4s7d8dAdKs 4c9c 2h2d 3d7c Td3h 6sAs Qc9d 3c2s"));
  }

  @Test
  public void test_texas_holdem_9749_3d3s7sAcJh_2h8h_QcAs_QsTs_Ks2c_Th2d_AhTc() {
    assertEquals(
      "2h8h Th2d QsTs Ks2c AhTc QcAs",
      Solver.process("texas-holdem 3d3s7sAcJh 2h8h QcAs QsTs Ks2c Th2d AhTc"));
  }

}
