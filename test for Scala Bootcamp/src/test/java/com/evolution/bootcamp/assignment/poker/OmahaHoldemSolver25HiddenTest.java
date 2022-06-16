
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver25HiddenTest {


  @Test
  public void test_omaha_holdem_6250_5d8h9dKdTs_5s8d6hKs_QdKh7c4s_9sAh3d5c_3c5h8s2d_2sTdQc3s_As3h4d6d_Qh6s6cTc_7s7hJdKc_7dAd4c8c() {
    assertEquals(
      "2sTdQc3s=Qh6s6cTc QdKh7c4s 3c5h8s2d 9sAh3d5c 5s8d6hKs 7s7hJdKc As3h4d6d 7dAd4c8c",
      Solver.process("omaha-holdem 5d8h9dKdTs 5s8d6hKs QdKh7c4s 9sAh3d5c 3c5h8s2d 2sTdQc3s As3h4d6d Qh6s6cTc 7s7hJdKc 7dAd4c8c"));
  }

  @Test
  public void test_omaha_holdem_6251_5h9dAcKcQc_3d7hAs6h_6dTc8c6c() {
    assertEquals(
      "3d7hAs6h 6dTc8c6c",
      Solver.process("omaha-holdem 5h9dAcKcQc 3d7hAs6h 6dTc8c6c"));
  }

  @Test
  public void test_omaha_holdem_6252_5c5s7h8cAc_QhQd8d4h_JsQcTs2s_3hAs9hAd_6hTh4s3s_TcQs2h4d_Jd8sKhTd_Jc2d2c6s_9c5h3c7s() {
    assertEquals(
      "TcQs2h4d JsQcTs2s Jd8sKhTd QhQd8d4h 6hTh4s3s Jc2d2c6s 9c5h3c7s 3hAs9hAd",
      Solver.process("omaha-holdem 5c5s7h8cAc QhQd8d4h JsQcTs2s 3hAs9hAd 6hTh4s3s TcQs2h4d Jd8sKhTd Jc2d2c6s 9c5h3c7s"));
  }

  @Test
  public void test_omaha_holdem_6253_2d3s7c8hQd_Js8s2s9c_7d4d2c6d_Qh6sKdTh_5sJc9s5h_AsTd3cAc() {
    assertEquals(
      "5sJc9s5h Qh6sKdTh AsTd3cAc 7d4d2c6d Js8s2s9c",
      Solver.process("omaha-holdem 2d3s7c8hQd Js8s2s9c 7d4d2c6d Qh6sKdTh 5sJc9s5h AsTd3cAc"));
  }

  @Test
  public void test_omaha_holdem_6254_2c2s5h7dKs_AcKhTsTd_8cAh9s9h_8h2d5c8d() {
    assertEquals(
      "8cAh9s9h AcKhTsTd 8h2d5c8d",
      Solver.process("omaha-holdem 2c2s5h7dKs AcKhTsTd 8cAh9s9h 8h2d5c8d"));
  }

  @Test
  public void test_omaha_holdem_6255_2d3d6h9cAc_KdAs6c7h_Qc3c8hQd_2hJhKs8s_JsTd4d4s_AdKhKc7s() {
    assertEquals(
      "2hJhKs8s JsTd4d4s Qc3c8hQd AdKhKc7s KdAs6c7h",
      Solver.process("omaha-holdem 2d3d6h9cAc KdAs6c7h Qc3c8hQd 2hJhKs8s JsTd4d4s AdKhKc7s"));
  }

  @Test
  public void test_omaha_holdem_6256_4sJdJhTdTh_8dKd7s4d_4h2d9sKc_TcJc3c7d_6h9c9d6d() {
    assertEquals(
      "4h2d9sKc=8dKd7s4d 6h9c9d6d TcJc3c7d",
      Solver.process("omaha-holdem 4sJdJhTdTh 8dKd7s4d 4h2d9sKc TcJc3c7d 6h9c9d6d"));
  }

  @Test
  public void test_omaha_holdem_6257_4c5h6cAdKd_7c8h9dJc_Qh4d2dQs_4hAh2h7h_3hJh9s6d_7sKs3c2c_5sQdThAs() {
    assertEquals(
      "3hJh9s6d Qh4d2dQs 4hAh2h7h 5sQdThAs 7sKs3c2c 7c8h9dJc",
      Solver.process("omaha-holdem 4c5h6cAdKd 7c8h9dJc Qh4d2dQs 4hAh2h7h 3hJh9s6d 7sKs3c2c 5sQdThAs"));
  }

  @Test
  public void test_omaha_holdem_6258_2s3s6sJhKh_Td7s8sAs_2c7d5cAc() {
    assertEquals(
      "2c7d5cAc Td7s8sAs",
      Solver.process("omaha-holdem 2s3s6sJhKh Td7s8sAs 2c7d5cAc"));
  }

  @Test
  public void test_omaha_holdem_6259_2c3s4d8hAs_JsAd8s5d_4h4c9sTh_6s7dQs6c_KdQd8cKh_2s7h8dKs() {
    assertEquals(
      "6s7dQs6c KdQd8cKh 2s7h8dKs 4h4c9sTh JsAd8s5d",
      Solver.process("omaha-holdem 2c3s4d8hAs JsAd8s5d 4h4c9sTh 6s7dQs6c KdQd8cKh 2s7h8dKs"));
  }

  @Test
  public void test_omaha_holdem_6260_3s5d5s6sKh_4s2c6c8c_4h4dThJh() {
    assertEquals(
      "4h4dThJh 4s2c6c8c",
      Solver.process("omaha-holdem 3s5d5s6sKh 4s2c6c8c 4h4dThJh"));
  }

  @Test
  public void test_omaha_holdem_6261_3h3s4dAdJs_Jd8sKd7h_Jc7d8c5h() {
    assertEquals(
      "Jc7d8c5h Jd8sKd7h",
      Solver.process("omaha-holdem 3h3s4dAdJs Jd8sKd7h Jc7d8c5h"));
  }

  @Test
  public void test_omaha_holdem_6262_8hJdJsTcTd_QcTs7sAs_8d5dAd3h_KhKdKsQh_4hQdKc2c_6s6d3s6c_9s9d9h2s() {
    assertEquals(
      "4hQdKc2c 6s6d3s6c 8d5dAd3h 9s9d9h2s KhKdKsQh QcTs7sAs",
      Solver.process("omaha-holdem 8hJdJsTcTd QcTs7sAs 8d5dAd3h KhKdKsQh 4hQdKc2c 6s6d3s6c 9s9d9h2s"));
  }

  @Test
  public void test_omaha_holdem_6263_5c5d6dKdTs_AdAcQh7c_6hJs4d2d() {
    assertEquals(
      "AdAcQh7c 6hJs4d2d",
      Solver.process("omaha-holdem 5c5d6dKdTs AdAcQh7c 6hJs4d2d"));
  }

  @Test
  public void test_omaha_holdem_6264_5c5h7c8dKc_2c3d6s4h_6h4d9dJd_6dQh3hAs_TdQcTh9c_4s7d6cJc_TsQs2dAh_QdKs4cKd_2sJsJh9h_Kh8c9s8s() {
    assertEquals(
      "6dQh3hAs=TsQs2dAh 2sJsJh9h 2c3d6s4h 6h4d9dJd 4s7d6cJc TdQcTh9c Kh8c9s8s QdKs4cKd",
      Solver.process("omaha-holdem 5c5h7c8dKc 2c3d6s4h 6h4d9dJd 6dQh3hAs TdQcTh9c 4s7d6cJc TsQs2dAh QdKs4cKd 2sJsJh9h Kh8c9s8s"));
  }

  @Test
  public void test_omaha_holdem_6265_4d8c9cAdKc_AhJs8h8d_6h8sAc2c_TcTd4s7h_Ts5s3s9h_6s6d4h5h_Ks9sThJc() {
    assertEquals(
      "6s6d4h5h Ts5s3s9h TcTd4s7h Ks9sThJc AhJs8h8d 6h8sAc2c",
      Solver.process("omaha-holdem 4d8c9cAdKc AhJs8h8d 6h8sAc2c TcTd4s7h Ts5s3s9h 6s6d4h5h Ks9sThJc"));
  }

  @Test
  public void test_omaha_holdem_6266_5c6d6h9cAd_3h4c5sJd_5d9h2s7h_Td4dKdAc_KhKc4s8d_3s8s9s9d_6sKsTs8h_JcQhQs2h() {
    assertEquals(
      "3h4c5sJd 5d9h2s7h JcQhQs2h KhKc4s8d Td4dKdAc 6sKsTs8h 3s8s9s9d",
      Solver.process("omaha-holdem 5c6d6h9cAd 3h4c5sJd 5d9h2s7h Td4dKdAc KhKc4s8d 3s8s9s9d 6sKsTs8h JcQhQs2h"));
  }

  @Test
  public void test_omaha_holdem_6267_7h8hJdQsTh_2dJh6sKd_6h3c7c7d_KcTs4sQh_4h5d5h8c_Kh9c3d4d_Td6cKs9s() {
    assertEquals(
      "2dJh6sKd KcTs4sQh 6h3c7c7d Kh9c3d4d=Td6cKs9s 4h5d5h8c",
      Solver.process("omaha-holdem 7h8hJdQsTh 2dJh6sKd 6h3c7c7d KcTs4sQh 4h5d5h8c Kh9c3d4d Td6cKs9s"));
  }

  @Test
  public void test_omaha_holdem_6268_3c4c4h8s9d_KsAsAh5d_2s7h8d7d_Kc6c6hTc_Qd2hThKh() {
    assertEquals(
      "Qd2hThKh Kc6c6hTc 2s7h8d7d KsAsAh5d",
      Solver.process("omaha-holdem 3c4c4h8s9d KsAsAh5d 2s7h8d7d Kc6c6hTc Qd2hThKh"));
  }

  @Test
  public void test_omaha_holdem_6269_2h8h9dAcQs_7hQdQc2c_4sKs9h6h_7sTh3h2s_TdJd8dTs_3s9cAd5d_5h9s4c6d_7c6c4dTc_Qh4h3d2d() {
    assertEquals(
      "7c6c4dTc 7sTh3h2s 5h9s4c6d 4sKs9h6h Qh4h3d2d 3s9cAd5d 7hQdQc2c TdJd8dTs",
      Solver.process("omaha-holdem 2h8h9dAcQs 7hQdQc2c 4sKs9h6h 7sTh3h2s TdJd8dTs 3s9cAd5d 5h9s4c6d 7c6c4dTc Qh4h3d2d"));
  }

  @Test
  public void test_omaha_holdem_6270_4c5d7h8dAc_9c8c4d5h_2d9h8h3s_6c4h4sQs_Qd6hTc3c_6d9s8sKd_7cQcKh7d_Qh2cKcJs_7s5cAsAd() {
    assertEquals(
      "Qh2cKcJs 9c8c4d5h 7cQcKh7d 7s5cAsAd 2d9h8h3s Qd6hTc3c 6c4h4sQs 6d9s8sKd",
      Solver.process("omaha-holdem 4c5d7h8dAc 9c8c4d5h 2d9h8h3s 6c4h4sQs Qd6hTc3c 6d9s8sKd 7cQcKh7d Qh2cKcJs 7s5cAsAd"));
  }

  @Test
  public void test_omaha_holdem_6271_2c6s8cAdQc_5hQh7hTc_Ac3d4hQs_9cKd6d3h_7c6c5dTs_5cAs8dQd_8h3cAhJs() {
    assertEquals(
      "9cKd6d3h 5hQh7hTc 8h3cAhJs 5cAs8dQd=Ac3d4hQs 7c6c5dTs",
      Solver.process("omaha-holdem 2c6s8cAdQc 5hQh7hTc Ac3d4hQs 9cKd6d3h 7c6c5dTs 5cAs8dQd 8h3cAhJs"));
  }

  @Test
  public void test_omaha_holdem_6272_2d2h4c6dJs_9s8cTd5s_7s3sQdQc_KcAcJh3h_Qs6c7d3d_9d8d4d9h() {
    assertEquals(
      "9s8cTd5s Qs6c7d3d 9d8d4d9h KcAcJh3h 7s3sQdQc",
      Solver.process("omaha-holdem 2d2h4c6dJs 9s8cTd5s 7s3sQdQc KcAcJh3h Qs6c7d3d 9d8d4d9h"));
  }

  @Test
  public void test_omaha_holdem_6273_2c2d4h5cTc_KsThJh2s_Kh5sAd7c_6sKdAs5h_JcAcQdJd_4s3hKc9s_Ts8h8c6h() {
    assertEquals(
      "4s3hKc9s 6sKdAs5h=Kh5sAd7c Ts8h8c6h JcAcQdJd KsThJh2s",
      Solver.process("omaha-holdem 2c2d4h5cTc KsThJh2s Kh5sAd7c 6sKdAs5h JcAcQdJd 4s3hKc9s Ts8h8c6h"));
  }

  @Test
  public void test_omaha_holdem_6274_2c3h4cJcKs_Jd9dKd5h_7c7s3sTh_3cKc5s2h_KhQdQh6s_Tc9sTs8s_Jh5c9h4s_As3d4h4d_6d6cJs2d_Ah2sAc6h() {
    assertEquals(
      "7c7s3sTh Tc9sTs8s KhQdQh6s Ah2sAc6h 6d6cJs2d Jh5c9h4s Jd9dKd5h As3d4h4d 3cKc5s2h",
      Solver.process("omaha-holdem 2c3h4cJcKs Jd9dKd5h 7c7s3sTh 3cKc5s2h KhQdQh6s Tc9sTs8s Jh5c9h4s As3d4h4d 6d6cJs2d Ah2sAc6h"));
  }

  @Test
  public void test_omaha_holdem_6275_5c5h7s9hKs_AhTd5s6s_2c3cKcJh_7hQc5d7d_8cTc4h8h_Kh3hJc4c_TsQsAd7c() {
    assertEquals(
      "TsQsAd7c 8cTc4h8h 2c3cKcJh=Kh3hJc4c AhTd5s6s 7hQc5d7d",
      Solver.process("omaha-holdem 5c5h7s9hKs AhTd5s6s 2c3cKcJh 7hQc5d7d 8cTc4h8h Kh3hJc4c TsQsAd7c"));
  }

  @Test
  public void test_omaha_holdem_6276_5d6d7h9cJh_3sTs8hTh_6h4h4s2d_5h8sAsQd_9dQsJd7d() {
    assertEquals(
      "6h4h4s2d 9dQsJd7d 5h8sAsQd 3sTs8hTh",
      Solver.process("omaha-holdem 5d6d7h9cJh 3sTs8hTh 6h4h4s2d 5h8sAsQd 9dQsJd7d"));
  }

  @Test
  public void test_omaha_holdem_6277_6d6h7d9dQc_3h3sKd7s_6c5s2sAh() {
    assertEquals(
      "3h3sKd7s 6c5s2sAh",
      Solver.process("omaha-holdem 6d6h7d9dQc 3h3sKd7s 6c5s2sAh"));
  }

  @Test
  public void test_omaha_holdem_6278_7c7s9dAsKs_TsQh3h2s_Kh6s6h3d_JhAcJc3c_5d4c7hKc_8d2cAhAd_5s9h9cJs_2h5c6c8c_8h4h4sQs_Tc3sTd7d() {
    assertEquals(
      "2h5c6c8c Kh6s6h3d JhAcJc3c Tc3sTd7d TsQh3h2s 8h4h4sQs 5d4c7hKc 5s9h9cJs 8d2cAhAd",
      Solver.process("omaha-holdem 7c7s9dAsKs TsQh3h2s Kh6s6h3d JhAcJc3c 5d4c7hKc 8d2cAhAd 5s9h9cJs 2h5c6c8c 8h4h4sQs Tc3sTd7d"));
  }

  @Test
  public void test_omaha_holdem_6279_5cAhAsKdTc_Jc3s3d6d_8s2dTd4s_9s6s4hKh_6cTsKc5h_5d7d3h7c_9c2h9d4d() {
    assertEquals(
      "Jc3s3d6d 5d7d3h7c 9c2h9d4d 8s2dTd4s 9s6s4hKh 6cTsKc5h",
      Solver.process("omaha-holdem 5cAhAsKdTc Jc3s3d6d 8s2dTd4s 9s6s4hKh 6cTsKc5h 5d7d3h7c 9c2h9d4d"));
  }

  @Test
  public void test_omaha_holdem_6280_2h8c8hKcKd_Th9d8dJc_Td7sAcQs() {
    assertEquals(
      "Td7sAcQs Th9d8dJc",
      Solver.process("omaha-holdem 2h8c8hKcKd Th9d8dJc Td7sAcQs"));
  }

  @Test
  public void test_omaha_holdem_6281_4c4sJdJhKh_5hKs6cJc_Qs2dTh7d() {
    assertEquals(
      "Qs2dTh7d 5hKs6cJc",
      Solver.process("omaha-holdem 4c4sJdJhKh 5hKs6cJc Qs2dTh7d"));
  }

  @Test
  public void test_omaha_holdem_6282_5c7c8d9dTc_Qh7h2h4s_8c6h6d4d_3d4hTs3s_7sAhJsQd_5h3c6s5d() {
    assertEquals(
      "Qh7h2h4s 3d4hTs3s 5h3c6s5d 8c6h6d4d 7sAhJsQd",
      Solver.process("omaha-holdem 5c7c8d9dTc Qh7h2h4s 8c6h6d4d 3d4hTs3s 7sAhJsQd 5h3c6s5d"));
  }

  @Test
  public void test_omaha_holdem_6283_2c2s5h7dKh_7hThTc5s_3h4h3d6d_3c9dJc5c_3sAh9sQc_8hQhTsQs_JhAd4c7s_8cAs8d7c_6s5dKd8s_KsJs9hTd() {
    assertEquals(
      "3sAh9sQc 3h4h3d6d 3c9dJc5c JhAd4c7s 8cAs8d7c 7hThTc5s 8hQhTsQs KsJs9hTd 6s5dKd8s",
      Solver.process("omaha-holdem 2c2s5h7dKh 7hThTc5s 3h4h3d6d 3c9dJc5c 3sAh9sQc 8hQhTsQs JhAd4c7s 8cAs8d7c 6s5dKd8s KsJs9hTd"));
  }

  @Test
  public void test_omaha_holdem_6284_2h3d5sKsTs_3h2c9cQd_9hKh8cAh_Jd3s2d4d_3c5d8h7d_7sAdTdJs() {
    assertEquals(
      "9hKh8cAh 3h2c9cQd=Jd3s2d4d 3c5d8h7d 7sAdTdJs",
      Solver.process("omaha-holdem 2h3d5sKsTs 3h2c9cQd 9hKh8cAh Jd3s2d4d 3c5d8h7d 7sAdTdJs"));
  }

  @Test
  public void test_omaha_holdem_6285_3c3d4sKsTh_KcJsAcQs_4h2d7dAh_3sTd4dTc_5c8d6sKd_Qd8sTs5h_4c9d5dJc_2hJd9h7s_7hAd5s9s_AsQc6h8c() {
    assertEquals(
      "2hJd9h7s 7hAd5s9s AsQc6h8c 4c9d5dJc 4h2d7dAh Qd8sTs5h 5c8d6sKd KcJsAcQs 3sTd4dTc",
      Solver.process("omaha-holdem 3c3d4sKsTh KcJsAcQs 4h2d7dAh 3sTd4dTc 5c8d6sKd Qd8sTs5h 4c9d5dJc 2hJd9h7s 7hAd5s9s AsQc6h8c"));
  }

  @Test
  public void test_omaha_holdem_6286_2h6c8c8dKs_AcTsJh6s_9d9s2s4d_4c3hJs4s_4h7c3d8h_Qs9cAhTc_Kd6dJd7s_5cThAs3c() {
    assertEquals(
      "5cThAs3c Qs9cAhTc 4c3hJs4s AcTsJh6s 9d9s2s4d Kd6dJd7s 4h7c3d8h",
      Solver.process("omaha-holdem 2h6c8c8dKs AcTsJh6s 9d9s2s4d 4c3hJs4s 4h7c3d8h Qs9cAhTc Kd6dJd7s 5cThAs3c"));
  }

  @Test
  public void test_omaha_holdem_6287_4s7h7s9hKd_Td5c5hTc_9sTh3sJh_QdJd2h6c_3d5sQsTs_3h2sAcQc_Js9cAh6s() {
    assertEquals(
      "3d5sQsTs QdJd2h6c 3h2sAcQc 9sTh3sJh Js9cAh6s Td5c5hTc",
      Solver.process("omaha-holdem 4s7h7s9hKd Td5c5hTc 9sTh3sJh QdJd2h6c 3d5sQsTs 3h2sAcQc Js9cAh6s"));
  }

  @Test
  public void test_omaha_holdem_6288_9c9dAhQcTh_4d9s9hKh_6sKs2c8d() {
    assertEquals(
      "6sKs2c8d 4d9s9hKh",
      Solver.process("omaha-holdem 9c9dAhQcTh 4d9s9hKh 6sKs2c8d"));
  }

  @Test
  public void test_omaha_holdem_6289_5h6sAdJsQc_Ah8sKd3d_3h9h4d2s() {
    assertEquals(
      "3h9h4d2s Ah8sKd3d",
      Solver.process("omaha-holdem 5h6sAdJsQc Ah8sKd3d 3h9h4d2s"));
  }

  @Test
  public void test_omaha_holdem_6290_4d5c7d9cKc_7s6d2h3s_7cTd6s9h_Ah3hKh8c_Ad5sTcJc_Qh5d4cKs() {
    assertEquals(
      "Ah3hKh8c 7cTd6s9h Qh5d4cKs 7s6d2h3s Ad5sTcJc",
      Solver.process("omaha-holdem 4d5c7d9cKc 7s6d2h3s 7cTd6s9h Ah3hKh8c Ad5sTcJc Qh5d4cKs"));
  }

  @Test
  public void test_omaha_holdem_6291_5sJcKhQhTc_6s2h9s3d_5cTsQc8d_7hAsAcJh_Td8c4d9d_Qd3c8s6h_Ad9c6d8h_3hKd5h5d_Kc4h2c4c_9hThKs2d() {
    assertEquals(
      "6s2h9s3d Qd3c8s6h Kc4h2c4c 5cTsQc8d 3hKd5h5d Ad9c6d8h 9hThKs2d=Td8c4d9d 7hAsAcJh",
      Solver.process("omaha-holdem 5sJcKhQhTc 6s2h9s3d 5cTsQc8d 7hAsAcJh Td8c4d9d Qd3c8s6h Ad9c6d8h 3hKd5h5d Kc4h2c4c 9hThKs2d"));
  }

  @Test
  public void test_omaha_holdem_6292_7c7d9dQcTs_KhAh3h6s_6h2c4cKd_KsAs7h9s_Qs2d3d5d_9cQh8cJc_5hQd2h6d_Js4sJh8d_Th3cAc8s() {
    assertEquals(
      "6h2c4cKd KhAh3h6s Th3cAc8s Qs2d3d5d 5hQd2h6d 9cQh8cJc=Js4sJh8d KsAs7h9s",
      Solver.process("omaha-holdem 7c7d9dQcTs KhAh3h6s 6h2c4cKd KsAs7h9s Qs2d3d5d 9cQh8cJc 5hQd2h6d Js4sJh8d Th3cAc8s"));
  }

  @Test
  public void test_omaha_holdem_6293_4s6h9dJhQd_7s4dKc2c_Td6dKdQc_3h5d6s3d_8cThAs9s() {
    assertEquals(
      "7s4dKc2c 3h5d6s3d 8cThAs9s Td6dKdQc",
      Solver.process("omaha-holdem 4s6h9dJhQd 7s4dKc2c Td6dKdQc 3h5d6s3d 8cThAs9s"));
  }

  @Test
  public void test_omaha_holdem_6294_6s7sAsJhQd_2d2sAd6c_7hKs3h5c_7dKcKd9h_Td4c4h2c_5sQs8c8s_4d9c5dAh_TsTcJs3s_2h8hJc6d_6h3d4sKh() {
    assertEquals(
      "Td4c4h2c 6h3d4sKh 7hKs3h5c 7dKcKd9h 4d9c5dAh 2h8hJc6d 2d2sAd6c TsTcJs3s 5sQs8c8s",
      Solver.process("omaha-holdem 6s7sAsJhQd 2d2sAd6c 7hKs3h5c 7dKcKd9h Td4c4h2c 5sQs8c8s 4d9c5dAh TsTcJs3s 2h8hJc6d 6h3d4sKh"));
  }

  @Test
  public void test_omaha_holdem_6295_2c5d8d9cTc_Ah5c3d7d_Ac9h8h6d_3cKd6cJc_7s7h3s7c() {
    assertEquals(
      "Ah5c3d7d 7s7h3s7c Ac9h8h6d 3cKd6cJc",
      Solver.process("omaha-holdem 2c5d8d9cTc Ah5c3d7d Ac9h8h6d 3cKd6cJc 7s7h3s7c"));
  }

  @Test
  public void test_omaha_holdem_6296_6s8sKhQcQs_4sKc5s9h_9cJh3s7d_Qd3cTsAs_Ks6cAcKd_4cJs2h2s_9d5c8c8d_Ah4dTc5d_6d4h2cJd() {
    assertEquals(
      "9cJh3s7d Ah4dTc5d 6d4h2cJd 4sKc5s9h 4cJs2h2s Qd3cTsAs 9d5c8c8d Ks6cAcKd",
      Solver.process("omaha-holdem 6s8sKhQcQs 4sKc5s9h 9cJh3s7d Qd3cTsAs Ks6cAcKd 4cJs2h2s 9d5c8c8d Ah4dTc5d 6d4h2cJd"));
  }

  @Test
  public void test_omaha_holdem_6297_2d4c6d9sQc_Jh7h3c2s_AdJs5c6s_4hTc2c8s_8dAsQs5d() {
    assertEquals(
      "Jh7h3c2s AdJs5c6s 8dAsQs5d 4hTc2c8s",
      Solver.process("omaha-holdem 2d4c6d9sQc Jh7h3c2s AdJs5c6s 4hTc2c8s 8dAsQs5d"));
  }

  @Test
  public void test_omaha_holdem_6298_3s7dAsKsTs_5cQh4s7c_3d5sJc9c_2c4dKhAd_2hQc5h8c_Js5d4h2d_3h7s8hAc() {
    assertEquals(
      "Js5d4h2d 2hQc5h8c 3d5sJc9c 5cQh4s7c 3h7s8hAc 2c4dKhAd",
      Solver.process("omaha-holdem 3s7dAsKsTs 5cQh4s7c 3d5sJc9c 2c4dKhAd 2hQc5h8c Js5d4h2d 3h7s8hAc"));
  }

  @Test
  public void test_omaha_holdem_6299_2d2s3c8d9d_9s3s7hAh_Tc7d4c3d_5h8cJd8h_AcKh4s5c() {
    assertEquals(
      "AcKh4s5c 9s3s7hAh Tc7d4c3d 5h8cJd8h",
      Solver.process("omaha-holdem 2d2s3c8d9d 9s3s7hAh Tc7d4c3d 5h8cJd8h AcKh4s5c"));
  }

  @Test
  public void test_omaha_holdem_6300_3h5c6s7sQh_4c4d3cAh_Qc8cQd2c() {
    assertEquals(
      "Qc8cQd2c 4c4d3cAh",
      Solver.process("omaha-holdem 3h5c6s7sQh 4c4d3cAh Qc8cQd2c"));
  }

  @Test
  public void test_omaha_holdem_6301_3c5c5h7dKh_6cJdJcKs_Kc5dTh2s_Td9dKdQs_4d8h2c7s_6d3hQh7h_As5s7cTs_2hAdAh3s() {
    assertEquals(
      "4d8h2c7s 6d3hQh7h 6cJdJcKs Td9dKdQs 2hAdAh3s As5s7cTs Kc5dTh2s",
      Solver.process("omaha-holdem 3c5c5h7dKh 6cJdJcKs Kc5dTh2s Td9dKdQs 4d8h2c7s 6d3hQh7h As5s7cTs 2hAdAh3s"));
  }

  @Test
  public void test_omaha_holdem_6302_2c3s5s9c9s_Qh4hAh8s_4sTs9d4d() {
    assertEquals(
      "Qh4hAh8s 4sTs9d4d",
      Solver.process("omaha-holdem 2c3s5s9c9s Qh4hAh8s 4sTs9d4d"));
  }

  @Test
  public void test_omaha_holdem_6303_4c5d6c9dKd_6dKh9h3s_JhKc2dAc() {
    assertEquals(
      "JhKc2dAc 6dKh9h3s",
      Solver.process("omaha-holdem 4c5d6c9dKd 6dKh9h3s JhKc2dAc"));
  }

  @Test
  public void test_omaha_holdem_6304_7h8hJdJsQh_Ts5d2h5s_JhAh5cQc_JcKs3hTd_AdAs3s4h_9c8sQd6d() {
    assertEquals(
      "Ts5d2h5s 9c8sQd6d AdAs3s4h JcKs3hTd JhAh5cQc",
      Solver.process("omaha-holdem 7h8hJdJsQh Ts5d2h5s JhAh5cQc JcKs3hTd AdAs3s4h 9c8sQd6d"));
  }

  @Test
  public void test_omaha_holdem_6305_4c4d5h7hQc_Ac6s8d2h_9d5d7dAd_2d8cTdQd_TcQh6dKh_Qs9c8h3c_6cTs4hAh() {
    assertEquals(
      "9d5d7dAd Qs9c8h3c 2d8cTdQd TcQh6dKh 6cTs4hAh Ac6s8d2h",
      Solver.process("omaha-holdem 4c4d5h7hQc Ac6s8d2h 9d5d7dAd 2d8cTdQd TcQh6dKh Qs9c8h3c 6cTs4hAh"));
  }

  @Test
  public void test_omaha_holdem_6306_2d5d8h9cKs_Qs3c5h4c_6h4sAh3d_3h8dAc7s() {
    assertEquals(
      "6h4sAh3d Qs3c5h4c 3h8dAc7s",
      Solver.process("omaha-holdem 2d5d8h9cKs Qs3c5h4c 6h4sAh3d 3h8dAc7s"));
  }

  @Test
  public void test_omaha_holdem_6307_2d5c9cKsQs_AhKdJs5h_3sAc4dQd_Tc2hQh9d_Jc5sJdTs_9s4h6sKc() {
    assertEquals(
      "3sAc4dQd Tc2hQh9d AhKdJs5h 9s4h6sKc Jc5sJdTs",
      Solver.process("omaha-holdem 2d5c9cKsQs AhKdJs5h 3sAc4dQd Tc2hQh9d Jc5sJdTs 9s4h6sKc"));
  }

  @Test
  public void test_omaha_holdem_6308_2d3h5hAcTc_Js8hKd8d_Qs4h3sTs() {
    assertEquals(
      "Js8hKd8d Qs4h3sTs",
      Solver.process("omaha-holdem 2d3h5hAcTc Js8hKd8d Qs4h3sTs"));
  }

  @Test
  public void test_omaha_holdem_6309_4c6h6s7c7h_AhJdAs6c_9s5cQsAd_Qd3h7d3s_2s3cJh9d_6d9hJc8s_8c4hKc7s() {
    assertEquals(
      "2s3cJh9d 9s5cQsAd 6d9hJc8s AhJdAs6c Qd3h7d3s 8c4hKc7s",
      Solver.process("omaha-holdem 4c6h6s7c7h AhJdAs6c 9s5cQsAd Qd3h7d3s 2s3cJh9d 6d9hJc8s 8c4hKc7s"));
  }

  @Test
  public void test_omaha_holdem_6310_2c3h8cAsQd_9cKdJd6d_8dKc4h5c() {
    assertEquals(
      "9cKdJd6d 8dKc4h5c",
      Solver.process("omaha-holdem 2c3h8cAsQd 9cKdJd6d 8dKc4h5c"));
  }

  @Test
  public void test_omaha_holdem_6311_3d7h9hKcTd_Ts2h7d2c_8dQc2dKh_8h4c6d5s_4d5c3sTc_5h6c4s3h_3c7c4hJs_2s8c9cAs() {
    assertEquals(
      "5h6c4s3h 2s8c9cAs 8dQc2dKh 3c7c4hJs 4d5c3sTc Ts2h7d2c 8h4c6d5s",
      Solver.process("omaha-holdem 3d7h9hKcTd Ts2h7d2c 8dQc2dKh 8h4c6d5s 4d5c3sTc 5h6c4s3h 3c7c4hJs 2s8c9cAs"));
  }

  @Test
  public void test_omaha_holdem_6312_3c6h9sAcKd_4s6s7cAh_Ks3dQd7d_7h2d6d7s_Th9cAsQs_8cAdQh4d() {
    assertEquals(
      "7h2d6d7s 8cAdQh4d Ks3dQd7d 4s6s7cAh Th9cAsQs",
      Solver.process("omaha-holdem 3c6h9sAcKd 4s6s7cAh Ks3dQd7d 7h2d6d7s Th9cAsQs 8cAdQh4d"));
  }

  @Test
  public void test_omaha_holdem_6313_4d6d9sJhKh_3dTh2c3h_8s3c6cQd_8d4hKc2s_QsTs9c2h_7hKd9h6h_Ks8cJcAh_5d9dQc4c_TcAc7s3s_2dJs5sAs() {
    assertEquals(
      "TcAc7s3s 3dTh2c3h 8s3c6cQd 2dJs5sAs 5d9dQc4c 8d4hKc2s 7hKd9h6h Ks8cJcAh QsTs9c2h",
      Solver.process("omaha-holdem 4d6d9sJhKh 3dTh2c3h 8s3c6cQd 8d4hKc2s QsTs9c2h 7hKd9h6h Ks8cJcAh 5d9dQc4c TcAc7s3s 2dJs5sAs"));
  }

  @Test
  public void test_omaha_holdem_6314_2d2h4h8hQh_Kd5sKs3h_Qs3c3dJd_9c2c9sJs_5hTc5cTd() {
    assertEquals(
      "5hTc5cTd Qs3c3dJd Kd5sKs3h 9c2c9sJs",
      Solver.process("omaha-holdem 2d2h4h8hQh Kd5sKs3h Qs3c3dJd 9c2c9sJs 5hTc5cTd"));
  }

  @Test
  public void test_omaha_holdem_6315_4s8s9h9sKc_Qh7d8d2h_Jc3s3d5d_7s8h3c9d_8cTh2d6d_Js2sKhQc_JhQs4h7c_3hAcKd4c_5sAh6cTs() {
    assertEquals(
      "Jc3s3d5d JhQs4h7c 8cTh2d6d Qh7d8d2h 3hAcKd4c 5sAh6cTs Js2sKhQc 7s8h3c9d",
      Solver.process("omaha-holdem 4s8s9h9sKc Qh7d8d2h Jc3s3d5d 7s8h3c9d 8cTh2d6d Js2sKhQc JhQs4h7c 3hAcKd4c 5sAh6cTs"));
  }

  @Test
  public void test_omaha_holdem_6316_5d6d7cJcKh_9dJs5s3s_Kd9hJhAh_QsAsTcKc_Td7s5cQc_2s8d6s4h_7d8s5h8h_3d2h7hQd() {
    assertEquals(
      "3d2h7hQd QsAsTcKc 7d8s5h8h=Td7s5cQc 9dJs5s3s Kd9hJhAh 2s8d6s4h",
      Solver.process("omaha-holdem 5d6d7cJcKh 9dJs5s3s Kd9hJhAh QsAsTcKc Td7s5cQc 2s8d6s4h 7d8s5h8h 3d2h7hQd"));
  }

  @Test
  public void test_omaha_holdem_6317_2d2sQcQsTc_7s8sKc6s_8d9d2cKd_7c5dKh3h_Ad8cQh5s() {
    assertEquals(
      "7c5dKh3h 7s8sKc6s 8d9d2cKd Ad8cQh5s",
      Solver.process("omaha-holdem 2d2sQcQsTc 7s8sKc6s 8d9d2cKd 7c5dKh3h Ad8cQh5s"));
  }

  @Test
  public void test_omaha_holdem_6318_6c8dKcQhTd_8h8c7c5c_Kd4hJc9s_3d2cJh3s() {
    assertEquals(
      "3d2cJh3s 8h8c7c5c Kd4hJc9s",
      Solver.process("omaha-holdem 6c8dKcQhTd 8h8c7c5c Kd4hJc9s 3d2cJh3s"));
  }

  @Test
  public void test_omaha_holdem_6319_5h6s7c8sKc_4c9d6dJs_Kd4hAd5c_2c7h4s2h_7dJc6cTs_9hTd2dKh_Qs7s8c3h_3cAhTc2s() {
    assertEquals(
      "3cAhTc2s 7dJc6cTs Qs7s8c3h 2c7h4s2h=Kd4hAd5c 4c9d6dJs 9hTd2dKh",
      Solver.process("omaha-holdem 5h6s7c8sKc 4c9d6dJs Kd4hAd5c 2c7h4s2h 7dJc6cTs 9hTd2dKh Qs7s8c3h 3cAhTc2s"));
  }

  @Test
  public void test_omaha_holdem_6320_2c4h6cKcKh_8s3hAcAd_5h3s9s8h_7d6dTdTh_AhKd8d6s() {
    assertEquals(
      "7d6dTdTh 8s3hAcAd 5h3s9s8h AhKd8d6s",
      Solver.process("omaha-holdem 2c4h6cKcKh 8s3hAcAd 5h3s9s8h 7d6dTdTh AhKd8d6s"));
  }

  @Test
  public void test_omaha_holdem_6321_3h5c9hJdKs_JcKd6s3d_Kc8d4hAc_4c8sTc9d_JhJs9cQs_7cQc3c3s_Ah6hQh5s() {
    assertEquals(
      "Ah6hQh5s 4c8sTc9d Kc8d4hAc JcKd6s3d 7cQc3c3s JhJs9cQs",
      Solver.process("omaha-holdem 3h5c9hJdKs JcKd6s3d Kc8d4hAc 4c8sTc9d JhJs9cQs 7cQc3c3s Ah6hQh5s"));
  }

  @Test
  public void test_omaha_holdem_6322_3s4c5h9c9h_6cJd2d7h_3h3c8dQs_KdAh7cTh_2s9d2c6d() {
    assertEquals(
      "KdAh7cTh 2s9d2c6d 6cJd2d7h 3h3c8dQs",
      Solver.process("omaha-holdem 3s4c5h9c9h 6cJd2d7h 3h3c8dQs KdAh7cTh 2s9d2c6d"));
  }

  @Test
  public void test_omaha_holdem_6323_8d8sJcKhQd_Qs3c7s4d_6cAh6sKc_8hTs7h4s_3sKs9h2h_JdAc5s4h_5c5d9dAs_TcTh5h3d_Qc7d2d8c() {
    assertEquals(
      "5c5d9dAs TcTh5h3d JdAc5s4h Qs3c7s4d 3sKs9h2h 6cAh6sKc 8hTs7h4s Qc7d2d8c",
      Solver.process("omaha-holdem 8d8sJcKhQd Qs3c7s4d 6cAh6sKc 8hTs7h4s 3sKs9h2h JdAc5s4h 5c5d9dAs TcTh5h3d Qc7d2d8c"));
  }

  @Test
  public void test_omaha_holdem_6324_5h7c9cQsTh_2hQh4cKc_9dKh9s6d_6c3hAc9h_6h7s8sQc_AdQd8c7d_4h2d6s8h() {
    assertEquals(
      "6c3hAc9h 2hQh4cKc AdQd8c7d 9dKh9s6d 4h2d6s8h=6h7s8sQc",
      Solver.process("omaha-holdem 5h7c9cQsTh 2hQh4cKc 9dKh9s6d 6c3hAc9h 6h7s8sQc AdQd8c7d 4h2d6s8h"));
  }

  @Test
  public void test_omaha_holdem_6325_2c7s8dQsTc_5d4dAh8s_6s2sAd4s_3dJh8c9c_4h2hQdQh_Kc4cTdKh_9s3h6c2d() {
    assertEquals(
      "6s2sAd4s 5d4dAh8s Kc4cTdKh 4h2hQdQh 9s3h6c2d 3dJh8c9c",
      Solver.process("omaha-holdem 2c7s8dQsTc 5d4dAh8s 6s2sAd4s 3dJh8c9c 4h2hQdQh Kc4cTdKh 9s3h6c2d"));
  }

  @Test
  public void test_omaha_holdem_6326_4dAhKhQcQh_2c8c8s5c_4s2dAdJh_Qd8d5sKd_9h5hJd9d_Tc4hTdTh_2s6h3sAc_7sJcKc4c_6sJs7h3c_QsKsAs7c() {
    assertEquals(
      "6sJs7h3c 2c8c8s5c 7sJcKc4c 2s6h3sAc 4s2dAdJh 9h5hJd9d Tc4hTdTh Qd8d5sKd QsKsAs7c",
      Solver.process("omaha-holdem 4dAhKhQcQh 2c8c8s5c 4s2dAdJh Qd8d5sKd 9h5hJd9d Tc4hTdTh 2s6h3sAc 7sJcKc4c 6sJs7h3c QsKsAs7c"));
  }

  @Test
  public void test_omaha_holdem_6327_4d4h9hKcTd_Ah8h3d5s_TsQs6s2h_TcQdKs9d_4c5hQh7d_8dJc9sKd() {
    assertEquals(
      "Ah8h3d5s TsQs6s2h 8dJc9sKd TcQdKs9d 4c5hQh7d",
      Solver.process("omaha-holdem 4d4h9hKcTd Ah8h3d5s TsQs6s2h TcQdKs9d 4c5hQh7d 8dJc9sKd"));
  }

  @Test
  public void test_omaha_holdem_6328_6d8hJsKcQh_2cTh7h8d_JdTs3cJc() {
    assertEquals(
      "2cTh7h8d JdTs3cJc",
      Solver.process("omaha-holdem 6d8hJsKcQh 2cTh7h8d JdTs3cJc"));
  }

  @Test
  public void test_omaha_holdem_6329_2h5h8s9hQc_Kh3s4hKd_8cJh9dKc_2sAs8d3c() {
    assertEquals(
      "2sAs8d3c 8cJh9dKc Kh3s4hKd",
      Solver.process("omaha-holdem 2h5h8s9hQc Kh3s4hKd 8cJh9dKc 2sAs8d3c"));
  }

  @Test
  public void test_omaha_holdem_6330_6c8dAcKcKs_Qd7hQhAs_9sTdTh2d_6d8h7sTs_Kd8sAd5d_5c2c3h2h_6s6h7c4d() {
    assertEquals(
      "6d8h7sTs 9sTdTh2d Qd7hQhAs 5c2c3h2h 6s6h7c4d Kd8sAd5d",
      Solver.process("omaha-holdem 6c8dAcKcKs Qd7hQhAs 9sTdTh2d 6d8h7sTs Kd8sAd5d 5c2c3h2h 6s6h7c4d"));
  }

  @Test
  public void test_omaha_holdem_6331_4d8c8hAhAs_Qd5dQh2c_TdQcJcKh_Ad6d3d2d_5h3h8s2s() {
    assertEquals(
      "TdQcJcKh Qd5dQh2c 5h3h8s2s Ad6d3d2d",
      Solver.process("omaha-holdem 4d8c8hAhAs Qd5dQh2c TdQcJcKh Ad6d3d2d 5h3h8s2s"));
  }

  @Test
  public void test_omaha_holdem_6332_2d5sJhKsTd_5h5c9s4d_Ts7c6cJs_KhJcAc8h_8dTh6hQh_2cTc4h7h_3sJd4s2h() {
    assertEquals(
      "8dTh6hQh 2cTc4h7h 3sJd4s2h Ts7c6cJs KhJcAc8h 5h5c9s4d",
      Solver.process("omaha-holdem 2d5sJhKsTd 5h5c9s4d Ts7c6cJs KhJcAc8h 8dTh6hQh 2cTc4h7h 3sJd4s2h"));
  }

  @Test
  public void test_omaha_holdem_6333_3c3s4hTdTs_9sKh7d8h_9dJsKc7c_Jc6hAc5c_4s8d2s2c_3hQcKdQd_7s7h8s9h_Jh5s6d8c_3dAdJd4c() {
    assertEquals(
      "Jh5s6d8c 9sKh7d8h 9dJsKc7c Jc6hAc5c 4s8d2s2c 7s7h8s9h 3hQcKdQd 3dAdJd4c",
      Solver.process("omaha-holdem 3c3s4hTdTs 9sKh7d8h 9dJsKc7c Jc6hAc5c 4s8d2s2c 3hQcKdQd 7s7h8s9h Jh5s6d8c 3dAdJd4c"));
  }

  @Test
  public void test_omaha_holdem_6334_2d3h7sAcTd_6c4d6h8h_4cKcJhQs_Kh5dQcAh() {
    assertEquals(
      "4cKcJhQs 6c4d6h8h Kh5dQcAh",
      Solver.process("omaha-holdem 2d3h7sAcTd 6c4d6h8h 4cKcJhQs Kh5dQcAh"));
  }

  @Test
  public void test_omaha_holdem_6335_6s8cAhTdTs_Kd2sKh4s_4cKcAdJd_Th4hJs8s_3d9sQh9h_As2d9dKs_8d3h3c7h_9cJh6hQd_5hQs5sTc() {
    assertEquals(
      "9cJh6hQd 8d3h3c7h 3d9sQh9h Kd2sKh4s 4cKcAdJd=As2d9dKs 5hQs5sTc Th4hJs8s",
      Solver.process("omaha-holdem 6s8cAhTdTs Kd2sKh4s 4cKcAdJd Th4hJs8s 3d9sQh9h As2d9dKs 8d3h3c7h 9cJh6hQd 5hQs5sTc"));
  }

  @Test
  public void test_omaha_holdem_6336_5d8d9cQdQh_AcJhQs4s_2c2sAd3c_Kh8c4dJd_Tc5s8h2d_Kd2h7c3s_Ts6h7dTd_KsTh3d9d() {
    assertEquals(
      "Kd2h7c3s 2c2sAd3c Tc5s8h2d AcJhQs4s KsTh3d9d Ts6h7dTd Kh8c4dJd",
      Solver.process("omaha-holdem 5d8d9cQdQh AcJhQs4s 2c2sAd3c Kh8c4dJd Tc5s8h2d Kd2h7c3s Ts6h7dTd KsTh3d9d"));
  }

  @Test
  public void test_omaha_holdem_6337_3c3h4sAsJh_Kc6c2d8h_KhTh8c6h_AdKdKs7d_4h2sQs9c_Jc6s4dJs_2c9d5cAh_Jd8dAc9h() {
    assertEquals(
      "Kc6c2d8h KhTh8c6h 4h2sQs9c AdKdKs7d Jd8dAc9h 2c9d5cAh Jc6s4dJs",
      Solver.process("omaha-holdem 3c3h4sAsJh Kc6c2d8h KhTh8c6h AdKdKs7d 4h2sQs9c Jc6s4dJs 2c9d5cAh Jd8dAc9h"));
  }

  @Test
  public void test_omaha_holdem_6338_3s5c5sAdJd_9h6hJh4h_8d2c8cTs_7d9d2s4d_Ac5dQdJs_Jc9sQc7h_QsKcKs2d_9c2h4cAs_Ah6d3d3c_Kd5hTd8s() {
    assertEquals(
      "8d2c8cTs 9h6hJh4h Jc9sQc7h QsKcKs2d Kd5hTd8s 7d9d2s4d=9c2h4cAs Ah6d3d3c Ac5dQdJs",
      Solver.process("omaha-holdem 3s5c5sAdJd 9h6hJh4h 8d2c8cTs 7d9d2s4d Ac5dQdJs Jc9sQc7h QsKcKs2d 9c2h4cAs Ah6d3d3c Kd5hTd8s"));
  }

  @Test
  public void test_omaha_holdem_6339_3d6h7c7s9d_9s4c2hAs_2s5d3c4h() {
    assertEquals(
      "9s4c2hAs 2s5d3c4h",
      Solver.process("omaha-holdem 3d6h7c7s9d 9s4c2hAs 2s5d3c4h"));
  }

  @Test
  public void test_omaha_holdem_6340_2c6cAcTcTs_8dAdAs3d_4dJh5c8c_8s4sAhJd_9s7h6dQc() {
    assertEquals(
      "9s7h6dQc 8s4sAhJd 4dJh5c8c 8dAdAs3d",
      Solver.process("omaha-holdem 2c6cAcTcTs 8dAdAs3d 4dJh5c8c 8s4sAhJd 9s7h6dQc"));
  }

  @Test
  public void test_omaha_holdem_6341_2s5d9hJhTc_Kh2dAs9c_3d2c5c4d_3cKd9s4s_JdJsTd7s_Qc2h5s8h_5hTs3h3s_Qd6cAh9d() {
    assertEquals(
      "3cKd9s4s Qd6cAh9d 3d2c5c4d Kh2dAs9c 5hTs3h3s JdJsTd7s Qc2h5s8h",
      Solver.process("omaha-holdem 2s5d9hJhTc Kh2dAs9c 3d2c5c4d 3cKd9s4s JdJsTd7s Qc2h5s8h 5hTs3h3s Qd6cAh9d"));
  }

  @Test
  public void test_omaha_holdem_6342_3d4d7h9cJc_3c5d2d7s_JhJs6h4h_4c8h3s9s_KsTc7d5c() {
    assertEquals(
      "KsTc7d5c 3c5d2d7s 4c8h3s9s JhJs6h4h",
      Solver.process("omaha-holdem 3d4d7h9cJc 3c5d2d7s JhJs6h4h 4c8h3s9s KsTc7d5c"));
  }

  @Test
  public void test_omaha_holdem_6343_2c7hAsJdKh_6sTsQh9s_QsKs7cAh_Js6d7d3s_QcKd6c2d_Th9h6h4h() {
    assertEquals(
      "Th9h6h4h Js6d7d3s QcKd6c2d QsKs7cAh 6sTsQh9s",
      Solver.process("omaha-holdem 2c7hAsJdKh 6sTsQh9s QsKs7cAh Js6d7d3s QcKd6c2d Th9h6h4h"));
  }

  @Test
  public void test_omaha_holdem_6344_2c2s8c9cJc_3h5d7sQd_4sJh9h9s_5h8s9dAd() {
    assertEquals(
      "3h5d7sQd 5h8s9dAd 4sJh9h9s",
      Solver.process("omaha-holdem 2c2s8c9cJc 3h5d7sQd 4sJh9h9s 5h8s9dAd"));
  }

  @Test
  public void test_omaha_holdem_6345_3h7cAdAsQc_8d4hTs2d_7h3sJhAh_QdTh2c3c_6h8c8hKd() {
    assertEquals(
      "8d4hTs2d 6h8c8hKd QdTh2c3c 7h3sJhAh",
      Solver.process("omaha-holdem 3h7cAdAsQc 8d4hTs2d 7h3sJhAh QdTh2c3c 6h8c8hKd"));
  }

  @Test
  public void test_omaha_holdem_6346_6c6s7hAsKs_Ah4dQs9s_9cJsTc7d_5d8hTdJh_Kh7sKd3s_9d2s8c4s_Ad2c5hJd_JcTh8s3d_3c5c5sAc_4h4cKc3h() {
    assertEquals(
      "5d8hTdJh=JcTh8s3d 9cJsTc7d 4h4cKc3h 3c5c5sAc Ad2c5hJd 9d2s8c4s Ah4dQs9s Kh7sKd3s",
      Solver.process("omaha-holdem 6c6s7hAsKs Ah4dQs9s 9cJsTc7d 5d8hTdJh Kh7sKd3s 9d2s8c4s Ad2c5hJd JcTh8s3d 3c5c5sAc 4h4cKc3h"));
  }

  @Test
  public void test_omaha_holdem_6347_3h7c8sKsTh_8dTd2c5d_JhQs5s8c() {
    assertEquals(
      "JhQs5s8c 8dTd2c5d",
      Solver.process("omaha-holdem 3h7c8sKsTh 8dTd2c5d JhQs5s8c"));
  }

  @Test
  public void test_omaha_holdem_6348_4d8sAsJcQh_QcJs2cJd_Qs9c2hTd_3dAc9s7h_Qd6h9h6s_Ah6cKhJh_TsTc3s5d() {
    assertEquals(
      "TsTc3s5d Qd6h9h6s 3dAc9s7h Ah6cKhJh QcJs2cJd Qs9c2hTd",
      Solver.process("omaha-holdem 4d8sAsJcQh QcJs2cJd Qs9c2hTd 3dAc9s7h Qd6h9h6s Ah6cKhJh TsTc3s5d"));
  }

  @Test
  public void test_omaha_holdem_6349_3c5c8dAcKc_JhAdAsKh_Tc9hKs3h_6hTsJc5d_8s2d6d7s() {
    assertEquals(
      "6hTsJc5d 8s2d6d7s Tc9hKs3h JhAdAsKh",
      Solver.process("omaha-holdem 3c5c8dAcKc JhAdAsKh Tc9hKs3h 6hTsJc5d 8s2d6d7s"));
  }

  @Test
  public void test_omaha_holdem_6350_5h7d8dTcTd_4dTh4h3c_9hKh9c7s_9d8hKs5s_6c8cQhJh() {
    assertEquals(
      "6c8cQhJh 9d8hKs5s 9hKh9c7s 4dTh4h3c",
      Solver.process("omaha-holdem 5h7d8dTcTd 4dTh4h3c 9hKh9c7s 9d8hKs5s 6c8cQhJh"));
  }

  @Test
  public void test_omaha_holdem_6351_2s3s5s8h9h_Qh7d6s8s_6dTsKh5c_Kc6h6c3c_AcAsTd9d_Th7c3d5d_Qc4h5hQd_7sAhJs4d_2h2cAdJh_JdJcTc4s() {
    assertEquals(
      "6dTsKh5c Kc6h6c3c JdJcTc4s Qc4h5hQd AcAsTd9d Th7c3d5d 2h2cAdJh Qh7d6s8s 7sAhJs4d",
      Solver.process("omaha-holdem 2s3s5s8h9h Qh7d6s8s 6dTsKh5c Kc6h6c3c AcAsTd9d Th7c3d5d Qc4h5hQd 7sAhJs4d 2h2cAdJh JdJcTc4s"));
  }

  @Test
  public void test_omaha_holdem_6352_2c8s9dAcAs_9hKcQd4s_5d7h3s6h_8d9cAh8h_KsJcTs4d_Jh7c5hAd_JdQc6cKd_TdTc4cTh_2s3d2h2d_JsQh8c5s() {
    assertEquals(
      "5d7h3s6h KsJcTs4d JdQc6cKd JsQh8c5s 9hKcQd4s TdTc4cTh Jh7c5hAd 2s3d2h2d 8d9cAh8h",
      Solver.process("omaha-holdem 2c8s9dAcAs 9hKcQd4s 5d7h3s6h 8d9cAh8h KsJcTs4d Jh7c5hAd JdQc6cKd TdTc4cTh 2s3d2h2d JsQh8c5s"));
  }

  @Test
  public void test_omaha_holdem_6353_3c7d9dJcQd_8sAs2c3h_7hKdQc8c_5c2h3sTc_9s6sAdQh_8h7s8d6d_4c5h4sJd_6c5sQsTh_3dJsTsAh_Jh4hKh6h() {
    assertEquals(
      "5c2h3sTc 8sAs2c3h 4c5h4sJd Jh4hKh6h 6c5sQsTh 3dJsTsAh 7hKdQc8c 9s6sAdQh 8h7s8d6d",
      Solver.process("omaha-holdem 3c7d9dJcQd 8sAs2c3h 7hKdQc8c 5c2h3sTc 9s6sAdQh 8h7s8d6d 4c5h4sJd 6c5sQsTh 3dJsTsAh Jh4hKh6h"));
  }

  @Test
  public void test_omaha_holdem_6354_5dAcQsTcTh_4c3d4d8h_Ks8c7dTd_6c2dAdKh_2h9c9d9h_As7sQdJh_4sAh4h8s_5sJsTs2s_3h5c3c7c_3s6s2cKc() {
    assertEquals(
      "3s6s2cKc 4c3d4d8h 3h5c3c7c 2h9c9d9h 4sAh4h8s 6c2dAdKh As7sQdJh Ks8c7dTd 5sJsTs2s",
      Solver.process("omaha-holdem 5dAcQsTcTh 4c3d4d8h Ks8c7dTd 6c2dAdKh 2h9c9d9h As7sQdJh 4sAh4h8s 5sJsTs2s 3h5c3c7c 3s6s2cKc"));
  }

  @Test
  public void test_omaha_holdem_6355_2h4c8cJcTs_Qs2s3h9s_9c7sKdQd_AcKc3c8d_7c9d4d5h_4h3dThKs() {
    assertEquals(
      "4h3dThKs 7c9d4d5h 9c7sKdQd=Qs2s3h9s AcKc3c8d",
      Solver.process("omaha-holdem 2h4c8cJcTs Qs2s3h9s 9c7sKdQd AcKc3c8d 7c9d4d5h 4h3dThKs"));
  }

  @Test
  public void test_omaha_holdem_6356_7h7s9hJdQh_5dKc5h5s_2sJh7c2d_9dAdAh6c_Kh4h9c3d_TsJs9sAc_6sQdKd4d_Tc6d8s6h_4c2hJc8c() {
    assertEquals(
      "5dKc5h5s 4c2hJc8c TsJs9sAc 6sQdKd4d 9dAdAh6c Tc6d8s6h Kh4h9c3d 2sJh7c2d",
      Solver.process("omaha-holdem 7h7s9hJdQh 5dKc5h5s 2sJh7c2d 9dAdAh6c Kh4h9c3d TsJs9sAc 6sQdKd4d Tc6d8s6h 4c2hJc8c"));
  }

  @Test
  public void test_omaha_holdem_6357_2h3hAhKhQc_7s8c6c7d_4cTh9d3s_Ts4d5d8h_4h8sJc6s_9sAd9cKs_Qh6h5cAc_2dQsKc3d_Jd3cAs4s_2sJhTc7h() {
    assertEquals(
      "4h8sJc6s 4cTh9d3s 7s8c6c7d 2dQsKc3d Jd3cAs4s 9sAd9cKs Ts4d5d8h 2sJhTc7h Qh6h5cAc",
      Solver.process("omaha-holdem 2h3hAhKhQc 7s8c6c7d 4cTh9d3s Ts4d5d8h 4h8sJc6s 9sAd9cKs Qh6h5cAc 2dQsKc3d Jd3cAs4s 2sJhTc7h"));
  }

  @Test
  public void test_omaha_holdem_6358_6s7dJcJhTs_Qs4sAd6d_Kc3c2sJs_8h8dAsAc_Jd5cKdKs_Qd9c4h6h_KhTc8c2h_9d5h7c8s_Ah6cTd5d_9sQc5s3s() {
    assertEquals(
      "9sQc5s3s Qd9c4h6h Qs4sAd6d KhTc8c2h Ah6cTd5d 8h8dAsAc Jd5cKdKs=Kc3c2sJs 9d5h7c8s",
      Solver.process("omaha-holdem 6s7dJcJhTs Qs4sAd6d Kc3c2sJs 8h8dAsAc Jd5cKdKs Qd9c4h6h KhTc8c2h 9d5h7c8s Ah6cTd5d 9sQc5s3s"));
  }

  @Test
  public void test_omaha_holdem_6359_5h8s9dJsKh_3c4c6d4d_Th6h5c4s_Qh2c3sTc_JdAc7h3d() {
    assertEquals(
      "3c4c6d4d Th6h5c4s JdAc7h3d Qh2c3sTc",
      Solver.process("omaha-holdem 5h8s9dJsKh 3c4c6d4d Th6h5c4s Qh2c3sTc JdAc7h3d"));
  }

  @Test
  public void test_omaha_holdem_6360_2h2s4s6dQs_2c9c5d5s_AhTsTd6h_AcAdAsJh_4hTcQd8s_6s8c9h2d_Js7c9dKc_7s4d6cJc_7dKh8d9s() {
    assertEquals(
      "7dKh8d9s Js7c9dKc 7s4d6cJc AhTsTd6h 4hTcQd8s AcAdAsJh 2c9c5d5s 6s8c9h2d",
      Solver.process("omaha-holdem 2h2s4s6dQs 2c9c5d5s AhTsTd6h AcAdAsJh 4hTcQd8s 6s8c9h2d Js7c9dKc 7s4d6cJc 7dKh8d9s"));
  }

  @Test
  public void test_omaha_holdem_6361_3d5d5h7sTc_4sAh9s9d_JdTd6hKs() {
    assertEquals(
      "4sAh9s9d JdTd6hKs",
      Solver.process("omaha-holdem 3d5d5h7sTc 4sAh9s9d JdTd6hKs"));
  }

  @Test
  public void test_omaha_holdem_6362_2c2d6h9dAd_3sKs3h8s_4s5h7sJc_7h4h6c5s_Kh5d2s7c_8d9hKc4c_Jd9s5cAc_QhAh3cTc_4dQcAs8c_8h6dQd7d() {
    assertEquals(
      "4s5h7sJc 3sKs3h8s 7h4h6c5s 8d9hKc4c 4dQcAs8c=QhAh3cTc Jd9s5cAc Kh5d2s7c 8h6dQd7d",
      Solver.process("omaha-holdem 2c2d6h9dAd 3sKs3h8s 4s5h7sJc 7h4h6c5s Kh5d2s7c 8d9hKc4c Jd9s5cAc QhAh3cTc 4dQcAs8c 8h6dQd7d"));
  }

  @Test
  public void test_omaha_holdem_6363_2c2s3s9hTh_Qd5c7h6d_Qs4h8cTs_Ac2d7s3d_2h9c4cJd_AsJh7d5d_6c7c9sTc_KsJsQhJc() {
    assertEquals(
      "Qd5c7h6d AsJh7d5d Qs4h8cTs 6c7c9sTc KsJsQhJc Ac2d7s3d 2h9c4cJd",
      Solver.process("omaha-holdem 2c2s3s9hTh Qd5c7h6d Qs4h8cTs Ac2d7s3d 2h9c4cJd AsJh7d5d 6c7c9sTc KsJsQhJc"));
  }

  @Test
  public void test_omaha_holdem_6364_2s4s7h9cAh_4d8hJcJd_Td5s9d3d() {
    assertEquals(
      "4d8hJcJd Td5s9d3d",
      Solver.process("omaha-holdem 2s4s7h9cAh 4d8hJcJd Td5s9d3d"));
  }

  @Test
  public void test_omaha_holdem_6365_2s3dAdJhTs_7s8c9s5h_Js6s4c3c_QcTc7h9d_Jd8s8hQd_4h7d7cQs_Jc2d5sQh_6cTd8d2h() {
    assertEquals(
      "7s8c9s5h 4h7d7cQs QcTc7h9d Jd8s8hQd 6cTd8d2h Jc2d5sQh Js6s4c3c",
      Solver.process("omaha-holdem 2s3dAdJhTs 7s8c9s5h Js6s4c3c QcTc7h9d Jd8s8hQd 4h7d7cQs Jc2d5sQh 6cTd8d2h"));
  }

  @Test
  public void test_omaha_holdem_6366_2h5s8h9cQd_4c7sJhTh_5h4sKdTs_9dKs9s5c_6cQc8d6d_6s2c2sJc_Ac7c2dJd_4dAsKc6h() {
    assertEquals(
      "4dAsKc6h Ac7c2dJd 5h4sKdTs 6cQc8d6d 6s2c2sJc 9dKs9s5c 4c7sJhTh",
      Solver.process("omaha-holdem 2h5s8h9cQd 4c7sJhTh 5h4sKdTs 9dKs9s5c 6cQc8d6d 6s2c2sJc Ac7c2dJd 4dAsKc6h"));
  }

  @Test
  public void test_omaha_holdem_6367_2d3d4s5dJh_KdTd7d9d_QcJcKh2c() {
    assertEquals(
      "QcJcKh2c KdTd7d9d",
      Solver.process("omaha-holdem 2d3d4s5dJh KdTd7d9d QcJcKh2c"));
  }

  @Test
  public void test_omaha_holdem_6368_6sJcQhTcTs_6dJd4c5s_4h8s5dKd_9dKhKc8d() {
    assertEquals(
      "4h8s5dKd 6dJd4c5s 9dKhKc8d",
      Solver.process("omaha-holdem 6sJcQhTcTs 6dJd4c5s 4h8s5dKd 9dKhKc8d"));
  }

  @Test
  public void test_omaha_holdem_6369_2c5s8hJsKs_Tc4hKc3c_6hAcKhAs_5c3s8d9d_8s2h8c9s() {
    assertEquals(
      "Tc4hKc3c 6hAcKhAs 5c3s8d9d 8s2h8c9s",
      Solver.process("omaha-holdem 2c5s8hJsKs Tc4hKc3c 6hAcKhAs 5c3s8d9d 8s2h8c9s"));
  }

  @Test
  public void test_omaha_holdem_6370_2h3c6c9sTh_8s3s4sKd_2d8h6sTd_Ac5dTc4d() {
    assertEquals(
      "8s3s4sKd 2d8h6sTd Ac5dTc4d",
      Solver.process("omaha-holdem 2h3c6c9sTh 8s3s4sKd 2d8h6sTd Ac5dTc4d"));
  }

  @Test
  public void test_omaha_holdem_6371_3c7c7h9cAc_Qs2c5h8s_7dJs4c6h_6sJhKh2d_Ah3dJd5d_Ad4h6c4s_ThTdQcQh_9sJcTcTs_8dAs7sKc_2s4d9h5s() {
    assertEquals(
      "Qs2c5h8s 6sJhKh2d 2s4d9h5s ThTdQcQh Ad4h6c4s Ah3dJd5d 7dJs4c6h 9sJcTcTs 8dAs7sKc",
      Solver.process("omaha-holdem 3c7c7h9cAc Qs2c5h8s 7dJs4c6h 6sJhKh2d Ah3dJd5d Ad4h6c4s ThTdQcQh 9sJcTcTs 8dAs7sKc 2s4d9h5s"));
  }

  @Test
  public void test_omaha_holdem_6372_2h3s7dAcAd_8h9dJcAs_2s6cQd7h_5cTs7c8s_3hQh5s6d_8cJs6s5d_7s9hQcTd_9c2d9sKs_Kc2cKdJd() {
    assertEquals(
      "8cJs6s5d 3hQh5s6d 5cTs7c8s 2s6cQd7h=7s9hQcTd 9c2d9sKs Kc2cKdJd 8h9dJcAs",
      Solver.process("omaha-holdem 2h3s7dAcAd 8h9dJcAs 2s6cQd7h 5cTs7c8s 3hQh5s6d 8cJs6s5d 7s9hQcTd 9c2d9sKs Kc2cKdJd"));
  }

  @Test
  public void test_omaha_holdem_6373_4c6c6sAdQh_6dAh8d6h_Kd2hJs7s_8h9s3d4h_5c2dKsKh_4s5h9h7c() {
    assertEquals(
      "Kd2hJs7s 4s5h9h7c=8h9s3d4h 5c2dKsKh 6dAh8d6h",
      Solver.process("omaha-holdem 4c6c6sAdQh 6dAh8d6h Kd2hJs7s 8h9s3d4h 5c2dKsKh 4s5h9h7c"));
  }

  @Test
  public void test_omaha_holdem_6374_4d7d7hJdJh_4sKhKs3c_2h6cQh4c_6s8c2s9s_5hJcTc5c() {
    assertEquals(
      "6s8c2s9s 2h6cQh4c 4sKhKs3c 5hJcTc5c",
      Solver.process("omaha-holdem 4d7d7hJdJh 4sKhKs3c 2h6cQh4c 6s8c2s9s 5hJcTc5c"));
  }

  @Test
  public void test_omaha_holdem_6375_4d5d5s6dAc_3cThQs2h_4c2d2c9c_6s7c5h3s() {
    assertEquals(
      "4c2d2c9c 3cThQs2h 6s7c5h3s",
      Solver.process("omaha-holdem 4d5d5s6dAc 3cThQs2h 4c2d2c9c 6s7c5h3s"));
  }

  @Test
  public void test_omaha_holdem_6376_2h4h6h9sAc_9c2c5h4s_9hKhKcTc_8dAsJd6s_Th3hJhJs_7dKd8c6c_5d8hQsAd() {
    assertEquals(
      "7dKd8c6c 5d8hQsAd 9c2c5h4s 8dAsJd6s Th3hJhJs 9hKhKcTc",
      Solver.process("omaha-holdem 2h4h6h9sAc 9c2c5h4s 9hKhKcTc 8dAsJd6s Th3hJhJs 7dKd8c6c 5d8hQsAd"));
  }

  @Test
  public void test_omaha_holdem_6377_4d6h7hAdQs_3d4s8cQc_Qd4hKcKh_Js7d7cKs_2d4cJh2c_As2h7s3h_9c5h9d8d_Ac6s5sTc_Jd5cKd3c() {
    assertEquals(
      "2d4cJh2c 3d4s8cQc=Qd4hKcKh Ac6s5sTc As2h7s3h Js7d7cKs Jd5cKd3c 9c5h9d8d",
      Solver.process("omaha-holdem 4d6h7hAdQs 3d4s8cQc Qd4hKcKh Js7d7cKs 2d4cJh2c As2h7s3h 9c5h9d8d Ac6s5sTc Jd5cKd3c"));
  }

  @Test
  public void test_omaha_holdem_6378_5d6s8cKcTh_5h7cQdQh_As2dJc7s_9h8h9c8d_4h6cTd5c() {
    assertEquals(
      "As2dJc7s 5h7cQdQh 4h6cTd5c 9h8h9c8d",
      Solver.process("omaha-holdem 5d6s8cKcTh 5h7cQdQh As2dJc7s 9h8h9c8d 4h6cTd5c"));
  }

  @Test
  public void test_omaha_holdem_6379_4d4s9dTcTs_8d6dKdKh_Qs5s7d3d_Jc3sKcJd_2s5c2c9c_AdJh8h7c_7sJs6cAc_As7h5d2d_ThTd9sQc() {
    assertEquals(
      "Qs5s7d3d As7h5d2d 7sJs6cAc=AdJh8h7c 2s5c2c9c Jc3sKcJd 8d6dKdKh ThTd9sQc",
      Solver.process("omaha-holdem 4d4s9dTcTs 8d6dKdKh Qs5s7d3d Jc3sKcJd 2s5c2c9c AdJh8h7c 7sJs6cAc As7h5d2d ThTd9sQc"));
  }

  @Test
  public void test_omaha_holdem_6380_2c6c6h7sQc_3c9dKc2d_Jc9h8sTc_JhJdQhKh() {
    assertEquals(
      "JhJdQhKh Jc9h8sTc 3c9dKc2d",
      Solver.process("omaha-holdem 2c6c6h7sQc 3c9dKc2d Jc9h8sTc JhJdQhKh"));
  }

  @Test
  public void test_omaha_holdem_6381_2h7d9hJdJs_4d9d9s2c_TsAhTh6s_6c4sQdKd_Jc8h5c9c_Jh7c7sTd_6h5d8c3d_3cQhQsKh_Kc2sKs6d_TcAs5s8s() {
    assertEquals(
      "6h5d8c3d 6c4sQdKd TsAhTh6s 3cQhQsKh Kc2sKs6d TcAs5s8s 4d9d9s2c Jh7c7sTd Jc8h5c9c",
      Solver.process("omaha-holdem 2h7d9hJdJs 4d9d9s2c TsAhTh6s 6c4sQdKd Jc8h5c9c Jh7c7sTd 6h5d8c3d 3cQhQsKh Kc2sKs6d TcAs5s8s"));
  }

  @Test
  public void test_omaha_holdem_6382_3d4h8sKhTd_AhTc9dJs_7s3h2h8c_5h4sAs8h_QcJd4d6s() {
    assertEquals(
      "QcJd4d6s AhTc9dJs 7s3h2h8c 5h4sAs8h",
      Solver.process("omaha-holdem 3d4h8sKhTd AhTc9dJs 7s3h2h8c 5h4sAs8h QcJd4d6s"));
  }

  @Test
  public void test_omaha_holdem_6383_5d7s9sAcJh_6dJc8c4h_ThQd5c5s_9d7hTcTd_Qh9c8hQs_Qc6hKc3h_TsJs8d8s_Ks2d6sKh() {
    assertEquals(
      "Qc6hKc3h Qh9c8hQs Ks2d6sKh 9d7hTcTd ThQd5c5s 6dJc8c4h TsJs8d8s",
      Solver.process("omaha-holdem 5d7s9sAcJh 6dJc8c4h ThQd5c5s 9d7hTcTd Qh9c8hQs Qc6hKc3h TsJs8d8s Ks2d6sKh"));
  }

  @Test
  public void test_omaha_holdem_6384_6d7dJsKhTd_9d2c3sKs_2d5sJdQs_2h3h5h8d_Kd4h9h8h_ThAs9cJh_5cAdAcQd() {
    assertEquals(
      "2h3h5h8d 9d2c3sKs ThAs9cJh Kd4h9h8h 2d5sJdQs 5cAdAcQd",
      Solver.process("omaha-holdem 6d7dJsKhTd 9d2c3sKs 2d5sJdQs 2h3h5h8d Kd4h9h8h ThAs9cJh 5cAdAcQd"));
  }

  @Test
  public void test_omaha_holdem_6385_3d3h3s5hTs_4c5c4d4h_Ad5dQh3c_6c6d2d8h_Td8c8s6h_JcKsKdAh_2hJsQc9d() {
    assertEquals(
      "2hJsQc9d 4c5c4d4h 6c6d2d8h Td8c8s6h JcKsKdAh Ad5dQh3c",
      Solver.process("omaha-holdem 3d3h3s5hTs 4c5c4d4h Ad5dQh3c 6c6d2d8h Td8c8s6h JcKsKdAh 2hJsQc9d"));
  }

  @Test
  public void test_omaha_holdem_6386_3d6cJhKcQd_JcTh3c2d_7s8sKsAs_6h5d7hTs_9h6dJdAh() {
    assertEquals(
      "6h5d7hTs 7s8sKsAs JcTh3c2d 9h6dJdAh",
      Solver.process("omaha-holdem 3d6cJhKcQd JcTh3c2d 7s8sKsAs 6h5d7hTs 9h6dJdAh"));
  }

  @Test
  public void test_omaha_holdem_6387_7d7sJdJsQc_6s4dTc7h_8d8cKcAc_AhQhAs5s_Jc3c2dJh_Kh3sKsQs() {
    assertEquals(
      "8d8cKcAc Kh3sKsQs AhQhAs5s 6s4dTc7h Jc3c2dJh",
      Solver.process("omaha-holdem 7d7sJdJsQc 6s4dTc7h 8d8cKcAc AhQhAs5s Jc3c2dJh Kh3sKsQs"));
  }

  @Test
  public void test_omaha_holdem_6388_7cAcJsKsTc_KdThAs5s_2hTdJcQd_5hQc4s6d_2c5d8s7d() {
    assertEquals(
      "5hQc4s6d 2c5d8s7d KdThAs5s 2hTdJcQd",
      Solver.process("omaha-holdem 7cAcJsKsTc KdThAs5s 2hTdJcQd 5hQc4s6d 2c5d8s7d"));
  }

  @Test
  public void test_omaha_holdem_6389_5c8cKdQcTc_Td5s2d3c_2c2hKs4c_9hAdAh3h_Jc6c5hQs_7cTsKh8d_7dJdQd8h_4h6hThAc_4sKcAs5d_4d8s9c6d() {
    assertEquals(
      "4d8s9c6d 4h6hThAc 9hAdAh3h Td5s2d3c 7dJdQd8h 4sKcAs5d 7cTsKh8d 2c2hKs4c Jc6c5hQs",
      Solver.process("omaha-holdem 5c8cKdQcTc Td5s2d3c 2c2hKs4c 9hAdAh3h Jc6c5hQs 7cTsKh8d 7dJdQd8h 4h6hThAc 4sKcAs5d 4d8s9c6d"));
  }

  @Test
  public void test_omaha_holdem_6390_3sAhJdKsQd_KhJcKd9c_JsQsQcAc() {
    assertEquals(
      "JsQsQcAc KhJcKd9c",
      Solver.process("omaha-holdem 3sAhJdKsQd KhJcKd9c JsQsQcAc"));
  }

  @Test
  public void test_omaha_holdem_6391_3c3h6h7cJc_8d3d8sAh_6sQcQd7h_5dKcTdQh_6c5h4s8c_9h8hJdQs_9c5cKd7d_2c7s4d2h() {
    assertEquals(
      "5dKcTdQh 2c7s4d2h 9h8hJdQs 6sQcQd7h 8d3d8sAh 6c5h4s8c 9c5cKd7d",
      Solver.process("omaha-holdem 3c3h6h7cJc 8d3d8sAh 6sQcQd7h 5dKcTdQh 6c5h4s8c 9h8hJdQs 9c5cKd7d 2c7s4d2h"));
  }

  @Test
  public void test_omaha_holdem_6392_5h8sAhKdTs_2h4hKs3s_9cQcJdTd_4c7s8h7d_6sQs3dAc_KcAs9hQh_Jc6h4dQd() {
    assertEquals(
      "4c7s8h7d 2h4hKs3s 6sQs3dAc KcAs9hQh 9cQcJdTd=Jc6h4dQd",
      Solver.process("omaha-holdem 5h8sAhKdTs 2h4hKs3s 9cQcJdTd 4c7s8h7d 6sQs3dAc KcAs9hQh Jc6h4dQd"));
  }

  @Test
  public void test_omaha_holdem_6393_3s4c5dKcTd_5h8c3h3c_8s7c7dJs_5cAcKh4s_8h5sJc4d_QcAs3dAd() {
    assertEquals(
      "8s7c7dJs QcAs3dAd 8h5sJc4d 5cAcKh4s 5h8c3h3c",
      Solver.process("omaha-holdem 3s4c5dKcTd 5h8c3h3c 8s7c7dJs 5cAcKh4s 8h5sJc4d QcAs3dAd"));
  }

  @Test
  public void test_omaha_holdem_6394_3c5c8d8hQh_Qd2cJc5d_AdTh9dJd_6s3s8c4s_QcKh4cTc_5s7h7sAh_Kc9c4h9s_6c7cJs2h() {
    assertEquals(
      "6c7cJs2h AdTh9dJd 5s7h7sAh Kc9c4h9s Qd2cJc5d QcKh4cTc 6s3s8c4s",
      Solver.process("omaha-holdem 3c5c8d8hQh Qd2cJc5d AdTh9dJd 6s3s8c4s QcKh4cTc 5s7h7sAh Kc9c4h9s 6c7cJs2h"));
  }

  @Test
  public void test_omaha_holdem_6395_6d6s9cQdTs_8hKdJc4h_TcAd5d6c_5h3d9s2h_5c4cQc2s_2d3hKsAs_ThKh7cQh_JdKc7h6h_5sJs7s3c() {
    assertEquals(
      "5sJs7s3c 2d3hKsAs 5h3d9s2h 5c4cQc2s ThKh7cQh 8hKdJc4h=JdKc7h6h TcAd5d6c",
      Solver.process("omaha-holdem 6d6s9cQdTs 8hKdJc4h TcAd5d6c 5h3d9s2h 5c4cQc2s 2d3hKsAs ThKh7cQh JdKc7h6h 5sJs7s3c"));
  }

  @Test
  public void test_omaha_holdem_6396_3c4h8sJcQd_Ad5hJs8c_Jh9d7sQc_JdQh6s5s_9s6d2hKh_7cTd4s7d_As2s3dKd() {
    assertEquals(
      "9s6d2hKh As2s3dKd 7cTd4s7d Ad5hJs8c JdQh6s5s=Jh9d7sQc",
      Solver.process("omaha-holdem 3c4h8sJcQd Ad5hJs8c Jh9d7sQc JdQh6s5s 9s6d2hKh 7cTd4s7d As2s3dKd"));
  }

  @Test
  public void test_omaha_holdem_6397_2h8hAdKdQc_3dTd9c9h_As4cQh7h() {
    assertEquals(
      "3dTd9c9h As4cQh7h",
      Solver.process("omaha-holdem 2h8hAdKdQc 3dTd9c9h As4cQh7h"));
  }

  @Test
  public void test_omaha_holdem_6398_4s5h8dJhTh_Js6c2hJd_Jc3h8sAh_KdKh6d3d_Qh2sTs2c_4h9c9s3c_Qs9h6hTc_Td6s4c7d() {
    assertEquals(
      "4h9c9s3c Qh2sTs2c KdKh6d3d Js6c2hJd Td6s4c7d Qs9h6hTc Jc3h8sAh",
      Solver.process("omaha-holdem 4s5h8dJhTh Js6c2hJd Jc3h8sAh KdKh6d3d Qh2sTs2c 4h9c9s3c Qs9h6hTc Td6s4c7d"));
  }

  @Test
  public void test_omaha_holdem_6399_3c8d8h9cKs_JhJc3h7c_6hAh7sAd_Ac9d2c3d() {
    assertEquals(
      "Ac9d2c3d JhJc3h7c 6hAh7sAd",
      Solver.process("omaha-holdem 3c8d8h9cKs JhJc3h7c 6hAh7sAd Ac9d2c3d"));
  }

  @Test
  public void test_omaha_holdem_6400_2c2d7c8dJd_5d2h3h4d_7d6sQdQs_9d4cKsQc_AcTcJh8h_7s6d6hAs() {
    assertEquals(
      "9d4cKsQc 7s6d6hAs AcTcJh8h 5d2h3h4d 7d6sQdQs",
      Solver.process("omaha-holdem 2c2d7c8dJd 5d2h3h4d 7d6sQdQs 9d4cKsQc AcTcJh8h 7s6d6hAs"));
  }

  @Test
  public void test_omaha_holdem_6401_6d8dKsQsTs_QcAd8c2d_Ac7c3d6s_6c3h2sTd_9sKh4dTh_2h8hKd9d_7hJsJdQd_Ah4sTc3s_7d7s9cQh() {
    assertEquals(
      "Ac7c3d6s 7hJsJdQd 6c3h2sTd QcAd8c2d 2h8hKd9d 9sKh4dTh 7d7s9cQh Ah4sTc3s",
      Solver.process("omaha-holdem 6d8dKsQsTs QcAd8c2d Ac7c3d6s 6c3h2sTd 9sKh4dTh 2h8hKd9d 7hJsJdQd Ah4sTc3s 7d7s9cQh"));
  }

  @Test
  public void test_omaha_holdem_6402_2c4d6d6h7h_8hKdQhKh_4h3d9c3h_3s5c7c5h_Ah9dJsJh_7dTh6s8c_JdAc8sKs_TsKcTdQs() {
    assertEquals(
      "JdAc8sKs 4h3d9c3h TsKcTdQs Ah9dJsJh 8hKdQhKh 3s5c7c5h 7dTh6s8c",
      Solver.process("omaha-holdem 2c4d6d6h7h 8hKdQhKh 4h3d9c3h 3s5c7c5h Ah9dJsJh 7dTh6s8c JdAc8sKs TsKcTdQs"));
  }

  @Test
  public void test_omaha_holdem_6403_7c7hJsThTs_3s6dQs4c_Td5s2dTc_6hKd9h9d_5dJdKcAd_4s3dAh7d_8h2s4d8c_4hAcJh3c_8sJcQhQc_Kh9s5h6s() {
    assertEquals(
      "3s6dQs4c Kh9s5h6s 8h2s4d8c 6hKd9h9d 4hAcJh3c=5dJdKcAd 8sJcQhQc 4s3dAh7d Td5s2dTc",
      Solver.process("omaha-holdem 7c7hJsThTs 3s6dQs4c Td5s2dTc 6hKd9h9d 5dJdKcAd 4s3dAh7d 8h2s4d8c 4hAcJh3c 8sJcQhQc Kh9s5h6s"));
  }

  @Test
  public void test_omaha_holdem_6404_2s3c4dAhTd_2d3hAd8d_QcJs5c8h_AsJd4s9h_7cJc8c9d() {
    assertEquals(
      "7cJc8c9d QcJs5c8h 2d3hAd8d AsJd4s9h",
      Solver.process("omaha-holdem 2s3c4dAhTd 2d3hAd8d QcJs5c8h AsJd4s9h 7cJc8c9d"));
  }

  @Test
  public void test_omaha_holdem_6405_3c3h5sAdJh_6hTs4hKh_QcKc2dQd_QhKs8s2s_7s8dAhJs_8h2c2hTh_Td4cTcJc_3s9s7hAc_9d4d5cQs_7d4s5h6c() {
    assertEquals(
      "6hTs4hKh QhKs8s2s 8h2c2hTh 7d4s5h6c 9d4d5cQs Td4cTcJc QcKc2dQd 7s8dAhJs 3s9s7hAc",
      Solver.process("omaha-holdem 3c3h5sAdJh 6hTs4hKh QcKc2dQd QhKs8s2s 7s8dAhJs 8h2c2hTh Td4cTcJc 3s9s7hAc 9d4d5cQs 7d4s5h6c"));
  }

  @Test
  public void test_omaha_holdem_6406_4d4h7sAcTd_6s8d9c8s_2d3h6c5d_7d9sKcJh_3cJcThQc_Kh2h3d5h_Kd2c8c5c_9d4s5s6d() {
    assertEquals(
      "2d3h6c5d Kh2h3d5h Kd2c8c5c 7d9sKcJh 6s8d9c8s 3cJcThQc 9d4s5s6d",
      Solver.process("omaha-holdem 4d4h7sAcTd 6s8d9c8s 2d3h6c5d 7d9sKcJh 3cJcThQc Kh2h3d5h Kd2c8c5c 9d4s5s6d"));
  }

  @Test
  public void test_omaha_holdem_6407_3h8sKdQdTh_Kc7s5cQc_Ah6s4cQh_As8h2s4s_9hTd6c2h_4h9sJh5d_3cAc7h9d_9c8c8dJs() {
    assertEquals(
      "3cAc7h9d As8h2s4s 9hTd6c2h Ah6s4cQh Kc7s5cQc 4h9sJh5d=9c8c8dJs",
      Solver.process("omaha-holdem 3h8sKdQdTh Kc7s5cQc Ah6s4cQh As8h2s4s 9hTd6c2h 4h9sJh5d 3cAc7h9d 9c8c8dJs"));
  }

  @Test
  public void test_omaha_holdem_6408_3c5d8hAsJc_3d8dQsAc_9cAdAh7c_3h6sQd8s_KdKs8c7s_2h9s7h4s() {
    assertEquals(
      "KdKs8c7s 3h6sQd8s 3d8dQsAc 9cAdAh7c 2h9s7h4s",
      Solver.process("omaha-holdem 3c5d8hAsJc 3d8dQsAc 9cAdAh7c 3h6sQd8s KdKs8c7s 2h9s7h4s"));
  }

  @Test
  public void test_omaha_holdem_6409_2hAcAhAsKc_8s9c4c3s_5s4h2cTc_5cKsQs7c_Td5dJdQc_8c2d7s3c_6sJs7hTh_8d3d2s4d() {
    assertEquals(
      "8d3d2s4d 8c2d7s3c 8s9c4c3s 5s4h2cTc 6sJs7hTh Td5dJdQc 5cKsQs7c",
      Solver.process("omaha-holdem 2hAcAhAsKc 8s9c4c3s 5s4h2cTc 5cKsQs7c Td5dJdQc 8c2d7s3c 6sJs7hTh 8d3d2s4d"));
  }

  @Test
  public void test_omaha_holdem_6410_2h6s7cJcJd_7sTh8c2s_Kh5c8h9h_4cQdKsJs_Tc8s3s9c_Kc3hJh7d_9dQs6h3c_3d5dTdAd_2c9sAc2d() {
    assertEquals(
      "Tc8s3s9c Kh5c8h9h 3d5dTdAd 9dQs6h3c 7sTh8c2s 4cQdKsJs 2c9sAc2d Kc3hJh7d",
      Solver.process("omaha-holdem 2h6s7cJcJd 7sTh8c2s Kh5c8h9h 4cQdKsJs Tc8s3s9c Kc3hJh7d 9dQs6h3c 3d5dTdAd 2c9sAc2d"));
  }

  @Test
  public void test_omaha_holdem_6411_2c5d6s7h9s_3c3h2s7c_Qc9dQdAh_4h6hKs5c_4dJh5h3d_Kc2d6cAd_4s7d8c5s_9h4c6d3s_TdJcAcTh() {
    assertEquals(
      "TdJcAcTh Qc9dQdAh Kc2d6cAd 4h6hKs5c 3c3h2s7c 4dJh5h3d=9h4c6d3s 4s7d8c5s",
      Solver.process("omaha-holdem 2c5d6s7h9s 3c3h2s7c Qc9dQdAh 4h6hKs5c 4dJh5h3d Kc2d6cAd 4s7d8c5s 9h4c6d3s TdJcAcTh"));
  }

  @Test
  public void test_omaha_holdem_6412_4c4d6dAhJd_Qc7s7h3h_4s3s2c2d_5h5c8cJh_9dJs6hKs_9cAd8hKc() {
    assertEquals(
      "Qc7s7h3h 5h5c8cJh 9dJs6hKs 9cAd8hKc 4s3s2c2d",
      Solver.process("omaha-holdem 4c4d6dAhJd Qc7s7h3h 4s3s2c2d 5h5c8cJh 9dJs6hKs 9cAd8hKc"));
  }

  @Test
  public void test_omaha_holdem_6413_2c4d4h6d7h_6cJd6h2d_2h8h6s5h_7d8s5cAs_JsKdKc3d_9s7sJcAh_QcAc3h7c_Ks9cAd8c() {
    assertEquals(
      "Ks9cAd8c 9s7sJcAh=QcAc3h7c JsKdKc3d 2h8h6s5h=7d8s5cAs 6cJd6h2d",
      Solver.process("omaha-holdem 2c4d4h6d7h 6cJd6h2d 2h8h6s5h 7d8s5cAs JsKdKc3d 9s7sJcAh QcAc3h7c Ks9cAd8c"));
  }

  @Test
  public void test_omaha_holdem_6414_2d5c5sAcJd_Ts9c8h5h_AsQh8c3c_Qd7s4s4h_6d7hKhTd_6sAd9hJc_Jh9d8d2s_5d9sKd3h() {
    assertEquals(
      "6d7hKhTd Qd7s4s4h Jh9d8d2s AsQh8c3c 6sAd9hJc Ts9c8h5h 5d9sKd3h",
      Solver.process("omaha-holdem 2d5c5sAcJd Ts9c8h5h AsQh8c3c Qd7s4s4h 6d7hKhTd 6sAd9hJc Jh9d8d2s 5d9sKd3h"));
  }

  @Test
  public void test_omaha_holdem_6415_4d5hJdQsTs_Qc7cKs5s_8s9sJsTd() {
    assertEquals(
      "Qc7cKs5s 8s9sJsTd",
      Solver.process("omaha-holdem 4d5hJdQsTs Qc7cKs5s 8s9sJsTd"));
  }

  @Test
  public void test_omaha_holdem_6416_7c9cJcKhTd_6hJhTs6c_QhQcJsJd() {
    assertEquals(
      "6hJhTs6c QhQcJsJd",
      Solver.process("omaha-holdem 7c9cJcKhTd 6hJhTs6c QhQcJsJd"));
  }

  @Test
  public void test_omaha_holdem_6417_2c5sAcAdKh_3sKdKs8s_9cAh7s4c_Qh6hQd6c_2d7c9d2h_Kc6d9sQc_9h2s8d4s() {
    assertEquals(
      "9h2s8d4s Qh6hQd6c Kc6d9sQc 9cAh7s4c 2d7c9d2h 3sKdKs8s",
      Solver.process("omaha-holdem 2c5sAcAdKh 3sKdKs8s 9cAh7s4c Qh6hQd6c 2d7c9d2h Kc6d9sQc 9h2s8d4s"));
  }

  @Test
  public void test_omaha_holdem_6418_2h5h9hJhQc_7hTs2dAc_8h9c9sJd() {
    assertEquals(
      "7hTs2dAc 8h9c9sJd",
      Solver.process("omaha-holdem 2h5h9hJhQc 7hTs2dAc 8h9c9sJd"));
  }

  @Test
  public void test_omaha_holdem_6419_3s6s8sKcQc_6hJhKsTc_9d2h2d6c() {
    assertEquals(
      "9d2h2d6c 6hJhKsTc",
      Solver.process("omaha-holdem 3s6s8sKcQc 6hJhKsTc 9d2h2d6c"));
  }

  @Test
  public void test_omaha_holdem_6420_3c4s6c6hTh_5s2sJd3h_Js4cAh7s_AcKh6d2c_5h3sTsQh_Qs7h5cTd() {
    assertEquals(
      "Js4cAh7s 5h3sTsQh AcKh6d2c 5s2sJd3h Qs7h5cTd",
      Solver.process("omaha-holdem 3c4s6c6hTh 5s2sJd3h Js4cAh7s AcKh6d2c 5h3sTsQh Qs7h5cTd"));
  }

  @Test
  public void test_omaha_holdem_6421_5cAhKsQdTs_2s8h6c3c_Ad6hJs5d_3hJcTd6s_As2cQh9c_Kd2h4cTc_Th7d5s9d_9sKc7h4h_Qs9h7s2d() {
    assertEquals(
      "2s8h6c3c Qs9h7s2d 9sKc7h4h Th7d5s9d Kd2h4cTc As2cQh9c 3hJcTd6s=Ad6hJs5d",
      Solver.process("omaha-holdem 5cAhKsQdTs 2s8h6c3c Ad6hJs5d 3hJcTd6s As2cQh9c Kd2h4cTc Th7d5s9d 9sKc7h4h Qs9h7s2d"));
  }

  @Test
  public void test_omaha_holdem_6422_2c2h8sKdTc_ThQh5d6s_5h3sJcAd() {
    assertEquals(
      "5h3sJcAd ThQh5d6s",
      Solver.process("omaha-holdem 2c2h8sKdTc ThQh5d6s 5h3sJcAd"));
  }

  @Test
  public void test_omaha_holdem_6423_3c3s4c9dQh_4hQcTh6d_6h4s8hKc_Ad3h8d2s_Jd7hKs7c_Td5dJhKh() {
    assertEquals(
      "Td5dJhKh 6h4s8hKc Jd7hKs7c 4hQcTh6d Ad3h8d2s",
      Solver.process("omaha-holdem 3c3s4c9dQh 4hQcTh6d 6h4s8hKc Ad3h8d2s Jd7hKs7c Td5dJhKh"));
  }

  @Test
  public void test_omaha_holdem_6424_4d4h4s9cAh_8s5dAdKs_Ts7c5c2c_Qs7h3h9s_KcQhJdQd_7dJc6s8h() {
    assertEquals(
      "Ts7c5c2c 7dJc6s8h Qs7h3h9s 8s5dAdKs KcQhJdQd",
      Solver.process("omaha-holdem 4d4h4s9cAh 8s5dAdKs Ts7c5c2c Qs7h3h9s KcQhJdQd 7dJc6s8h"));
  }

  @Test
  public void test_omaha_holdem_6425_3s7c7s8cTs_2d4h5c6d_4dTcQh6c() {
    assertEquals(
      "2d4h5c6d 4dTcQh6c",
      Solver.process("omaha-holdem 3s7c7s8cTs 2d4h5c6d 4dTcQh6c"));
  }

  @Test
  public void test_omaha_holdem_6426_2c6d7cAsKc_8cKd3d2d_Td4d8dJh_3c5d7hJc_9d8sQhAd_Ac2h6cTh() {
    assertEquals(
      "Td4d8dJh 9d8sQhAd 8cKd3d2d 3c5d7hJc Ac2h6cTh",
      Solver.process("omaha-holdem 2c6d7cAsKc 8cKd3d2d Td4d8dJh 3c5d7hJc 9d8sQhAd Ac2h6cTh"));
  }

  @Test
  public void test_omaha_holdem_6427_6s9cAdJhKc_7s5dTcJd_QhTs4d8d_2s2cAs4c_2h7dKs9s() {
    assertEquals(
      "7s5dTcJd 2s2cAs4c 2h7dKs9s QhTs4d8d",
      Solver.process("omaha-holdem 6s9cAdJhKc 7s5dTcJd QhTs4d8d 2s2cAs4c 2h7dKs9s"));
  }

  @Test
  public void test_omaha_holdem_6428_4c8d8hQdQh_7s9s5d5c_9hJd6d3c_KsTh8sJh_6sAh2s4s_Ad4h7c2c_Kh3hQcTs_2dJs4d5s_5h6c3dTd_TcKd7d9d() {
    assertEquals(
      "5h6c3dTd 9hJd6d3c TcKd7d9d 2dJs4d5s 6sAh2s4s=Ad4h7c2c 7s9s5d5c KsTh8sJh Kh3hQcTs",
      Solver.process("omaha-holdem 4c8d8hQdQh 7s9s5d5c 9hJd6d3c KsTh8sJh 6sAh2s4s Ad4h7c2c Kh3hQcTs 2dJs4d5s 5h6c3dTd TcKd7d9d"));
  }

  @Test
  public void test_omaha_holdem_6429_5s7sAcJhTc_7cKs8c6d_QhKhQs3s() {
    assertEquals(
      "7cKs8c6d QhKhQs3s",
      Solver.process("omaha-holdem 5s7sAcJhTc 7cKs8c6d QhKhQs3s"));
  }

  @Test
  public void test_omaha_holdem_6430_8c9dAdKsTd_7c3d4hAh_4c2h3s5s_6hKd6cTh_2d9h7h8d_AsJs7sQh() {
    assertEquals(
      "4c2h3s5s 7c3d4hAh 6hKd6cTh AsJs7sQh 2d9h7h8d",
      Solver.process("omaha-holdem 8c9dAdKsTd 7c3d4hAh 4c2h3s5s 6hKd6cTh 2d9h7h8d AsJs7sQh"));
  }

  @Test
  public void test_omaha_holdem_6431_3h4c7hAcTh_8s2d9d6s_Jh9cAs3d_QsJc5h9s_4d3c2h2c_5sAh5cTd_Kc8dJs6c_2sAdTc3s() {
    assertEquals(
      "8s2d9d6s QsJc5h9s Kc8dJs6c 4d3c2h2c Jh9cAs3d 2sAdTc3s=5sAh5cTd",
      Solver.process("omaha-holdem 3h4c7hAcTh 8s2d9d6s Jh9cAs3d QsJc5h9s 4d3c2h2c 5sAh5cTd Kc8dJs6c 2sAdTc3s"));
  }

  @Test
  public void test_omaha_holdem_6432_2s3c7c8hQs_TcAd9h6h_8dAsKsQd_Qc8s6s2h() {
    assertEquals(
      "TcAd9h6h 8dAsKsQd=Qc8s6s2h",
      Solver.process("omaha-holdem 2s3c7c8hQs TcAd9h6h 8dAsKsQd Qc8s6s2h"));
  }

  @Test
  public void test_omaha_holdem_6433_2sJsKhQcQs_4h8c4cTh_5h5c7c6s_3d5s6h3s_Tc3cJc8d_8h3hKdAc() {
    assertEquals(
      "4h8c4cTh 5h5c7c6s Tc3cJc8d 8h3hKdAc 3d5s6h3s",
      Solver.process("omaha-holdem 2sJsKhQcQs 4h8c4cTh 5h5c7c6s 3d5s6h3s Tc3cJc8d 8h3hKdAc"));
  }

  @Test
  public void test_omaha_holdem_6434_3d8d8s9cKh_8h7s9s9d_2d5hAc7h_6d8c4c6c_5cTh9hQd_4hKsJh4s_QcQhJd7d() {
    assertEquals(
      "2d5hAc7h 5cTh9hQd QcQhJd7d 4hKsJh4s 6d8c4c6c 8h7s9s9d",
      Solver.process("omaha-holdem 3d8d8s9cKh 8h7s9s9d 2d5hAc7h 6d8c4c6c 5cTh9hQd 4hKsJh4s QcQhJd7d"));
  }

  @Test
  public void test_omaha_holdem_6435_2c3c6h8c9c_Ts8dQs9h_JdKd6c7d_Kh2s2h9d_Td4s8hQc_7cJcKsAh_6dKc5dTc_7hAs3h4h_QdQhAc2d() {
    assertEquals(
      "7hAs3h4h JdKd6c7d Td4s8hQc QdQhAc2d Ts8dQs9h Kh2s2h9d 7cJcKsAh 6dKc5dTc",
      Solver.process("omaha-holdem 2c3c6h8c9c Ts8dQs9h JdKd6c7d Kh2s2h9d Td4s8hQc 7cJcKsAh 6dKc5dTc 7hAs3h4h QdQhAc2d"));
  }

  @Test
  public void test_omaha_holdem_6436_7c8sAdJcKc_Jd5cAc2d_4sTdJs6d_4h4d9h2s_Qh8d5h7h() {
    assertEquals(
      "4h4d9h2s 4sTdJs6d Qh8d5h7h Jd5cAc2d",
      Solver.process("omaha-holdem 7c8sAdJcKc Jd5cAc2d 4sTdJs6d 4h4d9h2s Qh8d5h7h"));
  }

  @Test
  public void test_omaha_holdem_6437_4d4hAdKsQc_Js8h8d6s_ThAcJdKc_Kh7sQs6h_Td6cKd9d() {
    assertEquals(
      "Js8h8d6s Td6cKd9d Kh7sQs6h ThAcJdKc",
      Solver.process("omaha-holdem 4d4hAdKsQc Js8h8d6s ThAcJdKc Kh7sQs6h Td6cKd9d"));
  }

  @Test
  public void test_omaha_holdem_6438_4c6d8c8h8s_Tc2s4d3s_AsQsJh2h() {
    assertEquals(
      "Tc2s4d3s AsQsJh2h",
      Solver.process("omaha-holdem 4c6d8c8h8s Tc2s4d3s AsQsJh2h"));
  }

  @Test
  public void test_omaha_holdem_6439_7sAhJcKhTd_Kc5s9dAd_9cJhAc9s_3cKd7cQc_4s3h6d3d() {
    assertEquals(
      "4s3h6d3d 9cJhAc9s Kc5s9dAd 3cKd7cQc",
      Solver.process("omaha-holdem 7sAhJcKhTd Kc5s9dAd 9cJhAc9s 3cKd7cQc 4s3h6d3d"));
  }

  @Test
  public void test_omaha_holdem_6440_3h5c5sAsTh_Ks2c4dJd_Qh2sTcKh_7s5h7c8c_3cJhKd9s_3d2dJcAd_8s7dQd8d_4hQc8h9d_9h6h9c7h_3s5d2h4s() {
    assertEquals(
      "4hQc8h9d 3cJhKd9s 8s7dQd8d 9h6h9c7h Qh2sTcKh 3d2dJcAd 7s5h7c8c Ks2c4dJd 3s5d2h4s",
      Solver.process("omaha-holdem 3h5c5sAsTh Ks2c4dJd Qh2sTcKh 7s5h7c8c 3cJhKd9s 3d2dJcAd 8s7dQd8d 4hQc8h9d 9h6h9c7h 3s5d2h4s"));
  }

  @Test
  public void test_omaha_holdem_6441_3h3s8d9cKh_8sQc6h7s_Ts8c4sQs_7d9dKsTh_4c2c3d3c_Td2s6dQd_JhQh9s5d_4h9hAd2h_AhKd4d5h() {
    assertEquals(
      "Td2s6dQd 8sQc6h7s=Ts8c4sQs JhQh9s5d 4h9hAd2h AhKd4d5h 7d9dKsTh 4c2c3d3c",
      Solver.process("omaha-holdem 3h3s8d9cKh 8sQc6h7s Ts8c4sQs 7d9dKsTh 4c2c3d3c Td2s6dQd JhQh9s5d 4h9hAd2h AhKd4d5h"));
  }

  @Test
  public void test_omaha_holdem_6442_2s3c3s6d8h_4h7s9h5s_TdQdJsJd_9c6hQh9s() {
    assertEquals(
      "9c6hQh9s TdQdJsJd 4h7s9h5s",
      Solver.process("omaha-holdem 2s3c3s6d8h 4h7s9h5s TdQdJsJd 9c6hQh9s"));
  }

  @Test
  public void test_omaha_holdem_6443_5c7s8cJdQc_Ac3d3s9h_7dTd4cTh_5dQsTs7c() {
    assertEquals(
      "Ac3d3s9h 7dTd4cTh 5dQsTs7c",
      Solver.process("omaha-holdem 5c7s8cJdQc Ac3d3s9h 7dTd4cTh 5dQsTs7c"));
  }

  @Test
  public void test_omaha_holdem_6444_2s4d6dKdTc_3hAdAh2h_7c5d9dJh_7d5h7sQd_5c3d4s4c_7h9sTd8d_6sJc2c9h_Qh8h8s5s() {
    assertEquals(
      "Qh8h8s5s 3hAdAh2h 6sJc2c9h 5c3d4s4c 7c5d9dJh 7h9sTd8d 7d5h7sQd",
      Solver.process("omaha-holdem 2s4d6dKdTc 3hAdAh2h 7c5d9dJh 7d5h7sQd 5c3d4s4c 7h9sTd8d 6sJc2c9h Qh8h8s5s"));
  }

  @Test
  public void test_omaha_holdem_6445_4c6h7h8c9h_KhQc5cAd_4h9c6c7s_4s5dTd2c_3h8dKd3s() {
    assertEquals(
      "KhQc5cAd 3h8dKd3s 4h9c6c7s 4s5dTd2c",
      Solver.process("omaha-holdem 4c6h7h8c9h KhQc5cAd 4h9c6c7s 4s5dTd2c 3h8dKd3s"));
  }

  @Test
  public void test_omaha_holdem_6446_7c8dAsKhKs_8sTd5sJd_2h8c5d2s_2c6h3d7d_AdJh8hKd_Kc6dAc9s_4d4hQc5c_QdQhAhJc_TsJs7s6s_Qs7h3h2d() {
    assertEquals(
      "4d4hQc5c 2c6h3d7d TsJs7s6s Qs7h3h2d 2h8c5d2s 8sTd5sJd QdQhAhJc AdJh8hKd=Kc6dAc9s",
      Solver.process("omaha-holdem 7c8dAsKhKs 8sTd5sJd 2h8c5d2s 2c6h3d7d AdJh8hKd Kc6dAc9s 4d4hQc5c QdQhAhJc TsJs7s6s Qs7h3h2d"));
  }

  @Test
  public void test_omaha_holdem_6447_3s4hJdKhTd_7s3hQdTh_JsKsAd8c_6h8h6d9s() {
    assertEquals(
      "6h8h6d9s 7s3hQdTh JsKsAd8c",
      Solver.process("omaha-holdem 3s4hJdKhTd 7s3hQdTh JsKsAd8c 6h8h6d9s"));
  }

  @Test
  public void test_omaha_holdem_6448_6d6s9dKsQd_2dAhQs8s_5h4s2cKd_Ts3sTc9c_6hJh5d7d() {
    assertEquals(
      "Ts3sTc9c 2dAhQs8s 5h4s2cKd 6hJh5d7d",
      Solver.process("omaha-holdem 6d6s9dKsQd 2dAhQs8s 5h4s2cKd Ts3sTc9c 6hJh5d7d"));
  }

  @Test
  public void test_omaha_holdem_6449_3s6cJdJhQs_Td9s4c2s_7h6sTs5c_2dTcJs8h_6hQcAc5d_4d4s8d8s_As5s7cKd_Ah3c4h3d() {
    assertEquals(
      "Td9s4c2s As5s7cKd 7h6sTs5c 4d4s8d8s 6hQcAc5d 2dTcJs8h Ah3c4h3d",
      Solver.process("omaha-holdem 3s6cJdJhQs Td9s4c2s 7h6sTs5c 2dTcJs8h 6hQcAc5d 4d4s8d8s As5s7cKd Ah3c4h3d"));
  }

  @Test
  public void test_omaha_holdem_6450_2s5d7dQcQh_JsTdAs6d_7hQs2d4h_8h3cJd3s_Ts5s4dKs_4c5h6h3h_3d5cKh4s_Th8d6cAh_8sKcAd6s_QdJc8cTc() {
    assertEquals(
      "Th8d6cAh JsTdAs6d 8sKcAd6s 8h3cJd3s 4c5h6h3h 3d5cKh4s=Ts5s4dKs QdJc8cTc 7hQs2d4h",
      Solver.process("omaha-holdem 2s5d7dQcQh JsTdAs6d 7hQs2d4h 8h3cJd3s Ts5s4dKs 4c5h6h3h 3d5cKh4s Th8d6cAh 8sKcAd6s QdJc8cTc"));
  }

  @Test
  public void test_omaha_holdem_6451_6h7hKdQhTd_5c7d8d7s_5h3s4s6c_4dQd3d2s_Qc5d6dAd() {
    assertEquals(
      "5h3s4s6c 4dQd3d2s Qc5d6dAd 5c7d8d7s",
      Solver.process("omaha-holdem 6h7hKdQhTd 5c7d8d7s 5h3s4s6c 4dQd3d2s Qc5d6dAd"));
  }

  @Test
  public void test_omaha_holdem_6452_7c8c8h9dTd_5cAh5h9h_9sAd2sJd_AsQs6h5s_2dJc2cKs_QhJhTs9c_4d5d8d6c_7d6dQc2h_KcTh4cKh() {
    assertEquals(
      "2dJc2cKs 5cAh5h9h KcTh4cKh AsQs6h5s 4d5d8d6c=7d6dQc2h 9sAd2sJd QhJhTs9c",
      Solver.process("omaha-holdem 7c8c8h9dTd 5cAh5h9h 9sAd2sJd AsQs6h5s 2dJc2cKs QhJhTs9c 4d5d8d6c 7d6dQc2h KcTh4cKh"));
  }

  @Test
  public void test_omaha_holdem_6453_5c8hKcKhKs_3cJsQd9d_6s8d3s5s_4hTd4d3h() {
    assertEquals(
      "6s8d3s5s 3cJsQd9d 4hTd4d3h",
      Solver.process("omaha-holdem 5c8hKcKhKs 3cJsQd9d 6s8d3s5s 4hTd4d3h"));
  }

  @Test
  public void test_omaha_holdem_6454_2s4h9d9hQd_8d7cJc5h_Jd9cQhAs_Tc2cJsJh_3s4dAcKs_Td3d3h8s_5c3cAh6d() {
    assertEquals(
      "8d7cJc5h 5c3cAh6d Td3d3h8s 3s4dAcKs Tc2cJsJh Jd9cQhAs",
      Solver.process("omaha-holdem 2s4h9d9hQd 8d7cJc5h Jd9cQhAs Tc2cJsJh 3s4dAcKs Td3d3h8s 5c3cAh6d"));
  }

  @Test
  public void test_omaha_holdem_6455_6d8hAdQhTh_6h6sKc7d_Ac2hJd5d_Qc4c5h8d_9d3d9h8s_2d3h3sAs_2cAhJs4s() {
    assertEquals(
      "9d3d9h8s 2d3h3sAs 2cAhJs4s=Ac2hJd5d Qc4c5h8d 6h6sKc7d",
      Solver.process("omaha-holdem 6d8hAdQhTh 6h6sKc7d Ac2hJd5d Qc4c5h8d 9d3d9h8s 2d3h3sAs 2cAhJs4s"));
  }

  @Test
  public void test_omaha_holdem_6456_2c5d7hKsTh_TcQcJd7c_Js6d7d9d_6sKhTsJc_TdAh2d4s_9cKc3dQs_6hKd8c4d_4c6cAc5s_8s2h8h4h() {
    assertEquals(
      "4c6cAc5s Js6d7d9d 8s2h8h4h 6hKd8c4d 9cKc3dQs TdAh2d4s TcQcJd7c 6sKhTsJc",
      Solver.process("omaha-holdem 2c5d7hKsTh TcQcJd7c Js6d7d9d 6sKhTsJc TdAh2d4s 9cKc3dQs 6hKd8c4d 4c6cAc5s 8s2h8h4h"));
  }

  @Test
  public void test_omaha_holdem_6457_4h7s8c9c9s_Ts8hThTd_8d5d2c5c_Ks4c3sAd_Tc9h6h9d_2hJs5h3h() {
    assertEquals(
      "2hJs5h3h Ks4c3sAd 8d5d2c5c Ts8hThTd Tc9h6h9d",
      Solver.process("omaha-holdem 4h7s8c9c9s Ts8hThTd 8d5d2c5c Ks4c3sAd Tc9h6h9d 2hJs5h3h"));
  }

  @Test
  public void test_omaha_holdem_6458_2c5sAdJhKc_6c9hTc9c_2dKsThQh() {
    assertEquals(
      "6c9hTc9c 2dKsThQh",
      Solver.process("omaha-holdem 2c5sAdJhKc 6c9hTc9c 2dKsThQh"));
  }

  @Test
  public void test_omaha_holdem_6459_2c3s5d7h9d_4d5cJh4c_8s3c6s9h_7cKs3dAs() {
    assertEquals(
      "4d5cJh4c 7cKs3dAs 8s3c6s9h",
      Solver.process("omaha-holdem 2c3s5d7h9d 4d5cJh4c 8s3c6s9h 7cKs3dAs"));
  }

  @Test
  public void test_omaha_holdem_6460_2s7sQhTcTh_2d2c7cQc_9h5dJdQd_4c5s7h5h_Ts4d6dJh_6c4sTd3h_9cKcJc3d() {
    assertEquals(
      "9cKcJc3d 4c5s7h5h 9h5dJdQd 6c4sTd3h Ts4d6dJh 2d2c7cQc",
      Solver.process("omaha-holdem 2s7sQhTcTh 2d2c7cQc 9h5dJdQd 4c5s7h5h Ts4d6dJh 6c4sTd3h 9cKcJc3d"));
  }

  @Test
  public void test_omaha_holdem_6461_8d9dAsJsTd_Jc4c8hJh_Ac5dQhAd_Kd5sQs4h_2c2sTs6s_QcKc5hTh_JdKs9c9h_9s4s3sAh_7dKh3h6d() {
    assertEquals(
      "2c2sTs6s 9s4s3sAh JdKs9c9h Jc4c8hJh Kd5sQs4h=QcKc5hTh Ac5dQhAd 7dKh3h6d",
      Solver.process("omaha-holdem 8d9dAsJsTd Jc4c8hJh Ac5dQhAd Kd5sQs4h 2c2sTs6s QcKc5hTh JdKs9c9h 9s4s3sAh 7dKh3h6d"));
  }

  @Test
  public void test_omaha_holdem_6462_3d6c8c8h9d_Ah8sKhJs_4c9c2h6d_4d7hThQc_Jh7c4h3s_9h6h5sKc_9sAc7s2s_3h8dQh3c_Jd7d4s5d() {
    assertEquals(
      "Jh7c4h3s 4c9c2h6d 9h6h5sKc 9sAc7s2s Ah8sKhJs Jd7d4s5d 4d7hThQc 3h8dQh3c",
      Solver.process("omaha-holdem 3d6c8c8h9d Ah8sKhJs 4c9c2h6d 4d7hThQc Jh7c4h3s 9h6h5sKc 9sAc7s2s 3h8dQh3c Jd7d4s5d"));
  }

  @Test
  public void test_omaha_holdem_6463_2h3c3sAdAh_4dKdTc7c_KsKhJc2d_5hKc5c2c_7sTs3hQc_JhJd7h4c() {
    assertEquals(
      "4dKdTc7c 5hKc5c2c JhJd7h4c KsKhJc2d 7sTs3hQc",
      Solver.process("omaha-holdem 2h3c3sAdAh 4dKdTc7c KsKhJc2d 5hKc5c2c 7sTs3hQc JhJd7h4c"));
  }

  @Test
  public void test_omaha_holdem_6464_4h8d9cQsTs_2d4sQc6s_8s7d9sQh() {
    assertEquals(
      "2d4sQc6s 8s7d9sQh",
      Solver.process("omaha-holdem 4h8d9cQsTs 2d4sQc6s 8s7d9sQh"));
  }

  @Test
  public void test_omaha_holdem_6465_9cAdAhJdQs_Kc4d5d5c_JcTh6h4h_9sJh7cTc_5hQcKs2d_2s7d6c8c() {
    assertEquals(
      "2s7d6c8c Kc4d5d5c 9sJh7cTc=JcTh6h4h 5hQcKs2d",
      Solver.process("omaha-holdem 9cAdAhJdQs Kc4d5d5c JcTh6h4h 9sJh7cTc 5hQcKs2d 2s7d6c8c"));
  }

  @Test
  public void test_omaha_holdem_6466_6d8d9cJdTc_KhQs8s2h_Ac4h3cQc_Ad2dTd3s() {
    assertEquals(
      "Ac4h3cQc KhQs8s2h Ad2dTd3s",
      Solver.process("omaha-holdem 6d8d9cJdTc KhQs8s2h Ac4h3cQc Ad2dTd3s"));
  }

  @Test
  public void test_omaha_holdem_6467_2c7h8c8sAh_JhKc4hJs_Ac2h2sTc_3dTd5cJd_7dKd6d3h_8h3c5hAs() {
    assertEquals(
      "3dTd5cJd 7dKd6d3h JhKc4hJs Ac2h2sTc 8h3c5hAs",
      Solver.process("omaha-holdem 2c7h8c8sAh JhKc4hJs Ac2h2sTc 3dTd5cJd 7dKd6d3h 8h3c5hAs"));
  }

  @Test
  public void test_omaha_holdem_6468_5d8s9hJcJs_JdKd6c9c_Ad6d4c7c_JhTh7hTc_5c3d6hQc_3sQd6sKs_9s8dKh9d_Kc7d2h8h_As2s2cQs_8cTsAh3c() {
    assertEquals(
      "3sQd6sKs As2s2cQs 5c3d6hQc Kc7d2h8h 8cTsAh3c Ad6d4c7c JhTh7hTc 9s8dKh9d JdKd6c9c",
      Solver.process("omaha-holdem 5d8s9hJcJs JdKd6c9c Ad6d4c7c JhTh7hTc 5c3d6hQc 3sQd6sKs 9s8dKh9d Kc7d2h8h As2s2cQs 8cTsAh3c"));
  }

  @Test
  public void test_omaha_holdem_6469_4d5s8s9sTc_Ac2h5h2d_6s2cQd9c_6cKc4c8d_9d6hTs8c() {
    assertEquals(
      "Ac2h5h2d 6s2cQd9c 6cKc4c8d 9d6hTs8c",
      Solver.process("omaha-holdem 4d5s8s9sTc Ac2h5h2d 6s2cQd9c 6cKc4c8d 9d6hTs8c"));
  }

  @Test
  public void test_omaha_holdem_6470_2c4c8dJhKd_5sQs9d7d_3d6d2hJd_6c8c8s8h_Ad4hKs7c_QcJcKc6s_5cTdThAs_3s7h3hAh_6h2d3cTs() {
    assertEquals(
      "5sQs9d7d 6h2d3cTs 3s7h3hAh 5cTdThAs 3d6d2hJd Ad4hKs7c QcJcKc6s 6c8c8s8h",
      Solver.process("omaha-holdem 2c4c8dJhKd 5sQs9d7d 3d6d2hJd 6c8c8s8h Ad4hKs7c QcJcKc6s 5cTdThAs 3s7h3hAh 6h2d3cTs"));
  }

  @Test
  public void test_omaha_holdem_6471_2hAhJdJhQh_4c9s8hKc_TcQdKd4h_9d3h5s6d_Ks6hJsTh_4d7s2s8c_Kh2c8s9c_9h5d3cAc_As2dJcAd() {
    assertEquals(
      "9d3h5s6d 4c9s8hKc 4d7s2s8c Kh2c8s9c 9h5d3cAc TcQdKd4h Ks6hJsTh As2dJcAd",
      Solver.process("omaha-holdem 2hAhJdJhQh 4c9s8hKc TcQdKd4h 9d3h5s6d Ks6hJsTh 4d7s2s8c Kh2c8s9c 9h5d3cAc As2dJcAd"));
  }

  @Test
  public void test_omaha_holdem_6472_4d5hJdTdTs_TcKdJc7d_2c9s6c9h_Qc6d3h5d_5cQs3s5s_9d3cAdKs() {
    assertEquals(
      "2c9s6c9h Qc6d3h5d 9d3cAdKs 5cQs3s5s TcKdJc7d",
      Solver.process("omaha-holdem 4d5hJdTdTs TcKdJc7d 2c9s6c9h Qc6d3h5d 5cQs3s5s 9d3cAdKs"));
  }

  @Test
  public void test_omaha_holdem_6473_2h4h6h9c9h_7cJhKdAd_8s2c5d8h() {
    assertEquals(
      "7cJhKdAd 8s2c5d8h",
      Solver.process("omaha-holdem 2h4h6h9c9h 7cJhKdAd 8s2c5d8h"));
  }

  @Test
  public void test_omaha_holdem_6474_4c6s8h9sJs_KcQhQcJc_TdAs4h3c_5d3h9dTs() {
    assertEquals(
      "TdAs4h3c 5d3h9dTs KcQhQcJc",
      Solver.process("omaha-holdem 4c6s8h9sJs KcQhQcJc TdAs4h3c 5d3h9dTs"));
  }

  @Test
  public void test_omaha_holdem_6475_2h5d6sAcJd_4h5c9dJc_TsAs3s7d_Qs7h6c5h_9s2dQhKd_3c4dKh6d_5s7c8c2s_Qd2c6h9c() {
    assertEquals(
      "9s2dQhKd TsAs3s7d 5s7c8c2s Qd2c6h9c Qs7h6c5h 4h5c9dJc 3c4dKh6d",
      Solver.process("omaha-holdem 2h5d6sAcJd 4h5c9dJc TsAs3s7d Qs7h6c5h 9s2dQhKd 3c4dKh6d 5s7c8c2s Qd2c6h9c"));
  }

  @Test
  public void test_omaha_holdem_6476_3h5s8sKsTd_JsQs9h5d_7hQh4h4d_3c7sQd9s_4s8h6h9c() {
    assertEquals(
      "7hQh4h4d 4s8h6h9c 3c7sQd9s JsQs9h5d",
      Solver.process("omaha-holdem 3h5s8sKsTd JsQs9h5d 7hQh4h4d 3c7sQd9s 4s8h6h9c"));
  }

  @Test
  public void test_omaha_holdem_6477_9cAcAhKcKd_7c7h9h5d_Ad3s6c2d_9sJhTdQh_6s7s8s6d_2h3dJs7d_8c8d6h8h_TcQd3hAs_Jc5s4h5h_QcJd5c4c() {
    assertEquals(
      "2h3dJs7d Jc5s4h5h 6s7s8s6d 8c8d6h8h 7c7h9h5d 9sJhTdQh Ad3s6c2d TcQd3hAs QcJd5c4c",
      Solver.process("omaha-holdem 9cAcAhKcKd 7c7h9h5d Ad3s6c2d 9sJhTdQh 6s7s8s6d 2h3dJs7d 8c8d6h8h TcQd3hAs Jc5s4h5h QcJd5c4c"));
  }

  @Test
  public void test_omaha_holdem_6478_6c6s8s9sJd_Jc7d3dTs_8hAh4hKd() {
    assertEquals(
      "8hAh4hKd Jc7d3dTs",
      Solver.process("omaha-holdem 6c6s8s9sJd Jc7d3dTs 8hAh4hKd"));
  }

  @Test
  public void test_omaha_holdem_6479_3c8sKcThTs_9d7dAhAd_AcTc8dTd() {
    assertEquals(
      "9d7dAhAd AcTc8dTd",
      Solver.process("omaha-holdem 3c8sKcThTs 9d7dAhAd AcTc8dTd"));
  }

  @Test
  public void test_omaha_holdem_6480_3s7d8dKcTh_4cJd6c8c_JsQh5h9s_2c4d7s5c_JhKsKd3d_4h7hAh4s_Jc8h5d9c_AdTs9dQs_3h6sQd9h_TdTc6hAs() {
    assertEquals(
      "2c4d7s5c 4h7hAh4s 4cJd6c8c AdTs9dQs TdTc6hAs JhKsKd3d 3h6sQd9h Jc8h5d9c=JsQh5h9s",
      Solver.process("omaha-holdem 3s7d8dKcTh 4cJd6c8c JsQh5h9s 2c4d7s5c JhKsKd3d 4h7hAh4s Jc8h5d9c AdTs9dQs 3h6sQd9h TdTc6hAs"));
  }

  @Test
  public void test_omaha_holdem_6481_4c5d8sJcQs_9s6s8d4s_5s2dJsTc_Qh8c6cJh_Kd2s8h4d_Th3c6h6d_KcJd4h7h() {
    assertEquals(
      "Th3c6h6d 9s6s8d4s=Kd2s8h4d KcJd4h7h 5s2dJsTc Qh8c6cJh",
      Solver.process("omaha-holdem 4c5d8sJcQs 9s6s8d4s 5s2dJsTc Qh8c6cJh Kd2s8h4d Th3c6h6d KcJd4h7h"));
  }

  @Test
  public void test_omaha_holdem_6482_2cAdJcJdKh_4d7h8d2h_8c6h5c5d_4h7cKc7d_Ks3cQsTc_3d2s8s2d() {
    assertEquals(
      "4d7h8d2h 8c6h5c5d 4h7cKc7d Ks3cQsTc 3d2s8s2d",
      Solver.process("omaha-holdem 2cAdJcJdKh 4d7h8d2h 8c6h5c5d 4h7cKc7d Ks3cQsTc 3d2s8s2d"));
  }

  @Test
  public void test_omaha_holdem_6483_5h9dAcAsQd_QsTsAh7h_Kd6c5sKh_KcAd6h2c_5d2s8h3s_2hQh7dQc_Jh4dJs4c_4s7s8s7c() {
    assertEquals(
      "5d2s8h3s 4s7s8s7c Jh4dJs4c Kd6c5sKh KcAd6h2c 2hQh7dQc QsTsAh7h",
      Solver.process("omaha-holdem 5h9dAcAsQd QsTsAh7h Kd6c5sKh KcAd6h2c 5d2s8h3s 2hQh7dQc Jh4dJs4c 4s7s8s7c"));
  }

  @Test
  public void test_omaha_holdem_6484_2h4hAhJsTc_Ac6d6s9h_Qc6hQs5d_8h4cJdKs_2d5s8sQh_4sTd7hKd_9s8c5cJh_6c9c9dAd_TsKh4d5h_3h8dQd2c() {
    assertEquals(
      "2d5s8sQh=3h8dQd2c 9s8c5cJh Qc6hQs5d 6c9c9dAd=Ac6d6s9h 4sTd7hKd 8h4cJdKs TsKh4d5h",
      Solver.process("omaha-holdem 2h4hAhJsTc Ac6d6s9h Qc6hQs5d 8h4cJdKs 2d5s8sQh 4sTd7hKd 9s8c5cJh 6c9c9dAd TsKh4d5h 3h8dQd2c"));
  }

  @Test
  public void test_omaha_holdem_6485_3d5d9sQdTh_Qh2d3c6s_Tc4s8h5h_Kh3s8c5s_9h9c6hQs_JdJcKs6c_7sAcKcAd_7dQc5c6d() {
    assertEquals(
      "7sAcKcAd Kh3s8c5s Tc4s8h5h Qh2d3c6s 9h9c6hQs JdJcKs6c 7dQc5c6d",
      Solver.process("omaha-holdem 3d5d9sQdTh Qh2d3c6s Tc4s8h5h Kh3s8c5s 9h9c6hQs JdJcKs6c 7sAcKcAd 7dQc5c6d"));
  }

  @Test
  public void test_omaha_holdem_6486_2d3c3h6c7d_4d6s7c6h_Kc7hAs9s_Qc3sJd2c_5h5c7s2h_ThQs4sJs() {
    assertEquals(
      "ThQs4sJs 5h5c7s2h Kc7hAs9s Qc3sJd2c 4d6s7c6h",
      Solver.process("omaha-holdem 2d3c3h6c7d 4d6s7c6h Kc7hAs9s Qc3sJd2c 5h5c7s2h ThQs4sJs"));
  }

  @Test
  public void test_omaha_holdem_6487_5h6s7d9cKs_9hJs4d4c_As8sQcTd_Tc2c8h3d_Jh6dQs7c_8c6hJc3h_8d6c5s5d() {
    assertEquals(
      "9hJs4d4c Jh6dQs7c 8c6hJc3h=8d6c5s5d As8sQcTd=Tc2c8h3d",
      Solver.process("omaha-holdem 5h6s7d9cKs 9hJs4d4c As8sQcTd Tc2c8h3d Jh6dQs7c 8c6hJc3h 8d6c5s5d"));
  }

  @Test
  public void test_omaha_holdem_6488_3c3d4h8dAc_9cJd8cKd_9s7cAdKh_ThJcTc6d_8s9d5s4c_5d8hQsJs_Kc4s6sQh_7h4d2dQd_AsQc2c7s_5c3s2s9h() {
    assertEquals(
      "7h4d2dQd Kc4s6sQh 5d8hQsJs 9cJd8cKd 8s9d5s4c ThJcTc6d AsQc2c7s 9s7cAdKh 5c3s2s9h",
      Solver.process("omaha-holdem 3c3d4h8dAc 9cJd8cKd 9s7cAdKh ThJcTc6d 8s9d5s4c 5d8hQsJs Kc4s6sQh 7h4d2dQd AsQc2c7s 5c3s2s9h"));
  }

  @Test
  public void test_omaha_holdem_6489_2c3s4dJcKh_7dTc4cKc_6h9hAc4s_KsJd9s6c_7hQh5cKd_6dAh8h9d() {
    assertEquals(
      "6dAh8h9d 6h9hAc4s 7hQh5cKd 7dTc4cKc KsJd9s6c",
      Solver.process("omaha-holdem 2c3s4dJcKh 7dTc4cKc 6h9hAc4s KsJd9s6c 7hQh5cKd 6dAh8h9d"));
  }

  @Test
  public void test_omaha_holdem_6490_6h8h9cQhQs_Ac7s5c8s_5sKd8dAd_2s4s6s3c_9d7c4h2c_Th9hTc8c() {
    assertEquals(
      "2s4s6s3c 5sKd8dAd 9d7c4h2c Ac7s5c8s Th9hTc8c",
      Solver.process("omaha-holdem 6h8h9cQhQs Ac7s5c8s 5sKd8dAd 2s4s6s3c 9d7c4h2c Th9hTc8c"));
  }

  @Test
  public void test_omaha_holdem_6491_3h6cJsKhTc_Th8h4d8s_7hTs2cAs_9h7s8d5h() {
    assertEquals(
      "9h7s8d5h Th8h4d8s 7hTs2cAs",
      Solver.process("omaha-holdem 3h6cJsKhTc Th8h4d8s 7hTs2cAs 9h7s8d5h"));
  }

  @Test
  public void test_omaha_holdem_6492_5h8h9c9hQs_4cTd5d9s_As2h4dAh_6d6cKd8c_Qd2cTs6s_AcKsJc8s_4hTc3s8d_Kh4sJs2d_9d3cJd7c_KcThQh6h() {
    assertEquals(
      "Kh4sJs2d 4hTc3s8d 6d6cKd8c AcKsJc8s Qd2cTs6s 9d3cJd7c KcThQh6h As2h4dAh 4cTd5d9s",
      Solver.process("omaha-holdem 5h8h9c9hQs 4cTd5d9s As2h4dAh 6d6cKd8c Qd2cTs6s AcKsJc8s 4hTc3s8d Kh4sJs2d 9d3cJd7c KcThQh6h"));
  }

  @Test
  public void test_omaha_holdem_6493_6c6d7hKcKd_7sAd8d9d_JsAs4hKs_3h3cAcQs_8h5h3s6s_AhTh9c5s() {
    assertEquals(
      "AhTh9c5s 3h3cAcQs 7sAd8d9d 8h5h3s6s JsAs4hKs",
      Solver.process("omaha-holdem 6c6d7hKcKd 7sAd8d9d JsAs4hKs 3h3cAcQs 8h5h3s6s AhTh9c5s"));
  }

  @Test
  public void test_omaha_holdem_6494_4d9c9hAcQd_7sQc9s6d_8c3c5dKh_Ah2sAs5s_7h9dQh2h_Ks8d8hKc_AdTs2d7c_3dJh5c7d() {
    assertEquals(
      "3dJh5c7d 8c3c5dKh Ks8d8hKc AdTs2d7c 7h9dQh2h=7sQc9s6d Ah2sAs5s",
      Solver.process("omaha-holdem 4d9c9hAcQd 7sQc9s6d 8c3c5dKh Ah2sAs5s 7h9dQh2h Ks8d8hKc AdTs2d7c 3dJh5c7d"));
  }

  @Test
  public void test_omaha_holdem_6495_5h8hJdJsKh_4d9sThAs_Kc9d7s3d_6cKsQdJc_9c6d8c4c_7c4s7h3h_JhTsQs5c_8dTdAh2s_4hQc2cKd_9h5s6h8s() {
    assertEquals(
      "4d9sThAs 9c6d8c4c 8dTdAh2s Kc9d7s3d 4hQc2cKd 7c4s7h3h 9h5s6h8s JhTsQs5c 6cKsQdJc",
      Solver.process("omaha-holdem 5h8hJdJsKh 4d9sThAs Kc9d7s3d 6cKsQdJc 9c6d8c4c 7c4s7h3h JhTsQs5c 8dTdAh2s 4hQc2cKd 9h5s6h8s"));
  }

  @Test
  public void test_omaha_holdem_6496_2c7s9dKdQh_Td8s4c3h_AsJcKs8c() {
    assertEquals(
      "Td8s4c3h AsJcKs8c",
      Solver.process("omaha-holdem 2c7s9dKdQh Td8s4c3h AsJcKs8c"));
  }

  @Test
  public void test_omaha_holdem_6497_2h4c4hAdTs_8d4d6cKh_5sJc9sKs_8h3c7s3d_Qc4s5cTd_5d9dKc2d_2cJh2s9h_6h9cKdJs() {
    assertEquals(
      "5sJc9sKs=6h9cKdJs 5d9dKc2d 8h3c7s3d 8d4d6cKh 2cJh2s9h Qc4s5cTd",
      Solver.process("omaha-holdem 2h4c4hAdTs 8d4d6cKh 5sJc9sKs 8h3c7s3d Qc4s5cTd 5d9dKc2d 2cJh2s9h 6h9cKdJs"));
  }

  @Test
  public void test_omaha_holdem_6498_3c8h9cQdQs_Qh4cTd6d_9d7c2s4s() {
    assertEquals(
      "9d7c2s4s Qh4cTd6d",
      Solver.process("omaha-holdem 3c8h9cQdQs Qh4cTd6d 9d7c2s4s"));
  }

  @Test
  public void test_omaha_holdem_6499_3h4c6hTdTs_7d2s6dTh_QcKdJhAh() {
    assertEquals(
      "QcKdJhAh 7d2s6dTh",
      Solver.process("omaha-holdem 3h4c6hTdTs 7d2s6dTh QcKdJhAh"));
  }

}
