
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver30HiddenTest {


  @Test
  public void test_texas_holdem_7500_3d3s4hAsQc_3h5c_7dKd_9s3c_Js7c_6sJc_2s8s_7sQd_QsJh_6c8c() {
    assertEquals(
      "2s8s=6c8c 6sJc=Js7c 7dKd 7sQd=QsJh 3h5c=9s3c",
      Solver.process("texas-holdem 3d3s4hAsQc 3h5c 7dKd 9s3c Js7c 6sJc 2s8s 7sQd QsJh 6c8c"));
  }

  @Test
  public void test_texas_holdem_7501_5c7c9hAhQh_2d2s_JcKc_AcKh_Ts7s() {
    assertEquals(
      "JcKc 2d2s Ts7s AcKh",
      Solver.process("texas-holdem 5c7c9hAhQh 2d2s JcKc AcKh Ts7s"));
  }

  @Test
  public void test_texas_holdem_7502_5h7d9c9dKh_AhAc_3cJs_5d8s_6c8d_3sQh_6d3d_3h4c_4d9h() {
    assertEquals(
      "3h4c 6d3d 3cJs 3sQh 5d8s AhAc 4d9h 6c8d",
      Solver.process("texas-holdem 5h7d9c9dKh AhAc 3cJs 5d8s 6c8d 3sQh 6d3d 3h4c 4d9h"));
  }

  @Test
  public void test_texas_holdem_7503_4c7h8s9cKd_3h2c_4sQs_Jh3c_Tc4h() {
    assertEquals(
      "3h2c Jh3c Tc4h 4sQs",
      Solver.process("texas-holdem 4c7h8s9cKd 3h2c 4sQs Jh3c Tc4h"));
  }

  @Test
  public void test_texas_holdem_7504_5d9dAsKdQc_6c7s_JhTs_5s7c_4dJd_AdAh_7d2d() {
    assertEquals(
      "6c7s 5s7c AdAh JhTs 7d2d 4dJd",
      Solver.process("texas-holdem 5d9dAsKdQc 6c7s JhTs 5s7c 4dJd AdAh 7d2d"));
  }

  @Test
  public void test_texas_holdem_7505_2d6d8c8dQd_5h5d_3d7c() {
    assertEquals(
      "3d7c 5h5d",
      Solver.process("texas-holdem 2d6d8c8dQd 5h5d 3d7c"));
  }

  @Test
  public void test_texas_holdem_7506_3s7c7hQdTc_Jd8d_6s6c_QcJh() {
    assertEquals(
      "Jd8d 6s6c QcJh",
      Solver.process("texas-holdem 3s7c7hQdTc Jd8d 6s6c QcJh"));
  }

  @Test
  public void test_texas_holdem_7507_3d5d5h8dJh_JcAd_Kh3h() {
    assertEquals(
      "Kh3h JcAd",
      Solver.process("texas-holdem 3d5d5h8dJh JcAd Kh3h"));
  }

  @Test
  public void test_texas_holdem_7508_5s6cAsQdTc_7d5h_4c3d_6hQc_2dKh_TdAd_7cAc() {
    assertEquals(
      "4c3d 2dKh 7d5h 7cAc 6hQc TdAd",
      Solver.process("texas-holdem 5s6cAsQdTc 7d5h 4c3d 6hQc 2dKh TdAd 7cAc"));
  }

  @Test
  public void test_texas_holdem_7509_5d7cAcAdTc_9d8d_7dKs_AhJc_6d8c_Kd6s() {
    assertEquals(
      "6d8c 9d8d Kd6s 7dKs AhJc",
      Solver.process("texas-holdem 5d7cAcAdTc 9d8d 7dKs AhJc 6d8c Kd6s"));
  }

  @Test
  public void test_texas_holdem_7510_4c6c7c8cQh_3d7d_5dQd_TsTh_9hJh_Ks9c_8s5h_Ac7s() {
    assertEquals(
      "9hJh 3d7d TsTh 5dQd=8s5h Ks9c Ac7s",
      Solver.process("texas-holdem 4c6c7c8cQh 3d7d 5dQd TsTh 9hJh Ks9c 8s5h Ac7s"));
  }

  @Test
  public void test_texas_holdem_7511_3d6h7dKsTh_AdJd_4d9c_2h6c_KcQd_Ac4s_Qh2c() {
    assertEquals(
      "4d9c Qh2c Ac4s AdJd 2h6c KcQd",
      Solver.process("texas-holdem 3d6h7dKsTh AdJd 4d9c 2h6c KcQd Ac4s Qh2c"));
  }

  @Test
  public void test_texas_holdem_7512_7c8d8s9hQd_AhQc_TcJs_8c5h() {
    assertEquals(
      "AhQc 8c5h TcJs",
      Solver.process("texas-holdem 7c8d8s9hQd AhQc TcJs 8c5h"));
  }

  @Test
  public void test_texas_holdem_7513_8hJcJsQsTh_Jh8c_9h7c_QhTc_3d2c_9cTs_5dQc_9s3h_JdAs() {
    assertEquals(
      "3d2c 5dQc=QhTc JdAs 9cTs=9h7c=9s3h Jh8c",
      Solver.process("texas-holdem 8hJcJsQsTh Jh8c 9h7c QhTc 3d2c 9cTs 5dQc 9s3h JdAs"));
  }

  @Test
  public void test_texas_holdem_7514_3s5h6c7sKh_JhTc_KsJd_8h6d_Ts8c_5cAd_5dKd() {
    assertEquals(
      "Ts8c JhTc 5cAd 8h6d KsJd 5dKd",
      Solver.process("texas-holdem 3s5h6c7sKh JhTc KsJd 8h6d Ts8c 5cAd 5dKd"));
  }

  @Test
  public void test_texas_holdem_7515_8d8sJhKhTs_As6h_Ah6d_3d7c_6s5s_5h9s() {
    assertEquals(
      "3d7c=5h9s=6s5s Ah6d=As6h",
      Solver.process("texas-holdem 8d8sJhKhTs As6h Ah6d 3d7c 6s5s 5h9s"));
  }

  @Test
  public void test_texas_holdem_7516_4c6s8sKcTc_2dJc_9s5h_8cTs_5sAc_Kh4s_3h8h_Qd3d_6c7s_Jd2c() {
    assertEquals(
      "9s5h 2dJc=Jd2c Qd3d 5sAc 6c7s 3h8h 8cTs Kh4s",
      Solver.process("texas-holdem 4c6s8sKcTc 2dJc 9s5h 8cTs 5sAc Kh4s 3h8h Qd3d 6c7s Jd2c"));
  }

  @Test
  public void test_texas_holdem_7517_7h9dAdAhTc_Ac7c_Jd9c_5sQd() {
    assertEquals(
      "5sQd Jd9c Ac7c",
      Solver.process("texas-holdem 7h9dAdAhTc Ac7c Jd9c 5sQd"));
  }

  @Test
  public void test_texas_holdem_7518_8s9hAsKdQd_Th5h_4c5c() {
    assertEquals(
      "4c5c Th5h",
      Solver.process("texas-holdem 8s9hAsKdQd Th5h 4c5c"));
  }

  @Test
  public void test_texas_holdem_7519_7c8sQcQdQs_7h3s_Jh4h_5sJs_KsAc() {
    assertEquals(
      "5sJs=Jh4h KsAc 7h3s",
      Solver.process("texas-holdem 7c8sQcQdQs 7h3s Jh4h 5sJs KsAc"));
  }

  @Test
  public void test_texas_holdem_7520_4s6dJhKsTc_2c8h_Th9s_9h7d() {
    assertEquals(
      "2c8h 9h7d Th9s",
      Solver.process("texas-holdem 4s6dJhKsTc 2c8h Th9s 9h7d"));
  }

  @Test
  public void test_texas_holdem_7521_8c8d9sAhTh_Kh6h_TcKc_2hTs_Qc5h() {
    assertEquals(
      "Qc5h Kh6h 2hTs=TcKc",
      Solver.process("texas-holdem 8c8d9sAhTh Kh6h TcKc 2hTs Qc5h"));
  }

  @Test
  public void test_texas_holdem_7522_2d5dAsKdQd_Ts7d_6dJs_Qh8d() {
    assertEquals(
      "6dJs Ts7d Qh8d",
      Solver.process("texas-holdem 2d5dAsKdQd Ts7d 6dJs Qh8d"));
  }

  @Test
  public void test_texas_holdem_7523_3s4s5h6s9h_3c2c_3hTh_AcKc_Qh2s_Tc3d_8sKh_QcKs_7dKd_TsQd() {
    assertEquals(
      "TsQd 8sKh QcKs AcKc 3hTh=Tc3d 3c2c=Qh2s 7dKd",
      Solver.process("texas-holdem 3s4s5h6s9h 3c2c 3hTh AcKc Qh2s Tc3d 8sKh QcKs 7dKd TsQd"));
  }

  @Test
  public void test_texas_holdem_7524_2c3c6h9sAc_Jc4s_6sJs_8h3h() {
    assertEquals(
      "Jc4s 8h3h 6sJs",
      Solver.process("texas-holdem 2c3c6h9sAc Jc4s 6sJs 8h3h"));
  }

  @Test
  public void test_texas_holdem_7525_5s7d8d9c9s_7sJh_KcJc_Qc6c_Ad5h_4c2h_QhTh_9d4h_KhQs_JdJs() {
    assertEquals(
      "4c2h QhTh KcJc KhQs Ad5h 7sJh JdJs 9d4h Qc6c",
      Solver.process("texas-holdem 5s7d8d9c9s 7sJh KcJc Qc6c Ad5h 4c2h QhTh 9d4h KhQs JdJs"));
  }

  @Test
  public void test_texas_holdem_7526_3d5hJcKdTc_8h2d_4sTd_6h4d_AhKc_5s5c_7sKs_As8c_JhKh_3s5d() {
    assertEquals(
      "6h4d 8h2d As8c 4sTd 7sKs AhKc 3s5d JhKh 5s5c",
      Solver.process("texas-holdem 3d5hJcKdTc 8h2d 4sTd 6h4d AhKc 5s5c 7sKs As8c JhKh 3s5d"));
  }

  @Test
  public void test_texas_holdem_7527_5s7s8dAcKh_Js2c_Qh6h_Tc8c() {
    assertEquals(
      "Js2c Qh6h Tc8c",
      Solver.process("texas-holdem 5s7s8dAcKh Js2c Qh6h Tc8c"));
  }

  @Test
  public void test_texas_holdem_7528_3d5c9d9hAc_4d8s_6c8d_2d9c_Ks4s() {
    assertEquals(
      "4d8s 6c8d Ks4s 2d9c",
      Solver.process("texas-holdem 3d5c9d9hAc 4d8s 6c8d 2d9c Ks4s"));
  }

  @Test
  public void test_texas_holdem_7529_6h7h8hAcJs_Qc4d_6cQh_3sQd_2c3c_Ks2h_2d9s_3d8d() {
    assertEquals(
      "2c3c 2d9s 3sQd=Qc4d Ks2h 6cQh 3d8d",
      Solver.process("texas-holdem 6h7h8hAcJs Qc4d 6cQh 3sQd 2c3c Ks2h 2d9s 3d8d"));
  }

  @Test
  public void test_texas_holdem_7530_2d4c9hAhQc_6d5s_8hJc_Js3s_5d2h() {
    assertEquals(
      "6d5s Js3s 8hJc 5d2h",
      Solver.process("texas-holdem 2d4c9hAhQc 6d5s 8hJc Js3s 5d2h"));
  }

  @Test
  public void test_texas_holdem_7531_7h9cJcKhTc_Ah4s_5s6d() {
    assertEquals(
      "5s6d Ah4s",
      Solver.process("texas-holdem 7h9cJcKhTc Ah4s 5s6d"));
  }

  @Test
  public void test_texas_holdem_7532_6c6d6h8s9c_2h7h_4c8h_Kh4d_9dKd_4h2d_Qc5s() {
    assertEquals(
      "2h7h=4h2d Qc5s Kh4d 4c8h 9dKd",
      Solver.process("texas-holdem 6c6d6h8s9c 2h7h 4c8h Kh4d 9dKd 4h2d Qc5s"));
  }

  @Test
  public void test_texas_holdem_7533_3s6sJdQdTc_5s7h_3dTd() {
    assertEquals(
      "5s7h 3dTd",
      Solver.process("texas-holdem 3s6sJdQdTc 5s7h 3dTd"));
  }

  @Test
  public void test_texas_holdem_7534_4c8d9cAcTd_3s3h_5sQc_5dJs_8c3c_9h9d_KcTh_2c9s_JcKs_6h4s() {
    assertEquals(
      "5dJs 5sQc JcKs 3s3h 6h4s 2c9s KcTh 9h9d 8c3c",
      Solver.process("texas-holdem 4c8d9cAcTd 3s3h 5sQc 5dJs 8c3c 9h9d KcTh 2c9s JcKs 6h4s"));
  }

  @Test
  public void test_texas_holdem_7535_2s6cKdQcTs_JdAs_JcKs_9c8d_Ad2d() {
    assertEquals(
      "9c8d Ad2d JcKs JdAs",
      Solver.process("texas-holdem 2s6cKdQcTs JdAs JcKs 9c8d Ad2d"));
  }

  @Test
  public void test_texas_holdem_7536_3d4s7c8cKc_8hKh_QhTd_4hAd_5hJd_Ts7d_9hQd_9c8s_Ah3s_4cAs() {
    assertEquals(
      "5hJd 9hQd QhTd Ah3s 4cAs=4hAd Ts7d 9c8s 8hKh",
      Solver.process("texas-holdem 3d4s7c8cKc 8hKh QhTd 4hAd 5hJd Ts7d 9hQd 9c8s Ah3s 4cAs"));
  }

  @Test
  public void test_texas_holdem_7537_7dAdKsQdQh_9d6c_7hKh() {
    assertEquals(
      "9d6c 7hKh",
      Solver.process("texas-holdem 7dAdKsQdQh 9d6c 7hKh"));
  }

  @Test
  public void test_texas_holdem_7538_3s7d7sQcQs_8cKd_Qd3c_Td2c() {
    assertEquals(
      "Td2c 8cKd Qd3c",
      Solver.process("texas-holdem 3s7d7sQcQs 8cKd Qd3c Td2c"));
  }

  @Test
  public void test_texas_holdem_7539_3c3sKcThTs_8cAc_6h9c() {
    assertEquals(
      "6h9c 8cAc",
      Solver.process("texas-holdem 3c3sKcThTs 8cAc 6h9c"));
  }

  @Test
  public void test_texas_holdem_7540_5c7h8d9cTs_8h2c_8s4h() {
    assertEquals(
      "8h2c=8s4h",
      Solver.process("texas-holdem 5c7h8d9cTs 8h2c 8s4h"));
  }

  @Test
  public void test_texas_holdem_7541_2c4d7cKhQh_Kd4s_Th5c_Jd4c_7s3c_9hQd_9d9s_Tc4h_3sJc() {
    assertEquals(
      "Th5c 3sJc Tc4h Jd4c 7s3c 9d9s 9hQd Kd4s",
      Solver.process("texas-holdem 2c4d7cKhQh Kd4s Th5c Jd4c 7s3c 9hQd 9d9s Tc4h 3sJc"));
  }

  @Test
  public void test_texas_holdem_7542_3c3h7cAdKs_7hKc_2sTd_KhQs_QdTh() {
    assertEquals(
      "2sTd QdTh KhQs 7hKc",
      Solver.process("texas-holdem 3c3h7cAdKs 7hKc 2sTd KhQs QdTh"));
  }

  @Test
  public void test_texas_holdem_7543_2d5h5s6hAd_9sAs_ThKs_4c6s_3c8h_Jc4d_Jd6d() {
    assertEquals(
      "3c8h Jc4d ThKs 4c6s=Jd6d 9sAs",
      Solver.process("texas-holdem 2d5h5s6hAd 9sAs ThKs 4c6s 3c8h Jc4d Jd6d"));
  }

  @Test
  public void test_texas_holdem_7544_2c5d9dJsQd_Ts5s_8h7h_Jc9h_2s9c() {
    assertEquals(
      "8h7h Ts5s 2s9c Jc9h",
      Solver.process("texas-holdem 2c5d9dJsQd Ts5s 8h7h Jc9h 2s9c"));
  }

  @Test
  public void test_texas_holdem_7545_8h8s9c9sKd_2cKc_6cTc_3dTd_7cQd_2s8c_Ks9d() {
    assertEquals(
      "3dTd=6cTc=7cQd 2cKc 2s8c Ks9d",
      Solver.process("texas-holdem 8h8s9c9sKd 2cKc 6cTc 3dTd 7cQd 2s8c Ks9d"));
  }

  @Test
  public void test_texas_holdem_7546_8h9cJcTcTd_Js8s_2c3h() {
    assertEquals(
      "2c3h Js8s",
      Solver.process("texas-holdem 8h9cJcTcTd Js8s 2c3h"));
  }

  @Test
  public void test_texas_holdem_7547_3h4h8d9hJd_5dQs_6hQh_8sAs_9c2c_2dAd_TdKs_4c3d_2s8h_Kd9s() {
    assertEquals(
      "5dQs TdKs 2dAd 2s8h 8sAs 9c2c Kd9s 4c3d 6hQh",
      Solver.process("texas-holdem 3h4h8d9hJd 5dQs 6hQh 8sAs 9c2c 2dAd TdKs 4c3d 2s8h Kd9s"));
  }

  @Test
  public void test_texas_holdem_7548_2d8d9sQsTh_9c6s_2cTs_9h7c_KhKs_Jh4h() {
    assertEquals(
      "9c6s=9h7c KhKs 2cTs Jh4h",
      Solver.process("texas-holdem 2d8d9sQsTh 9c6s 2cTs 9h7c KhKs Jh4h"));
  }

  @Test
  public void test_texas_holdem_7549_4d4s9h9sQc_Td7d_Kd8h_8c3s_5sKh() {
    assertEquals(
      "8c3s=Td7d 5sKh=Kd8h",
      Solver.process("texas-holdem 4d4s9h9sQc Td7d Kd8h 8c3s 5sKh"));
  }

  @Test
  public void test_texas_holdem_7550_3c3s4d5dTs_Qh2d_3d9d_5c7c_4sQs() {
    assertEquals(
      "Qh2d 4sQs 5c7c 3d9d",
      Solver.process("texas-holdem 3c3s4d5dTs Qh2d 3d9d 5c7c 4sQs"));
  }

  @Test
  public void test_texas_holdem_7551_2s3c4hAsTh_9cAc_4d7h_Jc5s_JhQs_2hKc_6sTc_Ad5c() {
    assertEquals(
      "JhQs 2hKc 4d7h 6sTc 9cAc Ad5c=Jc5s",
      Solver.process("texas-holdem 2s3c4hAsTh 9cAc 4d7h Jc5s JhQs 2hKc 6sTc Ad5c"));
  }

  @Test
  public void test_texas_holdem_7552_2s6c7hKdTs_4s6d_5sJd_4h5c_KhAc_AdQc_Tc5h_4c2h_9c9d_QsKs() {
    assertEquals(
      "4h5c 5sJd AdQc 4c2h 4s6d 9c9d Tc5h QsKs KhAc",
      Solver.process("texas-holdem 2s6c7hKdTs 4s6d 5sJd 4h5c KhAc AdQc Tc5h 4c2h 9c9d QsKs"));
  }

  @Test
  public void test_texas_holdem_7553_2d2s4hJsKs_Qs5s_Qc5h_3h4c_JcAd_7cJh_4dTd_4s6s() {
    assertEquals(
      "Qc5h 3h4c=4dTd 7cJh JcAd 4s6s Qs5s",
      Solver.process("texas-holdem 2d2s4hJsKs Qs5s Qc5h 3h4c JcAd 7cJh 4dTd 4s6s"));
  }

  @Test
  public void test_texas_holdem_7554_5d9c9dJdTh_TsJh_Jc3c_Td5c_8s4d() {
    assertEquals(
      "8s4d Td5c Jc3c TsJh",
      Solver.process("texas-holdem 5d9c9dJdTh TsJh Jc3c Td5c 8s4d"));
  }

  @Test
  public void test_texas_holdem_7555_3h4d6h8cKc_9sJh_3d3c_Ac4c_Qc5c() {
    assertEquals(
      "9sJh Qc5c Ac4c 3d3c",
      Solver.process("texas-holdem 3h4d6h8cKc 9sJh 3d3c Ac4c Qc5c"));
  }

  @Test
  public void test_texas_holdem_7556_6c9hAdJdJs_3dQh_Th8s_3s8h_7dKs_2sJh_Qd4c_AsAc_6h4s() {
    assertEquals(
      "3s8h Th8s 3dQh=Qd4c 7dKs 6h4s 2sJh AsAc",
      Solver.process("texas-holdem 6c9hAdJdJs 3dQh Th8s 3s8h 7dKs 2sJh Qd4c AsAc 6h4s"));
  }

  @Test
  public void test_texas_holdem_7557_2sAhQcTcTs_7d5d_4cJs() {
    assertEquals(
      "7d5d 4cJs",
      Solver.process("texas-holdem 2sAhQcTcTs 7d5d 4cJs"));
  }

  @Test
  public void test_texas_holdem_7558_5cAcAdJdJh_9s7s_7d8s() {
    assertEquals(
      "7d8s 9s7s",
      Solver.process("texas-holdem 5cAcAdJdJh 9s7s 7d8s"));
  }

  @Test
  public void test_texas_holdem_7559_8d9hJhJsTh_7s4d_Kc5c_Qh4c_Ac9s_6h6c_7h3h_KdQc() {
    assertEquals(
      "Kc5c 6h6c Ac9s 7s4d Qh4c KdQc 7h3h",
      Solver.process("texas-holdem 8d9hJhJsTh 7s4d Kc5c Qh4c Ac9s 6h6c 7h3h KdQc"));
  }

  @Test
  public void test_texas_holdem_7560_3d4h8dQhQs_2c2h_Ah5d_3hAs_9h6d_Qc6c_5sKd_5cKs_4sJs_QdJh() {
    assertEquals(
      "9h6d 5cKs=5sKd Ah5d 2c2h 3hAs 4sJs Qc6c QdJh",
      Solver.process("texas-holdem 3d4h8dQhQs 2c2h Ah5d 3hAs 9h6d Qc6c 5sKd 5cKs 4sJs QdJh"));
  }

  @Test
  public void test_texas_holdem_7561_6s7dJdKhQc_Td2h_8hJh_9s7s_Kc5s_2s4c_4d3h() {
    assertEquals(
      "2s4c=4d3h Td2h 9s7s 8hJh Kc5s",
      Solver.process("texas-holdem 6s7dJdKhQc Td2h 8hJh 9s7s Kc5s 2s4c 4d3h"));
  }

  @Test
  public void test_texas_holdem_7562_3c8c8d9hAs_3h7d_Ad7c_3sJh_9c4d_TsTh_Qh9s_QcTd_KcAc_Qs2c() {
    assertEquals(
      "Qs2c QcTd 3h7d=3sJh 9c4d=Qh9s TsTh Ad7c KcAc",
      Solver.process("texas-holdem 3c8c8d9hAs 3h7d Ad7c 3sJh 9c4d TsTh Qh9s QcTd KcAc Qs2c"));
  }

  @Test
  public void test_texas_holdem_7563_JsKdQdQsTh_QhQc_7c4c() {
    assertEquals(
      "7c4c QhQc",
      Solver.process("texas-holdem JsKdQdQsTh QhQc 7c4c"));
  }

  @Test
  public void test_texas_holdem_7564_2d4s6sKdTs_3hQd_3c5h() {
    assertEquals(
      "3hQd 3c5h",
      Solver.process("texas-holdem 2d4s6sKdTs 3hQd 3c5h"));
  }

  @Test
  public void test_texas_holdem_7565_2d4s6c8dJh_JcAh_Tc7h_5h8h_KdKc_Kh6h_Th9c_QhTs_9d5s() {
    assertEquals(
      "9d5s Tc7h Th9c QhTs Kh6h 5h8h JcAh KdKc",
      Solver.process("texas-holdem 2d4s6c8dJh JcAh Tc7h 5h8h KdKc Kh6h Th9c QhTs 9d5s"));
  }

  @Test
  public void test_texas_holdem_7566_4c6hAdAhJh_3d3c_Qs9c_Jc8d_ThKs_2c8c_6c3s_Td4h() {
    assertEquals(
      "2c8c Qs9c ThKs 3d3c Td4h 6c3s Jc8d",
      Solver.process("texas-holdem 4c6hAdAhJh 3d3c Qs9c Jc8d ThKs 2c8c 6c3s Td4h"));
  }

  @Test
  public void test_texas_holdem_7567_6h8sQdQsTs_As6s_6d2d_7d8d_9sJd_Ks5s_Qh4s_Qc9c() {
    assertEquals(
      "6d2d 7d8d Qh4s Qc9c 9sJd Ks5s As6s",
      Solver.process("texas-holdem 6h8sQdQsTs As6s 6d2d 7d8d 9sJd Ks5s Qh4s Qc9c"));
  }

  @Test
  public void test_texas_holdem_7568_6cJcJdKdKh_Ac6d_2s4c_5d8d_3d8s_6h3h_Qd4d_6s7d_9h7h_7c2h() {
    assertEquals(
      "2s4c=6h3h 6s7d=7c2h 3d8s=5d8d 9h7h Qd4d Ac6d",
      Solver.process("texas-holdem 6cJcJdKdKh Ac6d 2s4c 5d8d 3d8s 6h3h Qd4d 6s7d 9h7h 7c2h"));
  }

  @Test
  public void test_texas_holdem_7569_3c6h9cAhJc_KdJh_Js8h_5d4c_8c9s_TsAd_9h5c() {
    assertEquals(
      "5d4c 9h5c 8c9s Js8h KdJh TsAd",
      Solver.process("texas-holdem 3c6h9cAhJc KdJh Js8h 5d4c 8c9s TsAd 9h5c"));
  }

  @Test
  public void test_texas_holdem_7570_2c2s3h7d9d_8d6d_Tc6c_5h4s_Ad9s_9cJd_5cAs_Qh4d() {
    assertEquals(
      "5h4s 8d6d Tc6c Qh4d 5cAs 9cJd Ad9s",
      Solver.process("texas-holdem 2c2s3h7d9d 8d6d Tc6c 5h4s Ad9s 9cJd 5cAs Qh4d"));
  }

  @Test
  public void test_texas_holdem_7571_2s3s4c4sJd_Ks6d_KdAs() {
    assertEquals(
      "Ks6d KdAs",
      Solver.process("texas-holdem 2s3s4c4sJd Ks6d KdAs"));
  }

  @Test
  public void test_texas_holdem_7572_3c4sJdTcTh_Td7c_7d8c_6dAh_3s5s() {
    assertEquals(
      "7d8c 6dAh 3s5s Td7c",
      Solver.process("texas-holdem 3c4sJdTcTh Td7c 7d8c 6dAh 3s5s"));
  }

  @Test
  public void test_texas_holdem_7573_8hJdQcQdTd_4s5d_6dAh_4cJs_Kc8s_2h4h() {
    assertEquals(
      "2h4h=4s5d 6dAh Kc8s 4cJs",
      Solver.process("texas-holdem 8hJdQcQdTd 4s5d 6dAh 4cJs Kc8s 2h4h"));
  }

  @Test
  public void test_texas_holdem_7574_7d9hJcJhQc_TdQs_7s6c_9c4h_6d5s_Qd4c_3hAh_5d8c() {
    assertEquals(
      "6d5s 5d8c 3hAh 7s6c 9c4h Qd4c TdQs",
      Solver.process("texas-holdem 7d9hJcJhQc TdQs 7s6c 9c4h 6d5s Qd4c 3hAh 5d8c"));
  }

  @Test
  public void test_texas_holdem_7575_2c2d5c5d6h_4d5s_As8s_6c7s_2s7h_3hTd() {
    assertEquals(
      "3hTd As8s 6c7s 2s7h 4d5s",
      Solver.process("texas-holdem 2c2d5c5d6h 4d5s As8s 6c7s 2s7h 3hTd"));
  }

  @Test
  public void test_texas_holdem_7576_2h3d3h4s8c_Kc4d_8d7d_3c2c_9sJd_7h5d_4c6c() {
    assertEquals(
      "7h5d 9sJd 4c6c Kc4d 8d7d 3c2c",
      Solver.process("texas-holdem 2h3d3h4s8c Kc4d 8d7d 3c2c 9sJd 7h5d 4c6c"));
  }

  @Test
  public void test_texas_holdem_7577_5s6dAhAsJs_4h3c_3d8h() {
    assertEquals(
      "4h3c 3d8h",
      Solver.process("texas-holdem 5s6dAhAsJs 4h3c 3d8h"));
  }

  @Test
  public void test_texas_holdem_7578_2s4c5h6c9d_6d7h_9hJc_7d9c_Jh4h_5d4s_JsQd_3s7c_ThJd() {
    assertEquals(
      "ThJd JsQd Jh4h 6d7h 7d9c 9hJc 5d4s 3s7c",
      Solver.process("texas-holdem 2s4c5h6c9d 6d7h 9hJc 7d9c Jh4h 5d4s JsQd 3s7c ThJd"));
  }

  @Test
  public void test_texas_holdem_7579_4h7s9dKhQh_3h6h_ThJd_4dKs_Qd6d_7c6c_Ad8d() {
    assertEquals(
      "Ad8d 7c6c Qd6d 4dKs ThJd 3h6h",
      Solver.process("texas-holdem 4h7s9dKhQh 3h6h ThJd 4dKs Qd6d 7c6c Ad8d"));
  }

  @Test
  public void test_texas_holdem_7580_4d7h8sAdKs_9hKd_Ac2c_As9c_3d2s_Jc4c_8dJd_4sTs_7s3h_Qh6c() {
    assertEquals(
      "3d2s Qh6c 4sTs Jc4c 7s3h 8dJd 9hKd Ac2c As9c",
      Solver.process("texas-holdem 4d7h8sAdKs 9hKd Ac2c As9c 3d2s Jc4c 8dJd 4sTs 7s3h Qh6c"));
  }

  @Test
  public void test_texas_holdem_7581_6dAdAsTdTh_4d2s_7cQs_Jc9s_Jd2d_4sTc_8s5c() {
    assertEquals(
      "4d2s 8s5c Jc9s 7cQs Jd2d 4sTc",
      Solver.process("texas-holdem 6dAdAsTdTh 4d2s 7cQs Jc9s Jd2d 4sTc 8s5c"));
  }

  @Test
  public void test_texas_holdem_7582_2h3s4s8s9d_Ac7c_JcQc_Ks4d_7s9s_4cTh_5s8c_Td5c_6h6s_3c6c() {
    assertEquals(
      "Td5c JcQc Ac7c 3c6c 4cTh Ks4d 6h6s 5s8c 7s9s",
      Solver.process("texas-holdem 2h3s4s8s9d Ac7c JcQc Ks4d 7s9s 4cTh 5s8c Td5c 6h6s 3c6c"));
  }

  @Test
  public void test_texas_holdem_7583_4h5d9cQdTc_6h3h_5s7c_AcKs_5h8s_QhTh_KcKh_2dJs_3c2s_9s6s() {
    assertEquals(
      "3c2s 6h3h 2dJs AcKs 5h8s=5s7c 9s6s KcKh QhTh",
      Solver.process("texas-holdem 4h5d9cQdTc 6h3h 5s7c AcKs 5h8s QhTh KcKh 2dJs 3c2s 9s6s"));
  }

  @Test
  public void test_texas_holdem_7584_2c3s8s9sAd_TsQd_4d8d_3hQh_9dJs() {
    assertEquals(
      "TsQd 3hQh 4d8d 9dJs",
      Solver.process("texas-holdem 2c3s8s9sAd TsQd 4d8d 3hQh 9dJs"));
  }

  @Test
  public void test_texas_holdem_7585_5c6c7d7hTd_9c3d_KcQh() {
    assertEquals(
      "9c3d KcQh",
      Solver.process("texas-holdem 5c6c7d7hTd 9c3d KcQh"));
  }

  @Test
  public void test_texas_holdem_7586_7s8s9sAhJs_Qh2d_2c5c() {
    assertEquals(
      "2c5c Qh2d",
      Solver.process("texas-holdem 7s8s9sAhJs Qh2d 2c5c"));
  }

  @Test
  public void test_texas_holdem_7587_3s5h8cKhTh_3d5c_Js6d_Td6h_2sQh() {
    assertEquals(
      "Js6d 2sQh Td6h 3d5c",
      Solver.process("texas-holdem 3s5h8cKhTh 3d5c Js6d Td6h 2sQh"));
  }

  @Test
  public void test_texas_holdem_7588_3h8d9sKdKs_Ts2c_Qs8h() {
    assertEquals(
      "Ts2c Qs8h",
      Solver.process("texas-holdem 3h8d9sKdKs Ts2c Qs8h"));
  }

  @Test
  public void test_texas_holdem_7589_5c5s7s8hQs_8cAh_3s2s_2h3h_Jh4h_QhKd_As3c_6h3d_2d8s() {
    assertEquals(
      "2h3h=6h3d Jh4h As3c 2d8s 8cAh QhKd 3s2s",
      Solver.process("texas-holdem 5c5s7s8hQs 8cAh 3s2s 2h3h Jh4h QhKd As3c 6h3d 2d8s"));
  }

  @Test
  public void test_texas_holdem_7590_3h4s8cAsJs_7cQd_9hAh_Td7h_8hAc_9dTh_JhAd() {
    assertEquals(
      "Td7h 9dTh 7cQd 9hAh 8hAc JhAd",
      Solver.process("texas-holdem 3h4s8cAsJs 7cQd 9hAh Td7h 8hAc 9dTh JhAd"));
  }

  @Test
  public void test_texas_holdem_7591_2h3c3d8dJs_9h4c_6cJd_QdAh_AdAc_7h2c_7d5h() {
    assertEquals(
      "7d5h 9h4c QdAh 7h2c 6cJd AdAc",
      Solver.process("texas-holdem 2h3c3d8dJs 9h4c 6cJd QdAh AdAc 7h2c 7d5h"));
  }

  @Test
  public void test_texas_holdem_7592_2d7cAcJsTh_2c3d_TdTc_9dAd_3sQh_Qs9s_8h6d_4cKs() {
    assertEquals(
      "8h6d 3sQh Qs9s 4cKs 2c3d 9dAd TdTc",
      Solver.process("texas-holdem 2d7cAcJsTh 2c3d TdTc 9dAd 3sQh Qs9s 8h6d 4cKs"));
  }

  @Test
  public void test_texas_holdem_7593_2d2h3h9hAs_TsTh_5h5d_8hKc_7c8c() {
    assertEquals(
      "7c8c 8hKc 5h5d TsTh",
      Solver.process("texas-holdem 2d2h3h9hAs TsTh 5h5d 8hKc 7c8c"));
  }

  @Test
  public void test_texas_holdem_7594_3h8s9sAdQh_5s4d_3cKs_2d6c_As8h_JcJd_7cTc() {
    assertEquals(
      "5s4d 2d6c 7cTc 3cKs JcJd As8h",
      Solver.process("texas-holdem 3h8s9sAdQh 5s4d 3cKs 2d6c As8h JcJd 7cTc"));
  }

  @Test
  public void test_texas_holdem_7595_2s5h7s9dAc_JhTd_5cQs() {
    assertEquals(
      "JhTd 5cQs",
      Solver.process("texas-holdem 2s5h7s9dAc JhTd 5cQs"));
  }

  @Test
  public void test_texas_holdem_7596_3d5h8c9sTh_7dKs_7c6s() {
    assertEquals(
      "7dKs 7c6s",
      Solver.process("texas-holdem 3d5h8c9sTh 7dKs 7c6s"));
  }

  @Test
  public void test_texas_holdem_7597_4c5d8s9hAh_AsTd_5s6d_7c9s_5hTc_AcQc_Ks3c_QsKd() {
    assertEquals(
      "Ks3c QsKd 5s6d 5hTc 7c9s AsTd AcQc",
      Solver.process("texas-holdem 4c5d8s9hAh AsTd 5s6d 7c9s 5hTc AcQc Ks3c QsKd"));
  }

  @Test
  public void test_texas_holdem_7598_5d8sAdTdTs_Ks8c_Tc9d_3hJs_8h7s_QhKc_2c9s_9h4d_3s5s() {
    assertEquals(
      "2c9s=9h4d 3hJs QhKc 3s5s 8h7s=Ks8c Tc9d",
      Solver.process("texas-holdem 5d8sAdTdTs Ks8c Tc9d 3hJs 8h7s QhKc 2c9s 9h4d 3s5s"));
  }

  @Test
  public void test_texas_holdem_7599_2d2h5c6hKh_8d5h_7dTd_9c4c() {
    assertEquals(
      "9c4c 7dTd 8d5h",
      Solver.process("texas-holdem 2d2h5c6hKh 8d5h 7dTd 9c4c"));
  }

  @Test
  public void test_texas_holdem_7600_7d9sKdKsQh_2h4c_Qd8h() {
    assertEquals(
      "2h4c Qd8h",
      Solver.process("texas-holdem 7d9sKdKsQh 2h4c Qd8h"));
  }

  @Test
  public void test_texas_holdem_7601_6s7c8cAhKs_Kh6h_8h3c_5c3s_Ts7s() {
    assertEquals(
      "5c3s Ts7s 8h3c Kh6h",
      Solver.process("texas-holdem 6s7c8cAhKs Kh6h 8h3c 5c3s Ts7s"));
  }

  @Test
  public void test_texas_holdem_7602_4c5s7c9dAh_4d7s_8c8d_4s8s_Js8h_JhQc_QsTh_2d2c() {
    assertEquals(
      "Js8h QsTh JhQc 2d2c 4s8s 8c8d 4d7s",
      Solver.process("texas-holdem 4c5s7c9dAh 4d7s 8c8d 4s8s Js8h JhQc QsTh 2d2c"));
  }

  @Test
  public void test_texas_holdem_7603_3h9hAdKsTh_Js9s_7hQd_4s3s_As8c() {
    assertEquals(
      "7hQd 4s3s Js9s As8c",
      Solver.process("texas-holdem 3h9hAdKsTh Js9s 7hQd 4s3s As8c"));
  }

  @Test
  public void test_texas_holdem_7604_5h6sJhKhQs_2d8s_4d8c_8d4h_3h9c_Js6c_9d2h() {
    assertEquals(
      "2d8s=4d8c=8d4h 3h9c=9d2h Js6c",
      Solver.process("texas-holdem 5h6sJhKhQs 2d8s 4d8c 8d4h 3h9c Js6c 9d2h"));
  }

  @Test
  public void test_texas_holdem_7605_2h5h8c9cJs_3dAd_TcJh_Kh4s_9h2s_QcQd_3c7d_6s3h_4h8d_Th5c() {
    assertEquals(
      "6s3h 3c7d Kh4s 3dAd Th5c 4h8d TcJh QcQd 9h2s",
      Solver.process("texas-holdem 2h5h8c9cJs 3dAd TcJh Kh4s 9h2s QcQd 3c7d 6s3h 4h8d Th5c"));
  }

  @Test
  public void test_texas_holdem_7606_2s3d4sJhKs_8hKc_6d3c_7s8s_6c2h_AsQh_9s8c_5dTd_2d4c() {
    assertEquals(
      "9s8c 5dTd AsQh 6c2h 6d3c 8hKc 2d4c 7s8s",
      Solver.process("texas-holdem 2s3d4sJhKs 8hKc 6d3c 7s8s 6c2h AsQh 9s8c 5dTd 2d4c"));
  }

  @Test
  public void test_texas_holdem_7607_3sKsQhTcTd_2cJc_7hTs_KcJs_5d5h() {
    assertEquals(
      "2cJc 5d5h KcJs 7hTs",
      Solver.process("texas-holdem 3sKsQhTcTd 2cJc 7hTs KcJs 5d5h"));
  }

  @Test
  public void test_texas_holdem_7608_4h6s7hQsTs_QcQd_Jc9h_Jd9d_9s2h() {
    assertEquals(
      "9s2h Jc9h=Jd9d QcQd",
      Solver.process("texas-holdem 4h6s7hQsTs QcQd Jc9h Jd9d 9s2h"));
  }

  @Test
  public void test_texas_holdem_7609_6d6h8c8sKs_7s3s_4d8d() {
    assertEquals(
      "7s3s 4d8d",
      Solver.process("texas-holdem 6d6h8c8sKs 7s3s 4d8d"));
  }

  @Test
  public void test_texas_holdem_7610_4c7s8c9dTd_6dQh_Ah3d_5d8h_9h5h_Ks9s_QsTc_Th3c_TsAs_2h4d() {
    assertEquals(
      "Ah3d 2h4d 5d8h 9h5h Ks9s Th3c QsTc TsAs 6dQh",
      Solver.process("texas-holdem 4c7s8c9dTd 6dQh Ah3d 5d8h 9h5h Ks9s QsTc Th3c TsAs 2h4d"));
  }

  @Test
  public void test_texas_holdem_7611_6d9cAcAhJh_9dKc_5cQh_4dTs_Ad3h_3s6h() {
    assertEquals(
      "4dTs 5cQh 3s6h 9dKc Ad3h",
      Solver.process("texas-holdem 6d9cAcAhJh 9dKc 5cQh 4dTs Ad3h 3s6h"));
  }

  @Test
  public void test_texas_holdem_7612_4c7s8hJhTh_5cAs_6sTd_9dJc_Ah8d_Kh6h_Jd3c_5d2s_2h9c() {
    assertEquals(
      "5d2s 5cAs Ah8d 6sTd Jd3c 2h9c=9dJc Kh6h",
      Solver.process("texas-holdem 4c7s8hJhTh 5cAs 6sTd 9dJc Ah8d Kh6h Jd3c 5d2s 2h9c"));
  }

  @Test
  public void test_texas_holdem_7613_4h5c6cQsTh_9h7s_2sQd_2h6s_TsKd_8cJd_7c4d_7d6h_AhQc() {
    assertEquals(
      "9h7s 8cJd 7c4d 2h6s 7d6h TsKd 2sQd AhQc",
      Solver.process("texas-holdem 4h5c6cQsTh 9h7s 2sQd 2h6s TsKd 8cJd 7c4d 7d6h AhQc"));
  }

  @Test
  public void test_texas_holdem_7614_6c9hAdAsQd_2sKh_2c6s_4sAc_3cKs_QhTs() {
    assertEquals(
      "2sKh=3cKs 2c6s QhTs 4sAc",
      Solver.process("texas-holdem 6c9hAdAsQd 2sKh 2c6s 4sAc 3cKs QhTs"));
  }

  @Test
  public void test_texas_holdem_7615_2d2s4c5sQc_Ks6h_Tc3c_6s9c_4hKd_7hAh() {
    assertEquals(
      "6s9c Tc3c Ks6h 7hAh 4hKd",
      Solver.process("texas-holdem 2d2s4c5sQc Ks6h Tc3c 6s9c 4hKd 7hAh"));
  }

  @Test
  public void test_texas_holdem_7616_3h4c6d8sAh_9cAs_2h8h_Jc2d_7hJh_5dQd_6h3d_5s7c() {
    assertEquals(
      "Jc2d 7hJh 5dQd 2h8h 9cAs 6h3d 5s7c",
      Solver.process("texas-holdem 3h4c6d8sAh 9cAs 2h8h Jc2d 7hJh 5dQd 6h3d 5s7c"));
  }

  @Test
  public void test_texas_holdem_7617_2d3h6d9c9s_3c4s_3sKh_8hTd_7c8c() {
    assertEquals(
      "7c8c 8hTd 3c4s 3sKh",
      Solver.process("texas-holdem 2d3h6d9c9s 3c4s 3sKh 8hTd 7c8c"));
  }

  @Test
  public void test_texas_holdem_7618_2s6d7s8dTd_4hQc_4d8c_Qs3s_9c2h_4sTc_7d9d() {
    assertEquals(
      "4hQc=Qs3s 4d8c 4sTc 9c2h 7d9d",
      Solver.process("texas-holdem 2s6d7s8dTd 4hQc 4d8c Qs3s 9c2h 4sTc 7d9d"));
  }

  @Test
  public void test_texas_holdem_7619_3c5d6hJhTc_4hAd_Ac8c_3h7d_Kd3s_9c9s_2dTd_7c5h_2s5s() {
    assertEquals(
      "4hAd Ac8c 3h7d Kd3s 2s5s 7c5h 9c9s 2dTd",
      Solver.process("texas-holdem 3c5d6hJhTc 4hAd Ac8c 3h7d Kd3s 9c9s 2dTd 7c5h 2s5s"));
  }

  @Test
  public void test_texas_holdem_7620_2s3h5dJdKh_Ts8c_8dKd_9sAd_Ac6d_2dTc_Qh4d_Ah2c() {
    assertEquals(
      "Ts8c Qh4d Ac6d 9sAd 2dTc Ah2c 8dKd",
      Solver.process("texas-holdem 2s3h5dJdKh Ts8c 8dKd 9sAd Ac6d 2dTc Qh4d Ah2c"));
  }

  @Test
  public void test_texas_holdem_7621_6h8c9cJcJs_Jd7d_AdQs_3s3h_5c2s_8s5d_7s8h() {
    assertEquals(
      "5c2s AdQs 3s3h 7s8h=8s5d Jd7d",
      Solver.process("texas-holdem 6h8c9cJcJs Jd7d AdQs 3s3h 5c2s 8s5d 7s8h"));
  }

  @Test
  public void test_texas_holdem_7622_4dAhJdJhKh_4cAc_Js5s_7dQc_9c8s_2c8d_5hQd() {
    assertEquals(
      "2c8d 9c8s 5hQd=7dQc 4cAc Js5s",
      Solver.process("texas-holdem 4dAhJdJhKh 4cAc Js5s 7dQc 9c8s 2c8d 5hQd"));
  }

  @Test
  public void test_texas_holdem_7623_4s6h9hAcTd_2s5s_Ts5d_6dKs_Jc9c_6c3c() {
    assertEquals(
      "2s5s 6c3c 6dKs Jc9c Ts5d",
      Solver.process("texas-holdem 4s6h9hAcTd 2s5s Ts5d 6dKs Jc9c 6c3c"));
  }

  @Test
  public void test_texas_holdem_7624_3c5h7h9sAh_9d8d_Jc6h() {
    assertEquals(
      "Jc6h 9d8d",
      Solver.process("texas-holdem 3c5h7h9sAh 9d8d Jc6h"));
  }

  @Test
  public void test_texas_holdem_7625_2c9cAsKcQs_7s4c_5d6c() {
    assertEquals(
      "5d6c 7s4c",
      Solver.process("texas-holdem 2c9cAsKcQs 7s4c 5d6c"));
  }

  @Test
  public void test_texas_holdem_7626_7c8d9dJdQd_8sAh_KcKs_Ts8h_2h2d_4hQc() {
    assertEquals(
      "8sAh 4hQc KcKs Ts8h 2h2d",
      Solver.process("texas-holdem 7c8d9dJdQd 8sAh KcKs Ts8h 2h2d 4hQc"));
  }

  @Test
  public void test_texas_holdem_7627_6h8sJhQhTs_AcKs_ThJd_2c2s_7d9d_9cQd_Kd7c_7hKc() {
    assertEquals(
      "7hKc=Kd7c 2c2s ThJd 7d9d=9cQd AcKs",
      Solver.process("texas-holdem 6h8sJhQhTs AcKs ThJd 2c2s 7d9d 9cQd Kd7c 7hKc"));
  }

  @Test
  public void test_texas_holdem_7628_3d7d9dJhQs_2cTc_7c4c_4hTd_6s8s_TsAc_5cAh() {
    assertEquals(
      "6s8s 2cTc=4hTd 5cAh TsAc 7c4c",
      Solver.process("texas-holdem 3d7d9dJhQs 2cTc 7c4c 4hTd 6s8s TsAc 5cAh"));
  }

  @Test
  public void test_texas_holdem_7629_4d8cJhQcQh_4h3c_Kd5d_3hTc_3d2h_7s7d() {
    assertEquals(
      "3d2h 3hTc Kd5d 4h3c 7s7d",
      Solver.process("texas-holdem 4d8cJhQcQh 4h3c Kd5d 3hTc 3d2h 7s7d"));
  }

  @Test
  public void test_texas_holdem_7630_3s4d6c7hTs_Td9d_8sAd_Kh8h_5dQh_7d3h() {
    assertEquals(
      "Kh8h 8sAd Td9d 7d3h 5dQh",
      Solver.process("texas-holdem 3s4d6c7hTs Td9d 8sAd Kh8h 5dQh 7d3h"));
  }

  @Test
  public void test_texas_holdem_7631_9sAdAsQsTd_5c3c_Jc2h_4d2d_Ac2c_QdJd() {
    assertEquals(
      "4d2d=5c3c Jc2h QdJd Ac2c",
      Solver.process("texas-holdem 9sAdAsQsTd 5c3c Jc2h 4d2d Ac2c QdJd"));
  }

  @Test
  public void test_texas_holdem_7632_5c9c9hJsQc_8d4c_7c4d_Ac2h_9sJc_Td3c_9dAh_3s6c_8h4h_2cTh() {
    assertEquals(
      "3s6c 7c4d 8d4c=8h4h 2cTh=Td3c Ac2h 9dAh 9sJc",
      Solver.process("texas-holdem 5c9c9hJsQc 8d4c 7c4d Ac2h 9sJc Td3c 9dAh 3s6c 8h4h 2cTh"));
  }

  @Test
  public void test_texas_holdem_7633_2s3c4h8dAh_6h5c_6sKc_Qd9s_KdQh_5sAd_5d8h_4c8s_7sKh() {
    assertEquals(
      "Qd9s 6sKc 7sKh KdQh 4c8s 5d8h=5sAd 6h5c",
      Solver.process("texas-holdem 2s3c4h8dAh 6h5c 6sKc Qd9s KdQh 5sAd 5d8h 4c8s 7sKh"));
  }

  @Test
  public void test_texas_holdem_7634_7c7d7hAsTc_Js9s_7sAc_5d4c_8d2h_3s3c_4s3h_JcKs_6cKc() {
    assertEquals(
      "4s3h=5d4c=8d2h Js9s 6cKc=JcKs 3s3c 7sAc",
      Solver.process("texas-holdem 7c7d7hAsTc Js9s 7sAc 5d4c 8d2h 3s3c 4s3h JcKs 6cKc"));
  }

  @Test
  public void test_texas_holdem_7635_3c3h4s9dJh_TdTh_AcTs_JdJs_2sTc_3s8s_4d8d_6d6s() {
    assertEquals(
      "2sTc AcTs 4d8d 6d6s TdTh 3s8s JdJs",
      Solver.process("texas-holdem 3c3h4s9dJh TdTh AcTs JdJs 2sTc 3s8s 4d8d 6d6s"));
  }

  @Test
  public void test_texas_holdem_7636_4s8sJhTcTs_4hAc_3dTh_8d2s_9s6d_9c6h_Jd7d() {
    assertEquals(
      "9c6h=9s6d 4hAc 8d2s Jd7d 3dTh",
      Solver.process("texas-holdem 4s8sJhTcTs 4hAc 3dTh 8d2s 9s6d 9c6h Jd7d"));
  }

  @Test
  public void test_texas_holdem_7637_6h7c7hKdKh_3dJh_AsKs_6s2d_7dAd_2h4c_8d8c() {
    assertEquals(
      "2h4c=6s2d 3dJh 8d8c 7dAd AsKs",
      Solver.process("texas-holdem 6h7c7hKdKh 3dJh AsKs 6s2d 7dAd 2h4c 8d8c"));
  }

  @Test
  public void test_texas_holdem_7638_3s4cAhAsTs_Jd6d_2d3d_6h5h_Tc2c_8dJh_5d2s_9h7s_2h5c_4dQh() {
    assertEquals(
      "6h5h 9h7s Jd6d 8dJh 2d3d 4dQh Tc2c 2h5c=5d2s",
      Solver.process("texas-holdem 3s4cAhAsTs Jd6d 2d3d 6h5h Tc2c 8dJh 5d2s 9h7s 2h5c 4dQh"));
  }

  @Test
  public void test_texas_holdem_7639_2c3d5c5hTh_8s9d_2s6h_7s6c_Kh3h_4d2d() {
    assertEquals(
      "7s6c 8s9d 2s6h=4d2d Kh3h",
      Solver.process("texas-holdem 2c3d5c5hTh 8s9d 2s6h 7s6c Kh3h 4d2d"));
  }

  @Test
  public void test_texas_holdem_7640_5c5h6hKdQc_6s7s_7cJc_8h6c_AdJs_KcAs_8cJd_Kh8d_Qs2c_Ac3h() {
    assertEquals(
      "7cJc=8cJd Ac3h=AdJs 6s7s=8h6c Qs2c Kh8d KcAs",
      Solver.process("texas-holdem 5c5h6hKdQc 6s7s 7cJc 8h6c AdJs KcAs 8cJd Kh8d Qs2c Ac3h"));
  }

  @Test
  public void test_texas_holdem_7641_5d5hAcJcTh_9hAd_TcQd_4h2s_Kd4d_Ks5c_4cTd_8s6d_Kh9s() {
    assertEquals(
      "4h2s=8s6d Kd4d=Kh9s 4cTd=TcQd 9hAd Ks5c",
      Solver.process("texas-holdem 5d5hAcJcTh 9hAd TcQd 4h2s Kd4d Ks5c 4cTd 8s6d Kh9s"));
  }

  @Test
  public void test_texas_holdem_7642_4d4h9c9sJc_Kd8s_3c7c_7sTs_As2c_8hQd() {
    assertEquals(
      "3c7c=7sTs 8hQd Kd8s As2c",
      Solver.process("texas-holdem 4d4h9c9sJc Kd8s 3c7c 7sTs As2c 8hQd"));
  }

  @Test
  public void test_texas_holdem_7643_2h7d9sAhTs_9c8d_Jc8s_5s3s_6dKh_6c9h_2sAd() {
    assertEquals(
      "5s3s 6dKh 6c9h 9c8d 2sAd Jc8s",
      Solver.process("texas-holdem 2h7d9sAhTs 9c8d Jc8s 5s3s 6dKh 6c9h 2sAd"));
  }

  @Test
  public void test_texas_holdem_7644_3c5d7c9cKh_8c7d_9s4h_TdTh_KcAh() {
    assertEquals(
      "8c7d 9s4h TdTh KcAh",
      Solver.process("texas-holdem 3c5d7c9cKh 8c7d 9s4h TdTh KcAh"));
  }

  @Test
  public void test_texas_holdem_7645_3d4h6d6hQd_8s8h_5d4d_AdKh_7dQc_2s9h_2h6s() {
    assertEquals(
      "2s9h AdKh 8s8h 7dQc 2h6s 5d4d",
      Solver.process("texas-holdem 3d4h6d6hQd 8s8h 5d4d AdKh 7dQc 2s9h 2h6s"));
  }

  @Test
  public void test_texas_holdem_7646_3d4cAhKcQs_6c9c_JhQh_AcQc_5cJc_Td2c_5s5d_6s8d() {
    assertEquals(
      "6s8d 6c9c Td2c 5cJc 5s5d JhQh AcQc",
      Solver.process("texas-holdem 3d4cAhKcQs 6c9c JhQh AcQc 5cJc Td2c 5s5d 6s8d"));
  }

  @Test
  public void test_texas_holdem_7647_2c5c7h8hTc_5s9d_5d4d_6c7c_Kc8s_2d2h_Kd2s() {
    assertEquals(
      "Kd2s 5d4d 5s9d Kc8s 2d2h 6c7c",
      Solver.process("texas-holdem 2c5c7h8hTc 5s9d 5d4d 6c7c Kc8s 2d2h Kd2s"));
  }

  @Test
  public void test_texas_holdem_7648_3c4d4s9dJs_Kd5s_2hAs_8h3d_5c6s_8s4h_QsTs() {
    assertEquals(
      "5c6s QsTs Kd5s 2hAs 8h3d 8s4h",
      Solver.process("texas-holdem 3c4d4s9dJs Kd5s 2hAs 8h3d 5c6s 8s4h QsTs"));
  }

  @Test
  public void test_texas_holdem_7649_4s8hAcJsTh_3hAd_9hJc() {
    assertEquals(
      "9hJc 3hAd",
      Solver.process("texas-holdem 4s8hAcJsTh 3hAd 9hJc"));
  }

  @Test
  public void test_texas_holdem_7650_2d4c5c8hKh_Jd7c_3c9d_Td2h_4dKs_5d6d_9sTh_8c8d() {
    assertEquals(
      "3c9d 9sTh Jd7c Td2h 5d6d 4dKs 8c8d",
      Solver.process("texas-holdem 2d4c5c8hKh Jd7c 3c9d Td2h 4dKs 5d6d 9sTh 8c8d"));
  }

  @Test
  public void test_texas_holdem_7651_2c3h4h7cTc_7sTs_4d9d_6sJs() {
    assertEquals(
      "6sJs 4d9d 7sTs",
      Solver.process("texas-holdem 2c3h4h7cTc 7sTs 4d9d 6sJs"));
  }

  @Test
  public void test_texas_holdem_7652_3c5d6d8d9s_ThJd_Ts5h_6hJh_QsAc_As2h_6s7s_3d5c_AhTc() {
    assertEquals(
      "ThJd As2h AhTc QsAc Ts5h 6hJh 3d5c 6s7s",
      Solver.process("texas-holdem 3c5d6d8d9s ThJd Ts5h 6hJh QsAc As2h 6s7s 3d5c AhTc"));
  }

  @Test
  public void test_texas_holdem_7653_6dKcKdQcTc_AcQs_7sJh() {
    assertEquals(
      "7sJh AcQs",
      Solver.process("texas-holdem 6dKcKdQcTc AcQs 7sJh"));
  }

  @Test
  public void test_texas_holdem_7654_3d8c8h9hJd_2dJc_6d4c_7c4s_7h5h_6cQh() {
    assertEquals(
      "6d4c 7c4s=7h5h 6cQh 2dJc",
      Solver.process("texas-holdem 3d8c8h9hJd 2dJc 6d4c 7c4s 7h5h 6cQh"));
  }

  @Test
  public void test_texas_holdem_7655_3c5cAsQdQs_8s6h_2h9c_4s3s_QhJd_8dKd_7s2s_KcTd() {
    assertEquals(
      "7s2s 8s6h 2h9c 8dKd KcTd 4s3s QhJd",
      Solver.process("texas-holdem 3c5cAsQdQs 8s6h 2h9c 4s3s QhJd 8dKd 7s2s KcTd"));
  }

  @Test
  public void test_texas_holdem_7656_2d8hJcJsKh_AhQc_Tc3s_As2h_Jd8s() {
    assertEquals(
      "Tc3s AhQc As2h Jd8s",
      Solver.process("texas-holdem 2d8hJcJsKh AhQc Tc3s As2h Jd8s"));
  }

  @Test
  public void test_texas_holdem_7657_8c9cAsKdTd_5d3c_4d8d_6c9h_KsJc_AdKc() {
    assertEquals(
      "5d3c 4d8d 6c9h KsJc AdKc",
      Solver.process("texas-holdem 8c9cAsKdTd 5d3c 4d8d 6c9h KsJc AdKc"));
  }

  @Test
  public void test_texas_holdem_7658_2h5s7cAsJh_Qh2d_KhKs_7dKc_Ac4s_9s2c() {
    assertEquals(
      "9s2c Qh2d 7dKc KhKs Ac4s",
      Solver.process("texas-holdem 2h5s7cAsJh Qh2d KhKs 7dKc Ac4s 9s2c"));
  }

  @Test
  public void test_texas_holdem_7659_2h3c7s8sTc_Jd9s_3hAd_QsQh_6cAh_8hJs_Kh8d_7d7c_5h3d() {
    assertEquals(
      "6cAh 5h3d 3hAd 8hJs Kh8d QsQh 7d7c Jd9s",
      Solver.process("texas-holdem 2h3c7s8sTc Jd9s 3hAd QsQh 6cAh 8hJs Kh8d 7d7c 5h3d"));
  }

  @Test
  public void test_texas_holdem_7660_6s8sAsKsQd_7d8c_JhQh_9h3d_TsTd() {
    assertEquals(
      "9h3d 7d8c JhQh TsTd",
      Solver.process("texas-holdem 6s8sAsKsQd 7d8c JhQh 9h3d TsTd"));
  }

  @Test
  public void test_texas_holdem_7661_3c5s6d6s7h_9h9d_KhTs_Kc4h() {
    assertEquals(
      "KhTs 9h9d Kc4h",
      Solver.process("texas-holdem 3c5s6d6s7h 9h9d KhTs Kc4h"));
  }

  @Test
  public void test_texas_holdem_7662_8c8d8sAhQd_TsTc_3s9d_2s6d_6s3d_Ad9h_Jc5c_4h4d() {
    assertEquals(
      "2s6d=3s9d=6s3d=Jc5c 4h4d TsTc Ad9h",
      Solver.process("texas-holdem 8c8d8sAhQd TsTc 3s9d 2s6d 6s3d Ad9h Jc5c 4h4d"));
  }

  @Test
  public void test_texas_holdem_7663_2c3d6cJcQc_5d9h_9dAd_Jd8d_3c8c_QsKc_4sKh_Jh2s_QhTs() {
    assertEquals(
      "5d9h 4sKh 9dAd Jd8d QhTs Jh2s 3c8c QsKc",
      Solver.process("texas-holdem 2c3d6cJcQc 5d9h 9dAd Jd8d 3c8c QsKc 4sKh Jh2s QhTs"));
  }

  @Test
  public void test_texas_holdem_7664_2c4dJcJdJh_2s6s_7d9c_3hKd_Ks3d_7c6h_Th8d() {
    assertEquals(
      "7c6h 7d9c Th8d 3hKd=Ks3d 2s6s",
      Solver.process("texas-holdem 2c4dJcJdJh 2s6s 7d9c 3hKd Ks3d 7c6h Th8d"));
  }

  @Test
  public void test_texas_holdem_7665_3d5s6hAsKd_7s4c_3c4d_9hQh_3h6s_AcJc() {
    assertEquals(
      "9hQh 3c4d AcJc 3h6s 7s4c",
      Solver.process("texas-holdem 3d5s6hAsKd 7s4c 3c4d 9hQh 3h6s AcJc"));
  }

  @Test
  public void test_texas_holdem_7666_4h6d7sAhJs_8d5d_Td3d_3cKs_9d3s_6hQc_8sQd_4d9s() {
    assertEquals(
      "9d3s Td3d 8sQd 3cKs 4d9s 6hQc 8d5d",
      Solver.process("texas-holdem 4h6d7sAhJs 8d5d Td3d 3cKs 9d3s 6hQc 8sQd 4d9s"));
  }

  @Test
  public void test_texas_holdem_7667_2c4c4s7c8s_8hTs_Qd9s_3sKc_2hTh_7sAc_5hQs_Jh9c() {
    assertEquals(
      "Jh9c 5hQs Qd9s 3sKc 2hTh 7sAc 8hTs",
      Solver.process("texas-holdem 2c4c4s7c8s 8hTs Qd9s 3sKc 2hTh 7sAc 5hQs Jh9c"));
  }

  @Test
  public void test_texas_holdem_7668_3c3s9sAhKc_Jh5h_5dJc_5s8d_AsJs_6hQs_8h8s_2hQd_8c4s_2d4c() {
    assertEquals(
      "2d4c=5s8d=8c4s 5dJc=Jh5h 2hQd=6hQs 8h8s AsJs",
      Solver.process("texas-holdem 3c3s9sAhKc Jh5h 5dJc 5s8d AsJs 6hQs 8h8s 2hQd 8c4s 2d4c"));
  }

  @Test
  public void test_texas_holdem_7669_2d4s5sKdKs_6dAs_9sTc_JdQs_9d9c_6c5h_7hAh_Kc8s_4d4h() {
    assertEquals(
      "9sTc JdQs 6dAs 7hAh 6c5h 9d9c Kc8s 4d4h",
      Solver.process("texas-holdem 2d4s5sKdKs 6dAs 9sTc JdQs 9d9c 6c5h 7hAh Kc8s 4d4h"));
  }

  @Test
  public void test_texas_holdem_7670_2hKcQcQhTc_Ks5s_Ah7d_Qs6d_5cAs_8sQd() {
    assertEquals(
      "5cAs=Ah7d Ks5s 8sQd=Qs6d",
      Solver.process("texas-holdem 2hKcQcQhTc Ks5s Ah7d Qs6d 5cAs 8sQd"));
  }

  @Test
  public void test_texas_holdem_7671_4c6s8cAhAs_Tc7s_2hAd_6d9d_KsQc_3d4h_8s8h_5dTd_9s5h_QdKh() {
    assertEquals(
      "9s5h 5dTd Tc7s KsQc=QdKh 3d4h 6d9d 2hAd 8s8h",
      Solver.process("texas-holdem 4c6s8cAhAs Tc7s 2hAd 6d9d KsQc 3d4h 8s8h 5dTd 9s5h QdKh"));
  }

  @Test
  public void test_texas_holdem_7672_3c3h5h7cQs_7dKc_2hQc_Ah5d_9c6d_Kd7s() {
    assertEquals(
      "9c6d Ah5d 7dKc=Kd7s 2hQc",
      Solver.process("texas-holdem 3c3h5h7cQs 7dKc 2hQc Ah5d 9c6d Kd7s"));
  }

  @Test
  public void test_texas_holdem_7673_9sAsJsQsTh_2d4d_6h9d_7cJh_Ks3c_7h3h_Ac9h() {
    assertEquals(
      "2d4d=7h3h 6h9d 7cJh Ac9h Ks3c",
      Solver.process("texas-holdem 9sAsJsQsTh 2d4d 6h9d 7cJh Ks3c 7h3h Ac9h"));
  }

  @Test
  public void test_texas_holdem_7674_3c3h8c9dAh_Ts9c_JdJh_7hQc_9h7s_7dTh_Qs2h() {
    assertEquals(
      "7dTh 7hQc=Qs2h 9h7s=Ts9c JdJh",
      Solver.process("texas-holdem 3c3h8c9dAh Ts9c JdJh 7hQc 9h7s 7dTh Qs2h"));
  }

  @Test
  public void test_texas_holdem_7675_6c9cJcJhJs_8s4s_QhAh_2sQs_4c3d_2c5d_3hTs() {
    assertEquals(
      "2c5d=4c3d 8s4s 3hTs 2sQs QhAh",
      Solver.process("texas-holdem 6c9cJcJhJs 8s4s QhAh 2sQs 4c3d 2c5d 3hTs"));
  }

  @Test
  public void test_texas_holdem_7676_5h5s8c8hQc_As9h_8d7c_Jd4h_Td9s_AhTc_2hTs_6dKc() {
    assertEquals(
      "2hTs=Jd4h=Td9s 6dKc AhTc=As9h 8d7c",
      Solver.process("texas-holdem 5h5s8c8hQc As9h 8d7c Jd4h Td9s AhTc 2hTs 6dKc"));
  }

  @Test
  public void test_texas_holdem_7677_3h6d8hAcTh_8d2d_2c3c_Jh9d_Tc9s_3s2s_5hTd_4hAd_Js9h_Ts2h() {
    assertEquals(
      "Jh9d=Js9h 2c3c=3s2s 8d2d 5hTd=Ts2h Tc9s 4hAd",
      Solver.process("texas-holdem 3h6d8hAcTh 8d2d 2c3c Jh9d Tc9s 3s2s 5hTd 4hAd Js9h Ts2h"));
  }

  @Test
  public void test_texas_holdem_7678_3h5h8dJhKc_Kd9h_2hTd_Qh4s_2dAd_Tc7s_7dTs_Qc8s_6c4h_9s8c() {
    assertEquals(
      "6c4h 2hTd 7dTs=Tc7s Qh4s 2dAd 9s8c Qc8s Kd9h",
      Solver.process("texas-holdem 3h5h8dJhKc Kd9h 2hTd Qh4s 2dAd Tc7s 7dTs Qc8s 6c4h 9s8c"));
  }

  @Test
  public void test_texas_holdem_7679_3h6s7hQdTc_9cJc_4h8h() {
    assertEquals(
      "4h8h 9cJc",
      Solver.process("texas-holdem 3h6s7hQdTc 9cJc 4h8h"));
  }

  @Test
  public void test_texas_holdem_7680_4c4d8dAsJd_6cAd_2dTs_4s7s_AcTc() {
    assertEquals(
      "2dTs 6cAd=AcTc 4s7s",
      Solver.process("texas-holdem 4c4d8dAsJd 6cAd 2dTs 4s7s AcTc"));
  }

  @Test
  public void test_texas_holdem_7681_2s3c3s5s9s_Td8h_9c9h_AhAc_4hQh() {
    assertEquals(
      "Td8h 4hQh AhAc 9c9h",
      Solver.process("texas-holdem 2s3c3s5s9s Td8h 9c9h AhAc 4hQh"));
  }

  @Test
  public void test_texas_holdem_7682_3c7dJsQcTh_4s2c_7h9s_2hQh_Qd6c_8d5d_Ts9h_KhTd() {
    assertEquals(
      "4s2c 8d5d 7h9s Ts9h KhTd 2hQh=Qd6c",
      Solver.process("texas-holdem 3c7dJsQcTh 4s2c 7h9s 2hQh Qd6c 8d5d Ts9h KhTd"));
  }

  @Test
  public void test_texas_holdem_7683_4c5d6cKhTc_3hAc_Qs7h() {
    assertEquals(
      "Qs7h 3hAc",
      Solver.process("texas-holdem 4c5d6cKhTc 3hAc Qs7h"));
  }

  @Test
  public void test_texas_holdem_7684_2s4c5c9hTs_AhJh_Js2h_6d3c() {
    assertEquals(
      "AhJh Js2h 6d3c",
      Solver.process("texas-holdem 2s4c5c9hTs AhJh Js2h 6d3c"));
  }

  @Test
  public void test_texas_holdem_7685_2s4h5h6sAd_JdAs_4c2d_TdAc_4sKd_3dQc_Js6c_6dTc_9sKc_Th9h() {
    assertEquals(
      "Th9h 9sKc 4sKd 6dTc Js6c TdAc JdAs 4c2d 3dQc",
      Solver.process("texas-holdem 2s4h5h6sAd JdAs 4c2d TdAc 4sKd 3dQc Js6c 6dTc 9sKc Th9h"));
  }

  @Test
  public void test_texas_holdem_7686_4d7h8h9cQs_TcTh_2c9s_Kc7s_TsJs_4s4c_KsAh_Td5h() {
    assertEquals(
      "Td5h KsAh Kc7s 2c9s TcTh 4s4c TsJs",
      Solver.process("texas-holdem 4d7h8h9cQs TcTh 2c9s Kc7s TsJs 4s4c KsAh Td5h"));
  }

  @Test
  public void test_texas_holdem_7687_2c4s7hTdTs_Ac8h_9h2s_9s7d_AdKc_KsJh_Th9d_8dQc_Kd6h_JdQs() {
    assertEquals(
      "8dQc JdQs Kd6h KsJh Ac8h AdKc 9h2s 9s7d Th9d",
      Solver.process("texas-holdem 2c4s7hTdTs Ac8h 9h2s 9s7d AdKc KsJh Th9d 8dQc Kd6h JdQs"));
  }

  @Test
  public void test_texas_holdem_7688_3d4h5dJhKc_2cKh_KdTc_Ad3c_4c3h_9h4s_7h2h_7d5s() {
    assertEquals(
      "7h2h Ad3c 9h4s 7d5s 2cKh KdTc 4c3h",
      Solver.process("texas-holdem 3d4h5dJhKc 2cKh KdTc Ad3c 4c3h 9h4s 7h2h 7d5s"));
  }

  @Test
  public void test_texas_holdem_7689_2d7dAdKhQh_6d7h_7c3s_4cTs() {
    assertEquals(
      "4cTs 6d7h=7c3s",
      Solver.process("texas-holdem 2d7dAdKhQh 6d7h 7c3s 4cTs"));
  }

  @Test
  public void test_texas_holdem_7690_2h3d4d6cAh_As9c_6s5s_8d8c_KsKd_7d4s_AcTs_6h3s_9d3c() {
    assertEquals(
      "9d3c 7d4s 8d8c KsKd As9c AcTs 6h3s 6s5s",
      Solver.process("texas-holdem 2h3d4d6cAh As9c 6s5s 8d8c KsKd 7d4s AcTs 6h3s 9d3c"));
  }

  @Test
  public void test_texas_holdem_7691_3c4d4s7dJd_KhKs_Qc6h_AcTh_Jh8c_Td9h() {
    assertEquals(
      "Td9h Qc6h AcTh Jh8c KhKs",
      Solver.process("texas-holdem 3c4d4s7dJd KhKs Qc6h AcTh Jh8c Td9h"));
  }

  @Test
  public void test_texas_holdem_7692_3c6sKsQdQh_7d2s_7h2d_9d3s_8dTc_4s2c_4h6d() {
    assertEquals(
      "4s2c 7d2s=7h2d 8dTc 9d3s 4h6d",
      Solver.process("texas-holdem 3c6sKsQdQh 7d2s 7h2d 9d3s 8dTc 4s2c 4h6d"));
  }

  @Test
  public void test_texas_holdem_7693_3d6s9dAhJh_9h6d_5s7h_Kc8c_8sAs_AcKs() {
    assertEquals(
      "5s7h Kc8c 8sAs AcKs 9h6d",
      Solver.process("texas-holdem 3d6s9dAhJh 9h6d 5s7h Kc8c 8sAs AcKs"));
  }

  @Test
  public void test_texas_holdem_7694_5s9hKsQcTh_Ac9d_3dTc_8s6d_KdAd_6s2c_AsAh_3sJc_QdJs() {
    assertEquals(
      "6s2c 8s6d Ac9d 3dTc KdAd AsAh 3sJc=QdJs",
      Solver.process("texas-holdem 5s9hKsQcTh Ac9d 3dTc 8s6d KdAd 6s2c AsAh 3sJc QdJs"));
  }

  @Test
  public void test_texas_holdem_7695_3c7hKhKsTs_7s8s_2s2d_Qd9d_8c5d_5h4d_2cTh() {
    assertEquals(
      "5h4d 8c5d Qd9d 2s2d 7s8s 2cTh",
      Solver.process("texas-holdem 3c7hKhKsTs 7s8s 2s2d Qd9d 8c5d 5h4d 2cTh"));
  }

  @Test
  public void test_texas_holdem_7696_5d6cAcJhJs_4s3c_2c7h_Jc9d_Qc9c_Ts8c_Jd2h_6h5s_5h3d() {
    assertEquals(
      "4s3c 2c7h Ts8c Qc9c 5h3d 6h5s Jd2h Jc9d",
      Solver.process("texas-holdem 5d6cAcJhJs 4s3c 2c7h Jc9d Qc9c Ts8c Jd2h 6h5s 5h3d"));
  }

  @Test
  public void test_texas_holdem_7697_3h5c7d8c9s_JdJs_6d7c_AhTd_3dKc_5h9c_Ad2s() {
    assertEquals(
      "Ad2s AhTd 3dKc JdJs 5h9c 6d7c",
      Solver.process("texas-holdem 3h5c7d8c9s JdJs 6d7c AhTd 3dKc 5h9c Ad2s"));
  }

  @Test
  public void test_texas_holdem_7698_3s8s9hAcJd_7sAs_4c3c() {
    assertEquals(
      "4c3c 7sAs",
      Solver.process("texas-holdem 3s8s9hAcJd 7sAs 4c3c"));
  }

  @Test
  public void test_texas_holdem_7699_3d6h7sQcTh_2s2d_3h4h_5d5s_4d4s_7c4c_QhAc() {
    assertEquals(
      "2s2d 3h4h 4d4s 5d5s 7c4c QhAc",
      Solver.process("texas-holdem 3d6h7sQcTh 2s2d 3h4h 5d5s 4d4s 7c4c QhAc"));
  }

  @Test
  public void test_texas_holdem_7700_2s7s9hJhKc_4cTd_8h5s_7d3s() {
    assertEquals(
      "8h5s 4cTd 7d3s",
      Solver.process("texas-holdem 2s7s9hJhKc 4cTd 8h5s 7d3s"));
  }

  @Test
  public void test_texas_holdem_7701_5cAcAsQdTh_Kc9c_7cAd_3c9h() {
    assertEquals(
      "3c9h Kc9c 7cAd",
      Solver.process("texas-holdem 5cAcAsQdTh Kc9c 7cAd 3c9h"));
  }

  @Test
  public void test_texas_holdem_7702_4s6s8sJcJd_5s4c_Qc3s_TdAs_5h6h_2d6d() {
    assertEquals(
      "Qc3s TdAs 5s4c 2d6d=5h6h",
      Solver.process("texas-holdem 4s6s8sJcJd 5s4c Qc3s TdAs 5h6h 2d6d"));
  }

  @Test
  public void test_texas_holdem_7703_3d4h5c7hJh_Ad6s_9h8h_2s3c_2hAh_2dKc_Jc7s() {
    assertEquals(
      "2dKc 2s3c Jc7s Ad6s 9h8h 2hAh",
      Solver.process("texas-holdem 3d4h5c7hJh Ad6s 9h8h 2s3c 2hAh 2dKc Jc7s"));
  }

  @Test
  public void test_texas_holdem_7704_2c3h5s6cQd_5h7h_Jh3d() {
    assertEquals(
      "Jh3d 5h7h",
      Solver.process("texas-holdem 2c3h5s6cQd 5h7h Jh3d"));
  }

  @Test
  public void test_texas_holdem_7705_3d5c6s7sTh_Ts4d_6c5d_KdAd() {
    assertEquals(
      "KdAd 6c5d Ts4d",
      Solver.process("texas-holdem 3d5c6s7sTh Ts4d 6c5d KdAd"));
  }

  @Test
  public void test_texas_holdem_7706_2c2d5d9hQd_3h8s_JsKh_JdQc_Kc7s_8hKd() {
    assertEquals(
      "3h8s 8hKd=Kc7s JsKh JdQc",
      Solver.process("texas-holdem 2c2d5d9hQd 3h8s JsKh JdQc Kc7s 8hKd"));
  }

  @Test
  public void test_texas_holdem_7707_2h3c4d5sKs_ThQs_2d7s_4h2s_5dKh_Qh3d_6sTd_8d7d_Ac9s_9dTc() {
    assertEquals(
      "8d7d 9dTc ThQs 2d7s Qh3d 4h2s 5dKh Ac9s 6sTd",
      Solver.process("texas-holdem 2h3c4d5sKs ThQs 2d7s 4h2s 5dKh Qh3d 6sTd 8d7d Ac9s 9dTc"));
  }

  @Test
  public void test_texas_holdem_7708_5c9cAcAsJc_2d5h_6c7c_JdTc() {
    assertEquals(
      "2d5h 6c7c JdTc",
      Solver.process("texas-holdem 5c9cAcAsJc 2d5h 6c7c JdTc"));
  }

  @Test
  public void test_texas_holdem_7709_2h3cJdKcQh_9cTh_3d5c_AdAc_Td6c_5h4s() {
    assertEquals(
      "5h4s Td6c 3d5c AdAc 9cTh",
      Solver.process("texas-holdem 2h3cJdKcQh 9cTh 3d5c AdAc Td6c 5h4s"));
  }

  @Test
  public void test_texas_holdem_7710_5c6cAdQsTd_4sQh_Kh8h_JsKd_7d6h_7c5h() {
    assertEquals(
      "Kh8h 7c5h 7d6h 4sQh JsKd",
      Solver.process("texas-holdem 5c6cAdQsTd 4sQh Kh8h JsKd 7d6h 7c5h"));
  }

  @Test
  public void test_texas_holdem_7711_3dJhKdKsTh_6c8d_8hJc_9c2s_2d9h_JdKh_4d5c_Qd7s() {
    assertEquals(
      "4d5c 6c8d 2d9h=9c2s Qd7s 8hJc JdKh",
      Solver.process("texas-holdem 3dJhKdKsTh 6c8d 8hJc 9c2s 2d9h JdKh 4d5c Qd7s"));
  }

  @Test
  public void test_texas_holdem_7712_4s7d7hAdJh_Js5s_8sJd_2c9h_2d6h_9dAs_Qd8h() {
    assertEquals(
      "2d6h 2c9h Qd8h 8sJd=Js5s 9dAs",
      Solver.process("texas-holdem 4s7d7hAdJh Js5s 8sJd 2c9h 2d6h 9dAs Qd8h"));
  }

  @Test
  public void test_texas_holdem_7713_2c3d4d7sJd_9h9d_8h8s_Jh7h() {
    assertEquals(
      "8h8s 9h9d Jh7h",
      Solver.process("texas-holdem 2c3d4d7sJd 9h9d 8h8s Jh7h"));
  }

  @Test
  public void test_texas_holdem_7714_3s5s8c9sKh_9c2c_7sQs_Tc4d_6h3h_2sTh_TdJs_5d6s_Qd6c_2h2d() {
    assertEquals(
      "2sTh=Tc4d TdJs Qd6c 2h2d 6h3h 5d6s 9c2c 7sQs",
      Solver.process("texas-holdem 3s5s8c9sKh 9c2c 7sQs Tc4d 6h3h 2sTh TdJs 5d6s Qd6c 2h2d"));
  }

  @Test
  public void test_texas_holdem_7715_2d4h9sAcQs_2h7h_ThJd() {
    assertEquals(
      "ThJd 2h7h",
      Solver.process("texas-holdem 2d4h9sAcQs 2h7h ThJd"));
  }

  @Test
  public void test_texas_holdem_7716_3s6h8cJcJs_AsKh_Jd7s_TcQh_5h7h_4s9d_Ks3d_4c7d_5c8h_5s9c() {
    assertEquals(
      "4c7d=5h7h 4s9d=5s9c TcQh AsKh Ks3d 5c8h Jd7s",
      Solver.process("texas-holdem 3s6h8cJcJs AsKh Jd7s TcQh 5h7h 4s9d Ks3d 4c7d 5c8h 5s9c"));
  }

  @Test
  public void test_texas_holdem_7717_5s8c8sJcTh_6s6h_Jh9c_Kd5d_Jd2c_3d9d_Kh8d_3hAc_Qh4s_4d3s() {
    assertEquals(
      "4d3s 3d9d Qh4s 3hAc Kd5d 6s6h Jd2c=Jh9c Kh8d",
      Solver.process("texas-holdem 5s8c8sJcTh 6s6h Jh9c Kd5d Jd2c 3d9d Kh8d 3hAc Qh4s 4d3s"));
  }

  @Test
  public void test_texas_holdem_7718_2c3d7s8dTd_Jc8s_KdAd_Kh8c_4dJs() {
    assertEquals(
      "4dJs Jc8s Kh8c KdAd",
      Solver.process("texas-holdem 2c3d7s8dTd Jc8s KdAd Kh8c 4dJs"));
  }

  @Test
  public void test_texas_holdem_7719_2h6s7d8cJs_5d3d_Ah6d_3h5s_Kh8d_4cKc_4dTh_9sJc_Ts7h_2s3c() {
    assertEquals(
      "3h5s=5d3d 4dTh 4cKc 2s3c Ah6d Ts7h Kh8d 9sJc",
      Solver.process("texas-holdem 2h6s7d8cJs 5d3d Ah6d 3h5s Kh8d 4cKc 4dTh 9sJc Ts7h 2s3c"));
  }

  @Test
  public void test_texas_holdem_7720_4h8hJcJhQs_Qh6s_5c3d_Ac2d_9cQd_Qc2c_3c6d_As9h_7s3s() {
    assertEquals(
      "5c3d 3c6d 7s3s Ac2d As9h Qc2c=Qh6s 9cQd",
      Solver.process("texas-holdem 4h8hJcJhQs Qh6s 5c3d Ac2d 9cQd Qc2c 3c6d As9h 7s3s"));
  }

  @Test
  public void test_texas_holdem_7721_5h7c8h8sKs_9d3d_9c2c_6h7h_6cKc_5dQh_3h4c_8c3s_QcQd_9sTd() {
    assertEquals(
      "3h4c 9c2c=9d3d 9sTd 5dQh 6h7h QcQd 6cKc 8c3s",
      Solver.process("texas-holdem 5h7c8h8sKs 9d3d 9c2c 6h7h 6cKc 5dQh 3h4c 8c3s QcQd 9sTd"));
  }

  @Test
  public void test_texas_holdem_7722_2d5sJhKhQh_Kc8c_Ac6d_4h8d_6c5h_QcTc_7s2c_9d7c_Js2s() {
    assertEquals(
      "4h8d 9d7c Ac6d 7s2c 6c5h QcTc Kc8c Js2s",
      Solver.process("texas-holdem 2d5sJhKhQh Kc8c Ac6d 4h8d 6c5h QcTc 7s2c 9d7c Js2s"));
  }

  @Test
  public void test_texas_holdem_7723_2h4hJsKsTh_9h5h_Qc8s_Qs4s_3sAh() {
    assertEquals(
      "Qc8s 3sAh Qs4s 9h5h",
      Solver.process("texas-holdem 2h4hJsKsTh 9h5h Qc8s Qs4s 3sAh"));
  }

  @Test
  public void test_texas_holdem_7724_3s5h6h9hTs_6d3d_Js4s_Tc3c_7c2c_3h4d_Kh6c() {
    assertEquals(
      "7c2c Js4s 3h4d Kh6c 6d3d Tc3c",
      Solver.process("texas-holdem 3s5h6h9hTs 6d3d Js4s Tc3c 7c2c 3h4d Kh6c"));
  }

  @Test
  public void test_texas_holdem_7725_3h4h8dJcKc_3dTd_TsQs_4c6h_Ks5c_Jh7h_2hQc() {
    assertEquals(
      "2hQc TsQs 3dTd 4c6h Jh7h Ks5c",
      Solver.process("texas-holdem 3h4h8dJcKc 3dTd TsQs 4c6h Ks5c Jh7h 2hQc"));
  }

  @Test
  public void test_texas_holdem_7726_2c5d6d8hTh_Kd9c_TcKc_Js3d_Jc2s_Qs3s_8sAc_As3c() {
    assertEquals(
      "Js3d Qs3s Kd9c As3c Jc2s 8sAc TcKc",
      Solver.process("texas-holdem 2c5d6d8hTh Kd9c TcKc Js3d Jc2s Qs3s 8sAc As3c"));
  }

  @Test
  public void test_texas_holdem_7727_4s5s7h8sJs_3d2h_9dJh_6c5c_JdAs_Jc5d_9h6s_Kd9s_Tc4h_2sQd() {
    assertEquals(
      "3d2h Tc4h 9dJh Jc5d 6c5c 2sQd 9h6s Kd9s JdAs",
      Solver.process("texas-holdem 4s5s7h8sJs 3d2h 9dJh 6c5c JdAs Jc5d 9h6s Kd9s Tc4h 2sQd"));
  }

  @Test
  public void test_texas_holdem_7728_2c6cAsKcKd_5c5h_3c5s_Qd6s_7h7d_3sTs_Qs9c_TdKh_4sTh_8d4h() {
    assertEquals(
      "3c5s 8d4h 3sTs=4sTh Qs9c 5c5h Qd6s 7h7d TdKh",
      Solver.process("texas-holdem 2c6cAsKcKd 5c5h 3c5s Qd6s 7h7d 3sTs Qs9c TdKh 4sTh 8d4h"));
  }

  @Test
  public void test_texas_holdem_7729_2h4d5c6dAh_6s3c_Qd8d_2c9s_Ad3s_KdKs_5hKh_5d3d_2d9d_AcTh() {
    assertEquals(
      "Qd8d 2c9s=2d9d 5hKh KdKs AcTh 5d3d=6s3c=Ad3s",
      Solver.process("texas-holdem 2h4d5c6dAh 6s3c Qd8d 2c9s Ad3s KdKs 5hKh 5d3d 2d9d AcTh"));
  }

  @Test
  public void test_texas_holdem_7730_2d9hKhTcTd_Ts6d_4c2s_AdAs_5h3c_4sQs_KsQd() {
    assertEquals(
      "5h3c 4sQs 4c2s KsQd AdAs Ts6d",
      Solver.process("texas-holdem 2d9hKhTcTd Ts6d 4c2s AdAs 5h3c 4sQs KsQd"));
  }

  @Test
  public void test_texas_holdem_7731_5h9hAsKdQh_2c8s_Th9c() {
    assertEquals(
      "2c8s Th9c",
      Solver.process("texas-holdem 5h9hAsKdQh 2c8s Th9c"));
  }

  @Test
  public void test_texas_holdem_7732_4s9dJhKcQs_3d2s_3c3s_9h6s_5h6c_Kd9c_7hJc() {
    assertEquals(
      "3d2s 5h6c 3c3s 9h6s 7hJc Kd9c",
      Solver.process("texas-holdem 4s9dJhKcQs 3d2s 3c3s 9h6s 5h6c Kd9c 7hJc"));
  }

  @Test
  public void test_texas_holdem_7733_2c6s9sQcTd_9cAd_KdJc_3h5d_5c4c() {
    assertEquals(
      "3h5d=5c4c 9cAd KdJc",
      Solver.process("texas-holdem 2c6s9sQcTd 9cAd KdJc 3h5d 5c4c"));
  }

  @Test
  public void test_texas_holdem_7734_2h2s3d3sQc_4dTc_4hJd_AhJc_7c9c_Ad5h() {
    assertEquals(
      "4dTc=4hJd=7c9c Ad5h=AhJc",
      Solver.process("texas-holdem 2h2s3d3sQc 4dTc 4hJd AhJc 7c9c Ad5h"));
  }

  @Test
  public void test_texas_holdem_7735_7sAsJsQsTs_8s4c_5c4h() {
    assertEquals(
      "5c4h 8s4c",
      Solver.process("texas-holdem 7sAsJsQsTs 8s4c 5c4h"));
  }

  @Test
  public void test_texas_holdem_7736_2sAcAsJdQc_7cTh_TcJs() {
    assertEquals(
      "7cTh TcJs",
      Solver.process("texas-holdem 2sAcAsJdQc 7cTh TcJs"));
  }

  @Test
  public void test_texas_holdem_7737_3dAcJdQdQh_6c2c_6d9c_2s5h_TdAh_9h8c_Qc8h() {
    assertEquals(
      "2s5h 6c2c 6d9c=9h8c TdAh Qc8h",
      Solver.process("texas-holdem 3dAcJdQdQh 6c2c 6d9c 2s5h TdAh 9h8c Qc8h"));
  }

  @Test
  public void test_texas_holdem_7738_3h5c8cAhKh_JdKd_7cAs_Js8h() {
    assertEquals(
      "Js8h JdKd 7cAs",
      Solver.process("texas-holdem 3h5c8cAhKh JdKd 7cAs Js8h"));
  }

  @Test
  public void test_texas_holdem_7739_5dKdKhThTs_Jd4h_JhQd_8hTd_Js7d_Qh9s_2h8c_3s4s_6d2c() {
    assertEquals(
      "3s4s 6d2c 2h8c Jd4h=Js7d JhQd=Qh9s 8hTd",
      Solver.process("texas-holdem 5dKdKhThTs Jd4h JhQd 8hTd Js7d Qh9s 2h8c 3s4s 6d2c"));
  }

  @Test
  public void test_texas_holdem_7740_6c9sAsKhTc_4hAh_Jh8s_4s3c_3d5s_KsQd_Qs2s_4c6d_5h9c_3sQc() {
    assertEquals(
      "3d5s=4s3c Jh8s 3sQc=Qs2s 4c6d 5h9c KsQd 4hAh",
      Solver.process("texas-holdem 6c9sAsKhTc 4hAh Jh8s 4s3c 3d5s KsQd Qs2s 4c6d 5h9c 3sQc"));
  }

  @Test
  public void test_texas_holdem_7741_3d4c4s8dQs_2h8c_2s3h_7dJs_TsKs_7s3s() {
    assertEquals(
      "7dJs TsKs 2s3h=7s3s 2h8c",
      Solver.process("texas-holdem 3d4c4s8dQs 2h8c 2s3h 7dJs TsKs 7s3s"));
  }

  @Test
  public void test_texas_holdem_7742_5h8h9dQhTs_5dJh_6d5s_7dKs_4sTh_6s4d() {
    assertEquals(
      "6s4d 7dKs 6d5s 4sTh 5dJh",
      Solver.process("texas-holdem 5h8h9dQhTs 5dJh 6d5s 7dKs 4sTh 6s4d"));
  }

  @Test
  public void test_texas_holdem_7743_4s5d6h7cTd_Jd3h_4cKh_Qd6s_9d5h_9h8s_4d5s_Qh2h_JhJc_4h7h() {
    assertEquals(
      "Qh2h 4cKh 9d5h Qd6s JhJc 4d5s 4h7h Jd3h 9h8s",
      Solver.process("texas-holdem 4s5d6h7cTd Jd3h 4cKh Qd6s 9d5h 9h8s 4d5s Qh2h JhJc 4h7h"));
  }

  @Test
  public void test_texas_holdem_7744_2d5c5dTdTh_2s4s_Ts3d_7d6d_3s8c() {
    assertEquals(
      "2s4s 3s8c 7d6d Ts3d",
      Solver.process("texas-holdem 2d5c5dTdTh 2s4s Ts3d 7d6d 3s8c"));
  }

  @Test
  public void test_texas_holdem_7745_3cAsJsQhTc_3sTd_Qs4c_Qd4h_7d5d_2d8s_AhKc() {
    assertEquals(
      "7d5d 2d8s Qd4h=Qs4c 3sTd AhKc",
      Solver.process("texas-holdem 3cAsJsQhTc 3sTd Qs4c Qd4h 7d5d 2d8s AhKc"));
  }

  @Test
  public void test_texas_holdem_7746_3c4dJhQcTd_7hAh_8dTh_9hTs_KcAs() {
    assertEquals(
      "7hAh 8dTh 9hTs KcAs",
      Solver.process("texas-holdem 3c4dJhQcTd 7hAh 8dTh 9hTs KcAs"));
  }

  @Test
  public void test_texas_holdem_7747_2h5d5hAdKd_Ts8c_9sJh_5s6d_6cQd() {
    assertEquals(
      "Ts8c 9sJh 6cQd 5s6d",
      Solver.process("texas-holdem 2h5d5hAdKd Ts8c 9sJh 5s6d 6cQd"));
  }

  @Test
  public void test_texas_holdem_7748_2cJcTcTdTh_5d3h_Qh3d_6d4s_8cKd_7h2h_4d6s_4hAd() {
    assertEquals(
      "5d3h 4d6s=6d4s Qh3d 8cKd 4hAd 7h2h",
      Solver.process("texas-holdem 2cJcTcTdTh 5d3h Qh3d 6d4s 8cKd 7h2h 4d6s 4hAd"));
  }

  @Test
  public void test_texas_holdem_7749_3s4c6sJcJd_3c2d_8h4h() {
    assertEquals(
      "3c2d 8h4h",
      Solver.process("texas-holdem 3s4c6sJcJd 3c2d 8h4h"));
  }

}
