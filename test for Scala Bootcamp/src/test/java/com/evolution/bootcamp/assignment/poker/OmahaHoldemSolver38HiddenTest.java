
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver38HiddenTest {


  @Test
  public void test_omaha_holdem_9500_4h7d9cKcKd_5h5dTc5s_9s9d4d6h_KsAcAd8d_KhQhQc4s_3sJc8cJd_2hTd7sQd_Th7h2s6d_4c7c8hJs_5c2cJhQs() {
    assertEquals(
      "5c2cJhQs 5h5dTc5s Th7h2s6d 4c7c8hJs 2hTd7sQd 3sJc8cJd KsAcAd8d 9s9d4d6h KhQhQc4s",
      Solver.process("omaha-holdem 4h7d9cKcKd 5h5dTc5s 9s9d4d6h KsAcAd8d KhQhQc4s 3sJc8cJd 2hTd7sQd Th7h2s6d 4c7c8hJs 5c2cJhQs"));
  }

  @Test
  public void test_omaha_holdem_9501_2h3d5c5h6c_6hJsKs7h_QcKh2d7c_8sJdJh6d_5dKdJc8h_8d4d4hTc_4c2cQh9h_AsKcQd3h_2sAdTh3s() {
    assertEquals(
      "QcKh2d7c 2sAdTh3s=AsKcQd3h 8d4d4hTc 6hJsKs7h 8sJdJh6d 5dKdJc8h 4c2cQh9h",
      Solver.process("omaha-holdem 2h3d5c5h6c 6hJsKs7h QcKh2d7c 8sJdJh6d 5dKdJc8h 8d4d4hTc 4c2cQh9h AsKcQd3h 2sAdTh3s"));
  }

  @Test
  public void test_omaha_holdem_9502_2c2s5s6sAh_4cThJs8h_Jh2d5d6c_As7d5hKh_3c9c4h8d() {
    assertEquals(
      "4cThJs8h As7d5hKh 3c9c4h8d Jh2d5d6c",
      Solver.process("omaha-holdem 2c2s5s6sAh 4cThJs8h Jh2d5d6c As7d5hKh 3c9c4h8d"));
  }

  @Test
  public void test_omaha_holdem_9503_3s5c8dAdTh_6h3hTcKc_2c8s7cAs_AhQhQd2d_Ac4d8cJd_7h2s3dKh_5h5sTd7s() {
    assertEquals(
      "7h2s3dKh AhQhQd2d 6h3hTcKc 2c8s7cAs=Ac4d8cJd 5h5sTd7s",
      Solver.process("omaha-holdem 3s5c8dAdTh 6h3hTcKc 2c8s7cAs AhQhQd2d Ac4d8cJd 7h2s3dKh 5h5sTd7s"));
  }

  @Test
  public void test_omaha_holdem_9504_3s4s5dJhKs_3hJcAd8h_Td2d6c4h_Ah5sTc6d_Jd9cKcKd_9d6s4d3d() {
    assertEquals(
      "Ah5sTc6d 9d6s4d3d 3hJcAd8h Jd9cKcKd Td2d6c4h",
      Solver.process("omaha-holdem 3s4s5dJhKs 3hJcAd8h Td2d6c4h Ah5sTc6d Jd9cKcKd 9d6s4d3d"));
  }

  @Test
  public void test_omaha_holdem_9505_3h4d5s9sAd_3sQs6h6c_8hTc8d6d_4cQdKs4h() {
    assertEquals(
      "3sQs6h6c 8hTc8d6d 4cQdKs4h",
      Solver.process("omaha-holdem 3h4d5s9sAd 3sQs6h6c 8hTc8d6d 4cQdKs4h"));
  }

  @Test
  public void test_omaha_holdem_9506_2s6c9cJcKs_3c4c5sQd_5c8c6s9s_Jh3s4sTh_JsTs3hAc() {
    assertEquals(
      "Jh3s4sTh JsTs3hAc 3c4c5sQd 5c8c6s9s",
      Solver.process("omaha-holdem 2s6c9cJcKs 3c4c5sQd 5c8c6s9s Jh3s4sTh JsTs3hAc"));
  }

  @Test
  public void test_omaha_holdem_9507_4c4d8sAcQh_3sJhQs5h_2h4sQd3c() {
    assertEquals(
      "3sJhQs5h 2h4sQd3c",
      Solver.process("omaha-holdem 4c4d8sAcQh 3sJhQs5h 2h4sQd3c"));
  }

  @Test
  public void test_omaha_holdem_9508_4d9c9hAsKc_4h9s4c6c_Jh5sKs8d_7c9d2sQh() {
    assertEquals(
      "Jh5sKs8d 7c9d2sQh 4h9s4c6c",
      Solver.process("omaha-holdem 4d9c9hAsKc 4h9s4c6c Jh5sKs8d 7c9d2sQh"));
  }

  @Test
  public void test_omaha_holdem_9509_6d7d7sQdQs_4h2s3c9h_4dKh8hTs_9d6h8d8c_Js2c4c9s_QhAs4sAh_Ad2dTcKc() {
    assertEquals(
      "4h2s3c9h Js2c4c9s 4dKh8hTs QhAs4sAh 9d6h8d8c Ad2dTcKc",
      Solver.process("omaha-holdem 6d7d7sQdQs 4h2s3c9h 4dKh8hTs 9d6h8d8c Js2c4c9s QhAs4sAh Ad2dTcKc"));
  }

  @Test
  public void test_omaha_holdem_9510_4h8hAcAhQs_QdKhJd7c_2h6hJc2c_Js8c3d2s_3h4d7h5d_Qc9c8sAd_9h9s6c6d_9dKc4sKd() {
    assertEquals(
      "Js8c3d2s 9h9s6c6d QdKhJd7c 9dKc4sKd 2h6hJc2c 3h4d7h5d Qc9c8sAd",
      Solver.process("omaha-holdem 4h8hAcAhQs QdKhJd7c 2h6hJc2c Js8c3d2s 3h4d7h5d Qc9c8sAd 9h9s6c6d 9dKc4sKd"));
  }

  @Test
  public void test_omaha_holdem_9511_4s6s7d7sKs_8s8c9s6c_Kc3c4h4c_6hTdJd8d_Ah2d2cJh() {
    assertEquals(
      "Ah2d2cJh 6hTdJd8d 8s8c9s6c Kc3c4h4c",
      Solver.process("omaha-holdem 4s6s7d7sKs 8s8c9s6c Kc3c4h4c 6hTdJd8d Ah2d2cJh"));
  }

  @Test
  public void test_omaha_holdem_9512_2s5h7h8hJd_2h4h3h7s_9d2cAdJc_Ah8s7c3s_6cAcThKh_8c5d2d5c() {
    assertEquals(
      "Ah8s7c3s 9d2cAdJc 8c5d2d5c 2h4h3h7s 6cAcThKh",
      Solver.process("omaha-holdem 2s5h7h8hJd 2h4h3h7s 9d2cAdJc Ah8s7c3s 6cAcThKh 8c5d2d5c"));
  }

  @Test
  public void test_omaha_holdem_9513_4h5dAcJhTh_Js5h9dQd_8d6h2h5s_KcAd9h3c_3s6c3dTc_4s7dQs2d_2cQhKd2s_6s7sJdQc() {
    assertEquals(
      "4s7dQs2d 3s6c3dTc 6s7sJdQc KcAd9h3c Js5h9dQd 2cQhKd2s 8d6h2h5s",
      Solver.process("omaha-holdem 4h5dAcJhTh Js5h9dQd 8d6h2h5s KcAd9h3c 3s6c3dTc 4s7dQs2d 2cQhKd2s 6s7sJdQc"));
  }

  @Test
  public void test_omaha_holdem_9514_2s3c3h8c9h_5dQc7s4d_7c5h2cJc_8s9d4sQs_2dKsKcAh() {
    assertEquals(
      "5dQc7s4d 7c5h2cJc 8s9d4sQs 2dKsKcAh",
      Solver.process("omaha-holdem 2s3c3h8c9h 5dQc7s4d 7c5h2cJc 8s9d4sQs 2dKsKcAh"));
  }

  @Test
  public void test_omaha_holdem_9515_2s8s9d9hKd_7d8dJhAs_3hTd8hTh_6dQh5d9s() {
    assertEquals(
      "7d8dJhAs 3hTd8hTh 6dQh5d9s",
      Solver.process("omaha-holdem 2s8s9d9hKd 7d8dJhAs 3hTd8hTh 6dQh5d9s"));
  }

  @Test
  public void test_omaha_holdem_9516_2d3d4h9cQh_TsKdQc6s_8c5hQsQd_8dJsAsAd_KcJcJh4c_3s9h6c5s_AhKsTd5c() {
    assertEquals(
      "KcJcJh4c TsKdQc6s 8dJsAsAd 8c5hQsQd AhKsTd5c 3s9h6c5s",
      Solver.process("omaha-holdem 2d3d4h9cQh TsKdQc6s 8c5hQsQd 8dJsAsAd KcJcJh4c 3s9h6c5s AhKsTd5c"));
  }

  @Test
  public void test_omaha_holdem_9517_4c4d5h9dKc_Qd6hKsAh_8hQhTdQs_2h4s8d5c_Ac7h3hJh_7s9sTh2d_3cTc8s8c_6d3sJs6c_2s7cJd5d() {
    assertEquals(
      "Ac7h3hJh 2s7cJd5d 6d3sJs6c 3cTc8s8c 7s9sTh2d 8hQhTdQs Qd6hKsAh 2h4s8d5c",
      Solver.process("omaha-holdem 4c4d5h9dKc Qd6hKsAh 8hQhTdQs 2h4s8d5c Ac7h3hJh 7s9sTh2d 3cTc8s8c 6d3sJs6c 2s7cJd5d"));
  }

  @Test
  public void test_omaha_holdem_9518_6h7cAsJsTd_6s8d4hKs_TcThQd2s_3hQc9h7d_Qh6cJd4s() {
    assertEquals(
      "6s8d4hKs 3hQc9h7d Qh6cJd4s TcThQd2s",
      Solver.process("omaha-holdem 6h7cAsJsTd 6s8d4hKs TcThQd2s 3hQc9h7d Qh6cJd4s"));
  }

  @Test
  public void test_omaha_holdem_9519_5s6sKsQcTc_7h7cTdAc_AdJc4sAh_6cQd9h8c_6hKh9c3h_8d3s7d4h_Kd9s6d8s_2dJhQs5c_8h2h5dKc_3cAsQh4d() {
    assertEquals(
      "8d3s7d4h 7h7cTdAc 3cAsQh4d 2dJhQs5c 6cQd9h8c 8h2h5dKc 6hKh9c3h AdJc4sAh Kd9s6d8s",
      Solver.process("omaha-holdem 5s6sKsQcTc 7h7cTdAc AdJc4sAh 6cQd9h8c 6hKh9c3h 8d3s7d4h Kd9s6d8s 2dJhQs5c 8h2h5dKc 3cAsQh4d"));
  }

  @Test
  public void test_omaha_holdem_9520_4d6dJhJsKs_Ah4s4cQd_2dJcAd6s_Ts7dThTd_Qs5hAsKd_QhKh6c2c_Tc4h2s7h_8h3h2h8c_9h9c7s8s_Qc3s6h5d() {
    assertEquals(
      "Tc4h2s7h Qc3s6h5d 8h3h2h8c 9h9c7s8s Ts7dThTd QhKh6c2c Qs5hAsKd Ah4s4cQd 2dJcAd6s",
      Solver.process("omaha-holdem 4d6dJhJsKs Ah4s4cQd 2dJcAd6s Ts7dThTd Qs5hAsKd QhKh6c2c Tc4h2s7h 8h3h2h8c 9h9c7s8s Qc3s6h5d"));
  }

  @Test
  public void test_omaha_holdem_9521_6c7dJhKdTh_Kc3s6d9c_6s2h4sTd_9h2sQd8h() {
    assertEquals(
      "6s2h4sTd Kc3s6d9c 9h2sQd8h",
      Solver.process("omaha-holdem 6c7dJhKdTh Kc3s6d9c 6s2h4sTd 9h2sQd8h"));
  }

  @Test
  public void test_omaha_holdem_9522_2c2h9hAcKs_7s3cJc3s_KhQc9sTc_KcQhThTs_5dKd4c7c_AdJh6d8c_3h5c2s2d_4s3d8dJd() {
    assertEquals(
      "4s3d8dJd 7s3cJc3s 5dKd4c7c KcQhThTs KhQc9sTc AdJh6d8c 3h5c2s2d",
      Solver.process("omaha-holdem 2c2h9hAcKs 7s3cJc3s KhQc9sTc KcQhThTs 5dKd4c7c AdJh6d8c 3h5c2s2d 4s3d8dJd"));
  }

  @Test
  public void test_omaha_holdem_9523_6dQcTcTdTh_Js9s8dJd_QsAdAs3h() {
    assertEquals(
      "Js9s8dJd QsAdAs3h",
      Solver.process("omaha-holdem 6dQcTcTdTh Js9s8dJd QsAdAs3h"));
  }

  @Test
  public void test_omaha_holdem_9524_2c3sAdKdTh_7cKs4c2d_9hKhKcQc_Qd8s5s3c_Ac2hQsTs() {
    assertEquals(
      "Qd8s5s3c 7cKs4c2d Ac2hQsTs 9hKhKcQc",
      Solver.process("omaha-holdem 2c3sAdKdTh 7cKs4c2d 9hKhKcQc Qd8s5s3c Ac2hQsTs"));
  }

  @Test
  public void test_omaha_holdem_9525_3h5c5d7h8c_AsJs4d8h_6c9h2sAd_KsKhTh4s_9sQs9dAh_3s3d2c2h() {
    assertEquals(
      "AsJs4d8h 9sQs9dAh KsKhTh4s 6c9h2sAd 3s3d2c2h",
      Solver.process("omaha-holdem 3h5c5d7h8c AsJs4d8h 6c9h2sAd KsKhTh4s 9sQs9dAh 3s3d2c2h"));
  }

  @Test
  public void test_omaha_holdem_9526_2d6h8dJsTh_6sQh5s7s_QdTd6d4h_3cAc5h9h_5dKd5c9c_3h9s2h8s_3s4s3d8h() {
    assertEquals(
      "3cAc5h9h 5dKd5c9c 6sQh5s7s 3s4s3d8h 3h9s2h8s QdTd6d4h",
      Solver.process("omaha-holdem 2d6h8dJsTh 6sQh5s7s QdTd6d4h 3cAc5h9h 5dKd5c9c 3h9s2h8s 3s4s3d8h"));
  }

  @Test
  public void test_omaha_holdem_9527_2s3sAdTdTh_JhJdTcQs_3c9sKdAh_Qh6hKhJc_8s9h2h8h() {
    assertEquals(
      "Qh6hKhJc 8s9h2h8h 3c9sKdAh JhJdTcQs",
      Solver.process("omaha-holdem 2s3sAdTdTh JhJdTcQs 3c9sKdAh Qh6hKhJc 8s9h2h8h"));
  }

  @Test
  public void test_omaha_holdem_9528_6h6s7cKhQc_Ks2dTh6c_4h9c5c5d_Td3d9s3s_KcJsJcAh_6dTs8cQh() {
    assertEquals(
      "Td3d9s3s 4h9c5c5d KcJsJcAh 6dTs8cQh Ks2dTh6c",
      Solver.process("omaha-holdem 6h6s7cKhQc Ks2dTh6c 4h9c5c5d Td3d9s3s KcJsJcAh 6dTs8cQh"));
  }

  @Test
  public void test_omaha_holdem_9529_6s7c9dKhTh_3s5c8hJc_Ks6hTd7h_TsKdJs8d_2dAs5d7d_Qs3cQd3h_2s5s6c2c_3dAdJd8s() {
    assertEquals(
      "2s5s6c2c 2dAs5d7d Qs3cQd3h Ks6hTd7h 3dAdJd8s=3s5c8hJc=TsKdJs8d",
      Solver.process("omaha-holdem 6s7c9dKhTh 3s5c8hJc Ks6hTd7h TsKdJs8d 2dAs5d7d Qs3cQd3h 2s5s6c2c 3dAdJd8s"));
  }

  @Test
  public void test_omaha_holdem_9530_5d6cAsJsTh_7h2d8c7s_TdKh8d8h_3h6s8s6d_3sJd4h9c_Ac5s9h4c_5hQh3dQs_2hAh4dQc_Jh5c9sJc_9dKdKsTc() {
    assertEquals(
      "7h2d8c7s TdKh8d8h 3sJd4h9c 5hQh3dQs 9dKdKsTc 2hAh4dQc Ac5s9h4c 3h6s8s6d Jh5c9sJc",
      Solver.process("omaha-holdem 5d6cAsJsTh 7h2d8c7s TdKh8d8h 3h6s8s6d 3sJd4h9c Ac5s9h4c 5hQh3dQs 2hAh4dQc Jh5c9sJc 9dKdKsTc"));
  }

  @Test
  public void test_omaha_holdem_9531_4hAcKhQcTd_7c6d2dKd_4sJh8c3d_JcKcQd2c_7s9dQs4c_KsAsAd4d_9hQh5c8h() {
    assertEquals(
      "4sJh8c3d 9hQh5c8h 7c6d2dKd 7s9dQs4c KsAsAd4d JcKcQd2c",
      Solver.process("omaha-holdem 4hAcKhQcTd 7c6d2dKd 4sJh8c3d JcKcQd2c 7s9dQs4c KsAsAd4d 9hQh5c8h"));
  }

  @Test
  public void test_omaha_holdem_9532_2s3d4h8dKs_2c6d5s8s_Ac9sJsQc_9hTs8h5d() {
    assertEquals(
      "Ac9sJsQc 9hTs8h5d 2c6d5s8s",
      Solver.process("omaha-holdem 2s3d4h8dKs 2c6d5s8s Ac9sJsQc 9hTs8h5d"));
  }

  @Test
  public void test_omaha_holdem_9533_7c8d9sKhKs_8s4sTs4h_3d5dAcQc_8c3cQh5s_6s7sAdTh_Qd7h3h6c_9hJcTd7d_5c6hJs2s_Kd5hQsJh() {
    assertEquals(
      "3d5dAcQc Qd7h3h6c 8s4sTs4h 8c3cQh5s Kd5hQsJh 5c6hJs2s 6s7sAdTh 9hJcTd7d",
      Solver.process("omaha-holdem 7c8d9sKhKs 8s4sTs4h 3d5dAcQc 8c3cQh5s 6s7sAdTh Qd7h3h6c 9hJcTd7d 5c6hJs2s Kd5hQsJh"));
  }

  @Test
  public void test_omaha_holdem_9534_3s8sAcAdQd_9cKdJc9s_7dAhKc5d_4sQc4d3h_6d4cQh5c_2h6c6hKs_6s8h9h7s() {
    assertEquals(
      "2h6c6hKs 6s8h9h7s 9cKdJc9s 4sQc4d3h 6d4cQh5c 7dAhKc5d",
      Solver.process("omaha-holdem 3s8sAcAdQd 9cKdJc9s 7dAhKc5d 4sQc4d3h 6d4cQh5c 2h6c6hKs 6s8h9h7s"));
  }

  @Test
  public void test_omaha_holdem_9535_5s8d8hQcQh_Th5h5dQs_3d6c9sAs_7dJd6hTd_4cQd4d7s() {
    assertEquals(
      "7dJd6hTd 3d6c9sAs 4cQd4d7s Th5h5dQs",
      Solver.process("omaha-holdem 5s8d8hQcQh Th5h5dQs 3d6c9sAs 7dJd6hTd 4cQd4d7s"));
  }

  @Test
  public void test_omaha_holdem_9536_7h8sAcQdTc_5s8d7s4d_As3cQc3s() {
    assertEquals(
      "5s8d7s4d As3cQc3s",
      Solver.process("omaha-holdem 7h8sAcQdTc 5s8d7s4d As3cQc3s"));
  }

  @Test
  public void test_omaha_holdem_9537_3s6h8s9sQs_Jc4h7dQc_Th8hAh2d_9d7s2s4c_8d3dTsQh() {
    assertEquals(
      "Th8hAh2d Jc4h7dQc 8d3dTsQh 9d7s2s4c",
      Solver.process("omaha-holdem 3s6h8s9sQs Jc4h7dQc Th8hAh2d 9d7s2s4c 8d3dTsQh"));
  }

  @Test
  public void test_omaha_holdem_9538_3h3s6s7cQh_Tc6c9dQc_2d9h7d5h_8dTs8cKc_4hTd2c4c() {
    assertEquals(
      "4hTd2c4c 2d9h7d5h 8dTs8cKc Tc6c9dQc",
      Solver.process("omaha-holdem 3h3s6s7cQh Tc6c9dQc 2d9h7d5h 8dTs8cKc 4hTd2c4c"));
  }

  @Test
  public void test_omaha_holdem_9539_6h9c9hJhTc_Ad4dJcTd_Qc8hTs5c_3d7h2c2h_Qd6cTh5s_3cKdKcAs_8cAh4h6s_Qh8s6d5h_5d4c2sKs() {
    assertEquals(
      "5d4c2sKs Qd6cTh5s Ad4dJcTd 3cKdKcAs Qc8hTs5c 3d7h2c2h Qh8s6d5h 8cAh4h6s",
      Solver.process("omaha-holdem 6h9c9hJhTc Ad4dJcTd Qc8hTs5c 3d7h2c2h Qd6cTh5s 3cKdKcAs 8cAh4h6s Qh8s6d5h 5d4c2sKs"));
  }

  @Test
  public void test_omaha_holdem_9540_3s4s8d8h9d_Qh5hKc6d_4cJs2dTs_KdJcJd7s_5dAh3d7c() {
    assertEquals(
      "Qh5hKc6d 5dAh3d7c 4cJs2dTs KdJcJd7s",
      Solver.process("omaha-holdem 3s4s8d8h9d Qh5hKc6d 4cJs2dTs KdJcJd7s 5dAh3d7c"));
  }

  @Test
  public void test_omaha_holdem_9541_2h7c9dJdKd_9sKc9h5c_6s5s8h2c_Qs3d5dJc() {
    assertEquals(
      "6s5s8h2c 9sKc9h5c Qs3d5dJc",
      Solver.process("omaha-holdem 2h7c9dJdKd 9sKc9h5c 6s5s8h2c Qs3d5dJc"));
  }

  @Test
  public void test_omaha_holdem_9542_4h8dAhJdKd_9h5d4d7s_Qs5cJh3s_TdJs7dTc_As8s6dJc_5sAc9d2d_2h6s2cTh_Kc2s5h4c_8hAd9s7h() {
    assertEquals(
      "2h6s2cTh Qs5cJh3s Kc2s5h4c 8hAd9s7h As8s6dJc 9h5d4d7s 5sAc9d2d TdJs7dTc",
      Solver.process("omaha-holdem 4h8dAhJdKd 9h5d4d7s Qs5cJh3s TdJs7dTc As8s6dJc 5sAc9d2d 2h6s2cTh Kc2s5h4c 8hAd9s7h"));
  }

  @Test
  public void test_omaha_holdem_9543_4d6c8dQdTd_7s4cQc8c_9dKc9c8s_KsJs5cTh_5hAsQhJc_JdKh7c9h_2s2cTsJh_3s4s3dAd_5s4hTc6s() {
    assertEquals(
      "9dKc9c8s 2s2cTsJh KsJs5cTh 5hAsQhJc 5s4hTc6s 7s4cQc8c JdKh7c9h 3s4s3dAd",
      Solver.process("omaha-holdem 4d6c8dQdTd 7s4cQc8c 9dKc9c8s KsJs5cTh 5hAsQhJc JdKh7c9h 2s2cTsJh 3s4s3dAd 5s4hTc6s"));
  }

  @Test
  public void test_omaha_holdem_9544_4h7s9c9hQh_3cAs7c2s_JsKsAc3h_ThTs8h5h_TcJc5c8s_6d6cQsKd_Jh8c9s2c() {
    assertEquals(
      "TcJc5c8s JsKsAc3h 3cAs7c2s 6d6cQsKd Jh8c9s2c ThTs8h5h",
      Solver.process("omaha-holdem 4h7s9c9hQh 3cAs7c2s JsKsAc3h ThTs8h5h TcJc5c8s 6d6cQsKd Jh8c9s2c"));
  }

  @Test
  public void test_omaha_holdem_9545_2s5s7s8sQh_As9hAh3d_KdKs2dJd_4c4dAcTs_9d5h5dAd_Qc7h7d5c_6hThQs6d_JcTd8h2h() {
    assertEquals(
      "4c4dAcTs 6hThQs6d KdKs2dJd As9hAh3d JcTd8h2h 9d5h5dAd Qc7h7d5c",
      Solver.process("omaha-holdem 2s5s7s8sQh As9hAh3d KdKs2dJd 4c4dAcTs 9d5h5dAd Qc7h7d5c 6hThQs6d JcTd8h2h"));
  }

  @Test
  public void test_omaha_holdem_9546_4c6hKcTdTh_8h6dJhTs_KsAc5hJc_2d2cQc9h_6s3sAs9s_QsQd2s5s_4d7h8d6c_7c5c2h7d() {
    assertEquals(
      "2d2cQc9h 4d7h8d6c 6s3sAs9s 7c5c2h7d QsQd2s5s KsAc5hJc 8h6dJhTs",
      Solver.process("omaha-holdem 4c6hKcTdTh 8h6dJhTs KsAc5hJc 2d2cQc9h 6s3sAs9s QsQd2s5s 4d7h8d6c 7c5c2h7d"));
  }

  @Test
  public void test_omaha_holdem_9547_4c6s9sJhTh_Kc8s5dJc_Ks5c9c2c_TcQsQh2s_Jd8c3c3d_AcAd6h3h_6cKd8d7s_2hQdKh7h() {
    assertEquals(
      "Ks5c9c2c Jd8c3c3d Kc8s5dJc TcQsQh2s AcAd6h3h 6cKd8d7s 2hQdKh7h",
      Solver.process("omaha-holdem 4c6s9sJhTh Kc8s5dJc Ks5c9c2c TcQsQh2s Jd8c3c3d AcAd6h3h 6cKd8d7s 2hQdKh7h"));
  }

  @Test
  public void test_omaha_holdem_9548_2c5s7dAsKs_Qh4d4h2d_5c7hAdJd_Jc4sAh2s_2hJs9sQd() {
    assertEquals(
      "Qh4d4h2d 5c7hAdJd Jc4sAh2s 2hJs9sQd",
      Solver.process("omaha-holdem 2c5s7dAsKs Qh4d4h2d 5c7hAdJd Jc4sAh2s 2hJs9sQd"));
  }

  @Test
  public void test_omaha_holdem_9549_4h5s7d7sAh_Kd3dJhJs_7h3sQhKc_8h7c4d2d() {
    assertEquals(
      "Kd3dJhJs 7h3sQhKc 8h7c4d2d",
      Solver.process("omaha-holdem 4h5s7d7sAh Kd3dJhJs 7h3sQhKc 8h7c4d2d"));
  }

  @Test
  public void test_omaha_holdem_9550_2s5s9dKhTc_As5d3dQs_Ad6h7hJh_Th8dKsKc_3sAhTd7c() {
    assertEquals(
      "Ad6h7hJh As5d3dQs 3sAhTd7c Th8dKsKc",
      Solver.process("omaha-holdem 2s5s9dKhTc As5d3dQs Ad6h7hJh Th8dKsKc 3sAhTd7c"));
  }

  @Test
  public void test_omaha_holdem_9551_5h7h7sQcQd_2s8c6hJh_7d7cQhAs() {
    assertEquals(
      "2s8c6hJh 7d7cQhAs",
      Solver.process("omaha-holdem 5h7h7sQcQd 2s8c6hJh 7d7cQhAs"));
  }

  @Test
  public void test_omaha_holdem_9552_4s8c8sKcQc_JcQh2d3d_3h5h3cQs_5d9d2h4c_7d3s7c6c() {
    assertEquals(
      "5d9d2h4c 3h5h3cQs JcQh2d3d 7d3s7c6c",
      Solver.process("omaha-holdem 4s8c8sKcQc JcQh2d3d 3h5h3cQs 5d9d2h4c 7d3s7c6c"));
  }

  @Test
  public void test_omaha_holdem_9553_3d6d6s9cJc_9h6c7s3h_4dKd7d6h_4h9s5d7c_5s7h2cTc_Qs8s4sQd_5h9d4cKc_Jd8dAs8c_2dTs2h2s_3c5cAhAd() {
    assertEquals(
      "5s7h2cTc 2dTs2h2s 4h9s5d7c 5h9d4cKc Jd8dAs8c Qs8s4sQd 3c5cAhAd 4dKd7d6h 9h6c7s3h",
      Solver.process("omaha-holdem 3d6d6s9cJc 9h6c7s3h 4dKd7d6h 4h9s5d7c 5s7h2cTc Qs8s4sQd 5h9d4cKc Jd8dAs8c 2dTs2h2s 3c5cAhAd"));
  }

  @Test
  public void test_omaha_holdem_9554_4c6c8h8sJc_5s9cJh3c_3h2h7h4h_Th8dKd4d_5h3dTc7d() {
    assertEquals(
      "3h2h7h4h 5h3dTc7d 5s9cJh3c Th8dKd4d",
      Solver.process("omaha-holdem 4c6c8h8sJc 5s9cJh3c 3h2h7h4h Th8dKd4d 5h3dTc7d"));
  }

  @Test
  public void test_omaha_holdem_9555_3c6h7s8sTd_4cAs5c6c_9c9h4s6d_Ah3d3sAd_Jh3h5dJd_Kc4h8c7h() {
    assertEquals(
      "Jh3h5dJd Kc4h8c7h Ah3d3sAd 4cAs5c6c 9c9h4s6d",
      Solver.process("omaha-holdem 3c6h7s8sTd 4cAs5c6c 9c9h4s6d Ah3d3sAd Jh3h5dJd Kc4h8c7h"));
  }

  @Test
  public void test_omaha_holdem_9556_4h7d8dJsKs_TsKd5s3h_9dAdJc8h_5d5c3cQh_Jd7h6s4d() {
    assertEquals(
      "5d5c3cQh TsKd5s3h Jd7h6s4d 9dAdJc8h",
      Solver.process("omaha-holdem 4h7d8dJsKs TsKd5s3h 9dAdJc8h 5d5c3cQh Jd7h6s4d"));
  }

  @Test
  public void test_omaha_holdem_9557_3s8hAhQhTd_JdAdQsKc_Qc3d4d9c_6sJcAcTc_5c4h6hTs() {
    assertEquals(
      "Qc3d4d9c 6sJcAcTc JdAdQsKc 5c4h6hTs",
      Solver.process("omaha-holdem 3s8hAhQhTd JdAdQsKc Qc3d4d9c 6sJcAcTc 5c4h6hTs"));
  }

  @Test
  public void test_omaha_holdem_9558_3h4sQdTcTh_TsAs7cKc_6cJd8d9c_KsTd3c6h_Js5d3d2c_Kh8c7hKd_Qh9h2h5s_2d4d6s5h_9s4cAh2s() {
    assertEquals(
      "6cJd8d9c Js5d3d2c 2d4d6s5h 9s4cAh2s Qh9h2h5s Kh8c7hKd TsAs7cKc KsTd3c6h",
      Solver.process("omaha-holdem 3h4sQdTcTh TsAs7cKc 6cJd8d9c KsTd3c6h Js5d3d2c Kh8c7hKd Qh9h2h5s 2d4d6s5h 9s4cAh2s"));
  }

  @Test
  public void test_omaha_holdem_9559_3s6d7c8hQd_6sTs4cKc_4h6hQc4s_Tc7h2d9c_3h9h6c5s_Th3d4dJd_Js7dQhAd() {
    assertEquals(
      "Th3d4dJd 6sTs4cKc 4h6hQc4s Js7dQhAd 3h9h6c5s Tc7h2d9c",
      Solver.process("omaha-holdem 3s6d7c8hQd 6sTs4cKc 4h6hQc4s Tc7h2d9c 3h9h6c5s Th3d4dJd Js7dQhAd"));
  }

  @Test
  public void test_omaha_holdem_9560_3s4c8sKdQc_5dJsAd6c_Qd8hJhTh() {
    assertEquals(
      "5dJsAd6c Qd8hJhTh",
      Solver.process("omaha-holdem 3s4c8sKdQc 5dJsAd6c Qd8hJhTh"));
  }

  @Test
  public void test_omaha_holdem_9561_2h7d8hJsKs_3sTsKcQs_6c7s9sTc_Ad9c3cJc_7hKhJh2s() {
    assertEquals(
      "Ad9c3cJc 3sTsKcQs 7hKhJh2s 6c7s9sTc",
      Solver.process("omaha-holdem 2h7d8hJsKs 3sTsKcQs 6c7s9sTc Ad9c3cJc 7hKhJh2s"));
  }

  @Test
  public void test_omaha_holdem_9562_2d7h9cAdQd_6s8s3hKs_Kd4cQc3s_Jh5c9d6d_6h3c4s6c_5hJsTs7c_Ah7dKc5d_2h2s3dTd_8c9s8dAc() {
    assertEquals(
      "6s8s3hKs 6h3c4s6c 5hJsTs7c Kd4cQc3s 8c9s8dAc Ah7dKc5d Jh5c9d6d 2h2s3dTd",
      Solver.process("omaha-holdem 2d7h9cAdQd 6s8s3hKs Kd4cQc3s Jh5c9d6d 6h3c4s6c 5hJsTs7c Ah7dKc5d 2h2s3dTd 8c9s8dAc"));
  }

  @Test
  public void test_omaha_holdem_9563_4h5d7sAsQh_3d2sTd3c_5cJd3hJh_5h6sTc4d_Qd4s2c2d_4cJs8h7h_6h9dJcAc_7dQs8d6d() {
    assertEquals(
      "5cJd3hJh 6h9dJcAc 5h6sTc4d 4cJs8h7h Qd4s2c2d 3d2sTd3c 7dQs8d6d",
      Solver.process("omaha-holdem 4h5d7sAsQh 3d2sTd3c 5cJd3hJh 5h6sTc4d Qd4s2c2d 4cJs8h7h 6h9dJcAc 7dQs8d6d"));
  }

  @Test
  public void test_omaha_holdem_9564_2h7c7d8hTs_Ah8d3s9s_As3cAd5s_2s7h2cKh_Qc4dKd9d_Js4s6d7s_3d9h8c8s_Jh5d4cTc() {
    assertEquals(
      "Qc4dKd9d Ah8d3s9s Jh5d4cTc As3cAd5s Js4s6d7s 2s7h2cKh 3d9h8c8s",
      Solver.process("omaha-holdem 2h7c7d8hTs Ah8d3s9s As3cAd5s 2s7h2cKh Qc4dKd9d Js4s6d7s 3d9h8c8s Jh5d4cTc"));
  }

  @Test
  public void test_omaha_holdem_9565_2d3d8c9sJh_6cJs5cAc_9d3s8d7s_Jc7c4dAd_AhKdTh6d_9h3cJd3h_Ks5dQc7h() {
    assertEquals(
      "Ks5dQc7h AhKdTh6d 6cJs5cAc=Jc7c4dAd 9d3s8d7s 9h3cJd3h",
      Solver.process("omaha-holdem 2d3d8c9sJh 6cJs5cAc 9d3s8d7s Jc7c4dAd AhKdTh6d 9h3cJd3h Ks5dQc7h"));
  }

  @Test
  public void test_omaha_holdem_9566_3d3h4s5h7s_Qh2hQsTc_9h6sKc8s_6hAs2s6d_Ah9cKh5d() {
    assertEquals(
      "Ah9cKh5d Qh2hQsTc 6hAs2s6d 9h6sKc8s",
      Solver.process("omaha-holdem 3d3h4s5h7s Qh2hQsTc 9h6sKc8s 6hAs2s6d Ah9cKh5d"));
  }

  @Test
  public void test_omaha_holdem_9567_2c3s5h7dTh_4h8s3h6h_JdKsQs9d_6cTsAh6s_5cKc5s6d_As9sAdQd_7h2dKhKd() {
    assertEquals(
      "JdKsQs9d 6cTsAh6s As9sAdQd 7h2dKhKd 5cKc5s6d 4h8s3h6h",
      Solver.process("omaha-holdem 2c3s5h7dTh 4h8s3h6h JdKsQs9d 6cTsAh6s 5cKc5s6d As9sAdQd 7h2dKhKd"));
  }

  @Test
  public void test_omaha_holdem_9568_2h3s9c9sJs_Kd8d4sAs_Jh3h4d6d_5d7d8c6c_3dTs9hKc_Qc8h3c4c_Th5s2c4h_QdJcAcAh() {
    assertEquals(
      "5d7d8c6c Th5s2c4h Qc8h3c4c Jh3h4d6d QdJcAcAh Kd8d4sAs 3dTs9hKc",
      Solver.process("omaha-holdem 2h3s9c9sJs Kd8d4sAs Jh3h4d6d 5d7d8c6c 3dTs9hKc Qc8h3c4c Th5s2c4h QdJcAcAh"));
  }

  @Test
  public void test_omaha_holdem_9569_2c4c6s7cJs_2h3s8dTc_AhAd9cQs_9s3d9d7d_JcJh6d2s_5hKc8h5s_4s4hKdKh_4d7hJdTh_2d5dAsQh() {
    assertEquals(
      "2h3s8dTc 2d5dAsQh 9s3d9d7d AhAd9cQs 4d7hJdTh 4s4hKdKh JcJh6d2s 5hKc8h5s",
      Solver.process("omaha-holdem 2c4c6s7cJs 2h3s8dTc AhAd9cQs 9s3d9d7d JcJh6d2s 5hKc8h5s 4s4hKdKh 4d7hJdTh 2d5dAsQh"));
  }

  @Test
  public void test_omaha_holdem_9570_2s5c9sAdTd_KhKc8c8s_Qs2h8hKs_7c2cAhQh() {
    assertEquals(
      "Qs2h8hKs KhKc8c8s 7c2cAhQh",
      Solver.process("omaha-holdem 2s5c9sAdTd KhKc8c8s Qs2h8hKs 7c2cAhQh"));
  }

  @Test
  public void test_omaha_holdem_9571_8cJhKcKdKs_TcAcAd7d_Js7s2cQc_2h2dQs6d_4h3c6c5d_KhJc5sQd_5hJd6s2s_9d7hAh8d() {
    assertEquals(
      "4h3c6c5d 5hJd6s2s Js7s2cQc 9d7hAh8d 2h2dQs6d TcAcAd7d KhJc5sQd",
      Solver.process("omaha-holdem 8cJhKcKdKs TcAcAd7d Js7s2cQc 2h2dQs6d 4h3c6c5d KhJc5sQd 5hJd6s2s 9d7hAh8d"));
  }

  @Test
  public void test_omaha_holdem_9572_2dJdKcKdKs_4d3hJc8s_5h8dAdQh_7c9s6d7h_4h7dKh8c_3d3c2s7s_6sAcJsTc() {
    assertEquals(
      "4d3hJc8s 6sAcJsTc 5h8dAdQh 3d3c2s7s 7c9s6d7h 4h7dKh8c",
      Solver.process("omaha-holdem 2dJdKcKdKs 4d3hJc8s 5h8dAdQh 7c9s6d7h 4h7dKh8c 3d3c2s7s 6sAcJsTc"));
  }

  @Test
  public void test_omaha_holdem_9573_5d5h6h7c9c_Ad5sKhAh_8dJcTs7s_KsJdAsQd_7d8c2s2d() {
    assertEquals(
      "KsJdAsQd Ad5sKhAh 7d8c2s2d 8dJcTs7s",
      Solver.process("omaha-holdem 5d5h6h7c9c Ad5sKhAh 8dJcTs7s KsJdAsQd 7d8c2s2d"));
  }

  @Test
  public void test_omaha_holdem_9574_3d3s4d6cAd_8hQsJhAs_9dTc8sJc_Kc9c3cTh_Ac3h8c2h_7c5h4s7s() {
    assertEquals(
      "9dTc8sJc 8hQsJhAs Kc9c3cTh 7c5h4s7s Ac3h8c2h",
      Solver.process("omaha-holdem 3d3s4d6cAd 8hQsJhAs 9dTc8sJc Kc9c3cTh Ac3h8c2h 7c5h4s7s"));
  }

  @Test
  public void test_omaha_holdem_9575_3s4c5d6cJs_QsJhJd9s_3h3d9c5h_Ad2cQd2h() {
    assertEquals(
      "3h3d9c5h QsJhJd9s Ad2cQd2h",
      Solver.process("omaha-holdem 3s4c5d6cJs QsJhJd9s 3h3d9c5h Ad2cQd2h"));
  }

  @Test
  public void test_omaha_holdem_9576_2h5d6d8d8s_3hKd6cQs_4cKh4sQh_Ac7sKcQd_5sTcJs8c() {
    assertEquals(
      "Ac7sKcQd 4cKh4sQh 3hKd6cQs 5sTcJs8c",
      Solver.process("omaha-holdem 2h5d6d8d8s 3hKd6cQs 4cKh4sQh Ac7sKcQd 5sTcJs8c"));
  }

  @Test
  public void test_omaha_holdem_9577_5h7sAcQcTh_Kc4c9hQh_AhJh9c7h_6s5s8cAd_2h6hKhAs_Jd5c4d6d_5d7c9s4h_6c3c4s7d_8dKdTsQs_3h2sKs8s() {
    assertEquals(
      "3h2sKs8s Jd5c4d6d 6c3c4s7d Kc4c9hQh 2h6hKhAs 5d7c9s4h 8dKdTsQs 6s5s8cAd AhJh9c7h",
      Solver.process("omaha-holdem 5h7sAcQcTh Kc4c9hQh AhJh9c7h 6s5s8cAd 2h6hKhAs Jd5c4d6d 5d7c9s4h 6c3c4s7d 8dKdTsQs 3h2sKs8s"));
  }

  @Test
  public void test_omaha_holdem_9578_3s5s8c9sTd_5hKdKs9c_2hJhQcTh() {
    assertEquals(
      "5hKdKs9c 2hJhQcTh",
      Solver.process("omaha-holdem 3s5s8c9sTd 5hKdKs9c 2hJhQcTh"));
  }

  @Test
  public void test_omaha_holdem_9579_3c5sAsTcTs_4c4d6dTd_Ad6s7c3d_KhQc9s2c_9d9h5c3h_JdJh8s8d() {
    assertEquals(
      "KhQc9s2c 9d9h5c3h JdJh8s8d Ad6s7c3d 4c4d6dTd",
      Solver.process("omaha-holdem 3c5sAsTcTs 4c4d6dTd Ad6s7c3d KhQc9s2c 9d9h5c3h JdJh8s8d"));
  }

  @Test
  public void test_omaha_holdem_9580_4h4s8dAsTd_9d9cTc3d_2d5dTs5c_6d4cKsQs_9s4d7h8h_5h8cJs6s_ThQhQc9h() {
    assertEquals(
      "5h8cJs6s 2d5dTs5c 9d9cTc3d ThQhQc9h 6d4cKsQs 9s4d7h8h",
      Solver.process("omaha-holdem 4h4s8dAsTd 9d9cTc3d 2d5dTs5c 6d4cKsQs 9s4d7h8h 5h8cJs6s ThQhQc9h"));
  }

  @Test
  public void test_omaha_holdem_9581_3c6h7sTcTh_7d4hAs7h_Jh8hQd6c_3h8sJc2h_TdKs9c3d_4s7cJdQc_5sKd4d2d_6s5h8c6d_2c5cJs4c_Kh2sQhTs() {
    assertEquals(
      "3h8sJc2h Jh8hQd6c 4s7cJdQc Kh2sQhTs 2c5cJs4c=5sKd4d2d 6s5h8c6d 7d4hAs7h TdKs9c3d",
      Solver.process("omaha-holdem 3c6h7sTcTh 7d4hAs7h Jh8hQd6c 3h8sJc2h TdKs9c3d 4s7cJdQc 5sKd4d2d 6s5h8c6d 2c5cJs4c Kh2sQhTs"));
  }

  @Test
  public void test_omaha_holdem_9582_4c6s7sJsQh_6cJcJd9h_8dQc5d9s_8s7c3d9c() {
    assertEquals(
      "8s7c3d9c 6cJcJd9h 8dQc5d9s",
      Solver.process("omaha-holdem 4c6s7sJsQh 6cJcJd9h 8dQc5d9s 8s7c3d9c"));
  }

  @Test
  public void test_omaha_holdem_9583_4c4h7s8hAc_Ah4sKsJh_Qs6hQcAs_5cQdJd5s_QhTd6c3s_8s2s2c5h_7d9dKh7h() {
    assertEquals(
      "QhTd6c3s 5cQdJd5s 8s2s2c5h Qs6hQcAs Ah4sKsJh 7d9dKh7h",
      Solver.process("omaha-holdem 4c4h7s8hAc Ah4sKsJh Qs6hQcAs 5cQdJd5s QhTd6c3s 8s2s2c5h 7d9dKh7h"));
  }

  @Test
  public void test_omaha_holdem_9584_2c4d8cAhJh_2sKs2d6h_Jc3c4s7h_Qh4h9d6s_9s7s5h5d_JsAc7c6c() {
    assertEquals(
      "Qh4h9d6s 9s7s5h5d Jc3c4s7h JsAc7c6c 2sKs2d6h",
      Solver.process("omaha-holdem 2c4d8cAhJh 2sKs2d6h Jc3c4s7h Qh4h9d6s 9s7s5h5d JsAc7c6c"));
  }

  @Test
  public void test_omaha_holdem_9585_4d5d5s8sAd_Ac7sQc4s_9s3cKc5h_4c9d2dTc_6c6h9h8h_6s4hJhQs_KdJsTdAs_2s3s6dQh_8dKhQd3h() {
    assertEquals(
      "6s4hJhQs 6c6h9h8h Ac7sQc4s 9s3cKc5h 2s3s6dQh 4c9d2dTc 8dKhQd3h KdJsTdAs",
      Solver.process("omaha-holdem 4d5d5s8sAd Ac7sQc4s 9s3cKc5h 4c9d2dTc 6c6h9h8h 6s4hJhQs KdJsTdAs 2s3s6dQh 8dKhQd3h"));
  }

  @Test
  public void test_omaha_holdem_9586_8c8sAsKhKs_9cJcQc9h_QsTdKcJs_2cAd2hKd_Th3sJd5c_Tc5s8h4h_5hQh2sQd_Ts9d7c7d() {
    assertEquals(
      "Th3sJd5c Ts9d7c7d 9cJcQc9h 5hQh2sQd Tc5s8h4h QsTdKcJs 2cAd2hKd",
      Solver.process("omaha-holdem 8c8sAsKhKs 9cJcQc9h QsTdKcJs 2cAd2hKd Th3sJd5c Tc5s8h4h 5hQh2sQd Ts9d7c7d"));
  }

  @Test
  public void test_omaha_holdem_9587_3h8c8h9hJh_Js5sTc6s_9s5h6h3d_4d7hKhTd_Kc9d4cKs() {
    assertEquals(
      "Js5sTc6s Kc9d4cKs 9s5h6h3d 4d7hKhTd",
      Solver.process("omaha-holdem 3h8c8h9hJh Js5sTc6s 9s5h6h3d 4d7hKhTd Kc9d4cKs"));
  }

  @Test
  public void test_omaha_holdem_9588_2s3s5c5dQc_Ad3dJhKd_7h4c3c4d_As6s7cKs_9s8sThQs_Kh5h3h4s() {
    assertEquals(
      "As6s7cKs Ad3dJhKd 7h4c3c4d 9s8sThQs Kh5h3h4s",
      Solver.process("omaha-holdem 2s3s5c5dQc Ad3dJhKd 7h4c3c4d As6s7cKs 9s8sThQs Kh5h3h4s"));
  }

  @Test
  public void test_omaha_holdem_9589_2s5h6sAsQs_TcKh9dAd_3c8h9sTs_QhAc5s8d_9hKd4d9c() {
    assertEquals(
      "9hKd4d9c TcKh9dAd QhAc5s8d 3c8h9sTs",
      Solver.process("omaha-holdem 2s5h6sAsQs TcKh9dAd 3c8h9sTs QhAc5s8d 9hKd4d9c"));
  }

  @Test
  public void test_omaha_holdem_9590_6c6h7hKcQc_8h4d4sTh_2h3dAc4c_9h6dQh7s_8d4hQs6s_8cQdKhJc_Js3h9d9s_3cTd2cJd() {
    assertEquals(
      "8h4d4sTh Js3h9d9s 3cTd2cJd 8cQdKhJc 2h3dAc4c 8d4hQs6s=9h6dQh7s",
      Solver.process("omaha-holdem 6c6h7hKcQc 8h4d4sTh 2h3dAc4c 9h6dQh7s 8d4hQs6s 8cQdKhJc Js3h9d9s 3cTd2cJd"));
  }

  @Test
  public void test_omaha_holdem_9591_AsQcQhQsTh_9s8d6c6h_QdAdJs6s_Kh9hTd5c() {
    assertEquals(
      "Kh9hTd5c 9s8d6c6h QdAdJs6s",
      Solver.process("omaha-holdem AsQcQhQsTh 9s8d6c6h QdAdJs6s Kh9hTd5c"));
  }

  @Test
  public void test_omaha_holdem_9592_4h5d6hAhQh_6d7dQs8h_8c5s3d7c_Ad2s3sJc_AcKd9h3h_KhQc4d5c_7sTh5hJh_Js6s9dJd_2h2dAsTd() {
    assertEquals(
      "Js6s9dJd 2h2dAsTd KhQc4d5c Ad2s3sJc 6d7dQs8h=8c5s3d7c AcKd9h3h 7sTh5hJh",
      Solver.process("omaha-holdem 4h5d6hAhQh 6d7dQs8h 8c5s3d7c Ad2s3sJc AcKd9h3h KhQc4d5c 7sTh5hJh Js6s9dJd 2h2dAsTd"));
  }

  @Test
  public void test_omaha_holdem_9593_6h7sAhJcQs_5dJs9c3d_6s4c3s8d() {
    assertEquals(
      "6s4c3s8d 5dJs9c3d",
      Solver.process("omaha-holdem 6h7sAhJcQs 5dJs9c3d 6s4c3s8d"));
  }

  @Test
  public void test_omaha_holdem_9594_8h9sQcQhTc_2h9h3s7s_Ah2d4dKh_5h9d3hKc_As2s4c7d_AcQsJsKd_TsJcJd5c_3c2c9c6h() {
    assertEquals(
      "As2s4c7d Ah2d4dKh 3c2c9c6h 2h9h3s7s 5h9d3hKc TsJcJd5c AcQsJsKd",
      Solver.process("omaha-holdem 8h9sQcQhTc 2h9h3s7s Ah2d4dKh 5h9d3hKc As2s4c7d AcQsJsKd TsJcJd5c 3c2c9c6h"));
  }

  @Test
  public void test_omaha_holdem_9595_8hAhKhTdTh_8d6h4c9h_AsQs9cJc_5s6d6c2s_3cAdQcAc_Kc4d3s2c_9dJh7s7c_Kd8cQhTc() {
    assertEquals(
      "5s6d6c2s 9dJh7s7c Kc4d3s2c AsQs9cJc 8d6h4c9h Kd8cQhTc 3cAdQcAc",
      Solver.process("omaha-holdem 8hAhKhTdTh 8d6h4c9h AsQs9cJc 5s6d6c2s 3cAdQcAc Kc4d3s2c 9dJh7s7c Kd8cQhTc"));
  }

  @Test
  public void test_omaha_holdem_9596_4h8d9hKsQc_9cQdKdQh_Ad2c7cJh_3s9dAs5d_5hJcQsTh() {
    assertEquals(
      "Ad2c7cJh 3s9dAs5d 9cQdKdQh 5hJcQsTh",
      Solver.process("omaha-holdem 4h8d9hKsQc 9cQdKdQh Ad2c7cJh 3s9dAs5d 5hJcQsTh"));
  }

  @Test
  public void test_omaha_holdem_9597_8c9c9sAsQc_2sJdKd7s_AcTs7d4c_2d6hJsAd_Qs5dTdKh_4d9d2h5h_7c3h8dJc_9h8s4s3s_Qd4h6s2c() {
    assertEquals(
      "2sJdKd7s Qd4h6s2c Qs5dTdKh 2d6hJsAd 4d9d2h5h 7c3h8dJc AcTs7d4c 9h8s4s3s",
      Solver.process("omaha-holdem 8c9c9sAsQc 2sJdKd7s AcTs7d4c 2d6hJsAd Qs5dTdKh 4d9d2h5h 7c3h8dJc 9h8s4s3s Qd4h6s2c"));
  }

  @Test
  public void test_omaha_holdem_9598_2c3hAhKsQc_Qs4s8dTh_2hJcKd8c_7dKhKc7h_8h7sTs2d_3s5sTdAc() {
    assertEquals(
      "8h7sTs2d Qs4s8dTh 2hJcKd8c 3s5sTdAc 7dKhKc7h",
      Solver.process("omaha-holdem 2c3hAhKsQc Qs4s8dTh 2hJcKd8c 7dKhKc7h 8h7sTs2d 3s5sTdAc"));
  }

  @Test
  public void test_omaha_holdem_9599_2d7s9c9dTh_4s2c4h6h_3hAc3cKs_TsJcQd5h_3d7h5cTd_Jd6c8d6d_Ah4dKh5d_As8s9hKd_KcQc3s6s() {
    assertEquals(
      "KcQc3s6s Ah4dKh5d 3hAc3cKs 4s2c4h6h 3d7h5cTd TsJcQd5h As8s9hKd Jd6c8d6d",
      Solver.process("omaha-holdem 2d7s9c9dTh 4s2c4h6h 3hAc3cKs TsJcQd5h 3d7h5cTd Jd6c8d6d Ah4dKh5d As8s9hKd KcQc3s6s"));
  }

  @Test
  public void test_omaha_holdem_9600_9c9dAcAhJs_Qs3c6sKc_8hKh7c6c_6hQh7dAd() {
    assertEquals(
      "8hKh7c6c Qs3c6sKc 6hQh7dAd",
      Solver.process("omaha-holdem 9c9dAcAhJs Qs3c6sKc 8hKh7c6c 6hQh7dAd"));
  }

  @Test
  public void test_omaha_holdem_9601_6d8c9hAcTd_5d3sAd3c_Qd4cAh6s_4s7d5c9c_5hTs2sJd_2cQc9s8s_JsKcQs4d_TcAsKh7s_2dJh8h7c() {
    assertEquals(
      "5hTs2sJd 5d3sAd3c 2cQc9s8s Qd4cAh6s 4s7d5c9c=TcAsKh7s 2dJh8h7c JsKcQs4d",
      Solver.process("omaha-holdem 6d8c9hAcTd 5d3sAd3c Qd4cAh6s 4s7d5c9c 5hTs2sJd 2cQc9s8s JsKcQs4d TcAsKh7s 2dJh8h7c"));
  }

  @Test
  public void test_omaha_holdem_9602_2h4sAdAsQs_5dJs6dKd_5hKhTd6s_7sQhAh5c_6h2d5s3s_7h3c2cKs_KcJh9sQc() {
    assertEquals(
      "5hKhTd6s 5dJs6dKd 7h3c2cKs KcJh9sQc 6h2d5s3s 7sQhAh5c",
      Solver.process("omaha-holdem 2h4sAdAsQs 5dJs6dKd 5hKhTd6s 7sQhAh5c 6h2d5s3s 7h3c2cKs KcJh9sQc"));
  }

  @Test
  public void test_omaha_holdem_9603_4s5c7h9hKs_3cJs8dQs_6h6c9c2c() {
    assertEquals(
      "3cJs8dQs 6h6c9c2c",
      Solver.process("omaha-holdem 4s5c7h9hKs 3cJs8dQs 6h6c9c2c"));
  }

  @Test
  public void test_omaha_holdem_9604_5d6dAdAsKc_5c4d9d6s_9h2h4sTh_7s3hKhJd() {
    assertEquals(
      "9h2h4sTh 7s3hKhJd 5c4d9d6s",
      Solver.process("omaha-holdem 5d6dAdAsKc 5c4d9d6s 9h2h4sTh 7s3hKhJd"));
  }

  @Test
  public void test_omaha_holdem_9605_2d2s3s9hQs_9dQdTh6d_5c4d4c7c_Ts5dTcAd() {
    assertEquals(
      "5c4d4c7c Ts5dTcAd 9dQdTh6d",
      Solver.process("omaha-holdem 2d2s3s9hQs 9dQdTh6d 5c4d4c7c Ts5dTcAd"));
  }

  @Test
  public void test_omaha_holdem_9606_2c2h5d6s7d_JcKhQcQd_9h6h8sKs_TdKc9cTh_7h9s3h7c_Tc8d4h3c_5sJh6d5h() {
    assertEquals(
      "TdKc9cTh JcKhQcQd Tc8d4h3c 9h6h8sKs 5sJh6d5h 7h9s3h7c",
      Solver.process("omaha-holdem 2c2h5d6s7d JcKhQcQd 9h6h8sKs TdKc9cTh 7h9s3h7c Tc8d4h3c 5sJh6d5h"));
  }

  @Test
  public void test_omaha_holdem_9607_3h6h8c9dAs_KhJc5s9s_7cAd3cKs_2c8sTsTd_Js7d6d4s() {
    assertEquals(
      "Js7d6d4s KhJc5s9s 2c8sTsTd 7cAd3cKs",
      Solver.process("omaha-holdem 3h6h8c9dAs KhJc5s9s 7cAd3cKs 2c8sTsTd Js7d6d4s"));
  }

  @Test
  public void test_omaha_holdem_9608_2d2s3d5dAh_6dJs9sJc_8h6c4h6h_Th4dKs3h() {
    assertEquals(
      "6dJs9sJc Th4dKs3h 8h6c4h6h",
      Solver.process("omaha-holdem 2d2s3d5dAh 6dJs9sJc 8h6c4h6h Th4dKs3h"));
  }

  @Test
  public void test_omaha_holdem_9609_3h7c7dAhQd_2cAs8c9s_3d6d2s3c_8d8hAc6h_6cJhKcQh_QsKdTh5d_4dJd2dTc_Ts9hKs4s_Js7sJc5h_7hKhQc2h() {
    assertEquals(
      "4dJd2dTc Ts9hKs4s 6cJhKcQh=QsKdTh5d 8d8hAc6h 2cAs8c9s Js7sJc5h 3d6d2s3c 7hKhQc2h",
      Solver.process("omaha-holdem 3h7c7dAhQd 2cAs8c9s 3d6d2s3c 8d8hAc6h 6cJhKcQh QsKdTh5d 4dJd2dTc Ts9hKs4s Js7sJc5h 7hKhQc2h"));
  }

  @Test
  public void test_omaha_holdem_9610_4h8c8d9hAd_Ts8s2c5h_Kd3h9d7c_As4sTdKs_2hJs3d5s_Qs6hQdAh() {
    assertEquals(
      "2hJs3d5s Kd3h9d7c Qs6hQdAh As4sTdKs Ts8s2c5h",
      Solver.process("omaha-holdem 4h8c8d9hAd Ts8s2c5h Kd3h9d7c As4sTdKs 2hJs3d5s Qs6hQdAh"));
  }

  @Test
  public void test_omaha_holdem_9611_3d5s7hJdTd_8c7s2dQh_AdTs5d2c() {
    assertEquals(
      "8c7s2dQh AdTs5d2c",
      Solver.process("omaha-holdem 3d5s7hJdTd 8c7s2dQh AdTs5d2c"));
  }

  @Test
  public void test_omaha_holdem_9612_5h6c8sJdQs_Td4d8d5d_Ac4s2dTs() {
    assertEquals(
      "Ac4s2dTs Td4d8d5d",
      Solver.process("omaha-holdem 5h6c8sJdQs Td4d8d5d Ac4s2dTs"));
  }

  @Test
  public void test_omaha_holdem_9613_4h7hAcAdAs_QhJd2cTs_Jh3s4d2s_9h4sTdKc_Qs5h3h9s_6s7dTc8h_2h5s5d9c_JsTh7c4c() {
    assertEquals(
      "6s7dTc8h Jh3s4d2s JsTh7c4c Qs5h3h9s QhJd2cTs 9h4sTdKc 2h5s5d9c",
      Solver.process("omaha-holdem 4h7hAcAdAs QhJd2cTs Jh3s4d2s 9h4sTdKc Qs5h3h9s 6s7dTc8h 2h5s5d9c JsTh7c4c"));
  }

  @Test
  public void test_omaha_holdem_9614_3d6d6hAhKd_8cAsTc7h_2s9h2dKs() {
    assertEquals(
      "2s9h2dKs 8cAsTc7h",
      Solver.process("omaha-holdem 3d6d6hAhKd 8cAsTc7h 2s9h2dKs"));
  }

  @Test
  public void test_omaha_holdem_9615_3h5c7d9sAs_Th2hQh8c_JsTs5s2c_JcJd7hKh_Ah7s8sKs_4s5dQc4d_3sTd3d8d_Ad2sAcKc_6cJh9hQd() {
    assertEquals(
      "Th2hQh8c JsTs5s2c 4s5dQc4d 6cJh9hQd JcJd7hKh Ah7s8sKs 3sTd3d8d Ad2sAcKc",
      Solver.process("omaha-holdem 3h5c7d9sAs Th2hQh8c JsTs5s2c JcJd7hKh Ah7s8sKs 4s5dQc4d 3sTd3d8d Ad2sAcKc 6cJh9hQd"));
  }

  @Test
  public void test_omaha_holdem_9616_3s5d8s9sAd_8d4c3d5s_8h8c4dKd_JsJc9h2h_7sThJh3h_9d6h2d7d_2s5c6sQc_KhTsAhQh() {
    assertEquals(
      "7sThJh3h JsJc9h2h KhTsAhQh 8d4c3d5s 8h8c4dKd 9d6h2d7d 2s5c6sQc",
      Solver.process("omaha-holdem 3s5d8s9sAd 8d4c3d5s 8h8c4dKd JsJc9h2h 7sThJh3h 9d6h2d7d 2s5c6sQc KhTsAhQh"));
  }

  @Test
  public void test_omaha_holdem_9617_2h3c4h4s8s_4c6h7c6s_Ks5cTcJc() {
    assertEquals(
      "Ks5cTcJc 4c6h7c6s",
      Solver.process("omaha-holdem 2h3c4h4s8s 4c6h7c6s Ks5cTcJc"));
  }

  @Test
  public void test_omaha_holdem_9618_2s4sAhKdKs_3c6h5cAd_Jd3s4h8h_9d8c7s6d_7c2cQs8d() {
    assertEquals(
      "9d8c7s6d 7c2cQs8d Jd3s4h8h 3c6h5cAd",
      Solver.process("omaha-holdem 2s4sAhKdKs 3c6h5cAd Jd3s4h8h 9d8c7s6d 7c2cQs8d"));
  }

  @Test
  public void test_omaha_holdem_9619_5c6d6h6sTd_Qc5s4c3h_8h3dKhQd_8cKs7c9s_Jc9dJs7h_5h4hAcQh() {
    assertEquals(
      "Qc5s4c3h 8cKs7c9s 8h3dKhQd 5h4hAcQh Jc9dJs7h",
      Solver.process("omaha-holdem 5c6d6h6sTd Qc5s4c3h 8h3dKhQd 8cKs7c9s Jc9dJs7h 5h4hAcQh"));
  }

  @Test
  public void test_omaha_holdem_9620_2d4c4d4hTh_9h5c8d2h_As6d7c9c_Jh8cQc9s() {
    assertEquals(
      "9h5c8d2h Jh8cQc9s As6d7c9c",
      Solver.process("omaha-holdem 2d4c4d4hTh 9h5c8d2h As6d7c9c Jh8cQc9s"));
  }

  @Test
  public void test_omaha_holdem_9621_2c4d5h5sTd_6cQd2sJh_Jc4s7d5d_3dTh8hKh() {
    assertEquals(
      "6cQd2sJh 3dTh8hKh Jc4s7d5d",
      Solver.process("omaha-holdem 2c4d5h5sTd 6cQd2sJh Jc4s7d5d 3dTh8hKh"));
  }

  @Test
  public void test_omaha_holdem_9622_6d6sAhJhQc_Kh7d3hJd_7hTc7sJs() {
    assertEquals(
      "7hTc7sJs Kh7d3hJd",
      Solver.process("omaha-holdem 6d6sAhJhQc Kh7d3hJd 7hTc7sJs"));
  }

  @Test
  public void test_omaha_holdem_9623_2s3s4h8cQd_7s5cJsJd_JhKs4sAd_8hJc6hKh_6c5d3hQs_2cAs8d5h_8s9cTh9s() {
    assertEquals(
      "JhKs4sAd 8hJc6hKh 8s9cTh9s 7s5cJsJd 2cAs8d5h 6c5d3hQs",
      Solver.process("omaha-holdem 2s3s4h8cQd 7s5cJsJd JhKs4sAd 8hJc6hKh 6c5d3hQs 2cAs8d5h 8s9cTh9s"));
  }

  @Test
  public void test_omaha_holdem_9624_2c2h2s5sQc_3c4cKcAs_6d3s4hJs_Td7dJcQs_KhTc9c8d_7h6c8sTh_Ks7s4dKd_4s3d9dQh_Ac8hJdAd_5h3h9s6s() {
    assertEquals(
      "5h3h9s6s 7h6c8sTh 6d3s4hJs 4s3d9dQh Td7dJcQs KhTc9c8d 3c4cKcAs Ks7s4dKd Ac8hJdAd",
      Solver.process("omaha-holdem 2c2h2s5sQc 3c4cKcAs 6d3s4hJs Td7dJcQs KhTc9c8d 7h6c8sTh Ks7s4dKd 4s3d9dQh Ac8hJdAd 5h3h9s6s"));
  }

  @Test
  public void test_omaha_holdem_9625_6h7cJdJhKd_4s4c6dAh_Qc6sJsAs_8hKcKh5d_TdAcQs5c_KsTs6c9c_Jc9d2s2c() {
    assertEquals(
      "TdAcQs5c 4s4c6dAh KsTs6c9c Jc9d2s2c Qc6sJsAs 8hKcKh5d",
      Solver.process("omaha-holdem 6h7cJdJhKd 4s4c6dAh Qc6sJsAs 8hKcKh5d TdAcQs5c KsTs6c9c Jc9d2s2c"));
  }

  @Test
  public void test_omaha_holdem_9626_2c8dJhKcQd_Ad3c6dQs_Td9dQcJd() {
    assertEquals(
      "Ad3c6dQs Td9dQcJd",
      Solver.process("omaha-holdem 2c8dJhKcQd Ad3c6dQs Td9dQcJd"));
  }

  @Test
  public void test_omaha_holdem_9627_2s4c5s7sQd_5h8h8dTh_Jd9c8s4d_Tc2hJsAs_5cKdAh6s_7hKs3hAc_5dKh6dJh_TsKc3d7c() {
    assertEquals(
      "Jd9c8s4d 5dKh6dJh 5cKdAh6s TsKc3d7c 5h8h8dTh 7hKs3hAc Tc2hJsAs",
      Solver.process("omaha-holdem 2s4c5s7sQd 5h8h8dTh Jd9c8s4d Tc2hJsAs 5cKdAh6s 7hKs3hAc 5dKh6dJh TsKc3d7c"));
  }

  @Test
  public void test_omaha_holdem_9628_2sKdQcTcTs_7sAd5d9c_3dJs6h6s_2d7h3sAh_Kh4s5c2c() {
    assertEquals(
      "7sAd5d9c 2d7h3sAh 3dJs6h6s Kh4s5c2c",
      Solver.process("omaha-holdem 2sKdQcTcTs 7sAd5d9c 3dJs6h6s 2d7h3sAh Kh4s5c2c"));
  }

  @Test
  public void test_omaha_holdem_9629_2c4d5d8d9h_6d2d8c3d_QcAc8h9c_7d8sQs3c_9d4c6s5h_KcTh4s2h_7s7h7cAd() {
    assertEquals(
      "7s7h7cAd 7d8sQs3c KcTh4s2h 9d4c6s5h QcAc8h9c 6d2d8c3d",
      Solver.process("omaha-holdem 2c4d5d8d9h 6d2d8c3d QcAc8h9c 7d8sQs3c 9d4c6s5h KcTh4s2h 7s7h7cAd"));
  }

  @Test
  public void test_omaha_holdem_9630_2d6h7hQcTs_Kc3h8h8d_3dQd5sAc_8s5c6sAs_2h6c9dJh_7d5d5hKd_Qh8cAd7s() {
    assertEquals(
      "8s5c6sAs 7d5d5hKd Kc3h8h8d 3dQd5sAc 2h6c9dJh Qh8cAd7s",
      Solver.process("omaha-holdem 2d6h7hQcTs Kc3h8h8d 3dQd5sAc 8s5c6sAs 2h6c9dJh 7d5d5hKd Qh8cAd7s"));
  }

  @Test
  public void test_omaha_holdem_9631_3d8hAhAsQd_Qh6d4dJh_6hAd5c2c_4s8c3sJd_5sJcQc6c_TdTs8dAc_3hKs7cKd_5d9dThJs_7h9sQs9h() {
    assertEquals(
      "5d9dThJs 4s8c3sJd 7h9sQs9h 5sJcQc6c=Qh6d4dJh 3hKs7cKd 6hAd5c2c TdTs8dAc",
      Solver.process("omaha-holdem 3d8hAhAsQd Qh6d4dJh 6hAd5c2c 4s8c3sJd 5sJcQc6c TdTs8dAc 3hKs7cKd 5d9dThJs 7h9sQs9h"));
  }

  @Test
  public void test_omaha_holdem_9632_3h8cJsKdQc_QhJd6sAc_5c8h2h3s_7cTsJc2c_Td9dJh7d_As6d9cKh_7hAhKs9s_ThQs8d4s_Kc5h9hAd_5d5s4h4d() {
    assertEquals(
      "5d5s4h4d 7cTsJc2c 7hAhKs9s=As6d9cKh=Kc5h9hAd 5c8h2h3s ThQs8d4s QhJd6sAc Td9dJh7d",
      Solver.process("omaha-holdem 3h8cJsKdQc QhJd6sAc 5c8h2h3s 7cTsJc2c Td9dJh7d As6d9cKh 7hAhKs9s ThQs8d4s Kc5h9hAd 5d5s4h4d"));
  }

  @Test
  public void test_omaha_holdem_9633_2d7sAcKcKs_5c8h4sTs_2sTcJh3d() {
    assertEquals(
      "5c8h4sTs 2sTcJh3d",
      Solver.process("omaha-holdem 2d7sAcKcKs 5c8h4sTs 2sTcJh3d"));
  }

  @Test
  public void test_omaha_holdem_9634_4hAcJdKsQh_3h7hAd2d_6d9c2s5s_8dKd6hTh_2h7c7d8s_3dJcTc6c_9s3c4cKc_TsJh7s3s() {
    assertEquals(
      "6d9c2s5s 2h7c7d8s 3h7hAd2d 9s3c4cKc 3dJcTc6c=8dKd6hTh=TsJh7s3s",
      Solver.process("omaha-holdem 4hAcJdKsQh 3h7hAd2d 6d9c2s5s 8dKd6hTh 2h7c7d8s 3dJcTc6c 9s3c4cKc TsJh7s3s"));
  }

  @Test
  public void test_omaha_holdem_9635_2s8hJsQcTs_6c5sKhJc_4c7h5hQd_2d4sKs7c_6dKc4d4h() {
    assertEquals(
      "6dKc4d4h 6c5sKhJc 4c7h5hQd 2d4sKs7c",
      Solver.process("omaha-holdem 2s8hJsQcTs 6c5sKhJc 4c7h5hQd 2d4sKs7c 6dKc4d4h"));
  }

  @Test
  public void test_omaha_holdem_9636_2c2s6d7cQh_Td5h2hJh_Jc4d9h7s_Ah9cKc8h_2d4s5s3s_9d5cKd3c_Qc8sThAs_4hJsKh5d_7d3hAcTs() {
    assertEquals(
      "9d5cKd3c 4hJsKh5d Ah9cKc8h Jc4d9h7s 7d3hAcTs Qc8sThAs 2d4s5s3s Td5h2hJh",
      Solver.process("omaha-holdem 2c2s6d7cQh Td5h2hJh Jc4d9h7s Ah9cKc8h 2d4s5s3s 9d5cKd3c Qc8sThAs 4hJsKh5d 7d3hAcTs"));
  }

  @Test
  public void test_omaha_holdem_9637_3s6h8d8hKd_Qh7dTh2d_Kh2s3dJd_AsQc8s9s_TdJsKc4c_QsJh5h9d_5s7sAh7h_6c3c2h6d() {
    assertEquals(
      "Qh7dTh2d QsJh5h9d 5s7sAh7h Kh2s3dJd=TdJsKc4c AsQc8s9s 6c3c2h6d",
      Solver.process("omaha-holdem 3s6h8d8hKd Qh7dTh2d Kh2s3dJd AsQc8s9s TdJsKc4c QsJh5h9d 5s7sAh7h 6c3c2h6d"));
  }

  @Test
  public void test_omaha_holdem_9638_3hAcJcKhQs_8c6c7hJh_2d7c4c9c_4h4s2cTs_5hQh3s7d_8d4d8s9d_Jd6h3dJs_QdAh5c9s() {
    assertEquals(
      "2d7c4c9c 4h4s2cTs 8d4d8s9d 8c6c7hJh 5hQh3s7d QdAh5c9s Jd6h3dJs",
      Solver.process("omaha-holdem 3hAcJcKhQs 8c6c7hJh 2d7c4c9c 4h4s2cTs 5hQh3s7d 8d4d8s9d Jd6h3dJs QdAh5c9s"));
  }

  @Test
  public void test_omaha_holdem_9639_5d5hJdKhTc_7c2h5s7h_7s3c6s4d_9hAsAhAd() {
    assertEquals(
      "7s3c6s4d 9hAsAhAd 7c2h5s7h",
      Solver.process("omaha-holdem 5d5hJdKhTc 7c2h5s7h 7s3c6s4d 9hAsAhAd"));
  }

  @Test
  public void test_omaha_holdem_9640_2c2d9c9hAs_8s6h7sAd_3h6cTdKs_JhKcKh5d_6sAh4hJs_TcQh3dQc() {
    assertEquals(
      "3h6cTdKs TcQh3dQc JhKcKh5d 8s6h7sAd 6sAh4hJs",
      Solver.process("omaha-holdem 2c2d9c9hAs 8s6h7sAd 3h6cTdKs JhKcKh5d 6sAh4hJs TcQh3dQc"));
  }

  @Test
  public void test_omaha_holdem_9641_2s8h8sAhQs_3s7h8d7d_As3d2d5h_2h7cQhKd() {
    assertEquals(
      "2h7cQhKd As3d2d5h 3s7h8d7d",
      Solver.process("omaha-holdem 2s8h8sAhQs 3s7h8d7d As3d2d5h 2h7cQhKd"));
  }

  @Test
  public void test_omaha_holdem_9642_5h8hJcKsTc_Ac7c3d5d_Th3h2dKd_5sAsKcKh() {
    assertEquals(
      "Ac7c3d5d Th3h2dKd 5sAsKcKh",
      Solver.process("omaha-holdem 5h8hJcKsTc Ac7c3d5d Th3h2dKd 5sAsKcKh"));
  }

  @Test
  public void test_omaha_holdem_9643_8hAsJhKdKh_9d9sQc4s_7s4d9h9c_2sJd6cAh_4hTc4c5d_ThKc6dQd_AdTsQs2c_3d3s5c8s_TdJs7h7d_3hAc2h6h() {
    assertEquals(
      "4hTc4c5d 3d3s5c8s 7s4d9h9c=9d9sQc4s TdJs7h7d 2sJd6cAh AdTsQs2c=ThKc6dQd 3hAc2h6h",
      Solver.process("omaha-holdem 8hAsJhKdKh 9d9sQc4s 7s4d9h9c 2sJd6cAh 4hTc4c5d ThKc6dQd AdTsQs2c 3d3s5c8s TdJs7h7d 3hAc2h6h"));
  }

  @Test
  public void test_omaha_holdem_9644_3s6s7s9c9h_5c5h2sQc_3h4d8dJc_Jh8h7dTh() {
    assertEquals(
      "3h4d8dJc 5c5h2sQc Jh8h7dTh",
      Solver.process("omaha-holdem 3s6s7s9c9h 5c5h2sQc 3h4d8dJc Jh8h7dTh"));
  }

  @Test
  public void test_omaha_holdem_9645_5d5hAcQcTh_AdKc6cTs_QsKs9d7h_3d9cJd8d_6hJs8cAs_4s3hKd7d() {
    assertEquals(
      "3d9cJd8d 4s3hKd7d QsKs9d7h 6hJs8cAs AdKc6cTs",
      Solver.process("omaha-holdem 5d5hAcQcTh AdKc6cTs QsKs9d7h 3d9cJd8d 6hJs8cAs 4s3hKd7d"));
  }

  @Test
  public void test_omaha_holdem_9646_2h3s4d7sTd_JcAd8d7h_Tc4c3c3d_2c9s6h4s_Kc5d9d7c_9c9hJhTs_Qh8cKdJd_3h6sAs6d_Js7dKsAc() {
    assertEquals(
      "Qh8cKdJd 3h6sAs6d Kc5d9d7c JcAd8d7h=Js7dKsAc 9c9hJhTs 2c9s6h4s Tc4c3c3d",
      Solver.process("omaha-holdem 2h3s4d7sTd JcAd8d7h Tc4c3c3d 2c9s6h4s Kc5d9d7c 9c9hJhTs Qh8cKdJd 3h6sAs6d Js7dKsAc"));
  }

  @Test
  public void test_omaha_holdem_9647_3d5c6sAdTh_Kd6h7hQs_Jd8dTs6d_8s5hTc3c_AcKh2cAh_7s4c9sQc_4dQhTdJs_8c2d9hQd_7d5s3s7c() {
    assertEquals(
      "8c2d9hQd Kd6h7hQs 4dQhTdJs 7d5s3s7c 8s5hTc3c Jd8dTs6d AcKh2cAh 7s4c9sQc",
      Solver.process("omaha-holdem 3d5c6sAdTh Kd6h7hQs Jd8dTs6d 8s5hTc3c AcKh2cAh 7s4c9sQc 4dQhTdJs 8c2d9hQd 7d5s3s7c"));
  }

  @Test
  public void test_omaha_holdem_9648_2d3d5h9cJd_7dTc7hJh_KdAc8hQh_Ah9hJs3s_Ad9s3h2h_ThKc4s8s_6d6c6sJc_5d2c8dKh_KsTd4d4c_Ts8c7s9d() {
    assertEquals(
      "ThKc4s8s KdAc8hQh Ts8c7s9d 6d6c6sJc 7dTc7hJh Ad9s3h2h Ah9hJs3s 5d2c8dKh KsTd4d4c",
      Solver.process("omaha-holdem 2d3d5h9cJd 7dTc7hJh KdAc8hQh Ah9hJs3s Ad9s3h2h ThKc4s8s 6d6c6sJc 5d2c8dKh KsTd4d4c Ts8c7s9d"));
  }

  @Test
  public void test_omaha_holdem_9649_3c5hQdTcTs_Qh6hJs4d_6s9sTd2h_4c9d2c7h_Ac5dAh8d_Qc8s6dQs_7c3sKc2s_7sKs5cTh_Kd8c2dJd_Ad9cKh4s() {
    assertEquals(
      "4c9d2c7h Kd8c2dJd Ad9cKh4s 7c3sKc2s Qh6hJs4d Ac5dAh8d 6s9sTd2h 7sKs5cTh Qc8s6dQs",
      Solver.process("omaha-holdem 3c5hQdTcTs Qh6hJs4d 6s9sTd2h 4c9d2c7h Ac5dAh8d Qc8s6dQs 7c3sKc2s 7sKs5cTh Kd8c2dJd Ad9cKh4s"));
  }

  @Test
  public void test_omaha_holdem_9650_5h7hAdJdTh_7c9dJsAh_2c9sJc8h_3cQhTc9c() {
    assertEquals(
      "3cQhTc9c 7c9dJsAh 2c9sJc8h",
      Solver.process("omaha-holdem 5h7hAdJdTh 7c9dJsAh 2c9sJc8h 3cQhTc9c"));
  }

  @Test
  public void test_omaha_holdem_9651_3h5dAsTcTh_2dKhJs4d_2sJh6d8h_8cTs9d2h_KsJd5h3c_9sQs4hAc_2cQcAdJc_5c7d4s8d() {
    assertEquals(
      "2sJh6d8h 5c7d4s8d KsJd5h3c 2cQcAdJc=9sQs4hAc 8cTs9d2h 2dKhJs4d",
      Solver.process("omaha-holdem 3h5dAsTcTh 2dKhJs4d 2sJh6d8h 8cTs9d2h KsJd5h3c 9sQs4hAc 2cQcAdJc 5c7d4s8d"));
  }

  @Test
  public void test_omaha_holdem_9652_2c3d4d6dJs_9d7dAh6c_7c8s4sKc_2h4c3cAs_5sAcThTd_Ad9hKsKd_5c8h7sJd_8c4hKhQs() {
    assertEquals(
      "7c8s4sKc=8c4hKhQs 2h4c3cAs 5sAcThTd 5c8h7sJd 9d7dAh6c Ad9hKsKd",
      Solver.process("omaha-holdem 2c3d4d6dJs 9d7dAh6c 7c8s4sKc 2h4c3cAs 5sAcThTd Ad9hKsKd 5c8h7sJd 8c4hKhQs"));
  }

  @Test
  public void test_omaha_holdem_9653_3c4s6s9hQc_5sAs9c8d_6dTc3sAc_4h6c8c7h_Ks3d8h4d_KdTd2d3h_2c5dJdTh_6hQdTsQh_8s5hKcAh_5c7dJhJc() {
    assertEquals(
      "8s5hKcAh KdTd2d3h 5sAs9c8d Ks3d8h4d 6dTc3sAc 4h6c8c7h 6hQdTsQh 2c5dJdTh 5c7dJhJc",
      Solver.process("omaha-holdem 3c4s6s9hQc 5sAs9c8d 6dTc3sAc 4h6c8c7h Ks3d8h4d KdTd2d3h 2c5dJdTh 6hQdTsQh 8s5hKcAh 5c7dJhJc"));
  }

  @Test
  public void test_omaha_holdem_9654_4d5s6h7hAc_Kd7c9s2s_Jd6s8s8h_Qd6d3s7s_3h9h6cTd_9cTs3d4c_5c4hAhJc() {
    assertEquals(
      "Kd7c9s2s 5c4hAhJc 3h9h6cTd=9cTs3d4c=Qd6d3s7s Jd6s8s8h",
      Solver.process("omaha-holdem 4d5s6h7hAc Kd7c9s2s Jd6s8s8h Qd6d3s7s 3h9h6cTd 9cTs3d4c 5c4hAhJc"));
  }

  @Test
  public void test_omaha_holdem_9655_2d3c5c6sJc_9hAs2h3s_7s2c7d8s_8d7h9c3h_Kd8hAcKh() {
    assertEquals(
      "8d7h9c3h 7s2c7d8s Kd8hAcKh 9hAs2h3s",
      Solver.process("omaha-holdem 2d3c5c6sJc 9hAs2h3s 7s2c7d8s 8d7h9c3h Kd8hAcKh"));
  }

  @Test
  public void test_omaha_holdem_9656_2c4c4h7cQc_7d5dAdAs_Ks5c9s9c() {
    assertEquals(
      "7d5dAdAs Ks5c9s9c",
      Solver.process("omaha-holdem 2c4c4h7cQc 7d5dAdAs Ks5c9s9c"));
  }

  @Test
  public void test_omaha_holdem_9657_4c5s6c8dQc_AhTs4h2d_7h6s3h2h_5hKh4s7s_KsTd3c8c_QsJs8s6d() {
    assertEquals(
      "AhTs4h2d QsJs8s6d 5hKh4s7s=7h6s3h2h KsTd3c8c",
      Solver.process("omaha-holdem 4c5s6c8dQc AhTs4h2d 7h6s3h2h 5hKh4s7s KsTd3c8c QsJs8s6d"));
  }

  @Test
  public void test_omaha_holdem_9658_5sJdQhThTs_4dAsJh7c_Kd2d2c9s_3c9h8s4h_6dKh4s2s_5cAc2h6s_TdTcKsQc() {
    assertEquals(
      "6dKh4s2s 5cAc2h6s 4dAsJh7c 3c9h8s4h Kd2d2c9s TdTcKsQc",
      Solver.process("omaha-holdem 5sJdQhThTs 4dAsJh7c Kd2d2c9s 3c9h8s4h 6dKh4s2s 5cAc2h6s TdTcKsQc"));
  }

  @Test
  public void test_omaha_holdem_9659_2c7d9sKhTh_6h6cKs7s_Jh4s5hTc_2s3cQs8h() {
    assertEquals(
      "2s3cQs8h Jh4s5hTc 6h6cKs7s",
      Solver.process("omaha-holdem 2c7d9sKhTh 6h6cKs7s Jh4s5hTc 2s3cQs8h"));
  }

  @Test
  public void test_omaha_holdem_9660_5d8d9c9hJc_3sJhAs3c_Qd6h8h6s_Ts5c8cJd_6c5h2h6d_Qc4hTc4c_AdThKc7c() {
    assertEquals(
      "6c5h2h6d Qd6h8h6s Ts5c8cJd 3sJhAs3c AdThKc7c Qc4hTc4c",
      Solver.process("omaha-holdem 5d8d9c9hJc 3sJhAs3c Qd6h8h6s Ts5c8cJd 6c5h2h6d Qc4hTc4c AdThKc7c"));
  }

  @Test
  public void test_omaha_holdem_9661_2s9cKcQhTh_2dKh9d7c_6d7s4sJs_As8d8sQd_4cTd3h9h_9sAcAh6c_Tc2cTs5c_Jh4h7d6s() {
    assertEquals(
      "6d7s4sJs=Jh4h7d6s As8d8sQd 9sAcAh6c 4cTd3h9h 2dKh9d7c Tc2cTs5c",
      Solver.process("omaha-holdem 2s9cKcQhTh 2dKh9d7c 6d7s4sJs As8d8sQd 4cTd3h9h 9sAcAh6c Tc2cTs5c Jh4h7d6s"));
  }

  @Test
  public void test_omaha_holdem_9662_4c7s9hAcTc_Jd9dAdKc_Kd5hQhKs_7h9s6d2c_JhJsAsKh_3c7d5c5s_4dTdQs3h() {
    assertEquals(
      "Kd5hQhKs JhJsAsKh 7h9s6d2c 4dTdQs3h Jd9dAdKc 3c7d5c5s",
      Solver.process("omaha-holdem 4c7s9hAcTc Jd9dAdKc Kd5hQhKs 7h9s6d2c JhJsAsKh 3c7d5c5s 4dTdQs3h"));
  }

  @Test
  public void test_omaha_holdem_9663_2h3d5c6h9h_TsJh8sQs_3cAcAsQh_TdKhQdJd_9c8h4d9s() {
    assertEquals(
      "TsJh8sQs TdKhQdJd 3cAcAsQh 9c8h4d9s",
      Solver.process("omaha-holdem 2h3d5c6h9h TsJh8sQs 3cAcAsQh TdKhQdJd 9c8h4d9s"));
  }

  @Test
  public void test_omaha_holdem_9664_5c5d8dJdKd_AdAhKsKc_7c8c9d3d_4d5sAc5h_8sJcQs6c_2h4c8hTd_AsTcJsQh_7h7d9c2s_Th6h3sJh_9s2d3hQd() {
    assertEquals(
      "7h7d9c2s 2h4c8hTd Th6h3sJh AsTcJsQh 8sJcQs6c 7c8c9d3d 9s2d3hQd AdAhKsKc 4d5sAc5h",
      Solver.process("omaha-holdem 5c5d8dJdKd AdAhKsKc 7c8c9d3d 4d5sAc5h 8sJcQs6c 2h4c8hTd AsTcJsQh 7h7d9c2s Th6h3sJh 9s2d3hQd"));
  }

  @Test
  public void test_omaha_holdem_9665_3d8hAdKsTd_AsQh5s3h_Jd5dQd6s_8d6h4hKd_Js8sTs4s_Ac9s3sTh_Jc7h9c7s_7dJh6c5c_8c4c6d7c_TcKh3c4d() {
    assertEquals(
      "7dJh6c5c Jc7h9c7s 8c4c6d7c Js8sTs4s TcKh3c4d AsQh5s3h Ac9s3sTh Jd5dQd6s 8d6h4hKd",
      Solver.process("omaha-holdem 3d8hAdKsTd AsQh5s3h Jd5dQd6s 8d6h4hKd Js8sTs4s Ac9s3sTh Jc7h9c7s 7dJh6c5c 8c4c6d7c TcKh3c4d"));
  }

  @Test
  public void test_omaha_holdem_9666_4h5d9c9dAd_8d3hTs4d_4s3cQs5s_9hKc2c8c_6sAc2s2d_QdTd7cJs_Ah7dKd4c() {
    assertEquals(
      "4s3cQs5s 6sAc2s2d 9hKc2c8c 8d3hTs4d QdTd7cJs Ah7dKd4c",
      Solver.process("omaha-holdem 4h5d9c9dAd 8d3hTs4d 4s3cQs5s 9hKc2c8c 6sAc2s2d QdTd7cJs Ah7dKd4c"));
  }

  @Test
  public void test_omaha_holdem_9667_2s9hJdKhQc_Ts5d8c4s_Qh3c9s8s_KsAc6cAd_Jh3sKc2d_5h4hAsQd_Js7dJc5c_Tc2h9c7s_4d4c8hAh() {
    assertEquals(
      "4d4c8hAh 5h4hAsQd KsAc6cAd Qh3c9s8s Jh3sKc2d Js7dJc5c Ts5d8c4s Tc2h9c7s",
      Solver.process("omaha-holdem 2s9hJdKhQc Ts5d8c4s Qh3c9s8s KsAc6cAd Jh3sKc2d 5h4hAsQd Js7dJc5c Tc2h9c7s 4d4c8hAh"));
  }

  @Test
  public void test_omaha_holdem_9668_3s4h5c5s6h_2s5h7s8d_KsKcThTd() {
    assertEquals(
      "KsKcThTd 2s5h7s8d",
      Solver.process("omaha-holdem 3s4h5c5s6h 2s5h7s8d KsKcThTd"));
  }

  @Test
  public void test_omaha_holdem_9669_2s3d3h6sTc_Kc6hKh5d_As8sQc6c_Js7h8dQs_KdTsJh7s() {
    assertEquals(
      "Js7h8dQs As8sQc6c KdTsJh7s Kc6hKh5d",
      Solver.process("omaha-holdem 2s3d3h6sTc Kc6hKh5d As8sQc6c Js7h8dQs KdTsJh7s"));
  }

  @Test
  public void test_omaha_holdem_9670_2c4h5c8d8s_2s9d7c3d_AhKh8hQs() {
    assertEquals(
      "2s9d7c3d AhKh8hQs",
      Solver.process("omaha-holdem 2c4h5c8d8s 2s9d7c3d AhKh8hQs"));
  }

  @Test
  public void test_omaha_holdem_9671_4d9cJsQhTh_6c8dAs4s_5cJc5h2h_6d2sQc7c_Jd9dKd8c_3s2dTcQd_AcTs4h7s_4cQs7d6s() {
    assertEquals(
      "6c8dAs4s 5cJc5h2h 6d2sQc7c AcTs4h7s 4cQs7d6s 3s2dTcQd Jd9dKd8c",
      Solver.process("omaha-holdem 4d9cJsQhTh 6c8dAs4s 5cJc5h2h 6d2sQc7c Jd9dKd8c 3s2dTcQd AcTs4h7s 4cQs7d6s"));
  }

  @Test
  public void test_omaha_holdem_9672_4h9hKdThTs_AdKs7h2s_6c4c9s6d_4sQhQdTd_QcAsAc3s_7d3c7sAh_6h5d2d9c_Js8sQs4d() {
    assertEquals(
      "7d3c7sAh 6c4c9s6d=6h5d2d9c AdKs7h2s QcAsAc3s Js8sQs4d 4sQhQdTd",
      Solver.process("omaha-holdem 4h9hKdThTs AdKs7h2s 6c4c9s6d 4sQhQdTd QcAsAc3s 7d3c7sAh 6h5d2d9c Js8sQs4d"));
  }

  @Test
  public void test_omaha_holdem_9673_4s5dAdKcTd_2d7sJs7h_AcTsTc9d() {
    assertEquals(
      "2d7sJs7h AcTsTc9d",
      Solver.process("omaha-holdem 4s5dAdKcTd 2d7sJs7h AcTsTc9d"));
  }

  @Test
  public void test_omaha_holdem_9674_6h7d9c9sTd_4sKc6c3s_2cQdKd4c_Ks2dTh8d_2s3h3dAc_Jc3cJs7h_Jh5d5hAs_8sKhQs8c_4h2hTs8h() {
    assertEquals(
      "2cQdKd4c 2s3h3dAc Jh5d5hAs 4sKc6c3s 8sKhQs8c Jc3cJs7h 4h2hTs8h=Ks2dTh8d",
      Solver.process("omaha-holdem 6h7d9c9sTd 4sKc6c3s 2cQdKd4c Ks2dTh8d 2s3h3dAc Jc3cJs7h Jh5d5hAs 8sKhQs8c 4h2hTs8h"));
  }

  @Test
  public void test_omaha_holdem_9675_2h2s9dJsTs_QsAc3d7s_Kc9hKs9c_2c8c3h4d_5d2dKd5h_6s8s7dTh_5s3s4hJd_6hJcKhQd_4s7c6c8d_Qc6dAs7h() {
    assertEquals(
      "Qc6dAs7h 2c8c3h4d 5d2dKd5h 4s7c6c8d 6hJcKhQd 5s3s4hJd 6s8s7dTh QsAc3d7s Kc9hKs9c",
      Solver.process("omaha-holdem 2h2s9dJsTs QsAc3d7s Kc9hKs9c 2c8c3h4d 5d2dKd5h 6s8s7dTh 5s3s4hJd 6hJcKhQd 4s7c6c8d Qc6dAs7h"));
  }

  @Test
  public void test_omaha_holdem_9676_3h4d9sAdJd_Qh5h9h5d_2s3s2hQs_6cQd6hKc_3d8s5cKh() {
    assertEquals(
      "2s3s2hQs 3d8s5cKh 6cQd6hKc Qh5h9h5d",
      Solver.process("omaha-holdem 3h4d9sAdJd Qh5h9h5d 2s3s2hQs 6cQd6hKc 3d8s5cKh"));
  }

  @Test
  public void test_omaha_holdem_9677_3s6c9sQsTs_2cTh8d9c_KsJc3h4d_8h9hJdQc_3d4c4s7s_2h6hQh6s() {
    assertEquals(
      "2cTh8d9c 2h6hQh6s 8h9hJdQc KsJc3h4d 3d4c4s7s",
      Solver.process("omaha-holdem 3s6c9sQsTs 2cTh8d9c KsJc3h4d 8h9hJdQc 3d4c4s7s 2h6hQh6s"));
  }

  @Test
  public void test_omaha_holdem_9678_3s4h6d9dTs_5s3dQcAs_3h4c5h6s_TdKsJsTh_5c6h7h8c_KhKc2s9h_8d9s7cJd() {
    assertEquals(
      "5s3dQcAs KhKc2s9h 3h4c5h6s TdKsJsTh 5c6h7h8c=8d9s7cJd",
      Solver.process("omaha-holdem 3s4h6d9dTs 5s3dQcAs 3h4c5h6s TdKsJsTh 5c6h7h8c KhKc2s9h 8d9s7cJd"));
  }

  @Test
  public void test_omaha_holdem_9679_4s6sJcQcTc_Ks8s9d7d_4hJh2cJd_Kd4c7c8d_Qs5h3sTs_Ah2dQh6c_2s7hAd8c() {
    assertEquals(
      "2s7hAd8c Ah2dQh6c Qs5h3sTs 4hJh2cJd Ks8s9d7d Kd4c7c8d",
      Solver.process("omaha-holdem 4s6sJcQcTc Ks8s9d7d 4hJh2cJd Kd4c7c8d Qs5h3sTs Ah2dQh6c 2s7hAd8c"));
  }

  @Test
  public void test_omaha_holdem_9680_2c4s7hAcKd_Qc7sQhTd_5sJdQs6d() {
    assertEquals(
      "5sJdQs6d Qc7sQhTd",
      Solver.process("omaha-holdem 2c4s7hAcKd Qc7sQhTd 5sJdQs6d"));
  }

  @Test
  public void test_omaha_holdem_9681_2c6hAsJsTh_4d7d8s8c_8d2s3c9s_2h5hJc4c_6s7s7h5s_AdTd3s6d_KsTcJh2d_Qs9c7c9d() {
    assertEquals(
      "8d2s3c9s 6s7s7h5s 4d7d8s8c Qs9c7c9d 2h5hJc4c KsTcJh2d AdTd3s6d",
      Solver.process("omaha-holdem 2c6hAsJsTh 4d7d8s8c 8d2s3c9s 2h5hJc4c 6s7s7h5s AdTd3s6d KsTcJh2d Qs9c7c9d"));
  }

  @Test
  public void test_omaha_holdem_9682_8d9sJsQcQs_7d9h8h7s_AsKsKd2h_8sJd3dKc_Td5s6s4c_9d3hQdJc_5h2c2d5d_Jh4d3s8c_2s4s3cAh_5cAd4hTc() {
    assertEquals(
      "5cAd4hTc 5h2c2d5d 7d9h8h7s Jh4d3s8c 8sJd3dKc 2s4s3cAh Td5s6s4c AsKsKd2h 9d3hQdJc",
      Solver.process("omaha-holdem 8d9sJsQcQs 7d9h8h7s AsKsKd2h 8sJd3dKc Td5s6s4c 9d3hQdJc 5h2c2d5d Jh4d3s8c 2s4s3cAh 5cAd4hTc"));
  }

  @Test
  public void test_omaha_holdem_9683_4c4d5h7d9c_5c4sQc3h_6hKc6s2h() {
    assertEquals(
      "6hKc6s2h 5c4sQc3h",
      Solver.process("omaha-holdem 4c4d5h7d9c 5c4sQc3h 6hKc6s2h"));
  }

  @Test
  public void test_omaha_holdem_9684_3d5c5s6cJh_6dQc4h9s_7dTs4s5h_8sJd9d8d_Qs3s3c6h_KcJsQd4d_Kd3hAh2d() {
    assertEquals(
      "Kd3hAh2d 6dQc4h9s 8sJd9d8d KcJsQd4d 7dTs4s5h Qs3s3c6h",
      Solver.process("omaha-holdem 3d5c5s6cJh 6dQc4h9s 7dTs4s5h 8sJd9d8d Qs3s3c6h KcJsQd4d Kd3hAh2d"));
  }

  @Test
  public void test_omaha_holdem_9685_3h6d8d9hAs_5s3d2dJd_Th4d4s8c() {
    assertEquals(
      "5s3d2dJd Th4d4s8c",
      Solver.process("omaha-holdem 3h6d8d9hAs 5s3d2dJd Th4d4s8c"));
  }

  @Test
  public void test_omaha_holdem_9686_7c7sJsKcQc_4d5d9hQd_7dJd2sAc_5s2h9cAd_5hAh3c4c_8c5c8dKd_6dJcQsKh_Ks6c3s4s_4h6s7h3d() {
    assertEquals(
      "5s2h9cAd 4d5d9hQd Ks6c3s4s 6dJcQsKh 4h6s7h3d 5hAh3c4c 8c5c8dKd 7dJd2sAc",
      Solver.process("omaha-holdem 7c7sJsKcQc 4d5d9hQd 7dJd2sAc 5s2h9cAd 5hAh3c4c 8c5c8dKd 6dJcQsKh Ks6c3s4s 4h6s7h3d"));
  }

  @Test
  public void test_omaha_holdem_9687_2d2s5hJdQc_9h6d2hQd_7c4c3h4d() {
    assertEquals(
      "7c4c3h4d 9h6d2hQd",
      Solver.process("omaha-holdem 2d2s5hJdQc 9h6d2hQd 7c4c3h4d"));
  }

  @Test
  public void test_omaha_holdem_9688_2s7s8dAhTd_3h6h2hAs_Qd4hJs6s() {
    assertEquals(
      "Qd4hJs6s 3h6h2hAs",
      Solver.process("omaha-holdem 2s7s8dAhTd 3h6h2hAs Qd4hJs6s"));
  }

  @Test
  public void test_omaha_holdem_9689_4s5c6hQdTs_9hTcTh9d_6dAs3hJc_2sKd7h4d_Js5h7d7s_Kc5s8h3s() {
    assertEquals(
      "2sKd7h4d Kc5s8h3s 6dAs3hJc Js5h7d7s 9hTcTh9d",
      Solver.process("omaha-holdem 4s5c6hQdTs 9hTcTh9d 6dAs3hJc 2sKd7h4d Js5h7d7s Kc5s8h3s"));
  }

  @Test
  public void test_omaha_holdem_9690_2c7c7d9hQs_Qd4hKd2h_9sAd7s6h_5c6cQh8s_4c5d7hAs_JdTs9c6d() {
    assertEquals(
      "JdTs9c6d 5c6cQh8s Qd4hKd2h 4c5d7hAs 9sAd7s6h",
      Solver.process("omaha-holdem 2c7c7d9hQs Qd4hKd2h 9sAd7s6h 5c6cQh8s 4c5d7hAs JdTs9c6d"));
  }

  @Test
  public void test_omaha_holdem_9691_2c3d3h3sJh_6cKsAs4h_6sKc5c7h_2sJcJsTc_5sQd8h6d_Qc7dKd8d_AdTh9s5d() {
    assertEquals(
      "5sQd8h6d 6sKc5c7h Qc7dKd8d AdTh9s5d 6cKsAs4h 2sJcJsTc",
      Solver.process("omaha-holdem 2c3d3h3sJh 6cKsAs4h 6sKc5c7h 2sJcJsTc 5sQd8h6d Qc7dKd8d AdTh9s5d"));
  }

  @Test
  public void test_omaha_holdem_9692_6c6d6s7dKd_Ts8c4hKs_6h2c2d4d_Js4cKh8s_QcJcQh9c_7c9dJhAs_TcKc5hQs() {
    assertEquals(
      "Ts8c4hKs Js4cKh8s TcKc5hQs 7c9dJhAs QcJcQh9c 6h2c2d4d",
      Solver.process("omaha-holdem 6c6d6s7dKd Ts8c4hKs 6h2c2d4d Js4cKh8s QcJcQh9c 7c9dJhAs TcKc5hQs"));
  }

  @Test
  public void test_omaha_holdem_9693_2c2d2s6c9c_Tc4dQhQs_KcAcKs9d_Ah6d6hJd_8c3d3h9h_2h7s4c8s_8h7c7dTs_5dTdKh6s_QcAsThQd() {
    assertEquals(
      "5dTdKh6s 8c3d3h9h 8h7c7dTs QcAsThQd=Tc4dQhQs KcAcKs9d Ah6d6hJd 2h7s4c8s",
      Solver.process("omaha-holdem 2c2d2s6c9c Tc4dQhQs KcAcKs9d Ah6d6hJd 8c3d3h9h 2h7s4c8s 8h7c7dTs 5dTdKh6s QcAsThQd"));
  }

  @Test
  public void test_omaha_holdem_9694_3d6hAdAsQc_2hKs7h4s_8dKhQd7d_5h3h4hQs_7c4d3c8c_8h5sKd5c() {
    assertEquals(
      "2hKs7h4s 7c4d3c8c 8h5sKd5c 5h3h4hQs 8dKhQd7d",
      Solver.process("omaha-holdem 3d6hAdAsQc 2hKs7h4s 8dKhQd7d 5h3h4hQs 7c4d3c8c 8h5sKd5c"));
  }

  @Test
  public void test_omaha_holdem_9695_3c4c8sQsTd_Jh6h4sTs_9cKhQh2s_Ad5s4h3h_AcKs3sTh_5d2c9h7d_JdAhTcJs_5hQd8c9s_3d2d7hKc() {
    assertEquals(
      "5d2c9h7d 3d2d7hKc JdAhTcJs 9cKhQh2s Ad5s4h3h AcKs3sTh Jh6h4sTs 5hQd8c9s",
      Solver.process("omaha-holdem 3c4c8sQsTd Jh6h4sTs 9cKhQh2s Ad5s4h3h AcKs3sTh 5d2c9h7d JdAhTcJs 5hQd8c9s 3d2d7hKc"));
  }

  @Test
  public void test_omaha_holdem_9696_5cAcKsTcTs_4d4c9hAs_6d2h3d8d_QdTh5d3c_2c6hKcJc_3s9c8sQc() {
    assertEquals(
      "6d2h3d8d 4d4c9hAs 3s9c8sQc 2c6hKcJc QdTh5d3c",
      Solver.process("omaha-holdem 5cAcKsTcTs 4d4c9hAs 6d2h3d8d QdTh5d3c 2c6hKcJc 3s9c8sQc"));
  }

  @Test
  public void test_omaha_holdem_9697_2d4c7hAdAh_Ac7s4hQh_6h8c5sKs_6s5hKd8s_5d4s6cTd() {
    assertEquals(
      "6h8c5sKs=6s5hKd8s 5d4s6cTd Ac7s4hQh",
      Solver.process("omaha-holdem 2d4c7hAdAh Ac7s4hQh 6h8c5sKs 6s5hKd8s 5d4s6cTd"));
  }

  @Test
  public void test_omaha_holdem_9698_3d7d9sKcTc_JcQs8hKd_3hKs4h9h_AcAh3s7h() {
    assertEquals(
      "AcAh3s7h 3hKs4h9h JcQs8hKd",
      Solver.process("omaha-holdem 3d7d9sKcTc JcQs8hKd 3hKs4h9h AcAh3s7h"));
  }

  @Test
  public void test_omaha_holdem_9699_2h3s9hQhTd_Th7cQcJd_9s5h9d7d_8hTs4cAh_6d2cQd5c_8sKc5s7s() {
    assertEquals(
      "8sKc5s7s 6d2cQd5c Th7cQcJd 9s5h9d7d 8hTs4cAh",
      Solver.process("omaha-holdem 2h3s9hQhTd Th7cQcJd 9s5h9d7d 8hTs4cAh 6d2cQd5c 8sKc5s7s"));
  }

  @Test
  public void test_omaha_holdem_9700_3d9c9hJcTd_3cKh9dJs_2hTcAd7d() {
    assertEquals(
      "2hTcAd7d 3cKh9dJs",
      Solver.process("omaha-holdem 3d9c9hJcTd 3cKh9dJs 2hTcAd7d"));
  }

  @Test
  public void test_omaha_holdem_9701_5d6dAsJcQs_5s2hKc7s_9d3c6c4d_AcQc2c6s_ThJdJs8h_7d7h9c4c_AdKh8dKs_7c3s2s9h_9sJhQd4h() {
    assertEquals(
      "7c3s2s9h 5s2hKc7s 9d3c6c4d 7d7h9c4c AdKh8dKs 9sJhQd4h AcQc2c6s ThJdJs8h",
      Solver.process("omaha-holdem 5d6dAsJcQs 5s2hKc7s 9d3c6c4d AcQc2c6s ThJdJs8h 7d7h9c4c AdKh8dKs 7c3s2s9h 9sJhQd4h"));
  }

  @Test
  public void test_omaha_holdem_9702_4d8dJhJsQh_6s3s5sAd_7hKcQs4s_Ts5hKsTc_QdJd9s7d_7s9c4cJc_ThKh3c7c() {
    assertEquals(
      "ThKh3c7c 6s3s5sAd Ts5hKsTc 7hKcQs4s 7s9c4cJc QdJd9s7d",
      Solver.process("omaha-holdem 4d8dJhJsQh 6s3s5sAd 7hKcQs4s Ts5hKsTc QdJd9s7d 7s9c4cJc ThKh3c7c"));
  }

  @Test
  public void test_omaha_holdem_9703_4c5h6c8hTc_Qc6s4s8s_2sQh7sKs() {
    assertEquals(
      "2sQh7sKs Qc6s4s8s",
      Solver.process("omaha-holdem 4c5h6c8hTc Qc6s4s8s 2sQh7sKs"));
  }

  @Test
  public void test_omaha_holdem_9704_6c6h7cAsQc_QsKc9sTh_9cKs3s2d() {
    assertEquals(
      "9cKs3s2d QsKc9sTh",
      Solver.process("omaha-holdem 6c6h7cAsQc QsKc9sTh 9cKs3s2d"));
  }

  @Test
  public void test_omaha_holdem_9705_2d7d7hKcTd_2h3d7c8d_Tc6dAs9s() {
    assertEquals(
      "Tc6dAs9s 2h3d7c8d",
      Solver.process("omaha-holdem 2d7d7hKcTd 2h3d7c8d Tc6dAs9s"));
  }

  @Test
  public void test_omaha_holdem_9706_7c9cAdAhTd_Js6dQcQd_6cTsAc3h_9s7d9d4d_5s9h8cKh_Kc8sTc6h() {
    assertEquals(
      "5s9h8cKh Js6dQcQd Kc8sTc6h 9s7d9d4d 6cTsAc3h",
      Solver.process("omaha-holdem 7c9cAdAhTd Js6dQcQd 6cTsAc3h 9s7d9d4d 5s9h8cKh Kc8sTc6h"));
  }

  @Test
  public void test_omaha_holdem_9707_5s7c9hAdTc_8hAhTs4c_9d5c3cQd_2d2h5hKd_KsJh6d4d_2cKh6s8s_Js3s3d9s_4sQsJcJd_8c6h2s7d() {
    assertEquals(
      "KsJh6d4d 2d2h5hKd Js3s3d9s 4sQsJcJd 9d5c3cQd 8hAhTs4c 2cKh6s8s=8c6h2s7d",
      Solver.process("omaha-holdem 5s7c9hAdTc 8hAhTs4c 9d5c3cQd 2d2h5hKd KsJh6d4d 2cKh6s8s Js3s3d9s 4sQsJcJd 8c6h2s7d"));
  }

  @Test
  public void test_omaha_holdem_9708_2h6sAdQcTh_Kd2d8c2c_JdAh6cQs_9c7cQdJc() {
    assertEquals(
      "9c7cQdJc JdAh6cQs Kd2d8c2c",
      Solver.process("omaha-holdem 2h6sAdQcTh Kd2d8c2c JdAh6cQs 9c7cQdJc"));
  }

  @Test
  public void test_omaha_holdem_9709_6h6sAsJhTd_9h4c4hTc_7d6cJs5h() {
    assertEquals(
      "9h4c4hTc 7d6cJs5h",
      Solver.process("omaha-holdem 6h6sAsJhTd 9h4c4hTc 7d6cJs5h"));
  }

  @Test
  public void test_omaha_holdem_9710_2h3h7c9cJc_2d8cJsTs_3c2s5hQh() {
    assertEquals(
      "3c2s5hQh 2d8cJsTs",
      Solver.process("omaha-holdem 2h3h7c9cJc 2d8cJsTs 3c2s5hQh"));
  }

  @Test
  public void test_omaha_holdem_9711_2d3c5h6dQc_As3sKd2h_3dQhJh4s_Jc9dTs6h() {
    assertEquals(
      "Jc9dTs6h As3sKd2h 3dQhJh4s",
      Solver.process("omaha-holdem 2d3c5h6dQc As3sKd2h 3dQhJh4s Jc9dTs6h"));
  }

  @Test
  public void test_omaha_holdem_9712_2d3d5dAsJd_2c2s5sKc_AhJsQd6c_Kd2hAc8h_7c5h7d9c_Jh6d7h3c() {
    assertEquals(
      "7c5h7d9c Jh6d7h3c Kd2hAc8h AhJsQd6c 2c2s5sKc",
      Solver.process("omaha-holdem 2d3d5dAsJd 2c2s5sKc AhJsQd6c Kd2hAc8h 7c5h7d9c Jh6d7h3c"));
  }

  @Test
  public void test_omaha_holdem_9713_2c5c6c8sQs_3hQd2dTh_4s9h9sTd_5hJhAs7d_Ac7sAhJc() {
    assertEquals(
      "5hJhAs7d 4s9h9sTd 3hQd2dTh Ac7sAhJc",
      Solver.process("omaha-holdem 2c5c6c8sQs 3hQd2dTh 4s9h9sTd 5hJhAs7d Ac7sAhJc"));
  }

  @Test
  public void test_omaha_holdem_9714_2s4d4sAdTd_ThQh6h8s_2c7d3sKc_QdAhJs5d_6cAc8h4h_9dQsJh5s_KdJc6s7h_2d5cAs7s_3c5h8d3d_Ks3h9sTc() {
    assertEquals(
      "9dQsJh5s KdJc6s7h 2c7d3sKc ThQh6h8s Ks3h9sTc 2d5cAs7s 3c5h8d3d QdAhJs5d 6cAc8h4h",
      Solver.process("omaha-holdem 2s4d4sAdTd ThQh6h8s 2c7d3sKc QdAhJs5d 6cAc8h4h 9dQsJh5s KdJc6s7h 2d5cAs7s 3c5h8d3d Ks3h9sTc"));
  }

  @Test
  public void test_omaha_holdem_9715_6d9cJhTcTs_KcKh5c2d_8s5d4h3c_9sThJs3d_Td6h7c3s() {
    assertEquals(
      "8s5d4h3c KcKh5c2d Td6h7c3s 9sThJs3d",
      Solver.process("omaha-holdem 6d9cJhTcTs KcKh5c2d 8s5d4h3c 9sThJs3d Td6h7c3s"));
  }

  @Test
  public void test_omaha_holdem_9716_AhJsKsQdTc_8d3s7h9s_6dTsJc2h_Qh5c6sQc_8c4c6c9d_QsAs4s3h_2dKdAc6h() {
    assertEquals(
      "Qh5c6sQc 8c4c6c9d=8d3s7h9s 2dKdAc6h=6dTsJc2h=QsAs4s3h",
      Solver.process("omaha-holdem AhJsKsQdTc 8d3s7h9s 6dTsJc2h Qh5c6sQc 8c4c6c9d QsAs4s3h 2dKdAc6h"));
  }

  @Test
  public void test_omaha_holdem_9717_3c3d5d6c8h_Kd7h2d4s_KhAdTd2c_JsAcJh4d_9sQcJcQs_7d9h2sAs_3hTc9cKc_4c4hAh5c_8d7cQh2h() {
    assertEquals(
      "KhAdTd2c 4c4hAh5c 8d7cQh2h JsAcJh4d 9sQcJcQs 3hTc9cKc Kd7h2d4s 7d9h2sAs",
      Solver.process("omaha-holdem 3c3d5d6c8h Kd7h2d4s KhAdTd2c JsAcJh4d 9sQcJcQs 7d9h2sAs 3hTc9cKc 4c4hAh5c 8d7cQh2h"));
  }

  @Test
  public void test_omaha_holdem_9718_2c5s6c8cJd_Th5d7s3h_9sAs9dTd_KhQcTc9c() {
    assertEquals(
      "Th5d7s3h 9sAs9dTd KhQcTc9c",
      Solver.process("omaha-holdem 2c5s6c8cJd Th5d7s3h 9sAs9dTd KhQcTc9c"));
  }

  @Test
  public void test_omaha_holdem_9719_4c4s6d8hAc_9s4hJc3s_9d2cJh7s_8s9h5s9c_AhJs6hTh_Tc6cAdJd() {
    assertEquals(
      "9d2cJh7s 8s9h5s9c AhJs6hTh=Tc6cAdJd 9s4hJc3s",
      Solver.process("omaha-holdem 4c4s6d8hAc 9s4hJc3s 9d2cJh7s 8s9h5s9c AhJs6hTh Tc6cAdJd"));
  }

  @Test
  public void test_omaha_holdem_9720_2d3c5h7h8s_9cJsJdJc_3h5cAcTd_Ts2cQc5s_KdTh6hKh_Qs4dQd7s_Tc8d8c4s_2h8h6d2s_9hJh6sAs() {
    assertEquals(
      "9cJsJdJc Qs4dQd7s KdTh6hKh Ts2cQc5s 3h5cAcTd 2h8h6d2s Tc8d8c4s 9hJh6sAs",
      Solver.process("omaha-holdem 2d3c5h7h8s 9cJsJdJc 3h5cAcTd Ts2cQc5s KdTh6hKh Qs4dQd7s Tc8d8c4s 2h8h6d2s 9hJh6sAs"));
  }

  @Test
  public void test_omaha_holdem_9721_5d9dAdKsTd_QcQdTs7h_Js4s6s5c_8h4cJh7d_3dQs3h3c_JdQh2sTc_Jc3sTh9s_Ac5h7s4h_9h2h9c7c() {
    assertEquals(
      "8h4cJh7d 3dQs3h3c Js4s6s5c QcQdTs7h Jc3sTh9s Ac5h7s4h 9h2h9c7c JdQh2sTc",
      Solver.process("omaha-holdem 5d9dAdKsTd QcQdTs7h Js4s6s5c 8h4cJh7d 3dQs3h3c JdQh2sTc Jc3sTh9s Ac5h7s4h 9h2h9c7c"));
  }

  @Test
  public void test_omaha_holdem_9722_2s3d5hJsKc_9s5cAs4s_Ac3c6c4h_5s7d2dTh_KdAdQh6s() {
    assertEquals(
      "KdAdQh6s 5s7d2dTh 9s5cAs4s Ac3c6c4h",
      Solver.process("omaha-holdem 2s3d5hJsKc 9s5cAs4s Ac3c6c4h 5s7d2dTh KdAdQh6s"));
  }

  @Test
  public void test_omaha_holdem_9723_3s7h9sAcAs_4d2s8h5c_Qs9h2hKd_6dAd9dQh_7s3d3h4s() {
    assertEquals(
      "4d2s8h5c Qs9h2hKd 7s3d3h4s 6dAd9dQh",
      Solver.process("omaha-holdem 3s7h9sAcAs 4d2s8h5c Qs9h2hKd 6dAd9dQh 7s3d3h4s"));
  }

  @Test
  public void test_omaha_holdem_9724_2c3d7d8dJh_4h3sKh8s_QhTc2d9c_9d5c5sAc_QcKd3c2h_5h6h9h7c_Ad9s6cTd() {
    assertEquals(
      "9d5c5sAc 5h6h9h7c QcKd3c2h 4h3sKh8s QhTc2d9c Ad9s6cTd",
      Solver.process("omaha-holdem 2c3d7d8dJh 4h3sKh8s QhTc2d9c 9d5c5sAc QcKd3c2h 5h6h9h7c Ad9s6cTd"));
  }

  @Test
  public void test_omaha_holdem_9725_6s7h7sJdKs_QsTs7dJs_Qd9sJc4c() {
    assertEquals(
      "Qd9sJc4c QsTs7dJs",
      Solver.process("omaha-holdem 6s7h7sJdKs QsTs7dJs Qd9sJc4c"));
  }

  @Test
  public void test_omaha_holdem_9726_3d4d6cAhTs_6dQd5d3h_7cQcJsKh_Ac8s2cJc_4sKs5c6h_9d4h5sTc_KcAsJd8h() {
    assertEquals(
      "7cQcJsKh Ac8s2cJc KcAsJd8h 6dQd5d3h 4sKs5c6h 9d4h5sTc",
      Solver.process("omaha-holdem 3d4d6cAhTs 6dQd5d3h 7cQcJsKh Ac8s2cJc 4sKs5c6h 9d4h5sTc KcAsJd8h"));
  }

  @Test
  public void test_omaha_holdem_9727_2d6h9dKcTc_5c8c5s4c_9c6c2s2c_8d3hJcJs_TsQd6d3d_4h7d8sKs_4dQsQcTd_8h5hAd6s_2h9h3s3c_QhKhJhJd() {
    assertEquals(
      "5c8c5s4c 8h5hAd6s 8d3hJcJs 4dQsQcTd 2h9h3s3c TsQd6d3d 9c6c2s2c 4h7d8sKs QhKhJhJd",
      Solver.process("omaha-holdem 2d6h9dKcTc 5c8c5s4c 9c6c2s2c 8d3hJcJs TsQd6d3d 4h7d8sKs 4dQsQcTd 8h5hAd6s 2h9h3s3c QhKhJhJd"));
  }

  @Test
  public void test_omaha_holdem_9728_7cJhJsQhTh_4d3c7hQs_2dTcKsKc_4s7sAdAs_8d9d9sKh_7d5d4cQc() {
    assertEquals(
      "4d3c7hQs=7d5d4cQc 2dTcKsKc 4s7sAdAs 8d9d9sKh",
      Solver.process("omaha-holdem 7cJhJsQhTh 4d3c7hQs 2dTcKsKc 4s7sAdAs 8d9d9sKh 7d5d4cQc"));
  }

  @Test
  public void test_omaha_holdem_9729_2c4sJsQdTh_Ac6h8h6c_7s3h3c6d_8dKsQhAh_3s4c9sJh_3d2hAd8c_9cJdJc7d() {
    assertEquals(
      "3d2hAd8c 7s3h3c6d Ac6h8h6c 3s4c9sJh 9cJdJc7d 8dKsQhAh",
      Solver.process("omaha-holdem 2c4sJsQdTh Ac6h8h6c 7s3h3c6d 8dKsQhAh 3s4c9sJh 3d2hAd8c 9cJdJc7d"));
  }

  @Test
  public void test_omaha_holdem_9730_2d4d7d7sJc_Ks3cTs8h_3s2hQc6c_Qh6s5h6h_6dKcTh8d() {
    assertEquals(
      "Ks3cTs8h 3s2hQc6c Qh6s5h6h 6dKcTh8d",
      Solver.process("omaha-holdem 2d4d7d7sJc Ks3cTs8h 3s2hQc6c Qh6s5h6h 6dKcTh8d"));
  }

  @Test
  public void test_omaha_holdem_9731_2s5dJhKdTh_Ks6cQsTs_5c2dKhJs_Ah3s2c9h() {
    assertEquals(
      "Ah3s2c9h Ks6cQsTs 5c2dKhJs",
      Solver.process("omaha-holdem 2s5dJhKdTh Ks6cQsTs 5c2dKhJs Ah3s2c9h"));
  }

  @Test
  public void test_omaha_holdem_9732_2h6c7cTcTs_9s3s3c5s_2d5h3hJh_Ac8c4h5c_JsJd6dTd_9cThQsKs() {
    assertEquals(
      "2d5h3hJh 9s3s3c5s 9cThQsKs Ac8c4h5c JsJd6dTd",
      Solver.process("omaha-holdem 2h6c7cTcTs 9s3s3c5s 2d5h3hJh Ac8c4h5c JsJd6dTd 9cThQsKs"));
  }

  @Test
  public void test_omaha_holdem_9733_5cAhJdQsTh_4s5h2cKh_4hJcAc2s_7hQd9s9c_JsTd4c3h_6hQhQcKs_Jh8sTs3s_9h2h6dKd_9d6s4dAd() {
    assertEquals(
      "4s5h2cKh 7hQd9s9c 9d6s4dAd Jh8sTs3s=JsTd4c3h 4hJcAc2s 9h2h6dKd 6hQhQcKs",
      Solver.process("omaha-holdem 5cAhJdQsTh 4s5h2cKh 4hJcAc2s 7hQd9s9c JsTd4c3h 6hQhQcKs Jh8sTs3s 9h2h6dKd 9d6s4dAd"));
  }

  @Test
  public void test_omaha_holdem_9734_8sJdQsTdTh_9d8c6dQd_3cKc3sAc_2dAs6s4h_2c7s5h6c_7h3hAdTs_KdKh4d9h_7dTc7c3d_5c4cJh2h_9cJcJs5s() {
    assertEquals(
      "2c7s5h6c 2dAs6s4h 5c4cJh2h 7dTc7c3d 7h3hAdTs 9d8c6dQd KdKh4d9h 3cKc3sAc 9cJcJs5s",
      Solver.process("omaha-holdem 8sJdQsTdTh 9d8c6dQd 3cKc3sAc 2dAs6s4h 2c7s5h6c 7h3hAdTs KdKh4d9h 7dTc7c3d 5c4cJh2h 9cJcJs5s"));
  }

  @Test
  public void test_omaha_holdem_9735_3c7hAhJdJs_QcQdKsQs_5c9h6h6c_Td4hTs2c_2d3d5hAc_5dJc6dTc_2s9c4sKd() {
    assertEquals(
      "2s9c4sKd 5c9h6h6c Td4hTs2c QcQdKsQs 2d3d5hAc 5dJc6dTc",
      Solver.process("omaha-holdem 3c7hAhJdJs QcQdKsQs 5c9h6h6c Td4hTs2c 2d3d5hAc 5dJc6dTc 2s9c4sKd"));
  }

  @Test
  public void test_omaha_holdem_9736_5h9cJcJdJs_4dKh3h8h_Ah5cAc5d_9hQc3d6s_8s6d3c7h_4s6c2c6h_7cJh7s4h_Kc3sQs9s_2dTsTh8d_QdAdQhKd() {
    assertEquals(
      "8s6d3c7h 9hQc3d6s 4dKh3h8h Kc3sQs9s 4s6c2c6h 2dTsTh8d QdAdQhKd Ah5cAc5d 7cJh7s4h",
      Solver.process("omaha-holdem 5h9cJcJdJs 4dKh3h8h Ah5cAc5d 9hQc3d6s 8s6d3c7h 4s6c2c6h 7cJh7s4h Kc3sQs9s 2dTsTh8d QdAdQhKd"));
  }

  @Test
  public void test_omaha_holdem_9737_2c2d4c5dQc_7s7h4s5c_6s4d3cKs_As5hJs8s_9dTcJc2h_Kh6h5sKc_9h6dThQs() {
    assertEquals(
      "As5hJs8s 7s7h4s5c 9h6dThQs Kh6h5sKc 6s4d3cKs 9dTcJc2h",
      Solver.process("omaha-holdem 2c2d4c5dQc 7s7h4s5c 6s4d3cKs As5hJs8s 9dTcJc2h Kh6h5sKc 9h6dThQs"));
  }

  @Test
  public void test_omaha_holdem_9738_4c8dJdKcQc_Kd7dJh2c_2hAs5hQs_4d4h7hQd_5c6d3dTd_8h2d6cAd_Ks9d6sKh_Ts9sTc9c_7s8c4s7c() {
    assertEquals(
      "5c6d3dTd 8h2d6cAd 2hAs5hQs Kd7dJh2c 4d4h7hQd Ks9d6sKh 7s8c4s7c Ts9sTc9c",
      Solver.process("omaha-holdem 4c8dJdKcQc Kd7dJh2c 2hAs5hQs 4d4h7hQd 5c6d3dTd 8h2d6cAd Ks9d6sKh Ts9sTc9c 7s8c4s7c"));
  }

  @Test
  public void test_omaha_holdem_9739_3c6s7s8sAs_4sJsAdJc_5h7h3s3h_7c3d2sKc_5c2d9sQs_8c9d6cQh_Tc9cTd6h_2cTh4dAc_8d7d5dJh_9hKd5sQc() {
    assertEquals(
      "2cTh4dAc 7c3d2sKc 8c9d6cQh 8d7d5dJh 5h7h3s3h 9hKd5sQc Tc9cTd6h 4sJsAdJc 5c2d9sQs",
      Solver.process("omaha-holdem 3c6s7s8sAs 4sJsAdJc 5h7h3s3h 7c3d2sKc 5c2d9sQs 8c9d6cQh Tc9cTd6h 2cTh4dAc 8d7d5dJh 9hKd5sQc"));
  }

  @Test
  public void test_omaha_holdem_9740_6d8sAsJsKs_7c5h9cAh_2h3cKc9d() {
    assertEquals(
      "2h3cKc9d 7c5h9cAh",
      Solver.process("omaha-holdem 6d8sAsJsKs 7c5h9cAh 2h3cKc9d"));
  }

  @Test
  public void test_omaha_holdem_9741_3c5h9cKdKh_JsAhThAd_7sAc8sQh_Ks6dJh5s_QsJcKc9h_8h8c7d9s_8dAs7c2h_3dTsQc6s_2c6c6h4h_Qd3s5c5d() {
    assertEquals(
      "8dAs7c2h 7sAc8sQh 3dTsQc6s 2c6c6h4h 8h8c7d9s JsAhThAd Qd3s5c5d Ks6dJh5s QsJcKc9h",
      Solver.process("omaha-holdem 3c5h9cKdKh JsAhThAd 7sAc8sQh Ks6dJh5s QsJcKc9h 8h8c7d9s 8dAs7c2h 3dTsQc6s 2c6c6h4h Qd3s5c5d"));
  }

  @Test
  public void test_omaha_holdem_9742_5h5s6h8hQh_Qs7h8d3d_6dJh2s3c_Tc3s9hAh() {
    assertEquals(
      "6dJh2s3c Qs7h8d3d Tc3s9hAh",
      Solver.process("omaha-holdem 5h5s6h8hQh Qs7h8d3d 6dJh2s3c Tc3s9hAh"));
  }

  @Test
  public void test_omaha_holdem_9743_5d6d7c7hAc_Tc8sQsAh_4d9sQdJc_2d3hQc6s_8dTd6h5h_9dKs3s7d() {
    assertEquals(
      "4d9sQdJc 8dTd6h5h 2d3hQc6s Tc8sQsAh 9dKs3s7d",
      Solver.process("omaha-holdem 5d6d7c7hAc Tc8sQsAh 4d9sQdJc 2d3hQc6s 8dTd6h5h 9dKs3s7d"));
  }

  @Test
  public void test_omaha_holdem_9744_2d5d6sKhQd_3cJhAs2s_6h7hQc4s_Qh7s5c8c_5sJc8h8s_4cKd4d8d() {
    assertEquals(
      "3cJhAs2s 5sJc8h8s Qh7s5c8c 6h7hQc4s 4cKd4d8d",
      Solver.process("omaha-holdem 2d5d6sKhQd 3cJhAs2s 6h7hQc4s Qh7s5c8c 5sJc8h8s 4cKd4d8d"));
  }

  @Test
  public void test_omaha_holdem_9745_3d4c8c9h9s_6s4h4dAd_2cAc3c7d_6c3sQhQs_Kc5d2sQd_6h8dJcTc_AhJh4s5s_2hTdTs5c_Jd7c8hAs() {
    assertEquals(
      "Kc5d2sQd 2cAc3c7d AhJh4s5s 6h8dJcTc Jd7c8hAs 2hTdTs5c 6c3sQhQs 6s4h4dAd",
      Solver.process("omaha-holdem 3d4c8c9h9s 6s4h4dAd 2cAc3c7d 6c3sQhQs Kc5d2sQd 6h8dJcTc AhJh4s5s 2hTdTs5c Jd7c8hAs"));
  }

  @Test
  public void test_omaha_holdem_9746_6d6s8h9hAh_QdTh6c9s_2c4c7s5c_5d9dTdKh_Qh7hJs3d_8cJcKc4d() {
    assertEquals(
      "8cJcKc4d 5d9dTdKh 2c4c7s5c Qh7hJs3d QdTh6c9s",
      Solver.process("omaha-holdem 6d6s8h9hAh QdTh6c9s 2c4c7s5c 5d9dTdKh Qh7hJs3d 8cJcKc4d"));
  }

  @Test
  public void test_omaha_holdem_9747_2h7s8cJdTd_5sTcKcAs_5d3sAh9s_AdKdKsQs_QdQc2s9d_9c5h4dAc_3d4h7dTh() {
    assertEquals(
      "5d3sAh9s=9c5h4dAc 5sTcKcAs AdKdKsQs 3d4h7dTh QdQc2s9d",
      Solver.process("omaha-holdem 2h7s8cJdTd 5sTcKcAs 5d3sAh9s AdKdKsQs QdQc2s9d 9c5h4dAc 3d4h7dTh"));
  }

  @Test
  public void test_omaha_holdem_9748_2c4hAcJsKd_Th8s8c4d_9s2s7c3h_7hQcAhTd_2dKhKsAd_5s6s8d9c_6c5h3c6h_QsTc9hJc_TsJd3s9d_6d5dAs7s() {
    assertEquals(
      "5s6s8d9c 9s2s7c3h Th8s8c4d TsJd3s9d 6d5dAs7s 2dKhKsAd 6c5h3c6h 7hQcAhTd=QsTc9hJc",
      Solver.process("omaha-holdem 2c4hAcJsKd Th8s8c4d 9s2s7c3h 7hQcAhTd 2dKhKsAd 5s6s8d9c 6c5h3c6h QsTc9hJc TsJd3s9d 6d5dAs7s"));
  }

  @Test
  public void test_omaha_holdem_9749_4h7s9dKdQs_8hTsAd4s_2d3c6sKc() {
    assertEquals(
      "8hTsAd4s 2d3c6sKc",
      Solver.process("omaha-holdem 4h7s9dKdQs 8hTsAd4s 2d3c6sKc"));
  }

}
