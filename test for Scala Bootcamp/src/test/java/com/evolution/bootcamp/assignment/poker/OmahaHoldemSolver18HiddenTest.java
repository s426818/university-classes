
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver18HiddenTest {


  @Test
  public void test_omaha_holdem_4500_2h3c4h7dAh_Jc4d3hKs_7h8dQc4s_Tc6c6h2d() {
    assertEquals(
      "Tc6c6h2d Jc4d3hKs 7h8dQc4s",
      Solver.process("omaha-holdem 2h3c4h7dAh Jc4d3hKs 7h8dQc4s Tc6c6h2d"));
  }

  @Test
  public void test_omaha_holdem_4501_4h8d9c9dAd_Qs9h8s6h_Td2d7d4c_Qh4dJs3d_Ah3sTsKc_6sAs3c6c_5hKsQc5s() {
    assertEquals(
      "5hKsQc5s 6sAs3c6c Ah3sTsKc Qh4dJs3d Td2d7d4c Qs9h8s6h",
      Solver.process("omaha-holdem 4h8d9c9dAd Qs9h8s6h Td2d7d4c Qh4dJs3d Ah3sTsKc 6sAs3c6c 5hKsQc5s"));
  }

  @Test
  public void test_omaha_holdem_4502_9c9hJdKhTs_Td5hQc6d_Qh2hJh7h_9d9s2c8s_3sAsJsKc_Qs3h8h5d_ThJc5s2d_5cKdTc6h_7c4hKs8d() {
    assertEquals(
      "ThJc5s2d 5cKdTc6h 3sAsJsKc 7c4hKs8d Qs3h8h5d Qh2hJh7h=Td5hQc6d 9d9s2c8s",
      Solver.process("omaha-holdem 9c9hJdKhTs Td5hQc6d Qh2hJh7h 9d9s2c8s 3sAsJsKc Qs3h8h5d ThJc5s2d 5cKdTc6h 7c4hKs8d"));
  }

  @Test
  public void test_omaha_holdem_4503_3c4c8c9dAc_Kd2h6cTh_Ah4dAsJd() {
    assertEquals(
      "Kd2h6cTh Ah4dAsJd",
      Solver.process("omaha-holdem 3c4c8c9dAc Kd2h6cTh Ah4dAsJd"));
  }

  @Test
  public void test_omaha_holdem_4504_6s7h8s9hTc_Qs9cAdQh_4c2hKd8c_JsJhQd8d_3d9d4sJd_Th7sAs2c() {
    assertEquals(
      "4c2hKd8c Qs9cAdQh Th7sAs2c 3d9d4sJd JsJhQd8d",
      Solver.process("omaha-holdem 6s7h8s9hTc Qs9cAdQh 4c2hKd8c JsJhQd8d 3d9d4sJd Th7sAs2c"));
  }

  @Test
  public void test_omaha_holdem_4505_5dAhQcTcTs_2dJsKh4d_2h7s6d6c_9d6h9s9c_7dTdJhAc_3s2cAdQd() {
    assertEquals(
      "2h7s6d6c 9d6h9s9c 3s2cAdQd 2dJsKh4d 7dTdJhAc",
      Solver.process("omaha-holdem 5dAhQcTcTs 2dJsKh4d 2h7s6d6c 9d6h9s9c 7dTdJhAc 3s2cAdQd"));
  }

  @Test
  public void test_omaha_holdem_4506_5d5sAcJdTc_AhTdQcKc_5cKd8s2h_Ad3c2cJc() {
    assertEquals(
      "Ad3c2cJc 5cKd8s2h AhTdQcKc",
      Solver.process("omaha-holdem 5d5sAcJdTc AhTdQcKc 5cKd8s2h Ad3c2cJc"));
  }

  @Test
  public void test_omaha_holdem_4507_4s6d8cKdQh_Jh9c2d6h_Ad5hTdTh_3dJcJd5s_2s9h3hAc() {
    assertEquals(
      "2s9h3hAc Jh9c2d6h Ad5hTdTh 3dJcJd5s",
      Solver.process("omaha-holdem 4s6d8cKdQh Jh9c2d6h Ad5hTdTh 3dJcJd5s 2s9h3hAc"));
  }

  @Test
  public void test_omaha_holdem_4508_3c4h6hAsKc_7sQh9cJc_9h2c3sTd_8d7dAc2h_KhTh4c2s_AdQs8s7h_4dTc7c4s() {
    assertEquals(
      "7sQh9cJc 9h2c3sTd 8d7dAc2h AdQs8s7h KhTh4c2s 4dTc7c4s",
      Solver.process("omaha-holdem 3c4h6hAsKc 7sQh9cJc 9h2c3sTd 8d7dAc2h KhTh4c2s AdQs8s7h 4dTc7c4s"));
  }

  @Test
  public void test_omaha_holdem_4509_2d3c6h8dTd_Qd4cAs5d_7d4d7s2c_4sQh6c6d_JcJdJh2s_KhAc7h9s_5h8c4h3h_9h3sTsKd() {
    assertEquals(
      "JcJdJh2s 9h3sTsKd 4sQh6c6d 5h8c4h3h KhAc7h9s 7d4d7s2c Qd4cAs5d",
      Solver.process("omaha-holdem 2d3c6h8dTd Qd4cAs5d 7d4d7s2c 4sQh6c6d JcJdJh2s KhAc7h9s 5h8c4h3h 9h3sTsKd"));
  }

  @Test
  public void test_omaha_holdem_4510_3s5s6s7h8h_7c5cKdJh_JdAdKh2h_As8s7dAh_JsTcQdKc() {
    assertEquals(
      "JsTcQdKc JdAdKh2h 7c5cKdJh As8s7dAh",
      Solver.process("omaha-holdem 3s5s6s7h8h 7c5cKdJh JdAdKh2h As8s7dAh JsTcQdKc"));
  }

  @Test
  public void test_omaha_holdem_4511_3s5h7hAcJh_AhJcKcQh_Ts3cQs2c_Ks6d6c6s_2d5c9c5d_Td7d4d9s_ThKh8c4s_9h8dJd3d_JsAd8h7c() {
    assertEquals(
      "Ts3cQs2c Ks6d6c6s Td7d4d9s 9h8dJd3d JsAd8h7c 2d5c9c5d ThKh8c4s AhJcKcQh",
      Solver.process("omaha-holdem 3s5h7hAcJh AhJcKcQh Ts3cQs2c Ks6d6c6s 2d5c9c5d Td7d4d9s ThKh8c4s 9h8dJd3d JsAd8h7c"));
  }

  @Test
  public void test_omaha_holdem_4512_3c5d8s9sAh_Kd3d2c2h_8c4sKs4d_Jd5h2s3h_Jh6dQdJs_9d7d4c5c() {
    assertEquals(
      "Kd3d2c2h 8c4sKs4d Jh6dQdJs Jd5h2s3h 9d7d4c5c",
      Solver.process("omaha-holdem 3c5d8s9sAh Kd3d2c2h 8c4sKs4d Jd5h2s3h Jh6dQdJs 9d7d4c5c"));
  }

  @Test
  public void test_omaha_holdem_4513_2h7c7hJsTs_QhJd4hJc_6cQs8c8s_4c2s2dAd_8dKs4dKd_Th9s3cAs_Td3d6h6d_7d9h5h3h() {
    assertEquals(
      "6cQs8c8s Td3d6h6d Th9s3cAs 8dKs4dKd 7d9h5h3h 4c2s2dAd QhJd4hJc",
      Solver.process("omaha-holdem 2h7c7hJsTs QhJd4hJc 6cQs8c8s 4c2s2dAd 8dKs4dKd Th9s3cAs Td3d6h6d 7d9h5h3h"));
  }

  @Test
  public void test_omaha_holdem_4514_5c6hAsJdTh_6s2c3c8h_Qs9h4c7d_3sJsJc8d_2d4h2s9d_Kh5h7c8s_QhJhKd6c() {
    assertEquals(
      "Qs9h4c7d 2d4h2s9d Kh5h7c8s 6s2c3c8h 3sJsJc8d QhJhKd6c",
      Solver.process("omaha-holdem 5c6hAsJdTh 6s2c3c8h Qs9h4c7d 3sJsJc8d 2d4h2s9d Kh5h7c8s QhJhKd6c"));
  }

  @Test
  public void test_omaha_holdem_4515_2s4cJhJsKc_KsKh7s5h_8sQhAh9h_JcKd4s3h_QdJd8hQs_6c5s9s3s_AdQcAc5d_9dThTc9c() {
    assertEquals(
      "6c5s9s3s 8sQhAh9h 9dThTc9c AdQcAc5d QdJd8hQs JcKd4s3h KsKh7s5h",
      Solver.process("omaha-holdem 2s4cJhJsKc KsKh7s5h 8sQhAh9h JcKd4s3h QdJd8hQs 6c5s9s3s AdQcAc5d 9dThTc9c"));
  }

  @Test
  public void test_omaha_holdem_4516_2c4d4h8c9d_9hQsKdQh_8sKh2h9c_JhAs6s7d() {
    assertEquals(
      "JhAs6s7d 8sKh2h9c 9hQsKdQh",
      Solver.process("omaha-holdem 2c4d4h8c9d 9hQsKdQh 8sKh2h9c JhAs6s7d"));
  }

  @Test
  public void test_omaha_holdem_4517_2c4d5cKsTs_4c9hQcAh_3cJd9sQd_JcTh3s8c_Ac7c3h2d_7d7h6cQh_TcJh7s5s() {
    assertEquals(
      "3cJd9sQd 4c9hQcAh 7d7h6cQh JcTh3s8c TcJh7s5s Ac7c3h2d",
      Solver.process("omaha-holdem 2c4d5cKsTs 4c9hQcAh 3cJd9sQd JcTh3s8c Ac7c3h2d 7d7h6cQh TcJh7s5s"));
  }

  @Test
  public void test_omaha_holdem_4518_3s5d9dKcTh_5h7d3c9h_8h8d2sTs_Ad5c3dJs() {
    assertEquals(
      "8h8d2sTs Ad5c3dJs 5h7d3c9h",
      Solver.process("omaha-holdem 3s5d9dKcTh 5h7d3c9h 8h8d2sTs Ad5c3dJs"));
  }

  @Test
  public void test_omaha_holdem_4519_2c2d3sAsKh_5cTs3c3h_5hJhAd6s_5d4d8h9h() {
    assertEquals(
      "5hJhAd6s 5d4d8h9h 5cTs3c3h",
      Solver.process("omaha-holdem 2c2d3sAsKh 5cTs3c3h 5hJhAd6s 5d4d8h9h"));
  }

  @Test
  public void test_omaha_holdem_4520_2c6dAdTcTd_7s6s5s9d_3cKh2dAs() {
    assertEquals(
      "7s6s5s9d 3cKh2dAs",
      Solver.process("omaha-holdem 2c6dAdTcTd 7s6s5s9d 3cKh2dAs"));
  }

  @Test
  public void test_omaha_holdem_4521_6d9cJcKdTd_5hAs8s7c_3s9s2s6h_JdJh8h2c_3hTcJs5c() {
    assertEquals(
      "3s9s2s6h 3hTcJs5c JdJh8h2c 5hAs8s7c",
      Solver.process("omaha-holdem 6d9cJcKdTd 5hAs8s7c 3s9s2s6h JdJh8h2c 3hTcJs5c"));
  }

  @Test
  public void test_omaha_holdem_4522_4d5c5s7cJc_Tc6d9c9d_3d8h2cTh_7h8s6sAh_7dKc4c4s_2dJsTs8d_6h3s3hJd() {
    assertEquals(
      "3d8h2cTh 2dJsTs8d 6h3s3hJd 7h8s6sAh Tc6d9c9d 7dKc4c4s",
      Solver.process("omaha-holdem 4d5c5s7cJc Tc6d9c9d 3d8h2cTh 7h8s6sAh 7dKc4c4s 2dJsTs8d 6h3s3hJd"));
  }

  @Test
  public void test_omaha_holdem_4523_3h4s7s8hQc_6s8d8s2d_Ks9sAs6d_QdJcAh5c_Kd6h7c2c_9d2s5h5d_Ts3c7h9c_9hAc3dKc() {
    assertEquals(
      "Ks9sAs6d 9hAc3dKc 9d2s5h5d Kd6h7c2c QdJcAh5c Ts3c7h9c 6s8d8s2d",
      Solver.process("omaha-holdem 3h4s7s8hQc 6s8d8s2d Ks9sAs6d QdJcAh5c Kd6h7c2c 9d2s5h5d Ts3c7h9c 9hAc3dKc"));
  }

  @Test
  public void test_omaha_holdem_4524_5s6s8c9dKc_Ts4c8s7c_QdJh5cJd_Qh4h3c9s_TcJc4d4s_7d6c8d9c() {
    assertEquals(
      "TcJc4d4s Qh4h3c9s QdJh5cJd 7d6c8d9c Ts4c8s7c",
      Solver.process("omaha-holdem 5s6s8c9dKc Ts4c8s7c QdJh5cJd Qh4h3c9s TcJc4d4s 7d6c8d9c"));
  }

  @Test
  public void test_omaha_holdem_4525_4s5d7hAdTh_8dAh4d5c_Td9c8h7c_Ac2sKsKc_3c2dTc9d_7d3sQh3d_2h8s6dKd() {
    assertEquals(
      "7d3sQh3d Ac2sKsKc Td9c8h7c 8dAh4d5c 3c2dTc9d 2h8s6dKd",
      Solver.process("omaha-holdem 4s5d7hAdTh 8dAh4d5c Td9c8h7c Ac2sKsKc 3c2dTc9d 7d3sQh3d 2h8s6dKd"));
  }

  @Test
  public void test_omaha_holdem_4526_3d4c5h8c8d_6c5c7dQh_9hTc6hJd_KsAc4h5s() {
    assertEquals(
      "9hTc6hJd KsAc4h5s 6c5c7dQh",
      Solver.process("omaha-holdem 3d4c5h8c8d 6c5c7dQh 9hTc6hJd KsAc4h5s"));
  }

  @Test
  public void test_omaha_holdem_4527_3s8c9cQdQh_Jd4d6c6h_6d2hQcJc_JsKhTd8s_8dAh9d3c_2cTc4c5s_7h5c4sAd() {
    assertEquals(
      "2cTc4c5s 7h5c4sAd Jd4d6c6h 8dAh9d3c 6d2hQcJc JsKhTd8s",
      Solver.process("omaha-holdem 3s8c9cQdQh Jd4d6c6h 6d2hQcJc JsKhTd8s 8dAh9d3c 2cTc4c5s 7h5c4sAd"));
  }

  @Test
  public void test_omaha_holdem_4528_4d7d9hJcQc_5d8c3dQh_TdAc5cKd_9sQdAsAd() {
    assertEquals(
      "5d8c3dQh 9sQdAsAd TdAc5cKd",
      Solver.process("omaha-holdem 4d7d9hJcQc 5d8c3dQh TdAc5cKd 9sQdAsAd"));
  }

  @Test
  public void test_omaha_holdem_4529_3c8cKcQsTh_7cJh5c8d_5hKhQcTs_Jd9s6dJc_9h2s2c4s_9dTc3dJs_4d7hKd4c_2dAs9c6c_7s8h3sTd_Ac7dKsQh() {
    assertEquals(
      "9h2s2c4s 4d7hKd4c 7s8h3sTd 5hKhQcTs=Ac7dKsQh 9dTc3dJs=Jd9s6dJc 7cJh5c8d 2dAs9c6c",
      Solver.process("omaha-holdem 3c8cKcQsTh 7cJh5c8d 5hKhQcTs Jd9s6dJc 9h2s2c4s 9dTc3dJs 4d7hKd4c 2dAs9c6c 7s8h3sTd Ac7dKsQh"));
  }

  @Test
  public void test_omaha_holdem_4530_2d8hAsJcKh_6cTc6h9h_Jd3cAc5c_Kd4s4d7s_7cQh4h9c_2h9sQsJh_2sAh5hQc_9d5d7dKs_3d3sTd8s() {
    assertEquals(
      "7cQh4h9c 6cTc6h9h 3d3sTd8s Kd4s4d7s 9d5d7dKs 2h9sQsJh 2sAh5hQc Jd3cAc5c",
      Solver.process("omaha-holdem 2d8hAsJcKh 6cTc6h9h Jd3cAc5c Kd4s4d7s 7cQh4h9c 2h9sQsJh 2sAh5hQc 9d5d7dKs 3d3sTd8s"));
  }

  @Test
  public void test_omaha_holdem_4531_2d4d5h6h8h_JdJsTh7c_4c6dTdAd_Qc8d2s2h_3h9c3sAh_5s3c8cAc() {
    assertEquals(
      "JdJsTh7c 4c6dTdAd Qc8d2s2h 5s3c8cAc 3h9c3sAh",
      Solver.process("omaha-holdem 2d4d5h6h8h JdJsTh7c 4c6dTdAd Qc8d2s2h 3h9c3sAh 5s3c8cAc"));
  }

  @Test
  public void test_omaha_holdem_4532_5h6cAcAhKs_Qs7s4hJd_2c2s8d3h_9c9h8cTd_3sTs3cKd_4cQcAdQd_6s7d7cJs() {
    assertEquals(
      "Qs7s4hJd 2c2s8d3h 6s7d7cJs 9c9h8cTd 3sTs3cKd 4cQcAdQd",
      Solver.process("omaha-holdem 5h6cAcAhKs Qs7s4hJd 2c2s8d3h 9c9h8cTd 3sTs3cKd 4cQcAdQd 6s7d7cJs"));
  }

  @Test
  public void test_omaha_holdem_4533_2h4cJsKsQh_8sKh7dKc_5s7sQs7c_2d9s8h5h_JcAh9h9c_6h8c3s6s_Jh5c6c9d_QcAd4s3c_3h2sTc4d_Jd8dTs4h() {
    assertEquals(
      "2d9s8h5h 6h8c3s6s Jh5c6c9d JcAh9h9c 5s7sQs7c 3h2sTc4d Jd8dTs4h QcAd4s3c 8sKh7dKc",
      Solver.process("omaha-holdem 2h4cJsKsQh 8sKh7dKc 5s7sQs7c 2d9s8h5h JcAh9h9c 6h8c3s6s Jh5c6c9d QcAd4s3c 3h2sTc4d Jd8dTs4h"));
  }

  @Test
  public void test_omaha_holdem_4534_3s7h7sJdJs_Kc4cTd5c_9s6h3d8d_Kd6d2h9d_5s2sAh8c_AsQs2d5d_QdAcJh8h() {
    assertEquals(
      "Kd6d2h9d Kc4cTd5c 9s6h3d8d QdAcJh8h 5s2sAh8c AsQs2d5d",
      Solver.process("omaha-holdem 3s7h7sJdJs Kc4cTd5c 9s6h3d8d Kd6d2h9d 5s2sAh8c AsQs2d5d QdAcJh8h"));
  }

  @Test
  public void test_omaha_holdem_4535_3c5d6sAsQd_4c3d2d6h_4h2sTcKs_7d7s9dAh_5c8h2c8c_6cQs8d5h() {
    assertEquals(
      "5c8h2c8c 7d7s9dAh 6cQs8d5h 4c3d2d6h=4h2sTcKs",
      Solver.process("omaha-holdem 3c5d6sAsQd 4c3d2d6h 4h2sTcKs 7d7s9dAh 5c8h2c8c 6cQs8d5h"));
  }

  @Test
  public void test_omaha_holdem_4536_2s3s6hKsQd_4c3c3h8c_6cAd4h2h_Jh9d7dTh_3d9sKh8h_2c5h2dKc_Kd5s4sTd_Tc8d8sJd_Js7cQh7s() {
    assertEquals(
      "Jh9d7dTh Tc8d8sJd 6cAd4h2h 3d9sKh8h 2c5h2dKc 4c3c3h8c Kd5s4sTd Js7cQh7s",
      Solver.process("omaha-holdem 2s3s6hKsQd 4c3c3h8c 6cAd4h2h Jh9d7dTh 3d9sKh8h 2c5h2dKc Kd5s4sTd Tc8d8sJd Js7cQh7s"));
  }

  @Test
  public void test_omaha_holdem_4537_2s6c6hAhTs_TdQhKd5c_3dJh8d5d_7cAs8s8c_AdQc5h4c() {
    assertEquals(
      "3dJh8d5d TdQhKd5c 7cAs8s8c AdQc5h4c",
      Solver.process("omaha-holdem 2s6c6hAhTs TdQhKd5c 3dJh8d5d 7cAs8s8c AdQc5h4c"));
  }

  @Test
  public void test_omaha_holdem_4538_3d3s9sJhKh_TsTcAcAd_7cJd4c6d_4d9h7h8d_QsJsAhQc_AsJc8h4h_Kc6h8s7s_2h2d3cKs_Qh5h5d8c_5sQd5c3h() {
    assertEquals(
      "Qh5h5d8c 4d9h7h8d 7cJd4c6d AsJc8h4h QsJsAhQc Kc6h8s7s TsTcAcAd 5sQd5c3h 2h2d3cKs",
      Solver.process("omaha-holdem 3d3s9sJhKh TsTcAcAd 7cJd4c6d 4d9h7h8d QsJsAhQc AsJc8h4h Kc6h8s7s 2h2d3cKs Qh5h5d8c 5sQd5c3h"));
  }

  @Test
  public void test_omaha_holdem_4539_2h6c8hAhJd_7dKd9dKh_QdJc5s8c_3c2c5c3s_9c4d7s3h_As7cAd6d_Tc7h4c4h_8s5d4sKc_5hJh9s2d_Th2s9h6s() {
    assertEquals(
      "9c4d7s3h 3c2c5c3s 8s5d4sKc 7dKd9dKh QdJc5s8c As7cAd6d Tc7h4c4h Th2s9h6s 5hJh9s2d",
      Solver.process("omaha-holdem 2h6c8hAhJd 7dKd9dKh QdJc5s8c 3c2c5c3s 9c4d7s3h As7cAd6d Tc7h4c4h 8s5d4sKc 5hJh9s2d Th2s9h6s"));
  }

  @Test
  public void test_omaha_holdem_4540_5c5s8h9sAh_8dAs8sKs_AcQcQh7d_6d2sJd5h_7s9cTs3s_5d6c4hKd_QsTc4d3h_Jh9d8c4c() {
    assertEquals(
      "QsTc4d3h 7s9cTs3s Jh9d8c4c AcQcQh7d 6d2sJd5h 5d6c4hKd 8dAs8sKs",
      Solver.process("omaha-holdem 5c5s8h9sAh 8dAs8sKs AcQcQh7d 6d2sJd5h 7s9cTs3s 5d6c4hKd QsTc4d3h Jh9d8c4c"));
  }

  @Test
  public void test_omaha_holdem_4541_2h4c6sJcTs_4h5d9c3d_KcQh6hQs_JsAd7d8s() {
    assertEquals(
      "JsAd7d8s KcQh6hQs 4h5d9c3d",
      Solver.process("omaha-holdem 2h4c6sJcTs 4h5d9c3d KcQh6hQs JsAd7d8s"));
  }

  @Test
  public void test_omaha_holdem_4542_5d6h8sKdQs_2h3c7sJd_TcQc5c6c_5hKh9d3d_6d2sTdQh_7hAs4s3h() {
    assertEquals(
      "2h3c7sJd 6d2sTdQh=TcQc5c6c 5hKh9d3d 7hAs4s3h",
      Solver.process("omaha-holdem 5d6h8sKdQs 2h3c7sJd TcQc5c6c 5hKh9d3d 6d2sTdQh 7hAs4s3h"));
  }

  @Test
  public void test_omaha_holdem_4543_2c4h6dJdQc_8d7d7c3h_5sJc6hKs_AsQsQd7h_9hTh4cTc_Kd6s8s5h_9sAc4d3s_8h8c2d9c_Qh3c5d7s() {
    assertEquals(
      "9sAc4d3s Kd6s8s5h 8d7d7c3h 8h8c2d9c 9hTh4cTc 5sJc6hKs AsQsQd7h Qh3c5d7s",
      Solver.process("omaha-holdem 2c4h6dJdQc 8d7d7c3h 5sJc6hKs AsQsQd7h 9hTh4cTc Kd6s8s5h 9sAc4d3s 8h8c2d9c Qh3c5d7s"));
  }

  @Test
  public void test_omaha_holdem_4544_3h6s8c8hKs_3s5c7hJh_8sTs5h5s_3d7c8d2h_Ac9d2s4d_7s9h2cTd_KhJc6h9c_TcKc6d4c() {
    assertEquals(
      "7s9h2cTd Ac9d2s4d 3s5c7hJh TcKc6d4c KhJc6h9c 8sTs5h5s 3d7c8d2h",
      Solver.process("omaha-holdem 3h6s8c8hKs 3s5c7hJh 8sTs5h5s 3d7c8d2h Ac9d2s4d 7s9h2cTd KhJc6h9c TcKc6d4c"));
  }

  @Test
  public void test_omaha_holdem_4545_2d7dKhTcTd_JdQdQs6d_5h3c8cAs() {
    assertEquals(
      "5h3c8cAs JdQdQs6d",
      Solver.process("omaha-holdem 2d7dKhTcTd JdQdQs6d 5h3c8cAs"));
  }

  @Test
  public void test_omaha_holdem_4546_4d4s6s8d9c_4h7sJsAc_Jd5s9dKh_Ad5c5dTc_7d8c4c3s_6hAs7c2s_Kd2dAhTh_Kc3cTdQc_8h2c3h5h_2hJc3dJh() {
    assertEquals(
      "Kc3cTdQc Kd2dAhTh Ad5c5dTc 6hAs7c2s 8h2c3h5h Jd5s9dKh 2hJc3dJh 4h7sJsAc 7d8c4c3s",
      Solver.process("omaha-holdem 4d4s6s8d9c 4h7sJsAc Jd5s9dKh Ad5c5dTc 7d8c4c3s 6hAs7c2s Kd2dAhTh Kc3cTdQc 8h2c3h5h 2hJc3dJh"));
  }

  @Test
  public void test_omaha_holdem_4547_6s7d8hAdTd_2hQhJd5s_JsKdQc5d_4hJhQd9h_2c6c3cQs() {
    assertEquals(
      "2hQhJd5s 2c6c3cQs 4hJhQd9h JsKdQc5d",
      Solver.process("omaha-holdem 6s7d8hAdTd 2hQhJd5s JsKdQc5d 4hJhQd9h 2c6c3cQs"));
  }

  @Test
  public void test_omaha_holdem_4548_5d9d9sKsQs_Kc6cTd7s_Tc7d3h5c_8d3c2sQh_Th3s5hJc() {
    assertEquals(
      "Tc7d3h5c 8d3c2sQh Kc6cTd7s Th3s5hJc",
      Solver.process("omaha-holdem 5d9d9sKsQs Kc6cTd7s Tc7d3h5c 8d3c2sQh Th3s5hJc"));
  }

  @Test
  public void test_omaha_holdem_4549_4d4h7c8cQs_Js4c3h9c_5h5c4s6s_9s8s8hAs_Ks6c7sKc_Ts8dTdAc_QcKhTc6h_3dQdQh2h() {
    assertEquals(
      "Ts8dTdAc QcKhTc6h Ks6c7sKc Js4c3h9c 5h5c4s6s 9s8s8hAs 3dQdQh2h",
      Solver.process("omaha-holdem 4d4h7c8cQs Js4c3h9c 5h5c4s6s 9s8s8hAs Ks6c7sKc Ts8dTdAc QcKhTc6h 3dQdQh2h"));
  }

  @Test
  public void test_omaha_holdem_4550_7c7s8h9cJh_2hQcAd6d_9dQhAs5c_3d7d2s8c() {
    assertEquals(
      "2hQcAd6d 9dQhAs5c 3d7d2s8c",
      Solver.process("omaha-holdem 7c7s8h9cJh 2hQcAd6d 9dQhAs5c 3d7d2s8c"));
  }

  @Test
  public void test_omaha_holdem_4551_2h2s3hAcQd_TdKc5c6h_9c5hTsTc_Ah7hQh5s_5d9s8d6s() {
    assertEquals(
      "5d9s8d6s TdKc5c6h 9c5hTsTc Ah7hQh5s",
      Solver.process("omaha-holdem 2h2s3hAcQd TdKc5c6h 9c5hTsTc Ah7hQh5s 5d9s8d6s"));
  }

  @Test
  public void test_omaha_holdem_4552_4d4h5c7cJs_6c6h7hTd_Kh8h4cTs_9c2s3c6s_Jd9hTc5s_8s7s7dKs_Ad6dJc2c_4sQdTh3d_KcQh2h9s() {
    assertEquals(
      "KcQh2h9s 6c6h7hTd Ad6dJc2c Jd9hTc5s 4sQdTh3d Kh8h4cTs 9c2s3c6s 8s7s7dKs",
      Solver.process("omaha-holdem 4d4h5c7cJs 6c6h7hTd Kh8h4cTs 9c2s3c6s Jd9hTc5s 8s7s7dKs Ad6dJc2c 4sQdTh3d KcQh2h9s"));
  }

  @Test
  public void test_omaha_holdem_4553_5s6h9dJhTh_4s2h6c9c_7h7dJc7s_TsQd2cTc() {
    assertEquals(
      "7h7dJc7s 4s2h6c9c TsQd2cTc",
      Solver.process("omaha-holdem 5s6h9dJhTh 4s2h6c9c 7h7dJc7s TsQd2cTc"));
  }

  @Test
  public void test_omaha_holdem_4554_2s3d4hAcAh_4d5h6dJd_Ts3s5dQh() {
    assertEquals(
      "Ts3s5dQh 4d5h6dJd",
      Solver.process("omaha-holdem 2s3d4hAcAh 4d5h6dJd Ts3s5dQh"));
  }

  @Test
  public void test_omaha_holdem_4555_3s4h7h9cAh_3c6s2d4d_2s8s8cKh_QhAd5sQc_JdKs6c6d_7c2c9h5h_3h5cAsJh_8dThAc7s_Td3d6hTs_Qd2hTcKd() {
    assertEquals(
      "Qd2hTcKd JdKs6c6d 2s8s8cKh Td3d6hTs QhAd5sQc 3c6s2d4d 8dThAc7s 7c2c9h5h 3h5cAsJh",
      Solver.process("omaha-holdem 3s4h7h9cAh 3c6s2d4d 2s8s8cKh QhAd5sQc JdKs6c6d 7c2c9h5h 3h5cAsJh 8dThAc7s Td3d6hTs Qd2hTcKd"));
  }

  @Test
  public void test_omaha_holdem_4556_3h8d8h9sAd_AcTd2c5d_7h6sTs4c_Ah4s7cQc_8sJd5c9c_2sJhKd3c_3sQd5h9h_KhTh7s2d_TcJs4dAs_Jc8c3dQh() {
    assertEquals(
      "7h6sTs4c KhTh7s2d 2sJhKd3c 3sQd5h9h AcTd2c5d TcJs4dAs Ah4s7cQc Jc8c3dQh 8sJd5c9c",
      Solver.process("omaha-holdem 3h8d8h9sAd AcTd2c5d 7h6sTs4c Ah4s7cQc 8sJd5c9c 2sJhKd3c 3sQd5h9h KhTh7s2d TcJs4dAs Jc8c3dQh"));
  }

  @Test
  public void test_omaha_holdem_4557_2d3c5d9sTh_3s6h4c4h_9h4s2cJh_2hJdQhAs_QcKh9dAc_3dKsTd6c_Kd7cTs3h_5hKc8hTc() {
    assertEquals(
      "2hJdQhAs QcKh9dAc 9h4s2cJh 3dKsTd6c=Kd7cTs3h 5hKc8hTc 3s6h4c4h",
      Solver.process("omaha-holdem 2d3c5d9sTh 3s6h4c4h 9h4s2cJh 2hJdQhAs QcKh9dAc 3dKsTd6c Kd7cTs3h 5hKc8hTc"));
  }

  @Test
  public void test_omaha_holdem_4558_4c4d6h8d9c_7sAsQsQh_9dAd7c9s_9hTd6s5c_Kh4sJhAh() {
    assertEquals(
      "9hTd6s5c 7sAsQsQh Kh4sJhAh 9dAd7c9s",
      Solver.process("omaha-holdem 4c4d6h8d9c 7sAsQsQh 9dAd7c9s 9hTd6s5c Kh4sJhAh"));
  }

  @Test
  public void test_omaha_holdem_4559_5c7c9hAsQc_3c7s7d7h_QdKs9d9c_2d3dTcKd_2h6hJcAd_Th4sTdJs() {
    assertEquals(
      "2d3dTcKd Th4sTdJs 2h6hJcAd 3c7s7d7h QdKs9d9c",
      Solver.process("omaha-holdem 5c7c9hAsQc 3c7s7d7h QdKs9d9c 2d3dTcKd 2h6hJcAd Th4sTdJs"));
  }

  @Test
  public void test_omaha_holdem_4560_3h5c6c8sJh_2c5hQh6d_4sAh3sTs_3c3d5sAd_KsJc8h9d_Kc7dTc4d_Js9s8c7c_Th5d4cAs() {
    assertEquals(
      "4sAh3sTs Th5d4cAs 2c5hQh6d KsJc8h9d 3c3d5sAd Kc7dTc4d Js9s8c7c",
      Solver.process("omaha-holdem 3h5c6c8sJh 2c5hQh6d 4sAh3sTs 3c3d5sAd KsJc8h9d Kc7dTc4d Js9s8c7c Th5d4cAs"));
  }

  @Test
  public void test_omaha_holdem_4561_5s6h9hAcKh_7cJdQh4h_TsJs2cAh_KsAsTh4d_2dQcJh5d_KdAd3c8s_3s5c3d4c_6c9d7d8d() {
    assertEquals(
      "3s5c3d4c 2dQcJh5d TsJs2cAh KdAd3c8s=KsAsTh4d 6c9d7d8d 7cJdQh4h",
      Solver.process("omaha-holdem 5s6h9hAcKh 7cJdQh4h TsJs2cAh KsAsTh4d 2dQcJh5d KdAd3c8s 3s5c3d4c 6c9d7d8d"));
  }

  @Test
  public void test_omaha_holdem_4562_5h8dAcAsTs_Jh6sQs5d_2hTc4d9s() {
    assertEquals(
      "Jh6sQs5d 2hTc4d9s",
      Solver.process("omaha-holdem 5h8dAcAsTs Jh6sQs5d 2hTc4d9s"));
  }

  @Test
  public void test_omaha_holdem_4563_5c7d8h9cQd_4sTdJs2d_9s6c4cAc_Ks2sAd5h_4d2h3cTh_JdJhKc6d_3dKh8dAh_7s6h4hKd_8s3h5s8c() {
    assertEquals(
      "4d2h3cTh Ks2sAd5h 3dKh8dAh JdJhKc6d 8s3h5s8c 7s6h4hKd=9s6c4cAc 4sTdJs2d",
      Solver.process("omaha-holdem 5c7d8h9cQd 4sTdJs2d 9s6c4cAc Ks2sAd5h 4d2h3cTh JdJhKc6d 3dKh8dAh 7s6h4hKd 8s3h5s8c"));
  }

  @Test
  public void test_omaha_holdem_4564_3h9sAhQcTh_2d5d5sQs_Qd3dKd8c_4h6sJs5c_9d4cJh2h_Tc9c6h4s_2s8sKs7d() {
    assertEquals(
      "4h6sJs5c 2s8sKs7d 2d5d5sQs Tc9c6h4s Qd3dKd8c 9d4cJh2h",
      Solver.process("omaha-holdem 3h9sAhQcTh 2d5d5sQs Qd3dKd8c 4h6sJs5c 9d4cJh2h Tc9c6h4s 2s8sKs7d"));
  }

  @Test
  public void test_omaha_holdem_4565_3h7h9c9hTd_3sTh7c7s_5s2s5cAh_4c8c6h8d_2c9s4d9d_KcQhTcAs_Js5d5hQc_3dKhAcJd_Ad6c8s6s() {
    assertEquals(
      "3dKhAcJd 5s2s5cAh=Js5d5hQc KcQhTcAs 4c8c6h8d=Ad6c8s6s 3sTh7c7s 2c9s4d9d",
      Solver.process("omaha-holdem 3h7h9c9hTd 3sTh7c7s 5s2s5cAh 4c8c6h8d 2c9s4d9d KcQhTcAs Js5d5hQc 3dKhAcJd Ad6c8s6s"));
  }

  @Test
  public void test_omaha_holdem_4566_6s7c8cKdTh_As5c9dAh_Kc2s5sKh_5h4s8hQc_JhKs5d3c_3d7dTs9s_Jc4hAd4d() {
    assertEquals(
      "Jc4hAd4d JhKs5d3c Kc2s5sKh 5h4s8hQc As5c9dAh 3d7dTs9s",
      Solver.process("omaha-holdem 6s7c8cKdTh As5c9dAh Kc2s5sKh 5h4s8hQc JhKs5d3c 3d7dTs9s Jc4hAd4d"));
  }

  @Test
  public void test_omaha_holdem_4567_2c4sAsJhQs_KhJc4h5s_8s9sKs2d_Js7d2s8c_5c3c9dQc_7cKcAc8d_6dTd6cJd_6s3dKdAd_QhTc7h9c() {
    assertEquals(
      "6dTd6cJd QhTc7h9c 6s3dKdAd=7cKcAc8d KhJc4h5s 5c3c9dQc Js7d2s8c 8s9sKs2d",
      Solver.process("omaha-holdem 2c4sAsJhQs KhJc4h5s 8s9sKs2d Js7d2s8c 5c3c9dQc 7cKcAc8d 6dTd6cJd 6s3dKdAd QhTc7h9c"));
  }

  @Test
  public void test_omaha_holdem_4568_3h6h7hQdTs_5s9cKdQs_QcTh4d8s_JsJd2cJc_AhKs3d9h_TdQh7s9s_4cAd4s7d_4h6cAs8c_6s8d8h3c() {
    assertEquals(
      "4h6cAs8c 4cAd4s7d JsJd2cJc 5s9cKdQs 6s8d8h3c QcTh4d8s=TdQh7s9s AhKs3d9h",
      Solver.process("omaha-holdem 3h6h7hQdTs 5s9cKdQs QcTh4d8s JsJd2cJc AhKs3d9h TdQh7s9s 4cAd4s7d 4h6cAs8c 6s8d8h3c"));
  }

  @Test
  public void test_omaha_holdem_4569_2c7c8h9hTs_Ac4c8c3c_6c3d3s6h_2sJh9s9d_6sQh4s7d_9cKcJdQc_8dTh6dKd_Ks5c8sJc_QsAd7hTc_5h5dTdKh() {
    assertEquals(
      "6c3d3s6h Ac4c8c3c 5h5dTdKh QsAd7hTc 6sQh4s7d=8dTh6dKd 2sJh9s9d=Ks5c8sJc 9cKcJdQc",
      Solver.process("omaha-holdem 2c7c8h9hTs Ac4c8c3c 6c3d3s6h 2sJh9s9d 6sQh4s7d 9cKcJdQc 8dTh6dKd Ks5c8sJc QsAd7hTc 5h5dTdKh"));
  }

  @Test
  public void test_omaha_holdem_4570_2c3h4s6cKs_AdTc8d4c_Ac8c3d7s_Js8sThTd_6d3cTs6h_3s9sAs7c_Qd7d9c4d() {
    assertEquals(
      "3s9sAs7c=Ac8c3d7s Qd7d9c4d AdTc8d4c Js8sThTd 6d3cTs6h",
      Solver.process("omaha-holdem 2c3h4s6cKs AdTc8d4c Ac8c3d7s Js8sThTd 6d3cTs6h 3s9sAs7c Qd7d9c4d"));
  }

  @Test
  public void test_omaha_holdem_4571_3d4h8c8sKc_JdTd5sQd_9sAc4c7h_Qh7dKs9c_5hKh3s7s_6c8hAhJc_8d2c3h4d_6s6dAd5d_2hTs9dTc_Th5cKdAs() {
    assertEquals(
      "JdTd5sQd 9sAc4c7h 6s6dAd5d 2hTs9dTc 5hKh3s7s Qh7dKs9c Th5cKdAs 6c8hAhJc 8d2c3h4d",
      Solver.process("omaha-holdem 3d4h8c8sKc JdTd5sQd 9sAc4c7h Qh7dKs9c 5hKh3s7s 6c8hAhJc 8d2c3h4d 6s6dAd5d 2hTs9dTc Th5cKdAs"));
  }

  @Test
  public void test_omaha_holdem_4572_2d2s3h4d9s_KdQcAdJs_4c7h2h3d_AcTdAh9d_Qs8d4s5s_7cKcAs8h_Jc2c7dJd_6c8c3s6s_Qd3c5cQh_5dJhTcKs() {
    assertEquals(
      "5dJhTcKs 7cKcAs8h=KdQcAdJs Qs8d4s5s 6c8c3s6s Qd3c5cQh AcTdAh9d Jc2c7dJd 4c7h2h3d",
      Solver.process("omaha-holdem 2d2s3h4d9s KdQcAdJs 4c7h2h3d AcTdAh9d Qs8d4s5s 7cKcAs8h Jc2c7dJd 6c8c3s6s Qd3c5cQh 5dJhTcKs"));
  }

  @Test
  public void test_omaha_holdem_4573_3h4hJsQcTd_8d3d3cTc_8hKh6d2h_Qs7d9c8s_9sAhQh2s_8c2d9hTh() {
    assertEquals(
      "8hKh6d2h 9sAhQh2s 8d3d3cTc 8c2d9hTh=Qs7d9c8s",
      Solver.process("omaha-holdem 3h4hJsQcTd 8d3d3cTc 8hKh6d2h Qs7d9c8s 9sAhQh2s 8c2d9hTh"));
  }

  @Test
  public void test_omaha_holdem_4574_4d6c8sQhTh_4h9d5s8h_9hAc7hQs_4sQdJc8d_3hAhKs2s_5cJd6s2c_7c7dKc2h() {
    assertEquals(
      "3hAhKs2s 5cJd6s2c 7c7dKc2h 4h9d5s8h 4sQdJc8d 9hAc7hQs",
      Solver.process("omaha-holdem 4d6c8sQhTh 4h9d5s8h 9hAc7hQs 4sQdJc8d 3hAhKs2s 5cJd6s2c 7c7dKc2h"));
  }

  @Test
  public void test_omaha_holdem_4575_4s7c8dQhTs_3dJs3cJh_Qs5c5dQc_4dTd7d2h_4cThJc2c_6d9hTc2s_3s3h7s7h_2dAsAc8c() {
    assertEquals(
      "3dJs3cJh 2dAsAc8c 4cThJc2c 4dTd7d2h 3s3h7s7h Qs5c5dQc 6d9hTc2s",
      Solver.process("omaha-holdem 4s7c8dQhTs 3dJs3cJh Qs5c5dQc 4dTd7d2h 4cThJc2c 6d9hTc2s 3s3h7s7h 2dAsAc8c"));
  }

  @Test
  public void test_omaha_holdem_4576_3c4dAhJcTh_9c6s2cAd_5d3s5sTs_7h9s2s5h_Td4cKsKh() {
    assertEquals(
      "9c6s2cAd 5d3s5sTs Td4cKsKh 7h9s2s5h",
      Solver.process("omaha-holdem 3c4dAhJcTh 9c6s2cAd 5d3s5sTs 7h9s2s5h Td4cKsKh"));
  }

  @Test
  public void test_omaha_holdem_4577_4h5h9hAcQc_2hKdTdKh_Th7dAh3c() {
    assertEquals(
      "2hKdTdKh Th7dAh3c",
      Solver.process("omaha-holdem 4h5h9hAcQc 2hKdTdKh Th7dAh3c"));
  }

  @Test
  public void test_omaha_holdem_4578_4d6s7c7h8c_Kh9dKd8d_QsQh9cJc_9h3hJs8h() {
    assertEquals(
      "9h3hJs8h QsQh9cJc Kh9dKd8d",
      Solver.process("omaha-holdem 4d6s7c7h8c Kh9dKd8d QsQh9cJc 9h3hJs8h"));
  }

  @Test
  public void test_omaha_holdem_4579_6c8dKcKhQd_8hTc2dTh_4sAs9h8c_9sJs5h4d_3sQs6s7h_AdJd5d6h() {
    assertEquals(
      "9sJs5h4d AdJd5d6h 4sAs9h8c 8hTc2dTh 3sQs6s7h",
      Solver.process("omaha-holdem 6c8dKcKhQd 8hTc2dTh 4sAs9h8c 9sJs5h4d 3sQs6s7h AdJd5d6h"));
  }

  @Test
  public void test_omaha_holdem_4580_5s8h9c9hJd_Th9s5c4s_JhKh7cAh_2s4d7h7d_QcAsKc8d() {
    assertEquals(
      "2s4d7h7d QcAsKc8d JhKh7cAh Th9s5c4s",
      Solver.process("omaha-holdem 5s8h9c9hJd Th9s5c4s JhKh7cAh 2s4d7h7d QcAsKc8d"));
  }

  @Test
  public void test_omaha_holdem_4581_6c7s9dAdJc_9s4cQhTd_8c7d7hQd_3h4sJd3d() {
    assertEquals(
      "9s4cQhTd 3h4sJd3d 8c7d7hQd",
      Solver.process("omaha-holdem 6c7s9dAdJc 9s4cQhTd 8c7d7hQd 3h4sJd3d"));
  }

  @Test
  public void test_omaha_holdem_4582_2h3c7c7dTc_Qc5h9sAd_Kc5sQd6s() {
    assertEquals(
      "Kc5sQd6s Qc5h9sAd",
      Solver.process("omaha-holdem 2h3c7c7dTc Qc5h9sAd Kc5sQd6s"));
  }

  @Test
  public void test_omaha_holdem_4583_6s8hAdKcTc_TsKs2d8d_7s8sQdJh_JdJcQs4h_7c6h5h9h_6c9d4sJs_2sTdKd9s() {
    assertEquals(
      "6c9d4sJs 2sTdKd9s=TsKs2d8d 7c6h5h9h 7s8sQdJh=JdJcQs4h",
      Solver.process("omaha-holdem 6s8hAdKcTc TsKs2d8d 7s8sQdJh JdJcQs4h 7c6h5h9h 6c9d4sJs 2sTdKd9s"));
  }

  @Test
  public void test_omaha_holdem_4584_3h7dAhJdQd_7c2c9dJc_7h2hTd4s_6d5h5dKh_3d6sThQh_2dKc7s5s() {
    assertEquals(
      "7h2hTd4s 2dKc7s5s 7c2c9dJc 3d6sThQh 6d5h5dKh",
      Solver.process("omaha-holdem 3h7dAhJdQd 7c2c9dJc 7h2hTd4s 6d5h5dKh 3d6sThQh 2dKc7s5s"));
  }

  @Test
  public void test_omaha_holdem_4585_4h6s7c9cTs_AhQcKs9h_9dThQs3s_3c8d5dKd_As7s3h2d_7h5s4s6d_6c8c9s6h_JcAcKhTc_Qh7d5c8h() {
    assertEquals(
      "As7s3h2d AhQcKs9h JcAcKhTc 7h5s4s6d 9dThQs3s 3c8d5dKd 6c8c9s6h=Qh7d5c8h",
      Solver.process("omaha-holdem 4h6s7c9cTs AhQcKs9h 9dThQs3s 3c8d5dKd As7s3h2d 7h5s4s6d 6c8c9s6h JcAcKhTc Qh7d5c8h"));
  }

  @Test
  public void test_omaha_holdem_4586_5c5dJcJsKd_TsJd2cKc_AsAh8s6h_7dKs3d2d_6dTd3h9d_3cThJh6c_4sQcKhQd_7h4cQh8h() {
    assertEquals(
      "6dTd3h9d 7h4cQh8h 7dKs3d2d 4sQcKhQd AsAh8s6h 3cThJh6c TsJd2cKc",
      Solver.process("omaha-holdem 5c5dJcJsKd TsJd2cKc AsAh8s6h 7dKs3d2d 6dTd3h9d 3cThJh6c 4sQcKhQd 7h4cQh8h"));
  }

  @Test
  public void test_omaha_holdem_4587_4h6hKdKhTd_Th7h8cQs_3hJh3s5h_9cAc8s2h_TcAs7sKs_5s9hQh6d() {
    assertEquals(
      "9cAc8s2h Th7h8cQs 3hJh3s5h 5s9hQh6d TcAs7sKs",
      Solver.process("omaha-holdem 4h6hKdKhTd Th7h8cQs 3hJh3s5h 9cAc8s2h TcAs7sKs 5s9hQh6d"));
  }

  @Test
  public void test_omaha_holdem_4588_2d3c5sAcAd_Ts4d3h5d_2h9c7c2s_7sJdTc9s_4hQsThJs_KsAhKh7h_QdQcKd4c_6c4s3s8h_8c5h8d6s_6hAs9h3d() {
    assertEquals(
      "7sJdTc9s 4hQsThJs 8c5h8d6s QdQcKd4c KsAhKh7h Ts4d3h5d 6c4s3s8h 2h9c7c2s 6hAs9h3d",
      Solver.process("omaha-holdem 2d3c5sAcAd Ts4d3h5d 2h9c7c2s 7sJdTc9s 4hQsThJs KsAhKh7h QdQcKd4c 6c4s3s8h 8c5h8d6s 6hAs9h3d"));
  }

  @Test
  public void test_omaha_holdem_4589_2h3s8c9sAs_TcTh7s5h_Ac9c5c8d() {
    assertEquals(
      "TcTh7s5h Ac9c5c8d",
      Solver.process("omaha-holdem 2h3s8c9sAs TcTh7s5h Ac9c5c8d"));
  }

  @Test
  public void test_omaha_holdem_4590_2c2s6hJhQc_JdTh7s5c_4d9dKs4s_Jc8s5sJs() {
    assertEquals(
      "4d9dKs4s JdTh7s5c Jc8s5sJs",
      Solver.process("omaha-holdem 2c2s6hJhQc JdTh7s5c 4d9dKs4s Jc8s5sJs"));
  }

  @Test
  public void test_omaha_holdem_4591_3h5h7cKsTc_3cAsAh9h_TsJd4d9c_4c6c5sAc_7d8d8hKc_Js8cQhTh_4s6hAdTd() {
    assertEquals(
      "TsJd4d9c Js8cQhTh 3cAsAh9h 7d8d8hKc 4c6c5sAc=4s6hAdTd",
      Solver.process("omaha-holdem 3h5h7cKsTc 3cAsAh9h TsJd4d9c 4c6c5sAc 7d8d8hKc Js8cQhTh 4s6hAdTd"));
  }

  @Test
  public void test_omaha_holdem_4592_2c3c8s9sJh_7sAs2h9h_5dTd8h3s_JdKsKd7h() {
    assertEquals(
      "JdKsKd7h 5dTd8h3s 7sAs2h9h",
      Solver.process("omaha-holdem 2c3c8s9sJh 7sAs2h9h 5dTd8h3s JdKsKd7h"));
  }

  @Test
  public void test_omaha_holdem_4593_2h6d8c9hJs_6s7c3hKc_8s4d8h5h_Kd2cAc5s_2d7s9dQs_TdJhAd3d_9c9sKh3c_AhJdJcTs_ThQdQhQc_5d7d2sAs() {
    assertEquals(
      "Kd2cAc5s 6s7c3hKc TdJhAd3d 2d7s9dQs 8s4d8h5h 9c9sKh3c AhJdJcTs 5d7d2sAs ThQdQhQc",
      Solver.process("omaha-holdem 2h6d8c9hJs 6s7c3hKc 8s4d8h5h Kd2cAc5s 2d7s9dQs TdJhAd3d 9c9sKh3c AhJdJcTs ThQdQhQc 5d7d2sAs"));
  }

  @Test
  public void test_omaha_holdem_4594_5c6c6h8hKd_5s9dTc5d_Jd8sJc3s_8cJhAh9c() {
    assertEquals(
      "8cJhAh9c Jd8sJc3s 5s9dTc5d",
      Solver.process("omaha-holdem 5c6c6h8hKd 5s9dTc5d Jd8sJc3s 8cJhAh9c"));
  }

  @Test
  public void test_omaha_holdem_4595_3c5c5sAhQs_3h3sQcTd_3d6c8sKs_6s7d9sAc_Jc2dKc2c_9d6h5h4d_7s2sQdKh_6d9c8cTh_4s4c4hQh_Jh8hKdTs() {
    assertEquals(
      "6d9c8cTh Jh8hKdTs Jc2dKc2c 3d6c8sKs 4s4c4hQh 7s2sQdKh 6s7d9sAc 9d6h5h4d 3h3sQcTd",
      Solver.process("omaha-holdem 3c5c5sAhQs 3h3sQcTd 3d6c8sKs 6s7d9sAc Jc2dKc2c 9d6h5h4d 7s2sQdKh 6d9c8cTh 4s4c4hQh Jh8hKdTs"));
  }

  @Test
  public void test_omaha_holdem_4596_6c6d6s7hJc_Tc2s7cAd_3cKh9h5h_JsTh8dTs_4d5cQhAh_Kd9s6h9c() {
    assertEquals(
      "3cKh9h5h Tc2s7cAd 4d5cQhAh JsTh8dTs Kd9s6h9c",
      Solver.process("omaha-holdem 6c6d6s7hJc Tc2s7cAd 3cKh9h5h JsTh8dTs 4d5cQhAh Kd9s6h9c"));
  }

  @Test
  public void test_omaha_holdem_4597_5d5s6dThTs_Kc7dQs7c_Js5cKs3c_Ac2s3sKh_5hQd6hJc_Jh8s4c8h_2h2c9h8d_6sTcTdQc_3d7hAdJd() {
    assertEquals(
      "3d7hAdJd Ac2s3sKh 2h2c9h8d Kc7dQs7c Jh8s4c8h Js5cKs3c 5hQd6hJc 6sTcTdQc",
      Solver.process("omaha-holdem 5d5s6dThTs Kc7dQs7c Js5cKs3c Ac2s3sKh 5hQd6hJc Jh8s4c8h 2h2c9h8d 6sTcTdQc 3d7hAdJd"));
  }

  @Test
  public void test_omaha_holdem_4598_4s6d8hJsTd_7s4cQh5h_8s2sQd7h() {
    assertEquals(
      "8s2sQd7h 7s4cQh5h",
      Solver.process("omaha-holdem 4s6d8hJsTd 7s4cQh5h 8s2sQd7h"));
  }

  @Test
  public void test_omaha_holdem_4599_4s6hAcKhTs_6d2s3cJh_3s9d6sTh_9h5hQcJc_3d4h2c6c_3h4c7h7d_TdKd5c8c() {
    assertEquals(
      "6d2s3cJh 3h4c7h7d 3d4h2c6c 3s9d6sTh TdKd5c8c 9h5hQcJc",
      Solver.process("omaha-holdem 4s6hAcKhTs 6d2s3cJh 3s9d6sTh 9h5hQcJc 3d4h2c6c 3h4c7h7d TdKd5c8c"));
  }

  @Test
  public void test_omaha_holdem_4600_2h6h9cQsTs_8sQc3c9s_6dTcQdJc_6s2s4sJs_AhKhAsTh() {
    assertEquals(
      "AhKhAsTh 6s2s4sJs 8sQc3c9s 6dTcQdJc",
      Solver.process("omaha-holdem 2h6h9cQsTs 8sQc3c9s 6dTcQdJc 6s2s4sJs AhKhAsTh"));
  }

  @Test
  public void test_omaha_holdem_4601_6s7s8hQdTd_Th9s2d3s_Tc5d8cAc_2cTs9h6c_Ks6h4s8s_7c5s4d3d_3h4c5cAh_AdQsKc9d() {
    assertEquals(
      "AdQsKc9d Ks6h4s8s Tc5d8cAc 3h4c5cAh=7c5s4d3d 2cTs9h6c=Th9s2d3s",
      Solver.process("omaha-holdem 6s7s8hQdTd Th9s2d3s Tc5d8cAc 2cTs9h6c Ks6h4s8s 7c5s4d3d 3h4c5cAh AdQsKc9d"));
  }

  @Test
  public void test_omaha_holdem_4602_2h4cAcAdKd_Ks2s6cTs_4s5c3s2d_Qd7c9dJs_8cJdQh5s_9s6hAh5d_5h3d4d7h_8d8hKc4h_6s3c9h7d_KhTc9cQs() {
    assertEquals(
      "6s3c9h7d 8cJdQh5s=Qd7c9dJs 8d8hKc4h Ks2s6cTs KhTc9cQs 9s6hAh5d 4s5c3s2d=5h3d4d7h",
      Solver.process("omaha-holdem 2h4cAcAdKd Ks2s6cTs 4s5c3s2d Qd7c9dJs 8cJdQh5s 9s6hAh5d 5h3d4d7h 8d8hKc4h 6s3c9h7d KhTc9cQs"));
  }

  @Test
  public void test_omaha_holdem_4603_2sAhKcKsTc_Ts6dTh7d_2d3hKd4h() {
    assertEquals(
      "Ts6dTh7d 2d3hKd4h",
      Solver.process("omaha-holdem 2sAhKcKsTc Ts6dTh7d 2d3hKd4h"));
  }

  @Test
  public void test_omaha_holdem_4604_5s6cAsQdTc_4dTsTh2s_9c6sKs5c_6d9sQhQs_7d5h4c3d_6hQc2dKh_TdAd7cAc() {
    assertEquals(
      "7d5h4c3d 9c6sKs5c 6hQc2dKh 4dTsTh2s 6d9sQhQs TdAd7cAc",
      Solver.process("omaha-holdem 5s6cAsQdTc 4dTsTh2s 9c6sKs5c 6d9sQhQs 7d5h4c3d 6hQc2dKh TdAd7cAc"));
  }

  @Test
  public void test_omaha_holdem_4605_5cJdKsQhTd_TsAdAs4d_2d9d6h5d_Qs3sAhJh_3h7h7sAc_7d2s3d4s_QcJc9s9h_7c2h5h8d_6s8sTcKh() {
    assertEquals(
      "7d2s3d4s 7c2h5h8d 2d9d6h5d 3h7h7sAc 6s8sTcKh QcJc9s9h Qs3sAhJh=TsAdAs4d",
      Solver.process("omaha-holdem 5cJdKsQhTd TsAdAs4d 2d9d6h5d Qs3sAhJh 3h7h7sAc 7d2s3d4s QcJc9s9h 7c2h5h8d 6s8sTcKh"));
  }

  @Test
  public void test_omaha_holdem_4606_7cAdJhKhTd_2c4dQc9h_5d4c5cQd_KsAsTsKd_JsTh2h6d() {
    assertEquals(
      "5d4c5cQd JsTh2h6d KsAsTsKd 2c4dQc9h",
      Solver.process("omaha-holdem 7cAdJhKhTd 2c4dQc9h 5d4c5cQd KsAsTsKd JsTh2h6d"));
  }

  @Test
  public void test_omaha_holdem_4607_3s4s5d9cJd_7sKcTd2s_5sThJc6s_Qs9dQd3d_6cAc6dJs_As7d2hTc_7c7hKs8c() {
    assertEquals(
      "7sKcTd2s 7c7hKs8c 6cAc6dJs Qs9dQd3d 5sThJc6s As7d2hTc",
      Solver.process("omaha-holdem 3s4s5d9cJd 7sKcTd2s 5sThJc6s Qs9dQd3d 6cAc6dJs As7d2hTc 7c7hKs8c"));
  }

  @Test
  public void test_omaha_holdem_4608_7h9hAhJsKh_Ad8s3c6c_7dTc4c2h() {
    assertEquals(
      "7dTc4c2h Ad8s3c6c",
      Solver.process("omaha-holdem 7h9hAhJsKh Ad8s3c6c 7dTc4c2h"));
  }

  @Test
  public void test_omaha_holdem_4609_2d3h7cAdJc_6cJd3d7d_Tc4h9s8h_Qh6dTh5s_QsAh4c6s_Qc7s5h2c_8sKh3cJs() {
    assertEquals(
      "Tc4h9s8h Qh6dTh5s QsAh4c6s Qc7s5h2c 8sKh3cJs 6cJd3d7d",
      Solver.process("omaha-holdem 2d3h7cAdJc 6cJd3d7d Tc4h9s8h Qh6dTh5s QsAh4c6s Qc7s5h2c 8sKh3cJs"));
  }

  @Test
  public void test_omaha_holdem_4610_7h9dAdAhTc_4cQcJh2d_2c3cAc7c_Jd9c5sQd() {
    assertEquals(
      "4cQcJh2d Jd9c5sQd 2c3cAc7c",
      Solver.process("omaha-holdem 7h9dAdAhTc 4cQcJh2d 2c3cAc7c Jd9c5sQd"));
  }

  @Test
  public void test_omaha_holdem_4611_3c3d9hQdTc_Jh2c9c4s_7c5s8c5c_Jc7h3h6d() {
    assertEquals(
      "7c5s8c5c Jh2c9c4s Jc7h3h6d",
      Solver.process("omaha-holdem 3c3d9hQdTc Jh2c9c4s 7c5s8c5c Jc7h3h6d"));
  }

  @Test
  public void test_omaha_holdem_4612_4s6dJhKsTc_4d8sJdTd_Qs2d2c8h_Th9s9h7d() {
    assertEquals(
      "Qs2d2c8h Th9s9h7d 4d8sJdTd",
      Solver.process("omaha-holdem 4s6dJhKsTc 4d8sJdTd Qs2d2c8h Th9s9h7d"));
  }

  @Test
  public void test_omaha_holdem_4613_4d6d7hAdQs_3s3d5c8h_2h9sJsTd_2dAc4s4h_ThJd3h8s_6h2c9c2s_7d9h5d7s_AhKhTs6s() {
    assertEquals(
      "2h9sJsTd=ThJd3h8s 6h2c9c2s AhKhTs6s 2dAc4s4h 3s3d5c8h 7d9h5d7s",
      Solver.process("omaha-holdem 4d6d7hAdQs 3s3d5c8h 2h9sJsTd 2dAc4s4h ThJd3h8s 6h2c9c2s 7d9h5d7s AhKhTs6s"));
  }

  @Test
  public void test_omaha_holdem_4614_4d5cQdQhTd_2s4cKhJd_Jh6cTc8s_JsKs7h7s_5h3dQs4s_Ad4hAsJc_Ts9cKcAc_9d2c5sQc_6s3h9s9h_3c6dAh8h() {
    assertEquals(
      "3c6dAh8h 2s4cKhJd JsKs7h7s 6s3h9s9h Jh6cTc8s Ts9cKcAc Ad4hAsJc 5h3dQs4s=9d2c5sQc",
      Solver.process("omaha-holdem 4d5cQdQhTd 2s4cKhJd Jh6cTc8s JsKs7h7s 5h3dQs4s Ad4hAsJc Ts9cKcAc 9d2c5sQc 6s3h9s9h 3c6dAh8h"));
  }

  @Test
  public void test_omaha_holdem_4615_2sAdAsKcQh_AhKh8dTs_5sThJd8c_3cQs2hAc_KsQd7h8s_6d4sJh6s_9d6h3h5d_JcKdTd8h_5c3dTc4c() {
    assertEquals(
      "9d6h3h5d 5c3dTc4c 6d4sJh6s KsQd7h8s 5sThJd8c=JcKdTd8h 3cQs2hAc AhKh8dTs",
      Solver.process("omaha-holdem 2sAdAsKcQh AhKh8dTs 5sThJd8c 3cQs2hAc KsQd7h8s 6d4sJh6s 9d6h3h5d JcKdTd8h 5c3dTc4c"));
  }

  @Test
  public void test_omaha_holdem_4616_4s5s9cAdJd_7s3d3c8s_Kh5c9h4d_Tc4h9s8c_Qh2c6hQd_2sAsJh3h() {
    assertEquals(
      "7s3d3c8s Qh2c6hQd Tc4h9s8c Kh5c9h4d 2sAsJh3h",
      Solver.process("omaha-holdem 4s5s9cAdJd 7s3d3c8s Kh5c9h4d Tc4h9s8c Qh2c6hQd 2sAsJh3h"));
  }

  @Test
  public void test_omaha_holdem_4617_8s9sAsJhKs_Jc3s4sQh_7c5s2s7s_AhKd7h3d_Qs6d5hTh_Tc8cJd5d_3c9d3h4h_Kc2cKh8h_5c6hAdQd_Qc6c2d9c() {
    assertEquals(
      "3c9d3h4h Qc6c2d9c 5c6hAdQd Tc8cJd5d AhKd7h3d Kc2cKh8h Qs6d5hTh Jc3s4sQh 7c5s2s7s",
      Solver.process("omaha-holdem 8s9sAsJhKs Jc3s4sQh 7c5s2s7s AhKd7h3d Qs6d5hTh Tc8cJd5d 3c9d3h4h Kc2cKh8h 5c6hAdQd Qc6c2d9c"));
  }

  @Test
  public void test_omaha_holdem_4618_2c3h6sJdTc_8d6d9sKc_2s5sJs6c_4d2d8hQs_4h7h5hAd_Td8cQc5d() {
    assertEquals(
      "4d2d8hQs 8d6d9sKc Td8cQc5d 2s5sJs6c 4h7h5hAd",
      Solver.process("omaha-holdem 2c3h6sJdTc 8d6d9sKc 2s5sJs6c 4d2d8hQs 4h7h5hAd Td8cQc5d"));
  }

  @Test
  public void test_omaha_holdem_4619_2d5h6sKcQd_TcQc3s8h_4dJc6hKh_3d4c7hAc() {
    assertEquals(
      "TcQc3s8h 4dJc6hKh 3d4c7hAc",
      Solver.process("omaha-holdem 2d5h6sKcQd TcQc3s8h 4dJc6hKh 3d4c7hAc"));
  }

  @Test
  public void test_omaha_holdem_4620_2s6cKdQcTs_3c4c5d7h_3h8sAcJs_JdAsJcKs_9c8dAd2d() {
    assertEquals(
      "3c4c5d7h 9c8dAd2d 3h8sAcJs=JdAsJcKs",
      Solver.process("omaha-holdem 2s6cKdQcTs 3c4c5d7h 3h8sAcJs JdAsJcKs 9c8dAd2d"));
  }

  @Test
  public void test_omaha_holdem_4621_2h5cKcKhKs_8cTcQhTh_Ad6cQs5d_7h3cKd3h_2d6s8d9h_Jh3dQc8s_4cAc2c4s_6hQd5h7c_3s9dJdTd_9sJc2s6d() {
    assertEquals(
      "2d6s8d9h 9sJc2s6d 3s9dJdTd 6hQd5h7c Jh3dQc8s Ad6cQs5d 4cAc2c4s 8cTcQhTh 7h3cKd3h",
      Solver.process("omaha-holdem 2h5cKcKhKs 8cTcQhTh Ad6cQs5d 7h3cKd3h 2d6s8d9h Jh3dQc8s 4cAc2c4s 6hQd5h7c 3s9dJdTd 9sJc2s6d"));
  }

  @Test
  public void test_omaha_holdem_4622_5cJhQcQhQs_Jc9sKs7c_8h6hAhAc_6cKcJs8s_3dQd6d3h_Kd2s4cTs_8c2d3s6s_5dTc3c9d_As7d9cJd_Td2cAd4h() {
    assertEquals(
      "8c2d3s6s 5dTc3c9d Kd2s4cTs 6cKcJs8s=Jc9sKs7c Td2cAd4h As7d9cJd 8h6hAhAc 3dQd6d3h",
      Solver.process("omaha-holdem 5cJhQcQhQs Jc9sKs7c 8h6hAhAc 6cKcJs8s 3dQd6d3h Kd2s4cTs 8c2d3s6s 5dTc3c9d As7d9cJd Td2cAd4h"));
  }

  @Test
  public void test_omaha_holdem_4623_2s3h8sAsKh_4s4c7cQs_7h8cTsKd() {
    assertEquals(
      "7h8cTsKd 4s4c7cQs",
      Solver.process("omaha-holdem 2s3h8sAsKh 4s4c7cQs 7h8cTsKd"));
  }

  @Test
  public void test_omaha_holdem_4624_2c6dJdKcTd_Ac4c8c9d_TcQd3s4s_7d2h5c2s_6sJs4d7s_QhTsJh7c_2dKh3h8h_5sQc9s8d_8sAs6c5d() {
    assertEquals(
      "Ac4c8c9d 8sAs6c5d TcQd3s4s 6sJs4d7s QhTsJh7c 2dKh3h8h 7d2h5c2s 5sQc9s8d",
      Solver.process("omaha-holdem 2c6dJdKcTd Ac4c8c9d TcQd3s4s 7d2h5c2s 6sJs4d7s QhTsJh7c 2dKh3h8h 5sQc9s8d 8sAs6c5d"));
  }

  @Test
  public void test_omaha_holdem_4625_3d5s7d9sTs_9h4d6d3c_8dKsKd5d_AhQc7sAd_5c8sTc7h_QhThKc4c() {
    assertEquals(
      "QhThKc4c 8dKsKd5d AhQc7sAd 5c8sTc7h 9h4d6d3c",
      Solver.process("omaha-holdem 3d5s7d9sTs 9h4d6d3c 8dKsKd5d AhQc7sAd 5c8sTc7h QhThKc4c"));
  }

  @Test
  public void test_omaha_holdem_4626_4h5d7d9hJd_8hJh5s3c_9cQc6c3d_5h2hKsAs_Ts8s7cKh_Ah3sJc6h() {
    assertEquals(
      "5h2hKsAs 8hJh5s3c 9cQc6c3d=Ah3sJc6h Ts8s7cKh",
      Solver.process("omaha-holdem 4h5d7d9hJd 8hJh5s3c 9cQc6c3d 5h2hKsAs Ts8s7cKh Ah3sJc6h"));
  }

  @Test
  public void test_omaha_holdem_4627_2h4dJhKsQd_3h7s5hTs_Qh4hKc9d_Jc6c7cKh() {
    assertEquals(
      "3h7s5hTs Jc6c7cKh Qh4hKc9d",
      Solver.process("omaha-holdem 2h4dJhKsQd 3h7s5hTs Qh4hKc9d Jc6c7cKh"));
  }

  @Test
  public void test_omaha_holdem_4628_4h8s9hKdQh_8d7h2d2c_Kh8h6c6s_3c4dKc5s_Td6dJc5d_Qd5c3dQc() {
    assertEquals(
      "8d7h2d2c 3c4dKc5s Qd5c3dQc Td6dJc5d Kh8h6c6s",
      Solver.process("omaha-holdem 4h8s9hKdQh 8d7h2d2c Kh8h6c6s 3c4dKc5s Td6dJc5d Qd5c3dQc"));
  }

  @Test
  public void test_omaha_holdem_4629_4h7h8hAsKd_4d6s2sKc_2hTcTs3c_Jd5d5h2d_9dAc4cJs_6cTd8s3h_Qc7d4s9h() {
    assertEquals(
      "Jd5d5h2d 6cTd8s3h 2hTcTs3c Qc7d4s9h 4d6s2sKc 9dAc4cJs",
      Solver.process("omaha-holdem 4h7h8hAsKd 4d6s2sKc 2hTcTs3c Jd5d5h2d 9dAc4cJs 6cTd8s3h Qc7d4s9h"));
  }

  @Test
  public void test_omaha_holdem_4630_8s9sAhJcTh_5d9h4hJs_Td7cKh3d_3h6h9d8c_5sJhAs3s_Ks4d4c9c() {
    assertEquals(
      "Ks4d4c9c 3h6h9d8c 5d9h4hJs 5sJhAs3s Td7cKh3d",
      Solver.process("omaha-holdem 8s9sAhJcTh 5d9h4hJs Td7cKh3d 3h6h9d8c 5sJhAs3s Ks4d4c9c"));
  }

  @Test
  public void test_omaha_holdem_4631_3d3h4s5sAd_As4dAcKs_5cAh9c3s_TsJc9d7s_Js6h6d3c_Kh8c2s2d_2hJhQd5h() {
    assertEquals(
      "TsJc9d7s Kh8c2s2d Js6h6d3c 2hJhQd5h 5cAh9c3s As4dAcKs",
      Solver.process("omaha-holdem 3d3h4s5sAd As4dAcKs 5cAh9c3s TsJc9d7s Js6h6d3c Kh8c2s2d 2hJhQd5h"));
  }

  @Test
  public void test_omaha_holdem_4632_4s5d8sJcJd_3cAs7s6d_Qc4dKhQh() {
    assertEquals(
      "Qc4dKhQh 3cAs7s6d",
      Solver.process("omaha-holdem 4s5d8sJcJd 3cAs7s6d Qc4dKhQh"));
  }

  @Test
  public void test_omaha_holdem_4633_2c3d4h8hJs_5hQd8cQh_Jh3s8d2d_Ah3cAdJc() {
    assertEquals(
      "5hQd8cQh Ah3cAdJc Jh3s8d2d",
      Solver.process("omaha-holdem 2c3d4h8hJs 5hQd8cQh Jh3s8d2d Ah3cAdJc"));
  }

  @Test
  public void test_omaha_holdem_4634_2c7s8dJdKs_3hJh6cKc_7cKh9s3c_Qs8sJsAh() {
    assertEquals(
      "Qs8sJsAh 7cKh9s3c 3hJh6cKc",
      Solver.process("omaha-holdem 2c7s8dJdKs 3hJh6cKc 7cKh9s3c Qs8sJsAh"));
  }

  @Test
  public void test_omaha_holdem_4635_4s6cAcAsQs_2h8c6d9d_6hKh5sTs_Ks8sAh7h_JhTh5cJs_9h5d3s4h_2d5hKcTd_KdQcTcQd() {
    assertEquals(
      "2d5hKcTd 9h5d3s4h 2h8c6d9d JhTh5cJs 6hKh5sTs Ks8sAh7h KdQcTcQd",
      Solver.process("omaha-holdem 4s6cAcAsQs 2h8c6d9d 6hKh5sTs Ks8sAh7h JhTh5cJs 9h5d3s4h 2d5hKcTd KdQcTcQd"));
  }

  @Test
  public void test_omaha_holdem_4636_3c3d6c9hJs_AhTd5sJc_3hQh6dAd() {
    assertEquals(
      "AhTd5sJc 3hQh6dAd",
      Solver.process("omaha-holdem 3c3d6c9hJs AhTd5sJc 3hQh6dAd"));
  }

  @Test
  public void test_omaha_holdem_4637_2s3h3sKdQh_Kc4c5c2h_6s4h5h3d_As2c7dJs_Ks9h8d7s() {
    assertEquals(
      "As2c7dJs Kc4c5c2h Ks9h8d7s 6s4h5h3d",
      Solver.process("omaha-holdem 2s3h3sKdQh Kc4c5c2h 6s4h5h3d As2c7dJs Ks9h8d7s"));
  }

  @Test
  public void test_omaha_holdem_4638_3h4h4s8h8s_AcAsKsKc_5s7c6h4c_2h7dTsJc_7hQc6d5c_7s5h9h8c() {
    assertEquals(
      "2h7dTsJc 7hQc6d5c AcAsKsKc 5s7c6h4c 7s5h9h8c",
      Solver.process("omaha-holdem 3h4h4s8h8s AcAsKsKc 5s7c6h4c 2h7dTsJc 7hQc6d5c 7s5h9h8c"));
  }

  @Test
  public void test_omaha_holdem_4639_4c4d6c7s8c_QdAc6d5s_9hTd6s3d_Qh7d2c2h_2sTh3s7c_4s5cAsJh_KsJd9sJc_5d8hQs2d() {
    assertEquals(
      "2sTh3s7c Qh7d2c2h KsJd9sJc 4s5cAsJh=5d8hQs2d=QdAc6d5s 9hTd6s3d",
      Solver.process("omaha-holdem 4c4d6c7s8c QdAc6d5s 9hTd6s3d Qh7d2c2h 2sTh3s7c 4s5cAsJh KsJd9sJc 5d8hQs2d"));
  }

  @Test
  public void test_omaha_holdem_4640_6sAcAsJdTh_3h9hKh8s_5sAd6hJc_8cQd2dQs_4d3dQh7h_9c4c6dTs_2sKsQc9d_7sJs9sJh_6c2c5cTd_7d7c2hAh() {
    assertEquals(
      "4d3dQh7h 3h9hKh8s 6c2c5cTd 9c4c6dTs 8cQd2dQs 7d7c2hAh 2sKsQc9d 7sJs9sJh 5sAd6hJc",
      Solver.process("omaha-holdem 6sAcAsJdTh 3h9hKh8s 5sAd6hJc 8cQd2dQs 4d3dQh7h 9c4c6dTs 2sKsQc9d 7sJs9sJh 6c2c5cTd 7d7c2hAh"));
  }

  @Test
  public void test_omaha_holdem_4641_2d7d9sJsKd_5c4cAsAd_Qd8h3h2h() {
    assertEquals(
      "Qd8h3h2h 5c4cAsAd",
      Solver.process("omaha-holdem 2d7d9sJsKd 5c4cAsAd Qd8h3h2h"));
  }

  @Test
  public void test_omaha_holdem_4642_5c6c8sAcTh_7hQdAd3c_Ah8cQs8d_4d3hQh2h_5s9c6hJs_AsTd5d5h_3s4hKh7c_2cJdQcKd() {
    assertEquals(
      "4d3hQh2h 7hQdAd3c 5s9c6hJs AsTd5d5h Ah8cQs8d 3s4hKh7c 2cJdQcKd",
      Solver.process("omaha-holdem 5c6c8sAcTh 7hQdAd3c Ah8cQs8d 4d3hQh2h 5s9c6hJs AsTd5d5h 3s4hKh7c 2cJdQcKd"));
  }

  @Test
  public void test_omaha_holdem_4643_3h4c9c9dJd_5c9hTh6d_6c3d3s3c_QcTd4sKc_8dAh6hAs() {
    assertEquals(
      "QcTd4sKc 8dAh6hAs 5c9hTh6d 6c3d3s3c",
      Solver.process("omaha-holdem 3h4c9c9dJd 5c9hTh6d 6c3d3s3c QcTd4sKc 8dAh6hAs"));
  }

  @Test
  public void test_omaha_holdem_4644_8hJdQcQdTd_7h7c2sTh_9hKh7d5h_2d3c4s5d_6dAh4cJs_Kc8s2h4h() {
    assertEquals(
      "Kc8s2h4h 7h7c2sTh 6dAh4cJs 9hKh7d5h 2d3c4s5d",
      Solver.process("omaha-holdem 8hJdQcQdTd 7h7c2sTh 9hKh7d5h 2d3c4s5d 6dAh4cJs Kc8s2h4h"));
  }

  @Test
  public void test_omaha_holdem_4645_2s6d7h9sJs_AdTs4d3d_Jd9h9dKd_Ah7d3hTd_8dAs5d2h_Tc5s7cKs_Qs5cAc4s_2c4hQh6s() {
    assertEquals(
      "AdTs4d3d Ah7d3hTd 2c4hQh6s Jd9h9dKd 8dAs5d2h Qs5cAc4s Tc5s7cKs",
      Solver.process("omaha-holdem 2s6d7h9sJs AdTs4d3d Jd9h9dKd Ah7d3hTd 8dAs5d2h Tc5s7cKs Qs5cAc4s 2c4hQh6s"));
  }

  @Test
  public void test_omaha_holdem_4646_2d6s7h8s9d_9sJsQdJc_5c7c4h5s_TdTh2hJh_2s3cTs4c() {
    assertEquals(
      "2s3cTs4c 9sJsQdJc 5c7c4h5s TdTh2hJh",
      Solver.process("omaha-holdem 2d6s7h8s9d 9sJsQdJc 5c7c4h5s TdTh2hJh 2s3cTs4c"));
  }

  @Test
  public void test_omaha_holdem_4647_4s5s7c9hAc_4dAsJcJh_3c9s5cQs_9d5d5h6s_Tc2c8h2d_2hTsAh8c_Td6h7d7s_7h3h3dQh_Ad9cTh2s() {
    assertEquals(
      "Tc2c8h2d 7h3h3dQh 2hTsAh8c 3c9s5cQs 4dAsJcJh Ad9cTh2s 9d5d5h6s Td6h7d7s",
      Solver.process("omaha-holdem 4s5s7c9hAc 4dAsJcJh 3c9s5cQs 9d5d5h6s Tc2c8h2d 2hTsAh8c Td6h7d7s 7h3h3dQh Ad9cTh2s"));
  }

  @Test
  public void test_omaha_holdem_4648_4d7h8sAdKs_9sJs5hTh_QdTc5cKc_3s9d6h8h_5d4hQsQc_5sJh9hKd_Ac2cAs9c_3d2sJc4c_8dJd4sTs_7s3hQh6c() {
    assertEquals(
      "9sJs5hTh 3d2sJc4c 7s3hQh6c 3s9d6h8h 5d4hQsQc 5sJh9hKd QdTc5cKc 8dJd4sTs Ac2cAs9c",
      Solver.process("omaha-holdem 4d7h8sAdKs 9sJs5hTh QdTc5cKc 3s9d6h8h 5d4hQsQc 5sJh9hKd Ac2cAs9c 3d2sJc4c 8dJd4sTs 7s3hQh6c"));
  }

  @Test
  public void test_omaha_holdem_4649_2h3s4s8s9d_Ah8dJh4h_QhTs9h5h_QsKh8h5d_As2sJd3h_KdAdAc7c_JcQcKs4d_7s9s4cTh_5s8cTd5c_6h6s3c6c() {
    assertEquals(
      "JcQcKs4d 6h6s3c6c 5s8cTd5c QsKh8h5d QhTs9h5h KdAdAc7c Ah8dJh4h 7s9s4cTh As2sJd3h",
      Solver.process("omaha-holdem 2h3s4s8s9d Ah8dJh4h QhTs9h5h QsKh8h5d As2sJd3h KdAdAc7c JcQcKs4d 7s9s4cTh 5s8cTd5c 6h6s3c6c"));
  }

  @Test
  public void test_omaha_holdem_4650_2hAcKcKdQc_5c9hTh6d_2c4h4d6c_Qd3sKs5s_3h8hAh3c_JsQs7c8s_6s5hQhTs_5d7d8dJd_Td6h7s8c() {
    assertEquals(
      "Td6h7s8c 5c9hTh6d 5d7d8dJd 6s5hQhTs JsQs7c8s 3h8hAh3c 2c4h4d6c Qd3sKs5s",
      Solver.process("omaha-holdem 2hAcKcKdQc 5c9hTh6d 2c4h4d6c Qd3sKs5s 3h8hAh3c JsQs7c8s 6s5hQhTs 5d7d8dJd Td6h7s8c"));
  }

  @Test
  public void test_omaha_holdem_4651_3h3s8c8hAs_Jh9dAcAd_Ah2c7c4c_9s6cQsKh_JsJd3c6d_Qc4h4sJc_Kd4d7dKc_2s5s9hKs_5cTd8s6s_7s5d2hTh() {
    assertEquals(
      "7s5d2hTh 2s5s9hKs 9s6cQsKh Qc4h4sJc Kd4d7dKc Ah2c7c4c JsJd3c6d 5cTd8s6s Jh9dAcAd",
      Solver.process("omaha-holdem 3h3s8c8hAs Jh9dAcAd Ah2c7c4c 9s6cQsKh JsJd3c6d Qc4h4sJc Kd4d7dKc 2s5s9hKs 5cTd8s6s 7s5d2hTh"));
  }

  @Test
  public void test_omaha_holdem_4652_4d7c7h8c8d_9dJcJsTh_Ks7sKcKh_Td6sAsAc_2hQdAd4s_Qh7d9s3h() {
    assertEquals(
      "2hQdAd4s 9dJcJsTh Td6sAsAc Qh7d9s3h Ks7sKcKh",
      Solver.process("omaha-holdem 4d7c7h8c8d 9dJcJsTh Ks7sKcKh Td6sAsAc 2hQdAd4s Qh7d9s3h"));
  }

  @Test
  public void test_omaha_holdem_4653_8d9cJcKcTh_6d3d9h7d_7s2h8hAc_2s4hQcJs_Kd3c9dKh_Jh4c5h8s() {
    assertEquals(
      "Jh4c5h8s Kd3c9dKh 6d3d9h7d=7s2h8hAc 2s4hQcJs",
      Solver.process("omaha-holdem 8d9cJcKcTh 6d3d9h7d 7s2h8hAc 2s4hQcJs Kd3c9dKh Jh4c5h8s"));
  }

  @Test
  public void test_omaha_holdem_4654_2s4c6s8hKd_9s5cQd4h_7c3h9c7s_TcQhJsAh_9h8d4sJh_Ks3d6dAc_5d2dJd5s_2c8sQc7h() {
    assertEquals(
      "TcQhJsAh 9s5cQd4h 5d2dJd5s 7c3h9c7s 2c8sQc7h 9h8d4sJh Ks3d6dAc",
      Solver.process("omaha-holdem 2s4c6s8hKd 9s5cQd4h 7c3h9c7s TcQhJsAh 9h8d4sJh Ks3d6dAc 5d2dJd5s 2c8sQc7h"));
  }

  @Test
  public void test_omaha_holdem_4655_3s4c6c7cTc_5h6s3c8d_7dJh9c5s() {
    assertEquals(
      "7dJh9c5s 5h6s3c8d",
      Solver.process("omaha-holdem 3s4c6c7cTc 5h6s3c8d 7dJh9c5s"));
  }

  @Test
  public void test_omaha_holdem_4656_4s5hJhQsTs_7h9d9s8d_TdQd3hJc_6h3cKcQc_TcKh4dJd_9c2c6d3d_2dAdQhKd() {
    assertEquals(
      "9c2c6d3d 6h3cKcQc TcKh4dJd TdQd3hJc 7h9d9s8d 2dAdQhKd",
      Solver.process("omaha-holdem 4s5hJhQsTs 7h9d9s8d TdQd3hJc 6h3cKcQc TcKh4dJd 9c2c6d3d 2dAdQhKd"));
  }

  @Test
  public void test_omaha_holdem_4657_4sAdAhJhKc_Ks9d8cJd_Jc3s2hQs_6s6c8sQd_KdTd9s2d_Js5s5dTh_4dQc7s3d_3h4h5h7c_6h3cTcTs() {
    assertEquals(
      "3h4h5h7c 4dQc7s3d 6s6c8sQd 6h3cTcTs Js5s5dTh Jc3s2hQs KdTd9s2d Ks9d8cJd",
      Solver.process("omaha-holdem 4sAdAhJhKc Ks9d8cJd Jc3s2hQs 6s6c8sQd KdTd9s2d Js5s5dTh 4dQc7s3d 3h4h5h7c 6h3cTcTs"));
  }

  @Test
  public void test_omaha_holdem_4658_7d9sKdKsQh_9dJs5dAs_2h4cQd8h() {
    assertEquals(
      "9dJs5dAs 2h4cQd8h",
      Solver.process("omaha-holdem 7d9sKdKsQh 9dJs5dAs 2h4cQd8h"));
  }

  @Test
  public void test_omaha_holdem_4659_2d5s6c8h9h_6h7c7dAc_QsKhAd6s_5c4d4s4c_5h8d9dQd_5dAhJhQc() {
    assertEquals(
      "5c4d4s4c 5dAhJhQc QsKhAd6s 5h8d9dQd 6h7c7dAc",
      Solver.process("omaha-holdem 2d5s6c8h9h 6h7c7dAc QsKhAd6s 5c4d4s4c 5h8d9dQd 5dAhJhQc"));
  }

  @Test
  public void test_omaha_holdem_4660_7cJsQcQdTc_Qs4dQhKs_2c5sAh5d_8d9d4cKd_3d9c8h2s_4sTs6c6d() {
    assertEquals(
      "2c5sAh5d 4sTs6c6d 3d9c8h2s 8d9d4cKd Qs4dQhKs",
      Solver.process("omaha-holdem 7cJsQcQdTc Qs4dQhKs 2c5sAh5d 8d9d4cKd 3d9c8h2s 4sTs6c6d"));
  }

  @Test
  public void test_omaha_holdem_4661_3h8s9cKhTc_Td5c6c9h_Qd5h2h8c() {
    assertEquals(
      "Qd5h2h8c Td5c6c9h",
      Solver.process("omaha-holdem 3h8s9cKhTc Td5c6c9h Qd5h2h8c"));
  }

  @Test
  public void test_omaha_holdem_4662_5h7c7h9dTd_Jd5d3h6h_6d9sQs3d_KhAc8s6c_2d9cKsTc() {
    assertEquals(
      "Jd5d3h6h 6d9sQs3d 2d9cKsTc KhAc8s6c",
      Solver.process("omaha-holdem 5h7c7h9dTd Jd5d3h6h 6d9sQs3d KhAc8s6c 2d9cKsTc"));
  }

  @Test
  public void test_omaha_holdem_4663_2h5s6dJsKs_5c6cThTs_4h5d6h2d_Ah3cTcAs_9h8c8sJd_QcJh2c9d_AcQd8d4s_7c5h9sQh_7s3hKdKh() {
    assertEquals(
      "AcQd8d4s 7c5h9sQh 9h8c8sJd Ah3cTcAs 4h5d6h2d=5c6cThTs QcJh2c9d 7s3hKdKh",
      Solver.process("omaha-holdem 2h5s6dJsKs 5c6cThTs 4h5d6h2d Ah3cTcAs 9h8c8sJd QcJh2c9d AcQd8d4s 7c5h9sQh 7s3hKdKh"));
  }

  @Test
  public void test_omaha_holdem_4664_4h7s8d9dKs_Ad2d6d9c_4c8s7h3h_4sQdQcAc_5hQsTsTd() {
    assertEquals(
      "Ad2d6d9c 5hQsTsTd 4sQdQcAc 4c8s7h3h",
      Solver.process("omaha-holdem 4h7s8d9dKs Ad2d6d9c 4c8s7h3h 4sQdQcAc 5hQsTsTd"));
  }

  @Test
  public void test_omaha_holdem_4665_7s9sAcJcKh_6cJsTh3h_2s3c7hJh_6dQd9hJd_2hQh9c6s_Kc3s8c4h_5c5d3d7d_2d9dQsAd_TdAh6hTs() {
    assertEquals(
      "5c5d3d7d 2hQh9c6s 6cJsTh3h Kc3s8c4h TdAh6hTs 2s3c7hJh 6dQd9hJd 2d9dQsAd",
      Solver.process("omaha-holdem 7s9sAcJcKh 6cJsTh3h 2s3c7hJh 6dQd9hJd 2hQh9c6s Kc3s8c4h 5c5d3d7d 2d9dQsAd TdAh6hTs"));
  }

  @Test
  public void test_omaha_holdem_4666_4c7s8hJhTh_KdAc6dQh_5hKs8s7d_Js9s6c7c_Qd8cAd9h_5cAs6sTd_9dJcAh8d_Kh6hJd3c_5d2s2h9c() {
    assertEquals(
      "KdAc6dQh 5d2s2h9c 5hKs8s7d 5cAs6sTd 9dJcAh8d=Js9s6c7c Qd8cAd9h Kh6hJd3c",
      Solver.process("omaha-holdem 4c7s8hJhTh KdAc6dQh 5hKs8s7d Js9s6c7c Qd8cAd9h 5cAs6sTd 9dJcAh8d Kh6hJd3c 5d2s2h9c"));
  }

  @Test
  public void test_omaha_holdem_4667_2d4sAdKcQc_Kh5s2s3h_7d5c6h3s_Ah3dQh6s_7h6c8dQs_Kd3cTs8c_9d9sJd8s_Jc9h4cTh_9cTc5d7c() {
    assertEquals(
      "9cTc5d7c 9d9sJd8s 7h6c8dQs Kd3cTs8c Ah3dQh6s 7d5c6h3s=Kh5s2s3h Jc9h4cTh",
      Solver.process("omaha-holdem 2d4sAdKcQc Kh5s2s3h 7d5c6h3s Ah3dQh6s 7h6c8dQs Kd3cTs8c 9d9sJd8s Jc9h4cTh 9cTc5d7c"));
  }

  @Test
  public void test_omaha_holdem_4668_3h4c6d8sAh_7sJd5c9d_6cTh9s8d_KhKd4dQs_9h7d9cAs_2h8hJc2d_7hJh5dQd_6h3d5s7c() {
    assertEquals(
      "2h8hJc2d KhKd4dQs 9h7d9cAs 6cTh9s8d 6h3d5s7c=7hJh5dQd=7sJd5c9d",
      Solver.process("omaha-holdem 3h4c6d8sAh 7sJd5c9d 6cTh9s8d KhKd4dQs 9h7d9cAs 2h8hJc2d 7hJh5dQd 6h3d5s7c"));
  }

  @Test
  public void test_omaha_holdem_4669_2s6d7s8dTd_8h3cKhKc_AhAd9s2d_9hAsJs5c_4hQc4d8c_Qs3s9c2h_4sTc7d9d() {
    assertEquals(
      "Qs3s9c2h 4hQc4d8c 8h3cKhKc 9hAsJs5c AhAd9s2d 4sTc7d9d",
      Solver.process("omaha-holdem 2s6d7s8dTd 8h3cKhKc AhAd9s2d 9hAsJs5c 4hQc4d8c Qs3s9c2h 4sTc7d9d"));
  }

  @Test
  public void test_omaha_holdem_4670_3h7d8cAdAh_3sQh7sAc_5sTc6d3d_8sTsKh9s_4d9c4c5d_4hJcQc9h_Qd8h8dKc_3cAs7hJs_7c2cKs6s() {
    assertEquals(
      "4hJcQc9h 5sTc6d3d 4d9c4c5d 7c2cKs6s 8sTsKh9s Qd8h8dKc 3cAs7hJs=3sQh7sAc",
      Solver.process("omaha-holdem 3h7d8cAdAh 3sQh7sAc 5sTc6d3d 8sTsKh9s 4d9c4c5d 4hJcQc9h Qd8h8dKc 3cAs7hJs 7c2cKs6s"));
  }

  @Test
  public void test_omaha_holdem_4671_3d3hAhThTs_KcJh8c6d_Qd2hAs8h() {
    assertEquals(
      "KcJh8c6d Qd2hAs8h",
      Solver.process("omaha-holdem 3d3hAhThTs KcJh8c6d Qd2hAs8h"));
  }

  @Test
  public void test_omaha_holdem_4672_3cQdTdThTs_Ad6c9dAh_4s9sKd3d() {
    assertEquals(
      "4s9sKd3d Ad6c9dAh",
      Solver.process("omaha-holdem 3cQdTdThTs Ad6c9dAh 4s9sKd3d"));
  }

  @Test
  public void test_omaha_holdem_4673_4s6h9hAcTd_2dJs7h3d_8sQsAhAd_9d2c2s5s_Ts5d6dKs_Jc9c6c3c() {
    assertEquals(
      "2dJs7h3d 9d2c2s5s Jc9c6c3c Ts5d6dKs 8sQsAhAd",
      Solver.process("omaha-holdem 4s6h9hAcTd 2dJs7h3d 8sQsAhAd 9d2c2s5s Ts5d6dKs Jc9c6c3c"));
  }

  @Test
  public void test_omaha_holdem_4674_2c9cAsKcQs_4dJhJsJc_7s4c5d6c() {
    assertEquals(
      "4dJhJsJc 7s4c5d6c",
      Solver.process("omaha-holdem 2c9cAsKcQs 4dJhJsJc 7s4c5d6c"));
  }

  @Test
  public void test_omaha_holdem_4675_2s5sAhJdJs_7s6s3s3c_2h4hKh7c_Ad9cAc8s_5cQd2dTc_QcTd9dQs() {
    assertEquals(
      "2h4hKh7c 5cQd2dTc QcTd9dQs 7s6s3s3c Ad9cAc8s",
      Solver.process("omaha-holdem 2s5sAhJdJs 7s6s3s3c 2h4hKh7c Ad9cAc8s 5cQd2dTc QcTd9dQs"));
  }

  @Test
  public void test_omaha_holdem_4676_2h4d8c8dAh_6c8h5d7c_7sKh3cJs_8sQdTdAc_4s9cTsKd_9sKc7d9h_Ks2sJd6s() {
    assertEquals(
      "7sKh3cJs Ks2sJd6s 4s9cTsKd 9sKc7d9h 6c8h5d7c 8sQdTdAc",
      Solver.process("omaha-holdem 2h4d8c8dAh 6c8h5d7c 7sKh3cJs 8sQdTdAc 4s9cTsKd 9sKc7d9h Ks2sJd6s"));
  }

  @Test
  public void test_omaha_holdem_4677_4h5c6sKhQc_Jd8h7s8s_AhTd4c9h_8c3h3s4d_Kd3d5h7h_5sJhAsTc_Ks2s2c9c() {
    assertEquals(
      "8c3h3s4d AhTd4c9h 5sJhAsTc Ks2s2c9c Kd3d5h7h Jd8h7s8s",
      Solver.process("omaha-holdem 4h5c6sKhQc Jd8h7s8s AhTd4c9h 8c3h3s4d Kd3d5h7h 5sJhAsTc Ks2s2c9c"));
  }

  @Test
  public void test_omaha_holdem_4678_3d6c9cQsTh_4d2s7hAc_Kh6s8hAh() {
    assertEquals(
      "4d2s7hAc Kh6s8hAh",
      Solver.process("omaha-holdem 3d6c9cQsTh 4d2s7hAc Kh6s8hAh"));
  }

  @Test
  public void test_omaha_holdem_4679_2d9dKhQsTc_Jh6d5dJd_4c3hQd8h_Ah5s3s8s_9c6h7d3d_Ad2h3cTd_Ts5hJc7h_9s2cKcTh_2s9hKs4d() {
    assertEquals(
      "Ah5s3s8s 9c6h7d3d Jh6d5dJd 4c3hQd8h Ad2h3cTd 2s9hKs4d 9s2cKcTh Ts5hJc7h",
      Solver.process("omaha-holdem 2d9dKhQsTc Jh6d5dJd 4c3hQd8h Ah5s3s8s 9c6h7d3d Ad2h3cTd Ts5hJc7h 9s2cKcTh 2s9hKs4d"));
  }

  @Test
  public void test_omaha_holdem_4680_5d7hJdKcKs_Th2s2cQc_TcAc3h7c_JsTdJh9h_Ah7d2h6h_6c4dAs9c_5s7s4s3d() {
    assertEquals(
      "6c4dAs9c Th2s2cQc 5s7s4s3d Ah7d2h6h=TcAc3h7c JsTdJh9h",
      Solver.process("omaha-holdem 5d7hJdKcKs Th2s2cQc TcAc3h7c JsTdJh9h Ah7d2h6h 6c4dAs9c 5s7s4s3d"));
  }

  @Test
  public void test_omaha_holdem_4681_3c6d9sKhTh_4c2cKc2h_5sJcAsQd_QhJhJd3h_8s8cAcJs_3d7d6sTc_4d3s9c6h() {
    assertEquals(
      "8s8cAcJs 4c2cKc2h 4d3s9c6h 3d7d6sTc 5sJcAsQd=QhJhJd3h",
      Solver.process("omaha-holdem 3c6d9sKhTh 4c2cKc2h 5sJcAsQd QhJhJd3h 8s8cAcJs 3d7d6sTc 4d3s9c6h"));
  }

  @Test
  public void test_omaha_holdem_4682_7d9sKdKhQs_Qh5sTdAh_6s2dTh5d_9cJc4hTc() {
    assertEquals(
      "6s2dTh5d Qh5sTdAh 9cJc4hTc",
      Solver.process("omaha-holdem 7d9sKdKhQs Qh5sTdAh 6s2dTh5d 9cJc4hTc"));
  }

  @Test
  public void test_omaha_holdem_4683_2s6c9dJdKd_6h9c7hKc_Qh9h4h4c() {
    assertEquals(
      "Qh9h4h4c 6h9c7hKc",
      Solver.process("omaha-holdem 2s6c9dJdKd 6h9c7hKc Qh9h4h4c"));
  }

  @Test
  public void test_omaha_holdem_4684_7d8c9sJsQs_5dJd9c4c_3s3d7h8d_Ac9dQc7s_5sTc3hKd_3cQh9h6c_Kc2h6d6s_6h2sKhAs_2cAd8s4h_5hAh4sQd() {
    assertEquals(
      "Kc2h6d6s 2cAd8s4h 5hAh4sQd 3s3d7h8d 5dJd9c4c 3cQh9h6c=Ac9dQc7s 5sTc3hKd 6h2sKhAs",
      Solver.process("omaha-holdem 7d8c9sJsQs 5dJd9c4c 3s3d7h8d Ac9dQc7s 5sTc3hKd 3cQh9h6c Kc2h6d6s 6h2sKhAs 2cAd8s4h 5hAh4sQd"));
  }

  @Test
  public void test_omaha_holdem_4685_3s5s7d9cQd_7cJd4hTd_2sJh7s9h_9dJc8s8d_ThQc6s4c_Ks5hKh9s() {
    assertEquals(
      "7cJd4hTd 9dJc8s8d Ks5hKh9s 2sJh7s9h ThQc6s4c",
      Solver.process("omaha-holdem 3s5s7d9cQd 7cJd4hTd 2sJh7s9h 9dJc8s8d ThQc6s4c Ks5hKh9s"));
  }

  @Test
  public void test_omaha_holdem_4686_4c4h6cAhTd_Qd2dQh8d_6sKcQc8s_5sJs7sKh_7cAc7d5c_2s9c8c7h() {
    assertEquals(
      "2s9c8c7h 5sJs7sKh 6sKcQc8s Qd2dQh8d 7cAc7d5c",
      Solver.process("omaha-holdem 4c4h6cAhTd Qd2dQh8d 6sKcQc8s 5sJs7sKh 7cAc7d5c 2s9c8c7h"));
  }

  @Test
  public void test_omaha_holdem_4687_2h7d9sAhTs_5c6s5d7c_2c7hQd2d_6hJd8c4h_9c8dJc8s_5s3s6dKh_6c9h2sAd() {
    assertEquals(
      "5s3s6dKh 5c6s5d7c 6c9h2sAd 2c7hQd2d 6hJd8c4h=9c8dJc8s",
      Solver.process("omaha-holdem 2h7d9sAhTs 5c6s5d7c 2c7hQd2d 6hJd8c4h 9c8dJc8s 5s3s6dKh 6c9h2sAd"));
  }

  @Test
  public void test_omaha_holdem_4688_2h2s5d9hKc_6dAsKh4d_8s3cQs6h_AdKs7s5c_Qd3h8d9d_JdAh6s2d_3d7c4sJh_7dTs6c8h() {
    assertEquals(
      "7dTs6c8h 3d7c4sJh 8s3cQs6h Qd3h8d9d 6dAsKh4d AdKs7s5c JdAh6s2d",
      Solver.process("omaha-holdem 2h2s5d9hKc 6dAsKh4d 8s3cQs6h AdKs7s5c Qd3h8d9d JdAh6s2d 3d7c4sJh 7dTs6c8h"));
  }

  @Test
  public void test_omaha_holdem_4689_3d7dJcJdJh_8h2s5c6c_9h6s5s9c_4cQhAdQd_6dQs5hKs() {
    assertEquals(
      "8h2s5c6c 6dQs5hKs 9h6s5s9c 4cQhAdQd",
      Solver.process("omaha-holdem 3d7dJcJdJh 8h2s5c6c 9h6s5s9c 4cQhAdQd 6dQs5hKs"));
  }

  @Test
  public void test_omaha_holdem_4690_2c2s7sJcQs_As5cJs7c_7d6h3h5h_Jd6s3d4s_6dQc3c5d_8sQd6cKh_5s2d9cKd_2hTdKsKc_Ac8hTh7h_8cJh8d9d() {
    assertEquals(
      "7d6h3h5h Ac8hTh7h 8cJh8d9d 6dQc3c5d 8sQd6cKh 2hTdKsKc=5s2d9cKd Jd6s3d4s As5cJs7c",
      Solver.process("omaha-holdem 2c2s7sJcQs As5cJs7c 7d6h3h5h Jd6s3d4s 6dQc3c5d 8sQd6cKh 5s2d9cKd 2hTdKsKc Ac8hTh7h 8cJh8d9d"));
  }

  @Test
  public void test_omaha_holdem_4691_4d5h6hAsQs_7s3h7hTc_6d9hJsJc_2s6sAhQd_7cQh9d4h_8dJh5sJd() {
    assertEquals(
      "6d9hJsJc=8dJh5sJd 7cQh9d4h 2s6sAhQd 7s3h7hTc",
      Solver.process("omaha-holdem 4d5h6hAsQs 7s3h7hTc 6d9hJsJc 2s6sAhQd 7cQh9d4h 8dJh5sJd"));
  }

  @Test
  public void test_omaha_holdem_4692_2c3d3h6dKs_5sJc7d4s_8s4hJdAs_5h9dAhQd_8d6cJsTs_Qs9c5cAc_8h6hTdKh_4dThKc5d() {
    assertEquals(
      "8s4hJdAs 5h9dAhQd=Qs9c5cAc 8d6cJsTs 8h6hTdKh 4dThKc5d=5sJc7d4s",
      Solver.process("omaha-holdem 2c3d3h6dKs 5sJc7d4s 8s4hJdAs 5h9dAhQd 8d6cJsTs Qs9c5cAc 8h6hTdKh 4dThKc5d"));
  }

  @Test
  public void test_omaha_holdem_4693_3c7c9sJcJs_Ts5dJhTd_Tc2cKs4h_KhTh3hAs_4sAc5cAh_8cJdQs2h_QhAd9c2d_9d9h8hQd() {
    assertEquals(
      "KhTh3hAs QhAd9c2d Ts5dJhTd 8cJdQs2h Tc2cKs4h 4sAc5cAh 9d9h8hQd",
      Solver.process("omaha-holdem 3c7c9sJcJs Ts5dJhTd Tc2cKs4h KhTh3hAs 4sAc5cAh 8cJdQs2h QhAd9c2d 9d9h8hQd"));
  }

  @Test
  public void test_omaha_holdem_4694_3h4d5hJdTc_8hAs3sAd_Ac7s9s5d_9h6hQcJc_Qs6c2c8c_2d9d7c2h() {
    assertEquals(
      "2d9d7c2h Ac7s9s5d 9h6hQcJc 8hAs3sAd Qs6c2c8c",
      Solver.process("omaha-holdem 3h4d5hJdTc 8hAs3sAd Ac7s9s5d 9h6hQcJc Qs6c2c8c 2d9d7c2h"));
  }

  @Test
  public void test_omaha_holdem_4695_4hKcQdQsTh_6hKdJc9c_3cTc6d2c() {
    assertEquals(
      "3cTc6d2c 6hKdJc9c",
      Solver.process("omaha-holdem 4hKcQdQsTh 6hKdJc9c 3cTc6d2c"));
  }

  @Test
  public void test_omaha_holdem_4696_2h3c7s8sTc_6h9d4hJh_2dKd9cTd_5dQc9hKc_5sJcTh6d_Jd9s3hAd_QsQh6cAh_8hJsKh8d_7d7c5h3d() {
    assertEquals(
      "5dQc9hKc 5sJcTh6d QsQh6cAh 2dKd9cTd 7d7c5h3d 8hJsKh8d 6h9d4hJh=Jd9s3hAd",
      Solver.process("omaha-holdem 2h3c7s8sTc 6h9d4hJh 2dKd9cTd 5dQc9hKc 5sJcTh6d Jd9s3hAd QsQh6cAh 8hJsKh8d 7d7c5h3d"));
  }

  @Test
  public void test_omaha_holdem_4697_2s6d9dKdTd_KcQc8hJh_Ts5c9s8c_8s6sAsJc_8d7dAhQd_Qs3sAd3c() {
    assertEquals(
      "Qs3sAd3c 8s6sAsJc Ts5c9s8c KcQc8hJh 8d7dAhQd",
      Solver.process("omaha-holdem 2s6d9dKdTd KcQc8hJh Ts5c9s8c 8s6sAsJc 8d7dAhQd Qs3sAd3c"));
  }

  @Test
  public void test_omaha_holdem_4698_2s5s7dQcTs_9h8s9c3c_3dJs5c8c_Qh9sKs7c() {
    assertEquals(
      "3dJs5c8c 9h8s9c3c Qh9sKs7c",
      Solver.process("omaha-holdem 2s5s7dQcTs 9h8s9c3c 3dJs5c8c Qh9sKs7c"));
  }

  @Test
  public void test_omaha_holdem_4699_4c5h6dKcKh_2c2d7d3s_As8sQc9d_5cQdKs8c_8h9s6s9c_Ac7h2sKd_7s4sQh6c_3d5dAdJc() {
    assertEquals(
      "As8sQc9d 3d5dAdJc 7s4sQh6c 8h9s6s9c Ac7h2sKd 2c2d7d3s 5cQdKs8c",
      Solver.process("omaha-holdem 4c5h6dKcKh 2c2d7d3s As8sQc9d 5cQdKs8c 8h9s6s9c Ac7h2sKd 7s4sQh6c 3d5dAdJc"));
  }

  @Test
  public void test_omaha_holdem_4700_6d8h9sJcKd_AcTh4d2s_6cQsTd8d_QcAh7s2c_As8sQh9d_5d5h2hTc_Ad5cKs3d_Qd9hJs4h_4c7d6hJh_JdTs2d5s() {
    assertEquals(
      "AcTh4d2s QcAh7s2c 5d5h2hTc JdTs2d5s Ad5cKs3d As8sQh9d 4c7d6hJh Qd9hJs4h 6cQsTd8d",
      Solver.process("omaha-holdem 6d8h9sJcKd AcTh4d2s 6cQsTd8d QcAh7s2c As8sQh9d 5d5h2hTc Ad5cKs3d Qd9hJs4h 4c7d6hJh JdTs2d5s"));
  }

  @Test
  public void test_omaha_holdem_4701_4h8h9sQcTd_4d8d5sKs_TcTs8cAd_JhJcQh2h_6d7c6h3h_KcKdAh2c_As5d7s9c_4cKhJd6c_5h4s3sAc() {
    assertEquals(
      "5h4s3sAc As5d7s9c KcKdAh2c 4d8d5sKs TcTs8cAd 6d7c6h3h JhJcQh2h 4cKhJd6c",
      Solver.process("omaha-holdem 4h8h9sQcTd 4d8d5sKs TcTs8cAd JhJcQh2h 6d7c6h3h KcKdAh2c As5d7s9c 4cKhJd6c 5h4s3sAc"));
  }

  @Test
  public void test_omaha_holdem_4702_4c8c9dKhTs_9h3c5s4d_7cJc2hTc_6c7s6hKd_As3s2c8d_JsAd3h4s_Jd5c2d8s_Qc2s5h6d_AcQd5d9s_6s7d7h9c() {
    assertEquals(
      "Qc2s5h6d JsAd3h4s Jd5c2d8s As3s2c8d AcQd5d9s 9h3c5s4d 6c7s6hKd=6s7d7h9c 7cJc2hTc",
      Solver.process("omaha-holdem 4c8c9dKhTs 9h3c5s4d 7cJc2hTc 6c7s6hKd As3s2c8d JsAd3h4s Jd5c2d8s Qc2s5h6d AcQd5d9s 6s7d7h9c"));
  }

  @Test
  public void test_omaha_holdem_4703_3s8d9dAhTh_Ks7dAs3h_Jh9h7s7h() {
    assertEquals(
      "Ks7dAs3h Jh9h7s7h",
      Solver.process("omaha-holdem 3s8d9dAhTh Ks7dAs3h Jh9h7s7h"));
  }

  @Test
  public void test_omaha_holdem_4704_2s4s7c7dAh_4dTs3hKh_Ad4h9cKc_2h3d5d2d_4c9dKd6d_7hJh5c6c_3sQd6s9h() {
    assertEquals(
      "3sQd6s9h 4c9dKd6d=4dTs3hKh Ad4h9cKc 7hJh5c6c 2h3d5d2d",
      Solver.process("omaha-holdem 2s4s7c7dAh 4dTs3hKh Ad4h9cKc 2h3d5d2d 4c9dKd6d 7hJh5c6c 3sQd6s9h"));
  }

  @Test
  public void test_omaha_holdem_4705_2h3h5sQcTc_6hJh5cQh_8h6sJs4h_Jc7hJdTd_6c7sKdKc_5h6d9dAh_2d9h9c3d() {
    assertEquals(
      "5h6d9dAh Jc7hJdTd 6c7sKdKc 2d9h9c3d 6hJh5cQh 8h6sJs4h",
      Solver.process("omaha-holdem 2h3h5sQcTc 6hJh5cQh 8h6sJs4h Jc7hJdTd 6c7sKdKc 5h6d9dAh 2d9h9c3d"));
  }

  @Test
  public void test_omaha_holdem_4706_4c5sAcQhTs_8h5cJh6d_TcKc6s7d_AdQsAh2c() {
    assertEquals(
      "8h5cJh6d TcKc6s7d AdQsAh2c",
      Solver.process("omaha-holdem 4c5sAcQhTs 8h5cJh6d TcKc6s7d AdQsAh2c"));
  }

  @Test
  public void test_omaha_holdem_4707_4h4s7d9sTd_2sKsAcTs_4dAh7sQc_Js9d9c2h_8s2d5dKh() {
    assertEquals(
      "8s2d5dKh 2sKsAcTs 4dAh7sQc Js9d9c2h",
      Solver.process("omaha-holdem 4h4s7d9sTd 2sKsAcTs 4dAh7sQc Js9d9c2h 8s2d5dKh"));
  }

  @Test
  public void test_omaha_holdem_4708_4h5d5h9dTh_JsTsJc2h_JhAsTd7s_4s6h6cQs_Ad9s4d3h_7c8cKs6s_3s3cAh2d_5sQcKcJd_5c8d3d8h() {
    assertEquals(
      "7c8cKs6s 3s3cAh2d 4s6h6cQs Ad9s4d3h JhAsTd7s JsTsJc2h 5c8d3d8h 5sQcKcJd",
      Solver.process("omaha-holdem 4h5d5h9dTh JsTsJc2h JhAsTd7s 4s6h6cQs Ad9s4d3h 7c8cKs6s 3s3cAh2d 5sQcKcJd 5c8d3d8h"));
  }

  @Test
  public void test_omaha_holdem_4709_5d6d7d9cTc_8s3s8hKd_8c8dAsQd_2sTsAdKh_Td5sJc4s_4c7c7h7s() {
    assertEquals(
      "8s3s8hKd 2sTsAdKh Td5sJc4s 4c7c7h7s 8c8dAsQd",
      Solver.process("omaha-holdem 5d6d7d9cTc 8s3s8hKd 8c8dAsQd 2sTsAdKh Td5sJc4s 4c7c7h7s"));
  }

  @Test
  public void test_omaha_holdem_4710_2s4c6h7hQs_6s7c2cKc_8s4d2d6d_8d8h9dJh_4hThAd7d_3c9cQc3s_5sTcTdAs_AhKhQd3d_Ac5hJd8c_7s3h6cJs() {
    assertEquals(
      "8d8h9dJh 5sTcTdAs 3c9cQc3s AhKhQd3d 8s4d2d6d 4hThAd7d 6s7c2cKc=7s3h6cJs Ac5hJd8c",
      Solver.process("omaha-holdem 2s4c6h7hQs 6s7c2cKc 8s4d2d6d 8d8h9dJh 4hThAd7d 3c9cQc3s 5sTcTdAs AhKhQd3d Ac5hJd8c 7s3h6cJs"));
  }

  @Test
  public void test_omaha_holdem_4711_2c2d2s5hJd_7c3s6d7d_5c4sQd2h_8h4c7sAh_Qc5d9cKh_Ad3h6hAs_5s3cThTc_9sKcJcTd_JsKs6cQs_8dTsQh7h() {
    assertEquals(
      "8dTsQh7h 9sKcJcTd JsKs6cQs=Qc5d9cKh 8h4c7sAh 7c3s6d7d 5s3cThTc Ad3h6hAs 5c4sQd2h",
      Solver.process("omaha-holdem 2c2d2s5hJd 7c3s6d7d 5c4sQd2h 8h4c7sAh Qc5d9cKh Ad3h6hAs 5s3cThTc 9sKcJcTd JsKs6cQs 8dTsQh7h"));
  }

  @Test
  public void test_omaha_holdem_4712_4d7sKsQcQs_5s9sKdTs_6cAh6dJc_8sJd5h9c_Kh2hAcTc_3s6s9d6h_Kc3hJsTh_2c8h4h5d_7d3cQd4c() {
    assertEquals(
      "8sJd5h9c 2c8h4h5d 6cAh6dJc Kc3hJsTh Kh2hAcTc 3s6s9d6h 5s9sKdTs 7d3cQd4c",
      Solver.process("omaha-holdem 4d7sKsQcQs 5s9sKdTs 6cAh6dJc 8sJd5h9c Kh2hAcTc 3s6s9d6h Kc3hJsTh 2c8h4h5d 7d3cQd4c"));
  }

  @Test
  public void test_omaha_holdem_4713_4s5d6h6sAh_8sKh7c3h_9hTc5h2h_9s9c8d6c_3sQs2sKs_7sAcJc3c_8h3dAd5c_7hJd2cQd_ThTdAs9d_QhJhTs5s() {
    assertEquals(
      "7hJd2cQd 9hTc5h2h QhJhTs5s 8h3dAd5c ThTdAs9d 9s9c8d6c 3sQs2sKs 7sAcJc3c 8sKh7c3h",
      Solver.process("omaha-holdem 4s5d6h6sAh 8sKh7c3h 9hTc5h2h 9s9c8d6c 3sQs2sKs 7sAcJc3c 8h3dAd5c 7hJd2cQd ThTdAs9d QhJhTs5s"));
  }

  @Test
  public void test_omaha_holdem_4714_2d4h5c9cTh_2s4s6h6c_2h7dTd5d_Kh5h8s9h_8cKcQs2c() {
    assertEquals(
      "8cKcQs2c 2s4s6h6c Kh5h8s9h 2h7dTd5d",
      Solver.process("omaha-holdem 2d4h5c9cTh 2s4s6h6c 2h7dTd5d Kh5h8s9h 8cKcQs2c"));
  }

  @Test
  public void test_omaha_holdem_4715_4c6c7h9sJs_2sJhQc4d_2cTd6dKc_9hAh3sQh() {
    assertEquals(
      "2cTd6dKc 9hAh3sQh 2sJhQc4d",
      Solver.process("omaha-holdem 4c6c7h9sJs 2sJhQc4d 2cTd6dKc 9hAh3sQh"));
  }

  @Test
  public void test_omaha_holdem_4716_2d3d6hKhTh_KsJh2s6c_QcJd9dTd_3s3c9c8s() {
    assertEquals(
      "QcJd9dTd KsJh2s6c 3s3c9c8s",
      Solver.process("omaha-holdem 2d3d6hKhTh KsJh2s6c QcJd9dTd 3s3c9c8s"));
  }

  @Test
  public void test_omaha_holdem_4717_3s5c8hQdTh_9dKd8dAs_2hAcQcAh_7c5s3hKs_Qh4c7d2c_Ts8s4h9s_5dTc7hKh_9h6sAd4s() {
    assertEquals(
      "9h6sAd4s 9dKd8dAs Qh4c7d2c 2hAcQcAh 7c5s3hKs 5dTc7hKh Ts8s4h9s",
      Solver.process("omaha-holdem 3s5c8hQdTh 9dKd8dAs 2hAcQcAh 7c5s3hKs Qh4c7d2c Ts8s4h9s 5dTc7hKh 9h6sAd4s"));
  }

  @Test
  public void test_omaha_holdem_4718_2h5h8c8hTh_JdAh2s4h_8s6s2cAc_9hJh4d5d() {
    assertEquals(
      "9hJh4d5d JdAh2s4h 8s6s2cAc",
      Solver.process("omaha-holdem 2h5h8c8hTh JdAh2s4h 8s6s2cAc 9hJh4d5d"));
  }

  @Test
  public void test_omaha_holdem_4719_5c6cAdAhJd_3sAs3d9c_2sAc7cKd_Jc8c4c2h() {
    assertEquals(
      "Jc8c4c2h 3sAs3d9c 2sAc7cKd",
      Solver.process("omaha-holdem 5c6cAdAhJd 3sAs3d9c 2sAc7cKd Jc8c4c2h"));
  }

  @Test
  public void test_omaha_holdem_4720_2h6dJcJsKs_Kc7d3s8h_3cAs2sJd_9c5d9d7s_9h7h4d8c_9sAhAdTc() {
    assertEquals(
      "9h7h4d8c 9c5d9d7s Kc7d3s8h 9sAhAdTc 3cAs2sJd",
      Solver.process("omaha-holdem 2h6dJcJsKs Kc7d3s8h 3cAs2sJd 9c5d9d7s 9h7h4d8c 9sAhAdTc"));
  }

  @Test
  public void test_omaha_holdem_4721_3h3s7s9hAc_2c8sJd6c_8cJsKc7h_5c5sAs6h_3c7cThAh_4d4sQhKd_8d2d8hTd() {
    assertEquals(
      "2c8sJd6c 4d4sQhKd 8cJsKc7h 8d2d8hTd 5c5sAs6h 3c7cThAh",
      Solver.process("omaha-holdem 3h3s7s9hAc 2c8sJd6c 8cJsKc7h 5c5sAs6h 3c7cThAh 4d4sQhKd 8d2d8hTd"));
  }

  @Test
  public void test_omaha_holdem_4722_4s9dAhKdKs_8d8hAs2h_8c5sTc4c_Qs3dJdQd_QhTh7cKc() {
    assertEquals(
      "8c5sTc4c Qs3dJdQd 8d8hAs2h QhTh7cKc",
      Solver.process("omaha-holdem 4s9dAhKdKs 8d8hAs2h 8c5sTc4c Qs3dJdQd QhTh7cKc"));
  }

  @Test
  public void test_omaha_holdem_4723_2d4c5h6d9d_Ah2h9h4h_9sQsTh5s_TcQdKs2c() {
    assertEquals(
      "TcQdKs2c Ah2h9h4h 9sQsTh5s",
      Solver.process("omaha-holdem 2d4c5h6d9d Ah2h9h4h 9sQsTh5s TcQdKs2c"));
  }

  @Test
  public void test_omaha_holdem_4724_2h3s4h8hAs_2dQh3h6h_6dQc3d2s_9c5h5cJs_Ts2cTh8c_8s9sJdJh_AcJc4c6s_Ah6c4dKs() {
    assertEquals(
      "9c5h5cJs 8s9sJdJh 6dQc3d2s Ts2cTh8c AcJc4c6s=Ah6c4dKs 2dQh3h6h",
      Solver.process("omaha-holdem 2h3s4h8hAs 2dQh3h6h 6dQc3d2s 9c5h5cJs Ts2cTh8c 8s9sJdJh AcJc4c6s Ah6c4dKs"));
  }

  @Test
  public void test_omaha_holdem_4725_4h5s8dKdTc_Jd9dAs7d_6c6h8c8s_Ac9cKhTs_KsKc7s2h_5cTh2s4c_Ad8hJs6d_4dAhJc6s() {
    assertEquals(
      "Jd9dAs7d 4dAhJc6s Ad8hJs6d 5cTh2s4c Ac9cKhTs 6c6h8c8s KsKc7s2h",
      Solver.process("omaha-holdem 4h5s8dKdTc Jd9dAs7d 6c6h8c8s Ac9cKhTs KsKc7s2h 5cTh2s4c Ad8hJs6d 4dAhJc6s"));
  }

  @Test
  public void test_omaha_holdem_4726_2s4d8c9cKd_Ts5d3hAs_Jd6s9s4s_Kc3c8dJs_7h3s6cKh_JcQcTcKs_Qs8hTh4h_AdTdAc4c_6h9h6d2c() {
    assertEquals(
      "Ts5d3hAs 7h3s6cKh JcQcTcKs AdTdAc4c Qs8hTh4h 6h9h6d2c Jd6s9s4s Kc3c8dJs",
      Solver.process("omaha-holdem 2s4d8c9cKd Ts5d3hAs Jd6s9s4s Kc3c8dJs 7h3s6cKh JcQcTcKs Qs8hTh4h AdTdAc4c 6h9h6d2c"));
  }

  @Test
  public void test_omaha_holdem_4727_5d6c7dAdTc_Qh3s4cKc_2dJc4s9d_8d2s2h9h_8c5h5c8h_2cKsTdQs() {
    assertEquals(
      "2cKsTdQs 8c5h5c8h Qh3s4cKc 8d2s2h9h 2dJc4s9d",
      Solver.process("omaha-holdem 5d6c7dAdTc Qh3s4cKc 2dJc4s9d 8d2s2h9h 8c5h5c8h 2cKsTdQs"));
  }

  @Test
  public void test_omaha_holdem_4728_2d6h7cJdQd_5d2h8d5c_Kh2s6c5h_4d9s5sTc_Kc8s7hKs() {
    assertEquals(
      "4d9s5sTc Kc8s7hKs Kh2s6c5h 5d2h8d5c",
      Solver.process("omaha-holdem 2d6h7cJdQd 5d2h8d5c Kh2s6c5h 4d9s5sTc Kc8s7hKs"));
  }

  @Test
  public void test_omaha_holdem_4729_6d6s9cJdKd_7c7dQd4s_Th8s5sJh_4d8cJs9h_5hAcKh7s_4c2dTcAh_2hAdKcQh_3sJc8d6c_3h9s8h4h() {
    assertEquals(
      "4c2dTcAh 3h9s8h4h Th8s5sJh 4d8cJs9h 2hAdKcQh=5hAcKh7s 7c7dQd4s 3sJc8d6c",
      Solver.process("omaha-holdem 6d6s9cJdKd 7c7dQd4s Th8s5sJh 4d8cJs9h 5hAcKh7s 4c2dTcAh 2hAdKcQh 3sJc8d6c 3h9s8h4h"));
  }

  @Test
  public void test_omaha_holdem_4730_3s6h8cJcJs_2h6sJhKd_Ts2d8s6d_2cTh8dQc_5d3cQd9s_2sTdAsKh_Jd7sTcQh_5h7h4s9d_Ks3d4c7d_5c8h5s9c() {
    assertEquals(
      "5h7h4s9d 2sTdAsKh 5d3cQd9s Ks3d4c7d 5c8h5s9c Ts2d8s6d 2cTh8dQc Jd7sTcQh 2h6sJhKd",
      Solver.process("omaha-holdem 3s6h8cJcJs 2h6sJhKd Ts2d8s6d 2cTh8dQc 5d3cQd9s 2sTdAsKh Jd7sTcQh 5h7h4s9d Ks3d4c7d 5c8h5s9c"));
  }

  @Test
  public void test_omaha_holdem_4731_2s3c3d7sTc_Kc3s5hJh_2cQh9h4h_4c8d6dTd() {
    assertEquals(
      "2cQh9h4h 4c8d6dTd Kc3s5hJh",
      Solver.process("omaha-holdem 2s3c3d7sTc Kc3s5hJh 2cQh9h4h 4c8d6dTd"));
  }

  @Test
  public void test_omaha_holdem_4732_4d6c8sAhKd_Ad5c9dTs_9h7cQsQc_6d2c3cJd_3hJcJhQd_As4s5s5h_3d3s7h7d_6h7s6s2s_TcKcTd9s_Qh4c8d5d() {
    assertEquals(
      "6d2c3cJd 3d3s7h7d 3hJcJhQd 9h7cQsQc TcKcTd9s Ad5c9dTs Qh4c8d5d As4s5s5h 6h7s6s2s",
      Solver.process("omaha-holdem 4d6c8sAhKd Ad5c9dTs 9h7cQsQc 6d2c3cJd 3hJcJhQd As4s5s5h 3d3s7h7d 6h7s6s2s TcKcTd9s Qh4c8d5d"));
  }

  @Test
  public void test_omaha_holdem_4733_3h4d4h5dAh_Kc6cKdJc_2sQs8sJh_8cKh5sQh_8h5h4sAs_Qd3s8dAc_Js5c6dAd_9h7s4c6h() {
    assertEquals(
      "2sQs8sJh Kc6cKdJc Qd3s8dAc Js5c6dAd 9h7s4c6h 8cKh5sQh 8h5h4sAs",
      Solver.process("omaha-holdem 3h4d4h5dAh Kc6cKdJc 2sQs8sJh 8cKh5sQh 8h5h4sAs Qd3s8dAc Js5c6dAd 9h7s4c6h"));
  }

  @Test
  public void test_omaha_holdem_4734_2s6h6s9hJd_Jh7dKsKc_3hQd6d8s_Js3c9c5s_8h4c3dAd_4h2c9d2h_TsTh7cJc() {
    assertEquals(
      "8h4c3dAd TsTh7cJc Js3c9c5s Jh7dKsKc 3hQd6d8s 4h2c9d2h",
      Solver.process("omaha-holdem 2s6h6s9hJd Jh7dKsKc 3hQd6d8s Js3c9c5s 8h4c3dAd 4h2c9d2h TsTh7cJc"));
  }

  @Test
  public void test_omaha_holdem_4735_5c8dAhKdQc_7s3d3h4s_2s2c6cQd() {
    assertEquals(
      "7s3d3h4s 2s2c6cQd",
      Solver.process("omaha-holdem 5c8dAhKdQc 7s3d3h4s 2s2c6cQd"));
  }

  @Test
  public void test_omaha_holdem_4736_4c6h7s9hKd_3hTc5dTh_Jd9dJh3c_6c8hKcQd_Kh3sQs2d_6d5s8d5h() {
    assertEquals(
      "Jd9dJh3c Kh3sQs2d 6c8hKcQd 3hTc5dTh 6d5s8d5h",
      Solver.process("omaha-holdem 4c6h7s9hKd 3hTc5dTh Jd9dJh3c 6c8hKcQd Kh3sQs2d 6d5s8d5h"));
  }

  @Test
  public void test_omaha_holdem_4737_4h7s9dJsKh_Jd2c2sJc_Qh5dKd5s_8d7dAd9s() {
    assertEquals(
      "Qh5dKd5s 8d7dAd9s Jd2c2sJc",
      Solver.process("omaha-holdem 4h7s9dJsKh Jd2c2sJc Qh5dKd5s 8d7dAd9s"));
  }

  @Test
  public void test_omaha_holdem_4738_4s5s7h8sJs_QhAh5h4c_7d6dKh8d_7sQsAd7c_3s4dTdKs_3cAc3d2h_9dJh6c5c_JdAsJc5d_9h6sKd9s_Tc4h2sQd() {
    assertEquals(
      "3cAc3d2h Tc4h2sQd QhAh5h4c JdAsJc5d 7d6dKh8d 9dJh6c5c 9h6sKd9s 7sQsAd7c 3s4dTdKs",
      Solver.process("omaha-holdem 4s5s7h8sJs QhAh5h4c 7d6dKh8d 7sQsAd7c 3s4dTdKs 3cAc3d2h 9dJh6c5c JdAsJc5d 9h6sKd9s Tc4h2sQd"));
  }

  @Test
  public void test_omaha_holdem_4739_2d3c3s9dQs_JcTc2h3d_AcKs3hJh_5sKc6dAs_6s8d6h9c() {
    assertEquals(
      "5sKc6dAs 6s8d6h9c AcKs3hJh JcTc2h3d",
      Solver.process("omaha-holdem 2d3c3s9dQs JcTc2h3d AcKs3hJh 5sKc6dAs 6s8d6h9c"));
  }

  @Test
  public void test_omaha_holdem_4740_3c5c7c8cQs_7s8s6hKs_9c4s9hTc_Kh4d7h6d_Th6s5dAh_Kd5s7dKc_Jc9sJs6c_3s3d2h5h() {
    assertEquals(
      "Th6s5dAh Kd5s7dKc 7s8s6hKs 3s3d2h5h Kh4d7h6d 9c4s9hTc Jc9sJs6c",
      Solver.process("omaha-holdem 3c5c7c8cQs 7s8s6hKs 9c4s9hTc Kh4d7h6d Th6s5dAh Kd5s7dKc Jc9sJs6c 3s3d2h5h"));
  }

  @Test
  public void test_omaha_holdem_4741_5c6s8c8sTh_QhJs3sKd_Ac6hKs2h_Qd4s5s7c() {
    assertEquals(
      "QhJs3sKd Ac6hKs2h Qd4s5s7c",
      Solver.process("omaha-holdem 5c6s8c8sTh QhJs3sKd Ac6hKs2h Qd4s5s7c"));
  }

  @Test
  public void test_omaha_holdem_4742_2h6hAhJdQd_TcJsKd2d_Th2s7s6s_Jh4h4s9d_TdAsAdQh_3hQc3cKh_9hKc3s2c_5c8c5s5h_7c4d7h4c_6c8d5dTs() {
    assertEquals(
      "9hKc3s2c 5c8c5s5h 6c8d5dTs 7c4d7h4c Th2s7s6s TdAsAdQh TcJsKd2d Jh4h4s9d 3hQc3cKh",
      Solver.process("omaha-holdem 2h6hAhJdQd TcJsKd2d Th2s7s6s Jh4h4s9d TdAsAdQh 3hQc3cKh 9hKc3s2c 5c8c5s5h 7c4d7h4c 6c8d5dTs"));
  }

  @Test
  public void test_omaha_holdem_4743_2sAcAsJdQc_Ts9s7h8c_7cThTcJs() {
    assertEquals(
      "Ts9s7h8c 7cThTcJs",
      Solver.process("omaha-holdem 2sAcAsJdQc Ts9s7h8c 7cThTcJs"));
  }

  @Test
  public void test_omaha_holdem_4744_2h4d5hJdKc_Jc2d3c7d_3hJh3d6d_2s9s8s6h() {
    assertEquals(
      "2s9s8s6h Jc2d3c7d 3hJh3d6d",
      Solver.process("omaha-holdem 2h4d5hJdKc Jc2d3c7d 3hJh3d6d 2s9s8s6h"));
  }

  @Test
  public void test_omaha_holdem_4745_4sAcAdAhKd_ThQcTs9d_3d2h8cTc_2dQsKs6s_8d7sQdKc_6c8h9c4h_2c3h7c7h() {
    assertEquals(
      "6c8h9c4h 3d2h8cTc 2dQsKs6s=8d7sQdKc 2c3h7c7h ThQcTs9d",
      Solver.process("omaha-holdem 4sAcAdAhKd ThQcTs9d 3d2h8cTc 2dQsKs6s 8d7sQdKc 6c8h9c4h 2c3h7c7h"));
  }

  @Test
  public void test_omaha_holdem_4746_6c9sAsKhTc_7c5d9dAd_2cJd7s7d_Kd6s5c4d_6h8c8dQh_TdTs4hAh_Jh8s4s3c_3d5sKsQd_Qs2s4c6d_5h9c3sQc() {
    assertEquals(
      "Jh8s4s3c Qs2s4c6d 2cJd7s7d 6h8c8dQh 5h9c3sQc 3d5sKsQd Kd6s5c4d 7c5d9dAd TdTs4hAh",
      Solver.process("omaha-holdem 6c9sAsKhTc 7c5d9dAd 2cJd7s7d Kd6s5c4d 6h8c8dQh TdTs4hAh Jh8s4s3c 3d5sKsQd Qs2s4c6d 5h9c3sQc"));
  }

  @Test
  public void test_omaha_holdem_4747_3s4sJcJhQh_7sAs4c2c_Ts3c7h4h() {
    assertEquals(
      "Ts3c7h4h 7sAs4c2c",
      Solver.process("omaha-holdem 3s4sJcJhQh 7sAs4c2c Ts3c7h4h"));
  }

  @Test
  public void test_omaha_holdem_4748_4s5d6h7cTd_ThTsJs3s_Ac7sQsAd_AhKs3c8d_7d6d5c8c_Kd3dJd3h_4cKhQd6s_9d5h9h8s_4d5sQh2h_JhJc4h7h() {
    assertEquals(
      "AhKs3c8d Kd3dJd3h Ac7sQsAd 4d5sQh2h 4cKhQd6s JhJc4h7h ThTsJs3s 7d6d5c8c 9d5h9h8s",
      Solver.process("omaha-holdem 4s5d6h7cTd ThTsJs3s Ac7sQsAd AhKs3c8d 7d6d5c8c Kd3dJd3h 4cKhQd6s 9d5h9h8s 4d5sQh2h JhJc4h7h"));
  }

  @Test
  public void test_omaha_holdem_4749_2c2d7s8dKc_6sQh7hTc_Ts4hKsJh_Ad4cTd9d_8c9s2s2h_AhKh4s5c_3sTh6h3c_9h5h7c6d_5sAsQdAc_QcKd8h5d() {
    assertEquals(
      "Ad4cTd9d 3sTh6h3c 9h5h7c6d 6sQh7hTc Ts4hKsJh AhKh4s5c QcKd8h5d 5sAsQdAc 8c9s2s2h",
      Solver.process("omaha-holdem 2c2d7s8dKc 6sQh7hTc Ts4hKsJh Ad4cTd9d 8c9s2s2h AhKh4s5c 3sTh6h3c 9h5h7c6d 5sAsQdAc QcKd8h5d"));
  }

}
