
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver29HiddenTest {


  @Test
  public void test_omaha_holdem_7250_4h7c8sAsTs_2c6c5sTd_5h8c4sJh() {
    assertEquals(
      "5h8c4sJh 2c6c5sTd",
      Solver.process("omaha-holdem 4h7c8sAsTs 2c6c5sTd 5h8c4sJh"));
  }

  @Test
  public void test_omaha_holdem_7251_7c9hAcJhTh_6d8c4c3d_5d8hAd2h_8s2sAsKd_6sKh9cJc_Qd5hTd8d() {
    assertEquals(
      "8s2sAsKd 6sKh9cJc 6d8c4c3d Qd5hTd8d 5d8hAd2h",
      Solver.process("omaha-holdem 7c9hAcJhTh 6d8c4c3d 5d8hAd2h 8s2sAsKd 6sKh9cJc Qd5hTd8d"));
  }

  @Test
  public void test_omaha_holdem_7252_4c4d8d9c9d_6c8c7dQs_Td3hTcJs_Th6h7sTs() {
    assertEquals(
      "6c8c7dQs Td3hTcJs=Th6h7sTs",
      Solver.process("omaha-holdem 4c4d8d9c9d 6c8c7dQs Td3hTcJs Th6h7sTs"));
  }

  @Test
  public void test_omaha_holdem_7253_3c4d8d8hKd_Qs4cQc7d_As8s3h2c_KhQhJs3s() {
    assertEquals(
      "Qs4cQc7d KhQhJs3s As8s3h2c",
      Solver.process("omaha-holdem 3c4d8d8hKd Qs4cQc7d As8s3h2c KhQhJs3s"));
  }

  @Test
  public void test_omaha_holdem_7254_2c9c9hKdTc_4h9dAh6h_ThJdQsKc_6dAsQd7h_6s7dTsAd_Td2s3h3d_7c9s5dJh_4d7sKh4s() {
    assertEquals(
      "6dAsQd7h Td2s3h3d 6s7dTsAd 4d7sKh4s 7c9s5dJh 4h9dAh6h ThJdQsKc",
      Solver.process("omaha-holdem 2c9c9hKdTc 4h9dAh6h ThJdQsKc 6dAsQd7h 6s7dTsAd Td2s3h3d 7c9s5dJh 4d7sKh4s"));
  }

  @Test
  public void test_omaha_holdem_7255_2c5d8hAcKd_6d3hQc7h_8sJd5h9d_Tc3c9s7s_As6hTd4h() {
    assertEquals(
      "Tc3c9s7s 6d3hQc7h As6hTd4h 8sJd5h9d",
      Solver.process("omaha-holdem 2c5d8hAcKd 6d3hQc7h 8sJd5h9d Tc3c9s7s As6hTd4h"));
  }

  @Test
  public void test_omaha_holdem_7256_4c4d7dJdTd_2d8d6dKh_Ks6sAhQh_2h4s5dTs() {
    assertEquals(
      "Ks6sAhQh 2d8d6dKh 2h4s5dTs",
      Solver.process("omaha-holdem 4c4d7dJdTd 2d8d6dKh Ks6sAhQh 2h4s5dTs"));
  }

  @Test
  public void test_omaha_holdem_7257_4h5d6hJcTh_2h7d8d4c_9c8s5cTd_2s3sAcQh_JdAd2d9d() {
    assertEquals(
      "JdAd2d9d 9c8s5cTd 2s3sAcQh 2h7d8d4c",
      Solver.process("omaha-holdem 4h5d6hJcTh 2h7d8d4c 9c8s5cTd 2s3sAcQh JdAd2d9d"));
  }

  @Test
  public void test_omaha_holdem_7258_3s5c6h9hJd_5d6dJsQh_Th4c5s2d_Qs7sAh9s_8d5hTsJh_3cTd8sTc_2s2c8cQc_QdKhJc9c_6s7h4s8h_4hKd9d4d() {
    assertEquals(
      "2s2c8cQc 4hKd9d4d Qs7sAh9s 3cTd8sTc 8d5hTsJh 5d6dJsQh QdKhJc9c Th4c5s2d 6s7h4s8h",
      Solver.process("omaha-holdem 3s5c6h9hJd 5d6dJsQh Th4c5s2d Qs7sAh9s 8d5hTsJh 3cTd8sTc 2s2c8cQc QdKhJc9c 6s7h4s8h 4hKd9d4d"));
  }

  @Test
  public void test_omaha_holdem_7259_3d6d7h8cAh_3c6h4d6c_5d7c4s7d_Js4hJcKc_TcThQd7s_Qh3h9sQc_Ts2sTd4c_3sAcQs9d_Jd8hAsJh() {
    assertEquals(
      "TcThQd7s=Ts2sTd4c Js4hJcKc Qh3h9sQc 3sAcQs9d Jd8hAsJh 3c6h4d6c 5d7c4s7d",
      Solver.process("omaha-holdem 3d6d7h8cAh 3c6h4d6c 5d7c4s7d Js4hJcKc TcThQd7s Qh3h9sQc Ts2sTd4c 3sAcQs9d Jd8hAsJh"));
  }

  @Test
  public void test_omaha_holdem_7260_4d5sKdKsQh_3h8sJsAc_9h8c7hTc_7c9s3sAs() {
    assertEquals(
      "9h8c7hTc 7c9s3sAs 3h8sJsAc",
      Solver.process("omaha-holdem 4d5sKdKsQh 3h8sJsAc 9h8c7hTc 7c9s3sAs"));
  }

  @Test
  public void test_omaha_holdem_7261_4cAsJdKdQs_Ad9s7sKh_2cTs4sTd_7d6s6c9c() {
    assertEquals(
      "7d6s6c9c 2cTs4sTd Ad9s7sKh",
      Solver.process("omaha-holdem 4cAsJdKdQs Ad9s7sKh 2cTs4sTd 7d6s6c9c"));
  }

  @Test
  public void test_omaha_holdem_7262_4s5c6cJhJs_Ac6h5sAh_QdTh8s4c_5hJc9c2c_2hQsQc8h_Ks7hJdAd_8d3d4d3h_TcKc2s3s() {
    assertEquals(
      "8d3d4d3h QdTh8s4c 2hQsQc8h Ac6h5sAh Ks7hJdAd TcKc2s3s 5hJc9c2c",
      Solver.process("omaha-holdem 4s5c6cJhJs Ac6h5sAh QdTh8s4c 5hJc9c2c 2hQsQc8h Ks7hJdAd 8d3d4d3h TcKc2s3s"));
  }

  @Test
  public void test_omaha_holdem_7263_2h4h6sAcJh_7cAh5d8c_KsQsQc5s_9dJcTsQd_8h3h7sTd_2c3s2dKc_6c9s4c4s() {
    assertEquals(
      "9dJcTsQd KsQsQc5s 7cAh5d8c 2c3s2dKc 6c9s4c4s 8h3h7sTd",
      Solver.process("omaha-holdem 2h4h6sAcJh 7cAh5d8c KsQsQc5s 9dJcTsQd 8h3h7sTd 2c3s2dKc 6c9s4c4s"));
  }

  @Test
  public void test_omaha_holdem_7264_5h5sJhKcTc_KdJsTh9c_6d3h8s7s_7dAs7c8d() {
    assertEquals(
      "6d3h8s7s 7dAs7c8d KdJsTh9c",
      Solver.process("omaha-holdem 5h5sJhKcTc KdJsTh9c 6d3h8s7s 7dAs7c8d"));
  }

  @Test
  public void test_omaha_holdem_7265_2c2h5s6h9h_AdJdTh9s_Qs7c4s6c_7s3d3s9d_6dAhQd3h_QhTdKs7h_Qc2sKh4c_4h8c9c5d_8hJhAc3c_5hKc2dTs() {
    assertEquals(
      "Qs7c4s6c 7s3d3s9d AdJdTh9s 4h8c9c5d Qc2sKh4c 8hJhAc3c QhTdKs7h 6dAhQd3h 5hKc2dTs",
      Solver.process("omaha-holdem 2c2h5s6h9h AdJdTh9s Qs7c4s6c 7s3d3s9d 6dAhQd3h QhTdKs7h Qc2sKh4c 4h8c9c5d 8hJhAc3c 5hKc2dTs"));
  }

  @Test
  public void test_omaha_holdem_7266_3s5h7d8dQd_7h3d2h6c_5sQc7c6d_2c2s4s8s_6sJsKs9d_AcTcTsAh_4hQsAs4c_6h8h5d7s_KcQh9cTh() {
    assertEquals(
      "2c2s4s8s KcQh9cTh 4hQsAs4c AcTcTsAh 7h3d2h6c 6h8h5d7s 5sQc7c6d 6sJsKs9d",
      Solver.process("omaha-holdem 3s5h7d8dQd 7h3d2h6c 5sQc7c6d 2c2s4s8s 6sJsKs9d AcTcTsAh 4hQsAs4c 6h8h5d7s KcQh9cTh"));
  }

  @Test
  public void test_omaha_holdem_7267_8dAcJcKcQd_QsTsAh2d_6h7hAd6s_8cTd8s7d() {
    assertEquals(
      "6h7hAd6s 8cTd8s7d QsTsAh2d",
      Solver.process("omaha-holdem 8dAcJcKcQd QsTsAh2d 6h7hAd6s 8cTd8s7d"));
  }

  @Test
  public void test_omaha_holdem_7268_4h7c7h8dJd_9sKd2sQh_6c8s7d3s_KsQc8c2c_4cTd6hAh_2h4s4dJh_Tc9d7s9c_5sQsQdTs_9hKc6s8h() {
    assertEquals(
      "9sKd2sQh 4cTd6hAh 9hKc6s8h=KsQc8c2c 5sQsQdTs Tc9d7s9c 2h4s4dJh 6c8s7d3s",
      Solver.process("omaha-holdem 4h7c7h8dJd 9sKd2sQh 6c8s7d3s KsQc8c2c 4cTd6hAh 2h4s4dJh Tc9d7s9c 5sQsQdTs 9hKc6s8h"));
  }

  @Test
  public void test_omaha_holdem_7269_3s4c5s9dKs_ThAs7s5c_5d8hAh6h_4hQd9h2c_Qh2sQc7h_TdAc3cJs_Jh4s9cTc_8s2h5hKd_3d3h8c8d_6dTs6c7c() {
    assertEquals(
      "TdAc3cJs 5d8hAh6h Qh2sQc7h 4hQd9h2c=Jh4s9cTc 8s2h5hKd 3d3h8c8d 6dTs6c7c ThAs7s5c",
      Solver.process("omaha-holdem 3s4c5s9dKs ThAs7s5c 5d8hAh6h 4hQd9h2c Qh2sQc7h TdAc3cJs Jh4s9cTc 8s2h5hKd 3d3h8c8d 6dTs6c7c"));
  }

  @Test
  public void test_omaha_holdem_7270_5h8sAcJsTd_2d2hJcTs_Kc8hQc3h_6dQd4d4c_5c5dAhKd_7h2c4s3s_9d3c8d6c_ThQhJh4h_8cAs6sTc_Ad9c7dQs() {
    assertEquals(
      "7h2c4s3s 6dQd4d4c 9d3c8d6c 2d2hJcTs=ThQhJh4h 8cAs6sTc 5c5dAhKd Ad9c7dQs Kc8hQc3h",
      Solver.process("omaha-holdem 5h8sAcJsTd 2d2hJcTs Kc8hQc3h 6dQd4d4c 5c5dAhKd 7h2c4s3s 9d3c8d6c ThQhJh4h 8cAs6sTc Ad9c7dQs"));
  }

  @Test
  public void test_omaha_holdem_7271_6c7c7sJcTd_2dKs9d5c_9h2c5d9s_AdJhAhKc_4h6hAc3d_6dThAs6s_8s7dTcQd_3cKd4s9c() {
    assertEquals(
      "2dKs9d5c 4h6hAc3d 9h2c5d9s AdJhAhKc 3cKd4s9c 6dThAs6s 8s7dTcQd",
      Solver.process("omaha-holdem 6c7c7sJcTd 2dKs9d5c 9h2c5d9s AdJhAhKc 4h6hAc3d 6dThAs6s 8s7dTcQd 3cKd4s9c"));
  }

  @Test
  public void test_omaha_holdem_7272_3s4s5c7dJs_AsTs3c2c_Qh5s8dKc_4dTcAh2d_3dTh2s3h() {
    assertEquals(
      "Qh5s8dKc 3dTh2s3h 4dTcAh2d AsTs3c2c",
      Solver.process("omaha-holdem 3s4s5c7dJs AsTs3c2c Qh5s8dKc 4dTcAh2d 3dTh2s3h"));
  }

  @Test
  public void test_omaha_holdem_7273_2d6h9dAsQd_4d4c6s5c_Kd2c3hKc_Ts5hTh4h() {
    assertEquals(
      "4d4c6s5c Ts5hTh4h Kd2c3hKc",
      Solver.process("omaha-holdem 2d6h9dAsQd 4d4c6s5c Kd2c3hKc Ts5hTh4h"));
  }

  @Test
  public void test_omaha_holdem_7274_9dAdAsJdQh_TsTc4s5s_8c4h6d2h_Kc2s4d9s() {
    assertEquals(
      "8c4h6d2h Kc2s4d9s TsTc4s5s",
      Solver.process("omaha-holdem 9dAdAsJdQh TsTc4s5s 8c4h6d2h Kc2s4d9s"));
  }

  @Test
  public void test_omaha_holdem_7275_3h5d9hAcJc_AhThKs6s_8h2dKh7c_5h4hTc5c_6h6c9s7h_2sJsAdTs_3dTd4sQs_3sQc2c3c_JhKd8c4d_2h7s8sJd() {
    assertEquals(
      "8h2dKh7c 3dTd4sQs 6h6c9s7h 2h7s8sJd JhKd8c4d AhThKs6s 2sJsAdTs 3sQc2c3c 5h4hTc5c",
      Solver.process("omaha-holdem 3h5d9hAcJc AhThKs6s 8h2dKh7c 5h4hTc5c 6h6c9s7h 2sJsAdTs 3dTd4sQs 3sQc2c3c JhKd8c4d 2h7s8sJd"));
  }

  @Test
  public void test_omaha_holdem_7276_2c2d3c8sTh_Ah8c9d9s_Tc8hJdQc() {
    assertEquals(
      "Ah8c9d9s Tc8hJdQc",
      Solver.process("omaha-holdem 2c2d3c8sTh Ah8c9d9s Tc8hJdQc"));
  }

  @Test
  public void test_omaha_holdem_7277_4d7hJdKcTd_Js6s6d5c_8sKs7d2d_7s4c8h4h() {
    assertEquals(
      "Js6s6d5c 7s4c8h4h 8sKs7d2d",
      Solver.process("omaha-holdem 4d7hJdKcTd Js6s6d5c 8sKs7d2d 7s4c8h4h"));
  }

  @Test
  public void test_omaha_holdem_7278_5d6h8c9hTd_Th4hKdQd_5s2hAdKs_TcJd5c2d_Kc9c3c2s_7sAh4s8s_7c3h5h2c_4dQhTs6c() {
    assertEquals(
      "5s2hAdKs Kc9c3c2s Th4hKdQd TcJd5c2d 4dQhTs6c 7c3h5h2c 7sAh4s8s",
      Solver.process("omaha-holdem 5d6h8c9hTd Th4hKdQd 5s2hAdKs TcJd5c2d Kc9c3c2s 7sAh4s8s 7c3h5h2c 4dQhTs6c"));
  }

  @Test
  public void test_omaha_holdem_7279_5cAsJhKcTd_4c3c9d8d_6h2h6sJd() {
    assertEquals(
      "4c3c9d8d 6h2h6sJd",
      Solver.process("omaha-holdem 5cAsJhKcTd 4c3c9d8d 6h2h6sJd"));
  }

  @Test
  public void test_omaha_holdem_7280_2h4h7d9cJd_3sQsKhTh_4c8c6s4s_2d6cQhKc_3cAd2sTs_Jh9d3dQc_3h2cQd7h_8dJs8sAs_Ac5c5dKd() {
    assertEquals(
      "3sQsKhTh 2d6cQhKc 3cAd2sTs Ac5c5dKd 8dJs8sAs 3h2cQd7h Jh9d3dQc 4c8c6s4s",
      Solver.process("omaha-holdem 2h4h7d9cJd 3sQsKhTh 4c8c6s4s 2d6cQhKc 3cAd2sTs Jh9d3dQc 3h2cQd7h 8dJs8sAs Ac5c5dKd"));
  }

  @Test
  public void test_omaha_holdem_7281_2c6c7h7sJc_9c7c8cAh_4sKs4h5h_2hQd4cAd_8sJdQh6s_8h6hAsKc_3sTcJs3h_3c6dKh2d_9s9hJh5d() {
    assertEquals(
      "2hQd4cAd 4sKs4h5h 3c6dKh2d 8h6hAsKc 9s9hJh5d 3sTcJs3h 8sJdQh6s 9c7c8cAh",
      Solver.process("omaha-holdem 2c6c7h7sJc 9c7c8cAh 4sKs4h5h 2hQd4cAd 8sJdQh6s 8h6hAsKc 3sTcJs3h 3c6dKh2d 9s9hJh5d"));
  }

  @Test
  public void test_omaha_holdem_7282_2d2h4s5sJd_9h7s3dJh_2s5h8d9d_8cAsQd3s_5d9cKsTd_8h6dTh3c_3hJcAhKc_4d7c9sJs_4hTsAc6c_KhKdTcQs() {
    assertEquals(
      "4hTsAc6c 5d9cKsTd 9h7s3dJh 4d7c9sJs KhKdTcQs 3hJcAhKc=8cAsQd3s 8h6dTh3c 2s5h8d9d",
      Solver.process("omaha-holdem 2d2h4s5sJd 9h7s3dJh 2s5h8d9d 8cAsQd3s 5d9cKsTd 8h6dTh3c 3hJcAhKc 4d7c9sJs 4hTsAc6c KhKdTcQs"));
  }

  @Test
  public void test_omaha_holdem_7283_2d7c7d7hQs_QdAd9h8c_9c6s4s4c_QcTs3d8d_JhTdTh2s_Ac5sKd6c_8hAsKc5d_6h3c2c4h_Kh4dJs6d() {
    assertEquals(
      "6h3c2c4h QcTs3d8d Kh4dJs6d QdAd9h8c 8hAsKc5d=Ac5sKd6c 9c6s4s4c JhTdTh2s",
      Solver.process("omaha-holdem 2d7c7d7hQs QdAd9h8c 9c6s4s4c QcTs3d8d JhTdTh2s Ac5sKd6c 8hAsKc5d 6h3c2c4h Kh4dJs6d"));
  }

  @Test
  public void test_omaha_holdem_7284_3d5d8dJsQc_Jh7h8c5c_6d4hKd7c_2h6h6sKh_6cAc3hTc_Ks9hJcJd_QdTs4sAd_AhKcQh2s_7d3c2cAs_8h5h7s3s() {
    assertEquals(
      "6cAc3hTc=7d3c2cAs 2h6h6sKh AhKcQh2s 8h5h7s3s Jh7h8c5c Ks9hJcJd 6d4hKd7c QdTs4sAd",
      Solver.process("omaha-holdem 3d5d8dJsQc Jh7h8c5c 6d4hKd7c 2h6h6sKh 6cAc3hTc Ks9hJcJd QdTs4sAd AhKcQh2s 7d3c2cAs 8h5h7s3s"));
  }

  @Test
  public void test_omaha_holdem_7285_2s8sJcJdQc_5s8d7sAh_Tc6cKc9c_TdKhJs9s_5d9d7d6h_Qs7cJhTh() {
    assertEquals(
      "5d9d7d6h 5s8d7sAh Tc6cKc9c=TdKhJs9s Qs7cJhTh",
      Solver.process("omaha-holdem 2s8sJcJdQc 5s8d7sAh Tc6cKc9c TdKhJs9s 5d9d7d6h Qs7cJhTh"));
  }

  @Test
  public void test_omaha_holdem_7286_5c7d9cKdTh_JdAh3cQd_TcJc7h3h_4dQhTdTs_6hKhQs7s_2c6d9h2d_Jh6c8dQc_3s4s2h6s_9dKcAc5d() {
    assertEquals(
      "3s4s2h6s 2c6d9h2d TcJc7h3h 6hKhQs7s 9dKcAc5d 4dQhTdTs JdAh3cQd=Jh6c8dQc",
      Solver.process("omaha-holdem 5c7d9cKdTh JdAh3cQd TcJc7h3h 4dQhTdTs 6hKhQs7s 2c6d9h2d Jh6c8dQc 3s4s2h6s 9dKcAc5d"));
  }

  @Test
  public void test_omaha_holdem_7287_4d6dAcKdQh_3c3d2h8s_Ks9h2c5s() {
    assertEquals(
      "3c3d2h8s Ks9h2c5s",
      Solver.process("omaha-holdem 4d6dAcKdQh 3c3d2h8s Ks9h2c5s"));
  }

  @Test
  public void test_omaha_holdem_7288_2c3s6h7hTd_7c9c5h3d_4s8c5sAs_JsKcTc2s_Ks9d8sQh_ThAcKdJd_Kh7sJc9s() {
    assertEquals(
      "Kh7sJc9s ThAcKdJd 7c9c5h3d JsKcTc2s 4s8c5sAs Ks9d8sQh",
      Solver.process("omaha-holdem 2c3s6h7hTd 7c9c5h3d 4s8c5sAs JsKcTc2s Ks9d8sQh ThAcKdJd Kh7sJc9s"));
  }

  @Test
  public void test_omaha_holdem_7289_2c3dJdKdTd_Jc2dAs4h_8s3h8hAd_7dQcAh7h_4s3s9h9d_5dKs6sQs() {
    assertEquals(
      "8s3h8hAd 4s3s9h9d 5dKs6sQs Jc2dAs4h 7dQcAh7h",
      Solver.process("omaha-holdem 2c3dJdKdTd Jc2dAs4h 8s3h8hAd 7dQcAh7h 4s3s9h9d 5dKs6sQs"));
  }

  @Test
  public void test_omaha_holdem_7290_2s3s6d7hKh_7cAd8c4h_9h9d6c2h_KdAs9cQc_QhJdTsKs_Jh8s3cAh_Ac8d4cKc_4s9s5s6s_2c3h7s8h() {
    assertEquals(
      "Jh8s3cAh 7cAd8c4h QhJdTsKs Ac8d4cKc=KdAs9cQc 9h9d6c2h 2c3h7s8h 4s9s5s6s",
      Solver.process("omaha-holdem 2s3s6d7hKh 7cAd8c4h 9h9d6c2h KdAs9cQc QhJdTsKs Jh8s3cAh Ac8d4cKc 4s9s5s6s 2c3h7s8h"));
  }

  @Test
  public void test_omaha_holdem_7291_6c6h8c8d9c_3sAhJsAc_6d4d9d4c_5d6s8h3d_QhQs4hTd_2cJh7d8s_5cTc5hQd_Jc2s9sKs_Kc5sAsQc() {
    assertEquals(
      "Jc2s9sKs QhQs4hTd 3sAhJsAc 2cJh7d8s 5cTc5hQd Kc5sAsQc 6d4d9d4c 5d6s8h3d",
      Solver.process("omaha-holdem 6c6h8c8d9c 3sAhJsAc 6d4d9d4c 5d6s8h3d QhQs4hTd 2cJh7d8s 5cTc5hQd Jc2s9sKs Kc5sAsQc"));
  }

  @Test
  public void test_omaha_holdem_7292_3c4s6c6sTh_JhTc8cTs_7s5h2sKd_7c2cAs8s() {
    assertEquals(
      "7c2cAs8s 7s5h2sKd JhTc8cTs",
      Solver.process("omaha-holdem 3c4s6c6sTh JhTc8cTs 7s5h2sKd 7c2cAs8s"));
  }

  @Test
  public void test_omaha_holdem_7293_2s5d8cKdTs_7c8s9s9d_2h5sTd8d_9hAd3d5c_2d5h4s6d_6h7s3hAc_Jd8hQc4d() {
    assertEquals(
      "6h7s3hAc 9hAd3d5c Jd8hQc4d 7c8s9s9d 2d5h4s6d 2h5sTd8d",
      Solver.process("omaha-holdem 2s5d8cKdTs 7c8s9s9d 2h5sTd8d 9hAd3d5c 2d5h4s6d 6h7s3hAc Jd8hQc4d"));
  }

  @Test
  public void test_omaha_holdem_7294_2h3d4hKsQs_QhJcAh8h_Kd7sTsJs_2s2d5s3h_8dKc2c9h_6d7h3c9s() {
    assertEquals(
      "6d7h3c9s QhJcAh8h Kd7sTsJs 8dKc2c9h 2s2d5s3h",
      Solver.process("omaha-holdem 2h3d4hKsQs QhJcAh8h Kd7sTsJs 2s2d5s3h 8dKc2c9h 6d7h3c9s"));
  }

  @Test
  public void test_omaha_holdem_7295_2s6h6s9dKh_5cTs9cJc_8dAsTc8s_JsKd3d7s_Ks9h5s2c() {
    assertEquals(
      "8dAsTc8s 5cTs9cJc JsKd3d7s Ks9h5s2c",
      Solver.process("omaha-holdem 2s6h6s9dKh 5cTs9cJc 8dAsTc8s JsKd3d7s Ks9h5s2c"));
  }

  @Test
  public void test_omaha_holdem_7296_5c6dKhQhTc_Kc4hTd2d_9hTs5sQd() {
    assertEquals(
      "9hTs5sQd Kc4hTd2d",
      Solver.process("omaha-holdem 5c6dKhQhTc Kc4hTd2d 9hTs5sQd"));
  }

  @Test
  public void test_omaha_holdem_7297_3h5hAcJdJh_3c7s5d5c_4hTdAhQd_8h4s8cTh_Qs6h9hTs_3s2d2sQh_7d6c9cKc_7cKdAdAs_8sKhQc5s() {
    assertEquals(
      "7d6c9cKc 3s2d2sQh 8sKhQc5s Qs6h9hTs 8h4s8cTh 4hTdAhQd 3c7s5d5c 7cKdAdAs",
      Solver.process("omaha-holdem 3h5hAcJdJh 3c7s5d5c 4hTdAhQd 8h4s8cTh Qs6h9hTs 3s2d2sQh 7d6c9cKc 7cKdAdAs 8sKhQc5s"));
  }

  @Test
  public void test_omaha_holdem_7298_5h7sAsJcQc_9c5d2cAc_TcKh3d4c_3hQh8hJs_3c4sAdJh_2hAh7h5c_8d8s4dQd_8cKsTs6c() {
    assertEquals(
      "8d8s4dQd 3hQh8hJs 9c5d2cAc 2hAh7h5c 3c4sAdJh 8cKsTs6c=TcKh3d4c",
      Solver.process("omaha-holdem 5h7sAsJcQc 9c5d2cAc TcKh3d4c 3hQh8hJs 3c4sAdJh 2hAh7h5c 8d8s4dQd 8cKsTs6c"));
  }

  @Test
  public void test_omaha_holdem_7299_2d6d7hJdJs_4d7c7sQd_Ac8dKh3c() {
    assertEquals(
      "Ac8dKh3c 4d7c7sQd",
      Solver.process("omaha-holdem 2d6d7hJdJs 4d7c7sQd Ac8dKh3c"));
  }

  @Test
  public void test_omaha_holdem_7300_4d5d9dAcJh_3s2sQh9s_Tc8h3dKc() {
    assertEquals(
      "Tc8h3dKc 3s2sQh9s",
      Solver.process("omaha-holdem 4d5d9dAcJh 3s2sQh9s Tc8h3dKc"));
  }

  @Test
  public void test_omaha_holdem_7301_6c6dAhAsTc_KdJd8sTh_Jc8dQh5c_Ad8hKc6s_9h9cKhKs_5h9s7h7d() {
    assertEquals(
      "Jc8dQh5c 5h9s7h7d KdJd8sTh 9h9cKhKs Ad8hKc6s",
      Solver.process("omaha-holdem 6c6dAhAsTc KdJd8sTh Jc8dQh5c Ad8hKc6s 9h9cKhKs 5h9s7h7d"));
  }

  @Test
  public void test_omaha_holdem_7302_6s7c7dJhKc_2h8sQc4d_2c4c9c5h_KhQhTs3s() {
    assertEquals(
      "2c4c9c5h 2h8sQc4d KhQhTs3s",
      Solver.process("omaha-holdem 6s7c7dJhKc 2h8sQc4d 2c4c9c5h KhQhTs3s"));
  }

  @Test
  public void test_omaha_holdem_7303_6s8h8sAdAs_6h7h4dTs_JcAc7c3s_2c3c2h8d_Qh5cTdAh_4s5dKsKh_4c2d7d2s_5h4h9d6c_QdKc6dJd() {
    assertEquals(
      "4c2d7d2s 5h4h9d6c 6h7h4dTs QdKc6dJd 2c3c2h8d JcAc7c3s Qh5cTdAh 4s5dKsKh",
      Solver.process("omaha-holdem 6s8h8sAdAs 6h7h4dTs JcAc7c3s 2c3c2h8d Qh5cTdAh 4s5dKsKh 4c2d7d2s 5h4h9d6c QdKc6dJd"));
  }

  @Test
  public void test_omaha_holdem_7304_3s6c8c9cAh_Kh2sAdKs_3cJh4d5c_Jd8s5d4c() {
    assertEquals(
      "Jd8s5d4c Kh2sAdKs 3cJh4d5c",
      Solver.process("omaha-holdem 3s6c8c9cAh Kh2sAdKs 3cJh4d5c Jd8s5d4c"));
  }

  @Test
  public void test_omaha_holdem_7305_2c4c4s8d8s_QsJhAs6c_Ad4d9cTd_6s9h7cQc_6h3d3cAh_JcTcKc5d_Kd5s5cTh_Qh5hTs9d() {
    assertEquals(
      "6s9h7cQc Qh5hTs9d JcTcKc5d QsJhAs6c 6h3d3cAh Kd5s5cTh Ad4d9cTd",
      Solver.process("omaha-holdem 2c4c4s8d8s QsJhAs6c Ad4d9cTd 6s9h7cQc 6h3d3cAh JcTcKc5d Kd5s5cTh Qh5hTs9d"));
  }

  @Test
  public void test_omaha_holdem_7306_6c6h8dAdTh_6s9sJd2h_7cAs2cAc_8hTs9dQs_Ks8c4dQc_8s6d3cTc_5d5s2s9c_4h2d7d3d() {
    assertEquals(
      "4h2d7d3d 5d5s2s9c Ks8c4dQc 8hTs9dQs 6s9sJd2h 8s6d3cTc 7cAs2cAc",
      Solver.process("omaha-holdem 6c6h8dAdTh 6s9sJd2h 7cAs2cAc 8hTs9dQs Ks8c4dQc 8s6d3cTc 5d5s2s9c 4h2d7d3d"));
  }

  @Test
  public void test_omaha_holdem_7307_2c3d7h7s9h_Ks9cTc3c_Jd8d7d6d_6sAc7cTd() {
    assertEquals(
      "Ks9cTc3c Jd8d7d6d 6sAc7cTd",
      Solver.process("omaha-holdem 2c3d7h7s9h Ks9cTc3c Jd8d7d6d 6sAc7cTd"));
  }

  @Test
  public void test_omaha_holdem_7308_3c3s9sKsTd_2c2sKh3d_7h3hJcTs_4s9d5sAs_8d6hQh6d_6s5d9c4h_2d6c8h8s_Ad7c2hAh() {
    assertEquals(
      "8d6hQh6d 2d6c8h8s 6s5d9c4h Ad7c2hAh 4s9d5sAs 7h3hJcTs 2c2sKh3d",
      Solver.process("omaha-holdem 3c3s9sKsTd 2c2sKh3d 7h3hJcTs 4s9d5sAs 8d6hQh6d 6s5d9c4h 2d6c8h8s Ad7c2hAh"));
  }

  @Test
  public void test_omaha_holdem_7309_2h3h6h7h8d_5h3sTc5s_4dQcKd8c_AhAdThKc_6s4s9c3d() {
    assertEquals(
      "5h3sTc5s 4dQcKd8c 6s4s9c3d AhAdThKc",
      Solver.process("omaha-holdem 2h3h6h7h8d 5h3sTc5s 4dQcKd8c AhAdThKc 6s4s9c3d"));
  }

  @Test
  public void test_omaha_holdem_7310_2dAsJdQsTh_2c3d5d4c_5s8d9c4h_5hQh3h9s_Tc7c6hQd_QcKsJhKd_3sJc7h6d_8sKc3cTs_4s7s6sAh_5c8cAcTd() {
    assertEquals(
      "2c3d5d4c 3sJc7h6d 5hQh3h9s 4s7s6sAh Tc7c6hQd 5c8cAcTd 5s8d9c4h 8sKc3cTs=QcKsJhKd",
      Solver.process("omaha-holdem 2dAsJdQsTh 2c3d5d4c 5s8d9c4h 5hQh3h9s Tc7c6hQd QcKsJhKd 3sJc7h6d 8sKc3cTs 4s7s6sAh 5c8cAcTd"));
  }

  @Test
  public void test_omaha_holdem_7311_5h5s8c9hJh_7h9dAd5c_2h7d9sTc_3c8s2d6h_KdQdKcJc() {
    assertEquals(
      "3c8s2d6h KdQdKcJc 2h7d9sTc 7h9dAd5c",
      Solver.process("omaha-holdem 5h5s8c9hJh 7h9dAd5c 2h7d9sTc 3c8s2d6h KdQdKcJc"));
  }

  @Test
  public void test_omaha_holdem_7312_5h6c8dAhTh_2h9cKh2d_7cTs3d9h() {
    assertEquals(
      "7cTs3d9h 2h9cKh2d",
      Solver.process("omaha-holdem 5h6c8dAhTh 2h9cKh2d 7cTs3d9h"));
  }

  @Test
  public void test_omaha_holdem_7313_4c4s5d8cJs_4dAd9dTd_2h2s5hJh_9s3hAs6d_7h6s3c2c_9c7d9hKd_3dAh4hAc() {
    assertEquals(
      "9s3hAs6d 9c7d9hKd 2h2s5hJh 3dAh4hAc=4dAd9dTd 7h6s3c2c",
      Solver.process("omaha-holdem 4c4s5d8cJs 4dAd9dTd 2h2s5hJh 9s3hAs6d 7h6s3c2c 9c7d9hKd 3dAh4hAc"));
  }

  @Test
  public void test_omaha_holdem_7314_8c8s9dAcTh_3cQd5s2d_7s6d6c7h_3d7d5d4d_5c4h2s9c_3h4c7cJc_JsTcAs6s_8h6h2hQs_KdKhTs2c() {
    assertEquals(
      "3d7d5d4d 3cQd5s2d 5c4h2s9c KdKhTs2c JsTcAs6s 8h6h2hQs 7s6d6c7h 3h4c7cJc",
      Solver.process("omaha-holdem 8c8s9dAcTh 3cQd5s2d 7s6d6c7h 3d7d5d4d 5c4h2s9c 3h4c7cJc JsTcAs6s 8h6h2hQs KdKhTs2c"));
  }

  @Test
  public void test_omaha_holdem_7315_9sAcAdJdKh_ThAh7h5c_4h8c7s5s_Ks8s4c2h_6h2sKcQc_3hTd7dJh() {
    assertEquals(
      "4h8c7s5s 3hTd7dJh Ks8s4c2h 6h2sKcQc ThAh7h5c",
      Solver.process("omaha-holdem 9sAcAdJdKh ThAh7h5c 4h8c7s5s Ks8s4c2h 6h2sKcQc 3hTd7dJh"));
  }

  @Test
  public void test_omaha_holdem_7316_3c7d7hJcKh_5dJs8cQd_6h4sQs8d_AcKs2c4d_Qh9d2sKc_6d9hAdTd_4c3hAhAs_Jh6c5h5s_ThJdKdTc_Qc2h7c9c() {
    assertEquals(
      "6h4sQs8d 6d9hAdTd Jh6c5h5s 5dJs8cQd Qh9d2sKc AcKs2c4d ThJdKdTc 4c3hAhAs Qc2h7c9c",
      Solver.process("omaha-holdem 3c7d7hJcKh 5dJs8cQd 6h4sQs8d AcKs2c4d Qh9d2sKc 6d9hAdTd 4c3hAhAs Jh6c5h5s ThJdKdTc Qc2h7c9c"));
  }

  @Test
  public void test_omaha_holdem_7317_5c5s7cJsKd_Ts2sJd6s_Ad5dQc9d_6h2cKc4c_KhTd7hJh_8h9cQh4h_8dAcAhQd_3h7dQs3s_7s8c6d5h() {
    assertEquals(
      "8h9cQh4h 3h7dQs3s Ts2sJd6s 6h2cKc4c KhTd7hJh 8dAcAhQd Ad5dQc9d 7s8c6d5h",
      Solver.process("omaha-holdem 5c5s7cJsKd Ts2sJd6s Ad5dQc9d 6h2cKc4c KhTd7hJh 8h9cQh4h 8dAcAhQd 3h7dQs3s 7s8c6d5h"));
  }

  @Test
  public void test_omaha_holdem_7318_3s6c7d8hAh_Kh3d5sQd_QsQh7c9d_8s2hKcQc_7s6h4d4c_Ks2d9c4h_As9sTsTc_Jd9hThAc() {
    assertEquals(
      "Ks2d9c4h Kh3d5sQd 8s2hKcQc QsQh7c9d 7s6h4d4c As9sTsTc=Jd9hThAc",
      Solver.process("omaha-holdem 3s6c7d8hAh Kh3d5sQd QsQh7c9d 8s2hKcQc 7s6h4d4c Ks2d9c4h As9sTsTc Jd9hThAc"));
  }

  @Test
  public void test_omaha_holdem_7319_4s7s8c9cJc_Jd9hKc7c_5hTc6hAd_Qh3c6cJh_2cTd5dKd_2s3h6d7h_QsQdQc5s_Js5c8h4c() {
    assertEquals(
      "2cTd5dKd 2s3h6d7h QsQdQc5s 5hTc6hAd Js5c8h4c Qh3c6cJh Jd9hKc7c",
      Solver.process("omaha-holdem 4s7s8c9cJc Jd9hKc7c 5hTc6hAd Qh3c6cJh 2cTd5dKd 2s3h6d7h QsQdQc5s Js5c8h4c"));
  }

  @Test
  public void test_omaha_holdem_7320_5s6s9hJcKh_4h7d6c7c_Tc5c4dJh_8s4cAh6h_2c5d6d3d() {
    assertEquals(
      "8s4cAh6h 4h7d6c7c 2c5d6d3d Tc5c4dJh",
      Solver.process("omaha-holdem 5s6s9hJcKh 4h7d6c7c Tc5c4dJh 8s4cAh6h 2c5d6d3d"));
  }

  @Test
  public void test_omaha_holdem_7321_2h2sJdJsTh_KsJh8sAh_2dAc4c9s_KdKcQcQd_3s4sTc8h_8d5dAsTs_7hAd6d9d_7s6hQs7c_9h3c7dTd_4dKh6cQh() {
    assertEquals(
      "4dKh6cQh 7hAd6d9d 7s6hQs7c 3s4sTc8h 9h3c7dTd 8d5dAsTs KdKcQcQd 2dAc4c9s KsJh8sAh",
      Solver.process("omaha-holdem 2h2sJdJsTh KsJh8sAh 2dAc4c9s KdKcQcQd 3s4sTc8h 8d5dAsTs 7hAd6d9d 7s6hQs7c 9h3c7dTd 4dKh6cQh"));
  }

  @Test
  public void test_omaha_holdem_7322_6hJhKcKhTd_9d7sQsJs_6c3h3d8h_Qc5d2d5s_2h6sAd7h_AsQh8dTh_5h8s2c4c() {
    assertEquals(
      "5h8s2c4c Qc5d2d5s 9d7sQsJs 2h6sAd7h 6c3h3d8h AsQh8dTh",
      Solver.process("omaha-holdem 6hJhKcKhTd 9d7sQsJs 6c3h3d8h Qc5d2d5s 2h6sAd7h AsQh8dTh 5h8s2c4c"));
  }

  @Test
  public void test_omaha_holdem_7323_5h6h8sAdQh_6c4hQc5c_ThQd8d6s_Td3dJh7c_2hKcAcKs() {
    assertEquals(
      "Td3dJh7c 2hKcAcKs 6c4hQc5c ThQd8d6s",
      Solver.process("omaha-holdem 5h6h8sAdQh 6c4hQc5c ThQd8d6s Td3dJh7c 2hKcAcKs"));
  }

  @Test
  public void test_omaha_holdem_7324_2c3c7d7s8s_Jh7h5sAc_4h4s4d7c_5h3hKcQc_KsAdQs6c_Kd2sTd9h_6s8h9sKh_6dAh8c9c_3sJdJcAs_9dTs2d6h() {
    assertEquals(
      "KsAdQs6c 9dTs2d6h Kd2sTd9h 5h3hKcQc 6s8h9sKh 6dAh8c9c 3sJdJcAs 4h4s4d7c Jh7h5sAc",
      Solver.process("omaha-holdem 2c3c7d7s8s Jh7h5sAc 4h4s4d7c 5h3hKcQc KsAdQs6c Kd2sTd9h 6s8h9sKh 6dAh8c9c 3sJdJcAs 9dTs2d6h"));
  }

  @Test
  public void test_omaha_holdem_7325_4h6s9cJcJh_9hQc2c8s_Js6d3d7h_As5hKd3c_6cJd4c7s_KhQs8d2d_2hQh4d8c_Tc9s5cAc_TdKcAdQd_Ah3sTs5d() {
    assertEquals(
      "KhQs8d2d Ah3sTs5d As5hKd3c=TdKcAdQd 2hQh4d8c 9hQc2c8s Tc9s5cAc 6cJd4c7s=Js6d3d7h",
      Solver.process("omaha-holdem 4h6s9cJcJh 9hQc2c8s Js6d3d7h As5hKd3c 6cJd4c7s KhQs8d2d 2hQh4d8c Tc9s5cAc TdKcAdQd Ah3sTs5d"));
  }

  @Test
  public void test_omaha_holdem_7326_2c2h3dJcTc_2dQc2sQs_6hKcTs9s_Kd9dThJh() {
    assertEquals(
      "6hKcTs9s Kd9dThJh 2dQc2sQs",
      Solver.process("omaha-holdem 2c2h3dJcTc 2dQc2sQs 6hKcTs9s Kd9dThJh"));
  }

  @Test
  public void test_omaha_holdem_7327_5h5s7h8sQs_4d7cTs6d_Js9cTc4c_AsAh9s4s_5c3s3h8d_7dQc3c4h() {
    assertEquals(
      "Js9cTc4c 7dQc3c4h 4d7cTs6d AsAh9s4s 5c3s3h8d",
      Solver.process("omaha-holdem 5h5s7h8sQs 4d7cTs6d Js9cTc4c AsAh9s4s 5c3s3h8d 7dQc3c4h"));
  }

  @Test
  public void test_omaha_holdem_7328_5d6h9hKcKd_6s9d7d9c_2dKh7hQc_5c2c3h8h_9sQh4c3c_AsJc7sKs_7c4h8sTs_8dJd6dAc_5hThAh4d() {
    assertEquals(
      "5c2c3h8h 5hThAh4d 8dJd6dAc 9sQh4c3c 2dKh7hQc AsJc7sKs 7c4h8sTs 6s9d7d9c",
      Solver.process("omaha-holdem 5d6h9hKcKd 6s9d7d9c 2dKh7hQc 5c2c3h8h 9sQh4c3c AsJc7sKs 7c4h8sTs 8dJd6dAc 5hThAh4d"));
  }

  @Test
  public void test_omaha_holdem_7329_5h8dQdTdTh_7s5s3s5d_Js8c4s9d_AhAdQs9c_7c7d4h2d_2hTc6sAs_3cJh6dKh() {
    assertEquals(
      "3cJh6dKh AhAdQs9c 2hTc6sAs Js8c4s9d 7c7d4h2d 7s5s3s5d",
      Solver.process("omaha-holdem 5h8dQdTdTh 7s5s3s5d Js8c4s9d AhAdQs9c 7c7d4h2d 2hTc6sAs 3cJh6dKh"));
  }

  @Test
  public void test_omaha_holdem_7330_6d7c8dAhQh_JcQs3sAs_3h8hKh9h_2c7hKc2d() {
    assertEquals(
      "2c7hKc2d 3h8hKh9h JcQs3sAs",
      Solver.process("omaha-holdem 6d7c8dAhQh JcQs3sAs 3h8hKh9h 2c7hKc2d"));
  }

  @Test
  public void test_omaha_holdem_7331_2s4d6sAhJc_KhQc9s6c_5sTd9h4h_3hAd6dTc_Js8h2c8d_Qd3dKcQh_Ks5c5dTs() {
    assertEquals(
      "5sTd9h4h Ks5c5dTs KhQc9s6c Qd3dKcQh Js8h2c8d 3hAd6dTc",
      Solver.process("omaha-holdem 2s4d6sAhJc KhQc9s6c 5sTd9h4h 3hAd6dTc Js8h2c8d Qd3dKcQh Ks5c5dTs"));
  }

  @Test
  public void test_omaha_holdem_7332_3c4d6hJcQs_6s8d2sKs_6d2h7hTd_8s2dJsKd_TsAsQc4c_JhKh3s5h_Th4s8h5s_Tc7d5d6c() {
    assertEquals(
      "Th4s8h5s 6d2h7hTd 6s8d2sKs 8s2dJsKd JhKh3s5h TsAsQc4c Tc7d5d6c",
      Solver.process("omaha-holdem 3c4d6hJcQs 6s8d2sKs 6d2h7hTd 8s2dJsKd TsAsQc4c JhKh3s5h Th4s8h5s Tc7d5d6c"));
  }

  @Test
  public void test_omaha_holdem_7333_2c4d8cJcTc_ThQh3c9c_3hAh6dQd_Kd6h5h4h_5d3s5s3d_5c6c2d8d_TdKh7h2h_Qs9d6s7d() {
    assertEquals(
      "3hAh6dQd Kd6h5h4h 5d3s5s3d TdKh7h2h Qs9d6s7d 5c6c2d8d ThQh3c9c",
      Solver.process("omaha-holdem 2c4d8cJcTc ThQh3c9c 3hAh6dQd Kd6h5h4h 5d3s5s3d 5c6c2d8d TdKh7h2h Qs9d6s7d"));
  }

  @Test
  public void test_omaha_holdem_7334_2h2s3h6dJc_3s3dJdAs_7d6hJs5h_8h8d9d9c_6cTdAc4s_Qs5sTc4d_QdJhKcQc_Ts7h5d5c() {
    assertEquals(
      "Ts7h5d5c 6cTdAc4s 8h8d9d9c 7d6hJs5h QdJhKcQc Qs5sTc4d 3s3dJdAs",
      Solver.process("omaha-holdem 2h2s3h6dJc 3s3dJdAs 7d6hJs5h 8h8d9d9c 6cTdAc4s Qs5sTc4d QdJhKcQc Ts7h5d5c"));
  }

  @Test
  public void test_omaha_holdem_7335_4h5d7c7hJh_9s2s8d4s_AcAh3cKh_6cQh3h5h_3d5s6d7d_2h9cQd9h_6s8hQsJd_9dKd8cJs_2dKcAd6h() {
    assertEquals(
      "2dKcAd6h 9s2s8d4s 9dKd8cJs 6s8hQsJd 2h9cQd9h 6cQh3h5h AcAh3cKh 3d5s6d7d",
      Solver.process("omaha-holdem 4h5d7c7hJh 9s2s8d4s AcAh3cKh 6cQh3h5h 3d5s6d7d 2h9cQd9h 6s8hQsJd 9dKd8cJs 2dKcAd6h"));
  }

  @Test
  public void test_omaha_holdem_7336_6d7h9dJcKs_3dQs3h2d_Ac2c3s6c_Tc4s2s8s_Jd5d5sKc() {
    assertEquals(
      "3dQs3h2d Ac2c3s6c Jd5d5sKc Tc4s2s8s",
      Solver.process("omaha-holdem 6d7h9dJcKs 3dQs3h2d Ac2c3s6c Tc4s2s8s Jd5d5sKc"));
  }

  @Test
  public void test_omaha_holdem_7337_2d2s6c6s9s_TcKs5cAc_AsTdQh6h_Kd7dKc7h_7s4h3d6d_3c9c5d9d_7c5sTsQd_AdJd3s8h() {
    assertEquals(
      "AdJd3s8h TcKs5cAc Kd7dKc7h 7s4h3d6d AsTdQh6h 7c5sTsQd 3c9c5d9d",
      Solver.process("omaha-holdem 2d2s6c6s9s TcKs5cAc AsTdQh6h Kd7dKc7h 7s4h3d6d 3c9c5d9d 7c5sTsQd AdJd3s8h"));
  }

  @Test
  public void test_omaha_holdem_7338_2c5s6c6hAc_Tc8c3sKs_Jh8h9s9c_TsQdQcKc_8s6d6s5c_4h7d5hAd_9h5d7c8d_KdJcQs7s() {
    assertEquals(
      "KdJcQs7s 9h5d7c8d Jh8h9s9c 4h7d5hAd Tc8c3sKs TsQdQcKc 8s6d6s5c",
      Solver.process("omaha-holdem 2c5s6c6hAc Tc8c3sKs Jh8h9s9c TsQdQcKc 8s6d6s5c 4h7d5hAd 9h5d7c8d KdJcQs7s"));
  }

  @Test
  public void test_omaha_holdem_7339_2c3c3dQcQs_4d9s3h3s_8d7c5hAc_6c5dAh2h_9d7d8c7h_Ad4h2sKd_5c9cThQd() {
    assertEquals(
      "6c5dAh2h=Ad4h2sKd 9d7d8c7h 5c9cThQd 8d7c5hAc 4d9s3h3s",
      Solver.process("omaha-holdem 2c3c3dQcQs 4d9s3h3s 8d7c5hAc 6c5dAh2h 9d7d8c7h Ad4h2sKd 5c9cThQd"));
  }

  @Test
  public void test_omaha_holdem_7340_7d8d9sKhTd_9d5d5s7h_KcQd5hAc_3d6c6h2c_8h6s8cQh() {
    assertEquals(
      "3d6c6h2c KcQd5hAc 8h6s8cQh 9d5d5s7h",
      Solver.process("omaha-holdem 7d8d9sKhTd 9d5d5s7h KcQd5hAc 3d6c6h2c 8h6s8cQh"));
  }

  @Test
  public void test_omaha_holdem_7341_2h4d7dAhJd_5h6c9dQc_3sJh4hQd_8cKc6h8s_9sKd7sJc_3dAcTd7h_6sAd4c9c_Js2sTc2d_7cQh4s5s() {
    assertEquals(
      "5h6c9dQc 8cKc6h8s 7cQh4s5s 3sJh4hQd 9sKd7sJc 6sAd4c9c Js2sTc2d 3dAcTd7h",
      Solver.process("omaha-holdem 2h4d7dAhJd 5h6c9dQc 3sJh4hQd 8cKc6h8s 9sKd7sJc 3dAcTd7h 6sAd4c9c Js2sTc2d 7cQh4s5s"));
  }

  @Test
  public void test_omaha_holdem_7342_2d4cKcKsTh_6hJcAd8s_Tc6s5cQc_6d5hTsQs_Jh3dAs4h() {
    assertEquals(
      "6hJcAd8s Jh3dAs4h 6d5hTsQs=Tc6s5cQc",
      Solver.process("omaha-holdem 2d4cKcKsTh 6hJcAd8s Tc6s5cQc 6d5hTsQs Jh3dAs4h"));
  }

  @Test
  public void test_omaha_holdem_7343_2h4h5d7hJs_3s9h2s7c_6cKh6h6d_JhQs8h9d_Tc8d2cKs_3cAd6sJd_7sAcAs8s() {
    assertEquals(
      "Tc8d2cKs 7sAcAs8s 3s9h2s7c 3cAd6sJd JhQs8h9d 6cKh6h6d",
      Solver.process("omaha-holdem 2h4h5d7hJs 3s9h2s7c 6cKh6h6d JhQs8h9d Tc8d2cKs 3cAd6sJd 7sAcAs8s"));
  }

  @Test
  public void test_omaha_holdem_7344_4s7c7d7hTd_3dTc2s5c_QhQd2d7s_9cAs9hQc() {
    assertEquals(
      "3dTc2s5c 9cAs9hQc QhQd2d7s",
      Solver.process("omaha-holdem 4s7c7d7hTd 3dTc2s5c QhQd2d7s 9cAs9hQc"));
  }

  @Test
  public void test_omaha_holdem_7345_2s5cJcQdTh_TsJd3d8s_4h6hKs3c_Qs4s8d5h_7d8cJhAc_5s7hKdTd_9dQc6c7s_2d3h8h5d_As2cKc4d() {
    assertEquals(
      "4h6hKs3c 7d8cJhAc 9dQc6c7s 2d3h8h5d 5s7hKdTd TsJd3d8s Qs4s8d5h As2cKc4d",
      Solver.process("omaha-holdem 2s5cJcQdTh TsJd3d8s 4h6hKs3c Qs4s8d5h 7d8cJhAc 5s7hKdTd 9dQc6c7s 2d3h8h5d As2cKc4d"));
  }

  @Test
  public void test_omaha_holdem_7346_3hAdQcTdTh_JsKdKc8c_2cAs4c6h_2s5d2h4d_9h8s7sKh_Jh4h3cJc_6d8dTcTs_7cAcAh8h_6sJdQd7d() {
    assertEquals(
      "9h8s7sKh 2s5d2h4d Jh4h3cJc 6sJdQd7d 2cAs4c6h JsKdKc8c 7cAcAh8h 6d8dTcTs",
      Solver.process("omaha-holdem 3hAdQcTdTh JsKdKc8c 2cAs4c6h 2s5d2h4d 9h8s7sKh Jh4h3cJc 6d8dTcTs 7cAcAh8h 6sJdQd7d"));
  }

  @Test
  public void test_omaha_holdem_7347_3h6cJsQsTs_4cTh8d4d_JhAdQc7s_7c7h9c2h_4h8s5s7d_Tc6s5c9h_Kd5h3c2d_Td2s8hKs_4sAhJc3s() {
    assertEquals(
      "Kd5h3c2d 7c7h9c2h 4cTh8d4d Tc6s5c9h JhAdQc7s 4sAhJc3s 4h8s5s7d Td2s8hKs",
      Solver.process("omaha-holdem 3h6cJsQsTs 4cTh8d4d JhAdQc7s 7c7h9c2h 4h8s5s7d Tc6s5c9h Kd5h3c2d Td2s8hKs 4sAhJc3s"));
  }

  @Test
  public void test_omaha_holdem_7348_8d9cKdQcTc_TsQhAdKs_5c2s9s4c_ThQd2c3c_4d3s4hJs_5h4sJh6d_3h5s2d2h() {
    assertEquals(
      "5h4sJh6d 3h5s2d2h 4d3s4hJs TsQhAdKs ThQd2c3c 5c2s9s4c",
      Solver.process("omaha-holdem 8d9cKdQcTc TsQhAdKs 5c2s9s4c ThQd2c3c 4d3s4hJs 5h4sJh6d 3h5s2d2h"));
  }

  @Test
  public void test_omaha_holdem_7349_3c3d5s7h8d_2s4cKdKh_6cQd9s2d_3sJsAd4d_2c3hJd9d() {
    assertEquals(
      "2s4cKdKh 2c3hJd9d 3sJsAd4d 6cQd9s2d",
      Solver.process("omaha-holdem 3c3d5s7h8d 2s4cKdKh 6cQd9s2d 3sJsAd4d 2c3hJd9d"));
  }

  @Test
  public void test_omaha_holdem_7350_6d6s9hKdQd_Qh5s9sQs_8cTh8d2s_Jh7hJs2c_JcAd3c5h_Jd5d6c6h_4cTc3s9c_Qc2d7sKh_3dTdAsKs_4d9dTs7c() {
    assertEquals(
      "JcAd3c5h 8cTh8d2s 4cTc3s9c Jh7hJs2c Qc2d7sKh 4d9dTs7c 3dTdAsKs Qh5s9sQs Jd5d6c6h",
      Solver.process("omaha-holdem 6d6s9hKdQd Qh5s9sQs 8cTh8d2s Jh7hJs2c JcAd3c5h Jd5d6c6h 4cTc3s9c Qc2d7sKh 3dTdAsKs 4d9dTs7c"));
  }

  @Test
  public void test_omaha_holdem_7351_4d5d8cKsTh_2c4h9s9c_3c8s3s7h_As6s2d3h_Kd8hQc9h_7s6d5c5h_8dJh7cJs_Kh6h5s3d_TcTd6cJd_9dQsAhQd() {
    assertEquals(
      "As6s2d3h 3c8s3s7h 2c4h9s9c 8dJh7cJs 9dQsAhQd Kh6h5s3d Kd8hQc9h TcTd6cJd 7s6d5c5h",
      Solver.process("omaha-holdem 4d5d8cKsTh 2c4h9s9c 3c8s3s7h As6s2d3h Kd8hQc9h 7s6d5c5h 8dJh7cJs Kh6h5s3d TcTd6cJd 9dQsAhQd"));
  }

  @Test
  public void test_omaha_holdem_7352_4dJdJhKhQs_2d6hKc5d_5sJc6dAd_8hTs2cTd_2h9s9cAs_8cQc9d6s() {
    assertEquals(
      "2h9s9cAs 8hTs2cTd 8cQc9d6s 2d6hKc5d 5sJc6dAd",
      Solver.process("omaha-holdem 4dJdJhKhQs 2d6hKc5d 5sJc6dAd 8hTs2cTd 2h9s9cAs 8cQc9d6s"));
  }

  @Test
  public void test_omaha_holdem_7353_3c3d6d9dAd_8cQs4cTd_8s6sAc5c_8dQhJh7h() {
    assertEquals(
      "8cQs4cTd 8dQhJh7h 8s6sAc5c",
      Solver.process("omaha-holdem 3c3d6d9dAd 8cQs4cTd 8s6sAc5c 8dQhJh7h"));
  }

  @Test
  public void test_omaha_holdem_7354_2c2d6dJcQh_5s6cQsTs_As9c3sAc_5d3d7cKc_8sTcAh5c_Th6s6h9s_Ad4c8d3h_Qd7sJd9h_2hKd4s5h() {
    assertEquals(
      "5d3d7cKc Ad4c8d3h 8sTcAh5c 5s6cQsTs Qd7sJd9h As9c3sAc 2hKd4s5h Th6s6h9s",
      Solver.process("omaha-holdem 2c2d6dJcQh 5s6cQsTs As9c3sAc 5d3d7cKc 8sTcAh5c Th6s6h9s Ad4c8d3h Qd7sJd9h 2hKd4s5h"));
  }

  @Test
  public void test_omaha_holdem_7355_2d2sJcQhTd_Jd5hAs8c_4sAhQs7h_7s4c5sJs() {
    assertEquals(
      "7s4c5sJs Jd5hAs8c 4sAhQs7h",
      Solver.process("omaha-holdem 2d2sJcQhTd Jd5hAs8c 4sAhQs7h 7s4c5sJs"));
  }

  @Test
  public void test_omaha_holdem_7356_4d4s6s7cAh_9cTs7s3d_Kc4h8s9d() {
    assertEquals(
      "9cTs7s3d Kc4h8s9d",
      Solver.process("omaha-holdem 4d4s6s7cAh 9cTs7s3d Kc4h8s9d"));
  }

  @Test
  public void test_omaha_holdem_7357_2d3d8hJhTc_4h9sJs8c_3hKcAh8d_Ac5h2s3s_6c4dKd8s_JdQs7s9h_AdQdKs7c_As5s5dTd() {
    assertEquals(
      "AdQdKs7c 6c4dKd8s As5s5dTd Ac5h2s3s 3hKcAh8d 4h9sJs8c JdQs7s9h",
      Solver.process("omaha-holdem 2d3d8hJhTc 4h9sJs8c 3hKcAh8d Ac5h2s3s 6c4dKd8s JdQs7s9h AdQdKs7c As5s5dTd"));
  }

  @Test
  public void test_omaha_holdem_7358_6h8hJdKsQd_TsTh3h7d_9sJs4d4s_Ad8s9c3c_Td9dQc2d_JcKh7sJh_KdKc5h4h_AsTc8c5s_4c2s8d9h_Ac3d7c6c() {
    assertEquals(
      "Ac3d7c6c 4c2s8d9h Ad8s9c3c TsTh3h7d 9sJs4d4s JcKh7sJh KdKc5h4h Td9dQc2d AsTc8c5s",
      Solver.process("omaha-holdem 6h8hJdKsQd TsTh3h7d 9sJs4d4s Ad8s9c3c Td9dQc2d JcKh7sJh KdKc5h4h AsTc8c5s 4c2s8d9h Ac3d7c6c"));
  }

  @Test
  public void test_omaha_holdem_7359_3s7d9sAsTs_Kc2s4cJd_Qh7hTdQd_7cAd8d9d_Ah2cJs5s_Tc8s5h8h_4dJhQs4h_2dTh9hQc_6h4s6d6c() {
    assertEquals(
      "Kc2s4cJd 4dJhQs4h 6h4s6d6c Tc8s5h8h Qh7hTdQd 2dTh9hQc 7cAd8d9d Ah2cJs5s",
      Solver.process("omaha-holdem 3s7d9sAsTs Kc2s4cJd Qh7hTdQd 7cAd8d9d Ah2cJs5s Tc8s5h8h 4dJhQs4h 2dTh9hQc 6h4s6d6c"));
  }

  @Test
  public void test_omaha_holdem_7360_2d7c9dQhQs_5s3d6h9h_8s4sAdAs_2hTd9sKs_ThJhTc2c_Qc6sJcTs_6dJdKhQd_JsKd8cAc() {
    assertEquals(
      "JsKd8cAc 5s3d6h9h 2hTd9sKs ThJhTc2c 8s4sAdAs Qc6sJcTs 6dJdKhQd",
      Solver.process("omaha-holdem 2d7c9dQhQs 5s3d6h9h 8s4sAdAs 2hTd9sKs ThJhTc2c Qc6sJcTs 6dJdKhQd JsKd8cAc"));
  }

  @Test
  public void test_omaha_holdem_7361_4s8hAcAhJd_QhAd4h7s_Ts6s2cJh_8d6d8cKh_3s9cKs9s_3c7h5d7c_6h2hKd7d_9hKc3d8s_3h2dThTd_4c9d6c5c() {
    assertEquals(
      "6h2hKd7d 4c9d6c5c 3c7h5d7c 9hKc3d8s 3s9cKs9s 3h2dThTd Ts6s2cJh 8d6d8cKh QhAd4h7s",
      Solver.process("omaha-holdem 4s8hAcAhJd QhAd4h7s Ts6s2cJh 8d6d8cKh 3s9cKs9s 3c7h5d7c 6h2hKd7d 9hKc3d8s 3h2dThTd 4c9d6c5c"));
  }

  @Test
  public void test_omaha_holdem_7362_4s7c7s8hKc_9dAh9s8c_Ks2d9hQs_TcKhQdQh_4dAsTs3c_5h3hJc8d_Kd5s9c6s() {
    assertEquals(
      "4dAsTs3c 5h3hJc8d 9dAh9s8c Ks2d9hQs=TcKhQdQh Kd5s9c6s",
      Solver.process("omaha-holdem 4s7c7s8hKc 9dAh9s8c Ks2d9hQs TcKhQdQh 4dAsTs3c 5h3hJc8d Kd5s9c6s"));
  }

  @Test
  public void test_omaha_holdem_7363_2c6d7c8hJc_AdQhKd5h_6cJs9h8c_7s4cTh5d_9c2h7hAc_9dTsTd5s_4h3dKcKh_3hAhQc2s_AsQsJhKs() {
    assertEquals(
      "AdQhKd5h 3hAhQc2s AsQsJhKs 4h3dKcKh 7s4cTh5d 9dTsTd5s 6cJs9h8c 9c2h7hAc",
      Solver.process("omaha-holdem 2c6d7c8hJc AdQhKd5h 6cJs9h8c 7s4cTh5d 9c2h7hAc 9dTsTd5s 4h3dKcKh 3hAhQc2s AsQsJhKs"));
  }

  @Test
  public void test_omaha_holdem_7364_2s5s6dJdQd_4cJsAsAd_Ks7h9d4h() {
    assertEquals(
      "Ks7h9d4h 4cJsAsAd",
      Solver.process("omaha-holdem 2s5s6dJdQd 4cJsAsAd Ks7h9d4h"));
  }

  @Test
  public void test_omaha_holdem_7365_2d3c4h7cTd_5cKsAs8h_Ac5dTh3h_8s6h6d4s() {
    assertEquals(
      "8s6h6d4s 5cKsAs8h=Ac5dTh3h",
      Solver.process("omaha-holdem 2d3c4h7cTd 5cKsAs8h Ac5dTh3h 8s6h6d4s"));
  }

  @Test
  public void test_omaha_holdem_7366_4d5c6d9cQs_7s5dAsQh_2d8h3h6c_Th4c5hJd_JsTcJh3c_9d6sKd8s_Ks7c7d3d_4sAdKc2s_Qc2h5s6h_3s8c7hJc() {
    assertEquals(
      "4sAdKc2s JsTcJh3c Th4c5hJd 9d6sKd8s 7s5dAsQh Qc2h5s6h 2d8h3h6c Ks7c7d3d 3s8c7hJc",
      Solver.process("omaha-holdem 4d5c6d9cQs 7s5dAsQh 2d8h3h6c Th4c5hJd JsTcJh3c 9d6sKd8s Ks7c7d3d 4sAdKc2s Qc2h5s6h 3s8c7hJc"));
  }

  @Test
  public void test_omaha_holdem_7367_4s6h7sAdTd_Tc3c6d7h_2c8d3dAs() {
    assertEquals(
      "2c8d3dAs Tc3c6d7h",
      Solver.process("omaha-holdem 4s6h7sAdTd Tc3c6d7h 2c8d3dAs"));
  }

  @Test
  public void test_omaha_holdem_7368_4d6h7s9sKh_KsAc8cAh_Js8s6cQc_3s8h7h9h_Jd3d6s2d() {
    assertEquals(
      "Jd3d6s2d Js8s6cQc KsAc8cAh 3s8h7h9h",
      Solver.process("omaha-holdem 4d6h7s9sKh KsAc8cAh Js8s6cQc 3s8h7h9h Jd3d6s2d"));
  }

  @Test
  public void test_omaha_holdem_7369_4d8c8hQcTd_5s3dJs2h_3cAsKcQs_6h4h2s9s_2d8sAcTs_Kh4c8d9d_QdAhJh4s_QhTcKsKd_9c6c7dAd() {
    assertEquals(
      "5s3dJs2h 9c6c7dAd 6h4h2s9s 3cAsKcQs=QdAhJh4s QhTcKsKd Kh4c8d9d 2d8sAcTs",
      Solver.process("omaha-holdem 4d8c8hQcTd 5s3dJs2h 3cAsKcQs 6h4h2s9s 2d8sAcTs Kh4c8d9d QdAhJh4s QhTcKsKd 9c6c7dAd"));
  }

  @Test
  public void test_omaha_holdem_7370_2c5s7sKsTd_5h6c5cJh_Qd7h3h4s_AcJc8c9h_9s4d8h7c_KcTc9cAh_Kh8d3dAs_4cQcAd4h() {
    assertEquals(
      "AcJc8c9h 4cQcAd4h 9s4d8h7c Qd7h3h4s Kh8d3dAs KcTc9cAh 5h6c5cJh",
      Solver.process("omaha-holdem 2c5s7sKsTd 5h6c5cJh Qd7h3h4s AcJc8c9h 9s4d8h7c KcTc9cAh Kh8d3dAs 4cQcAd4h"));
  }

  @Test
  public void test_omaha_holdem_7371_2d8c9sJsQc_5d2cQd3s_6d3dQhJd() {
    assertEquals(
      "5d2cQd3s 6d3dQhJd",
      Solver.process("omaha-holdem 2d8c9sJsQc 5d2cQd3s 6d3dQhJd"));
  }

  @Test
  public void test_omaha_holdem_7372_5c5h6hAsJh_6c3cKcAd_Qs9dQcTs_9h7d9c2h_5s8s2c7c_3s5dJsAc_6sQhTc2d() {
    assertEquals(
      "6sQhTc2d Qs9dQcTs 6c3cKcAd 5s8s2c7c 9h7d9c2h 3s5dJsAc",
      Solver.process("omaha-holdem 5c5h6hAsJh 6c3cKcAd Qs9dQcTs 9h7d9c2h 5s8s2c7c 3s5dJsAc 6sQhTc2d"));
  }

  @Test
  public void test_omaha_holdem_7373_3s7d8cQhTh_2c6dTd9h_4dKs5s7c_5h2sAcJc_4cKdAd5d_8d5c3cAs_Js2h8h3h() {
    assertEquals(
      "5h2sAcJc 4cKdAd5d 4dKs5s7c 8d5c3cAs=Js2h8h3h 2c6dTd9h",
      Solver.process("omaha-holdem 3s7d8cQhTh 2c6dTd9h 4dKs5s7c 5h2sAcJc 4cKdAd5d 8d5c3cAs Js2h8h3h"));
  }

  @Test
  public void test_omaha_holdem_7374_2c3c9sAsKd_7c5sKsTc_Kc3s4dAd_Jd7h4h2s_3dThAc8s_6s6hTdQs_2d9h8dAh() {
    assertEquals(
      "Jd7h4h2s 6s6hTdQs 7c5sKsTc 3dThAc8s 2d9h8dAh Kc3s4dAd",
      Solver.process("omaha-holdem 2c3c9sAsKd 7c5sKsTc Kc3s4dAd Jd7h4h2s 3dThAc8s 6s6hTdQs 2d9h8dAh"));
  }

  @Test
  public void test_omaha_holdem_7375_2c2h7h8cAh_9h6hAcQc_6dQs8d2s_2d5dAsKs_Tc5hQd4h() {
    assertEquals(
      "Tc5hQd4h 9h6hAcQc 6dQs8d2s 2d5dAsKs",
      Solver.process("omaha-holdem 2c2h7h8cAh 9h6hAcQc 6dQs8d2s 2d5dAsKs Tc5hQd4h"));
  }

  @Test
  public void test_omaha_holdem_7376_2c5h6dAhTc_Ts2s8h4d_JhAc4s3s_QdKdAs8d_2h6hQs5d_7d6c3d4c() {
    assertEquals(
      "QdKdAs8d 2h6hQs5d Ts2s8h4d 7d6c3d4c=JhAc4s3s",
      Solver.process("omaha-holdem 2c5h6dAhTc Ts2s8h4d JhAc4s3s QdKdAs8d 2h6hQs5d 7d6c3d4c"));
  }

  @Test
  public void test_omaha_holdem_7377_2d4s7c9hJd_TdAc3sTc_QcAd9d3d_5s8d7s8s_5h6s2h5d_7h8h2cKc_As6hJc8c_6d3cJhAh() {
    assertEquals(
      "5h6s2h5d 5s8d7s8s QcAd9d3d TdAc3sTc 6d3cJhAh=As6hJc8c 7h8h2cKc",
      Solver.process("omaha-holdem 2d4s7c9hJd TdAc3sTc QcAd9d3d 5s8d7s8s 5h6s2h5d 7h8h2cKc As6hJc8c 6d3cJhAh"));
  }

  @Test
  public void test_omaha_holdem_7378_6h7h8hJdKc_Jc3d2s5h_8cJhTd5d_2h5s4sAh_7s8sQs5c_7dJs2c4h_9h2dKh6s_9c4c8dAc_Kd4d3h3c() {
    assertEquals(
      "9c4c8dAc Jc3d2s5h Kd4d3h3c 7s8sQs5c 7dJs2c4h 8cJhTd5d 9h2dKh6s 2h5s4sAh",
      Solver.process("omaha-holdem 6h7h8hJdKc Jc3d2s5h 8cJhTd5d 2h5s4sAh 7s8sQs5c 7dJs2c4h 9h2dKh6s 9c4c8dAc Kd4d3h3c"));
  }

  @Test
  public void test_omaha_holdem_7379_3d4d5d5hQh_6c6dAc4c_6s3cQcTd_As6hKc7h_4sJcTcKs_3sQd2d2s_5cQs7s8c_KdJh2c8s_8dKhJs4h() {
    assertEquals(
      "KdJh2c8s 4sJcTcKs=8dKhJs4h 6c6dAc4c 6s3cQcTd As6hKc7h 3sQd2d2s 5cQs7s8c",
      Solver.process("omaha-holdem 3d4d5d5hQh 6c6dAc4c 6s3cQcTd As6hKc7h 4sJcTcKs 3sQd2d2s 5cQs7s8c KdJh2c8s 8dKhJs4h"));
  }

  @Test
  public void test_omaha_holdem_7380_2d3cJhQdTc_9d3h7s5d_5s5hAhJc() {
    assertEquals(
      "9d3h7s5d 5s5hAhJc",
      Solver.process("omaha-holdem 2d3cJhQdTc 9d3h7s5d 5s5hAhJc"));
  }

  @Test
  public void test_omaha_holdem_7381_4h9sJhKsQd_7sQs9cTs_AcKd2h8d_Td5hAs6h_8hJs5c3s_Qc4d4cAd_3d8c5sJd_2d7d6sAh_Tc8s6d7c() {
    assertEquals(
      "2d7d6sAh 3d8c5sJd=8hJs5c3s AcKd2h8d Qc4d4cAd Tc8s6d7c 7sQs9cTs Td5hAs6h",
      Solver.process("omaha-holdem 4h9sJhKsQd 7sQs9cTs AcKd2h8d Td5hAs6h 8hJs5c3s Qc4d4cAd 3d8c5sJd 2d7d6sAh Tc8s6d7c"));
  }

  @Test
  public void test_omaha_holdem_7382_2h5h7cAdTh_Ks4s3h3s_Kd5s3d6c_JhQs6s8h_Js9sQc2d_8d7s4cTc_Kc5cAs2c_Ac8c4h7h_7dTdJd9c_6h6d8sAh() {
    assertEquals(
      "Js9sQc2d Kd5s3d6c 7dTdJd9c=8d7s4cTc Kc5cAs2c Ks4s3h3s Ac8c4h7h JhQs6s8h 6h6d8sAh",
      Solver.process("omaha-holdem 2h5h7cAdTh Ks4s3h3s Kd5s3d6c JhQs6s8h Js9sQc2d 8d7s4cTc Kc5cAs2c Ac8c4h7h 7dTdJd9c 6h6d8sAh"));
  }

  @Test
  public void test_omaha_holdem_7383_5d7c8dAcKd_3c4h5h8c_3s9cTh7h_7s5s3h9s_6c6h2h5c_As9d8hJs() {
    assertEquals(
      "6c6h2h5c 3s9cTh7h 7s5s3h9s 3c4h5h8c As9d8hJs",
      Solver.process("omaha-holdem 5d7c8dAcKd 3c4h5h8c 3s9cTh7h 7s5s3h9s 6c6h2h5c As9d8hJs"));
  }

  @Test
  public void test_omaha_holdem_7384_4d5h8c8dKs_2sKc5dKd_2cJd7c4h_As3s3d8h_Qd6cQc5c_3c2hTdAc_9dJsQhTc_TsKhQs6d() {
    assertEquals(
      "9dJsQhTc 3c2hTdAc 2cJd7c4h Qd6cQc5c TsKhQs6d As3s3d8h 2sKc5dKd",
      Solver.process("omaha-holdem 4d5h8c8dKs 2sKc5dKd 2cJd7c4h As3s3d8h Qd6cQc5c 3c2hTdAc 9dJsQhTc TsKhQs6d"));
  }

  @Test
  public void test_omaha_holdem_7385_2d8s9dJsKc_3s4dJhAh_Tc6sKdQh_2h2c6hTd_Jd9hTsJc_6d8h8c7s_3dQdAsQs() {
    assertEquals(
      "3s4dJhAh 3dQdAsQs 2h2c6hTd 6d8h8c7s Jd9hTsJc Tc6sKdQh",
      Solver.process("omaha-holdem 2d8s9dJsKc 3s4dJhAh Tc6sKdQh 2h2c6hTd Jd9hTsJc 6d8h8c7s 3dQdAsQs"));
  }

  @Test
  public void test_omaha_holdem_7386_2c3s8dKcKs_6c4s2h5c_5d3cJc2d_ThJsQsJh_AsTd3h6s() {
    assertEquals(
      "6c4s2h5c 5d3cJc2d AsTd3h6s ThJsQsJh",
      Solver.process("omaha-holdem 2c3s8dKcKs 6c4s2h5c 5d3cJc2d ThJsQsJh AsTd3h6s"));
  }

  @Test
  public void test_omaha_holdem_7387_2c2s8hAsJc_7h4s3c9c_3d9dJh4h_7dAc6cKs_7c2h3h8d_Qs8c4c8s() {
    assertEquals(
      "7h4s3c9c 3d9dJh4h 7dAc6cKs 7c2h3h8d Qs8c4c8s",
      Solver.process("omaha-holdem 2c2s8hAsJc 7h4s3c9c 3d9dJh4h 7dAc6cKs 7c2h3h8d Qs8c4c8s"));
  }

  @Test
  public void test_omaha_holdem_7388_2d4hAhJcTc_Kc5s5cTd_8sAs3d6s_3c4d6dKs_5d6hQd3h() {
    assertEquals(
      "3c4d6dKs Kc5s5cTd 8sAs3d6s 5d6hQd3h",
      Solver.process("omaha-holdem 2d4hAhJcTc Kc5s5cTd 8sAs3d6s 3c4d6dKs 5d6hQd3h"));
  }

  @Test
  public void test_omaha_holdem_7389_2c3sQcQhTd_5h6h5cTh_JsKd9sAs_Jd2h4sAc_4c6dKsTc_3dQs2s8c() {
    assertEquals(
      "JsKd9sAs Jd2h4sAc 5h6h5cTh 4c6dKsTc 3dQs2s8c",
      Solver.process("omaha-holdem 2c3sQcQhTd 5h6h5cTh JsKd9sAs Jd2h4sAc 4c6dKsTc 3dQs2s8c"));
  }

  @Test
  public void test_omaha_holdem_7390_7dAhQcQdQs_Ks8d9sAd_Tc4sTd3d_5s4c4d7c_7h2sQh9c_KhJd8c3c_Th5c6h5d_6d8sTs7s_4h3s2d8h_JhAc6sAs() {
    assertEquals(
      "4h3s2d8h 6d8sTs7s KhJd8c3c Ks8d9sAd 5s4c4d7c Th5c6h5d Tc4sTd3d JhAc6sAs 7h2sQh9c",
      Solver.process("omaha-holdem 7dAhQcQdQs Ks8d9sAd Tc4sTd3d 5s4c4d7c 7h2sQh9c KhJd8c3c Th5c6h5d 6d8sTs7s 4h3s2d8h JhAc6sAs"));
  }

  @Test
  public void test_omaha_holdem_7391_2d2h5h9hQc_Th9cQsQh_Kd4s3d3s() {
    assertEquals(
      "Kd4s3d3s Th9cQsQh",
      Solver.process("omaha-holdem 2d2h5h9hQc Th9cQsQh Kd4s3d3s"));
  }

  @Test
  public void test_omaha_holdem_7392_3d7d9cAhJh_QdQh8h2h_8d6d9hTs_5cJc6c4c_AsAd9s8s_Jd7sKhKd_2s3c4d5d_8cThTd6s_9d4sTcQc() {
    assertEquals(
      "2s3c4d5d 9d4sTcQc 5cJc6c4c QdQh8h2h Jd7sKhKd AsAd9s8s 8cThTd6s=8d6d9hTs",
      Solver.process("omaha-holdem 3d7d9cAhJh QdQh8h2h 8d6d9hTs 5cJc6c4c AsAd9s8s Jd7sKhKd 2s3c4d5d 8cThTd6s 9d4sTcQc"));
  }

  @Test
  public void test_omaha_holdem_7393_4c4d7s9sJh_5hAd6c9c_7h8hAhAc_8cTc4hQs() {
    assertEquals(
      "5hAd6c9c 7h8hAhAc 8cTc4hQs",
      Solver.process("omaha-holdem 4c4d7s9sJh 5hAd6c9c 7h8hAhAc 8cTc4hQs"));
  }

  @Test
  public void test_omaha_holdem_7394_3h7d8cAsKs_4s8h9cAd_2h5dQsJd_6h5cAc6c_7hTdAh7s_4dJs9s5h_2c6dJc3s_KhTh2sJh_7cQdQh3d() {
    assertEquals(
      "4dJs9s5h 2h5dQsJd 2c6dJc3s KhTh2sJh 6h5cAc6c 7cQdQh3d 4s8h9cAd 7hTdAh7s",
      Solver.process("omaha-holdem 3h7d8cAsKs 4s8h9cAd 2h5dQsJd 6h5cAc6c 7hTdAh7s 4dJs9s5h 2c6dJc3s KhTh2sJh 7cQdQh3d"));
  }

  @Test
  public void test_omaha_holdem_7395_5h6d8cQdTc_JcAdQc2d_Th3cKsJd_9hAh5s2h_3hAsJs7s_8h3s2s2c_Qh9d6s8d_5c4dKh3d_6hTs6c9c() {
    assertEquals(
      "3hAsJs7s 5c4dKh3d 9hAh5s2h 8h3s2s2c Th3cKsJd JcAdQc2d Qh9d6s8d 6hTs6c9c",
      Solver.process("omaha-holdem 5h6d8cQdTc JcAdQc2d Th3cKsJd 9hAh5s2h 3hAsJs7s 8h3s2s2c Qh9d6s8d 5c4dKh3d 6hTs6c9c"));
  }

  @Test
  public void test_omaha_holdem_7396_3d5d9hAcQc_7hJd7d4c_8c8d7c5c_2h8h6sTd_TsQh9sJs_Ah9d3cAd_KcJcQs6h_3h8sThKh_2c9c6c2d_3sTcAs4d() {
    assertEquals(
      "2h8h6sTd 3h8sThKh 7hJd7d4c 8c8d7c5c 2c9c6c2d KcJcQs6h TsQh9sJs 3sTcAs4d Ah9d3cAd",
      Solver.process("omaha-holdem 3d5d9hAcQc 7hJd7d4c 8c8d7c5c 2h8h6sTd TsQh9sJs Ah9d3cAd KcJcQs6h 3h8sThKh 2c9c6c2d 3sTcAs4d"));
  }

  @Test
  public void test_omaha_holdem_7397_3s6c8s9dKc_Jd3h5sQs_5d6dKdQh() {
    assertEquals(
      "Jd3h5sQs 5d6dKdQh",
      Solver.process("omaha-holdem 3s6c8s9dKc Jd3h5sQs 5d6dKdQh"));
  }

  @Test
  public void test_omaha_holdem_7398_3h4h6h7hQs_4d7c6sKs_6cTdJs3c_Tc5dTs5s_Jc9s4c8d() {
    assertEquals(
      "Jc9s4c8d Tc5dTs5s 6cTdJs3c 4d7c6sKs",
      Solver.process("omaha-holdem 3h4h6h7hQs 4d7c6sKs 6cTdJs3c Tc5dTs5s Jc9s4c8d"));
  }

  @Test
  public void test_omaha_holdem_7399_4s6cAcAhAs_Th8dTcTd_Kc2s4hJd_2hKs9h7s_5hQdKd9s() {
    assertEquals(
      "2hKs9h7s Kc2s4hJd 5hQdKd9s Th8dTcTd",
      Solver.process("omaha-holdem 4s6cAcAhAs Th8dTcTd Kc2s4hJd 2hKs9h7s 5hQdKd9s"));
  }

  @Test
  public void test_omaha_holdem_7400_4c6c7d8dJs_Qd9d8cJd_5c7hAdTc_Kh5sTh9c_8s3d2h3h_2cJh8hKd_7s6dQs6h_Qh3c4d4s_JcAsAc5d_Ks9s2d6s() {
    assertEquals(
      "Ks9s2d6s 8s3d2h3h JcAsAc5d 2cJh8hKd=Qd9d8cJd Qh3c4d4s 7s6dQs6h 5c7hAdTc Kh5sTh9c",
      Solver.process("omaha-holdem 4c6c7d8dJs Qd9d8cJd 5c7hAdTc Kh5sTh9c 8s3d2h3h 2cJh8hKd 7s6dQs6h Qh3c4d4s JcAsAc5d Ks9s2d6s"));
  }

  @Test
  public void test_omaha_holdem_7401_5c7hJhQdTh_3c5d8dTs_7c9d2d2c_3sQsJc6c_9c2h5hJd_8s4d4s8h_Ac7sKs2s_Td6s4h3d_QhQc8c6d() {
    assertEquals(
      "7c9d2d2c 8s4d4s8h Td6s4h3d 3c5d8dTs 3sQsJc6c QhQc8c6d Ac7sKs2s 9c2h5hJd",
      Solver.process("omaha-holdem 5c7hJhQdTh 3c5d8dTs 7c9d2d2c 3sQsJc6c 9c2h5hJd 8s4d4s8h Ac7sKs2s Td6s4h3d QhQc8c6d"));
  }

  @Test
  public void test_omaha_holdem_7402_2c2s4d4h8d_5cKc6s7s_Jc7h6d9d_5hQc8hTs() {
    assertEquals(
      "Jc7h6d9d 5cKc6s7s 5hQc8hTs",
      Solver.process("omaha-holdem 2c2s4d4h8d 5cKc6s7s Jc7h6d9d 5hQc8hTs"));
  }

  @Test
  public void test_omaha_holdem_7403_2d4c7s9hKd_QcTs2sKh_9c2hJdTd_Qd5d4s8s_3d9s8cAc_As3c8d3h_QhAh7cJc() {
    assertEquals(
      "As3c8d3h Qd5d4s8s QhAh7cJc 3d9s8cAc 9c2hJdTd QcTs2sKh",
      Solver.process("omaha-holdem 2d4c7s9hKd QcTs2sKh 9c2hJdTd Qd5d4s8s 3d9s8cAc As3c8d3h QhAh7cJc"));
  }

  @Test
  public void test_omaha_holdem_7404_5h6d8dJsKs_7c6sAdJc_9dKh5c2h_4d2dJd6h_TsAh2c5s_Tc3h7hQc_4c8s7sTd_JhAc5dTh() {
    assertEquals(
      "Tc3h7hQc TsAh2c5s JhAc5dTh 4d2dJd6h=7c6sAdJc 9dKh5c2h 4c8s7sTd",
      Solver.process("omaha-holdem 5h6d8dJsKs 7c6sAdJc 9dKh5c2h 4d2dJd6h TsAh2c5s Tc3h7hQc 4c8s7sTd JhAc5dTh"));
  }

  @Test
  public void test_omaha_holdem_7405_6s8d9cAcKc_3d8c5s7s_Qh6dKdQd() {
    assertEquals(
      "Qh6dKdQd 3d8c5s7s",
      Solver.process("omaha-holdem 6s8d9cAcKc 3d8c5s7s Qh6dKdQd"));
  }

  @Test
  public void test_omaha_holdem_7406_3c5hAhKcQh_Ac5s5c7s_4c8cKd8h_Ts6dQcQd_2c9c3s9h_Js2h9d4s_Tc6cJcAs_7dTd4dKh_Jh4h7cAd_2d8s8dTh() {
    assertEquals(
      "2d8s8dTh 2c9c3s9h 4c8cKd8h 7dTd4dKh Ac5s5c7s Ts6dQcQd Js2h9d4s Tc6cJcAs Jh4h7cAd",
      Solver.process("omaha-holdem 3c5hAhKcQh Ac5s5c7s 4c8cKd8h Ts6dQcQd 2c9c3s9h Js2h9d4s Tc6cJcAs 7dTd4dKh Jh4h7cAd 2d8s8dTh"));
  }

  @Test
  public void test_omaha_holdem_7407_4c4d4s6hQs_JhJc6c3c_3h9hTs8c_9c7sKcTh_Js3d7h5c_QhTdQd7d_7c5hKdTc_Ks2h9s2c_KhAcJd6d() {
    assertEquals(
      "3h9hTs8c Js3d7h5c 7c5hKdTc=9c7sKcTh KhAcJd6d Ks2h9s2c JhJc6c3c QhTdQd7d",
      Solver.process("omaha-holdem 4c4d4s6hQs JhJc6c3c 3h9hTs8c 9c7sKcTh Js3d7h5c QhTdQd7d 7c5hKdTc Ks2h9s2c KhAcJd6d"));
  }

  @Test
  public void test_omaha_holdem_7408_4d5h8sJdKh_9dThAd2d_2cQsTdAc() {
    assertEquals(
      "9dThAd2d 2cQsTdAc",
      Solver.process("omaha-holdem 4d5h8sJdKh 9dThAd2d 2cQsTdAc"));
  }

  @Test
  public void test_omaha_holdem_7409_6h8d9dKcTs_QsJc4dKh_Ks9h6sAc_3h5d8s9c_2cJs7d4h_7hAdQh2s_4c3c6c9s_3s5hQd7c() {
    assertEquals(
      "7hAdQh2s 4c3c6c9s 3h5d8s9c Ks9h6sAc 3s5hQd7c 2cJs7d4h QsJc4dKh",
      Solver.process("omaha-holdem 6h8d9dKcTs QsJc4dKh Ks9h6sAc 3h5d8s9c 2cJs7d4h 7hAdQh2s 4c3c6c9s 3s5hQd7c"));
  }

  @Test
  public void test_omaha_holdem_7410_2s4c5d6d9d_Th7c6h7d_Ks3h9hJc_8h8cKcJd_QcQs2dAs_KhJhTs2c_8s4dAc7h_Td6cAhKd_2h3dQhTc_Qd4s5s8d() {
    assertEquals(
      "KhJhTs2c Th7c6h7d 8h8cKcJd Ks3h9hJc QcQs2dAs 2h3dQhTc 8s4dAc7h Qd4s5s8d Td6cAhKd",
      Solver.process("omaha-holdem 2s4c5d6d9d Th7c6h7d Ks3h9hJc 8h8cKcJd QcQs2dAs KhJhTs2c 8s4dAc7h Td6cAhKd 2h3dQhTc Qd4s5s8d"));
  }

  @Test
  public void test_omaha_holdem_7411_6h9dJsKdKs_JdQh3dTh_4s4d2s3c_7c6sAc2d_AhQd7hJc_5c5d5h7d_As6cTs5s_9s2cKc9h_8h4h8cAd_Kh2h3s3h() {
    assertEquals(
      "4s4d2s3c 5c5d5h7d 7c6sAc2d=As6cTs5s 8h4h8cAd AhQd7hJc Kh2h3s3h JdQh3dTh 9s2cKc9h",
      Solver.process("omaha-holdem 6h9dJsKdKs JdQh3dTh 4s4d2s3c 7c6sAc2d AhQd7hJc 5c5d5h7d As6cTs5s 9s2cKc9h 8h4h8cAd Kh2h3s3h"));
  }

  @Test
  public void test_omaha_holdem_7412_2c3d6cQsTh_Ks4dQh5c_AsTdQd8c_2d8sKhJh_Tc3s9d6d_AcJc6s5d_4c9c2s9s_Ad5s3c8d_7c5h9hQc() {
    assertEquals(
      "2d8sKhJh Ad5s3c8d AcJc6s5d 4c9c2s9s 7c5h9hQc Tc3s9d6d AsTdQd8c Ks4dQh5c",
      Solver.process("omaha-holdem 2c3d6cQsTh Ks4dQh5c AsTdQd8c 2d8sKhJh Tc3s9d6d AcJc6s5d 4c9c2s9s Ad5s3c8d 7c5h9hQc"));
  }

  @Test
  public void test_omaha_holdem_7413_7s8sJdKsQd_5h2cJsTd_3c2hAd5d_4d6h2s3d_Kh6d6c3s_Qh7d8c7h_8dJcThQs_3hKc9h2d_7c4s9cTc_5s8hAcTs() {
    assertEquals(
      "4d6h2s3d 3c2hAd5d 5h2cJsTd Kh6d6c3s 3hKc9h2d 8dJcThQs Qh7d8c7h 7c4s9cTc 5s8hAcTs",
      Solver.process("omaha-holdem 7s8sJdKsQd 5h2cJsTd 3c2hAd5d 4d6h2s3d Kh6d6c3s Qh7d8c7h 8dJcThQs 3hKc9h2d 7c4s9cTc 5s8hAcTs"));
  }

  @Test
  public void test_omaha_holdem_7414_4h5d7c7dQs_5c4s2d6s_Qh6d7hTs_9sKcKd8c() {
    assertEquals(
      "5c4s2d6s 9sKcKd8c Qh6d7hTs",
      Solver.process("omaha-holdem 4h5d7c7dQs 5c4s2d6s Qh6d7hTs 9sKcKd8c"));
  }

  @Test
  public void test_omaha_holdem_7415_5c8hAdKcQd_9h9cJs2s_Qh5d9dTd_Th3c6d3d() {
    assertEquals(
      "Th3c6d3d 9h9cJs2s Qh5d9dTd",
      Solver.process("omaha-holdem 5c8hAdKcQd 9h9cJs2s Qh5d9dTd Th3c6d3d"));
  }

  @Test
  public void test_omaha_holdem_7416_5d6s8c9sJd_KsAcKcAh_2dQc2s8d() {
    assertEquals(
      "2dQc2s8d KsAcKcAh",
      Solver.process("omaha-holdem 5d6s8c9sJd KsAcKcAh 2dQc2s8d"));
  }

  @Test
  public void test_omaha_holdem_7417_2c5h7d9sKh_5c3cJc8d_6hQcJd3h_AcKcTc2s_2hTh9cAs_5s9dJh6c_TdKsQsTs_6d4s8c8s_7cQd6sJs() {
    assertEquals(
      "6hQcJd3h 5c3cJc8d 7cQd6sJs TdKsQsTs 2hTh9cAs 5s9dJh6c AcKcTc2s 6d4s8c8s",
      Solver.process("omaha-holdem 2c5h7d9sKh 5c3cJc8d 6hQcJd3h AcKcTc2s 2hTh9cAs 5s9dJh6c TdKsQsTs 6d4s8c8s 7cQd6sJs"));
  }

  @Test
  public void test_omaha_holdem_7418_4h5h6c7sTs_8s7d3d3c_2hQd2sJd_TcAcQs6h_7c5dKsAd_9c2dAs8h_Kd5sJs6s() {
    assertEquals(
      "2hQd2sJd Kd5sJs6s 7c5dKsAd TcAcQs6h 8s7d3d3c 9c2dAs8h",
      Solver.process("omaha-holdem 4h5h6c7sTs 8s7d3d3c 2hQd2sJd TcAcQs6h 7c5dKsAd 9c2dAs8h Kd5sJs6s"));
  }

  @Test
  public void test_omaha_holdem_7419_2s6d8c8s9c_QdJhTc5c_KcAs7d2c_KsAc7s4d_9sTs4hQc_8dTh8h6s_4s5d3hQh_2d9hQs6h_Ah4c5hJs() {
    assertEquals(
      "4s5d3hQh QdJhTc5c Ah4c5hJs KsAc7s4d KcAs7d2c 2d9hQs6h=9sTs4hQc 8dTh8h6s",
      Solver.process("omaha-holdem 2s6d8c8s9c QdJhTc5c KcAs7d2c KsAc7s4d 9sTs4hQc 8dTh8h6s 4s5d3hQh 2d9hQs6h Ah4c5hJs"));
  }

  @Test
  public void test_omaha_holdem_7420_2s4s5s6cJh_Ad9sQs2h_Jd8d7d5d_7h3sQd3h_9c5h6hKh_Ks8h4h8s_JsTs4c3d_As3c6s2d_TcKdAh8c_6dQcKc9h() {
    assertEquals(
      "TcKdAh8c 6dQcKc9h 9c5h6hKh 7h3sQd3h Jd8d7d5d JsTs4c3d Ad9sQs2h Ks8h4h8s As3c6s2d",
      Solver.process("omaha-holdem 2s4s5s6cJh Ad9sQs2h Jd8d7d5d 7h3sQd3h 9c5h6hKh Ks8h4h8s JsTs4c3d As3c6s2d TcKdAh8c 6dQcKc9h"));
  }

  @Test
  public void test_omaha_holdem_7421_4c4s8h9sJs_8dTcQsTd_As2c3s5s_2h2d7d7s_JcJdAd9h_Ah6h8sKc_5c7hQc8c_JhAc3dKd() {
    assertEquals(
      "2h2d7d7s 5c7hQc8c Ah6h8sKc JhAc3dKd 8dTcQsTd As2c3s5s JcJdAd9h",
      Solver.process("omaha-holdem 4c4s8h9sJs 8dTcQsTd As2c3s5s 2h2d7d7s JcJdAd9h Ah6h8sKc 5c7hQc8c JhAc3dKd"));
  }

  @Test
  public void test_omaha_holdem_7422_8d9sAhJcTd_Js4sTs2s_8s7d7c5d_Kc6d7s2d() {
    assertEquals(
      "Js4sTs2s Kc6d7s2d 8s7d7c5d",
      Solver.process("omaha-holdem 8d9sAhJcTd Js4sTs2s 8s7d7c5d Kc6d7s2d"));
  }

  @Test
  public void test_omaha_holdem_7423_7d9sAsTcTh_2s4s4h2d_Ah5dJcJh_8h7c7s6s_KcKd6d8d_5hQd4c2c_8sKs7h3s_JsQhAdTs_5s6c9h2h_5c4dJd9d() {
    assertEquals(
      "5hQd4c2c 2s4s4h2d 8sKs7h3s 5s6c9h2h 5c4dJd9d Ah5dJcJh KcKd6d8d 8h7c7s6s JsQhAdTs",
      Solver.process("omaha-holdem 7d9sAsTcTh 2s4s4h2d Ah5dJcJh 8h7c7s6s KcKd6d8d 5hQd4c2c 8sKs7h3s JsQhAdTs 5s6c9h2h 5c4dJd9d"));
  }

  @Test
  public void test_omaha_holdem_7424_2h4c6dKsQc_2cKd7dKh_4d6c4s7c_9sQh8h7h() {
    assertEquals(
      "9sQh8h7h 4d6c4s7c 2cKd7dKh",
      Solver.process("omaha-holdem 2h4c6dKsQc 2cKd7dKh 4d6c4s7c 9sQh8h7h"));
  }

  @Test
  public void test_omaha_holdem_7425_6s7dAcKcQh_8s5d8c8h_Kh3cJc9d_Qd9h6cJd_7h4s8dKd_2s6d2d5s_4c7c2cJs_Ks6h9sTc_7s3sAdTh() {
    assertEquals(
      "2s6d2d5s 4c7c2cJs 8s5d8c8h Kh3cJc9d Qd9h6cJd Ks6h9sTc 7h4s8dKd 7s3sAdTh",
      Solver.process("omaha-holdem 6s7dAcKcQh 8s5d8c8h Kh3cJc9d Qd9h6cJd 7h4s8dKd 2s6d2d5s 4c7c2cJs Ks6h9sTc 7s3sAdTh"));
  }

  @Test
  public void test_omaha_holdem_7426_3c5s9sJhQc_Jc9cAcKc_2hAs4h6c_Qs4cTd8c_Ad4dKdJs_QhAh5d6d_Ts7s9h8d() {
    assertEquals(
      "2hAs4h6c Ad4dKdJs Jc9cAcKc QhAh5d6d Qs4cTd8c=Ts7s9h8d",
      Solver.process("omaha-holdem 3c5s9sJhQc Jc9cAcKc 2hAs4h6c Qs4cTd8c Ad4dKdJs QhAh5d6d Ts7s9h8d"));
  }

  @Test
  public void test_omaha_holdem_7427_2d4sAcAsJc_6dJs3dAd_8s6s7cQh_4h2cTdKc_JhTs4c2s_6c3c9cQc_Th5s5hQs() {
    assertEquals(
      "8s6s7cQh 6c3c9cQc 4h2cTdKc Th5s5hQs JhTs4c2s 6dJs3dAd",
      Solver.process("omaha-holdem 2d4sAcAsJc 6dJs3dAd 8s6s7cQh 4h2cTdKc JhTs4c2s 6c3c9cQc Th5s5hQs"));
  }

  @Test
  public void test_omaha_holdem_7428_6d7sAcJcTh_4h8h3c2h_8cTd8dQd_7hAh8s4c_Kh6hJd7d_Ad9cJhAs_5sQcKdTc() {
    assertEquals(
      "4h8h3c2h 8cTd8dQd Kh6hJd7d 7hAh8s4c Ad9cJhAs 5sQcKdTc",
      Solver.process("omaha-holdem 6d7sAcJcTh 4h8h3c2h 8cTd8dQd 7hAh8s4c Kh6hJd7d Ad9cJhAs 5sQcKdTc"));
  }

  @Test
  public void test_omaha_holdem_7429_2s3sAcKsTh_3c2hAhTs_7c5dQs4c_JsQh9h5c_4dQc3dJc_AsKd3h8s_8dKh7d4h() {
    assertEquals(
      "8dKh7d4h 3c2hAhTs 7c5dQs4c 4dQc3dJc=JsQh9h5c AsKd3h8s",
      Solver.process("omaha-holdem 2s3sAcKsTh 3c2hAhTs 7c5dQs4c JsQh9h5c 4dQc3dJc AsKd3h8s 8dKh7d4h"));
  }

  @Test
  public void test_omaha_holdem_7430_2d2h5d8c8h_AhAs6sQd_Td3hAcJs_KhAdQs4h_3c5s7cJd_9d6c4d2s_2c7h3d5h() {
    assertEquals(
      "Td3hAcJs KhAdQs4h 3c5s7cJd AhAs6sQd 9d6c4d2s 2c7h3d5h",
      Solver.process("omaha-holdem 2d2h5d8c8h AhAs6sQd Td3hAcJs KhAdQs4h 3c5s7cJd 9d6c4d2s 2c7h3d5h"));
  }

  @Test
  public void test_omaha_holdem_7431_5c6c6s9sTc_2h7hAd2c_3c4sThJc_4h5sKd7d_Ks2d3hQh_As7c5hQc_3dQs4d8h_5dTdAc3s() {
    assertEquals(
      "3dQs4d8h Ks2d3hQh 2h7hAd2c 4h5sKd7d 5dTdAc3s 3c4sThJc As7c5hQc",
      Solver.process("omaha-holdem 5c6c6s9sTc 2h7hAd2c 3c4sThJc 4h5sKd7d Ks2d3hQh As7c5hQc 3dQs4d8h 5dTdAc3s"));
  }

  @Test
  public void test_omaha_holdem_7432_9d9hAdJcTc_Kd7h3sQd_Qs5c5sJs_QhKsTsAs_Ac7s4d7d() {
    assertEquals(
      "Qs5c5sJs Ac7s4d7d Kd7h3sQd=QhKsTsAs",
      Solver.process("omaha-holdem 9d9hAdJcTc Kd7h3sQd Qs5c5sJs QhKsTsAs Ac7s4d7d"));
  }

  @Test
  public void test_omaha_holdem_7433_6d6h8dTcTd_Ac5h5s8h_9d3h4s7s_Qh2cKd3d_8c7c4c9h_7hJc3sQc_QdTsKsQs_2h9sKhJh() {
    assertEquals(
      "7hJc3sQc 2h9sKhJh Ac5h5s8h QdTsKsQs 8c7c4c9h=9d3h4s7s Qh2cKd3d",
      Solver.process("omaha-holdem 6d6h8dTcTd Ac5h5s8h 9d3h4s7s Qh2cKd3d 8c7c4c9h 7hJc3sQc QdTsKsQs 2h9sKhJh"));
  }

  @Test
  public void test_omaha_holdem_7434_3s4s7d8hAc_Ks6d8sQh_5h5dJd3d_TcAhKdTh_9sJs9dTs_QdJh7c9h_7s5c7h3c_Td9cQs8d_AsKh6c8c() {
    assertEquals(
      "5h5dJd3d QdJh7c9h Td9cQs8d Ks6d8sQh 9sJs9dTs TcAhKdTh AsKh6c8c 7s5c7h3c",
      Solver.process("omaha-holdem 3s4s7d8hAc Ks6d8sQh 5h5dJd3d TcAhKdTh 9sJs9dTs QdJh7c9h 7s5c7h3c Td9cQs8d AsKh6c8c"));
  }

  @Test
  public void test_omaha_holdem_7435_4c6s9dKsTs_3s4h9cQh_3dJcQc6c_Ah6h9h2d() {
    assertEquals(
      "3s4h9cQh Ah6h9h2d 3dJcQc6c",
      Solver.process("omaha-holdem 4c6s9dKsTs 3s4h9cQh 3dJcQc6c Ah6h9h2d"));
  }

  @Test
  public void test_omaha_holdem_7436_7s9sAdJsKc_6c9c9h5h_6dKd3sQd_3d2cTdAh_9d6h8hTs_3cTc7hTh() {
    assertEquals(
      "3cTc7hTh 6dKd3sQd 3d2cTdAh 6c9c9h5h 9d6h8hTs",
      Solver.process("omaha-holdem 7s9sAdJsKc 6c9c9h5h 6dKd3sQd 3d2cTdAh 9d6h8hTs 3cTc7hTh"));
  }

  @Test
  public void test_omaha_holdem_7437_2d7hAsQhTh_2s9h3sTc_9d8sJs2h_6sAc4d7c() {
    assertEquals(
      "9d8sJs2h 2s9h3sTc 6sAc4d7c",
      Solver.process("omaha-holdem 2d7hAsQhTh 2s9h3sTc 9d8sJs2h 6sAc4d7c"));
  }

  @Test
  public void test_omaha_holdem_7438_2d3d5h9d9h_8c7s9cTc_6d8sKd6h_7dKh3hQs_JhTd5c3c_QhAh8dQd() {
    assertEquals(
      "7dKh3hQs JhTd5c3c 8c7s9cTc QhAh8dQd 6d8sKd6h",
      Solver.process("omaha-holdem 2d3d5h9d9h 8c7s9cTc 6d8sKd6h 7dKh3hQs JhTd5c3c QhAh8dQd"));
  }

  @Test
  public void test_omaha_holdem_7439_6cAsJsQcQd_5d9cKc3d_Td4h9s7h_Ad2hQsJc() {
    assertEquals(
      "Td4h9s7h 5d9cKc3d Ad2hQsJc",
      Solver.process("omaha-holdem 6cAsJsQcQd 5d9cKc3d Td4h9s7h Ad2hQsJc"));
  }

  @Test
  public void test_omaha_holdem_7440_3h5c6cAcAh_JdKd8hAd_2d2c6s7s_5sQd4h7h_4d7cTd5d_3s6d6hTs_7dTc8d9c() {
    assertEquals(
      "2d2c6s7s JdKd8hAd 4d7cTd5d=5sQd4h7h 7dTc8d9c 3s6d6hTs",
      Solver.process("omaha-holdem 3h5c6cAcAh JdKd8hAd 2d2c6s7s 5sQd4h7h 4d7cTd5d 3s6d6hTs 7dTc8d9c"));
  }

  @Test
  public void test_omaha_holdem_7441_4s6h7c8c9s_2cAc8h2d_4d4cTdQh_JcQcAh6c_5hJs3cAs_JhTs7hKd_KsTh5d3s_7d9c9h5c_Qs2h3d5s() {
    assertEquals(
      "JcQcAh6c 2cAc8h2d 4d4cTdQh 5hJs3cAs=KsTh5d3s=Qs2h3d5s 7d9c9h5c JhTs7hKd",
      Solver.process("omaha-holdem 4s6h7c8c9s 2cAc8h2d 4d4cTdQh JcQcAh6c 5hJs3cAs JhTs7hKd KsTh5d3s 7d9c9h5c Qs2h3d5s"));
  }

  @Test
  public void test_omaha_holdem_7442_2d4h9dAcTd_QdAs9hKh_Kc2cQcKd() {
    assertEquals(
      "Kc2cQcKd QdAs9hKh",
      Solver.process("omaha-holdem 2d4h9dAcTd QdAs9hKh Kc2cQcKd"));
  }

  @Test
  public void test_omaha_holdem_7443_4d5cAdKcQc_6cTdKsAh_QdJs8s9d_7h6dQs8c() {
    assertEquals(
      "7h6dQs8c QdJs8s9d 6cTdKsAh",
      Solver.process("omaha-holdem 4d5cAdKcQc 6cTdKsAh QdJs8s9d 7h6dQs8c"));
  }

  @Test
  public void test_omaha_holdem_7444_6c8sAsJsQh_2sKhQdJc_3h5d9s9c_Tc7h3c7c_5hQsTd8c_Ac4c4hKc_9h5s3d9d_7s6hTh8h_3s6s5c2d() {
    assertEquals(
      "Tc7h3c7c 3h5d9s9c=9h5s3d9d Ac4c4hKc 7s6hTh8h 5hQsTd8c 2sKhQdJc 3s6s5c2d",
      Solver.process("omaha-holdem 6c8sAsJsQh 2sKhQdJc 3h5d9s9c Tc7h3c7c 5hQsTd8c Ac4c4hKc 9h5s3d9d 7s6hTh8h 3s6s5c2d"));
  }

  @Test
  public void test_omaha_holdem_7445_2c3h4sAdKs_8s4dTdAs_9s2h3s6c() {
    assertEquals(
      "9s2h3s6c 8s4dTdAs",
      Solver.process("omaha-holdem 2c3h4sAdKs 8s4dTdAs 9s2h3s6c"));
  }

  @Test
  public void test_omaha_holdem_7446_5s7c8c9hTc_7hAc3d4c_4s3h5cAh_QsQcJc5h_7s3sJsKc_Kh8s9s2h_4d5d8d2d_9cJh7dQh() {
    assertEquals(
      "4s3h5cAh 4d5d8d2d Kh8s9s2h 7s3sJsKc 9cJh7dQh QsQcJc5h 7hAc3d4c",
      Solver.process("omaha-holdem 5s7c8c9hTc 7hAc3d4c 4s3h5cAh QsQcJc5h 7s3sJsKc Kh8s9s2h 4d5d8d2d 9cJh7dQh"));
  }

  @Test
  public void test_omaha_holdem_7447_3d4s7d9hJh_8hTcTd3c_5c2d5sQs_Ad6s2c4c_Ts9sAh7s_Qh5hKcJs_Kd4d3h9c_8sQdQc2h_8d5d8c7h_4h3sAcAs() {
    assertEquals(
      "Ad6s2c4c 5c2d5sQs 8d5d8c7h Qh5hKcJs 8sQdQc2h 4h3sAcAs Kd4d3h9c Ts9sAh7s 8hTcTd3c",
      Solver.process("omaha-holdem 3d4s7d9hJh 8hTcTd3c 5c2d5sQs Ad6s2c4c Ts9sAh7s Qh5hKcJs Kd4d3h9c 8sQdQc2h 8d5d8c7h 4h3sAcAs"));
  }

  @Test
  public void test_omaha_holdem_7448_6c9cKdKsTc_8s5d9s6h_6d6s5s7c_2sJh4h7h_Ad2h5hJs() {
    assertEquals(
      "2sJh4h7h Ad2h5hJs 8s5d9s6h 6d6s5s7c",
      Solver.process("omaha-holdem 6c9cKdKsTc 8s5d9s6h 6d6s5s7c 2sJh4h7h Ad2h5hJs"));
  }

  @Test
  public void test_omaha_holdem_7449_3c6hAsQsTs_4c6dTd7d_2dTh5h9s_QcKd7c7s() {
    assertEquals(
      "2dTh5h9s QcKd7c7s 4c6dTd7d",
      Solver.process("omaha-holdem 3c6hAsQsTs 4c6dTd7d 2dTh5h9s QcKd7c7s"));
  }

  @Test
  public void test_omaha_holdem_7450_2c2sKcKsQh_3cAh5c7h_QcJs2dAc_JhKhTd9c_9h4h6d8s_Kd9s3dJc_5s5h5d6h_Jd7c7s3s() {
    assertEquals(
      "9h4h6d8s 3cAh5c7h 5s5h5d6h Jd7c7s3s JhKhTd9c=Kd9s3dJc QcJs2dAc",
      Solver.process("omaha-holdem 2c2sKcKsQh 3cAh5c7h QcJs2dAc JhKhTd9c 9h4h6d8s Kd9s3dJc 5s5h5d6h Jd7c7s3s"));
  }

  @Test
  public void test_omaha_holdem_7451_6h8c8sJcJs_5c5dQh3s_6c9dTc3c_Qc7c4c5s_Td4d2cAh_6s8hKd7s_KhQd6d3h_4h7dAcQs_2d9cKs5h_7h8d2sTs() {
    assertEquals(
      "Qc7c4c5s 2d9cKs5h Td4d2cAh 4h7dAcQs 5c5dQh3s 6c9dTc3c KhQd6d3h 7h8d2sTs 6s8hKd7s",
      Solver.process("omaha-holdem 6h8c8sJcJs 5c5dQh3s 6c9dTc3c Qc7c4c5s Td4d2cAh 6s8hKd7s KhQd6d3h 4h7dAcQs 2d9cKs5h 7h8d2sTs"));
  }

  @Test
  public void test_omaha_holdem_7452_6d9dAdKsTd_Qh5hJc2d_6c8s5s2s_8h5dAh9s_4sQd6hAs_2c4hThJh_2h9c8c5c_7cQs8dTs_Kd3c4dJd() {
    assertEquals(
      "6c8s5s2s 2h9c8c5c 2c4hThJh 4sQd6hAs 8h5dAh9s 7cQs8dTs Qh5hJc2d Kd3c4dJd",
      Solver.process("omaha-holdem 6d9dAdKsTd Qh5hJc2d 6c8s5s2s 8h5dAh9s 4sQd6hAs 2c4hThJh 2h9c8c5c 7cQs8dTs Kd3c4dJd"));
  }

  @Test
  public void test_omaha_holdem_7453_2d2h3c3s7s_7hKs8s8c_7d5h9dQc_6hJs2cTc_As4s3dJd() {
    assertEquals(
      "7d5h9dQc 7hKs8s8c 6hJs2cTc As4s3dJd",
      Solver.process("omaha-holdem 2d2h3c3s7s 7hKs8s8c 7d5h9dQc 6hJs2cTc As4s3dJd"));
  }

  @Test
  public void test_omaha_holdem_7454_4h4s8hQhTh_Qc8c2dAd_9cTsJhJc_7c5s4c6c_Ac8s8d6d_5c3h7dAs_Kh4dKs6s_7sQsAh5h_3c6hQdKd() {
    assertEquals(
      "5c3h7dAs 3c6hQdKd Qc8c2dAd 7c5s4c6c Kh4dKs6s 9cTsJhJc 7sQsAh5h Ac8s8d6d",
      Solver.process("omaha-holdem 4h4s8hQhTh Qc8c2dAd 9cTsJhJc 7c5s4c6c Ac8s8d6d 5c3h7dAs Kh4dKs6s 7sQsAh5h 3c6hQdKd"));
  }

  @Test
  public void test_omaha_holdem_7455_5c5d7cJdJs_Td3cAc6h_4dQcTsQh_9s2d3dAs_ThJh5hKd_6cJc4s7d() {
    assertEquals(
      "9s2d3dAs Td3cAc6h 4dQcTsQh ThJh5hKd 6cJc4s7d",
      Solver.process("omaha-holdem 5c5d7cJdJs Td3cAc6h 4dQcTsQh 9s2d3dAs ThJh5hKd 6cJc4s7d"));
  }

  @Test
  public void test_omaha_holdem_7456_3h4c4hAsQs_5cQcTsKh_9s3sThTd_Kd8d9dQh_Jd8sTc6d() {
    assertEquals(
      "Jd8sTc6d 9s3sThTd 5cQcTsKh=Kd8d9dQh",
      Solver.process("omaha-holdem 3h4c4hAsQs 5cQcTsKh 9s3sThTd Kd8d9dQh Jd8sTc6d"));
  }

  @Test
  public void test_omaha_holdem_7457_6c8c8hQsTh_QdTs4cQh_8s7cKsAh() {
    assertEquals(
      "8s7cKsAh QdTs4cQh",
      Solver.process("omaha-holdem 6c8c8hQsTh QdTs4cQh 8s7cKsAh"));
  }

  @Test
  public void test_omaha_holdem_7458_3h5d7sJhQh_8dQs2h9c_6dJsAs3c_Jc5c5s8h() {
    assertEquals(
      "8dQs2h9c 6dJsAs3c Jc5c5s8h",
      Solver.process("omaha-holdem 3h5d7sJhQh 8dQs2h9c 6dJsAs3c Jc5c5s8h"));
  }

  @Test
  public void test_omaha_holdem_7459_2d2h3d6dJh_Qh3sKdAd_AsQc9dAh_Js4sKc6s_6c3hTsQs() {
    assertEquals(
      "6c3hTsQs Js4sKc6s AsQc9dAh Qh3sKdAd",
      Solver.process("omaha-holdem 2d2h3d6dJh Qh3sKdAd AsQc9dAh Js4sKc6s 6c3hTsQs"));
  }

  @Test
  public void test_omaha_holdem_7460_2c4d7d9dJc_3c7s8cTh_Jd8s9sTd_9c4s3h5h_JhTc4c8d() {
    assertEquals(
      "9c4s3h5h 3c7s8cTh=JhTc4c8d Jd8s9sTd",
      Solver.process("omaha-holdem 2c4d7d9dJc 3c7s8cTh Jd8s9sTd 9c4s3h5h JhTc4c8d"));
  }

  @Test
  public void test_omaha_holdem_7461_6s7dJdKcTc_JsAcQd7c_Kd4d9dKs_2c9cAh8c_2h7h3dQh_Td2sQc2d() {
    assertEquals(
      "2h7h3dQh Td2sQc2d Kd4d9dKs 2c9cAh8c JsAcQd7c",
      Solver.process("omaha-holdem 6s7dJdKcTc JsAcQd7c Kd4d9dKs 2c9cAh8c 2h7h3dQh Td2sQc2d"));
  }

  @Test
  public void test_omaha_holdem_7462_3c7d8sAdTc_KdQsKsAh_Qc8hJs6h_4h9d6c5h_Jh3d4d2s() {
    assertEquals(
      "Jh3d4d2s Qc8hJs6h KdQsKsAh 4h9d6c5h",
      Solver.process("omaha-holdem 3c7d8sAdTc KdQsKsAh Qc8hJs6h 4h9d6c5h Jh3d4d2s"));
  }

  @Test
  public void test_omaha_holdem_7463_4h8sAdKdQh_3c3h6sAh_2hQc5dQs_9s4sJc6h_9dTc6c8c_3sTs8h7h_5s3dQd5c() {
    assertEquals(
      "9s4sJc6h 3sTs8h7h=9dTc6c8c 5s3dQd5c 3c3h6sAh 2hQc5dQs",
      Solver.process("omaha-holdem 4h8sAdKdQh 3c3h6sAh 2hQc5dQs 9s4sJc6h 9dTc6c8c 3sTs8h7h 5s3dQd5c"));
  }

  @Test
  public void test_omaha_holdem_7464_3hAcKcTcTs_KdQs7d4d_5dTh8c2h_3s7hKsJh_2d4c3dKh_Qh8sQd5h_5sAd6hJc_6c7cQc2c() {
    assertEquals(
      "Qh8sQd5h 2d4c3dKh 3s7hKsJh KdQs7d4d 5sAd6hJc 5dTh8c2h 6c7cQc2c",
      Solver.process("omaha-holdem 3hAcKcTcTs KdQs7d4d 5dTh8c2h 3s7hKsJh 2d4c3dKh Qh8sQd5h 5sAd6hJc 6c7cQc2c"));
  }

  @Test
  public void test_omaha_holdem_7465_2d6h8h9dJs_8d3cTd2s_6s2cQc9c_9sAh4d3s_7c6c7d4s() {
    assertEquals(
      "7c6c7d4s 9sAh4d3s 8d3cTd2s 6s2cQc9c",
      Solver.process("omaha-holdem 2d6h8h9dJs 8d3cTd2s 6s2cQc9c 9sAh4d3s 7c6c7d4s"));
  }

  @Test
  public void test_omaha_holdem_7466_3d4s5s7dTs_Qc9s7cJh_2d4cAc3h() {
    assertEquals(
      "Qc9s7cJh 2d4cAc3h",
      Solver.process("omaha-holdem 3d4s5s7dTs Qc9s7cJh 2d4cAc3h"));
  }

  @Test
  public void test_omaha_holdem_7467_5d6d7d9dTd_8h5c6hKs_5hQs3c9s_Ts3d2dKc_Js7cQcQh_KdKhQd4s_Th2hTc8d_3h8cAh4c() {
    assertEquals(
      "Js7cQcQh 5hQs3c9s 3h8cAh4c 8h5c6hKs=Th2hTc8d Ts3d2dKc KdKhQd4s",
      Solver.process("omaha-holdem 5d6d7d9dTd 8h5c6hKs 5hQs3c9s Ts3d2dKc Js7cQcQh KdKhQd4s Th2hTc8d 3h8cAh4c"));
  }

  @Test
  public void test_omaha_holdem_7468_3cAcJdJhQd_6hAhKcTd_7h4h5d4s_3d7c3s2h_2d7s4d5h_9d3hQc6d_8hKh8c5s_Ts9h6sAs() {
    assertEquals(
      "2d7s4d5h 7h4h5d4s 8hKh8c5s 9d3hQc6d Ts9h6sAs 6hAhKcTd 3d7c3s2h",
      Solver.process("omaha-holdem 3cAcJdJhQd 6hAhKcTd 7h4h5d4s 3d7c3s2h 2d7s4d5h 9d3hQc6d 8hKh8c5s Ts9h6sAs"));
  }

  @Test
  public void test_omaha_holdem_7469_4h7s8c8d9c_Kd5d2h3s_9h6c6d2d_Qh5hQs5s_4sKh7cQd() {
    assertEquals(
      "Kd5d2h3s 4sKh7cQd 9h6c6d2d Qh5hQs5s",
      Solver.process("omaha-holdem 4h7s8c8d9c Kd5d2h3s 9h6c6d2d Qh5hQs5s 4sKh7cQd"));
  }

  @Test
  public void test_omaha_holdem_7470_2h5h7dAdKs_5c2dThAc_Js9s4d4c_4sQd4h8d_6d7h3d6c_2c3s3hJc_TcKhQhQc_Jd6h9d7s_2sAhTsQs() {
    assertEquals(
      "2c3s3hJc 4sQd4h8d=Js9s4d4c 6d7h3d6c Jd6h9d7s TcKhQhQc 2sAhTsQs 5c2dThAc",
      Solver.process("omaha-holdem 2h5h7dAdKs 5c2dThAc Js9s4d4c 4sQd4h8d 6d7h3d6c 2c3s3hJc TcKhQhQc Jd6h9d7s 2sAhTsQs"));
  }

  @Test
  public void test_omaha_holdem_7471_2s4h8d9sTh_7d6c5d7s_6h5cJh3c_8cAcTcAd_QsTs4dTd_Ks4s8hQc_7c6s7hKh_9d8sAs2d_3d5h6d2c_AhKcQd3h() {
    assertEquals(
      "6h5cJh3c AhKcQd3h 3d5h6d2c Ks4s8hQc 9d8sAs2d 8cAcTcAd QsTs4dTd 7c6s7hKh=7d6c5d7s",
      Solver.process("omaha-holdem 2s4h8d9sTh 7d6c5d7s 6h5cJh3c 8cAcTcAd QsTs4dTd Ks4s8hQc 7c6s7hKh 9d8sAs2d 3d5h6d2c AhKcQd3h"));
  }

  @Test
  public void test_omaha_holdem_7472_9d9sAhAsJh_Kd8h4h6s_7hTd9h3d_5hQs7dAc_Ks9c3h4c() {
    assertEquals(
      "Kd8h4h6s 7hTd9h3d Ks9c3h4c 5hQs7dAc",
      Solver.process("omaha-holdem 9d9sAhAsJh Kd8h4h6s 7hTd9h3d 5hQs7dAc Ks9c3h4c"));
  }

  @Test
  public void test_omaha_holdem_7473_2c9cAdKcQc_6hAh9sJd_3s4hTs3h_Qd4sKh3d_6s2d8s7s_7d7h9hKd() {
    assertEquals(
      "6s2d8s7s 3s4hTs3h 7d7h9hKd Qd4sKh3d 6hAh9sJd",
      Solver.process("omaha-holdem 2c9cAdKcQc 6hAh9sJd 3s4hTs3h Qd4sKh3d 6s2d8s7s 7d7h9hKd"));
  }

  @Test
  public void test_omaha_holdem_7474_3c7d8sQhTc_Ks9hTd4c_6hAc9d6s_3s3h5hJc_8hAd4h6d_KcQd9s3d_Kd8d5sJd() {
    assertEquals(
      "Kd8d5sJd 8hAd4h6d Ks9hTd4c KcQd9s3d 3s3h5hJc 6hAc9d6s",
      Solver.process("omaha-holdem 3c7d8sQhTc Ks9hTd4c 6hAc9d6s 3s3h5hJc 8hAd4h6d KcQd9s3d Kd8d5sJd"));
  }

  @Test
  public void test_omaha_holdem_7475_2c2s6sQdTc_Jh8c3cKs_9dQh2dAs() {
    assertEquals(
      "Jh8c3cKs 9dQh2dAs",
      Solver.process("omaha-holdem 2c2s6sQdTc Jh8c3cKs 9dQh2dAs"));
  }

  @Test
  public void test_omaha_holdem_7476_2c3s5h6cAh_KdQs9h7s_7cJsAcJd_8h8s2h4h_Qc2s2dJh_8cKs9d3h_8d4s5c5s_3c4d9cKc() {
    assertEquals(
      "KdQs9h7s 8cKs9d3h 7cJsAcJd Qc2s2dJh 3c4d9cKc=8d4s5c5s=8h8s2h4h",
      Solver.process("omaha-holdem 2c3s5h6cAh KdQs9h7s 7cJsAcJd 8h8s2h4h Qc2s2dJh 8cKs9d3h 8d4s5c5s 3c4d9cKc"));
  }

  @Test
  public void test_omaha_holdem_7477_9d9h9sKdTd_3h4h7d4d_8s4sKcKh_6d8cQh6h() {
    assertEquals(
      "3h4h7d4d 6d8cQh6h 8s4sKcKh",
      Solver.process("omaha-holdem 9d9h9sKdTd 3h4h7d4d 8s4sKcKh 6d8cQh6h"));
  }

  @Test
  public void test_omaha_holdem_7478_8h9dJcQhTd_8c7h3h8d_5d5s5c8s_QdTs4d4h_2c7c5hQc_6h2h6c9h_6sQsKd9c_7sAdAs6d() {
    assertEquals(
      "5d5s5c8s 6h2h6c9h 2c7c5hQc 7sAdAs6d 8c7h3h8d QdTs4d4h 6sQsKd9c",
      Solver.process("omaha-holdem 8h9dJcQhTd 8c7h3h8d 5d5s5c8s QdTs4d4h 2c7c5hQc 6h2h6c9h 6sQsKd9c 7sAdAs6d"));
  }

  @Test
  public void test_omaha_holdem_7479_6c6h7sAcQc_6d7dKsQd_7hQh2dJh_9d5h2s4s_8d3hJd5s_5d8hKcTc_7c8c3dTd_5cJsTh2c_As9cKdTs_Kh8sAh4c() {
    assertEquals(
      "9d5h2s4s 8d3hJd5s 7hQh2dJh As9cKdTs=Kh8sAh4c 5cJsTh2c 7c8c3dTd 5d8hKcTc 6d7dKsQd",
      Solver.process("omaha-holdem 6c6h7sAcQc 6d7dKsQd 7hQh2dJh 9d5h2s4s 8d3hJd5s 5d8hKcTc 7c8c3dTd 5cJsTh2c As9cKdTs Kh8sAh4c"));
  }

  @Test
  public void test_omaha_holdem_7480_2s3h9cAhQh_5dTd2hJs_3s5cJd8d_3c6dThKd_3d9sKsQd_8sKc4cTs_8h4hKh4d_2d2c6c7d_7s4s5sQs() {
    assertEquals(
      "8sKc4cTs 5dTd2hJs 3s5cJd8d 3c6dThKd 3d9sKsQd 2d2c6c7d 7s4s5sQs 8h4hKh4d",
      Solver.process("omaha-holdem 2s3h9cAhQh 5dTd2hJs 3s5cJd8d 3c6dThKd 3d9sKsQd 8sKc4cTs 8h4hKh4d 2d2c6c7d 7s4s5sQs"));
  }

  @Test
  public void test_omaha_holdem_7481_2h7c7d8c9s_8hAcQc4c_4s8d2c5d_4h9cAdKs_Kd9dKc2s_7s3d3s8s_7hAhTh3c_5cTcJhQs() {
    assertEquals(
      "4s8d2c5d 8hAcQc4c 4h9cAdKs Kd9dKc2s 7hAhTh3c 5cTcJhQs 7s3d3s8s",
      Solver.process("omaha-holdem 2h7c7d8c9s 8hAcQc4c 4s8d2c5d 4h9cAdKs Kd9dKc2s 7s3d3s8s 7hAhTh3c 5cTcJhQs"));
  }

  @Test
  public void test_omaha_holdem_7482_2d6h8hKcKd_KsJh4h3c_5d3s5s8s_8d5c6d4d_Ah5h9sJs() {
    assertEquals(
      "Ah5h9sJs 5d3s5s8s 8d5c6d4d KsJh4h3c",
      Solver.process("omaha-holdem 2d6h8hKcKd KsJh4h3c 5d3s5s8s 8d5c6d4d Ah5h9sJs"));
  }

  @Test
  public void test_omaha_holdem_7483_3c8d8sAcQh_7d4s6hTc_6d3dJhJs_7cJdJc8h() {
    assertEquals(
      "7d4s6hTc 6d3dJhJs 7cJdJc8h",
      Solver.process("omaha-holdem 3c8d8sAcQh 7d4s6hTc 6d3dJhJs 7cJdJc8h"));
  }

  @Test
  public void test_omaha_holdem_7484_4s9hAhKsTd_9dJsAc8s_Kh4c6s4h_2s3dQh5s_2d9s7sAd_8c8dQc9c_TcTsJd3h() {
    assertEquals(
      "2s3dQh5s 8c8dQc9c 2d9s7sAd=9dJsAc8s Kh4c6s4h TcTsJd3h",
      Solver.process("omaha-holdem 4s9hAhKsTd 9dJsAc8s Kh4c6s4h 2s3dQh5s 2d9s7sAd 8c8dQc9c TcTsJd3h"));
  }

  @Test
  public void test_omaha_holdem_7485_2h8s9sAcTc_6cAsJdKc_Ts2cJsJc_Qc5d4d3d_Qs7cKsAd_7dTdKd5h() {
    assertEquals(
      "Qc5d4d3d 7dTdKd5h 6cAsJdKc=Qs7cKsAd Ts2cJsJc",
      Solver.process("omaha-holdem 2h8s9sAcTc 6cAsJdKc Ts2cJsJc Qc5d4d3d Qs7cKsAd 7dTdKd5h"));
  }

  @Test
  public void test_omaha_holdem_7486_4c6d7s8dAs_3h9d9s9h_2sAd9cJd() {
    assertEquals(
      "3h9d9s9h 2sAd9cJd",
      Solver.process("omaha-holdem 4c6d7s8dAs 3h9d9s9h 2sAd9cJd"));
  }

  @Test
  public void test_omaha_holdem_7487_2d3c3d6sJs_6d9d5cTd_Jc7dQh2h_Jh8h3h7c_Ad2cKcTc_6h4cJdTh() {
    assertEquals(
      "Ad2cKcTc 6d9d5cTd Jc7dQh2h 6h4cJdTh Jh8h3h7c",
      Solver.process("omaha-holdem 2d3c3d6sJs 6d9d5cTd Jc7dQh2h Jh8h3h7c Ad2cKcTc 6h4cJdTh"));
  }

  @Test
  public void test_omaha_holdem_7488_3s4c4d4sQd_7s9d7h4h_7d3d9s3h_7cKh9c9h() {
    assertEquals(
      "7d3d9s3h 7cKh9c9h 7s9d7h4h",
      Solver.process("omaha-holdem 3s4c4d4sQd 7s9d7h4h 7d3d9s3h 7cKh9c9h"));
  }

  @Test
  public void test_omaha_holdem_7489_4d5sAcAdKd_8d7d7sQs_Kh6d3d5h_JsKs9d8c_2c4h8sJd_Jh2sAh3s_QhJc3cAs() {
    assertEquals(
      "2c4h8sJd JsKs9d8c QhJc3cAs Jh2sAh3s Kh6d3d5h 8d7d7sQs",
      Solver.process("omaha-holdem 4d5sAcAdKd 8d7d7sQs Kh6d3d5h JsKs9d8c 2c4h8sJd Jh2sAh3s QhJc3cAs"));
  }

  @Test
  public void test_omaha_holdem_7490_3c4d7sAdJc_9c7h2sTh_Tc8c2cJd_6d2hQd3h_Qc7c3dTs_8dJsQsQh() {
    assertEquals(
      "6d2hQd3h 9c7h2sTh Tc8c2cJd 8dJsQsQh Qc7c3dTs",
      Solver.process("omaha-holdem 3c4d7sAdJc 9c7h2sTh Tc8c2cJd 6d2hQd3h Qc7c3dTs 8dJsQsQh"));
  }

  @Test
  public void test_omaha_holdem_7491_2c2d3h8sQc_5h9dQs2h_6sQd3c3d_Kd7c5d6h() {
    assertEquals(
      "Kd7c5d6h 5h9dQs2h 6sQd3c3d",
      Solver.process("omaha-holdem 2c2d3h8sQc 5h9dQs2h 6sQd3c3d Kd7c5d6h"));
  }

  @Test
  public void test_omaha_holdem_7492_2c3c5c9dTh_Ah8c4s6d_6h7cQd2d_8hTcQsAc_9cTd6sTs_8s7s9sJd_As3s6c9h_7h4hKs8d() {
    assertEquals(
      "7h4hKs8d 6h7cQd2d 8s7s9sJd As3s6c9h 9cTd6sTs Ah8c4s6d 8hTcQsAc",
      Solver.process("omaha-holdem 2c3c5c9dTh Ah8c4s6d 6h7cQd2d 8hTcQsAc 9cTd6sTs 8s7s9sJd As3s6c9h 7h4hKs8d"));
  }

  @Test
  public void test_omaha_holdem_7493_2c2d9c9dAc_Ah6c7c8s_Tc2h4dKh_Jc5s4hKd_5dThJh8d_Td4s3c7s_Js8cQs3d() {
    assertEquals(
      "Td4s3c7s 5dThJh8d Js8cQs3d Jc5s4hKd Tc2h4dKh Ah6c7c8s",
      Solver.process("omaha-holdem 2c2d9c9dAc Ah6c7c8s Tc2h4dKh Jc5s4hKd 5dThJh8d Td4s3c7s Js8cQs3d"));
  }

  @Test
  public void test_omaha_holdem_7494_5dKdKsQsTc_JsKh6s5s_2s9h6c3d() {
    assertEquals(
      "2s9h6c3d JsKh6s5s",
      Solver.process("omaha-holdem 5dKdKsQsTc JsKh6s5s 2s9h6c3d"));
  }

  @Test
  public void test_omaha_holdem_7495_2h6cAsJdQd_4dQcKh2d_2c3h7d4c_7c3sJsTd_QhThKc8c_Kd4hAc6h_9hTc3cQs_5dKs8d8h() {
    assertEquals(
      "2c3h7d4c 5dKs8d8h 7c3sJsTd 9hTc3cQs 4dQcKh2d Kd4hAc6h QhThKc8c",
      Solver.process("omaha-holdem 2h6cAsJdQd 4dQcKh2d 2c3h7d4c 7c3sJsTd QhThKc8c Kd4hAc6h 9hTc3cQs 5dKs8d8h"));
  }

  @Test
  public void test_omaha_holdem_7496_6h7hJhKsTc_5cThAh5s_4s9c6sJs() {
    assertEquals(
      "4s9c6sJs 5cThAh5s",
      Solver.process("omaha-holdem 6h7hJhKsTc 5cThAh5s 4s9c6sJs"));
  }

  @Test
  public void test_omaha_holdem_7497_3s6cJsKdQh_4d4c8c3d_Td6h2s3c_Jd7c9h7d_QsAc2dAh() {
    assertEquals(
      "4d4c8c3d Jd7c9h7d QsAc2dAh Td6h2s3c",
      Solver.process("omaha-holdem 3s6cJsKdQh 4d4c8c3d Td6h2s3c Jd7c9h7d QsAc2dAh"));
  }

  @Test
  public void test_omaha_holdem_7498_4s9sKsTcTs_AcQs7hJs_6cJc7c5h_Kd6s9cAh() {
    assertEquals(
      "6cJc7c5h Kd6s9cAh AcQs7hJs",
      Solver.process("omaha-holdem 4s9sKsTcTs AcQs7hJs 6cJc7c5h Kd6s9cAh"));
  }

  @Test
  public void test_omaha_holdem_7499_3s7d8c9c9h_Kh3h2h2c_Js5hKc5d_JcTdJd6s_6dJh3cKs_Qd7c7hTh_7s6hAs6c_3d9s5c8s_9dAc5sTc() {
    assertEquals(
      "6dJh3cKs=Kh3h2h2c Js5hKc5d 7s6hAs6c 9dAc5sTc JcTdJd6s Qd7c7hTh 3d9s5c8s",
      Solver.process("omaha-holdem 3s7d8c9c9h Kh3h2h2c Js5hKc5d JcTdJd6s 6dJh3cKs Qd7c7hTh 7s6hAs6c 3d9s5c8s 9dAc5sTc"));
  }

}
