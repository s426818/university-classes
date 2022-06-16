
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver22HiddenTest {


  @Test
  public void test_omaha_holdem_5500_3c5h6cKsQc_JdQd7c4h_Th2h4c4s_7hTsAhKd_KcJc9c6h_3hAcQs7d_TcJsAs5d_2s8c5c9s_3dAd6s6d() {
    assertEquals(
      "TcJsAs5d 7hTsAhKd 3hAcQs7d 3dAd6s6d Th2h4c4s JdQd7c4h 2s8c5c9s KcJc9c6h",
      Solver.process("omaha-holdem 3c5h6cKsQc JdQd7c4h Th2h4c4s 7hTsAhKd KcJc9c6h 3hAcQs7d TcJsAs5d 2s8c5c9s 3dAd6s6d"));
  }

  @Test
  public void test_omaha_holdem_5501_3c6c6h7hAd_Ts4d6d9h_5h6s7c7d_4sJs4hJc_5dQc8c2c_5cQh9d3h_7sKc9s2h_AcQs3dTh_9c2s2dKd_KsKh8sTd() {
    assertEquals(
      "5dQc8c2c 9c2s2dKd 5cQh9d3h 7sKc9s2h 4sJs4hJc KsKh8sTd AcQs3dTh Ts4d6d9h 5h6s7c7d",
      Solver.process("omaha-holdem 3c6c6h7hAd Ts4d6d9h 5h6s7c7d 4sJs4hJc 5dQc8c2c 5cQh9d3h 7sKc9s2h AcQs3dTh 9c2s2dKd KsKh8sTd"));
  }

  @Test
  public void test_omaha_holdem_5502_2d2s3d8cAc_KcTs7cAh_8d6h4h9d_Th2h4dAs_9cJh5sQs_7sKd9hQc_3hAd5c3c_6sKs8h7h_6c9s4cJc() {
    assertEquals(
      "6c9s4cJc 9cJh5sQs 7sKd9hQc 8d6h4h9d 6sKs8h7h KcTs7cAh Th2h4dAs 3hAd5c3c",
      Solver.process("omaha-holdem 2d2s3d8cAc KcTs7cAh 8d6h4h9d Th2h4dAs 9cJh5sQs 7sKd9hQc 3hAd5c3c 6sKs8h7h 6c9s4cJc"));
  }

  @Test
  public void test_omaha_holdem_5503_2c3c4h5h6d_3s2s3h4d_4s9d9sKh_As2h8d7c_7d8h3dJs() {
    assertEquals(
      "4s9d9sKh 3s2s3h4d 7d8h3dJs=As2h8d7c",
      Solver.process("omaha-holdem 2c3c4h5h6d 3s2s3h4d 4s9d9sKh As2h8d7c 7d8h3dJs"));
  }

  @Test
  public void test_omaha_holdem_5504_5d6d8cTdTh_5sJs8h3s_KcQcKh7s_2h6sTcJd_3h6h2cAd_9s6cKdAh_JcJhQd9c() {
    assertEquals(
      "3h6h2cAd=9s6cKdAh 5sJs8h3s JcJhQd9c KcQcKh7s 2h6sTcJd",
      Solver.process("omaha-holdem 5d6d8cTdTh 5sJs8h3s KcQcKh7s 2h6sTcJd 3h6h2cAd 9s6cKdAh JcJhQd9c"));
  }

  @Test
  public void test_omaha_holdem_5505_3s8hAhJcTh_Qs2h8cJs_9d2dKhAc_6hJh6d7h_7s7c4cAs_2s9c8d8s() {
    assertEquals(
      "7s7c4cAs 9d2dKhAc Qs2h8cJs 2s9c8d8s 6hJh6d7h",
      Solver.process("omaha-holdem 3s8hAhJcTh Qs2h8cJs 9d2dKhAc 6hJh6d7h 7s7c4cAs 2s9c8d8s"));
  }

  @Test
  public void test_omaha_holdem_5506_6d9hKdQdQs_8h4cTsAc_5dTc8cKs_4dKh7c2d_3c6cAh3s_2c4h2s9c_3d6h2hTh_9s7h7d3h_JcJsKc4s() {
    assertEquals(
      "8h4cTsAc 3d6h2hTh 3c6cAh3s 2c4h2s9c 9s7h7d3h 5dTc8cKs JcJsKc4s 4dKh7c2d",
      Solver.process("omaha-holdem 6d9hKdQdQs 8h4cTsAc 5dTc8cKs 4dKh7c2d 3c6cAh3s 2c4h2s9c 3d6h2hTh 9s7h7d3h JcJsKc4s"));
  }

  @Test
  public void test_omaha_holdem_5507_2c3d8h9hJh_9c2hQh7s_8dQc3sAd_JsKd3cTd_TsKh6dTh_Jd4c7dQs_5sKs2d9s_6s4h6c5d() {
    assertEquals(
      "6s4h6c5d Jd4c7dQs 8dQc3sAd 5sKs2d9s JsKd3cTd 9c2hQh7s TsKh6dTh",
      Solver.process("omaha-holdem 2c3d8h9hJh 9c2hQh7s 8dQc3sAd JsKd3cTd TsKh6dTh Jd4c7dQs 5sKs2d9s 6s4h6c5d"));
  }

  @Test
  public void test_omaha_holdem_5508_5h5sAcKhQc_8d4hJsJd_2h6c9c9d() {
    assertEquals(
      "2h6c9c9d 8d4hJsJd",
      Solver.process("omaha-holdem 5h5sAcKhQc 8d4hJsJd 2h6c9c9d"));
  }

  @Test
  public void test_omaha_holdem_5509_2h8d9dJsKc_5hAs3s2d_Jc6sTdTc_QhQs6c4s_Ks3h3c6d_Ts8c3d7d_7h9s5cQc_Ah7c4c9c() {
    assertEquals(
      "5hAs3s2d 7h9s5cQc Ah7c4c9c Jc6sTdTc QhQs6c4s Ks3h3c6d Ts8c3d7d",
      Solver.process("omaha-holdem 2h8d9dJsKc 5hAs3s2d Jc6sTdTc QhQs6c4s Ks3h3c6d Ts8c3d7d 7h9s5cQc Ah7c4c9c"));
  }

  @Test
  public void test_omaha_holdem_5510_2s4h7c7sJc_Js2c2d5h_4c9h4sKc_7dQhAs9s_Ac2hAh6c_4d6s8sKd_Ks5s6dQd_Td3cKh8h_QsTh3dJd_9c9d5c3h() {
    assertEquals(
      "Td3cKh8h Ks5s6dQd 4d6s8sKd 9c9d5c3h QsTh3dJd Ac2hAh6c 7dQhAs9s Js2c2d5h 4c9h4sKc",
      Solver.process("omaha-holdem 2s4h7c7sJc Js2c2d5h 4c9h4sKc 7dQhAs9s Ac2hAh6c 4d6s8sKd Ks5s6dQd Td3cKh8h QsTh3dJd 9c9d5c3h"));
  }

  @Test
  public void test_omaha_holdem_5511_2d6d9cJhTh_4s6s2h5s_8sTd3sKd_QcKh7cAc() {
    assertEquals(
      "8sTd3sKd 4s6s2h5s QcKh7cAc",
      Solver.process("omaha-holdem 2d6d9cJhTh 4s6s2h5s 8sTd3sKd QcKh7cAc"));
  }

  @Test
  public void test_omaha_holdem_5512_2c4s7cKcTs_5dAc2s8h_9hKs7sTc_KhQh2d8s_Ah4c2hJd_Jc3c8d4d_Kd9sTh7h() {
    assertEquals(
      "5dAc2s8h Ah4c2hJd KhQh2d8s 9hKs7sTc=Kd9sTh7h Jc3c8d4d",
      Solver.process("omaha-holdem 2c4s7cKcTs 5dAc2s8h 9hKs7sTc KhQh2d8s Ah4c2hJd Jc3c8d4d Kd9sTh7h"));
  }

  @Test
  public void test_omaha_holdem_5513_5c6d8cAhQh_Tc8d9d4c_Kd2s7sTh_5dQcQs7h_3s6s7dTs_5s9hJh6h_4sAs6c2c_3h9c2hKh() {
    assertEquals(
      "3h9c2hKh Kd2s7sTh 3s6s7dTs Tc8d9d4c 5s9hJh6h 4sAs6c2c 5dQcQs7h",
      Solver.process("omaha-holdem 5c6d8cAhQh Tc8d9d4c Kd2s7sTh 5dQcQs7h 3s6s7dTs 5s9hJh6h 4sAs6c2c 3h9c2hKh"));
  }

  @Test
  public void test_omaha_holdem_5514_5c7h8c9hKd_2cJh2hTc_7sQs3h6d_Ah2dJc7c() {
    assertEquals(
      "Ah2dJc7c 7sQs3h6d 2cJh2hTc",
      Solver.process("omaha-holdem 5c7h8c9hKd 2cJh2hTc 7sQs3h6d Ah2dJc7c"));
  }

  @Test
  public void test_omaha_holdem_5515_3s5s8sKdQc_5hThJs4c_QsTsAs3d_5cKsJcJh() {
    assertEquals(
      "5hThJs4c 5cKsJcJh QsTsAs3d",
      Solver.process("omaha-holdem 3s5s8sKdQc 5hThJs4c QsTsAs3d 5cKsJcJh"));
  }

  @Test
  public void test_omaha_holdem_5516_4h8d9hJcQh_3d7h5h3c_6c2d9d2c_8cJdAsTh_7c3hJhKd() {
    assertEquals(
      "6c2d9d2c 8cJdAsTh 3d7h5h3c 7c3hJhKd",
      Solver.process("omaha-holdem 4h8d9hJcQh 3d7h5h3c 6c2d9d2c 8cJdAsTh 7c3hJhKd"));
  }

  @Test
  public void test_omaha_holdem_5517_4h7d7sAdQd_5d5hKs4c_9s4s2dTc_2c6d7c3h_8h7h9cQh() {
    assertEquals(
      "9s4s2dTc 5d5hKs4c 2c6d7c3h 8h7h9cQh",
      Solver.process("omaha-holdem 4h7d7sAdQd 5d5hKs4c 9s4s2dTc 2c6d7c3h 8h7h9cQh"));
  }

  @Test
  public void test_omaha_holdem_5518_5h8hAsJdJh_2h5sQd9h_Js7hKd4h_9d4s5c2d() {
    assertEquals(
      "9d4s5c2d Js7hKd4h 2h5sQd9h",
      Solver.process("omaha-holdem 5h8hAsJdJh 2h5sQd9h Js7hKd4h 9d4s5c2d"));
  }

  @Test
  public void test_omaha_holdem_5519_5h7c7hKhTd_7d2sKs9c_2h8hTsQd() {
    assertEquals(
      "2h8hTsQd 7d2sKs9c",
      Solver.process("omaha-holdem 5h7c7hKhTd 7d2sKs9c 2h8hTsQd"));
  }

  @Test
  public void test_omaha_holdem_5520_9d9hAdTcTh_3h8s3cKs_2dKc3d7c() {
    assertEquals(
      "2dKc3d7c 3h8s3cKs",
      Solver.process("omaha-holdem 9d9hAdTcTh 3h8s3cKs 2dKc3d7c"));
  }

  @Test
  public void test_omaha_holdem_5521_3c5d7hAcKs_QdTc5c8h_6dQc7d6s_JhJc3h7c_Ah6h4h5s_9c4cQs9d_2cQh8s5h_9s7s2s2d_Ts4sKc3d_As3sThAd() {
    assertEquals(
      "2cQh8s5h=QdTc5c8h 9s7s2s2d 6dQc7d6s 9c4cQs9d JhJc3h7c Ts4sKc3d As3sThAd Ah6h4h5s",
      Solver.process("omaha-holdem 3c5d7hAcKs QdTc5c8h 6dQc7d6s JhJc3h7c Ah6h4h5s 9c4cQs9d 2cQh8s5h 9s7s2s2d Ts4sKc3d As3sThAd"));
  }

  @Test
  public void test_omaha_holdem_5522_JdKcQhThTs_6c8hKsQs_Qc2s4sAd() {
    assertEquals(
      "6c8hKsQs Qc2s4sAd",
      Solver.process("omaha-holdem JdKcQhThTs 6c8hKsQs Qc2s4sAd"));
  }

  @Test
  public void test_omaha_holdem_5523_2s6c7c7dAd_8dJh3c6s_2c2dAhAs_Kc5dQdKh_Td4s9d5c() {
    assertEquals(
      "Td4s9d5c 8dJh3c6s Kc5dQdKh 2c2dAhAs",
      Solver.process("omaha-holdem 2s6c7c7dAd 8dJh3c6s 2c2dAhAs Kc5dQdKh Td4s9d5c"));
  }

  @Test
  public void test_omaha_holdem_5524_2s7d8hTdTh_AsKc6h7h_TcKdJh3d_6sQd7s3h_Ah3sJdQh() {
    assertEquals(
      "Ah3sJdQh 6sQd7s3h AsKc6h7h TcKdJh3d",
      Solver.process("omaha-holdem 2s7d8hTdTh AsKc6h7h TcKdJh3d 6sQd7s3h Ah3sJdQh"));
  }

  @Test
  public void test_omaha_holdem_5525_5h8s9sAdJd_6h4h4cTh_QcQs7d9c_2s3h3dKd_8h5c6dKc_5s2d9d3c() {
    assertEquals(
      "2s3h3dKd 6h4h4cTh QcQs7d9c 8h5c6dKc 5s2d9d3c",
      Solver.process("omaha-holdem 5h8s9sAdJd 6h4h4cTh QcQs7d9c 2s3h3dKd 8h5c6dKc 5s2d9d3c"));
  }

  @Test
  public void test_omaha_holdem_5526_4d5hJdKhTc_4s8c3h8d_9c4h4c5c() {
    assertEquals(
      "4s8c3h8d 9c4h4c5c",
      Solver.process("omaha-holdem 4d5hJdKhTc 4s8c3h8d 9c4h4c5c"));
  }

  @Test
  public void test_omaha_holdem_5527_2c5h6d8hQh_Kc6cAcQd_2d2s8cTc_9s7sAd5c_AhJhKd6s_4c9dTdJs() {
    assertEquals(
      "4c9dTdJs Kc6cAcQd 2d2s8cTc 9s7sAd5c AhJhKd6s",
      Solver.process("omaha-holdem 2c5h6d8hQh Kc6cAcQd 2d2s8cTc 9s7sAd5c AhJhKd6s 4c9dTdJs"));
  }

  @Test
  public void test_omaha_holdem_5528_7s8c9cJsQs_3h5cQd6c_4d3d5hAh_Ac2s9hTs_Jh4c2d9s_Th2hAs2c_Kc4hKh5d_Td7c8h7d_7hKs8sJd_Jc5sAd8d() {
    assertEquals(
      "4d3d5hAh Th2hAs2c Kc4hKh5d Jc5sAd8d Jh4c2d9s 3h5cQd6c Td7c8h7d Ac2s9hTs 7hKs8sJd",
      Solver.process("omaha-holdem 7s8c9cJsQs 3h5cQd6c 4d3d5hAh Ac2s9hTs Jh4c2d9s Th2hAs2c Kc4hKh5d Td7c8h7d 7hKs8sJd Jc5sAd8d"));
  }

  @Test
  public void test_omaha_holdem_5529_2c4h6cAsQd_8c5d4c3c_5s3d5hAh_3h9s2d7s() {
    assertEquals(
      "3h9s2d7s 5s3d5hAh=8c5d4c3c",
      Solver.process("omaha-holdem 2c4h6cAsQd 8c5d4c3c 5s3d5hAh 3h9s2d7s"));
  }

  @Test
  public void test_omaha_holdem_5530_2s5s7cQsTs_9c9dAs8c_3dJdKc2c_3s2h9sJs_6cKhTd4d_Ah3hJh4s_Ad8sQhKd_QcTc4cTh_Jc8h3c5d() {
    assertEquals(
      "Ah3hJh4s 3dJdKc2c Jc8h3c5d 9c9dAs8c 6cKhTd4d Ad8sQhKd QcTc4cTh 3s2h9sJs",
      Solver.process("omaha-holdem 2s5s7cQsTs 9c9dAs8c 3dJdKc2c 3s2h9sJs 6cKhTd4d Ah3hJh4s Ad8sQhKd QcTc4cTh Jc8h3c5d"));
  }

  @Test
  public void test_omaha_holdem_5531_5d8cJhQhTc_TsJd6c3s_2d3d4h7s_7h7dAhAc_8h4c2cQc() {
    assertEquals(
      "2d3d4h7s 7h7dAhAc TsJd6c3s 8h4c2cQc",
      Solver.process("omaha-holdem 5d8cJhQhTc TsJd6c3s 2d3d4h7s 7h7dAhAc 8h4c2cQc"));
  }

  @Test
  public void test_omaha_holdem_5532_2h5c5dKdQc_Jc9dTsTd_2s8s9s5s() {
    assertEquals(
      "Jc9dTsTd 2s8s9s5s",
      Solver.process("omaha-holdem 2h5c5dKdQc Jc9dTsTd 2s8s9s5s"));
  }

  @Test
  public void test_omaha_holdem_5533_2h4d9sKhQh_8s6c4hTd_2s9hTh2d() {
    assertEquals(
      "8s6c4hTd 2s9hTh2d",
      Solver.process("omaha-holdem 2h4d9sKhQh 8s6c4hTd 2s9hTh2d"));
  }

  @Test
  public void test_omaha_holdem_5534_6d6s9dAhJd_7cKhQh3d_5sKs8h7h_6c8d4h7d_AsKcTdQs_Ad8sJc2d_Js3c9c5d_9hQc4c3s_5c2h2cAc_4s4d9sKd() {
    assertEquals(
      "5sKs8h7h 7cKhQh3d 9hQc4c3s Js3c9c5d 5c2h2cAc AsKcTdQs 6c8d4h7d 4s4d9sKd Ad8sJc2d",
      Solver.process("omaha-holdem 6d6s9dAhJd 7cKhQh3d 5sKs8h7h 6c8d4h7d AsKcTdQs Ad8sJc2d Js3c9c5d 9hQc4c3s 5c2h2cAc 4s4d9sKd"));
  }

  @Test
  public void test_omaha_holdem_5535_2d3c7c8sTd_9d8cAhQc_Kc9sTh2h_7s5c9hQd_3hKs3d7d_7hQh6s4s_4hJcJhQs_4c2cJd5s() {
    assertEquals(
      "4c2cJd5s 7hQh6s4s=7s5c9hQd 9d8cAhQc 4hJcJhQs Kc9sTh2h 3hKs3d7d",
      Solver.process("omaha-holdem 2d3c7c8sTd 9d8cAhQc Kc9sTh2h 7s5c9hQd 3hKs3d7d 7hQh6s4s 4hJcJhQs 4c2cJd5s"));
  }

  @Test
  public void test_omaha_holdem_5536_2h3d4s7hKh_2sAsTcQc_Qd8c4cJs_AcTdAdKs() {
    assertEquals(
      "2sAsTcQc Qd8c4cJs AcTdAdKs",
      Solver.process("omaha-holdem 2h3d4s7hKh 2sAsTcQc Qd8c4cJs AcTdAdKs"));
  }

  @Test
  public void test_omaha_holdem_5537_3s4h8h9hJd_Th6d7h9c_2dJc5dKd_Qh2s5c2c_KsJs6h5h_Kh7sQs7d() {
    assertEquals(
      "Qh2s5c2c Kh7sQs7d 2dJc5dKd KsJs6h5h Th6d7h9c",
      Solver.process("omaha-holdem 3s4h8h9hJd Th6d7h9c 2dJc5dKd Qh2s5c2c KsJs6h5h Kh7sQs7d"));
  }

  @Test
  public void test_omaha_holdem_5538_3c4d6h7cAc_TcQs9dTs_5h8c5d8d_6s2s3sJh_4c7h9hJd_QcKdAsKs() {
    assertEquals(
      "TcQs9dTs QcKdAsKs 6s2s3sJh 4c7h9hJd 5h8c5d8d",
      Solver.process("omaha-holdem 3c4d6h7cAc TcQs9dTs 5h8c5d8d 6s2s3sJh 4c7h9hJd QcKdAsKs"));
  }

  @Test
  public void test_omaha_holdem_5539_6c6d9hJsTc_3h5s8c4d_KdTd8dAs_Jd7d7cQh_6sKh5d2d_6hJhKcJc_3d7sQsTs() {
    assertEquals(
      "3h5s8c4d 3d7sQsTs KdTd8dAs Jd7d7cQh 6sKh5d2d 6hJhKcJc",
      Solver.process("omaha-holdem 6c6d9hJsTc 3h5s8c4d KdTd8dAs Jd7d7cQh 6sKh5d2d 6hJhKcJc 3d7sQsTs"));
  }

  @Test
  public void test_omaha_holdem_5540_2s5s6c8cJs_7dAd3d5d_6d4dKd6s_2d9d3hKc() {
    assertEquals(
      "2d9d3hKc 7dAd3d5d 6d4dKd6s",
      Solver.process("omaha-holdem 2s5s6c8cJs 7dAd3d5d 6d4dKd6s 2d9d3hKc"));
  }

  @Test
  public void test_omaha_holdem_5541_2h4s6c6sJs_3c3h9dTc_Kc7cAcQd_2sJc9sJh_4h8dJdTs_3dAsKs2c_5cQc4c9h_TdKd8s8h_4d8cAhAd_7d5h9c3s() {
    assertEquals(
      "Kc7cAcQd 3c3h9dTc 5cQc4c9h TdKd8s8h 4h8dJdTs 4d8cAhAd 7d5h9c3s 3dAsKs2c 2sJc9sJh",
      Solver.process("omaha-holdem 2h4s6c6sJs 3c3h9dTc Kc7cAcQd 2sJc9sJh 4h8dJdTs 3dAsKs2c 5cQc4c9h TdKd8s8h 4d8cAhAd 7d5h9c3s"));
  }

  @Test
  public void test_omaha_holdem_5542_4h4s8c9sTc_QhKs7h5d_QsJs3s8s_4cQcAd3d_5c9d9h6s_5sTdQd3c_Ts2s4dJh() {
    assertEquals(
      "QhKs7h5d 5sTdQd3c 4cQcAd3d QsJs3s8s Ts2s4dJh 5c9d9h6s",
      Solver.process("omaha-holdem 4h4s8c9sTc QhKs7h5d QsJs3s8s 4cQcAd3d 5c9d9h6s 5sTdQd3c Ts2s4dJh"));
  }

  @Test
  public void test_omaha_holdem_5543_3s5c5sKhQh_7h8c5h9c_TdAdThQd_Qs2sJsKd_6hTc2c5d_4c8dAc3d_9s7dJhKs_4h4d3cJc() {
    assertEquals(
      "4c8dAc3d 4h4d3cJc TdAdThQd 9s7dJhKs Qs2sJsKd 7h8c5h9c 6hTc2c5d",
      Solver.process("omaha-holdem 3s5c5sKhQh 7h8c5h9c TdAdThQd Qs2sJsKd 6hTc2c5d 4c8dAc3d 9s7dJhKs 4h4d3cJc"));
  }

  @Test
  public void test_omaha_holdem_5544_2d2h4d7sAd_KhAs9hKd_4cJc4h3s_Tc7cQhTh_7h6cJs5h_2s6hQc5d_KsTsTd3h() {
    assertEquals(
      "7h6cJs5h KsTsTd3h=Tc7cQhTh KhAs9hKd 2s6hQc5d 4cJc4h3s",
      Solver.process("omaha-holdem 2d2h4d7sAd KhAs9hKd 4cJc4h3s Tc7cQhTh 7h6cJs5h 2s6hQc5d KsTsTd3h"));
  }

  @Test
  public void test_omaha_holdem_5545_8c8sJhKcQc_9h3c7s3s_Ks3h5s6d() {
    assertEquals(
      "9h3c7s3s Ks3h5s6d",
      Solver.process("omaha-holdem 8c8sJhKcQc 9h3c7s3s Ks3h5s6d"));
  }

  @Test
  public void test_omaha_holdem_5546_4c7d8c8hAh_6dTs9sJh_Th5d3c7h() {
    assertEquals(
      "6dTs9sJh Th5d3c7h",
      Solver.process("omaha-holdem 4c7d8c8hAh 6dTs9sJh Th5d3c7h"));
  }

  @Test
  public void test_omaha_holdem_5547_4h7d8hAsJd_2d4c4d2s_5cQh3d6h_8d6dTdAd_9d9s6s3c_7sQsTcKh_9h9c8cTs_2cAhAcJs_5dQc7hTh_5s3sKdKc() {
    assertEquals(
      "5dQc7hTh 7sQsTcKh 9d9s6s3c 5s3sKdKc 8d6dTdAd 2d4c4d2s 2cAhAcJs 5cQh3d6h 9h9c8cTs",
      Solver.process("omaha-holdem 4h7d8hAsJd 2d4c4d2s 5cQh3d6h 8d6dTdAd 9d9s6s3c 7sQsTcKh 9h9c8cTs 2cAhAcJs 5dQc7hTh 5s3sKdKc"));
  }

  @Test
  public void test_omaha_holdem_5548_3d6h8sJdTh_Ts2d3s8h_QcAdAhTc_JsAs4hKh_5d9h3c9s() {
    assertEquals(
      "5d9h3c9s JsAs4hKh QcAdAhTc Ts2d3s8h",
      Solver.process("omaha-holdem 3d6h8sJdTh Ts2d3s8h QcAdAhTc JsAs4hKh 5d9h3c9s"));
  }

  @Test
  public void test_omaha_holdem_5549_2c7h9sJcQc_Jh2d3h5c_6c5s3d9h_6d2h9cKh_4cJd8sKd_6s4s8dAh_7d8h7c4h_5hAsJsQh_2s3c3s7s() {
    assertEquals(
      "6s4s8dAh 6c5s3d9h 4cJd8sKd 2s3c3s7s 6d2h9cKh Jh2d3h5c 5hAsJsQh 7d8h7c4h",
      Solver.process("omaha-holdem 2c7h9sJcQc Jh2d3h5c 6c5s3d9h 6d2h9cKh 4cJd8sKd 6s4s8dAh 7d8h7c4h 5hAsJsQh 2s3c3s7s"));
  }

  @Test
  public void test_omaha_holdem_5550_8s9hAsQcQd_KdJh8h7h_5c4s7cJd_5hAdAcTs() {
    assertEquals(
      "5c4s7cJd KdJh8h7h 5hAdAcTs",
      Solver.process("omaha-holdem 8s9hAsQcQd KdJh8h7h 5c4s7cJd 5hAdAcTs"));
  }

  @Test
  public void test_omaha_holdem_5551_3s5d6d8hQd_8cAsJh7d_Js3c9d2s() {
    assertEquals(
      "Js3c9d2s 8cAsJh7d",
      Solver.process("omaha-holdem 3s5d6d8hQd 8cAsJh7d Js3c9d2s"));
  }

  @Test
  public void test_omaha_holdem_5552_2c5sJdJhQc_Kd7s9cAd_8s5h7c3h_Ac2sKs5c_7d6s4d7h_2d4c5d6h_9hTh3s9s_8hTd2h6d() {
    assertEquals(
      "Kd7s9cAd 8hTd2h6d 2d4c5d6h 8s5h7c3h Ac2sKs5c 7d6s4d7h 9hTh3s9s",
      Solver.process("omaha-holdem 2c5sJdJhQc Kd7s9cAd 8s5h7c3h Ac2sKs5c 7d6s4d7h 2d4c5d6h 9hTh3s9s 8hTd2h6d"));
  }

  @Test
  public void test_omaha_holdem_5553_2c6d7d9sAd_3d7s6s2s_Ah9dKd4s_TcKh5dTd_JdKcTsTh_4hAc8hJh() {
    assertEquals(
      "JdKcTsTh 4hAc8hJh 3d7s6s2s TcKh5dTd Ah9dKd4s",
      Solver.process("omaha-holdem 2c6d7d9sAd 3d7s6s2s Ah9dKd4s TcKh5dTd JdKcTsTh 4hAc8hJh"));
  }

  @Test
  public void test_omaha_holdem_5554_6d6s8s9cJs_AhKdQd3c_7c2h8c7h_Th9d5dJd_4s3dJh9s_8hAdTs2s_QcAs7sAc_6h5s4c5h_JcTc8d6c() {
    assertEquals(
      "AhKdQd3c 7c2h8c7h Th9d5dJd 6h5s4c5h 4s3dJh9s 8hAdTs2s QcAs7sAc JcTc8d6c",
      Solver.process("omaha-holdem 6d6s8s9cJs AhKdQd3c 7c2h8c7h Th9d5dJd 4s3dJh9s 8hAdTs2s QcAs7sAc 6h5s4c5h JcTc8d6c"));
  }

  @Test
  public void test_omaha_holdem_5555_2c9cJcKdKs_6dAcTcJd_3d8d5s9h() {
    assertEquals(
      "3d8d5s9h 6dAcTcJd",
      Solver.process("omaha-holdem 2c9cJcKdKs 6dAcTcJd 3d8d5s9h"));
  }

  @Test
  public void test_omaha_holdem_5556_2c2s3s4s7d_AcQcJd4d_KcJh4h6h_9cKh9d6c() {
    assertEquals(
      "KcJh4h6h AcQcJd4d 9cKh9d6c",
      Solver.process("omaha-holdem 2c2s3s4s7d AcQcJd4d KcJh4h6h 9cKh9d6c"));
  }

  @Test
  public void test_omaha_holdem_5557_2c4d8hAsTd_TcQh8dKh_6dAd5s2d_4hQdJs5d_5c2h9dQc_9cKsJh5h_Ts7s3h3c_7cKd3s4c_JdKcTh8c() {
    assertEquals(
      "9cKsJh5h 5c2h9dQc 4hQdJs5d 7cKd3s4c Ts7s3h3c JdKcTh8c=TcQh8dKh 6dAd5s2d",
      Solver.process("omaha-holdem 2c4d8hAsTd TcQh8dKh 6dAd5s2d 4hQdJs5d 5c2h9dQc 9cKsJh5h Ts7s3h3c 7cKd3s4c JdKcTh8c"));
  }

  @Test
  public void test_omaha_holdem_5558_2d5cJhKcQs_3h3d5sJd_Kd4sQd4c_4h8dQc7c_8sAdTc4d_As8hJsTd_5d9cAcJc_2hAhTh6c() {
    assertEquals(
      "4h8dQc7c 3h3d5sJd=5d9cAcJc Kd4sQd4c 2hAhTh6c=8sAdTc4d=As8hJsTd",
      Solver.process("omaha-holdem 2d5cJhKcQs 3h3d5sJd Kd4sQd4c 4h8dQc7c 8sAdTc4d As8hJsTd 5d9cAcJc 2hAhTh6c"));
  }

  @Test
  public void test_omaha_holdem_5559_8c9dJcKcTh_3d9sKhTc_2s5c4hQc() {
    assertEquals(
      "3d9sKhTc 2s5c4hQc",
      Solver.process("omaha-holdem 8c9dJcKcTh 3d9sKhTc 2s5c4hQc"));
  }

  @Test
  public void test_omaha_holdem_5560_5d6c6dKsQs_5cJh2s3d_5s4hQh7d_4dKhAd3s_7cAsJd5h_Kc9h2d2h_Kd6sQcTd_8s8c2c3c() {
    assertEquals(
      "5cJh2s3d 7cAsJd5h 8s8c2c3c 5s4hQh7d Kc9h2d2h 4dKhAd3s Kd6sQcTd",
      Solver.process("omaha-holdem 5d6c6dKsQs 5cJh2s3d 5s4hQh7d 4dKhAd3s 7cAsJd5h Kc9h2d2h Kd6sQcTd 8s8c2c3c"));
  }

  @Test
  public void test_omaha_holdem_5561_2c3c3d8hTc_8sJh9cQd_KhTd6hAc_TsJcJs3h_Ks8c7h7d_Qs4s5h6d_4dAhTh4h_5d7c5sAs() {
    assertEquals(
      "Qs4s5h6d 5d7c5sAs 8sJh9cQd Ks8c7h7d 4dAhTh4h=KhTd6hAc TsJcJs3h",
      Solver.process("omaha-holdem 2c3c3d8hTc 8sJh9cQd KhTd6hAc TsJcJs3h Ks8c7h7d Qs4s5h6d 4dAhTh4h 5d7c5sAs"));
  }

  @Test
  public void test_omaha_holdem_5562_3h9dAsQsTs_2c4s5d5s_8h9s4d3d_8d9hJsJh() {
    assertEquals(
      "8h9s4d3d 8d9hJsJh 2c4s5d5s",
      Solver.process("omaha-holdem 3h9dAsQsTs 2c4s5d5s 8h9s4d3d 8d9hJsJh"));
  }

  @Test
  public void test_omaha_holdem_5563_3h7h9dAhQd_2d2s4d7d_Ks7sQs8s() {
    assertEquals(
      "2d2s4d7d Ks7sQs8s",
      Solver.process("omaha-holdem 3h7h9dAhQd 2d2s4d7d Ks7sQs8s"));
  }

  @Test
  public void test_omaha_holdem_5564_3s9cJcTdTh_5sQd7cAs_Ac6h9sJh_8s8hJd7h_2dJs8c5c_Ks2c2s3c_2h3d5hKd_KcKh7dQh_TcAhTs7s_5d9h9d4d() {
    assertEquals(
      "5sQd7cAs 2h3d5hKd=Ks2c2s3c 2dJs8c5c Ac6h9sJh 8s8hJd7h KcKh7dQh 5d9h9d4d TcAhTs7s",
      Solver.process("omaha-holdem 3s9cJcTdTh 5sQd7cAs Ac6h9sJh 8s8hJd7h 2dJs8c5c Ks2c2s3c 2h3d5hKd KcKh7dQh TcAhTs7s 5d9h9d4d"));
  }

  @Test
  public void test_omaha_holdem_5565_9c9sAcJsTd_7d3cJcJd_Ad9d4sJh_7sTc6c4c_8s4h2d6d_Th7h5dAs_KhKc9h8d_Ah3sKs5s_5hQs7c2h() {
    assertEquals(
      "8s4h2d6d 5hQs7c2h 7sTc6c4c Ah3sKs5s Th7h5dAs KhKc9h8d Ad9d4sJh 7d3cJcJd",
      Solver.process("omaha-holdem 9c9sAcJsTd 7d3cJcJd Ad9d4sJh 7sTc6c4c 8s4h2d6d Th7h5dAs KhKc9h8d Ah3sKs5s 5hQs7c2h"));
  }

  @Test
  public void test_omaha_holdem_5566_2s5h8hJhTc_3hJs9c4d_5d8dKdTh_7cQs3dJc() {
    assertEquals(
      "3hJs9c4d 7cQs3dJc 5d8dKdTh",
      Solver.process("omaha-holdem 2s5h8hJhTc 3hJs9c4d 5d8dKdTh 7cQs3dJc"));
  }

  @Test
  public void test_omaha_holdem_5567_4h6cJsKcTc_8dJh7d9s_Kd9hAdAs() {
    assertEquals(
      "8dJh7d9s Kd9hAdAs",
      Solver.process("omaha-holdem 4h6cJsKcTc 8dJh7d9s Kd9hAdAs"));
  }

  @Test
  public void test_omaha_holdem_5568_6s8h9cAcAd_3s6hKcQd_Qs4sJhQc_3d5cAh7s_8d8sAs5s_2d7h2h4h_Jc7cKh7d_3c6c3h9s_Ts5h4d4c() {
    assertEquals(
      "2d7h2h4h Ts5h4d4c 3s6hKcQd Jc7cKh7d 3c6c3h9s Qs4sJhQc 3d5cAh7s 8d8sAs5s",
      Solver.process("omaha-holdem 6s8h9cAcAd 3s6hKcQd Qs4sJhQc 3d5cAh7s 8d8sAs5s 2d7h2h4h Jc7cKh7d 3c6c3h9s Ts5h4d4c"));
  }

  @Test
  public void test_omaha_holdem_5569_2hJdJsQhTs_Ac6h5s3h_7sJc8c2d_KsKd7d9h() {
    assertEquals(
      "Ac6h5s3h KsKd7d9h 7sJc8c2d",
      Solver.process("omaha-holdem 2hJdJsQhTs Ac6h5s3h 7sJc8c2d KsKd7d9h"));
  }

  @Test
  public void test_omaha_holdem_5570_2d2s3h6cTh_4hAhJdAs_7cAd4d9s_Td2hJs5c() {
    assertEquals(
      "7cAd4d9s 4hAhJdAs Td2hJs5c",
      Solver.process("omaha-holdem 2d2s3h6cTh 4hAhJdAs 7cAd4d9s Td2hJs5c"));
  }

  @Test
  public void test_omaha_holdem_5571_6c7c9d9sAh_5sJc5h2h_Kd8dJdAs_6d5c3h7d_3sQs2c7h_QdAdKh8c() {
    assertEquals(
      "5sJc5h2h 6d5c3h7d 3sQs2c7h Kd8dJdAs=QdAdKh8c",
      Solver.process("omaha-holdem 6c7c9d9sAh 5sJc5h2h Kd8dJdAs 6d5c3h7d 3sQs2c7h QdAdKh8c"));
  }

  @Test
  public void test_omaha_holdem_5572_2s5s8c9dTh_4hAc6h2h_AdQh5c5d_4sTdTc2c_6c5h3d4d_TsKs7h3h_7s9s7cJs_8hQsKhJh() {
    assertEquals(
      "4hAc6h2h 6c5h3d4d TsKs7h3h AdQh5c5d 4sTdTc2c 7s9s7cJs 8hQsKhJh",
      Solver.process("omaha-holdem 2s5s8c9dTh 4hAc6h2h AdQh5c5d 4sTdTc2c 6c5h3d4d TsKs7h3h 7s9s7cJs 8hQsKhJh"));
  }

  @Test
  public void test_omaha_holdem_5573_5s6s9dAcQh_Ah6c6d5h_5dQcTc4d_Ad2s4cTh_2hJcQs4s_7sKsTs2d_8sAsKh3d_9s3h3s7c_2cKc4hQd_5c9c9hJs() {
    assertEquals(
      "7sKsTs2d 9s3h3s7c 2hJcQs4s 2cKc4hQd Ad2s4cTh 8sAsKh3d 5dQcTc4d Ah6c6d5h 5c9c9hJs",
      Solver.process("omaha-holdem 5s6s9dAcQh Ah6c6d5h 5dQcTc4d Ad2s4cTh 2hJcQs4s 7sKsTs2d 8sAsKh3d 9s3h3s7c 2cKc4hQd 5c9c9hJs"));
  }

  @Test
  public void test_omaha_holdem_5574_3h7h9hKdTh_TsTc5d9c_Qh7s8d9d_9sAdJhKc() {
    assertEquals(
      "Qh7s8d9d 9sAdJhKc TsTc5d9c",
      Solver.process("omaha-holdem 3h7h9hKdTh TsTc5d9c Qh7s8d9d 9sAdJhKc"));
  }

  @Test
  public void test_omaha_holdem_5575_2c7c9sAsJh_2h3hKh5c_2d2s7d8s_6cTc4dKc_9h3d4sTh() {
    assertEquals(
      "6cTc4dKc 2h3hKh5c 9h3d4sTh 2d2s7d8s",
      Solver.process("omaha-holdem 2c7c9sAsJh 2h3hKh5c 2d2s7d8s 6cTc4dKc 9h3d4sTh"));
  }

  @Test
  public void test_omaha_holdem_5576_5h6s7hJhKd_4sAh2cJc_8c9hKcTs_3c6c8hJd_Td8dQs3h_9d4h7c4c_Ad5c3s4d_7d2d7s8s_QhKsJs3d() {
    assertEquals(
      "Td8dQs3h 9d4h7c4c 4sAh2cJc 3c6c8hJd QhKsJs3d 7d2d7s8s Ad5c3s4d 8c9hKcTs",
      Solver.process("omaha-holdem 5h6s7hJhKd 4sAh2cJc 8c9hKcTs 3c6c8hJd Td8dQs3h 9d4h7c4c Ad5c3s4d 7d2d7s8s QhKsJs3d"));
  }

  @Test
  public void test_omaha_holdem_5577_5c9dAcKdQs_5d7h6dTs_Jh7c6h6s_Td2c4cTc_Ad5h9s7s_Qh3d8c3c_8sJc4d2d_9hAs3hTh() {
    assertEquals(
      "8sJc4d2d 5d7h6dTs Jh7c6h6s Td2c4cTc Qh3d8c3c 9hAs3hTh=Ad5h9s7s",
      Solver.process("omaha-holdem 5c9dAcKdQs 5d7h6dTs Jh7c6h6s Td2c4cTc Ad5h9s7s Qh3d8c3c 8sJc4d2d 9hAs3hTh"));
  }

  @Test
  public void test_omaha_holdem_5578_6c8sJdJhQd_AdAc6h3d_3hKd5d9h_2d8dTc5s_Qh9s6d2c_7cAhTs4h_4d4s2h3c_AsQcKcJc() {
    assertEquals(
      "3hKd5d9h 7cAhTs4h 4d4s2h3c 2d8dTc5s Qh9s6d2c AdAc6h3d AsQcKcJc",
      Solver.process("omaha-holdem 6c8sJdJhQd AdAc6h3d 3hKd5d9h 2d8dTc5s Qh9s6d2c 7cAhTs4h 4d4s2h3c AsQcKcJc"));
  }

  @Test
  public void test_omaha_holdem_5579_3s5d6c8sKs_3h2sThKd_9s8c5cAc_JhJs3cKc() {
    assertEquals(
      "9s8c5cAc 3h2sThKd=JhJs3cKc",
      Solver.process("omaha-holdem 3s5d6c8sKs 3h2sThKd 9s8c5cAc JhJs3cKc"));
  }

  @Test
  public void test_omaha_holdem_5580_3cAsJsThTs_2cKc9d8s_4d2dKs5h_Ah8cQs3d_7hTd7dJd_6cQc9c4h_Jh3sKhJc_2h7sKd2s() {
    assertEquals(
      "6cQc9c4h 4d2dKs5h 2cKc9d8s Ah8cQs3d 2h7sKd2s 7hTd7dJd Jh3sKhJc",
      Solver.process("omaha-holdem 3cAsJsThTs 2cKc9d8s 4d2dKs5h Ah8cQs3d 7hTd7dJd 6cQc9c4h Jh3sKhJc 2h7sKd2s"));
  }

  @Test
  public void test_omaha_holdem_5581_5c6d6h7s8s_2s8dQhQs_9d3s8h2d_TcTd4c6c() {
    assertEquals(
      "2s8dQhQs TcTd4c6c 9d3s8h2d",
      Solver.process("omaha-holdem 5c6d6h7s8s 2s8dQhQs 9d3s8h2d TcTd4c6c"));
  }

  @Test
  public void test_omaha_holdem_5582_2c6s9c9sJd_JhAhKd8c_6hAd4sTc_Ts4hQdAs_6c7d8s7s() {
    assertEquals(
      "Ts4hQdAs 6hAd4sTc 6c7d8s7s JhAhKd8c",
      Solver.process("omaha-holdem 2c6s9c9sJd JhAhKd8c 6hAd4sTc Ts4hQdAs 6c7d8s7s"));
  }

  @Test
  public void test_omaha_holdem_5583_3d5h6dJdQh_Ad7s5cAs_7d7c9d8h() {
    assertEquals(
      "Ad7s5cAs 7d7c9d8h",
      Solver.process("omaha-holdem 3d5h6dJdQh Ad7s5cAs 7d7c9d8h"));
  }

  @Test
  public void test_omaha_holdem_5584_4d9d9hAcJc_7s3hAh5s_Qd6c9cAs_7c6hQh4h_3s7dThKs() {
    assertEquals(
      "3s7dThKs 7c6hQh4h 7s3hAh5s Qd6c9cAs",
      Solver.process("omaha-holdem 4d9d9hAcJc 7s3hAh5s Qd6c9cAs 7c6hQh4h 3s7dThKs"));
  }

  @Test
  public void test_omaha_holdem_5585_2c4hKdTcTd_Kh4c7s6h_3h2hAcQd_QsTs8h2s_3c7d5d5s_AhJs2d9c_Ks6c9s5h_8c3sThKc() {
    assertEquals(
      "3h2hAcQd=AhJs2d9c 3c7d5d5s Kh4c7s6h Ks6c9s5h QsTs8h2s 8c3sThKc",
      Solver.process("omaha-holdem 2c4hKdTcTd Kh4c7s6h 3h2hAcQd QsTs8h2s 3c7d5d5s AhJs2d9c Ks6c9s5h 8c3sThKc"));
  }

  @Test
  public void test_omaha_holdem_5586_2c3cJsKsQh_5h9h5sAs_2hTdAd6c_8d6hJcQs() {
    assertEquals(
      "5h9h5sAs 8d6hJcQs 2hTdAd6c",
      Solver.process("omaha-holdem 2c3cJsKsQh 5h9h5sAs 2hTdAd6c 8d6hJcQs"));
  }

  @Test
  public void test_omaha_holdem_5587_3c4h6cKsQd_Ah7h8d8c_4dJd6d5s_7c5c6h8h_9c9d9s5h_Ts4sKd3s_8s9hQc7d_JcAcJs5d_Tc6s3h2c() {
    assertEquals(
      "Ah7h8d8c 9c9d9s5h JcAcJs5d 8s9hQc7d Tc6s3h2c 4dJd6d5s Ts4sKd3s 7c5c6h8h",
      Solver.process("omaha-holdem 3c4h6cKsQd Ah7h8d8c 4dJd6d5s 7c5c6h8h 9c9d9s5h Ts4sKd3s 8s9hQc7d JcAcJs5d Tc6s3h2c"));
  }

  @Test
  public void test_omaha_holdem_5588_5c8c8dAcQs_Th4dAhQd_2c6c9cTc_Td5d6s6d_8h5sKc7c_3h4h2hJd_9sJc3sJh_7d3dTs6h() {
    assertEquals(
      "7d3dTs6h 3h4h2hJd Td5d6s6d 9sJc3sJh Th4dAhQd 2c6c9cTc 8h5sKc7c",
      Solver.process("omaha-holdem 5c8c8dAcQs Th4dAhQd 2c6c9cTc Td5d6s6d 8h5sKc7c 3h4h2hJd 9sJc3sJh 7d3dTs6h"));
  }

  @Test
  public void test_omaha_holdem_5589_2c2d6sAcTh_8d6hQsQh_9c6cJhJs_9hTs3sKd_Qc5dQd3c_7h8h7s7d() {
    assertEquals(
      "7h8h7s7d 9hTs3sKd 9c6cJhJs 8d6hQsQh=Qc5dQd3c",
      Solver.process("omaha-holdem 2c2d6sAcTh 8d6hQsQh 9c6cJhJs 9hTs3sKd Qc5dQd3c 7h8h7s7d"));
  }

  @Test
  public void test_omaha_holdem_5590_2h3d5c5dTc_Kh4hJsQc_7h6h4s2s_3c6c8s8d_7sAs5s9d_AdKs6d6s_Qh4dAhJh_Jc9c9hQs() {
    assertEquals(
      "Kh4hJsQc AdKs6d6s 3c6c8s8d Jc9c9hQs 7sAs5s9d Qh4dAhJh 7h6h4s2s",
      Solver.process("omaha-holdem 2h3d5c5dTc Kh4hJsQc 7h6h4s2s 3c6c8s8d 7sAs5s9d AdKs6d6s Qh4dAhJh Jc9c9hQs"));
  }

  @Test
  public void test_omaha_holdem_5591_2h3h6hAsJs_8cKh2d9h_2c5h7h8h_Jc4cJd8d_QcTs4hQs_AhTd7c2s_3c6s8s9c_9sQdKs5c_Th4dJh5d() {
    assertEquals(
      "9sQdKs5c QcTs4hQs 3c6s8s9c AhTd7c2s Jc4cJd8d 2c5h7h8h Th4dJh5d 8cKh2d9h",
      Solver.process("omaha-holdem 2h3h6hAsJs 8cKh2d9h 2c5h7h8h Jc4cJd8d QcTs4hQs AhTd7c2s 3c6s8s9c 9sQdKs5c Th4dJh5d"));
  }

  @Test
  public void test_omaha_holdem_5592_3h4c6cJdQc_3d7cTs2s_Kh2h4s9c_5d8sTcKc_As8dAd8c_4d2cQd6d_5sTd8h6h_4h9h2d7s() {
    assertEquals(
      "3d7cTs2s 4h9h2d7s Kh2h4s9c 5sTd8h6h As8dAd8c 4d2cQd6d 5d8sTcKc",
      Solver.process("omaha-holdem 3h4c6cJdQc 3d7cTs2s Kh2h4s9c 5d8sTcKc As8dAd8c 4d2cQd6d 5sTd8h6h 4h9h2d7s"));
  }

  @Test
  public void test_omaha_holdem_5593_2d8sJdKdQc_Ac7s2cTh_Qs6h3cKc_Td5sQd3s_9s4h8hKh() {
    assertEquals(
      "9s4h8hKh Qs6h3cKc Ac7s2cTh Td5sQd3s",
      Solver.process("omaha-holdem 2d8sJdKdQc Ac7s2cTh Qs6h3cKc Td5sQd3s 9s4h8hKh"));
  }

  @Test
  public void test_omaha_holdem_5594_5c7s9cJsKd_TdJd2c6d_5s9h3c8h_4c7c7dJc_4d2h3d8d_As3hAh7h_TsTcQhQc_Qd8c3sKc_KsJh6h4s() {
    assertEquals(
      "4d2h3d8d TdJd2c6d Qd8c3sKc As3hAh7h 5s9h3c8h KsJh6h4s 4c7c7dJc TsTcQhQc",
      Solver.process("omaha-holdem 5c7s9cJsKd TdJd2c6d 5s9h3c8h 4c7c7dJc 4d2h3d8d As3hAh7h TsTcQhQc Qd8c3sKc KsJh6h4s"));
  }

  @Test
  public void test_omaha_holdem_5595_3s4c6d7hKd_KhTd5c7s_7d6s3h8s_JsThAc8c_Ah9s6c5d_9h4sKs8d_5sJhQh2c_Ts4dJc7c_2d4h8h3d() {
    assertEquals(
      "JsThAc8c 2d4h8h3d Ts4dJc7c 7d6s3h8s 9h4sKs8d 5sJhQh2c Ah9s6c5d=KhTd5c7s",
      Solver.process("omaha-holdem 3s4c6d7hKd KhTd5c7s 7d6s3h8s JsThAc8c Ah9s6c5d 9h4sKs8d 5sJhQh2c Ts4dJc7c 2d4h8h3d"));
  }

  @Test
  public void test_omaha_holdem_5596_3c4d4s6sTh_9s8h9h2h_2c9d6dQd_7h8cAc5c_3s6hJdTd_Ks3hKcQh_7s5sAdQs_Kd8s7d2d_JhAs5dJs() {
    assertEquals(
      "Kd8s7d2d 2c9d6dQd 9s8h9h2h 3s6hJdTd JhAs5dJs Ks3hKcQh 7h8cAc5c=7s5sAdQs",
      Solver.process("omaha-holdem 3c4d4s6sTh 9s8h9h2h 2c9d6dQd 7h8cAc5c 3s6hJdTd Ks3hKcQh 7s5sAdQs Kd8s7d2d JhAs5dJs"));
  }

  @Test
  public void test_omaha_holdem_5597_2d8dJdKdTd_9dQs5sAd_8h6cAhJs_4dAc2c9h_JcJh9s3s() {
    assertEquals(
      "4dAc2c9h 8h6cAhJs JcJh9s3s 9dQs5sAd",
      Solver.process("omaha-holdem 2d8dJdKdTd 9dQs5sAd 8h6cAhJs 4dAc2c9h JcJh9s3s"));
  }

  @Test
  public void test_omaha_holdem_5598_4d8cJcJsKc_Qd6c9d6d_Th3s6hQs_2cQh5cJd_Kd8sKh6s_AdKs7d5h_2s3hTdAc() {
    assertEquals(
      "Th3s6hQs 2s3hTdAc Qd6c9d6d AdKs7d5h 2cQh5cJd Kd8sKh6s",
      Solver.process("omaha-holdem 4d8cJcJsKc Qd6c9d6d Th3s6hQs 2cQh5cJd Kd8sKh6s AdKs7d5h 2s3hTdAc"));
  }

  @Test
  public void test_omaha_holdem_5599_3s4h5h6cJs_2hJdQh7c_4c8s6h9c_Jh2s7d7h_8cTd6sAs_5s8h8d2d_Ts9dQc4d() {
    assertEquals(
      "Ts9dQc4d 8cTd6sAs Jh2s7d7h 2hJdQh7c 4c8s6h9c 5s8h8d2d",
      Solver.process("omaha-holdem 3s4h5h6cJs 2hJdQh7c 4c8s6h9c Jh2s7d7h 8cTd6sAs 5s8h8d2d Ts9dQc4d"));
  }

  @Test
  public void test_omaha_holdem_5600_2d5c6h7sJd_6dJh4c6s_Ad5dQh5s_KsQsAc2c_4d9cTd8s() {
    assertEquals(
      "KsQsAc2c Ad5dQh5s 6dJh4c6s 4d9cTd8s",
      Solver.process("omaha-holdem 2d5c6h7sJd 6dJh4c6s Ad5dQh5s KsQsAc2c 4d9cTd8s"));
  }

  @Test
  public void test_omaha_holdem_5601_2d3h4c5h9h_AsJhKh4h_Qs5s8dJs_KcJcJdTs() {
    assertEquals(
      "Qs5s8dJs KcJcJdTs AsJhKh4h",
      Solver.process("omaha-holdem 2d3h4c5h9h AsJhKh4h Qs5s8dJs KcJcJdTs"));
  }

  @Test
  public void test_omaha_holdem_5602_4d6s8cAsKh_JcAh5c2s_QdJhJs3c_4sThKsKc_JdTd6c8h() {
    assertEquals(
      "QdJhJs3c JcAh5c2s JdTd6c8h 4sThKsKc",
      Solver.process("omaha-holdem 4d6s8cAsKh JcAh5c2s QdJhJs3c 4sThKsKc JdTd6c8h"));
  }

  @Test
  public void test_omaha_holdem_5603_5c6h9dAhKc_8dAc8hJs_5dAs7h6d_5sQd7c9h_5hTs8cTh_4cQh3h8s() {
    assertEquals(
      "4cQh3h8s 5hTs8cTh 8dAc8hJs 5sQd7c9h 5dAs7h6d",
      Solver.process("omaha-holdem 5c6h9dAhKc 8dAc8hJs 5dAs7h6d 5sQd7c9h 5hTs8cTh 4cQh3h8s"));
  }

  @Test
  public void test_omaha_holdem_5604_2c2h4c5c7c_TdKs6hAc_2dQc4h5h_Qs8hAs9c_7h8dKh6s_TcAdTs7d_Ah9d4s3c() {
    assertEquals(
      "Qs8hAs9c TdKs6hAc TcAdTs7d Ah9d4s3c 7h8dKh6s 2dQc4h5h",
      Solver.process("omaha-holdem 2c2h4c5c7c TdKs6hAc 2dQc4h5h Qs8hAs9c 7h8dKh6s TcAdTs7d Ah9d4s3c"));
  }

  @Test
  public void test_omaha_holdem_5605_2s4s5c8hAc_Ts3sQc6d_6c8sJs3h_2hAs3d7s_9d5sJhTc_7dKc4dQd_4h6sKd2d_2c7c5d9c() {
    assertEquals(
      "7dKc4dQd 9d5sJhTc 4h6sKd2d 2c7c5d9c 2hAs3d7s 6c8sJs3h=Ts3sQc6d",
      Solver.process("omaha-holdem 2s4s5c8hAc Ts3sQc6d 6c8sJs3h 2hAs3d7s 9d5sJhTc 7dKc4dQd 4h6sKd2d 2c7c5d9c"));
  }

  @Test
  public void test_omaha_holdem_5606_3h4h4s6sTs_2sTcQc4c_6d4d9c5s_6hTh7s8h_8d2hJh3d_3sJdQd8c_9s3cQsQh() {
    assertEquals(
      "8d2hJh3d 3sJdQd8c 6hTh7s8h 9s3cQsQh 6d4d9c5s 2sTcQc4c",
      Solver.process("omaha-holdem 3h4h4s6sTs 2sTcQc4c 6d4d9c5s 6hTh7s8h 8d2hJh3d 3sJdQd8c 9s3cQsQh"));
  }

  @Test
  public void test_omaha_holdem_5607_8dAhJdJhKs_9sKc5s8h_Qd3c8c6h_Qh3hTs4d_3dJc2c5h_Ac4sKd9h_6sJs8sAd() {
    assertEquals(
      "Qd3c8c6h 9sKc5s8h Ac4sKd9h 3dJc2c5h Qh3hTs4d 6sJs8sAd",
      Solver.process("omaha-holdem 8dAhJdJhKs 9sKc5s8h Qd3c8c6h Qh3hTs4d 3dJc2c5h Ac4sKd9h 6sJs8sAd"));
  }

  @Test
  public void test_omaha_holdem_5608_4h9hKcThTs_9sTdKh7h_5dJsTc2c_9c8c3sJc_6hQs8sAs_Ks2s6d8h_JdKd4cQc() {
    assertEquals(
      "6hQs8sAs 9c8c3sJc Ks2s6d8h 5dJsTc2c JdKd4cQc 9sTdKh7h",
      Solver.process("omaha-holdem 4h9hKcThTs 9sTdKh7h 5dJsTc2c 9c8c3sJc 6hQs8sAs Ks2s6d8h JdKd4cQc"));
  }

  @Test
  public void test_omaha_holdem_5609_2c2d4s5d7s_KsKc9cQs_2s4d3h8h_3c2hAd9d_8d7hAcAs_8c6h8s9s_Ah7cTc7d_6dQdTdJs_6s5s9h6c_Jd4h5hQc() {
    assertEquals(
      "6dQdTdJs Jd4h5hQc 6s5s9h6c KsKc9cQs 8d7hAcAs 3c2hAd9d 8c6h8s9s 2s4d3h8h Ah7cTc7d",
      Solver.process("omaha-holdem 2c2d4s5d7s KsKc9cQs 2s4d3h8h 3c2hAd9d 8d7hAcAs 8c6h8s9s Ah7cTc7d 6dQdTdJs 6s5s9h6c Jd4h5hQc"));
  }

  @Test
  public void test_omaha_holdem_5610_2s6d7dQdQh_JdAs8h9h_9c8d4h4d_4cKcTc8s_9dAh6h2c() {
    assertEquals(
      "4cKcTc8s JdAs8h9h 9dAh6h2c 9c8d4h4d",
      Solver.process("omaha-holdem 2s6d7dQdQh JdAs8h9h 9c8d4h4d 4cKcTc8s 9dAh6h2c"));
  }

  @Test
  public void test_omaha_holdem_5611_3s4c6d7sAd_AcQd7hKd_Jc7d6sKh_5hTd7c8h_4h8sQs3d() {
    assertEquals(
      "4h8sQs3d Jc7d6sKh AcQd7hKd 5hTd7c8h",
      Solver.process("omaha-holdem 3s4c6d7sAd AcQd7hKd Jc7d6sKh 5hTd7c8h 4h8sQs3d"));
  }

  @Test
  public void test_omaha_holdem_5612_6d6s9cKhQh_7d7h9dTs_9s8c2dKd_8d4h4sAh_Th7sQdJc_TdKsJdTc_2h3c4c4d_6hAc9h3h_5s5h6c2s() {
    assertEquals(
      "2h3c4c4d=8d4h4sAh 7d7h9dTs 9s8c2dKd 5s5h6c2s TdKsJdTc=Th7sQdJc 6hAc9h3h",
      Solver.process("omaha-holdem 6d6s9cKhQh 7d7h9dTs 9s8c2dKd 8d4h4sAh Th7sQdJc TdKsJdTc 2h3c4c4d 6hAc9h3h 5s5h6c2s"));
  }

  @Test
  public void test_omaha_holdem_5613_3s8sAhTcTs_Th7hAdQs_Kh2d2s2c_9sTdKc9d_JcKd6hQd_5h4s6c9c_4h3h3c7d_5s4dAsQh_6s5d7sJh_Js7cJd8c() {
    assertEquals(
      "5h4s6c9c JcKd6hQd Kh2d2s2c Js7cJd8c 9sTdKc9d 6s5d7sJh 5s4dAsQh 4h3h3c7d Th7hAdQs",
      Solver.process("omaha-holdem 3s8sAhTcTs Th7hAdQs Kh2d2s2c 9sTdKc9d JcKd6hQd 5h4s6c9c 4h3h3c7d 5s4dAsQh 6s5d7sJh Js7cJd8c"));
  }

  @Test
  public void test_omaha_holdem_5614_6hAcTcTdTh_Jc4s5dJs_5s2s6dKc_Kd4dQh2h() {
    assertEquals(
      "5s2s6dKc Kd4dQh2h Jc4s5dJs",
      Solver.process("omaha-holdem 6hAcTcTdTh Jc4s5dJs 5s2s6dKc Kd4dQh2h"));
  }

  @Test
  public void test_omaha_holdem_5615_5d9hQdQsTs_JsTd4s7d_8h9d2dTc_Qh7c2hAh_Ad3h4h7s_2c5hThJh_3s8dJcKd_5c6sKhKc_Ac4d9sAs() {
    assertEquals(
      "Ad3h4h7s 8h9d2dTc 2c5hThJh=JsTd4s7d 5c6sKhKc Ac4d9sAs Qh7c2hAh 3s8dJcKd",
      Solver.process("omaha-holdem 5d9hQdQsTs JsTd4s7d 8h9d2dTc Qh7c2hAh Ad3h4h7s 2c5hThJh 3s8dJcKd 5c6sKhKc Ac4d9sAs"));
  }

  @Test
  public void test_omaha_holdem_5616_7h7sAdKhQh_7dAh6s9h_KsQs6h8s_5c3d4c2h_2s8hQcJh_TcTsKc3c_JsAs8cJc_5s2d9d3s_Th4dKdJd() {
    assertEquals(
      "5c3d4c2h 5s2d9d3s TcTsKc3c KsQs6h8s JsAs8cJc Th4dKdJd 2s8hQcJh 7dAh6s9h",
      Solver.process("omaha-holdem 7h7sAdKhQh 7dAh6s9h KsQs6h8s 5c3d4c2h 2s8hQcJh TcTsKc3c JsAs8cJc 5s2d9d3s Th4dKdJd"));
  }

  @Test
  public void test_omaha_holdem_5617_2c7c9dJhQs_3dAc6c7s_6s8hKd4h() {
    assertEquals(
      "6s8hKd4h 3dAc6c7s",
      Solver.process("omaha-holdem 2c7c9dJhQs 3dAc6c7s 6s8hKd4h"));
  }

  @Test
  public void test_omaha_holdem_5618_7h8h9cJsKs_Td6hJhTs_3s2d8cQd_Jd5hQhTc_6d7cAd9s_AcQc9d9h_2h5d2c3h_7d8s5sJc() {
    assertEquals(
      "2h5d2c3h 3s2d8cQd 6d7cAd9s 7d8s5sJc AcQc9d9h Td6hJhTs Jd5hQhTc",
      Solver.process("omaha-holdem 7h8h9cJsKs Td6hJhTs 3s2d8cQd Jd5hQhTc 6d7cAd9s AcQc9d9h 2h5d2c3h 7d8s5sJc"));
  }

  @Test
  public void test_omaha_holdem_5619_3d6c6s9dTh_2s8d3cJs_TdAcJh8s_4sAs3sTc_3hQd5c2h_5sJcAdJd() {
    assertEquals(
      "2s8d3cJs 3hQd5c2h 4sAs3sTc=TdAcJh8s 5sJcAdJd",
      Solver.process("omaha-holdem 3d6c6s9dTh 2s8d3cJs TdAcJh8s 4sAs3sTc 3hQd5c2h 5sJcAdJd"));
  }

  @Test
  public void test_omaha_holdem_5620_2s4s9cQsTs_9dQh9hTc_7dJdQcKs_AcTh6s3s_4d4cTdJs_7h7s7cJc_8s8d5s2c_Kh6hAh6d_Kd5dJhQd() {
    assertEquals(
      "Kh6hAh6d 7h7s7cJc 4d4cTdJs 9dQh9hTc 7dJdQcKs=Kd5dJhQd AcTh6s3s 8s8d5s2c",
      Solver.process("omaha-holdem 2s4s9cQsTs 9dQh9hTc 7dJdQcKs AcTh6s3s 4d4cTdJs 7h7s7cJc 8s8d5s2c Kh6hAh6d Kd5dJhQd"));
  }

  @Test
  public void test_omaha_holdem_5621_5s6h9cJcTc_7d9s4c4d_7cJd7hQh_2dJs3s8c() {
    assertEquals(
      "7d9s4c4d 2dJs3s8c 7cJd7hQh",
      Solver.process("omaha-holdem 5s6h9cJcTc 7d9s4c4d 7cJd7hQh 2dJs3s8c"));
  }

  @Test
  public void test_omaha_holdem_5622_6s9hAhJsTc_Ac9cAdKs_3s5s2dTh_7s9d9s5h() {
    assertEquals(
      "3s5s2dTh 7s9d9s5h Ac9cAdKs",
      Solver.process("omaha-holdem 6s9hAhJsTc Ac9cAdKs 3s5s2dTh 7s9d9s5h"));
  }

  @Test
  public void test_omaha_holdem_5623_4h5d8s9cJd_7c7s2cQh_Kd2h9d3h_Ts4s3dKs_3s9hQdKh_2s7d9s8c_7hQc6h8h_ThAcJc4d() {
    assertEquals(
      "Ts4s3dKs 7c7s2cQh 3s9hQdKh=Kd2h9d3h 2s7d9s8c ThAcJc4d 7hQc6h8h",
      Solver.process("omaha-holdem 4h5d8s9cJd 7c7s2cQh Kd2h9d3h Ts4s3dKs 3s9hQdKh 2s7d9s8c 7hQc6h8h ThAcJc4d"));
  }

  @Test
  public void test_omaha_holdem_5624_2h3s5dAcAh_9dTs5sQc_9cJs6sQh_9hQs7hKd_7d5h6c3h_Td2sTcKs_5cJc3d7s_4h6h4cTh() {
    assertEquals(
      "9cJs6sQh 9hQs7hKd 7d5h6c3h 5cJc3d7s 9dTs5sQc Td2sTcKs 4h6h4cTh",
      Solver.process("omaha-holdem 2h3s5dAcAh 9dTs5sQc 9cJs6sQh 9hQs7hKd 7d5h6c3h Td2sTcKs 5cJc3d7s 4h6h4cTh"));
  }

  @Test
  public void test_omaha_holdem_5625_3h6sJcJdKh_6d9c5dAh_QcTsQhKc_8s7dTcQs_Js4cQd4h_3cAs9d7h() {
    assertEquals(
      "8s7dTcQs 3cAs9d7h 6d9c5dAh QcTsQhKc Js4cQd4h",
      Solver.process("omaha-holdem 3h6sJcJdKh 6d9c5dAh QcTsQhKc 8s7dTcQs Js4cQd4h 3cAs9d7h"));
  }

  @Test
  public void test_omaha_holdem_5626_4d7c8d9dQh_5cAd9hKc_4h5d3s3d_8s7d6s6c_4sJh9sKh_Th5sTs4c_7hKs2sQc_Kd2dJs2c_TcQs3cQd() {
    assertEquals(
      "5cAd9hKc Th5sTs4c 8s7d6s6c 4sJh9sKh 7hKs2sQc TcQs3cQd 4h5d3s3d Kd2dJs2c",
      Solver.process("omaha-holdem 4d7c8d9dQh 5cAd9hKc 4h5d3s3d 8s7d6s6c 4sJh9sKh Th5sTs4c 7hKs2sQc Kd2dJs2c TcQs3cQd"));
  }

  @Test
  public void test_omaha_holdem_5627_4d4s6cKcQc_Js8hAs3h_9h9dTd7s_5cTh8cQs_KdJdQd2c_2s9s8dKh_2d3cJh8s_Ts2h6s6d_4hTc3dJc() {
    assertEquals(
      "2d3cJh8s Js8hAs3h 9h9dTd7s 2s9s8dKh KdJdQd2c 5cTh8cQs 4hTc3dJc Ts2h6s6d",
      Solver.process("omaha-holdem 4d4s6cKcQc Js8hAs3h 9h9dTd7s 5cTh8cQs KdJdQd2c 2s9s8dKh 2d3cJh8s Ts2h6s6d 4hTc3dJc"));
  }

  @Test
  public void test_omaha_holdem_5628_3cAsJhKsTd_9c8cTc7h_9dTsKh3s_6cAhThJc_Qs5c9h4s_7s4d5dJd_3hKd5s6s_3dQh6hAc_Qd6dQcJs_Kc7c4h8d() {
    assertEquals(
      "9c8cTc7h 7s4d5dJd Kc7c4h8d 3hKd5s6s 9dTsKh3s 6cAhThJc Qs5c9h4s 3dQh6hAc=Qd6dQcJs",
      Solver.process("omaha-holdem 3cAsJhKsTd 9c8cTc7h 9dTsKh3s 6cAhThJc Qs5c9h4s 7s4d5dJd 3hKd5s6s 3dQh6hAc Qd6dQcJs Kc7c4h8d"));
  }

  @Test
  public void test_omaha_holdem_5629_2s9hAcQcTh_9s5c4c9d_7c2h6hTd_3hJh3s8c() {
    assertEquals(
      "7c2h6hTd 9s5c4c9d 3hJh3s8c",
      Solver.process("omaha-holdem 2s9hAcQcTh 9s5c4c9d 7c2h6hTd 3hJh3s8c"));
  }

  @Test
  public void test_omaha_holdem_5630_2c2s3dJhKs_Qc6hAh9s_4d2h5h3c_7d4hJd8c_9h2d5dAd_4c7hThJc() {
    assertEquals(
      "Qc6hAh9s 7d4hJd8c 4c7hThJc 9h2d5dAd 4d2h5h3c",
      Solver.process("omaha-holdem 2c2s3dJhKs Qc6hAh9s 4d2h5h3c 7d4hJd8c 9h2d5dAd 4c7hThJc"));
  }

  @Test
  public void test_omaha_holdem_5631_2c2h4d5d6h_4hAh2dJs_Ac9h9c8s_6sKcQh8d() {
    assertEquals(
      "6sKcQh8d Ac9h9c8s 4hAh2dJs",
      Solver.process("omaha-holdem 2c2h4d5d6h 4hAh2dJs Ac9h9c8s 6sKcQh8d"));
  }

  @Test
  public void test_omaha_holdem_5632_2s5h6hAcAh_8s4s7dTs_QsJd6d3h_9hQc5d8h() {
    assertEquals(
      "8s4s7dTs QsJd6d3h 9hQc5d8h",
      Solver.process("omaha-holdem 2s5h6hAcAh 8s4s7dTs QsJd6d3h 9hQc5d8h"));
  }

  @Test
  public void test_omaha_holdem_5633_2c6dQcTcTs_5dThJc8h_9h3h7d3s_AdAc2hQs_9c5c2dAh() {
    assertEquals(
      "9h3h7d3s AdAc2hQs 5dThJc8h 9c5c2dAh",
      Solver.process("omaha-holdem 2c6dQcTcTs 5dThJc8h 9h3h7d3s AdAc2hQs 9c5c2dAh"));
  }

  @Test
  public void test_omaha_holdem_5634_2s4s6h8cQs_AhJcAsTh_5s5d4c9h_3h9d7dAd_5cTd5h7c_KdTsAc2c_Kh9c4dKc_2dKs6c3d_6s8dQcQh_9s8h8s7h() {
    assertEquals(
      "3h9d7dAd KdTsAc2c 5s5d4c9h Kh9c4dKc AhJcAsTh 2dKs6c3d 6s8dQcQh 5cTd5h7c 9s8h8s7h",
      Solver.process("omaha-holdem 2s4s6h8cQs AhJcAsTh 5s5d4c9h 3h9d7dAd 5cTd5h7c KdTsAc2c Kh9c4dKc 2dKs6c3d 6s8dQcQh 9s8h8s7h"));
  }

  @Test
  public void test_omaha_holdem_5635_5h6s9sTdTs_6cJdKsQs_9h3hKdQd_JcKhAh4d() {
    assertEquals(
      "JcKhAh4d 9h3hKdQd 6cJdKsQs",
      Solver.process("omaha-holdem 5h6s9sTdTs 6cJdKsQs 9h3hKdQd JcKhAh4d"));
  }

  @Test
  public void test_omaha_holdem_5636_3d3h5d5h8d_7d8sKh7h_Ts6h6cTh_8cKcQcQs_2d9sJc6s_4c4h3s2h_4s6d8hQd_JsQhKdJd() {
    assertEquals(
      "2d9sJc6s 7d8sKh7h Ts6h6cTh 8cKcQcQs 4c4h3s2h 4s6d8hQd JsQhKdJd",
      Solver.process("omaha-holdem 3d3h5d5h8d 7d8sKh7h Ts6h6cTh 8cKcQcQs 2d9sJc6s 4c4h3s2h 4s6d8hQd JsQhKdJd"));
  }

  @Test
  public void test_omaha_holdem_5637_6h8d9c9sKc_6dAs2cJc_QdQc7hKs_Kh5s5dJs_3cTc8s2s_2d7s6c3s() {
    assertEquals(
      "2d7s6c3s 6dAs2cJc 3cTc8s2s Kh5s5dJs QdQc7hKs",
      Solver.process("omaha-holdem 6h8d9c9sKc 6dAs2cJc QdQc7hKs Kh5s5dJs 3cTc8s2s 2d7s6c3s"));
  }

  @Test
  public void test_omaha_holdem_5638_5hAhJcJsKc_8sAcTc8d_6dTs4h5s_2c2sQc4s_JdTd3s6h_6sKsKh9c_6c3c2h4d_8c7dThKd() {
    assertEquals(
      "6c3c2h4d 2c2sQc4s 6dTs4h5s 8c7dThKd 8sAcTc8d JdTd3s6h 6sKsKh9c",
      Solver.process("omaha-holdem 5hAhJcJsKc 8sAcTc8d 6dTs4h5s 2c2sQc4s JdTd3s6h 6sKsKh9c 6c3c2h4d 8c7dThKd"));
  }

  @Test
  public void test_omaha_holdem_5639_5s7hAsJhQd_4hJd7sAh_Ad6s7c3h_TsKd2h4d_Kh8c6h8h_Td2c8s5d_2dTh9h4s() {
    assertEquals(
      "2dTh9h4s Td2c8s5d Kh8c6h8h Ad6s7c3h 4hJd7sAh TsKd2h4d",
      Solver.process("omaha-holdem 5s7hAsJhQd 4hJd7sAh Ad6s7c3h TsKd2h4d Kh8c6h8h Td2c8s5d 2dTh9h4s"));
  }

  @Test
  public void test_omaha_holdem_5640_3c6c7cJsTc_3d9c6dQh_9sAcQc5c_2hQdJd7s_5s3h4c2c_Ts4dQs4s_3s8h8cTh_Kd5dKcTd_6s7d8dKh_KsAs8s5h() {
    assertEquals(
      "KsAs8s5h Ts4dQs4s Kd5dKcTd 3d9c6dQh 6s7d8dKh 3s8h8cTh 2hQdJd7s 5s3h4c2c 9sAcQc5c",
      Solver.process("omaha-holdem 3c6c7cJsTc 3d9c6dQh 9sAcQc5c 2hQdJd7s 5s3h4c2c Ts4dQs4s 3s8h8cTh Kd5dKcTd 6s7d8dKh KsAs8s5h"));
  }

  @Test
  public void test_omaha_holdem_5641_5h6c9c9hTd_4sAc4hJh_Qs2h8dTh_Ts5sKd9d_Kh3sKc3h_Qd3c3d7c_AdAh9sKs_6d2sTc4c_Jc2c7h8h() {
    assertEquals(
      "Qd3c3d7c 4sAc4hJh 6d2sTc4c Qs2h8dTh Kh3sKc3h AdAh9sKs Jc2c7h8h Ts5sKd9d",
      Solver.process("omaha-holdem 5h6c9c9hTd 4sAc4hJh Qs2h8dTh Ts5sKd9d Kh3sKc3h Qd3c3d7c AdAh9sKs 6d2sTc4c Jc2c7h8h"));
  }

  @Test
  public void test_omaha_holdem_5642_6cAsJdKsTh_2c7s9c4h_Qh5hQd8d_7d3s7hKh_3c5cQc9h_3hTc8cAc_TsQs6d4s() {
    assertEquals(
      "2c7s9c4h Qh5hQd8d 7d3s7hKh 3hTc8cAc 3c5cQc9h TsQs6d4s",
      Solver.process("omaha-holdem 6cAsJdKsTh 2c7s9c4h Qh5hQd8d 7d3s7hKh 3c5cQc9h 3hTc8cAc TsQs6d4s"));
  }

  @Test
  public void test_omaha_holdem_5643_3h4c8d8hTd_9cJhAs2c_4d2h6h7s() {
    assertEquals(
      "9cJhAs2c 4d2h6h7s",
      Solver.process("omaha-holdem 3h4c8d8hTd 9cJhAs2c 4d2h6h7s"));
  }

  @Test
  public void test_omaha_holdem_5644_2c9hJsQcTh_5sKh4c8h_Qs7hQd3s_7d9c5d3d_8d9dAd4h_9sQhTd2d() {
    assertEquals(
      "5sKh4c8h 7d9c5d3d 9sQhTd2d Qs7hQd3s 8d9dAd4h",
      Solver.process("omaha-holdem 2c9hJsQcTh 5sKh4c8h Qs7hQd3s 7d9c5d3d 8d9dAd4h 9sQhTd2d"));
  }

  @Test
  public void test_omaha_holdem_5645_2s3d4h5sKs_3s9h4d8s_Jh6sKd7d_2h9d5dAd_JcAcAsTc_4cThJd9s_3hQc6h4s_QsKc7s7c() {
    assertEquals(
      "4cThJd9s JcAcAsTc 2h9d5dAd 3hQc6h4s Jh6sKd7d 3s9h4d8s QsKc7s7c",
      Solver.process("omaha-holdem 2s3d4h5sKs 3s9h4d8s Jh6sKd7d 2h9d5dAd JcAcAsTc 4cThJd9s 3hQc6h4s QsKc7s7c"));
  }

  @Test
  public void test_omaha_holdem_5646_3c6h7hAhTs_KdAs6s8h_4c9s3h6d() {
    assertEquals(
      "4c9s3h6d KdAs6s8h",
      Solver.process("omaha-holdem 3c6h7hAhTs KdAs6s8h 4c9s3h6d"));
  }

  @Test
  public void test_omaha_holdem_5647_3d3sJhTdTh_6c6s8cKc_7c4dTc8s_Jc8d3cQs_Ah5h2s9d_9hQdTs6h_As7dAc2h_Qc9c4c7h_2dJs7sKh() {
    assertEquals(
      "Qc9c4c7h Ah5h2s9d 6c6s8cKc 2dJs7sKh As7dAc2h 7c4dTc8s 9hQdTs6h Jc8d3cQs",
      Solver.process("omaha-holdem 3d3sJhTdTh 6c6s8cKc 7c4dTc8s Jc8d3cQs Ah5h2s9d 9hQdTs6h As7dAc2h Qc9c4c7h 2dJs7sKh"));
  }

  @Test
  public void test_omaha_holdem_5648_2d7s9hAhTs_8sKsKc2s_6cJh7dQh() {
    assertEquals(
      "6cJh7dQh 8sKsKc2s",
      Solver.process("omaha-holdem 2d7s9hAhTs 8sKsKc2s 6cJh7dQh"));
  }

  @Test
  public void test_omaha_holdem_5649_4d5d6s8dTh_5sTd2d5h_7cTsAsAc() {
    assertEquals(
      "7cTsAsAc 5sTd2d5h",
      Solver.process("omaha-holdem 4d5d6s8dTh 5sTd2d5h 7cTsAsAc"));
  }

  @Test
  public void test_omaha_holdem_5650_2h4h8c9dJd_9c4dAh4c_QcAd5sQd_Js5dThAc_As6dKsQh_JhTsQs9h_3h2cJc5h_7d3c5cKh() {
    assertEquals(
      "7d3c5cKh As6dKsQh Js5dThAc QcAd5sQd 3h2cJc5h 9c4dAh4c JhTsQs9h",
      Solver.process("omaha-holdem 2h4h8c9dJd 9c4dAh4c QcAd5sQd Js5dThAc As6dKsQh JhTsQs9h 3h2cJc5h 7d3c5cKh"));
  }

  @Test
  public void test_omaha_holdem_5651_2c5d6hAdJd_7d6d9d7c_7sKhQs5c_Td9h4hTc_3hJh6cTs() {
    assertEquals(
      "7sKhQs5c Td9h4hTc 3hJh6cTs 7d6d9d7c",
      Solver.process("omaha-holdem 2c5d6hAdJd 7d6d9d7c 7sKhQs5c Td9h4hTc 3hJh6cTs"));
  }

  @Test
  public void test_omaha_holdem_5652_2c2d2h9hTs_8h7s6hAs_3c4sJd6s_4hQs5hTd() {
    assertEquals(
      "3c4sJd6s 4hQs5hTd 8h7s6hAs",
      Solver.process("omaha-holdem 2c2d2h9hTs 8h7s6hAs 3c4sJd6s 4hQs5hTd"));
  }

  @Test
  public void test_omaha_holdem_5653_2h3dAhJsTs_7c7h7dQs_6hJcJd9d() {
    assertEquals(
      "7c7h7dQs 6hJcJd9d",
      Solver.process("omaha-holdem 2h3dAhJsTs 7c7h7dQs 6hJcJd9d"));
  }

  @Test
  public void test_omaha_holdem_5654_7d8hAsQsTh_AcJd7s9h_2c8cQcKd_6d2sAd6c_4d6s8s5c_2d4c5sKh_4h3hJc2h_7cKc5h3d_9sAh5d4s() {
    assertEquals(
      "4h3hJc2h 2d4c5sKh 7cKc5h3d 4d6s8s5c 6d2sAd6c 9sAh5d4s 2c8cQcKd AcJd7s9h",
      Solver.process("omaha-holdem 7d8hAsQsTh AcJd7s9h 2c8cQcKd 6d2sAd6c 4d6s8s5c 2d4c5sKh 4h3hJc2h 7cKc5h3d 9sAh5d4s"));
  }

  @Test
  public void test_omaha_holdem_5655_3h7hJhKhKs_3dQs5c9h_3cTsQhQc_4s8cAsAc() {
    assertEquals(
      "3dQs5c9h 3cTsQhQc 4s8cAsAc",
      Solver.process("omaha-holdem 3h7hJhKhKs 3dQs5c9h 3cTsQhQc 4s8cAsAc"));
  }

  @Test
  public void test_omaha_holdem_5656_3c6c7h8dKs_9s2h4s5c_Qs6h5dTs_7s4dKhAc_8hAd3hJc_Kd7dQd2c_5s8s2s7c() {
    assertEquals(
      "Qs6h5dTs 8hAd3hJc 5s8s2s7c 7s4dKhAc=Kd7dQd2c 9s2h4s5c",
      Solver.process("omaha-holdem 3c6c7h8dKs 9s2h4s5c Qs6h5dTs 7s4dKhAc 8hAd3hJc Kd7dQd2c 5s8s2s7c"));
  }

  @Test
  public void test_omaha_holdem_5657_3c4h5s6d8c_Jh2c9s4c_Td2dAdKh_AcQsJd8h_7c6h9hQc_KsJc3d2s_Ts8s3hKc_4s7h6c9d() {
    assertEquals(
      "AcQsJd8h Ts8s3hKc Td2dAdKh Jh2c9s4c=KsJc3d2s 4s7h6c9d=7c6h9hQc",
      Solver.process("omaha-holdem 3c4h5s6d8c Jh2c9s4c Td2dAdKh AcQsJd8h 7c6h9hQc KsJc3d2s Ts8s3hKc 4s7h6c9d"));
  }

  @Test
  public void test_omaha_holdem_5658_6h7d8sJcTh_4d4cAs2s_Qc9cKsKc_Js3s2d6c() {
    assertEquals(
      "4d4cAs2s Js3s2d6c Qc9cKsKc",
      Solver.process("omaha-holdem 6h7d8sJcTh 4d4cAs2s Qc9cKsKc Js3s2d6c"));
  }

  @Test
  public void test_omaha_holdem_5659_4h6cAhJhKh_AsTh8c5c_Qd2hAcJc_4dKc7c9c_4s8h6hTd_2d2c9d3d_5d9h6dQs_AdJdKd8s() {
    assertEquals(
      "2d2c9d3d 5d9h6dQs AsTh8c5c 4dKc7c9c Qd2hAcJc AdJdKd8s 4s8h6hTd",
      Solver.process("omaha-holdem 4h6cAhJhKh AsTh8c5c Qd2hAcJc 4dKc7c9c 4s8h6hTd 2d2c9d3d 5d9h6dQs AdJdKd8s"));
  }

  @Test
  public void test_omaha_holdem_5660_3d5h6c8cTd_3c2c6h2h_Ts9s7s4s_As5sQc9h_Jd7h2sQs_8dAcAhJc_7d4dJsJh_Th4c9c8h_6sKs2d9d_Ad3h6d5d() {
    assertEquals(
      "Jd7h2sQs As5sQc9h 6sKs2d9d 8dAcAhJc 3c2c6h2h Ad3h6d5d Th4c9c8h 7d4dJsJh Ts9s7s4s",
      Solver.process("omaha-holdem 3d5h6c8cTd 3c2c6h2h Ts9s7s4s As5sQc9h Jd7h2sQs 8dAcAhJc 7d4dJsJh Th4c9c8h 6sKs2d9d Ad3h6d5d"));
  }

  @Test
  public void test_omaha_holdem_5661_6h7s9d9sAs_2hKdKc5d_Td6cAh5h_8d4sTsQs_2s7cAdKh_3c9h4dKs_2cQc6dAc() {
    assertEquals(
      "2hKdKc5d Td6cAh5h 2cQc6dAc 2s7cAdKh 3c9h4dKs 8d4sTsQs",
      Solver.process("omaha-holdem 6h7s9d9sAs 2hKdKc5d Td6cAh5h 8d4sTsQs 2s7cAdKh 3c9h4dKs 2cQc6dAc"));
  }

  @Test
  public void test_omaha_holdem_5662_4c7h9sJcTh_Ah7d7c9h_4s4h5cQc_As3h6s8s_2d9dKhJs() {
    assertEquals(
      "2d9dKhJs 4s4h5cQc Ah7d7c9h As3h6s8s",
      Solver.process("omaha-holdem 4c7h9sJcTh Ah7d7c9h 4s4h5cQc As3h6s8s 2d9dKhJs"));
  }

  @Test
  public void test_omaha_holdem_5663_4h5d6s8sTh_6h2dKcQs_3c4cQc9d_Ah5s8h6c() {
    assertEquals(
      "3c4cQc9d 6h2dKcQs Ah5s8h6c",
      Solver.process("omaha-holdem 4h5d6s8sTh 6h2dKcQs 3c4cQc9d Ah5s8h6c"));
  }

  @Test
  public void test_omaha_holdem_5664_5h6h7cKcTd_8d4h8s8h_7s9hJd3d_5dKd4d7d_JsAhQhQs_2c3h2s6d() {
    assertEquals(
      "2c3h2s6d 7s9hJd3d JsAhQhQs 5dKd4d7d 8d4h8s8h",
      Solver.process("omaha-holdem 5h6h7cKcTd 8d4h8s8h 7s9hJd3d 5dKd4d7d JsAhQhQs 2c3h2s6d"));
  }

  @Test
  public void test_omaha_holdem_5665_3s9sAhQcTc_7h6c4c7c_8s5dJcJh() {
    assertEquals(
      "7h6c4c7c 8s5dJcJh",
      Solver.process("omaha-holdem 3s9sAhQcTc 7h6c4c7c 8s5dJcJh"));
  }

  @Test
  public void test_omaha_holdem_5666_2c2s5c7dKd_6hJh3dQs_5sQdJsAh_Ts4d8sAd_Jd2hJc2d_9d7h6c5h_7sKcKh4h_As4cTcAc_6sKs9s4s_8hThTdQc() {
    assertEquals(
      "6hJh3dQs Ts4d8sAd 5sQdJsAh 9d7h6c5h 8hThTdQc 6sKs9s4s As4cTcAc 7sKcKh4h Jd2hJc2d",
      Solver.process("omaha-holdem 2c2s5c7dKd 6hJh3dQs 5sQdJsAh Ts4d8sAd Jd2hJc2d 9d7h6c5h 7sKcKh4h As4cTcAc 6sKs9s4s 8hThTdQc"));
  }

  @Test
  public void test_omaha_holdem_5667_3d8c8sJhQh_KhAs7d4s_Js9h6s5d_2s6c4c2d_7cKs6h3c() {
    assertEquals(
      "KhAs7d4s 2s6c4c2d 7cKs6h3c Js9h6s5d",
      Solver.process("omaha-holdem 3d8c8sJhQh KhAs7d4s Js9h6s5d 2s6c4c2d 7cKs6h3c"));
  }

  @Test
  public void test_omaha_holdem_5668_3c6h8c8dJd_7sJhAhTd_As9c6dAc_9s6sTh3d_3hTsQdKc_4d2h2cKs_2d5hTcQs_7h5s7d2s() {
    assertEquals(
      "2d5hTcQs 4d2h2cKs 3hTsQdKc 9s6sTh3d 7h5s7d2s 7sJhAhTd As9c6dAc",
      Solver.process("omaha-holdem 3c6h8c8dJd 7sJhAhTd As9c6dAc 9s6sTh3d 3hTsQdKc 4d2h2cKs 2d5hTcQs 7h5s7d2s"));
  }

  @Test
  public void test_omaha_holdem_5669_4d8h8s9hQd_Ad3hKhQh_9s7s2h3s_7c4cKs8d_8cAs6h7d_ThJs3dJd() {
    assertEquals(
      "9s7s2h3s Ad3hKhQh 8cAs6h7d ThJs3dJd 7c4cKs8d",
      Solver.process("omaha-holdem 4d8h8s9hQd Ad3hKhQh 9s7s2h3s 7c4cKs8d 8cAs6h7d ThJs3dJd"));
  }

  @Test
  public void test_omaha_holdem_5670_3c7cAcAhTh_3h4h3s5c_5s2c3dTd_8sAdTs4d_JsKd7sQd() {
    assertEquals(
      "JsKd7sQd 5s2c3dTd 3h4h3s5c 8sAdTs4d",
      Solver.process("omaha-holdem 3c7cAcAhTh 3h4h3s5c 5s2c3dTd 8sAdTs4d JsKd7sQd"));
  }

  @Test
  public void test_omaha_holdem_5671_9c9hAcJsKd_Kh6c5c5s_Jd3c4d8h_7cTh9d8d_4hJcAs4c_6sAd2dQc() {
    assertEquals(
      "Jd3c4d8h Kh6c5c5s 6sAd2dQc 4hJcAs4c 7cTh9d8d",
      Solver.process("omaha-holdem 9c9hAcJsKd Kh6c5c5s Jd3c4d8h 7cTh9d8d 4hJcAs4c 6sAd2dQc"));
  }

  @Test
  public void test_omaha_holdem_5672_2h6c8dAhJd_4d9sJsTs_7cKh5sAc_Jh7sTc8h_Jc9cKd9d_4sQs7d5c_Th3sQdQc_3c3h4cKs_9h3d8c2s() {
    assertEquals(
      "4sQs7d5c 3c3h4cKs 4d9sJsTs Jc9cKd9d Th3sQdQc 7cKh5sAc 9h3d8c2s Jh7sTc8h",
      Solver.process("omaha-holdem 2h6c8dAhJd 4d9sJsTs 7cKh5sAc Jh7sTc8h Jc9cKd9d 4sQs7d5c Th3sQdQc 3c3h4cKs 9h3d8c2s"));
  }

  @Test
  public void test_omaha_holdem_5673_5s8c9sJhKd_Qd8h5cJc_7s3sKs2h_4dJd4h2c_9hTs3hQh_QcTh7c6h_Qs8sKc2d_KhAc5h2s_JsAh8d6d() {
    assertEquals(
      "4dJd4h2c 7s3sKs2h JsAh8d6d=Qd8h5cJc KhAc5h2s Qs8sKc2d 9hTs3hQh=QcTh7c6h",
      Solver.process("omaha-holdem 5s8c9sJhKd Qd8h5cJc 7s3sKs2h 4dJd4h2c 9hTs3hQh QcTh7c6h Qs8sKc2d KhAc5h2s JsAh8d6d"));
  }

  @Test
  public void test_omaha_holdem_5674_2s9hAcKcTs_9d2c5d3d_9s4h6s4d_Qc8s6c8h_5c9cJs4s_Kh6h3cKd_5h8c7dAd_Td5sQsAs_3h3s8d7c_6d7sAhTc() {
    assertEquals(
      "3h3s8d7c Qc8s6c8h 9s4h6s4d 5c9cJs4s 5h8c7dAd 9d2c5d3d 6d7sAhTc=Td5sQsAs Kh6h3cKd",
      Solver.process("omaha-holdem 2s9hAcKcTs 9d2c5d3d 9s4h6s4d Qc8s6c8h 5c9cJs4s Kh6h3cKd 5h8c7dAd Td5sQsAs 3h3s8d7c 6d7sAhTc"));
  }

  @Test
  public void test_omaha_holdem_5675_2d5c9dAsTc_6c5hThTs_3d9h4sTd_Qd4c5d2h_7hAcJh7c_Qc2s9s3s_Kh8sAd6d_Qh7sKsJc_Qs7dJd8h() {
    assertEquals(
      "Qs7dJd8h Qh7sKsJc 7hAcJh7c Kh8sAd6d Qd4c5d2h Qc2s9s3s 6c5hThTs 3d9h4sTd",
      Solver.process("omaha-holdem 2d5c9dAsTc 6c5hThTs 3d9h4sTd Qd4c5d2h 7hAcJh7c Qc2s9s3s Kh8sAd6d Qh7sKsJc Qs7dJd8h"));
  }

  @Test
  public void test_omaha_holdem_5676_2s6d6s7h8d_3dQhJd8h_KsAsAhQs_4sJc5s9d_2dTsKdJh_9sAdTd6c_3sAc9c5h() {
    assertEquals(
      "2dTsKdJh 3dQhJd8h KsAsAhQs 3sAc9c5h=4sJc5s9d 9sAdTd6c",
      Solver.process("omaha-holdem 2s6d6s7h8d 3dQhJd8h KsAsAhQs 4sJc5s9d 2dTsKdJh 9sAdTd6c 3sAc9c5h"));
  }

  @Test
  public void test_omaha_holdem_5677_3s5h7cAsQd_4s6h3c4c_9c2d2hAd_Td3dJcJd_2c5sQs5d_9dAhKh9h_6c8sJsTc_Ac2sTs7s_4h5c6d4d_8h7h9s6s() {
    assertEquals(
      "6c8sJsTc 8h7h9s6s Td3dJcJd 9c2d2hAd 9dAhKh9h Ac2sTs7s 2c5sQs5d 4h5c6d4d=4s6h3c4c",
      Solver.process("omaha-holdem 3s5h7cAsQd 4s6h3c4c 9c2d2hAd Td3dJcJd 2c5sQs5d 9dAhKh9h 6c8sJsTc Ac2sTs7s 4h5c6d4d 8h7h9s6s"));
  }

  @Test
  public void test_omaha_holdem_5678_2s5d7d7s8c_Tc9d4s7h_Qh6hKd6c() {
    assertEquals(
      "Qh6hKd6c Tc9d4s7h",
      Solver.process("omaha-holdem 2s5d7d7s8c Tc9d4s7h Qh6hKd6c"));
  }

  @Test
  public void test_omaha_holdem_5679_4h5d9dKsQs_Jh4s7cAd_7dAhTc9c() {
    assertEquals(
      "Jh4s7cAd 7dAhTc9c",
      Solver.process("omaha-holdem 4h5d9dKsQs Jh4s7cAd 7dAhTc9c"));
  }

  @Test
  public void test_omaha_holdem_5680_2d3c5d8cKd_Th8h3d3h_2c9sTdQd_7d9dKsTc() {
    assertEquals(
      "Th8h3d3h 7d9dKsTc 2c9sTdQd",
      Solver.process("omaha-holdem 2d3c5d8cKd Th8h3d3h 2c9sTdQd 7d9dKsTc"));
  }

  @Test
  public void test_omaha_holdem_5681_2h5s6hKhQc_7s6c4c8c_TdAh4h5c_AdJcTcQh_6s3sAc7d_Qd8h9sTh_2d9d6d7c_Qs4d5d9h() {
    assertEquals(
      "7s6c4c8c 6s3sAc7d AdJcTcQh 2d9d6d7c Qs4d5d9h Qd8h9sTh TdAh4h5c",
      Solver.process("omaha-holdem 2h5s6hKhQc 7s6c4c8c TdAh4h5c AdJcTcQh 6s3sAc7d Qd8h9sTh 2d9d6d7c Qs4d5d9h"));
  }

  @Test
  public void test_omaha_holdem_5682_9dJdJhTcTh_8h2dQh7s_4sJs8d7h_KsQcAdKc_4cQdAhKd_8s6c6d4d_3c2h5h9s_Qs3s9c9h_2c2s6s5c_AcTs5d7c() {
    assertEquals(
      "2c2s6s5c 8s6c6d4d 3c2h5h9s AcTs5d7c 4sJs8d7h 8h2dQh7s 4cQdAhKd=KsQcAdKc Qs3s9c9h",
      Solver.process("omaha-holdem 9dJdJhTcTh 8h2dQh7s 4sJs8d7h KsQcAdKc 4cQdAhKd 8s6c6d4d 3c2h5h9s Qs3s9c9h 2c2s6s5c AcTs5d7c"));
  }

  @Test
  public void test_omaha_holdem_5683_2h4cAsKhTc_AhTdAcQc_9s4s7s8s_6s5hTsKd_9dJs4d8h_Kc6d3c9c() {
    assertEquals(
      "9s4s7s8s 9dJs4d8h Kc6d3c9c 6s5hTsKd AhTdAcQc",
      Solver.process("omaha-holdem 2h4cAsKhTc AhTdAcQc 9s4s7s8s 6s5hTsKd 9dJs4d8h Kc6d3c9c"));
  }

  @Test
  public void test_omaha_holdem_5684_2d2h4cAsQs_5d2c6sAh_KdQh5sAd_8d7hQc3s_Ts6h9cQd_4sKc3h3c() {
    assertEquals(
      "4sKc3h3c 8d7hQc3s Ts6h9cQd KdQh5sAd 5d2c6sAh",
      Solver.process("omaha-holdem 2d2h4cAsQs 5d2c6sAh KdQh5sAd 8d7hQc3s Ts6h9cQd 4sKc3h3c"));
  }

  @Test
  public void test_omaha_holdem_5685_3c5s7cAdTh_4d7dKc6c_3s7sTcKd_Kh3d3hAs_2s4sKsQh_2dTsJcTd_2h4hJh8s_5d6d6h9c_Qc8c2c7h_6sQd8d9h() {
    assertEquals(
      "6sQd8d9h 5d6d6h9c Qc8c2c7h 3s7sTcKd Kh3d3hAs 2dTsJcTd 2h4hJh8s=2s4sKsQh 4d7dKc6c",
      Solver.process("omaha-holdem 3c5s7cAdTh 4d7dKc6c 3s7sTcKd Kh3d3hAs 2s4sKsQh 2dTsJcTd 2h4hJh8s 5d6d6h9c Qc8c2c7h 6sQd8d9h"));
  }

  @Test
  public void test_omaha_holdem_5686_6d8hJcQsTd_3d2sJd2h_AsTs9d2d_7dAd3cTc_QhAh9h4h_3sKc7c5d_5s4s8sKd_Ks8d7h8c() {
    assertEquals(
      "3sKc7c5d 5s4s8sKd 7dAd3cTc 3d2sJd2h Ks8d7h8c AsTs9d2d=QhAh9h4h",
      Solver.process("omaha-holdem 6d8hJcQsTd 3d2sJd2h AsTs9d2d 7dAd3cTc QhAh9h4h 3sKc7c5d 5s4s8sKd Ks8d7h8c"));
  }

  @Test
  public void test_omaha_holdem_5687_2c5c6d9dJc_4s3c3dAd_Jh7dQsQd_6c6sTc2h_ThJsKd2s_8hAc5h8c_7c6hJd9c_4h9sQcAh_Kc4c3s7s() {
    assertEquals(
      "4h9sQcAh Jh7dQsQd ThJsKd2s 4s3c3dAd 7c6hJd9c 6c6sTc2h Kc4c3s7s 8hAc5h8c",
      Solver.process("omaha-holdem 2c5c6d9dJc 4s3c3dAd Jh7dQsQd 6c6sTc2h ThJsKd2s 8hAc5h8c 7c6hJd9c 4h9sQcAh Kc4c3s7s"));
  }

  @Test
  public void test_omaha_holdem_5688_3h4d7h8c8d_TdTs2h9h_2cKh3s2d_ThAs6c6d_JhAd7sQs_Kd5h3c5s_9sAc9d5c_4c9c7d4s_TcAh5dJs_7c6s8s4h() {
    assertEquals(
      "TcAh5dJs 2cKh3s2d Kd5h3c5s ThAs6c6d JhAd7sQs 9sAc9d5c TdTs2h9h 4c9c7d4s 7c6s8s4h",
      Solver.process("omaha-holdem 3h4d7h8c8d TdTs2h9h 2cKh3s2d ThAs6c6d JhAd7sQs Kd5h3c5s 9sAc9d5c 4c9c7d4s TcAh5dJs 7c6s8s4h"));
  }

  @Test
  public void test_omaha_holdem_5689_2c4hKsQcQd_Kh3s7sAs_6dAdTc7d_6c6h5d4c_2s5c4s5s_8cAcTsJc() {
    assertEquals(
      "6dAdTc7d 8cAcTsJc 2s5c4s5s 6c6h5d4c Kh3s7sAs",
      Solver.process("omaha-holdem 2c4hKsQcQd Kh3s7sAs 6dAdTc7d 6c6h5d4c 2s5c4s5s 8cAcTsJc"));
  }

  @Test
  public void test_omaha_holdem_5690_2h5d6c9hKc_7dKsKd4h_Qs8sJcTd_QdQhAh8d_2c5h9d3s_5s5c6d2d_Tc9s6h2s_3c7c6sQc() {
    assertEquals(
      "Qs8sJcTd 3c7c6sQc QdQhAh8d 2c5h9d3s Tc9s6h2s 5s5c6d2d 7dKsKd4h",
      Solver.process("omaha-holdem 2h5d6c9hKc 7dKsKd4h Qs8sJcTd QdQhAh8d 2c5h9d3s 5s5c6d2d Tc9s6h2s 3c7c6sQc"));
  }

  @Test
  public void test_omaha_holdem_5691_3s5c7dJhTd_TcAsAh8s_KdKh4hKc() {
    assertEquals(
      "KdKh4hKc TcAsAh8s",
      Solver.process("omaha-holdem 3s5c7dJhTd TcAsAh8s KdKh4hKc"));
  }

  @Test
  public void test_omaha_holdem_5692_3d5d6sTcTs_QhKcAc4s_9c3cJd8h() {
    assertEquals(
      "QhKcAc4s 9c3cJd8h",
      Solver.process("omaha-holdem 3d5d6sTcTs QhKcAc4s 9c3cJd8h"));
  }

  @Test
  public void test_omaha_holdem_5693_3c7c9hAhKh_Qc4d6h3s_Th6cTs5h() {
    assertEquals(
      "Qc4d6h3s Th6cTs5h",
      Solver.process("omaha-holdem 3c7c9hAhKh Qc4d6h3s Th6cTs5h"));
  }

  @Test
  public void test_omaha_holdem_5694_5h7hAdJcKd_Th7c4hTd_8cJs3d8d_6h3s7s2c_8s5sKh9h() {
    assertEquals(
      "6h3s7s2c Th7c4hTd 8cJs3d8d 8s5sKh9h",
      Solver.process("omaha-holdem 5h7hAdJcKd Th7c4hTd 8cJs3d8d 6h3s7s2c 8s5sKh9h"));
  }

  @Test
  public void test_omaha_holdem_5695_2c3h4d9dTh_4s3cJd9h_TdKh8sQc_JhJsKsJc_TsAsAhTc_5c2h6d3s() {
    assertEquals(
      "TdKh8sQc JhJsKsJc 4s3cJd9h TsAsAhTc 5c2h6d3s",
      Solver.process("omaha-holdem 2c3h4d9dTh 4s3cJd9h TdKh8sQc JhJsKsJc TsAsAhTc 5c2h6d3s"));
  }

  @Test
  public void test_omaha_holdem_5696_3s4sAdKhQh_9h6dJs5c_6c8hQd3h_7h4h4dTc() {
    assertEquals(
      "9h6dJs5c 6c8hQd3h 7h4h4dTc",
      Solver.process("omaha-holdem 3s4sAdKhQh 9h6dJs5c 6c8hQd3h 7h4h4dTc"));
  }

  @Test
  public void test_omaha_holdem_5697_2s3s6h6sKh_4c3dAd9c_8dKs9d2h_Jh7h7cAh_6d7s5cJs_4d9s2c3c_Tc4h3hQd_Qh5sJc7d() {
    assertEquals(
      "Qh5sJc7d 4d9s2c3c Tc4h3hQd 4c3dAd9c Jh7h7cAh 8dKs9d2h 6d7s5cJs",
      Solver.process("omaha-holdem 2s3s6h6sKh 4c3dAd9c 8dKs9d2h Jh7h7cAh 6d7s5cJs 4d9s2c3c Tc4h3hQd Qh5sJc7d"));
  }

  @Test
  public void test_omaha_holdem_5698_2d3d6h7hJc_4d2s5h6c_4sAcAd9c_6d7s5d9h_KsAs8cQs_Tc4c3sQc_2h7dJdTh() {
    assertEquals(
      "KsAs8cQs Tc4c3sQc 4sAcAd9c 6d7s5d9h 2h7dJdTh 4d2s5h6c",
      Solver.process("omaha-holdem 2d3d6h7hJc 4d2s5h6c 4sAcAd9c 6d7s5d9h KsAs8cQs Tc4c3sQc 2h7dJdTh"));
  }

  @Test
  public void test_omaha_holdem_5699_6c6h6s9sQs_3h5h2cKd_9h9dJhQc() {
    assertEquals(
      "3h5h2cKd 9h9dJhQc",
      Solver.process("omaha-holdem 6c6h6s9sQs 3h5h2cKd 9h9dJhQc"));
  }

  @Test
  public void test_omaha_holdem_5700_5hKcKdQdTc_6cTh9hAh_7dJs4sKs_8sAc8c9c_Jd7c3c3d_6s2h7s5c_3sJc4d7h() {
    assertEquals(
      "3sJc4d7h Jd7c3c3d 6s2h7s5c 8sAc8c9c 6cTh9hAh 7dJs4sKs",
      Solver.process("omaha-holdem 5hKcKdQdTc 6cTh9hAh 7dJs4sKs 8sAc8c9c Jd7c3c3d 6s2h7s5c 3sJc4d7h"));
  }

  @Test
  public void test_omaha_holdem_5701_2d4s7h8dTc_4h4cTh3d_Jd9h9dQc_5d9c7s2h() {
    assertEquals(
      "5d9c7s2h 4h4cTh3d Jd9h9dQc",
      Solver.process("omaha-holdem 2d4s7h8dTc 4h4cTh3d Jd9h9dQc 5d9c7s2h"));
  }

  @Test
  public void test_omaha_holdem_5702_4h5c8hAdQd_KcTcKdQh_8sJh7h7c_6s8cKs3s_2dTd9s4d_4s7s9cQc() {
    assertEquals(
      "2dTd9s4d 8sJh7h7c 6s8cKs3s KcTcKdQh 4s7s9cQc",
      Solver.process("omaha-holdem 4h5c8hAdQd KcTcKdQh 8sJh7h7c 6s8cKs3s 2dTd9s4d 4s7s9cQc"));
  }

  @Test
  public void test_omaha_holdem_5703_5h7h7sAdJc_3dKhQd3s_2c8hKd3c_7c5sJhAh_7d5c5dTc_As8cTd9h() {
    assertEquals(
      "2c8hKd3c 3dKhQd3s As8cTd9h 7d5c5dTc 7c5sJhAh",
      Solver.process("omaha-holdem 5h7h7sAdJc 3dKhQd3s 2c8hKd3c 7c5sJhAh 7d5c5dTc As8cTd9h"));
  }

  @Test
  public void test_omaha_holdem_5704_3d3h6d7d9h_6sThQdJs_6h5cTs8s_8d5s4c6c() {
    assertEquals(
      "6sThQdJs 8d5s4c6c 6h5cTs8s",
      Solver.process("omaha-holdem 3d3h6d7d9h 6sThQdJs 6h5cTs8s 8d5s4c6c"));
  }

  @Test
  public void test_omaha_holdem_5705_4c4d5d8cJs_JhQdKc3s_5h2h6cTd_QcTc6hTh_Ah6sKd9h_5s9d7hAs_8hQsKsQh() {
    assertEquals(
      "Ah6sKd9h 5h2h6cTd 5s9d7hAs QcTc6hTh JhQdKc3s 8hQsKsQh",
      Solver.process("omaha-holdem 4c4d5d8cJs JhQdKc3s 5h2h6cTd QcTc6hTh Ah6sKd9h 5s9d7hAs 8hQsKsQh"));
  }

  @Test
  public void test_omaha_holdem_5706_5d9sJdKdTh_Ad7hQs2c_6sQhJh4c_Kh5cKs8c_Ts7dQcAc() {
    assertEquals(
      "Kh5cKs8c 6sQhJh4c Ad7hQs2c=Ts7dQcAc",
      Solver.process("omaha-holdem 5d9sJdKdTh Ad7hQs2c 6sQhJh4c Kh5cKs8c Ts7dQcAc"));
  }

  @Test
  public void test_omaha_holdem_5707_7c7h8d9cTd_8h6d8sKc_4hJc2sJs_3c6cJdTc_9h3h9sKd_Ks5cJhAh_5dAd3s8c() {
    assertEquals(
      "Ks5cJhAh 5dAd3s8c 4hJc2sJs 3c6cJdTc 8h6d8sKc 9h3h9sKd",
      Solver.process("omaha-holdem 7c7h8d9cTd 8h6d8sKc 4hJc2sJs 3c6cJdTc 9h3h9sKd Ks5cJhAh 5dAd3s8c"));
  }

  @Test
  public void test_omaha_holdem_5708_3hKcQcTcTh_Jh4s8dQh_6s4h2h8c_9d2sJs4c_6c5cJc6d_3c6h3d3s() {
    assertEquals(
      "6s4h2h8c Jh4s8dQh 9d2sJs4c 6c5cJc6d 3c6h3d3s",
      Solver.process("omaha-holdem 3hKcQcTcTh Jh4s8dQh 6s4h2h8c 9d2sJs4c 6c5cJc6d 3c6h3d3s"));
  }

  @Test
  public void test_omaha_holdem_5709_2c4d6cJdQc_Td5sQd7c_3s2d2s6s_2hKs5dJc_Ah9sAsJh_3hQh7d4h() {
    assertEquals(
      "Td5sQd7c Ah9sAsJh 2hKs5dJc 3hQh7d4h 3s2d2s6s",
      Solver.process("omaha-holdem 2c4d6cJdQc Td5sQd7c 3s2d2s6s 2hKs5dJc Ah9sAsJh 3hQh7d4h"));
  }

  @Test
  public void test_omaha_holdem_5710_2d3d6h9sAd_4dJdTcQh_3cJcTsKd_6c5d7sQd_Ks4h5h9d_2sAc9c8h() {
    assertEquals(
      "3cJcTsKd 2sAc9c8h Ks4h5h9d 4dJdTcQh 6c5d7sQd",
      Solver.process("omaha-holdem 2d3d6h9sAd 4dJdTcQh 3cJcTsKd 6c5d7sQd Ks4h5h9d 2sAc9c8h"));
  }

  @Test
  public void test_omaha_holdem_5711_5s6c9hAdKs_Td9sJc2d_JdKh4dQs_Tc9c5d2s_7sQhAsTs_Kd3h9d7d_8s2c4s8h_Jh5hAh7h_Ac4h6s7c() {
    assertEquals(
      "8s2c4s8h Td9sJc2d JdKh4dQs 7sQhAsTs Tc9c5d2s Kd3h9d7d Jh5hAh7h Ac4h6s7c",
      Solver.process("omaha-holdem 5s6c9hAdKs Td9sJc2d JdKh4dQs Tc9c5d2s 7sQhAsTs Kd3h9d7d 8s2c4s8h Jh5hAh7h Ac4h6s7c"));
  }

  @Test
  public void test_omaha_holdem_5712_4c5d6c7sJc_9s6d3dKh_JsAhJd7h_3cKd6h2d_Ks9d2cTc_7dJhQsAs_4d5s4h7c_Ad8d8cAc_Th8sQh2s() {
    assertEquals(
      "Th8sQh2s 7dJhQsAs 4d5s4h7c JsAhJd7h 3cKd6h2d=9s6d3dKh Ks9d2cTc Ad8d8cAc",
      Solver.process("omaha-holdem 4c5d6c7sJc 9s6d3dKh JsAhJd7h 3cKd6h2d Ks9d2cTc 7dJhQsAs 4d5s4h7c Ad8d8cAc Th8sQh2s"));
  }

  @Test
  public void test_omaha_holdem_5713_4c4s7h8sTd_Ks2sTs7c_5s3h9dKh() {
    assertEquals(
      "5s3h9dKh Ks2sTs7c",
      Solver.process("omaha-holdem 4c4s7h8sTd Ks2sTs7c 5s3h9dKh"));
  }

  @Test
  public void test_omaha_holdem_5714_4s5d6hJcKs_QsAd2sTc_Jh6d8c7s_8h6sQh5h() {
    assertEquals(
      "QsAd2sTc 8h6sQh5h Jh6d8c7s",
      Solver.process("omaha-holdem 4s5d6hJcKs QsAd2sTc Jh6d8c7s 8h6sQh5h"));
  }

  @Test
  public void test_omaha_holdem_5715_3h5d7hQhTc_Td6s2s5h_4s4dAh6c_Ac3cQc7s_6d2h2dAs_8c7d7cKh_8d3sTs9c_5s4cJh3d_5cQsJcKs_8sJdThKd() {
    assertEquals(
      "6d2h2dAs 8sJdThKd 5s4cJh3d 8d3sTs9c Td6s2s5h 5cQsJcKs Ac3cQc7s 8c7d7cKh 4s4dAh6c",
      Solver.process("omaha-holdem 3h5d7hQhTc Td6s2s5h 4s4dAh6c Ac3cQc7s 6d2h2dAs 8c7d7cKh 8d3sTs9c 5s4cJh3d 5cQsJcKs 8sJdThKd"));
  }

  @Test
  public void test_omaha_holdem_5716_2h3c8hJdJs_2c9c5d5s_9dAs6cTs_6d7s4d3d_8sQdTd7d_Jh7c5cQc_Jc9sQh4s() {
    assertEquals(
      "9dAs6cTs 6d7s4d3d 2c9c5d5s 8sQdTd7d Jc9sQh4s=Jh7c5cQc",
      Solver.process("omaha-holdem 2h3c8hJdJs 2c9c5d5s 9dAs6cTs 6d7s4d3d 8sQdTd7d Jh7c5cQc Jc9sQh4s"));
  }

  @Test
  public void test_omaha_holdem_5717_8c8d9sAsQh_5hJc7h6c_Kd9d4d6d_7dKh2c6s_Kc5dAdTh_Jh2hTc3s_4s9hQd2s_2dTd6hJd_4h5s3h8h() {
    assertEquals(
      "5hJc7h6c 7dKh2c6s Kd9d4d6d 4s9hQd2s Kc5dAdTh 4h5s3h8h 2dTd6hJd=Jh2hTc3s",
      Solver.process("omaha-holdem 8c8d9sAsQh 5hJc7h6c Kd9d4d6d 7dKh2c6s Kc5dAdTh Jh2hTc3s 4s9hQd2s 2dTd6hJd 4h5s3h8h"));
  }

  @Test
  public void test_omaha_holdem_5718_2d3d6sKdQs_KcKs4c6d_QcJc5s4d_7h3hAs5h_4hKhJs7s_Ac2cTc2s_3s8c8h9d_3c4s5dTh_8d9s9hAd() {
    assertEquals(
      "7h3hAs5h 3s8c8h9d 4hKhJs7s Ac2cTc2s KcKs4c6d 3c4s5dTh=QcJc5s4d 8d9s9hAd",
      Solver.process("omaha-holdem 2d3d6sKdQs KcKs4c6d QcJc5s4d 7h3hAs5h 4hKhJs7s Ac2cTc2s 3s8c8h9d 3c4s5dTh 8d9s9hAd"));
  }

  @Test
  public void test_omaha_holdem_5719_6d8h9cAcQs_4h7s2d3d_Tc7hTh7d_AsJc8s9d_3sQd4c9h() {
    assertEquals(
      "4h7s2d3d 3sQd4c9h AsJc8s9d Tc7hTh7d",
      Solver.process("omaha-holdem 6d8h9cAcQs 4h7s2d3d Tc7hTh7d AsJc8s9d 3sQd4c9h"));
  }

  @Test
  public void test_omaha_holdem_5720_3d7s8h8sQs_7hJs6s2s_As7dTc3h() {
    assertEquals(
      "As7dTc3h 7hJs6s2s",
      Solver.process("omaha-holdem 3d7s8h8sQs 7hJs6s2s As7dTc3h"));
  }

  @Test
  public void test_omaha_holdem_5721_4c8c8d8h9c_2h2dAsKd_4dQc7h6c_JhJd5sAc_9s4h6h5d_AhQhAd7c_Ks5h9dQd() {
    assertEquals(
      "9s4h6h5d Ks5h9dQd 4dQc7h6c 2h2dAsKd JhJd5sAc AhQhAd7c",
      Solver.process("omaha-holdem 4c8c8d8h9c 2h2dAsKd 4dQc7h6c JhJd5sAc 9s4h6h5d AhQhAd7c Ks5h9dQd"));
  }

  @Test
  public void test_omaha_holdem_5722_4s7h8dQsTd_Js9s3h5d_Qh9hQcKd_2s5c2d3s_Jh7s7d6d_2cTs8cKs_4dKc3cQd_5h2h9cTc() {
    assertEquals(
      "2s5c2d3s 5h2h9cTc 2cTs8cKs 4dKc3cQd Jh7s7d6d Qh9hQcKd Js9s3h5d",
      Solver.process("omaha-holdem 4s7h8dQsTd Js9s3h5d Qh9hQcKd 2s5c2d3s Jh7s7d6d 2cTs8cKs 4dKc3cQd 5h2h9cTc"));
  }

  @Test
  public void test_omaha_holdem_5723_3c7c8d9dAh_AsKs3s2s_6dQd4d4s() {
    assertEquals(
      "6dQd4d4s AsKs3s2s",
      Solver.process("omaha-holdem 3c7c8d9dAh AsKs3s2s 6dQd4d4s"));
  }

  @Test
  public void test_omaha_holdem_5724_6h7cJcJdTc_6sQc2s5h_9s5cAc9c_3cQh3hQd_8dKd6d7s_Kc2d2h3d_Js6c4dTh_8sTsQs9h_5sJh5dTd() {
    assertEquals(
      "Kc2d2h3d 6sQc2s5h 8dKd6d7s 3cQh3hQd 8sTsQs9h 9s5cAc9c 5sJh5dTd=Js6c4dTh",
      Solver.process("omaha-holdem 6h7cJcJdTc 6sQc2s5h 9s5cAc9c 3cQh3hQd 8dKd6d7s Kc2d2h3d Js6c4dTh 8sTsQs9h 5sJh5dTd"));
  }

  @Test
  public void test_omaha_holdem_5725_4c4d6c9cTs_6hJh5h5c_As7h5dTh_3s2sTcKs_4h9d3hJc_KdQd2c8d() {
    assertEquals(
      "KdQd2c8d 6hJh5h5c 3s2sTcKs As7h5dTh 4h9d3hJc",
      Solver.process("omaha-holdem 4c4d6c9cTs 6hJh5h5c As7h5dTh 3s2sTcKs 4h9d3hJc KdQd2c8d"));
  }

  @Test
  public void test_omaha_holdem_5726_5d7dAhJcKc_Ac9hJd9d_4s2d6d4c_5cJsKh6c_6h8dQh3c_2h5s8cKs() {
    assertEquals(
      "6h8dQh3c 4s2d6d4c 2h5s8cKs 5cJsKh6c Ac9hJd9d",
      Solver.process("omaha-holdem 5d7dAhJcKc Ac9hJd9d 4s2d6d4c 5cJsKh6c 6h8dQh3c 2h5s8cKs"));
  }

  @Test
  public void test_omaha_holdem_5727_2s4c5h7hJc_9hKs9cKc_3sTh2d3h_3d9s6cJd_JsAcTc5s() {
    assertEquals(
      "3sTh2d3h 9hKs9cKc JsAcTc5s 3d9s6cJd",
      Solver.process("omaha-holdem 2s4c5h7hJc 9hKs9cKc 3sTh2d3h 3d9s6cJd JsAcTc5s"));
  }

  @Test
  public void test_omaha_holdem_5728_3c8sAhKsTd_Qd7d2c2d_Th7hJdJc_8d6dKd8h_Ts7c9h7s_9d4sQh5d() {
    assertEquals(
      "9d4sQh5d Qd7d2c2d Ts7c9h7s Th7hJdJc 8d6dKd8h",
      Solver.process("omaha-holdem 3c8sAhKsTd Qd7d2c2d Th7hJdJc 8d6dKd8h Ts7c9h7s 9d4sQh5d"));
  }

  @Test
  public void test_omaha_holdem_5729_2d3d8h8sKs_Ah8cKcTc_5hJc6dAc_2h3sJdTh_TdQh3cAd_5c7h9c4s_9sQdJs4d_9d7d7cTs() {
    assertEquals(
      "5c7h9c4s 9sQdJs4d 5hJc6dAc 2h3sJdTh TdQh3cAd 9d7d7cTs Ah8cKcTc",
      Solver.process("omaha-holdem 2d3d8h8sKs Ah8cKcTc 5hJc6dAc 2h3sJdTh TdQh3cAd 5c7h9c4s 9sQdJs4d 9d7d7cTs"));
  }

  @Test
  public void test_omaha_holdem_5730_2h2s3h6cQc_5cAhQsAc_KdQdTh8d_Js7h3d6d() {
    assertEquals(
      "Js7h3d6d KdQdTh8d 5cAhQsAc",
      Solver.process("omaha-holdem 2h2s3h6cQc 5cAhQsAc KdQdTh8d Js7h3d6d"));
  }

  @Test
  public void test_omaha_holdem_5731_2h5h7hJsKd_KhTsQc6s_Jd5s8s5c_3s5d7s8c_4c9d2sAh_7cQs3hTd_Ac4dQh6h_Jh9sAs9h_Tc8h3cJc_4s2cQd3d() {
    assertEquals(
      "4s2cQd3d 4c9d2sAh 7cQs3hTd Tc8h3cJc KhTsQc6s 3s5d7s8c Jd5s8s5c Jh9sAs9h Ac4dQh6h",
      Solver.process("omaha-holdem 2h5h7hJsKd KhTsQc6s Jd5s8s5c 3s5d7s8c 4c9d2sAh 7cQs3hTd Ac4dQh6h Jh9sAs9h Tc8h3cJc 4s2cQd3d"));
  }

  @Test
  public void test_omaha_holdem_5732_2c4s8d9hTd_As3h2d5s_Ks4cKh6s_9cAdKdJd_Jc5h9s8s_Qh4d6d3s_2sQcAc5c_Ts8h4h7s_Qs7hJh6h_7c5dKc7d() {
    assertEquals(
      "2sQcAc5c=As3h2d5s Qh4d6d3s 7c5dKc7d 9cAdKdJd Ks4cKh6s Jc5h9s8s Ts8h4h7s Qs7hJh6h",
      Solver.process("omaha-holdem 2c4s8d9hTd As3h2d5s Ks4cKh6s 9cAdKdJd Jc5h9s8s Qh4d6d3s 2sQcAc5c Ts8h4h7s Qs7hJh6h 7c5dKc7d"));
  }

  @Test
  public void test_omaha_holdem_5733_7c8sJcJdKh_Ah4h9dAc_2h9c6sTh_2c8d4s3h_TdKsJs2d_5c3s3cKc_Kd6c7hQc_Ad8h8c6h() {
    assertEquals(
      "2c8d4s3h 5c3s3cKc Kd6c7hQc Ah4h9dAc 2h9c6sTh Ad8h8c6h TdKsJs2d",
      Solver.process("omaha-holdem 7c8sJcJdKh Ah4h9dAc 2h9c6sTh 2c8d4s3h TdKsJs2d 5c3s3cKc Kd6c7hQc Ad8h8c6h"));
  }

  @Test
  public void test_omaha_holdem_5734_2d6sKsTcTs_Kc2s9cQh_8s3hAs5h_Th4dTdJs_JdAh7h5c_8cJh8dQc() {
    assertEquals(
      "JdAh7h5c 8cJh8dQc Kc2s9cQh 8s3hAs5h Th4dTdJs",
      Solver.process("omaha-holdem 2d6sKsTcTs Kc2s9cQh 8s3hAs5h Th4dTdJs JdAh7h5c 8cJh8dQc"));
  }

  @Test
  public void test_omaha_holdem_5735_AdJcJhKcTs_5d5s9s7h_6dJd2s2d_7c4h6c4c_8cQdKsQh_Kd4dTh9c() {
    assertEquals(
      "7c4h6c4c 5d5s9s7h Kd4dTh9c 6dJd2s2d 8cQdKsQh",
      Solver.process("omaha-holdem AdJcJhKcTs 5d5s9s7h 6dJd2s2d 7c4h6c4c 8cQdKsQh Kd4dTh9c"));
  }

  @Test
  public void test_omaha_holdem_5736_3d5hTcTdTs_9hKc3s7c_JcJs4dTh_KsQsQh4s() {
    assertEquals(
      "9hKc3s7c KsQsQh4s JcJs4dTh",
      Solver.process("omaha-holdem 3d5hTcTdTs 9hKc3s7c JcJs4dTh KsQsQh4s"));
  }

  @Test
  public void test_omaha_holdem_5737_7c8d9sQcQs_6c7s7dJh_9c4c3d4d_5hAd9dJc_3sAhTd2d_QhTs8hJd_7h4s8cKd_2c3c8s3h() {
    assertEquals(
      "3sAhTd2d 2c3c8s3h 7h4s8cKd 9c4c3d4d 5hAd9dJc 6c7s7dJh QhTs8hJd",
      Solver.process("omaha-holdem 7c8d9sQcQs 6c7s7dJh 9c4c3d4d 5hAd9dJc 3sAhTd2d QhTs8hJd 7h4s8cKd 2c3c8s3h"));
  }

  @Test
  public void test_omaha_holdem_5738_8s9hAcTdTh_KhTc5s8d_Ks2sKcJc_6d5d6cQs_2d6sQcQh_6h3cAs5h_3d7cAd5c() {
    assertEquals(
      "6d5d6cQs 2d6sQcQh Ks2sKcJc 6h3cAs5h 3d7cAd5c KhTc5s8d",
      Solver.process("omaha-holdem 8s9hAcTdTh KhTc5s8d Ks2sKcJc 6d5d6cQs 2d6sQcQh 6h3cAs5h 3d7cAd5c"));
  }

  @Test
  public void test_omaha_holdem_5739_3h5h9sKdKs_5dJsKcTh_Qs2d8c6s_7cTs5cJh_As8hJd4c_Qd9dAd8s_KhJcQh4d_Ac7d7h6c_Qc7s9h5s_9c3cTd6h() {
    assertEquals(
      "Qs2d8c6s As8hJd4c 7cTs5cJh Ac7d7h6c 9c3cTd6h Qc7s9h5s Qd9dAd8s KhJcQh4d 5dJsKcTh",
      Solver.process("omaha-holdem 3h5h9sKdKs 5dJsKcTh Qs2d8c6s 7cTs5cJh As8hJd4c Qd9dAd8s KhJcQh4d Ac7d7h6c Qc7s9h5s 9c3cTd6h"));
  }

  @Test
  public void test_omaha_holdem_5740_5h9hJhTcTs_3cKsAh6s_JcQh5d3d_7d2cKhAc_8hQc9d3s_8sQdAsJd() {
    assertEquals(
      "3cKsAh6s=7d2cKhAc JcQh5d3d 8hQc9d3s=8sQdAsJd",
      Solver.process("omaha-holdem 5h9hJhTcTs 3cKsAh6s JcQh5d3d 7d2cKhAc 8hQc9d3s 8sQdAsJd"));
  }

  @Test
  public void test_omaha_holdem_5741_2h6d9sJdTs_Jc3s2c7d_Jh6h4d3h_AdKd2d2s_9h7c7hAc_5s5cTd3c_6s4c9c8s_ThQh5dAs_QcKc8hJs() {
    assertEquals(
      "9h7c7hAc 5s5cTd3c ThQh5dAs 6s4c9c8s Jc3s2c7d Jh6h4d3h AdKd2d2s QcKc8hJs",
      Solver.process("omaha-holdem 2h6d9sJdTs Jc3s2c7d Jh6h4d3h AdKd2d2s 9h7c7hAc 5s5cTd3c 6s4c9c8s ThQh5dAs QcKc8hJs"));
  }

  @Test
  public void test_omaha_holdem_5742_4h6c6h7cQd_9sJs9cJd_KcJcKd7s_JhAs4s4d() {
    assertEquals(
      "9sJs9cJd KcJcKd7s JhAs4s4d",
      Solver.process("omaha-holdem 4h6c6h7cQd 9sJs9cJd KcJcKd7s JhAs4s4d"));
  }

  @Test
  public void test_omaha_holdem_5743_2d5d6cQcTh_4cKdJc6d_2c9c3d8h_8d7sTd8c_Jd6hTsAd_4hJh5s2s_5h3hTcAc_6s8sJsAs_5c4dKc9d_KhQh9s3s() {
    assertEquals(
      "2c9c3d8h 5c4dKc9d 4cKdJc6d 6s8sJsAs 8d7sTd8c KhQh9s3s 4hJh5s2s 5h3hTcAc Jd6hTsAd",
      Solver.process("omaha-holdem 2d5d6cQcTh 4cKdJc6d 2c9c3d8h 8d7sTd8c Jd6hTsAd 4hJh5s2s 5h3hTcAc 6s8sJsAs 5c4dKc9d KhQh9s3s"));
  }

  @Test
  public void test_omaha_holdem_5744_4h5c8h9cQh_As8c7h3h_6h6cQc2c_JdAh5d7s_9d8s7dJc_Jh9hTs3c_2s6sAcKd() {
    assertEquals(
      "2s6sAcKd JdAh5d7s 6h6cQc2c 9d8s7dJc As8c7h3h Jh9hTs3c",
      Solver.process("omaha-holdem 4h5c8h9cQh As8c7h3h 6h6cQc2c JdAh5d7s 9d8s7dJc Jh9hTs3c 2s6sAcKd"));
  }

  @Test
  public void test_omaha_holdem_5745_5s7h9d9sTs_6c5d2hQc_5c4h9hQd_8dJsTcAd_8h2sQhAh_2dJc7c3d_4dJd8s8c_Kc3hKsAs_9c7sQsAc_3cKd4s2c() {
    assertEquals(
      "3cKd4s2c 8h2sQhAh 6c5d2hQc 2dJc7c3d 4dJd8s8c=8dJsTcAd Kc3hKsAs 5c4h9hQd 9c7sQsAc",
      Solver.process("omaha-holdem 5s7h9d9sTs 6c5d2hQc 5c4h9hQd 8dJsTcAd 8h2sQhAh 2dJc7c3d 4dJd8s8c Kc3hKsAs 9c7sQsAc 3cKd4s2c"));
  }

  @Test
  public void test_omaha_holdem_5746_6s7d8dJcTd_Ad8s4s9s_Ks6dKc7h() {
    assertEquals(
      "Ks6dKc7h Ad8s4s9s",
      Solver.process("omaha-holdem 6s7d8dJcTd Ad8s4s9s Ks6dKc7h"));
  }

  @Test
  public void test_omaha_holdem_5747_2c7d7h8dJc_Js4sTd4d_2d3c9c3d_2h7c8cQc_JhAh2sAd_5s7s6sKd() {
    assertEquals(
      "2d3c9c3d Js4sTd4d JhAh2sAd 5s7s6sKd 2h7c8cQc",
      Solver.process("omaha-holdem 2c7d7h8dJc Js4sTd4d 2d3c9c3d 2h7c8cQc JhAh2sAd 5s7s6sKd"));
  }

  @Test
  public void test_omaha_holdem_5748_9dAhAsQdTs_6hKdKc3h_8d8h2hQh_7s5dTd5h_3cQc6sQs_2c5s8s6d() {
    assertEquals(
      "2c5s8s6d 7s5dTd5h 8d8h2hQh 6hKdKc3h 3cQc6sQs",
      Solver.process("omaha-holdem 9dAhAsQdTs 6hKdKc3h 8d8h2hQh 7s5dTd5h 3cQc6sQs 2c5s8s6d"));
  }

  @Test
  public void test_omaha_holdem_5749_3d7s8d9dAs_4cQs9sKs_9hAh9c4s() {
    assertEquals(
      "4cQs9sKs 9hAh9c4s",
      Solver.process("omaha-holdem 3d7s8d9dAs 4cQs9sKs 9hAh9c4s"));
  }

}
