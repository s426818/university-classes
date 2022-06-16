
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver14HiddenTest {


  @Test
  public void test_texas_holdem_3500_7c9cAhKsTs_2c6h_6sJs_7d7h_Kd8s_6d4h_9sKh_4cTh_JdAd_3d5d() {
    assertEquals(
      "2c6h=3d5d=6d4h 6sJs 4cTh Kd8s JdAd 9sKh 7d7h",
      Solver.process("texas-holdem 7c9cAhKsTs 2c6h 6sJs 7d7h Kd8s 6d4h 9sKh 4cTh JdAd 3d5d"));
  }

  @Test
  public void test_texas_holdem_3501_4h6d9sAsQs_5hTd_7d7h_7sTc() {
    assertEquals(
      "5hTd 7sTc 7d7h",
      Solver.process("texas-holdem 4h6d9sAsQs 5hTd 7d7h 7sTc"));
  }

  @Test
  public void test_texas_holdem_3502_3c7d8dQcQh_5c6c_Jd3h_8cAs_3dAd_4h2h_7s5h_7cJs_2s7h() {
    assertEquals(
      "4h2h 5c6c Jd3h 3dAd 2s7h=7s5h 7cJs 8cAs",
      Solver.process("texas-holdem 3c7d8dQcQh 5c6c Jd3h 8cAs 3dAd 4h2h 7s5h 7cJs 2s7h"));
  }

  @Test
  public void test_texas_holdem_3503_4s6h7dQcTh_Jc5h_Jd8c_3sAh_4dKd_5s8s_Ks5c() {
    assertEquals(
      "Jc5h Jd8c Ks5c 3sAh 4dKd 5s8s",
      Solver.process("texas-holdem 4s6h7dQcTh Jc5h Jd8c 3sAh 4dKd 5s8s Ks5c"));
  }

  @Test
  public void test_texas_holdem_3504_2c2s6cAdTd_9s4d_Qd8d_3c2d_Ts8h_KhJc_AsAc_3hQc_Jd9d() {
    assertEquals(
      "9s4d Jd9d 3hQc=Qd8d KhJc Ts8h 3c2d AsAc",
      Solver.process("texas-holdem 2c2s6cAdTd 9s4d Qd8d 3c2d Ts8h KhJc AsAc 3hQc Jd9d"));
  }

  @Test
  public void test_texas_holdem_3505_2d4c4s5s8s_3cAc_8cAh_TcTh() {
    assertEquals(
      "8cAh TcTh 3cAc",
      Solver.process("texas-holdem 2d4c4s5s8s 3cAc 8cAh TcTh"));
  }

  @Test
  public void test_texas_holdem_3506_4c4hAdJhKd_6cAh_5dQs_7c7s() {
    assertEquals(
      "5dQs 7c7s 6cAh",
      Solver.process("texas-holdem 4c4hAdJhKd 6cAh 5dQs 7c7s"));
  }

  @Test
  public void test_texas_holdem_3507_6s7s8d9d9s_5sQh_8s4c_Td6h() {
    assertEquals(
      "8s4c 5sQh Td6h",
      Solver.process("texas-holdem 6s7s8d9d9s 5sQh 8s4c Td6h"));
  }

  @Test
  public void test_texas_holdem_3508_2c3d6h9hKd_6cTs_7h6d_JcQc_Ks9c() {
    assertEquals(
      "JcQc 7h6d 6cTs Ks9c",
      Solver.process("texas-holdem 2c3d6h9hKd 6cTs 7h6d JcQc Ks9c"));
  }

  @Test
  public void test_texas_holdem_3509_3d8hJcJhKc_9sKh_8d7s_Qh8s_Js6d_5cAc_Qs9d_4dAd() {
    assertEquals(
      "Qs9d 4dAd=5cAc 8d7s=Qh8s 9sKh Js6d",
      Solver.process("texas-holdem 3d8hJcJhKc 9sKh 8d7s Qh8s Js6d 5cAc Qs9d 4dAd"));
  }

  @Test
  public void test_texas_holdem_3510_2s6d8d9sKh_Jc4s_2c2d_6s4d() {
    assertEquals(
      "Jc4s 6s4d 2c2d",
      Solver.process("texas-holdem 2s6d8d9sKh Jc4s 2c2d 6s4d"));
  }

  @Test
  public void test_texas_holdem_3511_2c7h8dJdTh_5s9d_Ts8s_8hQc_Ah8c() {
    assertEquals(
      "8hQc Ah8c Ts8s 5s9d",
      Solver.process("texas-holdem 2c7h8dJdTh 5s9d Ts8s 8hQc Ah8c"));
  }

  @Test
  public void test_texas_holdem_3512_3sAcAdKcTs_9h5s_Kh4h_Td6s_4dAh_Th4s() {
    assertEquals(
      "9h5s Td6s=Th4s Kh4h 4dAh",
      Solver.process("texas-holdem 3sAcAdKcTs 9h5s Kh4h Td6s 4dAh Th4s"));
  }

  @Test
  public void test_texas_holdem_3513_3h4d6c8h9c_6sTs_4h5c() {
    assertEquals(
      "4h5c 6sTs",
      Solver.process("texas-holdem 3h4d6c8h9c 6sTs 4h5c"));
  }

  @Test
  public void test_texas_holdem_3514_6d6s8hJdTc_TsKd_2d7s_4hJs_7dKh_8s3s_QhKs_6cAs() {
    assertEquals(
      "2d7s 7dKh QhKs 8s3s TsKd 4hJs 6cAs",
      Solver.process("texas-holdem 6d6s8hJdTc TsKd 2d7s 4hJs 7dKh 8s3s QhKs 6cAs"));
  }

  @Test
  public void test_texas_holdem_3515_3s4c5d6dAd_4s6h_5hQs_9c4h_3d3c_Qc2h() {
    assertEquals(
      "9c4h 5hQs 4s6h 3d3c Qc2h",
      Solver.process("texas-holdem 3s4c5d6dAd 4s6h 5hQs 9c4h 3d3c Qc2h"));
  }

  @Test
  public void test_texas_holdem_3516_5c9hAsJhQh_6d7h_3d3s_6sTd_5d2c_JcKh_2hAc_5s2d_3h6c() {
    assertEquals(
      "3h6c 6d7h 6sTd 3d3s 5d2c=5s2d JcKh 2hAc",
      Solver.process("texas-holdem 5c9hAsJhQh 6d7h 3d3s 6sTd 5d2c JcKh 2hAc 5s2d 3h6c"));
  }

  @Test
  public void test_texas_holdem_3517_3h3s8h9hTh_Jc2d_KcQs_Kd5h_Js3c_6d5d_9dQc_7cAs_3dJd_6c4h() {
    assertEquals(
      "6d5d Jc2d KcQs 7cAs 9dQc 3dJd=Js3c 6c4h Kd5h",
      Solver.process("texas-holdem 3h3s8h9hTh Jc2d KcQs Kd5h Js3c 6d5d 9dQc 7cAs 3dJd 6c4h"));
  }

  @Test
  public void test_texas_holdem_3518_2h3c7h8s9c_6cKs_4dAd_KdTh_7c7s_6h8c() {
    assertEquals(
      "6cKs KdTh 4dAd 6h8c 7c7s",
      Solver.process("texas-holdem 2h3c7h8s9c 6cKs 4dAd KdTh 7c7s 6h8c"));
  }

  @Test
  public void test_texas_holdem_3519_2s7d8sAdQd_Kd3h_Th6s_QhKh() {
    assertEquals(
      "Th6s Kd3h QhKh",
      Solver.process("texas-holdem 2s7d8sAdQd Kd3h Th6s QhKh"));
  }

  @Test
  public void test_texas_holdem_3520_3h4c7dAdAs_4sTs_7h5c_Tc8h_4h3s_Jh6c_Td7s_9sKc_Jd6s_QhQc() {
    assertEquals(
      "Tc8h Jd6s=Jh6c 9sKc 4h3s 4sTs 7h5c Td7s QhQc",
      Solver.process("texas-holdem 3h4c7dAdAs 4sTs 7h5c Tc8h 4h3s Jh6c Td7s 9sKc Jd6s QhQc"));
  }

  @Test
  public void test_texas_holdem_3521_6c6h7sQcQd_JdJs_2s5c_Th3h_5sTc_6s9s_TdTs_Ah2c_4hKc() {
    assertEquals(
      "2s5c 5sTc=Th3h 4hKc Ah2c TdTs JdJs 6s9s",
      Solver.process("texas-holdem 6c6h7sQcQd JdJs 2s5c Th3h 5sTc 6s9s TdTs Ah2c 4hKc"));
  }

  @Test
  public void test_texas_holdem_3522_5sAdJdQdTs_2s3d_7h8h_6s6d_Qs5h_Ks4h_7sKc_3h7c_Jc4c() {
    assertEquals(
      "2s3d 3h7c 7h8h 6s6d Jc4c Qs5h 7sKc=Ks4h",
      Solver.process("texas-holdem 5sAdJdQdTs 2s3d 7h8h 6s6d Qs5h Ks4h 7sKc 3h7c Jc4c"));
  }

  @Test
  public void test_texas_holdem_3523_4s5hKdKhQc_8dQd_8c2d_9s3s_7cKc() {
    assertEquals(
      "8c2d 9s3s 8dQd 7cKc",
      Solver.process("texas-holdem 4s5hKdKhQc 8dQd 8c2d 9s3s 7cKc"));
  }

  @Test
  public void test_texas_holdem_3524_2c2s6c7c9d_TcAs_Kh9c_JdAh_3c5d_KsKc_2h5s_3sTs_9h3d() {
    assertEquals(
      "3c5d 3sTs TcAs JdAh 9h3d Kh9c KsKc 2h5s",
      Solver.process("texas-holdem 2c2s6c7c9d TcAs Kh9c JdAh 3c5d KsKc 2h5s 3sTs 9h3d"));
  }

  @Test
  public void test_texas_holdem_3525_2c2h7sQcTc_TdKh_4h5d_7dQh_9dAc_3d6h_7h9h_2sJd_2dJs_8c5h() {
    assertEquals(
      "3d6h=4h5d 8c5h 9dAc 7h9h TdKh 7dQh 2dJs=2sJd",
      Solver.process("texas-holdem 2c2h7sQcTc TdKh 4h5d 7dQh 9dAc 3d6h 7h9h 2sJd 2dJs 8c5h"));
  }

  @Test
  public void test_texas_holdem_3526_3h6c8c8sTh_5dJh_2d2c_Qs4h_9s3s() {
    assertEquals(
      "5dJh Qs4h 2d2c 9s3s",
      Solver.process("texas-holdem 3h6c8c8sTh 5dJh 2d2c Qs4h 9s3s"));
  }

  @Test
  public void test_texas_holdem_3527_4s7sAhJcKs_3sAc_Kc4c_5d2s_Qc2d_3d8d_TdQd_AsJh_7h9h() {
    assertEquals(
      "5d2s 3d8d Qc2d 7h9h 3sAc Kc4c AsJh TdQd",
      Solver.process("texas-holdem 4s7sAhJcKs 3sAc Kc4c 5d2s Qc2d 3d8d TdQd AsJh 7h9h"));
  }

  @Test
  public void test_texas_holdem_3528_3d4c4s5c5s_2h2d_7d4h_8h9s_2cAc_9cQs_5d9d() {
    assertEquals(
      "2h2d 8h9s 9cQs 2cAc 7d4h 5d9d",
      Solver.process("texas-holdem 3d4c4s5c5s 2h2d 7d4h 8h9s 2cAc 9cQs 5d9d"));
  }

  @Test
  public void test_texas_holdem_3529_4c6s8h9hTc_Kd2s_6h2c_5cJd_KsKc_4dJs_Qs6c_Th7c_9s7d() {
    assertEquals(
      "5cJd Kd2s 4dJs 6h2c Qs6c KsKc 9s7d=Th7c",
      Solver.process("texas-holdem 4c6s8h9hTc Kd2s 6h2c 5cJd KsKc 4dJs Qs6c Th7c 9s7d"));
  }

  @Test
  public void test_texas_holdem_3530_3c7dJdQcTs_9h7s_4s7c_5s8h_9s6d_JsKh_Ks4c() {
    assertEquals(
      "5s8h 9s6d Ks4c 4s7c=9h7s JsKh",
      Solver.process("texas-holdem 3c7dJdQcTs 9h7s 4s7c 5s8h 9s6d JsKh Ks4c"));
  }

  @Test
  public void test_texas_holdem_3531_3s5c6d7hQs_Kc6s_8sJd_8cAs() {
    assertEquals(
      "8sJd 8cAs Kc6s",
      Solver.process("texas-holdem 3s5c6d7hQs Kc6s 8sJd 8cAs"));
  }

  @Test
  public void test_texas_holdem_3532_5h8sAdJcJd_Qc5c_4s2h_Kd7s_5s9s_9d4c_3cAc_Kh6c() {
    assertEquals(
      "4s2h 9d4c Kd7s=Kh6c 5s9s=Qc5c 3cAc",
      Solver.process("texas-holdem 5h8sAdJcJd Qc5c 4s2h Kd7s 5s9s 9d4c 3cAc Kh6c"));
  }

  @Test
  public void test_texas_holdem_3533_6d9c9hAcJd_TsQh_AdJs_7h4s_KcQd_3dQc_Jc7c_Th4c_3hTc_5h5d() {
    assertEquals(
      "7h4s 3hTc=Th4c 3dQc=TsQh KcQd 5h5d Jc7c AdJs",
      Solver.process("texas-holdem 6d9c9hAcJd TsQh AdJs 7h4s KcQd 3dQc Jc7c Th4c 3hTc 5h5d"));
  }

  @Test
  public void test_texas_holdem_3534_3h3s6cAcKd_7c4h_9d9c_Ah9s_Ad2h() {
    assertEquals(
      "7c4h 9d9c Ad2h=Ah9s",
      Solver.process("texas-holdem 3h3s6cAcKd 7c4h 9d9c Ah9s Ad2h"));
  }

  @Test
  public void test_texas_holdem_3535_4c6cQdThTs_8h6d_5dKd_7c7h_7s5s_5c4h_3dTd_Qc8d_Ad6s() {
    assertEquals(
      "7s5s 5dKd 5c4h 8h6d Ad6s 7c7h Qc8d 3dTd",
      Solver.process("texas-holdem 4c6cQdThTs 8h6d 5dKd 7c7h 7s5s 5c4h 3dTd Qc8d Ad6s"));
  }

  @Test
  public void test_texas_holdem_3536_4h6d9hJsKs_Qc8h_4c3c_6sJd_9dKc_Ad2s_9cTh_3s7h() {
    assertEquals(
      "3s7h Qc8h Ad2s 4c3c 9cTh 6sJd 9dKc",
      Solver.process("texas-holdem 4h6d9hJsKs Qc8h 4c3c 6sJd 9dKc Ad2s 9cTh 3s7h"));
  }

  @Test
  public void test_texas_holdem_3537_3s4c4h9sQs_6sAh_Qd6h_8dTh() {
    assertEquals(
      "8dTh 6sAh Qd6h",
      Solver.process("texas-holdem 3s4c4h9sQs 6sAh Qd6h 8dTh"));
  }

  @Test
  public void test_texas_holdem_3538_3c3s5d5h8c_TsTd_Qh8h_5cAh() {
    assertEquals(
      "Qh8h TsTd 5cAh",
      Solver.process("texas-holdem 3c3s5d5h8c TsTd Qh8h 5cAh"));
  }

  @Test
  public void test_texas_holdem_3539_3h4s6cAsTd_Jc6h_Jd9h_Ks5h_2d8c_Ah2c_QhTs_QdKh() {
    assertEquals(
      "2d8c Jd9h Ks5h QdKh Jc6h QhTs Ah2c",
      Solver.process("texas-holdem 3h4s6cAsTd Jc6h Jd9h Ks5h 2d8c Ah2c QhTs QdKh"));
  }

  @Test
  public void test_texas_holdem_3540_7c7d8s9d9h_QhJd_As7s_Kc2h_5d8d_Kh4h_8hQc_4s2s_8cQd() {
    assertEquals(
      "4s2s QhJd Kc2h=Kh4h 5d8d 8cQd=8hQc As7s",
      Solver.process("texas-holdem 7c7d8s9d9h QhJd As7s Kc2h 5d8d Kh4h 8hQc 4s2s 8cQd"));
  }

  @Test
  public void test_texas_holdem_3541_2h2s9hJcKs_7c8h_9dJd_6cKd_QsTd_Kh8s_Qh8c_8d7d() {
    assertEquals(
      "7c8h=8d7d Qh8c 9dJd 6cKd=Kh8s QsTd",
      Solver.process("texas-holdem 2h2s9hJcKs 7c8h 9dJd 6cKd QsTd Kh8s Qh8c 8d7d"));
  }

  @Test
  public void test_texas_holdem_3542_4h7dAsKcTh_7c9h_3cJs_3hQc_8cKd_JdJh() {
    assertEquals(
      "3cJs 3hQc 7c9h JdJh 8cKd",
      Solver.process("texas-holdem 4h7dAsKcTh 7c9h 3cJs 3hQc 8cKd JdJh"));
  }

  @Test
  public void test_texas_holdem_3543_3c6d7s8hJs_6hKh_QhTc_QcJd_ThJh_8c4s_9s5s_5h6s() {
    assertEquals(
      "QhTc 5h6s 6hKh 8c4s ThJh QcJd 9s5s",
      Solver.process("texas-holdem 3c6d7s8hJs 6hKh QhTc QcJd ThJh 8c4s 9s5s 5h6s"));
  }

  @Test
  public void test_texas_holdem_3544_2c2h3s6s8c_KdAc_5d5s_5h3d_Ad7h_3cTd_7d9c_6cAh_Kc4c() {
    assertEquals(
      "7d9c Kc4c Ad7h KdAc 5h3d 3cTd 5d5s 6cAh",
      Solver.process("texas-holdem 2c2h3s6s8c KdAc 5d5s 5h3d Ad7h 3cTd 7d9c 6cAh Kc4c"));
  }

  @Test
  public void test_texas_holdem_3545_4d4sAhJdKd_8h3c_7c9h_7d6s_Qd8d_Td6h_Qs5s() {
    assertEquals(
      "7c9h=7d6s=8h3c=Td6h Qs5s Qd8d",
      Solver.process("texas-holdem 4d4sAhJdKd 8h3c 7c9h 7d6s Qd8d Td6h Qs5s"));
  }

  @Test
  public void test_texas_holdem_3546_3d6d7h8d9c_3cQh_6h7s_2d4d_9sKs_Kc2c_5d5s_Th5c_2h9h() {
    assertEquals(
      "Kc2c 3cQh 2h9h 9sKs 6h7s 5d5s Th5c 2d4d",
      Solver.process("texas-holdem 3d6d7h8d9c 3cQh 6h7s 2d4d 9sKs Kc2c 5d5s Th5c 2h9h"));
  }

  @Test
  public void test_texas_holdem_3547_5h6d6h7c8h_Kc4h_2cTs_5dJc_Ah9h_4cTc_Th2d() {
    assertEquals(
      "2cTs=Th2d 5dJc 4cTc=Kc4h Ah9h",
      Solver.process("texas-holdem 5h6d6h7c8h Kc4h 2cTs 5dJc Ah9h 4cTc Th2d"));
  }

  @Test
  public void test_texas_holdem_3548_2c5c6sAcKs_3d4c_AhTh_Qc3h() {
    assertEquals(
      "Qc3h AhTh 3d4c",
      Solver.process("texas-holdem 2c5c6sAcKs 3d4c AhTh Qc3h"));
  }

  @Test
  public void test_texas_holdem_3549_3d7c8dQhTs_4cKs_Kd3h_8cKh_5sQc_9d4s_4dAs_5h2h() {
    assertEquals(
      "5h2h 9d4s 4cKs 4dAs Kd3h 8cKh 5sQc",
      Solver.process("texas-holdem 3d7c8dQhTs 4cKs Kd3h 8cKh 5sQc 9d4s 4dAs 5h2h"));
  }

  @Test
  public void test_texas_holdem_3550_7c9sAhKsTh_Tc2d_Td9d_8sKd_8d5c_2s6c_4d3s_QdJc() {
    assertEquals(
      "2s6c=4d3s 8d5c Tc2d 8sKd Td9d QdJc",
      Solver.process("texas-holdem 7c9sAhKsTh Tc2d Td9d 8sKd 8d5c 2s6c 4d3s QdJc"));
  }

  @Test
  public void test_texas_holdem_3551_2c9h9sAhQd_Qc4s_Tc7c_2sTh() {
    assertEquals(
      "Tc7c 2sTh Qc4s",
      Solver.process("texas-holdem 2c9h9sAhQd Qc4s Tc7c 2sTh"));
  }

  @Test
  public void test_texas_holdem_3552_6cJcJdKhTd_6dTs_3s9d_5sAd_Qc6h_4s2d() {
    assertEquals(
      "4s2d 3s9d 5sAd Qc6h 6dTs",
      Solver.process("texas-holdem 6cJcJdKhTd 6dTs 3s9d 5sAd Qc6h 4s2d"));
  }

  @Test
  public void test_texas_holdem_3553_3d3s6s9sAs_5dJd_8d5s_6d3c_4c7h_4d3h() {
    assertEquals(
      "4c7h 5dJd 4d3h 8d5s 6d3c",
      Solver.process("texas-holdem 3d3s6s9sAs 5dJd 8d5s 6d3c 4c7h 4d3h"));
  }

  @Test
  public void test_texas_holdem_3554_2s7h9c9dKh_5h6s_Jc7c_Kd5c_5sAh_Kc9h_As4c_7dJs_5d3h_JhJd() {
    assertEquals(
      "5d3h 5h6s 5sAh=As4c 7dJs=Jc7c JhJd Kd5c Kc9h",
      Solver.process("texas-holdem 2s7h9c9dKh 5h6s Jc7c Kd5c 5sAh Kc9h As4c 7dJs 5d3h JhJd"));
  }

  @Test
  public void test_texas_holdem_3555_4c6c8hJcQd_ThQc_Kh8c() {
    assertEquals(
      "Kh8c ThQc",
      Solver.process("texas-holdem 4c6c8hJcQd ThQc Kh8c"));
  }

  @Test
  public void test_texas_holdem_3556_4c7cJhQsTc_5h6c_5dAc_6h4h_2cJc() {
    assertEquals(
      "5h6c 5dAc 6h4h 2cJc",
      Solver.process("texas-holdem 4c7cJhQsTc 5h6c 5dAc 6h4h 2cJc"));
  }

  @Test
  public void test_texas_holdem_3557_3d3s9dJdQd_5h8s_6h2c_8dTs_As2d_8h2h_3c7h_5d6s_4c7c() {
    assertEquals(
      "4c7c=5h8s=6h2c=8h2h 3c7h As2d 5d6s 8dTs",
      Solver.process("texas-holdem 3d3s9dJdQd 5h8s 6h2c 8dTs As2d 8h2h 3c7h 5d6s 4c7c"));
  }

  @Test
  public void test_texas_holdem_3558_3c4c5s6cKs_4hAd_3h2s_7c5d_TcAc() {
    assertEquals(
      "4hAd 3h2s 7c5d TcAc",
      Solver.process("texas-holdem 3c4c5s6cKs 4hAd 3h2s 7c5d TcAc"));
  }

  @Test
  public void test_texas_holdem_3559_3d3h6s9cQd_KdKc_2d4c_6hJd_3c2c_8hTs() {
    assertEquals(
      "2d4c 8hTs 6hJd KdKc 3c2c",
      Solver.process("texas-holdem 3d3h6s9cQd KdKc 2d4c 6hJd 3c2c 8hTs"));
  }

  @Test
  public void test_texas_holdem_3560_2s3h7sAdQs_Jd2h_8d7c_Ac3d_Ts5c_4d6c_Tc9s_As4s_9c7h() {
    assertEquals(
      "4d6c Ts5c Tc9s Jd2h 8d7c 9c7h Ac3d As4s",
      Solver.process("texas-holdem 2s3h7sAdQs Jd2h 8d7c Ac3d Ts5c 4d6c Tc9s As4s 9c7h"));
  }

  @Test
  public void test_texas_holdem_3561_5d6d7sQdTh_Qh2s_3c5s_Td8d_4sJs_Jc9s_4dAh_8s4c_9c7d_Ac2d() {
    assertEquals(
      "4sJs Jc9s 4dAh=Ac2d 3c5s 9c7d Qh2s 8s4c Td8d",
      Solver.process("texas-holdem 5d6d7sQdTh Qh2s 3c5s Td8d 4sJs Jc9s 4dAh 8s4c 9c7d Ac2d"));
  }

  @Test
  public void test_texas_holdem_3562_2d4d8h8sAc_8c7s_Tc4h_5sKd_2sQd_2h9c_Js6d() {
    assertEquals(
      "Js6d 5sKd 2h9c=2sQd Tc4h 8c7s",
      Solver.process("texas-holdem 2d4d8h8sAc 8c7s Tc4h 5sKd 2sQd 2h9c Js6d"));
  }

  @Test
  public void test_texas_holdem_3563_4s7cAcKhQs_Kc5h_9hQc_6dTd_2d3h() {
    assertEquals(
      "2d3h 6dTd 9hQc Kc5h",
      Solver.process("texas-holdem 4s7cAcKhQs Kc5h 9hQc 6dTd 2d3h"));
  }

  @Test
  public void test_texas_holdem_3564_6sJsKdQcTd_8hQd_Jh3s_5cKc_5sJd_AdKh_QsTh_As8c() {
    assertEquals(
      "5sJd=Jh3s 8hQd 5cKc QsTh AdKh=As8c",
      Solver.process("texas-holdem 6sJsKdQcTd 8hQd Jh3s 5cKc 5sJd AdKh QsTh As8c"));
  }

  @Test
  public void test_texas_holdem_3565_2h4c7sAsKd_9s6h_8h3s_9hAh_9dJh_Jc3d_Kc8d_4d4s_KhQs() {
    assertEquals(
      "8h3s 9s6h Jc3d 9dJh Kc8d KhQs 9hAh 4d4s",
      Solver.process("texas-holdem 2h4c7sAsKd 9s6h 8h3s 9hAh 9dJh Jc3d Kc8d 4d4s KhQs"));
  }

  @Test
  public void test_texas_holdem_3566_6c8sKhTdTs_8cJd_Kd5h_8dJc_Qd9d_Ad4c_3d7c_QcTh() {
    assertEquals(
      "3d7c Qd9d Ad4c 8cJd=8dJc Kd5h QcTh",
      Solver.process("texas-holdem 6c8sKhTdTs 8cJd Kd5h 8dJc Qd9d Ad4c 3d7c QcTh"));
  }

  @Test
  public void test_texas_holdem_3567_6h8dAsKcTd_5hQs_Ts8h_2h9s_3hJc_3s3d_ThQd_8c2d_KhTc() {
    assertEquals(
      "2h9s 3hJc 5hQs 3s3d 8c2d ThQd Ts8h KhTc",
      Solver.process("texas-holdem 6h8dAsKcTd 5hQs Ts8h 2h9s 3hJc 3s3d ThQd 8c2d KhTc"));
  }

  @Test
  public void test_texas_holdem_3568_2h5c5dKcTh_4cJd_QhKd_KhTd_2s5s_5h7h() {
    assertEquals(
      "4cJd QhKd KhTd 5h7h 2s5s",
      Solver.process("texas-holdem 2h5c5dKcTh 4cJd QhKd KhTd 2s5s 5h7h"));
  }

  @Test
  public void test_texas_holdem_3569_2c2d8c8dKs_2h6s_3cJh_9sQh_7hTh_8hQc_2sTd_5sQd_9hQs() {
    assertEquals(
      "3cJh=5sQd=7hTh=9hQs=9sQh 2h6s=2sTd 8hQc",
      Solver.process("texas-holdem 2c2d8c8dKs 2h6s 3cJh 9sQh 7hTh 8hQc 2sTd 5sQd 9hQs"));
  }

  @Test
  public void test_texas_holdem_3570_3c4c8s9hQd_9c2d_6sJh() {
    assertEquals(
      "6sJh 9c2d",
      Solver.process("texas-holdem 3c4c8s9hQd 9c2d 6sJh"));
  }

  @Test
  public void test_texas_holdem_3571_5d6d7dKcKd_ThJh_JdKh_Td9h_4c9d_As2c_6c7h_3dQh() {
    assertEquals(
      "ThJh As2c 6c7h 3dQh 4c9d Td9h JdKh",
      Solver.process("texas-holdem 5d6d7dKcKd ThJh JdKh Td9h 4c9d As2c 6c7h 3dQh"));
  }

  @Test
  public void test_texas_holdem_3572_4s6c7hAdQs_8s8c_2c2d_Td5s_8dKs_9hJc_4h4c() {
    assertEquals(
      "Td5s 9hJc 8dKs 2c2d 8s8c 4h4c",
      Solver.process("texas-holdem 4s6c7hAdQs 8s8c 2c2d Td5s 8dKs 9hJc 4h4c"));
  }

  @Test
  public void test_texas_holdem_3573_2d3d4s6cTd_8sKc_ThQh_2sQd() {
    assertEquals(
      "8sKc 2sQd ThQh",
      Solver.process("texas-holdem 2d3d4s6cTd 8sKc ThQh 2sQd"));
  }

  @Test
  public void test_texas_holdem_3574_3cAhJhJsKc_3d4d_5h3s_4c9h_Qd5s_Qc6d_Jc7s() {
    assertEquals(
      "4c9h Qc6d=Qd5s 3d4d=5h3s Jc7s",
      Solver.process("texas-holdem 3cAhJhJsKc 3d4d 5h3s 4c9h Qd5s Qc6d Jc7s"));
  }

  @Test
  public void test_texas_holdem_3575_4s7hAcJdTh_7s5c_Kh4d_KcKd_Qs6c_8c9s_6h3d_Ad8d() {
    assertEquals(
      "6h3d Qs6c Kh4d 7s5c KcKd Ad8d 8c9s",
      Solver.process("texas-holdem 4s7hAcJdTh 7s5c Kh4d KcKd Qs6c 8c9s 6h3d Ad8d"));
  }

  @Test
  public void test_texas_holdem_3576_2h3c5d8s9d_QdJd_Kh2d_3hTc_Qh2c_9s5s_JsKs_7cKd_4hKc_TdAs() {
    assertEquals(
      "QdJd 4hKc 7cKd JsKs TdAs Qh2c Kh2d 3hTc 9s5s",
      Solver.process("texas-holdem 2h3c5d8s9d QdJd Kh2d 3hTc Qh2c 9s5s JsKs 7cKd 4hKc TdAs"));
  }

  @Test
  public void test_texas_holdem_3577_5h6d9c9hTs_AsKd_5cQc_8h8d_AhTd() {
    assertEquals(
      "AsKd 5cQc 8h8d AhTd",
      Solver.process("texas-holdem 5h6d9c9hTs AsKd 5cQc 8h8d AhTd"));
  }

  @Test
  public void test_texas_holdem_3578_2h4s8sJdTd_6d8d_JcKh_TsJh_3h9h_AsQs_9d2s() {
    assertEquals(
      "3h9h AsQs 9d2s 6d8d JcKh TsJh",
      Solver.process("texas-holdem 2h4s8sJdTd 6d8d JcKh TsJh 3h9h AsQs 9d2s"));
  }

  @Test
  public void test_texas_holdem_3579_3h3sQhQsTh_4h6d_Jd4c_6hJh_2d5s_6c7h() {
    assertEquals(
      "2d5s=4h6d=6c7h Jd4c 6hJh",
      Solver.process("texas-holdem 3h3sQhQsTh 4h6d Jd4c 6hJh 2d5s 6c7h"));
  }

  @Test
  public void test_texas_holdem_3580_4h5c5s6sJh_2cKc_9d5h_Td8c_As8s_Ks6c_Th3h_Ad8h_QsKd_9hJd() {
    assertEquals(
      "Th3h Td8c 2cKc QsKd Ad8h=As8s Ks6c 9hJd 9d5h",
      Solver.process("texas-holdem 4h5c5s6sJh 2cKc 9d5h Td8c As8s Ks6c Th3h Ad8h QsKd 9hJd"));
  }

  @Test
  public void test_texas_holdem_3581_4d5s8h8sJc_4h6s_TdAh_Ac7d_8cJh_Qc5d_Qd2h() {
    assertEquals(
      "Qd2h Ac7d TdAh 4h6s Qc5d 8cJh",
      Solver.process("texas-holdem 4d5s8h8sJc 4h6s TdAh Ac7d 8cJh Qc5d Qd2h"));
  }

  @Test
  public void test_texas_holdem_3582_3h8dJdKsQs_9cJc_3dAd_5c3s_8hQd_6c2s() {
    assertEquals(
      "6c2s 5c3s 3dAd 9cJc 8hQd",
      Solver.process("texas-holdem 3h8dJdKsQs 9cJc 3dAd 5c3s 8hQd 6c2s"));
  }

  @Test
  public void test_texas_holdem_3583_2d4d6h6sJh_TsKs_2c4h_AdKc_7d4c_9cQc_Ah6c_Ac9h_7cTd() {
    assertEquals(
      "7cTd 9cQc TsKs Ac9h AdKc 2c4h=7d4c Ah6c",
      Solver.process("texas-holdem 2d4d6h6sJh TsKs 2c4h AdKc 7d4c 9cQc Ah6c Ac9h 7cTd"));
  }

  @Test
  public void test_texas_holdem_3584_2c5s7s8hJd_4c8c_4sJc_2s9c() {
    assertEquals(
      "2s9c 4c8c 4sJc",
      Solver.process("texas-holdem 2c5s7s8hJd 4c8c 4sJc 2s9c"));
  }

  @Test
  public void test_texas_holdem_3585_3c6d7c9h9s_2s7h_6h3s_Ts5d_ThJs_3hQs_Qd8s_9c7s_6sKs_JcJh() {
    assertEquals(
      "Ts5d ThJs Qd8s 3hQs 6h3s 6sKs 2s7h JcJh 9c7s",
      Solver.process("texas-holdem 3c6d7c9h9s 2s7h 6h3s Ts5d ThJs 3hQs Qd8s 9c7s 6sKs JcJh"));
  }

  @Test
  public void test_texas_holdem_3586_7h8c8hAcKh_Qc3c_3sJh_Ah4d_2c7c_6s9d_7sKs_8sAs() {
    assertEquals(
      "6s9d 3sJh Qc3c 2c7c 7sKs Ah4d 8sAs",
      Solver.process("texas-holdem 7h8c8hAcKh Qc3c 3sJh Ah4d 2c7c 6s9d 7sKs 8sAs"));
  }

  @Test
  public void test_texas_holdem_3587_3d3h5cAhQh_AsKs_5s2s_8dQd_8s2h_9hTh_7s8h_JsJh_9sTd() {
    assertEquals(
      "7s8h=8s2h 9sTd 5s2s JsJh 8dQd AsKs 9hTh",
      Solver.process("texas-holdem 3d3h5cAhQh AsKs 5s2s 8dQd 8s2h 9hTh 7s8h JsJh 9sTd"));
  }

  @Test
  public void test_texas_holdem_3588_2c3h5h8d8h_5s9c_Tc3c_6c6h_QhTh() {
    assertEquals(
      "Tc3c 5s9c 6c6h QhTh",
      Solver.process("texas-holdem 2c3h5h8d8h 5s9c Tc3c 6c6h QhTh"));
  }

  @Test
  public void test_texas_holdem_3589_2c4s6h9h9s_TcTd_6s6d_7h9d_JhKh() {
    assertEquals(
      "JhKh TcTd 7h9d 6s6d",
      Solver.process("texas-holdem 2c4s6h9h9s TcTd 6s6d 7h9d JhKh"));
  }

  @Test
  public void test_texas_holdem_3590_6s8dAsJcJh_6h7h_4hQc_7d3h_4d4s_Tc2d_9h5c_Qs5s_9c7s() {
    assertEquals(
      "7d3h 9c7s=9h5c Tc2d 4hQc=Qs5s 4d4s 6h7h",
      Solver.process("texas-holdem 6s8dAsJcJh 6h7h 4hQc 7d3h 4d4s Tc2d 9h5c Qs5s 9c7s"));
  }

  @Test
  public void test_texas_holdem_3591_2dAcJcKdQc_2c2s_4c3c_4hAd_5sJh_8d7h_9cTc_4s9h_KhJs_5h3d() {
    assertEquals(
      "5h3d 8d7h 4s9h 5sJh 4hAd KhJs 2c2s 4c3c 9cTc",
      Solver.process("texas-holdem 2dAcJcKdQc 2c2s 4c3c 4hAd 5sJh 8d7h 9cTc 4s9h KhJs 5h3d"));
  }

  @Test
  public void test_texas_holdem_3592_3d9sJcJsKc_9cJd_2h5h_3cTc_5s5d_Ah2d() {
    assertEquals(
      "2h5h Ah2d 3cTc 5s5d 9cJd",
      Solver.process("texas-holdem 3d9sJcJsKc 9cJd 2h5h 3cTc 5s5d Ah2d"));
  }

  @Test
  public void test_texas_holdem_3593_4c7h7s8sJc_6cTd_9h2d_KsQc_Kc2c_8h3s_Ac5s() {
    assertEquals(
      "9h2d 6cTd Kc2c KsQc Ac5s 8h3s",
      Solver.process("texas-holdem 4c7h7s8sJc 6cTd 9h2d KsQc Kc2c 8h3s Ac5s"));
  }

  @Test
  public void test_texas_holdem_3594_5s7s8hJhTc_2s7d_7hKc_Qs3s_6hAh_2c4c_3dJs_2h6d() {
    assertEquals(
      "2c4c 2h6d Qs3s 6hAh 2s7d 7hKc 3dJs",
      Solver.process("texas-holdem 5s7s8hJhTc 2s7d 7hKc Qs3s 6hAh 2c4c 3dJs 2h6d"));
  }

  @Test
  public void test_texas_holdem_3595_3h4c4h6hTh_QcTd_6cKc_4s8h_AcJh() {
    assertEquals(
      "6cKc QcTd 4s8h AcJh",
      Solver.process("texas-holdem 3h4c4h6hTh QcTd 6cKc 4s8h AcJh"));
  }

  @Test
  public void test_texas_holdem_3596_3d5s7hAsKs_5dKh_TcJh_AdKc() {
    assertEquals(
      "TcJh 5dKh AdKc",
      Solver.process("texas-holdem 3d5s7hAsKs 5dKh TcJh AdKc"));
  }

  @Test
  public void test_texas_holdem_3597_2c6sKcQsTs_Td8c_Jc8h() {
    assertEquals(
      "Jc8h Td8c",
      Solver.process("texas-holdem 2c6sKcQsTs Td8c Jc8h"));
  }

  @Test
  public void test_texas_holdem_3598_2c2h4s6hQc_KhTh_4dTd_Js8h_7c3d_6dQh_As7h_9c4c() {
    assertEquals(
      "7c3d Js8h KhTh As7h 4dTd=9c4c 6dQh",
      Solver.process("texas-holdem 2c2h4s6hQc KhTh 4dTd Js8h 7c3d 6dQh As7h 9c4c"));
  }

  @Test
  public void test_texas_holdem_3599_3c4c5dKdTc_2h8s_Kh6s_Ah2c_7dAc_3dJs_7h2s_TsQh_6d5h_QcJd() {
    assertEquals(
      "7h2s 2h8s QcJd 7dAc 3dJs 6d5h TsQh Kh6s Ah2c",
      Solver.process("texas-holdem 3c4c5dKdTc 2h8s Kh6s Ah2c 7dAc 3dJs 7h2s TsQh 6d5h QcJd"));
  }

  @Test
  public void test_texas_holdem_3600_4s5h6h7d8h_5d7h_4hKh_3dJc_Td8s_Ks6s_QsJd_5cKd_3h2s() {
    assertEquals(
      "3dJc=3h2s=5cKd=5d7h=Ks6s=QsJd=Td8s 4hKh",
      Solver.process("texas-holdem 4s5h6h7d8h 5d7h 4hKh 3dJc Td8s Ks6s QsJd 5cKd 3h2s"));
  }

  @Test
  public void test_texas_holdem_3601_2c3s8c9sKd_6h4d_Tc6s() {
    assertEquals(
      "6h4d Tc6s",
      Solver.process("texas-holdem 2c3s8c9sKd 6h4d Tc6s"));
  }

  @Test
  public void test_texas_holdem_3602_3d4s5dQcTd_6d8d_7hKd_6s7d() {
    assertEquals(
      "7hKd 6s7d 6d8d",
      Solver.process("texas-holdem 3d4s5dQcTd 6d8d 7hKd 6s7d"));
  }

  @Test
  public void test_texas_holdem_3603_2h4d5d5h7c_7sTc_3dQc_4s7d_KhJc_Kd9d_2s5c_3hAs_9h8c() {
    assertEquals(
      "9h8c 3dQc Kd9d KhJc 4s7d 7sTc 3hAs 2s5c",
      Solver.process("texas-holdem 2h4d5d5h7c 7sTc 3dQc 4s7d KhJc Kd9d 2s5c 3hAs 9h8c"));
  }

  @Test
  public void test_texas_holdem_3604_3c3d3s5sAd_TsKh_4cAh() {
    assertEquals(
      "TsKh 4cAh",
      Solver.process("texas-holdem 3c3d3s5sAd TsKh 4cAh"));
  }

  @Test
  public void test_texas_holdem_3605_2h3c3d4d9h_AdJd_9s5h_Ac2s() {
    assertEquals(
      "AdJd Ac2s 9s5h",
      Solver.process("texas-holdem 2h3c3d4d9h AdJd 9s5h Ac2s"));
  }

  @Test
  public void test_texas_holdem_3606_3s4d7cKsTc_9sJc_3hAs_8s6h_5sQc_7hKh_2s7s_9cTh() {
    assertEquals(
      "8s6h 9sJc 5sQc 3hAs 2s7s 9cTh 7hKh",
      Solver.process("texas-holdem 3s4d7cKsTc 9sJc 3hAs 8s6h 5sQc 7hKh 2s7s 9cTh"));
  }

  @Test
  public void test_texas_holdem_3607_2c2sJhKcKs_5hTd_Tc6s() {
    assertEquals(
      "5hTd=Tc6s",
      Solver.process("texas-holdem 2c2sJhKcKs 5hTd Tc6s"));
  }

  @Test
  public void test_texas_holdem_3608_3s9c9hAcTc_5sJc_ThJs_Qd5h_8d2d_8hJh() {
    assertEquals(
      "8d2d 5sJc=8hJh Qd5h ThJs",
      Solver.process("texas-holdem 3s9c9hAcTc 5sJc ThJs Qd5h 8d2d 8hJh"));
  }

  @Test
  public void test_texas_holdem_3609_3s4h4s7s9h_6sJs_JcQh_7dQs_Td4d_Th9d() {
    assertEquals(
      "JcQh 7dQs Th9d Td4d 6sJs",
      Solver.process("texas-holdem 3s4h4s7s9h 6sJs JcQh 7dQs Td4d Th9d"));
  }

  @Test
  public void test_texas_holdem_3610_2c4d5c6cAh_3h4s_KhJs_3s6h_4cQs() {
    assertEquals(
      "KhJs 4cQs 3h4s=3s6h",
      Solver.process("texas-holdem 2c4d5c6cAh 3h4s KhJs 3s6h 4cQs"));
  }

  @Test
  public void test_texas_holdem_3611_6c6s9hJsTs_2s6h_7s8s_TcAs() {
    assertEquals(
      "TcAs 2s6h 7s8s",
      Solver.process("texas-holdem 6c6s9hJsTs 2s6h 7s8s TcAs"));
  }

  @Test
  public void test_texas_holdem_3612_2d5s8dKhQc_6dTh_4h5h_JhJd_7hAh_Qd2s_9cKs_9s3d_Tc6h_3h9h() {
    assertEquals(
      "3h9h=9s3d 6dTh=Tc6h 7hAh 4h5h JhJd 9cKs Qd2s",
      Solver.process("texas-holdem 2d5s8dKhQc 6dTh 4h5h JhJd 7hAh Qd2s 9cKs 9s3d Tc6h 3h9h"));
  }

  @Test
  public void test_texas_holdem_3613_7h9sAhJsQc_JcKc_8d2s_2h5s_5h6d_9dQs() {
    assertEquals(
      "2h5s=5h6d 8d2s JcKc 9dQs",
      Solver.process("texas-holdem 7h9sAhJsQc JcKc 8d2s 2h5s 5h6d 9dQs"));
  }

  @Test
  public void test_texas_holdem_3614_2h5h7cAdJh_4hKd_4sQd_Td4d_Th8c_Jd9s_5sTc() {
    assertEquals(
      "Td4d Th8c 4sQd 4hKd 5sTc Jd9s",
      Solver.process("texas-holdem 2h5h7cAdJh 4hKd 4sQd Td4d Th8c Jd9s 5sTc"));
  }

  @Test
  public void test_texas_holdem_3615_6s7d8dJdTh_QsQc_QdAs_4s5d_3d6d_9s4h_7c9c_Jh3c_6hJc() {
    assertEquals(
      "QdAs Jh3c QsQc 6hJc 4s5d 7c9c=9s4h 3d6d",
      Solver.process("texas-holdem 6s7d8dJdTh QsQc QdAs 4s5d 3d6d 9s4h 7c9c Jh3c 6hJc"));
  }

  @Test
  public void test_texas_holdem_3616_4h5hJcKcQd_JhJd_7d7h() {
    assertEquals(
      "7d7h JhJd",
      Solver.process("texas-holdem 4h5hJcKcQd JhJd 7d7h"));
  }

  @Test
  public void test_texas_holdem_3617_5cAcJhKcQh_7d8c_9dJs_9s7h_AdAs_Th7s_TcTs() {
    assertEquals(
      "7d8c 9s7h 9dJs AdAs TcTs=Th7s",
      Solver.process("texas-holdem 5cAcJhKcQh 7d8c 9dJs 9s7h AdAs Th7s TcTs"));
  }

  @Test
  public void test_texas_holdem_3618_4c6c6d9cKd_8hTd_Ts4d_9s6h_Qs9h_2dJd_Ah7s_7dJh_QcQd_5hAc() {
    assertEquals(
      "8hTd 2dJd=7dJh 5hAc=Ah7s Ts4d Qs9h QcQd 9s6h",
      Solver.process("texas-holdem 4c6c6d9cKd 8hTd Ts4d 9s6h Qs9h 2dJd Ah7s 7dJh QcQd 5hAc"));
  }

  @Test
  public void test_texas_holdem_3619_4d5s9dAcQs_Jc9h_3c8h() {
    assertEquals(
      "3c8h Jc9h",
      Solver.process("texas-holdem 4d5s9dAcQs Jc9h 3c8h"));
  }

  @Test
  public void test_texas_holdem_3620_7c9cAdJsTs_8hQs_Ks5d_Qd5c_9h3s_7s6d_3cAc_3hQc() {
    assertEquals(
      "3hQc=Qd5c Ks5d 7s6d 9h3s 3cAc 8hQs",
      Solver.process("texas-holdem 7c9cAdJsTs 8hQs Ks5d Qd5c 9h3s 7s6d 3cAc 3hQc"));
  }

  @Test
  public void test_texas_holdem_3621_7c7h7s9sJd_As4h_Tc2d_Ac8h_Jh4d_Kd5d_8d5h() {
    assertEquals(
      "8d5h Tc2d Kd5d Ac8h=As4h Jh4d",
      Solver.process("texas-holdem 7c7h7s9sJd As4h Tc2d Ac8h Jh4d Kd5d 8d5h"));
  }

  @Test
  public void test_texas_holdem_3622_3s4s6c7cQs_Qd2c_Qh3d_6h2s_As4c_Ah9h_7d6s_2h8s() {
    assertEquals(
      "2h8s Ah9h As4c 6h2s Qd2c 7d6s Qh3d",
      Solver.process("texas-holdem 3s4s6c7cQs Qd2c Qh3d 6h2s As4c Ah9h 7d6s 2h8s"));
  }

  @Test
  public void test_texas_holdem_3623_4c4s7c7d7s_8c3h_2hJh_9h6c_QsJc_2s3d_Ad4h_2c8d_Kd2d_Th6d() {
    assertEquals(
      "2c8d=2hJh=2s3d=8c3h=9h6c=Ad4h=Kd2d=QsJc=Th6d",
      Solver.process("texas-holdem 4c4s7c7d7s 8c3h 2hJh 9h6c QsJc 2s3d Ad4h 2c8d Kd2d Th6d"));
  }

  @Test
  public void test_texas_holdem_3624_5d8h9hKsQc_Ah9s_6h6c_4h2h_7dQs() {
    assertEquals(
      "4h2h 6h6c Ah9s 7dQs",
      Solver.process("texas-holdem 5d8h9hKsQc Ah9s 6h6c 4h2h 7dQs"));
  }

  @Test
  public void test_texas_holdem_3625_4c5d7cKhKs_2d9s_TdJs_JcKd() {
    assertEquals(
      "2d9s TdJs JcKd",
      Solver.process("texas-holdem 4c5d7cKhKs 2d9s TdJs JcKd"));
  }

  @Test
  public void test_texas_holdem_3626_2c3h9sAsQc_2sJd_Kd7c_4c5s_5dAd_Tc9h_TdAc_Kc7d_5h6h_Qd2d() {
    assertEquals(
      "5h6h Kc7d=Kd7c 2sJd Tc9h 5dAd TdAc Qd2d 4c5s",
      Solver.process("texas-holdem 2c3h9sAsQc 2sJd Kd7c 4c5s 5dAd Tc9h TdAc Kc7d 5h6h Qd2d"));
  }

  @Test
  public void test_texas_holdem_3627_2d3c3s9dJs_5s5c_KdQc_Th8s() {
    assertEquals(
      "Th8s KdQc 5s5c",
      Solver.process("texas-holdem 2d3c3s9dJs 5s5c KdQc Th8s"));
  }

  @Test
  public void test_texas_holdem_3628_4s5d6c9dQh_8s2s_9sJh_7d4c_6dAc_Jd2h_6hTh() {
    assertEquals(
      "8s2s Jd2h 7d4c 6hTh 6dAc 9sJh",
      Solver.process("texas-holdem 4s5d6c9dQh 8s2s 9sJh 7d4c 6dAc Jd2h 6hTh"));
  }

  @Test
  public void test_texas_holdem_3629_7s8cAdJdKs_3c9c_ThQs_Kh3d_2sTd_As8d() {
    assertEquals(
      "3c9c 2sTd Kh3d As8d ThQs",
      Solver.process("texas-holdem 7s8cAdJdKs 3c9c ThQs Kh3d 2sTd As8d"));
  }

  @Test
  public void test_texas_holdem_3630_6c8s9cAcKc_4hTc_Ad5s_KhKd_9s2s_7h2d_7dTh_9hAh_7c4c() {
    assertEquals(
      "7h2d 9s2s Ad5s 9hAh KhKd 7dTh 7c4c 4hTc",
      Solver.process("texas-holdem 6c8s9cAcKc 4hTc Ad5s KhKd 9s2s 7h2d 7dTh 9hAh 7c4c"));
  }

  @Test
  public void test_texas_holdem_3631_5s7h8hAdJd_Tc2d_3d3s_9h2c_JhAc_QdAs_5cTd_Js8c() {
    assertEquals(
      "9h2c Tc2d 3d3s 5cTd QdAs Js8c JhAc",
      Solver.process("texas-holdem 5s7h8hAdJd Tc2d 3d3s 9h2c JhAc QdAs 5cTd Js8c"));
  }

  @Test
  public void test_texas_holdem_3632_6d6s8c9hAc_6h6c_ThQh_Jc2h_4sJs_9cKh() {
    assertEquals(
      "4sJs=Jc2h ThQh 9cKh 6h6c",
      Solver.process("texas-holdem 6d6s8c9hAc 6h6c ThQh Jc2h 4sJs 9cKh"));
  }

  @Test
  public void test_texas_holdem_3633_4c5s9c9sTd_5c7s_KsKh_Ts6h_Jc4h_Jh8c() {
    assertEquals(
      "Jh8c Jc4h 5c7s Ts6h KsKh",
      Solver.process("texas-holdem 4c5s9c9sTd 5c7s KsKh Ts6h Jc4h Jh8c"));
  }

  @Test
  public void test_texas_holdem_3634_5c6c6d8h9h_Jh7h_Ts8s_3cKs_9cJd_3h7s_2c3d_4c4h() {
    assertEquals(
      "2c3d 3cKs 4c4h Ts8s 9cJd 3h7s=Jh7h",
      Solver.process("texas-holdem 5c6c6d8h9h Jh7h Ts8s 3cKs 9cJd 3h7s 2c3d 4c4h"));
  }

  @Test
  public void test_texas_holdem_3635_2h3c5c5dJc_Ah2c_3dJs_Jd7h_QsJh_2d6c() {
    assertEquals(
      "2d6c Ah2c 3dJs Jd7h QsJh",
      Solver.process("texas-holdem 2h3c5c5dJc Ah2c 3dJs Jd7h QsJh 2d6c"));
  }

  @Test
  public void test_texas_holdem_3636_4s6d6h7cKc_5dKh_Ts7s_7dKd_9sAh_Jd2c_Ks2h_8s5s_8h4h() {
    assertEquals(
      "Jd2c 9sAh 8h4h Ts7s 5dKh=Ks2h 7dKd 8s5s",
      Solver.process("texas-holdem 4s6d6h7cKc 5dKh Ts7s 7dKd 9sAh Jd2c Ks2h 8s5s 8h4h"));
  }

  @Test
  public void test_texas_holdem_3637_7c7h9dJhKh_3s8d_5c4h_8c2c_Jc5d() {
    assertEquals(
      "3s8d=5c4h=8c2c Jc5d",
      Solver.process("texas-holdem 7c7h9dJhKh 3s8d 5c4h 8c2c Jc5d"));
  }

  @Test
  public void test_texas_holdem_3638_7d8hJhKhQd_As7s_9h2c_5h5s_4sJc() {
    assertEquals(
      "9h2c 5h5s As7s 4sJc",
      Solver.process("texas-holdem 7d8hJhKhQd As7s 9h2c 5h5s 4sJc"));
  }

  @Test
  public void test_texas_holdem_3639_3h7s8dJcQd_8c6h_JdAc_5d9s_4sKh() {
    assertEquals(
      "5d9s 4sKh 8c6h JdAc",
      Solver.process("texas-holdem 3h7s8dJcQd 8c6h JdAc 5d9s 4sKh"));
  }

  @Test
  public void test_texas_holdem_3640_2s4cAhKhTh_Jh8s_7d5h_7c2c_4h3h_6dTc_3s9c() {
    assertEquals(
      "7d5h 3s9c Jh8s 7c2c 6dTc 4h3h",
      Solver.process("texas-holdem 2s4cAhKhTh Jh8s 7d5h 7c2c 4h3h 6dTc 3s9c"));
  }

  @Test
  public void test_texas_holdem_3641_4cAcJsKhKs_5h7h_4s7d_Qc3s() {
    assertEquals(
      "5h7h Qc3s 4s7d",
      Solver.process("texas-holdem 4cAcJsKhKs 5h7h 4s7d Qc3s"));
  }

  @Test
  public void test_texas_holdem_3642_2h4d5hKsQh_4hQd_8dKh_6dTc_Jc7h_KdTh_8sQs_4cKc() {
    assertEquals(
      "6dTc Jc7h 8sQs 8dKh KdTh 4hQd 4cKc",
      Solver.process("texas-holdem 2h4d5hKsQh 4hQd 8dKh 6dTc Jc7h KdTh 8sQs 4cKc"));
  }

  @Test
  public void test_texas_holdem_3643_3c3d4c9sTh_8hQd_Js6c_Jh8c_9d5d_JdKs() {
    assertEquals(
      "Jh8c=Js6c 8hQd JdKs 9d5d",
      Solver.process("texas-holdem 3c3d4c9sTh 8hQd Js6c Jh8c 9d5d JdKs"));
  }

  @Test
  public void test_texas_holdem_3644_9sQcQdQhTc_ThKc_7d9h_3cAd_2c2d_8d8h_5s2s_3h9d() {
    assertEquals(
      "5s2s 3cAd 2c2d 8d8h 3h9d=7d9h ThKc",
      Solver.process("texas-holdem 9sQcQdQhTc ThKc 7d9h 3cAd 2c2d 8d8h 5s2s 3h9d"));
  }

  @Test
  public void test_texas_holdem_3645_2h6h7sQcTd_4sTc_Kc9d() {
    assertEquals(
      "Kc9d 4sTc",
      Solver.process("texas-holdem 2h6h7sQcTd 4sTc Kc9d"));
  }

  @Test
  public void test_texas_holdem_3646_5h6s8dJhKd_Tc2c_7hQs() {
    assertEquals(
      "Tc2c 7hQs",
      Solver.process("texas-holdem 5h6s8dJhKd Tc2c 7hQs"));
  }

  @Test
  public void test_texas_holdem_3647_5c6c9hAcJc_Th8s_7d6h_4sAh_3c9c_QsKc_AsQd_2hQc() {
    assertEquals(
      "Th8s 7d6h 4sAh AsQd 3c9c 2hQc QsKc",
      Solver.process("texas-holdem 5c6c9hAcJc Th8s 7d6h 4sAh 3c9c QsKc AsQd 2hQc"));
  }

  @Test
  public void test_texas_holdem_3648_2h6d6s7dQd_9d7s_KsAs_2c3c_Ad2s_7h8s() {
    assertEquals(
      "KsAs 2c3c Ad2s 7h8s=9d7s",
      Solver.process("texas-holdem 2h6d6s7dQd 9d7s KsAs 2c3c Ad2s 7h8s"));
  }

  @Test
  public void test_texas_holdem_3649_5s6c9cAhJc_8h7c_Kc9d_Th2h_5cTs_6d9h() {
    assertEquals(
      "Th2h 5cTs Kc9d 6d9h 8h7c",
      Solver.process("texas-holdem 5s6c9cAhJc 8h7c Kc9d Th2h 5cTs 6d9h"));
  }

  @Test
  public void test_texas_holdem_3650_6c6h8d9cAh_Qh5c_5d8c_7hKc() {
    assertEquals(
      "Qh5c 7hKc 5d8c",
      Solver.process("texas-holdem 6c6h8d9cAh Qh5c 5d8c 7hKc"));
  }

  @Test
  public void test_texas_holdem_3651_6dAdKsTdTs_7d5d_7hAc_QcJh_8c5s_8d8s() {
    assertEquals(
      "8c5s 8d8s 7hAc QcJh 7d5d",
      Solver.process("texas-holdem 6dAdKsTdTs 7d5d 7hAc QcJh 8c5s 8d8s"));
  }

  @Test
  public void test_texas_holdem_3652_3s4c5c8cJs_2cQh_QsJc() {
    assertEquals(
      "2cQh QsJc",
      Solver.process("texas-holdem 3s4c5c8cJs 2cQh QsJc"));
  }

  @Test
  public void test_texas_holdem_3653_3d6sAcAhQd_4c2h_7dQs_Ts6d() {
    assertEquals(
      "4c2h Ts6d 7dQs",
      Solver.process("texas-holdem 3d6sAcAhQd 4c2h 7dQs Ts6d"));
  }

  @Test
  public void test_texas_holdem_3654_3h6h6s9sKh_3s8c_8s3d_Qs9h_4hJd_Kc7d_2h9d_Ah5c() {
    assertEquals(
      "4hJd Ah5c 3s8c=8s3d 2h9d=Qs9h Kc7d",
      Solver.process("texas-holdem 3h6h6s9sKh 3s8c 8s3d Qs9h 4hJd Kc7d 2h9d Ah5c"));
  }

  @Test
  public void test_texas_holdem_3655_2c4c9hQdTs_4sAs_7c3d_KdKc_Qs3h_7s4h_2h2s() {
    assertEquals(
      "7c3d 7s4h 4sAs Qs3h KdKc 2h2s",
      Solver.process("texas-holdem 2c4c9hQdTs 4sAs 7c3d KdKc Qs3h 7s4h 2h2s"));
  }

  @Test
  public void test_texas_holdem_3656_3d4h5c6dAh_AdQh_KsKd_Tc7d_4c7s_QdAc_5d8s_Kh5s_9d3s() {
    assertEquals(
      "9d3s 5d8s Kh5s KsKd AdQh=QdAc 4c7s=Tc7d",
      Solver.process("texas-holdem 3d4h5c6dAh AdQh KsKd Tc7d 4c7s QdAc 5d8s Kh5s 9d3s"));
  }

  @Test
  public void test_texas_holdem_3657_AcAdJcTdTh_6d6h_8h9c_7cKc_7d9s_Qs2h_As5c() {
    assertEquals(
      "6d6h=7d9s=8h9c Qs2h 7cKc As5c",
      Solver.process("texas-holdem AcAdJcTdTh 6d6h 8h9c 7cKc 7d9s Qs2h As5c"));
  }

  @Test
  public void test_texas_holdem_3658_2h3d7sJhKs_6s3s_5sQc() {
    assertEquals(
      "5sQc 6s3s",
      Solver.process("texas-holdem 2h3d7sJhKs 6s3s 5sQc"));
  }

  @Test
  public void test_texas_holdem_3659_2d8s9sAdTd_3d5s_9hJc_3s4d_KcAc() {
    assertEquals(
      "3s4d 3d5s 9hJc KcAc",
      Solver.process("texas-holdem 2d8s9sAdTd 3d5s 9hJc 3s4d KcAc"));
  }

  @Test
  public void test_texas_holdem_3660_4c5s7s8cQh_8hAh_6c8s_7c3s_5h2d_7h2c_4sTs() {
    assertEquals(
      "4sTs 5h2d 7c3s=7h2c 8hAh 6c8s",
      Solver.process("texas-holdem 4c5s7s8cQh 8hAh 6c8s 7c3s 5h2d 7h2c 4sTs"));
  }

  @Test
  public void test_texas_holdem_3661_4c5c6s7c8d_8s6d_2s8c_2hAs_9hKh_2d3d_Qs9d_4hQh() {
    assertEquals(
      "2d3d=2hAs=2s8c=4hQh=8s6d 9hKh=Qs9d",
      Solver.process("texas-holdem 4c5c6s7c8d 8s6d 2s8c 2hAs 9hKh 2d3d Qs9d 4hQh"));
  }

  @Test
  public void test_texas_holdem_3662_3s5c6s7dAs_5d2s_2d3c_6h2c_8hTs_Qd5s_8c9s_4dKs() {
    assertEquals(
      "8hTs 2d3c 5d2s Qd5s 6h2c 4dKs 8c9s",
      Solver.process("texas-holdem 3s5c6s7dAs 5d2s 2d3c 6h2c 8hTs Qd5s 8c9s 4dKs"));
  }

  @Test
  public void test_texas_holdem_3663_4c4d8sKsQs_7sQd_6d9d_2cAs_8dQh_3hJd() {
    assertEquals(
      "6d9d 3hJd 2cAs 7sQd 8dQh",
      Solver.process("texas-holdem 4c4d8sKsQs 7sQd 6d9d 2cAs 8dQh 3hJd"));
  }

  @Test
  public void test_texas_holdem_3664_5s6c6d9cJc_2c9s_KcAs_4c9h_4s3s_3hTs() {
    assertEquals(
      "4s3s 3hTs KcAs 2c9s=4c9h",
      Solver.process("texas-holdem 5s6c6d9cJc 2c9s KcAs 4c9h 4s3s 3hTs"));
  }

  @Test
  public void test_texas_holdem_3665_5h9c9dJhQs_2h4d_7s5s_3hAh() {
    assertEquals(
      "2h4d 3hAh 7s5s",
      Solver.process("texas-holdem 5h9c9dJhQs 2h4d 7s5s 3hAh"));
  }

  @Test
  public void test_texas_holdem_3666_2d5dAsJcJd_Kc2s_2c4s_Kh8s_Qs4d_6hTs_5h8c_KsTc_7d5s() {
    assertEquals(
      "6hTs Qs4d Kh8s KsTc 2c4s=Kc2s 5h8c=7d5s",
      Solver.process("texas-holdem 2d5dAsJcJd Kc2s 2c4s Kh8s Qs4d 6hTs 5h8c KsTc 7d5s"));
  }

  @Test
  public void test_texas_holdem_3667_3c6c9sAhTd_5s7c_6s5d_2sTc_ThJc_Kc2c_2h9h_6h7s_Qc7d() {
    assertEquals(
      "5s7c Qc7d Kc2c 6h7s=6s5d 2h9h 2sTc ThJc",
      Solver.process("texas-holdem 3c6c9sAhTd 5s7c 6s5d 2sTc ThJc Kc2c 2h9h 6h7s Qc7d"));
  }

  @Test
  public void test_texas_holdem_3668_4h7h8dJcKh_Qs3c_Kc3h_4d6d_8c3d_TsKs_TdQh_8hAs_5c9s() {
    assertEquals(
      "5c9s Qs3c TdQh 4d6d 8c3d 8hAs Kc3h TsKs",
      Solver.process("texas-holdem 4h7h8dJcKh Qs3c Kc3h 4d6d 8c3d TsKs TdQh 8hAs 5c9s"));
  }

  @Test
  public void test_texas_holdem_3669_3d4s7c7d9h_Ac6c_2cKc_Ah5d_QsTs() {
    assertEquals(
      "QsTs 2cKc Ah5d Ac6c",
      Solver.process("texas-holdem 3d4s7c7d9h Ac6c 2cKc Ah5d QsTs"));
  }

  @Test
  public void test_texas_holdem_3670_8h9hJcQcQs_9s7c_Ah2c_Ks3d_Jh4d_9c8s_Kc7d_5sJd_5h4s_6d7h() {
    assertEquals(
      "5h4s=6d7h Kc7d=Ks3d Ah2c 9c8s=9s7c 5sJd=Jh4d",
      Solver.process("texas-holdem 8h9hJcQcQs 9s7c Ah2c Ks3d Jh4d 9c8s Kc7d 5sJd 5h4s 6d7h"));
  }

  @Test
  public void test_texas_holdem_3671_3c6d7d9dTh_Qc3h_7h9s_6c6s_4c8h() {
    assertEquals(
      "Qc3h 7h9s 6c6s 4c8h",
      Solver.process("texas-holdem 3c6d7d9dTh Qc3h 7h9s 6c6s 4c8h"));
  }

  @Test
  public void test_texas_holdem_3672_4c6h7cAcKs_4h9s_4sKd_TcQs_Js2d_2h9h_Td6d_Kh6s() {
    assertEquals(
      "2h9h Js2d TcQs 4h9s Td6d 4sKd Kh6s",
      Solver.process("texas-holdem 4c6h7cAcKs 4h9s 4sKd TcQs Js2d 2h9h Td6d Kh6s"));
  }

  @Test
  public void test_texas_holdem_3673_2h5s8sKsQs_2d3d_9dJd_Jc2c_7h6d_7c8h_9c7s_5h4s() {
    assertEquals(
      "7h6d 9dJd 2d3d Jc2c 7c8h 5h4s 9c7s",
      Solver.process("texas-holdem 2h5s8sKsQs 2d3d 9dJd Jc2c 7h6d 7c8h 9c7s 5h4s"));
  }

  @Test
  public void test_texas_holdem_3674_2s5h6d7sAc_4dKh_6hTs_KdJd_5c9d_9h8c_Qc6s_Th7c() {
    assertEquals(
      "4dKh KdJd 5c9d 6hTs Qc6s Th7c 9h8c",
      Solver.process("texas-holdem 2s5h6d7sAc 4dKh 6hTs KdJd 5c9d 9h8c Qc6s Th7c"));
  }

  @Test
  public void test_texas_holdem_3675_3c3d3h4hKs_6cAc_6dJd_QdAh_9sQc_9cTc() {
    assertEquals(
      "9cTc 6dJd 9sQc 6cAc=QdAh",
      Solver.process("texas-holdem 3c3d3h4hKs 6cAc 6dJd QdAh 9sQc 9cTc"));
  }

  @Test
  public void test_texas_holdem_3676_4c7h8s9sJs_2s9h_8hQd_2c4h_8d6d() {
    assertEquals(
      "2c4h 8d6d 8hQd 2s9h",
      Solver.process("texas-holdem 4c7h8s9sJs 2s9h 8hQd 2c4h 8d6d"));
  }

  @Test
  public void test_texas_holdem_3677_4d5hJdKcKd_Th7h_Ks9d_Ac6h_2s3d_6s7c_Ad9h_Ah6c_5c9s_Kh3h() {
    assertEquals(
      "2s3d 6s7c Th7h Ac6h=Ah6c Ad9h 5c9s Kh3h Ks9d",
      Solver.process("texas-holdem 4d5hJdKcKd Th7h Ks9d Ac6h 2s3d 6s7c Ad9h Ah6c 5c9s Kh3h"));
  }

  @Test
  public void test_texas_holdem_3678_4d6h8sQcTh_6d9d_4c9c_6s2s_2dJh_Js4s_3hQs() {
    assertEquals(
      "2dJh 4c9c Js4s 6s2s 6d9d 3hQs",
      Solver.process("texas-holdem 4d6h8sQcTh 6d9d 4c9c 6s2s 2dJh Js4s 3hQs"));
  }

  @Test
  public void test_texas_holdem_3679_4c4d5d9sQd_Qs4s_KcKd() {
    assertEquals(
      "KcKd Qs4s",
      Solver.process("texas-holdem 4c4d5d9sQd Qs4s KcKd"));
  }

  @Test
  public void test_texas_holdem_3680_3h3s4h6cKh_AhQh_4d7c_3d7h_8dTs_3cJc_JhTc_QdAd_8sKs() {
    assertEquals(
      "8dTs JhTc QdAd 4d7c 8sKs 3d7h 3cJc AhQh",
      Solver.process("texas-holdem 3h3s4h6cKh AhQh 4d7c 3d7h 8dTs 3cJc JhTc QdAd 8sKs"));
  }

  @Test
  public void test_texas_holdem_3681_8c9dAcKcTs_QdJs_5dQs_3cKd_3s6h_7c4s_Jd6s_4h5h_As9h_5cTc() {
    assertEquals(
      "3s6h=4h5h=7c4s Jd6s 5dQs 3cKd As9h QdJs 5cTc",
      Solver.process("texas-holdem 8c9dAcKcTs QdJs 5dQs 3cKd 3s6h 7c4s Jd6s 4h5h As9h 5cTc"));
  }

  @Test
  public void test_texas_holdem_3682_3c3s7dKsQc_Kc9s_Tc6d_Jd9c_4h6s_Jh7c_5cJc() {
    assertEquals(
      "4h6s Tc6d 5cJc=Jd9c Jh7c Kc9s",
      Solver.process("texas-holdem 3c3s7dKsQc Kc9s Tc6d Jd9c 4h6s Jh7c 5cJc"));
  }

  @Test
  public void test_texas_holdem_3683_7d7h9hKhTd_4c3s_AhAs_8c6h_6c7c() {
    assertEquals(
      "4c3s AhAs 6c7c 8c6h",
      Solver.process("texas-holdem 7d7h9hKhTd 4c3s AhAs 8c6h 6c7c"));
  }

  @Test
  public void test_texas_holdem_3684_3c7s8hKcKs_6d9h_KdJs_4sAd_8dJc_Jd2d_4cAh_Qh4h() {
    assertEquals(
      "6d9h Jd2d Qh4h 4cAh=4sAd 8dJc KdJs",
      Solver.process("texas-holdem 3c7s8hKcKs 6d9h KdJs 4sAd 8dJc Jd2d 4cAh Qh4h"));
  }

  @Test
  public void test_texas_holdem_3685_2c4c4h6dAs_Th3h_TdAc_9cQs_2hQd_Jc8d() {
    assertEquals(
      "Th3h Jc8d 9cQs 2hQd TdAc",
      Solver.process("texas-holdem 2c4c4h6dAs Th3h TdAc 9cQs 2hQd Jc8d"));
  }

  @Test
  public void test_texas_holdem_3686_2d3sJdQhTs_8d6c_8s5h_5dAd_4cJs() {
    assertEquals(
      "8s5h 8d6c 5dAd 4cJs",
      Solver.process("texas-holdem 2d3sJdQhTs 8d6c 8s5h 5dAd 4cJs"));
  }

  @Test
  public void test_texas_holdem_3687_3h6h6sAdQc_7d4d_AcKs_9hQs_JsJd_9s9c() {
    assertEquals(
      "7d4d 9s9c JsJd 9hQs AcKs",
      Solver.process("texas-holdem 3h6h6sAdQc 7d4d AcKs 9hQs JsJd 9s9c"));
  }

  @Test
  public void test_texas_holdem_3688_2s3s5s6cKc_As6s_7s4c_Js2h_KsJd_Ah9s_7h3d_6d8h_5c7d() {
    assertEquals(
      "Ah9s Js2h 7h3d 5c7d 6d8h KsJd 7s4c As6s",
      Solver.process("texas-holdem 2s3s5s6cKc As6s 7s4c Js2h KsJd Ah9s 7h3d 6d8h 5c7d"));
  }

  @Test
  public void test_texas_holdem_3689_3d5s8hAcJc_7c5h_3s9h_AdJh_2h7h_Jd8c_QhAh_4h4c() {
    assertEquals(
      "2h7h 3s9h 4h4c 7c5h QhAh Jd8c AdJh",
      Solver.process("texas-holdem 3d5s8hAcJc 7c5h 3s9h AdJh 2h7h Jd8c QhAh 4h4c"));
  }

  @Test
  public void test_texas_holdem_3690_9h9sAhJcKc_Qd3c_7s8d_TcAs_2h8s_8c4c_5c6s_3d7h_Ad5h_2sKd() {
    assertEquals(
      "2h8s=3d7h=5c6s=7s8d=8c4c Qd3c 2sKd Ad5h=TcAs",
      Solver.process("texas-holdem 9h9sAhJcKc Qd3c 7s8d TcAs 2h8s 8c4c 5c6s 3d7h Ad5h 2sKd"));
  }

  @Test
  public void test_texas_holdem_3691_4c5h7h8cTs_QdAd_QcKd_6c8h_KcKs_4h2h_Th3c() {
    assertEquals(
      "QcKd QdAd 4h2h Th3c KcKs 6c8h",
      Solver.process("texas-holdem 4c5h7h8cTs QdAd QcKd 6c8h KcKs 4h2h Th3c"));
  }

  @Test
  public void test_texas_holdem_3692_6h9cKdQdTh_Ad6d_Tc7d_9h3c_JdAh_4cTs_5hKs_Js4h_6c4s() {
    assertEquals(
      "6c4s Ad6d 9h3c 4cTs=Tc7d 5hKs Js4h JdAh",
      Solver.process("texas-holdem 6h9cKdQdTh Ad6d Tc7d 9h3c JdAh 4cTs 5hKs Js4h 6c4s"));
  }

  @Test
  public void test_texas_holdem_3693_3h6d7cAcTc_7sJc_KhJd_4dQh_5dKs() {
    assertEquals(
      "4dQh 5dKs KhJd 7sJc",
      Solver.process("texas-holdem 3h6d7cAcTc 7sJc KhJd 4dQh 5dKs"));
  }

  @Test
  public void test_texas_holdem_3694_2c2h2s3h8c_7s4h_JhKd_4dJd_8s6c_6hAd_9dTh_5cQh() {
    assertEquals(
      "7s4h 9dTh 4dJd 5cQh JhKd 6hAd 8s6c",
      Solver.process("texas-holdem 2c2h2s3h8c 7s4h JhKd 4dJd 8s6c 6hAd 9dTh 5cQh"));
  }

  @Test
  public void test_texas_holdem_3695_5c5hJcJhJs_2hKc_Qh2s_3s4s_9h6h_Th7h_2dAh_Ac8h() {
    assertEquals(
      "2dAh=2hKc=3s4s=9h6h=Ac8h=Qh2s=Th7h",
      Solver.process("texas-holdem 5c5hJcJhJs 2hKc Qh2s 3s4s 9h6h Th7h 2dAh Ac8h"));
  }

  @Test
  public void test_texas_holdem_3696_4d7cAsJsTs_KhTd_JhAh_6s2h_8dQd_8c8h_6h8s_2dKs() {
    assertEquals(
      "6s2h 6h8s 8dQd 2dKs 8c8h KhTd JhAh",
      Solver.process("texas-holdem 4d7cAsJsTs KhTd JhAh 6s2h 8dQd 8c8h 6h8s 2dKs"));
  }

  @Test
  public void test_texas_holdem_3697_2c2h8d9hKc_TcKs_Jh8s_Ad9c_8c2d_5h7d() {
    assertEquals(
      "5h7d Jh8s Ad9c TcKs 8c2d",
      Solver.process("texas-holdem 2c2h8d9hKc TcKs Jh8s Ad9c 8c2d 5h7d"));
  }

  @Test
  public void test_texas_holdem_3698_5h6s8c8d8h_ThAs_9h2c_6c2h_9c2d_AdJc() {
    assertEquals(
      "9c2d=9h2c ThAs AdJc 6c2h",
      Solver.process("texas-holdem 5h6s8c8d8h ThAs 9h2c 6c2h 9c2d AdJc"));
  }

  @Test
  public void test_texas_holdem_3699_2s8c9cJsKd_Ah2h_Ts4s_Ks5s_2d8s() {
    assertEquals(
      "Ts4s Ah2h Ks5s 2d8s",
      Solver.process("texas-holdem 2s8c9cJsKd Ah2h Ts4s Ks5s 2d8s"));
  }

  @Test
  public void test_texas_holdem_3700_3s9d9hKcTs_As4h_Qh6s_2c9c() {
    assertEquals(
      "Qh6s As4h 2c9c",
      Solver.process("texas-holdem 3s9d9hKcTs As4h Qh6s 2c9c"));
  }

  @Test
  public void test_texas_holdem_3701_5c7cAdKdTd_QhQc_2d9d_9sAc_4h3h_2s3c_JsKc_7h8s_As8c() {
    assertEquals(
      "2s3c=4h3h 7h8s QhQc JsKc As8c 9sAc 2d9d",
      Solver.process("texas-holdem 5c7cAdKdTd QhQc 2d9d 9sAc 4h3h 2s3c JsKc 7h8s As8c"));
  }

  @Test
  public void test_texas_holdem_3702_4d7d8d9dAs_7s4c_7cQh_JhQd_Qs5s() {
    assertEquals(
      "Qs5s 7cQh 7s4c JhQd",
      Solver.process("texas-holdem 4d7d8d9dAs 7s4c 7cQh JhQd Qs5s"));
  }

  @Test
  public void test_texas_holdem_3703_9c9sAcQsTs_Ks3h_Th4s_2s7h_4h8s_6d2h_4c2d_QdQc_7sTc_JdAs() {
    assertEquals(
      "2s7h=4c2d=4h8s=6d2h Ks3h 7sTc=Th4s JdAs QdQc",
      Solver.process("texas-holdem 9c9sAcQsTs Ks3h Th4s 2s7h 4h8s 6d2h 4c2d QdQc 7sTc JdAs"));
  }

  @Test
  public void test_texas_holdem_3704_2c4hQcQhTs_3dJd_7dAs_ThKd_7h5s_KsQd_5h7c() {
    assertEquals(
      "5h7c=7h5s 3dJd 7dAs ThKd KsQd",
      Solver.process("texas-holdem 2c4hQcQhTs 3dJd 7dAs ThKd 7h5s KsQd 5h7c"));
  }

  @Test
  public void test_texas_holdem_3705_4c7hJhKsTs_Kc2s_Qd4s_Ad6s_Qs3s_8h3h_Td5s_7c8s_AsQc_TcQh() {
    assertEquals(
      "8h3h Qs3s Ad6s Qd4s 7c8s Td5s TcQh Kc2s AsQc",
      Solver.process("texas-holdem 4c7hJhKsTs Kc2s Qd4s Ad6s Qs3s 8h3h Td5s 7c8s AsQc TcQh"));
  }

  @Test
  public void test_texas_holdem_3706_3c3s5c5dTh_5h7c_6hKh_3h2s() {
    assertEquals(
      "6hKh 3h2s 5h7c",
      Solver.process("texas-holdem 3c3s5c5dTh 5h7c 6hKh 3h2s"));
  }

  @Test
  public void test_texas_holdem_3707_3h5h5s8d8s_9hQh_2sTd_3cQc_JdKd_4s6d_AdAs_6c9c_8c7s_2d9d() {
    assertEquals(
      "4s6d 2d9d=6c9c 2sTd 3cQc=9hQh JdKd AdAs 8c7s",
      Solver.process("texas-holdem 3h5h5s8d8s 9hQh 2sTd 3cQc JdKd 4s6d AdAs 6c9c 8c7s 2d9d"));
  }

  @Test
  public void test_texas_holdem_3708_7hAdAsKhTs_4dTc_2hKd_Ks2d() {
    assertEquals(
      "4dTc 2hKd=Ks2d",
      Solver.process("texas-holdem 7hAdAsKhTs 4dTc 2hKd Ks2d"));
  }

  @Test
  public void test_texas_holdem_3709_2c2d3c7cAd_8d3s_9s6c_4s9h_JcKh_5h8h_9dKd_QcAc() {
    assertEquals(
      "5h8h 4s9h=9s6c 9dKd JcKh 8d3s QcAc",
      Solver.process("texas-holdem 2c2d3c7cAd 8d3s 9s6c 4s9h JcKh 5h8h 9dKd QcAc"));
  }

  @Test
  public void test_texas_holdem_3710_6c8cJhKcTh_Tc7d_7cJc_Ah3h_8s5h_5c2s_3s9h_Js5s_6d9s_8dAc() {
    assertEquals(
      "5c2s 3s9h Ah3h 6d9s 8s5h 8dAc Tc7d Js5s 7cJc",
      Solver.process("texas-holdem 6c8cJhKcTh Tc7d 7cJc Ah3h 8s5h 5c2s 3s9h Js5s 6d9s 8dAc"));
  }

  @Test
  public void test_texas_holdem_3711_2c6c7sAcJc_2s8d_KdKs_8cKc_8h6h() {
    assertEquals(
      "2s8d 8h6h KdKs 8cKc",
      Solver.process("texas-holdem 2c6c7sAcJc 2s8d KdKs 8cKc 8h6h"));
  }

  @Test
  public void test_texas_holdem_3712_5s8cJsKdKh_QhQd_4d8h_Ts2c_Jc7d_9s6h_6d2d_5h5c() {
    assertEquals(
      "6d2d 9s6h Ts2c 4d8h Jc7d QhQd 5h5c",
      Solver.process("texas-holdem 5s8cJsKdKh QhQd 4d8h Ts2c Jc7d 9s6h 6d2d 5h5c"));
  }

  @Test
  public void test_texas_holdem_3713_4c5c8h9hAc_9d6c_2dAs() {
    assertEquals(
      "9d6c 2dAs",
      Solver.process("texas-holdem 4c5c8h9hAc 9d6c 2dAs"));
  }

  @Test
  public void test_texas_holdem_3714_2h5d6d7hAs_Ah7d_Ac6s_JhJs_9s9h_TsQd_Ad4c() {
    assertEquals(
      "TsQd 9s9h JhJs Ad4c Ac6s Ah7d",
      Solver.process("texas-holdem 2h5d6d7hAs Ah7d Ac6s JhJs 9s9h TsQd Ad4c"));
  }

  @Test
  public void test_texas_holdem_3715_3c5h6cAsJd_4s4h_2sKh_2cQd_4dKd_Qs8s_7h5d() {
    assertEquals(
      "2cQd Qs8s 2sKh=4dKd 4s4h 7h5d",
      Solver.process("texas-holdem 3c5h6cAsJd 4s4h 2sKh 2cQd 4dKd Qs8s 7h5d"));
  }

  @Test
  public void test_texas_holdem_3716_7d8sJdKcTd_8c9s_9d7c_8d2s_6dQh_JhAc() {
    assertEquals(
      "6dQh 8d2s JhAc 8c9s=9d7c",
      Solver.process("texas-holdem 7d8sJdKcTd 8c9s 9d7c 8d2s 6dQh JhAc"));
  }

  @Test
  public void test_texas_holdem_3717_3c4d9dJsTd_7sQd_Qs4s_5h8h_Ac5c_9h6h_8cTh_TsKc() {
    assertEquals(
      "5h8h 7sQd Ac5c Qs4s 9h6h 8cTh TsKc",
      Solver.process("texas-holdem 3c4d9dJsTd 7sQd Qs4s 5h8h Ac5c 9h6h 8cTh TsKc"));
  }

  @Test
  public void test_texas_holdem_3718_6h8d8h9cAc_4hJh_6dQc_5hKc_6c3h() {
    assertEquals(
      "4hJh 5hKc 6c3h=6dQc",
      Solver.process("texas-holdem 6h8d8h9cAc 4hJh 6dQc 5hKc 6c3h"));
  }

  @Test
  public void test_texas_holdem_3719_4s6c9dJsKs_7d8h_Jh9s_6sKd_QsAh() {
    assertEquals(
      "7d8h QsAh Jh9s 6sKd",
      Solver.process("texas-holdem 4s6c9dJsKs 7d8h Jh9s 6sKd QsAh"));
  }

  @Test
  public void test_texas_holdem_3720_3s6c6d6s7s_Js7c_AsTd() {
    assertEquals(
      "AsTd Js7c",
      Solver.process("texas-holdem 3s6c6d6s7s Js7c AsTd"));
  }

  @Test
  public void test_texas_holdem_3721_8dAcJcJsQs_JhAh_4cAd_6cQd_AsKh() {
    assertEquals(
      "6cQd 4cAd AsKh JhAh",
      Solver.process("texas-holdem 8dAcJcJsQs JhAh 4cAd 6cQd AsKh"));
  }

  @Test
  public void test_texas_holdem_3722_2h4h9sKsQc_5hTh_Tc8s_7h3d_Ah7c_7s3s_Ad3h_2s5c_KdQh() {
    assertEquals(
      "7h3d=7s3s 5hTh Tc8s Ad3h Ah7c 2s5c KdQh",
      Solver.process("texas-holdem 2h4h9sKsQc 5hTh Tc8s 7h3d Ah7c 7s3s Ad3h 2s5c KdQh"));
  }

  @Test
  public void test_texas_holdem_3723_2s4c4h6h7c_KhJd_2hAc_7dJs_QsKc_3cKd_5h9d() {
    assertEquals(
      "5h9d 3cKd KhJd QsKc 2hAc 7dJs",
      Solver.process("texas-holdem 2s4c4h6h7c KhJd 2hAc 7dJs QsKc 3cKd 5h9d"));
  }

  @Test
  public void test_texas_holdem_3724_5s8c9dAcAd_6cJs_3dKh() {
    assertEquals(
      "6cJs 3dKh",
      Solver.process("texas-holdem 5s8c9dAcAd 6cJs 3dKh"));
  }

  @Test
  public void test_texas_holdem_3725_2d2s5sQhTs_5hJc_4hJd_9sQs() {
    assertEquals(
      "4hJd 5hJc 9sQs",
      Solver.process("texas-holdem 2d2s5sQhTs 5hJc 4hJd 9sQs"));
  }

  @Test
  public void test_texas_holdem_3726_6c7d9dQcQh_6hTc_Jh7h_Jd9h() {
    assertEquals(
      "6hTc Jh7h Jd9h",
      Solver.process("texas-holdem 6c7d9dQcQh 6hTc Jh7h Jd9h"));
  }

  @Test
  public void test_texas_holdem_3727_3d4h4sAcJc_4d5c_Td7c_JsJh_7h9d_4c8s_9cKs_3h2c() {
    assertEquals(
      "7h9d Td7c 9cKs 3h2c 4c8s=4d5c JsJh",
      Solver.process("texas-holdem 3d4h4sAcJc 4d5c Td7c JsJh 7h9d 4c8s 9cKs 3h2c"));
  }

  @Test
  public void test_texas_holdem_3728_3s6d9dKhTs_4d2s_7c8s_3h9s() {
    assertEquals(
      "4d2s 3h9s 7c8s",
      Solver.process("texas-holdem 3s6d9dKhTs 4d2s 7c8s 3h9s"));
  }

  @Test
  public void test_texas_holdem_3729_2d2h7dKcQs_Qh8h_4sQd() {
    assertEquals(
      "4sQd=Qh8h",
      Solver.process("texas-holdem 2d2h7dKcQs Qh8h 4sQd"));
  }

  @Test
  public void test_texas_holdem_3730_4h5d6hKdQd_5cJd_KcAc_Ts5s_7hTc_Qs9h_3s2c_6dTd_5h7c_Kh7d() {
    assertEquals(
      "7hTc 5h7c Ts5s 5cJd Qs9h Kh7d KcAc 3s2c 6dTd",
      Solver.process("texas-holdem 4h5d6hKdQd 5cJd KcAc Ts5s 7hTc Qs9h 3s2c 6dTd 5h7c Kh7d"));
  }

  @Test
  public void test_texas_holdem_3731_AhKcKdKsTh_3d4d_9hAs_TcQd() {
    assertEquals(
      "3d4d TcQd 9hAs",
      Solver.process("texas-holdem AhKcKdKsTh 3d4d 9hAs TcQd"));
  }

  @Test
  public void test_texas_holdem_3732_8sKcKhQsTs_Kd2d_4c9h_3h8c() {
    assertEquals(
      "4c9h 3h8c Kd2d",
      Solver.process("texas-holdem 8sKcKhQsTs Kd2d 4c9h 3h8c"));
  }

  @Test
  public void test_texas_holdem_3733_2d3s7h8c9h_QsJc_3h2h() {
    assertEquals(
      "QsJc 3h2h",
      Solver.process("texas-holdem 2d3s7h8c9h QsJc 3h2h"));
  }

  @Test
  public void test_texas_holdem_3734_2h4d6cJdKh_7h3c_Th4h_4s9h_Kc8s() {
    assertEquals(
      "7h3c 4s9h Th4h Kc8s",
      Solver.process("texas-holdem 2h4d6cJdKh 7h3c Th4h 4s9h Kc8s"));
  }

  @Test
  public void test_texas_holdem_3735_6s8dKsTcTs_5hJd_2h5d() {
    assertEquals(
      "2h5d 5hJd",
      Solver.process("texas-holdem 6s8dKsTcTs 5hJd 2h5d"));
  }

  @Test
  public void test_texas_holdem_3736_3s8c9hAcQh_QsAs_Jd5c_6c8s_KcQd_Th2c_7c5s_Jc3h_TsQc_5hKs() {
    assertEquals(
      "7c5s Th2c Jd5c 5hKs Jc3h 6c8s TsQc KcQd QsAs",
      Solver.process("texas-holdem 3s8c9hAcQh QsAs Jd5c 6c8s KcQd Th2c 7c5s Jc3h TsQc 5hKs"));
  }

  @Test
  public void test_texas_holdem_3737_4h5h6h9cQc_JdAs_7s4s_Kh7d_9hJh_4cTc_2d5s_Qd9s() {
    assertEquals(
      "Kh7d JdAs 7s4s 4cTc 2d5s Qd9s 9hJh",
      Solver.process("texas-holdem 4h5h6h9cQc JdAs 7s4s Kh7d 9hJh 4cTc 2d5s Qd9s"));
  }

  @Test
  public void test_texas_holdem_3738_2h4d5dThTs_AsJh_7h4s_Kc8h_6s3d_Ks4h_Js3h() {
    assertEquals(
      "Js3h Kc8h AsJh 7h4s Ks4h 6s3d",
      Solver.process("texas-holdem 2h4d5dThTs AsJh 7h4s Kc8h 6s3d Ks4h Js3h"));
  }

  @Test
  public void test_texas_holdem_3739_2c4c8d8hKs_3d5c_KcJc_7h6h_Jd9h_8c6d_Qd7s_9dAc_4sTs_3s9c() {
    assertEquals(
      "3d5c 7h6h 3s9c Jd9h Qd7s 9dAc 4sTs KcJc 8c6d",
      Solver.process("texas-holdem 2c4c8d8hKs 3d5c KcJc 7h6h Jd9h 8c6d Qd7s 9dAc 4sTs 3s9c"));
  }

  @Test
  public void test_texas_holdem_3740_6h7c8sAcQc_Tc8d_8h4c_Ah7s_Th6c_3h2c_2dQh_3sKd_9dAs_8cQd() {
    assertEquals(
      "3h2c 3sKd Th6c 8h4c Tc8d 2dQh 9dAs 8cQd Ah7s",
      Solver.process("texas-holdem 6h7c8sAcQc Tc8d 8h4c Ah7s Th6c 3h2c 2dQh 3sKd 9dAs 8cQd"));
  }

  @Test
  public void test_texas_holdem_3741_2h2s5hKsTd_Kd6c_Kh4d_7c7h_Kc2d_6sJc_3sTh_Jd6d_4s9h() {
    assertEquals(
      "4s9h 6sJc=Jd6d 7c7h 3sTh Kd6c=Kh4d Kc2d",
      Solver.process("texas-holdem 2h2s5hKsTd Kd6c Kh4d 7c7h Kc2d 6sJc 3sTh Jd6d 4s9h"));
  }

  @Test
  public void test_texas_holdem_3742_4c5c5h6hJs_Qh8d_8cAc_4hQc_TsTh_As6d_Qs6s() {
    assertEquals(
      "Qh8d 8cAc 4hQc Qs6s As6d TsTh",
      Solver.process("texas-holdem 4c5c5h6hJs Qh8d 8cAc 4hQc TsTh As6d Qs6s"));
  }

  @Test
  public void test_texas_holdem_3743_3h5c7h8dTs_3d2d_JdQs_7s8h_3c9c_6s5s() {
    assertEquals(
      "JdQs 3d2d 3c9c 6s5s 7s8h",
      Solver.process("texas-holdem 3h5c7h8dTs 3d2d JdQs 7s8h 3c9c 6s5s"));
  }

  @Test
  public void test_texas_holdem_3744_5c8dAhJdQc_6h8h_Jh2d() {
    assertEquals(
      "6h8h Jh2d",
      Solver.process("texas-holdem 5c8dAhJdQc 6h8h Jh2d"));
  }

  @Test
  public void test_texas_holdem_3745_3h5s8d9hKh_9cJc_6c8c_Ac3d_Tc5h_Ah4d_3c6s_5c7s() {
    assertEquals(
      "Ah4d 3c6s Ac3d 5c7s Tc5h 6c8c 9cJc",
      Solver.process("texas-holdem 3h5s8d9hKh 9cJc 6c8c Ac3d Tc5h Ah4d 3c6s 5c7s"));
  }

  @Test
  public void test_texas_holdem_3746_2d4d5s6h8h_QdTd_7d6s_6dKd_Ac5c() {
    assertEquals(
      "QdTd Ac5c 6dKd 7d6s",
      Solver.process("texas-holdem 2d4d5s6h8h QdTd 7d6s 6dKd Ac5c"));
  }

  @Test
  public void test_texas_holdem_3747_7c7d8hAcTh_Js4h_JhAs() {
    assertEquals(
      "Js4h JhAs",
      Solver.process("texas-holdem 7c7d8hAcTh Js4h JhAs"));
  }

  @Test
  public void test_texas_holdem_3748_3s5dJhKhTs_5h7c_Th9h_6s9s() {
    assertEquals(
      "6s9s 5h7c Th9h",
      Solver.process("texas-holdem 3s5dJhKhTs 5h7c Th9h 6s9s"));
  }

  @Test
  public void test_texas_holdem_3749_4s6h8dTcTd_7s9c_2sTs_Kc2c_Ah3d_Jd4h_7dAc() {
    assertEquals(
      "Kc2c Ah3d 7dAc Jd4h 2sTs 7s9c",
      Solver.process("texas-holdem 4s6h8dTcTd 7s9c 2sTs Kc2c Ah3d Jd4h 7dAc"));
  }

}
