
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver37HiddenTest {


  @Test
  public void test_omaha_holdem_9250_2h6d8hJsTh_4dJdAh3h_7sJh3cQh_9c5s5cJc_6hKh4sQd_6s9h2s4h_Ts8d5hAs() {
    assertEquals(
      "9c5s5cJc Ts8d5hAs 6s9h2s4h 7sJh3cQh 6hKh4sQd 4dJdAh3h",
      Solver.process("omaha-holdem 2h6d8hJsTh 4dJdAh3h 7sJh3cQh 9c5s5cJc 6hKh4sQd 6s9h2s4h Ts8d5hAs"));
  }

  @Test
  public void test_omaha_holdem_9251_4h5d5s6hQh_Ts7hAd6d_3dKs7s7d_2dTcAhKd_5h3sAcJh_5c8s8dJc_3hAsTd9s_6sKc9hJs_Qd8c3c2s_6cQc4c2c() {
    assertEquals(
      "3hAsTd9s 2dTcAhKd 6sKc9hJs Ts7hAd6d 6cQc4c2c 5c8s8dJc Qd8c3c2s 3dKs7s7d 5h3sAcJh",
      Solver.process("omaha-holdem 4h5d5s6hQh Ts7hAd6d 3dKs7s7d 2dTcAhKd 5h3sAcJh 5c8s8dJc 3hAsTd9s 6sKc9hJs Qd8c3c2s 6cQc4c2c"));
  }

  @Test
  public void test_omaha_holdem_9252_3s5s9dJhKs_Tc4d9sKh_JsKdJd8s_3h7h9c2d() {
    assertEquals(
      "3h7h9c2d Tc4d9sKh JsKdJd8s",
      Solver.process("omaha-holdem 3s5s9dJhKs Tc4d9sKh JsKdJd8s 3h7h9c2d"));
  }

  @Test
  public void test_omaha_holdem_9253_4dAhJcQcQh_3dTs2d7s_8h4c9c8s_Kc6hKhAd_3cQsJd3h() {
    assertEquals(
      "3dTs2d7s 8h4c9c8s Kc6hKhAd 3cQsJd3h",
      Solver.process("omaha-holdem 4dAhJcQcQh 3dTs2d7s 8h4c9c8s Kc6hKhAd 3cQsJd3h"));
  }

  @Test
  public void test_omaha_holdem_9254_2c4c7s8sKc_Qs8cJc4d_Kh5d6h5s_4hAh9cJs_9s7c7h2d() {
    assertEquals(
      "4hAh9cJs 9s7c7h2d Kh5d6h5s Qs8cJc4d",
      Solver.process("omaha-holdem 2c4c7s8sKc Qs8cJc4d Kh5d6h5s 4hAh9cJs 9s7c7h2d"));
  }

  @Test
  public void test_omaha_holdem_9255_4d6s9sAdJs_6h4sJh7s_7cQs8h5h_Ks9dTc3d_2sKd2h8c_Ac5dTs5c_8dJd7d3c() {
    assertEquals(
      "7cQs8h5h 2sKd2h8c Ks9dTc3d 8dJd7d3c Ac5dTs5c 6h4sJh7s",
      Solver.process("omaha-holdem 4d6s9sAdJs 6h4sJh7s 7cQs8h5h Ks9dTc3d 2sKd2h8c Ac5dTs5c 8dJd7d3c"));
  }

  @Test
  public void test_omaha_holdem_9256_4c6d7hJsTs_KdQhTc2d_9d9c2cAs_Ah8c8dAc_TdAd3h4h_5cQs3s2h_3cJc9s7s_JdQc5d7c_7d6sJh6c_6h9h4dKc() {
    assertEquals(
      "9d9c2cAs KdQhTc2d Ah8c8dAc 6h9h4dKc TdAd3h4h 3cJc9s7s=JdQc5d7c 7d6sJh6c 5cQs3s2h",
      Solver.process("omaha-holdem 4c6d7hJsTs KdQhTc2d 9d9c2cAs Ah8c8dAc TdAd3h4h 5cQs3s2h 3cJc9s7s JdQc5d7c 7d6sJh6c 6h9h4dKc"));
  }

  @Test
  public void test_omaha_holdem_9257_6d7hJdKhKs_Kc9dTh2c_Qs8s7dAh_8dQc9cQd_7s8h9s4c_TdAcTsAd_2sJs8c6c_3h5h5cKd() {
    assertEquals(
      "7s8h9s4c Qs8s7dAh 2sJs8c6c 8dQc9cQd TdAcTsAd 3h5h5cKd Kc9dTh2c",
      Solver.process("omaha-holdem 6d7hJdKhKs Kc9dTh2c Qs8s7dAh 8dQc9cQd 7s8h9s4c TdAcTsAd 2sJs8c6c 3h5h5cKd"));
  }

  @Test
  public void test_omaha_holdem_9258_4s9dAdJcKc_2sQd6c6h_4c4d6dJs_5h5c7dKd_3h8s5d5s_6sQsQh4h_8c8d9hKh_Tc9s3sAc_AsJh3cJd_7c7sQc2d() {
    assertEquals(
      "3h8s5d5s 2sQd6c6h 7c7sQc2d 6sQsQh4h 5h5c7dKd 8c8d9hKh Tc9s3sAc 4c4d6dJs AsJh3cJd",
      Solver.process("omaha-holdem 4s9dAdJcKc 2sQd6c6h 4c4d6dJs 5h5c7dKd 3h8s5d5s 6sQsQh4h 8c8d9hKh Tc9s3sAc AsJh3cJd 7c7sQc2d"));
  }

  @Test
  public void test_omaha_holdem_9259_2c5s9cJdJs_5dAc7cQs_4d4sQh3d_Ah6dTh9d_4c9sKdJc_Qc8d2s6h_8c7d6s6c_2dKh5c7h() {
    assertEquals(
      "Qc8d2s6h 4d4sQh3d 2dKh5c7h 5dAc7cQs 8c7d6s6c Ah6dTh9d 4c9sKdJc",
      Solver.process("omaha-holdem 2c5s9cJdJs 5dAc7cQs 4d4sQh3d Ah6dTh9d 4c9sKdJc Qc8d2s6h 8c7d6s6c 2dKh5c7h"));
  }

  @Test
  public void test_omaha_holdem_9260_2d2h3dQcQs_8s6sJh8d_Qd7d4d7s() {
    assertEquals(
      "8s6sJh8d Qd7d4d7s",
      Solver.process("omaha-holdem 2d2h3dQcQs 8s6sJh8d Qd7d4d7s"));
  }

  @Test
  public void test_omaha_holdem_9261_5d9c9hJdKs_Td4h7hJc_9s2d6dKc_QsTc8d5s_2c9dJh3h_5hQc8hAc() {
    assertEquals(
      "5hQc8hAc Td4h7hJc QsTc8d5s 2c9dJh3h 9s2d6dKc",
      Solver.process("omaha-holdem 5d9c9hJdKs Td4h7hJc 9s2d6dKc QsTc8d5s 2c9dJh3h 5hQc8hAc"));
  }

  @Test
  public void test_omaha_holdem_9262_2s4d5cJdQc_6d9c4s8c_Ah3sKd9d_6h6s8sKc_5s7cAdQd_QhKh7sQs_2cTsTcJs_KsAsJcTd_8h5d4c3h() {
    assertEquals(
      "6d9c4s8c 6h6s8sKc KsAsJcTd 8h5d4c3h 2cTsTcJs 5s7cAdQd QhKh7sQs Ah3sKd9d",
      Solver.process("omaha-holdem 2s4d5cJdQc 6d9c4s8c Ah3sKd9d 6h6s8sKc 5s7cAdQd QhKh7sQs 2cTsTcJs KsAsJcTd 8h5d4c3h"));
  }

  @Test
  public void test_omaha_holdem_9263_2d3c4c4s6d_Kh7sJc9d_8h5c8dJs() {
    assertEquals(
      "Kh7sJc9d 8h5c8dJs",
      Solver.process("omaha-holdem 2d3c4c4s6d Kh7sJc9d 8h5c8dJs"));
  }

  @Test
  public void test_omaha_holdem_9264_3s5c8sJcKh_4c9d5h4h_9h6h6cKs() {
    assertEquals(
      "4c9d5h4h 9h6h6cKs",
      Solver.process("omaha-holdem 3s5c8sJcKh 4c9d5h4h 9h6h6cKs"));
  }

  @Test
  public void test_omaha_holdem_9265_4c4dJcJsTd_Ts2d6hKh_7sJhTh8h() {
    assertEquals(
      "Ts2d6hKh 7sJhTh8h",
      Solver.process("omaha-holdem 4c4dJcJsTd Ts2d6hKh 7sJhTh8h"));
  }

  @Test
  public void test_omaha_holdem_9266_8h9sAsJdKs_Kd7sKc8d_4c8c4s7h_Ah2sTc9h_4hTs2dQs_QcAd3d6s_4d3hJs7c_6hTd7d5d() {
    assertEquals(
      "4c8c4s7h 4d3hJs7c QcAd3d6s Ah2sTc9h Kd7sKc8d 6hTd7d5d 4hTs2dQs",
      Solver.process("omaha-holdem 8h9sAsJdKs Kd7sKc8d 4c8c4s7h Ah2sTc9h 4hTs2dQs QcAd3d6s 4d3hJs7c 6hTd7d5d"));
  }

  @Test
  public void test_omaha_holdem_9267_4c7c9hAhQd_3h8sQc5s_Js7d5hKc_8h6c7h3c_6sQs4s6h_9dTh4dAd_Jc9s9cKd_Qh4h6d2c_8dTd5cJd() {
    assertEquals(
      "8dTd5cJd 8h6c7h3c Js7d5hKc 3h8sQc5s 6sQs4s6h=Qh4h6d2c 9dTh4dAd Jc9s9cKd",
      Solver.process("omaha-holdem 4c7c9hAhQd 3h8sQc5s Js7d5hKc 8h6c7h3c 6sQs4s6h 9dTh4dAd Jc9s9cKd Qh4h6d2c 8dTd5cJd"));
  }

  @Test
  public void test_omaha_holdem_9268_2h3d7cJsQd_6c5s4dKd_Ah4cTdQh() {
    assertEquals(
      "6c5s4dKd Ah4cTdQh",
      Solver.process("omaha-holdem 2h3d7cJsQd 6c5s4dKd Ah4cTdQh"));
  }

  @Test
  public void test_omaha_holdem_9269_2c2s3c5s9s_Qh8d8s7s_2dTdJs9d_9cAd5hKc_Tc4cJd9h_Kh4sAs6d_8c6hJcKs() {
    assertEquals(
      "8c6hJcKs Tc4cJd9h 9cAd5hKc Qh8d8s7s Kh4sAs6d 2dTdJs9d",
      Solver.process("omaha-holdem 2c2s3c5s9s Qh8d8s7s 2dTdJs9d 9cAd5hKc Tc4cJd9h Kh4sAs6d 8c6hJcKs"));
  }

  @Test
  public void test_omaha_holdem_9270_2c5c7hJhTh_5s6sTdKd_AsAh8d8h_2s7dKh7c_4h7s6h9c_JsKc9d3s_8s4cJcTs() {
    assertEquals(
      "JsKc9d3s 5s6sTdKd 8s4cJcTs 2s7dKh7c 4h7s6h9c AsAh8d8h",
      Solver.process("omaha-holdem 2c5c7hJhTh 5s6sTdKd AsAh8d8h 2s7dKh7c 4h7s6h9c JsKc9d3s 8s4cJcTs"));
  }

  @Test
  public void test_omaha_holdem_9271_3h4d5d6h7h_8dQc4sAc_Th3c8h5s_7sJc3s9c_9hAd2h4h_3dAh2sTc_5c9d7c7d_6c4c2d5h_QhAs8sKd() {
    assertEquals(
      "QhAs8sKd 3dAh2sTc 5c9d7c7d=6c4c2d5h=7sJc3s9c 8dQc4sAc 9hAd2h4h Th3c8h5s",
      Solver.process("omaha-holdem 3h4d5d6h7h 8dQc4sAc Th3c8h5s 7sJc3s9c 9hAd2h4h 3dAh2sTc 5c9d7c7d 6c4c2d5h QhAs8sKd"));
  }

  @Test
  public void test_omaha_holdem_9272_5c5hAsTcTh_2c6cQd6s_KdTsQcJc_9c4d7h8s_8c4c9dAc() {
    assertEquals(
      "9c4d7h8s 2c6cQd6s 8c4c9dAc KdTsQcJc",
      Solver.process("omaha-holdem 5c5hAsTcTh 2c6cQd6s KdTsQcJc 9c4d7h8s 8c4c9dAc"));
  }

  @Test
  public void test_omaha_holdem_9273_5c6h7c7d9c_Jd5h8hTd_Ts8sTcAd_6cJh2cQs_9s9hThKs() {
    assertEquals(
      "Jd5h8hTd=Ts8sTcAd 6cJh2cQs 9s9hThKs",
      Solver.process("omaha-holdem 5c6h7c7d9c Jd5h8hTd Ts8sTcAd 6cJh2cQs 9s9hThKs"));
  }

  @Test
  public void test_omaha_holdem_9274_2d3dQsTdTs_6sJhAd9d_Js5cQc5h() {
    assertEquals(
      "Js5cQc5h 6sJhAd9d",
      Solver.process("omaha-holdem 2d3dQsTdTs 6sJhAd9d Js5cQc5h"));
  }

  @Test
  public void test_omaha_holdem_9275_3h6h7d9dAc_Qh9hJhKc_JcKd3dKs_6c8dAh2d_Ad4s7c4d() {
    assertEquals(
      "Qh9hJhKc JcKd3dKs 6c8dAh2d Ad4s7c4d",
      Solver.process("omaha-holdem 3h6h7d9dAc Qh9hJhKc JcKd3dKs 6c8dAh2d Ad4s7c4d"));
  }

  @Test
  public void test_omaha_holdem_9276_2h2s5hJdTs_QdAdKh3h_Qc7d8s5d_4s6d7sKc_7hJs2d6c_Ah6sKs9h_3s4dTcJc_3cQsQh4c_8d8h4h7c() {
    assertEquals(
      "4s6d7sKc Ah6sKs9h=QdAdKh3h Qc7d8s5d 8d8h4h7c 3s4dTcJc 3cQsQh4c 7hJs2d6c",
      Solver.process("omaha-holdem 2h2s5hJdTs QdAdKh3h Qc7d8s5d 4s6d7sKc 7hJs2d6c Ah6sKs9h 3s4dTcJc 3cQsQh4c 8d8h4h7c"));
  }

  @Test
  public void test_omaha_holdem_9277_4d7d8cJdQs_Jc6c5c2d_7s5sQc2c_4s9d8s6s_5dKh3cJh_AhQhKc6h_9hTh6d5h_7c2h9s4h_Td8h8dJs() {
    assertEquals(
      "5dKh3cJh AhQhKc6h 7c2h9s4h 4s9d8s6s 7s5sQc2c Jc6c5c2d 9hTh6d5h Td8h8dJs",
      Solver.process("omaha-holdem 4d7d8cJdQs Jc6c5c2d 7s5sQc2c 4s9d8s6s 5dKh3cJh AhQhKc6h 9hTh6d5h 7c2h9s4h Td8h8dJs"));
  }

  @Test
  public void test_omaha_holdem_9278_3c7hJhQcQd_8h9dTs6h_7d5cAh7c_7s8s5s9h_Td6s5d2c() {
    assertEquals(
      "Td6s5d2c 8h9dTs6h 7s8s5s9h 7d5cAh7c",
      Solver.process("omaha-holdem 3c7hJhQcQd 8h9dTs6h 7d5cAh7c 7s8s5s9h Td6s5d2c"));
  }

  @Test
  public void test_omaha_holdem_9279_6h6sAhQcQs_Th7h9hAc_Qd7cAsJh_Ad3h5hJd_Ks5dJs8h_Kd2c9c8c_4sTc6c3c() {
    assertEquals(
      "Kd2c9c8c Ks5dJs8h Th7h9hAc Ad3h5hJd 4sTc6c3c Qd7cAsJh",
      Solver.process("omaha-holdem 6h6sAhQcQs Th7h9hAc Qd7cAsJh Ad3h5hJd Ks5dJs8h Kd2c9c8c 4sTc6c3c"));
  }

  @Test
  public void test_omaha_holdem_9280_2h4h7c8d8h_2cTs7hAc_9s7s3h3d_6s9hTd9c_2sJs5dKc_6hAd5c8s_3c9dQsKd_Qc5h8cQh_QdAs3sTc() {
    assertEquals(
      "3c9dQsKd QdAs3sTc 2sJs5dKc 9s7s3h3d 2cTs7hAc 6s9hTd9c 6hAd5c8s Qc5h8cQh",
      Solver.process("omaha-holdem 2h4h7c8d8h 2cTs7hAc 9s7s3h3d 6s9hTd9c 2sJs5dKc 6hAd5c8s 3c9dQsKd Qc5h8cQh QdAs3sTc"));
  }

  @Test
  public void test_omaha_holdem_9281_6s7s9dJhJs_QdAsKd5c_3h5sAd5h_KcTc7hJc_8s3s6d4c_Th9cQc2d_8h6c2s2h_KsTsQsKh_Jd3dTd9s_Ac2c8d7d() {
    assertEquals(
      "QdAsKd5c 3h5sAd5h 8h6c2s2h Ac2c8d7d Th9cQc2d 8s3s6d4c KsTsQsKh KcTc7hJc Jd3dTd9s",
      Solver.process("omaha-holdem 6s7s9dJhJs QdAsKd5c 3h5sAd5h KcTc7hJc 8s3s6d4c Th9cQc2d 8h6c2s2h KsTsQsKh Jd3dTd9s Ac2c8d7d"));
  }

  @Test
  public void test_omaha_holdem_9282_2c2h5d7c8s_4d3cKcQc_AcAhQd5s_6cKdJs4s_Kh6h9sTh_7dQsKsJd_3s9h8h6d_9d4hAd2d_5h6s7h8d_2s7s9cQh() {
    assertEquals(
      "4d3cKcQc 7dQsKsJd 5h6s7h8d AcAhQd5s 9d4hAd2d 6cKdJs4s 3s9h8h6d=Kh6h9sTh 2s7s9cQh",
      Solver.process("omaha-holdem 2c2h5d7c8s 4d3cKcQc AcAhQd5s 6cKdJs4s Kh6h9sTh 7dQsKsJd 3s9h8h6d 9d4hAd2d 5h6s7h8d 2s7s9cQh"));
  }

  @Test
  public void test_omaha_holdem_9283_3d4c5c5s8d_Qc3c2d2s_9dKd4dTs_7c9h8h8s_9c8cKh3s_QsAd6c2c_AcTdKsJd() {
    assertEquals(
      "AcTdKsJd Qc3c2d2s 9dKd4dTs 9c8cKh3s QsAd6c2c 7c9h8h8s",
      Solver.process("omaha-holdem 3d4c5c5s8d Qc3c2d2s 9dKd4dTs 7c9h8h8s 9c8cKh3s QsAd6c2c AcTdKsJd"));
  }

  @Test
  public void test_omaha_holdem_9284_3h6dAcKsQc_9c4c8sQs_9d6hKc4d_2s7c6cKh() {
    assertEquals(
      "9c4c8sQs 2s7c6cKh=9d6hKc4d",
      Solver.process("omaha-holdem 3h6dAcKsQc 9c4c8sQs 9d6hKc4d 2s7c6cKh"));
  }

  @Test
  public void test_omaha_holdem_9285_2s3d6c7c8d_3hKh3sQc_Ad4d8s2d_9d5hAh2h_8c3c7sJd_4c9cJhTh_4sQhTcAc_Qs7hKsKc() {
    assertEquals(
      "4sQhTcAc Qs7hKsKc Ad4d8s2d 8c3c7sJd 3hKh3sQc 9d5hAh2h 4c9cJhTh",
      Solver.process("omaha-holdem 2s3d6c7c8d 3hKh3sQc Ad4d8s2d 9d5hAh2h 8c3c7sJd 4c9cJhTh 4sQhTcAc Qs7hKsKc"));
  }

  @Test
  public void test_omaha_holdem_9286_2h7s8cJcTs_8h3c3s3h_7h4cKdQd_6c2d4h5s_6d3d9c5c_Jh9h6hQc_TdThTcAh() {
    assertEquals(
      "6c2d4h5s 7h4cKdQd 8h3c3s3h TdThTcAh 6d3d9c5c Jh9h6hQc",
      Solver.process("omaha-holdem 2h7s8cJcTs 8h3c3s3h 7h4cKdQd 6c2d4h5s 6d3d9c5c Jh9h6hQc TdThTcAh"));
  }

  @Test
  public void test_omaha_holdem_9287_2s6c7dAcKs_8s2cQs2h_9c4cAhTd_6s3c9h6d() {
    assertEquals(
      "9c4cAhTd 8s2cQs2h 6s3c9h6d",
      Solver.process("omaha-holdem 2s6c7dAcKs 8s2cQs2h 9c4cAhTd 6s3c9h6d"));
  }

  @Test
  public void test_omaha_holdem_9288_2c7cJhKcQh_2d6s3d6d_Td8cAs2s_3c3hKsAc_TsKh3sJd_7d6c5h5c_8d8h7sAh() {
    assertEquals(
      "2d6s3d6d 8d8h7sAh TsKh3sJd Td8cAs2s 7d6c5h5c 3c3hKsAc",
      Solver.process("omaha-holdem 2c7cJhKcQh 2d6s3d6d Td8cAs2s 3c3hKsAc TsKh3sJd 7d6c5h5c 8d8h7sAh"));
  }

  @Test
  public void test_omaha_holdem_9289_3d3s9hAsTh_4d9d3c9c_JhAh4sTs_KhKd5s2s_7cQc5c5h() {
    assertEquals(
      "7cQc5c5h KhKd5s2s JhAh4sTs 4d9d3c9c",
      Solver.process("omaha-holdem 3d3s9hAsTh 4d9d3c9c JhAh4sTs KhKd5s2s 7cQc5c5h"));
  }

  @Test
  public void test_omaha_holdem_9290_3h5c7sAhKd_8h5h9s5d_4s9cJd6h_2dJhQsTh_7cTdQh4c_Jc3cKh9d_8dQdTc2h_8c9h7h2s() {
    assertEquals(
      "8dQdTc2h 2dJhQsTh 8c9h7h2s 7cTdQh4c Jc3cKh9d 8h5h9s5d 4s9cJd6h",
      Solver.process("omaha-holdem 3h5c7sAhKd 8h5h9s5d 4s9cJd6h 2dJhQsTh 7cTdQh4c Jc3cKh9d 8dQdTc2h 8c9h7h2s"));
  }

  @Test
  public void test_omaha_holdem_9291_6d6h8sAcQh_4h7h2h9s_2dAd5hTh_6c7dKs8d_9hJs3hQs_5d9cJcTc_Jd8cKhAs() {
    assertEquals(
      "4h7h2h9s 5d9cJcTc 9hJs3hQs 2dAd5hTh Jd8cKhAs 6c7dKs8d",
      Solver.process("omaha-holdem 6d6h8sAcQh 4h7h2h9s 2dAd5hTh 6c7dKs8d 9hJs3hQs 5d9cJcTc Jd8cKhAs"));
  }

  @Test
  public void test_omaha_holdem_9292_5s6h7d8sKh_3c5c3hQh_Tc2h8h8d_Kd9cTsAc_Jd3s4s9s() {
    assertEquals(
      "3c5c3hQh Tc2h8h8d Jd3s4s9s Kd9cTsAc",
      Solver.process("omaha-holdem 5s6h7d8sKh 3c5c3hQh Tc2h8h8d Kd9cTsAc Jd3s4s9s"));
  }

  @Test
  public void test_omaha_holdem_9293_2s3c7dAcQc_KcJsTh4c_9d8h3dQh_2c5dKs6c_Jh8dQd7c_Jd5s4sJc() {
    assertEquals(
      "9d8h3dQh Jh8dQd7c Jd5s4sJc 2c5dKs6c KcJsTh4c",
      Solver.process("omaha-holdem 2s3c7dAcQc KcJsTh4c 9d8h3dQh 2c5dKs6c Jh8dQd7c Jd5s4sJc"));
  }

  @Test
  public void test_omaha_holdem_9294_3s4d4s5d5h_7d7cQdJh_9c3dJc9d_2d2hTs5c() {
    assertEquals(
      "7d7cQdJh 9c3dJc9d 2d2hTs5c",
      Solver.process("omaha-holdem 3s4d4s5d5h 7d7cQdJh 9c3dJc9d 2d2hTs5c"));
  }

  @Test
  public void test_omaha_holdem_9295_2s4h7hQhQs_9hKs6hJs_7d6d8c4c_8d4sKh6s() {
    assertEquals(
      "8d4sKh6s 7d6d8c4c 9hKs6hJs",
      Solver.process("omaha-holdem 2s4h7hQhQs 9hKs6hJs 7d6d8c4c 8d4sKh6s"));
  }

  @Test
  public void test_omaha_holdem_9296_4d7h7s8dAh_3s2sTsAs_9hJs7c8c_Jc6dTd4h() {
    assertEquals(
      "Jc6dTd4h 3s2sTsAs 9hJs7c8c",
      Solver.process("omaha-holdem 4d7h7s8dAh 3s2sTsAs 9hJs7c8c Jc6dTd4h"));
  }

  @Test
  public void test_omaha_holdem_9297_2h7d8dAhJc_8sKcTd3h_6s9cJdAs_7h4s8c2c_Kd5cAc8h_2s7cKsQs() {
    assertEquals(
      "8sKcTd3h 2s7cKsQs 7h4s8c2c Kd5cAc8h 6s9cJdAs",
      Solver.process("omaha-holdem 2h7d8dAhJc 8sKcTd3h 6s9cJdAs 7h4s8c2c Kd5cAc8h 2s7cKsQs"));
  }

  @Test
  public void test_omaha_holdem_9298_5dAhKcQcTd_4dKhTc4s_Jd3c3h8d_2cKd3s9d_Js7sQsKs() {
    assertEquals(
      "Jd3c3h8d 2cKd3s9d 4dKhTc4s Js7sQsKs",
      Solver.process("omaha-holdem 5dAhKcQcTd 4dKhTc4s Jd3c3h8d 2cKd3s9d Js7sQsKs"));
  }

  @Test
  public void test_omaha_holdem_9299_4h5s7h8cQc_Kh5dThKd_3hAh5c3s_Kc4s3d9h_Jd5hJcTs() {
    assertEquals(
      "Kc4s3d9h 3hAh5c3s Jd5hJcTs Kh5dThKd",
      Solver.process("omaha-holdem 4h5s7h8cQc Kh5dThKd 3hAh5c3s Kc4s3d9h Jd5hJcTs"));
  }

  @Test
  public void test_omaha_holdem_9300_5d6s7d8hQc_8cJs6cKs_As2sKc4c_5c5s4h3h_Qh8s8d6d_Jd7c9sJc() {
    assertEquals(
      "As2sKc4c 8cJs6cKs Qh8s8d6d 5c5s4h3h Jd7c9sJc",
      Solver.process("omaha-holdem 5d6s7d8hQc 8cJs6cKs As2sKc4c 5c5s4h3h Qh8s8d6d Jd7c9sJc"));
  }

  @Test
  public void test_omaha_holdem_9301_2c3s4c4hAh_JcTh8s2h_3h9s8dAc_2sJd5sKh() {
    assertEquals(
      "JcTh8s2h 3h9s8dAc 2sJd5sKh",
      Solver.process("omaha-holdem 2c3s4c4hAh JcTh8s2h 3h9s8dAc 2sJd5sKh"));
  }

  @Test
  public void test_omaha_holdem_9302_2s3c6h7h9d_3sAsTc2d_7sTsJhQd() {
    assertEquals(
      "7sTsJhQd 3sAsTc2d",
      Solver.process("omaha-holdem 2s3c6h7h9d 3sAsTc2d 7sTsJhQd"));
  }

  @Test
  public void test_omaha_holdem_9303_3h8hJhKsQc_9s6sKcKh_7hTh2s5s_Tc4c5d4h_As8dJs6d_7d7s7c4d_JdQdTdAh_2hJc8s9d_KdAc2d5c() {
    assertEquals(
      "Tc4c5d4h 7d7s7c4d KdAc2d5c 2hJc8s9d=As8dJs6d 9s6sKcKh JdQdTdAh 7hTh2s5s",
      Solver.process("omaha-holdem 3h8hJhKsQc 9s6sKcKh 7hTh2s5s Tc4c5d4h As8dJs6d 7d7s7c4d JdQdTdAh 2hJc8s9d KdAc2d5c"));
  }

  @Test
  public void test_omaha_holdem_9304_5c5h9sAsTd_AhTh7s7c_4sAc7h2s_Jc4c3cJd_6c6dJh8d_8sTs9dQh_JsQsKc5d_4h3d2hQd() {
    assertEquals(
      "4h3d2hQd 6c6dJh8d 8sTs9dQh Jc4c3cJd 4sAc7h2s AhTh7s7c JsQsKc5d",
      Solver.process("omaha-holdem 5c5h9sAsTd AhTh7s7c 4sAc7h2s Jc4c3cJd 6c6dJh8d 8sTs9dQh JsQsKc5d 4h3d2hQd"));
  }

  @Test
  public void test_omaha_holdem_9305_3c4d5sJcTh_9c4c7dQh_Qd2cAh2d_Kh5d4hTd() {
    assertEquals(
      "9c4c7dQh Kh5d4hTd Qd2cAh2d",
      Solver.process("omaha-holdem 3c4d5sJcTh 9c4c7dQh Qd2cAh2d Kh5d4hTd"));
  }

  @Test
  public void test_omaha_holdem_9306_4c8cAhKcQd_5h4h6s8h_2h4d3dTc_9d4sThAc_TdKh6c2s_3c5c2dJc_Jd6dAsAd() {
    assertEquals(
      "2h4d3dTc TdKh6c2s 5h4h6s8h 9d4sThAc Jd6dAsAd 3c5c2dJc",
      Solver.process("omaha-holdem 4c8cAhKcQd 5h4h6s8h 2h4d3dTc 9d4sThAc TdKh6c2s 3c5c2dJc Jd6dAsAd"));
  }

  @Test
  public void test_omaha_holdem_9307_9hAhJhKcKd_Kh7sAsQc_4d9s8sJc_9c5d5h6c_2dQhTd7d_Qd8dJs2s_Ks2hAd8c_3h5cTsAc() {
    assertEquals(
      "9c5d5h6c 4d9s8sJc Qd8dJs2s 3h5cTsAc 2dQhTd7d Kh7sAsQc=Ks2hAd8c",
      Solver.process("omaha-holdem 9hAhJhKcKd Kh7sAsQc 4d9s8sJc 9c5d5h6c 2dQhTd7d Qd8dJs2s Ks2hAd8c 3h5cTsAc"));
  }

  @Test
  public void test_omaha_holdem_9308_2h3s7s8sJh_7d6c2cAd_TdAs7hAc() {
    assertEquals(
      "TdAs7hAc 7d6c2cAd",
      Solver.process("omaha-holdem 2h3s7s8sJh 7d6c2cAd TdAs7hAc"));
  }

  @Test
  public void test_omaha_holdem_9309_3hAhJhQsTd_5d6d4d6s_Qd2h9c4c_7h4hAd5h_3sQc5s6c_6h7d9dKc_JdTsKh4s_9sAs9hTh_8c2dKsKd() {
    assertEquals(
      "5d6d4d6s Qd2h9c4c 8c2dKsKd 3sQc5s6c 6h7d9dKc JdTsKh4s 7h4hAd5h 9sAs9hTh",
      Solver.process("omaha-holdem 3hAhJhQsTd 5d6d4d6s Qd2h9c4c 7h4hAd5h 3sQc5s6c 6h7d9dKc JdTsKh4s 9sAs9hTh 8c2dKsKd"));
  }

  @Test
  public void test_omaha_holdem_9310_4c6h7cAhTd_8s2d5cTs_2cJc6s2s_Kd3hQd3d_QcKh9cAc_9s8cJh8d_7s6cTc5s_7dTh9h3s_3cQsJs9d() {
    assertEquals(
      "3cQsJs9d Kd3hQd3d 2cJc6s2s QcKh9cAc 7dTh9h3s=7s6cTc5s 8s2d5cTs 9s8cJh8d",
      Solver.process("omaha-holdem 4c6h7cAhTd 8s2d5cTs 2cJc6s2s Kd3hQd3d QcKh9cAc 9s8cJh8d 7s6cTc5s 7dTh9h3s 3cQsJs9d"));
  }

  @Test
  public void test_omaha_holdem_9311_3d4s7d8dAs_7s9c9sAh_Ks4d6c2c_9hTh8cAc_JhJsKh6s() {
    assertEquals(
      "Ks4d6c2c JhJsKh6s 7s9c9sAh 9hTh8cAc",
      Solver.process("omaha-holdem 3d4s7d8dAs 7s9c9sAh Ks4d6c2c 9hTh8cAc JhJsKh6s"));
  }

  @Test
  public void test_omaha_holdem_9312_7h9sJdQcQd_ThKc7dJs_4sTd2cAs_3c7s5d6d_8c5s4d8d_9c9h3sJc_Ks9d8hKh_6cAc3d2d_7c4c6sQs() {
    assertEquals(
      "6cAc3d2d 4sTd2cAs 3c7s5d6d 8c5s4d8d Ks9d8hKh ThKc7dJs 9c9h3sJc 7c4c6sQs",
      Solver.process("omaha-holdem 7h9sJdQcQd ThKc7dJs 4sTd2cAs 3c7s5d6d 8c5s4d8d 9c9h3sJc Ks9d8hKh 6cAc3d2d 7c4c6sQs"));
  }

  @Test
  public void test_omaha_holdem_9313_2h3d6s7c9h_Ts8dTc5c_4cAdKdKs_8s9s7d6d_Jd3sJc9c_AcAsKc4s_Th8cJs5d_2c2s6cJh() {
    assertEquals(
      "4cAdKdKs AcAsKc4s Jd3sJc9c 8s9s7d6d 2c2s6cJh Th8cJs5d=Ts8dTc5c",
      Solver.process("omaha-holdem 2h3d6s7c9h Ts8dTc5c 4cAdKdKs 8s9s7d6d Jd3sJc9c AcAsKc4s Th8cJs5d 2c2s6cJh"));
  }

  @Test
  public void test_omaha_holdem_9314_4c5s6d7s9d_5hTs2h9s_8s3s6hAd() {
    assertEquals(
      "5hTs2h9s 8s3s6hAd",
      Solver.process("omaha-holdem 4c5s6d7s9d 5hTs2h9s 8s3s6hAd"));
  }

  @Test
  public void test_omaha_holdem_9315_7d8cAdJsKd_9s3h6d3s_5dJc4s5h_6sTh6h9h_7hJdAsQs_8d8s2c6c() {
    assertEquals(
      "9s3h6d3s 5dJc4s5h 7hJdAsQs 8d8s2c6c 6sTh6h9h",
      Solver.process("omaha-holdem 7d8cAdJsKd 9s3h6d3s 5dJc4s5h 6sTh6h9h 7hJdAsQs 8d8s2c6c"));
  }

  @Test
  public void test_omaha_holdem_9316_2h3d5d8d9d_8s6hKhJh_QdJd3sQs_Ts7d3h7s_Qh5h7h6s_Jc9s4sKd() {
    assertEquals(
      "Ts7d3h7s 8s6hKhJh Jc9s4sKd Qh5h7h6s QdJd3sQs",
      Solver.process("omaha-holdem 2h3d5d8d9d 8s6hKhJh QdJd3sQs Ts7d3h7s Qh5h7h6s Jc9s4sKd"));
  }

  @Test
  public void test_omaha_holdem_9317_2h5cAdKhQd_7c5s8c2d_8sJsJh9c_JcTc6cTh_6dAhKcQc_Kd9s4s7s_5hQh4h9d_3s3h4c9h_Td7hTs6h_Ks2s8h5d() {
    assertEquals(
      "Td7hTs6h 8sJsJh9c Kd9s4s7s 7c5s8c2d 5hQh4h9d Ks2s8h5d 6dAhKcQc 3s3h4c9h JcTc6cTh",
      Solver.process("omaha-holdem 2h5cAdKhQd 7c5s8c2d 8sJsJh9c JcTc6cTh 6dAhKcQc Kd9s4s7s 5hQh4h9d 3s3h4c9h Td7hTs6h Ks2s8h5d"));
  }

  @Test
  public void test_omaha_holdem_9318_3c3h5hJdTd_As2cJhJc_6dQs8s9h_Qh4s4cAh_KhJs7sTh_Kc3s4d3d() {
    assertEquals(
      "6dQs8s9h Qh4s4cAh KhJs7sTh As2cJhJc Kc3s4d3d",
      Solver.process("omaha-holdem 3c3h5hJdTd As2cJhJc 6dQs8s9h Qh4s4cAh KhJs7sTh Kc3s4d3d"));
  }

  @Test
  public void test_omaha_holdem_9319_5d9cAhKcTs_KhQd8c6c_4cJsJcKd_2hQh4h3h_6d6sAsTd_8hQs9h2c_7d8d9d3c() {
    assertEquals(
      "2hQh4h3h 7d8d9d3c 8hQs9h2c 4cJsJcKd KhQd8c6c 6d6sAsTd",
      Solver.process("omaha-holdem 5d9cAhKcTs KhQd8c6c 4cJsJcKd 2hQh4h3h 6d6sAsTd 8hQs9h2c 7d8d9d3c"));
  }

  @Test
  public void test_omaha_holdem_9320_2d5h6s8d9s_Td4c5s7h_AhKcQc3c_Js4s2cAd_Jc4d2h7d() {
    assertEquals(
      "AhKcQc3c Js4s2cAd Jc4d2h7d Td4c5s7h",
      Solver.process("omaha-holdem 2d5h6s8d9s Td4c5s7h AhKcQc3c Js4s2cAd Jc4d2h7d"));
  }

  @Test
  public void test_omaha_holdem_9321_3h3s6sKsTs_7c6d6c3c_KhQd5s9s_8d9h7h5h() {
    assertEquals(
      "8d9h7h5h KhQd5s9s 7c6d6c3c",
      Solver.process("omaha-holdem 3h3s6sKsTs 7c6d6c3c KhQd5s9s 8d9h7h5h"));
  }

  @Test
  public void test_omaha_holdem_9322_3h7d8hJhQc_Td9s9dTs_Th5hKd7h_5s9h7sAh_QdKsJd8s_8c7c2hAc_6s3d6d9c_6cTcAdQs_8dKc2sAs_Js2dQh4c() {
    assertEquals(
      "6s3d6d9c 8dKc2sAs 6cTcAdQs 8c7c2hAc Js2dQh4c=QdKsJd8s Td9s9dTs Th5hKd7h 5s9h7sAh",
      Solver.process("omaha-holdem 3h7d8hJhQc Td9s9dTs Th5hKd7h 5s9h7sAh QdKsJd8s 8c7c2hAc 6s3d6d9c 6cTcAdQs 8dKc2sAs Js2dQh4c"));
  }

  @Test
  public void test_omaha_holdem_9323_4s5c7h9sQd_9cTs5sJh_KhAh2c3c_6d6s6c2h() {
    assertEquals(
      "KhAh2c3c 6d6s6c2h 9cTs5sJh",
      Solver.process("omaha-holdem 4s5c7h9sQd 9cTs5sJh KhAh2c3c 6d6s6c2h"));
  }

  @Test
  public void test_omaha_holdem_9324_2hKhKsQdQh_AcAd3d7s_Jd2s2c7h_5d5c3hKd_Qs4d6h5s() {
    assertEquals(
      "AcAd3d7s Qs4d6h5s 5d5c3hKd Jd2s2c7h",
      Solver.process("omaha-holdem 2hKhKsQdQh AcAd3d7s Jd2s2c7h 5d5c3hKd Qs4d6h5s"));
  }

  @Test
  public void test_omaha_holdem_9325_3c4c6dKhKs_8hJd2s7c_8d6h5dJh_9s3s4h4s_5h5c7s3h_Ac2c9dJs_6cQsJcQh_KdAd7dQd_5sAh2h3d() {
    assertEquals(
      "8hJd2s7c Ac2c9dJs 8d6h5dJh 6cQsJcQh KdAd7dQd 5sAh2h3d 5h5c7s3h 9s3s4h4s",
      Solver.process("omaha-holdem 3c4c6dKhKs 8hJd2s7c 8d6h5dJh 9s3s4h4s 5h5c7s3h Ac2c9dJs 6cQsJcQh KdAd7dQd 5sAh2h3d"));
  }

  @Test
  public void test_omaha_holdem_9326_3c8c9hKhQd_7s5c3s6c_7hKcAh8h_5d8s4d2h_3dKs9d7c_9sTs4cJd_Kd5s3hTc_4s6d9cQc_As2s8d2c_QsTh6s5h() {
    assertEquals(
      "7s5c3s6c 5d8s4d2h As2s8d2c QsTh6s5h 4s6d9cQc Kd5s3hTc 7hKcAh8h 3dKs9d7c 9sTs4cJd",
      Solver.process("omaha-holdem 3c8c9hKhQd 7s5c3s6c 7hKcAh8h 5d8s4d2h 3dKs9d7c 9sTs4cJd Kd5s3hTc 4s6d9cQc As2s8d2c QsTh6s5h"));
  }

  @Test
  public void test_omaha_holdem_9327_5h8h9dKcQh_Jc2c7c7h_6dJh2sKs_3dAcQc4c_8c9hThJd_6h6c7s3h_6s8sJs4d_Kd4hTc2h_Kh9cAh9s() {
    assertEquals(
      "Jc2c7c7h 6s8sJs4d 3dAcQc4c 6dJh2sKs Kd4hTc2h 6h6c7s3h 8c9hThJd Kh9cAh9s",
      Solver.process("omaha-holdem 5h8h9dKcQh Jc2c7c7h 6dJh2sKs 3dAcQc4c 8c9hThJd 6h6c7s3h 6s8sJs4d Kd4hTc2h Kh9cAh9s"));
  }

  @Test
  public void test_omaha_holdem_9328_3h7h9sJdQc_ThTdAc2c_3sJc9d2s_2d7c8cQd_TcAd2h8h_5d5hKd4h_Ts9hQsAs_4cJhKhQh_4s6sKc7s_8dJsAh8s() {
    assertEquals(
      "5d5hKd4h 4s6sKc7s ThTdAc2c 8dJsAh8s 3sJc9d2s 2d7c8cQd Ts9hQsAs 4cJhKhQh TcAd2h8h",
      Solver.process("omaha-holdem 3h7h9sJdQc ThTdAc2c 3sJc9d2s 2d7c8cQd TcAd2h8h 5d5hKd4h Ts9hQsAs 4cJhKhQh 4s6sKc7s 8dJsAh8s"));
  }

  @Test
  public void test_omaha_holdem_9329_2h8dJcKhTs_6d3cKd2d_Kc4sKsAc_4d6cQc5h_Jd2s7s5s() {
    assertEquals(
      "4d6cQc5h Jd2s7s5s 6d3cKd2d Kc4sKsAc",
      Solver.process("omaha-holdem 2h8dJcKhTs 6d3cKd2d Kc4sKsAc 4d6cQc5h Jd2s7s5s"));
  }

  @Test
  public void test_omaha_holdem_9330_2d3d5d5hAc_Kc4dJc9s_6h7dJdTd_AsQs9cJh_9h7s9d6d() {
    assertEquals(
      "Kc4dJc9s AsQs9cJh 9h7s9d6d 6h7dJdTd",
      Solver.process("omaha-holdem 2d3d5d5hAc Kc4dJc9s 6h7dJdTd AsQs9cJh 9h7s9d6d"));
  }

  @Test
  public void test_omaha_holdem_9331_4s5d6s7sKs_Ts4d8dJc_7c6hKh8c_Ad2c7dAs_QcQsTdTh_9sQd7h8h() {
    assertEquals(
      "QcQsTdTh Ad2c7dAs 7c6hKh8c=Ts4d8dJc 9sQd7h8h",
      Solver.process("omaha-holdem 4s5d6s7sKs Ts4d8dJc 7c6hKh8c Ad2c7dAs QcQsTdTh 9sQd7h8h"));
  }

  @Test
  public void test_omaha_holdem_9332_2h3c4s5dQd_9cQc6d8h_Kc8sJs3s_KhTcAh9h_JhKs7s2c() {
    assertEquals(
      "KhTcAh9h JhKs7s2c Kc8sJs3s 9cQc6d8h",
      Solver.process("omaha-holdem 2h3c4s5dQd 9cQc6d8h Kc8sJs3s KhTcAh9h JhKs7s2c"));
  }

  @Test
  public void test_omaha_holdem_9333_5s9sAcAhQh_2c4d3dKd_9d8dAdJd_8sKcKs5h_7dQdAs9h_Qs3hTh8c_2s8hTc6d_4c5c7s9c() {
    assertEquals(
      "2s8hTc6d 2c4d3dKd 4c5c7s9c Qs3hTh8c 8sKcKs5h 9d8dAdJd 7dQdAs9h",
      Solver.process("omaha-holdem 5s9sAcAhQh 2c4d3dKd 9d8dAdJd 8sKcKs5h 7dQdAs9h Qs3hTh8c 2s8hTc6d 4c5c7s9c"));
  }

  @Test
  public void test_omaha_holdem_9334_4h4s6sQcTs_QsJd2d8c_Ks8h2c9s() {
    assertEquals(
      "QsJd2d8c Ks8h2c9s",
      Solver.process("omaha-holdem 4h4s6sQcTs QsJd2d8c Ks8h2c9s"));
  }

  @Test
  public void test_omaha_holdem_9335_7dAdAsKdTd_5c8dQd5d_4c4dJs2h() {
    assertEquals(
      "4c4dJs2h 5c8dQd5d",
      Solver.process("omaha-holdem 7dAdAsKdTd 5c8dQd5d 4c4dJs2h"));
  }

  @Test
  public void test_omaha_holdem_9336_3c3s4cKdTc_Td9c3d7c_9sJh6d6h_6s8sTs5h_5sJd7s4h() {
    assertEquals(
      "5sJd7s4h 9sJh6d6h 6s8sTs5h Td9c3d7c",
      Solver.process("omaha-holdem 3c3s4cKdTc Td9c3d7c 9sJh6d6h 6s8sTs5h 5sJd7s4h"));
  }

  @Test
  public void test_omaha_holdem_9337_5d7sKcQdQs_3sAcAh4h_8dJd2c2h() {
    assertEquals(
      "8dJd2c2h 3sAcAh4h",
      Solver.process("omaha-holdem 5d7sKcQdQs 3sAcAh4h 8dJd2c2h"));
  }

  @Test
  public void test_omaha_holdem_9338_2s3c6cQcQs_6dQh7sJh_QdJsAh9s_9d9hKs2h_4dTh7c7d_7h8h3sJd() {
    assertEquals(
      "7h8h3sJd 4dTh7c7d 9d9hKs2h QdJsAh9s 6dQh7sJh",
      Solver.process("omaha-holdem 2s3c6cQcQs 6dQh7sJh QdJsAh9s 9d9hKs2h 4dTh7c7d 7h8h3sJd"));
  }

  @Test
  public void test_omaha_holdem_9339_2s8hJhQdTs_Jd4c9h6c_5cTc2d3d_4s5dKsAs_2hKcAhAd_5sKh7c8d_5h3c2c6d_AcJs9s3s() {
    assertEquals(
      "5h3c2c6d 5sKh7c8d 5cTc2d3d AcJs9s3s=Jd4c9h6c 2hKcAhAd=4s5dKsAs",
      Solver.process("omaha-holdem 2s8hJhQdTs Jd4c9h6c 5cTc2d3d 4s5dKsAs 2hKcAhAd 5sKh7c8d 5h3c2c6d AcJs9s3s"));
  }

  @Test
  public void test_omaha_holdem_9340_3d4c9sJsTc_KdJh5c5h_Qd8cJcKc_6d3c2c9c_8dAhAc4d_QcJd7hTh_6c2sKsQh_QsKhTs8h_9h3s3h2d_7c4s5s5d() {
    assertEquals(
      "7c4s5s5d KdJh5c5h 8dAhAc4d 6d3c2c9c QcJd7hTh 9h3s3h2d 6c2sKsQh=Qd8cJcKc=QsKhTs8h",
      Solver.process("omaha-holdem 3d4c9sJsTc KdJh5c5h Qd8cJcKc 6d3c2c9c 8dAhAc4d QcJd7hTh 6c2sKsQh QsKhTs8h 9h3s3h2d 7c4s5s5d"));
  }

  @Test
  public void test_omaha_holdem_9341_6h8hAdKdTc_2s8s5sQc_Js8dAs2c_7c3s8c3h_7d6cJhJd_9cThKcKs_2h5cTd9h() {
    assertEquals(
      "7c3s8c3h 2s8s5sQc 2h5cTd9h 7d6cJhJd Js8dAs2c 9cThKcKs",
      Solver.process("omaha-holdem 6h8hAdKdTc 2s8s5sQc Js8dAs2c 7c3s8c3h 7d6cJhJd 9cThKcKs 2h5cTd9h"));
  }

  @Test
  public void test_omaha_holdem_9342_2d5dAdQcTd_9d6cJhKs_Ah4cJs7d_Kc5s9h3h_JcTh9s8d_AcJd4h7c_8h9cKh7s_5c6d3d7h_AsQs2hTc_8cTs4s6s() {
    assertEquals(
      "8h9cKh7s Kc5s9h3h 8cTs4s6s JcTh9s8d AcJd4h7c=Ah4cJs7d AsQs2hTc 9d6cJhKs 5c6d3d7h",
      Solver.process("omaha-holdem 2d5dAdQcTd 9d6cJhKs Ah4cJs7d Kc5s9h3h JcTh9s8d AcJd4h7c 8h9cKh7s 5c6d3d7h AsQs2hTc 8cTs4s6s"));
  }

  @Test
  public void test_omaha_holdem_9343_2d3cAcAdKc_2s3d8cTc_4sTd5d6h_Jc5s9sAh_9dKhThQc_6c8d5h7h_2c5cJs4d_7dTsKd2h_Jh7sKs3s() {
    assertEquals(
      "6c8d5h7h 7dTsKd2h Jh7sKs3s 9dKhThQc Jc5s9sAh 4sTd5d6h 2c5cJs4d 2s3d8cTc",
      Solver.process("omaha-holdem 2d3cAcAdKc 2s3d8cTc 4sTd5d6h Jc5s9sAh 9dKhThQc 6c8d5h7h 2c5cJs4d 7dTsKd2h Jh7sKs3s"));
  }

  @Test
  public void test_omaha_holdem_9344_AcJdQhTdTs_QsJs2h9c_3h2sAdTc_9sAh5hKh_3s8s2d8d_Ks5dJc8c_6dTh3cQc() {
    assertEquals(
      "3s8s2d8d QsJs2h9c 9sAh5hKh=Ks5dJc8c 6dTh3cQc 3h2sAdTc",
      Solver.process("omaha-holdem AcJdQhTdTs QsJs2h9c 3h2sAdTc 9sAh5hKh 3s8s2d8d Ks5dJc8c 6dTh3cQc"));
  }

  @Test
  public void test_omaha_holdem_9345_8dKsQhQsTh_3d2sJd4c_3cAhAs2h_9h7sJs5d() {
    assertEquals(
      "3d2sJd4c 3cAhAs2h 9h7sJs5d",
      Solver.process("omaha-holdem 8dKsQhQsTh 3d2sJd4c 3cAhAs2h 9h7sJs5d"));
  }

  @Test
  public void test_omaha_holdem_9346_6cAdAsJdKs_3hKc3s9s_2cQd2h9c_4c3d2dKd_Jc4s4dTs() {
    assertEquals(
      "2cQd2h9c Jc4s4dTs 4c3d2dKd 3hKc3s9s",
      Solver.process("omaha-holdem 6cAdAsJdKs 3hKc3s9s 2cQd2h9c 4c3d2dKd Jc4s4dTs"));
  }

  @Test
  public void test_omaha_holdem_9347_5h6d6sAhQc_7sTc3d4h_4sTs4c3h() {
    assertEquals(
      "7sTc3d4h 4sTs4c3h",
      Solver.process("omaha-holdem 5h6d6sAhQc 7sTc3d4h 4sTs4c3h"));
  }

  @Test
  public void test_omaha_holdem_9348_3s4c5sJsKd_4s9c6h2d_2h5hJd4d_Jh7h5cAd() {
    assertEquals(
      "2h5hJd4d=Jh7h5cAd 4s9c6h2d",
      Solver.process("omaha-holdem 3s4c5sJsKd 4s9c6h2d 2h5hJd4d Jh7h5cAd"));
  }

  @Test
  public void test_omaha_holdem_9349_5h6c8sKsTh_3sTsJc6h_2d9c2h3h() {
    assertEquals(
      "2d9c2h3h 3sTsJc6h",
      Solver.process("omaha-holdem 5h6c8sKsTh 3sTsJc6h 2d9c2h3h"));
  }

  @Test
  public void test_omaha_holdem_9350_2h4s6h8dKc_3dTh7s2c_7hTdTs9h_2s4c7c6c_9c4h7dJh_3hJdKh5d_QhAc5h3s_QdJs5cAd() {
    assertEquals(
      "QdJs5cAd 3dTh7s2c 9c4h7dJh 7hTdTs9h 2s4c7c6c 3hJdKh5d=QhAc5h3s",
      Solver.process("omaha-holdem 2h4s6h8dKc 3dTh7s2c 7hTdTs9h 2s4c7c6c 9c4h7dJh 3hJdKh5d QhAc5h3s QdJs5cAd"));
  }

  @Test
  public void test_omaha_holdem_9351_6d8h9sQhTh_8d7h8s2c_JcTdJd9h_Ah6s5h9d_9c7sKhKs_6h6c3cAd() {
    assertEquals(
      "6h6c3cAd 8d7h8s2c=9c7sKhKs JcTdJd9h Ah6s5h9d",
      Solver.process("omaha-holdem 6d8h9sQhTh 8d7h8s2c JcTdJd9h Ah6s5h9d 9c7sKhKs 6h6c3cAd"));
  }

  @Test
  public void test_omaha_holdem_9352_3c6h6s7dQh_7sKsAh9s_JsQc5h5c_7h3hAdAs_4cJh2cTd_3d8s9h2d_4s8d4h7c_4dAc8h6c() {
    assertEquals(
      "4cJh2cTd 3d8s9h2d 4s8d4h7c 7sKsAh9s JsQc5h5c 7h3hAdAs 4dAc8h6c",
      Solver.process("omaha-holdem 3c6h6s7dQh 7sKsAh9s JsQc5h5c 7h3hAdAs 4cJh2cTd 3d8s9h2d 4s8d4h7c 4dAc8h6c"));
  }

  @Test
  public void test_omaha_holdem_9353_3d6c8h9dQs_9s4d3s4s_As4h2c8s_5dTdQcJs_JcJh6s8d_6dTc7sJd_5s5hQhKc_KdTs2dKs() {
    assertEquals(
      "As4h2c8s 5s5hQhKc KdTs2dKs JcJh6s8d 9s4d3s4s 5dTdQcJs=6dTc7sJd",
      Solver.process("omaha-holdem 3d6c8h9dQs 9s4d3s4s As4h2c8s 5dTdQcJs JcJh6s8d 6dTc7sJd 5s5hQhKc KdTs2dKs"));
  }

  @Test
  public void test_omaha_holdem_9354_3h6c7hKdQc_TsJh9c3d_Td7sQdTh() {
    assertEquals(
      "TsJh9c3d Td7sQdTh",
      Solver.process("omaha-holdem 3h6c7hKdQc TsJh9c3d Td7sQdTh"));
  }

  @Test
  public void test_omaha_holdem_9355_3h4d5s7hAd_KsAs4h5d_2cAh2h9s_9h8d2s2d_6c9d3d9c_5hTd6h6d_Js5cQh8h_Qd3cAc4c() {
    assertEquals(
      "9h8d2s2d Js5cQh8h Qd3cAc4c KsAs4h5d 2cAh2h9s 5hTd6h6d=6c9d3d9c",
      Solver.process("omaha-holdem 3h4d5s7hAd KsAs4h5d 2cAh2h9s 9h8d2s2d 6c9d3d9c 5hTd6h6d Js5cQh8h Qd3cAc4c"));
  }

  @Test
  public void test_omaha_holdem_9356_9h9sAsJhQs_Kh8d5h7c_4dAd2h5c_3sKc6s5s_6cTc2s4h_8c7h8s7s_Qh3cQcKd() {
    assertEquals(
      "6cTc2s4h Kh8d5h7c 4dAd2h5c 3sKc6s5s 8c7h8s7s Qh3cQcKd",
      Solver.process("omaha-holdem 9h9sAsJhQs Kh8d5h7c 4dAd2h5c 3sKc6s5s 6cTc2s4h 8c7h8s7s Qh3cQcKd"));
  }

  @Test
  public void test_omaha_holdem_9357_5hAcAsThTs_4c8hKs5d_2h4d9c2s_9d2d6hTd_Jd6c3sQh_Kh7c6d7d() {
    assertEquals(
      "Jd6c3sQh 2h4d9c2s 4c8hKs5d Kh7c6d7d 9d2d6hTd",
      Solver.process("omaha-holdem 5hAcAsThTs 4c8hKs5d 2h4d9c2s 9d2d6hTd Jd6c3sQh Kh7c6d7d"));
  }

  @Test
  public void test_omaha_holdem_9358_4d6h7dAsJc_3cQdTd6c_2sQhKsJh_6s3dQc9s_8cAd3s6d_7sKh5dAc_3h8d4h2c() {
    assertEquals(
      "3h8d4h2c 3cQdTd6c=6s3dQc9s 2sQhKsJh 8cAd3s6d 7sKh5dAc",
      Solver.process("omaha-holdem 4d6h7dAsJc 3cQdTd6c 2sQhKsJh 6s3dQc9s 8cAd3s6d 7sKh5dAc 3h8d4h2c"));
  }

  @Test
  public void test_omaha_holdem_9359_2s4sKdKhTh_2hQh6h2c_8cJc3d4c_Jd9sJs8d() {
    assertEquals(
      "8cJc3d4c Jd9sJs8d 2hQh6h2c",
      Solver.process("omaha-holdem 2s4sKdKhTh 2hQh6h2c 8cJc3d4c Jd9sJs8d"));
  }

  @Test
  public void test_omaha_holdem_9360_3d4h5c5d8d_Ad4s8hKd_2cJs6sTh_KsQdQc4c() {
    assertEquals(
      "KsQdQc4c 2cJs6sTh Ad4s8hKd",
      Solver.process("omaha-holdem 3d4h5c5d8d Ad4s8hKd 2cJs6sTh KsQdQc4c"));
  }

  @Test
  public void test_omaha_holdem_9361_3d9cAhKhQs_AdTh9s8d_4h9d2cJs_3h4c7s5d_AsTc8h6c_2dJhTdKd() {
    assertEquals(
      "3h4c7s5d 4h9d2cJs AsTc8h6c AdTh9s8d 2dJhTdKd",
      Solver.process("omaha-holdem 3d9cAhKhQs AdTh9s8d 4h9d2cJs 3h4c7s5d AsTc8h6c 2dJhTdKd"));
  }

  @Test
  public void test_omaha_holdem_9362_2h3d3h8dJd_Tc7h7s3s_Td8cJc2s_5s9h5d4c_Ad9c8s3c_7dQc2c6c_Ah9s5cQs() {
    assertEquals(
      "Ah9s5cQs 7dQc2c6c 5s9h5d4c Td8cJc2s Tc7h7s3s Ad9c8s3c",
      Solver.process("omaha-holdem 2h3d3h8dJd Tc7h7s3s Td8cJc2s 5s9h5d4c Ad9c8s3c 7dQc2c6c Ah9s5cQs"));
  }

  @Test
  public void test_omaha_holdem_9363_4c4d6d6h7h_ThQsQh7d_JsAh3sTd_8s5s3hTc() {
    assertEquals(
      "JsAh3sTd ThQsQh7d 8s5s3hTc",
      Solver.process("omaha-holdem 4c4d6d6h7h ThQsQh7d JsAh3sTd 8s5s3hTc"));
  }

  @Test
  public void test_omaha_holdem_9364_2h3s4d6d8h_7c5hTc4c_5c4s8d9c_Kc8s7sTd_9h7hQs2s() {
    assertEquals(
      "9h7hQs2s Kc8s7sTd 5c4s8d9c 7c5hTc4c",
      Solver.process("omaha-holdem 2h3s4d6d8h 7c5hTc4c 5c4s8d9c Kc8s7sTd 9h7hQs2s"));
  }

  @Test
  public void test_omaha_holdem_9365_2c3h6s9cJd_2s3c4c3s_9dAh9h2d() {
    assertEquals(
      "2s3c4c3s 9dAh9h2d",
      Solver.process("omaha-holdem 2c3h6s9cJd 2s3c4c3s 9dAh9h2d"));
  }

  @Test
  public void test_omaha_holdem_9366_8h8s9c9dQs_8d6d5dAs_JsKhTc3h_5h2dJhKd_Ts4cAdKs_Th9h3dKc_7d4d4h3c_6s7h6c6h_AcTd2c5c_Qh2s7c2h() {
    assertEquals(
      "5h2dJhKd AcTd2c5c Ts4cAdKs 7d4d4h3c 6s7h6c6h Qh2s7c2h 8d6d5dAs Th9h3dKc JsKhTc3h",
      Solver.process("omaha-holdem 8h8s9c9dQs 8d6d5dAs JsKhTc3h 5h2dJhKd Ts4cAdKs Th9h3dKc 7d4d4h3c 6s7h6c6h AcTd2c5c Qh2s7c2h"));
  }

  @Test
  public void test_omaha_holdem_9367_4c4d5s8hJh_Js4h3c6h_9h3dAd9d_7h5c7cTc_2c7sQs2d_AsJdKsKd() {
    assertEquals(
      "2c7sQs2d 7h5c7cTc 9h3dAd9d AsJdKsKd Js4h3c6h",
      Solver.process("omaha-holdem 4c4d5s8hJh Js4h3c6h 9h3dAd9d 7h5c7cTc 2c7sQs2d AsJdKsKd"));
  }

  @Test
  public void test_omaha_holdem_9368_4c4s8cQhTd_8sAdQd6s_5s5hQsAc_Tc7c9d8d_JcKh9h9s_2h4h5cJd_Ah6dQc7h_6c6hTsKd() {
    assertEquals(
      "6c6hTsKd Tc7c9d8d 5s5hQsAc=Ah6dQc7h 8sAdQd6s 2h4h5cJd JcKh9h9s",
      Solver.process("omaha-holdem 4c4s8cQhTd 8sAdQd6s 5s5hQsAc Tc7c9d8d JcKh9h9s 2h4h5cJd Ah6dQc7h 6c6hTsKd"));
  }

  @Test
  public void test_omaha_holdem_9369_2s5h7h9sAh_5cKcQdTd_Ac3sKdKs_Ad9h8s8h_TcAsJsJc_2h4hKhJd_Th2c7c3c_5d6d2dQs_7d7s9d3h() {
    assertEquals(
      "5cKcQdTd TcAsJsJc Ac3sKdKs 5d6d2dQs Th2c7c3c 7d7s9d3h Ad9h8s8h 2h4hKhJd",
      Solver.process("omaha-holdem 2s5h7h9sAh 5cKcQdTd Ac3sKdKs Ad9h8s8h TcAsJsJc 2h4hKhJd Th2c7c3c 5d6d2dQs 7d7s9d3h"));
  }

  @Test
  public void test_omaha_holdem_9370_4c6c9dAcQc_5h3d4d4s_3s8c7hAs_2sKdJhTh_Ks7dJc5s_3h5c8h6h_Ad2h2c4h_2dQhAhJd_Tc9h8s9s_KcKh7cQs() {
    assertEquals(
      "2sKdJhTh=Ks7dJc5s 3h5c8h6h 3s8c7hAs Ad2h2c4h 2dQhAhJd 5h3d4d4s Tc9h8s9s KcKh7cQs",
      Solver.process("omaha-holdem 4c6c9dAcQc 5h3d4d4s 3s8c7hAs 2sKdJhTh Ks7dJc5s 3h5c8h6h Ad2h2c4h 2dQhAhJd Tc9h8s9s KcKh7cQs"));
  }

  @Test
  public void test_omaha_holdem_9371_2s4h5d6sQh_QsTdKc6d_5cJdKs8h() {
    assertEquals(
      "5cJdKs8h QsTdKc6d",
      Solver.process("omaha-holdem 2s4h5d6sQh QsTdKc6d 5cJdKs8h"));
  }

  @Test
  public void test_omaha_holdem_9372_5c5d8sAcKh_Qd3d4cKc_6d5s9s7s_9d7d9h3h_KsQsJd6h() {
    assertEquals(
      "9d7d9h3h KsQsJd6h=Qd3d4cKc 6d5s9s7s",
      Solver.process("omaha-holdem 5c5d8sAcKh Qd3d4cKc 6d5s9s7s 9d7d9h3h KsQsJd6h"));
  }

  @Test
  public void test_omaha_holdem_9373_5c7s9dJdKs_2d8c3d5h_4d2sQsAh_8d4sThQh_7d8sQd2c_7cKhAs3h_6hTd8h4c_Jc7hTsJh() {
    assertEquals(
      "4d2sQsAh 2d8c3d5h 7d8sQd2c 7cKhAs3h Jc7hTsJh 6hTd8h4c 8d4sThQh",
      Solver.process("omaha-holdem 5c7s9dJdKs 2d8c3d5h 4d2sQsAh 8d4sThQh 7d8sQd2c 7cKhAs3h 6hTd8h4c Jc7hTsJh"));
  }

  @Test
  public void test_omaha_holdem_9374_2dJcJsKsTd_ThAd6dQd_7h3hTs7s_2h8s9d8d_3sKc6hQh_2c7dJhAh_QcAcKh3c_6sAsTc5h_3d4s7c5d() {
    assertEquals(
      "3d4s7c5d 2h8s9d8d 7h3hTs7s 6sAsTc5h 3sKc6hQh QcAcKh3c=ThAd6dQd 2c7dJhAh",
      Solver.process("omaha-holdem 2dJcJsKsTd ThAd6dQd 7h3hTs7s 2h8s9d8d 3sKc6hQh 2c7dJhAh QcAcKh3c 6sAsTc5h 3d4s7c5d"));
  }

  @Test
  public void test_omaha_holdem_9375_7c8sAdJsTs_2d4s5s2c_9c5d3sAc_2s9d3h7s_6cQh4h8d_Ks2hAh5c_TdJdQdTh_7d9s8hQs_6s4dKhKc() {
    assertEquals(
      "6cQh4h8d 6s4dKhKc 9c5d3sAc Ks2hAh5c TdJdQdTh 2d4s5s2c 2s9d3h7s 7d9s8hQs",
      Solver.process("omaha-holdem 7c8sAdJsTs 2d4s5s2c 9c5d3sAc 2s9d3h7s 6cQh4h8d Ks2hAh5c TdJdQdTh 7d9s8hQs 6s4dKhKc"));
  }

  @Test
  public void test_omaha_holdem_9376_6d7sAdJsTc_Jd3h4d2d_Ts2c2h7h_3s6hQc4s_Qd5hKhKc_As5c6s5d_6cJh3c8s_Td4c5s4h_Ac7d2s7c() {
    assertEquals(
      "3s6hQc4s Td4c5s4h Jd3h4d2d Ts2c2h7h 6cJh3c8s As5c6s5d Ac7d2s7c Qd5hKhKc",
      Solver.process("omaha-holdem 6d7sAdJsTc Jd3h4d2d Ts2c2h7h 3s6hQc4s Qd5hKhKc As5c6s5d 6cJh3c8s Td4c5s4h Ac7d2s7c"));
  }

  @Test
  public void test_omaha_holdem_9377_4h7c7s9h9s_5h6s7h3s_5dJs3c9c_Jd4s8d2s_3dAh2cKd() {
    assertEquals(
      "3dAh2cKd Jd4s8d2s 5h6s7h3s 5dJs3c9c",
      Solver.process("omaha-holdem 4h7c7s9h9s 5h6s7h3s 5dJs3c9c Jd4s8d2s 3dAh2cKd"));
  }

  @Test
  public void test_omaha_holdem_9378_5s9dJhJsTd_7h2hQhAh_6cJd4s8d_9sTsKh8s_As6h8c3h_KsQdQs5c_QcTc6s3c() {
    assertEquals(
      "As6h8c3h 7h2hQhAh QcTc6s3c 9sTsKh8s 6cJd4s8d KsQdQs5c",
      Solver.process("omaha-holdem 5s9dJhJsTd 7h2hQhAh 6cJd4s8d 9sTsKh8s As6h8c3h KsQdQs5c QcTc6s3c"));
  }

  @Test
  public void test_omaha_holdem_9379_2h2s3h4s6h_7cJs7hJd_8h6s8dKs_Jc3d4hQc_AhTc2cAd_3c4dTd2d_5c5hQh9c_8s4cAsTs() {
    assertEquals(
      "8s4cAsTs Jc3d4hQc 8h6s8dKs 7cJs7hJd AhTc2cAd 5c5hQh9c 3c4dTd2d",
      Solver.process("omaha-holdem 2h2s3h4s6h 7cJs7hJd 8h6s8dKs Jc3d4hQc AhTc2cAd 3c4dTd2d 5c5hQh9c 8s4cAsTs"));
  }

  @Test
  public void test_omaha_holdem_9380_3s7cAcJhQc_5c4h5dTs_3hAs6d8d_Tc2c3dAh() {
    assertEquals(
      "5c4h5dTs 3hAs6d8d Tc2c3dAh",
      Solver.process("omaha-holdem 3s7cAcJhQc 5c4h5dTs 3hAs6d8d Tc2c3dAh"));
  }

  @Test
  public void test_omaha_holdem_9381_6d7cJsQsTd_6cQh4c5c_Ts2cKs8s_6hAdTc7h_5sAc9sQc_6sJhKc2s_4d4hJd8h_KdJcQd2h() {
    assertEquals(
      "Ts2cKs8s 4d4hJd8h 5sAc9sQc 6hAdTc7h 6sJhKc2s 6cQh4c5c KdJcQd2h",
      Solver.process("omaha-holdem 6d7cJsQsTd 6cQh4c5c Ts2cKs8s 6hAdTc7h 5sAc9sQc 6sJhKc2s 4d4hJd8h KdJcQd2h"));
  }

  @Test
  public void test_omaha_holdem_9382_3c6d7sAsQc_7d4h3h4d_3s6sAd8c_9cQdKs2d_9dTdQsKh_6h8h9h5h_7c2s8sJs() {
    assertEquals(
      "6h8h9h5h 7c2s8sJs 9cQdKs2d=9dTdQsKh 7d4h3h4d 3s6sAd8c",
      Solver.process("omaha-holdem 3c6d7sAsQc 7d4h3h4d 3s6sAd8c 9cQdKs2d 9dTdQsKh 6h8h9h5h 7c2s8sJs"));
  }

  @Test
  public void test_omaha_holdem_9383_2h6h9hJhQs_8c9cJsQd_7d9d5cAs_5sTsKd6c_4cTcAd2d_Td7h2sTh_Kc5h6d7c_7s9s2c8s() {
    assertEquals(
      "4cTcAd2d Kc5h6d7c 7d9d5cAs 7s9s2c8s 8c9cJsQd 5sTsKd6c Td7h2sTh",
      Solver.process("omaha-holdem 2h6h9hJhQs 8c9cJsQd 7d9d5cAs 5sTsKd6c 4cTcAd2d Td7h2sTh Kc5h6d7c 7s9s2c8s"));
  }

  @Test
  public void test_omaha_holdem_9384_2h9d9sAcAd_6d3h3s4s_Th8h7c6h_Qd7hTsTd_Qs8d4c5d_6c6s7sKd_Kc2d4h5c() {
    assertEquals(
      "Th8h7c6h Qs8d4c5d Kc2d4h5c 6d3h3s4s 6c6s7sKd Qd7hTsTd",
      Solver.process("omaha-holdem 2h9d9sAcAd 6d3h3s4s Th8h7c6h Qd7hTsTd Qs8d4c5d 6c6s7sKd Kc2d4h5c"));
  }

  @Test
  public void test_omaha_holdem_9385_3h7c7hJhTc_Ts4s2s9h_JsAs6sJc_5c3s4hQh_7s6cTh3c_Kc9d5dKh_7d2hQdAc_9cTdAhQc() {
    assertEquals(
      "Ts4s2s9h 9cTdAhQc Kc9d5dKh 7d2hQdAc 5c3s4hQh 7s6cTh3c JsAs6sJc",
      Solver.process("omaha-holdem 3h7c7hJhTc Ts4s2s9h JsAs6sJc 5c3s4hQh 7s6cTh3c Kc9d5dKh 7d2hQdAc 9cTdAhQc"));
  }

  @Test
  public void test_omaha_holdem_9386_3d6dJhKcQd_2h4c2d4s_9cAcJc3s() {
    assertEquals(
      "2h4c2d4s 9cAcJc3s",
      Solver.process("omaha-holdem 3d6dJhKcQd 2h4c2d4s 9cAcJc3s"));
  }

  @Test
  public void test_omaha_holdem_9387_4h7sJhKdTh_5sQh6hTc_4d5h9sAd() {
    assertEquals(
      "4d5h9sAd 5sQh6hTc",
      Solver.process("omaha-holdem 4h7sJhKdTh 5sQh6hTc 4d5h9sAd"));
  }

  @Test
  public void test_omaha_holdem_9388_2c2s5cKsQh_6h7d3c8c_6c7cTh8d_2h6sQcJc_Ad9s8hAc_7h9d5sQs_JdTc4cTs_Jh5hTd3s_4sKcAhQd() {
    assertEquals(
      "6h7d3c8c 6c7cTh8d Jh5hTd3s JdTc4cTs 7h9d5sQs 4sKcAhQd Ad9s8hAc 2h6sQcJc",
      Solver.process("omaha-holdem 2c2s5cKsQh 6h7d3c8c 6c7cTh8d 2h6sQcJc Ad9s8hAc 7h9d5sQs JdTc4cTs Jh5hTd3s 4sKcAhQd"));
  }

  @Test
  public void test_omaha_holdem_9389_3c5c9cKcTc_8s5hQs3s_Ah8c2d4h_Qh7d9h2h_6c2c7sJs_Kd3h9d2s_As4sJhJc_8d5dQdTd() {
    assertEquals(
      "Ah8c2d4h Qh7d9h2h As4sJhJc 8s5hQs3s 8d5dQdTd Kd3h9d2s 6c2c7sJs",
      Solver.process("omaha-holdem 3c5c9cKcTc 8s5hQs3s Ah8c2d4h Qh7d9h2h 6c2c7sJs Kd3h9d2s As4sJhJc 8d5dQdTd"));
  }

  @Test
  public void test_omaha_holdem_9390_3c5s9cAdJh_TcKdQh6d_5dQd2d9s_4hJc8s9h_Kc6c7d2c_9d8c7cTh_Kh3d2s8h_Qc4s8d6h() {
    assertEquals(
      "Qc4s8d6h Kc6c7d2c TcKdQh6d Kh3d2s8h 9d8c7cTh 5dQd2d9s 4hJc8s9h",
      Solver.process("omaha-holdem 3c5s9cAdJh TcKdQh6d 5dQd2d9s 4hJc8s9h Kc6c7d2c 9d8c7cTh Kh3d2s8h Qc4s8d6h"));
  }

  @Test
  public void test_omaha_holdem_9391_2h2s3d4c9s_QsJcAdJd_9cTdQd6d_2cJs9h8c_4d4hKs3h_Kc8sTh5c_3c7h2d6h_6sAcQcTs() {
    assertEquals(
      "Kc8sTh5c 6sAcQcTs 9cTdQd6d QsJcAdJd 3c7h2d6h 2cJs9h8c 4d4hKs3h",
      Solver.process("omaha-holdem 2h2s3d4c9s QsJcAdJd 9cTdQd6d 2cJs9h8c 4d4hKs3h Kc8sTh5c 3c7h2d6h 6sAcQcTs"));
  }

  @Test
  public void test_omaha_holdem_9392_3c6s7dJdTs_AdJh4hKh_QdTcAc5h_8d7c5c7h_5d4sJsQc() {
    assertEquals(
      "QdTcAc5h AdJh4hKh 8d7c5c7h 5d4sJsQc",
      Solver.process("omaha-holdem 3c6s7dJdTs AdJh4hKh QdTcAc5h 8d7c5c7h 5d4sJsQc"));
  }

  @Test
  public void test_omaha_holdem_9393_4c5d7h9cTh_Js5h6d8s_7s6c6h3d_5cKh9s5s_4sAdAh8h() {
    assertEquals(
      "4sAdAh8h 5cKh9s5s 7s6c6h3d Js5h6d8s",
      Solver.process("omaha-holdem 4c5d7h9cTh Js5h6d8s 7s6c6h3d 5cKh9s5s 4sAdAh8h"));
  }

  @Test
  public void test_omaha_holdem_9394_2d3d4h7sJc_3h8sTsTh_Js8h8c5c_JhAh3s9d_6c5h2s8d_4c3c9cKc_7cTdKd4d() {
    assertEquals(
      "3h8sTsTh Js8h8c5c 4c3c9cKc 7cTdKd4d JhAh3s9d 6c5h2s8d",
      Solver.process("omaha-holdem 2d3d4h7sJc 3h8sTsTh Js8h8c5c JhAh3s9d 6c5h2s8d 4c3c9cKc 7cTdKd4d"));
  }

  @Test
  public void test_omaha_holdem_9395_2d3c6s9sAs_2h7hTc4c_9c8c2s7d_Ad5cJsTd_Jh3sQsQh() {
    assertEquals(
      "2h7hTc4c Ad5cJsTd 9c8c2s7d Jh3sQsQh",
      Solver.process("omaha-holdem 2d3c6s9sAs 2h7hTc4c 9c8c2s7d Ad5cJsTd Jh3sQsQh"));
  }

  @Test
  public void test_omaha_holdem_9396_8sAhJdThTs_6hKh8c4s_6c7dQdKd_2d7hTcQh() {
    assertEquals(
      "6hKh8c4s 2d7hTcQh 6c7dQdKd",
      Solver.process("omaha-holdem 8sAhJdThTs 6hKh8c4s 6c7dQdKd 2d7hTcQh"));
  }

  @Test
  public void test_omaha_holdem_9397_4h6sJdJhTc_8h5cAh7c_Th4c3cKs_KhQh7s3d_9h8c8sJc_6dKc4d4s_8d7h3s5d() {
    assertEquals(
      "8d7h3s5d KhQh7s3d 8h5cAh7c Th4c3cKs 9h8c8sJc 6dKc4d4s",
      Solver.process("omaha-holdem 4h6sJdJhTc 8h5cAh7c Th4c3cKs KhQh7s3d 9h8c8sJc 6dKc4d4s 8d7h3s5d"));
  }

  @Test
  public void test_omaha_holdem_9398_4hAsJdJsTs_6s6cQs6d_9dKsTdKd() {
    assertEquals(
      "9dKsTdKd 6s6cQs6d",
      Solver.process("omaha-holdem 4hAsJdJsTs 6s6cQs6d 9dKsTdKd"));
  }

  @Test
  public void test_omaha_holdem_9399_6c6s7c9cQs_8dKhQc5h_3sThAc8h_9sQd7sKd_Ts5sQhTd_9h2dJdAh_KsAs2hKc() {
    assertEquals(
      "9h2dJdAh Ts5sQhTd 9sQd7sKd KsAs2hKc 8dKhQc5h 3sThAc8h",
      Solver.process("omaha-holdem 6c6s7c9cQs 8dKhQc5h 3sThAc8h 9sQd7sKd Ts5sQhTd 9h2dJdAh KsAs2hKc"));
  }

  @Test
  public void test_omaha_holdem_9400_3s4c6sAdKs_AcKhJsJd_As5c3d5s_7c6h2h9h_5h4d3cTh_8s8cJhQc() {
    assertEquals(
      "7c6h2h9h 8s8cJhQc 5h4d3cTh AcKhJsJd As5c3d5s",
      Solver.process("omaha-holdem 3s4c6sAdKs AcKhJsJd As5c3d5s 7c6h2h9h 5h4d3cTh 8s8cJhQc"));
  }

  @Test
  public void test_omaha_holdem_9401_4c5d9dJsKh_8sJd7c3h_4s3cJh9c_Th7s3sAs() {
    assertEquals(
      "Th7s3sAs 8sJd7c3h 4s3cJh9c",
      Solver.process("omaha-holdem 4c5d9dJsKh 8sJd7c3h 4s3cJh9c Th7s3sAs"));
  }

  @Test
  public void test_omaha_holdem_9402_3h5h7cAdAh_3s7h3dTd_As3cQh7d_5sJc8hKs() {
    assertEquals(
      "5sJc8hKs 3s7h3dTd As3cQh7d",
      Solver.process("omaha-holdem 3h5h7cAdAh 3s7h3dTd As3cQh7d 5sJc8hKs"));
  }

  @Test
  public void test_omaha_holdem_9403_4s5d9hAdJh_9sQhKd6h_6s6d2sTh_4dQdKhTs() {
    assertEquals(
      "4dQdKhTs 6s6d2sTh 9sQhKd6h",
      Solver.process("omaha-holdem 4s5d9hAdJh 9sQhKd6h 6s6d2sTh 4dQdKhTs"));
  }

  @Test
  public void test_omaha_holdem_9404_6c8d9cJhKh_7s3c6sJs_2sQc7c4s_5hTd6h8h_As7dThJd_3sKsKc7h_4c4d9s2h_TcQd9dJc_Ac5cAd3h() {
    assertEquals(
      "2sQc7c4s 4c4d9s2h Ac5cAd3h 5hTd6h8h 7s3c6sJs 3sKsKc7h As7dThJd TcQd9dJc",
      Solver.process("omaha-holdem 6c8d9cJhKh 7s3c6sJs 2sQc7c4s 5hTd6h8h As7dThJd 3sKsKc7h 4c4d9s2h TcQd9dJc Ac5cAd3h"));
  }

  @Test
  public void test_omaha_holdem_9405_2c2d5c7sJc_5sJsJh5h_3c3sTdQc_7d4c2h4d_Jd8c9hQd_6dTs7c6c_KhKsQs9s() {
    assertEquals(
      "Jd8c9hQd KhKsQs9s 6dTs7c6c 3c3sTdQc 7d4c2h4d 5sJsJh5h",
      Solver.process("omaha-holdem 2c2d5c7sJc 5sJsJh5h 3c3sTdQc 7d4c2h4d Jd8c9hQd 6dTs7c6c KhKsQs9s"));
  }

  @Test
  public void test_omaha_holdem_9406_3d4s7c9dKs_8s3c2d5d_2s4d3h8d_Kc6dQhJc_Js9sQdKd() {
    assertEquals(
      "8s3c2d5d Kc6dQhJc 2s4d3h8d Js9sQdKd",
      Solver.process("omaha-holdem 3d4s7c9dKs 8s3c2d5d 2s4d3h8d Kc6dQhJc Js9sQdKd"));
  }

  @Test
  public void test_omaha_holdem_9407_2d3c6cTcTh_6d8d4h9d_AsKcQs4c_Qh3d2s5h_Jd2hQcJh_7hTsJc4s_8s5dKdJs() {
    assertEquals(
      "8s5dKdJs Qh3d2s5h 6d8d4h9d Jd2hQcJh 7hTsJc4s AsKcQs4c",
      Solver.process("omaha-holdem 2d3c6cTcTh 6d8d4h9d AsKcQs4c Qh3d2s5h Jd2hQcJh 7hTsJc4s 8s5dKdJs"));
  }

  @Test
  public void test_omaha_holdem_9408_3h9sJcKcTc_4cAd5d7h_2s9hJd8d_Kh6h2d2h_Qd8sQsAh_Th6d3cJh_9cKs3s9d_KdTsQcAc() {
    assertEquals(
      "4cAd5d7h Kh6h2d2h 2s9hJd8d Th6d3cJh 9cKs3s9d Qd8sQsAh KdTsQcAc",
      Solver.process("omaha-holdem 3h9sJcKcTc 4cAd5d7h 2s9hJd8d Kh6h2d2h Qd8sQsAh Th6d3cJh 9cKs3s9d KdTsQcAc"));
  }

  @Test
  public void test_omaha_holdem_9409_2c6s7s8c8h_Td3s3c9c_8d6hKh2s_7dTsTc9s() {
    assertEquals(
      "7dTsTc9s=Td3s3c9c 8d6hKh2s",
      Solver.process("omaha-holdem 2c6s7s8c8h Td3s3c9c 8d6hKh2s 7dTsTc9s"));
  }

  @Test
  public void test_omaha_holdem_9410_3c6d8hAhKc_2cQcQhJd_3d8cJc6s_7cQs8s6c_7h9c8d4c_As9sAd2d_Js5d4s7s_JhKsQd5s_Ac4d5cTs() {
    assertEquals(
      "Js5d4s7s 7h9c8d4c 2cQcQhJd JhKsQd5s Ac4d5cTs 3d8cJc6s=7cQs8s6c As9sAd2d",
      Solver.process("omaha-holdem 3c6d8hAhKc 2cQcQhJd 3d8cJc6s 7cQs8s6c 7h9c8d4c As9sAd2d Js5d4s7s JhKsQd5s Ac4d5cTs"));
  }

  @Test
  public void test_omaha_holdem_9411_5c9cAdAsKh_Ks2c6h5s_3s8s3cKd_Kc2h2s2d_AhQhQs4s_ThJc3hQc() {
    assertEquals(
      "ThJc3hQc Kc2h2s2d Ks2c6h5s 3s8s3cKd AhQhQs4s",
      Solver.process("omaha-holdem 5c9cAdAsKh Ks2c6h5s 3s8s3cKd Kc2h2s2d AhQhQs4s ThJc3hQc"));
  }

  @Test
  public void test_omaha_holdem_9412_9sAsKsQcTs_7sTd6c4s_JdAc4h3s_6d7d5cTc() {
    assertEquals(
      "6d7d5cTc JdAc4h3s 7sTd6c4s",
      Solver.process("omaha-holdem 9sAsKsQcTs 7sTd6c4s JdAc4h3s 6d7d5cTc"));
  }

  @Test
  public void test_omaha_holdem_9413_2s5d9dAsJs_Jd8h2dTs_6sAdQcTh_Jc8c5sTc() {
    assertEquals(
      "6sAdQcTh Jd8h2dTs Jc8c5sTc",
      Solver.process("omaha-holdem 2s5d9dAsJs Jd8h2dTs 6sAdQcTh Jc8c5sTc"));
  }

  @Test
  public void test_omaha_holdem_9414_3c3h9hJcQc_6hTh8s9d_Jd2dQs7c_7h4s2hJh_TsAs4cAh_9c9s5c7s_Kc4d8c4h_3s6dKh5s() {
    assertEquals(
      "7h4s2hJh Jd2dQs7c TsAs4cAh 3s6dKh5s 6hTh8s9d Kc4d8c4h 9c9s5c7s",
      Solver.process("omaha-holdem 3c3h9hJcQc 6hTh8s9d Jd2dQs7c 7h4s2hJh TsAs4cAh 9c9s5c7s Kc4d8c4h 3s6dKh5s"));
  }

  @Test
  public void test_omaha_holdem_9415_3h4s6d7cJh_2c9dQd3s_2s3dAh3c_5hKs8hTd_5dJsQhKd_Tc7d5c4d_KhJc4cKc() {
    assertEquals(
      "2c9dQd3s 5dJsQhKd KhJc4cKc 2s3dAh3c Tc7d5c4d 5hKs8hTd",
      Solver.process("omaha-holdem 3h4s6d7cJh 2c9dQd3s 2s3dAh3c 5hKs8hTd 5dJsQhKd Tc7d5c4d KhJc4cKc"));
  }

  @Test
  public void test_omaha_holdem_9416_2s4c9d9sJc_3c2hTh6s_8s4h5hKc() {
    assertEquals(
      "3c2hTh6s 8s4h5hKc",
      Solver.process("omaha-holdem 2s4c9d9sJc 3c2hTh6s 8s4h5hKc"));
  }

  @Test
  public void test_omaha_holdem_9417_3h5s8d9hQs_3d3s7s8h_6hJd2c3c_As9c6s6c_ThTdJsKs_KcJcAhAc() {
    assertEquals(
      "6hJd2c3c As9c6s6c KcJcAhAc 3d3s7s8h ThTdJsKs",
      Solver.process("omaha-holdem 3h5s8d9hQs 3d3s7s8h 6hJd2c3c As9c6s6c ThTdJsKs KcJcAhAc"));
  }

  @Test
  public void test_omaha_holdem_9418_4d9sAcAhKc_5c9h4hJh_5s8h9c9d_2c3sQcQh_Js7c7dJc_8cQd7s7h_2dKdAsTc() {
    assertEquals(
      "8cQd7s7h 5c9h4hJh Js7c7dJc 2c3sQcQh 5s8h9c9d 2dKdAsTc",
      Solver.process("omaha-holdem 4d9sAcAhKc 5c9h4hJh 5s8h9c9d 2c3sQcQh Js7c7dJc 8cQd7s7h 2dKdAsTc"));
  }

  @Test
  public void test_omaha_holdem_9419_2h3h4c6hJc_Kc7cJh3c_QhJdAd2s_Js5h5sQs_9cTd4h4s() {
    assertEquals(
      "Js5h5sQs QhJdAd2s Kc7cJh3c 9cTd4h4s",
      Solver.process("omaha-holdem 2h3h4c6hJc Kc7cJh3c QhJdAd2s Js5h5sQs 9cTd4h4s"));
  }

  @Test
  public void test_omaha_holdem_9420_3h5h7d8hQc_2hKs4s3s_4c8sTs6h_5dQhJs2c() {
    assertEquals(
      "2hKs4s3s 5dQhJs2c 4c8sTs6h",
      Solver.process("omaha-holdem 3h5h7d8hQc 2hKs4s3s 4c8sTs6h 5dQhJs2c"));
  }

  @Test
  public void test_omaha_holdem_9421_4h9d9hAsQh_2h8dThTd_7s6h7d6d_5s3dAhKs_Ts4s8sJh_Kc3c6sKd_5c7cTcAd_3s6cQd5h() {
    assertEquals(
      "Ts4s8sJh 7s6h7d6d 3s6cQd5h Kc3c6sKd 5c7cTcAd 5s3dAhKs 2h8dThTd",
      Solver.process("omaha-holdem 4h9d9hAsQh 2h8dThTd 7s6h7d6d 5s3dAhKs Ts4s8sJh Kc3c6sKd 5c7cTcAd 3s6cQd5h"));
  }

  @Test
  public void test_omaha_holdem_9422_2h5c9hAcKd_Ts4d2d3s_Ad5dThQd_Qs4h3d6d_QhAs2c6c_7s5h9cJh_9s9dAhJs_Jd5s7h8s() {
    assertEquals(
      "Jd5s7h8s 7s5h9cJh QhAs2c6c Ad5dThQd 9s9dAhJs Qs4h3d6d=Ts4d2d3s",
      Solver.process("omaha-holdem 2h5c9hAcKd Ts4d2d3s Ad5dThQd Qs4h3d6d QhAs2c6c 7s5h9cJh 9s9dAhJs Jd5s7h8s"));
  }

  @Test
  public void test_omaha_holdem_9423_3s4s6s8h8s_Qs6h8dJs_JdAhJc9s() {
    assertEquals(
      "JdAhJc9s Qs6h8dJs",
      Solver.process("omaha-holdem 3s4s6s8h8s Qs6h8dJs JdAhJc9s"));
  }

  @Test
  public void test_omaha_holdem_9424_4dAcAdJhKd_4c9h8dQs_Ts6dTd9c_3dTh5cJc_5h5sKs9s_9d7s3h3c() {
    assertEquals(
      "9d7s3h3c 4c9h8dQs 3dTh5cJc 5h5sKs9s Ts6dTd9c",
      Solver.process("omaha-holdem 4dAcAdJhKd 4c9h8dQs Ts6dTd9c 3dTh5cJc 5h5sKs9s 9d7s3h3c"));
  }

  @Test
  public void test_omaha_holdem_9425_4s8sAcJhTc_7h2d4cTs_7s9s4dAs_2hQcKc3d_6cKd6sTd_JcKh6d9c() {
    assertEquals(
      "6cKd6sTd JcKh6d9c 7h2d4cTs 7s9s4dAs 2hQcKc3d",
      Solver.process("omaha-holdem 4s8sAcJhTc 7h2d4cTs 7s9s4dAs 2hQcKc3d 6cKd6sTd JcKh6d9c"));
  }

  @Test
  public void test_omaha_holdem_9426_8cJcKcQcTc_Jd5h6h3h_KsKh9cTh_Js4sQs7s_5c2sAc7c_4c4h2d6s() {
    assertEquals(
      "4c4h2d6s Jd5h6h3h Js4sQs7s KsKh9cTh 5c2sAc7c",
      Solver.process("omaha-holdem 8cJcKcQcTc Jd5h6h3h KsKh9cTh Js4sQs7s 5c2sAc7c 4c4h2d6s"));
  }

  @Test
  public void test_omaha_holdem_9427_3h3s7dAdQc_Qh8sQsTh_Ac4c2dJs_8d2s5d5c_6h5s2hAh() {
    assertEquals(
      "8d2s5d5c 6h5s2hAh Ac4c2dJs Qh8sQsTh",
      Solver.process("omaha-holdem 3h3s7dAdQc Qh8sQsTh Ac4c2dJs 8d2s5d5c 6h5s2hAh"));
  }

  @Test
  public void test_omaha_holdem_9428_3h6s8cJsKh_8d8s9s9h_7d5c3dAh_Tc2d7h3c_7c5dJhQh_8h2sAcTh_5sKs6c5h() {
    assertEquals(
      "Tc2d7h3c 7d5c3dAh 8h2sAcTh 7c5dJhQh 5sKs6c5h 8d8s9s9h",
      Solver.process("omaha-holdem 3h6s8cJsKh 8d8s9s9h 7d5c3dAh Tc2d7h3c 7c5dJhQh 8h2sAcTh 5sKs6c5h"));
  }

  @Test
  public void test_omaha_holdem_9429_3c5cAcKcQd_Jh8s3s4c_As2sJc8h_6c9c5d9h_4s6d5s8d_4d6hAhKd_7dQcJs2h_QsJd3hTc() {
    assertEquals(
      "Jh8s3s4c 4s6d5s8d 7dQcJs2h As2sJc8h 4d6hAhKd QsJd3hTc 6c9c5d9h",
      Solver.process("omaha-holdem 3c5cAcKcQd Jh8s3s4c As2sJc8h 6c9c5d9h 4s6d5s8d 4d6hAhKd 7dQcJs2h QsJd3hTc"));
  }

  @Test
  public void test_omaha_holdem_9430_4c9c9d9sTd_2h4dJcAs_Qd8s9h2s_KhJsKsAc_JhTs6d6s_Th5sJdKd_Tc6h7c5c_3d5d4h3c_Qs8c3h5h() {
    assertEquals(
      "Tc6h7c5c Qs8c3h5h Th5sJdKd 2h4dJcAs 3d5d4h3c JhTs6d6s KhJsKsAc Qd8s9h2s",
      Solver.process("omaha-holdem 4c9c9d9sTd 2h4dJcAs Qd8s9h2s KhJsKsAc JhTs6d6s Th5sJdKd Tc6h7c5c 3d5d4h3c Qs8c3h5h"));
  }

  @Test
  public void test_omaha_holdem_9431_6c7c9sKhQc_2dKs4dTc_5dAdAsQd_5hTsAc8d_9d4s3cQs_4cQhKcTd_6dTh3s7d_9c9h3d2s_3h6sJh2c_6h8sJc8h() {
    assertEquals(
      "3h6sJh2c 6h8sJc8h 2dKs4dTc 5dAdAsQd 6dTh3s7d 9d4s3cQs 9c9h3d2s 5hTsAc8d 4cQhKcTd",
      Solver.process("omaha-holdem 6c7c9sKhQc 2dKs4dTc 5dAdAsQd 5hTsAc8d 9d4s3cQs 4cQhKcTd 6dTh3s7d 9c9h3d2s 3h6sJh2c 6h8sJc8h"));
  }

  @Test
  public void test_omaha_holdem_9432_6d7h8sAcJd_TdQc3cAs_Ah4s6h2c_Qh6s5s3d_7sKhKsJs_Th9h6c5h_5d9s3s2h_TsKd4c2s_7c8h8cKc() {
    assertEquals(
      "TsKd4c2s Qh6s5s3d TdQc3cAs 7sKhKsJs Ah4s6h2c 7c8h8cKc 5d9s3s2h Th9h6c5h",
      Solver.process("omaha-holdem 6d7h8sAcJd TdQc3cAs Ah4s6h2c Qh6s5s3d 7sKhKsJs Th9h6c5h 5d9s3s2h TsKd4c2s 7c8h8cKc"));
  }

  @Test
  public void test_omaha_holdem_9433_3c7c8sAsJc_Qc9sKh8h_6s9c9h2c_8dKcAhJs_7d7h7s5h_AcQd3hJh_TdKd2h6d() {
    assertEquals(
      "TdKd2h6d Qc9sKh8h 8dKcAhJs=AcQd3hJh 7d7h7s5h 6s9c9h2c",
      Solver.process("omaha-holdem 3c7c8sAsJc Qc9sKh8h 6s9c9h2c 8dKcAhJs 7d7h7s5h AcQd3hJh TdKd2h6d"));
  }

  @Test
  public void test_omaha_holdem_9434_3d4c5c7sQc_8dAsQh3h_2dKh2sJc_9d5dKs4h_4d4sQs8s_6c9c3cAc_5s3sTd2c_AdKd8h7c() {
    assertEquals(
      "2dKh2sJc AdKd8h7c 5s3sTd2c 9d5dKs4h 8dAsQh3h 4d4sQs8s 6c9c3cAc",
      Solver.process("omaha-holdem 3d4c5c7sQc 8dAsQh3h 2dKh2sJc 9d5dKs4h 4d4sQs8s 6c9c3cAc 5s3sTd2c AdKd8h7c"));
  }

  @Test
  public void test_omaha_holdem_9435_3c6hAhJsTh_7dTs4dQd_Jh2s8d2d_Kh3s2c9d_7c9hJd5d_5c7s3h5s_5h8cKs9c_Tc8sKcQh_TdQc9s4c() {
    assertEquals(
      "5h8cKs9c Kh3s2c9d 5c7s3h5s 7dTs4dQd=TdQc9s4c Jh2s8d2d 7c9hJd5d Tc8sKcQh",
      Solver.process("omaha-holdem 3c6hAhJsTh 7dTs4dQd Jh2s8d2d Kh3s2c9d 7c9hJd5d 5c7s3h5s 5h8cKs9c Tc8sKcQh TdQc9s4c"));
  }

  @Test
  public void test_omaha_holdem_9436_3c3d5s9hKc_Ts8c2s8s_Kh3s5d2h_7dQsQc6d_Js4d4h4c_Td9cJd7h() {
    assertEquals(
      "Js4d4h4c Ts8c2s8s Td9cJd7h 7dQsQc6d Kh3s5d2h",
      Solver.process("omaha-holdem 3c3d5s9hKc Ts8c2s8s Kh3s5d2h 7dQsQc6d Js4d4h4c Td9cJd7h"));
  }

  @Test
  public void test_omaha_holdem_9437_3d7cAsQcTh_QsTs6dKd_8s3sTd2c_6s7d7s9h_6h9s5s2h_8h4c2dQh_8d2sAhJc() {
    assertEquals(
      "6h9s5s2h 8h4c2dQh 8d2sAhJc 8s3sTd2c QsTs6dKd 6s7d7s9h",
      Solver.process("omaha-holdem 3d7cAsQcTh QsTs6dKd 8s3sTd2c 6s7d7s9h 6h9s5s2h 8h4c2dQh 8d2sAhJc"));
  }

  @Test
  public void test_omaha_holdem_9438_3c4d6hKhKs_3hQcQsJs_2c8cQdTc_5d7sAs8h_9s9c3d9h_8s8d5hAh_7d3s7hTs() {
    assertEquals(
      "2c8cQdTc 7d3s7hTs 8s8d5hAh 9s9c3d9h 3hQcQsJs 5d7sAs8h",
      Solver.process("omaha-holdem 3c4d6hKhKs 3hQcQsJs 2c8cQdTc 5d7sAs8h 9s9c3d9h 8s8d5hAh 7d3s7hTs"));
  }

  @Test
  public void test_omaha_holdem_9439_4c4h9cKsQc_8sAcKd6c_As3hJd4s_Th6hAh2c_2h8dKc5d_2s2d3s8c() {
    assertEquals(
      "Th6hAh2c 2s2d3s8c 2h8dKc5d As3hJd4s 8sAcKd6c",
      Solver.process("omaha-holdem 4c4h9cKsQc 8sAcKd6c As3hJd4s Th6hAh2c 2h8dKc5d 2s2d3s8c"));
  }

  @Test
  public void test_omaha_holdem_9440_5d5h6sAdTd_2hAs5c3h_AhThJs9d_KsJh7c8c() {
    assertEquals(
      "KsJh7c8c AhThJs9d 2hAs5c3h",
      Solver.process("omaha-holdem 5d5h6sAdTd 2hAs5c3h AhThJs9d KsJh7c8c"));
  }

  @Test
  public void test_omaha_holdem_9441_2h4s6s8sJd_2cQc6h6c_2sKhJh3d_Kd2d5dQs_AdTsTh4c_8cAh8d5c() {
    assertEquals(
      "Kd2d5dQs AdTsTh4c 2sKhJh3d 2cQc6h6c 8cAh8d5c",
      Solver.process("omaha-holdem 2h4s6s8sJd 2cQc6h6c 2sKhJh3d Kd2d5dQs AdTsTh4c 8cAh8d5c"));
  }

  @Test
  public void test_omaha_holdem_9442_3d4c6c8sAs_5hAdAh2s_6h4s7c8c_2d2c5dJc_7d9c4hTd_6dAcQsQd_2hQh7h3c_9hJd5c4d_3h5sJh7s_Kh9s8h8d() {
    assertEquals(
      "2hQh7h3c 7d9c4hTd 9hJd5c4d 6h4s7c8c 6dAcQsQd Kh9s8h8d 2d2c5dJc=5hAdAh2s 3h5sJh7s",
      Solver.process("omaha-holdem 3d4c6c8sAs 5hAdAh2s 6h4s7c8c 2d2c5dJc 7d9c4hTd 6dAcQsQd 2hQh7h3c 9hJd5c4d 3h5sJh7s Kh9s8h8d"));
  }

  @Test
  public void test_omaha_holdem_9443_4c8h9hKdQc_JcKh9s5s_Tc4s7d3c_9c5h6dTh_8sQd7sKc_Ks6s8c7c_2s2c4d6h_7hAhTsAd_3h3dJdQh_5cJs4h2h() {
    assertEquals(
      "2s2c4d6h Tc4s7d3c 5cJs4h2h 9c5h6dTh 3h3dJdQh 7hAhTsAd Ks6s8c7c JcKh9s5s 8sQd7sKc",
      Solver.process("omaha-holdem 4c8h9hKdQc JcKh9s5s Tc4s7d3c 9c5h6dTh 8sQd7sKc Ks6s8c7c 2s2c4d6h 7hAhTsAd 3h3dJdQh 5cJs4h2h"));
  }

  @Test
  public void test_omaha_holdem_9444_3d6d8sAcKh_9s5cTh6s_8dJc4h9c_2sAs8h5h_AhKcTd2c_QdQcTc7d_8c9dAd3c_7sJdKsJh() {
    assertEquals(
      "9s5cTh6s 8dJc4h9c QdQcTc7d 7sJdKsJh 2sAs8h5h=8c9dAd3c AhKcTd2c",
      Solver.process("omaha-holdem 3d6d8sAcKh 9s5cTh6s 8dJc4h9c 2sAs8h5h AhKcTd2c QdQcTc7d 8c9dAd3c 7sJdKsJh"));
  }

  @Test
  public void test_omaha_holdem_9445_3d4d5s9c9s_QcQd7hKd_3h7s8cJc_6sKsTd9d_6cJs5hKc_JdAd5d6h_QhQs3cAh() {
    assertEquals(
      "3h7s8cJc 6cJs5hKc JdAd5d6h QcQd7hKd=QhQs3cAh 6sKsTd9d",
      Solver.process("omaha-holdem 3d4d5s9c9s QcQd7hKd 3h7s8cJc 6sKsTd9d 6cJs5hKc JdAd5d6h QhQs3cAh"));
  }

  @Test
  public void test_omaha_holdem_9446_2c3c7c8d9h_Th2dJhQd_6s8sKhKd_QhAsAh6h_QsAdTcJc_3s7d5h9d_KsKc6cTs_9cAc3d9s_5cTd5d2h() {
    assertEquals(
      "5cTd5d2h 6s8sKhKd QhAsAh6h 3s7d5h9d Th2dJhQd QsAdTcJc KsKc6cTs 9cAc3d9s",
      Solver.process("omaha-holdem 2c3c7c8d9h Th2dJhQd 6s8sKhKd QhAsAh6h QsAdTcJc 3s7d5h9d KsKc6cTs 9cAc3d9s 5cTd5d2h"));
  }

  @Test
  public void test_omaha_holdem_9447_6d7s9d9hQc_KsJsJd4c_As6sKdKh() {
    assertEquals(
      "KsJsJd4c As6sKdKh",
      Solver.process("omaha-holdem 6d7s9d9hQc KsJsJd4c As6sKdKh"));
  }

  @Test
  public void test_omaha_holdem_9448_2s6s8hTcTd_Kh8sKcTh_As9h9dQs_7c6hAd8d_3c2h4sQd_8cKs2c7h() {
    assertEquals(
      "3c2h4sQd 8cKs2c7h 7c6hAd8d As9h9dQs Kh8sKcTh",
      Solver.process("omaha-holdem 2s6s8hTcTd Kh8sKcTh As9h9dQs 7c6hAd8d 3c2h4sQd 8cKs2c7h"));
  }

  @Test
  public void test_omaha_holdem_9449_3h3s9sKsTs_7cTh8sAc_4d4s7sJc_7h9d8d6s_5h2s2d5d_QcAsAh8h_JdKh2cJs_6dTcQh3d() {
    assertEquals(
      "5h2s2d5d 7h9d8d6s 7cTh8sAc JdKh2cJs QcAsAh8h 4d4s7sJc 6dTcQh3d",
      Solver.process("omaha-holdem 3h3s9sKsTs 7cTh8sAc 4d4s7sJc 7h9d8d6s 5h2s2d5d QcAsAh8h JdKh2cJs 6dTcQh3d"));
  }

  @Test
  public void test_omaha_holdem_9450_5c6c8d9sJc_2d9hJhAs_2sAh7dTc_QhTh9cKh_Jd4c5h5d_Kc8s2hKs_Ad9d4h8h() {
    assertEquals(
      "Kc8s2hKs Ad9d4h8h 2d9hJhAs Jd4c5h5d 2sAh7dTc QhTh9cKh",
      Solver.process("omaha-holdem 5c6c8d9sJc 2d9hJhAs 2sAh7dTc QhTh9cKh Jd4c5h5d Kc8s2hKs Ad9d4h8h"));
  }

  @Test
  public void test_omaha_holdem_9451_3s8c9h9sQs_4cJcJs9d_5sKs6sTc_4h6dJdTd_Th8dAcTs_8h6c3d7s() {
    assertEquals(
      "8h6c3d7s Th8dAcTs 4cJcJs9d 4h6dJdTd 5sKs6sTc",
      Solver.process("omaha-holdem 3s8c9h9sQs 4cJcJs9d 5sKs6sTc 4h6dJdTd Th8dAcTs 8h6c3d7s"));
  }

  @Test
  public void test_omaha_holdem_9452_2c4d7s9d9h_3h6s4cKs_5h5d3dAd_JsTcQh8d_Qd6hThTd_QcKh5cJd_7dKcAs6d_3c7hAc9s_4sTsJcQs_8hAh8s9c() {
    assertEquals(
      "JsTcQh8d QcKh5cJd 4sTsJcQs 3h6s4cKs 5h5d3dAd 7dKcAs6d Qd6hThTd 8hAh8s9c 3c7hAc9s",
      Solver.process("omaha-holdem 2c4d7s9d9h 3h6s4cKs 5h5d3dAd JsTcQh8d Qd6hThTd QcKh5cJd 7dKcAs6d 3c7hAc9s 4sTsJcQs 8hAh8s9c"));
  }

  @Test
  public void test_omaha_holdem_9453_4c8c8hJdJs_9dKh7dKc_Td8d5h5c_Qc7h3c9c_3hAh4s8s_Kd6c5s2c_JcQsAs7c_9s2hTc4d() {
    assertEquals(
      "Qc7h3c9c Kd6c5s2c 9s2hTc4d 9dKh7dKc Td8d5h5c JcQsAs7c 3hAh4s8s",
      Solver.process("omaha-holdem 4c8c8hJdJs 9dKh7dKc Td8d5h5c Qc7h3c9c 3hAh4s8s Kd6c5s2c JcQsAs7c 9s2hTc4d"));
  }

  @Test
  public void test_omaha_holdem_9454_4c5h6d9dAh_8c4sTd9s_5d6sJs6c() {
    assertEquals(
      "8c4sTd9s 5d6sJs6c",
      Solver.process("omaha-holdem 4c5h6d9dAh 8c4sTd9s 5d6sJs6c"));
  }

  @Test
  public void test_omaha_holdem_9455_4s5h8c9dKs_4d2s7d7h_7s8hTc5d_7cJs5cTd() {
    assertEquals(
      "7cJs5cTd 4d2s7d7h 7s8hTc5d",
      Solver.process("omaha-holdem 4s5h8c9dKs 4d2s7d7h 7s8hTc5d 7cJs5cTd"));
  }

  @Test
  public void test_omaha_holdem_9456_5c7d7s9hJc_Jh7h4hAs_2cAh6s3c_KsTs5h4d_QcJs8d2d_5dJdQh8h_Th3s2hKh_6c9s8s3h_Kd3d7c4s() {
    assertEquals(
      "Th3s2hKh 2cAh6s3c KsTs5h4d 5dJdQh8h=QcJs8d2d Kd3d7c4s 6c9s8s3h Jh7h4hAs",
      Solver.process("omaha-holdem 5c7d7s9hJc Jh7h4hAs 2cAh6s3c KsTs5h4d QcJs8d2d 5dJdQh8h Th3s2hKh 6c9s8s3h Kd3d7c4s"));
  }

  @Test
  public void test_omaha_holdem_9457_5c5h8sAhQh_QdAd7h8d_Kc3s9h2c_6sTs6d7s_2s4d7d4s_Kh8h6cTc_JcJh3dQc_2dKdTh3h_As5dQsKs_9c7c9dJd() {
    assertEquals(
      "Kc3s9h2c 2s4d7d4s 6sTs6d7s 9c7c9dJd JcJh3dQc QdAd7h8d 2dKdTh3h Kh8h6cTc As5dQsKs",
      Solver.process("omaha-holdem 5c5h8sAhQh QdAd7h8d Kc3s9h2c 6sTs6d7s 2s4d7d4s Kh8h6cTc JcJh3dQc 2dKdTh3h As5dQsKs 9c7c9dJd"));
  }

  @Test
  public void test_omaha_holdem_9458_4d4h7cAdAs_9h2s6d4c_2d6cJcAc_Kd3sJhJd_7s4sKs6s_8hTs2c7h_Ah9sThQc_7d3d3c5d_9c8cKc6h() {
    assertEquals(
      "9c8cKc6h 7d3d3c5d 8hTs2c7h Kd3sJhJd 9h2s6d4c 2d6cJcAc Ah9sThQc 7s4sKs6s",
      Solver.process("omaha-holdem 4d4h7cAdAs 9h2s6d4c 2d6cJcAc Kd3sJhJd 7s4sKs6s 8hTs2c7h Ah9sThQc 7d3d3c5d 9c8cKc6h"));
  }

  @Test
  public void test_omaha_holdem_9459_2c3h9hKcTc_JhKh2sJc_3cAc3s5h_7hTdQhJd_AhJs7s4c() {
    assertEquals(
      "AhJs7s4c JhKh2sJc 7hTdQhJd 3cAc3s5h",
      Solver.process("omaha-holdem 2c3h9hKcTc JhKh2sJc 3cAc3s5h 7hTdQhJd AhJs7s4c"));
  }

  @Test
  public void test_omaha_holdem_9460_2h7hQsThTs_Jh4hKc9h_9d5h2cKh_2dAd4c3c_9s3h8cJd_5sQcJc5c_Js6c5d6s_8s7sTdTc() {
    assertEquals(
      "9s3h8cJd 2dAd4c3c Js6c5d6s 5sQcJc5c Jh4hKc9h 9d5h2cKh 8s7sTdTc",
      Solver.process("omaha-holdem 2h7hQsThTs Jh4hKc9h 9d5h2cKh 2dAd4c3c 9s3h8cJd 5sQcJc5c Js6c5d6s 8s7sTdTc"));
  }

  @Test
  public void test_omaha_holdem_9461_2s7d7s9dAh_5d3h6h6s_AdTc3s6d_4sKs5h2d_ThQdTsKh_9cJd4h7c_3d9sJhJc_4d9hKdJs_QsAs2cQc_Qh2hTd5c() {
    assertEquals(
      "Qh2hTd5c 4sKs5h2d 5d3h6h6s 4d9hKdJs ThQdTsKh 3d9sJhJc AdTc3s6d QsAs2cQc 9cJd4h7c",
      Solver.process("omaha-holdem 2s7d7s9dAh 5d3h6h6s AdTc3s6d 4sKs5h2d ThQdTsKh 9cJd4h7c 3d9sJhJc 4d9hKdJs QsAs2cQc Qh2hTd5c"));
  }

  @Test
  public void test_omaha_holdem_9462_2d2hAcAhKs_9h3hJdKd_7s7d2c9c_3cQs8h5h_5c4c4d9s_Kh7c9d8s_Ts8cThQd() {
    assertEquals(
      "3cQs8h5h 5c4c4d9s Ts8cThQd Kh7c9d8s 9h3hJdKd 7s7d2c9c",
      Solver.process("omaha-holdem 2d2hAcAhKs 9h3hJdKd 7s7d2c9c 3cQs8h5h 5c4c4d9s Kh7c9d8s Ts8cThQd"));
  }

  @Test
  public void test_omaha_holdem_9463_8sJdJhKcKs_AdKdTs8h_Tc2h6s5c_2sAcQd9h() {
    assertEquals(
      "Tc2h6s5c 2sAcQd9h AdKdTs8h",
      Solver.process("omaha-holdem 8sJdJhKcKs AdKdTs8h Tc2h6s5c 2sAcQd9h"));
  }

  @Test
  public void test_omaha_holdem_9464_5c5hAhJcJd_Td7cQd5s_Qc4cTcKh_Ac2cJsAd_Ks6s4d6d_4s9d5d9s() {
    assertEquals(
      "Qc4cTcKh Ks6s4d6d 4s9d5d9s Td7cQd5s Ac2cJsAd",
      Solver.process("omaha-holdem 5c5hAhJcJd Td7cQd5s Qc4cTcKh Ac2cJsAd Ks6s4d6d 4s9d5d9s"));
  }

  @Test
  public void test_omaha_holdem_9465_2h3h5d8hKs_9h8d9sTs_9dAcTc4c_Ad7sAsKh_2d7c7dJc_2cJd4s3c_4d8s5hKd_5sAh6sKc_6d3s2s8c() {
    assertEquals(
      "2d7c7dJc 9h8d9sTs Ad7sAsKh 2cJd4s3c 6d3s2s8c 5sAh6sKc 4d8s5hKd 9dAcTc4c",
      Solver.process("omaha-holdem 2h3h5d8hKs 9h8d9sTs 9dAcTc4c Ad7sAsKh 2d7c7dJc 2cJd4s3c 4d8s5hKd 5sAh6sKc 6d3s2s8c"));
  }

  @Test
  public void test_omaha_holdem_9466_2c4s5h8cTc_2d4hAs4c_9s3d5sTd_3hTsJc9c_Qh2s9d7d() {
    assertEquals(
      "Qh2s9d7d 9s3d5sTd 2d4hAs4c 3hTsJc9c",
      Solver.process("omaha-holdem 2c4s5h8cTc 2d4hAs4c 9s3d5sTd 3hTsJc9c Qh2s9d7d"));
  }

  @Test
  public void test_omaha_holdem_9467_2s3h7c8hTs_4cKs6hJc_Jh2h8d2c_4h2dQh6d_7s6c9dAs_8s3c4sQs_9cTcJs5h_3d7h5s9h() {
    assertEquals(
      "4cKs6hJc 4h2dQh6d 3d7h5s9h 8s3c4sQs Jh2h8d2c 7s6c9dAs 9cTcJs5h",
      Solver.process("omaha-holdem 2s3h7c8hTs 4cKs6hJc Jh2h8d2c 4h2dQh6d 7s6c9dAs 8s3c4sQs 9cTcJs5h 3d7h5s9h"));
  }

  @Test
  public void test_omaha_holdem_9468_3s5h6s8cTh_7s6hKsQs_4c5s3cJh_Td8h6cJd_Ad8d3h9d_7h2sAhJs_JcTc7dQd_6dKh2c4h_5d8s9c4d_2h4s7cQh() {
    assertEquals(
      "7h2sAhJs 7s6hKsQs JcTc7dQd 4c5s3cJh Ad8d3h9d 5d8s9c4d Td8h6cJd 6dKh2c4h 2h4s7cQh",
      Solver.process("omaha-holdem 3s5h6s8cTh 7s6hKsQs 4c5s3cJh Td8h6cJd Ad8d3h9d 7h2sAhJs JcTc7dQd 6dKh2c4h 5d8s9c4d 2h4s7cQh"));
  }

  @Test
  public void test_omaha_holdem_9469_3d4s6sKdTc_2h7cJhKs_Ts6d5h2c_QcAd8cAc_4hJc7s5d_Qh9s5s4d_Kc2dKhJs_Qd8s3h8h_As5c3s6c_Ah2sJdQs() {
    assertEquals(
      "Ah2sJdQs Qh9s5s4d Qd8s3h8h 2h7cJhKs QcAd8cAc As5c3s6c Kc2dKhJs Ts6d5h2c 4hJc7s5d",
      Solver.process("omaha-holdem 3d4s6sKdTc 2h7cJhKs Ts6d5h2c QcAd8cAc 4hJc7s5d Qh9s5s4d Kc2dKhJs Qd8s3h8h As5c3s6c Ah2sJdQs"));
  }

  @Test
  public void test_omaha_holdem_9470_6d8d8sAdAh_5dKsTcTs_3h3dAs9h_Qd7s7d4c_5c6s7c2s_5sTh4s4h_JsQc8cJh_3c6c4dJc_9dKcAcTd_2h8h2cKd() {
    assertEquals(
      "5sTh4s4h 5c6s7c2s 3c6c4dJc 5dKsTcTs JsQc8cJh 2h8h2cKd 3h3dAs9h 9dKcAcTd Qd7s7d4c",
      Solver.process("omaha-holdem 6d8d8sAdAh 5dKsTcTs 3h3dAs9h Qd7s7d4c 5c6s7c2s 5sTh4s4h JsQc8cJh 3c6c4dJc 9dKcAcTd 2h8h2cKd"));
  }

  @Test
  public void test_omaha_holdem_9471_5d6d7d8hJc_Jh7s5c9c_AhQc7hKd_Td4dKs6c_2hAsQsKc_8dQh4cTc_9dAd3c2s() {
    assertEquals(
      "2hAsQsKc AhQc7hKd 8dQh4cTc Jh7s5c9c Td4dKs6c 9dAd3c2s",
      Solver.process("omaha-holdem 5d6d7d8hJc Jh7s5c9c AhQc7hKd Td4dKs6c 2hAsQsKc 8dQh4cTc 9dAd3c2s"));
  }

  @Test
  public void test_omaha_holdem_9472_2d7d7s9cTd_6d2hAhAc_ThKc7h4d_TsQd9s2s_Jc6s2c6c_5c3c9hTc_5s8hQhQs_3h6h3sKh() {
    assertEquals(
      "3h6h3sKh Jc6s2c6c 5c3c9hTc=TsQd9s2s 5s8hQhQs 6d2hAhAc ThKc7h4d",
      Solver.process("omaha-holdem 2d7d7s9cTd 6d2hAhAc ThKc7h4d TsQd9s2s Jc6s2c6c 5c3c9hTc 5s8hQhQs 3h6h3sKh"));
  }

  @Test
  public void test_omaha_holdem_9473_4d5d8d9dQc_6cJh6s3d_9cKdJc2h_2cTdQdAh_Th3s4h5h_9s9hAs8c_Ts4s7hJs_TcKs7dQh_Jd2s3cKc() {
    assertEquals(
      "Jd2s3cKc 6cJh6s3d 9cKdJc2h TcKs7dQh Th3s4h5h 9s9hAs8c Ts4s7hJs 2cTdQdAh",
      Solver.process("omaha-holdem 4d5d8d9dQc 6cJh6s3d 9cKdJc2h 2cTdQdAh Th3s4h5h 9s9hAs8c Ts4s7hJs TcKs7dQh Jd2s3cKc"));
  }

  @Test
  public void test_omaha_holdem_9474_3c5h6c7h7s_4c6d8sQs_2cAsKc3s_7dTs7c4h_9h3h4dAh() {
    assertEquals(
      "2cAsKc3s 9h3h4dAh 4c6d8sQs 7dTs7c4h",
      Solver.process("omaha-holdem 3c5h6c7h7s 4c6d8sQs 2cAsKc3s 7dTs7c4h 9h3h4dAh"));
  }

  @Test
  public void test_omaha_holdem_9475_4c7s8cQsTd_6c8hQcKs_4s6d4hAc_9hAh4d7h_Ad7d2h6h_JhTsTc5d_Kh3c8d6s_Qh7c2s9s() {
    assertEquals(
      "Ad7d2h6h Kh3c8d6s 9hAh4d7h Qh7c2s9s 6c8hQcKs 4s6d4hAc JhTsTc5d",
      Solver.process("omaha-holdem 4c7s8cQsTd 6c8hQcKs 4s6d4hAc 9hAh4d7h Ad7d2h6h JhTsTc5d Kh3c8d6s Qh7c2s9s"));
  }

  @Test
  public void test_omaha_holdem_9476_5s6h7d8cJs_7c8dAs3s_Jh6cJc2c() {
    assertEquals(
      "7c8dAs3s Jh6cJc2c",
      Solver.process("omaha-holdem 5s6h7d8cJs 7c8dAs3s Jh6cJc2c"));
  }

  @Test
  public void test_omaha_holdem_9477_3d3h3s8hKs_AsAcJd9h_5d5s6c3c_2c9s7s9d_7c2dQhTd_8cTsAdQc_9cQd6s5h() {
    assertEquals(
      "9cQd6s5h 7c2dQhTd 8cTsAdQc 2c9s7s9d AsAcJd9h 5d5s6c3c",
      Solver.process("omaha-holdem 3d3h3s8hKs AsAcJd9h 5d5s6c3c 2c9s7s9d 7c2dQhTd 8cTsAdQc 9cQd6s5h"));
  }

  @Test
  public void test_omaha_holdem_9478_2h2s4d5hTc_Jh6cKs6d_8d5s4hKc() {
    assertEquals(
      "8d5s4hKc Jh6cKs6d",
      Solver.process("omaha-holdem 2h2s4d5hTc Jh6cKs6d 8d5s4hKc"));
  }

  @Test
  public void test_omaha_holdem_9479_4c4s5s8sQc_JsAh3h5d_2sAc3s8d_9dKd6sJh() {
    assertEquals(
      "9dKd6sJh JsAh3h5d 2sAc3s8d",
      Solver.process("omaha-holdem 4c4s5s8sQc JsAh3h5d 2sAc3s8d 9dKd6sJh"));
  }

  @Test
  public void test_omaha_holdem_9480_2h4d5sAdQs_4c8c7sKd_3h6hJcTh_3c2c9h2d_4hJh5cTs() {
    assertEquals(
      "4c8c7sKd 4hJh5cTs 3c2c9h2d 3h6hJcTh",
      Solver.process("omaha-holdem 2h4d5sAdQs 4c8c7sKd 3h6hJcTh 3c2c9h2d 4hJh5cTs"));
  }

  @Test
  public void test_omaha_holdem_9481_8sKdKsThTs_7dAcQsJc_5hJh4c2h_3s2dAdKh_TdTc3h6h_Jd6d9cQh_KcAhQd5d_8d7c6c6s() {
    assertEquals(
      "5hJh4c2h Jd6d9cQh 7dAcQsJc 8d7c6c6s 3s2dAdKh=KcAhQd5d TdTc3h6h",
      Solver.process("omaha-holdem 8sKdKsThTs 7dAcQsJc 5hJh4c2h 3s2dAdKh TdTc3h6h Jd6d9cQh KcAhQd5d 8d7c6c6s"));
  }

  @Test
  public void test_omaha_holdem_9482_3c7d8sAhTh_7h6h4d9c_Jc4h5h4c_Kh8cQdTd_5c6c7s2s_4sKsJsQc_Ac2hAdKc_5d6dAs9h() {
    assertEquals(
      "4sKsJsQc Jc4h5h4c 5c6c7s2s Kh8cQdTd Ac2hAdKc 5d6dAs9h=7h6h4d9c",
      Solver.process("omaha-holdem 3c7d8sAhTh 7h6h4d9c Jc4h5h4c Kh8cQdTd 5c6c7s2s 4sKsJsQc Ac2hAdKc 5d6dAs9h"));
  }

  @Test
  public void test_omaha_holdem_9483_4c7c7d7sAs_Tc8dJh2c_3d3h4s3s_4hTdThQd_6dKdKcQc() {
    assertEquals(
      "Tc8dJh2c 3d3h4s3s 4hTdThQd 6dKdKcQc",
      Solver.process("omaha-holdem 4c7c7d7sAs Tc8dJh2c 3d3h4s3s 4hTdThQd 6dKdKcQc"));
  }

  @Test
  public void test_omaha_holdem_9484_5c6hAsQsTs_Js3s5h3h_6s8dAc7c() {
    assertEquals(
      "6s8dAc7c Js3s5h3h",
      Solver.process("omaha-holdem 5c6hAsQsTs Js3s5h3h 6s8dAc7c"));
  }

  @Test
  public void test_omaha_holdem_9485_4h5c9cQsTh_Kc5h3c2c_TsTc7c8d_2dQc3dKh_4d2sQh4s_Ac5s9d9h_Jc8s7d8c_JdQd4c6s_7h6d6c9s_7s3sKdTd() {
    assertEquals(
      "Kc5h3c2c 7h6d6c9s 7s3sKdTd 2dQc3dKh JdQd4c6s 4d2sQh4s Ac5s9d9h TsTc7c8d Jc8s7d8c",
      Solver.process("omaha-holdem 4h5c9cQsTh Kc5h3c2c TsTc7c8d 2dQc3dKh 4d2sQh4s Ac5s9d9h Jc8s7d8c JdQd4c6s 7h6d6c9s 7s3sKdTd"));
  }

  @Test
  public void test_omaha_holdem_9486_2s4d5h8h9d_9hAh2cJh_7cTdKd9c_5c7s6s2d_Kc6c7dTc_8sTh6hJs_AsTsKsQd_9s3cAcJd_Ad7hQcQh_5s2h3hJc() {
    assertEquals(
      "AsTsKsQd 8sTh6hJs 7cTdKd9c Ad7hQcQh 5s2h3hJc 9hAh2cJh 9s3cAcJd 5c7s6s2d=Kc6c7dTc",
      Solver.process("omaha-holdem 2s4d5h8h9d 9hAh2cJh 7cTdKd9c 5c7s6s2d Kc6c7dTc 8sTh6hJs AsTsKsQd 9s3cAcJd Ad7hQcQh 5s2h3hJc"));
  }

  @Test
  public void test_omaha_holdem_9487_2c2s5c5dTd_Th2d8h5h_KdJs8c5s_AcQs7sKh_8sJhAd3s() {
    assertEquals(
      "8sJhAd3s AcQs7sKh KdJs8c5s Th2d8h5h",
      Solver.process("omaha-holdem 2c2s5c5dTd Th2d8h5h KdJs8c5s AcQs7sKh 8sJhAd3s"));
  }

  @Test
  public void test_omaha_holdem_9488_4c4d6hJdQs_2cTs7s7c_9h8c8sJh_Kd4h5sQc() {
    assertEquals(
      "2cTs7s7c 9h8c8sJh Kd4h5sQc",
      Solver.process("omaha-holdem 4c4d6hJdQs 2cTs7s7c 9h8c8sJh Kd4h5sQc"));
  }

  @Test
  public void test_omaha_holdem_9489_6c8h9cAdQh_9s3h4d6d_6s4cTsJs_AhJd8s8d_9h4sQdAc_3c2s7s5h() {
    assertEquals(
      "9s3h4d6d 9h4sQdAc AhJd8s8d 3c2s7s5h 6s4cTsJs",
      Solver.process("omaha-holdem 6c8h9cAdQh 9s3h4d6d 6s4cTsJs AhJd8s8d 9h4sQdAc 3c2s7s5h"));
  }

  @Test
  public void test_omaha_holdem_9490_2d2s4s8dTd_Tc3d6s9h_Jd3h4cTh_8c4hQsKh_QdJs7cKs_As5h9d5d_8s3s9s7h_2c6cQhJc_9c5sAh2h_Kd7s4dAd() {
    assertEquals(
      "QdJs7cKs 8s3s9s7h 8c4hQsKh Tc3d6s9h Jd3h4cTh 2c6cQhJc 9c5sAh2h As5h9d5d Kd7s4dAd",
      Solver.process("omaha-holdem 2d2s4s8dTd Tc3d6s9h Jd3h4cTh 8c4hQsKh QdJs7cKs As5h9d5d 8s3s9s7h 2c6cQhJc 9c5sAh2h Kd7s4dAd"));
  }

  @Test
  public void test_omaha_holdem_9491_3c5d6h8sTs_8cJh5s3h_KcJs4sAs() {
    assertEquals(
      "KcJs4sAs 8cJh5s3h",
      Solver.process("omaha-holdem 3c5d6h8sTs 8cJh5s3h KcJs4sAs"));
  }

  @Test
  public void test_omaha_holdem_9492_4dAcKcKdTh_6h2s9d6c_6d8sQdAh_JsQh8cKs_AdQsQcKh_2c9h7s8d_AsJd7cTs_7d4cTd2d_6s5h4s9s_Jh8hTc4h() {
    assertEquals(
      "2c9h7s8d 6s5h4s9s 6h2s9d6c 7d4cTd2d Jh8hTc4h AsJd7cTs 6d8sQdAh JsQh8cKs AdQsQcKh",
      Solver.process("omaha-holdem 4dAcKcKdTh 6h2s9d6c 6d8sQdAh JsQh8cKs AdQsQcKh 2c9h7s8d AsJd7cTs 7d4cTd2d 6s5h4s9s Jh8hTc4h"));
  }

  @Test
  public void test_omaha_holdem_9493_9h9sAdKcQh_Qc8h5cKd_9cTd3d4d_5h4h7h6h_JhAsThTc() {
    assertEquals(
      "5h4h7h6h Qc8h5cKd 9cTd3d4d JhAsThTc",
      Solver.process("omaha-holdem 9h9sAdKcQh Qc8h5cKd 9cTd3d4d 5h4h7h6h JhAsThTc"));
  }

  @Test
  public void test_omaha_holdem_9494_2h3d4s6d6h_Jc3cJh5s_7s5h3h2c_7cTc3s5d_8sTd6s8d_Ah2sTsKh_Ks8c4cKc_2dQd8hJd_9c5cAsAd() {
    assertEquals(
      "2dQd8hJd Ah2sTsKh Ks8c4cKc 8sTd6s8d 9c5cAsAd Jc3cJh5s 7cTc3s5d=7s5h3h2c",
      Solver.process("omaha-holdem 2h3d4s6d6h Jc3cJh5s 7s5h3h2c 7cTc3s5d 8sTd6s8d Ah2sTsKh Ks8c4cKc 2dQd8hJd 9c5cAsAd"));
  }

  @Test
  public void test_omaha_holdem_9495_4h7d8cAcQc_5d2d3sKc_5h9h8dAd() {
    assertEquals(
      "5d2d3sKc 5h9h8dAd",
      Solver.process("omaha-holdem 4h7d8cAcQc 5d2d3sKc 5h9h8dAd"));
  }

  @Test
  public void test_omaha_holdem_9496_5h7d8dKcQh_Td2d7s4c_5s3cKsQc_JdQsTsKd_Jc2c2s9s() {
    assertEquals(
      "Jc2c2s9s Td2d7s4c 5s3cKsQc=JdQsTsKd",
      Solver.process("omaha-holdem 5h7d8dKcQh Td2d7s4c 5s3cKsQc JdQsTsKd Jc2c2s9s"));
  }

  @Test
  public void test_omaha_holdem_9497_2d4d7s9sAc_5h6c9cAs_Th6s2sKs_AdJs4s8s_QcKh4cJh_5d8c3sTs_7d8d9d6d_KdKc3d6h_2c8h9h4h() {
    assertEquals(
      "Th6s2sKs QcKh4cJh KdKc3d6h 2c8h9h4h 7d8d9d6d AdJs4s8s 5h6c9cAs 5d8c3sTs",
      Solver.process("omaha-holdem 2d4d7s9sAc 5h6c9cAs Th6s2sKs AdJs4s8s QcKh4cJh 5d8c3sTs 7d8d9d6d KdKc3d6h 2c8h9h4h"));
  }

  @Test
  public void test_omaha_holdem_9498_2h3c9cKcTd_6sTc6h8h_4h5d7sTh_KdQh8cJs_AsJh5h7c() {
    assertEquals(
      "AsJh5h7c 4h5d7sTh 6sTc6h8h KdQh8cJs",
      Solver.process("omaha-holdem 2h3c9cKcTd 6sTc6h8h 4h5d7sTh KdQh8cJs AsJh5h7c"));
  }

  @Test
  public void test_omaha_holdem_9499_5d6h7c8hQs_6sTc8dQh_Ac9h7sJc_4hJs5sQd_Ks9s4s7d_Jh3c9dQc() {
    assertEquals(
      "Jh3c9dQc 6sTc8dQh 4hJs5sQd Ac9h7sJc=Ks9s4s7d",
      Solver.process("omaha-holdem 5d6h7c8hQs 6sTc8dQh Ac9h7sJc 4hJs5sQd Ks9s4s7d Jh3c9dQc"));
  }

}
