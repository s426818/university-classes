
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver1HiddenTest {


  @Test
  public void test_omaha_holdem_250_2s4c4h5c8h_KcAhQd4d_6hJs2d3d() {
    assertEquals(
      "KcAhQd4d 6hJs2d3d",
      Solver.process("omaha-holdem 2s4c4h5c8h KcAhQd4d 6hJs2d3d"));
  }

  @Test
  public void test_omaha_holdem_251_6hAsKhTcTs_6c2h7d5c_5s9d2d8c_7cQh4h3s_5h4s9sJc_Ac9cQc5d() {
    assertEquals(
      "5s9d2d8c 5h4s9sJc 7cQh4h3s 6c2h7d5c Ac9cQc5d",
      Solver.process("omaha-holdem 6hAsKhTcTs 6c2h7d5c 5s9d2d8c 7cQh4h3s 5h4s9sJc Ac9cQc5d"));
  }

  @Test
  public void test_omaha_holdem_252_3h7h9dAdQh_4d8sJh6c_8c3c6h5h_Jd6s7c2d_4s7dJcQc_Qd8d4cTd() {
    assertEquals(
      "4d8sJh6c Jd6s7c2d Qd8d4cTd 4s7dJcQc 8c3c6h5h",
      Solver.process("omaha-holdem 3h7h9dAdQh 4d8sJh6c 8c3c6h5h Jd6s7c2d 4s7dJcQc Qd8d4cTd"));
  }

  @Test
  public void test_omaha_holdem_253_2d5s8sAhKd_JhThJd2c_Ac4d9s6d() {
    assertEquals(
      "JhThJd2c Ac4d9s6d",
      Solver.process("omaha-holdem 2d5s8sAhKd JhThJd2c Ac4d9s6d"));
  }

  @Test
  public void test_omaha_holdem_254_4c5d5s9hAc_Js3d5cQs_5h8hKhTh_8sJdJcKs_7c3c6sTd() {
    assertEquals(
      "7c3c6sTd 8sJdJcKs Js3d5cQs 5h8hKhTh",
      Solver.process("omaha-holdem 4c5d5s9hAc Js3d5cQs 5h8hKhTh 8sJdJcKs 7c3c6sTd"));
  }

  @Test
  public void test_omaha_holdem_255_2h3s5d9sKc_7sQcAh4c_JdAs2dTh_Ts8hQsAc_5h8c6s4h_3hQh4d9h_7d9c6dAd_2sTd7h6c() {
    assertEquals(
      "Ts8hQsAc 2sTd7h6c JdAs2dTh 7d9c6dAd 3hQh4d9h 7sQcAh4c 5h8c6s4h",
      Solver.process("omaha-holdem 2h3s5d9sKc 7sQcAh4c JdAs2dTh Ts8hQsAc 5h8c6s4h 3hQh4d9h 7d9c6dAd 2sTd7h6c"));
  }

  @Test
  public void test_omaha_holdem_256_3h3s7c9sTs_Kd9dTh2h_Qc8dTc9h_Qs6cAhJs_2c4h8h7d() {
    assertEquals(
      "2c4h8h7d Kd9dTh2h=Qc8dTc9h Qs6cAhJs",
      Solver.process("omaha-holdem 3h3s7c9sTs Kd9dTh2h Qc8dTc9h Qs6cAhJs 2c4h8h7d"));
  }

  @Test
  public void test_omaha_holdem_257_3cJcJsKcQs_9d3s2dJh_Qd6h4s9h_Qc5c9c7s_Jd6c7h8s_6dKsThKh_Kd7cAs5s_9s8cAd6s_2cTsTcAh_4cAc7d4h() {
    assertEquals(
      "9s8cAd6s Qd6h4s9h Kd7cAs5s Jd6c7h8s 2cTsTcAh Qc5c9c7s 4cAc7d4h 9d3s2dJh 6dKsThKh",
      Solver.process("omaha-holdem 3cJcJsKcQs 9d3s2dJh Qd6h4s9h Qc5c9c7s Jd6c7h8s 6dKsThKh Kd7cAs5s 9s8cAd6s 2cTsTcAh 4cAc7d4h"));
  }

  @Test
  public void test_omaha_holdem_258_6h8hAdKdTc_6c8sQc3d_3s9h6sTd() {
    assertEquals(
      "6c8sQc3d 3s9h6sTd",
      Solver.process("omaha-holdem 6h8hAdKdTc 6c8sQc3d 3s9h6sTd"));
  }

  @Test
  public void test_omaha_holdem_259_5c6c6dAsJd_Qs6s6hKs_2h4hJsKh_3s9s3c3d_8sQc5dTd() {
    assertEquals(
      "3s9s3c3d 8sQc5dTd 2h4hJsKh Qs6s6hKs",
      Solver.process("omaha-holdem 5c6c6dAsJd Qs6s6hKs 2h4hJsKh 3s9s3c3d 8sQc5dTd"));
  }

  @Test
  public void test_omaha_holdem_260_4h5h7cJsKc_Jc8d2hAc_7h2d9h8h_4cAh7d6s_9c5sKs3s() {
    assertEquals(
      "7h2d9h8h Jc8d2hAc 4cAh7d6s 9c5sKs3s",
      Solver.process("omaha-holdem 4h5h7cJsKc Jc8d2hAc 7h2d9h8h 4cAh7d6s 9c5sKs3s"));
  }

  @Test
  public void test_omaha_holdem_261_4s5h6s7cTd_Qc9c4d2s_Jd4h7h3c_Tc2c9s3d_KdJsJc8s_2d8cAcKh_3hQsKsQd() {
    assertEquals(
      "2d8cAcKh Qc9c4d2s KdJsJc8s 3hQsKsQd Tc2c9s3d Jd4h7h3c",
      Solver.process("omaha-holdem 4s5h6s7cTd Qc9c4d2s Jd4h7h3c Tc2c9s3d KdJsJc8s 2d8cAcKh 3hQsKsQd"));
  }

  @Test
  public void test_omaha_holdem_262_7c7h8sAdJs_Jd6h5h9d_4h6c5d4c_Qc5cJhKh_3cThAhQh_Ks9s6sQd_TcTd3s6d_2cKd8c8h() {
    assertEquals(
      "Ks9s6sQd 4h6c5d4c TcTd3s6d Jd6h5h9d Qc5cJhKh 3cThAhQh 2cKd8c8h",
      Solver.process("omaha-holdem 7c7h8sAdJs Jd6h5h9d 4h6c5d4c Qc5cJhKh 3cThAhQh Ks9s6sQd TcTd3s6d 2cKd8c8h"));
  }

  @Test
  public void test_omaha_holdem_263_6d7dAcJcKc_6h4d2s9d_5c6s2h3c() {
    assertEquals(
      "6h4d2s9d 5c6s2h3c",
      Solver.process("omaha-holdem 6d7dAcJcKc 6h4d2s9d 5c6s2h3c"));
  }

  @Test
  public void test_omaha_holdem_264_3h6s9dAhKd_3d9h3s7c_6cTh8s8c_4h3c7hJs() {
    assertEquals(
      "4h3c7hJs 6cTh8s8c 3d9h3s7c",
      Solver.process("omaha-holdem 3h6s9dAhKd 3d9h3s7c 6cTh8s8c 4h3c7hJs"));
  }

  @Test
  public void test_omaha_holdem_265_2d2h5h8hJs_8d3cJh7c_8cTs8sKs_9sQd2cQh_2s5sJcQs() {
    assertEquals(
      "8d3cJh7c 9sQd2cQh 2s5sJcQs 8cTs8sKs",
      Solver.process("omaha-holdem 2d2h5h8hJs 8d3cJh7c 8cTs8sKs 9sQd2cQh 2s5sJcQs"));
  }

  @Test
  public void test_omaha_holdem_266_2c8h9hJhKd_5sTcAd5c_JsQhAs2d_8sKh4s4h_3d3sAh7s_6s4d6c9d_8dTd7dJc_5h8c3h5d_Ac7hJdQc() {
    assertEquals(
      "3d3sAh7s 5sTcAd5c 6s4d6c9d Ac7hJdQc JsQhAs2d 8dTd7dJc 5h8c3h5d 8sKh4s4h",
      Solver.process("omaha-holdem 2c8h9hJhKd 5sTcAd5c JsQhAs2d 8sKh4s4h 3d3sAh7s 6s4d6c9d 8dTd7dJc 5h8c3h5d Ac7hJdQc"));
  }

  @Test
  public void test_omaha_holdem_267_3c6h7cAhKc_Kd8sTc6c_Ts9hJd7h() {
    assertEquals(
      "Ts9hJd7h Kd8sTc6c",
      Solver.process("omaha-holdem 3c6h7cAhKc Kd8sTc6c Ts9hJd7h"));
  }

  @Test
  public void test_omaha_holdem_268_3h4h7d8cTh_2hJc5hQh_6d2s7s4c() {
    assertEquals(
      "6d2s7s4c 2hJc5hQh",
      Solver.process("omaha-holdem 3h4h7d8cTh 2hJc5hQh 6d2s7s4c"));
  }

  @Test
  public void test_omaha_holdem_269_8h9dAcKcQc_TsKs2s9h_Td8s7s6s_9s2dAs3h_Kh4c8d4s_AdJd4d3d() {
    assertEquals(
      "Td8s7s6s AdJd4d3d Kh4c8d4s TsKs2s9h 9s2dAs3h",
      Solver.process("omaha-holdem 8h9dAcKcQc TsKs2s9h Td8s7s6s 9s2dAs3h Kh4c8d4s AdJd4d3d"));
  }

  @Test
  public void test_omaha_holdem_270_5d7dKcKhQs_3sKs2c2d_9cJd5s7s_6c6h9h6d_3d8d6s3h_As5hAdAc() {
    assertEquals(
      "3d8d6s3h 6c6h9h6d 9cJd5s7s As5hAdAc 3sKs2c2d",
      Solver.process("omaha-holdem 5d7dKcKhQs 3sKs2c2d 9cJd5s7s 6c6h9h6d 3d8d6s3h As5hAdAc"));
  }

  @Test
  public void test_omaha_holdem_271_4h6c7h8dAd_5h2cJdTd_Kd4sKs3d_3h7cQhJc_2d9c7s8h_6hAs9s2h_3c5c5d9h_6sQdKcTs_Qc5sQsJh() {
    assertEquals(
      "5h2cJdTd 6sQdKcTs 3h7cQhJc Qc5sQsJh Kd4sKs3d 2d9c7s8h 6hAs9s2h 3c5c5d9h",
      Solver.process("omaha-holdem 4h6c7h8dAd 5h2cJdTd Kd4sKs3d 3h7cQhJc 2d9c7s8h 6hAs9s2h 3c5c5d9h 6sQdKcTs Qc5sQsJh"));
  }

  @Test
  public void test_omaha_holdem_272_2d3s7s8hKh_5d4s4dTd_4c5h7h2c_JcKc8s5s_9c9sAcJs_QcKsAdTc_6h8c8dTs_5c2s9dAs_7d7cQhTh_6sKd3h6d() {
    assertEquals(
      "5c2s9dAs 5d4s4dTd 9c9sAcJs QcKsAdTc 4c5h7h2c 6sKd3h6d JcKc8s5s 7d7cQhTh 6h8c8dTs",
      Solver.process("omaha-holdem 2d3s7s8hKh 5d4s4dTd 4c5h7h2c JcKc8s5s 9c9sAcJs QcKsAdTc 6h8c8dTs 5c2s9dAs 7d7cQhTh 6sKd3h6d"));
  }

  @Test
  public void test_omaha_holdem_273_3h5s9dAdJd_2h4s8dKs_Kh9c7hAh_Qs6sKd8h_7dThJhKc_9s3s3d5h_7c5c3c6h_Tc4dAs6d_5d8s7sQd() {
    assertEquals(
      "Qs6sKd8h 7dThJhKc 7c5c3c6h Kh9c7hAh 9s3s3d5h 2h4s8dKs Tc4dAs6d 5d8s7sQd",
      Solver.process("omaha-holdem 3h5s9dAdJd 2h4s8dKs Kh9c7hAh Qs6sKd8h 7dThJhKc 9s3s3d5h 7c5c3c6h Tc4dAs6d 5d8s7sQd"));
  }

  @Test
  public void test_omaha_holdem_274_2h7d9dKcQd_9h2dAd4h_6d7sKs5s_TdJdAc8c() {
    assertEquals(
      "6d7sKs5s TdJdAc8c 9h2dAd4h",
      Solver.process("omaha-holdem 2h7d9dKcQd 9h2dAd4h 6d7sKs5s TdJdAc8c"));
  }

  @Test
  public void test_omaha_holdem_275_4d8h8s9hKs_AdQh4sQd_3sAh6d3c() {
    assertEquals(
      "3sAh6d3c AdQh4sQd",
      Solver.process("omaha-holdem 4d8h8s9hKs AdQh4sQd 3sAh6d3c"));
  }

  @Test
  public void test_omaha_holdem_276_2h6s9sJhJs_5h6c3d8s_Qs3hKs9c_Tc5cAsQd_Jc9d3sAh() {
    assertEquals(
      "Tc5cAsQd 5h6c3d8s Qs3hKs9c Jc9d3sAh",
      Solver.process("omaha-holdem 2h6s9sJhJs 5h6c3d8s Qs3hKs9c Tc5cAsQd Jc9d3sAh"));
  }

  @Test
  public void test_omaha_holdem_277_4h5hAsKcTs_Ad9d5d7c_6d6s4s9h() {
    assertEquals(
      "6d6s4s9h Ad9d5d7c",
      Solver.process("omaha-holdem 4h5hAsKcTs Ad9d5d7c 6d6s4s9h"));
  }

  @Test
  public void test_omaha_holdem_278_2c2s6s7h8s_3hJdJs9d_Ah9s5hQc() {
    assertEquals(
      "3hJdJs9d Ah9s5hQc",
      Solver.process("omaha-holdem 2c2s6s7h8s 3hJdJs9d Ah9s5hQc"));
  }

  @Test
  public void test_omaha_holdem_279_4d5h6h8dJs_Ad7c3s4c_As5d2cAc_JcQc8hQh() {
    assertEquals(
      "As5d2cAc JcQc8hQh Ad7c3s4c",
      Solver.process("omaha-holdem 4d5h6h8dJs Ad7c3s4c As5d2cAc JcQc8hQh"));
  }

  @Test
  public void test_omaha_holdem_280_4sJdJhKsQd_3d9d9s4h_6d8h3c2d_AdQs8dAc_Th6cTd9h_5hKh6hJs_Jc7c5d9c() {
    assertEquals(
      "6d8h3c2d 3d9d9s4h AdQs8dAc Jc7c5d9c Th6cTd9h 5hKh6hJs",
      Solver.process("omaha-holdem 4sJdJhKsQd 3d9d9s4h 6d8h3c2d AdQs8dAc Th6cTd9h 5hKh6hJs Jc7c5d9c"));
  }

  @Test
  public void test_omaha_holdem_281_6d8d9c9dKc_2d7s3s3d_5cJhJc4h_Qd8hAhJd_9s2hQc5d_AcKs6cJs() {
    assertEquals(
      "5cJhJc4h AcKs6cJs 9s2hQc5d 2d7s3s3d Qd8hAhJd",
      Solver.process("omaha-holdem 6d8d9c9dKc 2d7s3s3d 5cJhJc4h Qd8hAhJd 9s2hQc5d AcKs6cJs"));
  }

  @Test
  public void test_omaha_holdem_282_2dAhKcKhTh_4sQdTcJc_5h3sJd9c_9s4c2c3c() {
    assertEquals(
      "5h3sJd9c 9s4c2c3c 4sQdTcJc",
      Solver.process("omaha-holdem 2dAhKcKhTh 4sQdTcJc 5h3sJd9c 9s4c2c3c"));
  }

  @Test
  public void test_omaha_holdem_283_3d5c7d7hAc_4hAs2d4s_ThTcAh3s_8h2sQhTs_Js6c3hKs_5s3c7sQd_5hJhJd9d() {
    assertEquals(
      "8h2sQhTs Js6c3hKs 5hJhJd9d ThTcAh3s 4hAs2d4s 5s3c7sQd",
      Solver.process("omaha-holdem 3d5c7d7hAc 4hAs2d4s ThTcAh3s 8h2sQhTs Js6c3hKs 5s3c7sQd 5hJhJd9d"));
  }

  @Test
  public void test_omaha_holdem_284_3h8dJsTcTh_Ad2s9dTd_9s4s7dQh_9c9h2h7c_7h3s6hKd_Jc5d5h7s_Ah6cTs8c_Jh4hKh4c_4dQdAs5c() {
    assertEquals(
      "4dQdAs5c 7h3s6hKd Jc5d5h7s Jh4hKh4c Ad2s9dTd 9c9h2h7c 9s4s7dQh Ah6cTs8c",
      Solver.process("omaha-holdem 3h8dJsTcTh Ad2s9dTd 9s4s7dQh 9c9h2h7c 7h3s6hKd Jc5d5h7s Ah6cTs8c Jh4hKh4c 4dQdAs5c"));
  }

  @Test
  public void test_omaha_holdem_285_2s3h7h7sKs_8dKdAc9c_3dAh6s5c_6cKc9hTc_ThJc5sAd_2hTs4s2d_AsTd8h5h_8s3sJsQd() {
    assertEquals(
      "AsTd8h5h ThJc5sAd 3dAh6s5c 6cKc9hTc 8dKdAc9c 8s3sJsQd 2hTs4s2d",
      Solver.process("omaha-holdem 2s3h7h7sKs 8dKdAc9c 3dAh6s5c 6cKc9hTc ThJc5sAd 2hTs4s2d AsTd8h5h 8s3sJsQd"));
  }

  @Test
  public void test_omaha_holdem_286_5sAhJdThTs_4cJcAdKd_8d2cTd4d() {
    assertEquals(
      "4cJcAdKd 8d2cTd4d",
      Solver.process("omaha-holdem 5sAhJdThTs 4cJcAdKd 8d2cTd4d"));
  }

  @Test
  public void test_omaha_holdem_287_2d5sKcKhQd_2s8c3h8h_Ks7h3cQc_8s4d6h9d_6d3s5h9c_6cKdAdQh_7c7sJsQs() {
    assertEquals(
      "8s4d6h9d 6d3s5h9c 2s8c3h8h 7c7sJsQs 6cKdAdQh=Ks7h3cQc",
      Solver.process("omaha-holdem 2d5sKcKhQd 2s8c3h8h Ks7h3cQc 8s4d6h9d 6d3s5h9c 6cKdAdQh 7c7sJsQs"));
  }

  @Test
  public void test_omaha_holdem_288_2d5d6c6sKh_8d4c9sTc_Ks6hQs2c_6d2sQd9c_AhJs4hKd_As2h3d5c_Ts3s7h8h_5h5s3cJc_3h7sAc7d() {
    assertEquals(
      "Ts3s7h8h 8d4c9sTc As2h3d5c 3h7sAc7d AhJs4hKd 5h5s3cJc 6d2sQd9c Ks6hQs2c",
      Solver.process("omaha-holdem 2d5d6c6sKh 8d4c9sTc Ks6hQs2c 6d2sQd9c AhJs4hKd As2h3d5c Ts3s7h8h 5h5s3cJc 3h7sAc7d"));
  }

  @Test
  public void test_omaha_holdem_289_3s5c6d9c9h_6c7sQsJh_KsAsQd6h_Tc2h2d3c_JdThAc8s_Ts5h5s9s() {
    assertEquals(
      "JdThAc8s Tc2h2d3c 6c7sQsJh KsAsQd6h Ts5h5s9s",
      Solver.process("omaha-holdem 3s5c6d9c9h 6c7sQsJh KsAsQd6h Tc2h2d3c JdThAc8s Ts5h5s9s"));
  }

  @Test
  public void test_omaha_holdem_290_4h6c8sAhKs_4sQhTs3d_7dAd7hAs_2d3sTd5c_5hKhQc2h_8c2s7s2c_4dJc3hKc_3cTc9d6h() {
    assertEquals(
      "2d3sTd5c 4sQhTs3d 3cTc9d6h 8c2s7s2c 5hKhQc2h 4dJc3hKc 7dAd7hAs",
      Solver.process("omaha-holdem 4h6c8sAhKs 4sQhTs3d 7dAd7hAs 2d3sTd5c 5hKhQc2h 8c2s7s2c 4dJc3hKc 3cTc9d6h"));
  }

  @Test
  public void test_omaha_holdem_291_3h4c7s9sAs_Ah9d6cTd_3d5dJhTc_6h8dAd9h_KcQd4h5s() {
    assertEquals(
      "3d5dJhTc KcQd4h5s 6h8dAd9h=Ah9d6cTd",
      Solver.process("omaha-holdem 3h4c7s9sAs Ah9d6cTd 3d5dJhTc 6h8dAd9h KcQd4h5s"));
  }

  @Test
  public void test_omaha_holdem_292_2c2h4c7s9c_9sKc8s2d_7c3c5d2s() {
    assertEquals(
      "7c3c5d2s 9sKc8s2d",
      Solver.process("omaha-holdem 2c2h4c7s9c 9sKc8s2d 7c3c5d2s"));
  }

  @Test
  public void test_omaha_holdem_293_4d4s8d9dKs_Jh4c3d2d_Kd9s9h6d_As8c2c5s_Qh8h7dJd() {
    assertEquals(
      "As8c2c5s Jh4c3d2d Qh8h7dJd Kd9s9h6d",
      Solver.process("omaha-holdem 4d4s8d9dKs Jh4c3d2d Kd9s9h6d As8c2c5s Qh8h7dJd"));
  }

  @Test
  public void test_omaha_holdem_294_6c6d7c8sJc_4h9d3d2d_4d8dKcQh_Kh3cTc5h() {
    assertEquals(
      "4h9d3d2d 4d8dKcQh Kh3cTc5h",
      Solver.process("omaha-holdem 6c6d7c8sJc 4h9d3d2d 4d8dKcQh Kh3cTc5h"));
  }

  @Test
  public void test_omaha_holdem_295_2d5c8cAdKs_Jc6d3h3d_5hKd9sKh_5sTs6h7s_3c7d2sJs_AhAs3sQc_QhQs7cTd_9d6c4c2h_Qd8s5d9c_2cTh4sJh() {
    assertEquals(
      "9d6c4c2h 2cTh4sJh=3c7d2sJs Jc6d3h3d 5sTs6h7s QhQs7cTd Qd8s5d9c 5hKd9sKh AhAs3sQc",
      Solver.process("omaha-holdem 2d5c8cAdKs Jc6d3h3d 5hKd9sKh 5sTs6h7s 3c7d2sJs AhAs3sQc QhQs7cTd 9d6c4c2h Qd8s5d9c 2cTh4sJh"));
  }

  @Test
  public void test_omaha_holdem_296_4c5h8hQcTh_Ks9s8c9h_QsKc5sJs_6c2hAs7c_2c3d7s5d() {
    assertEquals(
      "2c3d7s5d Ks9s8c9h QsKc5sJs 6c2hAs7c",
      Solver.process("omaha-holdem 4c5h8hQcTh Ks9s8c9h QsKc5sJs 6c2hAs7c 2c3d7s5d"));
  }

  @Test
  public void test_omaha_holdem_297_5s6d8sAsJh_Kc3s4dTs_4cKh3cQd_9s9c2c7d_8h5c4s2s_JdKdAh3h_6hThQh2h() {
    assertEquals(
      "4cKh3cQd 6hThQh2h JdKdAh3h 9s9c2c7d 8h5c4s2s Kc3s4dTs",
      Solver.process("omaha-holdem 5s6d8sAsJh Kc3s4dTs 4cKh3cQd 9s9c2c7d 8h5c4s2s JdKdAh3h 6hThQh2h"));
  }

  @Test
  public void test_omaha_holdem_298_3d4c6c9hKh_Qc6d5sJh_2dAd9dKd_8dAc9s6s_5c3h2hJd_9c7s5h6h_4dTdTs7d() {
    assertEquals(
      "Qc6d5sJh 4dTdTs7d 8dAc9s6s 2dAd9dKd 5c3h2hJd 9c7s5h6h",
      Solver.process("omaha-holdem 3d4c6c9hKh Qc6d5sJh 2dAd9dKd 8dAc9s6s 5c3h2hJd 9c7s5h6h 4dTdTs7d"));
  }

  @Test
  public void test_omaha_holdem_299_2h6c6sAdKc_6h3cKd2d_5h9sJh8d_4hQd3hJd_Qc4sTd8h_TsAh3s8s_7sTcKhQh() {
    assertEquals(
      "5h9sJh8d Qc4sTd8h 4hQd3hJd 7sTcKhQh TsAh3s8s 6h3cKd2d",
      Solver.process("omaha-holdem 2h6c6sAdKc 6h3cKd2d 5h9sJh8d 4hQd3hJd Qc4sTd8h TsAh3s8s 7sTcKhQh"));
  }

  @Test
  public void test_omaha_holdem_300_2c4dAcJdTs_AhQs7d3h_2dKdQc6d() {
    assertEquals(
      "AhQs7d3h 2dKdQc6d",
      Solver.process("omaha-holdem 2c4dAcJdTs AhQs7d3h 2dKdQc6d"));
  }

  @Test
  public void test_omaha_holdem_301_2h3c4s7d8h_JcQh5c4d_JdTd9sAd_5s7sQd9c_AhTh3s3h_6hKs9hAc_JhTc5h3d_As2c5d6c_8c4cTsQs() {
    assertEquals(
      "JdTd9sAd 6hKs9hAc JhTc5h3d JcQh5c4d 5s7sQd9c 8c4cTsQs AhTh3s3h As2c5d6c",
      Solver.process("omaha-holdem 2h3c4s7d8h JcQh5c4d JdTd9sAd 5s7sQd9c AhTh3s3h 6hKs9hAc JhTc5h3d As2c5d6c 8c4cTsQs"));
  }

  @Test
  public void test_omaha_holdem_302_5s6c6hAhAs_8d8sJd4d_3h2h7c7h_5c9d9h3d_Qd5h4c7d_Th6sAc3s_8c9sTdKd_Js2s9c4h() {
    assertEquals(
      "Js2s9c4h 8c9sTdKd Qd5h4c7d 3h2h7c7h 8d8sJd4d 5c9d9h3d Th6sAc3s",
      Solver.process("omaha-holdem 5s6c6hAhAs 8d8sJd4d 3h2h7c7h 5c9d9h3d Qd5h4c7d Th6sAc3s 8c9sTdKd Js2s9c4h"));
  }

  @Test
  public void test_omaha_holdem_303_2c6d7h7sQs_4s5sAd6c_5c9d8c3d_KdAcKh2s() {
    assertEquals(
      "5c9d8c3d 4s5sAd6c KdAcKh2s",
      Solver.process("omaha-holdem 2c6d7h7sQs 4s5sAd6c 5c9d8c3d KdAcKh2s"));
  }

  @Test
  public void test_omaha_holdem_304_4s6dQcQsTs_4dAh3d5s_AcTh7c9s_7dTc5d2d_2hKsKhKc_Kd7s8c7h_3sTd6c3h_8h4h6h2s_9d5h9h5c() {
    assertEquals(
      "4dAh3d5s 8h4h6h2s Kd7s8c7h 9d5h9h5c 3sTd6c3h 7dTc5d2d AcTh7c9s 2hKsKhKc",
      Solver.process("omaha-holdem 4s6dQcQsTs 4dAh3d5s AcTh7c9s 7dTc5d2d 2hKsKhKc Kd7s8c7h 3sTd6c3h 8h4h6h2s 9d5h9h5c"));
  }

  @Test
  public void test_omaha_holdem_305_3h7d7sJsTh_8sQs2s6d_7hKsKd2d_2h4s9c7c_4d9s4c6s_6cJc9h6h_9d5cTdJh_Qc3s5dAh() {
    assertEquals(
      "8sQs2s6d Qc3s5dAh 4d9s4c6s 6cJc9h6h 9d5cTdJh 2h4s9c7c 7hKsKd2d",
      Solver.process("omaha-holdem 3h7d7sJsTh 8sQs2s6d 7hKsKd2d 2h4s9c7c 4d9s4c6s 6cJc9h6h 9d5cTdJh Qc3s5dAh"));
  }

  @Test
  public void test_omaha_holdem_306_6h7s8s9dQd_QhKhKs2d_Jh6dAh4h_Qs3h8hAc_Qc9cTdTh_7h6s5h5c_9s2s4s3d() {
    assertEquals(
      "Jh6dAh4h 9s2s4s3d QhKhKs2d Qs3h8hAc 7h6s5h5c Qc9cTdTh",
      Solver.process("omaha-holdem 6h7s8s9dQd QhKhKs2d Jh6dAh4h Qs3h8hAc Qc9cTdTh 7h6s5h5c 9s2s4s3d"));
  }

  @Test
  public void test_omaha_holdem_307_2s4c6d7h8s_9d5dKhTs_3dJs9c6h_Tc4d4s9h() {
    assertEquals(
      "3dJs9c6h 9d5dKhTs=Tc4d4s9h",
      Solver.process("omaha-holdem 2s4c6d7h8s 9d5dKhTs 3dJs9c6h Tc4d4s9h"));
  }

  @Test
  public void test_omaha_holdem_308_3s4s8dKdQs_7cQh6hAh_QdAsJdKs_2hAd2s6c_4c9hKhJh_7h2c9c8c_3h3d5d5h_8h3cTdTh_9d2d7d6s_4dJcJs5s() {
    assertEquals(
      "9d2d7d6s 2hAd2s6c 7h2c9c8c 7cQh6hAh 8h3cTdTh 4c9hKhJh 3h3d5d5h 4dJcJs5s QdAsJdKs",
      Solver.process("omaha-holdem 3s4s8dKdQs 7cQh6hAh QdAsJdKs 2hAd2s6c 4c9hKhJh 7h2c9c8c 3h3d5d5h 8h3cTdTh 9d2d7d6s 4dJcJs5s"));
  }

  @Test
  public void test_omaha_holdem_309_4c4s7c7sJs_2cQdAs2d_Jc8dAh5s_8c7hKhAc_Ad9c6s5h_3c3h9d3d() {
    assertEquals(
      "Ad9c6s5h 2cQdAs2d 3c3h9d3d Jc8dAh5s 8c7hKhAc",
      Solver.process("omaha-holdem 4c4s7c7sJs 2cQdAs2d Jc8dAh5s 8c7hKhAc Ad9c6s5h 3c3h9d3d"));
  }

  @Test
  public void test_omaha_holdem_310_7d7sAhJhQc_3h6h8sKd_3s2cAd6s_3cKc9cJd_Ts2h8cJc_Qh7cJs5h() {
    assertEquals(
      "3h6h8sKd Ts2h8cJc 3cKc9cJd 3s2cAd6s Qh7cJs5h",
      Solver.process("omaha-holdem 7d7sAhJhQc 3h6h8sKd 3s2cAd6s 3cKc9cJd Ts2h8cJc Qh7cJs5h"));
  }

  @Test
  public void test_omaha_holdem_311_3c3h4d6c7d_JdJc8d4s_Qc8hKc3d_Td5s6d9d_AdTcKdAs_7hKs2d9s_Ah9h2s5h() {
    assertEquals(
      "7hKs2d9s JdJc8d4s AdTcKdAs Qc8hKc3d Ah9h2s5h Td5s6d9d",
      Solver.process("omaha-holdem 3c3h4d6c7d JdJc8d4s Qc8hKc3d Td5s6d9d AdTcKdAs 7hKs2d9s Ah9h2s5h"));
  }

  @Test
  public void test_omaha_holdem_312_4h5s8d9sQc_Kd6c2s7s_4s3hAhAs() {
    assertEquals(
      "4s3hAhAs Kd6c2s7s",
      Solver.process("omaha-holdem 4h5s8d9sQc Kd6c2s7s 4s3hAhAs"));
  }

  @Test
  public void test_omaha_holdem_313_2c6c7h9dTs_2h2dKh5s_4s6h6dJh_4dTh5dQh_4h7cJd9c_8sQcJsKs_Jc5h8dTd_2s9sQs5c_QdKc4c3d() {
    assertEquals(
      "QdKc4c3d 4dTh5dQh 2s9sQs5c 4h7cJd9c 2h2dKh5s 4s6h6dJh 8sQcJsKs=Jc5h8dTd",
      Solver.process("omaha-holdem 2c6c7h9dTs 2h2dKh5s 4s6h6dJh 4dTh5dQh 4h7cJd9c 8sQcJsKs Jc5h8dTd 2s9sQs5c QdKc4c3d"));
  }

  @Test
  public void test_omaha_holdem_314_3s4h6h9cJd_3hKc2h7c_Jc6sQcKh_TcAs7hTh_Ks5hQd8c_Kd2cTd8d_9hAh6d6c_7s5d4c4d_2s3c8s2d() {
    assertEquals(
      "Kd2cTd8d Ks5hQd8c 2s3c8s2d 3hKc2h7c TcAs7hTh Jc6sQcKh 9hAh6d6c 7s5d4c4d",
      Solver.process("omaha-holdem 3s4h6h9cJd 3hKc2h7c Jc6sQcKh TcAs7hTh Ks5hQd8c Kd2cTd8d 9hAh6d6c 7s5d4c4d 2s3c8s2d"));
  }

  @Test
  public void test_omaha_holdem_315_3h3s9hKdQh_Kh4h7sTc_8sKsAc6c() {
    assertEquals(
      "8sKsAc6c Kh4h7sTc",
      Solver.process("omaha-holdem 3h3s9hKdQh Kh4h7sTc 8sKsAc6c"));
  }

  @Test
  public void test_omaha_holdem_316_2s3d6s8s9h_JsJd8c4c_4sTd7h8h_4hQsKs3h() {
    assertEquals(
      "JsJd8c4c 4sTd7h8h 4hQsKs3h",
      Solver.process("omaha-holdem 2s3d6s8s9h JsJd8c4c 4sTd7h8h 4hQsKs3h"));
  }

  @Test
  public void test_omaha_holdem_317_2h7d7hAcJd_Kd9c5cTd_3hJh4cKs_3sTs2c7s_4s9dJs6d_2s6s2dAh() {
    assertEquals(
      "Kd9c5cTd 4s9dJs6d 3hJh4cKs 2s6s2dAh 3sTs2c7s",
      Solver.process("omaha-holdem 2h7d7hAcJd Kd9c5cTd 3hJh4cKs 3sTs2c7s 4s9dJs6d 2s6s2dAh"));
  }

  @Test
  public void test_omaha_holdem_318_4d6s7sJhQs_Ac2s6hTh_3cQd2d4c_8c9d4sKd_6dJc8d5h_7hKhTs3s_As9s3h9h_6cJs2cTc_QcAd9c8s_Ah7c2hKc() {
    assertEquals(
      "8c9d4sKd Ac2s6hTh Ah7c2hKc QcAd9c8s 6cJs2cTc 3cQd2d4c 6dJc8d5h 7hKhTs3s As9s3h9h",
      Solver.process("omaha-holdem 4d6s7sJhQs Ac2s6hTh 3cQd2d4c 8c9d4sKd 6dJc8d5h 7hKhTs3s As9s3h9h 6cJs2cTc QcAd9c8s Ah7c2hKc"));
  }

  @Test
  public void test_omaha_holdem_319_5d5sAsKhKs_7h8dJs8h_Kc4c6hAd_Jc9s2hKd_Jh9d4h2s_AhTd3c5h_Qh7s7dJd_3s8sQs3d_6cQcQdTc_4d2d3h8c() {
    assertEquals(
      "4d2d3h8c Jh9d4h2s Qh7s7dJd 7h8dJs8h 6cQcQdTc Jc9s2hKd 3s8sQs3d AhTd3c5h Kc4c6hAd",
      Solver.process("omaha-holdem 5d5sAsKhKs 7h8dJs8h Kc4c6hAd Jc9s2hKd Jh9d4h2s AhTd3c5h Qh7s7dJd 3s8sQs3d 6cQcQdTc 4d2d3h8c"));
  }

  @Test
  public void test_omaha_holdem_320_7c8sAdTdTh_9c3c4c9s_4hAhKdTs_2hJh8c6h_7h5sAs2s_9h6dJs5d_6s8dQh8h_AcKs7sJc_5h7d9dQc_3dJdKh5c() {
    assertEquals(
      "3dJdKh5c 5h7d9dQc 2hJh8c6h 9c3c4c9s 7h5sAs2s AcKs7sJc 9h6dJs5d 6s8dQh8h 4hAhKdTs",
      Solver.process("omaha-holdem 7c8sAdTdTh 9c3c4c9s 4hAhKdTs 2hJh8c6h 7h5sAs2s 9h6dJs5d 6s8dQh8h AcKs7sJc 5h7d9dQc 3dJdKh5c"));
  }

  @Test
  public void test_omaha_holdem_321_AdKhKsQdQs_8s6dThQc_4d4cJdQh_7s8d7d5d_TdJsAh6c_3d9dJc3c_6hKdKcTs_9h2d6s4h_8c5s3sAc() {
    assertEquals(
      "9h2d6s4h 3d9dJc3c 7s8d7d5d 8c5s3sAc 8s6dThQc 4d4cJdQh TdJsAh6c 6hKdKcTs",
      Solver.process("omaha-holdem AdKhKsQdQs 8s6dThQc 4d4cJdQh 7s8d7d5d TdJsAh6c 3d9dJc3c 6hKdKcTs 9h2d6s4h 8c5s3sAc"));
  }

  @Test
  public void test_omaha_holdem_322_7s8h9dJdTh_Tc8d5h2d_2c9s9hAd_3s6d9c6h_Ah8cQcKd_Kc2s4h3c_5d3h5sTs() {
    assertEquals(
      "Kc2s4h3c 5d3h5sTs 2c9s9hAd 3s6d9c6h Tc8d5h2d Ah8cQcKd",
      Solver.process("omaha-holdem 7s8h9dJdTh Tc8d5h2d 2c9s9hAd 3s6d9c6h Ah8cQcKd Kc2s4h3c 5d3h5sTs"));
  }

  @Test
  public void test_omaha_holdem_323_2c2s5c5dJs_4c9c4d9s_QcQsTc7h_Th7s4sKc_Kd6dAd9d() {
    assertEquals(
      "Th7s4sKc Kd6dAd9d 4c9c4d9s QcQsTc7h",
      Solver.process("omaha-holdem 2c2s5c5dJs 4c9c4d9s QcQsTc7h Th7s4sKc Kd6dAd9d"));
  }

  @Test
  public void test_omaha_holdem_324_2c2h3dAsTs_QhJd5dTd_AhQd7s3c() {
    assertEquals(
      "QhJd5dTd AhQd7s3c",
      Solver.process("omaha-holdem 2c2h3dAsTs QhJd5dTd AhQd7s3c"));
  }

  @Test
  public void test_omaha_holdem_325_2d4d4s6sJd_Tc6d6h3h_Kh9dKc2h_3c3d4cKs_9h5c6c7s() {
    assertEquals(
      "9h5c6c7s Kh9dKc2h 3c3d4cKs Tc6d6h3h",
      Solver.process("omaha-holdem 2d4d4s6sJd Tc6d6h3h Kh9dKc2h 3c3d4cKs 9h5c6c7s"));
  }

  @Test
  public void test_omaha_holdem_326_2c7d7h8hKs_ThJc8cTd_3h7s2sQh_As6h3dKd() {
    assertEquals(
      "ThJc8cTd As6h3dKd 3h7s2sQh",
      Solver.process("omaha-holdem 2c7d7h8hKs ThJc8cTd 3h7s2sQh As6h3dKd"));
  }

  @Test
  public void test_omaha_holdem_327_4c5sJsKhQc_8d3h8hAh_KdAd3d8s_5d7d5hQs_9cJc5c3s_6cThAs6h() {
    assertEquals(
      "8d3h8hAh KdAd3d8s 9cJc5c3s 5d7d5hQs 6cThAs6h",
      Solver.process("omaha-holdem 4c5sJsKhQc 8d3h8hAh KdAd3d8s 5d7d5hQs 9cJc5c3s 6cThAs6h"));
  }

  @Test
  public void test_omaha_holdem_328_2s3d6c8dTs_8s3h2c8h_9dTc5cJh_4h9h7c2d_5hQd4sAc() {
    assertEquals(
      "9dTc5cJh 8s3h2c8h 5hQd4sAc 4h9h7c2d",
      Solver.process("omaha-holdem 2s3d6c8dTs 8s3h2c8h 9dTc5cJh 4h9h7c2d 5hQd4sAc"));
  }

  @Test
  public void test_omaha_holdem_329_5cJcJdQdQh_4s6cQsKc_8d9h3cTs_8s3sAh5h_2h9d8hQc_2cAd3h9c_3d8c7sAs_2s4hTd5d_7hKh6dJh() {
    assertEquals(
      "8d9h3cTs 3d8c7sAs 2cAd3h9c 2s4hTd5d 8s3sAh5h 7hKh6dJh 2h9d8hQc 4s6cQsKc",
      Solver.process("omaha-holdem 5cJcJdQdQh 4s6cQsKc 8d9h3cTs 8s3sAh5h 2h9d8hQc 2cAd3h9c 3d8c7sAs 2s4hTd5d 7hKh6dJh"));
  }

  @Test
  public void test_omaha_holdem_330_7c8h9hJdQh_KhQdJh9s_6sQs5h6d_3hTdAs9d_3cAd8sQc_6hTs7hAc_8cAhTh2d() {
    assertEquals(
      "3cAd8sQc 6sQs5h6d 3hTdAs9d 6hTs7hAc KhQdJh9s 8cAhTh2d",
      Solver.process("omaha-holdem 7c8h9hJdQh KhQdJh9s 6sQs5h6d 3hTdAs9d 3cAd8sQc 6hTs7hAc 8cAhTh2d"));
  }

  @Test
  public void test_omaha_holdem_331_7cKdQhQsTh_Kc9dAc4d_AhJs8s5h_2cKh2h8h_5s3d9sTd_Qc5dKs3s_8cQd9c2s_AsJhJd4s_5c6c8d7h() {
    assertEquals(
      "5c6c8d7h 5s3d9sTd 2cKh2h8h Kc9dAc4d 8cQd9c2s AhJs8s5h=AsJhJd4s Qc5dKs3s",
      Solver.process("omaha-holdem 7cKdQhQsTh Kc9dAc4d AhJs8s5h 2cKh2h8h 5s3d9sTd Qc5dKs3s 8cQd9c2s AsJhJd4s 5c6c8d7h"));
  }

  @Test
  public void test_omaha_holdem_332_5d5hJsTdTh_Jd3cJhQs_6d4c2cKh_9h3h4h3s() {
    assertEquals(
      "6d4c2cKh 9h3h4h3s Jd3cJhQs",
      Solver.process("omaha-holdem 5d5hJsTdTh Jd3cJhQs 6d4c2cKh 9h3h4h3s"));
  }

  @Test
  public void test_omaha_holdem_333_3hJsTcTdTh_4s8d6c4h_9d6sJh7d_4c5s3c5c_4d6d8cAc_Ad8hJcJd_QcTsQd7s_3dAs9hKd_3s9s2sKs() {
    assertEquals(
      "9d6sJh7d 3s9s2sKs 4d6d8cAc 3dAs9hKd 4s8d6c4h 4c5s3c5c Ad8hJcJd QcTsQd7s",
      Solver.process("omaha-holdem 3hJsTcTdTh 4s8d6c4h 9d6sJh7d 4c5s3c5c 4d6d8cAc Ad8hJcJd QcTsQd7s 3dAs9hKd 3s9s2sKs"));
  }

  @Test
  public void test_omaha_holdem_334_2h2s3d5h8c_4hQc3h6s_8hJc9h5c_JdTc9c7s() {
    assertEquals(
      "JdTc9c7s 8hJc9h5c 4hQc3h6s",
      Solver.process("omaha-holdem 2h2s3d5h8c 4hQc3h6s 8hJc9h5c JdTc9c7s"));
  }

  @Test
  public void test_omaha_holdem_335_2c5h5sKcKh_9cAsQhTc_7d8h6c2s_3dKsTdJc_8d4cJsTh_Ad8cKd4s_2d7c3cQs_5c9hAhJh() {
    assertEquals(
      "8d4cJsTh 9cAsQhTc 7d8h6c2s 2d7c3cQs 5c9hAhJh 3dKsTdJc Ad8cKd4s",
      Solver.process("omaha-holdem 2c5h5sKcKh 9cAsQhTc 7d8h6c2s 3dKsTdJc 8d4cJsTh Ad8cKd4s 2d7c3cQs 5c9hAhJh"));
  }

  @Test
  public void test_omaha_holdem_336_4h6s9c9hTh_AdTc2s4c_4s5dKh4d_Js3sKd2c_5sTd8hAc_Ah6dQs5h_Qc3h2dJc_8cQh7c7s_8sKsQd5c_2hKcTs9s() {
    assertEquals(
      "Qc3h2dJc Js3sKd2c 8sKsQd5c 5sTd8hAc=AdTc2s4c 8cQh7c7s Ah6dQs5h 4s5dKh4d 2hKcTs9s",
      Solver.process("omaha-holdem 4h6s9c9hTh AdTc2s4c 4s5dKh4d Js3sKd2c 5sTd8hAc Ah6dQs5h Qc3h2dJc 8cQh7c7s 8sKsQd5c 2hKcTs9s"));
  }

  @Test
  public void test_omaha_holdem_337_2c3d4h8dKs_9sAsAc4d_5c9h4cKh_3hQd7d3s() {
    assertEquals(
      "9sAsAc4d 5c9h4cKh 3hQd7d3s",
      Solver.process("omaha-holdem 2c3d4h8dKs 9sAsAc4d 5c9h4cKh 3hQd7d3s"));
  }

  @Test
  public void test_omaha_holdem_338_2d5c5d8hJs_9cAh2h7d_Ad2s6s3d_QsKsAs3c_8cKc5h4d_9s9h3s7s_Th6c7hTd_4sKh4cJh() {
    assertEquals(
      "QsKsAs3c 9cAh2h7d=Ad2s6s3d 9s9h3s7s Th6c7hTd 4sKh4cJh 8cKc5h4d",
      Solver.process("omaha-holdem 2d5c5d8hJs 9cAh2h7d Ad2s6s3d QsKsAs3c 8cKc5h4d 9s9h3s7s Th6c7hTd 4sKh4cJh"));
  }

  @Test
  public void test_omaha_holdem_339_2c4h6sKcKs_Qc3c2s8d_Qd8s5sTh_2d9d4dKd() {
    assertEquals(
      "Qd8s5sTh Qc3c2s8d 2d9d4dKd",
      Solver.process("omaha-holdem 2c4h6sKcKs Qc3c2s8d Qd8s5sTh 2d9d4dKd"));
  }

  @Test
  public void test_omaha_holdem_340_4d5c9cTcTh_AcAd7sAs_Ts7cKh4c_5dJcQs9d_Qh2c7dQc_8h6d4s2h_JhQdKd2d_7h2s3h8s_Jd3sKsAh_8dTd9hJs() {
    assertEquals(
      "7h2s3h8s JhQdKd2d Jd3sKsAh 8h6d4s2h 5dJcQs9d AcAd7sAs Qh2c7dQc Ts7cKh4c 8dTd9hJs",
      Solver.process("omaha-holdem 4d5c9cTcTh AcAd7sAs Ts7cKh4c 5dJcQs9d Qh2c7dQc 8h6d4s2h JhQdKd2d 7h2s3h8s Jd3sKsAh 8dTd9hJs"));
  }

  @Test
  public void test_omaha_holdem_341_4h8dAcTdTs_8hKh4cJs_Kd7hTh7c_9d4d6dKs_2s3hTc6h_QsAsJdQc_3sAh2d8c() {
    assertEquals(
      "9d4d6dKs 8hKh4cJs 3sAh2d8c QsAsJdQc 2s3hTc6h Kd7hTh7c",
      Solver.process("omaha-holdem 4h8dAcTdTs 8hKh4cJs Kd7hTh7c 9d4d6dKs 2s3hTc6h QsAsJdQc 3sAh2d8c"));
  }

  @Test
  public void test_omaha_holdem_342_2d4h5h9dQd_3hJsTh4d_9hTs5dAs_QcJd3d8d_Ah4s5s3c_KhAd7dKc_6s6c9c8h() {
    assertEquals(
      "3hJsTh4d 6s6c9c8h 9hTs5dAs Ah4s5s3c QcJd3d8d KhAd7dKc",
      Solver.process("omaha-holdem 2d4h5h9dQd 3hJsTh4d 9hTs5dAs QcJd3d8d Ah4s5s3c KhAd7dKc 6s6c9c8h"));
  }

  @Test
  public void test_omaha_holdem_343_3h3s4c8hJs_Qc6d3c4s_Ah4h3dQs() {
    assertEquals(
      "Ah4h3dQs=Qc6d3c4s",
      Solver.process("omaha-holdem 3h3s4c8hJs Qc6d3c4s Ah4h3dQs"));
  }

  @Test
  public void test_omaha_holdem_344_4h8d9hQdTh_9d7c2hAs_4cQsAc7s_3c6sTsJd_Ad5dAh8h_9s6cJc6d() {
    assertEquals(
      "9d7c2hAs 4cQsAc7s 3c6sTsJd=9s6cJc6d Ad5dAh8h",
      Solver.process("omaha-holdem 4h8d9hQdTh 9d7c2hAs 4cQsAc7s 3c6sTsJd Ad5dAh8h 9s6cJc6d"));
  }

  @Test
  public void test_omaha_holdem_345_2h2s7cJsTs_Kh2d6c3s_Qs6d5d6h_4c8dKs7s_Qd8c7d4h() {
    assertEquals(
      "Qs6d5d6h Qd8c7d4h Kh2d6c3s 4c8dKs7s",
      Solver.process("omaha-holdem 2h2s7cJsTs Kh2d6c3s Qs6d5d6h 4c8dKs7s Qd8c7d4h"));
  }

  @Test
  public void test_omaha_holdem_346_2d3h6c6dJd_4c8hAsKd_7dTsQsQh_4d9dAd5d() {
    assertEquals(
      "4c8hAsKd 7dTsQsQh 4d9dAd5d",
      Solver.process("omaha-holdem 2d3h6c6dJd 4c8hAsKd 7dTsQsQh 4d9dAd5d"));
  }

  @Test
  public void test_omaha_holdem_347_4d4h7s8c8d_Jd3h3cQc_8h2hQsJs_JcQh5sAd_Ah9d7dKc_5cKdQd6c_TsAs4sTh_Jh7hKs4c_2c9h5d5h() {
    assertEquals(
      "JcQh5sAd Jd3h3cQc 2c9h5d5h Ah9d7dKc TsAs4sTh 8h2hQsJs 5cKdQd6c Jh7hKs4c",
      Solver.process("omaha-holdem 4d4h7s8c8d Jd3h3cQc 8h2hQsJs JcQh5sAd Ah9d7dKc 5cKdQd6c TsAs4sTh Jh7hKs4c 2c9h5d5h"));
  }

  @Test
  public void test_omaha_holdem_348_2c5c6s7dQd_4h5h5sAh_QhTd4sTh_AdKsJs9h_6c4d2s3c_6dQc9c7s_8h2d4c8s_7hAcKdQs_3sAsJcJh() {
    assertEquals(
      "AdKsJs9h 3sAsJcJh QhTd4sTh 6dQc9c7s=7hAcKdQs 4h5h5sAh 6c4d2s3c 8h2d4c8s",
      Solver.process("omaha-holdem 2c5c6s7dQd 4h5h5sAh QhTd4sTh AdKsJs9h 6c4d2s3c 6dQc9c7s 8h2d4c8s 7hAcKdQs 3sAsJcJh"));
  }

  @Test
  public void test_omaha_holdem_349_2d2h5d7cTs_6c8dQsQh_AhQcJhKs() {
    assertEquals(
      "AhQcJhKs 6c8dQsQh",
      Solver.process("omaha-holdem 2d2h5d7cTs 6c8dQsQh AhQcJhKs"));
  }

  @Test
  public void test_omaha_holdem_350_2c5d6c6s8d_Kc8cThKh_9hQcQdTd_9cQsKd3h_9s9d4d7d_7sAd4h8h_3sJdAh7c_5s2d7h5c_5h2h4sAs_4c3cAc8s() {
    assertEquals(
      "9cQsKd3h 3sJdAh7c 5h2h4sAs 9hQcQdTd Kc8cThKh 4c3cAc8s 7sAd4h8h 9s9d4d7d 5s2d7h5c",
      Solver.process("omaha-holdem 2c5d6c6s8d Kc8cThKh 9hQcQdTd 9cQsKd3h 9s9d4d7d 7sAd4h8h 3sJdAh7c 5s2d7h5c 5h2h4sAs 4c3cAc8s"));
  }

  @Test
  public void test_omaha_holdem_351_7h9c9sAhQs_Qc6d8hQd_Th9h5cKd_7dKcJh6s_3hQhAs4c_2sJd4s9d_5s8s5dAc_8c7c7s3c() {
    assertEquals(
      "7dKcJh6s 5s8s5dAc 3hQhAs4c 2sJd4s9d Th9h5cKd 8c7c7s3c Qc6d8hQd",
      Solver.process("omaha-holdem 7h9c9sAhQs Qc6d8hQd Th9h5cKd 7dKcJh6s 3hQhAs4c 2sJd4s9d 5s8s5dAc 8c7c7s3c"));
  }

  @Test
  public void test_omaha_holdem_352_3d3s9sJhQh_2s3hAs5h_7hQdJsTh_2hTc8hTs_Qc5s5cAd_KcKd9h4h_8s8d4sKs_7d2c4cTd() {
    assertEquals(
      "7d2c4cTd 8s8d4sKs Qc5s5cAd 7hQdJsTh KcKd9h4h 2s3hAs5h 2hTc8hTs",
      Solver.process("omaha-holdem 3d3s9sJhQh 2s3hAs5h 7hQdJsTh 2hTc8hTs Qc5s5cAd KcKd9h4h 8s8d4sKs 7d2c4cTd"));
  }

  @Test
  public void test_omaha_holdem_353_6c7cAcJsKh_AhQd7d7h_4s9sJdQc_8h6dKdQh_9cAs5d6h_Kc6s3d2d_8cThJcQs_2hKs5h9h_8s4h5cTd_Tc8d4c3c() {
    assertEquals(
      "8s4h5cTd 4s9sJdQc 2hKs5h9h 8h6dKdQh=Kc6s3d2d 9cAs5d6h AhQd7d7h Tc8d4c3c 8cThJcQs",
      Solver.process("omaha-holdem 6c7cAcJsKh AhQd7d7h 4s9sJdQc 8h6dKdQh 9cAs5d6h Kc6s3d2d 8cThJcQs 2hKs5h9h 8s4h5cTd Tc8d4c3c"));
  }

  @Test
  public void test_omaha_holdem_354_3c4h8c8dKc_5hJsQc8s_7dQh5dAs() {
    assertEquals(
      "7dQh5dAs 5hJsQc8s",
      Solver.process("omaha-holdem 3c4h8c8dKc 5hJsQc8s 7dQh5dAs"));
  }

  @Test
  public void test_omaha_holdem_355_5c6h7hKcQd_4s4d3dTh_Js8d4cKd_5d7d9c9h_3h2sQs4h_9dTdAd2d_6s3cTsJc_As7sQh6d_8h8cJdTc_6cAc9sJh() {
    assertEquals(
      "9dTdAd2d 6s3cTsJc 6cAc9sJh 8h8cJdTc 5d7d9c9h As7sQh6d 3h2sQs4h=4s4d3dTh Js8d4cKd",
      Solver.process("omaha-holdem 5c6h7hKcQd 4s4d3dTh Js8d4cKd 5d7d9c9h 3h2sQs4h 9dTdAd2d 6s3cTsJc As7sQh6d 8h8cJdTc 6cAc9sJh"));
  }

  @Test
  public void test_omaha_holdem_356_2c4s9hQdTd_Tc3hAhTs_5c6h8dJh_9sKhQh4h_6s5s8s3c_7s2s7c6c_Qs5d9d2d_JcAs7hTh() {
    assertEquals(
      "6s5s8s3c 7s2s7c6c JcAs7hTh 9sKhQh4h=Qs5d9d2d Tc3hAhTs 5c6h8dJh",
      Solver.process("omaha-holdem 2c4s9hQdTd Tc3hAhTs 5c6h8dJh 9sKhQh4h 6s5s8s3c 7s2s7c6c Qs5d9d2d JcAs7hTh"));
  }

  @Test
  public void test_omaha_holdem_357_2d4s5sQhTc_Ac3dJhJc_Kh9cTh7s_2cQc7c8c_3h4cQd8d_9dTd6h4h_9hJd2s6c_JsAh5cKd_3cQs5hAs() {
    assertEquals(
      "9hJd2s6c JsAh5cKd Kh9cTh7s 9dTd6h4h 2cQc7c8c 3h4cQd8d 3cQs5hAs=Ac3dJhJc",
      Solver.process("omaha-holdem 2d4s5sQhTc Ac3dJhJc Kh9cTh7s 2cQc7c8c 3h4cQd8d 9dTd6h4h 9hJd2s6c JsAh5cKd 3cQs5hAs"));
  }

  @Test
  public void test_omaha_holdem_358_3d9d9sJhKd_QcKc8dJs_6s5d9c4h_7d6hAc9h_ThTsKh5c() {
    assertEquals(
      "ThTsKh5c QcKc8dJs 6s5d9c4h 7d6hAc9h",
      Solver.process("omaha-holdem 3d9d9sJhKd QcKc8dJs 6s5d9c4h 7d6hAc9h ThTsKh5c"));
  }

  @Test
  public void test_omaha_holdem_359_4d5dKdTcTd_QsQhQcJd_9d3s7d8d_7s9s6c4h_3cTsThAh_Js5s9hQd_JhJc5cKh_2s2c8hAs() {
    assertEquals(
      "2s2c8hAs 7s9s6c4h Js5s9hQd QsQhQcJd JhJc5cKh 9d3s7d8d 3cTsThAh",
      Solver.process("omaha-holdem 4d5dKdTcTd QsQhQcJd 9d3s7d8d 7s9s6c4h 3cTsThAh Js5s9hQd JhJc5cKh 2s2c8hAs"));
  }

  @Test
  public void test_omaha_holdem_360_3h6d8cAdKd_6c4hAhAs_9d8sJd6h_5h5c2sQh_7dJs2d8d_KcTdQc3d_Kh2h2cKs() {
    assertEquals(
      "5h5c2sQh Kh2h2cKs 6c4hAhAs 7dJs2d8d KcTdQc3d 9d8sJd6h",
      Solver.process("omaha-holdem 3h6d8cAdKd 6c4hAhAs 9d8sJd6h 5h5c2sQh 7dJs2d8d KcTdQc3d Kh2h2cKs"));
  }

  @Test
  public void test_omaha_holdem_361_4h4s7cKdTd_JdTsQh6s_5hAsAh3h_5c8h6dAc_9hKhQcQs_3s8c3d2c_Th8s5s3c_4d9d7s4c_Jc2dKsKc() {
    assertEquals(
      "5c8h6dAc 3s8c3d2c Th8s5s3c JdTsQh6s 9hKhQcQs 5hAsAh3h Jc2dKsKc 4d9d7s4c",
      Solver.process("omaha-holdem 4h4s7cKdTd JdTsQh6s 5hAsAh3h 5c8h6dAc 9hKhQcQs 3s8c3d2c Th8s5s3c 4d9d7s4c Jc2dKsKc"));
  }

  @Test
  public void test_omaha_holdem_362_2s6c9c9hAh_3s6s4cTh_4s3h6h4h_QsKs5sJd_Js2dJc2c_Kh8d8cAd_9dTcAc3c_4d5h3dQh() {
    assertEquals(
      "4d5h3dQh QsKs5sJd 4s3h6h4h 3s6s4cTh Kh8d8cAd Js2dJc2c 9dTcAc3c",
      Solver.process("omaha-holdem 2s6c9c9hAh 3s6s4cTh 4s3h6h4h QsKs5sJd Js2dJc2c Kh8d8cAd 9dTcAc3c 4d5h3dQh"));
  }

  @Test
  public void test_omaha_holdem_363_2s3h5c7sJc_AdKc7hJs_Qc7cKh3s_Ah6s5d3c_Kd9dTd4h_Ac9hJhTs_6d8h3dQd() {
    assertEquals(
      "Kd9dTd4h 6d8h3dQd Ac9hJhTs Ah6s5d3c Qc7cKh3s AdKc7hJs",
      Solver.process("omaha-holdem 2s3h5c7sJc AdKc7hJs Qc7cKh3s Ah6s5d3c Kd9dTd4h Ac9hJhTs 6d8h3dQd"));
  }

  @Test
  public void test_omaha_holdem_364_4c4s7cAsJs_QhAh3sAc_Kc6d6c2c_9s7dJhTh_Ad5s9d8c_3c5hKs4d_5c3dTdQs_8h2d8sJc_4h7s7h3h_6hQcKd9h() {
    assertEquals(
      "5c3dTdQs 6hQcKd9h Kc6d6c2c 8h2d8sJc 9s7dJhTh Ad5s9d8c 3c5hKs4d 4h7s7h3h QhAh3sAc",
      Solver.process("omaha-holdem 4c4s7cAsJs QhAh3sAc Kc6d6c2c 9s7dJhTh Ad5s9d8c 3c5hKs4d 5c3dTdQs 8h2d8sJc 4h7s7h3h 6hQcKd9h"));
  }

  @Test
  public void test_omaha_holdem_365_7cAhKhKsTc_AdAc4s4c_Kd5h6d5c_8dQd2s7h() {
    assertEquals(
      "8dQd2s7h Kd5h6d5c AdAc4s4c",
      Solver.process("omaha-holdem 7cAhKhKsTc AdAc4s4c Kd5h6d5c 8dQd2s7h"));
  }

  @Test
  public void test_omaha_holdem_366_2d3s6hKdTc_8sAcTs9s_QdKsJs5h_3d8d9h9d_2s6s7s7d_JcJh7c4d() {
    assertEquals(
      "3d8d9h9d 8sAcTs9s JcJh7c4d QdKsJs5h 2s6s7s7d",
      Solver.process("omaha-holdem 2d3s6hKdTc 8sAcTs9s QdKsJs5h 3d8d9h9d 2s6s7s7d JcJh7c4d"));
  }

  @Test
  public void test_omaha_holdem_367_2h4c6c9hQd_Ad4d7s5s_7cAcAsTc_4sAh8d8s() {
    assertEquals(
      "Ad4d7s5s 4sAh8d8s 7cAcAsTc",
      Solver.process("omaha-holdem 2h4c6c9hQd Ad4d7s5s 7cAcAsTc 4sAh8d8s"));
  }

  @Test
  public void test_omaha_holdem_368_4c9d9sAhKc_8cKs5s7c_7d6s6h5c_3c8dQh9c_AdJh3s2d() {
    assertEquals(
      "7d6s6h5c 8cKs5s7c AdJh3s2d 3c8dQh9c",
      Solver.process("omaha-holdem 4c9d9sAhKc 8cKs5s7c 7d6s6h5c 3c8dQh9c AdJh3s2d"));
  }

  @Test
  public void test_omaha_holdem_369_6d9h9sAhJd_7c5c3d7h_Jc8s3s7d_QdTs3h9c() {
    assertEquals(
      "7c5c3d7h Jc8s3s7d QdTs3h9c",
      Solver.process("omaha-holdem 6d9h9sAhJd 7c5c3d7h Jc8s3s7d QdTs3h9c"));
  }

  @Test
  public void test_omaha_holdem_370_3s5c8c8sKs_9cQh9hTc_3d2c4h2d_Kc7dAh2h_5dAd6c5s_JhKh4s6s_9s4c2sJc_As9d4d5h_TsQd3hJs() {
    assertEquals(
      "3d2c4h2d As9d4d5h 9cQh9hTc Kc7dAh2h JhKh4s6s 9s4c2sJc TsQd3hJs 5dAd6c5s",
      Solver.process("omaha-holdem 3s5c8c8sKs 9cQh9hTc 3d2c4h2d Kc7dAh2h 5dAd6c5s JhKh4s6s 9s4c2sJc As9d4d5h TsQd3hJs"));
  }

  @Test
  public void test_omaha_holdem_371_5h7h7sJsTh_5c9hQdAd_5dQc9sAc_Kd5s4s6d_Kh4cJdQs_Qh8d4h6c_3d6h6s2d_JhTd8s7c_Ah8c3sTs_2c4d8hJc() {
    assertEquals(
      "Kd5s4s6d 5c9hQdAd=5dQc9sAc 3d6h6s2d Ah8c3sTs 2c4d8hJc Kh4cJdQs Qh8d4h6c JhTd8s7c",
      Solver.process("omaha-holdem 5h7h7sJsTh 5c9hQdAd 5dQc9sAc Kd5s4s6d Kh4cJdQs Qh8d4h6c 3d6h6s2d JhTd8s7c Ah8c3sTs 2c4d8hJc"));
  }

  @Test
  public void test_omaha_holdem_372_5d8s9hJhTd_Th9dQdKc_JdAsQh6h_3h7d7c7h_Qc9c4h2h() {
    assertEquals(
      "3h7d7c7h JdAsQh6h=Qc9c4h2h Th9dQdKc",
      Solver.process("omaha-holdem 5d8s9hJhTd Th9dQdKc JdAsQh6h 3h7d7c7h Qc9c4h2h"));
  }

  @Test
  public void test_omaha_holdem_373_3d6sAcKhTh_Qs8h5s3s_2c7s6cTs_Ks4c5h4s_4d7dKdTd_Kc2d3h6h() {
    assertEquals(
      "Qs8h5s3s Ks4c5h4s 2c7s6cTs Kc2d3h6h 4d7dKdTd",
      Solver.process("omaha-holdem 3d6sAcKhTh Qs8h5s3s 2c7s6cTs Ks4c5h4s 4d7dKdTd Kc2d3h6h"));
  }

  @Test
  public void test_omaha_holdem_374_6d7h9c9hAh_KhKs3d4s_Qc3sAdJh_5d4h4c9d() {
    assertEquals(
      "KhKs3d4s Qc3sAdJh 5d4h4c9d",
      Solver.process("omaha-holdem 6d7h9c9hAh KhKs3d4s Qc3sAdJh 5d4h4c9d"));
  }

  @Test
  public void test_omaha_holdem_375_2s4d9hKhQc_KdJd6hAs_6sQd4hJh_8sQh4c6d_2cKsAd9c() {
    assertEquals(
      "KdJd6hAs 6sQd4hJh=8sQh4c6d 2cKsAd9c",
      Solver.process("omaha-holdem 2s4d9hKhQc KdJd6hAs 6sQd4hJh 8sQh4c6d 2cKsAd9c"));
  }

  @Test
  public void test_omaha_holdem_376_4d7s9dKhTs_Ac9sQd2h_KcQcJs8c_Ks2d9cTc() {
    assertEquals(
      "Ac9sQd2h Ks2d9cTc KcQcJs8c",
      Solver.process("omaha-holdem 4d7s9dKhTs Ac9sQd2h KcQcJs8c Ks2d9cTc"));
  }

  @Test
  public void test_omaha_holdem_377_5s6d8cAdKh_5d2s9s3d_6s2hJsQh_4d6cQdAc_Jd8d9dKc_Td7hJcKs() {
    assertEquals(
      "5d2s9s3d 6s2hJsQh Td7hJcKs Jd8d9dKc 4d6cQdAc",
      Solver.process("omaha-holdem 5s6d8cAdKh 5d2s9s3d 6s2hJsQh 4d6cQdAc Jd8d9dKc Td7hJcKs"));
  }

  @Test
  public void test_omaha_holdem_378_3d3h7h8hJs_5c8c7dJh_Jd9h8d8s_Kd5h2d5d_AsTdJc3c() {
    assertEquals(
      "Kd5h2d5d 5c8c7dJh AsTdJc3c Jd9h8d8s",
      Solver.process("omaha-holdem 3d3h7h8hJs 5c8c7dJh Jd9h8d8s Kd5h2d5d AsTdJc3c"));
  }

  @Test
  public void test_omaha_holdem_379_2s5s9sAdJs_4dAsKsJc_7dAh5c6d_2d7hTsQd_9dKd4cAc_Tc8s3hTd_9cQc5h7s_2c4s6h2h_QhQs4h3s_6s3c8dJd() {
    assertEquals(
      "2d7hTsQd Tc8s3hTd 6s3c8dJd 9cQc5h7s 7dAh5c6d 9dKd4cAc 2c4s6h2h QhQs4h3s 4dAsKsJc",
      Solver.process("omaha-holdem 2s5s9sAdJs 4dAsKsJc 7dAh5c6d 2d7hTsQd 9dKd4cAc Tc8s3hTd 9cQc5h7s 2c4s6h2h QhQs4h3s 6s3c8dJd"));
  }

  @Test
  public void test_omaha_holdem_380_3c4d5d6dAc_Ks2h8sQc_9h7d2sQs_Js7sAd8h() {
    assertEquals(
      "9h7d2sQs Ks2h8sQc Js7sAd8h",
      Solver.process("omaha-holdem 3c4d5d6dAc Ks2h8sQc 9h7d2sQs Js7sAd8h"));
  }

  @Test
  public void test_omaha_holdem_381_6h9sAcKsTs_3sJdJhQc_7d4h3d3c_Qs3h7hKh_4s9c5h4d_QdKd6dAd_Th6c4cJs_5s7sTc8d_JcQh2h8c() {
    assertEquals(
      "7d4h3d3c 4s9c5h4d Qs3h7hKh Th6c4cJs QdKd6dAd 3sJdJhQc=JcQh2h8c 5s7sTc8d",
      Solver.process("omaha-holdem 6h9sAcKsTs 3sJdJhQc 7d4h3d3c Qs3h7hKh 4s9c5h4d QdKd6dAd Th6c4cJs 5s7sTc8d JcQh2h8c"));
  }

  @Test
  public void test_omaha_holdem_382_3c5s6s7cJd_2d9sQs9d_7s5dKh8h() {
    assertEquals(
      "2d9sQs9d 7s5dKh8h",
      Solver.process("omaha-holdem 3c5s6s7cJd 2d9sQs9d 7s5dKh8h"));
  }

  @Test
  public void test_omaha_holdem_383_3h4h5c6s9s_Qc7hJhKd_Ts8d2c6h_Qs8h2dTh_As4cTdQd() {
    assertEquals(
      "Qs8h2dTh Qc7hJhKd As4cTdQd Ts8d2c6h",
      Solver.process("omaha-holdem 3h4h5c6s9s Qc7hJhKd Ts8d2c6h Qs8h2dTh As4cTdQd"));
  }

  @Test
  public void test_omaha_holdem_384_7c8d8h8sTc_4s4h8c9s_Kh6h2dAd_4dKcQcQh() {
    assertEquals(
      "Kh6h2dAd 4dKcQcQh 4s4h8c9s",
      Solver.process("omaha-holdem 7c8d8h8sTc 4s4h8c9s Kh6h2dAd 4dKcQcQh"));
  }

  @Test
  public void test_omaha_holdem_385_5h5s9sQhQs_7hKsJs3h_Tc9d8sTd_Ac8c8hKh() {
    assertEquals(
      "Ac8c8hKh Tc9d8sTd 7hKsJs3h",
      Solver.process("omaha-holdem 5h5s9sQhQs 7hKsJs3h Tc9d8sTd Ac8c8hKh"));
  }

  @Test
  public void test_omaha_holdem_386_3h4h6c7hAd_Tc7d5c2h_5dKd2s3d_Qc6d6s8s_2c2d3s9s_QdTd8cKh_Ah4cTh7c_Ac9cQh5s() {
    assertEquals(
      "QdTd8cKh 2c2d3s9s Ac9cQh5s Qc6d6s8s 5dKd2s3d=Tc7d5c2h Ah4cTh7c",
      Solver.process("omaha-holdem 3h4h6c7hAd Tc7d5c2h 5dKd2s3d Qc6d6s8s 2c2d3s9s QdTd8cKh Ah4cTh7c Ac9cQh5s"));
  }

  @Test
  public void test_omaha_holdem_387_2d3s8s9sJh_3cKsJsAs_9cTs5hQs_6s4cKd5d_Tc8h9h2s_Th2h5s6h() {
    assertEquals(
      "6s4cKd5d Th2h5s6h Tc8h9h2s 9cTs5hQs 3cKsJsAs",
      Solver.process("omaha-holdem 2d3s8s9sJh 3cKsJsAs 9cTs5hQs 6s4cKd5d Tc8h9h2s Th2h5s6h"));
  }

  @Test
  public void test_omaha_holdem_388_3d4c4dAdTc_5hAc3h5c_JdKh7s9c_8hJs5sTd_KsTh8dQh_QdKd8s9d_Kc9hQs6s_3s6cJc6h() {
    assertEquals(
      "JdKh7s9c Kc9hQs6s 3s6cJc6h 8hJs5sTd KsTh8dQh 5hAc3h5c QdKd8s9d",
      Solver.process("omaha-holdem 3d4c4dAdTc 5hAc3h5c JdKh7s9c 8hJs5sTd KsTh8dQh QdKd8s9d Kc9hQs6s 3s6cJc6h"));
  }

  @Test
  public void test_omaha_holdem_389_2c4h5d9sAd_7dAs2dKh_Ks2s9cKc_3h5c6dQs_3c8c6cJc_7h3d4cQh_2hAh5hAc_QdKdThJd_5s6s3s8d() {
    assertEquals(
      "QdKdThJd Ks2s9cKc 7dAs2dKh 2hAh5hAc 7h3d4cQh 3c8c6cJc=3h5c6dQs=5s6s3s8d",
      Solver.process("omaha-holdem 2c4h5d9sAd 7dAs2dKh Ks2s9cKc 3h5c6dQs 3c8c6cJc 7h3d4cQh 2hAh5hAc QdKdThJd 5s6s3s8d"));
  }

  @Test
  public void test_omaha_holdem_390_3s4c5c9sTd_2s6c2c8d_TsKc5h7d_QhJdKh6s_Jh4sThKd_Ks8cJs9d_2dTcQs3c_Jc8h7hAc_Qc3hAs7s() {
    assertEquals(
      "QhJdKh6s Jc8h7hAc Qc3hAs7s Ks8cJs9d 2dTcQs3c Jh4sThKd TsKc5h7d 2s6c2c8d",
      Solver.process("omaha-holdem 3s4c5c9sTd 2s6c2c8d TsKc5h7d QhJdKh6s Jh4sThKd Ks8cJs9d 2dTcQs3c Jc8h7hAc Qc3hAs7s"));
  }

  @Test
  public void test_omaha_holdem_391_2c2h3d4s9s_TcJc6cAc_QsThAdKc_Qc5c7h9d_6h3cKh4c() {
    assertEquals(
      "TcJc6cAc QsThAdKc 6h3cKh4c Qc5c7h9d",
      Solver.process("omaha-holdem 2c2h3d4s9s TcJc6cAc QsThAdKc Qc5c7h9d 6h3cKh4c"));
  }

  @Test
  public void test_omaha_holdem_392_5c9sJhQhTh_5hAhJsTd_TcKdKs9c_Qc5s7d2h_8h5d3h4h_3d6c3c9d() {
    assertEquals(
      "3d6c3c9d Qc5s7d2h TcKdKs9c 8h5d3h4h 5hAhJsTd",
      Solver.process("omaha-holdem 5c9sJhQhTh 5hAhJsTd TcKdKs9c Qc5s7d2h 8h5d3h4h 3d6c3c9d"));
  }

  @Test
  public void test_omaha_holdem_393_3d4h6h8cQd_6s8sKsAs_7hTdTs4c_5dTcQc6c_3c4s9s4d_Kc9hAc2d_Jc8dJdTh() {
    assertEquals(
      "Kc9hAc2d 7hTdTs4c Jc8dJdTh 6s8sKsAs 5dTcQc6c 3c4s9s4d",
      Solver.process("omaha-holdem 3d4h6h8cQd 6s8sKsAs 7hTdTs4c 5dTcQc6c 3c4s9s4d Kc9hAc2d Jc8dJdTh"));
  }

  @Test
  public void test_omaha_holdem_394_3s6d7d8d9h_AdAh7c4h_7h6cTcKh_KcTh3c4d_QcAc5hQd_8h2d6hJh_4s8sJd7s_2h6sQs9d_KsJs3d2s() {
    assertEquals(
      "KcTh3c4d=KsJs3d2s QcAc5hQd AdAh7c4h 8h2d6hJh 4s8sJd7s 2h6sQs9d 7h6cTcKh",
      Solver.process("omaha-holdem 3s6d7d8d9h AdAh7c4h 7h6cTcKh KcTh3c4d QcAc5hQd 8h2d6hJh 4s8sJd7s 2h6sQs9d KsJs3d2s"));
  }

  @Test
  public void test_omaha_holdem_395_7s8dJcKcQh_9cQsAsJd_Ts2c6h2h() {
    assertEquals(
      "Ts2c6h2h 9cQsAsJd",
      Solver.process("omaha-holdem 7s8dJcKcQh 9cQsAsJd Ts2c6h2h"));
  }

  @Test
  public void test_omaha_holdem_396_2hJcKhQdQh_2sQcJdQs_9d8s9cAc_7dAs6h7s_5s2cTd3h_6c9h5h6s() {
    assertEquals(
      "5s2cTd3h 7dAs6h7s 9d8s9cAc 6c9h5h6s 2sQcJdQs",
      Solver.process("omaha-holdem 2hJcKhQdQh 2sQcJdQs 9d8s9cAc 7dAs6h7s 5s2cTd3h 6c9h5h6s"));
  }

  @Test
  public void test_omaha_holdem_397_4h9cJcKhTs_Th7d2dKc_Jd2c2hQs_Td4c5h8d() {
    assertEquals(
      "Td4c5h8d Th7d2dKc Jd2c2hQs",
      Solver.process("omaha-holdem 4h9cJcKhTs Th7d2dKc Jd2c2hQs Td4c5h8d"));
  }

  @Test
  public void test_omaha_holdem_398_2d3h4c4sAd_As5sQc6c_Ks7sJh3s_Ac9dTd3c_QdKhJs9h_Ts6hQh9s_8d9cKdKc_3d7cAh6s() {
    assertEquals(
      "Ts6hQh9s QdKhJs9h Ks7sJh3s 8d9cKdKc 3d7cAh6s Ac9dTd3c As5sQc6c",
      Solver.process("omaha-holdem 2d3h4c4sAd As5sQc6c Ks7sJh3s Ac9dTd3c QdKhJs9h Ts6hQh9s 8d9cKdKc 3d7cAh6s"));
  }

  @Test
  public void test_omaha_holdem_399_3d8d8hAcQs_Kc2dTd3c_JhKs9d7d_Js4d2c7c() {
    assertEquals(
      "Js4d2c7c JhKs9d7d Kc2dTd3c",
      Solver.process("omaha-holdem 3d8d8hAcQs Kc2dTd3c JhKs9d7d Js4d2c7c"));
  }

  @Test
  public void test_omaha_holdem_400_8hAcJcJsQs_QdTh6h3c_3hTsKh8s_6c5h3s9d_9s4s6sKs_TcKc7d2d() {
    assertEquals(
      "6c5h3s9d 9s4s6sKs QdTh6h3c 3hTsKh8s=TcKc7d2d",
      Solver.process("omaha-holdem 8hAcJcJsQs QdTh6h3c 3hTsKh8s 6c5h3s9d 9s4s6sKs TcKc7d2d"));
  }

  @Test
  public void test_omaha_holdem_401_5h6s9hAcKh_Th3d6dJc_4d9s3h7c_TdJhJd4c_2h3sQh2d_9c7h6c2s_8c8h5s2c_AdKs9d8d_4h8s3c5d() {
    assertEquals(
      "4h8s3c5d Th3d6dJc 8c8h5s2c 4d9s3h7c TdJhJd4c 9c7h6c2s AdKs9d8d 2h3sQh2d",
      Solver.process("omaha-holdem 5h6s9hAcKh Th3d6dJc 4d9s3h7c TdJhJd4c 2h3sQh2d 9c7h6c2s 8c8h5s2c AdKs9d8d 4h8s3c5d"));
  }

  @Test
  public void test_omaha_holdem_402_4h9c9hQcTh_7hJsAh7d_AcKc8dKd_6s3s8h5d_KhTdTc8c_3hJd5cTs_3d3cJcKs_QhAs6cQs() {
    assertEquals(
      "6s3s8h5d 3hJd5cTs AcKc8dKd 3d3cJcKs 7hJsAh7d KhTdTc8c QhAs6cQs",
      Solver.process("omaha-holdem 4h9c9hQcTh 7hJsAh7d AcKc8dKd 6s3s8h5d KhTdTc8c 3hJd5cTs 3d3cJcKs QhAs6cQs"));
  }

  @Test
  public void test_omaha_holdem_403_8h9h9sAsKh_2hTc4d5c_JhAd9d4h_7c6cKcAc() {
    assertEquals(
      "2hTc4d5c 7c6cKcAc JhAd9d4h",
      Solver.process("omaha-holdem 8h9h9sAsKh 2hTc4d5c JhAd9d4h 7c6cKcAc"));
  }

  @Test
  public void test_omaha_holdem_404_2d4h4sAdQh_5h8h6d7d_ThAhJhQd_2c6hJcAs_5c9dTcTd_3sKd8d7h() {
    assertEquals(
      "5h8h6d7d 3sKd8d7h 5c9dTcTd 2c6hJcAs ThAhJhQd",
      Solver.process("omaha-holdem 2d4h4sAdQh 5h8h6d7d ThAhJhQd 2c6hJcAs 5c9dTcTd 3sKd8d7h"));
  }

  @Test
  public void test_omaha_holdem_405_2d6h7sAhTc_KcJsQs9h_5d5c5sQh_3sTd3dQc_4cJd2sTs_5hKs2h8s_9d3cAd7c_Kh4d3h7d_JcJhAc2c() {
    assertEquals(
      "KcJsQs9h 5hKs2h8s 5d5c5sQh Kh4d3h7d 3sTd3dQc 4cJd2sTs JcJhAc2c 9d3cAd7c",
      Solver.process("omaha-holdem 2d6h7sAhTc KcJsQs9h 5d5c5sQh 3sTd3dQc 4cJd2sTs 5hKs2h8s 9d3cAd7c Kh4d3h7d JcJhAc2c"));
  }

  @Test
  public void test_omaha_holdem_406_2d6d9cKhTc_8dQs3dAh_5d2hTh6c_Jc9h8c5c_4c3hKs3c_KdQc4s5h_7d7cJh9d() {
    assertEquals(
      "8dQs3dAh 7d7cJh9d=Jc9h8c5c 4c3hKs3c KdQc4s5h 5d2hTh6c",
      Solver.process("omaha-holdem 2d6d9cKhTc 8dQs3dAh 5d2hTh6c Jc9h8c5c 4c3hKs3c KdQc4s5h 7d7cJh9d"));
  }

  @Test
  public void test_omaha_holdem_407_6c7c8hAdTc_4c6d7hKs_Kh2cQh4s_3hTs3s9s_4d3c8sJc_2dKd2hAs_8cJh5hQs_9dJd7dAh_6hKcAc2s_4hTdJs5s() {
    assertEquals(
      "Kh2cQh4s 8cJh5hQs 2dKd2hAs 4c6d7hKs 4hTdJs5s 3hTs3s9s 9dJd7dAh 4d3c8sJc 6hKcAc2s",
      Solver.process("omaha-holdem 6c7c8hAdTc 4c6d7hKs Kh2cQh4s 3hTs3s9s 4d3c8sJc 2dKd2hAs 8cJh5hQs 9dJd7dAh 6hKcAc2s 4hTdJs5s"));
  }

  @Test
  public void test_omaha_holdem_408_2c2h4h6sTs_JsJd8s7d_4sJhKdKh_AsKs3c7h_9dJc9h2d_9s5hKcAh_Ac7sQsQc_5s8d8hQd_4dTh6d2s_Qh6cTc5c() {
    assertEquals(
      "9s5hKcAh=AsKs3c7h 5s8d8hQd Qh6cTc5c JsJd8s7d Ac7sQsQc 4sJhKdKh 9dJc9h2d 4dTh6d2s",
      Solver.process("omaha-holdem 2c2h4h6sTs JsJd8s7d 4sJhKdKh AsKs3c7h 9dJc9h2d 9s5hKcAh Ac7sQsQc 5s8d8hQd 4dTh6d2s Qh6cTc5c"));
  }

  @Test
  public void test_omaha_holdem_409_3s4c7h9dAs_7dAc7s4s_QhQd6c4d_Js5hJc8d_5dTd9h2c_QcQs2d3c_9sTc3hJh_Kd6h5c4h() {
    assertEquals(
      "Js5hJc8d QcQs2d3c=QhQd6c4d 9sTc3hJh 7dAc7s4s 5dTd9h2c Kd6h5c4h",
      Solver.process("omaha-holdem 3s4c7h9dAs 7dAc7s4s QhQd6c4d Js5hJc8d 5dTd9h2c QcQs2d3c 9sTc3hJh Kd6h5c4h"));
  }

  @Test
  public void test_omaha_holdem_410_2h7sJsKhQs_3d5s6s4c_4s2c6d8s_3s8c8h3h_9d9hTdKs_2dJhThAc_Jd6h5cKd_7h2sJcTc() {
    assertEquals(
      "3s8c8h3h 7h2sJcTc Jd6h5cKd 9d9hTdKs 2dJhThAc 3d5s6s4c 4s2c6d8s",
      Solver.process("omaha-holdem 2h7sJsKhQs 3d5s6s4c 4s2c6d8s 3s8c8h3h 9d9hTdKs 2dJhThAc Jd6h5cKd 7h2sJcTc"));
  }

  @Test
  public void test_omaha_holdem_411_5s8cAdJcJh_Kc9s8s2c_TdAc7dTh_6hJd9c7s_Ks2s4s3d_KdTc9d3c_As7c8dKh() {
    assertEquals(
      "Ks2s4s3d KdTc9d3c Kc9s8s2c TdAc7dTh As7c8dKh 6hJd9c7s",
      Solver.process("omaha-holdem 5s8cAdJcJh Kc9s8s2c TdAc7dTh 6hJd9c7s Ks2s4s3d KdTc9d3c As7c8dKh"));
  }

  @Test
  public void test_omaha_holdem_412_4c7d7sKdQc_8d8sQsAd_4sTc2hKc_9dJdJh9s_7c3dAc9c_Td3h5s2d_6d3sJcQh_6hJs2s2c_8cQd6c5h_Th5c4h9h() {
    assertEquals(
      "Td3h5s2d 6hJs2s2c Th5c4h9h 9dJdJh9s 8cQd6c5h 6d3sJcQh 8d8sQsAd 4sTc2hKc 7c3dAc9c",
      Solver.process("omaha-holdem 4c7d7sKdQc 8d8sQsAd 4sTc2hKc 9dJdJh9s 7c3dAc9c Td3h5s2d 6d3sJcQh 6hJs2s2c 8cQd6c5h Th5c4h9h"));
  }

  @Test
  public void test_omaha_holdem_413_2d4c4s6hKc_8c7c8sQh_6c7s2sQs_JsKs9dTh_5c2cTd4d() {
    assertEquals(
      "6c7s2sQs 8c7c8sQh JsKs9dTh 5c2cTd4d",
      Solver.process("omaha-holdem 2d4c4s6hKc 8c7c8sQh 6c7s2sQs JsKs9dTh 5c2cTd4d"));
  }

  @Test
  public void test_omaha_holdem_414_6c7sAsJsKc_QcAh4h3h_4d5s3sQs_3cTsTdQh_8s5h7c2d_4cAdAcJd() {
    assertEquals(
      "8s5h7c2d QcAh4h3h 4cAdAcJd 3cTsTdQh 4d5s3sQs",
      Solver.process("omaha-holdem 6c7sAsJsKc QcAh4h3h 4d5s3sQs 3cTsTdQh 8s5h7c2d 4cAdAcJd"));
  }

  @Test
  public void test_omaha_holdem_415_7d8hAcKcQh_6h9dTcKd_JcAs7c3h_Kh8d2hJd_9s7s3sAd_KsQs8sTd_4h5c6s4d_3d6d7hQd_QcThJsJh_9h5s6c5h() {
    assertEquals(
      "4h5c6s4d 9h5s6c5h 6h9dTcKd 3d6d7hQd Kh8d2hJd KsQs8sTd 9s7s3sAd=JcAs7c3h QcThJsJh",
      Solver.process("omaha-holdem 7d8hAcKcQh 6h9dTcKd JcAs7c3h Kh8d2hJd 9s7s3sAd KsQs8sTd 4h5c6s4d 3d6d7hQd QcThJsJh 9h5s6c5h"));
  }

  @Test
  public void test_omaha_holdem_416_2s3d7s9hQd_8h3c3h5s_Ks7c8s4h_KhQsQhJc_Ah6h4c8c_6c2d7hJd_4d4sQc2h_Td9d5hKd_JsTc5d6d() {
    assertEquals(
      "JsTc5d6d Ah6h4c8c Ks7c8s4h Td9d5hKd 6c2d7hJd 4d4sQc2h 8h3c3h5s KhQsQhJc",
      Solver.process("omaha-holdem 2s3d7s9hQd 8h3c3h5s Ks7c8s4h KhQsQhJc Ah6h4c8c 6c2d7hJd 4d4sQc2h Td9d5hKd JsTc5d6d"));
  }

  @Test
  public void test_omaha_holdem_417_2h5s6cAcQc_3dTd8cJh_4s3cKcAd_Jd7dAh8s_2c6dKdTs_Js6s3s8d_2d9c3h5c_4dQd9dTh_Qh7hKh9s() {
    assertEquals(
      "3dTd8cJh Js6s3s8d 4dQd9dTh Qh7hKh9s Jd7dAh8s 2c6dKdTs 2d9c3h5c 4s3cKcAd",
      Solver.process("omaha-holdem 2h5s6cAcQc 3dTd8cJh 4s3cKcAd Jd7dAh8s 2c6dKdTs Js6s3s8d 2d9c3h5c 4dQd9dTh Qh7hKh9s"));
  }

  @Test
  public void test_omaha_holdem_418_2s4c5d5h7c_JcKcAc8c_TsQh4d4h_9h6hThQc_Ks7d5sKh_Jd9s2c9d_JsAh2hAs() {
    assertEquals(
      "9h6hThQc JcKcAc8c Jd9s2c9d JsAh2hAs TsQh4d4h Ks7d5sKh",
      Solver.process("omaha-holdem 2s4c5d5h7c JcKcAc8c TsQh4d4h 9h6hThQc Ks7d5sKh Jd9s2c9d JsAh2hAs"));
  }

  @Test
  public void test_omaha_holdem_419_3c4h5d5sJd_As7c7hJh_9sKc4cTh_5hJc6d6c_9hTc9c8s() {
    assertEquals(
      "9sKc4cTh 9hTc9c8s As7c7hJh 5hJc6d6c",
      Solver.process("omaha-holdem 3c4h5d5sJd As7c7hJh 9sKc4cTh 5hJc6d6c 9hTc9c8s"));
  }

  @Test
  public void test_omaha_holdem_420_2d2s8dJcQd_5cAc9h8c_8s3s5sJd() {
    assertEquals(
      "5cAc9h8c 8s3s5sJd",
      Solver.process("omaha-holdem 2d2s8dJcQd 5cAc9h8c 8s3s5sJd"));
  }

  @Test
  public void test_omaha_holdem_421_5h7c8hJcKc_QsQd6hTh_TdAs4h3h_Jh7dAh9c_8d6c8cKh_Ks7s2c9d_6sKd5s5c() {
    assertEquals(
      "TdAs4h3h QsQd6hTh Jh7dAh9c Ks7s2c9d 6sKd5s5c 8d6c8cKh",
      Solver.process("omaha-holdem 5h7c8hJcKc QsQd6hTh TdAs4h3h Jh7dAh9c 8d6c8cKh Ks7s2c9d 6sKd5s5c"));
  }

  @Test
  public void test_omaha_holdem_422_4s5c5sQcQh_8dAs9d3d_8s9s8c7c_5dKcQsAd_3h7hTh3s_Qd4d3cJd_TdJc6d9h_5h7s2h9c_4h4cKd2c_2d6cKhKs() {
    assertEquals(
      "TdJc6d9h 8dAs9d3d 3h7hTh3s 8s9s8c7c 2d6cKhKs 5h7s2h9c 4h4cKd2c Qd4d3cJd 5dKcQsAd",
      Solver.process("omaha-holdem 4s5c5sQcQh 8dAs9d3d 8s9s8c7c 5dKcQsAd 3h7hTh3s Qd4d3cJd TdJc6d9h 5h7s2h9c 4h4cKd2c 2d6cKhKs"));
  }

  @Test
  public void test_omaha_holdem_423_4d5d5h6sKd_5cTsJc8c_6h2h6dQd_3hAcTh9s_Td9dKsAh_7s4c8h7h_2sJh9h7c_QsKhJs8s_4hKc5s4s() {
    assertEquals(
      "2sJh9h7c 3hAcTh9s QsKhJs8s 5cTsJc8c 7s4c8h7h Td9dKsAh 4hKc5s4s 6h2h6dQd",
      Solver.process("omaha-holdem 4d5d5h6sKd 5cTsJc8c 6h2h6dQd 3hAcTh9s Td9dKsAh 7s4c8h7h 2sJh9h7c QsKhJs8s 4hKc5s4s"));
  }

  @Test
  public void test_omaha_holdem_424_3c9cJdQhTc_8cKs5cJc_7dAs4dQd_Ts2h2s8h_8d8s3d5d_2dQc4hKh() {
    assertEquals(
      "8d8s3d5d 7dAs4dQd Ts2h2s8h 2dQc4hKh 8cKs5cJc",
      Solver.process("omaha-holdem 3c9cJdQhTc 8cKs5cJc 7dAs4dQd Ts2h2s8h 8d8s3d5d 2dQc4hKh"));
  }

  @Test
  public void test_omaha_holdem_425_2c3s8dKhTs_9s7d9hQc_Js8c5c5s_3d4hTc5h_4cTh7c6h_AcJc8hQd_5dQs3hAh_3cTd7sAs_6d2s6sKc_Jd7h4s8s() {
    assertEquals(
      "5dQs3hAh Jd7h4s8s=Js8c5c5s AcJc8hQd 9s7d9hQc 4cTh7c6h 3cTd7sAs=3d4hTc5h 6d2s6sKc",
      Solver.process("omaha-holdem 2c3s8dKhTs 9s7d9hQc Js8c5c5s 3d4hTc5h 4cTh7c6h AcJc8hQd 5dQs3hAh 3cTd7sAs 6d2s6sKc Jd7h4s8s"));
  }

  @Test
  public void test_omaha_holdem_426_2s4d6s8hKh_7cQsJh2h_9dJdKd9c_9s3s8cTs_As3c6h5h_5dKcJcJs_6c3h7sAc() {
    assertEquals(
      "7cQsJh2h 6c3h7sAc 9s3s8cTs 5dKcJcJs=9dJdKd9c As3c6h5h",
      Solver.process("omaha-holdem 2s4d6s8hKh 7cQsJh2h 9dJdKd9c 9s3s8cTs As3c6h5h 5dKcJcJs 6c3h7sAc"));
  }

  @Test
  public void test_omaha_holdem_427_3hKhKsTcTd_Jc2sQdJd_3c4cQhTh_Ts4h8c2c() {
    assertEquals(
      "Jc2sQdJd Ts4h8c2c 3c4cQhTh",
      Solver.process("omaha-holdem 3hKhKsTcTd Jc2sQdJd 3c4cQhTh Ts4h8c2c"));
  }

  @Test
  public void test_omaha_holdem_428_2d3c7c7dAs_3dKdJc8c_9sJhTsKs_9h5s6d4h_5cAd4c6s_8d8s2c5d() {
    assertEquals(
      "9sJhTsKs 3dKdJc8c 8d8s2c5d 5cAd4c6s=9h5s6d4h",
      Solver.process("omaha-holdem 2d3c7c7dAs 3dKdJc8c 9sJhTsKs 9h5s6d4h 5cAd4c6s 8d8s2c5d"));
  }

  @Test
  public void test_omaha_holdem_429_3c5c8d8sJc_AhQh7sJs_5sKh8cTs_4h3h2s6d_Qc2c9hQd() {
    assertEquals(
      "4h3h2s6d AhQh7sJs Qc2c9hQd 5sKh8cTs",
      Solver.process("omaha-holdem 3c5c8d8sJc AhQh7sJs 5sKh8cTs 4h3h2s6d Qc2c9hQd"));
  }

  @Test
  public void test_omaha_holdem_430_4h7dJhKhTc_3hJcKc3c_6d8h2c5s_QsQdTd6c_4d8cAcAs_7h3s8d9h() {
    assertEquals(
      "6d8h2c5s QsQdTd6c 4d8cAcAs 3hJcKc3c 7h3s8d9h",
      Solver.process("omaha-holdem 4h7dJhKhTc 3hJcKc3c 6d8h2c5s QsQdTd6c 4d8cAcAs 7h3s8d9h"));
  }

  @Test
  public void test_omaha_holdem_431_7c7s9c9dAd_Qd2sKd2c_2h3s6c4s_8h5hTd6s_QsAhThKc_4c9hJs6h_9s7d3dQc() {
    assertEquals(
      "2h3s6c4s 8h5hTd6s Qd2sKd2c QsAhThKc 4c9hJs6h 9s7d3dQc",
      Solver.process("omaha-holdem 7c7s9c9dAd Qd2sKd2c 2h3s6c4s 8h5hTd6s QsAhThKc 4c9hJs6h 9s7d3dQc"));
  }

  @Test
  public void test_omaha_holdem_432_6c6d7s8sKd_8dTd9h5s_4h8c3c5c_AhAs4d5h_Th7d8h2h_QhKsTcQd_Ac2c4c4s() {
    assertEquals(
      "Ac2c4c4s Th7d8h2h QhKsTcQd 4h8c3c5c=AhAs4d5h 8dTd9h5s",
      Solver.process("omaha-holdem 6c6d7s8sKd 8dTd9h5s 4h8c3c5c AhAs4d5h Th7d8h2h QhKsTcQd Ac2c4c4s"));
  }

  @Test
  public void test_omaha_holdem_433_AdAhAsKhTd_7s4s3h7d_6c5dJcJd_2c3cAc5c() {
    assertEquals(
      "7s4s3h7d 6c5dJcJd 2c3cAc5c",
      Solver.process("omaha-holdem AdAhAsKhTd 7s4s3h7d 6c5dJcJd 2c3cAc5c"));
  }

  @Test
  public void test_omaha_holdem_434_6hAdAsQdQh_7h3sKd4c_Js2d8dQc_Ks9d4dTs_5s7c7d6c_5h6s3h7s_Qs3c8h5d_Kc2h3d2s() {
    assertEquals(
      "7h3sKd4c Ks9d4dTs Kc2h3d2s 5h6s3h7s 5s7c7d6c Qs3c8h5d Js2d8dQc",
      Solver.process("omaha-holdem 6hAdAsQdQh 7h3sKd4c Js2d8dQc Ks9d4dTs 5s7c7d6c 5h6s3h7s Qs3c8h5d Kc2h3d2s"));
  }

  @Test
  public void test_omaha_holdem_435_6sAcAdQcQh_Ah9h3sJs_Kh7cQdAs_2cTs6h6c() {
    assertEquals(
      "Ah9h3sJs 2cTs6h6c Kh7cQdAs",
      Solver.process("omaha-holdem 6sAcAdQcQh Ah9h3sJs Kh7cQdAs 2cTs6h6c"));
  }

  @Test
  public void test_omaha_holdem_436_6d8d9cJdKc_Ad6c6h2d_5s3cTdKd_8cQh7d9s_7s3hJs8s_7c7hAs5d() {
    assertEquals(
      "8cQh7d9s 7s3hJs8s 7c7hAs5d 5s3cTdKd Ad6c6h2d",
      Solver.process("omaha-holdem 6d8d9cJdKc Ad6c6h2d 5s3cTdKd 8cQh7d9s 7s3hJs8s 7c7hAs5d"));
  }

  @Test
  public void test_omaha_holdem_437_6d6h9cJsKh_3hJd7sKc_Td4d7hQc_Ks4sJc4c_5d5s8c3s_AdTc8d5h_8s3c9s7d() {
    assertEquals(
      "AdTc8d5h 5d5s8c3s 8s3c9s7d 3hJd7sKc=Ks4sJc4c Td4d7hQc",
      Solver.process("omaha-holdem 6d6h9cJsKh 3hJd7sKc Td4d7hQc Ks4sJc4c 5d5s8c3s AdTc8d5h 8s3c9s7d"));
  }

  @Test
  public void test_omaha_holdem_438_2c4s6dKsTc_JhQc8d7h_Js5h6c3h_5d5s8cQs_Jc4c7dAs_Th3cKd3d_9dAd9sQd() {
    assertEquals(
      "JhQc8d7h Jc4c7dAs 5d5s8cQs 9dAd9sQd Th3cKd3d Js5h6c3h",
      Solver.process("omaha-holdem 2c4s6dKsTc JhQc8d7h Js5h6c3h 5d5s8cQs Jc4c7dAs Th3cKd3d 9dAd9sQd"));
  }

  @Test
  public void test_omaha_holdem_439_3s4s5c5dKc_6h6cKs3h_9dQsKhJd_Tc7hAh4d_8cTs6s6d_2sQcJc7d_2h8d4c8h_5hKdTd4h() {
    assertEquals(
      "2sQcJc7d Tc7hAh4d 8cTs6s6d 2h8d4c8h 6h6cKs3h 9dQsKhJd 5hKdTd4h",
      Solver.process("omaha-holdem 3s4s5c5dKc 6h6cKs3h 9dQsKhJd Tc7hAh4d 8cTs6s6d 2sQcJc7d 2h8d4c8h 5hKdTd4h"));
  }

  @Test
  public void test_omaha_holdem_440_3d5d6c7dJd_AhTh6dKh_9d9c6s2d_2cQc7cTd_Qh8hJsQs_5s6h3cKd_8cTc2hQd_2s4d9h9s_JcJh5c8s() {
    assertEquals(
      "8cTc2hQd AhTh6dKh 2cQc7cTd Qh8hJsQs 5s6h3cKd JcJh5c8s 2s4d9h9s 9d9c6s2d",
      Solver.process("omaha-holdem 3d5d6c7dJd AhTh6dKh 9d9c6s2d 2cQc7cTd Qh8hJsQs 5s6h3cKd 8cTc2hQd 2s4d9h9s JcJh5c8s"));
  }

  @Test
  public void test_omaha_holdem_441_2h7c9hAdTd_Ah2s3dJh_9dJcQcQh_6c7hJs6h_Ts8cKsQd_JdKhAs5h_2c7s3c8s_4sKcTcAc() {
    assertEquals(
      "6c7hJs6h Ts8cKsQd 9dJcQcQh JdKhAs5h 2c7s3c8s Ah2s3dJh 4sKcTcAc",
      Solver.process("omaha-holdem 2h7c9hAdTd Ah2s3dJh 9dJcQcQh 6c7hJs6h Ts8cKsQd JdKhAs5h 2c7s3c8s 4sKcTcAc"));
  }

  @Test
  public void test_omaha_holdem_442_5c5d6d7sKc_5h2c6c3h_ThJd2s9d_5sJsTcJh() {
    assertEquals(
      "ThJd2s9d 5sJsTcJh 5h2c6c3h",
      Solver.process("omaha-holdem 5c5d6d7sKc 5h2c6c3h ThJd2s9d 5sJsTcJh"));
  }

  @Test
  public void test_omaha_holdem_443_3s6c9hAhJc_9d8c8hTh_QdAd9s7s_3d3hKh4h_6h9cTd2c_6dJdTc4c_Qs7cAc2d_Ts7d7h5d_Js6sAsKs() {
    assertEquals(
      "Ts7d7h5d 9d8c8hTh Qs7cAc2d 6h9cTd2c 6dJdTc4c QdAd9s7s Js6sAsKs 3d3hKh4h",
      Solver.process("omaha-holdem 3s6c9hAhJc 9d8c8hTh QdAd9s7s 3d3hKh4h 6h9cTd2c 6dJdTc4c Qs7cAc2d Ts7d7h5d Js6sAsKs"));
  }

  @Test
  public void test_omaha_holdem_444_6cAcAsQcQs_9h3cJc7c_2h3hTs4h_8c9s2c2s_6s4c5h4d_Ad5s9dJd() {
    assertEquals(
      "2h3hTs4h 6s4c5h4d Ad5s9dJd 8c9s2c2s 9h3cJc7c",
      Solver.process("omaha-holdem 6cAcAsQcQs 9h3cJc7c 2h3hTs4h 8c9s2c2s 6s4c5h4d Ad5s9dJd"));
  }

  @Test
  public void test_omaha_holdem_445_3s5s8dAcAh_5d2s9s7c_As5c3h9h_ThQc5hTc_Qh3c9d8c_2cKd2h3d_9cKc4cTs_4s4d6s6d() {
    assertEquals(
      "9cKc4cTs 2cKd2h3d 5d2s9s7c 4s4d6s6d Qh3c9d8c ThQc5hTc As5c3h9h",
      Solver.process("omaha-holdem 3s5s8dAcAh 5d2s9s7c As5c3h9h ThQc5hTc Qh3c9d8c 2cKd2h3d 9cKc4cTs 4s4d6s6d"));
  }

  @Test
  public void test_omaha_holdem_446_3h4c4hAdAh_Ks3d8c7s_2c9sTs4s_Tc5cKc8d_ThJh2d5d() {
    assertEquals(
      "Tc5cKc8d Ks3d8c7s 2c9sTs4s ThJh2d5d",
      Solver.process("omaha-holdem 3h4c4hAdAh Ks3d8c7s 2c9sTs4s Tc5cKc8d ThJh2d5d"));
  }

  @Test
  public void test_omaha_holdem_447_3c6s8hJsQc_8s5h2h9d_6h7d5c2c_8cQdQh6c_3d3sTcTs_2dKsKh9s_AhKdTh5s_Kc4d7sJd_7h5d4h9h() {
    assertEquals(
      "7h5d4h9h AhKdTh5s 6h7d5c2c 8s5h2h9d Kc4d7sJd 2dKsKh9s 3d3sTcTs 8cQdQh6c",
      Solver.process("omaha-holdem 3c6s8hJsQc 8s5h2h9d 6h7d5c2c 8cQdQh6c 3d3sTcTs 2dKsKh9s AhKdTh5s Kc4d7sJd 7h5d4h9h"));
  }

  @Test
  public void test_omaha_holdem_448_2h3c3d7dKh_5dTdKdAh_4h8s2cQs() {
    assertEquals(
      "4h8s2cQs 5dTdKdAh",
      Solver.process("omaha-holdem 2h3c3d7dKh 5dTdKdAh 4h8s2cQs"));
  }

  @Test
  public void test_omaha_holdem_449_3s6h9dQsTd_2h8s7hAc_Ts5cJc2c() {
    assertEquals(
      "Ts5cJc2c 2h8s7hAc",
      Solver.process("omaha-holdem 3s6h9dQsTd 2h8s7hAc Ts5cJc2c"));
  }

  @Test
  public void test_omaha_holdem_450_2h3c7c8d8h_3s5dKs4s_JsTdJd5h_7d7hJhQd_Th7sAhKd_9hQc2dAc_5cQhQs6s_6d8sAsTs_9d9cKc9s() {
    assertEquals(
      "9hQc2dAc 3s5dKs4s Th7sAhKd 9d9cKc9s JsTdJd5h 5cQhQs6s 6d8sAsTs 7d7hJhQd",
      Solver.process("omaha-holdem 2h3c7c8d8h 3s5dKs4s JsTdJd5h 7d7hJhQd Th7sAhKd 9hQc2dAc 5cQhQs6s 6d8sAsTs 9d9cKc9s"));
  }

  @Test
  public void test_omaha_holdem_451_2s5hAsJhKd_6d9s5dAc_7hJs9h8h_JdAdKcQs_8cTc8s4h_9dTh7c4d_2cQh8d2d_Ah7sQdTs_6sQc2h5s_7dJc5c9c() {
    assertEquals(
      "9dTh7c4d 8cTc8s4h 7hJs9h8h 6sQc2h5s 7dJc5c9c 6d9s5dAc JdAdKcQs 2cQh8d2d Ah7sQdTs",
      Solver.process("omaha-holdem 2s5hAsJhKd 6d9s5dAc 7hJs9h8h JdAdKcQs 8cTc8s4h 9dTh7c4d 2cQh8d2d Ah7sQdTs 6sQc2h5s 7dJc5c9c"));
  }

  @Test
  public void test_omaha_holdem_452_4d4s6s7hQs_3sKs7s9s_4cAs5c6c_JhJd2s8h_7c5s3h3d_5hKhAdJs_6hAh8s3c_Qh7dJcAc() {
    assertEquals(
      "5hKhAdJs 6hAh8s3c JhJd2s8h Qh7dJcAc 7c5s3h3d 3sKs7s9s 4cAs5c6c",
      Solver.process("omaha-holdem 4d4s6s7hQs 3sKs7s9s 4cAs5c6c JhJd2s8h 7c5s3h3d 5hKhAdJs 6hAh8s3c Qh7dJcAc"));
  }

  @Test
  public void test_omaha_holdem_453_3h7c8d9sJc_4s5c9c6d_5dJdJsTs_9hJh7s6h() {
    assertEquals(
      "9hJh7s6h 4s5c9c6d 5dJdJsTs",
      Solver.process("omaha-holdem 3h7c8d9sJc 4s5c9c6d 5dJdJsTs 9hJh7s6h"));
  }

  @Test
  public void test_omaha_holdem_454_4s7c9sAsJd_5dJc5h7d_JsAd8d6c_Qd3c2dAh_5s2cTcTd_4d4c5cJh_Kc9d8c7s_3s7h6s6d() {
    assertEquals(
      "5s2cTcTd Qd3c2dAh Kc9d8c7s 5dJc5h7d JsAd8d6c 4d4c5cJh 3s7h6s6d",
      Solver.process("omaha-holdem 4s7c9sAsJd 5dJc5h7d JsAd8d6c Qd3c2dAh 5s2cTcTd 4d4c5cJh Kc9d8c7s 3s7h6s6d"));
  }

  @Test
  public void test_omaha_holdem_455_2c2d7hAcJh_As2s7sKh_8c9h6hTs_Kd8hJs4d_Qh3s6dJd_Kc9c4h2h_Td5c5d6s_3c8s7dKs() {
    assertEquals(
      "8c9h6hTs Td5c5d6s 3c8s7dKs Qh3s6dJd Kd8hJs4d Kc9c4h2h As2s7sKh",
      Solver.process("omaha-holdem 2c2d7hAcJh As2s7sKh 8c9h6hTs Kd8hJs4d Qh3s6dJd Kc9c4h2h Td5c5d6s 3c8s7dKs"));
  }

  @Test
  public void test_omaha_holdem_456_7sAhJcJdTc_JsAd3sQh_As8h2dAc_KhTd5h7c_2sKs4cKc_Qs9s5s9d_Qd6d3h7h_Ts3d8dQc_9h2c4s5d_Kd8s8c6c() {
    assertEquals(
      "9h2c4s5d Qd6d3h7h Kd8s8c6c Qs9s5s9d Ts3d8dQc KhTd5h7c 2sKs4cKc JsAd3sQh As8h2dAc",
      Solver.process("omaha-holdem 7sAhJcJdTc JsAd3sQh As8h2dAc KhTd5h7c 2sKs4cKc Qs9s5s9d Qd6d3h7h Ts3d8dQc 9h2c4s5d Kd8s8c6c"));
  }

  @Test
  public void test_omaha_holdem_457_4d7s8hAhTc_9sQsKc7h_AcKhAsJc_3d5d5h4s_8sKd6h9h_6c2h7cTh_Jd9cTs3s_8cJh6sQd() {
    assertEquals(
      "3d5d5h4s 9sQsKc7h 8cJh6sQd 6c2h7cTh AcKhAsJc 8sKd6h9h Jd9cTs3s",
      Solver.process("omaha-holdem 4d7s8hAhTc 9sQsKc7h AcKhAsJc 3d5d5h4s 8sKd6h9h 6c2h7cTh Jd9cTs3s 8cJh6sQd"));
  }

  @Test
  public void test_omaha_holdem_458_5d5h6dAsKc_8dJh6h2s_6c2d3sAd_7c6sQdQs_9sJd7dAc_Td8sQc9h_Js4c8cAh_Th9c3d7s_Qh7h2cJc_TsKd4h4s() {
    assertEquals(
      "Th9c3d7s Td8sQc9h Qh7h2cJc 8dJh6h2s 7c6sQdQs TsKd4h4s 9sJd7dAc=Js4c8cAh 6c2d3sAd",
      Solver.process("omaha-holdem 5d5h6dAsKc 8dJh6h2s 6c2d3sAd 7c6sQdQs 9sJd7dAc Td8sQc9h Js4c8cAh Th9c3d7s Qh7h2cJc TsKd4h4s"));
  }

  @Test
  public void test_omaha_holdem_459_3h9hAsKdKs_8d3cTdJh_8s9cAh6h_6d6cAc2h_6s4hTc7d_5d7sJs3d_KhQd7c8c() {
    assertEquals(
      "6s4hTc7d 5d7sJs3d=8d3cTdJh 6d6cAc2h 8s9cAh6h KhQd7c8c",
      Solver.process("omaha-holdem 3h9hAsKdKs 8d3cTdJh 8s9cAh6h 6d6cAc2h 6s4hTc7d 5d7sJs3d KhQd7c8c"));
  }

  @Test
  public void test_omaha_holdem_460_5h5s6dAcAs_TdKc4sJs_9hTc3s4c() {
    assertEquals(
      "9hTc3s4c TdKc4sJs",
      Solver.process("omaha-holdem 5h5s6dAcAs TdKc4sJs 9hTc3s4c"));
  }

  @Test
  public void test_omaha_holdem_461_3s4d8hQsTs_2sAc7s9c_3d2hAs3h_7dKh9h9d_Ks5c6d5h_4s4c3c4h() {
    assertEquals(
      "Ks5c6d5h 7dKh9h9d 3d2hAs3h 4s4c3c4h 2sAc7s9c",
      Solver.process("omaha-holdem 3s4d8hQsTs 2sAc7s9c 3d2hAs3h 7dKh9h9d Ks5c6d5h 4s4c3c4h"));
  }

  @Test
  public void test_omaha_holdem_462_6h6s7c7h7s_4hJs8s9h_2cKsTcQh_2hJd3dAd_4s9cAhAc_3s9sTd5c_Kd9dQcTs_7d2d5d5h_4d5sThKc() {
    assertEquals(
      "3s9sTd5c 4hJs8s9h 4d5sThKc 2cKsTcQh=Kd9dQcTs 2hJd3dAd 4s9cAhAc 7d2d5d5h",
      Solver.process("omaha-holdem 6h6s7c7h7s 4hJs8s9h 2cKsTcQh 2hJd3dAd 4s9cAhAc 3s9sTd5c Kd9dQcTs 7d2d5d5h 4d5sThKc"));
  }

  @Test
  public void test_omaha_holdem_463_2d5c6hJhTh_2s8c9h7d_JcAsTdTc_7sJsQcKs_Kd6d6cKh_5h6sQs7h() {
    assertEquals(
      "2s8c9h7d 7sJsQcKs Kd6d6cKh JcAsTdTc 5h6sQs7h",
      Solver.process("omaha-holdem 2d5c6hJhTh 2s8c9h7d JcAsTdTc 7sJsQcKs Kd6d6cKh 5h6sQs7h"));
  }

  @Test
  public void test_omaha_holdem_464_2c4c4s7d9h_3d8s6hAs_5s7s4d5h_QdJcTdJh_9c3s5dQh() {
    assertEquals(
      "3d8s6hAs 9c3s5dQh QdJcTdJh 5s7s4d5h",
      Solver.process("omaha-holdem 2c4c4s7d9h 3d8s6hAs 5s7s4d5h QdJcTdJh 9c3s5dQh"));
  }

  @Test
  public void test_omaha_holdem_465_4h4s8s9hJs_9dQcKsTs_2s9c8h2c_Kd6cTh2h() {
    assertEquals(
      "Kd6cTh2h 2s9c8h2c 9dQcKsTs",
      Solver.process("omaha-holdem 4h4s8s9hJs 9dQcKsTs 2s9c8h2c Kd6cTh2h"));
  }

  @Test
  public void test_omaha_holdem_466_3d5d9c9hKs_2s5h7sTs_ThTcAd7c_3sAs9sKc_Jd8d4d7h_4hAcTd7d_6c4sAh3h_Jc8c6s6d_KdKh2c9d() {
    assertEquals(
      "Jd8d4d7h 4hAcTd7d 6c4sAh3h 2s5h7sTs Jc8c6s6d ThTcAd7c 3sAs9sKc KdKh2c9d",
      Solver.process("omaha-holdem 3d5d9c9hKs 2s5h7sTs ThTcAd7c 3sAs9sKc Jd8d4d7h 4hAcTd7d 6c4sAh3h Jc8c6s6d KdKh2c9d"));
  }

  @Test
  public void test_omaha_holdem_467_4c5c5sAcKd_4sAh4h7c_7sJs7d8s_Kh8dAsKs_9d8hTc3h_Kc2s9sJd_3c3s9c3d_7h5h4dTd() {
    assertEquals(
      "9d8hTc3h 7sJs7d8s Kc2s9sJd 3c3s9c3d 4sAh4h7c 7h5h4dTd Kh8dAsKs",
      Solver.process("omaha-holdem 4c5c5sAcKd 4sAh4h7c 7sJs7d8s Kh8dAsKs 9d8hTc3h Kc2s9sJd 3c3s9c3d 7h5h4dTd"));
  }

  @Test
  public void test_omaha_holdem_468_4d6dAcJsTc_Ad7h9d2h_9c5s6cAs_4h8dQhKs_7sQsTd3s_2cKcThJd() {
    assertEquals(
      "7sQsTd3s Ad7h9d2h 2cKcThJd 9c5s6cAs 4h8dQhKs",
      Solver.process("omaha-holdem 4d6dAcJsTc Ad7h9d2h 9c5s6cAs 4h8dQhKs 7sQsTd3s 2cKcThJd"));
  }

  @Test
  public void test_omaha_holdem_469_2d3s4s5dAc_4c7hKd2s_AdJdAs6s_5c8cQhQs() {
    assertEquals(
      "5c8cQhQs AdJdAs6s 4c7hKd2s",
      Solver.process("omaha-holdem 2d3s4s5dAc 4c7hKd2s AdJdAs6s 5c8cQhQs"));
  }

  @Test
  public void test_omaha_holdem_470_2h4dJhQhQs_4hJcTc2s_Ks6d6h5h_6c7cJd3c_7hTs5cTh() {
    assertEquals(
      "6c7cJd3c 4hJcTc2s Ks6d6h5h 7hTs5cTh",
      Solver.process("omaha-holdem 2h4dJhQhQs 4hJcTc2s Ks6d6h5h 6c7cJd3c 7hTs5cTh"));
  }

  @Test
  public void test_omaha_holdem_471_2c4hJcJsQd_Qh4sJdAd_3h5s7d9h_3sAs8h8d_Tc5c7hQs_Qc6h8s9s_2sAcJhAh_6sTh2dTs() {
    assertEquals(
      "3h5s7d9h 3sAs8h8d 6sTh2dTs Qc6h8s9s Tc5c7hQs 2sAcJhAh Qh4sJdAd",
      Solver.process("omaha-holdem 2c4hJcJsQd Qh4sJdAd 3h5s7d9h 3sAs8h8d Tc5c7hQs Qc6h8s9s 2sAcJhAh 6sTh2dTs"));
  }

  @Test
  public void test_omaha_holdem_472_3d8sAsJdQd_3sQh4c8h_5sKh3cJh_2cThTsJc_8c7dKd6d_5d6s6cTd_5c2s7sAd_4dJs5h9s_7h2dQsKc_4s8dAh9h() {
    assertEquals(
      "4dJs5h9s 2cThTsJc 7h2dQsKc 5c2s7sAd 5sKh3cJh 3sQh4c8h 4s8dAh9h 5d6s6cTd 8c7dKd6d",
      Solver.process("omaha-holdem 3d8sAsJdQd 3sQh4c8h 5sKh3cJh 2cThTsJc 8c7dKd6d 5d6s6cTd 5c2s7sAd 4dJs5h9s 7h2dQsKc 4s8dAh9h"));
  }

  @Test
  public void test_omaha_holdem_473_2c4d8dKdQh_6s4sKcTh_Kh3d8sTc_As9d5dJc_2h4hAd7c_5h8hJs9s() {
    assertEquals(
      "5h8hJs9s 2h4hAd7c 6s4sKcTh Kh3d8sTc As9d5dJc",
      Solver.process("omaha-holdem 2c4d8dKdQh 6s4sKcTh Kh3d8sTc As9d5dJc 2h4hAd7c 5h8hJs9s"));
  }

  @Test
  public void test_omaha_holdem_474_2s7sAcQdTc_Qs3hAs3d_Th5dJhQh_2dKc5s8d_8h5cJc6h() {
    assertEquals(
      "8h5cJc6h 2dKc5s8d Th5dJhQh Qs3hAs3d",
      Solver.process("omaha-holdem 2s7sAcQdTc Qs3hAs3d Th5dJhQh 2dKc5s8d 8h5cJc6h"));
  }

  @Test
  public void test_omaha_holdem_475_2d3h9hKcKd_7dAc4hJs_QhTh6d6c_8d2hTcJc_3d5h9dTs_7sAd7hQd_2s3cJd4c() {
    assertEquals(
      "7dAc4hJs 8d2hTcJc 2s3cJd4c QhTh6d6c 7sAd7hQd 3d5h9dTs",
      Solver.process("omaha-holdem 2d3h9hKcKd 7dAc4hJs QhTh6d6c 8d2hTcJc 3d5h9dTs 7sAd7hQd 2s3cJd4c"));
  }

  @Test
  public void test_omaha_holdem_476_2d2s8c8hTd_9d3dTh6h_Tc7sKd3c_4d6sJdAh() {
    assertEquals(
      "4d6sJdAh 9d3dTh6h Tc7sKd3c",
      Solver.process("omaha-holdem 2d2s8c8hTd 9d3dTh6h Tc7sKd3c 4d6sJdAh"));
  }

  @Test
  public void test_omaha_holdem_477_2h4s6dAdJs_4c3c4hQd_Kd7d7sJc_5cAsTh6h_6sKs9h5s_8dQsKhKc_9s2s3s2c_9d7h4dJh_QhJdAh3h_8c2dTd9c() {
    assertEquals(
      "8c2dTd9c 6sKs9h5s Kd7d7sJc 8dQsKhKc 9d7h4dJh 5cAsTh6h QhJdAh3h 9s2s3s2c 4c3c4hQd",
      Solver.process("omaha-holdem 2h4s6dAdJs 4c3c4hQd Kd7d7sJc 5cAsTh6h 6sKs9h5s 8dQsKhKc 9s2s3s2c 9d7h4dJh QhJdAh3h 8c2dTd9c"));
  }

  @Test
  public void test_omaha_holdem_478_2s4h5h7d8h_QhAdKh6c_5s8dQcAh_9h3hJs6h_4c8c5d2h_3dAcQs7s_Tc8s9s4d_9c4sTs3c_KcTdQdJh_3s5c7hJd() {
    assertEquals(
      "KcTdQdJh 9c4sTs3c 3s5c7hJd Tc8s9s4d 4c8c5d2h=5s8dQcAh 3dAcQs7s 9h3hJs6h QhAdKh6c",
      Solver.process("omaha-holdem 2s4h5h7d8h QhAdKh6c 5s8dQcAh 9h3hJs6h 4c8c5d2h 3dAcQs7s Tc8s9s4d 9c4sTs3c KcTdQdJh 3s5c7hJd"));
  }

  @Test
  public void test_omaha_holdem_479_8c8hJhKhQd_Tc4hJdQc_3hAh4dAs_6d5c2cJc_5s7s9d4c_6hJs5dTd_TsKs5hQs() {
    assertEquals(
      "5s7s9d4c 6d5c2cJc 6hJs5dTd Tc4hJdQc TsKs5hQs 3hAh4dAs",
      Solver.process("omaha-holdem 8c8hJhKhQd Tc4hJdQc 3hAh4dAs 6d5c2cJc 5s7s9d4c 6hJs5dTd TsKs5hQs"));
  }

  @Test
  public void test_omaha_holdem_480_2h4s9sJhKs_Kh4c7hQh_8cQc6h7c_Kd3s5sTc() {
    assertEquals(
      "8cQc6h7c Kh4c7hQh Kd3s5sTc",
      Solver.process("omaha-holdem 2h4s9sJhKs Kh4c7hQh 8cQc6h7c Kd3s5sTc"));
  }

  @Test
  public void test_omaha_holdem_481_3h4cQcQdQs_9h6sQh9d_Tc5s9sKc_JdTs6d7s_5c3dJc8d() {
    assertEquals(
      "5c3dJc8d JdTs6d7s Tc5s9sKc 9h6sQh9d",
      Solver.process("omaha-holdem 3h4cQcQdQs 9h6sQh9d Tc5s9sKc JdTs6d7s 5c3dJc8d"));
  }

  @Test
  public void test_omaha_holdem_482_2d3s5dJcTd_9sAdTcKc_Ah9d8c4h_7d2cQcQs_2h4d5h9h_8s8d6d3d() {
    assertEquals(
      "9sAdTcKc 7d2cQcQs 2h4d5h9h Ah9d8c4h 8s8d6d3d",
      Solver.process("omaha-holdem 2d3s5dJcTd 9sAdTcKc Ah9d8c4h 7d2cQcQs 2h4d5h9h 8s8d6d3d"));
  }

  @Test
  public void test_omaha_holdem_483_4h7s9sKhQs_3sTs5c9h_Qh5hAs8c_4c8hJh8d_6h2cQcAh_Ad4d5dJc_JdKs3d7h() {
    assertEquals(
      "Ad4d5dJc 4c8hJh8d 6h2cQcAh=Qh5hAs8c JdKs3d7h 3sTs5c9h",
      Solver.process("omaha-holdem 4h7s9sKhQs 3sTs5c9h Qh5hAs8c 4c8hJh8d 6h2cQcAh Ad4d5dJc JdKs3d7h"));
  }

  @Test
  public void test_omaha_holdem_484_3d3h5s7dKs_Kc5d2c2h_9dThAd4d_5cJh9sAc() {
    assertEquals(
      "9dThAd4d 5cJh9sAc Kc5d2c2h",
      Solver.process("omaha-holdem 3d3h5s7dKs Kc5d2c2h 9dThAd4d 5cJh9sAc"));
  }

  @Test
  public void test_omaha_holdem_485_7c8s9cJhTc_KhKs6hQs_6dKd8hTs_Td9sAh5c_Js3c5sQd_4c3s7h6c() {
    assertEquals(
      "6dKd8hTs=Td9sAh5c Js3c5sQd KhKs6hQs 4c3s7h6c",
      Solver.process("omaha-holdem 7c8s9cJhTc KhKs6hQs 6dKd8hTs Td9sAh5c Js3c5sQd 4c3s7h6c"));
  }

  @Test
  public void test_omaha_holdem_486_5d6s8sKdTh_3cJdAc9h_QdKs5h3d() {
    assertEquals(
      "3cJdAc9h QdKs5h3d",
      Solver.process("omaha-holdem 5d6s8sKdTh 3cJdAc9h QdKs5h3d"));
  }

  @Test
  public void test_omaha_holdem_487_5h5s6c7dKh_6s7h9c4h_3dTd3c7c_7s2sQhQd_8dAc9h4d_8hKdJhAh_As5cAd9s() {
    assertEquals(
      "3dTd3c7c 6s7h9c4h 7s2sQhQd 8hKdJhAh As5cAd9s 8dAc9h4d",
      Solver.process("omaha-holdem 5h5s6c7dKh 6s7h9c4h 3dTd3c7c 7s2sQhQd 8dAc9h4d 8hKdJhAh As5cAd9s"));
  }

  @Test
  public void test_omaha_holdem_488_3h4c4h5sAd_5c4s9hQh_8h6d9dKs_3d6s5dKh_2c2sKc9s_JdAh8dKd_7sTd2dAc_3c9cQcJc() {
    assertEquals(
      "8h6d9dKs 2c2sKc9s 3c9cQcJc 3d6s5dKh JdAh8dKd 7sTd2dAc 5c4s9hQh",
      Solver.process("omaha-holdem 3h4c4h5sAd 5c4s9hQh 8h6d9dKs 3d6s5dKh 2c2sKc9s JdAh8dKd 7sTd2dAc 3c9cQcJc"));
  }

  @Test
  public void test_omaha_holdem_489_3s5c6d6hAs_2hJhJsAd_Ks2c9c5s() {
    assertEquals(
      "Ks2c9c5s 2hJhJsAd",
      Solver.process("omaha-holdem 3s5c6d6hAs 2hJhJsAd Ks2c9c5s"));
  }

  @Test
  public void test_omaha_holdem_490_2h2s7sAdJh_6s6c7dJd_8h3s6hQh_Ah5s3dKc_Jc9dKhJs_9c4cTs2c_8s4dQc5c_5h9sKd3c() {
    assertEquals(
      "8h3s6hQh=8s4dQc5c 5h9sKd3c 6s6c7dJd Ah5s3dKc 9c4cTs2c Jc9dKhJs",
      Solver.process("omaha-holdem 2h2s7sAdJh 6s6c7dJd 8h3s6hQh Ah5s3dKc Jc9dKhJs 9c4cTs2c 8s4dQc5c 5h9sKd3c"));
  }

  @Test
  public void test_omaha_holdem_491_2h3c5h5s9h_5c7c4s7h_6h4h8dAc_6c4dAs4c_9cKsKcJd_6sQdQcTd_7dQs9d7s() {
    assertEquals(
      "7dQs9d7s 6sQdQcTd 9cKsKcJd 5c7c4s7h 6c4dAs4c 6h4h8dAc",
      Solver.process("omaha-holdem 2h3c5h5s9h 5c7c4s7h 6h4h8dAc 6c4dAs4c 9cKsKcJd 6sQdQcTd 7dQs9d7s"));
  }

  @Test
  public void test_omaha_holdem_492_5h7c8dJdQh_2s4h5c6c_6dQdTd9s_TcTh8hAh() {
    assertEquals(
      "TcTh8hAh 2s4h5c6c 6dQdTd9s",
      Solver.process("omaha-holdem 5h7c8dJdQh 2s4h5c6c 6dQdTd9s TcTh8hAh"));
  }

  @Test
  public void test_omaha_holdem_493_5h9sAcJdTs_2h8h4sQc_7s9h7d3h_8c2d6dQs_5d2cThTd_Ah9d6h2s_9cKc8s5c() {
    assertEquals(
      "7s9h7d3h 9cKc8s5c Ah9d6h2s 5d2cThTd 2h8h4sQc=8c2d6dQs",
      Solver.process("omaha-holdem 5h9sAcJdTs 2h8h4sQc 7s9h7d3h 8c2d6dQs 5d2cThTd Ah9d6h2s 9cKc8s5c"));
  }

  @Test
  public void test_omaha_holdem_494_7s8d8s9dTc_Qd6hAsKs_2s4d5d7c_6c6d6sTh_AhKdJsJh_3h3dKcKh_2d7d3cQc_9h5s3sTd() {
    assertEquals(
      "Qd6hAsKs 2s4d5d7c 2d7d3cQc 9h5s3sTd AhKdJsJh 3h3dKcKh 6c6d6sTh",
      Solver.process("omaha-holdem 7s8d8s9dTc Qd6hAsKs 2s4d5d7c 6c6d6sTh AhKdJsJh 3h3dKcKh 2d7d3cQc 9h5s3sTd"));
  }

  @Test
  public void test_omaha_holdem_495_3s5sAsQcTs_Ac4s9s5d_Jd7h4c3h_QhKd4dAd() {
    assertEquals(
      "Jd7h4c3h QhKd4dAd Ac4s9s5d",
      Solver.process("omaha-holdem 3s5sAsQcTs Ac4s9s5d Jd7h4c3h QhKd4dAd"));
  }

  @Test
  public void test_omaha_holdem_496_2s4d8cKcQd_2c3c9d2h_Jd7d2dAs_TcJhTs8s() {
    assertEquals(
      "Jd7d2dAs TcJhTs8s 2c3c9d2h",
      Solver.process("omaha-holdem 2s4d8cKcQd 2c3c9d2h Jd7d2dAs TcJhTs8s"));
  }

  @Test
  public void test_omaha_holdem_497_4c4s9hKcTh_Ac3s8c9d_6c2h4dKs() {
    assertEquals(
      "Ac3s8c9d 6c2h4dKs",
      Solver.process("omaha-holdem 4c4s9hKcTh Ac3s8c9d 6c2h4dKs"));
  }

  @Test
  public void test_omaha_holdem_498_3d3h7sAsTs_7d8h7h8c_3c5sQhKs_6cKh4h5c_4cJc3sQc_Ac6sQs2h_2cJsJh2s_4s8d6d9h_Kd8s6h9s_Jd7c9d5d() {
    assertEquals(
      "4s8d6d9h 6cKh4h5c Jd7c9d5d 4cJc3sQc Kd8s6h9s 2cJsJh2s Ac6sQs2h 3c5sQhKs 7d8h7h8c",
      Solver.process("omaha-holdem 3d3h7sAsTs 7d8h7h8c 3c5sQhKs 6cKh4h5c 4cJc3sQc Ac6sQs2h 2cJsJh2s 4s8d6d9h Kd8s6h9s Jd7c9d5d"));
  }

  @Test
  public void test_omaha_holdem_499_4h9dJdJsTs_3hKh5c5s_2h6h6s4c_7cKdKs4d_3dJc9s5h_8hAhQc8s() {
    assertEquals(
      "3hKh5c5s 2h6h6s4c 7cKdKs4d 8hAhQc8s 3dJc9s5h",
      Solver.process("omaha-holdem 4h9dJdJsTs 3hKh5c5s 2h6h6s4c 7cKdKs4d 3dJc9s5h 8hAhQc8s"));
  }

}
