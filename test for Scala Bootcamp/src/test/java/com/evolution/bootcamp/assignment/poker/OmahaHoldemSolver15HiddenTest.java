
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver15HiddenTest {


  @Test
  public void test_omaha_holdem_3750_4d8c8d8hJs_5h5s6d7s_7hAc9d4c_8s7dTcQc_QhTsJdJc_AsAh7c5c_QdAd6hTh_9cKd3d3c() {
    assertEquals(
      "7hAc9d4c QdAd6hTh 9cKd3d3c 5h5s6d7s AsAh7c5c QhTsJdJc 8s7dTcQc",
      Solver.process("omaha-holdem 4d8c8d8hJs 5h5s6d7s 7hAc9d4c 8s7dTcQc QhTsJdJc AsAh7c5c QdAd6hTh 9cKd3d3c"));
  }

  @Test
  public void test_omaha_holdem_3751_8cAsJdQsTs_9s2hKh7s_JcQh5hAc_Kd7hQcTh_6hJsTc8s_JhAh7c3h_2s3d5d4d_9d9c5c3s() {
    assertEquals(
      "2s3d5d4d 9d9c5c3s JhAh7c3h JcQh5hAc Kd7hQcTh 9s2hKh7s 6hJsTc8s",
      Solver.process("omaha-holdem 8cAsJdQsTs 9s2hKh7s JcQh5hAc Kd7hQcTh 6hJsTc8s JhAh7c3h 2s3d5d4d 9d9c5c3s"));
  }

  @Test
  public void test_omaha_holdem_3752_2d4s8d8hAh_TcKc4cTd_Js6dTs2s_Jc7c3h6s_9hJh6c9s_7sTh3s4d() {
    assertEquals(
      "Jc7c3h6s Js6dTs2s 7sTh3s4d 9hJh6c9s TcKc4cTd",
      Solver.process("omaha-holdem 2d4s8d8hAh TcKc4cTd Js6dTs2s Jc7c3h6s 9hJh6c9s 7sTh3s4d"));
  }

  @Test
  public void test_omaha_holdem_3753_2c3d3s8s9h_2d6s5c4d_As3hTc5h() {
    assertEquals(
      "2d6s5c4d As3hTc5h",
      Solver.process("omaha-holdem 2c3d3s8s9h 2d6s5c4d As3hTc5h"));
  }

  @Test
  public void test_omaha_holdem_3754_3h5h6d8hKh_JsAd5s9s_7d4sTd3s_9c9d5c8s() {
    assertEquals(
      "JsAd5s9s 9c9d5c8s 7d4sTd3s",
      Solver.process("omaha-holdem 3h5h6d8hKh JsAd5s9s 7d4sTd3s 9c9d5c8s"));
  }

  @Test
  public void test_omaha_holdem_3755_2h7d8cJhQd_4dAs9sAd_Ac3dTc9c_Ah5dTd4s_6sKcQcQs_7sJd5h7h() {
    assertEquals(
      "Ah5dTd4s 4dAs9sAd 7sJd5h7h 6sKcQcQs Ac3dTc9c",
      Solver.process("omaha-holdem 2h7d8cJhQd 4dAs9sAd Ac3dTc9c Ah5dTd4s 6sKcQcQs 7sJd5h7h"));
  }

  @Test
  public void test_omaha_holdem_3756_4d4h8cQsTd_7c8sAs7s_Kh9cTcAc_3c3sJd5d_9d5hAdKd_6sJh7d6h_6d2hJcQc() {
    assertEquals(
      "9d5hAdKd 3c3sJd5d 6sJh7d6h 7c8sAs7s Kh9cTcAc 6d2hJcQc",
      Solver.process("omaha-holdem 4d4h8cQsTd 7c8sAs7s Kh9cTcAc 3c3sJd5d 9d5hAdKd 6sJh7d6h 6d2hJcQc"));
  }

  @Test
  public void test_omaha_holdem_3757_2h2s6hJsTc_JdKd7d5s_Qd4cKs9h_AsTd5hAc_3hAdJh3s_8h8cAh4h_8s7c9sTh() {
    assertEquals(
      "Qd4cKs9h 8h8cAh4h 8s7c9sTh JdKd7d5s 3hAdJh3s AsTd5hAc",
      Solver.process("omaha-holdem 2h2s6hJsTc JdKd7d5s Qd4cKs9h AsTd5hAc 3hAdJh3s 8h8cAh4h 8s7c9sTh"));
  }

  @Test
  public void test_omaha_holdem_3758_5cQhTdThTs_AdKc5hKh_Jh9h7cKs_2h5dJs8h_Ac5s8s4c_7d2s8c6c() {
    assertEquals(
      "7d2s8c6c 2h5dJs8h Jh9h7cKs Ac5s8s4c AdKc5hKh",
      Solver.process("omaha-holdem 5cQhTdThTs AdKc5hKh Jh9h7cKs 2h5dJs8h Ac5s8s4c 7d2s8c6c"));
  }

  @Test
  public void test_omaha_holdem_3759_3s5h9hKcTd_4hAdThJc_2d2c5dJs_7d3d9cKd_2hAh9sQs_5s7h8d9d_8h8sQcJd_6sQh3hJh_Ts4cAc4s_8c5c6h7c() {
    assertEquals(
      "8c5c6h7c 2d2c5dJs 2hAh9sQs 4hAdThJc=Ts4cAc4s 5s7h8d9d 7d3d9cKd 6sQh3hJh=8h8sQcJd",
      Solver.process("omaha-holdem 3s5h9hKcTd 4hAdThJc 2d2c5dJs 7d3d9cKd 2hAh9sQs 5s7h8d9d 8h8sQcJd 6sQh3hJh Ts4cAc4s 8c5c6h7c"));
  }

  @Test
  public void test_omaha_holdem_3760_5h7s9sKcTh_6d5c6hKh_7c2c3sKs_Ah6c2dJc_9cTcJs3h() {
    assertEquals(
      "Ah6c2dJc 9cTcJs3h 6d5c6hKh 7c2c3sKs",
      Solver.process("omaha-holdem 5h7s9sKcTh 6d5c6hKh 7c2c3sKs Ah6c2dJc 9cTcJs3h"));
  }

  @Test
  public void test_omaha_holdem_3761_9hAsKcQcQd_Js9d8d2d_9s3dAh7h_7cTc8cTs_2s5hQh7s_Kh4h7dAd_2c5d5s3h_3s4s3cJc() {
    assertEquals(
      "3s4s3cJc 2c5d5s3h Js9d8d2d 7cTc8cTs 9s3dAh7h Kh4h7dAd 2s5hQh7s",
      Solver.process("omaha-holdem 9hAsKcQcQd Js9d8d2d 9s3dAh7h 7cTc8cTs 2s5hQh7s Kh4h7dAd 2c5d5s3h 3s4s3cJc"));
  }

  @Test
  public void test_omaha_holdem_3762_3h5d6s7h8s_2h8c2c3d_QdTh2s6c_3c5h7s3s_9d6d5sTs() {
    assertEquals(
      "QdTh2s6c 2h8c2c3d 3c5h7s3s 9d6d5sTs",
      Solver.process("omaha-holdem 3h5d6s7h8s 2h8c2c3d QdTh2s6c 3c5h7s3s 9d6d5sTs"));
  }

  @Test
  public void test_omaha_holdem_3763_2c4h9cJcQc_Js4s9h3d_As9d2dJh_6hTsQdTh_Kc5sAh3h_9s6d4d8d() {
    assertEquals(
      "Kc5sAh3h 6hTsQdTh 9s6d4d8d As9d2dJh=Js4s9h3d",
      Solver.process("omaha-holdem 2c4h9cJcQc Js4s9h3d As9d2dJh 6hTsQdTh Kc5sAh3h 9s6d4d8d"));
  }

  @Test
  public void test_omaha_holdem_3764_2c5c7c8s9s_6s8cAhQd_6cTd6h3h_AsTh3d9h_Ad2dKh7d_3c5h6dKs() {
    assertEquals(
      "AsTh3d9h Ad2dKh7d 3c5h6dKs=6s8cAhQd 6cTd6h3h",
      Solver.process("omaha-holdem 2c5c7c8s9s 6s8cAhQd 6cTd6h3h AsTh3d9h Ad2dKh7d 3c5h6dKs"));
  }

  @Test
  public void test_omaha_holdem_3765_3h6s7c9cTd_AcQc2c4d_AhJc3s9d_5dJdAdJh_2s9sKc4h_QsKs8s5h_3c5sKh3d_Js7h9hKd_2d6c7d2h() {
    assertEquals(
      "AcQc2c4d 2s9sKc4h 5dJdAdJh 2d6c7d2h AhJc3s9d Js7h9hKd 3c5sKh3d QsKs8s5h",
      Solver.process("omaha-holdem 3h6s7c9cTd AcQc2c4d AhJc3s9d 5dJdAdJh 2s9sKc4h QsKs8s5h 3c5sKh3d Js7h9hKd 2d6c7d2h"));
  }

  @Test
  public void test_omaha_holdem_3766_7h8d9sAsTd_JcQc6h5c_4dKs8sTh_9dKd5sKc_Tc2cAh3h_8h5d2s3c_4sKh8cJh_2h5hTsJs() {
    assertEquals(
      "8h5d2s3c 9dKd5sKc 4dKs8sTh Tc2cAh3h 2h5hTsJs=4sKh8cJh JcQc6h5c",
      Solver.process("omaha-holdem 7h8d9sAsTd JcQc6h5c 4dKs8sTh 9dKd5sKc Tc2cAh3h 8h5d2s3c 4sKh8cJh 2h5hTsJs"));
  }

  @Test
  public void test_omaha_holdem_3767_4s7h7s9dQs_9sQd6s8h_2sQcJs3c_8c7dJc4d_6dAdJd8s_9cKs3h5s_Tc2dThKc_9h2h5d6c_4hKhAhAs() {
    assertEquals(
      "6dAdJd8s 9h2h5d6c Tc2dThKc 4hKhAhAs 9sQd6s8h 2sQcJs3c 9cKs3h5s 8c7dJc4d",
      Solver.process("omaha-holdem 4s7h7s9dQs 9sQd6s8h 2sQcJs3c 8c7dJc4d 6dAdJd8s 9cKs3h5s Tc2dThKc 9h2h5d6c 4hKhAhAs"));
  }

  @Test
  public void test_omaha_holdem_3768_2d3c7c8d9c_3h4h4d5h_8sQc8c7d_5c2cTcAh_KsAcKhQd() {
    assertEquals(
      "3h4h4d5h KsAcKhQd 5c2cTcAh 8sQc8c7d",
      Solver.process("omaha-holdem 2d3c7c8d9c 3h4h4d5h 8sQc8c7d 5c2cTcAh KsAcKhQd"));
  }

  @Test
  public void test_omaha_holdem_3769_3c6h9hKsTs_9sQdAcTc_Qs5s5c8c_Td3sJsAs_Qh8d7c5d_4s3d7dAh_Qc5h4d7h_Ad8hKd3h_Jd6d6s2c() {
    assertEquals(
      "Qc5h4d7h 4s3d7dAh Qs5s5c8c Td3sJsAs 9sQdAcTc Ad8hKd3h Jd6d6s2c Qh8d7c5d",
      Solver.process("omaha-holdem 3c6h9hKsTs 9sQdAcTc Qs5s5c8c Td3sJsAs Qh8d7c5d 4s3d7dAh Qc5h4d7h Ad8hKd3h Jd6d6s2c"));
  }

  @Test
  public void test_omaha_holdem_3770_3h4s5d7h8d_Kc2s7sQs_3dTcJs6c_8cKdAc8h_5sQc9hAd_4c2h7d4d_Jd6sJh9d() {
    assertEquals(
      "5sQc9hAd Kc2s7sQs 4c2h7d4d 8cKdAc8h 3dTcJs6c Jd6sJh9d",
      Solver.process("omaha-holdem 3h4s5d7h8d Kc2s7sQs 3dTcJs6c 8cKdAc8h 5sQc9hAd 4c2h7d4d Jd6sJh9d"));
  }

  @Test
  public void test_omaha_holdem_3771_2c7c7d9dAs_6s2sAcKs_8hJs8s6h_JhKdTsQh_AdKh9h3s_5cTh8d9s_5dJd9c7h() {
    assertEquals(
      "JhKdTsQh 8hJs8s6h 5cTh8d9s 6s2sAcKs AdKh9h3s 5dJd9c7h",
      Solver.process("omaha-holdem 2c7c7d9dAs 6s2sAcKs 8hJs8s6h JhKdTsQh AdKh9h3s 5cTh8d9s 5dJd9c7h"));
  }

  @Test
  public void test_omaha_holdem_3772_4d6s7h9hTh_QdKsJdJs_9c7s3hKh_2h3c9sAs_6d4s4h7d_Qs5dAc8s_Ts6cAdKd_KcAhQc3s_4cQh8d8c_2c2s5c2d() {
    assertEquals(
      "KcAhQc3s 2c2s5c2d 4cQh8d8c 2h3c9sAs QdKsJdJs Ts6cAdKd 6d4s4h7d Qs5dAc8s 9c7s3hKh",
      Solver.process("omaha-holdem 4d6s7h9hTh QdKsJdJs 9c7s3hKh 2h3c9sAs 6d4s4h7d Qs5dAc8s Ts6cAdKd KcAhQc3s 4cQh8d8c 2c2s5c2d"));
  }

  @Test
  public void test_omaha_holdem_3773_3s5hAcAdQs_Kh2h2c6s_4h2dKc9c_8cQhJh8d_8hAhTsKd_9h5cJc7c_6cKs3c9s_Th5d5s4c_Jd4d4sJs() {
    assertEquals(
      "Kh2h2c6s 6cKs3c9s 9h5cJc7c Jd4d4sJs 8cQhJh8d 8hAhTsKd 4h2dKc9c Th5d5s4c",
      Solver.process("omaha-holdem 3s5hAcAdQs Kh2h2c6s 4h2dKc9c 8cQhJh8d 8hAhTsKd 9h5cJc7c 6cKs3c9s Th5d5s4c Jd4d4sJs"));
  }

  @Test
  public void test_omaha_holdem_3774_6d7hAsJcKc_KhAhAc7d_4sTc9d4d_3cQh7s3d_9s6s2h4h_8h8d2sQc_5dJhTs6c_5hTdJs4c_7c2d5s9h() {
    assertEquals(
      "4sTc9d4d 9s6s2h4h 7c2d5s9h 3cQh7s3d 8h8d2sQc 5hTdJs4c 5dJhTs6c KhAhAc7d",
      Solver.process("omaha-holdem 6d7hAsJcKc KhAhAc7d 4sTc9d4d 3cQh7s3d 9s6s2h4h 8h8d2sQc 5dJhTs6c 5hTdJs4c 7c2d5s9h"));
  }

  @Test
  public void test_omaha_holdem_3775_2s6d9sAhJh_Td2hTh7s_9hQc8hAc_9d7d3dJd_4dQsQdKs_TcKdKc6c_5s5h4h5d_9c8d3h7h_2dTs2c4s() {
    assertEquals(
      "5s5h4h5d 9c8d3h7h Td2hTh7s 4dQsQdKs TcKdKc6c 9d7d3dJd 9hQc8hAc 2dTs2c4s",
      Solver.process("omaha-holdem 2s6d9sAhJh Td2hTh7s 9hQc8hAc 9d7d3dJd 4dQsQdKs TcKdKc6c 5s5h4h5d 9c8d3h7h 2dTs2c4s"));
  }

  @Test
  public void test_omaha_holdem_3776_4h5s6s8s9s_3d8cQs7d_7sJd3s8d() {
    assertEquals(
      "3d8cQs7d 7sJd3s8d",
      Solver.process("omaha-holdem 4h5s6s8s9s 3d8cQs7d 7sJd3s8d"));
  }

  @Test
  public void test_omaha_holdem_3777_5c5h7d7s9h_3dTs9cJc_2h3s8hTd_3cJs3h2d_Tc4s9dJh_ThKs7h8d_Ac4dQd8c_6cAhKh6h_5sQsAdJd() {
    assertEquals(
      "2h3s8hTd Ac4dQd8c 3cJs3h2d 6cAhKh6h 3dTs9cJc=Tc4s9dJh 5sQsAdJd ThKs7h8d",
      Solver.process("omaha-holdem 5c5h7d7s9h 3dTs9cJc 2h3s8hTd 3cJs3h2d Tc4s9dJh ThKs7h8d Ac4dQd8c 6cAhKh6h 5sQsAdJd"));
  }

  @Test
  public void test_omaha_holdem_3778_2c5d7h8sAd_4h9c6sJd_8hAh9d7c_7sAs2hJs_6cQs4sQc_Kd8d3sQh_6h4c3d3h_9s2d2sTs_4d6dTcKs_KcThAc8c() {
    assertEquals(
      "Kd8d3sQh 7sAs2hJs 8hAh9d7c=KcThAc8c 9s2d2sTs 4d6dTcKs=6cQs4sQc=6h4c3d3h 4h9c6sJd",
      Solver.process("omaha-holdem 2c5d7h8sAd 4h9c6sJd 8hAh9d7c 7sAs2hJs 6cQs4sQc Kd8d3sQh 6h4c3d3h 9s2d2sTs 4d6dTcKs KcThAc8c"));
  }

  @Test
  public void test_omaha_holdem_3779_4h8h9c9hJs_As5s4d2h_JhKs7sQc_Ts4s9sTh() {
    assertEquals(
      "As5s4d2h JhKs7sQc Ts4s9sTh",
      Solver.process("omaha-holdem 4h8h9c9hJs As5s4d2h JhKs7sQc Ts4s9sTh"));
  }

  @Test
  public void test_omaha_holdem_3780_6c9hAcKdTh_2sQd3s4c_5c8dKs8h_2cQc6hTc_5d4sQs2h_JhAhJdTs_7sQhKh4h_3dJs8c9c_4d7d6s5s_Jc7hKcAd() {
    assertEquals(
      "2sQd3s4c 5d4sQs2h 4d7d6s5s 3dJs8c9c 5c8dKs8h 7sQhKh4h 2cQc6hTc JhAhJdTs Jc7hKcAd",
      Solver.process("omaha-holdem 6c9hAcKdTh 2sQd3s4c 5c8dKs8h 2cQc6hTc 5d4sQs2h JhAhJdTs 7sQhKh4h 3dJs8c9c 4d7d6s5s Jc7hKcAd"));
  }

  @Test
  public void test_omaha_holdem_3781_3s5c7sJsQc_Qh2sKhJh_ThJc5d2d_6dAdKcKs_9d5s9hAh_Jd8dTd7h_3c3h7d9s_2c6sTs4h_4s9cAc7c_Kd5hQdTc() {
    assertEquals(
      "4s9cAc7c 9d5s9hAh 6dAdKcKs ThJc5d2d Jd8dTd7h Kd5hQdTc Qh2sKhJh 3c3h7d9s 2c6sTs4h",
      Solver.process("omaha-holdem 3s5c7sJsQc Qh2sKhJh ThJc5d2d 6dAdKcKs 9d5s9hAh Jd8dTd7h 3c3h7d9s 2c6sTs4h 4s9cAc7c Kd5hQdTc"));
  }

  @Test
  public void test_omaha_holdem_3782_3h4h9hAcJc_5dJdTcQs_7s2h9c5c_Ad6d3s5h_8s6s2c4c_KdAsKc8d_Qh7hTh6c_8hJsKsTd_5s8c7c3c_Ah2d9d4d() {
    assertEquals(
      "5s8c7c3c 8s6s2c4c 5dJdTcQs 8hJsKsTd KdAsKc8d Ad6d3s5h Ah2d9d4d 7s2h9c5c Qh7hTh6c",
      Solver.process("omaha-holdem 3h4h9hAcJc 5dJdTcQs 7s2h9c5c Ad6d3s5h 8s6s2c4c KdAsKc8d Qh7hTh6c 8hJsKsTd 5s8c7c3c Ah2d9d4d"));
  }

  @Test
  public void test_omaha_holdem_3783_2c5cJcJhQc_Qd2d3c3d_2s5d3s7s_8sTs6d9s_Qs3h8d6s_KcAc5sTc_Kh6h6c4h_JsTdTh4d_7d9cQh7c() {
    assertEquals(
      "8sTs6d9s 2s5d3s7s Kh6h6c4h Qd2d3c3d Qs3h8d6s JsTdTh4d 7d9cQh7c KcAc5sTc",
      Solver.process("omaha-holdem 2c5cJcJhQc Qd2d3c3d 2s5d3s7s 8sTs6d9s Qs3h8d6s KcAc5sTc Kh6h6c4h JsTdTh4d 7d9cQh7c"));
  }

  @Test
  public void test_omaha_holdem_3784_4s9hAsKdQh_2s3h4hTs_Js8sQd8d_9s3s4d5d_6sKsJhAc_7hQc5c2h_Jc6hAh7d() {
    assertEquals(
      "2s3h4hTs 7hQc5c2h Js8sQd8d Jc6hAh7d 9s3s4d5d 6sKsJhAc",
      Solver.process("omaha-holdem 4s9hAsKdQh 2s3h4hTs Js8sQd8d 9s3s4d5d 6sKsJhAc 7hQc5c2h Jc6hAh7d"));
  }

  @Test
  public void test_omaha_holdem_3785_5c6c9d9hQd_4sQsKcJd_3d4dQc2s_3h6h6sTs_Td5dAc8h_8cAsAh3c_Js9c3sKd_8dJcAd6d_ThJh4h7s() {
    assertEquals(
      "ThJh4h7s Td5dAc8h 8dJcAd6d 3d4dQc2s 4sQsKcJd 8cAsAh3c Js9c3sKd 3h6h6sTs",
      Solver.process("omaha-holdem 5c6c9d9hQd 4sQsKcJd 3d4dQc2s 3h6h6sTs Td5dAc8h 8cAsAh3c Js9c3sKd 8dJcAd6d ThJh4h7s"));
  }

  @Test
  public void test_omaha_holdem_3786_4d4s5s6hTh_Kd3d3cQd_3s2s5d8s_8dJsJdKs_7d9hTs9d_JhTcQs9c_2cAh8c6c() {
    assertEquals(
      "Kd3d3cQd 2cAh8c6c 7d9hTs9d JhTcQs9c 8dJsJdKs 3s2s5d8s",
      Solver.process("omaha-holdem 4d4s5s6hTh Kd3d3cQd 3s2s5d8s 8dJsJdKs 7d9hTs9d JhTcQs9c 2cAh8c6c"));
  }

  @Test
  public void test_omaha_holdem_3787_2h3s7hKsQs_Ad5d8sTs_4d9d2d6h_7d8c8dAh_Jc7s6d9h() {
    assertEquals(
      "4d9d2d6h Jc7s6d9h 7d8c8dAh Ad5d8sTs",
      Solver.process("omaha-holdem 2h3s7hKsQs Ad5d8sTs 4d9d2d6h 7d8c8dAh Jc7s6d9h"));
  }

  @Test
  public void test_omaha_holdem_3788_8d8sJcKdQc_3s8c4sTd_JsJd3c3d_AhQs9sKc_2c5d6d3h_6sQdTs5c_Tc2dKh9c_2hThAc5s() {
    assertEquals(
      "2c5d6d3h 6sQdTs5c AhQs9sKc 3s8c4sTd Tc2dKh9c 2hThAc5s JsJd3c3d",
      Solver.process("omaha-holdem 8d8sJcKdQc 3s8c4sTd JsJd3c3d AhQs9sKc 2c5d6d3h 6sQdTs5c Tc2dKh9c 2hThAc5s"));
  }

  @Test
  public void test_omaha_holdem_3789_2h6s7d9hJs_Kh6cAc4c_5d9sTsTh_4s8d3c6d_7c8hQh2s() {
    assertEquals(
      "4s8d3c6d Kh6cAc4c 5d9sTsTh 7c8hQh2s",
      Solver.process("omaha-holdem 2h6s7d9hJs Kh6cAc4c 5d9sTsTh 4s8d3c6d 7c8hQh2s"));
  }

  @Test
  public void test_omaha_holdem_3790_4c4s6s7sTc_QsQc5h4h_8d2s9h7h_Qh3c8cJc() {
    assertEquals(
      "Qh3c8cJc QsQc5h4h 8d2s9h7h",
      Solver.process("omaha-holdem 4c4s6s7sTc QsQc5h4h 8d2s9h7h Qh3c8cJc"));
  }

  @Test
  public void test_omaha_holdem_3791_5c6c7d8hJs_4cTc3cQh_6d4d4s7h() {
    assertEquals(
      "4cTc3cQh 6d4d4s7h",
      Solver.process("omaha-holdem 5c6c7d8hJs 4cTc3cQh 6d4d4s7h"));
  }

  @Test
  public void test_omaha_holdem_3792_3s4h6h9d9h_7c8s8dQh_4d3cQc3h_2dKs5dQs_Jh2sKd5h_JcJdKh8c_Th2cAs5s() {
    assertEquals(
      "7c8s8dQh JcJdKh8c 2dKs5dQs=Th2cAs5s Jh2sKd5h 4d3cQc3h",
      Solver.process("omaha-holdem 3s4h6h9d9h 7c8s8dQh 4d3cQc3h 2dKs5dQs Jh2sKd5h JcJdKh8c Th2cAs5s"));
  }

  @Test
  public void test_omaha_holdem_3793_4d6s9cAdKc_3c9s7s7h_5s9h8h2c_5c6d5hAh_8d2dQdJd() {
    assertEquals(
      "8d2dQdJd 3c9s7s7h 5s9h8h2c 5c6d5hAh",
      Solver.process("omaha-holdem 4d6s9cAdKc 3c9s7s7h 5s9h8h2c 5c6d5hAh 8d2dQdJd"));
  }

  @Test
  public void test_omaha_holdem_3794_3c4s5s6s9c_6c5c2s7s_9sQs8dTc_AhTh5hKc_6h2dKdAc() {
    assertEquals(
      "AhTh5hKc 6h2dKdAc 6c5c2s7s 9sQs8dTc",
      Solver.process("omaha-holdem 3c4s5s6s9c 6c5c2s7s 9sQs8dTc AhTh5hKc 6h2dKdAc"));
  }

  @Test
  public void test_omaha_holdem_3795_4s9cAsJsQs_5c4hTd4c_3s7h3dKh() {
    assertEquals(
      "3s7h3dKh 5c4hTd4c",
      Solver.process("omaha-holdem 4s9cAsJsQs 5c4hTd4c 3s7h3dKh"));
  }

  @Test
  public void test_omaha_holdem_3796_2s6dAdJhTh_5sTcJs2c_Qh6h8h7c_As7sQsKh() {
    assertEquals(
      "Qh6h8h7c 5sTcJs2c As7sQsKh",
      Solver.process("omaha-holdem 2s6dAdJhTh 5sTcJs2c Qh6h8h7c As7sQsKh"));
  }

  @Test
  public void test_omaha_holdem_3797_2c3dJsKsTc_6d3sKdQs_8s9c2hKh_Qc6c4cJc_5d5cKc4h() {
    assertEquals(
      "Qc6c4cJc 5d5cKc4h 8s9c2hKh 6d3sKdQs",
      Solver.process("omaha-holdem 2c3dJsKsTc 6d3sKdQs 8s9c2hKh Qc6c4cJc 5d5cKc4h"));
  }

  @Test
  public void test_omaha_holdem_3798_3d4cKsTcTs_6d8cJcQh_9cQc4dAd_6s2d5hAc_7s5s2h4h_Td3c8d9h_7cTh5cKc_5d2c4sAh() {
    assertEquals(
      "6d8cJcQh 6s2d5hAc 7s5s2h4h 5d2c4sAh=9cQc4dAd Td3c8d9h 7cTh5cKc",
      Solver.process("omaha-holdem 3d4cKsTcTs 6d8cJcQh 9cQc4dAd 6s2d5hAc 7s5s2h4h Td3c8d9h 7cTh5cKc 5d2c4sAh"));
  }

  @Test
  public void test_omaha_holdem_3799_3d6c8sQsTd_4dQdAdJc_5cQhKs9s_4c5d6sAc_6d3s2h7s_Js2d2c5s() {
    assertEquals(
      "Js2d2c5s 4c5d6sAc 5cQhKs9s 4dQdAdJc 6d3s2h7s",
      Solver.process("omaha-holdem 3d6c8sQsTd 4dQdAdJc 5cQhKs9s 4c5d6sAc 6d3s2h7s Js2d2c5s"));
  }

  @Test
  public void test_omaha_holdem_3800_2h7cJsTcTs_Td8h2c8s_2sTh7sQd_4d5s6c9c_AsJd3hQs_AhQh9h7h() {
    assertEquals(
      "4d5s6c9c AhQh9h7h AsJd3hQs Td8h2c8s 2sTh7sQd",
      Solver.process("omaha-holdem 2h7cJsTcTs Td8h2c8s 2sTh7sQd 4d5s6c9c AsJd3hQs AhQh9h7h"));
  }

  @Test
  public void test_omaha_holdem_3801_2d4c4h8cAh_6c5h3cJc_4dTs2cTh_AsAcAdQc_4sKs7d5c() {
    assertEquals(
      "4sKs7d5c 6c5h3cJc 4dTs2cTh AsAcAdQc",
      Solver.process("omaha-holdem 2d4c4h8cAh 6c5h3cJc 4dTs2cTh AsAcAdQc 4sKs7d5c"));
  }

  @Test
  public void test_omaha_holdem_3802_2s4h9h9sTh_6d5hJd5s_8s3c7h8d() {
    assertEquals(
      "6d5hJd5s 8s3c7h8d",
      Solver.process("omaha-holdem 2s4h9h9sTh 6d5hJd5s 8s3c7h8d"));
  }

  @Test
  public void test_omaha_holdem_3803_3s5s6d9c9h_5c8h7hAc_KdJhQs3d_7s2hAs6c_3h8sJd4h_8c5hQcKh_2d8dKs9s() {
    assertEquals(
      "3h8sJd4h KdJhQs3d 8c5hQcKh 7s2hAs6c 2d8dKs9s 5c8h7hAc",
      Solver.process("omaha-holdem 3s5s6d9c9h 5c8h7hAc KdJhQs3d 7s2hAs6c 3h8sJd4h 8c5hQcKh 2d8dKs9s"));
  }

  @Test
  public void test_omaha_holdem_3804_2d3h4d4s7s_6sKcAsQs_2h6hTs8d_7cKs4c9s_Td9h5c3d_Ah3sTh7d_Qd3cAdJs_8sKh5sKd_9c6cQh8c_Jc2s5d8h() {
    assertEquals(
      "9c6cQh8c 6sKcAsQs 2h6hTs8d Jc2s5d8h Td9h5c3d Qd3cAdJs Ah3sTh7d 8sKh5sKd 7cKs4c9s",
      Solver.process("omaha-holdem 2d3h4d4s7s 6sKcAsQs 2h6hTs8d 7cKs4c9s Td9h5c3d Ah3sTh7d Qd3cAdJs 8sKh5sKd 9c6cQh8c Jc2s5d8h"));
  }

  @Test
  public void test_omaha_holdem_3805_3s5h9hThTs_AdAc8h7d_7hTc2s6d_8d7s6hKd_Kc3c4c4h_5d3hJhQh_Kh3dQc6c() {
    assertEquals(
      "8d7s6hKd Kh3dQc6c Kc3c4c4h AdAc8h7d 7hTc2s6d 5d3hJhQh",
      Solver.process("omaha-holdem 3s5h9hThTs AdAc8h7d 7hTc2s6d 8d7s6hKd Kc3c4c4h 5d3hJhQh Kh3dQc6c"));
  }

  @Test
  public void test_omaha_holdem_3806_2h3d4c9sJh_8c7d5sAc_As8hTsTd() {
    assertEquals(
      "As8hTsTd 8c7d5sAc",
      Solver.process("omaha-holdem 2h3d4c9sJh 8c7d5sAc As8hTsTd"));
  }

  @Test
  public void test_omaha_holdem_3807_3h6d9d9hQh_5sTs2s5h_JsJdQd4c_3c4h9cJh_6hTc7s7c_4sKh4d6c_3sAhThQs_Ac5c2hKd_JcAs7d8s_8h2cQc3d() {
    assertEquals(
      "JcAs7d8s Ac5c2hKd 5sTs2s5h 4sKh4d6c 6hTc7s7c 8h2cQc3d JsJdQd4c 3sAhThQs 3c4h9cJh",
      Solver.process("omaha-holdem 3h6d9d9hQh 5sTs2s5h JsJdQd4c 3c4h9cJh 6hTc7s7c 4sKh4d6c 3sAhThQs Ac5c2hKd JcAs7d8s 8h2cQc3d"));
  }

  @Test
  public void test_omaha_holdem_3808_4h7d9hAsJc_2cJdTd6d_3cAd9s5h_Jh5cAcQh_TsQd8s8c_6c7h8h7s_8d3dQs2h_QcKd2dTc_6hKc6s7c() {
    assertEquals(
      "8d3dQs2h QcKd2dTc 6hKc6s7c 2cJdTd6d 3cAd9s5h Jh5cAcQh 6c7h8h7s TsQd8s8c",
      Solver.process("omaha-holdem 4h7d9hAsJc 2cJdTd6d 3cAd9s5h Jh5cAcQh TsQd8s8c 6c7h8h7s 8d3dQs2h QcKd2dTc 6hKc6s7c"));
  }

  @Test
  public void test_omaha_holdem_3809_3d3s6s7d8h_JdAdTh4c_9dAcQc8s_As4sTd6h_KsJs3c8d_9cQs7s7c_5d2h2c9s() {
    assertEquals(
      "JdAdTh4c As4sTd6h 9dAcQc8s 5d2h2c9s KsJs3c8d 9cQs7s7c",
      Solver.process("omaha-holdem 3d3s6s7d8h JdAdTh4c 9dAcQc8s As4sTd6h KsJs3c8d 9cQs7s7c 5d2h2c9s"));
  }

  @Test
  public void test_omaha_holdem_3810_3h7c8dAsTs_Th2dKh9h_7d2cAc4c_5c2h3sQh() {
    assertEquals(
      "5c2h3sQh Th2dKh9h 7d2cAc4c",
      Solver.process("omaha-holdem 3h7c8dAsTs Th2dKh9h 7d2cAc4c 5c2h3sQh"));
  }

  @Test
  public void test_omaha_holdem_3811_3c5s6cQcQs_8dTd4hJs_7s5dAc3h_4sTcKs6d_Jh2hKd9s() {
    assertEquals(
      "8dTd4hJs Jh2hKd9s 7s5dAc3h 4sTcKs6d",
      Solver.process("omaha-holdem 3c5s6cQcQs 8dTd4hJs 7s5dAc3h 4sTcKs6d Jh2hKd9s"));
  }

  @Test
  public void test_omaha_holdem_3812_3s4h8s9sTh_8d6cKhQs_Jh6h2cQd() {
    assertEquals(
      "8d6cKhQs Jh6h2cQd",
      Solver.process("omaha-holdem 3s4h8s9sTh 8d6cKhQs Jh6h2cQd"));
  }

  @Test
  public void test_omaha_holdem_3813_2c3h6dAdAs_3dJhJd5c_Kh4s6c7c_9dKd5s2d_8sTc7hQs_4hJs8cTh_3c3sAhJc_9sQc8d9c() {
    assertEquals(
      "4hJs8cTh 8sTc7hQs 9dKd5s2d Kh4s6c7c 9sQc8d9c 3dJhJd5c 3c3sAhJc",
      Solver.process("omaha-holdem 2c3h6dAdAs 3dJhJd5c Kh4s6c7c 9dKd5s2d 8sTc7hQs 4hJs8cTh 3c3sAhJc 9sQc8d9c"));
  }

  @Test
  public void test_omaha_holdem_3814_4d5h6hAhKd_5c3sQs8h_Th7hJdQh_Ks3c8sQd_2dKhAd6s_Tc2c6c7c_5s4s7s8c_7d2h2s9h_3hAs9sJh_8dJs9d6d() {
    assertEquals(
      "5c3sQs8h Tc2c6c7c 8dJs9d6d Ks3c8sQd 2dKhAd6s 5s4s7s8c 7d2h2s9h 3hAs9sJh Th7hJdQh",
      Solver.process("omaha-holdem 4d5h6hAhKd 5c3sQs8h Th7hJdQh Ks3c8sQd 2dKhAd6s Tc2c6c7c 5s4s7s8c 7d2h2s9h 3hAs9sJh 8dJs9d6d"));
  }

  @Test
  public void test_omaha_holdem_3815_4c4hKdTdTs_Qh2d6h3d_9c2hKs7c_AsAd7h9s_3cAh9d8c_6c4s5dJc() {
    assertEquals(
      "Qh2d6h3d 3cAh9d8c 9c2hKs7c AsAd7h9s 6c4s5dJc",
      Solver.process("omaha-holdem 4c4hKdTdTs Qh2d6h3d 9c2hKs7c AsAd7h9s 3cAh9d8c 6c4s5dJc"));
  }

  @Test
  public void test_omaha_holdem_3816_2c3s4hJcQh_QsAs7c5h_JsKd6sTc_7d6d3hTh() {
    assertEquals(
      "7d6d3hTh JsKd6sTc QsAs7c5h",
      Solver.process("omaha-holdem 2c3s4hJcQh QsAs7c5h JsKd6sTc 7d6d3hTh"));
  }

  @Test
  public void test_omaha_holdem_3817_3h6d7sKcTs_8d7dKd4c_7c4d9d9h_9sKs4sJd_5cAsTh2h_Qc5d8sKh_QhAh3d9c_Tc8h3s2d_Ad6h5h3c_5s4hJh6c() {
    assertEquals(
      "QhAh3d9c 7c4d9d9h 5cAsTh2h 9sKs4sJd Qc5d8sKh Ad6h5h3c Tc8h3s2d 8d7dKd4c 5s4hJh6c",
      Solver.process("omaha-holdem 3h6d7sKcTs 8d7dKd4c 7c4d9d9h 9sKs4sJd 5cAsTh2h Qc5d8sKh QhAh3d9c Tc8h3s2d Ad6h5h3c 5s4hJh6c"));
  }

  @Test
  public void test_omaha_holdem_3818_7c9hJdKsTd_AcTh4c2h_4h7d7hQs() {
    assertEquals(
      "AcTh4c2h 4h7d7hQs",
      Solver.process("omaha-holdem 7c9hJdKsTd AcTh4c2h 4h7d7hQs"));
  }

  @Test
  public void test_omaha_holdem_3819_3d5cJdQcQd_3c4hKd8h_9s8s9c4d_Th5dTcAs_KhQh7c9h_7sAh4c2h_5sQs7dKs_7h6dTs6s() {
    assertEquals(
      "7sAh4c2h 3c4hKd8h 7h6dTs6s 9s8s9c4d Th5dTcAs KhQh7c9h 5sQs7dKs",
      Solver.process("omaha-holdem 3d5cJdQcQd 3c4hKd8h 9s8s9c4d Th5dTcAs KhQh7c9h 7sAh4c2h 5sQs7dKs 7h6dTs6s"));
  }

  @Test
  public void test_omaha_holdem_3820_5c7sJcQcQd_9h8c8h2c_8s3hJh5h_Tc3d6sTd_Ah4dTs6d_KhThAcJd_Js2hAd4c_9c6h8d5s() {
    assertEquals(
      "Ah4dTs6d 9c6h8d5s Tc3d6sTd 8s3hJh5h Js2hAd4c=KhThAcJd 9h8c8h2c",
      Solver.process("omaha-holdem 5c7sJcQcQd 9h8c8h2c 8s3hJh5h Tc3d6sTd Ah4dTs6d KhThAcJd Js2hAd4c 9c6h8d5s"));
  }

  @Test
  public void test_omaha_holdem_3821_2d5sAdAhQd_6s6c8d5h_8s4c4hQs_TsQh3c3d() {
    assertEquals(
      "6s6c8d5h 8s4c4hQs TsQh3c3d",
      Solver.process("omaha-holdem 2d5sAdAhQd 6s6c8d5h 8s4c4hQs TsQh3c3d"));
  }

  @Test
  public void test_omaha_holdem_3822_2h5s7c8hAs_2sTdJdJc_3d2d8cJh_Ah5c8d9s_6dKh9hQs_6c3c7h3h_Kc7d2cKd() {
    assertEquals(
      "6c3c7h3h 2sTdJdJc Kc7d2cKd 3d2d8cJh Ah5c8d9s 6dKh9hQs",
      Solver.process("omaha-holdem 2h5s7c8hAs 2sTdJdJc 3d2d8cJh Ah5c8d9s 6dKh9hQs 6c3c7h3h Kc7d2cKd"));
  }

  @Test
  public void test_omaha_holdem_3823_6d6hAsJcKs_2s7d3cJd_KhTs9d2d_4c3h6cTd_TcQs5cKc() {
    assertEquals(
      "2s7d3cJd KhTs9d2d 4c3h6cTd TcQs5cKc",
      Solver.process("omaha-holdem 6d6hAsJcKs 2s7d3cJd KhTs9d2d 4c3h6cTd TcQs5cKc"));
  }

  @Test
  public void test_omaha_holdem_3824_4c7d8sKcTh_2c4h3dJh_3sQhTsTc_Qd6c3h5s_Ad8h9d2d() {
    assertEquals(
      "2c4h3dJh Ad8h9d2d 3sQhTsTc Qd6c3h5s",
      Solver.process("omaha-holdem 4c7d8sKcTh 2c4h3dJh 3sQhTsTc Qd6c3h5s Ad8h9d2d"));
  }

  @Test
  public void test_omaha_holdem_3825_3c3h4dJcKh_9h8hJhAh_2cTdQdQs_JsTs6h7s_4s7c8c3s_7d4cKd2d_Jd2hKs9s_AdTcThAs_5cAc2sQc_KcQh9c6c() {
    assertEquals(
      "5cAc2sQc JsTs6h7s 9h8hJhAh 2cTdQdQs KcQh9c6c 7d4cKd2d Jd2hKs9s AdTcThAs 4s7c8c3s",
      Solver.process("omaha-holdem 3c3h4dJcKh 9h8hJhAh 2cTdQdQs JsTs6h7s 4s7c8c3s 7d4cKd2d Jd2hKs9s AdTcThAs 5cAc2sQc KcQh9c6c"));
  }

  @Test
  public void test_omaha_holdem_3826_4s8c9hJdQh_2c5s6d4d_6hTc2dAs_Kh3sJsAc_JhAd8hKs() {
    assertEquals(
      "6hTc2dAs 2c5s6d4d Kh3sJsAc JhAd8hKs",
      Solver.process("omaha-holdem 4s8c9hJdQh 2c5s6d4d 6hTc2dAs Kh3sJsAc JhAd8hKs"));
  }

  @Test
  public void test_omaha_holdem_3827_5h6h7h8cAs_Ks9d2dTs_Ad3hAcJh_2s5c3c3d_Jd7d9hJc_QhTc8hKh_Th6sJsAh_Qd5s2c2h_4h3s6c4c() {
    assertEquals(
      "2s5c3c3d Qd5s2c2h 4h3s6c4c Jd7d9hJc Ks9d2dTs Ad3hAcJh QhTc8hKh Th6sJsAh",
      Solver.process("omaha-holdem 5h6h7h8cAs Ks9d2dTs Ad3hAcJh 2s5c3c3d Jd7d9hJc QhTc8hKh Th6sJsAh Qd5s2c2h 4h3s6c4c"));
  }

  @Test
  public void test_omaha_holdem_3828_2d5dAcAsKs_4dAh6s7h_3h9h2h8h() {
    assertEquals(
      "3h9h2h8h 4dAh6s7h",
      Solver.process("omaha-holdem 2d5dAcAsKs 4dAh6s7h 3h9h2h8h"));
  }

  @Test
  public void test_omaha_holdem_3829_2h3c4hAcKd_6c3sJs4c_Qh7cTdKh_4sJh7d2d_9s8d6sQd_6hJd9d8s() {
    assertEquals(
      "6hJd9d8s 9s8d6sQd Qh7cTdKh 4sJh7d2d 6c3sJs4c",
      Solver.process("omaha-holdem 2h3c4hAcKd 6c3sJs4c Qh7cTdKh 4sJh7d2d 9s8d6sQd 6hJd9d8s"));
  }

  @Test
  public void test_omaha_holdem_3830_4d5s6h9dKc_7d5dQdTd_TcAcQcTh_9s3s9h2d_Jc3dQhAh_JdJh6s4s_6d9c8h4h_4c8sQs3c_Ks8c7s2h() {
    assertEquals(
      "Jc3dQhAh 4c8sQs3c 7d5dQdTd TcAcQcTh JdJh6s4s 6d9c8h4h 9s3s9h2d Ks8c7s2h",
      Solver.process("omaha-holdem 4d5s6h9dKc 7d5dQdTd TcAcQcTh 9s3s9h2d Jc3dQhAh JdJh6s4s 6d9c8h4h 4c8sQs3c Ks8c7s2h"));
  }

  @Test
  public void test_omaha_holdem_3831_4d9dJdJhQs_AcJcThKc_JsTd6c9c_3sQc4c4h() {
    assertEquals(
      "AcJcThKc 3sQc4c4h JsTd6c9c",
      Solver.process("omaha-holdem 4d9dJdJhQs AcJcThKc JsTd6c9c 3sQc4c4h"));
  }

  @Test
  public void test_omaha_holdem_3832_2d3c7c8c9c_9hKcQcKd_3h5dAsQh_4hQdTd4d_KhTh4c7s_Jc6d5cTc_Ac6c4s5h_Ks7d6s8d() {
    assertEquals(
      "3h5dAsQh 4hQdTd4d KhTh4c7s Ks7d6s8d 9hKcQcKd Ac6c4s5h Jc6d5cTc",
      Solver.process("omaha-holdem 2d3c7c8c9c 9hKcQcKd 3h5dAsQh 4hQdTd4d KhTh4c7s Jc6d5cTc Ac6c4s5h Ks7d6s8d"));
  }

  @Test
  public void test_omaha_holdem_3833_5s7c8s9sQh_6c8c3s8h_KcQc5hKd_JdTcThQs_6s4c3cAc_Qd5dAsAd_4dJh2cAh_4sKh5c2s() {
    assertEquals(
      "4dJh2cAh KcQc5hKd=Qd5dAsAd 6s4c3cAc 6c8c3s8h JdTcThQs 4sKh5c2s",
      Solver.process("omaha-holdem 5s7c8s9sQh 6c8c3s8h KcQc5hKd JdTcThQs 6s4c3cAc Qd5dAsAd 4dJh2cAh 4sKh5c2s"));
  }

  @Test
  public void test_omaha_holdem_3834_3d5h7cKsQh_6dJd3hTh_Qd9hQsKc_8s2hTd6h_AcKd4h3s_8hAs5sTs_9d7dAd6s() {
    assertEquals(
      "8s2hTd6h 6dJd3hTh 8hAs5sTs 9d7dAd6s AcKd4h3s Qd9hQsKc",
      Solver.process("omaha-holdem 3d5h7cKsQh 6dJd3hTh Qd9hQsKc 8s2hTd6h AcKd4h3s 8hAs5sTs 9d7dAd6s"));
  }

  @Test
  public void test_omaha_holdem_3835_5c5h9cAcKs_8sQc7d2d_3c2cTs8d() {
    assertEquals(
      "8sQc7d2d 3c2cTs8d",
      Solver.process("omaha-holdem 5c5h9cAcKs 8sQc7d2d 3c2cTs8d"));
  }

  @Test
  public void test_omaha_holdem_3836_2c5c5s9sQc_4d7cTd8s_4c9c7s8c_6sTs9dJs() {
    assertEquals(
      "4d7cTd8s 6sTs9dJs 4c9c7s8c",
      Solver.process("omaha-holdem 2c5c5s9sQc 4d7cTd8s 4c9c7s8c 6sTs9dJs"));
  }

  @Test
  public void test_omaha_holdem_3837_3c5h9sAcKc_AhKd7h8c_3dAd6cJs_8sQc2hAs_9c8h3h7c_7dJdQs9h_4cQd7s2s_2d6h9dQh_TcJc4h6d() {
    assertEquals(
      "2d6h9dQh=7dJdQs9h 8sQc2hAs 3dAd6cJs AhKd7h8c 4cQd7s2s 9c8h3h7c TcJc4h6d",
      Solver.process("omaha-holdem 3c5h9sAcKc AhKd7h8c 3dAd6cJs 8sQc2hAs 9c8h3h7c 7dJdQs9h 4cQd7s2s 2d6h9dQh TcJc4h6d"));
  }

  @Test
  public void test_omaha_holdem_3838_3d3s6s9sQd_3hKcJd5d_4dAs6cTd_2h7sAdQs_8sQc5sAh_2cTc8dJs_7dTh9cJc_QhKh2sKd_4h2d4c6d() {
    assertEquals(
      "2cTc8dJs 4h2d4c6d 4dAs6cTd 7dTh9cJc QhKh2sKd 3hKcJd5d 8sQc5sAh 2h7sAdQs",
      Solver.process("omaha-holdem 3d3s6s9sQd 3hKcJd5d 4dAs6cTd 2h7sAdQs 8sQc5sAh 2cTc8dJs 7dTh9cJc QhKh2sKd 4h2d4c6d"));
  }

  @Test
  public void test_omaha_holdem_3839_3h4c6s8c8d_Qh5d7h5h_5s6h9d2s_8s4sJs5c_3s9cJc3c_7d2c9h6c_8h7cKh7s_9sKsAhAc_JdQc2dQs() {
    assertEquals(
      "7d2c9h6c JdQc2dQs 9sKsAhAc 8h7cKh7s 5s6h9d2s Qh5d7h5h 3s9cJc3c 8s4sJs5c",
      Solver.process("omaha-holdem 3h4c6s8c8d Qh5d7h5h 5s6h9d2s 8s4sJs5c 3s9cJc3c 7d2c9h6c 8h7cKh7s 9sKsAhAc JdQc2dQs"));
  }

  @Test
  public void test_omaha_holdem_3840_3h6d9hAsTc_2dJc9s9c_8dKdJs3s_2c7dJd7s() {
    assertEquals(
      "8dKdJs3s 2c7dJd7s 2dJc9s9c",
      Solver.process("omaha-holdem 3h6d9hAsTc 2dJc9s9c 8dKdJs3s 2c7dJd7s"));
  }

  @Test
  public void test_omaha_holdem_3841_2s3h8cKcTs_Qh2h9sJs_JdJh6d9c_Kd5hTh4s_7d8h7hTd() {
    assertEquals(
      "Qh2h9sJs JdJh6d9c 7d8h7hTd Kd5hTh4s",
      Solver.process("omaha-holdem 2s3h8cKcTs Qh2h9sJs JdJh6d9c Kd5hTh4s 7d8h7hTd"));
  }

  @Test
  public void test_omaha_holdem_3842_2h2s5d6d6s_9h8sAsKd_8h4hTsAc_AdKs7c3c_QdTd3dJh_5c7s2d3h_Ah8d6hQs() {
    assertEquals(
      "QdTd3dJh 8h4hTsAc 9h8sAsKd=AdKs7c3c Ah8d6hQs 5c7s2d3h",
      Solver.process("omaha-holdem 2h2s5d6d6s 9h8sAsKd 8h4hTsAc AdKs7c3c QdTd3dJh 5c7s2d3h Ah8d6hQs"));
  }

  @Test
  public void test_omaha_holdem_3843_3d8cAhKdQs_9sQdTcTh_Td4sAdTs_5hJd6cKs_6h5cKh8d_2hJsQcAc() {
    assertEquals(
      "9sQdTcTh 5hJd6cKs Td4sAdTs 6h5cKh8d 2hJsQcAc",
      Solver.process("omaha-holdem 3d8cAhKdQs 9sQdTcTh Td4sAdTs 5hJd6cKs 6h5cKh8d 2hJsQcAc"));
  }

  @Test
  public void test_omaha_holdem_3844_6d7s9sAhQh_4hJs4cTd_5c2sKh2h_JhTs9c3s_Qs2dTh4d_2cJcQdKc_6s7hQc3c_8d7dKd9h_5sAcAd8h_6c9dTc7c() {
    assertEquals(
      "5c2sKh2h 4hJs4cTd JhTs9c3s Qs2dTh4d 2cJcQdKc 6c9dTc7c=8d7dKd9h 6s7hQc3c 5sAcAd8h",
      Solver.process("omaha-holdem 6d7s9sAhQh 4hJs4cTd 5c2sKh2h JhTs9c3s Qs2dTh4d 2cJcQdKc 6s7hQc3c 8d7dKd9h 5sAcAd8h 6c9dTc7c"));
  }

  @Test
  public void test_omaha_holdem_3845_4h5d7sAcQs_9cJdThAh_Kh3hQh9s_Ad2dTd8s_TsTcJhJs_3sKc5cJc_8d4s2s6h_7h9d6cKd_5h8h3c4d() {
    assertEquals(
      "3sKc5cJc 7h9d6cKd TsTcJhJs Kh3hQh9s Ad2dTd8s 9cJdThAh 5h8h3c4d 8d4s2s6h",
      Solver.process("omaha-holdem 4h5d7sAcQs 9cJdThAh Kh3hQh9s Ad2dTd8s TsTcJhJs 3sKc5cJc 8d4s2s6h 7h9d6cKd 5h8h3c4d"));
  }

  @Test
  public void test_omaha_holdem_3846_4d5h6sAhQc_7cKsTdTc_6hJs9d5c_2cQh9h7h_4cQd2dAs_3sKd2s9c() {
    assertEquals(
      "7cKsTdTc 2cQh9h7h 6hJs9d5c 4cQd2dAs 3sKd2s9c",
      Solver.process("omaha-holdem 4d5h6sAhQc 7cKsTdTc 6hJs9d5c 2cQh9h7h 4cQd2dAs 3sKd2s9c"));
  }

  @Test
  public void test_omaha_holdem_3847_2d8sAhAsJh_7c4c7h2h_Kh3h2c7s_3c9d6hTc_Kc9sTh4s_4d9c3sAc_5sJc7dQh() {
    assertEquals(
      "3c9d6hTc Kc9sTh4s Kh3h2c7s 7c4c7h2h 5sJc7dQh 4d9c3sAc",
      Solver.process("omaha-holdem 2d8sAhAsJh 7c4c7h2h Kh3h2c7s 3c9d6hTc Kc9sTh4s 4d9c3sAc 5sJc7dQh"));
  }

  @Test
  public void test_omaha_holdem_3848_3s5c6sAcTd_4s4d6hJd_7c2h8hKs_QhTh7hJs() {
    assertEquals(
      "7c2h8hKs 4s4d6hJd QhTh7hJs",
      Solver.process("omaha-holdem 3s5c6sAcTd 4s4d6hJd 7c2h8hKs QhTh7hJs"));
  }

  @Test
  public void test_omaha_holdem_3849_5h6s7c9hJd_9cAc9s8d_ThTc4d6d_3s2d4sAh_8h7hJcAd_4c8cJh2s_7s5s4hKs_Kc5cTs7d_QdQcKdJs_Qh5d8sQs() {
    assertEquals(
      "ThTc4d6d QdQcKdJs 7s5s4hKs=Kc5cTs7d 3s2d4sAh 4c8cJh2s 8h7hJcAd=9cAc9s8d=Qh5d8sQs",
      Solver.process("omaha-holdem 5h6s7c9hJd 9cAc9s8d ThTc4d6d 3s2d4sAh 8h7hJcAd 4c8cJh2s 7s5s4hKs Kc5cTs7d QdQcKdJs Qh5d8sQs"));
  }

  @Test
  public void test_omaha_holdem_3850_2s3cTcTdTh_9sJs3h9c_5dJd4c3s_2dAc5sTs_Jh6sQdQh_Qs7dAd6c_4h8d4s2c_9dAs3d4d_KcKd6h7h() {
    assertEquals(
      "5dJd4c3s 9dAs3d4d Qs7dAd6c 4h8d4s2c 9sJs3h9c Jh6sQdQh KcKd6h7h 2dAc5sTs",
      Solver.process("omaha-holdem 2s3cTcTdTh 9sJs3h9c 5dJd4c3s 2dAc5sTs Jh6sQdQh Qs7dAd6c 4h8d4s2c 9dAs3d4d KcKd6h7h"));
  }

  @Test
  public void test_omaha_holdem_3851_2d2h5c7hTd_8sTsQd5d_Tc6dKh9s_Th3h8cKd_6hAcJs9c_Qc5h8d4s() {
    assertEquals(
      "6hAcJs9c Qc5h8d4s Tc6dKh9s=Th3h8cKd 8sTsQd5d",
      Solver.process("omaha-holdem 2d2h5c7hTd 8sTsQd5d Tc6dKh9s Th3h8cKd 6hAcJs9c Qc5h8d4s"));
  }

  @Test
  public void test_omaha_holdem_3852_6h7c9cJhKc_4h7sQh8h_9h9sKs5d_JsQsAhKh_5s2hJdAd_Ac2sAs7h_5h6d5cQd_3h3c2d3s() {
    assertEquals(
      "3h3c2d3s 5h6d5cQd 4h7sQh8h 5s2hJdAd Ac2sAs7h JsQsAhKh 9h9sKs5d",
      Solver.process("omaha-holdem 6h7c9cJhKc 4h7sQh8h 9h9sKs5d JsQsAhKh 5s2hJdAd Ac2sAs7h 5h6d5cQd 3h3c2d3s"));
  }

  @Test
  public void test_omaha_holdem_3853_4d6d9dQhTs_Kd4cAh4h_8hAd3c8c_8dAc7h2c_3h9hQdTc() {
    assertEquals(
      "8hAd3c8c 3h9hQdTc Kd4cAh4h 8dAc7h2c",
      Solver.process("omaha-holdem 4d6d9dQhTs Kd4cAh4h 8hAd3c8c 8dAc7h2c 3h9hQdTc"));
  }

  @Test
  public void test_omaha_holdem_3854_7d7sAcKsQd_8sQh8hQs_3h2c3d7c_6sTh4hJc() {
    assertEquals(
      "3h2c3d7c 6sTh4hJc 8sQh8hQs",
      Solver.process("omaha-holdem 7d7sAcKsQd 8sQh8hQs 3h2c3d7c 6sTh4hJc"));
  }

  @Test
  public void test_omaha_holdem_3855_2s3hKsTdTh_2c9d7d3c_JdKd5d8c_5h7cAcQd_8s9hKcJc_4d3s7hJs_9c6dKhTs_6c2d6s4c_Ad2h7s5s_4hTcJh6h() {
    assertEquals(
      "5h7cAcQd Ad2h7s5s 2c9d7d3c 4d3s7hJs 6c2d6s4c 8s9hKcJc=JdKd5d8c 4hTcJh6h 9c6dKhTs",
      Solver.process("omaha-holdem 2s3hKsTdTh 2c9d7d3c JdKd5d8c 5h7cAcQd 8s9hKcJc 4d3s7hJs 9c6dKhTs 6c2d6s4c Ad2h7s5s 4hTcJh6h"));
  }

  @Test
  public void test_omaha_holdem_3856_3d7h8dQdTs_Td9hQc8h_Th6d5cJc() {
    assertEquals(
      "Th6d5cJc Td9hQc8h",
      Solver.process("omaha-holdem 3d7h8dQdTs Td9hQc8h Th6d5cJc"));
  }

  @Test
  public void test_omaha_holdem_3857_5s8s9dAcJd_7s5h3h2s_Th8h9sQh_JsKcAh2c_Jh2h4cJc() {
    assertEquals(
      "7s5h3h2s JsKcAh2c Jh2h4cJc Th8h9sQh",
      Solver.process("omaha-holdem 5s8s9dAcJd 7s5h3h2s Th8h9sQh JsKcAh2c Jh2h4cJc"));
  }

  @Test
  public void test_omaha_holdem_3858_2c6h7sKcTs_Jd4c5h6c_4d8h5d6s_3hTcJh9c_7cQhKd8d_2s2d7dQs_2hQd9hAs_3dAd3s5s() {
    assertEquals(
      "2hQd9hAs 3dAd3s5s 4d8h5d6s Jd4c5h6c 3hTcJh9c 7cQhKd8d 2s2d7dQs",
      Solver.process("omaha-holdem 2c6h7sKcTs Jd4c5h6c 4d8h5d6s 3hTcJh9c 7cQhKd8d 2s2d7dQs 2hQd9hAs 3dAd3s5s"));
  }

  @Test
  public void test_omaha_holdem_3859_2c3c3h5cTd_Ac8d7d2h_5sQh7h6d_QcJcAhKs_Ad4c3d7s_4d4hTh8h_6s5d3s7c_KhTcQsQd() {
    assertEquals(
      "Ac8d7d2h 5sQh7h6d 4d4hTh8h KhTcQsQd Ad4c3d7s QcJcAhKs 6s5d3s7c",
      Solver.process("omaha-holdem 2c3c3h5cTd Ac8d7d2h 5sQh7h6d QcJcAhKs Ad4c3d7s 4d4hTh8h 6s5d3s7c KhTcQsQd"));
  }

  @Test
  public void test_omaha_holdem_3860_4s8s9dJdJh_Kc7d9sKs_5d7sTc6d_7c7h2hAc_Jc3h4d4c_9hKhTsAh_QsAdQhTd() {
    assertEquals(
      "7c7h2hAc 9hKhTsAh Kc7d9sKs 5d7sTc6d QsAdQhTd Jc3h4d4c",
      Solver.process("omaha-holdem 4s8s9dJdJh Kc7d9sKs 5d7sTc6d 7c7h2hAc Jc3h4d4c 9hKhTsAh QsAdQhTd"));
  }

  @Test
  public void test_omaha_holdem_3861_3c6h7s8d9s_4s2sKhAd_JhAs8hTd_7hJc7c4d_2dKc3s5d_9h5cQcKs_AcTc5s3h_TsAh4h6c_Jd9c2c4c_Qd5h8c2h() {
    assertEquals(
      "4s2sKhAd 2dKc3s5d AcTc5s3h Jd9c2c4c 7hJc7c4d 9h5cQcKs=Qd5h8c2h TsAh4h6c JhAs8hTd",
      Solver.process("omaha-holdem 3c6h7s8d9s 4s2sKhAd JhAs8hTd 7hJc7c4d 2dKc3s5d 9h5cQcKs AcTc5s3h TsAh4h6c Jd9c2c4c Qd5h8c2h"));
  }

  @Test
  public void test_omaha_holdem_3862_6hJhKsTdTh_8h5c9dJs_2sQd9h9c_7hQcTc7s_5s8d8sJd_KcJcAd3c() {
    assertEquals(
      "5s8d8sJd 8h5c9dJs KcJcAd3c 7hQcTc7s 2sQd9h9c",
      Solver.process("omaha-holdem 6hJhKsTdTh 8h5c9dJs 2sQd9h9c 7hQcTc7s 5s8d8sJd KcJcAd3c"));
  }

  @Test
  public void test_omaha_holdem_3863_3sJhJsKsTs_5c9sQd4s_Ah9h2hJc_9c4cQc6d_8dJdTd3d_Th2s5sKd() {
    assertEquals(
      "Ah9h2hJc 9c4cQc6d Th2s5sKd 5c9sQd4s 8dJdTd3d",
      Solver.process("omaha-holdem 3sJhJsKsTs 5c9sQd4s Ah9h2hJc 9c4cQc6d 8dJdTd3d Th2s5sKd"));
  }

  @Test
  public void test_omaha_holdem_3864_2c4c7sJcKd_4sAh3s7c_6c5hAdQd_Ac4h3dTd_JsKh4d9d_Jh7h6h9s() {
    assertEquals(
      "6c5hAdQd Ac4h3dTd 4sAh3s7c Jh7h6h9s JsKh4d9d",
      Solver.process("omaha-holdem 2c4c7sJcKd 4sAh3s7c 6c5hAdQd Ac4h3dTd JsKh4d9d Jh7h6h9s"));
  }

  @Test
  public void test_omaha_holdem_3865_6d7d9hTcTd_3c3sQsKh_2d7h5sTs() {
    assertEquals(
      "3c3sQsKh 2d7h5sTs",
      Solver.process("omaha-holdem 6d7d9hTcTd 3c3sQsKh 2d7h5sTs"));
  }

  @Test
  public void test_omaha_holdem_3866_2s7h9dJcTs_Qh3cTc6h_2h5s9sQc_8c8dTd7s_5cKh5hQs_6c7cAcAs_2c9cQd8s() {
    assertEquals(
      "Qh3cTc6h 6c7cAcAs 2h5s9sQc 8c8dTd7s 2c9cQd8s 5cKh5hQs",
      Solver.process("omaha-holdem 2s7h9dJcTs Qh3cTc6h 2h5s9sQc 8c8dTd7s 5cKh5hQs 6c7cAcAs 2c9cQd8s"));
  }

  @Test
  public void test_omaha_holdem_3867_2c4d8hKhQc_8c2h3h7d_JsAh9c5d_8s7cQhJd_8dKs4cQd_2d5hTcKd() {
    assertEquals(
      "JsAh9c5d 8c2h3h7d 8s7cQhJd 2d5hTcKd 8dKs4cQd",
      Solver.process("omaha-holdem 2c4d8hKhQc 8c2h3h7d JsAh9c5d 8s7cQhJd 8dKs4cQd 2d5hTcKd"));
  }

  @Test
  public void test_omaha_holdem_3868_6h9h9sAcAd_KhJs7d5s_7c8h7s2c_4cKcQcQh_Jh5d3s8s_8cTsQdKs_8d9c2hQs_2dAh4s6c_5h6dJcTc() {
    assertEquals(
      "Jh5d3s8s KhJs7d5s 8cTsQdKs 5h6dJcTc 7c8h7s2c 4cKcQcQh 8d9c2hQs 2dAh4s6c",
      Solver.process("omaha-holdem 6h9h9sAcAd KhJs7d5s 7c8h7s2c 4cKcQcQh Jh5d3s8s 8cTsQdKs 8d9c2hQs 2dAh4s6c 5h6dJcTc"));
  }

  @Test
  public void test_omaha_holdem_3869_6s9hKdKhQh_9d2hJh3d_Qd4s4hTs_8cKs5cKc_2s2c6h5s_7d6dJs3s_7h8d4cTh_As6c7cJc() {
    assertEquals(
      "2s2c6h5s 7d6dJs3s As6c7cJc Qd4s4hTs 7h8d4cTh 9d2hJh3d 8cKs5cKc",
      Solver.process("omaha-holdem 6s9hKdKhQh 9d2hJh3d Qd4s4hTs 8cKs5cKc 2s2c6h5s 7d6dJs3s 7h8d4cTh As6c7cJc"));
  }

  @Test
  public void test_omaha_holdem_3870_5d6h8hAhKc_Th6dJhJs_Kd2dKsAc_5s7d3hTs_2h7sAsJc_2s3s5hTc_9c4d2c8c_Qs7c3c9s() {
    assertEquals(
      "2s3s5hTc=5s7d3hTs 9c4d2c8c 2h7sAsJc Kd2dKsAc Qs7c3c9s Th6dJhJs",
      Solver.process("omaha-holdem 5d6h8hAhKc Th6dJhJs Kd2dKsAc 5s7d3hTs 2h7sAsJc 2s3s5hTc 9c4d2c8c Qs7c3c9s"));
  }

  @Test
  public void test_omaha_holdem_3871_5s6c7sJdKs_7d4c9h3h_KdTdThKc_JhTcAs8s_9sQcAc4h_3c2hQsAd_2d3d5c6h_Qd4d8h5d_Kh6s8c7c() {
    assertEquals(
      "3c2hQsAd=9sQcAc4h 2d3d5c6h Kh6s8c7c KdTdThKc 7d4c9h3h Qd4d8h5d JhTcAs8s",
      Solver.process("omaha-holdem 5s6c7sJdKs 7d4c9h3h KdTdThKc JhTcAs8s 9sQcAc4h 3c2hQsAd 2d3d5c6h Qd4d8h5d Kh6s8c7c"));
  }

  @Test
  public void test_omaha_holdem_3872_3h4c5h6dKd_Ks9h7dJd_QdJs4h6s_9c6hAsKc_5sTd3d4d_2c9dTc3c_2d8d7h3s_Ad2h5d4s() {
    assertEquals(
      "Ks9h7dJd 5sTd3d4d QdJs4h6s 9c6hAsKc 2c9dTc3c=Ad2h5d4s 2d8d7h3s",
      Solver.process("omaha-holdem 3h4c5h6dKd Ks9h7dJd QdJs4h6s 9c6hAsKc 5sTd3d4d 2c9dTc3c 2d8d7h3s Ad2h5d4s"));
  }

  @Test
  public void test_omaha_holdem_3873_3c6cAdJdKd_5hJcAh7s_2s9s7h4c() {
    assertEquals(
      "2s9s7h4c 5hJcAh7s",
      Solver.process("omaha-holdem 3c6cAdJdKd 5hJcAh7s 2s9s7h4c"));
  }

  @Test
  public void test_omaha_holdem_3874_3d6h8d8hTd_9s4h3hQh_4c5hAc6d_6sTcJcKd_8cAh2d7h_5d2sKs3s_QcJs2h8s() {
    assertEquals(
      "9s4h3hQh 5d2sKs3s 4c5hAc6d 6sTcJcKd QcJs2h8s 8cAh2d7h",
      Solver.process("omaha-holdem 3d6h8d8hTd 9s4h3hQh 4c5hAc6d 6sTcJcKd 8cAh2d7h 5d2sKs3s QcJs2h8s"));
  }

  @Test
  public void test_omaha_holdem_3875_3c4h8d9cQh_6sAd7c6d_7s2c2hAh() {
    assertEquals(
      "7s2c2hAh 6sAd7c6d",
      Solver.process("omaha-holdem 3c4h8d9cQh 6sAd7c6d 7s2c2hAh"));
  }

  @Test
  public void test_omaha_holdem_3876_4d6s8sAcTd_3hTs6dQc_6h9cQs2s_8d3sAdJh_Js7c5d9h_As2h5h9d_5c4hTh8h_8c4cJcQd() {
    assertEquals(
      "6h9cQs2s As2h5h9d 8c4cJcQd 3hTs6dQc 5c4hTh8h 8d3sAdJh Js7c5d9h",
      Solver.process("omaha-holdem 4d6s8sAcTd 3hTs6dQc 6h9cQs2s 8d3sAdJh Js7c5d9h As2h5h9d 5c4hTh8h 8c4cJcQd"));
  }

  @Test
  public void test_omaha_holdem_3877_8d9sAdAsKd_7d7h8c9c_9d3cJs5c_QhJd4h7s_6hQs4s2h() {
    assertEquals(
      "6hQs4s2h QhJd4h7s 7d7h8c9c 9d3cJs5c",
      Solver.process("omaha-holdem 8d9sAdAsKd 7d7h8c9c 9d3cJs5c QhJd4h7s 6hQs4s2h"));
  }

  @Test
  public void test_omaha_holdem_3878_2h6dKdQcTc_5h2c8d5c_8h4cKs7h() {
    assertEquals(
      "5h2c8d5c 8h4cKs7h",
      Solver.process("omaha-holdem 2h6dKdQcTc 5h2c8d5c 8h4cKs7h"));
  }

  @Test
  public void test_omaha_holdem_3879_7h7s8cJcJs_5h6dKsTh_Ts2d9c6c_As2s3d6s_4sKd5s4h_2h5d8d6h_8h4dAhTd_Ac4cAd2c_9sQh9dJh_8s3h7dKh() {
    assertEquals(
      "5h6dKsTh As2s3d6s 4sKd5s4h 2h5d8d6h 8h4dAhTd Ac4cAd2c 9sQh9dJh Ts2d9c6c 8s3h7dKh",
      Solver.process("omaha-holdem 7h7s8cJcJs 5h6dKsTh Ts2d9c6c As2s3d6s 4sKd5s4h 2h5d8d6h 8h4dAhTd Ac4cAd2c 9sQh9dJh 8s3h7dKh"));
  }

  @Test
  public void test_omaha_holdem_3880_4c4h5c8s9h_Ts8c6hQs_4d7d9s9d_3s2h7hKc() {
    assertEquals(
      "3s2h7hKc Ts8c6hQs 4d7d9s9d",
      Solver.process("omaha-holdem 4c4h5c8s9h Ts8c6hQs 4d7d9s9d 3s2h7hKc"));
  }

  @Test
  public void test_omaha_holdem_3881_2h3c8dAsKc_JcAd3s4s_8cKdTh3d() {
    assertEquals(
      "8cKdTh3d JcAd3s4s",
      Solver.process("omaha-holdem 2h3c8dAsKc JcAd3s4s 8cKdTh3d"));
  }

  @Test
  public void test_omaha_holdem_3882_2h7sAdKdQc_KhQdQsKs_Jh6c4sTs() {
    assertEquals(
      "KhQdQsKs Jh6c4sTs",
      Solver.process("omaha-holdem 2h7sAdKdQc KhQdQsKs Jh6c4sTs"));
  }

  @Test
  public void test_omaha_holdem_3883_2c2d4c4dAd_6sQhJd5d_3c3hTs9d_KhAh8s8d_Ac7c7h5s_Td2h8cJc_6cJsTh5h_9cAs3d3s_2sTcKd8h_Jh4h9hKc() {
    assertEquals(
      "6cJsTh5h 3c3hTs9d Ac7c7h5s 9cAs3d3s KhAh8s8d Td2h8cJc 2sTcKd8h Jh4h9hKc 6sQhJd5d",
      Solver.process("omaha-holdem 2c2d4c4dAd 6sQhJd5d 3c3hTs9d KhAh8s8d Ac7c7h5s Td2h8cJc 6cJsTh5h 9cAs3d3s 2sTcKd8h Jh4h9hKc"));
  }

  @Test
  public void test_omaha_holdem_3884_4d8cAcJhTc_Ad3h6s2s_4cKsKh9c_Kc2h9h6h() {
    assertEquals(
      "Kc2h9h6h Ad3h6s2s 4cKsKh9c",
      Solver.process("omaha-holdem 4d8cAcJhTc Ad3h6s2s 4cKsKh9c Kc2h9h6h"));
  }

  @Test
  public void test_omaha_holdem_3885_2cAcJhQsTs_Th9s8cAh_5h3d3h4h_4cTc8dKc() {
    assertEquals(
      "5h3d3h4h Th9s8cAh 4cTc8dKc",
      Solver.process("omaha-holdem 2cAcJhQsTs Th9s8cAh 5h3d3h4h 4cTc8dKc"));
  }

  @Test
  public void test_omaha_holdem_3886_2s4c6sAhAs_6hJc3s8c_8hJsAd5d_3dKsAc9d() {
    assertEquals(
      "6hJc3s8c 8hJsAd5d 3dKsAc9d",
      Solver.process("omaha-holdem 2s4c6sAhAs 6hJc3s8c 8hJsAd5d 3dKsAc9d"));
  }

  @Test
  public void test_omaha_holdem_3887_4h8hJsTcTs_Th3cQc3d_5d7d5h9h_Jd4cAcKs_8d6hKc2d() {
    assertEquals(
      "8d6hKc2d Jd4cAcKs Th3cQc3d 5d7d5h9h",
      Solver.process("omaha-holdem 4h8hJsTcTs Th3cQc3d 5d7d5h9h Jd4cAcKs 8d6hKc2d"));
  }

  @Test
  public void test_omaha_holdem_3888_2d3dAcKdKh_Td6c4s7s_5s5dJh2h_8hQs4h7h_2c7cJsJd_6sQd8sKc_Jc9h2s5h_Qh3c6h9d() {
    assertEquals(
      "Td6c4s7s 8hQs4h7h Jc9h2s5h Qh3c6h9d 5s5dJh2h 2c7cJsJd 6sQd8sKc",
      Solver.process("omaha-holdem 2d3dAcKdKh Td6c4s7s 5s5dJh2h 8hQs4h7h 2c7cJsJd 6sQd8sKc Jc9h2s5h Qh3c6h9d"));
  }

  @Test
  public void test_omaha_holdem_3889_2h3c5c7c9h_8s9cKsJh_4sJs5s6d_5d2cQd8c() {
    assertEquals(
      "8s9cKsJh 4sJs5s6d 5d2cQd8c",
      Solver.process("omaha-holdem 2h3c5c7c9h 8s9cKsJh 4sJs5s6d 5d2cQd8c"));
  }

  @Test
  public void test_omaha_holdem_3890_2h5h6sKsQd_Ts3s9cJd_3hAcJcTh_Qs9s6h6c_Kh4hAh5c() {
    assertEquals(
      "Ts3s9cJd 3hAcJcTh Kh4hAh5c Qs9s6h6c",
      Solver.process("omaha-holdem 2h5h6sKsQd Ts3s9cJd 3hAcJcTh Qs9s6h6c Kh4hAh5c"));
  }

  @Test
  public void test_omaha_holdem_3891_2c5c8hAcTc_QsKcJh3s_9dQc7c6h_Jc3dTh7h_2hKs7s4d_2s6c8d8s_6s5h2dTs() {
    assertEquals(
      "QsKcJh3s 2hKs7s4d Jc3dTh7h 6s5h2dTs 2s6c8d8s 9dQc7c6h",
      Solver.process("omaha-holdem 2c5c8hAcTc QsKcJh3s 9dQc7c6h Jc3dTh7h 2hKs7s4d 2s6c8d8s 6s5h2dTs"));
  }

  @Test
  public void test_omaha_holdem_3892_2d3hJcTcTd_As7s3c9c_Ad7c4c5c_Kc2hJsQs_6s2cJhKd_QcAhJd9d_6d2s8c3s_3d4s7h8s_4h9s8hQd() {
    assertEquals(
      "4h9s8hQd Ad7c4c5c 3d4s7h8s=6d2s8c3s As7s3c9c 6s2cJhKd=Kc2hJsQs QcAhJd9d",
      Solver.process("omaha-holdem 2d3hJcTcTd As7s3c9c Ad7c4c5c Kc2hJsQs 6s2cJhKd QcAhJd9d 6d2s8c3s 3d4s7h8s 4h9s8hQd"));
  }

  @Test
  public void test_omaha_holdem_3893_2s7cAsJsQd_2dTh2c6c_8cTc6h3s_QhTd9hQc_9dKd8h7d_Kh8d5cAh() {
    assertEquals(
      "8cTc6h3s 9dKd8h7d Kh8d5cAh 2dTh2c6c QhTd9hQc",
      Solver.process("omaha-holdem 2s7cAsJsQd 2dTh2c6c 8cTc6h3s QhTd9hQc 9dKd8h7d Kh8d5cAh"));
  }

  @Test
  public void test_omaha_holdem_3894_2h6s8c8hAc_3hAs2d4s_9s4d6hKd() {
    assertEquals(
      "9s4d6hKd 3hAs2d4s",
      Solver.process("omaha-holdem 2h6s8c8hAc 3hAs2d4s 9s4d6hKd"));
  }

  @Test
  public void test_omaha_holdem_3895_2h3h4c9cQh_6c3dKhKd_AcKs2s2d() {
    assertEquals(
      "6c3dKhKd AcKs2s2d",
      Solver.process("omaha-holdem 2h3h4c9cQh 6c3dKhKd AcKs2s2d"));
  }

  @Test
  public void test_omaha_holdem_3896_2h8cJsQdTc_JcTs9cAc_8s6cAd3s_6h5d6d9h_KsAs4h7c_Th9s3d4c_2d5h8d4d_7hJd2c6s() {
    assertEquals(
      "6h5d6d9h 8s6cAd3s 2d5h8d4d 7hJd2c6s JcTs9cAc=Th9s3d4c KsAs4h7c",
      Solver.process("omaha-holdem 2h8cJsQdTc JcTs9cAc 8s6cAd3s 6h5d6d9h KsAs4h7c Th9s3d4c 2d5h8d4d 7hJd2c6s"));
  }

  @Test
  public void test_omaha_holdem_3897_7h9hAhJdQs_Kh8cQc3c_7d2s4s4d_9cAd5c6s_Jc2h8sAs() {
    assertEquals(
      "7d2s4s4d Kh8cQc3c 9cAd5c6s Jc2h8sAs",
      Solver.process("omaha-holdem 7h9hAhJdQs Kh8cQc3c 7d2s4s4d 9cAd5c6s Jc2h8sAs"));
  }

  @Test
  public void test_omaha_holdem_3898_2hAcJhQcQd_7s2sAhKc_5d5s7h9h_8d5c8hAs_6d3s4cJd() {
    assertEquals(
      "5d5s7h9h 6d3s4cJd 8d5c8hAs 7s2sAhKc",
      Solver.process("omaha-holdem 2hAcJhQcQd 7s2sAhKc 5d5s7h9h 8d5c8hAs 6d3s4cJd"));
  }

  @Test
  public void test_omaha_holdem_3899_4h6h8cAdQh_AcAh9d8s_Th3sKc3h_2s7d9hKd_3d2h5c6d() {
    assertEquals(
      "2s7d9hKd 3d2h5c6d AcAh9d8s Th3sKc3h",
      Solver.process("omaha-holdem 4h6h8cAdQh AcAh9d8s Th3sKc3h 2s7d9hKd 3d2h5c6d"));
  }

  @Test
  public void test_omaha_holdem_3900_3h6c6s7dAc_7h7c8sTs_5cQd4cAh_Jd2h5h9h_3d9d3sKd_4d9c2s2d_4s3c8cKh_7sTcTdQs_9sJc2cAd_Jh6dAsTh() {
    assertEquals(
      "Jd2h5h9h 4d9c2s2d 4s3c8cKh 7sTcTdQs 9sJc2cAd 5cQd4cAh 3d9d3sKd Jh6dAsTh 7h7c8sTs",
      Solver.process("omaha-holdem 3h6c6s7dAc 7h7c8sTs 5cQd4cAh Jd2h5h9h 3d9d3sKd 4d9c2s2d 4s3c8cKh 7sTcTdQs 9sJc2cAd Jh6dAsTh"));
  }

  @Test
  public void test_omaha_holdem_3901_3s5h7sAhQd_6sQcQh5d_TdTsKc3c_4cKh5c9c_Kd9s8hAc_6dQsJdAs_Ks8d3h9d_Jc3d2c4h() {
    assertEquals(
      "Ks8d3h9d 4cKh5c9c TdTsKc3c Kd9s8hAc 6dQsJdAs 6sQcQh5d Jc3d2c4h",
      Solver.process("omaha-holdem 3s5h7sAhQd 6sQcQh5d TdTsKc3c 4cKh5c9c Kd9s8hAc 6dQsJdAs Ks8d3h9d Jc3d2c4h"));
  }

  @Test
  public void test_omaha_holdem_3902_7d9cQhTcTd_Th9s7h5h_9h2sKh5d_Qc7c4hJc_KdAhKs5c_3h2h3d9d_8s2dAd4s_5sAc6s8c_4c6dJhKc_3s8d6h4d() {
    assertEquals(
      "8s2dAd4s 3h2h3d9d 9h2sKh5d Qc7c4hJc KdAhKs5c 3s8d6h4d=5sAc6s8c 4c6dJhKc Th9s7h5h",
      Solver.process("omaha-holdem 7d9cQhTcTd Th9s7h5h 9h2sKh5d Qc7c4hJc KdAhKs5c 3h2h3d9d 8s2dAd4s 5sAc6s8c 4c6dJhKc 3s8d6h4d"));
  }

  @Test
  public void test_omaha_holdem_3903_5h6h9sAhTd_Th5s6s2h_KsJc7hQd_5c8h9d2s_7sJdTsQs_4sKh7d3h_6dJs5d4h_KdAdJh2c_KcAcQc3c() {
    assertEquals(
      "KsJc7hQd 7sJdTsQs KcAcQc3c=KdAdJh2c 6dJs5d4h 5c8h9d2s Th5s6s2h 4sKh7d3h",
      Solver.process("omaha-holdem 5h6h9sAhTd Th5s6s2h KsJc7hQd 5c8h9d2s 7sJdTsQs 4sKh7d3h 6dJs5d4h KdAdJh2c KcAcQc3c"));
  }

  @Test
  public void test_omaha_holdem_3904_3c5h6cAhKd_6hKc9sQs_5dKh4d3d_JdAcTc2s_2h2d2cAd_JhQd7s7h_9c3h6sKs_Th9d5c8d_5s8hAsTd_Js4h7d4c() {
    assertEquals(
      "Th9d5c8d JhQd7s7h 2h2d2cAd JdAcTc2s 5dKh4d3d 6hKc9sQs=9c3h6sKs 5s8hAsTd Js4h7d4c",
      Solver.process("omaha-holdem 3c5h6cAhKd 6hKc9sQs 5dKh4d3d JdAcTc2s 2h2d2cAd JhQd7s7h 9c3h6sKs Th9d5c8d 5s8hAsTd Js4h7d4c"));
  }

  @Test
  public void test_omaha_holdem_3905_2d4h6c9hJh_3s3cAsJc_3dTc6s8s_7h9sQc2s_5hKdKs6d() {
    assertEquals(
      "3dTc6s8s 3s3cAsJc 5hKdKs6d 7h9sQc2s",
      Solver.process("omaha-holdem 2d4h6c9hJh 3s3cAsJc 3dTc6s8s 7h9sQc2s 5hKdKs6d"));
  }

  @Test
  public void test_omaha_holdem_3906_2c4c6c9dJc_QhTsJh4d_3d8c2hQd_6s2s5d9c_5sTdAs5c_9sQcThKs_7dTc7sAc() {
    assertEquals(
      "3d8c2hQd 5sTdAs5c 9sQcThKs 6s2s5d9c QhTsJh4d 7dTc7sAc",
      Solver.process("omaha-holdem 2c4c6c9dJc QhTsJh4d 3d8c2hQd 6s2s5d9c 5sTdAs5c 9sQcThKs 7dTc7sAc"));
  }

  @Test
  public void test_omaha_holdem_3907_5s9d9h9sKc_3s4c9cTh_Qh6h7d2d_Qs8cJh4h() {
    assertEquals(
      "Qh6h7d2d Qs8cJh4h 3s4c9cTh",
      Solver.process("omaha-holdem 5s9d9h9sKc 3s4c9cTh Qh6h7d2d Qs8cJh4h"));
  }

  @Test
  public void test_omaha_holdem_3908_5c6c9cJdJh_7sKc2c9s_Ks8s7c3d_7dJs8c4s_3s6sJc9h_Td9d7h4c_3cAdThQd_Ah6d8hKh() {
    assertEquals(
      "3cAdThQd Ah6d8hKh Td9d7h4c 7dJs8c4s=Ks8s7c3d 7sKc2c9s 3s6sJc9h",
      Solver.process("omaha-holdem 5c6c9cJdJh 7sKc2c9s Ks8s7c3d 7dJs8c4s 3s6sJc9h Td9d7h4c 3cAdThQd Ah6d8hKh"));
  }

  @Test
  public void test_omaha_holdem_3909_3s5d6s7c7h_3cAhAd9d_4h4cKsQd() {
    assertEquals(
      "4h4cKsQd 3cAhAd9d",
      Solver.process("omaha-holdem 3s5d6s7c7h 3cAhAd9d 4h4cKsQd"));
  }

  @Test
  public void test_omaha_holdem_3910_7h7s9cQdQh_QcKd3h7d_Ks9s4hJc_9h3sKc2h_5c2dAc8h_Kh5d3d2c() {
    assertEquals(
      "Kh5d3d2c 5c2dAc8h 9h3sKc2h=Ks9s4hJc QcKd3h7d",
      Solver.process("omaha-holdem 7h7s9cQdQh QcKd3h7d Ks9s4hJc 9h3sKc2h 5c2dAc8h Kh5d3d2c"));
  }

  @Test
  public void test_omaha_holdem_3911_2d4d6cQsTs_Ah6s9dTd_Qh3h3s3d_7d2h5sAs_2s8s5cAd() {
    assertEquals(
      "2s8s5cAd=7d2h5sAs Qh3h3s3d Ah6s9dTd",
      Solver.process("omaha-holdem 2d4d6cQsTs Ah6s9dTd Qh3h3s3d 7d2h5sAs 2s8s5cAd"));
  }

  @Test
  public void test_omaha_holdem_3912_2h2s6s7d8d_Tc3hKhQh_Kc8cAs7s_Ts6cJdAc_5cQd6h6d() {
    assertEquals(
      "Tc3hKhQh Ts6cJdAc Kc8cAs7s 5cQd6h6d",
      Solver.process("omaha-holdem 2h2s6s7d8d Tc3hKhQh Kc8cAs7s Ts6cJdAc 5cQd6h6d"));
  }

  @Test
  public void test_omaha_holdem_3913_4d4h5hQdTs_Tc9dKdJd_2sAsKs3c_Qs6c6h7c_Js9h2d8c_Ac4cKh8d_5sTd3h3s_6dAhQhJc() {
    assertEquals(
      "Js9h2d8c 2sAsKs3c Tc9dKdJd 5sTd3h3s Qs6c6h7c 6dAhQhJc Ac4cKh8d",
      Solver.process("omaha-holdem 4d4h5hQdTs Tc9dKdJd 2sAsKs3c Qs6c6h7c Js9h2d8c Ac4cKh8d 5sTd3h3s 6dAhQhJc"));
  }

  @Test
  public void test_omaha_holdem_3914_6c6dAsJhKc_2s8sJs2c_6hKdQh3h_4cQs7sQc_6s3c5c4s_Ac5s4h5h_9d9c4dQd_2hJd5dKs_AhTd3s7c() {
    assertEquals(
      "9d9c4dQd 2s8sJs2c 4cQs7sQc 2hJd5dKs Ac5s4h5h AhTd3s7c 6s3c5c4s 6hKdQh3h",
      Solver.process("omaha-holdem 6c6dAsJhKc 2s8sJs2c 6hKdQh3h 4cQs7sQc 6s3c5c4s Ac5s4h5h 9d9c4dQd 2hJd5dKs AhTd3s7c"));
  }

  @Test
  public void test_omaha_holdem_3915_2c4s7dAsKs_Js8dQdKh_7h6s8hQh_Jc7c4cTd_9c9s6hQc_7s3d6c2h_Kc6dKdJh_5h8cTh4h_AdAh4dAc_5c3c3s3h() {
    assertEquals(
      "5h8cTh4h 7h6s8hQh 9c9s6hQc Js8dQdKh 7s3d6c2h Jc7c4cTd Kc6dKdJh AdAh4dAc 5c3c3s3h",
      Solver.process("omaha-holdem 2c4s7dAsKs Js8dQdKh 7h6s8hQh Jc7c4cTd 9c9s6hQc 7s3d6c2h Kc6dKdJh 5h8cTh4h AdAh4dAc 5c3c3s3h"));
  }

  @Test
  public void test_omaha_holdem_3916_3d3s4d5d7d_JdJh4c7c_Ts8d9d5s_QdAcKh6h_3h5cKcJc_Qh9hKsQc_8h9sTh2s_2cTd8s3c() {
    assertEquals(
      "8h9sTh2s QdAcKh6h JdJh4c7c Qh9hKsQc 2cTd8s3c Ts8d9d5s 3h5cKcJc",
      Solver.process("omaha-holdem 3d3s4d5d7d JdJh4c7c Ts8d9d5s QdAcKh6h 3h5cKcJc Qh9hKsQc 8h9sTh2s 2cTd8s3c"));
  }

  @Test
  public void test_omaha_holdem_3917_3c4h7sJdQc_8h5h4sTd_3h6c2c8c_ThKc5sJc_JsAd5c5d_6s9dAs2h_AcAh4dJh() {
    assertEquals(
      "6s9dAs2h 3h6c2c8c 8h5h4sTd ThKc5sJc JsAd5c5d AcAh4dJh",
      Solver.process("omaha-holdem 3c4h7sJdQc 8h5h4sTd 3h6c2c8c ThKc5sJc JsAd5c5d 6s9dAs2h AcAh4dJh"));
  }

  @Test
  public void test_omaha_holdem_3918_2h4h4s9cAs_QcTh6s2s_KcTd3h2d_JhTc8c3s_8dQsJc7h_6hAh5d8s_7d3d6c9s() {
    assertEquals(
      "JhTc8c3s 8dQsJc7h QcTh6s2s KcTd3h2d 7d3d6c9s 6hAh5d8s",
      Solver.process("omaha-holdem 2h4h4s9cAs QcTh6s2s KcTd3h2d JhTc8c3s 8dQsJc7h 6hAh5d8s 7d3d6c9s"));
  }

  @Test
  public void test_omaha_holdem_3919_3h6s7h7sTh_Jh4d8h2c_TdKd2d8s_6cKs5d3c_9hAcAdAs_Kc5hQdJd_Qs2h6hQh_7c5sTsAh_3s6d5cTc_3d7d8cJc() {
    assertEquals(
      "Kc5hQdJd 6cKs5d3c 3s6d5cTc TdKd2d8s 9hAcAdAs Jh4d8h2c Qs2h6hQh 3d7d8cJc 7c5sTsAh",
      Solver.process("omaha-holdem 3h6s7h7sTh Jh4d8h2c TdKd2d8s 6cKs5d3c 9hAcAdAs Kc5hQdJd Qs2h6hQh 7c5sTsAh 3s6d5cTc 3d7d8cJc"));
  }

  @Test
  public void test_omaha_holdem_3920_2s7h8hAsQs_QcJh4sTd_3s4hTh2c_Qh8d9cAc_6c8sJs5h_Qd5sKc3c_2d9h6s2h_6dJcKd9d() {
    assertEquals(
      "6dJcKd9d 3s4hTh2c QcJh4sTd Qd5sKc3c Qh8d9cAc 2d9h6s2h 6c8sJs5h",
      Solver.process("omaha-holdem 2s7h8hAsQs QcJh4sTd 3s4hTh2c Qh8d9cAc 6c8sJs5h Qd5sKc3c 2d9h6s2h 6dJcKd9d"));
  }

  @Test
  public void test_omaha_holdem_3921_4s9hJdKhTs_JcTc9sQc_Kc2dJh8h_3h3d6h4d_Td2s9cKd_Th7c6cAs_3cKs5d5c_6dQsQd8s() {
    assertEquals(
      "3h3d6h4d Th7c6cAs 3cKs5d5c Td2s9cKd Kc2dJh8h 6dQsQd8s JcTc9sQc",
      Solver.process("omaha-holdem 4s9hJdKhTs JcTc9sQc Kc2dJh8h 3h3d6h4d Td2s9cKd Th7c6cAs 3cKs5d5c 6dQsQd8s"));
  }

  @Test
  public void test_omaha_holdem_3922_8hKdKhKsTc_3c7s2s9s_Qd6c9dTs_Js2d5d3d() {
    assertEquals(
      "3c7s2s9s Js2d5d3d Qd6c9dTs",
      Solver.process("omaha-holdem 8hKdKhKsTc 3c7s2s9s Qd6c9dTs Js2d5d3d"));
  }

  @Test
  public void test_omaha_holdem_3923_6s7d7h7sTc_Jc8h5dQc_As5s9cKs() {
    assertEquals(
      "Jc8h5dQc As5s9cKs",
      Solver.process("omaha-holdem 6s7d7h7sTc Jc8h5dQc As5s9cKs"));
  }

  @Test
  public void test_omaha_holdem_3924_2c5c9sKcQh_9hTc4d3d_Qd7cKdKh_KsJh8h4h_5d8dTh5s_TsAd7h6c_Qs2h9c6d_As6s3c4s_Qc2d4cJc() {
    assertEquals(
      "As6s3c4s TsAd7h6c 9hTc4d3d KsJh8h4h Qs2h9c6d 5d8dTh5s Qd7cKdKh Qc2d4cJc",
      Solver.process("omaha-holdem 2c5c9sKcQh 9hTc4d3d Qd7cKdKh KsJh8h4h 5d8dTh5s TsAd7h6c Qs2h9c6d As6s3c4s Qc2d4cJc"));
  }

  @Test
  public void test_omaha_holdem_3925_2s4d4h7dTd_4sAd7s6h_6cJc2c8d_7c6d3d8h_4cJd5d3s_9hJhAh5h_3cKdKcKh_ThAcQs8c_9d9sTc5s() {
    assertEquals(
      "9hJhAh5h 6cJc2c8d 9d9sTc5s ThAcQs8c 3cKdKcKh 7c6d3d8h 4cJd5d3s 4sAd7s6h",
      Solver.process("omaha-holdem 2s4d4h7dTd 4sAd7s6h 6cJc2c8d 7c6d3d8h 4cJd5d3s 9hJhAh5h 3cKdKcKh ThAcQs8c 9d9sTc5s"));
  }

  @Test
  public void test_omaha_holdem_3926_2hAdKcQsTh_4s5c2cKh_3dAh6s5s() {
    assertEquals(
      "3dAh6s5s 4s5c2cKh",
      Solver.process("omaha-holdem 2hAdKcQsTh 4s5c2cKh 3dAh6s5s"));
  }

  @Test
  public void test_omaha_holdem_3927_4sAcKdKhQh_9c3d7sQs_5s8cAd7h_2dKs3c9d_2s7d9s5h_3s2hJc6d_Td6cJh2c_Js6h5cTh_8s3h5dKc() {
    assertEquals(
      "2s7d9s5h 3s2hJc6d 9c3d7sQs 5s8cAd7h 8s3h5dKc 2dKs3c9d Js6h5cTh=Td6cJh2c",
      Solver.process("omaha-holdem 4sAcKdKhQh 9c3d7sQs 5s8cAd7h 2dKs3c9d 2s7d9s5h 3s2hJc6d Td6cJh2c Js6h5cTh 8s3h5dKc"));
  }

  @Test
  public void test_omaha_holdem_3928_3d4c6d7hQd_Kc5hJhTc_3hTh3c2s_4s5c2d5d_AsKs7c2h_5s8h9d6h_KhAd8d6s_9s8sQs8c() {
    assertEquals(
      "Kc5hJhTc AsKs7c2h 9s8sQs8c 3hTh3c2s 5s8h9d6h 4s5c2d5d KhAd8d6s",
      Solver.process("omaha-holdem 3d4c6d7hQd Kc5hJhTc 3hTh3c2s 4s5c2d5d AsKs7c2h 5s8h9d6h KhAd8d6s 9s8sQs8c"));
  }

  @Test
  public void test_omaha_holdem_3929_3h3sJsKdQd_7sQcQsTd_Th8h4dAd_5h7d2cKs_Qh2hTc5s_9c9d8d6s_As4s5d7h_Ah2dJd7c_9s4hJc9h() {
    assertEquals(
      "As4s5d7h 9c9d8d6s 9s4hJc9h Ah2dJd7c Qh2hTc5s 5h7d2cKs Th8h4dAd 7sQcQsTd",
      Solver.process("omaha-holdem 3h3sJsKdQd 7sQcQsTd Th8h4dAd 5h7d2cKs Qh2hTc5s 9c9d8d6s As4s5d7h Ah2dJd7c 9s4hJc9h"));
  }

  @Test
  public void test_omaha_holdem_3930_4s7c9c9sQc_3c7h9d8c_2dKdTdAs_QsKs2s5h_AdAc7s6s() {
    assertEquals(
      "2dKdTdAs QsKs2s5h AdAc7s6s 3c7h9d8c",
      Solver.process("omaha-holdem 4s7c9c9sQc 3c7h9d8c 2dKdTdAs QsKs2s5h AdAc7s6s"));
  }

  @Test
  public void test_omaha_holdem_3931_3s7c8cAcJc_3d2sKdTc_QdTd4c4s() {
    assertEquals(
      "3d2sKdTc QdTd4c4s",
      Solver.process("omaha-holdem 3s7c8cAcJc 3d2sKdTc QdTd4c4s"));
  }

  @Test
  public void test_omaha_holdem_3932_9cKdKsTcTs_4sTd8s2h_8c4c2c3d_6cJh4d4h_9h6dQd3c_5cAcJc5d_Th7dAs2s_6h7cAhAd() {
    assertEquals(
      "8c4c2c3d 6cJh4d4h 5cAcJc5d 9h6dQd3c 6h7cAhAd 4sTd8s2h Th7dAs2s",
      Solver.process("omaha-holdem 9cKdKsTcTs 4sTd8s2h 8c4c2c3d 6cJh4d4h 9h6dQd3c 5cAcJc5d Th7dAs2s 6h7cAhAd"));
  }

  @Test
  public void test_omaha_holdem_3933_2d4dAcJsKc_KhQsKsTs_5dQc3s7d_Qh9s9c2h_Ah2c9hAd_4c3d7c3h_As5c4s5s_Kd6d2s8d_JhJcQd9d_3cTh6c8h() {
    assertEquals(
      "3cTh6c8h 4c3d7c3h Qh9s9c2h Kd6d2s8d As5c4s5s JhJcQd9d Ah2c9hAd 5dQc3s7d KhQsKsTs",
      Solver.process("omaha-holdem 2d4dAcJsKc KhQsKsTs 5dQc3s7d Qh9s9c2h Ah2c9hAd 4c3d7c3h As5c4s5s Kd6d2s8d JhJcQd9d 3cTh6c8h"));
  }

  @Test
  public void test_omaha_holdem_3934_2h2s3c3h4h_4sJs5h7d_7c9cTdJh() {
    assertEquals(
      "7c9cTdJh 4sJs5h7d",
      Solver.process("omaha-holdem 2h2s3c3h4h 4sJs5h7d 7c9cTdJh"));
  }

  @Test
  public void test_omaha_holdem_3935_3d4s5d6dKd_Kh5c4c6c_4h5hJc9h_7hQhTsAh_7sAs2d8h() {
    assertEquals(
      "7hQhTsAh 4h5hJc9h Kh5c4c6c 7sAs2d8h",
      Solver.process("omaha-holdem 3d4s5d6dKd Kh5c4c6c 4h5hJc9h 7hQhTsAh 7sAs2d8h"));
  }

  @Test
  public void test_omaha_holdem_3936_3h7sJcKhQs_9hAd9s4h_8c3cAsTs_5h5cTh2c_5s6s2d9d_7dTdKc7c_QhJh4dJd() {
    assertEquals(
      "5s6s2d9d 5h5cTh2c 9hAd9s4h 7dTdKc7c QhJh4dJd 8c3cAsTs",
      Solver.process("omaha-holdem 3h7sJcKhQs 9hAd9s4h 8c3cAsTs 5h5cTh2c 5s6s2d9d 7dTdKc7c QhJh4dJd"));
  }

  @Test
  public void test_omaha_holdem_3937_2s6c7h9cKs_7d2hTdAd_Kh3cJh8c_9hQh8s3s_Th5sKc7c_6d8h2d4h_Qc5hAc8d_Ah4c6h2c_5cJs3dQd_9s4sJc4d() {
    assertEquals(
      "5cJs3dQd 9s4sJc4d 9hQh8s3s Kh3cJh8c 6d8h2d4h=Ah4c6h2c 7d2hTdAd Th5sKc7c Qc5hAc8d",
      Solver.process("omaha-holdem 2s6c7h9cKs 7d2hTdAd Kh3cJh8c 9hQh8s3s Th5sKc7c 6d8h2d4h Qc5hAc8d Ah4c6h2c 5cJs3dQd 9s4sJc4d"));
  }

  @Test
  public void test_omaha_holdem_3938_2s6d8dAhKd_QdJc9s2h_8h3dAc9h_9cKc6c5s_JsJh4c5d_8c7s6s3h_ThQcAs7h() {
    assertEquals(
      "QdJc9s2h JsJh4c5d ThQcAs7h 8c7s6s3h 9cKc6c5s 8h3dAc9h",
      Solver.process("omaha-holdem 2s6d8dAhKd QdJc9s2h 8h3dAc9h 9cKc6c5s JsJh4c5d 8c7s6s3h ThQcAs7h"));
  }

  @Test
  public void test_omaha_holdem_3939_2h4d7cJdTc_Ah8h9c6c_5s2sTd3s_Qc3h5hAd_6s9dKc6d_ThAc7dQs_Js2d8d8c_6hJh4h8s_KhKdAsJc_3d9h7s7h() {
    assertEquals(
      "Qc3h5hAd 6s9dKc6d KhKdAsJc 5s2sTd3s ThAc7dQs Js2d8d8c 6hJh4h8s 3d9h7s7h Ah8h9c6c",
      Solver.process("omaha-holdem 2h4d7cJdTc Ah8h9c6c 5s2sTd3s Qc3h5hAd 6s9dKc6d ThAc7dQs Js2d8d8c 6hJh4h8s KhKdAsJc 3d9h7s7h"));
  }

  @Test
  public void test_omaha_holdem_3940_5d8cKsQcQd_4d8s3sKd_9sJc8h4h_3cAc6h2s_8d2h9dAd_7h7d3h4c_As4s5h9c_ThAh3dQh() {
    assertEquals(
      "3cAc6h2s As4s5h9c 7h7d3h4c 9sJc8h4h 8d2h9dAd 4d8s3sKd ThAh3dQh",
      Solver.process("omaha-holdem 5d8cKsQcQd 4d8s3sKd 9sJc8h4h 3cAc6h2s 8d2h9dAd 7h7d3h4c As4s5h9c ThAh3dQh"));
  }

  @Test
  public void test_omaha_holdem_3941_2d5h6d8dKc_6cAcQd6h_As3h9cTh_KdTsJd5d() {
    assertEquals(
      "As3h9cTh 6cAcQd6h KdTsJd5d",
      Solver.process("omaha-holdem 2d5h6d8dKc 6cAcQd6h As3h9cTh KdTsJd5d"));
  }

  @Test
  public void test_omaha_holdem_3942_2c3d5s6dAc_TdJsTc9s_Ts8h4d6c_7h3sJdJc_6sKhKs5d_KdQs2s2d_As5h9c4s_7c2h4h3c() {
    assertEquals(
      "TdJsTc9s 7h3sJdJc 6sKhKs5d KdQs2s2d As5h9c4s=Ts8h4d6c 7c2h4h3c",
      Solver.process("omaha-holdem 2c3d5s6dAc TdJsTc9s Ts8h4d6c 7h3sJdJc 6sKhKs5d KdQs2s2d As5h9c4s 7c2h4h3c"));
  }

  @Test
  public void test_omaha_holdem_3943_2h3d7c7d9d_Js5h9s7s_Tc2s4h6d_Jh9cAdKd() {
    assertEquals(
      "Tc2s4h6d Jh9cAdKd Js5h9s7s",
      Solver.process("omaha-holdem 2h3d7c7d9d Js5h9s7s Tc2s4h6d Jh9cAdKd"));
  }

  @Test
  public void test_omaha_holdem_3944_2h3c9hAhKd_7c6sKhJd_Kc2c4sAc_Th4dJhTd_3s9s5dAs_6cTc5h8h_2s4cQdJc_8d5c9d8c() {
    assertEquals(
      "2s4cQdJc 8d5c9d8c 7c6sKhJd 3s9s5dAs Kc2c4sAc 6cTc5h8h Th4dJhTd",
      Solver.process("omaha-holdem 2h3c9hAhKd 7c6sKhJd Kc2c4sAc Th4dJhTd 3s9s5dAs 6cTc5h8h 2s4cQdJc 8d5c9d8c"));
  }

  @Test
  public void test_omaha_holdem_3945_7s8c8hQdQs_Jc4s6hAd_TdQh3sJd_2d5h5s4d_Kc2h9cKh_6c2s7d2c_6s4hKdAh_3h5d3dJh_Ts4c3c5c_6d8sTc8d() {
    assertEquals(
      "Ts4c3c5c Jc4s6hAd 6s4hKdAh 3h5d3dJh 2d5h5s4d 6c2s7d2c Kc2h9cKh TdQh3sJd 6d8sTc8d",
      Solver.process("omaha-holdem 7s8c8hQdQs Jc4s6hAd TdQh3sJd 2d5h5s4d Kc2h9cKh 6c2s7d2c 6s4hKdAh 3h5d3dJh Ts4c3c5c 6d8sTc8d"));
  }

  @Test
  public void test_omaha_holdem_3946_2s5d6h8dJc_JsQs8c5h_Qc6d2d4s() {
    assertEquals(
      "Qc6d2d4s JsQs8c5h",
      Solver.process("omaha-holdem 2s5d6h8dJc JsQs8c5h Qc6d2d4s"));
  }

  @Test
  public void test_omaha_holdem_3947_3h3s6cAhQs_8s3c4dKc_9cTh8c8d_5h7sJs9s() {
    assertEquals(
      "5h7sJs9s 9cTh8c8d 8s3c4dKc",
      Solver.process("omaha-holdem 3h3s6cAhQs 8s3c4dKc 9cTh8c8d 5h7sJs9s"));
  }

  @Test
  public void test_omaha_holdem_3948_2c5sJcQdTh_2h3h7dTd_QhTc6d5c_Kd3d4h2d_7cKh7s3c_Ah4sJh9c_6sKcJdAd_Ks8c2sTs_JsAc5d8s_8h3s6h5h() {
    assertEquals(
      "Kd3d4h2d 8h3s6h5h 7cKh7s3c Ah4sJh9c 2h3h7dTd=Ks8c2sTs JsAc5d8s QhTc6d5c 6sKcJdAd",
      Solver.process("omaha-holdem 2c5sJcQdTh 2h3h7dTd QhTc6d5c Kd3d4h2d 7cKh7s3c Ah4sJh9c 6sKcJdAd Ks8c2sTs JsAc5d8s 8h3s6h5h"));
  }

  @Test
  public void test_omaha_holdem_3949_3cAdJsQdTh_5c3d2s8h_5hTcKd7d() {
    assertEquals(
      "5c3d2s8h 5hTcKd7d",
      Solver.process("omaha-holdem 3cAdJsQdTh 5c3d2s8h 5hTcKd7d"));
  }

  @Test
  public void test_omaha_holdem_3950_3h8dAdAsQc_5s8c4h9h_5h3c6c7c_7dThTd9s_4s7sJsJd() {
    assertEquals(
      "5h3c6c7c 5s8c4h9h 7dThTd9s 4s7sJsJd",
      Solver.process("omaha-holdem 3h8dAdAsQc 5s8c4h9h 5h3c6c7c 7dThTd9s 4s7sJsJd"));
  }

  @Test
  public void test_omaha_holdem_3951_2s3s6sKsTc_2d9hJcJd_6cTdAh9s_Jh8s3h2h() {
    assertEquals(
      "2d9hJcJd Jh8s3h2h 6cTdAh9s",
      Solver.process("omaha-holdem 2s3s6sKsTc 2d9hJcJd 6cTdAh9s Jh8s3h2h"));
  }

  @Test
  public void test_omaha_holdem_3952_2h5h6d9hKh_4cTh9sQh_7d6hJd3h_8c4d9cJc_5c8s4sTc_9dKd6s3c_Jh7c4hQd_3sQs6cAh_TdTsAs7h() {
    assertEquals(
      "5c8s4sTc 3sQs6cAh 8c4d9cJc TdTsAs7h 9dKd6s3c 7d6hJd3h Jh7c4hQd 4cTh9sQh",
      Solver.process("omaha-holdem 2h5h6d9hKh 4cTh9sQh 7d6hJd3h 8c4d9cJc 5c8s4sTc 9dKd6s3c Jh7c4hQd 3sQs6cAh TdTsAs7h"));
  }

  @Test
  public void test_omaha_holdem_3953_4s8hJhQcQh_9s3sKh9d_4cJc5c7d_2hTd7sAs_6sThQs2s() {
    assertEquals(
      "2hTd7sAs 9s3sKh9d 4cJc5c7d 6sThQs2s",
      Solver.process("omaha-holdem 4s8hJhQcQh 9s3sKh9d 4cJc5c7d 2hTd7sAs 6sThQs2s"));
  }

  @Test
  public void test_omaha_holdem_3954_3s8h8sAcJh_9cQhTc7h_2s4cQs9s_Kc4d6c9h() {
    assertEquals(
      "2s4cQs9s 9cQhTc7h Kc4d6c9h",
      Solver.process("omaha-holdem 3s8h8sAcJh 9cQhTc7h 2s4cQs9s Kc4d6c9h"));
  }

  @Test
  public void test_omaha_holdem_3955_3s5sJsKdQd_Ts5h7sQh_ThAhQc5d_As2c6h8h_9dJc5cJd_6s2hKsQs_4d3c8cJh_7cAc7h2d() {
    assertEquals(
      "As2c6h8h 7cAc7h2d 4d3c8cJh 9dJc5cJd ThAhQc5d Ts5h7sQh 6s2hKsQs",
      Solver.process("omaha-holdem 3s5sJsKdQd Ts5h7sQh ThAhQc5d As2c6h8h 9dJc5cJd 6s2hKsQs 4d3c8cJh 7cAc7h2d"));
  }

  @Test
  public void test_omaha_holdem_3956_2h3hAhKdTc_8h3dJh2s_3cQh4dTs_5c6cTh9h_7hQcKcJs_3s4cAcKh_2c7c5dTd_7d6d8c4s() {
    assertEquals(
      "7d6d8c4s 2c7c5dTd 3cQh4dTs 3s4cAcKh 7hQcKcJs 5c6cTh9h 8h3dJh2s",
      Solver.process("omaha-holdem 2h3hAhKdTc 8h3dJh2s 3cQh4dTs 5c6cTh9h 7hQcKcJs 3s4cAcKh 2c7c5dTd 7d6d8c4s"));
  }

  @Test
  public void test_omaha_holdem_3957_7d9cAsKsQh_AcAhTh3s_QcJh5d2h_2s8d9h5h_4cJs3c7c() {
    assertEquals(
      "4cJs3c7c 2s8d9h5h QcJh5d2h AcAhTh3s",
      Solver.process("omaha-holdem 7d9cAsKsQh AcAhTh3s QcJh5d2h 2s8d9h5h 4cJs3c7c"));
  }

  @Test
  public void test_omaha_holdem_3958_3d7c9sJhTd_8sAsAh6s_7h5s3h3s_4c2dQs8h() {
    assertEquals(
      "7h5s3h3s 8sAsAh6s 4c2dQs8h",
      Solver.process("omaha-holdem 3d7c9sJhTd 8sAsAh6s 7h5s3h3s 4c2dQs8h"));
  }

  @Test
  public void test_omaha_holdem_3959_2s6c9sJcJs_7dQs7sJh_Qh4sAdKh_AsKsKdAc() {
    assertEquals(
      "Qh4sAdKh 7dQs7sJh AsKsKdAc",
      Solver.process("omaha-holdem 2s6c9sJcJs 7dQs7sJh Qh4sAdKh AsKsKdAc"));
  }

  @Test
  public void test_omaha_holdem_3960_3d3s5h9cAh_7s9h7h8c_7d8h2sQh_7cJd6hJc_Tc6s5c4h_TdQc2h4c_3hAs3c8d_8sKcQd5d_2d6c4dQs_Js5s9s2c() {
    assertEquals(
      "7d8h2sQh Tc6s5c4h 8sKcQd5d 7s9h7h8c Js5s9s2c 7cJd6hJc 2d6c4dQs=TdQc2h4c 3hAs3c8d",
      Solver.process("omaha-holdem 3d3s5h9cAh 7s9h7h8c 7d8h2sQh 7cJd6hJc Tc6s5c4h TdQc2h4c 3hAs3c8d 8sKcQd5d 2d6c4dQs Js5s9s2c"));
  }

  @Test
  public void test_omaha_holdem_3961_8sAcAhJdJh_JcQs3dTd_3s2dJs4h_7s4cKd6h() {
    assertEquals(
      "7s4cKd6h 3s2dJs4h JcQs3dTd",
      Solver.process("omaha-holdem 8sAcAhJdJh JcQs3dTd 3s2dJs4h 7s4cKd6h"));
  }

  @Test
  public void test_omaha_holdem_3962_6h7cJsKsTs_Jd7hTdAd_3c9c9d7d_3h8dQs8c_5hThQc3s_Ah5cJc9s() {
    assertEquals(
      "3h8dQs8c 3c9c9d7d 5hThQc3s Ah5cJc9s Jd7hTdAd",
      Solver.process("omaha-holdem 6h7cJsKsTs Jd7hTdAd 3c9c9d7d 3h8dQs8c 5hThQc3s Ah5cJc9s"));
  }

  @Test
  public void test_omaha_holdem_3963_4c6h8cKdTc_4h3c6c3s_5h3d9hJd_Ah2sTh2h_5c2c6sAc_7cAsTd5s_4s8s9sKs_7sJc7d9c_Js8hAdKc() {
    assertEquals(
      "5h3d9hJd Ah2sTh2h 4s8s9sKs=Js8hAdKc 7cAsTd5s 4h3c6c3s 7sJc7d9c 5c2c6sAc",
      Solver.process("omaha-holdem 4c6h8cKdTc 4h3c6c3s 5h3d9hJd Ah2sTh2h 5c2c6sAc 7cAsTd5s 4s8s9sKs 7sJc7d9c Js8hAdKc"));
  }

  @Test
  public void test_omaha_holdem_3964_3s5h7dJdQh_5sAcTc4h_3c2d7cJh() {
    assertEquals(
      "5sAcTc4h 3c2d7cJh",
      Solver.process("omaha-holdem 3s5h7dJdQh 5sAcTc4h 3c2d7cJh"));
  }

  @Test
  public void test_omaha_holdem_3965_4s7c8hAdJd_7h3h7s5d_KcThTs3d_6c2d7d8s_Jc2s9hKd_2hQcQdJh_6dAc5h8c_Ah8d2cKh() {
    assertEquals(
      "KcThTs3d Jc2s9hKd 2hQcQdJh 6c2d7d8s Ah8d2cKh 7h3h7s5d 6dAc5h8c",
      Solver.process("omaha-holdem 4s7c8hAdJd 7h3h7s5d KcThTs3d 6c2d7d8s Jc2s9hKd 2hQcQdJh 6dAc5h8c Ah8d2cKh"));
  }

  @Test
  public void test_omaha_holdem_3966_5s6d7c8dQs_TdAhJs6h_6s8cTh8s_3cQc3h8h_Jh5c7s4d() {
    assertEquals(
      "TdAhJs6h 3cQc3h8h 6s8cTh8s Jh5c7s4d",
      Solver.process("omaha-holdem 5s6d7c8dQs TdAhJs6h 6s8cTh8s 3cQc3h8h Jh5c7s4d"));
  }

  @Test
  public void test_omaha_holdem_3967_3h5d6s7cQh_4c8cAd7s_JsAcKcJh_7d3c9dKs_2hJc6dJd_Ts6c5c8d_3s2d5hAs() {
    assertEquals(
      "2hJc6dJd=JsAcKcJh 3s2d5hAs Ts6c5c8d 7d3c9dKs 4c8cAd7s",
      Solver.process("omaha-holdem 3h5d6s7cQh 4c8cAd7s JsAcKcJh 7d3c9dKs 2hJc6dJd Ts6c5c8d 3s2d5hAs"));
  }

  @Test
  public void test_omaha_holdem_3968_6d7c9cJdKc_Ac4hAsQd_2d7d5hKd_4c2s3d6h() {
    assertEquals(
      "4c2s3d6h Ac4hAsQd 2d7d5hKd",
      Solver.process("omaha-holdem 6d7c9cJdKc Ac4hAsQd 2d7d5hKd 4c2s3d6h"));
  }

  @Test
  public void test_omaha_holdem_3969_2h5d6c9dQs_As3s7cKc_3d2s5cAc_Td6d9hKs_4sQhAh8d() {
    assertEquals(
      "As3s7cKc 4sQhAh8d 3d2s5cAc Td6d9hKs",
      Solver.process("omaha-holdem 2h5d6c9dQs As3s7cKc 3d2s5cAc Td6d9hKs 4sQhAh8d"));
  }

  @Test
  public void test_omaha_holdem_3970_4s5s6h6sKs_Kd7d9hTc_4c2c3sTs_9d5dTd6c_QhJh2sJs_8dAd8hQs_5c7hKc4d_3c8c7cAs_6d9sAh3h() {
    assertEquals(
      "8dAd8hQs 5c7hKc4d Kd7d9hTc 6d9sAh3h 3c8c7cAs 4c2c3sTs QhJh2sJs 9d5dTd6c",
      Solver.process("omaha-holdem 4s5s6h6sKs Kd7d9hTc 4c2c3sTs 9d5dTd6c QhJh2sJs 8dAd8hQs 5c7hKc4d 3c8c7cAs 6d9sAh3h"));
  }

  @Test
  public void test_omaha_holdem_3971_6h9cJsKsTh_3d3hAh5s_Td8hQsAd_Qh7h2dAs_2h9sTcTs_Kh6d7d3c_3s4sKd5h_Qd7c6s4d_Ac8s5d4c_6c4hJc5c() {
    assertEquals(
      "Ac8s5d4c 3d3hAh5s Qd7c6s4d 3s4sKd5h 6c4hJc5c Kh6d7d3c 2h9sTcTs Qh7h2dAs=Td8hQsAd",
      Solver.process("omaha-holdem 6h9cJsKsTh 3d3hAh5s Td8hQsAd Qh7h2dAs 2h9sTcTs Kh6d7d3c 3s4sKd5h Qd7c6s4d Ac8s5d4c 6c4hJc5c"));
  }

  @Test
  public void test_omaha_holdem_3972_2h7c8sAdKc_5s5d9sJc_Qh3d4d2c_2s6d3s8h_9h4c8d7h_7d5cAsKd_KhTdKs6h() {
    assertEquals(
      "Qh3d4d2c 5s5d9sJc 2s6d3s8h 9h4c8d7h 7d5cAsKd KhTdKs6h",
      Solver.process("omaha-holdem 2h7c8sAdKc 5s5d9sJc Qh3d4d2c 2s6d3s8h 9h4c8d7h 7d5cAsKd KhTdKs6h"));
  }

  @Test
  public void test_omaha_holdem_3973_3h4d8dQhTc_6h8c7sKc_4s9cQsQc_6c6sTsKh_Th2s4c8s_9hJd7hAs_6d5cJs4h_9d7cJh7d_Ac3s5dQd() {
    assertEquals(
      "6d5cJs4h 6h8c7sKc 6c6sTsKh Th2s4c8s Ac3s5dQd 4s9cQsQc 9d7cJh7d=9hJd7hAs",
      Solver.process("omaha-holdem 3h4d8dQhTc 6h8c7sKc 4s9cQsQc 6c6sTsKh Th2s4c8s 9hJd7hAs 6d5cJs4h 9d7cJh7d Ac3s5dQd"));
  }

  @Test
  public void test_omaha_holdem_3974_5c9hAsKsTd_6s3s3c8s_4c7h9c8h_2h7sKdTh_6d4s5d2s_QsQh4h3d_7d2d5s6h_3hJcTs6c_4d8dAhQc() {
    assertEquals(
      "6s3s3c8s 6d4s5d2s 7d2d5s6h 4c7h9c8h 3hJcTs6c QsQh4h3d 4d8dAhQc 2h7sKdTh",
      Solver.process("omaha-holdem 5c9hAsKsTd 6s3s3c8s 4c7h9c8h 2h7sKdTh 6d4s5d2s QsQh4h3d 7d2d5s6h 3hJcTs6c 4d8dAhQc"));
  }

  @Test
  public void test_omaha_holdem_3975_2c3d5hJcKc_4c5c9h7c_4s6c2d9d_Qs8s7h4d() {
    assertEquals(
      "Qs8s7h4d 4s6c2d9d 4c5c9h7c",
      Solver.process("omaha-holdem 2c3d5hJcKc 4c5c9h7c 4s6c2d9d Qs8s7h4d"));
  }

  @Test
  public void test_omaha_holdem_3976_4d6cKdQcTc_Qh3s9h4c_7h8hKcTh_2c5hAcAd() {
    assertEquals(
      "Qh3s9h4c 7h8hKcTh 2c5hAcAd",
      Solver.process("omaha-holdem 4d6cKdQcTc Qh3s9h4c 7h8hKcTh 2c5hAcAd"));
  }

  @Test
  public void test_omaha_holdem_3977_3d7h8hJsKh_Ad5d5s6h_Td3cThAc_7d4s9hTs_2h6s5hJd_Kd4d8d7c_QhJh4h2c_Kc8cTc9d_QcAh8s6c_As5c3s9s() {
    assertEquals(
      "As5c3s9s Ad5d5s6h QcAh8s6c Td3cThAc Kd4d8d7c 7d4s9hTs=Kc8cTc9d 2h6s5hJd QhJh4h2c",
      Solver.process("omaha-holdem 3d7h8hJsKh Ad5d5s6h Td3cThAc 7d4s9hTs 2h6s5hJd Kd4d8d7c QhJh4h2c Kc8cTc9d QcAh8s6c As5c3s9s"));
  }

  @Test
  public void test_omaha_holdem_3978_4d7c9d9hKc_QcTdTc9s_6c8sTs6d_Js4cQdKs_7h6hQhAs_JhAhQsJc_2h7dAd4h_8d9c5h3d() {
    assertEquals(
      "6c8sTs6d 2h7dAd4h=7h6hQhAs JhAhQsJc Js4cQdKs 8d9c5h3d QcTdTc9s",
      Solver.process("omaha-holdem 4d7c9d9hKc QcTdTc9s 6c8sTs6d Js4cQdKs 7h6hQhAs JhAhQsJc 2h7dAd4h 8d9c5h3d"));
  }

  @Test
  public void test_omaha_holdem_3979_2h5c7d7sTc_KcJhKs5h_3cTs4sJs_2s8dQhJc_Qd2d3sKh_4d6sAd3d_Qc9h6d7h_3hAsAc8c_8hKdAh6c() {
    assertEquals(
      "4d6sAd3d 8hKdAh6c 2s8dQhJc Qd2d3sKh 3cTs4sJs KcJhKs5h 3hAsAc8c Qc9h6d7h",
      Solver.process("omaha-holdem 2h5c7d7sTc KcJhKs5h 3cTs4sJs 2s8dQhJc Qd2d3sKh 4d6sAd3d Qc9h6d7h 3hAsAc8c 8hKdAh6c"));
  }

  @Test
  public void test_omaha_holdem_3980_7d8h9dQhTs_9h3h6h4s_4cKhTcAh_Qs2dThQc_2c4d7cAs_5sKd9c5c_3dJs2hKs_3s7hQd8s_6d6s8c8d_2sJhKc3c() {
    assertEquals(
      "2c4d7cAs 5sKd9c5c 4cKhTcAh 3s7hQd8s Qs2dThQc 6d6s8c8d=9h3h6h4s 2sJhKc3c=3dJs2hKs",
      Solver.process("omaha-holdem 7d8h9dQhTs 9h3h6h4s 4cKhTcAh Qs2dThQc 2c4d7cAs 5sKd9c5c 3dJs2hKs 3s7hQd8s 6d6s8c8d 2sJhKc3c"));
  }

  @Test
  public void test_omaha_holdem_3981_2s7h9c9dJs_Qs5dKd4s_3s9hJdJc_4hAs7cAd_Ah8d5s3d_5cJh4dAc_2d6hTsTd_2c7s4cQc() {
    assertEquals(
      "Qs5dKd4s Ah8d5s3d 2c7s4cQc 2d6hTsTd 5cJh4dAc 4hAs7cAd 3s9hJdJc",
      Solver.process("omaha-holdem 2s7h9c9dJs Qs5dKd4s 3s9hJdJc 4hAs7cAd Ah8d5s3d 5cJh4dAc 2d6hTsTd 2c7s4cQc"));
  }

  @Test
  public void test_omaha_holdem_3982_5c6h6s9hKd_7dQd7sJd_8c2hTdTh_TcKc3dKh_6d4s3sJc_Ah7c7h4d() {
    assertEquals(
      "7dQd7sJd=Ah7c7h4d 8c2hTdTh 6d4s3sJc TcKc3dKh",
      Solver.process("omaha-holdem 5c6h6s9hKd 7dQd7sJd 8c2hTdTh TcKc3dKh 6d4s3sJc Ah7c7h4d"));
  }

  @Test
  public void test_omaha_holdem_3983_4c4h7dAdTh_9c7cJdQh_6s2d8dAs_8h6d5s3s() {
    assertEquals(
      "8h6d5s3s 9c7cJdQh 6s2d8dAs",
      Solver.process("omaha-holdem 4c4h7dAdTh 9c7cJdQh 6s2d8dAs 8h6d5s3s"));
  }

  @Test
  public void test_omaha_holdem_3984_2d6h6s8hTh_JdJs6c8d_4s5s8c5c_3d9h6dAs() {
    assertEquals(
      "4s5s8c5c 3d9h6dAs JdJs6c8d",
      Solver.process("omaha-holdem 2d6h6s8hTh JdJs6c8d 4s5s8c5c 3d9h6dAs"));
  }

  @Test
  public void test_omaha_holdem_3985_4d6dAcJcQh_8dAd7c9s_8cJd4s5d_6s9d2h7h_As8h5hKc_6c3h6hTc_TsKdKhAh_2d4c7s5c_QsTdQcTh() {
    assertEquals(
      "2d4c7s5c 6s9d2h7h 8dAd7c9s As8h5hKc 8cJd4s5d 6c3h6hTc QsTdQcTh TsKdKhAh",
      Solver.process("omaha-holdem 4d6dAcJcQh 8dAd7c9s 8cJd4s5d 6s9d2h7h As8h5hKc 6c3h6hTc TsKdKhAh 2d4c7s5c QsTdQcTh"));
  }

  @Test
  public void test_omaha_holdem_3986_5sKcKdQdTh_Td3dAc8h_Ts6h7s6d_7d9h2c7h_2dAsJd4h_KsAh2h3s_3cQh9sKh_9d8c7c5h() {
    assertEquals(
      "9d8c7c5h 7d9h2c7h Ts6h7s6d Td3dAc8h KsAh2h3s 2dAsJd4h 3cQh9sKh",
      Solver.process("omaha-holdem 5sKcKdQdTh Td3dAc8h Ts6h7s6d 7d9h2c7h 2dAsJd4h KsAh2h3s 3cQh9sKh 9d8c7c5h"));
  }

  @Test
  public void test_omaha_holdem_3987_3c5s7sJdKs_AcTh3d8s_5d7d3s9s() {
    assertEquals(
      "AcTh3d8s 5d7d3s9s",
      Solver.process("omaha-holdem 3c5s7sJdKs AcTh3d8s 5d7d3s9s"));
  }

  @Test
  public void test_omaha_holdem_3988_3s6d7cAsKd_4h2cTh6c_2sAh7d3h_Kh8s6hQs_6s4s3d4d_8h5dQcQd_4c9dTsKc_AdJh2h5c_QhKs2dTd() {
    assertEquals(
      "4h2cTh6c 8h5dQcQd 4c9dTsKc QhKs2dTd AdJh2h5c 6s4s3d4d Kh8s6hQs 2sAh7d3h",
      Solver.process("omaha-holdem 3s6d7cAsKd 4h2cTh6c 2sAh7d3h Kh8s6hQs 6s4s3d4d 8h5dQcQd 4c9dTsKc AdJh2h5c QhKs2dTd"));
  }

  @Test
  public void test_omaha_holdem_3989_2h2s6c8cTc_9h5d4dJd_Kh7c2cAc_2d5sQhJc_4cQsTsQc_Kc9dKs4s_5c8h9cTd_6d8dAs7h_Ad3dKd8s() {
    assertEquals(
      "9h5d4dJd Ad3dKd8s 6d8dAs7h Kc9dKs4s 2d5sQhJc 5c8h9cTd 4cQsTsQc Kh7c2cAc",
      Solver.process("omaha-holdem 2h2s6c8cTc 9h5d4dJd Kh7c2cAc 2d5sQhJc 4cQsTsQc Kc9dKs4s 5c8h9cTd 6d8dAs7h Ad3dKd8s"));
  }

  @Test
  public void test_omaha_holdem_3990_9sAcAhKhTc_KdQd3d9h_2s3s8h5d() {
    assertEquals(
      "2s3s8h5d KdQd3d9h",
      Solver.process("omaha-holdem 9sAcAhKhTc KdQd3d9h 2s3s8h5d"));
  }

  @Test
  public void test_omaha_holdem_3991_2d4d5d7hQh_8sTc4c6d_4s8d2c6s_Kh7cTs7s_5sAh9d3s_Js3cKdAc() {
    assertEquals(
      "Kh7cTs7s 5sAh9d3s=Js3cKdAc 4s8d2c6s=8sTc4c6d",
      Solver.process("omaha-holdem 2d4d5d7hQh 8sTc4c6d 4s8d2c6s Kh7cTs7s 5sAh9d3s Js3cKdAc"));
  }

  @Test
  public void test_omaha_holdem_3992_2s6s8cAdQc_Qd7hTdTh_5c4h3c8h_Tc7cKsJd_2cQh5hAh_7d4s9h5s_2d5dJcTs_Qs6hAs9c_6d3d3h2h() {
    assertEquals(
      "7d4s9h5s Tc7cKsJd 2d5dJcTs 5c4h3c8h Qd7hTdTh 6d3d3h2h 2cQh5hAh=Qs6hAs9c",
      Solver.process("omaha-holdem 2s6s8cAdQc Qd7hTdTh 5c4h3c8h Tc7cKsJd 2cQh5hAh 7d4s9h5s 2d5dJcTs Qs6hAs9c 6d3d3h2h"));
  }

  @Test
  public void test_omaha_holdem_3993_2s4c5c6cKc_7dTcQd8s_9h2d2c5s() {
    assertEquals(
      "9h2d2c5s 7dTcQd8s",
      Solver.process("omaha-holdem 2s4c5c6cKc 7dTcQd8s 9h2d2c5s"));
  }

  @Test
  public void test_omaha_holdem_3994_2s5c8c8dJd_Ah3s2cAc_4h7s6s6h_AsTs5s2h_7dJs6cQs_Tc4cQhQc() {
    assertEquals(
      "AsTs5s2h 4h7s6s6h 7dJs6cQs Tc4cQhQc Ah3s2cAc",
      Solver.process("omaha-holdem 2s5c8c8dJd Ah3s2cAc 4h7s6s6h AsTs5s2h 7dJs6cQs Tc4cQhQc"));
  }

  @Test
  public void test_omaha_holdem_3995_2s5c6cAcKs_Jh9s7h8s_4dQh8cAs_9dQcJs6h_6s8d2hQs_JdKd9h4h_5s5d9c3d_4c7dAh6d_4sAdTcTd_2dTh7cJc() {
    assertEquals(
      "Jh9s7h8s 9dQcJs6h JdKd9h4h 4sAdTcTd 4dQh8cAs 6s8d2hQs 4c7dAh6d 5s5d9c3d 2dTh7cJc",
      Solver.process("omaha-holdem 2s5c6cAcKs Jh9s7h8s 4dQh8cAs 9dQcJs6h 6s8d2hQs JdKd9h4h 5s5d9c3d 4c7dAh6d 4sAdTcTd 2dTh7cJc"));
  }

  @Test
  public void test_omaha_holdem_3996_7s8dAcKdTs_2dKc2h3h_Qd4s6s7c_7d7hJs3d_6c5s6dAd_Kh2sQs3s() {
    assertEquals(
      "Qd4s6s7c 2dKc2h3h Kh2sQs3s 6c5s6dAd 7d7hJs3d",
      Solver.process("omaha-holdem 7s8dAcKdTs 2dKc2h3h Qd4s6s7c 7d7hJs3d 6c5s6dAd Kh2sQs3s"));
  }

  @Test
  public void test_omaha_holdem_3997_5dAcJcKdTh_3h2d6s4h_7cAhKsKh_4s7s3s8h_9c2sJd3d_AsQs7h6d_Qd2h6c8d() {
    assertEquals(
      "3h2d6s4h 4s7s3s8h Qd2h6c8d 9c2sJd3d 7cAhKsKh AsQs7h6d",
      Solver.process("omaha-holdem 5dAcJcKdTh 3h2d6s4h 7cAhKsKh 4s7s3s8h 9c2sJd3d AsQs7h6d Qd2h6c8d"));
  }

  @Test
  public void test_omaha_holdem_3998_4h8hJhKcKd_KsTs7cKh_5s7s4c3s_9s6c7d2c_4s4d9c8s() {
    assertEquals(
      "9s6c7d2c 5s7s4c3s 4s4d9c8s KsTs7cKh",
      Solver.process("omaha-holdem 4h8hJhKcKd KsTs7cKh 5s7s4c3s 9s6c7d2c 4s4d9c8s"));
  }

  @Test
  public void test_omaha_holdem_3999_5s7sAsKsTd_3d5hJd3s_6c8cKhJh() {
    assertEquals(
      "3d5hJd3s 6c8cKhJh",
      Solver.process("omaha-holdem 5s7sAsKsTd 3d5hJd3s 6c8cKhJh"));
  }

}
