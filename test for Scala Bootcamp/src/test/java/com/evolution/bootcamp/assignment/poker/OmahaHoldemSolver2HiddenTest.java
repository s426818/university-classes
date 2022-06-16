
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver2HiddenTest {


  @Test
  public void test_omaha_holdem_500_4c5s9cQsTc_Td8s2s6d_6s3c4sAs_5dAh4h7h_QhJsJh7c_Qc9dKd5c_2dQdKh9h_9s2h8cJc() {
    assertEquals(
      "6s3c4sAs Td8s2s6d QhJsJh7c 5dAh4h7h 2dQdKh9h 9s2h8cJc Qc9dKd5c",
      Solver.process("omaha-holdem 4c5s9cQsTc Td8s2s6d 6s3c4sAs 5dAh4h7h QhJsJh7c Qc9dKd5c 2dQdKh9h 9s2h8cJc"));
  }

  @Test
  public void test_omaha_holdem_501_2h4hJhKsQh_Kc4cAs8c_3c9hAcQs_2d4sKd3s() {
    assertEquals(
      "3c9hAcQs 2d4sKd3s=Kc4cAs8c",
      Solver.process("omaha-holdem 2h4hJhKsQh Kc4cAs8c 3c9hAcQs 2d4sKd3s"));
  }

  @Test
  public void test_omaha_holdem_502_3h4c6h9dKh_TsQh4d5c_4hAd6d7c() {
    assertEquals(
      "TsQh4d5c 4hAd6d7c",
      Solver.process("omaha-holdem 3h4c6h9dKh TsQh4d5c 4hAd6d7c"));
  }

  @Test
  public void test_omaha_holdem_503_2c3hJdQcQd_6cKc8d4d_Jh7s9c7h_7dTs4s5c_8h2s6h2h() {
    assertEquals(
      "7dTs4s5c 6cKc8d4d Jh7s9c7h 8h2s6h2h",
      Solver.process("omaha-holdem 2c3hJdQcQd 6cKc8d4d Jh7s9c7h 7dTs4s5c 8h2s6h2h"));
  }

  @Test
  public void test_omaha_holdem_504_2c6d6h7dKs_TsAc7sTc_9hKd8d5d() {
    assertEquals(
      "TsAc7sTc 9hKd8d5d",
      Solver.process("omaha-holdem 2c6d6h7dKs TsAc7sTc 9hKd8d5d"));
  }

  @Test
  public void test_omaha_holdem_505_7c7h9hJhJs_4d9cTd8d_Qh8c6s4c_JdAd5c5h_Th7d6h2c_9d6cQs2h_2s3dKc4s() {
    assertEquals(
      "Qh8c6s4c 2s3dKc4s 9d6cQs2h JdAd5c5h 4d9cTd8d Th7d6h2c",
      Solver.process("omaha-holdem 7c7h9hJhJs 4d9cTd8d Qh8c6s4c JdAd5c5h Th7d6h2c 9d6cQs2h 2s3dKc4s"));
  }

  @Test
  public void test_omaha_holdem_506_2c2h5c5d6h_4hAsKs6c_Th6d6sAh_9h8hTd4s_TcKh5h3c_7h4dQc5s_Ts3dJh9d_7s4c2sJd_3h8sAd7c_AcQd9c8c() {
    assertEquals(
      "9h8hTd4s Ts3dJh9d 3h8sAd7c AcQd9c8c 4hAsKs6c 7s4c2sJd 7h4dQc5s TcKh5h3c Th6d6sAh",
      Solver.process("omaha-holdem 2c2h5c5d6h 4hAsKs6c Th6d6sAh 9h8hTd4s TcKh5h3c 7h4dQc5s Ts3dJh9d 7s4c2sJd 3h8sAd7c AcQd9c8c"));
  }

  @Test
  public void test_omaha_holdem_507_3h4d7h9dKc_2c8s9s5d_4hAhTh6d_Qs6c2s9c_7sAd8dKh() {
    assertEquals(
      "4hAhTh6d 2c8s9s5d Qs6c2s9c 7sAd8dKh",
      Solver.process("omaha-holdem 3h4d7h9dKc 2c8s9s5d 4hAhTh6d Qs6c2s9c 7sAd8dKh"));
  }

  @Test
  public void test_omaha_holdem_508_5h6s7hAsTs_Jh2s4h8s_2h9hTc8d_3c6d5c9d() {
    assertEquals(
      "3c6d5c9d 2h9hTc8d Jh2s4h8s",
      Solver.process("omaha-holdem 5h6s7hAsTs Jh2s4h8s 2h9hTc8d 3c6d5c9d"));
  }

  @Test
  public void test_omaha_holdem_509_6h6s9c9hKd_3hTdQc5h_Kh3cJcAc_7sQdKs5d_KcTs8sAs_4dQsJd9d_6c6d4s5s_3d2d2c7c_Ad8d2hJh() {
    assertEquals(
      "3hTdQc5h Ad8d2hJh 3d2d2c7c 7sQdKs5d KcTs8sAs=Kh3cJcAc 4dQsJd9d 6c6d4s5s",
      Solver.process("omaha-holdem 6h6s9c9hKd 3hTdQc5h Kh3cJcAc 7sQdKs5d KcTs8sAs 4dQsJd9d 6c6d4s5s 3d2d2c7c Ad8d2hJh"));
  }

  @Test
  public void test_omaha_holdem_510_4c5d8h9cKd_Kc7h2d5s_7c6c2cTd_QdAc4dKs_6hTh8s7d() {
    assertEquals(
      "QdAc4dKs Kc7h2d5s 6hTh8s7d=7c6c2cTd",
      Solver.process("omaha-holdem 4c5d8h9cKd Kc7h2d5s 7c6c2cTd QdAc4dKs 6hTh8s7d"));
  }

  @Test
  public void test_omaha_holdem_511_4d5d6dKsQh_2cKcAcKd_Qd8c6h3h_Tc9d4c3c_3s2sAdJd_8h7h2hQs_Td6c2d7d_4hAh8d5h() {
    assertEquals(
      "Tc9d4c3c 4hAh8d5h Qd8c6h3h 2cKcAcKd 8h7h2hQs Td6c2d7d 3s2sAdJd",
      Solver.process("omaha-holdem 4d5d6dKsQh 2cKcAcKd Qd8c6h3h Tc9d4c3c 3s2sAdJd 8h7h2hQs Td6c2d7d 4hAh8d5h"));
  }

  @Test
  public void test_omaha_holdem_512_2d4c5hAsQc_Kc5s4h2c_3d5c8c9c_Kd4sQhAd_6hAc4d6d_3s8h3h5d_QdJsTh3c_8s7h9hJh_7dTsTc9s() {
    assertEquals(
      "8s7h9hJh 7dTsTc9s QdJsTh3c Kc5s4h2c 6hAc4d6d Kd4sQhAd 3d5c8c9c=3s8h3h5d",
      Solver.process("omaha-holdem 2d4c5hAsQc Kc5s4h2c 3d5c8c9c Kd4sQhAd 6hAc4d6d 3s8h3h5d QdJsTh3c 8s7h9hJh 7dTsTc9s"));
  }

  @Test
  public void test_omaha_holdem_513_2c2d2s6dQh_7hTs9hTd_8h7c5sQs_8dQc4cJc_Kc9dAc6s() {
    assertEquals(
      "8h7c5sQs 8dQc4cJc Kc9dAc6s 7hTs9hTd",
      Solver.process("omaha-holdem 2c2d2s6dQh 7hTs9hTd 8h7c5sQs 8dQc4cJc Kc9dAc6s"));
  }

  @Test
  public void test_omaha_holdem_514_3s4h8sJsKc_5dKs2s2c_2d6d5h9h_8h5s4sKd() {
    assertEquals(
      "2d6d5h9h 8h5s4sKd 5dKs2s2c",
      Solver.process("omaha-holdem 3s4h8sJsKc 5dKs2s2c 2d6d5h9h 8h5s4sKd"));
  }

  @Test
  public void test_omaha_holdem_515_3d4cKdQhTs_2d4s9s3s_7sQsAcAd_Kc7c8sQd() {
    assertEquals(
      "7sQsAcAd 2d4s9s3s Kc7c8sQd",
      Solver.process("omaha-holdem 3d4cKdQhTs 2d4s9s3s 7sQsAcAd Kc7c8sQd"));
  }

  @Test
  public void test_omaha_holdem_516_2h5s7s8sAs_6s2sQh5d_9cTsQc8h_7c4hAd3d_5h9s3cJc() {
    assertEquals(
      "5h9s3cJc 9cTsQc8h 7c4hAd3d 6s2sQh5d",
      Solver.process("omaha-holdem 2h5s7s8sAs 6s2sQh5d 9cTsQc8h 7c4hAd3d 5h9s3cJc"));
  }

  @Test
  public void test_omaha_holdem_517_2s5d9c9hTh_Qd8c7s2h_Qh8hKhAc_7d4sQsJd_6hAh3cJc_Js7hJh8s_9sTcKcAd() {
    assertEquals(
      "7d4sQsJd 6hAh3cJc Qh8hKhAc Qd8c7s2h Js7hJh8s 9sTcKcAd",
      Solver.process("omaha-holdem 2s5d9c9hTh Qd8c7s2h Qh8hKhAc 7d4sQsJd 6hAh3cJc Js7hJh8s 9sTcKcAd"));
  }

  @Test
  public void test_omaha_holdem_518_2s4h8c9cQd_8d7h9s6c_3s3cKhAd_As4dTdJc_KcJdAhQs_Th2d8s5c_9h6dTc4s() {
    assertEquals(
      "3s3cKhAd KcJdAhQs Th2d8s5c 9h6dTc4s 8d7h9s6c As4dTdJc",
      Solver.process("omaha-holdem 2s4h8c9cQd 8d7h9s6c 3s3cKhAd As4dTdJc KcJdAhQs Th2d8s5c 9h6dTc4s"));
  }

  @Test
  public void test_omaha_holdem_519_3d3s6sAcJd_4d6h3h2c_QcQd3c7c_6cKd5hJc_9hQhAhKs_4s9c5dTc_9d4c9s7d() {
    assertEquals(
      "4s9c5dTc 9d4c9s7d 6cKd5hJc 9hQhAhKs QcQd3c7c 4d6h3h2c",
      Solver.process("omaha-holdem 3d3s6sAcJd 4d6h3h2c QcQd3c7c 6cKd5hJc 9hQhAhKs 4s9c5dTc 9d4c9s7d"));
  }

  @Test
  public void test_omaha_holdem_520_9cAcQdQhTs_5c3s8h4s_Tc6sKd3d() {
    assertEquals(
      "5c3s8h4s Tc6sKd3d",
      Solver.process("omaha-holdem 9cAcQdQhTs 5c3s8h4s Tc6sKd3d"));
  }

  @Test
  public void test_omaha_holdem_521_7hAcAdKhQs_4h3hKcTd_5h3d6d4d_7dThQc8d() {
    assertEquals(
      "5h3d6d4d 7dThQc8d 4h3hKcTd",
      Solver.process("omaha-holdem 7hAcAdKhQs 4h3hKcTd 5h3d6d4d 7dThQc8d"));
  }

  @Test
  public void test_omaha_holdem_522_2d7d8c9sAs_6hAh8h4s_2s4hQd5d_5s7c9d6s_9hQc3s4c_JdAdTd3h() {
    assertEquals(
      "2s4hQd5d 9hQc3s4c 6hAh8h4s 5s7c9d6s JdAdTd3h",
      Solver.process("omaha-holdem 2d7d8c9sAs 6hAh8h4s 2s4hQd5d 5s7c9d6s 9hQc3s4c JdAdTd3h"));
  }

  @Test
  public void test_omaha_holdem_523_3d6s7d7sKd_7c4cAcQc_5hKc6cAs_9sTs3hQh_2hKh8sAd_JsJc3c4h_8c8d2d9h_Qd3sQsAh_5s7h2sJd_5cTc6h8h() {
    assertEquals(
      "9sTs3hQh 5cTc6h8h JsJc3c4h Qd3sQsAh 2hKh8sAd=5hKc6cAs 5s7h2sJd 7c4cAcQc 8c8d2d9h",
      Solver.process("omaha-holdem 3d6s7d7sKd 7c4cAcQc 5hKc6cAs 9sTs3hQh 2hKh8sAd JsJc3c4h 8c8d2d9h Qd3sQsAh 5s7h2sJd 5cTc6h8h"));
  }

  @Test
  public void test_omaha_holdem_524_3s5h5s9sKd_8s6c3hJd_Qc2cKhQs_Ah2hTd5c_JcTh6hAc_Tc2dJs7h() {
    assertEquals(
      "Tc2dJs7h JcTh6hAc 8s6c3hJd Qc2cKhQs Ah2hTd5c",
      Solver.process("omaha-holdem 3s5h5s9sKd 8s6c3hJd Qc2cKhQs Ah2hTd5c JcTh6hAc Tc2dJs7h"));
  }

  @Test
  public void test_omaha_holdem_525_2s6c6s8h9d_AdAsJd4h_2cJhTs8s_Qs7s6h9h_4sQh3s4c_JsKcKd5c() {
    assertEquals(
      "4sQh3s4c 2cJhTs8s JsKcKd5c AdAsJd4h Qs7s6h9h",
      Solver.process("omaha-holdem 2s6c6s8h9d AdAsJd4h 2cJhTs8s Qs7s6h9h 4sQh3s4c JsKcKd5c"));
  }

  @Test
  public void test_omaha_holdem_526_2c5d9dJdQd_9h4hQcJs_As8s9sJc_Td7s3d7d() {
    assertEquals(
      "As8s9sJc 9h4hQcJs Td7s3d7d",
      Solver.process("omaha-holdem 2c5d9dJdQd 9h4hQcJs As8s9sJc Td7s3d7d"));
  }

  @Test
  public void test_omaha_holdem_527_6h7d8h9hQh_Qd7sJs6c_TcJh9d5c_KdQc7c2s_ThTsKsAs_8cAc3sAd_3h4c2d4h() {
    assertEquals(
      "ThTsKsAs 8cAc3sAd KdQc7c2s=Qd7sJs6c TcJh9d5c 3h4c2d4h",
      Solver.process("omaha-holdem 6h7d8h9hQh Qd7sJs6c TcJh9d5c KdQc7c2s ThTsKsAs 8cAc3sAd 3h4c2d4h"));
  }

  @Test
  public void test_omaha_holdem_528_6d8h9c9dKc_2h5h7hQs_9s6hJs5c() {
    assertEquals(
      "2h5h7hQs 9s6hJs5c",
      Solver.process("omaha-holdem 6d8h9c9dKc 2h5h7hQs 9s6hJs5c"));
  }

  @Test
  public void test_omaha_holdem_529_6h7c8c9hQc_5s9sJd2s_Qs7h7sKh_QhKs3h4s_KdQdAcKc_6cAd5cTh() {
    assertEquals(
      "QhKs3h4s Qs7h7sKh 5s9sJd2s 6cAd5cTh KdQdAcKc",
      Solver.process("omaha-holdem 6h7c8c9hQc 5s9sJd2s Qs7h7sKh QhKs3h4s KdQdAcKc 6cAd5cTh"));
  }

  @Test
  public void test_omaha_holdem_530_3h5d6c6d6h_9d5hQc2h_8sKc6s4c_2d3sJc3d_AsAhTd4h() {
    assertEquals(
      "9d5hQc2h 2d3sJc3d AsAhTd4h 8sKc6s4c",
      Solver.process("omaha-holdem 3h5d6c6d6h 9d5hQc2h 8sKc6s4c 2d3sJc3d AsAhTd4h"));
  }

  @Test
  public void test_omaha_holdem_531_5h9dAdAhJs_Ks5c2h4h_3cQh9c9h_4s8h8d7d_4c7cJd2c_KhAs8cQs() {
    assertEquals(
      "Ks5c2h4h 4s8h8d7d 4c7cJd2c KhAs8cQs 3cQh9c9h",
      Solver.process("omaha-holdem 5h9dAdAhJs Ks5c2h4h 3cQh9c9h 4s8h8d7d 4c7cJd2c KhAs8cQs"));
  }

  @Test
  public void test_omaha_holdem_532_2h8cAsKcTc_3cKh5s9c_9d3s2d4h_2cJs5c9h_4sQs3d4d() {
    assertEquals(
      "9d3s2d4h 4sQs3d4d 2cJs5c9h 3cKh5s9c",
      Solver.process("omaha-holdem 2h8cAsKcTc 3cKh5s9c 9d3s2d4h 2cJs5c9h 4sQs3d4d"));
  }

  @Test
  public void test_omaha_holdem_533_4sAhKdKsQc_Jd2h4cTh_7dJh8hQh_2s7cJc8c_Ac4d8d5c_5dJs3h5s_2d6dQd3d_9sAsTs3c() {
    assertEquals(
      "2s7cJc8c 5dJs3h5s 2d6dQd3d 7dJh8hQh Ac4d8d5c 9sAsTs3c Jd2h4cTh",
      Solver.process("omaha-holdem 4sAhKdKsQc Jd2h4cTh 7dJh8hQh 2s7cJc8c Ac4d8d5c 5dJs3h5s 2d6dQd3d 9sAsTs3c"));
  }

  @Test
  public void test_omaha_holdem_534_AsKhKsQdTh_8sJh6c4s_TdAhJc8d_2hAd5c9c_5hKc6h9d() {
    assertEquals(
      "8sJh6c4s 2hAd5c9c 5hKc6h9d TdAhJc8d",
      Solver.process("omaha-holdem AsKhKsQdTh 8sJh6c4s TdAhJc8d 2hAd5c9c 5hKc6h9d"));
  }

  @Test
  public void test_omaha_holdem_535_2s5s7dAcKh_8c4d9c9d_7c6sJs2h_6c4h2cTc() {
    assertEquals(
      "6c4h2cTc 8c4d9c9d 7c6sJs2h",
      Solver.process("omaha-holdem 2s5s7dAcKh 8c4d9c9d 7c6sJs2h 6c4h2cTc"));
  }

  @Test
  public void test_omaha_holdem_536_3s7s8c8dQc_5dTcAhKs_Kc3c2sQd_9c5cTsAd_7hQs6s6d_Jc5s5hKd_9sJsTd4s_4hJh2d7d() {
    assertEquals(
      "9sJsTd4s 9c5cTsAd 5dTcAhKs Jc5s5hKd 4hJh2d7d 7hQs6s6d Kc3c2sQd",
      Solver.process("omaha-holdem 3s7s8c8dQc 5dTcAhKs Kc3c2sQd 9c5cTsAd 7hQs6s6d Jc5s5hKd 9sJsTd4s 4hJh2d7d"));
  }

  @Test
  public void test_omaha_holdem_537_3c5d6d7sTh_9d2cAd5c_Qc5s7d3h_4hQh2h8d_2sKcQs4c_JsJhTcKs_Jc2dAc7c() {
    assertEquals(
      "9d2cAd5c Jc2dAc7c JsJhTcKs Qc5s7d3h 2sKcQs4c 4hQh2h8d",
      Solver.process("omaha-holdem 3c5d6d7sTh 9d2cAd5c Qc5s7d3h 4hQh2h8d 2sKcQs4c JsJhTcKs Jc2dAc7c"));
  }

  @Test
  public void test_omaha_holdem_538_3d4c7s8cAc_2sTs8sAd_3s5cJsAs_6sJh3cQh_5dJcQc9c_2h4sQsJd() {
    assertEquals(
      "6sJh3cQh 2h4sQsJd 3s5cJsAs 2sTs8sAd 5dJcQc9c",
      Solver.process("omaha-holdem 3d4c7s8cAc 2sTs8sAd 3s5cJsAs 6sJh3cQh 5dJcQc9c 2h4sQsJd"));
  }

  @Test
  public void test_omaha_holdem_539_4d5c5d9cAs_8d2sKhJh_TsTd7d6s_QhJs4hKd_AdJcJd2c_2dQdAh9s_4c6cQc7h_Th9h8c5s_AcKc5h7s_Qs7c8sTc() {
    assertEquals(
      "Qs7c8sTc 8d2sKhJh 4c6cQc7h QhJs4hKd TsTd7d6s AdJcJd2c 2dQdAh9s Th9h8c5s AcKc5h7s",
      Solver.process("omaha-holdem 4d5c5d9cAs 8d2sKhJh TsTd7d6s QhJs4hKd AdJcJd2c 2dQdAh9s 4c6cQc7h Th9h8c5s AcKc5h7s Qs7c8sTc"));
  }

  @Test
  public void test_omaha_holdem_540_3c5dQdQsTh_Jh9d4s3h_As5c4dAd_3d2dAc2h_AhKh8hTd_TsKdQc8s_KsJcTcQh() {
    assertEquals(
      "Jh9d4s3h 3d2dAc2h AhKh8hTd As5c4dAd KsJcTcQh=TsKdQc8s",
      Solver.process("omaha-holdem 3c5dQdQsTh Jh9d4s3h As5c4dAd 3d2dAc2h AhKh8hTd TsKdQc8s KsJcTcQh"));
  }

  @Test
  public void test_omaha_holdem_541_2c6c6dJsKd_Qd3hTs4s_2h9s8hAs_9dAhKhQc_Tc9c7sKs_AdAc6h5d_QsTdJc4d_Jd7c5s3s_5c8c2d6s() {
    assertEquals(
      "Qd3hTs4s 2h9s8hAs Jd7c5s3s QsTdJc4d Tc9c7sKs 9dAhKhQc AdAc6h5d 5c8c2d6s",
      Solver.process("omaha-holdem 2c6c6dJsKd Qd3hTs4s 2h9s8hAs 9dAhKhQc Tc9c7sKs AdAc6h5d QsTdJc4d Jd7c5s3s 5c8c2d6s"));
  }

  @Test
  public void test_omaha_holdem_542_8sAhJhQcQs_5c5sJd2c_9s5dJs4c_3dTd2sTs() {
    assertEquals(
      "3dTd2sTs 5c5sJd2c 9s5dJs4c",
      Solver.process("omaha-holdem 8sAhJhQcQs 5c5sJd2c 9s5dJs4c 3dTd2sTs"));
  }

  @Test
  public void test_omaha_holdem_543_AdQdQhThTs_Ah2d6c8s_5sTc6h3h_8cAsJh7d_JcKsQs9s() {
    assertEquals(
      "Ah2d6c8s 8cAsJh7d 5sTc6h3h JcKsQs9s",
      Solver.process("omaha-holdem AdQdQhThTs Ah2d6c8s 5sTc6h3h 8cAsJh7d JcKsQs9s"));
  }

  @Test
  public void test_omaha_holdem_544_2h3d3h7cTc_KcTd5c6s_Jh6c5hJd_9cAd5d4h_9h5s7sQh_6hAs8cQs_Qd3cAh9d() {
    assertEquals(
      "9cAd5d4h 6hAs8cQs 9h5s7sQh KcTd5c6s Jh6c5hJd Qd3cAh9d",
      Solver.process("omaha-holdem 2h3d3h7cTc KcTd5c6s Jh6c5hJd 9cAd5d4h 9h5s7sQh 6hAs8cQs Qd3cAh9d"));
  }

  @Test
  public void test_omaha_holdem_545_4d6h7c8d9d_AsJh5h4c_7hKs9c9s_Qs8cJdKd_8sTs7s5s_ThTcAh2h() {
    assertEquals(
      "ThTcAh2h 7hKs9c9s AsJh5h4c 8sTs7s5s Qs8cJdKd",
      Solver.process("omaha-holdem 4d6h7c8d9d AsJh5h4c 7hKs9c9s Qs8cJdKd 8sTs7s5s ThTcAh2h"));
  }

  @Test
  public void test_omaha_holdem_546_2d4d4h9sKd_7dAsAhQh_6s6h9c2h_QsJdTdAd() {
    assertEquals(
      "6s6h9c2h 7dAsAhQh QsJdTdAd",
      Solver.process("omaha-holdem 2d4d4h9sKd 7dAsAhQh 6s6h9c2h QsJdTdAd"));
  }

  @Test
  public void test_omaha_holdem_547_5d5h6s7sJs_6cKcJdAs_5c7h2d6h_KhQsTc2s_4cTd8hJc_8s7cAcTh_7d3d4s9c() {
    assertEquals(
      "8s7cAcTh 6cKcJdAs 7d3d4s9c 4cTd8hJc KhQsTc2s 5c7h2d6h",
      Solver.process("omaha-holdem 5d5h6s7sJs 6cKcJdAs 5c7h2d6h KhQsTc2s 4cTd8hJc 8s7cAcTh 7d3d4s9c"));
  }

  @Test
  public void test_omaha_holdem_548_3s5c8cJsQd_2sTh2h8s_6sAcQh7h_Kh7d9cKs_4sJhTs6h_3dQc8hQs_4h5s6cTc_3h2c4c7c_7sKd9hAh_4d8d2d3c() {
    assertEquals(
      "7sKd9hAh 3h2c4c7c 4h5s6cTc 2sTh2h8s 4sJhTs6h 6sAcQh7h Kh7d9cKs 4d8d2d3c 3dQc8hQs",
      Solver.process("omaha-holdem 3s5c8cJsQd 2sTh2h8s 6sAcQh7h Kh7d9cKs 4sJhTs6h 3dQc8hQs 4h5s6cTc 3h2c4c7c 7sKd9hAh 4d8d2d3c"));
  }

  @Test
  public void test_omaha_holdem_549_2d4s8cJcQh_As3s4c3d_4h9cJsTs_Qc5d5cAh_Kh9s2c5h_3hKs7d6d_Qs8d2hKc_4dTh6h3c_5sJh8s6s_Td7s7h8h() {
    assertEquals(
      "3hKs7d6d Kh9s2c5h 4dTh6h3c As3s4c3d Td7s7h8h Qc5d5cAh 5sJh8s6s Qs8d2hKc 4h9cJsTs",
      Solver.process("omaha-holdem 2d4s8cJcQh As3s4c3d 4h9cJsTs Qc5d5cAh Kh9s2c5h 3hKs7d6d Qs8d2hKc 4dTh6h3c 5sJh8s6s Td7s7h8h"));
  }

  @Test
  public void test_omaha_holdem_550_6d7s9cAsQh_3h2dAhQs_2h4d7d3c_AdJc8d3d_TdQcTh4s_8sTsJsKh() {
    assertEquals(
      "2h4d7d3c TdQcTh4s AdJc8d3d 3h2dAhQs 8sTsJsKh",
      Solver.process("omaha-holdem 6d7s9cAsQh 3h2dAhQs 2h4d7d3c AdJc8d3d TdQcTh4s 8sTsJsKh"));
  }

  @Test
  public void test_omaha_holdem_551_6c8h9hJhTs_8cQc3c8s_QsKsAsAc_2s6s6h7s_KdQh7h6d_TcQd2d7c_3hTdJdKh_Js5h2c2h_4h5s3s4d_Th9d8d9s() {
    assertEquals(
      "4h5s3s4d Th9d8d9s 2s6s6h7s 8cQc3c8s=TcQd2d7c QsKsAsAc Js5h2c2h KdQh7h6d 3hTdJdKh",
      Solver.process("omaha-holdem 6c8h9hJhTs 8cQc3c8s QsKsAsAc 2s6s6h7s KdQh7h6d TcQd2d7c 3hTdJdKh Js5h2c2h 4h5s3s4d Th9d8d9s"));
  }

  @Test
  public void test_omaha_holdem_552_2h7s8dKhTs_9dJh9hAs_3h5s4c3c_QsAcJdAh_6hTc2sKc_8s6d6c5d_Td4dTh6s() {
    assertEquals(
      "3h5s4c3c 8s6d6c5d QsAcJdAh 6hTc2sKc Td4dTh6s 9dJh9hAs",
      Solver.process("omaha-holdem 2h7s8dKhTs 9dJh9hAs 3h5s4c3c QsAcJdAh 6hTc2sKc 8s6d6c5d Td4dTh6s"));
  }

  @Test
  public void test_omaha_holdem_553_2h3h6hJcTc_QcAh4d7s_2d5s5d4h_7hQd8hAs_4sQh6d9h_Th7dQs8c_8d9s6c2c_9d3s5cJh_Kh3d7cKc_AcKd8s4c() {
    assertEquals(
      "QcAh4d7s AcKd8s4c Th7dQs8c Kh3d7cKc 8d9s6c2c 9d3s5cJh 2d5s5d4h 7hQd8hAs 4sQh6d9h",
      Solver.process("omaha-holdem 2h3h6hJcTc QcAh4d7s 2d5s5d4h 7hQd8hAs 4sQh6d9h Th7dQs8c 8d9s6c2c 9d3s5cJh Kh3d7cKc AcKd8s4c"));
  }

  @Test
  public void test_omaha_holdem_554_4c7s9cAhQh_Kd8c7c5s_4hAcTc6s_5h9h6c8s_Qc4s5d5c_Ks4dQdAs_Jd6dJs2s_6hTh9dKc() {
    assertEquals(
      "Kd8c7c5s 5h9h6c8s 6hTh9dKc Jd6dJs2s Qc4s5d5c 4hAcTc6s Ks4dQdAs",
      Solver.process("omaha-holdem 4c7s9cAhQh Kd8c7c5s 4hAcTc6s 5h9h6c8s Qc4s5d5c Ks4dQdAs Jd6dJs2s 6hTh9dKc"));
  }

  @Test
  public void test_omaha_holdem_555_2d8sJsKsQs_4d5cQh5d_QcAd3cAs_Td3hTs4s_6s3dQd9h_7hKd2s2h() {
    assertEquals(
      "4d5cQh5d 6s3dQd9h QcAd3cAs 7hKd2s2h Td3hTs4s",
      Solver.process("omaha-holdem 2d8sJsKsQs 4d5cQh5d QcAd3cAs Td3hTs4s 6s3dQd9h 7hKd2s2h"));
  }

  @Test
  public void test_omaha_holdem_556_3h5c9cJhTs_8c6h6s8s_5d6cJcQs() {
    assertEquals(
      "8c6h6s8s 5d6cJcQs",
      Solver.process("omaha-holdem 3h5c9cJhTs 8c6h6s8s 5d6cJcQs"));
  }

  @Test
  public void test_omaha_holdem_557_2d3h4c6c8d_8cAhJh7h_6s4dKs3c_JsJcJd8h() {
    assertEquals(
      "8cAhJh7h JsJcJd8h 6s4dKs3c",
      Solver.process("omaha-holdem 2d3h4c6c8d 8cAhJh7h 6s4dKs3c JsJcJd8h"));
  }

  @Test
  public void test_omaha_holdem_558_2h3d4s5h6d_9s9dKs2s_5c4h7dQh_5dKcTs3c_6cQc8dQd_Ac9hJsJh_Ah7h4dJd() {
    assertEquals(
      "9s9dKs2s Ac9hJsJh 6cQc8dQd 5dKcTs3c 5c4h7dQh=Ah7h4dJd",
      Solver.process("omaha-holdem 2h3d4s5h6d 9s9dKs2s 5c4h7dQh 5dKcTs3c 6cQc8dQd Ac9hJsJh Ah7h4dJd"));
  }

  @Test
  public void test_omaha_holdem_559_2d4c4d4s9h_5d9cAdQh_3s4hQc9d_JsQdTs6d() {
    assertEquals(
      "JsQdTs6d 5d9cAdQh 3s4hQc9d",
      Solver.process("omaha-holdem 2d4c4d4s9h 5d9cAdQh 3s4hQc9d JsQdTs6d"));
  }

  @Test
  public void test_omaha_holdem_560_3s4hAcJcJd_QhTsQsKh_2d4s6cKc_Ah8cAsTc_8h7d4d6s_5s9hQc3h_2c8s2h7c() {
    assertEquals(
      "2c8s2h7c 5s9hQc3h 8h7d4d6s 2d4s6cKc QhTsQsKh Ah8cAsTc",
      Solver.process("omaha-holdem 3s4hAcJcJd QhTsQsKh 2d4s6cKc Ah8cAsTc 8h7d4d6s 5s9hQc3h 2c8s2h7c"));
  }

  @Test
  public void test_omaha_holdem_561_4h6s9hAdAs_7s2c3c6c_Jc8cAcQd_7h2dQsTd_8dQh3s3h() {
    assertEquals(
      "7h2dQsTd 8dQh3s3h 7s2c3c6c Jc8cAcQd",
      Solver.process("omaha-holdem 4h6s9hAdAs 7s2c3c6c Jc8cAcQd 7h2dQsTd 8dQh3s3h"));
  }

  @Test
  public void test_omaha_holdem_562_3h3s9dJdTd_4cQd6h2c_6sQs2h5d_7s3c5hQc_JsAc8hTh_2d4s7cAh_4dJh9sTc_3d5sQhTs_9hKc9c8d_AsAd8sKh() {
    assertEquals(
      "4cQd6h2c=6sQs2h5d 2d4s7cAh 4dJh9sTc=JsAc8hTh AsAd8sKh 7s3c5hQc 3d5sQhTs 9hKc9c8d",
      Solver.process("omaha-holdem 3h3s9dJdTd 4cQd6h2c 6sQs2h5d 7s3c5hQc JsAc8hTh 2d4s7cAh 4dJh9sTc 3d5sQhTs 9hKc9c8d AsAd8sKh"));
  }

  @Test
  public void test_omaha_holdem_563_5s8dAsQcTd_AcJc3h7d_Qd2d4dAd_9d5c4s7s_3s2cJs5h_Kh2h3cKd_2s8sKcQh() {
    assertEquals(
      "9d5c4s7s 3s2cJs5h Kh2h3cKd AcJc3h7d 2s8sKcQh Qd2d4dAd",
      Solver.process("omaha-holdem 5s8dAsQcTd AcJc3h7d Qd2d4dAd 9d5c4s7s 3s2cJs5h Kh2h3cKd 2s8sKcQh"));
  }

  @Test
  public void test_omaha_holdem_564_7c9hAdKcKs_4h9s3c7s_Ts8c3dAc_Kd7h6h8h_4c2dQs5h_9cQc6sJc_3sJd3hQh() {
    assertEquals(
      "4c2dQs5h 3sJd3hQh 4h9s3c7s 9cQc6sJc Ts8c3dAc Kd7h6h8h",
      Solver.process("omaha-holdem 7c9hAdKcKs 4h9s3c7s Ts8c3dAc Kd7h6h8h 4c2dQs5h 9cQc6sJc 3sJd3hQh"));
  }

  @Test
  public void test_omaha_holdem_565_2s3h9dAcAs_8hJhQd5c_5d9hAh2c_JcJs4dQs_KsTsJdTd_4h9cQc5s() {
    assertEquals(
      "8hJhQd5c KsTsJdTd JcJs4dQs 4h9cQc5s 5d9hAh2c",
      Solver.process("omaha-holdem 2s3h9dAcAs 8hJhQd5c 5d9hAh2c JcJs4dQs KsTsJdTd 4h9cQc5s"));
  }

  @Test
  public void test_omaha_holdem_566_2d6d7s9hTd_Ad9d3cKc_Jc3d4h2s() {
    assertEquals(
      "Jc3d4h2s Ad9d3cKc",
      Solver.process("omaha-holdem 2d6d7s9hTd Ad9d3cKc Jc3d4h2s"));
  }

  @Test
  public void test_omaha_holdem_567_3c6d6hJcTd_JsJh3h6c_8h6sTc4c_5hQs2hQd_Qh7h2c3s_4dAd8c5d() {
    assertEquals(
      "4dAd8c5d Qh7h2c3s 5hQs2hQd 8h6sTc4c JsJh3h6c",
      Solver.process("omaha-holdem 3c6d6hJcTd JsJh3h6c 8h6sTc4c 5hQs2hQd Qh7h2c3s 4dAd8c5d"));
  }

  @Test
  public void test_omaha_holdem_568_3h3s9dJhQs_Qd4d2sJc_7dKdAc3c_Js4c5c8c_Qh4s6s7h_KhKsQc6h_2dTd5h8d_TsJd6c9c_2h8s9sTh_8h4hTcKc() {
    assertEquals(
      "Js4c5c8c TsJd6c9c Qh4s6s7h Qd4d2sJc KhKsQc6h 7dKdAc3c 2dTd5h8d=2h8s9sTh 8h4hTcKc",
      Solver.process("omaha-holdem 3h3s9dJhQs Qd4d2sJc 7dKdAc3c Js4c5c8c Qh4s6s7h KhKsQc6h 2dTd5h8d TsJd6c9c 2h8s9sTh 8h4hTcKc"));
  }

  @Test
  public void test_omaha_holdem_569_2s3d9dKcKd_As3hKs3c_Tc8c9c4s_Ad4dThAc_JsQcKh7d_Qd6h2hAh_Jh7cJc8d_5h9h7s8h_Jd8s7h2c() {
    assertEquals(
      "Jd8s7h2c Qd6h2hAh 5h9h7s8h Tc8c9c4s Jh7cJc8d JsQcKh7d Ad4dThAc As3hKs3c",
      Solver.process("omaha-holdem 2s3d9dKcKd As3hKs3c Tc8c9c4s Ad4dThAc JsQcKh7d Qd6h2hAh Jh7cJc8d 5h9h7s8h Jd8s7h2c"));
  }

  @Test
  public void test_omaha_holdem_570_2s3d4dQcQs_2c5hKcJc_Jd2hTh8c() {
    assertEquals(
      "Jd2hTh8c 2c5hKcJc",
      Solver.process("omaha-holdem 2s3d4dQcQs 2c5hKcJc Jd2hTh8c"));
  }

  @Test
  public void test_omaha_holdem_571_2s5cJsQcTs_9h6hQd9c_4s4cTdAd() {
    assertEquals(
      "4s4cTdAd 9h6hQd9c",
      Solver.process("omaha-holdem 2s5cJsQcTs 9h6hQd9c 4s4cTdAd"));
  }

  @Test
  public void test_omaha_holdem_572_2c6d9sQhQs_3c9h8d4s_2d3dAhAd_Ks6s7cJs_8hTd7hQc_9d8sKcTs_5d6c3hKh_KdJh5c2h_JdAcTc7d_Qd8cTh5s() {
    assertEquals(
      "JdAcTc7d KdJh5c2h 5d6c3hKh=Ks6s7cJs 3c9h8d4s 9d8sKcTs 2d3dAhAd 8hTd7hQc=Qd8cTh5s",
      Solver.process("omaha-holdem 2c6d9sQhQs 3c9h8d4s 2d3dAhAd Ks6s7cJs 8hTd7hQc 9d8sKcTs 5d6c3hKh KdJh5c2h JdAcTc7d Qd8cTh5s"));
  }

  @Test
  public void test_omaha_holdem_573_3hKcKsTdTh_3d5d8s2c_6h7hTs4s() {
    assertEquals(
      "3d5d8s2c 6h7hTs4s",
      Solver.process("omaha-holdem 3hKcKsTdTh 3d5d8s2c 6h7hTs4s"));
  }

  @Test
  public void test_omaha_holdem_574_2s7hJdJsQh_4dJc8c5h_Qd7c7s3h() {
    assertEquals(
      "4dJc8c5h Qd7c7s3h",
      Solver.process("omaha-holdem 2s7hJdJsQh 4dJc8c5h Qd7c7s3h"));
  }

  @Test
  public void test_omaha_holdem_575_2d4dAcAhQs_8h6d8sKc_Jh7sKh2s_KdJs6sJc_7c6c4s5d_9d3c4c9h_4h7h3s6h_KsTc3h9c_TdQd9s2c() {
    assertEquals(
      "KsTc3h9c Jh7sKh2s 4h7h3s6h=7c6c4s5d 8h6d8sKc 9d3c4c9h KdJs6sJc TdQd9s2c",
      Solver.process("omaha-holdem 2d4dAcAhQs 8h6d8sKc Jh7sKh2s KdJs6sJc 7c6c4s5d 9d3c4c9h 4h7h3s6h KsTc3h9c TdQd9s2c"));
  }

  @Test
  public void test_omaha_holdem_576_3s7dAdAsJh_8d2dQsQd_9h6sTc7s_Th5sAc3c_4h4dKdAh() {
    assertEquals(
      "9h6sTc7s 8d2dQsQd 4h4dKdAh Th5sAc3c",
      Solver.process("omaha-holdem 3s7dAdAsJh 8d2dQsQd 9h6sTc7s Th5sAc3c 4h4dKdAh"));
  }

  @Test
  public void test_omaha_holdem_577_4c4s6h9dQd_Js5dThKh_6c7h2h6d_Qc5c8d6s_7c9h5h2d_Kd3d7sAd_QsTd5s8c_2s9c7dAc_3cAs8sAh_KcQhKs8h() {
    assertEquals(
      "Js5dThKh Kd3d7sAd 7c9h5h2d 2s9c7dAc QsTd5s8c Qc5c8d6s KcQhKs8h 3cAs8sAh 6c7h2h6d",
      Solver.process("omaha-holdem 4c4s6h9dQd Js5dThKh 6c7h2h6d Qc5c8d6s 7c9h5h2d Kd3d7sAd QsTd5s8c 2s9c7dAc 3cAs8sAh KcQhKs8h"));
  }

  @Test
  public void test_omaha_holdem_578_2h2s9cAcKd_KcJc7cQd_TcAs6d7s() {
    assertEquals(
      "KcJc7cQd TcAs6d7s",
      Solver.process("omaha-holdem 2h2s9cAcKd KcJc7cQd TcAs6d7s"));
  }

  @Test
  public void test_omaha_holdem_579_2s4c8s9dTh_8c5cTs9h_6sAc8h9s_8dQs3s2h_KsKd7cTd_As7hKc4d_JhKhAd6d() {
    assertEquals(
      "JhKhAd6d As7hKc4d KsKd7cTd 8dQs3s2h 6sAc8h9s 8c5cTs9h",
      Solver.process("omaha-holdem 2s4c8s9dTh 8c5cTs9h 6sAc8h9s 8dQs3s2h KsKd7cTd As7hKc4d JhKhAd6d"));
  }

  @Test
  public void test_omaha_holdem_580_2s6d8hJdTc_4cQcQs6c_JsKc7s9d_4dAd8d5c_5h7cJc6h() {
    assertEquals(
      "4dAd8d5c 4cQcQs6c 5h7cJc6h JsKc7s9d",
      Solver.process("omaha-holdem 2s6d8hJdTc 4cQcQs6c JsKc7s9d 4dAd8d5c 5h7cJc6h"));
  }

  @Test
  public void test_omaha_holdem_581_3c4d7c9c9d_Qd6s7s2d_Qc2sJdKs_3d8s2h6c() {
    assertEquals(
      "Qc2sJdKs 3d8s2h6c Qd6s7s2d",
      Solver.process("omaha-holdem 3c4d7c9c9d Qd6s7s2d Qc2sJdKs 3d8s2h6c"));
  }

  @Test
  public void test_omaha_holdem_582_6d9cJdJsKh_Qh3dJc9s_KsQs8h8c_6h4dTh4s_Ts3s7h2s_AcKd4h5h_6s5c8s7d_3cJhAd4c() {
    assertEquals(
      "Ts3s7h2s 6s5c8s7d 6h4dTh4s KsQs8h8c AcKd4h5h 3cJhAd4c Qh3dJc9s",
      Solver.process("omaha-holdem 6d9cJdJsKh Qh3dJc9s KsQs8h8c 6h4dTh4s Ts3s7h2s AcKd4h5h 6s5c8s7d 3cJhAd4c"));
  }

  @Test
  public void test_omaha_holdem_583_2s7sKsQdTs_9c6dJhKh_9d2c5hJs_4h6s8cKc_4c5sKdAh() {
    assertEquals(
      "4h6s8cKc 4c5sKdAh 9c6dJhKh=9d2c5hJs",
      Solver.process("omaha-holdem 2s7sKsQdTs 9c6dJhKh 9d2c5hJs 4h6s8cKc 4c5sKdAh"));
  }

  @Test
  public void test_omaha_holdem_584_2h4c5c5h9s_TdQd6sJs_7hJd3d3c() {
    assertEquals(
      "TdQd6sJs 7hJd3d3c",
      Solver.process("omaha-holdem 2h4c5c5h9s TdQd6sJs 7hJd3d3c"));
  }

  @Test
  public void test_omaha_holdem_585_6s7hAhTdTh_8hAdTs8d_KhJs7c4s_7sKcKd6d_Ac2d5h9h_8c2hKs9s_4c5sJh3d_2s5cQcTc_4d9c6h6c() {
    assertEquals(
      "4c5sJh3d KhJs7c4s 7sKcKd6d 2s5cQcTc 8c2hKs9s Ac2d5h9h 4d9c6h6c 8hAdTs8d",
      Solver.process("omaha-holdem 6s7hAhTdTh 8hAdTs8d KhJs7c4s 7sKcKd6d Ac2d5h9h 8c2hKs9s 4c5sJh3d 2s5cQcTc 4d9c6h6c"));
  }

  @Test
  public void test_omaha_holdem_586_5d8c9hAhJs_Kd9cKc4h_Th3h8d8h_Kh2hTcKs_6s2s3d7h() {
    assertEquals(
      "Kd9cKc4h=Kh2hTcKs Th3h8d8h 6s2s3d7h",
      Solver.process("omaha-holdem 5d8c9hAhJs Kd9cKc4h Th3h8d8h Kh2hTcKs 6s2s3d7h"));
  }

  @Test
  public void test_omaha_holdem_587_3d5c6c6sJh_Qc7s5dJc_Kd4hQh2h_9cTd6hTh_9h7hTs7d_JsTc4c7c_3c2cAs5h() {
    assertEquals(
      "3c2cAs5h 9h7hTs7d Qc7s5dJc 9cTd6hTh Kd4hQh2h JsTc4c7c",
      Solver.process("omaha-holdem 3d5c6c6sJh Qc7s5dJc Kd4hQh2h 9cTd6hTh 9h7hTs7d JsTc4c7c 3c2cAs5h"));
  }

  @Test
  public void test_omaha_holdem_588_4s5c8c9cTc_3s3dQd6d_9sAsAh5d_5hAd2cJc() {
    assertEquals(
      "3s3dQd6d 9sAsAh5d 5hAd2cJc",
      Solver.process("omaha-holdem 4s5c8c9cTc 3s3dQd6d 9sAsAh5d 5hAd2cJc"));
  }

  @Test
  public void test_omaha_holdem_589_2d3s8dKcKs_9cTc6d7s_Td4sAd4h() {
    assertEquals(
      "9cTc6d7s Td4sAd4h",
      Solver.process("omaha-holdem 2d3s8dKcKs 9cTc6d7s Td4sAd4h"));
  }

  @Test
  public void test_omaha_holdem_590_7dAhJhJsQh_5cAs8c3h_9d6c7sJc() {
    assertEquals(
      "5cAs8c3h 9d6c7sJc",
      Solver.process("omaha-holdem 7dAhJhJsQh 5cAs8c3h 9d6c7sJc"));
  }

  @Test
  public void test_omaha_holdem_591_5c7h8hAcJc_Jd3s7cQc_6s7s4d5s_AsQd4h4s() {
    assertEquals(
      "AsQd4h4s 6s7s4d5s Jd3s7cQc",
      Solver.process("omaha-holdem 5c7h8hAcJc Jd3s7cQc 6s7s4d5s AsQd4h4s"));
  }

  @Test
  public void test_omaha_holdem_592_3s9dJcQdTc_4dJd8s2c_6sAd5cTs_JsTh5dKc_9s9h4c3h_6d4s7hKh_7c5s2sAs_Kd6c9cQh_Ks6h8d2h_Qc8cAc7d() {
    assertEquals(
      "6d4s7hKh Ks6h8d2h 7c5s2sAs 6sAd5cTs 9s9h4c3h 4dJd8s2c=Qc8cAc7d JsTh5dKc=Kd6c9cQh",
      Solver.process("omaha-holdem 3s9dJcQdTc 4dJd8s2c 6sAd5cTs JsTh5dKc 9s9h4c3h 6d4s7hKh 7c5s2sAs Kd6c9cQh Ks6h8d2h Qc8cAc7d"));
  }

  @Test
  public void test_omaha_holdem_593_6c7d7sJcJh_5hKhJd6s_Ah9d5cKs_Td2cQsAd_3c8cAsQd_Th3d8s5d_Kc7c2d3h_Ts2h6d4s_4h7h4d3s_5s9c4cTc() {
    assertEquals(
      "Th3d8s5d 5s9c4cTc 3c8cAsQd=Td2cQsAd Ah9d5cKs Ts2h6d4s 4h7h4d3s Kc7c2d3h 5hKhJd6s",
      Solver.process("omaha-holdem 6c7d7sJcJh 5hKhJd6s Ah9d5cKs Td2cQsAd 3c8cAsQd Th3d8s5d Kc7c2d3h Ts2h6d4s 4h7h4d3s 5s9c4cTc"));
  }

  @Test
  public void test_omaha_holdem_594_2d3d6dJdQd_5c6cTh2c_As7h2sQh_4c3cKh9s_9cKc6hAh_6s8dTsJs_8h3h9d8s_Ac4h7c4d_7sJc5h2h_KsTdAdJh() {
    assertEquals(
      "4c3cKh9s Ac4h7c4d 9cKc6hAh 8h3h9d8s 5c6cTh2c 7sJc5h2h 6s8dTsJs As7h2sQh KsTdAdJh",
      Solver.process("omaha-holdem 2d3d6dJdQd 5c6cTh2c As7h2sQh 4c3cKh9s 9cKc6hAh 6s8dTsJs 8h3h9d8s Ac4h7c4d 7sJc5h2h KsTdAdJh"));
  }

  @Test
  public void test_omaha_holdem_595_3h4hJcKdTh_Js9d4d7d_Ks3d4s8d_6s8c9hTc_7sTs3s9s_5s2c3cKc_Ad7c6h6c_Ac4cQdQc() {
    assertEquals(
      "Ad7c6h6c 6s8c9hTc 7sTs3s9s Js9d4d7d 5s2c3cKc Ks3d4s8d Ac4cQdQc",
      Solver.process("omaha-holdem 3h4hJcKdTh Js9d4d7d Ks3d4s8d 6s8c9hTc 7sTs3s9s 5s2c3cKc Ad7c6h6c Ac4cQdQc"));
  }

  @Test
  public void test_omaha_holdem_596_2h9dJhKhKs_7c3h8s7h_6c5d9h7d_Qs8hQdAd_8d8c3sQc_QhJs2cJc() {
    assertEquals(
      "8d8c3sQc 6c5d9h7d Qs8hQdAd 7c3h8s7h QhJs2cJc",
      Solver.process("omaha-holdem 2h9dJhKhKs 7c3h8s7h 6c5d9h7d Qs8hQdAd 8d8c3sQc QhJs2cJc"));
  }

  @Test
  public void test_omaha_holdem_597_6cJdKcKdTs_Td8c8sAs_2hKh5cQc_Ac3dQd2s_5h3c8d9s_9d7sTcQs() {
    assertEquals(
      "5h3c8d9s Td8c8sAs 2hKh5cQc 9d7sTcQs Ac3dQd2s",
      Solver.process("omaha-holdem 6cJdKcKdTs Td8c8sAs 2hKh5cQc Ac3dQd2s 5h3c8d9s 9d7sTcQs"));
  }

  @Test
  public void test_omaha_holdem_598_3h6h7c8hKd_7sThTcJd_TdAcKs5s_4dKcAh5h_4h4c8sQc_4s2c9cJh_2dQhAd9d() {
    assertEquals(
      "4s2c9cJh 2dQhAd9d 4h4c8sQc 7sThTcJd TdAcKs5s 4dKcAh5h",
      Solver.process("omaha-holdem 3h6h7c8hKd 7sThTcJd TdAcKs5s 4dKcAh5h 4h4c8sQc 4s2c9cJh 2dQhAd9d"));
  }

  @Test
  public void test_omaha_holdem_599_8hJsQcTdTs_7cQs9hAc_3dQdJcJd_8s7s4hQh_9s4cTc6c_2s3c2h7d_Kh6hKc3s_9d5sKs7h() {
    assertEquals(
      "2s3c2h7d 8s7s4hQh Kh6hKc3s 7cQs9hAc=9s4cTc6c 9d5sKs7h 3dQdJcJd",
      Solver.process("omaha-holdem 8hJsQcTdTs 7cQs9hAc 3dQdJcJd 8s7s4hQh 9s4cTc6c 2s3c2h7d Kh6hKc3s 9d5sKs7h"));
  }

  @Test
  public void test_omaha_holdem_600_3d6d8cThTs_7cKs3s4s_JhJc5s2s() {
    assertEquals(
      "7cKs3s4s JhJc5s2s",
      Solver.process("omaha-holdem 3d6d8cThTs 7cKs3s4s JhJc5s2s"));
  }

  @Test
  public void test_omaha_holdem_601_2h3h3s7cAd_8sAcJsQc_Jc5d4s8d_Ts8cQs6h_7s8h6c4h_Kd3cTd2s_Qd9c9dTc_4cKh7dAh_Jd6d5h3d() {
    assertEquals(
      "Ts8cQs6h 7s8h6c4h Qd9c9dTc 8sAcJsQc 4cKh7dAh Jd6d5h3d Jc5d4s8d Kd3cTd2s",
      Solver.process("omaha-holdem 2h3h3s7cAd 8sAcJsQc Jc5d4s8d Ts8cQs6h 7s8h6c4h Kd3cTd2s Qd9c9dTc 4cKh7dAh Jd6d5h3d"));
  }

  @Test
  public void test_omaha_holdem_602_4h9h9sKsQh_8d4s3sAc_Qd7h6h8s_8hTdJsKh_3h4cJd3c() {
    assertEquals(
      "3h4cJd3c 8d4s3sAc Qd7h6h8s 8hTdJsKh",
      Solver.process("omaha-holdem 4h9h9sKsQh 8d4s3sAc Qd7h6h8s 8hTdJsKh 3h4cJd3c"));
  }

  @Test
  public void test_omaha_holdem_603_3c3h4c9dQh_Ah5cJh2d_Kc8sTc6h_6d4s8dKs_7cAcTs5h_7h3d9hQd_3s7s5d4d_TdAd4hAs_8hJc8cKd() {
    assertEquals(
      "Kc8sTc6h 7cAcTs5h Ah5cJh2d 6d4s8dKs 8hJc8cKd TdAd4hAs 3s7s5d4d 7h3d9hQd",
      Solver.process("omaha-holdem 3c3h4c9dQh Ah5cJh2d Kc8sTc6h 6d4s8dKs 7cAcTs5h 7h3d9hQd 3s7s5d4d TdAd4hAs 8hJc8cKd"));
  }

  @Test
  public void test_omaha_holdem_604_2d2h3s8hJs_9cKh7s8s_ThJh4c7h_TdAs5cKc_6h7d6s5h() {
    assertEquals(
      "TdAs5cKc 6h7d6s5h 9cKh7s8s ThJh4c7h",
      Solver.process("omaha-holdem 2d2h3s8hJs 9cKh7s8s ThJh4c7h TdAs5cKc 6h7d6s5h"));
  }

  @Test
  public void test_omaha_holdem_605_2c4d6c7dTc_7hKc6hAh_Js4sQs6s_9cJd7s3c_7cJcAs9s_8dAc3hTh_Ad5c5sJh_6d3sQh4h_9d5d4cQd() {
    assertEquals(
      "9d5d4cQd Ad5c5sJh 8dAc3hTh 6d3sQh4h=Js4sQs6s 7hKc6hAh 9cJd7s3c 7cJcAs9s",
      Solver.process("omaha-holdem 2c4d6c7dTc 7hKc6hAh Js4sQs6s 9cJd7s3c 7cJcAs9s 8dAc3hTh Ad5c5sJh 6d3sQh4h 9d5d4cQd"));
  }

  @Test
  public void test_omaha_holdem_606_4s9hKsQsTs_TdTh2cJc_Jd6h6s8h_Kc5d5sQc() {
    assertEquals(
      "Kc5d5sQc Jd6h6s8h TdTh2cJc",
      Solver.process("omaha-holdem 4s9hKsQsTs TdTh2cJc Jd6h6s8h Kc5d5sQc"));
  }

  @Test
  public void test_omaha_holdem_607_3s5sAhJdQd_Kh3c5h6h_KcQs3h4d() {
    assertEquals(
      "Kh3c5h6h KcQs3h4d",
      Solver.process("omaha-holdem 3s5sAhJdQd Kh3c5h6h KcQs3h4d"));
  }

  @Test
  public void test_omaha_holdem_608_3d5c8s9dJd_TcAd6h2h_Qs2cTh5d_7sKs7d8d_9cJc6dAc_3s7h6cKc_Kd9h4h2s() {
    assertEquals(
      "TcAd6h2h Kd9h4h2s 9cJc6dAc 3s7h6cKc Qs2cTh5d 7sKs7d8d",
      Solver.process("omaha-holdem 3d5c8s9dJd TcAd6h2h Qs2cTh5d 7sKs7d8d 9cJc6dAc 3s7h6cKc Kd9h4h2s"));
  }

  @Test
  public void test_omaha_holdem_609_2s3h3sAcKd_5dQc6dAd_6c6sJc5c_3d8cQs5h_Th8hJd8d() {
    assertEquals(
      "6c6sJc5c Th8hJd8d 5dQc6dAd 3d8cQs5h",
      Solver.process("omaha-holdem 2s3h3sAcKd 5dQc6dAd 6c6sJc5c 3d8cQs5h Th8hJd8d"));
  }

  @Test
  public void test_omaha_holdem_610_5c5d5h6dKh_AdTc9hKs_3hAh8hKd_2s7h8d4c_7s2cQsAs() {
    assertEquals(
      "2s7h8d4c 7s2cQsAs 3hAh8hKd=AdTc9hKs",
      Solver.process("omaha-holdem 5c5d5h6dKh AdTc9hKs 3hAh8hKd 2s7h8d4c 7s2cQsAs"));
  }

  @Test
  public void test_omaha_holdem_611_2h7d8hAcQd_JcKc6c8c_3s5h9h2d_6s8dQc6d_4hAdKd7c_2s9cKh4s_2c3d8s3c() {
    assertEquals(
      "3s5h9h2d 2s9cKh4s JcKc6c8c 2c3d8s3c 6s8dQc6d 4hAdKd7c",
      Solver.process("omaha-holdem 2h7d8hAcQd JcKc6c8c 3s5h9h2d 6s8dQc6d 4hAdKd7c 2s9cKh4s 2c3d8s3c"));
  }

  @Test
  public void test_omaha_holdem_612_4c5c6hAhQs_Kh3dQh5h_2s4h7h2c_Qd3h3s5d_7d3c2h2d_7cJdJs9c() {
    assertEquals(
      "2s4h7h2c 7cJdJs9c Kh3dQh5h=Qd3h3s5d 7d3c2h2d",
      Solver.process("omaha-holdem 4c5c6hAhQs Kh3dQh5h 2s4h7h2c Qd3h3s5d 7d3c2h2d 7cJdJs9c"));
  }

  @Test
  public void test_omaha_holdem_613_2h4s5s9sQc_2s8c6s4h_Ah9c7dTs_KhKsJs8h_7hAs8sAc_Jh3c3dJd_3h5h2c9d_KcThQsKd_6c9h5c3s_4c4dQdJc() {
    assertEquals(
      "Ah9c7dTs Jh3c3dJd KcThQsKd 3h5h2c9d 4c4dQdJc 6c9h5c3s 2s8c6s4h KhKsJs8h 7hAs8sAc",
      Solver.process("omaha-holdem 2h4s5s9sQc 2s8c6s4h Ah9c7dTs KhKsJs8h 7hAs8sAc Jh3c3dJd 3h5h2c9d KcThQsKd 6c9h5c3s 4c4dQdJc"));
  }

  @Test
  public void test_omaha_holdem_614_2h3d6hAdAs_Td5s9h6c_AcTsJdQs_JhQd5h4d_4h3s8d2d_7d7c4sJc_7s6d2cQh() {
    assertEquals(
      "4h3s8d2d Td5s9h6c 7s6d2cQh 7d7c4sJc AcTsJdQs JhQd5h4d",
      Solver.process("omaha-holdem 2h3d6hAdAs Td5s9h6c AcTsJdQs JhQd5h4d 4h3s8d2d 7d7c4sJc 7s6d2cQh"));
  }

  @Test
  public void test_omaha_holdem_615_3c5h9dAdAh_6dQcTs4h_JdTcAc4c_3sJs2c2d_6cTh7cJh_8cQh2hQs_5d9hTd7h_Jc8d7s5c_Kd9s3d8h() {
    assertEquals(
      "6cTh7cJh 6dQcTs4h 3sJs2c2d Jc8d7s5c 5d9hTd7h Kd9s3d8h 8cQh2hQs JdTcAc4c",
      Solver.process("omaha-holdem 3c5h9dAdAh 6dQcTs4h JdTcAc4c 3sJs2c2d 6cTh7cJh 8cQh2hQs 5d9hTd7h Jc8d7s5c Kd9s3d8h"));
  }

  @Test
  public void test_omaha_holdem_616_2d4d6s8sAh_9sQs5sTd_5c4s2sJd_Qc3h2c5d_3d9cAs3s_Kc8cAd6d_7h4hKsJs_JhQdKh8h_7cKd3c5h_6c7s7d9h() {
    assertEquals(
      "9sQs5sTd 7h4hKsJs 6c7s7d9h JhQdKh8h 3d9cAs3s 5c4s2sJd Kc8cAd6d Qc3h2c5d 7cKd3c5h",
      Solver.process("omaha-holdem 2d4d6s8sAh 9sQs5sTd 5c4s2sJd Qc3h2c5d 3d9cAs3s Kc8cAd6d 7h4hKsJs JhQdKh8h 7cKd3c5h 6c7s7d9h"));
  }

  @Test
  public void test_omaha_holdem_617_2h5c5s6h8d_8hKh3hKs_6dQc9sTh_4s6c7cTd_9cJs4c7h_Ac6sQh8c_9dQdTsKc() {
    assertEquals(
      "9dQdTsKc 6dQc9sTh Ac6sQh8c 8hKh3hKs 4s6c7cTd 9cJs4c7h",
      Solver.process("omaha-holdem 2h5c5s6h8d 8hKh3hKs 6dQc9sTh 4s6c7cTd 9cJs4c7h Ac6sQh8c 9dQdTsKc"));
  }

  @Test
  public void test_omaha_holdem_618_2h3c5h9hTd_4cJd4h2d_8d5d3sJs_As9cKcAd() {
    assertEquals(
      "4cJd4h2d As9cKcAd 8d5d3sJs",
      Solver.process("omaha-holdem 2h3c5h9hTd 4cJd4h2d 8d5d3sJs As9cKcAd"));
  }

  @Test
  public void test_omaha_holdem_619_3d7dKsThTs_Td9c8dAc_Js2d5c7h_JcJh9d2s_3s9s3h7s_2hAs5d9h() {
    assertEquals(
      "2hAs5d9h Js2d5c7h JcJh9d2s Td9c8dAc 3s9s3h7s",
      Solver.process("omaha-holdem 3d7dKsThTs Td9c8dAc Js2d5c7h JcJh9d2s 3s9s3h7s 2hAs5d9h"));
  }

  @Test
  public void test_omaha_holdem_620_2h3d8cAhKd_4h3hTc2d_2cAcKc7s_QhKhQd5c_6h9hJs5d_4s7d8h6c() {
    assertEquals(
      "6h9hJs5d 4s7d8h6c QhKhQd5c 4h3hTc2d 2cAcKc7s",
      Solver.process("omaha-holdem 2h3d8cAhKd 4h3hTc2d 2cAcKc7s QhKhQd5c 6h9hJs5d 4s7d8h6c"));
  }

  @Test
  public void test_omaha_holdem_621_3h6c6s7sTc_8s4d7cKh_5dQd3dKd() {
    assertEquals(
      "5dQd3dKd 8s4d7cKh",
      Solver.process("omaha-holdem 3h6c6s7sTc 8s4d7cKh 5dQd3dKd"));
  }

  @Test
  public void test_omaha_holdem_622_2h3h8sAsTd_9d5cTsJc_Kh3cKcKd_4s7d9s6s_Th6c2d2s_4c3sAh5s_5hQs5dJd_Qc8h2c4d_7cJh6dQh() {
    assertEquals(
      "4s7d9s6s 7cJh6dQh 5hQs5dJd 9d5cTsJc Kh3cKcKd Qc8h2c4d Th6c2d2s 4c3sAh5s",
      Solver.process("omaha-holdem 2h3h8sAsTd 9d5cTsJc Kh3cKcKd 4s7d9s6s Th6c2d2s 4c3sAh5s 5hQs5dJd Qc8h2c4d 7cJh6dQh"));
  }

  @Test
  public void test_omaha_holdem_623_2c6d7h8dAs_3h9d9sKd_2h7d5d8s_QsTdQh4d_4h5cAc9h_Kc4s7s5s_6sAhJc2d_AdQd8h6h() {
    assertEquals(
      "3h9d9sKd QsTdQh4d 2h7d5d8s 6sAhJc2d AdQd8h6h Kc4s7s5s 4h5cAc9h",
      Solver.process("omaha-holdem 2c6d7h8dAs 3h9d9sKd 2h7d5d8s QsTdQh4d 4h5cAc9h Kc4s7s5s 6sAhJc2d AdQd8h6h"));
  }

  @Test
  public void test_omaha_holdem_624_3d4s9cAdJh_As2c8h7h_9sJc9dKh() {
    assertEquals(
      "As2c8h7h 9sJc9dKh",
      Solver.process("omaha-holdem 3d4s9cAdJh As2c8h7h 9sJc9dKh"));
  }

  @Test
  public void test_omaha_holdem_625_2h5c7s9sAd_Kc3c7h6c_4sTc4h2c_Th6h9d3s_Qs8cJhQh_KdKh5hAs_2d5dJd4d_7cAc3dTs() {
    assertEquals(
      "4sTc4h2c Kc3c7h6c Th6h9d3s Qs8cJhQh 2d5dJd4d KdKh5hAs 7cAc3dTs",
      Solver.process("omaha-holdem 2h5c7s9sAd Kc3c7h6c 4sTc4h2c Th6h9d3s Qs8cJhQh KdKh5hAs 2d5dJd4d 7cAc3dTs"));
  }

  @Test
  public void test_omaha_holdem_626_2d5h9cJcQd_8s7h8cQh_Kh6dAh4c_Jd7c3cTc() {
    assertEquals(
      "Kh6dAh4c Jd7c3cTc 8s7h8cQh",
      Solver.process("omaha-holdem 2d5h9cJcQd 8s7h8cQh Kh6dAh4c Jd7c3cTc"));
  }

  @Test
  public void test_omaha_holdem_627_2h4c5dJdJh_5cKc8sKs_9hJs7c3c_AhAdTcQd_Td2cQs9d() {
    assertEquals(
      "Td2cQs9d 5cKc8sKs AhAdTcQd 9hJs7c3c",
      Solver.process("omaha-holdem 2h4c5dJdJh 5cKc8sKs 9hJs7c3c AhAdTcQd Td2cQs9d"));
  }

  @Test
  public void test_omaha_holdem_628_2c6h7d8hAs_8s6cTc7s_2s3cKs4h_QdJdJcJh_Td4c8c4s() {
    assertEquals(
      "2s3cKs4h Td4c8c4s QdJdJcJh 8s6cTc7s",
      Solver.process("omaha-holdem 2c6h7d8hAs 8s6cTc7s 2s3cKs4h QdJdJcJh Td4c8c4s"));
  }

  @Test
  public void test_omaha_holdem_629_3c3s9hTcTh_QcKsAs5s_4sQd6s5h_7s7cAdJc_6c6h8d2c() {
    assertEquals(
      "4sQd6s5h QcKsAs5s 6c6h8d2c 7s7cAdJc",
      Solver.process("omaha-holdem 3c3s9hTcTh QcKsAs5s 4sQd6s5h 7s7cAdJc 6c6h8d2c"));
  }

  @Test
  public void test_omaha_holdem_630_3s4h6h8hKh_2sTh6c2h_Qc7s8d9d_6s7h5h7d_Jd2c3d3h_AsQs8sTc_4s4c5sAc_8c5c7c9s_3cQhJhTd() {
    assertEquals(
      "Qc7s8d9d AsQs8sTc Jd2c3d3h 4s4c5sAc 8c5c7c9s 2sTh6c2h 3cQhJhTd 6s7h5h7d",
      Solver.process("omaha-holdem 3s4h6h8hKh 2sTh6c2h Qc7s8d9d 6s7h5h7d Jd2c3d3h AsQs8sTc 4s4c5sAc 8c5c7c9s 3cQhJhTd"));
  }

  @Test
  public void test_omaha_holdem_631_3h4dKdKsTc_9hTs5c7d_Jc4h2s6d_3s4sJsQh() {
    assertEquals(
      "Jc4h2s6d 3s4sJsQh 9hTs5c7d",
      Solver.process("omaha-holdem 3h4dKdKsTc 9hTs5c7d Jc4h2s6d 3s4sJsQh"));
  }

  @Test
  public void test_omaha_holdem_632_3h5h8c9dJs_QsTdThKc_6sAsAh9s_9h8dAc4d_5d6h2d3c_3d7sKhTc_4h9cQd2c_KsJh5c3s_7dQc8sAd_5s2h4s7h() {
    assertEquals(
      "5s2h4s7h 7dQc8sAd 4h9cQd2c 6sAsAh9s 5d6h2d3c 9h8dAc4d KsJh5c3s 3d7sKhTc QsTdThKc",
      Solver.process("omaha-holdem 3h5h8c9dJs QsTdThKc 6sAsAh9s 9h8dAc4d 5d6h2d3c 3d7sKhTc 4h9cQd2c KsJh5c3s 7dQc8sAd 5s2h4s7h"));
  }

  @Test
  public void test_omaha_holdem_633_4h9sAhKdQc_Jc9dThJh_8sAd3h3s_3c2hKh2s_4d5dJdQh_QsKcTdTc_4cKs5s7d_8d4s5h7c_6d8hTs9c() {
    assertEquals(
      "8d4s5h7c 6d8hTs9c 3c2hKh2s 8sAd3h3s 4d5dJdQh 4cKs5s7d QsKcTdTc Jc9dThJh",
      Solver.process("omaha-holdem 4h9sAhKdQc Jc9dThJh 8sAd3h3s 3c2hKh2s 4d5dJdQh QsKcTdTc 4cKs5s7d 8d4s5h7c 6d8hTs9c"));
  }

  @Test
  public void test_omaha_holdem_634_3c6c7cAcQh_9h7dQs4d_8s4h8h3h_Qd7sKc2h_2c6h2dTd_AdTh9s9d() {
    assertEquals(
      "2c6h2dTd 8s4h8h3h AdTh9s9d 9h7dQs4d=Qd7sKc2h",
      Solver.process("omaha-holdem 3c6c7cAcQh 9h7dQs4d 8s4h8h3h Qd7sKc2h 2c6h2dTd AdTh9s9d"));
  }

  @Test
  public void test_omaha_holdem_635_3c5c7d9dAd_Tc4s4d7h_6s2c5h5d() {
    assertEquals(
      "Tc4s4d7h 6s2c5h5d",
      Solver.process("omaha-holdem 3c5c7d9dAd Tc4s4d7h 6s2c5h5d"));
  }

  @Test
  public void test_omaha_holdem_636_2s8c8d8sTh_As6h8hJh_Jd4s5h5s_6c9s2c7c_3d3sKs4d_QsKh6sTs() {
    assertEquals(
      "6c9s2c7c QsKh6sTs 3d3sKs4d Jd4s5h5s As6h8hJh",
      Solver.process("omaha-holdem 2s8c8d8sTh As6h8hJh Jd4s5h5s 6c9s2c7c 3d3sKs4d QsKh6sTs"));
  }

  @Test
  public void test_omaha_holdem_637_2h4s9hKdKs_8dAs9dQh_4cKh6cQc() {
    assertEquals(
      "8dAs9dQh 4cKh6cQc",
      Solver.process("omaha-holdem 2h4s9hKdKs 8dAs9dQh 4cKh6cQc"));
  }

  @Test
  public void test_omaha_holdem_638_5c7s8h9sKh_6h4s8sQc_9d7d9hTd_6dJh3h6c_5sAh7c7h_8cThKcQd_9c4h2d3d_3c8dKs3s() {
    assertEquals(
      "6dJh3h6c 9c4h2d3d 3c8dKs3s=8cThKcQd 5sAh7c7h 9d7d9hTd 6h4s8sQc",
      Solver.process("omaha-holdem 5c7s8h9sKh 6h4s8sQc 9d7d9hTd 6dJh3h6c 5sAh7c7h 8cThKcQd 9c4h2d3d 3c8dKs3s"));
  }

  @Test
  public void test_omaha_holdem_639_5hAhJsQcQh_Ac7d4s6h_3d5sJd7c_4hTc5c2c_Qd6d9d4d_3s8dTh8c() {
    assertEquals(
      "4hTc5c2c 3s8dTh8c 3d5sJd7c Ac7d4s6h Qd6d9d4d",
      Solver.process("omaha-holdem 5hAhJsQcQh Ac7d4s6h 3d5sJd7c 4hTc5c2c Qd6d9d4d 3s8dTh8c"));
  }

  @Test
  public void test_omaha_holdem_640_2c4s7c7hAs_3d8hTdJc_9d6d2d9c_AdJsQh8s_6c3h5hKs_9sQdTcKd_3c4dAc5d() {
    assertEquals(
      "3d8hTdJc 9sQdTcKd 9d6d2d9c AdJsQh8s 3c4dAc5d=6c3h5hKs",
      Solver.process("omaha-holdem 2c4s7c7hAs 3d8hTdJc 9d6d2d9c AdJsQh8s 6c3h5hKs 9sQdTcKd 3c4dAc5d"));
  }

  @Test
  public void test_omaha_holdem_641_4d6s7h9dKh_TcAs7c5h_5s2s9s5d_Td8dJsQc_Ts4sAd3d_7d6h8hJd_2h9c2d3h() {
    assertEquals(
      "Ts4sAd3d TcAs7c5h 2h9c2d3h 5s2s9s5d 7d6h8hJd Td8dJsQc",
      Solver.process("omaha-holdem 4d6s7h9dKh TcAs7c5h 5s2s9s5d Td8dJsQc Ts4sAd3d 7d6h8hJd 2h9c2d3h"));
  }

  @Test
  public void test_omaha_holdem_642_3d4h5sJcJd_AcAs6s8c_4s5d2d2s_Js8s9s7h_Ks3c2cTc_7sJhTh7c_Qh9c6c8h_6hQs9hAd() {
    assertEquals(
      "Qh9c6c8h 6hQs9hAd Ks3c2cTc 4s5d2d2s AcAs6s8c Js8s9s7h 7sJhTh7c",
      Solver.process("omaha-holdem 3d4h5sJcJd AcAs6s8c 4s5d2d2s Js8s9s7h Ks3c2cTc 7sJhTh7c Qh9c6c8h 6hQs9hAd"));
  }

  @Test
  public void test_omaha_holdem_643_3s8d9hKsTs_AdJh4s4h_AhKcKdAc_3c2sQd2c_6s6h5cQh_2h9d7d6c_Jc8sQs3d_Qc9s5hTh() {
    assertEquals(
      "3c2sQd2c AdJh4s4h 6s6h5cQh Qc9s5hTh AhKcKdAc 2h9d7d6c Jc8sQs3d",
      Solver.process("omaha-holdem 3s8d9hKsTs AdJh4s4h AhKcKdAc 3c2sQd2c 6s6h5cQh 2h9d7d6c Jc8sQs3d Qc9s5hTh"));
  }

  @Test
  public void test_omaha_holdem_644_2h2s5h7h8s_4c4d6hAh_2cJd4sJh() {
    assertEquals(
      "2cJd4sJh 4c4d6hAh",
      Solver.process("omaha-holdem 2h2s5h7h8s 4c4d6hAh 2cJd4sJh"));
  }

  @Test
  public void test_omaha_holdem_645_4h6c6hAcAd_2dAhJc2h_5dJs5hKh_8h6d2c3c_Ts7d3hQh_JhTc4cKc_Qd9d4dTh_9h3s8s9c_2s8d7c6s_TdKsQc5s() {
    assertEquals(
      "Ts7d3hQh TdKsQc5s Qd9d4dTh JhTc4cKc 5dJs5hKh 9h3s8s9c 2s8d7c6s=8h6d2c3c 2dAhJc2h",
      Solver.process("omaha-holdem 4h6c6hAcAd 2dAhJc2h 5dJs5hKh 8h6d2c3c Ts7d3hQh JhTc4cKc Qd9d4dTh 9h3s8s9c 2s8d7c6s TdKsQc5s"));
  }

  @Test
  public void test_omaha_holdem_646_6c6d6hAdQs_3s9d2s9s_Kc2c9h2d_8s7dJs9c_4s4dAc4c_8c7hJcAs() {
    assertEquals(
      "8s7dJs9c 8c7hJcAs Kc2c9h2d 4s4dAc4c 3s9d2s9s",
      Solver.process("omaha-holdem 6c6d6hAdQs 3s9d2s9s Kc2c9h2d 8s7dJs9c 4s4dAc4c 8c7hJcAs"));
  }

  @Test
  public void test_omaha_holdem_647_6s7c7sKdTc_6hAd3cKs_Ac5d2s8d() {
    assertEquals(
      "Ac5d2s8d 6hAd3cKs",
      Solver.process("omaha-holdem 6s7c7sKdTc 6hAd3cKs Ac5d2s8d"));
  }

  @Test
  public void test_omaha_holdem_648_4h5d7c8dKc_3dTdAs9s_Qs4cJsJd_3c9hKhTs_8cJcAd8h_4s6s7hTh() {
    assertEquals(
      "3dTdAs9s Qs4cJsJd 3c9hKhTs 8cJcAd8h 4s6s7hTh",
      Solver.process("omaha-holdem 4h5d7c8dKc 3dTdAs9s Qs4cJsJd 3c9hKhTs 8cJcAd8h 4s6s7hTh"));
  }

  @Test
  public void test_omaha_holdem_649_3h8sJhKhQs_9sAd2s2c_JdAhJs7s_5cJc8dKs() {
    assertEquals(
      "9sAd2s2c 5cJc8dKs JdAhJs7s",
      Solver.process("omaha-holdem 3h8sJhKhQs 9sAd2s2c JdAhJs7s 5cJc8dKs"));
  }

  @Test
  public void test_omaha_holdem_650_2d2s6d6h8c_8h7hTsQd_4h6sKcQc_8d7c3d9d_Js4dThQs() {
    assertEquals(
      "Js4dThQs 8d7c3d9d 8h7hTsQd 4h6sKcQc",
      Solver.process("omaha-holdem 2d2s6d6h8c 8h7hTsQd 4h6sKcQc 8d7c3d9d Js4dThQs"));
  }

  @Test
  public void test_omaha_holdem_651_3d5c9dQhTd_7sAc8sKs_8dJcQd8c_Kc4h6hJd_QsAhAd8h() {
    assertEquals(
      "7sAc8sKs QsAhAd8h Kc4h6hJd 8dJcQd8c",
      Solver.process("omaha-holdem 3d5c9dQhTd 7sAc8sKs 8dJcQd8c Kc4h6hJd QsAhAd8h"));
  }

  @Test
  public void test_omaha_holdem_652_3h3sKdQhTs_KhQsKc6h_9h2s4c4d_Js5cQd5d_6s2c5h2d_7cAhKsQc_2h7dTcAd_Ac3c8sJh_8d9d3dJd_6c8c5sTh() {
    assertEquals(
      "6s2c5h2d 9h2s4c4d 6c8c5sTh 2h7dTcAd Js5cQd5d 7cAhKsQc 8d9d3dJd Ac3c8sJh KhQsKc6h",
      Solver.process("omaha-holdem 3h3sKdQhTs KhQsKc6h 9h2s4c4d Js5cQd5d 6s2c5h2d 7cAhKsQc 2h7dTcAd Ac3c8sJh 8d9d3dJd 6c8c5sTh"));
  }

  @Test
  public void test_omaha_holdem_653_3c5c7d9dJd_Tc9h4cQc_8hTd9sAd_8sQh6h8c_5s7s2c5d_Kc3sTh2h_3dKs4s4h_7h6d6c2d_8d7cKdTs() {
    assertEquals(
      "Kc3sTh2h 3dKs4s4h Tc9h4cQc 5s7s2c5d 8sQh6h8c 7h6d6c2d 8d7cKdTs 8hTd9sAd",
      Solver.process("omaha-holdem 3c5c7d9dJd Tc9h4cQc 8hTd9sAd 8sQh6h8c 5s7s2c5d Kc3sTh2h 3dKs4s4h 7h6d6c2d 8d7cKdTs"));
  }

  @Test
  public void test_omaha_holdem_654_3dAcJhTcTd_9s2s7h4s_7s8d9h4h_8cAh3cQd_6sTs5d2h_6c5s2d4d_Qc4cKdKs_KcQhJd9d_6h5c3s8s() {
    assertEquals(
      "6c5s2d4d 9s2s7h4s 7s8d9h4h 6h5c3s8s 8cAh3cQd 6sTs5d2h KcQhJd9d=Qc4cKdKs",
      Solver.process("omaha-holdem 3dAcJhTcTd 9s2s7h4s 7s8d9h4h 8cAh3cQd 6sTs5d2h 6c5s2d4d Qc4cKdKs KcQhJd9d 6h5c3s8s"));
  }

  @Test
  public void test_omaha_holdem_655_3h4c8d9cKh_Jc5c3c6d_4dQd9h5h_5d2dKs6c_JhTd8c8h_Ah9d2h2c_7cTc8sTh_7dAdTsJs_3d6s4hAc_Kc2sAsQh() {
    assertEquals(
      "7dAdTsJs Jc5c3c6d Ah9d2h2c 7cTc8sTh 5d2dKs6c Kc2sAsQh 3d6s4hAc 4dQd9h5h JhTd8c8h",
      Solver.process("omaha-holdem 3h4c8d9cKh Jc5c3c6d 4dQd9h5h 5d2dKs6c JhTd8c8h Ah9d2h2c 7cTc8sTh 7dAdTsJs 3d6s4hAc Kc2sAsQh"));
  }

  @Test
  public void test_omaha_holdem_656_5c9cQsTdTh_As2sAh2c_3cQh5d4d_Kh8dJc6d() {
    assertEquals(
      "3cQh5d4d As2sAh2c Kh8dJc6d",
      Solver.process("omaha-holdem 5c9cQsTdTh As2sAh2c 3cQh5d4d Kh8dJc6d"));
  }

  @Test
  public void test_omaha_holdem_657_7sJhKhTcTd_Th6cQs8h_9dJcKs2d_8cJd8sJs_3d9s2c8d_5s4cAs3h() {
    assertEquals(
      "5s4cAs3h 9dJcKs2d Th6cQs8h 3d9s2c8d 8cJd8sJs",
      Solver.process("omaha-holdem 7sJhKhTcTd Th6cQs8h 9dJcKs2d 8cJd8sJs 3d9s2c8d 5s4cAs3h"));
  }

  @Test
  public void test_omaha_holdem_658_2d6s8c9cTh_8s9h7dTs_3d3h9d5h_3cAdQc6h_6cKhTcAh() {
    assertEquals(
      "3cAdQc6h 3d3h9d5h 6cKhTcAh 8s9h7dTs",
      Solver.process("omaha-holdem 2d6s8c9cTh 8s9h7dTs 3d3h9d5h 3cAdQc6h 6cKhTcAh"));
  }

  @Test
  public void test_omaha_holdem_659_4h6d6hAcTd_7hQd2sJs_Ad5h6cQs_9d5d2h3c_KsJd3h5c() {
    assertEquals(
      "9d5d2h3c 7hQd2sJs KsJd3h5c Ad5h6cQs",
      Solver.process("omaha-holdem 4h6d6hAcTd 7hQd2sJs Ad5h6cQs 9d5d2h3c KsJd3h5c"));
  }

  @Test
  public void test_omaha_holdem_660_2s4hAsJsTc_KdJd4sQh_ThKc7d8d_9sAc5dJh_Kh3h5h3d_9hAh6h2d_7cQd6s2h_8s6dTs2c_9cTdAdKs() {
    assertEquals(
      "7cQd6s2h ThKc7d8d 9hAh6h2d 9cTdAdKs 9sAc5dJh Kh3h5h3d KdJd4sQh 8s6dTs2c",
      Solver.process("omaha-holdem 2s4hAsJsTc KdJd4sQh ThKc7d8d 9sAc5dJh Kh3h5h3d 9hAh6h2d 7cQd6s2h 8s6dTs2c 9cTdAdKs"));
  }

  @Test
  public void test_omaha_holdem_661_2d6c9hQdTh_3cQc8c7s_KcJdTc4c_8hKdAd8s_6hKs4h3d_6d2sQh5s_JsAh6sJh() {
    assertEquals(
      "6hKs4h3d 8hKdAd8s JsAh6sJh 6d2sQh5s 3cQc8c7s KcJdTc4c",
      Solver.process("omaha-holdem 2d6c9hQdTh 3cQc8c7s KcJdTc4c 8hKdAd8s 6hKs4h3d 6d2sQh5s JsAh6sJh"));
  }

  @Test
  public void test_omaha_holdem_662_7h8sKdQdTd_TsAs8c7d_9h9dQsQh_Ad4c2sAh_JsKs3dQc_4d6h7s5s_KcJd3c8d_6d5h4sJc() {
    assertEquals(
      "6d5h4sJc 4d6h7s5s Ad4c2sAh TsAs8c7d JsKs3dQc 9h9dQsQh KcJd3c8d",
      Solver.process("omaha-holdem 7h8sKdQdTd TsAs8c7d 9h9dQsQh Ad4c2sAh JsKs3dQc 4d6h7s5s KcJd3c8d 6d5h4sJc"));
  }

  @Test
  public void test_omaha_holdem_663_2s4s6c8hAc_4h6dAhAs_Ad3s8d6s_Ks7d7hKh() {
    assertEquals(
      "Ks7d7hKh Ad3s8d6s 4h6dAhAs",
      Solver.process("omaha-holdem 2s4s6c8hAc 4h6dAhAs Ad3s8d6s Ks7d7hKh"));
  }

  @Test
  public void test_omaha_holdem_664_3c4h7s9sJd_5hKsQc5d_Ac9cTc8h_Js3h5c7c_7d3d7hKh_2s9h2h6s_6dTs2cQd() {
    assertEquals(
      "6dTs2cQd 5hKsQc5d 2s9h2h6s Js3h5c7c 7d3d7hKh Ac9cTc8h",
      Solver.process("omaha-holdem 3c4h7s9sJd 5hKsQc5d Ac9cTc8h Js3h5c7c 7d3d7hKh 2s9h2h6s 6dTs2cQd"));
  }

  @Test
  public void test_omaha_holdem_665_3s4cAdJhTs_4sKh2h3d_9h4d6cTd_5c7sTh5d_3hAsJsAc_6h8d8sKd() {
    assertEquals(
      "6h8d8sKd 5c7sTh5d 4sKh2h3d 9h4d6cTd 3hAsJsAc",
      Solver.process("omaha-holdem 3s4cAdJhTs 4sKh2h3d 9h4d6cTd 5c7sTh5d 3hAsJsAc 6h8d8sKd"));
  }

  @Test
  public void test_omaha_holdem_666_2c4d5h9hKh_3d4hKs3c_AsJc2d7h_Jd6hAh7c() {
    assertEquals(
      "AsJc2d7h 3d4hKs3c Jd6hAh7c",
      Solver.process("omaha-holdem 2c4d5h9hKh 3d4hKs3c AsJc2d7h Jd6hAh7c"));
  }

  @Test
  public void test_omaha_holdem_667_2h5c5dKdTc_Jh2cAd7c_8s9s4s3h_Ks5s6h7s_7d3sKc6d_Jc9hJsAc_Jd3dKh4d_Qh2s4cAs_3c7hAh9c() {
    assertEquals(
      "8s9s4s3h 3c7hAh9c Jh2cAd7c=Qh2s4cAs Jc9hJsAc 7d3sKc6d Jd3dKh4d Ks5s6h7s",
      Solver.process("omaha-holdem 2h5c5dKdTc Jh2cAd7c 8s9s4s3h Ks5s6h7s 7d3sKc6d Jc9hJsAc Jd3dKh4d Qh2s4cAs 3c7hAh9c"));
  }

  @Test
  public void test_omaha_holdem_668_7d8d8hQcTs_KhJh7s9s_9d3h6dTc_2c9h8c4c_4hKc4s8s_6sAd3sTh_5dJc6cJd() {
    assertEquals(
      "6sAd3sTh 5dJc6cJd 2c9h8c4c 4hKc4s8s 9d3h6dTc KhJh7s9s",
      Solver.process("omaha-holdem 7d8d8hQcTs KhJh7s9s 9d3h6dTc 2c9h8c4c 4hKc4s8s 6sAd3sTh 5dJc6cJd"));
  }

  @Test
  public void test_omaha_holdem_669_3h4c5c9dAs_KcQsJd6s_2dKh4h6h_3d8c6dTh_9sAc8d7c_QcTs3c5d() {
    assertEquals(
      "KcQsJd6s 3d8c6dTh QcTs3c5d 9sAc8d7c 2dKh4h6h",
      Solver.process("omaha-holdem 3h4c5c9dAs KcQsJd6s 2dKh4h6h 3d8c6dTh 9sAc8d7c QcTs3c5d"));
  }

  @Test
  public void test_omaha_holdem_670_2c2s3s5sQd_3cQsKsAd_4h7hJh9s() {
    assertEquals(
      "4h7hJh9s 3cQsKsAd",
      Solver.process("omaha-holdem 2c2s3s5sQd 3cQsKsAd 4h7hJh9s"));
  }

  @Test
  public void test_omaha_holdem_671_8c9cAcJsTd_2d2hAs7d_5hKc7h3h_Ah3s6h4d_8sAdKs8d_Jc5sTs9d_7s6c4c6d() {
    assertEquals(
      "5hKc7h3h Ah3s6h4d 2d2hAs7d Jc5sTs9d 8sAdKs8d 7s6c4c6d",
      Solver.process("omaha-holdem 8c9cAcJsTd 2d2hAs7d 5hKc7h3h Ah3s6h4d 8sAdKs8d Jc5sTs9d 7s6c4c6d"));
  }

  @Test
  public void test_omaha_holdem_672_6d7sAsJdKh_Kd4hTd5c_2h2sJs8h_9c4s6cQs_Ac6h9s6s_Ts9d3dKc_2d5h5s3c_Qd4d3hTc_7d5dKs7h() {
    assertEquals(
      "2d5h5s3c 9c4s6cQs 2h2sJs8h Kd4hTd5c=Ts9d3dKc Ac6h9s6s 7d5dKs7h Qd4d3hTc",
      Solver.process("omaha-holdem 6d7sAsJdKh Kd4hTd5c 2h2sJs8h 9c4s6cQs Ac6h9s6s Ts9d3dKc 2d5h5s3c Qd4d3hTc 7d5dKs7h"));
  }

  @Test
  public void test_omaha_holdem_673_4c6s8c9cAc_8h3dKc4d_4s8d5dJh_7cAdAs5c_6cTd9dTs_3s2dKsAh() {
    assertEquals(
      "3s2dKsAh 4s8d5dJh=8h3dKc4d 6cTd9dTs 7cAdAs5c",
      Solver.process("omaha-holdem 4c6s8c9cAc 8h3dKc4d 4s8d5dJh 7cAdAs5c 6cTd9dTs 3s2dKsAh"));
  }

  @Test
  public void test_omaha_holdem_674_4h7h9dJcJh_6cKs7s3d_9s5d2hTc_KdQdQsKh() {
    assertEquals(
      "6cKs7s3d 9s5d2hTc KdQdQsKh",
      Solver.process("omaha-holdem 4h7h9dJcJh 6cKs7s3d 9s5d2hTc KdQdQsKh"));
  }

  @Test
  public void test_omaha_holdem_675_4d6s8s9dTc_2cTh5d7h_8c6d9sQd_Ad6h8hAh_Jh3c9c5h() {
    assertEquals(
      "Jh3c9c5h Ad6h8hAh 8c6d9sQd 2cTh5d7h",
      Solver.process("omaha-holdem 4d6s8s9dTc 2cTh5d7h 8c6d9sQd Ad6h8hAh Jh3c9c5h"));
  }

  @Test
  public void test_omaha_holdem_676_4c6c6d9hTd_9d8dQdKh_2c6s5h6h_7hQc2d8s_4hQs5s2h_9cThKc7s() {
    assertEquals(
      "4hQs5s2h 9d8dQdKh 9cThKc7s 7hQc2d8s 2c6s5h6h",
      Solver.process("omaha-holdem 4c6c6d9hTd 9d8dQdKh 2c6s5h6h 7hQc2d8s 4hQs5s2h 9cThKc7s"));
  }

  @Test
  public void test_omaha_holdem_677_6s8hAsKsQc_9cKc9h4h_Ac4s7s2d_QdJd8d5h_QsKd3sAh_2c5d6c9s() {
    assertEquals(
      "2c5d6c9s 9cKc9h4h QdJd8d5h Ac4s7s2d QsKd3sAh",
      Solver.process("omaha-holdem 6s8hAsKsQc 9cKc9h4h Ac4s7s2d QdJd8d5h QsKd3sAh 2c5d6c9s"));
  }

  @Test
  public void test_omaha_holdem_678_2c2h5c7dAc_3cJc6h7h_5hQcAhTh_Jh3h2s9d_4h4s8s9s_7s9hAdKd_Qd8d4c6c() {
    assertEquals(
      "4h4s8s9s 5hQcAhTh 7s9hAdKd Jh3h2s9d Qd8d4c6c 3cJc6h7h",
      Solver.process("omaha-holdem 2c2h5c7dAc 3cJc6h7h 5hQcAhTh Jh3h2s9d 4h4s8s9s 7s9hAdKd Qd8d4c6c"));
  }

  @Test
  public void test_omaha_holdem_679_8cJhQhQsTs_Ad6cKs2c_2h6h7sAc_Tc5c5hTh_Jd8s3s4c_8dKdQc6d_Kc9h7d8h() {
    assertEquals(
      "2h6h7sAc Jd8s3s4c Kc9h7d8h Ad6cKs2c Tc5c5hTh 8dKdQc6d",
      Solver.process("omaha-holdem 8cJhQhQsTs Ad6cKs2c 2h6h7sAc Tc5c5hTh Jd8s3s4c 8dKdQc6d Kc9h7d8h"));
  }

  @Test
  public void test_omaha_holdem_680_3c3d6d9dKs_Jd2d2sQh_4h3hKc6s_8s5s4dAd_9sTc5hQd_TdTh3s2h_9h5c5dAc() {
    assertEquals(
      "9sTc5hQd 9h5c5dAc TdTh3s2h Jd2d2sQh 8s5s4dAd 4h3hKc6s",
      Solver.process("omaha-holdem 3c3d6d9dKs Jd2d2sQh 4h3hKc6s 8s5s4dAd 9sTc5hQd TdTh3s2h 9h5c5dAc"));
  }

  @Test
  public void test_omaha_holdem_681_6h7d8s9dQd_8cKdKh2s_ThQh9h6s_AsJd5sJh_7c4hTdAc_5c4c5dAh_6d7s3hQs_9c8h5h3d() {
    assertEquals(
      "AsJd5sJh 8cKdKh2s 6d7s3hQs 5c4c5dAh 9c8h5h3d 7c4hTdAc=ThQh9h6s",
      Solver.process("omaha-holdem 6h7d8s9dQd 8cKdKh2s ThQh9h6s AsJd5sJh 7c4hTdAc 5c4c5dAh 6d7s3hQs 9c8h5h3d"));
  }

  @Test
  public void test_omaha_holdem_682_3c4c8d9hQh_6c2h2d6d_KsTsTdAd_KhKcJs3d_8s7h4s5s_As7dAhAc_3s4hQc9d_6hJc2c4d() {
    assertEquals(
      "6hJc2c4d 6c2h2d6d KsTsTdAd KhKcJs3d As7dAhAc 8s7h4s5s 3s4hQc9d",
      Solver.process("omaha-holdem 3c4c8d9hQh 6c2h2d6d KsTsTdAd KhKcJs3d 8s7h4s5s As7dAhAc 3s4hQc9d 6hJc2c4d"));
  }

  @Test
  public void test_omaha_holdem_683_4d6h9dAdJh_6d3c2d8s_8h5c3d2c_8c3s2sAh_Kd6c6sQh_AsTcJd3h() {
    assertEquals(
      "8h5c3d2c 8c3s2sAh AsTcJd3h Kd6c6sQh 6d3c2d8s",
      Solver.process("omaha-holdem 4d6h9dAdJh 6d3c2d8s 8h5c3d2c 8c3s2sAh Kd6c6sQh AsTcJd3h"));
  }

  @Test
  public void test_omaha_holdem_684_2d4c8d8hJd_9d8c6cQd_As5cTd4d_7dAh2s7h_3c7c9cKs() {
    assertEquals(
      "3c7c9cKs 7dAh2s7h As5cTd4d 9d8c6cQd",
      Solver.process("omaha-holdem 2d4c8d8hJd 9d8c6cQd As5cTd4d 7dAh2s7h 3c7c9cKs"));
  }

  @Test
  public void test_omaha_holdem_685_4d6d8c8dKc_KdTd9sQd_7d2dQc4s_8s8hJc4h_3c5d2h5h_3hAs9cKs_4cJhTc6c_7sJdQhAc() {
    assertEquals(
      "7sJdQhAc 3c5d2h5h 4cJhTc6c 3hAs9cKs 7d2dQc4s KdTd9sQd 8s8hJc4h",
      Solver.process("omaha-holdem 4d6d8c8dKc KdTd9sQd 7d2dQc4s 8s8hJc4h 3c5d2h5h 3hAs9cKs 4cJhTc6c 7sJdQhAc"));
  }

  @Test
  public void test_omaha_holdem_686_2s4sKdQcTs_9s4hAsJd_KhQdJs5h_2d7s6d7d_9hQhAd5c() {
    assertEquals(
      "2d7s6d7d 9hQhAd5c KhQdJs5h 9s4hAsJd",
      Solver.process("omaha-holdem 2s4sKdQcTs 9s4hAsJd KhQdJs5h 2d7s6d7d 9hQhAd5c"));
  }

  @Test
  public void test_omaha_holdem_687_3d6c8c9cJh_9dTh2hJc_Ac9h2sAd_5c8h5h7s_JdQh4s5s_8d2d4hQc_Kc3sAhQs_4dTd8s3h_Ks5d7hJs_6dKh2c6h() {
    assertEquals(
      "Kc3sAhQs 8d2d4hQc JdQh4s5s Ac9h2sAd 4dTd8s3h 9dTh2hJc 6dKh2c6h 5c8h5h7s=Ks5d7hJs",
      Solver.process("omaha-holdem 3d6c8c9cJh 9dTh2hJc Ac9h2sAd 5c8h5h7s JdQh4s5s 8d2d4hQc Kc3sAhQs 4dTd8s3h Ks5d7hJs 6dKh2c6h"));
  }

  @Test
  public void test_omaha_holdem_688_3c4d6d8cKd_5sAhTh2d_Kc5cKs4h_3dQs7d9s_6sKh6cAd() {
    assertEquals(
      "6sKh6cAd Kc5cKs4h 5sAhTh2d 3dQs7d9s",
      Solver.process("omaha-holdem 3c4d6d8cKd 5sAhTh2d Kc5cKs4h 3dQs7d9s 6sKh6cAd"));
  }

  @Test
  public void test_omaha_holdem_689_2c2d2sAhTc_9cKs4h7h_9sQdJsQs_AsAc5hKd_7cQc7s2h_5s6h6cAd_Kh4cKc5c() {
    assertEquals(
      "9cKs4h7h 5s6h6cAd 9sQdJsQs Kh4cKc5c AsAc5hKd 7cQc7s2h",
      Solver.process("omaha-holdem 2c2d2sAhTc 9cKs4h7h 9sQdJsQs AsAc5hKd 7cQc7s2h 5s6h6cAd Kh4cKc5c"));
  }

  @Test
  public void test_omaha_holdem_690_6s7c8dAcTc_8c9cJsTh_3dAd9d3s_7dJd4h2s_Qd2hJhKc() {
    assertEquals(
      "Qd2hJhKc 7dJd4h2s 3dAd9d3s 8c9cJsTh",
      Solver.process("omaha-holdem 6s7c8dAcTc 8c9cJsTh 3dAd9d3s 7dJd4h2s Qd2hJhKc"));
  }

  @Test
  public void test_omaha_holdem_691_5c9hQdQsTs_3c9sKc9c_TdThJc6c_As3hQc2c_6dAh4s7s_2sAd5dKs_9d2d7d8c_3sKdJs4h() {
    assertEquals(
      "6dAh4s7s 2sAd5dKs 9d2d7d8c As3hQc2c 3sKdJs4h 3c9sKc9c TdThJc6c",
      Solver.process("omaha-holdem 5c9hQdQsTs 3c9sKc9c TdThJc6c As3hQc2c 6dAh4s7s 2sAd5dKs 9d2d7d8c 3sKdJs4h"));
  }

  @Test
  public void test_omaha_holdem_692_2s4h6h7c7d_8hJc3h2c_2d8c5c2h_QsQc8s4s_Kd3dKs7s_9sAhJdAd_4dTdTh5s_5d6cAcKc() {
    assertEquals(
      "8hJc3h2c 5d6cAcKc 4dTdTh5s QsQc8s4s 9sAhJdAd Kd3dKs7s 2d8c5c2h",
      Solver.process("omaha-holdem 2s4h6h7c7d 8hJc3h2c 2d8c5c2h QsQc8s4s Kd3dKs7s 9sAhJdAd 4dTdTh5s 5d6cAcKc"));
  }

  @Test
  public void test_omaha_holdem_693_3h7d8d9dTh_QcQh3d4h_Ks8s7cJc_7sAsTs9s() {
    assertEquals(
      "QcQh3d4h 7sAsTs9s Ks8s7cJc",
      Solver.process("omaha-holdem 3h7d8d9dTh QcQh3d4h Ks8s7cJc 7sAsTs9s"));
  }

  @Test
  public void test_omaha_holdem_694_2c3h8cJdJh_8h8s6hKs_2dQh5cTd_3s4c2hAs() {
    assertEquals(
      "2dQh5cTd 3s4c2hAs 8h8s6hKs",
      Solver.process("omaha-holdem 2c3h8cJdJh 8h8s6hKs 2dQh5cTd 3s4c2hAs"));
  }

  @Test
  public void test_omaha_holdem_695_2s4s7d9sKd_Ts3d9c6d_5d2h3hTc_8dTd7s5h() {
    assertEquals(
      "5d2h3hTc 8dTd7s5h Ts3d9c6d",
      Solver.process("omaha-holdem 2s4s7d9sKd Ts3d9c6d 5d2h3hTc 8dTd7s5h"));
  }

  @Test
  public void test_omaha_holdem_696_5c7c7hJhKs_Js7s8sQs_Ts8c8d4c_6s9s2d5s() {
    assertEquals(
      "6s9s2d5s Ts8c8d4c Js7s8sQs",
      Solver.process("omaha-holdem 5c7c7hJhKs Js7s8sQs Ts8c8d4c 6s9s2d5s"));
  }

  @Test
  public void test_omaha_holdem_697_3h5d6c7sAs_2d5c9c5h_5sKs3s9s() {
    assertEquals(
      "5sKs3s9s 2d5c9c5h",
      Solver.process("omaha-holdem 3h5d6c7sAs 2d5c9c5h 5sKs3s9s"));
  }

  @Test
  public void test_omaha_holdem_698_4d6sJhKhQd_7d2c9d3d_Qc8h4c6c_Th7cAd9s_Js3s9cKc_4sKs7hTd() {
    assertEquals(
      "7d2c9d3d Qc8h4c6c 4sKs7hTd Js3s9cKc Th7cAd9s",
      Solver.process("omaha-holdem 4d6sJhKhQd 7d2c9d3d Qc8h4c6c Th7cAd9s Js3s9cKc 4sKs7hTd"));
  }

  @Test
  public void test_omaha_holdem_699_7s8cAdKsTd_7d5c5d8d_Jd9sKc8s_Ah5s3s4c_7hJs8hAc_2dQh6dQd_2sQcQs9d_Jc9h6c7c_4s6sTcJh() {
    assertEquals(
      "4s6sTcJh 2dQh6dQd=2sQcQs9d Ah5s3s4c 7d5c5d8d 7hJs8hAc Jc9h6c7c=Jd9sKc8s",
      Solver.process("omaha-holdem 7s8cAdKsTd 7d5c5d8d Jd9sKc8s Ah5s3s4c 7hJs8hAc 2dQh6dQd 2sQcQs9d Jc9h6c7c 4s6sTcJh"));
  }

  @Test
  public void test_omaha_holdem_700_2h4d7d8cQd_ThJd8sQs_Ac7h9cJc_6dTc3h4c() {
    assertEquals(
      "6dTc3h4c Ac7h9cJc ThJd8sQs",
      Solver.process("omaha-holdem 2h4d7d8cQd ThJd8sQs Ac7h9cJc 6dTc3h4c"));
  }

  @Test
  public void test_omaha_holdem_701_3h4d6c8dAh_9sQs4h5s_9c5hQc7h_Tc8h3s3d() {
    assertEquals(
      "9sQs4h5s Tc8h3s3d 9c5hQc7h",
      Solver.process("omaha-holdem 3h4d6c8dAh 9sQs4h5s 9c5hQc7h Tc8h3s3d"));
  }

  @Test
  public void test_omaha_holdem_702_5c5d7s9sTd_KdJh9cJd_AdKs3d6d_Jc4d3sKh_KcAs5h3h_Qd7h8d2c_4c7cQs6c_2d2h6sQh_Qc9h8s8c() {
    assertEquals(
      "Jc4d3sKh AdKs3d6d 2d2h6sQh 4c7cQs6c=Qd7h8d2c Qc9h8s8c KdJh9cJd KcAs5h3h",
      Solver.process("omaha-holdem 5c5d7s9sTd KdJh9cJd AdKs3d6d Jc4d3sKh KcAs5h3h Qd7h8d2c 4c7cQs6c 2d2h6sQh Qc9h8s8c"));
  }

  @Test
  public void test_omaha_holdem_703_4d8h8s9hQs_9sKdAdJh_7h3cThAc_7d5cJc9d() {
    assertEquals(
      "7h3cThAc 7d5cJc9d 9sKdAdJh",
      Solver.process("omaha-holdem 4d8h8s9hQs 9sKdAdJh 7h3cThAc 7d5cJc9d"));
  }

  @Test
  public void test_omaha_holdem_704_2s3h7sKsQd_8sAs9dAd_4hJc3sQh_5sKc3d6d_3c9cJhQc_Kd7h8dJd_4dTd7c2c() {
    assertEquals(
      "4dTd7c2c 3c9cJhQc=4hJc3sQh 5sKc3d6d Kd7h8dJd 8sAs9dAd",
      Solver.process("omaha-holdem 2s3h7sKsQd 8sAs9dAd 4hJc3sQh 5sKc3d6d 3c9cJhQc Kd7h8dJd 4dTd7c2c"));
  }

  @Test
  public void test_omaha_holdem_705_7c7s9dJhTc_5dKh4cTs_2d7hAh8s_8c3sKd8h_Qc9c5h2s_5c4s6h2h() {
    assertEquals(
      "5c4s6h2h 8c3sKd8h Qc9c5h2s 5dKh4cTs 2d7hAh8s",
      Solver.process("omaha-holdem 7c7s9dJhTc 5dKh4cTs 2d7hAh8s 8c3sKd8h Qc9c5h2s 5c4s6h2h"));
  }

  @Test
  public void test_omaha_holdem_706_2c2h8dKcKd_Ks8c3cKh_7s9s5d9c_ThAh4s7h_Qd5hJsQs_Jc3d4d6c_9d7d2d6h_As5c4h8h() {
    assertEquals(
      "Jc3d4d6c ThAh4s7h As5c4h8h 7s9s5d9c Qd5hJsQs 9d7d2d6h Ks8c3cKh",
      Solver.process("omaha-holdem 2c2h8dKcKd Ks8c3cKh 7s9s5d9c ThAh4s7h Qd5hJsQs Jc3d4d6c 9d7d2d6h As5c4h8h"));
  }

  @Test
  public void test_omaha_holdem_707_2c2d3d3sQc_3h9s8s7s_Ac9cQs5c_9d8hAh6d_9hAsTc5s_Jh8c4d8d_Ks6cKd4s_JsTd4hAd_6h5h2sTh_7h7d2h3c() {
    assertEquals(
      "9d8hAh6d 9hAsTc5s JsTd4hAd Jh8c4d8d Ac9cQs5c Ks6cKd4s 6h5h2sTh 3h9s8s7s 7h7d2h3c",
      Solver.process("omaha-holdem 2c2d3d3sQc 3h9s8s7s Ac9cQs5c 9d8hAh6d 9hAsTc5s Jh8c4d8d Ks6cKd4s JsTd4hAd 6h5h2sTh 7h7d2h3c"));
  }

  @Test
  public void test_omaha_holdem_708_6d8dKdQsTc_JdJc6h4s_7c3dKs3h_4d9d9c5d_5c8sTd2c() {
    assertEquals(
      "JdJc6h4s 7c3dKs3h 5c8sTd2c 4d9d9c5d",
      Solver.process("omaha-holdem 6d8dKdQsTc JdJc6h4s 7c3dKs3h 4d9d9c5d 5c8sTd2c"));
  }

  @Test
  public void test_omaha_holdem_709_6s7d7h8c8d_KsTsJdJs_Tc8s9s8h_2s7c2cJc_4h4d5d2d_AcJh9h6d_Ah9cAs9d_2h5s6hQh_KcKhQcTh() {
    assertEquals(
      "2h5s6hQh AcJh9h6d KsTsJdJs KcKhQcTh Ah9cAs9d 2s7c2cJc 4h4d5d2d Tc8s9s8h",
      Solver.process("omaha-holdem 6s7d7h8c8d KsTsJdJs Tc8s9s8h 2s7c2cJc 4h4d5d2d AcJh9h6d Ah9cAs9d 2h5s6hQh KcKhQcTh"));
  }

  @Test
  public void test_omaha_holdem_710_3s4d8cJsQs_Tc3h4cQc_KhTh8h6s_KdTdKcAh_Ts4h3dJd() {
    assertEquals(
      "KhTh8h6s KdTdKcAh Ts4h3dJd Tc3h4cQc",
      Solver.process("omaha-holdem 3s4d8cJsQs Tc3h4cQc KhTh8h6s KdTdKcAh Ts4h3dJd"));
  }

  @Test
  public void test_omaha_holdem_711_2s6d6sJsQs_7dTs5c7s_7hAd4s8h_5sJc3cQd_3h9sKcJd_2h8s2cKd_Ac3sAhTc() {
    assertEquals(
      "7hAd4s8h 3h9sKcJd 5sJc3cQd Ac3sAhTc 7dTs5c7s 2h8s2cKd",
      Solver.process("omaha-holdem 2s6d6sJsQs 7dTs5c7s 7hAd4s8h 5sJc3cQd 3h9sKcJd 2h8s2cKd Ac3sAhTc"));
  }

  @Test
  public void test_omaha_holdem_712_2d6cKhQcQs_6dKsJhTs_5d5h6sAs_Ah4s7h6h_2c8h3c9d_8c9hJc7c() {
    assertEquals(
      "8c9hJc7c 2c8h3c9d 5d5h6sAs=Ah4s7h6h 6dKsJhTs",
      Solver.process("omaha-holdem 2d6cKhQcQs 6dKsJhTs 5d5h6sAs Ah4s7h6h 2c8h3c9d 8c9hJc7c"));
  }

  @Test
  public void test_omaha_holdem_713_4s7s9cAdJh_7hTdAcQh_2c6h5sAh_2h8cTh7c_8h8dKcTc_Qc9sKdQd_Kh4d5hJd_3sKsTs2d_5d8s9h3d_As5c6dQs() {
    assertEquals(
      "3sKsTs2d 5d8s9h3d Qc9sKdQd 2c6h5sAh As5c6dQs Kh4d5hJd 7hTdAcQh 2h8cTh7c=8h8dKcTc",
      Solver.process("omaha-holdem 4s7s9cAdJh 7hTdAcQh 2c6h5sAh 2h8cTh7c 8h8dKcTc Qc9sKdQd Kh4d5hJd 3sKsTs2d 5d8s9h3d As5c6dQs"));
  }

  @Test
  public void test_omaha_holdem_714_4h5c8d8sTd_6dKd2c2d_AdQsTc4d_4s6h4cKh() {
    assertEquals(
      "6dKd2c2d AdQsTc4d 4s6h4cKh",
      Solver.process("omaha-holdem 4h5c8d8sTd 6dKd2c2d AdQsTc4d 4s6h4cKh"));
  }

  @Test
  public void test_omaha_holdem_715_5s9dJsKcQd_Ac5hAh2d_8sJd6c2c_Kh7sKs5d_3d5c9h2h_8d3c7c3h() {
    assertEquals(
      "8d3c7c3h 8sJd6c2c Ac5hAh2d 3d5c9h2h Kh7sKs5d",
      Solver.process("omaha-holdem 5s9dJsKcQd Ac5hAh2d 8sJd6c2c Kh7sKs5d 3d5c9h2h 8d3c7c3h"));
  }

  @Test
  public void test_omaha_holdem_716_4hAdJdKcTs_KhTh3h9d_Tc2hQdJs_Qc9c4c8h_Ks8c8s8d_9h5c7hQs_2s9sJc5d_Kd4s7c3c() {
    assertEquals(
      "2s9sJc5d Ks8c8s8d Kd4s7c3c KhTh3h9d 9h5c7hQs=Qc9c4c8h Tc2hQdJs",
      Solver.process("omaha-holdem 4hAdJdKcTs KhTh3h9d Tc2hQdJs Qc9c4c8h Ks8c8s8d 9h5c7hQs 2s9sJc5d Kd4s7c3c"));
  }

  @Test
  public void test_omaha_holdem_717_4c6dAcAdQd_JsKs9d9h_3sAhQs6s_9s4dJcKd_5hTc4h5d_KcQh3dJh_2dKh6h8d_7d8hJd7h() {
    assertEquals(
      "5hTc4h5d JsKs9d9h KcQh3dJh 2dKh6h8d 7d8hJd7h 9s4dJcKd 3sAhQs6s",
      Solver.process("omaha-holdem 4c6dAcAdQd JsKs9d9h 3sAhQs6s 9s4dJcKd 5hTc4h5d KcQh3dJh 2dKh6h8d 7d8hJd7h"));
  }

  @Test
  public void test_omaha_holdem_718_3c3d6dKdQs_6c9s9d5h_KhAd7d2d_4d4cAs5d_5cJdTd9c_Ts3h8dQh_8c7h6h4s_AcJs8h6s() {
    assertEquals(
      "8c7h6h4s AcJs8h6s 6c9s9d5h 4d4cAs5d 5cJdTd9c KhAd7d2d Ts3h8dQh",
      Solver.process("omaha-holdem 3c3d6dKdQs 6c9s9d5h KhAd7d2d 4d4cAs5d 5cJdTd9c Ts3h8dQh 8c7h6h4s AcJs8h6s"));
  }

  @Test
  public void test_omaha_holdem_719_2c2s3h5cKc_Qd6c4h2h_Ad8sKs9h_Ts7dJsTc_3cJd8hTd_As9s8c7s_Qc8d5d9d_Qh3d2d5h() {
    assertEquals(
      "As9s8c7s 3cJd8hTd Qc8d5d9d Ts7dJsTc Ad8sKs9h Qd6c4h2h Qh3d2d5h",
      Solver.process("omaha-holdem 2c2s3h5cKc Qd6c4h2h Ad8sKs9h Ts7dJsTc 3cJd8hTd As9s8c7s Qc8d5d9d Qh3d2d5h"));
  }

  @Test
  public void test_omaha_holdem_720_2d5d8sJhQs_Jc7c3dTs_Jd4d6c6d_4hAd9dAc_2cTc3s5c_9h2h2s4c_AhKhTd3h() {
    assertEquals(
      "AhKhTd3h Jd4d6c6d Jc7c3dTs 4hAd9dAc 2cTc3s5c 9h2h2s4c",
      Solver.process("omaha-holdem 2d5d8sJhQs Jc7c3dTs Jd4d6c6d 4hAd9dAc 2cTc3s5c 9h2h2s4c AhKhTd3h"));
  }

  @Test
  public void test_omaha_holdem_721_2c6h9hJsQc_9c5s8c9d_9s7h5cKc_Qh4s7s6c_Ad8d8s5h_QsQdKs3d_TcKd2dJh() {
    assertEquals(
      "Ad8d8s5h 9s7h5cKc Qh4s7s6c 9c5s8c9d QsQdKs3d TcKd2dJh",
      Solver.process("omaha-holdem 2c6h9hJsQc 9c5s8c9d 9s7h5cKc Qh4s7s6c Ad8d8s5h QsQdKs3d TcKd2dJh"));
  }

  @Test
  public void test_omaha_holdem_722_5h8dAsJcKs_QhKhJd4s_7d9c6s9h_6d8cJh8h_2c2dJsQc_4c3cQd5c_6c3h5d3d() {
    assertEquals(
      "6c3h5d3d 4c3cQd5c 7d9c6s9h 2c2dJsQc QhKhJd4s 6d8cJh8h",
      Solver.process("omaha-holdem 5h8dAsJcKs QhKhJd4s 7d9c6s9h 6d8cJh8h 2c2dJsQc 4c3cQd5c 6c3h5d3d"));
  }

  @Test
  public void test_omaha_holdem_723_2d3d5dAsQh_9d6s3c3h_QsJs7h8d() {
    assertEquals(
      "QsJs7h8d 9d6s3c3h",
      Solver.process("omaha-holdem 2d3d5dAsQh 9d6s3c3h QsJs7h8d"));
  }

  @Test
  public void test_omaha_holdem_724_3d3s7d8hAs_Ac2hQd4s_4cKs7sKd() {
    assertEquals(
      "4cKs7sKd Ac2hQd4s",
      Solver.process("omaha-holdem 3d3s7d8hAs Ac2hQd4s 4cKs7sKd"));
  }

  @Test
  public void test_omaha_holdem_725_3s8h8s9hTd_6d4c5d5h_Ah2sAdKc() {
    assertEquals(
      "6d4c5d5h Ah2sAdKc",
      Solver.process("omaha-holdem 3s8h8s9hTd 6d4c5d5h Ah2sAdKc"));
  }

  @Test
  public void test_omaha_holdem_726_5s6s9hAcAh_2dQc2s6h_5d5hJs8d_Qs4hTdQd_7cTc2h8s_Qh5cAs8c_9d8h3s7d_3hJd2c3d() {
    assertEquals(
      "3hJd2c3d 2dQc2s6h Qs4hTdQd 7cTc2h8s=9d8h3s7d 5d5hJs8d Qh5cAs8c",
      Solver.process("omaha-holdem 5s6s9hAcAh 2dQc2s6h 5d5hJs8d Qs4hTdQd 7cTc2h8s Qh5cAs8c 9d8h3s7d 3hJd2c3d"));
  }

  @Test
  public void test_omaha_holdem_727_3c5d6c7c9c_TcKsJcJs_5s6hAcJd_9h2sAd4d_TsTh8c8d_Jh9s2cTd() {
    assertEquals(
      "Jh9s2cTd 5s6hAcJd 9h2sAd4d TsTh8c8d TcKsJcJs",
      Solver.process("omaha-holdem 3c5d6c7c9c TcKsJcJs 5s6hAcJd 9h2sAd4d TsTh8c8d Jh9s2cTd"));
  }

  @Test
  public void test_omaha_holdem_728_3c6c7c8sKh_Td9sJc9h_8c5cKd4h_Th8dTs9c_7d4s4dTc_6d9dKs5h() {
    assertEquals(
      "7d4s4dTc 6d9dKs5h Td9sJc9h=Th8dTs9c 8c5cKd4h",
      Solver.process("omaha-holdem 3c6c7c8sKh Td9sJc9h 8c5cKd4h Th8dTs9c 7d4s4dTc 6d9dKs5h"));
  }

  @Test
  public void test_omaha_holdem_729_2s3s5c9hKs_KdAh8hTh_3h5sTsQd_4d4c7h4s_Jh7sQh8c_3d9d7c2c_AcTd5d6h() {
    assertEquals(
      "Jh7sQh8c 4d4c7h4s AcTd5d6h KdAh8hTh 3d9d7c2c 3h5sTsQd",
      Solver.process("omaha-holdem 2s3s5c9hKs KdAh8hTh 3h5sTsQd 4d4c7h4s Jh7sQh8c 3d9d7c2c AcTd5d6h"));
  }

  @Test
  public void test_omaha_holdem_730_6s7cAdJdKs_Qh9s4h3h_9cKd2d9d_TdQd4s4d_7d7sKcTs_5h4c5dJc_AsAh6hQs_7hKhTc3d_6d8h6c5c() {
    assertEquals(
      "Qh9s4h3h 5h4c5dJc 9cKd2d9d 7hKhTc3d 6d8h6c5c 7d7sKcTs AsAh6hQs TdQd4s4d",
      Solver.process("omaha-holdem 6s7cAdJdKs Qh9s4h3h 9cKd2d9d TdQd4s4d 7d7sKcTs 5h4c5dJc AsAh6hQs 7hKhTc3d 6d8h6c5c"));
  }

  @Test
  public void test_omaha_holdem_731_2c2d3h7d8h_JdAc3dTc_4d6sThJh_9sKc8sTs_7sQs9c4h_5hTdAh5s_6h4s2sKd_JsAs8c3c_8d6dQd5c() {
    assertEquals(
      "4d6sThJh JdAc3dTc 5hTdAh5s 7sQs9c4h 8d6dQd5c 9sKc8sTs JsAs8c3c 6h4s2sKd",
      Solver.process("omaha-holdem 2c2d3h7d8h JdAc3dTc 4d6sThJh 9sKc8sTs 7sQs9c4h 5hTdAh5s 6h4s2sKd JsAs8c3c 8d6dQd5c"));
  }

  @Test
  public void test_omaha_holdem_732_3h4s7c8dQh_5s5d2hQc_3sTdKh9c_AdThQd7h_9h3dKs4c_2cKdJd7s_5cKc4dAs_6cAhJh4h() {
    assertEquals(
      "3sTdKh9c 5cKc4dAs=6cAhJh4h 2cKdJd7s 5s5d2hQc 9h3dKs4c AdThQd7h",
      Solver.process("omaha-holdem 3h4s7c8dQh 5s5d2hQc 3sTdKh9c AdThQd7h 9h3dKs4c 2cKdJd7s 5cKc4dAs 6cAhJh4h"));
  }

  @Test
  public void test_omaha_holdem_733_2s3d4s8h8s_9dQcKs8c_8d6hQd6c_2hAd4c4d_3cAh9s5d_6sQhKhKc() {
    assertEquals(
      "6sQhKhKc 8d6hQd6c 9dQcKs8c 3cAh9s5d 2hAd4c4d",
      Solver.process("omaha-holdem 2s3d4s8h8s 9dQcKs8c 8d6hQd6c 2hAd4c4d 3cAh9s5d 6sQhKhKc"));
  }

  @Test
  public void test_omaha_holdem_734_8d8hKdQsTc_QdJs9d7h_JdAdTh9s_3sQhTd7d_5h2hAsAh_8c4s3h4c_2c9hJh5c_JcKc4h2d() {
    assertEquals(
      "3sQhTd7d JcKc4h2d 5h2hAsAh 8c4s3h4c 2c9hJh5c=QdJs9d7h JdAdTh9s",
      Solver.process("omaha-holdem 8d8hKdQsTc QdJs9d7h JdAdTh9s 3sQhTd7d 5h2hAsAh 8c4s3h4c 2c9hJh5c JcKc4h2d"));
  }

  @Test
  public void test_omaha_holdem_735_3s5c7dJsTs_2s6h7hJh_4hJd8dKh_Ks4d8sQh_Td4s6sKd() {
    assertEquals(
      "4hJd8dKh 2s6h7hJh Td4s6sKd Ks4d8sQh",
      Solver.process("omaha-holdem 3s5c7dJsTs 2s6h7hJh 4hJd8dKh Ks4d8sQh Td4s6sKd"));
  }

  @Test
  public void test_omaha_holdem_736_6h7hKsQcQd_7sJcAdQh_Ah9dJh9h() {
    assertEquals(
      "Ah9dJh9h 7sJcAdQh",
      Solver.process("omaha-holdem 6h7hKsQcQd 7sJcAdQh Ah9dJh9h"));
  }

  @Test
  public void test_omaha_holdem_737_3h5sAcThTs_2d2hJd4h_7c4d5c7h_AsJc9dKh() {
    assertEquals(
      "7c4d5c7h AsJc9dKh 2d2hJd4h",
      Solver.process("omaha-holdem 3h5sAcThTs 2d2hJd4h 7c4d5c7h AsJc9dKh"));
  }

  @Test
  public void test_omaha_holdem_738_3s6h9dKdQh_QsTd3c6c_4h5d4s8h_7sAd7h7c_3hKs7d6d_2cAhTs2s() {
    assertEquals(
      "2cAhTs2s 4h5d4s8h 7sAd7h7c QsTd3c6c 3hKs7d6d",
      Solver.process("omaha-holdem 3s6h9dKdQh QsTd3c6c 4h5d4s8h 7sAd7h7c 3hKs7d6d 2cAhTs2s"));
  }

  @Test
  public void test_omaha_holdem_739_9hAdJhQdQs_Th2c9cTs_7sAcJc8d_7d6s5c8h_Qc4sAhKc_Jd5dJs4c_7c8c3d4h_8sKdKh5s_5h2hTd2d() {
    assertEquals(
      "7c8c3d4h=7d6s5c8h 5h2hTd2d Th2c9cTs 8sKdKh5s 7sAcJc8d Jd5dJs4c Qc4sAhKc",
      Solver.process("omaha-holdem 9hAdJhQdQs Th2c9cTs 7sAcJc8d 7d6s5c8h Qc4sAhKc Jd5dJs4c 7c8c3d4h 8sKdKh5s 5h2hTd2d"));
  }

  @Test
  public void test_omaha_holdem_740_3d8hAsQcQd_TdKc6sQs_Qh4c6hTs_4h6c2sKs_9sJd5hJh_7s2hJs2d_9d2c5dTc() {
    assertEquals(
      "9d2c5dTc 4h6c2sKs 7s2hJs2d 9sJd5hJh Qh4c6hTs TdKc6sQs",
      Solver.process("omaha-holdem 3d8hAsQcQd TdKc6sQs Qh4c6hTs 4h6c2sKs 9sJd5hJh 7s2hJs2d 9d2c5dTc"));
  }

  @Test
  public void test_omaha_holdem_741_3h6c7h9hTd_8sJd5sAc_6s5c9d7d_4sAdQc8h_4c6h9c5d_Tc8cQh2h() {
    assertEquals(
      "4sAdQc8h 6s5c9d7d 4c6h9c5d 8sJd5sAc Tc8cQh2h",
      Solver.process("omaha-holdem 3h6c7h9hTd 8sJd5sAc 6s5c9d7d 4sAdQc8h 4c6h9c5d Tc8cQh2h"));
  }

  @Test
  public void test_omaha_holdem_742_3h4c8sAdQs_9c7d5cJd_JhAs8cJc_Js2d4d5h_5d6sKc3d_7s9dTs6c_Td9sKd8d_AhKh2hTh_QcQdAc4h() {
    assertEquals(
      "7s9dTs6c 9c7d5cJd 5d6sKc3d Td9sKd8d AhKh2hTh JhAs8cJc QcQdAc4h Js2d4d5h",
      Solver.process("omaha-holdem 3h4c8sAdQs 9c7d5cJd JhAs8cJc Js2d4d5h 5d6sKc3d 7s9dTs6c Td9sKd8d AhKh2hTh QcQdAc4h"));
  }

  @Test
  public void test_omaha_holdem_743_3s4s8sJhTh_Kc6h3c2c_Qd6c5d4h_JsQh4c6d_7h3d9s4d_9h9d5c3h_8dKh7c8h_5sAhTs2s_7dKs8c9c() {
    assertEquals(
      "Kc6h3c2c Qd6c5d4h 9h9d5c3h JsQh4c6d 8dKh7c8h 7dKs8c9c=7h3d9s4d 5sAhTs2s",
      Solver.process("omaha-holdem 3s4s8sJhTh Kc6h3c2c Qd6c5d4h JsQh4c6d 7h3d9s4d 9h9d5c3h 8dKh7c8h 5sAhTs2s 7dKs8c9c"));
  }

  @Test
  public void test_omaha_holdem_744_6s7dJhKcTh_3dTd2cJs_5hQd2d4s_TcAd4d6c_KdTs2s5d_3hAh9d3s_4c9hAsJd_5sKh3c7c_8cQc8s2h() {
    assertEquals(
      "5hQd2d4s 3hAh9d3s 8cQc8s2h 4c9hAsJd TcAd4d6c 3dTd2cJs 5sKh3c7c KdTs2s5d",
      Solver.process("omaha-holdem 6s7dJhKcTh 3dTd2cJs 5hQd2d4s TcAd4d6c KdTs2s5d 3hAh9d3s 4c9hAsJd 5sKh3c7c 8cQc8s2h"));
  }

  @Test
  public void test_omaha_holdem_745_5h7d8hAcTh_6s9c2d4s_Jc7c4c3c_2c3h6hTd_5cQdTs5d() {
    assertEquals(
      "Jc7c4c3c 5cQdTs5d 6s9c2d4s 2c3h6hTd",
      Solver.process("omaha-holdem 5h7d8hAcTh 6s9c2d4s Jc7c4c3c 2c3h6hTd 5cQdTs5d"));
  }

  @Test
  public void test_omaha_holdem_746_2d3d8dAsQd_7cJc4d4s_3s6h6c2s_Ah4c5d5h() {
    assertEquals(
      "7cJc4d4s 3s6h6c2s Ah4c5d5h",
      Solver.process("omaha-holdem 2d3d8dAsQd 7cJc4d4s 3s6h6c2s Ah4c5d5h"));
  }

  @Test
  public void test_omaha_holdem_747_5h6s7dAsKs_Ad9sTh2s_Tc9c3c6c_7c2cTd7s() {
    assertEquals(
      "Tc9c3c6c 7c2cTd7s Ad9sTh2s",
      Solver.process("omaha-holdem 5h6s7dAsKs Ad9sTh2s Tc9c3c6c 7c2cTd7s"));
  }

  @Test
  public void test_omaha_holdem_748_3s4d6s9d9s_Ah3d6hJh_Kc2hKh6d_Qs9c8cJs_As5h2dQc_8h7hJd6c_4cKd8s2c_4sAc9h2s_Jc8dTs7s_QdTh3c5d() {
    assertEquals(
      "QdTh3c5d 4cKd8s2c 8h7hJd6c Ah3d6hJh Kc2hKh6d As5h2dQc Jc8dTs7s Qs9c8cJs 4sAc9h2s",
      Solver.process("omaha-holdem 3s4d6s9d9s Ah3d6hJh Kc2hKh6d Qs9c8cJs As5h2dQc 8h7hJd6c 4cKd8s2c 4sAc9h2s Jc8dTs7s QdTh3c5d"));
  }

  @Test
  public void test_omaha_holdem_749_2c2d5c5d8d_6h2hAdAs_2sJd4hKc_QcKh7h4s_9h5h9d9s_7cJc3s9c_Ts4d8hJh_7dTdTcJs_AcTh3c3h() {
    assertEquals(
      "7cJc3s9c QcKh7h4s AcTh3c3h Ts4d8hJh 2sJd4hKc 6h2hAdAs 9h5h9d9s 7dTdTcJs",
      Solver.process("omaha-holdem 2c2d5c5d8d 6h2hAdAs 2sJd4hKc QcKh7h4s 9h5h9d9s 7cJc3s9c Ts4d8hJh 7dTdTcJs AcTh3c3h"));
  }

}
