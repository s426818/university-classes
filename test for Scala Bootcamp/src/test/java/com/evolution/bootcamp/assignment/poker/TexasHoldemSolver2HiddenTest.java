
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver2HiddenTest {


  @Test
  public void test_texas_holdem_500_3s9hQdQhTd_2s6c_9s9d_6h7h_7sQc() {
    assertEquals(
      "2s6c 6h7h 7sQc 9s9d",
      Solver.process("texas-holdem 3s9hQdQhTd 2s6c 9s9d 6h7h 7sQc"));
  }

  @Test
  public void test_texas_holdem_501_2c5d5h7sKd_Qh8h_9sKs_Jh4d_9h3d() {
    assertEquals(
      "9h3d Jh4d Qh8h 9sKs",
      Solver.process("texas-holdem 2c5d5h7sKd Qh8h 9sKs Jh4d 9h3d"));
  }

  @Test
  public void test_texas_holdem_502_2c9c9dJcQs_AdAh_7c3c_AsKh_3d4s_6sKs_Kc9s() {
    assertEquals(
      "3d4s 6sKs AsKh AdAh Kc9s 7c3c",
      Solver.process("texas-holdem 2c9c9dJcQs AdAh 7c3c AsKh 3d4s 6sKs Kc9s"));
  }

  @Test
  public void test_texas_holdem_503_2h3h5h6sTs_5s6c_7c6h_8d7s_9hAc_Qh3s_AhKs_4s4c() {
    assertEquals(
      "8d7s 9hAc AhKs Qh3s 7c6h 5s6c 4s4c",
      Solver.process("texas-holdem 2h3h5h6sTs 5s6c 7c6h 8d7s 9hAc Qh3s AhKs 4s4c"));
  }

  @Test
  public void test_texas_holdem_504_3c6h8d8h9c_Js4h_Qh3d_6sAh_8s5s() {
    assertEquals(
      "Js4h Qh3d 6sAh 8s5s",
      Solver.process("texas-holdem 3c6h8d8h9c Js4h Qh3d 6sAh 8s5s"));
  }

  @Test
  public void test_texas_holdem_505_5c9cJcKcKs_2sAd_ThAc_JdAh_8cTd() {
    assertEquals(
      "2sAd JdAh 8cTd ThAc",
      Solver.process("texas-holdem 5c9cJcKcKs 2sAd ThAc JdAh 8cTd"));
  }

  @Test
  public void test_texas_holdem_506_3c7h9sAdQc_4hKs_7dJh_Qs4c_Js2h_Jd5s_6s5h() {
    assertEquals(
      "6s5h Jd5s=Js2h 4hKs 7dJh Qs4c",
      Solver.process("texas-holdem 3c7h9sAdQc 4hKs 7dJh Qs4c Js2h Jd5s 6s5h"));
  }

  @Test
  public void test_texas_holdem_507_5s8cAhThTs_As4c_Ac5d() {
    assertEquals(
      "Ac5d=As4c",
      Solver.process("texas-holdem 5s8cAhThTs As4c Ac5d"));
  }

  @Test
  public void test_texas_holdem_508_4h5h5s7sKd_9c6h_Td9h_Js6c_AsKh_Th5d() {
    assertEquals(
      "9c6h Td9h Js6c AsKh Th5d",
      Solver.process("texas-holdem 4h5h5s7sKd 9c6h Td9h Js6c AsKh Th5d"));
  }

  @Test
  public void test_texas_holdem_509_4hJhKcKdTs_3c8h_9dTd_JsJd_9sKh() {
    assertEquals(
      "3c8h 9dTd 9sKh JsJd",
      Solver.process("texas-holdem 4hJhKcKdTs 3c8h 9dTd JsJd 9sKh"));
  }

  @Test
  public void test_texas_holdem_510_3h8dJsQhTs_8h6h_AhKc_4c5c_2d3d_Qs8c_AcJc_2sTd_5sKd_6c7d() {
    assertEquals(
      "4c5c 6c7d 5sKd 2d3d 8h6h 2sTd AcJc Qs8c AhKc",
      Solver.process("texas-holdem 3h8dJsQhTs 8h6h AhKc 4c5c 2d3d Qs8c AcJc 2sTd 5sKd 6c7d"));
  }

  @Test
  public void test_texas_holdem_511_2c4cJcJdQh_Th6h_2hQc() {
    assertEquals(
      "Th6h 2hQc",
      Solver.process("texas-holdem 2c4cJcJdQh Th6h 2hQc"));
  }

  @Test
  public void test_texas_holdem_512_6h8d8sAhTh_8h2c_TsAc_4h3d() {
    assertEquals(
      "4h3d TsAc 8h2c",
      Solver.process("texas-holdem 6h8d8sAhTh 8h2c TsAc 4h3d"));
  }

  @Test
  public void test_texas_holdem_513_5d5hJsTdTh_2cKh_9h3h_4h3s() {
    assertEquals(
      "4h3s=9h3h 2cKh",
      Solver.process("texas-holdem 5d5hJsTdTh 2cKh 9h3h 4h3s"));
  }

  @Test
  public void test_texas_holdem_514_6d6h9sKhTh_Kc9d_Ks6s_Qd2c_AdTd_Tc4h_Jd6c_5sAc() {
    assertEquals(
      "Qd2c 5sAc Tc4h AdTd Kc9d Jd6c Ks6s",
      Solver.process("texas-holdem 6d6h9sKhTh Kc9d Ks6s Qd2c AdTd Tc4h Jd6c 5sAc"));
  }

  @Test
  public void test_texas_holdem_515_2d4s6s8hJd_8c7h_8s5d_6cTc_9hJs_JcTd_7s8d_9s2c_2h3c_9d9c() {
    assertEquals(
      "2h3c 9s2c 6cTc 8s5d 7s8d=8c7h 9d9c 9hJs JcTd",
      Solver.process("texas-holdem 2d4s6s8hJd 8c7h 8s5d 6cTc 9hJs JcTd 7s8d 9s2c 2h3c 9d9c"));
  }

  @Test
  public void test_texas_holdem_516_2h2s3d5h8c_9h5c_JdTc_9c7s() {
    assertEquals(
      "9c7s JdTc 9h5c",
      Solver.process("texas-holdem 2h2s3d5h8c 9h5c JdTc 9c7s"));
  }

  @Test
  public void test_texas_holdem_517_2d2s5hAcJh_9dTs_JcKh_Th4s_Jd4h_QhQs() {
    assertEquals(
      "9dTs=Th4s JcKh=Jd4h QhQs",
      Solver.process("texas-holdem 2d2s5hAcJh 9dTs JcKh Th4s Jd4h QhQs"));
  }

  @Test
  public void test_texas_holdem_518_3s4c6c9dJs_QdJc_3c7c_6s7s_2h8s_Ac9s() {
    assertEquals(
      "2h8s 3c7c 6s7s Ac9s QdJc",
      Solver.process("texas-holdem 3s4c6c9dJs QdJc 3c7c 6s7s 2h8s Ac9s"));
  }

  @Test
  public void test_texas_holdem_519_5s9cJcKcQc_7h7s_9s2c_QhAc_AsKh_9d4c_2h8s() {
    assertEquals(
      "2h8s 7h7s AsKh 9s2c 9d4c QhAc",
      Solver.process("texas-holdem 5s9cJcKcQc 7h7s 9s2c QhAc AsKh 9d4c 2h8s"));
  }

  @Test
  public void test_texas_holdem_520_2c2h5s9cJs_Ks4c_Th4d_9d8d_8h4h_QsQd_7s3s() {
    assertEquals(
      "7s3s 8h4h Th4d Ks4c 9d8d QsQd",
      Solver.process("texas-holdem 2c2h5s9cJs Ks4c Th4d 9d8d 8h4h QsQd 7s3s"));
  }

  @Test
  public void test_texas_holdem_521_4s6s8dJdTc_Th3d_6d4c() {
    assertEquals(
      "Th3d 6d4c",
      Solver.process("texas-holdem 4s6s8dJdTc Th3d 6d4c"));
  }

  @Test
  public void test_texas_holdem_522_4d7h8c8d8h_AdKs_7d6c_Td6h_4s6d() {
    assertEquals(
      "Td6h AdKs 4s6d 7d6c",
      Solver.process("texas-holdem 4d7h8c8d8h AdKs 7d6c Td6h 4s6d"));
  }

  @Test
  public void test_texas_holdem_523_6sJsKcQsTd_9c8c_3sQc_3cAs_7c2h_5c4s_4d5h() {
    assertEquals(
      "4d5h=5c4s 7c2h 3sQc 9c8c 3cAs",
      Solver.process("texas-holdem 6sJsKcQsTd 9c8c 3sQc 3cAs 7c2h 5c4s 4d5h"));
  }

  @Test
  public void test_texas_holdem_524_2s3h3sAcAd_TdTh_2h9d() {
    assertEquals(
      "2h9d TdTh",
      Solver.process("texas-holdem 2s3h3sAcAd TdTh 2h9d"));
  }

  @Test
  public void test_texas_holdem_525_3s4dJcQdTd_Qh3d_6d4s_Kd6h_AdQc_Jh2d_2s7s() {
    assertEquals(
      "2s7s Kd6h 6d4s Jh2d AdQc Qh3d",
      Solver.process("texas-holdem 3s4dJcQdTd Qh3d 6d4s Kd6h AdQc Jh2d 2s7s"));
  }

  @Test
  public void test_texas_holdem_526_2s4c5dKsTd_Ts8d_7dJd_9s6d_3h8c_Qh5c_4hQc_4s8h_2cKc() {
    assertEquals(
      "3h8c 9s6d 7dJd 4s8h 4hQc Qh5c Ts8d 2cKc",
      Solver.process("texas-holdem 2s4c5dKsTd Ts8d 7dJd 9s6d 3h8c Qh5c 4hQc 4s8h 2cKc"));
  }

  @Test
  public void test_texas_holdem_527_3h5d6s7cKh_6h9s_Qh7h_4s5h_2c2h_AsTd() {
    assertEquals(
      "AsTd 2c2h 6h9s Qh7h 4s5h",
      Solver.process("texas-holdem 3h5d6s7cKh 6h9s Qh7h 4s5h 2c2h AsTd"));
  }

  @Test
  public void test_texas_holdem_528_4c4sAsQhTs_8s9s_5c9d_7s2h_4dKh() {
    assertEquals(
      "5c9d=7s2h 4dKh 8s9s",
      Solver.process("texas-holdem 4c4sAsQhTs 8s9s 5c9d 7s2h 4dKh"));
  }

  @Test
  public void test_texas_holdem_529_3d4c8dKhTh_5dJd_AdKs() {
    assertEquals(
      "5dJd AdKs",
      Solver.process("texas-holdem 3d4c8dKhTh 5dJd AdKs"));
  }

  @Test
  public void test_texas_holdem_530_2d5h6d9hTh_9s4c_4s5c_8hTs_Qh7c_Tc9d_JhQs_2cJc_KdKs() {
    assertEquals(
      "Qh7c JhQs 2cJc 4s5c 9s4c 8hTs KdKs Tc9d",
      Solver.process("texas-holdem 2d5h6d9hTh 9s4c 4s5c 8hTs Qh7c Tc9d JhQs 2cJc KdKs"));
  }

  @Test
  public void test_texas_holdem_531_2c3s8dQcTs_Kd7d_AcJs() {
    assertEquals(
      "Kd7d AcJs",
      Solver.process("texas-holdem 2c3s8dQcTs Kd7d AcJs"));
  }

  @Test
  public void test_texas_holdem_532_2s3d8dJsKc_7c3h_Tc7d_Jc6s_Kd5d_2c6c_8h5s_3s9d_7h9c_QdTh() {
    assertEquals(
      "7h9c Tc7d QdTh 2c6c 7c3h 3s9d 8h5s Jc6s Kd5d",
      Solver.process("texas-holdem 2s3d8dJsKc 7c3h Tc7d Jc6s Kd5d 2c6c 8h5s 3s9d 7h9c QdTh"));
  }

  @Test
  public void test_texas_holdem_533_5s8c8s9hQh_Ah3h_9cAd_8hTc_2h3c_7cKc() {
    assertEquals(
      "2h3c 7cKc Ah3h 9cAd 8hTc",
      Solver.process("texas-holdem 5s8c8s9hQh Ah3h 9cAd 8hTc 2h3c 7cKc"));
  }

  @Test
  public void test_texas_holdem_534_3s6s7h8sTd_2h4c_4hQs_9c6h_5d7c() {
    assertEquals(
      "2h4c 4hQs 5d7c 9c6h",
      Solver.process("texas-holdem 3s6s7h8sTd 2h4c 4hQs 9c6h 5d7c"));
  }

  @Test
  public void test_texas_holdem_535_4c4d4hQcTd_KsAh_7hJh() {
    assertEquals(
      "7hJh KsAh",
      Solver.process("texas-holdem 4c4d4hQcTd KsAh 7hJh"));
  }

  @Test
  public void test_texas_holdem_536_5s6hAcJcJs_Jd2s_8dKd() {
    assertEquals(
      "8dKd Jd2s",
      Solver.process("texas-holdem 5s6hAcJcJs Jd2s 8dKd"));
  }

  @Test
  public void test_texas_holdem_537_2c5s9cJcTd_7cKd_4h9s_8hTc() {
    assertEquals(
      "7cKd 4h9s 8hTc",
      Solver.process("texas-holdem 2c5s9cJcTd 7cKd 4h9s 8hTc"));
  }

  @Test
  public void test_texas_holdem_538_3d6c8sJcQs_2d6h_8h7c_2h6s_Ac3c_8c8d_9d2c_QcJd_Th3h() {
    assertEquals(
      "9d2c Th3h Ac3c 2d6h=2h6s 8h7c QcJd 8c8d",
      Solver.process("texas-holdem 3d6c8sJcQs 2d6h 8h7c 2h6s Ac3c 8c8d 9d2c QcJd Th3h"));
  }

  @Test
  public void test_texas_holdem_539_8s9c9sJdQs_KcTh_Qc9d_3dJc_KdQd_6d3h_Js7h_4cJh_4d4s_5dKh() {
    assertEquals(
      "6d3h 5dKh 4d4s 3dJc=4cJh=Js7h KdQd KcTh Qc9d",
      Solver.process("texas-holdem 8s9c9sJdQs KcTh Qc9d 3dJc KdQd 6d3h Js7h 4cJh 4d4s 5dKh"));
  }

  @Test
  public void test_texas_holdem_540_5h6d7dJdKc_Ah6h_9dAs_5dQd_4h8h_Ac4s_6cQh_7h8d() {
    assertEquals(
      "Ac4s 9dAs 6cQh Ah6h 7h8d 4h8h 5dQd",
      Solver.process("texas-holdem 5h6d7dJdKc Ah6h 9dAs 5dQd 4h8h Ac4s 6cQh 7h8d"));
  }

  @Test
  public void test_texas_holdem_541_5d9dJsQdTc_6s6c_TsAs() {
    assertEquals(
      "6s6c TsAs",
      Solver.process("texas-holdem 5d9dJsQdTc 6s6c TsAs"));
  }

  @Test
  public void test_texas_holdem_542_4d6c7dJcJh_As4h_5d2h() {
    assertEquals(
      "5d2h As4h",
      Solver.process("texas-holdem 4d6c7dJcJh As4h 5d2h"));
  }

  @Test
  public void test_texas_holdem_543_9hAcJhQhTh_QdTc_3cJd_Ad7d_6dTs_7s9d_5h8c() {
    assertEquals(
      "7s9d 6dTs 3cJd Ad7d QdTc 5h8c",
      Solver.process("texas-holdem 9hAcJhQhTh QdTc 3cJd Ad7d 6dTs 7s9d 5h8c"));
  }

  @Test
  public void test_texas_holdem_544_4d5d6c8hKc_8d3c_4hKs_7s9h_2c6s_5h9s_Kh3h_TcJd_7c3d() {
    assertEquals(
      "TcJd 5h9s 2c6s 8d3c Kh3h 4hKs 7c3d 7s9h",
      Solver.process("texas-holdem 4d5d6c8hKc 8d3c 4hKs 7s9h 2c6s 5h9s Kh3h TcJd 7c3d"));
  }

  @Test
  public void test_texas_holdem_545_3d6h7hJhKc_8h3c_6dAc_7s8d_6c7c() {
    assertEquals(
      "8h3c 6dAc 7s8d 6c7c",
      Solver.process("texas-holdem 3d6h7hJhKc 8h3c 6dAc 7s8d 6c7c"));
  }

  @Test
  public void test_texas_holdem_546_4c4s5h6dQc_5s2d_4dQd_Tc9d_TsQs() {
    assertEquals(
      "Tc9d 5s2d TsQs 4dQd",
      Solver.process("texas-holdem 4c4s5h6dQc 5s2d 4dQd Tc9d TsQs"));
  }

  @Test
  public void test_texas_holdem_547_3d5sAdJsKh_9h6s_8c6d_Kc2c_5h4d_Jd4s_9d7c() {
    assertEquals(
      "8c6d 9h6s 9d7c 5h4d Jd4s Kc2c",
      Solver.process("texas-holdem 3d5sAdJsKh 9h6s 8c6d Kc2c 5h4d Jd4s 9d7c"));
  }

  @Test
  public void test_texas_holdem_548_2c3cJhKdKs_QcJd_7s4c_3d8h_4s2h_Ts4h_QsQh() {
    assertEquals(
      "7s4c Ts4h 4s2h 3d8h QcJd QsQh",
      Solver.process("texas-holdem 2c3cJhKdKs QcJd 7s4c 3d8h 4s2h Ts4h QsQh"));
  }

  @Test
  public void test_texas_holdem_549_3c4dJdKcKh_Kd9s_6d8c() {
    assertEquals(
      "6d8c Kd9s",
      Solver.process("texas-holdem 3c4dJdKcKh Kd9s 6d8c"));
  }

  @Test
  public void test_texas_holdem_550_3s9dJsKdTc_5cAs_2sJc_5s6s_Ac3h_2cQh() {
    assertEquals(
      "5s6s 5cAs Ac3h 2sJc 2cQh",
      Solver.process("texas-holdem 3s9dJsKdTc 5cAs 2sJc 5s6s Ac3h 2cQh"));
  }

  @Test
  public void test_texas_holdem_551_6c7cAcJsKh_3d2d_8cTh_JcQs_2hKs_5h9h_8s4h_5cTd_Tc8d_4c3c() {
    assertEquals(
      "3d2d 8s4h 5h9h 5cTd 8cTh=Tc8d JcQs 2hKs 4c3c",
      Solver.process("texas-holdem 6c7cAcJsKh 3d2d 8cTh JcQs 2hKs 5h9h 8s4h 5cTd Tc8d 4c3c"));
  }

  @Test
  public void test_texas_holdem_552_6c6d6hJdJs_KdTc_5h8d_QcTd_4s8c_9s4c_AsKc_Jc3d() {
    assertEquals(
      "4s8c=5h8d=9s4c=AsKc=KdTc=QcTd Jc3d",
      Solver.process("texas-holdem 6c6d6hJdJs KdTc 5h8d QcTd 4s8c 9s4c AsKc Jc3d"));
  }

  @Test
  public void test_texas_holdem_553_2c8cAsTcTs_AcQc_Th8d_5s8s_3cAd_2h5c_Jc2s_Ks7h_Jd6c_Jh3s() {
    assertEquals(
      "Jd6c=Jh3s Ks7h 2h5c=Jc2s 5s8s 3cAd AcQc Th8d",
      Solver.process("texas-holdem 2c8cAsTcTs AcQc Th8d 5s8s 3cAd 2h5c Jc2s Ks7h Jd6c Jh3s"));
  }

  @Test
  public void test_texas_holdem_554_3s7s9sJdTh_7c8c_QsQc_2dQd_3dJh_2h8h_5hTs_9hJc_KhTd_6s4s() {
    assertEquals(
      "2dQd 5hTs KhTd QsQc 3dJh 9hJc 2h8h=7c8c 6s4s",
      Solver.process("texas-holdem 3s7s9sJdTh 7c8c QsQc 2dQd 3dJh 2h8h 5hTs 9hJc KhTd 6s4s"));
  }

  @Test
  public void test_texas_holdem_555_4h9dJcJsKc_Ah8h_4s2d_2h3d() {
    assertEquals(
      "2h3d Ah8h 4s2d",
      Solver.process("texas-holdem 4h9dJcJsKc Ah8h 4s2d 2h3d"));
  }

  @Test
  public void test_texas_holdem_556_5h8d9sQsTd_5d2c_Kh2h_Qd9h() {
    assertEquals(
      "Kh2h 5d2c Qd9h",
      Solver.process("texas-holdem 5h8d9sQsTd 5d2c Kh2h Qd9h"));
  }

  @Test
  public void test_texas_holdem_557_6s7c9d9sJh_3c6c_Kc5h() {
    assertEquals(
      "Kc5h 3c6c",
      Solver.process("texas-holdem 6s7c9d9sJh 3c6c Kc5h"));
  }

  @Test
  public void test_texas_holdem_558_4h5h7h7sQc_As8d_KsTh_6c5c_8h9d_QsJc_8s3s_Td3h_4sKc_Jh5s() {
    assertEquals(
      "8s3s 8h9d Td3h KsTh As8d 4sKc 6c5c=Jh5s QsJc",
      Solver.process("texas-holdem 4h5h7h7sQc As8d KsTh 6c5c 8h9d QsJc 8s3s Td3h 4sKc Jh5s"));
  }

  @Test
  public void test_texas_holdem_559_3d7c9sAsTc_6c4c_4dAd_Ac6h() {
    assertEquals(
      "6c4c 4dAd=Ac6h",
      Solver.process("texas-holdem 3d7c9sAsTc 6c4c 4dAd Ac6h"));
  }

  @Test
  public void test_texas_holdem_560_5d9d9sJsKd_4cTs_6c3d_Ad8s_Jc9c() {
    assertEquals(
      "6c3d 4cTs Ad8s Jc9c",
      Solver.process("texas-holdem 5d9d9sJsKd 4cTs 6c3d Ad8s Jc9c"));
  }

  @Test
  public void test_texas_holdem_561_5d6h7d8cTs_4sAh_Kd9c_9hJc() {
    assertEquals(
      "4sAh Kd9c 9hJc",
      Solver.process("texas-holdem 5d6h7d8cTs 4sAh Kd9c 9hJc"));
  }

  @Test
  public void test_texas_holdem_562_2s3h5dJcKd_9s4s_Qh2d_5hAh_4hKc_Tc4d_ThJd_8c2h_7dKs() {
    assertEquals(
      "9s4s Tc4d 8c2h Qh2d 5hAh ThJd 4hKc 7dKs",
      Solver.process("texas-holdem 2s3h5dJcKd 9s4s Qh2d 5hAh 4hKc Tc4d ThJd 8c2h 7dKs"));
  }

  @Test
  public void test_texas_holdem_563_3d4s6d9cTs_7c8c_8h9d_Qc8d_4d7s() {
    assertEquals(
      "Qc8d 4d7s 8h9d 7c8c",
      Solver.process("texas-holdem 3d4s6d9cTs 7c8c 8h9d Qc8d 4d7s"));
  }

  @Test
  public void test_texas_holdem_564_2s3s4c8cJh_5dTc_Qc3d_Ac9h_5c3c_JsKd() {
    assertEquals(
      "5dTc Ac9h 5c3c Qc3d JsKd",
      Solver.process("texas-holdem 2s3s4c8cJh 5dTc Qc3d Ac9h 5c3c JsKd"));
  }

  @Test
  public void test_texas_holdem_565_4h5hAcJdKh_6c2h_Qd7d_QsKs() {
    assertEquals(
      "6c2h Qd7d QsKs",
      Solver.process("texas-holdem 4h5hAcJdKh 6c2h Qd7d QsKs"));
  }

  @Test
  public void test_texas_holdem_566_4d6d7d7hJc_9dAd_8h5s_QhAh_7c5d_Kd3s() {
    assertEquals(
      "Kd3s QhAh 7c5d 8h5s 9dAd",
      Solver.process("texas-holdem 4d6d7d7hJc 9dAd 8h5s QhAh 7c5d Kd3s"));
  }

  @Test
  public void test_texas_holdem_567_3h5d9sJdKh_Jc4s_6h8d() {
    assertEquals(
      "6h8d Jc4s",
      Solver.process("texas-holdem 3h5d9sJdKh Jc4s 6h8d"));
  }

  @Test
  public void test_texas_holdem_568_3s4h5h9sAc_Jc9d_Ks7d_JdJs() {
    assertEquals(
      "Ks7d Jc9d JdJs",
      Solver.process("texas-holdem 3s4h5h9sAc Jc9d Ks7d JdJs"));
  }

  @Test
  public void test_texas_holdem_569_2d3s7cAhTc_5h9d_Qs8d_JcKh_QcJd() {
    assertEquals(
      "5h9d Qs8d QcJd JcKh",
      Solver.process("texas-holdem 2d3s7cAhTc 5h9d Qs8d JcKh QcJd"));
  }

  @Test
  public void test_texas_holdem_570_5h5s6sAhJd_QdTh_6cQh_4cKs_3h6d() {
    assertEquals(
      "QdTh 4cKs 3h6d=6cQh",
      Solver.process("texas-holdem 5h5s6sAhJd QdTh 6cQh 4cKs 3h6d"));
  }

  @Test
  public void test_texas_holdem_571_5d6c6hJsQd_Ts8h_Td5c_8cAh_Jd7h_Kh2h_6sKc() {
    assertEquals(
      "Ts8h Kh2h 8cAh Td5c Jd7h 6sKc",
      Solver.process("texas-holdem 5d6c6hJsQd Ts8h Td5c 8cAh Jd7h Kh2h 6sKc"));
  }

  @Test
  public void test_texas_holdem_572_7d7h8hAcTd_9sAd_3h2h_Tc2d_4d4h_ThJh_JcQc_AhKs_8c4s() {
    assertEquals(
      "3h2h JcQc 4d4h 8c4s Tc2d=ThJh 9sAd AhKs",
      Solver.process("texas-holdem 7d7h8hAcTd 9sAd 3h2h Tc2d 4d4h ThJh JcQc AhKs 8c4s"));
  }

  @Test
  public void test_texas_holdem_573_4c4s7cAsJs_Ks4d_5c3d_TdQs_8h2d_8sJc_4h7s_7h3h_6hQc_Kd9h() {
    assertEquals(
      "5c3d 8h2d 6hQc=TdQs Kd9h 7h3h 8sJc Ks4d 4h7s",
      Solver.process("texas-holdem 4c4s7cAsJs Ks4d 5c3d TdQs 8h2d 8sJc 4h7s 7h3h 6hQc Kd9h"));
  }

  @Test
  public void test_texas_holdem_574_2d2h3h5dAc_7dJh_Tc7c_9sQc_3cKd_6sQd_Jd9c_4cJc_2c6h_8c6d() {
    assertEquals(
      "8c6d Tc7c 7dJh Jd9c 6sQd 9sQc 3cKd 2c6h 4cJc",
      Solver.process("texas-holdem 2d2h3h5dAc 7dJh Tc7c 9sQc 3cKd 6sQd Jd9c 4cJc 2c6h 8c6d"));
  }

  @Test
  public void test_texas_holdem_575_3c4d5h9hTd_Ks3h_Ts8c_4hAd_7h8h_Kd3s_5cTc() {
    assertEquals(
      "7h8h Kd3s=Ks3h 4hAd Ts8c 5cTc",
      Solver.process("texas-holdem 3c4d5h9hTd Ks3h Ts8c 4hAd 7h8h Kd3s 5cTc"));
  }

  @Test
  public void test_texas_holdem_576_4s5c7hJcTd_9s5s_8sQh_AhAd() {
    assertEquals(
      "8sQh 9s5s AhAd",
      Solver.process("texas-holdem 4s5c7hJcTd 9s5s 8sQh AhAd"));
  }

  @Test
  public void test_texas_holdem_577_3c5h7c9cQd_JsQh_KcAc_Qs6h() {
    assertEquals(
      "Qs6h JsQh KcAc",
      Solver.process("texas-holdem 3c5h7c9cQd JsQh KcAc Qs6h"));
  }

  @Test
  public void test_texas_holdem_578_5hAdAsQdQs_KcQc_4d3s_9c6c_9s2d_Jc4c() {
    assertEquals(
      "4d3s 9c6c=9s2d Jc4c KcQc",
      Solver.process("texas-holdem 5hAdAsQdQs KcQc 4d3s 9c6c 9s2d Jc4c"));
  }

  @Test
  public void test_texas_holdem_579_3h5c5h8sQs_2c4s_7dKc_9sJc_AhTd_2h3c_8dQh() {
    assertEquals(
      "2c4s 9sJc 7dKc AhTd 2h3c 8dQh",
      Solver.process("texas-holdem 3h5c5h8sQs 2c4s 7dKc 9sJc AhTd 2h3c 8dQh"));
  }

  @Test
  public void test_texas_holdem_580_2d5d5s9sAc_6cAs_4h7c() {
    assertEquals(
      "4h7c 6cAs",
      Solver.process("texas-holdem 2d5d5s9sAc 6cAs 4h7c"));
  }

  @Test
  public void test_texas_holdem_581_7d8h9sAcKh_7sKs_6h9d_5sKd_4dQd_TcAs_Th7h_3dQh_8s9c() {
    assertEquals(
      "3dQh=4dQd Th7h 6h9d 5sKd TcAs 8s9c 7sKs",
      Solver.process("texas-holdem 7d8h9sAcKh 7sKs 6h9d 5sKd 4dQd TcAs Th7h 3dQh 8s9c"));
  }

  @Test
  public void test_texas_holdem_582_8c8dAcAdKh_Qd5h_4d3h_7c9d_2d2c_Kc5d_6c9c_Jh7h_2s3c_TsAh() {
    assertEquals(
      "2d2c=2s3c=4d3h=6c9c=7c9d=Jh7h=Qd5h Kc5d TsAh",
      Solver.process("texas-holdem 8c8dAcAdKh Qd5h 4d3h 7c9d 2d2c Kc5d 6c9c Jh7h 2s3c TsAh"));
  }

  @Test
  public void test_texas_holdem_583_7d8cAsJcTd_QdAd_7c4h_5hKh_Ac7s_JdQc_Ts3h_Tc9c() {
    assertEquals(
      "5hKh 7c4h Ts3h JdQc QdAd Ac7s Tc9c",
      Solver.process("texas-holdem 7d8cAsJcTd QdAd 7c4h 5hKh Ac7s JdQc Ts3h Tc9c"));
  }

  @Test
  public void test_texas_holdem_584_2h3d6hAdJs_8h3s_4sQh_Jd7c_5hQc_ThAh_4h5d_6d9h_9d3h() {
    assertEquals(
      "4sQh 5hQc 8h3s 9d3h 6d9h Jd7c ThAh 4h5d",
      Solver.process("texas-holdem 2h3d6hAdJs 8h3s 4sQh Jd7c 5hQc ThAh 4h5d 6d9h 9d3h"));
  }

  @Test
  public void test_texas_holdem_585_2c8h9dJsTd_7s4c_TcKc_QdJd_9c6s_Th6c_9sAs() {
    assertEquals(
      "9c6s 9sAs Th6c TcKc 7s4c QdJd",
      Solver.process("texas-holdem 2c8h9dJsTd 7s4c TcKc QdJd 9c6s Th6c 9sAs"));
  }

  @Test
  public void test_texas_holdem_586_2h3h8d9cKs_JcAc_4cAs_KcKh_9d7s_5s5c_3c9s() {
    assertEquals(
      "4cAs JcAc 5s5c 9d7s 3c9s KcKh",
      Solver.process("texas-holdem 2h3h8d9cKs JcAc 4cAs KcKh 9d7s 5s5c 3c9s"));
  }

  @Test
  public void test_texas_holdem_587_2c9cAcJhKd_Kh5s_7c2s_Ts6s_3c3h_8c6c_4sJc_8hQd_Kc6d_5cQh() {
    assertEquals(
      "Ts6s 5cQh=8hQd 7c2s 3c3h 4sJc Kc6d=Kh5s 8c6c",
      Solver.process("texas-holdem 2c9cAcJhKd Kh5s 7c2s Ts6s 3c3h 8c6c 4sJc 8hQd Kc6d 5cQh"));
  }

  @Test
  public void test_texas_holdem_588_6c6d6hJsTd_3dJd_Ad5d_9d9c() {
    assertEquals(
      "Ad5d 9d9c 3dJd",
      Solver.process("texas-holdem 6c6d6hJsTd 3dJd Ad5d 9d9c"));
  }

  @Test
  public void test_texas_holdem_589_4s7c9hJhKs_6c6s_9c7h_4h2h_8d5c() {
    assertEquals(
      "8d5c 4h2h 6c6s 9c7h",
      Solver.process("texas-holdem 4s7c9hJhKs 6c6s 9c7h 4h2h 8d5c"));
  }

  @Test
  public void test_texas_holdem_590_4s5c8d9hQc_4h5h_7s9c_2d8s_JsKh_8cQh_6cTd_QdAs_5d2c_Qs9d() {
    assertEquals(
      "6cTd JsKh 5d2c 2d8s 7s9c QdAs 4h5h 8cQh Qs9d",
      Solver.process("texas-holdem 4s5c8d9hQc 4h5h 7s9c 2d8s JsKh 8cQh 6cTd QdAs 5d2c Qs9d"));
  }

  @Test
  public void test_texas_holdem_591_5sJhJsQsTh_2s3d_TcQd_5d7d_9c5h_9h4d() {
    assertEquals(
      "2s3d 9h4d 5d7d=9c5h TcQd",
      Solver.process("texas-holdem 5sJhJsQsTh 2s3d TcQd 5d7d 9c5h 9h4d"));
  }

  @Test
  public void test_texas_holdem_592_4h8hAhKcKh_8sTh_Ad7s_6dKd_5cTc() {
    assertEquals(
      "5cTc Ad7s 6dKd 8sTh",
      Solver.process("texas-holdem 4h8hAhKcKh 8sTh Ad7s 6dKd 5cTc"));
  }

  @Test
  public void test_texas_holdem_593_3s5sKdKhTh_8cQh_8h7s_6h6d_Kc5d_JsQs() {
    assertEquals(
      "8h7s 8cQh JsQs 6h6d Kc5d",
      Solver.process("texas-holdem 3s5sKdKhTh 8cQh 8h7s 6h6d Kc5d JsQs"));
  }

  @Test
  public void test_texas_holdem_594_2s5s9sAdJs_3hTd_9cQc_5h7s_2c4s_6h2h_QhQs_4h3s_6s3c_8dJd() {
    assertEquals(
      "3hTd 6h2h 9cQc 8dJd 4h3s 2c4s 6s3c 5h7s QhQs",
      Solver.process("texas-holdem 2s5s9sAdJs 3hTd 9cQc 5h7s 2c4s 6h2h QhQs 4h3s 6s3c 8dJd"));
  }

  @Test
  public void test_texas_holdem_595_4s5d8cTcTh_Kc6s_5hKd_Qc3h() {
    assertEquals(
      "Qc3h Kc6s 5hKd",
      Solver.process("texas-holdem 4s5d8cTcTh Kc6s 5hKd Qc3h"));
  }

  @Test
  public void test_texas_holdem_596_4d6sKhQhTh_8hJs_7cAh_3h9d_KdJc_Td6c() {
    assertEquals(
      "3h9d 8hJs 7cAh KdJc Td6c",
      Solver.process("texas-holdem 4d6sKhQhTh 8hJs 7cAh 3h9d KdJc Td6c"));
  }

  @Test
  public void test_texas_holdem_597_3s5d6cJdQd_Jh4h_Qh3h_7sAh_Ac5c() {
    assertEquals(
      "7sAh Ac5c Jh4h Qh3h",
      Solver.process("texas-holdem 3s5d6cJdQd Jh4h Qh3h 7sAh Ac5c"));
  }

  @Test
  public void test_texas_holdem_598_2d2s5hAhQh_5d5c_Th8h_9s4h() {
    assertEquals(
      "9s4h Th8h 5d5c",
      Solver.process("texas-holdem 2d2s5hAhQh 5d5c Th8h 9s4h"));
  }

  @Test
  public void test_texas_holdem_599_3h7h8c8hKd_4dTh_4s9c_Jc7s_5sTc_7dTd_8d6h_7c4c_9s2d() {
    assertEquals(
      "4s9c=9s2d 4dTh=5sTc 7c4c=7dTd=Jc7s 8d6h",
      Solver.process("texas-holdem 3h7h8c8hKd 4dTh 4s9c Jc7s 5sTc 7dTd 8d6h 7c4c 9s2d"));
  }

  @Test
  public void test_texas_holdem_600_2c2d2hJhTs_Kh2s_7dAc() {
    assertEquals(
      "7dAc Kh2s",
      Solver.process("texas-holdem 2c2d2hJhTs Kh2s 7dAc"));
  }

  @Test
  public void test_texas_holdem_601_5s7cAcJsQd_9h7h_KhQs_5h9s() {
    assertEquals(
      "5h9s 9h7h KhQs",
      Solver.process("texas-holdem 5s7cAcJsQd 9h7h KhQs 5h9s"));
  }

  @Test
  public void test_texas_holdem_602_3s8c8hKsTc_2sTs_7d2h_5s3c_Qc7h_Kh2d_6cQs_KdAh_4d2c() {
    assertEquals(
      "4d2c 7d2h 6cQs=Qc7h 5s3c 2sTs Kh2d KdAh",
      Solver.process("texas-holdem 3s8c8hKsTc 2sTs 7d2h 5s3c Qc7h Kh2d 6cQs KdAh 4d2c"));
  }

  @Test
  public void test_texas_holdem_603_7c8hJcJdJs_3s7h_7d4s_Th5d_2dKc_Qs6h_QhTs() {
    assertEquals(
      "Th5d Qs6h QhTs 2dKc 3s7h=7d4s",
      Solver.process("texas-holdem 7c8hJcJdJs 3s7h 7d4s Th5d 2dKc Qs6h QhTs"));
  }

  @Test
  public void test_texas_holdem_604_5c9cAsTcTd_3hAh_Qc6s_2s7d_AcKh_9sQs_Ad2c_4s7c_5hJc() {
    assertEquals(
      "2s7d=4s7c Qc6s 5hJc 9sQs 3hAh=Ad2c AcKh",
      Solver.process("texas-holdem 5c9cAsTcTd 3hAh Qc6s 2s7d AcKh 9sQs Ad2c 4s7c 5hJc"));
  }

  @Test
  public void test_texas_holdem_605_2h8d8s9hQd_6c3c_Ks9d_3d2c_8hJd_9cQc_4c9s_AhAd_As6h() {
    assertEquals(
      "6c3c As6h 3d2c 4c9s Ks9d 9cQc AhAd 8hJd",
      Solver.process("texas-holdem 2h8d8s9hQd 6c3c Ks9d 3d2c 8hJd 9cQc 4c9s AhAd As6h"));
  }

  @Test
  public void test_texas_holdem_606_9dAdJsKcKh_6h3d_Qs2s_9c2c_5d4s_3sAs_4hTh() {
    assertEquals(
      "5d4s=6h3d 4hTh Qs2s 9c2c 3sAs",
      Solver.process("texas-holdem 9dAdJsKcKh 6h3d Qs2s 9c2c 5d4s 3sAs 4hTh"));
  }

  @Test
  public void test_texas_holdem_607_4s5c7h8dKd_8c2c_7s9d_2dKh_6sQd_Ac4h() {
    assertEquals(
      "Ac4h 7s9d 8c2c 2dKh 6sQd",
      Solver.process("texas-holdem 4s5c7h8dKd 8c2c 7s9d 2dKh 6sQd Ac4h"));
  }

  @Test
  public void test_texas_holdem_608_4c6c6sJhQs_8cAd_Th7c_8s9h_8d3s_5sQh_7h9s_Kc5h() {
    assertEquals(
      "8d3s 7h9s=8s9h Th7c Kc5h 8cAd 5sQh",
      Solver.process("texas-holdem 4c6c6sJhQs 8cAd Th7c 8s9h 8d3s 5sQh 7h9s Kc5h"));
  }

  @Test
  public void test_texas_holdem_609_3c3h6d7d8d_JcTs_4dKh_7hAh_2d8c() {
    assertEquals(
      "JcTs 4dKh 7hAh 2d8c",
      Solver.process("texas-holdem 3c3h6d7d8d JcTs 4dKh 7hAh 2d8c"));
  }

  @Test
  public void test_texas_holdem_610_2h5c9hAcJc_3h4s_5h2s_6hKc_ThQh_Ks3d_Ad4d_8s7c_Td7h_Js5d() {
    assertEquals(
      "8s7c Td7h ThQh Ks3d 6hKc Ad4d 5h2s Js5d 3h4s",
      Solver.process("texas-holdem 2h5c9hAcJc 3h4s 5h2s 6hKc ThQh Ks3d Ad4d 8s7c Td7h Js5d"));
  }

  @Test
  public void test_texas_holdem_611_4h8hAsJsQh_7s3s_JdKc_3h5h_2sTs_6s2c() {
    assertEquals(
      "6s2c 7s3s 2sTs JdKc 3h5h",
      Solver.process("texas-holdem 4h8hAsJsQh 7s3s JdKc 3h5h 2sTs 6s2c"));
  }

  @Test
  public void test_texas_holdem_612_5dAcJsQcQs_4h6h_6sJc_8d2s_6cAh_Tc9d_5hKc_Ks2d_Jd5c_7c7s() {
    assertEquals(
      "4h6h 8d2s Tc9d Ks2d 5hKc 7c7s 6sJc=Jd5c 6cAh",
      Solver.process("texas-holdem 5dAcJsQcQs 4h6h 6sJc 8d2s 6cAh Tc9d 5hKc Ks2d Jd5c 7c7s"));
  }

  @Test
  public void test_texas_holdem_613_4sAhAsQcTd_6s3h_4hJc_2sKh_5c3c_6d2d_2h5s_5hKc() {
    assertEquals(
      "2h5s=5c3c 6d2d=6s3h 2sKh=5hKc 4hJc",
      Solver.process("texas-holdem 4sAhAsQcTd 6s3h 4hJc 2sKh 5c3c 6d2d 2h5s 5hKc"));
  }

  @Test
  public void test_texas_holdem_614_2h3h4h7s8c_5sKh_7d4c_Jh3s_9sTs() {
    assertEquals(
      "9sTs 5sKh Jh3s 7d4c",
      Solver.process("texas-holdem 2h3h4h7s8c 5sKh 7d4c Jh3s 9sTs"));
  }

  @Test
  public void test_texas_holdem_615_9cJcJsQsTc_6c9s_3d4c_Jd4s_2s7c_9h5c_7d2d_2h3c_6dAs() {
    assertEquals(
      "2h3c=2s7c=3d4c=7d2d 6dAs 6c9s=9h5c Jd4s",
      Solver.process("texas-holdem 9cJcJsQsTc 6c9s 3d4c Jd4s 2s7c 9h5c 7d2d 2h3c 6dAs"));
  }

  @Test
  public void test_texas_holdem_616_2h2s5h7d9h_6h3c_4dJs_4h9c_9sTd_Kd3d_Ad5s_7s2c() {
    assertEquals(
      "6h3c 4dJs Kd3d Ad5s 4h9c 9sTd 7s2c",
      Solver.process("texas-holdem 2h2s5h7d9h 6h3c 4dJs 4h9c 9sTd Kd3d Ad5s 7s2c"));
  }

  @Test
  public void test_texas_holdem_617_2d5d7c9cKc_8c6s_8h4h_4dKd_6dAs_Ks5s_3s4s_7dKh_7sJs() {
    assertEquals(
      "3s4s 8h4h 6dAs 7sJs 4dKd Ks5s 7dKh 8c6s",
      Solver.process("texas-holdem 2d5d7c9cKc 8c6s 8h4h 4dKd 6dAs Ks5s 3s4s 7dKh 7sJs"));
  }

  @Test
  public void test_texas_holdem_618_4d4h6h7s9c_7dTd_2d8h_Qd4c_QhTh_JhTc_7h7c_3sKs() {
    assertEquals(
      "2d8h JhTc QhTh 3sKs 7dTd Qd4c 7h7c",
      Solver.process("texas-holdem 4d4h6h7s9c 7dTd 2d8h Qd4c QhTh JhTc 7h7c 3sKs"));
  }

  @Test
  public void test_texas_holdem_619_7s8dJcKcQh_Ts2c_6h2h() {
    assertEquals(
      "6h2h Ts2c",
      Solver.process("texas-holdem 7s8dJcKcQh Ts2c 6h2h"));
  }

  @Test
  public void test_texas_holdem_620_2s6c8dJcTc_6s4d_3hJs_Ts2d_5d7h_QdAs() {
    assertEquals(
      "5d7h QdAs 6s4d 3hJs Ts2d",
      Solver.process("texas-holdem 2s6c8dJcTc 6s4d 3hJs Ts2d 5d7h QdAs"));
  }

  @Test
  public void test_texas_holdem_621_5c6c6s9hQh_8sAh_QdJh_QcJc() {
    assertEquals(
      "8sAh QcJc=QdJh",
      Solver.process("texas-holdem 5c6c6s9hQh 8sAh QdJh QcJc"));
  }

  @Test
  public void test_texas_holdem_622_4d6h8hAsQh_5c6s_2sJs_7dKc_Jd9c_4sTd_2cJh_7hQd() {
    assertEquals(
      "2cJh=2sJs Jd9c 7dKc 4sTd 5c6s 7hQd",
      Solver.process("texas-holdem 4d6h8hAsQh 5c6s 2sJs 7dKc Jd9c 4sTd 2cJh 7hQd"));
  }

  @Test
  public void test_texas_holdem_623_2d3h4c4sAd_Js9h_Ts6h_Qh9s_8d9c_KdKc_3d7c_Ah6s() {
    assertEquals(
      "8d9c Ts6h Js9h Qh9s 3d7c KdKc Ah6s",
      Solver.process("texas-holdem 2d3h4c4sAd Js9h Ts6h Qh9s 8d9c KdKc 3d7c Ah6s"));
  }

  @Test
  public void test_texas_holdem_624_4c4dAdJcJh_Tc8s_3s4h() {
    assertEquals(
      "Tc8s 3s4h",
      Solver.process("texas-holdem 4c4dAdJcJh Tc8s 3s4h"));
  }

  @Test
  public void test_texas_holdem_625_6d7dJdKdTs_5s9h_Kc5d() {
    assertEquals(
      "5s9h Kc5d",
      Solver.process("texas-holdem 6d7dJdKdTs 5s9h Kc5d"));
  }

  @Test
  public void test_texas_holdem_626_3dKdKsQdTh_Kc6c_2sQh_2d3h_2c6s_5d5c_8hTs() {
    assertEquals(
      "2c6s 2d3h 5d5c 8hTs 2sQh Kc6c",
      Solver.process("texas-holdem 3dKdKsQdTh Kc6c 2sQh 2d3h 2c6s 5d5c 8hTs"));
  }

  @Test
  public void test_texas_holdem_627_3c7d9hJhQd_7cKh_Td3h_3d8c() {
    assertEquals(
      "3d8c Td3h 7cKh",
      Solver.process("texas-holdem 3c7d9hJhQd 7cKh Td3h 3d8c"));
  }

  @Test
  public void test_texas_holdem_628_2c4h8sQhTh_4s3c_Ks3d_5s2h_8h6s_6d5h_7c7h_Qd9s() {
    assertEquals(
      "6d5h Ks3d 5s2h 4s3c 7c7h 8h6s Qd9s",
      Solver.process("texas-holdem 2c4h8sQhTh 4s3c Ks3d 5s2h 8h6s 6d5h 7c7h Qd9s"));
  }

  @Test
  public void test_texas_holdem_629_3h5d5sAcJc_Jd7s_Td9c_8hKh_6s9h_2dKc_2c9d() {
    assertEquals(
      "2c9d=6s9h Td9c 2dKc=8hKh Jd7s",
      Solver.process("texas-holdem 3h5d5sAcJc Jd7s Td9c 8hKh 6s9h 2dKc 2c9d"));
  }

  @Test
  public void test_texas_holdem_630_5c9hAhQcQs_Kd2s_7h8c_TcTh_KsKh() {
    assertEquals(
      "7h8c Kd2s TcTh KsKh",
      Solver.process("texas-holdem 5c9hAhQcQs Kd2s 7h8c TcTh KsKh"));
  }

  @Test
  public void test_texas_holdem_631_3h5d5hQdTh_3cAd_KcKs_Ts8s() {
    assertEquals(
      "3cAd Ts8s KcKs",
      Solver.process("texas-holdem 3h5d5hQdTh 3cAd KcKs Ts8s"));
  }

  @Test
  public void test_texas_holdem_632_3dAcJcQdTc_7c3c_KsTd_4s5c() {
    assertEquals(
      "4s5c KsTd 7c3c",
      Solver.process("texas-holdem 3dAcJcQdTc 7c3c KsTd 4s5c"));
  }

  @Test
  public void test_texas_holdem_633_2s5c7hAdQs_AsTd_9sQc_9h3s_8s5s_4d4s() {
    assertEquals(
      "9h3s 4d4s 8s5s 9sQc AsTd",
      Solver.process("texas-holdem 2s5c7hAdQs AsTd 9sQc 9h3s 8s5s 4d4s"));
  }

  @Test
  public void test_texas_holdem_634_6c6dKhQdTs_AsTd_2c9d_7hKd_Jh5h_3sQs() {
    assertEquals(
      "2c9d Jh5h AsTd 3sQs 7hKd",
      Solver.process("texas-holdem 6c6dKhQdTs AsTd 2c9d 7hKd Jh5h 3sQs"));
  }

  @Test
  public void test_texas_holdem_635_3d7s8hJdKh_7h6c_8dTd_3s6s_2d9c_Kc8c_4sJc() {
    assertEquals(
      "2d9c 3s6s 7h6c 8dTd 4sJc Kc8c",
      Solver.process("texas-holdem 3d7s8hJdKh 7h6c 8dTd 3s6s 2d9c Kc8c 4sJc"));
  }

  @Test
  public void test_texas_holdem_636_4h6d8d9cKh_TsAc_5d2h() {
    assertEquals(
      "5d2h TsAc",
      Solver.process("texas-holdem 4h6d8d9cKh TsAc 5d2h"));
  }

  @Test
  public void test_texas_holdem_637_5d8hAsJsQc_3dAd_Jd6d_2d8d_6s8s_2cTs() {
    assertEquals(
      "2cTs 2d8d=6s8s Jd6d 3dAd",
      Solver.process("texas-holdem 5d8hAsJsQc 3dAd Jd6d 2d8d 6s8s 2cTs"));
  }

  @Test
  public void test_texas_holdem_638_2c6dJcQsTh_Qd7c_3h6s_Kd5s_2sTc_KhAs_4d8s() {
    assertEquals(
      "4d8s Kd5s 3h6s Qd7c 2sTc KhAs",
      Solver.process("texas-holdem 2c6dJcQsTh Qd7c 3h6s Kd5s 2sTc KhAs 4d8s"));
  }

  @Test
  public void test_texas_holdem_639_3d4d4sAhTh_2h8c_5d7c_3cKd_6h6s_JsJc() {
    assertEquals(
      "5d7c 2h8c 3cKd 6h6s JsJc",
      Solver.process("texas-holdem 3d4d4sAhTh 2h8c 5d7c 3cKd 6h6s JsJc"));
  }

  @Test
  public void test_texas_holdem_640_6c6h8dJcTc_6sTh_Kc9h_9s3d_Td4s() {
    assertEquals(
      "9s3d Kc9h Td4s 6sTh",
      Solver.process("texas-holdem 6c6h8dJcTc 6sTh Kc9h 9s3d Td4s"));
  }

  @Test
  public void test_texas_holdem_641_4s7c8d9cTh_QcJs_Td2d_As5h_2hQh_6d7h_Kc9s_5sTc_9dTs() {
    assertEquals(
      "2hQh As5h Kc9s 5sTc=Td2d 9dTs 6d7h QcJs",
      Solver.process("texas-holdem 4s7c8d9cTh QcJs Td2d As5h 2hQh 6d7h Kc9s 5sTc 9dTs"));
  }

  @Test
  public void test_texas_holdem_642_2d2h5sAsTd_Kh7s_KsQh_2cJd() {
    assertEquals(
      "Kh7s KsQh 2cJd",
      Solver.process("texas-holdem 2d2h5sAsTd Kh7s KsQh 2cJd"));
  }

  @Test
  public void test_texas_holdem_643_2c2h4h6sTs_KcAh_Ac7s_QsQc_5s8d_8hQd_4dTh_6d2s_Qh6c_Tc5c() {
    assertEquals(
      "5s8d 8hQd Ac7s KcAh Qh6c Tc5c 4dTh QsQc 6d2s",
      Solver.process("texas-holdem 2c2h4h6sTs KcAh Ac7s QsQc 5s8d 8hQd 4dTh 6d2s Qh6c Tc5c"));
  }

  @Test
  public void test_texas_holdem_644_3d5h7hQdTs_5c6d_4cAh_6c2c_Tc3s_7cJs() {
    assertEquals(
      "6c2c 4cAh 5c6d 7cJs Tc3s",
      Solver.process("texas-holdem 3d5h7hQdTs 5c6d 4cAh 6c2c Tc3s 7cJs"));
  }

  @Test
  public void test_texas_holdem_645_4d4s6dJsQd_Jd8s_Kh3c_4hAh() {
    assertEquals(
      "Kh3c Jd8s 4hAh",
      Solver.process("texas-holdem 4d4s6dJsQd Jd8s Kh3c 4hAh"));
  }

  @Test
  public void test_texas_holdem_646_8s9sJhKsTs_4sJc_2c7h_4d6h_JdAs_Kh5c_Ah6s_3sTh_4hTc() {
    assertEquals(
      "4d6h 4hTc Kh5c 2c7h 3sTh 4sJc Ah6s JdAs",
      Solver.process("texas-holdem 8s9sJhKsTs 4sJc 2c7h 4d6h JdAs Kh5c Ah6s 3sTh 4hTc"));
  }

  @Test
  public void test_texas_holdem_647_2c4dKhQdTs_3d8d_6c4c_Qc7s_8hAh() {
    assertEquals(
      "3d8d 8hAh 6c4c Qc7s",
      Solver.process("texas-holdem 2c4dKhQdTs 3d8d 6c4c Qc7s 8hAh"));
  }

  @Test
  public void test_texas_holdem_648_2s6cKdQhTh_9s4c_Td8c_Js9c_JcKc_Ad7s_8hAc_3dTs_Qd3h() {
    assertEquals(
      "9s4c Ad7s 8hAc 3dTs Td8c Qd3h JcKc Js9c",
      Solver.process("texas-holdem 2s6cKdQhTh 9s4c Td8c Js9c JcKc Ad7s 8hAc 3dTs Qd3h"));
  }

  @Test
  public void test_texas_holdem_649_5s8cAdJcJh_Ks2s_4s3d_KdTc_9d3c_As7c_8dKh() {
    assertEquals(
      "4s3d 9d3c Ks2s KdTc 8dKh As7c",
      Solver.process("texas-holdem 5s8cAdJcJh Ks2s 4s3d KdTc 9d3c As7c 8dKh"));
  }

  @Test
  public void test_texas_holdem_650_5cJdKdQcQd_8c7s_Tc7d() {
    assertEquals(
      "8c7s Tc7d",
      Solver.process("texas-holdem 5cJdKdQcQd 8c7s Tc7d"));
  }

  @Test
  public void test_texas_holdem_651_4d6h7c9sAh_Jh2c_9h8s_Qh3d_Tc5d_2hKh_8hQc_Qd8c_9c4s_Kc5h() {
    assertEquals(
      "Tc5d Jh2c Qh3d 8hQc=Qd8c 2hKh=Kc5h 9h8s 9c4s",
      Solver.process("texas-holdem 4d6h7c9sAh Jh2c 9h8s Qh3d Tc5d 2hKh 8hQc Qd8c 9c4s Kc5h"));
  }

  @Test
  public void test_texas_holdem_652_2h5sAsThTs_Qh9d_6c2s_7d8c_4h7c() {
    assertEquals(
      "4h7c 7d8c Qh9d 6c2s",
      Solver.process("texas-holdem 2h5sAsThTs Qh9d 6c2s 7d8c 4h7c"));
  }

  @Test
  public void test_texas_holdem_653_2c4c6s8hAd_4sKd_9d2d_3s8c_ThJh_7s6c_6h5d_Td9h_2hKh_TcQd() {
    assertEquals(
      "Td9h ThJh TcQd 9d2d 2hKh 4sKd 6h5d 7s6c 3s8c",
      Solver.process("texas-holdem 2c4c6s8hAd 4sKd 9d2d 3s8c ThJh 7s6c 6h5d Td9h 2hKh TcQd"));
  }

  @Test
  public void test_texas_holdem_654_4c4sAdKsQh_6h5s_7c8c_QdJs_9h9s_4h2d_Ac7h_Kh8d_Tc2s_2c7d() {
    assertEquals(
      "2c7d=6h5s=7c8c=Tc2s 9h9s QdJs Kh8d Ac7h 4h2d",
      Solver.process("texas-holdem 4c4sAdKsQh 6h5s 7c8c QdJs 9h9s 4h2d Ac7h Kh8d Tc2s 2c7d"));
  }

  @Test
  public void test_texas_holdem_655_4c6c7d9dJc_6h8h_Ts6d() {
    assertEquals(
      "6h8h Ts6d",
      Solver.process("texas-holdem 4c6c7d9dJc 6h8h Ts6d"));
  }

  @Test
  public void test_texas_holdem_656_2h5s6c6s7c_Jh8s_9h9c_9d4c_7hQd_JsAh_8h4d_KcAs() {
    assertEquals(
      "9d4c Jh8s JsAh KcAs 7hQd 9h9c 8h4d",
      Solver.process("texas-holdem 2h5s6c6s7c Jh8s 9h9c 9d4c 7hQd JsAh 8h4d KcAs"));
  }

  @Test
  public void test_texas_holdem_657_5d6c6d9cAh_As4c_5hKc_9s3h_7hJs_QsAc_Jd3s_4dQd_4s9h() {
    assertEquals(
      "7hJs=Jd3s 4dQd 5hKc 4s9h=9s3h As4c QsAc",
      Solver.process("texas-holdem 5d6c6d9cAh As4c 5hKc 9s3h 7hJs QsAc Jd3s 4dQd 4s9h"));
  }

  @Test
  public void test_texas_holdem_658_2c3c7dKcQh_5cAd_Ah9c_4c5d_JcQs_7h9d_Td3s_2s3d_4hAs_Kd3h() {
    assertEquals(
      "4c5d 4hAs 5cAd Ah9c Td3s 7h9d JcQs 2s3d Kd3h",
      Solver.process("texas-holdem 2c3c7dKcQh 5cAd Ah9c 4c5d JcQs 7h9d Td3s 2s3d 4hAs Kd3h"));
  }

  @Test
  public void test_texas_holdem_659_AcAdQdQsTc_8h7c_9h4s_2h8d_4d3d_5dTh_Ts8s_9d6c_QhTd() {
    assertEquals(
      "2h8d=4d3d=5dTh=8h7c=9d6c=9h4s=Ts8s QhTd",
      Solver.process("texas-holdem AcAdQdQsTc 8h7c 9h4s 2h8d 4d3d 5dTh Ts8s 9d6c QhTd"));
  }

  @Test
  public void test_texas_holdem_660_2d4h7d9dTs_4cTc_Kd7s_5s4s_QdAc_Ks4d_6hQc_AdTh() {
    assertEquals(
      "6hQc QdAc 5s4s Ks4d Kd7s AdTh 4cTc",
      Solver.process("texas-holdem 2d4h7d9dTs 4cTc Kd7s 5s4s QdAc Ks4d 6hQc AdTh"));
  }

  @Test
  public void test_texas_holdem_661_9cJdKsTdTs_9d4h_Kh5c_QsQh_5h2h_5sJs() {
    assertEquals(
      "5h2h 9d4h 5sJs Kh5c QsQh",
      Solver.process("texas-holdem 9cJdKsTdTs 9d4h Kh5c QsQh 5h2h 5sJs"));
  }

  @Test
  public void test_texas_holdem_662_2c6cAcJcTs_5c3h_Ks9d_6s5s_6h7s_2h7c_4cQd() {
    assertEquals(
      "Ks9d 6h7s=6s5s 4cQd 5c3h 2h7c",
      Solver.process("texas-holdem 2c6cAcJcTs 5c3h Ks9d 6s5s 6h7s 2h7c 4cQd"));
  }

  @Test
  public void test_texas_holdem_663_2d3d4c6sJd_7h8h_9c9d_6d4s_2h5s_KcJs() {
    assertEquals(
      "7h8h 9c9d KcJs 6d4s 2h5s",
      Solver.process("texas-holdem 2d3d4c6sJd 7h8h 9c9d 6d4s 2h5s KcJs"));
  }

  @Test
  public void test_texas_holdem_664_5dAhQcTdTh_TsKs_3dQh() {
    assertEquals(
      "3dQh TsKs",
      Solver.process("texas-holdem 5dAhQcTdTh TsKs 3dQh"));
  }

  @Test
  public void test_texas_holdem_665_2c3h4c5cJh_Kc6c_Ac8s_5sAd() {
    assertEquals(
      "5sAd=Ac8s Kc6c",
      Solver.process("texas-holdem 2c3h4c5cJh Kc6c Ac8s 5sAd"));
  }

  @Test
  public void test_texas_holdem_666_5h7c8hJcKc_8d6c_8cKh_Ks7s_2c9d_6sKd_5s5c() {
    assertEquals(
      "2c9d 8d6c 6sKd Ks7s 8cKh 5s5c",
      Solver.process("texas-holdem 5h7c8hJcKc 8d6c 8cKh Ks7s 2c9d 6sKd 5s5c"));
  }

  @Test
  public void test_texas_holdem_667_6c8c9cAcKc_2sTd_Qh6d_5h3c_3dJc_2h8h() {
    assertEquals(
      "2h8h=2sTd=5h3c=Qh6d 3dJc",
      Solver.process("texas-holdem 6c8c9cAcKc 2sTd Qh6d 5h3c 3dJc 2h8h"));
  }

  @Test
  public void test_texas_holdem_668_8cAcJsKhKs_KdQh_6d3h_4h9s_4sJh_3d4c_Td9c_6s3c_9h2d_Ad5s() {
    assertEquals(
      "3d4c=6d3h=6s3c 4h9s=9h2d Td9c 4sJh Ad5s KdQh",
      Solver.process("texas-holdem 8cAcJsKhKs KdQh 6d3h 4h9s 4sJh 3d4c Td9c 6s3c 9h2d Ad5s"));
  }

  @Test
  public void test_texas_holdem_669_2s4s6h8sKc_2h3s_7sJh_TcTh_Kd5c_Ad6s_4h6d_Jc3h_8c3c_KsTd() {
    assertEquals(
      "Jc3h 7sJh 2h3s Ad6s 8c3c TcTh Kd5c KsTd 4h6d",
      Solver.process("texas-holdem 2s4s6h8sKc 2h3s 7sJh TcTh Kd5c Ad6s 4h6d Jc3h 8c3c KsTd"));
  }

  @Test
  public void test_texas_holdem_670_2c7sJdKdQc_2d3s_4d9c_4h9d_9sQd() {
    assertEquals(
      "4d9c=4h9d 2d3s 9sQd",
      Solver.process("texas-holdem 2c7sJdKdQc 2d3s 4d9c 4h9d 9sQd"));
  }

  @Test
  public void test_texas_holdem_671_4d5d8cJsQc_Jc2h_KcKh_2s6c_8h3d() {
    assertEquals(
      "2s6c 8h3d Jc2h KcKh",
      Solver.process("texas-holdem 4d5d8cJsQc Jc2h KcKh 2s6c 8h3d"));
  }

  @Test
  public void test_texas_holdem_672_3c9cJdQhTc_2s8h_8d8s_3d5d_2dQc_4hKh() {
    assertEquals(
      "3d5d 2dQc 2s8h=8d8s 4hKh",
      Solver.process("texas-holdem 3c9cJdQhTc 2s8h 8d8s 3d5d 2dQc 4hKh"));
  }

  @Test
  public void test_texas_holdem_673_4hJcJdKsQs_7s2c_9s4c_3c5s() {
    assertEquals(
      "3c5s 7s2c 9s4c",
      Solver.process("texas-holdem 4hJcJdKsQs 7s2c 9s4c 3c5s"));
  }

  @Test
  public void test_texas_holdem_674_3h8h9cKdTh_Js6c_5c8c_6dAh() {
    assertEquals(
      "Js6c 6dAh 5c8c",
      Solver.process("texas-holdem 3h8h9cKdTh Js6c 5c8c 6dAh"));
  }

  @Test
  public void test_texas_holdem_675_6c7c7d8sQh_AsJs_Jd5c_Ts9h_Jh3h() {
    assertEquals(
      "Jd5c=Jh3h AsJs Ts9h",
      Solver.process("texas-holdem 6c7c7d8sQh AsJs Jd5c Ts9h Jh3h"));
  }

  @Test
  public void test_texas_holdem_676_6sAdJsKcQs_QdAh_9s6h() {
    assertEquals(
      "9s6h QdAh",
      Solver.process("texas-holdem 6sAdJsKcQs QdAh 9s6h"));
  }

  @Test
  public void test_texas_holdem_677_7d9cTcTdTh_5hQs_9hQh_Jd2c_6h6d_4sKh_8s2s_3sKc() {
    assertEquals(
      "8s2s Jd2c 5hQs 3sKc=4sKh 6h6d 9hQh",
      Solver.process("texas-holdem 7d9cTcTdTh 5hQs 9hQh Jd2c 6h6d 4sKh 8s2s 3sKc"));
  }

  @Test
  public void test_texas_holdem_678_2c2h5d6s7h_TsKh_5h6c_5cJd_AcQs_8dQh() {
    assertEquals(
      "8dQh TsKh AcQs 5cJd 5h6c",
      Solver.process("texas-holdem 2c2h5d6s7h TsKh 5h6c 5cJd AcQs 8dQh"));
  }

  @Test
  public void test_texas_holdem_679_3s5s6h7d9h_8cQc_Ad5d_2hJs_8dKs_As9d_JdKd_Tc8h() {
    assertEquals(
      "2hJs JdKd Ad5d As9d 8cQc=8dKs Tc8h",
      Solver.process("texas-holdem 3s5s6h7d9h 8cQc Ad5d 2hJs 8dKs As9d JdKd Tc8h"));
  }

  @Test
  public void test_texas_holdem_680_6h8c9sKdKh_9c5s_4h9h_JhTh_JsQh_Ts4s() {
    assertEquals(
      "Ts4s JhTh JsQh 4h9h=9c5s",
      Solver.process("texas-holdem 6h8c9sKdKh 9c5s 4h9h JhTh JsQh Ts4s"));
  }

  @Test
  public void test_texas_holdem_681_2s3d3h6cJc_Qd9h_3s5h_As8c_TdAh_4s7c_4dJh_5s6h() {
    assertEquals(
      "4s7c Qd9h As8c TdAh 5s6h 4dJh 3s5h",
      Solver.process("texas-holdem 2s3d3h6cJc Qd9h 3s5h As8c TdAh 4s7c 4dJh 5s6h"));
  }

  @Test
  public void test_texas_holdem_682_7c7h8sJcQs_Ad2h_5c3h_AhJs_6c9c_3dAs_Jh4c_3c7s_Ks2s_5sTd() {
    assertEquals(
      "5c3h 6c9c 5sTd Ks2s 3dAs=Ad2h Jh4c AhJs 3c7s",
      Solver.process("texas-holdem 7c7h8sJcQs Ad2h 5c3h AhJs 6c9c 3dAs Jh4c 3c7s Ks2s 5sTd"));
  }

  @Test
  public void test_texas_holdem_683_7c7hAdQdTh_2h8c_Kh4h_5s5d_3cJd_5c2c() {
    assertEquals(
      "2h8c=5c2c 3cJd Kh4h 5s5d",
      Solver.process("texas-holdem 7c7hAdQdTh 2h8c Kh4h 5s5d 3cJd 5c2c"));
  }

  @Test
  public void test_texas_holdem_684_8h8sKcQsTd_Ac4s_JdAd_KsQh_9c2c_Tc8c_2d9d_Ts7c_As4c_5s3h() {
    assertEquals(
      "2d9d=5s3h=9c2c Ac4s=As4c Ts7c KsQh JdAd Tc8c",
      Solver.process("texas-holdem 8h8sKcQsTd Ac4s JdAd KsQh 9c2c Tc8c 2d9d Ts7c As4c 5s3h"));
  }

  @Test
  public void test_texas_holdem_685_6c6d7s8sKd_Th7d_8h2h_QhKs_TcQd_Ac2c_4c4s() {
    assertEquals(
      "TcQd Ac2c 4c4s Th7d 8h2h QhKs",
      Solver.process("texas-holdem 6c6d7s8sKd Th7d 8h2h QhKs TcQd Ac2c 4c4s"));
  }

  @Test
  public void test_texas_holdem_686_2s5h9h9sJc_JdTc_6cKs_8dQh_Ts5d_6s6d_Ad4h_9dQc_QdTd_Ac2h() {
    assertEquals(
      "8dQh QdTd 6cKs Ad4h Ac2h Ts5d 6s6d JdTc 9dQc",
      Solver.process("texas-holdem 2s5h9h9sJc JdTc 6cKs 8dQh Ts5d 6s6d Ad4h 9dQc QdTd Ac2h"));
  }

  @Test
  public void test_texas_holdem_687_4h5c7dAdTs_JsJc_9hQs_Kh6c_KsTc() {
    assertEquals(
      "9hQs Kh6c KsTc JsJc",
      Solver.process("texas-holdem 4h5c7dAdTs JsJc 9hQs Kh6c KsTc"));
  }

  @Test
  public void test_texas_holdem_688_2h9dAcAdQh_7s7d_9cAh_3hTh_Jd7h_5c6h_3sQs() {
    assertEquals(
      "5c6h 3hTh Jd7h 7s7d 3sQs 9cAh",
      Solver.process("texas-holdem 2h9dAcAdQh 7s7d 9cAh 3hTh Jd7h 5c6h 3sQs"));
  }

  @Test
  public void test_texas_holdem_689_5c5d7d8c9c_6h3d_7s2s() {
    assertEquals(
      "7s2s 6h3d",
      Solver.process("texas-holdem 5c5d7d8c9c 6h3d 7s2s"));
  }

  @Test
  public void test_texas_holdem_690_4d5s9sAsQs_8sTc_5dTd() {
    assertEquals(
      "5dTd 8sTc",
      Solver.process("texas-holdem 4d5s9sAsQs 8sTc 5dTd"));
  }

  @Test
  public void test_texas_holdem_691_2s5h8c8sTh_8h2c_Ac3c_3sJd_5c9c_4d3h_QdJs_7c7d_Jc8d_7hQs() {
    assertEquals(
      "4d3h 3sJd 7hQs QdJs Ac3c 5c9c 7c7d Jc8d 8h2c",
      Solver.process("texas-holdem 2s5h8c8sTh 8h2c Ac3c 3sJd 5c9c 4d3h QdJs 7c7d Jc8d 7hQs"));
  }

  @Test
  public void test_texas_holdem_692_3c7d9cKdQh_QsJh_5s6d() {
    assertEquals(
      "5s6d QsJh",
      Solver.process("texas-holdem 3c7d9cKdQh QsJh 5s6d"));
  }

  @Test
  public void test_texas_holdem_693_4c4h7d8cTd_Ah5c_Ks9d_8h6d_TcKh_Kd2c_5d5s_3dJd_6h7c_7sQs() {
    assertEquals(
      "3dJd Kd2c Ks9d Ah5c 5d5s 6h7c 7sQs 8h6d TcKh",
      Solver.process("texas-holdem 4c4h7d8cTd Ah5c Ks9d 8h6d TcKh Kd2c 5d5s 3dJd 6h7c 7sQs"));
  }

  @Test
  public void test_texas_holdem_694_4c4s7sKdTc_AsJs_9d3s_8dTh() {
    assertEquals(
      "9d3s AsJs 8dTh",
      Solver.process("texas-holdem 4c4s7sKdTc AsJs 9d3s 8dTh"));
  }

  @Test
  public void test_texas_holdem_695_2s3c4h8hJh_5hTd_5s2d_TsAc_Ad6h_Kc9c() {
    assertEquals(
      "5hTd Kc9c Ad6h TsAc 5s2d",
      Solver.process("texas-holdem 2s3c4h8hJh 5hTd 5s2d TsAc Ad6h Kc9c"));
  }

  @Test
  public void test_texas_holdem_696_3c4d8h9d9s_Kh4h_7h7c_JsAh_8s7d_Ac8c_3s9c_ThTc_Jh9h_Ts3h() {
    assertEquals(
      "JsAh Ts3h Kh4h 7h7c 8s7d Ac8c ThTc Jh9h 3s9c",
      Solver.process("texas-holdem 3c4d8h9d9s Kh4h 7h7c JsAh 8s7d Ac8c 3s9c ThTc Jh9h Ts3h"));
  }

  @Test
  public void test_texas_holdem_697_5h8h9dJcTc_Th5d_As4d() {
    assertEquals(
      "As4d Th5d",
      Solver.process("texas-holdem 5h8h9dJcTc Th5d As4d"));
  }

  @Test
  public void test_texas_holdem_698_2s3c4c6h9h_6s8s_Jd3h_8c2c_6dQh_3sKd_5cQc_4s2h() {
    assertEquals(
      "8c2c Jd3h 3sKd 6s8s 6dQh 4s2h 5cQc",
      Solver.process("texas-holdem 2s3c4c6h9h 6s8s Jd3h 8c2c 6dQh 3sKd 5cQc 4s2h"));
  }

  @Test
  public void test_texas_holdem_699_2c4hAcJdKh_Th3c_Kc5h_7d9d_QcQd_Jh3h_6s7c_TdTc() {
    assertEquals(
      "6s7c 7d9d Th3c TdTc Jh3h QcQd Kc5h",
      Solver.process("texas-holdem 2c4hAcJdKh Th3c Kc5h 7d9d QcQd Jh3h 6s7c TdTc"));
  }

  @Test
  public void test_texas_holdem_700_4c5c8s9hTd_2hKh_8d2d() {
    assertEquals(
      "2hKh 8d2d",
      Solver.process("texas-holdem 4c5c8s9hTd 2hKh 8d2d"));
  }

  @Test
  public void test_texas_holdem_701_3c3d6c7c8d_AsTd_7hQs_TcKh_7s4h_QhKs_Kd6s() {
    assertEquals(
      "TcKh QhKs AsTd Kd6s 7s4h 7hQs",
      Solver.process("texas-holdem 3c3d6c7c8d AsTd 7hQs TcKh 7s4h QhKs Kd6s"));
  }

  @Test
  public void test_texas_holdem_702_AdKcKhQsTd_JdTc_3c3d_3s9c_4s7h_6h7d_Qc4c_JcTs() {
    assertEquals(
      "3s9c=4s7h=6h7d 3c3d Qc4c JcTs=JdTc",
      Solver.process("texas-holdem AdKcKhQsTd JdTc 3c3d 3s9c 4s7h 6h7d Qc4c JcTs"));
  }

  @Test
  public void test_texas_holdem_703_4h9sJcJhTd_Kd8h_4c2d_8d9d_7hQh_7d5d_9hAd_JsJd_7s4d_7cQd() {
    assertEquals(
      "7d5d 7cQd=7hQh Kd8h 4c2d=7s4d 8d9d 9hAd JsJd",
      Solver.process("texas-holdem 4h9sJcJhTd Kd8h 4c2d 8d9d 7hQh 7d5d 9hAd JsJd 7s4d 7cQd"));
  }

  @Test
  public void test_texas_holdem_704_7hJcJhQcQd_9c7c_6c7d_Js2d_3d6d_3s5s_3c9d() {
    assertEquals(
      "3d6d=3s5s=6c7d 3c9d=9c7c Js2d",
      Solver.process("texas-holdem 7hJcJhQcQd 9c7c 6c7d Js2d 3d6d 3s5s 3c9d"));
  }

  @Test
  public void test_texas_holdem_705_3c4d5d5hJh_7d4c_Ac8d_6sKh_2d3s() {
    assertEquals(
      "6sKh Ac8d 2d3s 7d4c",
      Solver.process("texas-holdem 3c4d5d5hJh 7d4c Ac8d 6sKh 2d3s"));
  }

  @Test
  public void test_texas_holdem_706_3h4hAsJhQc_Kd9c_5h9s_3cQs_8cKc_Jc6h_7cAh_Kh8h_9hAd() {
    assertEquals(
      "5h9s 8cKc Kd9c Jc6h 7cAh 9hAd 3cQs Kh8h",
      Solver.process("texas-holdem 3h4hAsJhQc Kd9c 5h9s 3cQs 8cKc Jc6h 7cAh Kh8h 9hAd"));
  }

  @Test
  public void test_texas_holdem_707_3c3d9h9sKc_AsTh_6c8d_4d6s_9d9c_Td7d() {
    assertEquals(
      "4d6s=6c8d=Td7d AsTh 9d9c",
      Solver.process("texas-holdem 3c3d9h9sKc AsTh 6c8d 4d6s 9d9c Td7d"));
  }

  @Test
  public void test_texas_holdem_708_5d5h7dAhJs_3d6d_Tc9d_ThQh_5c2h_9s6h() {
    assertEquals(
      "3d6d 9s6h Tc9d ThQh 5c2h",
      Solver.process("texas-holdem 5d5h7dAhJs 3d6d Tc9d ThQh 5c2h 9s6h"));
  }

  @Test
  public void test_texas_holdem_709_3d6d7cKsQs_4h8d_4c7h_6c5s_2d7s_Qc2h_8sAd_Ac3s_8cQh_9d4s() {
    assertEquals(
      "4h8d 9d4s 8sAd Ac3s 6c5s 2d7s=4c7h Qc2h 8cQh",
      Solver.process("texas-holdem 3d6d7cKsQs 4h8d 4c7h 6c5s 2d7s Qc2h 8sAd Ac3s 8cQh 9d4s"));
  }

  @Test
  public void test_texas_holdem_710_6d7s8hAdJd_2d3s_6s8d_AcJs_3d4h_5hJc_4c7c() {
    assertEquals(
      "2d3s=3d4h 4c7c 5hJc 6s8d AcJs",
      Solver.process("texas-holdem 6d7s8hAdJd 2d3s 6s8d AcJs 3d4h 5hJc 4c7c"));
  }

  @Test
  public void test_texas_holdem_711_3h7dAcAsJd_QhJh_5cTc() {
    assertEquals(
      "5cTc QhJh",
      Solver.process("texas-holdem 3h7dAcAsJd QhJh 5cTc"));
  }

  @Test
  public void test_texas_holdem_712_8c8sAcKsQc_5hTc_6c6d() {
    assertEquals(
      "5hTc 6c6d",
      Solver.process("texas-holdem 8c8sAcKsQc 5hTc 6c6d"));
  }

  @Test
  public void test_texas_holdem_713_3h4sJcKcQs_3dKh_Ts3c_7d4c_2h5h_9d8s_Jh6h_KdQh_JdJs() {
    assertEquals(
      "2h5h 9d8s Ts3c 7d4c Jh6h 3dKh KdQh JdJs",
      Solver.process("texas-holdem 3h4sJcKcQs 3dKh Ts3c 7d4c 2h5h 9d8s Jh6h KdQh JdJs"));
  }

  @Test
  public void test_texas_holdem_714_2h3c7c8d8h_9hQc_2dAc_5cQh_Qs6s_6d8s_AsTs_9d9c_Kc9s() {
    assertEquals(
      "5cQh Qs6s 9hQc Kc9s AsTs 2dAc 9d9c 6d8s",
      Solver.process("texas-holdem 2h3c7c8d8h 9hQc 2dAc 5cQh Qs6s 6d8s AsTs 9d9c Kc9s"));
  }

  @Test
  public void test_texas_holdem_715_2d3h7s9sKh_6c6d_8sQs_5c8d_3d7d() {
    assertEquals(
      "5c8d 8sQs 6c6d 3d7d",
      Solver.process("texas-holdem 2d3h7s9sKh 6c6d 8sQs 5c8d 3d7d"));
  }

  @Test
  public void test_texas_holdem_716_3s5h8hJdJs_9hAs_8c5c_Th6d_3h4s() {
    assertEquals(
      "Th6d 9hAs 3h4s 8c5c",
      Solver.process("texas-holdem 3s5h8hJdJs 9hAs 8c5c Th6d 3h4s"));
  }

  @Test
  public void test_texas_holdem_717_8sQcQdTcTh_Qs4d_6d4c_AhKd_3s7c() {
    assertEquals(
      "3s7c=6d4c AhKd Qs4d",
      Solver.process("texas-holdem 8sQcQdTcTh Qs4d 6d4c AhKd 3s7c"));
  }

  @Test
  public void test_texas_holdem_718_2s4s5c8hAd_5hJs_AhQc_6cAc_3sQd_Qs4d_3h7d() {
    assertEquals(
      "Qs4d 5hJs 6cAc AhQc 3h7d=3sQd",
      Solver.process("texas-holdem 2s4s5c8hAd 5hJs AhQc 6cAc 3sQd Qs4d 3h7d"));
  }

  @Test
  public void test_texas_holdem_719_6h8dQcTdTh_9s2h_9dQh_TcKc_9c7c_5c8h_7s2d() {
    assertEquals(
      "7s2d 9s2h 5c8h 9dQh TcKc 9c7c",
      Solver.process("texas-holdem 6h8dQcTdTh 9s2h 9dQh TcKc 9c7c 5c8h 7s2d"));
  }

  @Test
  public void test_texas_holdem_720_4h4s7c8cJh_Ah6d_AcTd_2sJd_Kh3d_5dQh() {
    assertEquals(
      "5dQh Kh3d Ah6d AcTd 2sJd",
      Solver.process("texas-holdem 4h4s7c8cJh Ah6d AcTd 2sJd Kh3d 5dQh"));
  }

  @Test
  public void test_texas_holdem_721_6c6d7c9dQs_3dKd_Jh6h_7sTc_3s8h_Qd8c() {
    assertEquals(
      "3s8h 3dKd 7sTc Qd8c Jh6h",
      Solver.process("texas-holdem 6c6d7c9dQs 3dKd Jh6h 7sTc 3s8h Qd8c"));
  }

  @Test
  public void test_texas_holdem_722_4s7c9sAsJd_TcTd_4d4c_5cJh_Kc9d_8c7s_3s7h_6s6d() {
    assertEquals(
      "6s6d 3s7h=8c7s Kc9d TcTd 5cJh 4d4c",
      Solver.process("texas-holdem 4s7c9sAsJd TcTd 4d4c 5cJh Kc9d 8c7s 3s7h 6s6d"));
  }

  @Test
  public void test_texas_holdem_723_2c2s6s9sJh_4sQs_KcTh_8c5h_Qc5d_AcAh_Js9c() {
    assertEquals(
      "8c5h Qc5d KcTh Js9c AcAh 4sQs",
      Solver.process("texas-holdem 2c2s6s9sJh 4sQs KcTh 8c5h Qc5d AcAh Js9c"));
  }

  @Test
  public void test_texas_holdem_724_4s6dAcAdJs_5s4d_Ks5c_Td8h_3cTc() {
    assertEquals(
      "3cTc Td8h Ks5c 5s4d",
      Solver.process("texas-holdem 4s6dAcAdJs 5s4d Ks5c Td8h 3cTc"));
  }

  @Test
  public void test_texas_holdem_725_2d6dKdKhQh_5h6c_Qs7h_3c9d() {
    assertEquals(
      "3c9d 5h6c Qs7h",
      Solver.process("texas-holdem 2d6dKdKhQh 5h6c Qs7h 3c9d"));
  }

  @Test
  public void test_texas_holdem_726_7c9sAsTcTs_Qh9d_Ks8s_7d9h_2d3d() {
    assertEquals(
      "2d3d 7d9h=Qh9d Ks8s",
      Solver.process("texas-holdem 7c9sAsTcTs Qh9d Ks8s 7d9h 2d3d"));
  }

  @Test
  public void test_texas_holdem_727_8h9sAhKhTd_7d3s_5d9h_Jc3h_Ks4c() {
    assertEquals(
      "7d3s Jc3h 5d9h Ks4c",
      Solver.process("texas-holdem 8h9sAhKhTd 7d3s 5d9h Jc3h Ks4c"));
  }

  @Test
  public void test_texas_holdem_728_3c8dAhTdTh_2h4s_7c5c_6c9d_Jd4h_8h2c_7sTs() {
    assertEquals(
      "2h4s 7c5c 6c9d Jd4h 8h2c 7sTs",
      Solver.process("texas-holdem 3c8dAhTdTh 2h4s 7c5c 6c9d Jd4h 8h2c 7sTs"));
  }

  @Test
  public void test_texas_holdem_729_4d7s8hAhTc_6h9h_6c2h_7cTh_Jd9c_Ts3s_8cJh_6sQd() {
    assertEquals(
      "6c2h 6sQd 8cJh Ts3s 7cTh 6h9h Jd9c",
      Solver.process("texas-holdem 4d7s8hAhTc 6h9h 6c2h 7cTh Jd9c Ts3s 8cJh 6sQd"));
  }

  @Test
  public void test_texas_holdem_730_5s7sKhThTs_Td6d_3c8s_4sJd() {
    assertEquals(
      "3c8s 4sJd Td6d",
      Solver.process("texas-holdem 5s7sKhThTs Td6d 3c8s 4sJd"));
  }

  @Test
  public void test_texas_holdem_731_2d5c6d9dAh_3c6s_2s8d_Kc3d_As9h_4hJs_5s7d_4s6c_Qc3h_QdTc() {
    assertEquals(
      "4hJs Qc3h QdTc Kc3d 2s8d 5s7d 3c6s=4s6c As9h",
      Solver.process("texas-holdem 2d5c6d9dAh 3c6s 2s8d Kc3d As9h 4hJs 5s7d 4s6c Qc3h QdTc"));
  }

  @Test
  public void test_texas_holdem_732_3d8s9sAhJd_AsTs_8cQs_Js5h_JcAd_4c6h_Ac2d() {
    assertEquals(
      "4c6h 8cQs Js5h Ac2d AsTs JcAd",
      Solver.process("texas-holdem 3d8s9sAhJd AsTs 8cQs Js5h JcAd 4c6h Ac2d"));
  }

  @Test
  public void test_texas_holdem_733_7d8d8sAdQc_2d3s_Js9d_5sQh_Kc2c_AsJc_QsAc_9h5h_6hJd_Ks7s() {
    assertEquals(
      "2d3s 9h5h 6hJd=Js9d Kc2c Ks7s 5sQh AsJc QsAc",
      Solver.process("texas-holdem 7d8d8sAdQc 2d3s Js9d 5sQh Kc2c AsJc QsAc 9h5h 6hJd Ks7s"));
  }

  @Test
  public void test_texas_holdem_734_7c9sQdTcTh_2dJc_9cAs_Qh7s_6d3c_AcKh_JhQc_5hTd() {
    assertEquals(
      "6d3c 2dJc AcKh 9cAs Qh7s JhQc 5hTd",
      Solver.process("texas-holdem 7c9sQdTcTh 2dJc 9cAs Qh7s 6d3c AcKh JhQc 5hTd"));
  }

  @Test
  public void test_texas_holdem_735_3s4d6d7hQh_9c2c_KhJs_Ts5c_Jh9h_8sQs_9s8h_5h2s() {
    assertEquals(
      "9c2c 9s8h Jh9h KhJs 8sQs 5h2s=Ts5c",
      Solver.process("texas-holdem 3s4d6d7hQh 9c2c KhJs Ts5c Jh9h 8sQs 9s8h 5h2s"));
  }

  @Test
  public void test_texas_holdem_736_3h3s7c9sJd_JhAc_AsAh_JcTc_Ts6s_Td8d_6c8h_3dQd_Th5d() {
    assertEquals(
      "6c8h Th5d=Ts6s JcTc JhAc AsAh 3dQd Td8d",
      Solver.process("texas-holdem 3h3s7c9sJd JhAc AsAh JcTc Ts6s Td8d 6c8h 3dQd Th5d"));
  }

  @Test
  public void test_texas_holdem_737_5c7dKdQdQh_9d3c_2d7c_5h2s_8c3s_Js8s_TdTc_QsAh() {
    assertEquals(
      "8c3s 9d3c Js8s 5h2s 2d7c TdTc QsAh",
      Solver.process("texas-holdem 5c7dKdQdQh 9d3c 2d7c 5h2s 8c3s Js8s TdTc QsAh"));
  }

  @Test
  public void test_texas_holdem_738_2d3s4s5cKd_3cJh_5s3h_6sKh_8s2s_6d4c_7c9d() {
    assertEquals(
      "7c9d 8s2s 3cJh 5s3h 6d4c=6sKh",
      Solver.process("texas-holdem 2d3s4s5cKd 3cJh 5s3h 6sKh 8s2s 6d4c 7c9d"));
  }

  @Test
  public void test_texas_holdem_739_5c7s8c8hQh_JsTc_Kh7d_2c9c() {
    assertEquals(
      "2c9c JsTc Kh7d",
      Solver.process("texas-holdem 5c7s8c8hQh JsTc Kh7d 2c9c"));
  }

  @Test
  public void test_texas_holdem_740_2c4c4s7d9h_QdJc_TdJh_9c3s_5dQh() {
    assertEquals(
      "TdJh 5dQh QdJc 9c3s",
      Solver.process("texas-holdem 2c4c4s7d9h QdJc TdJh 9c3s 5dQh"));
  }

  @Test
  public void test_texas_holdem_741_2c6c7s9sTd_5d5s_3c8h_3hJc() {
    assertEquals(
      "3hJc 5d5s 3c8h",
      Solver.process("texas-holdem 2c6c7s9sTd 5d5s 3c8h 3hJc"));
  }

  @Test
  public void test_texas_holdem_742_2h5c5h8hKh_3c8s_Qs6s() {
    assertEquals(
      "Qs6s 3c8s",
      Solver.process("texas-holdem 2h5c5h8hKh 3c8s Qs6s"));
  }

  @Test
  public void test_texas_holdem_743_2s3h4d6sJs_Kc2d_4c6d_Ad9c_5h5c_QcTs_Kd7d_Kh7c_6c9s() {
    assertEquals(
      "QcTs Kd7d=Kh7c Ad9c Kc2d 6c9s 4c6d 5h5c",
      Solver.process("texas-holdem 2s3h4d6sJs Kc2d 4c6d Ad9c 5h5c QcTs Kd7d Kh7c 6c9s"));
  }

  @Test
  public void test_texas_holdem_744_6c7h8hQcQs_Jh9d_7d6s() {
    assertEquals(
      "Jh9d 7d6s",
      Solver.process("texas-holdem 6c7h8hQcQs Jh9d 7d6s"));
  }

  @Test
  public void test_texas_holdem_745_3d6s8c8d9c_8hQs_7s5c_9h4h_6d4c_Ad6c_TdQd_5dAs() {
    assertEquals(
      "TdQd 5dAs 6d4c Ad6c 9h4h 8hQs 7s5c",
      Solver.process("texas-holdem 3d6s8c8d9c 8hQs 7s5c 9h4h 6d4c Ad6c TdQd 5dAs"));
  }

  @Test
  public void test_texas_holdem_746_3d6s7d7s8h_2cQs_2s6c_JdAh_4d6h_7c4h_TcAd_3sKs() {
    assertEquals(
      "2cQs TcAd JdAh 3sKs 2s6c=4d6h 7c4h",
      Solver.process("texas-holdem 3d6s7d7s8h 2cQs 2s6c JdAh 4d6h 7c4h TcAd 3sKs"));
  }

  @Test
  public void test_texas_holdem_747_5d7s9dAcAs_2hJs_QdJd_Jc4d_7d4s_4c5c_9hTh_TsKh_2d3c() {
    assertEquals(
      "2d3c 2hJs=Jc4d QdJd TsKh 4c5c 7d4s 9hTh",
      Solver.process("texas-holdem 5d7s9dAcAs 2hJs QdJd Jc4d 7d4s 4c5c 9hTh TsKh 2d3c"));
  }

  @Test
  public void test_texas_holdem_748_3h4h8d8sAs_Qs5c_7s7c_Kd3s_6s3c_2sTs_4c9s_4sJh_Kc9c_QdQh() {
    assertEquals(
      "2sTs Qs5c Kc9c 6s3c=Kd3s 4c9s=4sJh 7s7c QdQh",
      Solver.process("texas-holdem 3h4h8d8sAs Qs5c 7s7c Kd3s 6s3c 2sTs 4c9s 4sJh Kc9c QdQh"));
  }

  @Test
  public void test_texas_holdem_749_9dJhQhQsTc_4dAd_Ac2s_Kh5h() {
    assertEquals(
      "4dAd=Ac2s Kh5h",
      Solver.process("texas-holdem 9dJhQhQsTc 4dAd Ac2s Kh5h"));
  }

}
