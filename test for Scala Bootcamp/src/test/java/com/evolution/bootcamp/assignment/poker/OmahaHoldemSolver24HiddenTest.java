
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver24HiddenTest {


  @Test
  public void test_omaha_holdem_6000_2h7h9sAsQd_2c8c3c9d_6s3sAc3d_Qh9hTc5c_Kh6dThKc_4d7cTs4s_2sKs4c5s_5dQs8d7d_3hJcKd4h_8h8s6c6h() {
    assertEquals(
      "3hJcKd4h 2sKs4c5s 4d7cTs4s 8h8s6c6h Kh6dThKc 6s3sAc3d 2c8c3c9d 5dQs8d7d Qh9hTc5c",
      Solver.process("omaha-holdem 2h7h9sAsQd 2c8c3c9d 6s3sAc3d Qh9hTc5c Kh6dThKc 4d7cTs4s 2sKs4c5s 5dQs8d7d 3hJcKd4h 8h8s6c6h"));
  }

  @Test
  public void test_omaha_holdem_6001_4s5s9dJsQc_9c3d3cQd_7dTd4d5d_4hKdAd6d_7c6h6cQh() {
    assertEquals(
      "4hKdAd6d 7c6h6cQh 7dTd4d5d 9c3d3cQd",
      Solver.process("omaha-holdem 4s5s9dJsQc 9c3d3cQd 7dTd4d5d 4hKdAd6d 7c6h6cQh"));
  }

  @Test
  public void test_omaha_holdem_6002_5h6hAcKdTc_Qs7sQc8c_Qd8dKs2c_9s9hJsTd_6c6d3hJh_Ts2s7d6s_Ah4h4s3s_Ad2d9d8h_2hKh4c9c_3dQh3c5s() {
    assertEquals(
      "3dQh3c5s 9s9hJsTd Qs7sQc8c 2hKh4c9c Qd8dKs2c Ah4h4s3s Ad2d9d8h Ts2s7d6s 6c6d3hJh",
      Solver.process("omaha-holdem 5h6hAcKdTc Qs7sQc8c Qd8dKs2c 9s9hJsTd 6c6d3hJh Ts2s7d6s Ah4h4s3s Ad2d9d8h 2hKh4c9c 3dQh3c5s"));
  }

  @Test
  public void test_omaha_holdem_6003_2s7hJdKcTh_9cKdJcQc_TsTd3s2d_QsQd6s7c() {
    assertEquals(
      "QsQd6s7c TsTd3s2d 9cKdJcQc",
      Solver.process("omaha-holdem 2s7hJdKcTh 9cKdJcQc TsTd3s2d QsQd6s7c"));
  }

  @Test
  public void test_omaha_holdem_6004_3s8dAcJcTd_KsQhTc9h_Th4s8h7c_5sKc2s5d_QsKdJhAd_7sKh6hTs_6c9s2hJs_Qc7d3c5c() {
    assertEquals(
      "Qc7d3c5c 5sKc2s5d 7sKh6hTs 6c9s2hJs Th4s8h7c KsQhTc9h=QsKdJhAd",
      Solver.process("omaha-holdem 3s8dAcJcTd KsQhTc9h Th4s8h7c 5sKc2s5d QsKdJhAd 7sKh6hTs 6c9s2hJs Qc7d3c5c"));
  }

  @Test
  public void test_omaha_holdem_6005_5h6d7d9sJc_5c8s9h7s_4h8hQhJd_8dThKdKh_Qd3h5sKs() {
    assertEquals(
      "Qd3h5sKs 4h8hQhJd 5c8s9h7s 8dThKdKh",
      Solver.process("omaha-holdem 5h6d7d9sJc 5c8s9h7s 4h8hQhJd 8dThKdKh Qd3h5sKs"));
  }

  @Test
  public void test_omaha_holdem_6006_2c5d6h9sTd_6c6d8dKs_8s5hTcJs_Ac8h9d4s() {
    assertEquals(
      "Ac8h9d4s 8s5hTcJs 6c6d8dKs",
      Solver.process("omaha-holdem 2c5d6h9sTd 6c6d8dKs 8s5hTcJs Ac8h9d4s"));
  }

  @Test
  public void test_omaha_holdem_6007_3s5h8hKhQd_2c7h8d2h_4hKcTsJc_7dAd5s9h_Jh7sKs6c_8s2sTc4c_Jd9c7c6h_8c4d5dAs_Js3cAcQc_5cTd3hAh() {
    assertEquals(
      "Jd9c7c6h 7dAd5s9h 8s2sTc4c 4hKcTsJc=Jh7sKs6c 8c4d5dAs Js3cAcQc 2c7h8d2h 5cTd3hAh",
      Solver.process("omaha-holdem 3s5h8hKhQd 2c7h8d2h 4hKcTsJc 7dAd5s9h Jh7sKs6c 8s2sTc4c Jd9c7c6h 8c4d5dAs Js3cAcQc 5cTd3hAh"));
  }

  @Test
  public void test_omaha_holdem_6008_2s6s7cAcKh_9cJh9d8s_JdJs3d6d_Ad8d8h4h_5c9s3c5h() {
    assertEquals(
      "5c9s3c5h 9cJh9d8s JdJs3d6d Ad8d8h4h",
      Solver.process("omaha-holdem 2s6s7cAcKh 9cJh9d8s JdJs3d6d Ad8d8h4h 5c9s3c5h"));
  }

  @Test
  public void test_omaha_holdem_6009_2h7h9dJcTd_2s9s7s5c_8s4d2dQd_AcAhTh5h_9cJhKd8c_Qh5d6cAd_JdKcQcKs_4s4c3h9h_Kh8h8d6s_Ts3dJsQs() {
    assertEquals(
      "Qh5d6cAd 4s4c3h9h AcAhTh5h 2s9s7s5c Ts3dJsQs Kh8h8d6s 9cJhKd8c 8s4d2dQd JdKcQcKs",
      Solver.process("omaha-holdem 2h7h9dJcTd 2s9s7s5c 8s4d2dQd AcAhTh5h 9cJhKd8c Qh5d6cAd JdKcQcKs 4s4c3h9h Kh8h8d6s Ts3dJsQs"));
  }

  @Test
  public void test_omaha_holdem_6010_4c7c8cAdTs_Qc5hJcJh_4hJd6s2s_As6hQs9s_2h3h8s5d_6dJsAc3d_7s3c7d4d_9d3sTc5c() {
    assertEquals(
      "4hJd6s2s 2h3h8s5d 6dJsAc3d 7s3c7d4d As6hQs9s 9d3sTc5c Qc5hJcJh",
      Solver.process("omaha-holdem 4c7c8cAdTs Qc5hJcJh 4hJd6s2s As6hQs9s 2h3h8s5d 6dJsAc3d 7s3c7d4d 9d3sTc5c"));
  }

  @Test
  public void test_omaha_holdem_6011_4d6c8d9c9h_Qs5dKhKd_AcQd2s3c_3h9dTh4c() {
    assertEquals(
      "AcQd2s3c Qs5dKhKd 3h9dTh4c",
      Solver.process("omaha-holdem 4d6c8d9c9h Qs5dKhKd AcQd2s3c 3h9dTh4c"));
  }

  @Test
  public void test_omaha_holdem_6012_4c5h9sJdQc_TsKd3c3s_Jh5s3h8h_4hAs4s6s_Qh2hAc2s() {
    assertEquals(
      "Qh2hAc2s Jh5s3h8h 4hAs4s6s TsKd3c3s",
      Solver.process("omaha-holdem 4c5h9sJdQc TsKd3c3s Jh5s3h8h 4hAs4s6s Qh2hAc2s"));
  }

  @Test
  public void test_omaha_holdem_6013_2c4d5h6hAh_AcAsJs8d_7dQcJhAd() {
    assertEquals(
      "7dQcJhAd AcAsJs8d",
      Solver.process("omaha-holdem 2c4d5h6hAh AcAsJs8d 7dQcJhAd"));
  }

  @Test
  public void test_omaha_holdem_6014_7s9cAdQdQs_AhKs5c6h_8d4h4d2d_4sJcQh3d_7d2hAc2c_AsKcQc3c() {
    assertEquals(
      "8d4h4d2d 7d2hAc2c AhKs5c6h 4sJcQh3d AsKcQc3c",
      Solver.process("omaha-holdem 7s9cAdQdQs AhKs5c6h 8d4h4d2d 4sJcQh3d 7d2hAc2c AsKcQc3c"));
  }

  @Test
  public void test_omaha_holdem_6015_3s6h9hJhTc_8d3c5hQh_3d7d8hAd_7h4cJd6d_9c2s6cTd_7cAsKsKd_8s5s5d6s_7s2h2d3h() {
    assertEquals(
      "8s5s5d6s 7cAsKsKd 9c2s6cTd 7h4cJd6d 3d7d8hAd 7s2h2d3h 8d3c5hQh",
      Solver.process("omaha-holdem 3s6h9hJhTc 8d3c5hQh 3d7d8hAd 7h4cJd6d 9c2s6cTd 7cAsKsKd 8s5s5d6s 7s2h2d3h"));
  }

  @Test
  public void test_omaha_holdem_6016_2c7h8dAdTh_3d8cQh6h_Qs5s9d7d_5dTd4sAs_6sJsJc3c_JdKhJh3s_9c4dKd4c_9h8h6dTc_2s8s2dQd_Qc2hTs3h() {
    assertEquals(
      "9c4dKd4c Qs5s9d7d 3d8cQh6h 6sJsJc3c=JdKhJh3s Qc2hTs3h 5dTd4sAs 2s8s2dQd 9h8h6dTc",
      Solver.process("omaha-holdem 2c7h8dAdTh 3d8cQh6h Qs5s9d7d 5dTd4sAs 6sJsJc3c JdKhJh3s 9c4dKd4c 9h8h6dTc 2s8s2dQd Qc2hTs3h"));
  }

  @Test
  public void test_omaha_holdem_6017_4c6h8c9cJc_JhQh3c4h_Ad9h6sAs() {
    assertEquals(
      "Ad9h6sAs JhQh3c4h",
      Solver.process("omaha-holdem 4c6h8c9cJc JhQh3c4h Ad9h6sAs"));
  }

  @Test
  public void test_omaha_holdem_6018_6c6hAsQhTh_KhJcTsAh_8sJd5hQs_Js2cKc9d_4cJhQd4h_8dTdKsAd_7c2s5d7s_6s8h4sQc_3d4d7d5s() {
    assertEquals(
      "3d4d7d5s 7c2s5d7s 8sJd5hQs 8dTdKsAd Js2cKc9d 4cJhQd4h KhJcTsAh 6s8h4sQc",
      Solver.process("omaha-holdem 6c6hAsQhTh KhJcTsAh 8sJd5hQs Js2cKc9d 4cJhQd4h 8dTdKsAd 7c2s5d7s 6s8h4sQc 3d4d7d5s"));
  }

  @Test
  public void test_omaha_holdem_6019_6c9hAdKdTh_3dAs4h3h_KcQd5d5c_Js7h4dAh_4sTc9d8c_5s8sJh6h_2cQsJc5h_KhQc8d8h_7c6d7d6s() {
    assertEquals(
      "5s8sJh6h KcQd5d5c=KhQc8d8h 3dAs4h3h Js7h4dAh 4sTc9d8c 7c6d7d6s 2cQsJc5h",
      Solver.process("omaha-holdem 6c9hAdKdTh 3dAs4h3h KcQd5d5c Js7h4dAh 4sTc9d8c 5s8sJh6h 2cQsJc5h KhQc8d8h 7c6d7d6s"));
  }

  @Test
  public void test_omaha_holdem_6020_4c4d4h8hKh_ThQs5s8c_5d9sJhJc_QdKs6c8s_3d3s6h2d_Ah5c2c5h_Qh6sJd2s() {
    assertEquals(
      "ThQs5s8c Qh6sJd2s QdKs6c8s 3d3s6h2d Ah5c2c5h 5d9sJhJc",
      Solver.process("omaha-holdem 4c4d4h8hKh ThQs5s8c 5d9sJhJc QdKs6c8s 3d3s6h2d Ah5c2c5h Qh6sJd2s"));
  }

  @Test
  public void test_omaha_holdem_6021_6s9c9sAcAh_2s7hTs7s_Qc2h4s6d_5s3s3h4c_Js9dJhJc_Th4dTdTc_Jd5c8d2c() {
    assertEquals(
      "Jd5c8d2c 5s3s3h4c Qc2h4s6d 2s7hTs7s Th4dTdTc Js9dJhJc",
      Solver.process("omaha-holdem 6s9c9sAcAh 2s7hTs7s Qc2h4s6d 5s3s3h4c Js9dJhJc Th4dTdTc Jd5c8d2c"));
  }

  @Test
  public void test_omaha_holdem_6022_5h6sJhQhQs_KhJc9hTs_2dTc3d7c_9d7d4d2h() {
    assertEquals(
      "9d7d4d2h 2dTc3d7c KhJc9hTs",
      Solver.process("omaha-holdem 5h6sJhQhQs KhJc9hTs 2dTc3d7c 9d7d4d2h"));
  }

  @Test
  public void test_omaha_holdem_6023_3d4d4s9cKd_JsTsJcTc_3s2dJhTh_Jd6c3hAh_QhAs2c9d_8cQdTd6d() {
    assertEquals(
      "3s2dJhTh Jd6c3hAh QhAs2c9d JsTsJcTc 8cQdTd6d",
      Solver.process("omaha-holdem 3d4d4s9cKd JsTsJcTc 3s2dJhTh Jd6c3hAh QhAs2c9d 8cQdTd6d"));
  }

  @Test
  public void test_omaha_holdem_6024_3s7s8c8hTd_QcKcAc6s_4d2dQdKh_7cJcTs3d_4s9h5s9c_5d5cKs6h_3h6cJdAs_Ad9dJs8d() {
    assertEquals(
      "4d2dQdKh QcKcAc6s 3h6cJdAs 5d5cKs6h 4s9h5s9c 7cJcTs3d Ad9dJs8d",
      Solver.process("omaha-holdem 3s7s8c8hTd QcKcAc6s 4d2dQdKh 7cJcTs3d 4s9h5s9c 5d5cKs6h 3h6cJdAs Ad9dJs8d"));
  }

  @Test
  public void test_omaha_holdem_6025_3c8hJdQhQs_TcKh3h2s_9dJc6c5d_Ah4sAc7c_Qd6h5hKc_Th9h9c4d_QcAsTdKd_3s8d8cJh_Ts2h4c2c() {
    assertEquals(
      "Ts2h4c2c TcKh3h2s 9dJc6c5d Ah4sAc7c Qd6h5hKc QcAsTdKd Th9h9c4d 3s8d8cJh",
      Solver.process("omaha-holdem 3c8hJdQhQs TcKh3h2s 9dJc6c5d Ah4sAc7c Qd6h5hKc Th9h9c4d QcAsTdKd 3s8d8cJh Ts2h4c2c"));
  }

  @Test
  public void test_omaha_holdem_6026_2h5hAhJhKd_AdTd5dKc_9d5sAc3c_9hJd8dQc_4h2dQs9c_8hQd4d4c_8sJs5cTh_9s6cTcQh_6d3dJc3h_7d2sKh6s() {
    assertEquals(
      "4h2dQs9c 8hQd4d4c 6d3dJc3h 9hJd8dQc 8sJs5cTh 7d2sKh6s 9d5sAc3c AdTd5dKc 9s6cTcQh",
      Solver.process("omaha-holdem 2h5hAhJhKd AdTd5dKc 9d5sAc3c 9hJd8dQc 4h2dQs9c 8hQd4d4c 8sJs5cTh 9s6cTcQh 6d3dJc3h 7d2sKh6s"));
  }

  @Test
  public void test_omaha_holdem_6027_6d9dAhAsTd_Kc2s7d8h_Jd5c6sQh_Ac7c2d4d_KsJh4h4s_AdQc9sKh_6cQd6h3s() {
    assertEquals(
      "KsJh4h4s Jd5c6sQh Kc2s7d8h Ac7c2d4d 6cQd6h3s AdQc9sKh",
      Solver.process("omaha-holdem 6d9dAhAsTd Kc2s7d8h Jd5c6sQh Ac7c2d4d KsJh4h4s AdQc9sKh 6cQd6h3s"));
  }

  @Test
  public void test_omaha_holdem_6028_4s5c8sJhKd_7h5s8hQh_6h2h2c4d_8d3dAdQs_QcKhTs9h_2d7d6d8c_2sJdJcTd_4h5h5d7s_AhAc6c3c() {
    assertEquals(
      "6h2h2c4d 8d3dAdQs QcKhTs9h AhAc6c3c 7h5s8hQh 4h5h5d7s 2sJdJcTd 2d7d6d8c",
      Solver.process("omaha-holdem 4s5c8sJhKd 7h5s8hQh 6h2h2c4d 8d3dAdQs QcKhTs9h 2d7d6d8c 2sJdJcTd 4h5h5d7s AhAc6c3c"));
  }

  @Test
  public void test_omaha_holdem_6029_3c6cAcQcQh_3d6hJsAs_5c6s6d9d_8sThJc2d_8h4h2sKd_TcAd8d5h_Ah2c9c4d_3sKhQd7s_9hQsJd7h_4cTd2h5s() {
    assertEquals(
      "4cTd2h5s 8sThJc2d 8h4h2sKd TcAd8d5h 3d6hJsAs 9hQsJd7h Ah2c9c4d 5c6s6d9d 3sKhQd7s",
      Solver.process("omaha-holdem 3c6cAcQcQh 3d6hJsAs 5c6s6d9d 8sThJc2d 8h4h2sKd TcAd8d5h Ah2c9c4d 3sKhQd7s 9hQsJd7h 4cTd2h5s"));
  }

  @Test
  public void test_omaha_holdem_6030_6h7c7h9cAh_Kd8c4cJh_6c5hQhQd_KhJsAsTs_2h9dKsQs_3h3cTc9h_2d2s3d9s() {
    assertEquals(
      "Kd8c4cJh 2d2s3d9s 2h9dKsQs KhJsAsTs 3h3cTc9h 6c5hQhQd",
      Solver.process("omaha-holdem 6h7c7h9cAh Kd8c4cJh 6c5hQhQd KhJsAsTs 2h9dKsQs 3h3cTc9h 2d2s3d9s"));
  }

  @Test
  public void test_omaha_holdem_6031_6h8h9c9dAh_Th5dKhJd_3cTs4h8d_3s4sKc4c_7hTdJh6c_6sQhQd7d_9sQcTc9h_2h5sJsKs() {
    assertEquals(
      "2h5sJsKs 3s4sKc4c 3cTs4h8d 6sQhQd7d 7hTdJh6c Th5dKhJd 9sQcTc9h",
      Solver.process("omaha-holdem 6h8h9c9dAh Th5dKhJd 3cTs4h8d 3s4sKc4c 7hTdJh6c 6sQhQd7d 9sQcTc9h 2h5sJsKs"));
  }

  @Test
  public void test_omaha_holdem_6032_2c4h5hJcQc_5c3c9dQh_6d6h8d5d_6sAhTd8s() {
    assertEquals(
      "6sAhTd8s 6d6h8d5d 5c3c9dQh",
      Solver.process("omaha-holdem 2c4h5hJcQc 5c3c9dQh 6d6h8d5d 6sAhTd8s"));
  }

  @Test
  public void test_omaha_holdem_6033_2h6d6s8hAc_Ks5s8s7h_AhJd4h5h_3s9d5d2s_7c4d9s8d_As6c4cKd_Qc3c8cTh_4s2dAd9h_Tc7sJs2c_Kc3hQsJh() {
    assertEquals(
      "Kc3hQsJh 3s9d5d2s Tc7sJs2c 7c4d9s8d Qc3c8cTh Ks5s8s7h 4s2dAd9h AhJd4h5h As6c4cKd",
      Solver.process("omaha-holdem 2h6d6s8hAc Ks5s8s7h AhJd4h5h 3s9d5d2s 7c4d9s8d As6c4cKd Qc3c8cTh 4s2dAd9h Tc7sJs2c Kc3hQsJh"));
  }

  @Test
  public void test_omaha_holdem_6034_2h2s3h4d8s_3dKd8cJs_Qs2cKh2d_5cKsAs4c() {
    assertEquals(
      "3dKd8cJs 5cKsAs4c Qs2cKh2d",
      Solver.process("omaha-holdem 2h2s3h4d8s 3dKd8cJs Qs2cKh2d 5cKsAs4c"));
  }

  @Test
  public void test_omaha_holdem_6035_3d4h5c6c9d_6d9s4s8s_Kh5d3s2s_7sJd6s2d() {
    assertEquals(
      "6d9s4s8s Kh5d3s2s 7sJd6s2d",
      Solver.process("omaha-holdem 3d4h5c6c9d 6d9s4s8s Kh5d3s2s 7sJd6s2d"));
  }

  @Test
  public void test_omaha_holdem_6036_3h4c8cAsJh_9hQsTdJd_7c9d5cJc_2h3s2cTc_3cAd4s6c_KsAh6h8d_Ac6s9sJs_5s5dQc5h_7h3d2sKh() {
    assertEquals(
      "2h3s2cTc 7h3d2sKh 5s5dQc5h 7c9d5cJc 9hQsTdJd 3cAd4s6c KsAh6h8d Ac6s9sJs",
      Solver.process("omaha-holdem 3h4c8cAsJh 9hQsTdJd 7c9d5cJc 2h3s2cTc 3cAd4s6c KsAh6h8d Ac6s9sJs 5s5dQc5h 7h3d2sKh"));
  }

  @Test
  public void test_omaha_holdem_6037_4h5h7sTcTs_6d7h3dKd_ThKcTd6s() {
    assertEquals(
      "6d7h3dKd ThKcTd6s",
      Solver.process("omaha-holdem 4h5h7sTcTs 6d7h3dKd ThKcTd6s"));
  }

  @Test
  public void test_omaha_holdem_6038_5h6c6d7hJc_3hKh8cJh_5d7dAc2c() {
    assertEquals(
      "5d7dAc2c 3hKh8cJh",
      Solver.process("omaha-holdem 5h6c6d7hJc 3hKh8cJh 5d7dAc2c"));
  }

  @Test
  public void test_omaha_holdem_6039_2d6dAdJsQh_8h4c3cTs_Tc6s4d9s_7cQc5sKh_5c4hQdKc_9cThKd4s_JcKs7d6c_3dAc7s3s() {
    assertEquals(
      "8h4c3cTs Tc6s4d9s 5c4hQdKc=7cQc5sKh 3dAc7s3s JcKs7d6c 9cThKd4s",
      Solver.process("omaha-holdem 2d6dAdJsQh 8h4c3cTs Tc6s4d9s 7cQc5sKh 5c4hQdKc 9cThKd4s JcKs7d6c 3dAc7s3s"));
  }

  @Test
  public void test_omaha_holdem_6040_6d9dAhQdQs_8h5cAcTs_3c7dJh8s_9s2c4h5s() {
    assertEquals(
      "3c7dJh8s 9s2c4h5s 8h5cAcTs",
      Solver.process("omaha-holdem 6d9dAhQdQs 8h5cAcTs 3c7dJh8s 9s2c4h5s"));
  }

  @Test
  public void test_omaha_holdem_6041_4s5c5dJsQh_Jh8sTdQd_5h3cAs4d_Ac9h5s8h_6dThKsTs_7cJd3d2s() {
    assertEquals(
      "6dThKsTs 7cJd3d2s Jh8sTdQd Ac9h5s8h 5h3cAs4d",
      Solver.process("omaha-holdem 4s5c5dJsQh Jh8sTdQd 5h3cAs4d Ac9h5s8h 6dThKsTs 7cJd3d2s"));
  }

  @Test
  public void test_omaha_holdem_6042_4d4s5c6cAd_Jc5s7hQh_2h5d7c9d_JdTsKc7d_Qd3d2c4c_Jh7sKd9s_2dAsTc3s_Ah6s3hQc_8d6hQsTh() {
    assertEquals(
      "JdTsKc7d=Jh7sKd9s 2h5d7c9d Jc5s7hQh 8d6hQsTh Ah6s3hQc 2dAsTc3s=Qd3d2c4c",
      Solver.process("omaha-holdem 4d4s5c6cAd Jc5s7hQh 2h5d7c9d JdTsKc7d Qd3d2c4c Jh7sKd9s 2dAsTc3s Ah6s3hQc 8d6hQsTh"));
  }

  @Test
  public void test_omaha_holdem_6043_3c6d7dJcTh_TcAc7s9s_5cQs6s8s_KsTs5hKd_9c3sKhAh() {
    assertEquals(
      "9c3sKhAh 5cQs6s8s KsTs5hKd TcAc7s9s",
      Solver.process("omaha-holdem 3c6d7dJcTh TcAc7s9s 5cQs6s8s KsTs5hKd 9c3sKhAh"));
  }

  @Test
  public void test_omaha_holdem_6044_5d5s6d7d9d_3c6c4sAd_4h2d2h8d_Kc5c7c6h_KdTcTh4d_5hAh8c8h_QsTs9sJh() {
    assertEquals(
      "QsTs9sJh 3c6c4sAd 5hAh8c8h 4h2d2h8d KdTcTh4d Kc5c7c6h",
      Solver.process("omaha-holdem 5d5s6d7d9d 3c6c4sAd 4h2d2h8d Kc5c7c6h KdTcTh4d 5hAh8c8h QsTs9sJh"));
  }

  @Test
  public void test_omaha_holdem_6045_3d6d6s8hKd_Kc5d4cQh_2h8c5s9s() {
    assertEquals(
      "2h8c5s9s Kc5d4cQh",
      Solver.process("omaha-holdem 3d6d6s8hKd Kc5d4cQh 2h8c5s9s"));
  }

  @Test
  public void test_omaha_holdem_6046_4c5cAsKdQd_JdQh3dKs_9c7sTh9s_3c2sQcJh_7hKcKh6d_4hJsQsTd_7cAd6hJc_4d5h8c2d_5s9h3s2h() {
    assertEquals(
      "9c7sTh9s 7cAd6hJc 4d5h8c2d JdQh3dKs 7hKcKh6d 3c2sQcJh=5s9h3s2h 4hJsQsTd",
      Solver.process("omaha-holdem 4c5cAsKdQd JdQh3dKs 9c7sTh9s 3c2sQcJh 7hKcKh6d 4hJsQsTd 7cAd6hJc 4d5h8c2d 5s9h3s2h"));
  }

  @Test
  public void test_omaha_holdem_6047_3d3s8cQhTc_3hJcJhKh_7h2c5c2d_Ac4s4hAh_8hJdAs6h_9c3c7d2s() {
    assertEquals(
      "7h2c5c2d 8hJdAs6h Ac4s4hAh 9c3c7d2s 3hJcJhKh",
      Solver.process("omaha-holdem 3d3s8cQhTc 3hJcJhKh 7h2c5c2d Ac4s4hAh 8hJdAs6h 9c3c7d2s"));
  }

  @Test
  public void test_omaha_holdem_6048_5s6c9d9hTc_3s4hJdJh_9cKc4s7d_8s7hQdTs_Qc2h5h5c() {
    assertEquals(
      "3s4hJdJh 9cKc4s7d 8s7hQdTs Qc2h5h5c",
      Solver.process("omaha-holdem 5s6c9d9hTc 3s4hJdJh 9cKc4s7d 8s7hQdTs Qc2h5h5c"));
  }

  @Test
  public void test_omaha_holdem_6049_2s5d6d7dKc_TdAdJsAc_Kd7sQhQd_9s9c4s8c() {
    assertEquals(
      "9s9c4s8c Kd7sQhQd TdAdJsAc",
      Solver.process("omaha-holdem 2s5d6d7dKc TdAdJsAc Kd7sQhQd 9s9c4s8c"));
  }

  @Test
  public void test_omaha_holdem_6050_2sAdJcJdKh_2dTc2hAc_9d5dJs7d_3h6hTdTh() {
    assertEquals(
      "3h6hTdTh 9d5dJs7d 2dTc2hAc",
      Solver.process("omaha-holdem 2sAdJcJdKh 2dTc2hAc 9d5dJs7d 3h6hTdTh"));
  }

  @Test
  public void test_omaha_holdem_6051_4h8s9cJsTd_TcAsQs2h_7sKs3h7h_5h6c2c5s_Ah8cAd6s_4s9s8dTs_3cKh9dQh_Th5dJhKc_6d2sQcAc_6h4dJcKd() {
    assertEquals(
      "6d2sQcAc 5h6c2c5s 7sKs3h7h Ah8cAd6s 4s9s8dTs 6h4dJcKd Th5dJhKc TcAsQs2h 3cKh9dQh",
      Solver.process("omaha-holdem 4h8s9cJsTd TcAsQs2h 7sKs3h7h 5h6c2c5s Ah8cAd6s 4s9s8dTs 3cKh9dQh Th5dJhKc 6d2sQcAc 6h4dJcKd"));
  }

  @Test
  public void test_omaha_holdem_6052_2h3dKdKhTh_9c4sTd5d_Kc2s5sTs() {
    assertEquals(
      "9c4sTd5d Kc2s5sTs",
      Solver.process("omaha-holdem 2h3dKdKhTh 9c4sTd5d Kc2s5sTs"));
  }

  @Test
  public void test_omaha_holdem_6053_2d7s8cAcJs_Qc9hTdKh_8h6d2h5s_4c6c7hQd_2sTcThAs_4hQh3hQs_KsAh5c8d_3d2c4s8s_9c9dKd3s() {
    assertEquals(
      "4c6c7hQd 9c9dKd3s 4hQh3hQs 3d2c4s8s=8h6d2h5s 2sTcThAs KsAh5c8d Qc9hTdKh",
      Solver.process("omaha-holdem 2d7s8cAcJs Qc9hTdKh 8h6d2h5s 4c6c7hQd 2sTcThAs 4hQh3hQs KsAh5c8d 3d2c4s8s 9c9dKd3s"));
  }

  @Test
  public void test_omaha_holdem_6054_2s3s5d9hQc_JhJd2hKs_7cTcTsTd_Ac8d9dKd_AsQh4sKc_7d3hQd4c_6sThKh5h_5c6h9s2d_4h8s8c8h_3dJc6d6c() {
    assertEquals(
      "6sThKh5h 3dJc6d6c 4h8s8c8h Ac8d9dKd 7cTcTsTd JhJd2hKs 5c6h9s2d 7d3hQd4c AsQh4sKc",
      Solver.process("omaha-holdem 2s3s5d9hQc JhJd2hKs 7cTcTsTd Ac8d9dKd AsQh4sKc 7d3hQd4c 6sThKh5h 5c6h9s2d 4h8s8c8h 3dJc6d6c"));
  }

  @Test
  public void test_omaha_holdem_6055_3s5d8hJcJs_3c7c4d6d_5s7sQsJh_Kc2c7hQh_Ts6h4cAd() {
    assertEquals(
      "Kc2c7hQh Ts6h4cAd 3c7c4d6d 5s7sQsJh",
      Solver.process("omaha-holdem 3s5d8hJcJs 3c7c4d6d 5s7sQsJh Kc2c7hQh Ts6h4cAd"));
  }

  @Test
  public void test_omaha_holdem_6056_3h6hKsQsTd_7c8c4s5s_5hKcTsJs_QhAs7hAd() {
    assertEquals(
      "7c8c4s5s QhAs7hAd 5hKcTsJs",
      Solver.process("omaha-holdem 3h6hKsQsTd 7c8c4s5s 5hKcTsJs QhAs7hAd"));
  }

  @Test
  public void test_omaha_holdem_6057_2d3dAhJdJs_5h7sTdJh_Kh7c8hQs_Qd5s8d6d_Ts3h5c4h_7dKsQc2s() {
    assertEquals(
      "Kh7c8hQs 7dKsQc2s 5h7sTdJh Ts3h5c4h Qd5s8d6d",
      Solver.process("omaha-holdem 2d3dAhJdJs 5h7sTdJh Kh7c8hQs Qd5s8d6d Ts3h5c4h 7dKsQc2s"));
  }

  @Test
  public void test_omaha_holdem_6058_3h6s8hJhTc_9s7h5hQs_Ah8s8cJd_8d3cKcTh_5sQcQh4h_6c2cTsAd() {
    assertEquals(
      "6c2cTsAd 8d3cKcTh Ah8s8cJd 9s7h5hQs 5sQcQh4h",
      Solver.process("omaha-holdem 3h6s8hJhTc 9s7h5hQs Ah8s8cJd 8d3cKcTh 5sQcQh4h 6c2cTsAd"));
  }

  @Test
  public void test_omaha_holdem_6059_5h6s8s9dQs_Jd4s8hAs_5dTdKs8c() {
    assertEquals(
      "5dTdKs8c Jd4s8hAs",
      Solver.process("omaha-holdem 5h6s8s9dQs Jd4s8hAs 5dTdKs8c"));
  }

  @Test
  public void test_omaha_holdem_6060_2s5c6s7hKd_JcTdJh8s_3h5d8d6d_KsQs4s9c_AcAdTc3s() {
    assertEquals(
      "JcTdJh8s KsQs4s9c AcAdTc3s 3h5d8d6d",
      Solver.process("omaha-holdem 2s5c6s7hKd JcTdJh8s 3h5d8d6d KsQs4s9c AcAdTc3s"));
  }

  @Test
  public void test_omaha_holdem_6061_3s8c9dJhTs_KdThTc4d_3cAs2c3d_5cKc7s9c() {
    assertEquals(
      "3cAs2c3d KdThTc4d 5cKc7s9c",
      Solver.process("omaha-holdem 3s8c9dJhTs KdThTc4d 3cAs2c3d 5cKc7s9c"));
  }

  @Test
  public void test_omaha_holdem_6062_2d4h6d8sJd_JhQh3s7h_Th5d4d7s_JcQc6s2s() {
    assertEquals(
      "JhQh3s7h JcQc6s2s Th5d4d7s",
      Solver.process("omaha-holdem 2d4h6d8sJd JhQh3s7h Th5d4d7s JcQc6s2s"));
  }

  @Test
  public void test_omaha_holdem_6063_5c7s8c8d9c_9dJhTd6s_Qs4h6d4s() {
    assertEquals(
      "Qs4h6d4s 9dJhTd6s",
      Solver.process("omaha-holdem 5c7s8c8d9c 9dJhTd6s Qs4h6d4s"));
  }

  @Test
  public void test_omaha_holdem_6064_4s7sJsKcQc_Jc8cKs4c_8sTdThAc_Kh2hAd9s_7h6c5s2c_5cAs3cQd_Jh7d3d9h() {
    assertEquals(
      "7h6c5s2c 5cAs3cQd Kh2hAd9s Jh7d3d9h Jc8cKs4c 8sTdThAc",
      Solver.process("omaha-holdem 4s7sJsKcQc Jc8cKs4c 8sTdThAc Kh2hAd9s 7h6c5s2c 5cAs3cQd Jh7d3d9h"));
  }

  @Test
  public void test_omaha_holdem_6065_2s4d8dAhJh_3c2h5d7c_7h4c3dKh_4s8s6d6h_QsKc5c7s_As5hQhJs() {
    assertEquals(
      "QsKc5c7s 7h4c3dKh 4s8s6d6h As5hQhJs 3c2h5d7c",
      Solver.process("omaha-holdem 2s4d8dAhJh 3c2h5d7c 7h4c3dKh 4s8s6d6h QsKc5c7s As5hQhJs"));
  }

  @Test
  public void test_omaha_holdem_6066_2s3h9sJsTd_9c3d3c2c_5c8h8s2d_Tc9d5hQc_Jh4dQs4h_5dTs4sAs_KcKdKs8d_6d5sKhTh_Ad2h6sJc() {
    assertEquals(
      "5c8h8s2d 6d5sKhTh Jh4dQs4h KcKdKs8d Tc9d5hQc Ad2h6sJc 9c3d3c2c 5dTs4sAs",
      Solver.process("omaha-holdem 2s3h9sJsTd 9c3d3c2c 5c8h8s2d Tc9d5hQc Jh4dQs4h 5dTs4sAs KcKdKs8d 6d5sKhTh Ad2h6sJc"));
  }

  @Test
  public void test_omaha_holdem_6067_2c6d7cJdQc_Kd8d5dJh_9h8c9c5s_Kh3d6s8h_Qs7sTc8s_6h2sAdJs() {
    assertEquals(
      "Kh3d6s8h Kd8d5dJh 6h2sAdJs Qs7sTc8s 9h8c9c5s",
      Solver.process("omaha-holdem 2c6d7cJdQc Kd8d5dJh 9h8c9c5s Kh3d6s8h Qs7sTc8s 6h2sAdJs"));
  }

  @Test
  public void test_omaha_holdem_6068_6c8cAdKdTd_7d9s3c8d_AsQs9cJs_7c6s6h5s() {
    assertEquals(
      "7c6s6h5s AsQs9cJs 7d9s3c8d",
      Solver.process("omaha-holdem 6c8cAdKdTd 7d9s3c8d AsQs9cJs 7c6s6h5s"));
  }

  @Test
  public void test_omaha_holdem_6069_2c2s3c5h6h_Td8s8dQc_5d2d3d7d() {
    assertEquals(
      "Td8s8dQc 5d2d3d7d",
      Solver.process("omaha-holdem 2c2s3c5h6h Td8s8dQc 5d2d3d7d"));
  }

  @Test
  public void test_omaha_holdem_6070_7cAsJsKhQh_9h3c2hJd_2s7h7sJh_Ts9s4s5c_Kc6hTc5h_Kd4h8d6s_4c5s3h2c() {
    assertEquals(
      "4c5s3h2c 9h3c2hJd Kd4h8d6s 2s7h7sJh Ts9s4s5c Kc6hTc5h",
      Solver.process("omaha-holdem 7cAsJsKhQh 9h3c2hJd 2s7h7sJh Ts9s4s5c Kc6hTc5h Kd4h8d6s 4c5s3h2c"));
  }

  @Test
  public void test_omaha_holdem_6071_7s9h9sAcAh_8h7h2d6h_6d2s8d6s_9c8s3dJd_Kc4dAd5h_Qc2c8cQs() {
    assertEquals(
      "6d2s8d6s 8h7h2d6h Qc2c8cQs 9c8s3dJd Kc4dAd5h",
      Solver.process("omaha-holdem 7s9h9sAcAh 8h7h2d6h 6d2s8d6s 9c8s3dJd Kc4dAd5h Qc2c8cQs"));
  }

  @Test
  public void test_omaha_holdem_6072_4c5s8h9cKs_4s7sKc3h_Qs7dAdTs_2cJh4d9h_5hAs8c7c_KdAc3sJs_8d9dQc3d_Qd5d5c6h_7hKhJcAh_2sTh6d8s() {
    assertEquals(
      "Qs7dAdTs 2sTh6d8s 7hKhJcAh=KdAc3sJs 5hAs8c7c 2cJh4d9h 8d9dQc3d 4s7sKc3h Qd5d5c6h",
      Solver.process("omaha-holdem 4c5s8h9cKs 4s7sKc3h Qs7dAdTs 2cJh4d9h 5hAs8c7c KdAc3sJs 8d9dQc3d Qd5d5c6h 7hKhJcAh 2sTh6d8s"));
  }

  @Test
  public void test_omaha_holdem_6073_4h5c6sAhTh_7cJd3sJs_8cAdKs4d_6dJcKd2s_9d7h9hTc_Qc9c8h5s() {
    assertEquals(
      "Qc9c8h5s 6dJcKd2s 8cAdKs4d 7cJd3sJs 9d7h9hTc",
      Solver.process("omaha-holdem 4h5c6sAhTh 7cJd3sJs 8cAdKs4d 6dJcKd2s 9d7h9hTc Qc9c8h5s"));
  }

  @Test
  public void test_omaha_holdem_6074_8c9hAsKdKh_4cJcAhQs_2hKs9d5c_5s7s7h7c_KcJdQc2s() {
    assertEquals(
      "5s7s7h7c 4cJcAhQs KcJdQc2s 2hKs9d5c",
      Solver.process("omaha-holdem 8c9hAsKdKh 4cJcAhQs 2hKs9d5c 5s7s7h7c KcJdQc2s"));
  }

  @Test
  public void test_omaha_holdem_6075_9dAhKsQcQd_Jd3hKh6s_2c3dAs5c_Jh9h7d8h_4c7s4dAd_4hTh4sTc() {
    assertEquals(
      "Jh9h7d8h 4hTh4sTc Jd3hKh6s 2c3dAs5c 4c7s4dAd",
      Solver.process("omaha-holdem 9dAhKsQcQd Jd3hKh6s 2c3dAs5c Jh9h7d8h 4c7s4dAd 4hTh4sTc"));
  }

  @Test
  public void test_omaha_holdem_6076_5h9sJcQcTs_7hJsQdKh_4dJh9c6c_7cTd3h4c_Kc3cJdAd_Tc9dAs4h_9h5d6s5s_7d8d8h2s() {
    assertEquals(
      "7cTd3h4c Tc9dAs4h 4dJh9c6c 9h5d6s5s 7d8d8h2s 7hJsQdKh Kc3cJdAd",
      Solver.process("omaha-holdem 5h9sJcQcTs 7hJsQdKh 4dJh9c6c 7cTd3h4c Kc3cJdAd Tc9dAs4h 9h5d6s5s 7d8d8h2s"));
  }

  @Test
  public void test_omaha_holdem_6077_3c5d7d8cAd_7cThQs9h_9d4sKcJd_Jh5h3h2h() {
    assertEquals(
      "7cThQs9h Jh5h3h2h 9d4sKcJd",
      Solver.process("omaha-holdem 3c5d7d8cAd 7cThQs9h 9d4sKcJd Jh5h3h2h"));
  }

  @Test
  public void test_omaha_holdem_6078_3d6d7d7sKc_Tc9hJs2h_Ad5d7c8h_9c7h6h4s_4h8s3h3c_8c9sQdTd() {
    assertEquals(
      "Tc9hJs2h 8c9sQdTd Ad5d7c8h 4h8s3h3c 9c7h6h4s",
      Solver.process("omaha-holdem 3d6d7d7sKc Tc9hJs2h Ad5d7c8h 9c7h6h4s 4h8s3h3c 8c9sQdTd"));
  }

  @Test
  public void test_omaha_holdem_6079_4c8dAcKcTh_Jc5d6h6d_5s4sJdQh_7sJh2s3c_Qs3hAh6c_QcKsKd8s_4dTd9h8c_2h2c2dJs_Kh9s6s5h_Ad9d4hAs() {
    assertEquals(
      "7sJh2s3c 2h2c2dJs Jc5d6h6d Kh9s6s5h Qs3hAh6c 4dTd9h8c QcKsKd8s Ad9d4hAs 5s4sJdQh",
      Solver.process("omaha-holdem 4c8dAcKcTh Jc5d6h6d 5s4sJdQh 7sJh2s3c Qs3hAh6c QcKsKd8s 4dTd9h8c 2h2c2dJs Kh9s6s5h Ad9d4hAs"));
  }

  @Test
  public void test_omaha_holdem_6080_3h7c7h8h9s_3cJdKc2s_Jc5d7dJh_6s9d6c7s_6dAh2c5c() {
    assertEquals(
      "3cJdKc2s Jc5d7dJh 6dAh2c5c 6s9d6c7s",
      Solver.process("omaha-holdem 3h7c7h8h9s 3cJdKc2s Jc5d7dJh 6s9d6c7s 6dAh2c5c"));
  }

  @Test
  public void test_omaha_holdem_6081_2d7c9dKhTs_3sQc6c7d_Th6dTc4c_2c6h9h7h_5h3dQhAd_4sTdJcKd_Kc6s5s8s_4hAcJd9c_Ks2h8d4d_Ah2s8hJs() {
    assertEquals(
      "5h3dQhAd 3sQc6c7d 4hAcJd9c 2c6h9h7h Ks2h8d4d 4sTdJcKd Th6dTc4c Kc6s5s8s Ah2s8hJs",
      Solver.process("omaha-holdem 2d7c9dKhTs 3sQc6c7d Th6dTc4c 2c6h9h7h 5h3dQhAd 4sTdJcKd Kc6s5s8s 4hAcJd9c Ks2h8d4d Ah2s8hJs"));
  }

  @Test
  public void test_omaha_holdem_6082_2c7d8hAcAh_7sAd5s9d_3cKhJdKd() {
    assertEquals(
      "3cKhJdKd 7sAd5s9d",
      Solver.process("omaha-holdem 2c7d8hAcAh 7sAd5s9d 3cKhJdKd"));
  }

  @Test
  public void test_omaha_holdem_6083_3s5d6c6hKh_Ad6s9c8d_8h4c7dQs_Jc2hKs8s_9dAs5s5h_2d8c5c7s_TdQcQdTc() {
    assertEquals(
      "2d8c5c7s TdQcQdTc Jc2hKs8s Ad6s9c8d 8h4c7dQs 9dAs5s5h",
      Solver.process("omaha-holdem 3s5d6c6hKh Ad6s9c8d 8h4c7dQs Jc2hKs8s 9dAs5s5h 2d8c5c7s TdQcQdTc"));
  }

  @Test
  public void test_omaha_holdem_6084_4h5h9cQcTh_3dJcQd3s_6h8d2c9h_2dTs2h2s_Js7dQh4d_As6d6cTd_4c7h9sJd() {
    assertEquals(
      "2dTs2h2s As6d6cTd 3dJcQd3s 4c7h9sJd Js7dQh4d 6h8d2c9h",
      Solver.process("omaha-holdem 4h5h9cQcTh 3dJcQd3s 6h8d2c9h 2dTs2h2s Js7dQh4d As6d6cTd 4c7h9sJd"));
  }

  @Test
  public void test_omaha_holdem_6085_5h8d9hKcQd_QsKh2d4h_TdJc2cAs_6c8hTsAd_Th2h2s3c_6dAc7c7h_6sKsQc3s() {
    assertEquals(
      "Th2h2s3c 6c8hTsAd 6sKsQc3s=QsKh2d4h 6dAc7c7h TdJc2cAs",
      Solver.process("omaha-holdem 5h8d9hKcQd QsKh2d4h TdJc2cAs 6c8hTsAd Th2h2s3c 6dAc7c7h 6sKsQc3s"));
  }

  @Test
  public void test_omaha_holdem_6086_2s3c8sJhQc_3d8d6s4s_6dJd4dQs() {
    assertEquals(
      "3d8d6s4s 6dJd4dQs",
      Solver.process("omaha-holdem 2s3c8sJhQc 3d8d6s4s 6dJd4dQs"));
  }

  @Test
  public void test_omaha_holdem_6087_2c7h8hAsQc_7d8sKsTd_5dTsAh4c_8c5c7c4h_Kd3s3cQs_9c5sJh6c() {
    assertEquals(
      "9c5sJh6c Kd3s3cQs 5dTsAh4c 7d8sKsTd=8c5c7c4h",
      Solver.process("omaha-holdem 2c7h8hAsQc 7d8sKsTd 5dTsAh4c 8c5c7c4h Kd3s3cQs 9c5sJh6c"));
  }

  @Test
  public void test_omaha_holdem_6088_4d5d5s6sQd_5c7s9c4h_9sKh7c4s_JsQc3s3d_2cTsKcAd_As8hQsKs_6c2s3h8c() {
    assertEquals(
      "2cTsKcAd 9sKh7c4s JsQc3s3d As8hQsKs 6c2s3h8c 5c7s9c4h",
      Solver.process("omaha-holdem 4d5d5s6sQd 5c7s9c4h 9sKh7c4s JsQc3s3d 2cTsKcAd As8hQsKs 6c2s3h8c"));
  }

  @Test
  public void test_omaha_holdem_6089_5s6d7hJdJh_Qh7d4s8c_Qs8dTc4h() {
    assertEquals(
      "Qh7d4s8c=Qs8dTc4h",
      Solver.process("omaha-holdem 5s6d7hJdJh Qh7d4s8c Qs8dTc4h"));
  }

  @Test
  public void test_omaha_holdem_6090_4s7d7h8hAd_TcAhTd3d_5s4c9dKs_5hTs2hJh_7cKc2s8c() {
    assertEquals(
      "5hTs2hJh 5s4c9dKs TcAhTd3d 7cKc2s8c",
      Solver.process("omaha-holdem 4s7d7h8hAd TcAhTd3d 5s4c9dKs 5hTs2hJh 7cKc2s8c"));
  }

  @Test
  public void test_omaha_holdem_6091_6s9dJdKsTh_TcTsQcAd_7d3s4c5s_7hKh5d8h_Jc3c4hKc_2d3d8d5h_3h8c4d6c_9c2sKdQd_2h2c9s5c() {
    assertEquals(
      "7d3s4c5s 2d3d8d5h 3h8c4d6c 2h2c9s5c Jc3c4hKc 7hKh5d8h 9c2sKdQd TcTsQcAd",
      Solver.process("omaha-holdem 6s9dJdKsTh TcTsQcAd 7d3s4c5s 7hKh5d8h Jc3c4hKc 2d3d8d5h 3h8c4d6c 9c2sKdQd 2h2c9s5c"));
  }

  @Test
  public void test_omaha_holdem_6092_8dAsJdKhQh_4sQd6d4d_5cAhTh3h_6h9d9cJs() {
    assertEquals(
      "6h9d9cJs 4sQd6d4d 5cAhTh3h",
      Solver.process("omaha-holdem 8dAsJdKhQh 4sQd6d4d 5cAhTh3h 6h9d9cJs"));
  }

  @Test
  public void test_omaha_holdem_6093_2h8h9cJsQd_2d7sJd8c_5h9h5c2s_Kh5s8sAd_3hJcQh4c_Qs6sKs7c_3c7hJh7d_4dTh4s3d_AcQcTdAs_6d4h8d3s() {
    assertEquals(
      "4dTh4s3d 6d4h8d3s Kh5s8sAd 3c7hJh7d Qs6sKs7c 5h9h5c2s 2d7sJd8c 3hJcQh4c AcQcTdAs",
      Solver.process("omaha-holdem 2h8h9cJsQd 2d7sJd8c 5h9h5c2s Kh5s8sAd 3hJcQh4c Qs6sKs7c 3c7hJh7d 4dTh4s3d AcQcTdAs 6d4h8d3s"));
  }

  @Test
  public void test_omaha_holdem_6094_3s9hAsQhQs_KhKd3d5c_Js2c2s6s_Ks8h8c4h() {
    assertEquals(
      "Ks8h8c4h KhKd3d5c Js2c2s6s",
      Solver.process("omaha-holdem 3s9hAsQhQs KhKd3d5c Js2c2s6s Ks8h8c4h"));
  }

  @Test
  public void test_omaha_holdem_6095_6cKdKhQcTs_2dTc3hKs_4h3d2s7d_Ah7c9d9s_9hQdJc4d_Jh4s3c8h_AsAc5d2c() {
    assertEquals(
      "4h3d2s7d Jh4s3c8h Ah7c9d9s AsAc5d2c 9hQdJc4d 2dTc3hKs",
      Solver.process("omaha-holdem 6cKdKhQcTs 2dTc3hKs 4h3d2s7d Ah7c9d9s 9hQdJc4d Jh4s3c8h AsAc5d2c"));
  }

  @Test
  public void test_omaha_holdem_6096_2d2s5h7sKc_QhAh9h8d_Qc7h6hAd_5c4d3c2h_ThKhJsAc_Jh9s7d9d_KsAsQd4s_8h6s4c4h() {
    assertEquals(
      "QhAh9h8d 8h6s4c4h Qc7h6hAd Jh9s7d9d KsAsQd4s=ThKhJsAc 5c4d3c2h",
      Solver.process("omaha-holdem 2d2s5h7sKc QhAh9h8d Qc7h6hAd 5c4d3c2h ThKhJsAc Jh9s7d9d KsAsQd4s 8h6s4c4h"));
  }

  @Test
  public void test_omaha_holdem_6097_5d6dQcQsTs_3h3c6s7d_9hJh5cQd_KhKd4sAs_Jd2dJs3s_8s3d6c7c_Kc5hAc2h_6hTcJc8h_4hTd4c2c() {
    assertEquals(
      "Kc5hAc2h 3h3c6s7d 8s3d6c7c 4hTd4c2c 6hTcJc8h Jd2dJs3s KhKd4sAs 9hJh5cQd",
      Solver.process("omaha-holdem 5d6dQcQsTs 3h3c6s7d 9hJh5cQd KhKd4sAs Jd2dJs3s 8s3d6c7c Kc5hAc2h 6hTcJc8h 4hTd4c2c"));
  }

  @Test
  public void test_omaha_holdem_6098_5h7hAcJcQc_2h4d7d8s_Kd5s9dQs_6dJh2d9c_6c8d4sAd_3c7s4c3d_Kh9sAsAh_6h8h9hTh_5c7cKc6s_TdQhJs3s() {
    assertEquals(
      "6h8h9hTh 2h4d7d8s 6dJh2d9c 6c8d4sAd Kd5s9dQs TdQhJs3s Kh9sAsAh 3c7s4c3d 5c7cKc6s",
      Solver.process("omaha-holdem 5h7hAcJcQc 2h4d7d8s Kd5s9dQs 6dJh2d9c 6c8d4sAd 3c7s4c3d Kh9sAsAh 6h8h9hTh 5c7cKc6s TdQhJs3s"));
  }

  @Test
  public void test_omaha_holdem_6099_6s9sAsQcTh_2c7c6cJd_9c4dTd5h_Tc6h6dAh_JcAd4c3d_5cQh9d5d() {
    assertEquals(
      "2c7c6cJd JcAd4c3d 9c4dTd5h 5cQh9d5d Tc6h6dAh",
      Solver.process("omaha-holdem 6s9sAsQcTh 2c7c6cJd 9c4dTd5h Tc6h6dAh JcAd4c3d 5cQh9d5d"));
  }

  @Test
  public void test_omaha_holdem_6100_2c2d5s8c8h_3cKd7c4c_5d9d6s2h_TdKc6c6d_Jc4s9h3h_9sAdTh7d() {
    assertEquals(
      "Jc4s9h3h 3cKd7c4c 9sAdTh7d TdKc6c6d 5d9d6s2h",
      Solver.process("omaha-holdem 2c2d5s8c8h 3cKd7c4c 5d9d6s2h TdKc6c6d Jc4s9h3h 9sAdTh7d"));
  }

  @Test
  public void test_omaha_holdem_6101_6h9sAsKcQd_JhAdAh3d_Td5s6c3c_9hJd8s2c_8dQh4s2s_3h8hAc6s_Qc9c7h5c_9d7sKh4d() {
    assertEquals(
      "Td5s6c3c 9hJd8s2c 8dQh4s2s Qc9c7h5c 9d7sKh4d 3h8hAc6s JhAdAh3d",
      Solver.process("omaha-holdem 6h9sAsKcQd JhAdAh3d Td5s6c3c 9hJd8s2c 8dQh4s2s 3h8hAc6s Qc9c7h5c 9d7sKh4d"));
  }

  @Test
  public void test_omaha_holdem_6102_2s4s7c7dAd_7sTc8h5c_4d8dQc2d_AsKd5h8s() {
    assertEquals(
      "4d8dQc2d AsKd5h8s 7sTc8h5c",
      Solver.process("omaha-holdem 2s4s7c7dAd 7sTc8h5c 4d8dQc2d AsKd5h8s"));
  }

  @Test
  public void test_omaha_holdem_6103_4h4s6s9cJc_KhQcKcJh_Th2h7h4d_7s3h2d8c() {
    assertEquals(
      "7s3h2d8c KhQcKcJh Th2h7h4d",
      Solver.process("omaha-holdem 4h4s6s9cJc KhQcKcJh Th2h7h4d 7s3h2d8c"));
  }

  @Test
  public void test_omaha_holdem_6104_2h4sAsKhQs_9sKcKs2d_5h8d7c4d() {
    assertEquals(
      "5h8d7c4d 9sKcKs2d",
      Solver.process("omaha-holdem 2h4sAsKhQs 9sKcKs2d 5h8d7c4d"));
  }

  @Test
  public void test_omaha_holdem_6105_2s8h9c9sTh_6cQdAc3d_Kd9h5sAh_7s3c5dTd_7h6dJcQh_5c8c2hAs_4c6s7c3s() {
    assertEquals(
      "6cQdAc3d 5c8c2hAs 7s3c5dTd Kd9h5sAh 4c6s7c3s 7h6dJcQh",
      Solver.process("omaha-holdem 2s8h9c9sTh 6cQdAc3d Kd9h5sAh 7s3c5dTd 7h6dJcQh 5c8c2hAs 4c6s7c3s"));
  }

  @Test
  public void test_omaha_holdem_6106_2d5d6h9hJc_2s2cQsQc_4hJd7s7h_QdKcQh3d_8d7cAsKh() {
    assertEquals(
      "4hJd7s7h QdKcQh3d 2s2cQsQc 8d7cAsKh",
      Solver.process("omaha-holdem 2d5d6h9hJc 2s2cQsQc 4hJd7s7h QdKcQh3d 8d7cAsKh"));
  }

  @Test
  public void test_omaha_holdem_6107_2c4h6c8h9d_TcTs3h8s_KcQhAcAs_Qd4sKd9h_4d7d7c8c() {
    assertEquals(
      "TcTs3h8s KcQhAcAs 4d7d7c8c Qd4sKd9h",
      Solver.process("omaha-holdem 2c4h6c8h9d TcTs3h8s KcQhAcAs Qd4sKd9h 4d7d7c8c"));
  }

  @Test
  public void test_omaha_holdem_6108_2d5s7s8d9h_Ac3s6hTs_JdQsQh9c() {
    assertEquals(
      "JdQsQh9c Ac3s6hTs",
      Solver.process("omaha-holdem 2d5s7s8d9h Ac3s6hTs JdQsQh9c"));
  }

  @Test
  public void test_omaha_holdem_6109_3c5h6h9dQs_4c4hKd6s_Jc7c5cTs_6d2h9cTc_3sQc5dKh_Ad3dJh4s() {
    assertEquals(
      "Ad3dJh4s Jc7c5cTs 4c4hKd6s 6d2h9cTc 3sQc5dKh",
      Solver.process("omaha-holdem 3c5h6h9dQs 4c4hKd6s Jc7c5cTs 6d2h9cTc 3sQc5dKh Ad3dJh4s"));
  }

  @Test
  public void test_omaha_holdem_6110_2d8s9hAhKc_7c5s6d4d_3c4sAcAs_5h7sTd8c() {
    assertEquals(
      "7c5s6d4d 5h7sTd8c 3c4sAcAs",
      Solver.process("omaha-holdem 2d8s9hAhKc 7c5s6d4d 3c4sAcAs 5h7sTd8c"));
  }

  @Test
  public void test_omaha_holdem_6111_4dAdJcJhKc_7sAc3s2d_9cQhTs9d_9s5d5h9h() {
    assertEquals(
      "9s5d5h9h 7sAc3s2d 9cQhTs9d",
      Solver.process("omaha-holdem 4dAdJcJhKc 7sAc3s2d 9cQhTs9d 9s5d5h9h"));
  }

  @Test
  public void test_omaha_holdem_6112_5s7s9cKhQd_9s3sTcKd_6dKs5c7c_7dKcQc3d_Jc2hAdAh_Th9h5hQh_6h8s4hTs() {
    assertEquals(
      "Jc2hAdAh Th9h5hQh 6dKs5c7c 9s3sTcKd 7dKcQc3d 6h8s4hTs",
      Solver.process("omaha-holdem 5s7s9cKhQd 9s3sTcKd 6dKs5c7c 7dKcQc3d Jc2hAdAh Th9h5hQh 6h8s4hTs"));
  }

  @Test
  public void test_omaha_holdem_6113_3d6c7sAdKh_5sQd7hQh_As3hJs9s_Jh6sJc5c() {
    assertEquals(
      "Jh6sJc5c 5sQd7hQh As3hJs9s",
      Solver.process("omaha-holdem 3d6c7sAdKh 5sQd7hQh As3hJs9s Jh6sJc5c"));
  }

  @Test
  public void test_omaha_holdem_6114_2c2d4s5cAc_7hTh6c9d_5s2s4h3h_7d5d6sJh_QcTcTdAh() {
    assertEquals(
      "7hTh6c9d 7d5d6sJh QcTcTdAh 5s2s4h3h",
      Solver.process("omaha-holdem 2c2d4s5cAc 7hTh6c9d 5s2s4h3h 7d5d6sJh QcTcTdAh"));
  }

  @Test
  public void test_omaha_holdem_6115_3c9dAcAsQh_5d8d8hAh_7d6sTc3s_2hJdKc9s_8c8s7cTh_Jc2cKsAd_3d5s3h4d_6d2sKhTd_9hTsQc6h() {
    assertEquals(
      "6d2sKhTd 7d6sTc3s 8c8s7cTh 2hJdKc9s 9hTsQc6h 5d8d8hAh Jc2cKsAd 3d5s3h4d",
      Solver.process("omaha-holdem 3c9dAcAsQh 5d8d8hAh 7d6sTc3s 2hJdKc9s 8c8s7cTh Jc2cKsAd 3d5s3h4d 6d2sKhTd 9hTsQc6h"));
  }

  @Test
  public void test_omaha_holdem_6116_4d8s9d9hKd_QhJs7sTs_5d2s3d5h_Qc4cAh6d_3h2dKs9s_4hJc4s9c_8dKc5c7c_AsKh2c7d() {
    assertEquals(
      "QhJs7sTs Qc4cAh6d 8dKc5c7c AsKh2c7d 5d2s3d5h 4hJc4s9c 3h2dKs9s",
      Solver.process("omaha-holdem 4d8s9d9hKd QhJs7sTs 5d2s3d5h Qc4cAh6d 3h2dKs9s 4hJc4s9c 8dKc5c7c AsKh2c7d"));
  }

  @Test
  public void test_omaha_holdem_6117_2d4c7h9cJc_9s8c6dKd_6h5dAdJs() {
    assertEquals(
      "9s8c6dKd 6h5dAdJs",
      Solver.process("omaha-holdem 2d4c7h9cJc 9s8c6dKd 6h5dAdJs"));
  }

  @Test
  public void test_omaha_holdem_6118_6c8hJdTcTd_7d4h4s5h_4dQd3cTs() {
    assertEquals(
      "7d4h4s5h 4dQd3cTs",
      Solver.process("omaha-holdem 6c8hJdTcTd 7d4h4s5h 4dQd3cTs"));
  }

  @Test
  public void test_omaha_holdem_6119_2s5c5d9dJh_8h5sTh4h_4d6d3d7d_9h3sTdTs() {
    assertEquals(
      "4d6d3d7d 9h3sTdTs 8h5sTh4h",
      Solver.process("omaha-holdem 2s5c5d9dJh 8h5sTh4h 4d6d3d7d 9h3sTdTs"));
  }

  @Test
  public void test_omaha_holdem_6120_3s6c7d8dQh_5cKd5sKc_6h3cAh8c_3dQdJc5d_8hJdAs2c_4c9h9cTh_Jh7s4h2s_6d7h7c4s_5hKhTd6s() {
    assertEquals(
      "5hKhTd6s Jh7s4h2s 8hJdAs2c 5cKd5sKc 6h3cAh8c 3dQdJc5d 6d7h7c4s 4c9h9cTh",
      Solver.process("omaha-holdem 3s6c7d8dQh 5cKd5sKc 6h3cAh8c 3dQdJc5d 8hJdAs2c 4c9h9cTh Jh7s4h2s 6d7h7c4s 5hKhTd6s"));
  }

  @Test
  public void test_omaha_holdem_6121_9cJdJsKhTh_AsQd8c7c_7s2c3h8s_3dKsTsKc() {
    assertEquals(
      "7s2c3h8s AsQd8c7c 3dKsTsKc",
      Solver.process("omaha-holdem 9cJdJsKhTh AsQd8c7c 7s2c3h8s 3dKsTsKc"));
  }

  @Test
  public void test_omaha_holdem_6122_3c6s9dAcQh_5d9s2c6h_Kc4s2dTc_4d4hKdJd_3hJcJh7h_AdAs9hTd_Ts7dQsKh() {
    assertEquals(
      "Kc4s2dTc 4d4hKdJd 3hJcJh7h Ts7dQsKh 5d9s2c6h AdAs9hTd",
      Solver.process("omaha-holdem 3c6s9dAcQh 5d9s2c6h Kc4s2dTc 4d4hKdJd 3hJcJh7h AdAs9hTd Ts7dQsKh"));
  }

  @Test
  public void test_omaha_holdem_6123_2h4c6c7cJd_Kc5d5hJs_AsTs9s2d_3h9dQs5s_Kh3d6dAc_7hQdKd3c_6h8s9hQc_4dQhJhAd_Jc4h8h8d_Ah2s4s5c() {
    assertEquals(
      "AsTs9s2d 6h8s9hQc Kh3d6dAc 7hQdKd3c Kc5d5hJs Ah2s4s5c 4dQhJhAd=Jc4h8h8d 3h9dQs5s",
      Solver.process("omaha-holdem 2h4c6c7cJd Kc5d5hJs AsTs9s2d 3h9dQs5s Kh3d6dAc 7hQdKd3c 6h8s9hQc 4dQhJhAd Jc4h8h8d Ah2s4s5c"));
  }

  @Test
  public void test_omaha_holdem_6124_2c2s7s8c9d_2hTd4c3h_4d5c4sJc() {
    assertEquals(
      "4d5c4sJc 2hTd4c3h",
      Solver.process("omaha-holdem 2c2s7s8c9d 2hTd4c3h 4d5c4sJc"));
  }

  @Test
  public void test_omaha_holdem_6125_5s8sAcTdTh_TsJh3hKd_4sKc3c8c_8h9dTc5h_9c7cQdQs() {
    assertEquals(
      "4sKc3c8c 9c7cQdQs TsJh3hKd 8h9dTc5h",
      Solver.process("omaha-holdem 5s8sAcTdTh TsJh3hKd 4sKc3c8c 8h9dTc5h 9c7cQdQs"));
  }

  @Test
  public void test_omaha_holdem_6126_4c4h5d5s6d_JsKc7d9c_3d3sAh3c_Th7c3hQc_Ks2hAs7s_8cTdQhKh_QsAd6sAc_4sKd7h2s_Qd5hTc4d() {
    assertEquals(
      "JsKc7d9c 8cTdQhKh Ks2hAs7s 3d3sAh3c QsAd6sAc 4sKd7h2s Th7c3hQc Qd5hTc4d",
      Solver.process("omaha-holdem 4c4h5d5s6d JsKc7d9c 3d3sAh3c Th7c3hQc Ks2hAs7s 8cTdQhKh QsAd6sAc 4sKd7h2s Qd5hTc4d"));
  }

  @Test
  public void test_omaha_holdem_6127_2h6h7d9cKc_6cJh4cTc_7s5dKh3d_9sJd7h5s_QhTh9d8c() {
    assertEquals(
      "6cJh4cTc 9sJd7h5s 7s5dKh3d QhTh9d8c",
      Solver.process("omaha-holdem 2h6h7d9cKc 6cJh4cTc 7s5dKh3d 9sJd7h5s QhTh9d8c"));
  }

  @Test
  public void test_omaha_holdem_6128_2h6d7dAdAs_6hTc6s5s_3sJc5dAh_Jh9cThTd_7c8sKd2s_KhTsKc4h_Qd3dAc6c_Qs8cJs4s_9d4d4cKs() {
    assertEquals(
      "Qs8cJs4s 7c8sKd2s Jh9cThTd KhTsKc4h 3sJc5dAh 9d4d4cKs 6hTc6s5s Qd3dAc6c",
      Solver.process("omaha-holdem 2h6d7dAdAs 6hTc6s5s 3sJc5dAh Jh9cThTd 7c8sKd2s KhTsKc4h Qd3dAc6c Qs8cJs4s 9d4d4cKs"));
  }

  @Test
  public void test_omaha_holdem_6129_3d3sAsKcTd_5sTh2dKd_7d5d2c5h_7h4c8h6d_5c2s9c8c_6cTcKhQc_9sQhJd8d_KsQsJs9d() {
    assertEquals(
      "7h4c8h6d 5c2s9c8c 7d5d2c5h 5sTh2dKd=6cTcKhQc 9sQhJd8d=KsQsJs9d",
      Solver.process("omaha-holdem 3d3sAsKcTd 5sTh2dKd 7d5d2c5h 7h4c8h6d 5c2s9c8c 6cTcKhQc 9sQhJd8d KsQsJs9d"));
  }

  @Test
  public void test_omaha_holdem_6130_7s9h9sKcTd_8h9dTs4c_Th5hTc2c_8cKs5cAh() {
    assertEquals(
      "8cKs5cAh 8h9dTs4c Th5hTc2c",
      Solver.process("omaha-holdem 7s9h9sKcTd 8h9dTs4c Th5hTc2c 8cKs5cAh"));
  }

  @Test
  public void test_omaha_holdem_6131_2h9cJcKcQd_4h9hAs2s_Ks6hQs6d() {
    assertEquals(
      "4h9hAs2s Ks6hQs6d",
      Solver.process("omaha-holdem 2h9cJcKcQd 4h9hAs2s Ks6hQs6d"));
  }

  @Test
  public void test_omaha_holdem_6132_3c5d6dAhQh_8c3dKd9d_4s8h9cAc_Td4hJh6s_2dJs4d7h_3s5cQsAd_9hKs2hJc() {
    assertEquals(
      "9hKs2hJc 8c3dKd9d Td4hJh6s 4s8h9cAc 3s5cQsAd 2dJs4d7h",
      Solver.process("omaha-holdem 3c5d6dAhQh 8c3dKd9d 4s8h9cAc Td4hJh6s 2dJs4d7h 3s5cQsAd 9hKs2hJc"));
  }

  @Test
  public void test_omaha_holdem_6133_3d5s6hJdTs_4c4h2sAs_2d9h8hJs_KhKs7h3s_QhAd6c7d_6dThAc6s_Kc4d5d9c_KdQc2hJc_Tc7sQsJh() {
    assertEquals(
      "Kc4d5d9c QhAd6c7d 2d9h8hJs KdQc2hJc KhKs7h3s Tc7sQsJh 6dThAc6s 4c4h2sAs",
      Solver.process("omaha-holdem 3d5s6hJdTs 4c4h2sAs 2d9h8hJs KhKs7h3s QhAd6c7d 6dThAc6s Kc4d5d9c KdQc2hJc Tc7sQsJh"));
  }

  @Test
  public void test_omaha_holdem_6134_4h5h5s7sAh_Jh7h3cKs_2c9cJd7d_9s7cAd5c() {
    assertEquals(
      "2c9cJd7d Jh7h3cKs 9s7cAd5c",
      Solver.process("omaha-holdem 4h5h5s7sAh Jh7h3cKs 2c9cJd7d 9s7cAd5c"));
  }

  @Test
  public void test_omaha_holdem_6135_2h3hJcQdQh_Kc7c2c9h_5dJsJdTh_3d6dQc9c_7sKh6c5s_4d8hTdAs_2dAc2s3s() {
    assertEquals(
      "7sKh6c5s 4d8hTdAs Kc7c2c9h 2dAc2s3s 5dJsJdTh 3d6dQc9c",
      Solver.process("omaha-holdem 2h3hJcQdQh Kc7c2c9h 5dJsJdTh 3d6dQc9c 7sKh6c5s 4d8hTdAs 2dAc2s3s"));
  }

  @Test
  public void test_omaha_holdem_6136_3d7h9sAsJd_4s6s3sQs_5c7c5s8s_8dThJcKh_Ts7s2c9c_7d6h4h3h() {
    assertEquals(
      "4s6s3sQs 5c7c5s8s 7d6h4h3h Ts7s2c9c 8dThJcKh",
      Solver.process("omaha-holdem 3d7h9sAsJd 4s6s3sQs 5c7c5s8s 8dThJcKh Ts7s2c9c 7d6h4h3h"));
  }

  @Test
  public void test_omaha_holdem_6137_3c4h5sKdTh_8cKsQs9d_7dTsTcJh_7h2s6s9h_4dQd8d2h_5hAc5d9c_Ah7s6hJd_Js6c2d3s_2c4cJcKh_3d5c3hKc() {
    assertEquals(
      "4dQd8d2h 8cKsQs9d 2c4cJcKh 3d5c3hKc 5hAc5d9c 7dTsTcJh Js6c2d3s 7h2s6s9h=Ah7s6hJd",
      Solver.process("omaha-holdem 3c4h5sKdTh 8cKsQs9d 7dTsTcJh 7h2s6s9h 4dQd8d2h 5hAc5d9c Ah7s6hJd Js6c2d3s 2c4cJcKh 3d5c3hKc"));
  }

  @Test
  public void test_omaha_holdem_6138_6c8dAdAhKh_AcJc6hTc_QsQd4s4h_9d5h4c9c_Qc4dKsTd_8c5s9h8h_As2hJs5d_7sJhKd3d_Th6d3s8s() {
    assertEquals(
      "Th6d3s8s 9d5h4c9c QsQd4s4h 7sJhKd3d Qc4dKsTd As2hJs5d 8c5s9h8h AcJc6hTc",
      Solver.process("omaha-holdem 6c8dAdAhKh AcJc6hTc QsQd4s4h 9d5h4c9c Qc4dKsTd 8c5s9h8h As2hJs5d 7sJhKd3d Th6d3s8s"));
  }

  @Test
  public void test_omaha_holdem_6139_4d5dJcJhJs_2sTd5h6h_9sQs6dJd_6s2c7dAc_Kd8cKs7h_4sThKh3s_3d7c8d8h_TcQc8s4h_4c9c9h5c_2hAhKc6c() {
    assertEquals(
      "2sTd5h6h TcQc8s4h 4sThKh3s 6s2c7dAc 2hAhKc6c 3d7c8d8h 4c9c9h5c Kd8cKs7h 9sQs6dJd",
      Solver.process("omaha-holdem 4d5dJcJhJs 2sTd5h6h 9sQs6dJd 6s2c7dAc Kd8cKs7h 4sThKh3s 3d7c8d8h TcQc8s4h 4c9c9h5c 2hAhKc6c"));
  }

  @Test
  public void test_omaha_holdem_6140_2c3d5c7cAc_5d2dAh8d_9d5s3cKc_KhQh5h6d_6h7d2hTs_QdJcKs3s_9s3hAdQc_7h4sJs9c() {
    assertEquals(
      "QdJcKs3s KhQh5h6d 7h4sJs9c 6h7d2hTs 9s3hAdQc 5d2dAh8d 9d5s3cKc",
      Solver.process("omaha-holdem 2c3d5c7cAc 5d2dAh8d 9d5s3cKc KhQh5h6d 6h7d2hTs QdJcKs3s 9s3hAdQc 7h4sJs9c"));
  }

  @Test
  public void test_omaha_holdem_6141_3h4c9hAcKc_QdTh8s6s_Ks6dTc9d_7h5dQcJh_8d8h9s3s_5h4d3cAd_QhQs4s3d_Jd6hAh7d() {
    assertEquals(
      "QdTh8s6s 7h5dQcJh Jd6hAh7d QhQs4s3d 8d8h9s3s Ks6dTc9d 5h4d3cAd",
      Solver.process("omaha-holdem 3h4c9hAcKc QdTh8s6s Ks6dTc9d 7h5dQcJh 8d8h9s3s 5h4d3cAd QhQs4s3d Jd6hAh7d"));
  }

  @Test
  public void test_omaha_holdem_6142_6h8c8d8hQd_KdJsAd6d_7hKc3cKs_3s8s6s6c_Qh9d2h4h_7dQs2d4d_Jh7s5s9h() {
    assertEquals(
      "Jh7s5s9h 7dQs2d4d Qh9d2h4h KdJsAd6d 7hKc3cKs 3s8s6s6c",
      Solver.process("omaha-holdem 6h8c8d8hQd KdJsAd6d 7hKc3cKs 3s8s6s6c Qh9d2h4h 7dQs2d4d Jh7s5s9h"));
  }

  @Test
  public void test_omaha_holdem_6143_5h5s8cAsQd_Qc6h4d7c_5dJc7s9d_Kh6c6d4s() {
    assertEquals(
      "Kh6c6d4s Qc6h4d7c 5dJc7s9d",
      Solver.process("omaha-holdem 5h5s8cAsQd Qc6h4d7c 5dJc7s9d Kh6c6d4s"));
  }

  @Test
  public void test_omaha_holdem_6144_5d5sAdAsJh_9dKs4hKd_Tc3c7d5c() {
    assertEquals(
      "9dKs4hKd Tc3c7d5c",
      Solver.process("omaha-holdem 5d5sAdAsJh 9dKs4hKd Tc3c7d5c"));
  }

  @Test
  public void test_omaha_holdem_6145_3c5c8c9d9h_5hKsJc3h_Qs6d8dQh_5sJsQc2s_7c2h8sTd_4d4h4sAh_AcTh3d6s_2c3s4cKd_Ts6c7s9s() {
    assertEquals(
      "AcTh3d6s 4d4h4sAh 5sJsQc2s 5hKsJc3h 7c2h8sTd Qs6d8dQh Ts6c7s9s 2c3s4cKd",
      Solver.process("omaha-holdem 3c5c8c9d9h 5hKsJc3h Qs6d8dQh 5sJsQc2s 7c2h8sTd 4d4h4sAh AcTh3d6s 2c3s4cKd Ts6c7s9s"));
  }

  @Test
  public void test_omaha_holdem_6146_4c9dAsJsKh_8d9cAhKc_Td8h5c6d_3h5hQc7c_4dJhQd2c_5s2sQh7h_8c3cTc6h_Jd3s5d4s() {
    assertEquals(
      "8c3cTc6h=Td8h5c6d 3h5hQc7c=5s2sQh7h 4dJhQd2c=Jd3s5d4s 8d9cAhKc",
      Solver.process("omaha-holdem 4c9dAsJsKh 8d9cAhKc Td8h5c6d 3h5hQc7c 4dJhQd2c 5s2sQh7h 8c3cTc6h Jd3s5d4s"));
  }

  @Test
  public void test_omaha_holdem_6147_4h5h7hKsTh_Kd7sQhJc_7cKhKcJh_AsTcQd8h_6h9c2d3d() {
    assertEquals(
      "AsTcQd8h Kd7sQhJc 6h9c2d3d 7cKhKcJh",
      Solver.process("omaha-holdem 4h5h7hKsTh Kd7sQhJc 7cKhKcJh AsTcQd8h 6h9c2d3d"));
  }

  @Test
  public void test_omaha_holdem_6148_5h6s7h7sKd_Kc8sAd5c_8hQs3d9h_3cKsJsAs_2hTh3sTs_6c4h2c3h_8d6dTcQh_4d2s5sQd() {
    assertEquals(
      "4d2s5sQd 8d6dTcQh 2hTh3sTs 3cKsJsAs=Kc8sAd5c 6c4h2c3h 8hQs3d9h",
      Solver.process("omaha-holdem 5h6s7h7sKd Kc8sAd5c 8hQs3d9h 3cKsJsAs 2hTh3sTs 6c4h2c3h 8d6dTcQh 4d2s5sQd"));
  }

  @Test
  public void test_omaha_holdem_6149_2c5c6c7c9d_Ad2dKcKd_6d3dTc3c_7h2sKsQh_4h8cAc8h_KhQs9h4c_6s7d9c7s_2hJsThQc() {
    assertEquals(
      "2hJsThQc KhQs9h4c Ad2dKcKd 7h2sKsQh 6s7d9c7s 6d3dTc3c 4h8cAc8h",
      Solver.process("omaha-holdem 2c5c6c7c9d Ad2dKcKd 6d3dTc3c 7h2sKsQh 4h8cAc8h KhQs9h4c 6s7d9c7s 2hJsThQc"));
  }

  @Test
  public void test_omaha_holdem_6150_4s7c8cJsQs_JdTs7d8d_3s8hQdTh_AcKd9c2d_4c6c2sKs_6s2h7h3d_As5c5d2c_9d3c9sJc_Ad5h5s6h_4dKc8sTc() {
    assertEquals(
      "AcKd9c2d As5c5d2c 6s2h7h3d 9d3c9sJc 4dKc8sTc JdTs7d8d 3s8hQdTh Ad5h5s6h 4c6c2sKs",
      Solver.process("omaha-holdem 4s7c8cJsQs JdTs7d8d 3s8hQdTh AcKd9c2d 4c6c2sKs 6s2h7h3d As5c5d2c 9d3c9sJc Ad5h5s6h 4dKc8sTc"));
  }

  @Test
  public void test_omaha_holdem_6151_9c9h9sJhQh_6hQc7cQd_Td4dJc4s_Js5h5c2h_Kd9d3h4h_8c6cTs5d_7hQsKc2s_Kh4cAcKs_7sAdAh5s() {
    assertEquals(
      "7hQsKc2s 8c6cTs5d Td4dJc4s Js5h5c2h Kh4cAcKs 7sAdAh5s 6hQc7cQd Kd9d3h4h",
      Solver.process("omaha-holdem 9c9h9sJhQh 6hQc7cQd Td4dJc4s Js5h5c2h Kd9d3h4h 8c6cTs5d 7hQsKc2s Kh4cAcKs 7sAdAh5s"));
  }

  @Test
  public void test_omaha_holdem_6152_3d6d6s7cAh_Qd6cTc9s_Th9d8hTd() {
    assertEquals(
      "Th9d8hTd Qd6cTc9s",
      Solver.process("omaha-holdem 3d6d6s7cAh Qd6cTc9s Th9d8hTd"));
  }

  @Test
  public void test_omaha_holdem_6153_2s5h5s6c8c_5cTd8s5d_9dTh7s6d_2c6sQh4h_7h2d7cJc() {
    assertEquals(
      "2c6sQh4h 7h2d7cJc 9dTh7s6d 5cTd8s5d",
      Solver.process("omaha-holdem 2s5h5s6c8c 5cTd8s5d 9dTh7s6d 2c6sQh4h 7h2d7cJc"));
  }

  @Test
  public void test_omaha_holdem_6154_6d7c8dKdTs_4h2sAs9h_3c9sTd7s_3dTh4dQs_6cJcTc4c_2h8cAc2c_Ks5h2d5s_3h5c8sQc() {
    assertEquals(
      "4h2sAs9h 3h5c8sQc 2h8cAc2c Ks5h2d5s 6cJcTc4c 3c9sTd7s 3dTh4dQs",
      Solver.process("omaha-holdem 6d7c8dKdTs 4h2sAs9h 3c9sTd7s 3dTh4dQs 6cJcTc4c 2h8cAc2c Ks5h2d5s 3h5c8sQc"));
  }

  @Test
  public void test_omaha_holdem_6155_2c4c5c6s7c_3sJc5s5d_3c7sAhAc_Qs8s8hAs() {
    assertEquals(
      "Qs8s8hAs 3sJc5s5d 3c7sAhAc",
      Solver.process("omaha-holdem 2c4c5c6s7c 3sJc5s5d 3c7sAhAc Qs8s8hAs"));
  }

  @Test
  public void test_omaha_holdem_6156_5c6d6hJhJs_JcQd6cTc_2cTsKd4h_3s7s4dAd_Ah3cJdQh_4s2h5h9h_9c8hKc9s_3h3dTh7d() {
    assertEquals(
      "2cTsKd4h 3s7s4dAd 3h3dTh7d 4s2h5h9h 9c8hKc9s Ah3cJdQh JcQd6cTc",
      Solver.process("omaha-holdem 5c6d6hJhJs JcQd6cTc 2cTsKd4h 3s7s4dAd Ah3cJdQh 4s2h5h9h 9c8hKc9s 3h3dTh7d"));
  }

  @Test
  public void test_omaha_holdem_6157_2d5d6sJhKs_JcKd6h4c_Js2s7d8d_7c5s3cTh_AdKc5h7s() {
    assertEquals(
      "7c5s3cTh Js2s7d8d AdKc5h7s JcKd6h4c",
      Solver.process("omaha-holdem 2d5d6sJhKs JcKd6h4c Js2s7d8d 7c5s3cTh AdKc5h7s"));
  }

  @Test
  public void test_omaha_holdem_6158_5s6s7c9hJc_5cAdAhQs_Kh8dTs8c() {
    assertEquals(
      "5cAdAhQs Kh8dTs8c",
      Solver.process("omaha-holdem 5s6s7c9hJc 5cAdAhQs Kh8dTs8c"));
  }

  @Test
  public void test_omaha_holdem_6159_3s4c5s9sKs_Th7cQc7d_3dKd2h6c_Qs6s4dAh_9h8hTs6d() {
    assertEquals(
      "Th7cQc7d 9h8hTs6d 3dKd2h6c Qs6s4dAh",
      Solver.process("omaha-holdem 3s4c5s9sKs Th7cQc7d 3dKd2h6c Qs6s4dAh 9h8hTs6d"));
  }

  @Test
  public void test_omaha_holdem_6160_2d2h3d5hKc_8d4sTc3s_KsJh7cQd_7h6d9d7d() {
    assertEquals(
      "8d4sTc3s 7h6d9d7d KsJh7cQd",
      Solver.process("omaha-holdem 2d2h3d5hKc 8d4sTc3s KsJh7cQd 7h6d9d7d"));
  }

  @Test
  public void test_omaha_holdem_6161_4d5c6c8dTd_AcTc8c9h_3dAh7h9c_JhTsAdTh_4h3c6h2d_4s9dJsQs_5s2c4cQc_QdKsJd8h_Kd9sAs5h() {
    assertEquals(
      "4s9dJsQs Kd9sAs5h 5s2c4cQc AcTc8c9h JhTsAdTh 4h3c6h2d 3dAh7h9c QdKsJd8h",
      Solver.process("omaha-holdem 4d5c6c8dTd AcTc8c9h 3dAh7h9c JhTsAdTh 4h3c6h2d 4s9dJsQs 5s2c4cQc QdKsJd8h Kd9sAs5h"));
  }

  @Test
  public void test_omaha_holdem_6162_2s5d7c9cQh_5h4s6c8h_KsJd7h2d_6sKcTd5c_9s3c3hAd_Qs9h3dKh_AcTh5s4c_6d6h9d8c() {
    assertEquals(
      "6sKcTd5c AcTh5s4c 9s3c3hAd KsJd7h2d Qs9h3dKh 5h4s6c8h=6d6h9d8c",
      Solver.process("omaha-holdem 2s5d7c9cQh 5h4s6c8h KsJd7h2d 6sKcTd5c 9s3c3hAd Qs9h3dKh AcTh5s4c 6d6h9d8c"));
  }

  @Test
  public void test_omaha_holdem_6163_3d3h4d5hTc_Jh6sThQs_Jd9dKd5s_2hAs3sAc_Js2s2dAh_7d7hQhTd_5c9s4hTs_8dKs9h8s_KhKcAd6c_QcJc6h7c() {
    assertEquals(
      "Jd9dKd5s 8dKs9h8s 7d7hQhTd=Jh6sThQs 5c9s4hTs KhKcAd6c 2hAs3sAc=Js2s2dAh QcJc6h7c",
      Solver.process("omaha-holdem 3d3h4d5hTc Jh6sThQs Jd9dKd5s 2hAs3sAc Js2s2dAh 7d7hQhTd 5c9s4hTs 8dKs9h8s KhKcAd6c QcJc6h7c"));
  }

  @Test
  public void test_omaha_holdem_6164_3s8h8sJdTc_5h7hJh9d_5dKh2h5s_9c3h4s4c_7d2s6cAs() {
    assertEquals(
      "7d2s6cAs 9c3h4s4c 5dKh2h5s 5h7hJh9d",
      Solver.process("omaha-holdem 3s8h8sJdTc 5h7hJh9d 5dKh2h5s 9c3h4s4c 7d2s6cAs"));
  }

  @Test
  public void test_omaha_holdem_6165_4h6cAsJcTh_Kh2c4c9s_5h5dJdQs_8cKd6hJh() {
    assertEquals(
      "Kh2c4c9s 5h5dJdQs 8cKd6hJh",
      Solver.process("omaha-holdem 4h6cAsJcTh Kh2c4c9s 5h5dJdQs 8cKd6hJh"));
  }

  @Test
  public void test_omaha_holdem_6166_5d7h9sAdKd_JsTd7d6d_Th6c7c8h_Qc2cTsKh() {
    assertEquals(
      "Qc2cTsKh Th6c7c8h JsTd7d6d",
      Solver.process("omaha-holdem 5d7h9sAdKd JsTd7d6d Th6c7c8h Qc2cTsKh"));
  }

  @Test
  public void test_omaha_holdem_6167_2h3h6h7cAh_Td3c7h7s_3s5d8hKs() {
    assertEquals(
      "3s5d8hKs Td3c7h7s",
      Solver.process("omaha-holdem 2h3h6h7cAh Td3c7h7s 3s5d8hKs"));
  }

  @Test
  public void test_omaha_holdem_6168_6d8c8d9hJc_7s4c7c4d_2cTd4hQc_Tc8sJdTs_Qd5s3s3d_Kd4sAc2h_Ad6sQh3h_2d5h2sKc_8hJsAh9d() {
    assertEquals(
      "Kd4sAc2h 2d5h2sKc Qd5s3s3d Ad6sQh3h 7s4c7c4d 2cTd4hQc 8hJsAh9d=Tc8sJdTs",
      Solver.process("omaha-holdem 6d8c8d9hJc 7s4c7c4d 2cTd4hQc Tc8sJdTs Qd5s3s3d Kd4sAc2h Ad6sQh3h 2d5h2sKc 8hJsAh9d"));
  }

  @Test
  public void test_omaha_holdem_6169_3c3d3h4c4s_7s7d5h2c_2s9d2h6c_TcKd8hQd_3sKs7h5d_4h5c6sAc_6h8sThAs() {
    assertEquals(
      "TcKd8hQd 6h8sThAs 4h5c6sAc 2s9d2h6c 7s7d5h2c 3sKs7h5d",
      Solver.process("omaha-holdem 3c3d3h4c4s 7s7d5h2c 2s9d2h6c TcKd8hQd 3sKs7h5d 4h5c6sAc 6h8sThAs"));
  }

  @Test
  public void test_omaha_holdem_6170_3d3h5c6h7d_5dAh2c9s_Th7c3cQd_6dKh8hTs_Qs5h4h5s_KdJcTdJh_4s7s8c8d_3sKs9h2d_KcAc9d8s_Ad6c4c2h() {
    assertEquals(
      "5dAh2c9s 6dKh8hTs KdJcTdJh 3sKs9h2d Ad6c4c2h 4s7s8c8d KcAc9d8s Th7c3cQd Qs5h4h5s",
      Solver.process("omaha-holdem 3d3h5c6h7d 5dAh2c9s Th7c3cQd 6dKh8hTs Qs5h4h5s KdJcTdJh 4s7s8c8d 3sKs9h2d KcAc9d8s Ad6c4c2h"));
  }

  @Test
  public void test_omaha_holdem_6171_5h8s9dAdTh_4h5dTc2s_2h9cAhTd_5cJhKh2c_Qh4d3s6c_8h7s6d6h() {
    assertEquals(
      "Qh4d3s6c 5cJhKh2c 4h5dTc2s 2h9cAhTd 8h7s6d6h",
      Solver.process("omaha-holdem 5h8s9dAdTh 4h5dTc2s 2h9cAhTd 5cJhKh2c Qh4d3s6c 8h7s6d6h"));
  }

  @Test
  public void test_omaha_holdem_6172_2hAhJcJhTs_Td6sQsKd_3d5cKh4d() {
    assertEquals(
      "3d5cKh4d Td6sQsKd",
      Solver.process("omaha-holdem 2hAhJcJhTs Td6sQsKd 3d5cKh4d"));
  }

  @Test
  public void test_omaha_holdem_6173_2h3c4s7h8c_KsAhTd5s_8dTsAs6h_9cJs4h6d_4dKcJdQd_9dKd9sQs_JhQc3h6s_Jc5c8h8s_5d3s2d2c_KhQh6c7c() {
    assertEquals(
      "JhQc3h6s 9cJs4h6d 4dKcJdQd KhQh6c7c 8dTsAs6h 9dKd9sQs 5d3s2d2c Jc5c8h8s KsAhTd5s",
      Solver.process("omaha-holdem 2h3c4s7h8c KsAhTd5s 8dTsAs6h 9cJs4h6d 4dKcJdQd 9dKd9sQs JhQc3h6s Jc5c8h8s 5d3s2d2c KhQh6c7c"));
  }

  @Test
  public void test_omaha_holdem_6174_2h3s5d9cJc_Jh3hQsAd_6c8h9d2s_KdJs4h6h_6sQdKc4c_Qh5s2dTc() {
    assertEquals(
      "Qh5s2dTc 6c8h9d2s Jh3hQsAd 6sQdKc4c=KdJs4h6h",
      Solver.process("omaha-holdem 2h3s5d9cJc Jh3hQsAd 6c8h9d2s KdJs4h6h 6sQdKc4c Qh5s2dTc"));
  }

  @Test
  public void test_omaha_holdem_6175_2c8c8hAdKs_QdKh8s6d_5s6h5d4d_5h3dTdKc() {
    assertEquals(
      "5s6h5d4d 5h3dTdKc QdKh8s6d",
      Solver.process("omaha-holdem 2c8c8hAdKs QdKh8s6d 5s6h5d4d 5h3dTdKc"));
  }

  @Test
  public void test_omaha_holdem_6176_2s5cAsJhQc_3c3s8hQs_6dKdQd6s_5s9c2h7c_5dTc4h7s_6c3hKc4c_7h2dTd7d_9s4s9h8c() {
    assertEquals(
      "5dTc4h7s 7h2dTd7d 9s4s9h8c 3c3s8hQs 6dKdQd6s 5s9c2h7c 6c3hKc4c",
      Solver.process("omaha-holdem 2s5cAsJhQc 3c3s8hQs 6dKdQd6s 5s9c2h7c 5dTc4h7s 6c3hKc4c 7h2dTd7d 9s4s9h8c"));
  }

  @Test
  public void test_omaha_holdem_6177_5h5s7dKcQc_Tc6d5c9c_AsTs6h8h_Ks8sKh4s_Kd2hJh8c_QhJsAd2d_2s9d3d5d_Qd6s4d7h_Jc4hAh9s() {
    assertEquals(
      "AsTs6h8h Jc4hAh9s QhJsAd2d Qd6s4d7h Kd2hJh8c 2s9d3d5d Tc6d5c9c Ks8sKh4s",
      Solver.process("omaha-holdem 5h5s7dKcQc Tc6d5c9c AsTs6h8h Ks8sKh4s Kd2hJh8c QhJsAd2d 2s9d3d5d Qd6s4d7h Jc4hAh9s"));
  }

  @Test
  public void test_omaha_holdem_6178_5c9hKcKdQs_Ah7h3c2c_AcQcJh6s_8dAs6c2h_7dTh8h3s_9c8sTdTc_Ks4cQhJs_Ad5d2d4h_2s9s8c9d() {
    assertEquals(
      "7dTh8h3s Ah7h3c2c 8dAs6c2h Ad5d2d4h 9c8sTdTc AcQcJh6s 2s9s8c9d Ks4cQhJs",
      Solver.process("omaha-holdem 5c9hKcKdQs Ah7h3c2c AcQcJh6s 8dAs6c2h 7dTh8h3s 9c8sTdTc Ks4cQhJs Ad5d2d4h 2s9s8c9d"));
  }

  @Test
  public void test_omaha_holdem_6179_4c6cAsJsKc_7s3cTsQh_8s5s3s2h() {
    assertEquals(
      "8s5s3s2h 7s3cTsQh",
      Solver.process("omaha-holdem 4c6cAsJsKc 7s3cTsQh 8s5s3s2h"));
  }

  @Test
  public void test_omaha_holdem_6180_3s4s6c9hQs_Kd6h3d8s_9d4d7c7h_2d6sQh8c_Ks9c3hQd_AsTcJh8d() {
    assertEquals(
      "AsTcJh8d Kd6h3d8s 9d4d7c7h 2d6sQh8c Ks9c3hQd",
      Solver.process("omaha-holdem 3s4s6c9hQs Kd6h3d8s 9d4d7c7h 2d6sQh8c Ks9c3hQd AsTcJh8d"));
  }

  @Test
  public void test_omaha_holdem_6181_3c5dAdAhQs_JsKsJh7d_9d4s2h4h_7c5h9s5c_6s6d3dTh_5s9h2d4c_QcQh4dKh() {
    assertEquals(
      "6s6d3dTh JsKsJh7d 5s9h2d4c=9d4s2h4h 7c5h9s5c QcQh4dKh",
      Solver.process("omaha-holdem 3c5dAdAhQs JsKsJh7d 9d4s2h4h 7c5h9s5c 6s6d3dTh 5s9h2d4c QcQh4dKh"));
  }

  @Test
  public void test_omaha_holdem_6182_4d6hKhQdTh_9h8c3dTc_AcAh7d5d_9sTd5s4s_7h4c3s3c() {
    assertEquals(
      "7h4c3s3c 9h8c3dTc AcAh7d5d 9sTd5s4s",
      Solver.process("omaha-holdem 4d6hKhQdTh 9h8c3dTc AcAh7d5d 9sTd5s4s 7h4c3s3c"));
  }

  @Test
  public void test_omaha_holdem_6183_4c4h8sJsQc_KhQdTs5h_Ac3sAdJd_9s2c7d4s_2d8h2sKd_3d9c6d6s_Ks9d4d8d_7h5dKc6h_AsQhTh8c() {
    assertEquals(
      "7h5dKc6h 3d9c6d6s 2d8h2sKd KhQdTs5h AsQhTh8c Ac3sAdJd 9s2c7d4s Ks9d4d8d",
      Solver.process("omaha-holdem 4c4h8sJsQc KhQdTs5h Ac3sAdJd 9s2c7d4s 2d8h2sKd 3d9c6d6s Ks9d4d8d 7h5dKc6h AsQhTh8c"));
  }

  @Test
  public void test_omaha_holdem_6184_6h7h9cAdJs_4c2c8hKd_8c8sJdKh_ThTc9hAs_Ac9sKc2s_7sQs4s7c() {
    assertEquals(
      "4c2c8hKd 8c8sJdKh Ac9sKc2s=ThTc9hAs 7sQs4s7c",
      Solver.process("omaha-holdem 6h7h9cAdJs 4c2c8hKd 8c8sJdKh ThTc9hAs Ac9sKc2s 7sQs4s7c"));
  }

  @Test
  public void test_omaha_holdem_6185_3s4d7s9cKc_QdJd8d9h_6cTh5dAd_Tc8c5cKd_4hTs6d3h_4sQhJh8h() {
    assertEquals(
      "4sQhJh8h QdJd8d9h Tc8c5cKd 4hTs6d3h 6cTh5dAd",
      Solver.process("omaha-holdem 3s4d7s9cKc QdJd8d9h 6cTh5dAd Tc8c5cKd 4hTs6d3h 4sQhJh8h"));
  }

  @Test
  public void test_omaha_holdem_6186_2s6s7c8sKh_TdKcTsAs_3h5c3s9s_5d8d6hTh_Ad4dQd9d_8c4s7d6c_5s9c4hQs() {
    assertEquals(
      "Ad4dQd9d 5d8d6hTh 8c4s7d6c 3h5c3s9s 5s9c4hQs TdKcTsAs",
      Solver.process("omaha-holdem 2s6s7c8sKh TdKcTsAs 3h5c3s9s 5d8d6hTh Ad4dQd9d 8c4s7d6c 5s9c4hQs"));
  }

  @Test
  public void test_omaha_holdem_6187_3s6d6sJcJs_4d3c5dAc_Jd5c2s3d_5hJh4sKc_3h8s4h5s_2dTh9dAd_2hKd8c7s() {
    assertEquals(
      "2hKd8c7s 2dTh9dAd 4d3c5dAc 5hJh4sKc 3h8s4h5s Jd5c2s3d",
      Solver.process("omaha-holdem 3s6d6sJcJs 4d3c5dAc Jd5c2s3d 5hJh4sKc 3h8s4h5s 2dTh9dAd 2hKd8c7s"));
  }

  @Test
  public void test_omaha_holdem_6188_2c2dAdQcTd_Kc3s9h3d_6s5s6h7d_Kh4c4hQh_Jd6c5c5h_9dQs3hJh_ThAh7s7h_4dJs8s7c_2sAcJc2h() {
    assertEquals(
      "4dJs8s7c Kc3s9h3d Jd6c5c5h 6s5s6h7d 9dQs3hJh Kh4c4hQh ThAh7s7h 2sAcJc2h",
      Solver.process("omaha-holdem 2c2dAdQcTd Kc3s9h3d 6s5s6h7d Kh4c4hQh Jd6c5c5h 9dQs3hJh ThAh7s7h 4dJs8s7c 2sAcJc2h"));
  }

  @Test
  public void test_omaha_holdem_6189_7d8hJcJsQh_5c2hAh8s_Td4h9hKc_6hQs5d7c_4c3s6c3d() {
    assertEquals(
      "4c3s6c3d 5c2hAh8s 6hQs5d7c Td4h9hKc",
      Solver.process("omaha-holdem 7d8hJcJsQh 5c2hAh8s Td4h9hKc 6hQs5d7c 4c3s6c3d"));
  }

  @Test
  public void test_omaha_holdem_6190_5hAdAhQsTd_QdKd4h3h_8d5d8c6c_Ac7d6h3d_3s3c7h4c_6dAsKhTs_9h2sJdJc() {
    assertEquals(
      "3s3c7h4c 8d5d8c6c 9h2sJdJc QdKd4h3h Ac7d6h3d 6dAsKhTs",
      Solver.process("omaha-holdem 5hAdAhQsTd QdKd4h3h 8d5d8c6c Ac7d6h3d 3s3c7h4c 6dAsKhTs 9h2sJdJc"));
  }

  @Test
  public void test_omaha_holdem_6191_2h4d5h7dTd_5d9d8sJd_7sTh9sKc_7hAh2s8d_9cKsQh8h_6sAd5s4s_8c3c4h3h() {
    assertEquals(
      "9cKsQh8h 8c3c4h3h 6sAd5s4s 7hAh2s8d 7sTh9sKc 5d9d8sJd",
      Solver.process("omaha-holdem 2h4d5h7dTd 5d9d8sJd 7sTh9sKc 7hAh2s8d 9cKsQh8h 6sAd5s4s 8c3c4h3h"));
  }

  @Test
  public void test_omaha_holdem_6192_4s7dAdAsTc_6hQdTsTd_5dJc5c4c_5h2sQs3c_9d6sAh7s_Qh2d8sKd_8c2h3dJd_Ks9hKhJs() {
    assertEquals(
      "8c2h3dJd 5h2sQs3c Qh2d8sKd 5dJc5c4c Ks9hKhJs 6hQdTsTd 9d6sAh7s",
      Solver.process("omaha-holdem 4s7dAdAsTc 6hQdTsTd 5dJc5c4c 5h2sQs3c 9d6sAh7s Qh2d8sKd 8c2h3dJd Ks9hKhJs"));
  }

  @Test
  public void test_omaha_holdem_6193_5c8dAcJcTs_Jd2c7c2s_AhTd5s6s_4hKd9s3s_Js5hKhAd_Tc3cQc2d_Qs6c7s3d_2hKsAs6d_7d8h4d3h() {
    assertEquals(
      "Qs6c7s3d 4hKd9s3s 7d8h4d3h 2hKsAs6d AhTd5s6s Js5hKhAd Jd2c7c2s Tc3cQc2d",
      Solver.process("omaha-holdem 5c8dAcJcTs Jd2c7c2s AhTd5s6s 4hKd9s3s Js5hKhAd Tc3cQc2d Qs6c7s3d 2hKsAs6d 7d8h4d3h"));
  }

  @Test
  public void test_omaha_holdem_6194_3dAcJdKdKh_4d9c7dAh_Td3hTc9d_4c4hKcQd_Ad6c5c2d_QsJs3c8s_Qh6s4sKs() {
    assertEquals(
      "QsJs3c8s 4c4hKcQd=Qh6s4sKs 4d9c7dAh Td3hTc9d Ad6c5c2d",
      Solver.process("omaha-holdem 3dAcJdKdKh 4d9c7dAh Td3hTc9d 4c4hKcQd Ad6c5c2d QsJs3c8s Qh6s4sKs"));
  }

  @Test
  public void test_omaha_holdem_6195_2c6h7s9sAc_5hTs8s6d_7d3cQs4s_KsJcAsAh_KcJsAd3d_Qc4cTh2d_2h6s5c4d_Kh3hTd8c_3s2s4hTc_5dQhKd8h() {
    assertEquals(
      "3s2s4hTc Qc4cTh2d 7d3cQs4s KcJsAd3d 2h6s5c4d KsJcAsAh 5dQhKd8h 5hTs8s6d=Kh3hTd8c",
      Solver.process("omaha-holdem 2c6h7s9sAc 5hTs8s6d 7d3cQs4s KsJcAsAh KcJsAd3d Qc4cTh2d 2h6s5c4d Kh3hTd8c 3s2s4hTc 5dQhKd8h"));
  }

  @Test
  public void test_omaha_holdem_6196_2c8cAhKdQc_5s7d3h3c_4cAcTs2h_Qs6h7cAs_8sKhTdQh_Qd9hTcKc() {
    assertEquals(
      "5s7d3h3c 8sKhTdQh Qs6h7cAs Qd9hTcKc 4cAcTs2h",
      Solver.process("omaha-holdem 2c8cAhKdQc 5s7d3h3c 4cAcTs2h Qs6h7cAs 8sKhTdQh Qd9hTcKc"));
  }

  @Test
  public void test_omaha_holdem_6197_2c4s6cJdKd_7s4c2sTh_Ad3cAs5c_QsTs7hTc_8dQd8hAc_Jc6d9c2d_4h9dTd8c() {
    assertEquals(
      "4h9dTd8c 8dQd8hAc QsTs7hTc 7s4c2sTh Jc6d9c2d Ad3cAs5c",
      Solver.process("omaha-holdem 2c4s6cJdKd 7s4c2sTh Ad3cAs5c QsTs7hTc 8dQd8hAc Jc6d9c2d 4h9dTd8c"));
  }

  @Test
  public void test_omaha_holdem_6198_2h2s5d7sQh_5h4d9hQd_TdKd4s7d_As2d5s3s_9s2cQs6c() {
    assertEquals(
      "TdKd4s7d 5h4d9hQd As2d5s3s 9s2cQs6c",
      Solver.process("omaha-holdem 2h2s5d7sQh 5h4d9hQd TdKd4s7d As2d5s3s 9s2cQs6c"));
  }

  @Test
  public void test_omaha_holdem_6199_2c3h5d8dQd_ThJc2s7s_6dJd4dJh_Qc9c6hAc_KdQs5cQh_8c3d4sAh_8s5sKc4h() {
    assertEquals(
      "ThJc2s7s Qc9c6hAc 8s5sKc4h KdQs5cQh 8c3d4sAh 6dJd4dJh",
      Solver.process("omaha-holdem 2c3h5d8dQd ThJc2s7s 6dJd4dJh Qc9c6hAc KdQs5cQh 8c3d4sAh 8s5sKc4h"));
  }

  @Test
  public void test_omaha_holdem_6200_2h6sJhKhTc_JdKdAs3h_4c3dKs6d_Ah6c8cTh_2c2dAc9h() {
    assertEquals(
      "4c3dKs6d JdKdAs3h 2c2dAc9h Ah6c8cTh",
      Solver.process("omaha-holdem 2h6sJhKhTc JdKdAs3h 4c3dKs6d Ah6c8cTh 2c2dAc9h"));
  }

  @Test
  public void test_omaha_holdem_6201_2d4d7c8cTc_Ac4c2c6d_JsTs9s3h_9hKh5c8s_6s3s9c3d_Qc9d5hAh_QhQdAsKs_JdTd2h7h_4sJh5d8h_7d8dAd5s() {
    assertEquals(
      "Qc9d5hAh 9hKh5c8s QhQdAsKs 4sJh5d8h 7d8dAd5s JdTd2h7h 6s3s9c3d JsTs9s3h Ac4c2c6d",
      Solver.process("omaha-holdem 2d4d7c8cTc Ac4c2c6d JsTs9s3h 9hKh5c8s 6s3s9c3d Qc9d5hAh QhQdAsKs JdTd2h7h 4sJh5d8h 7d8dAd5s"));
  }

  @Test
  public void test_omaha_holdem_6202_7c9cJdQcTs_Th8h5s4s_3dKh3cTc_QdQh2dQs_3s7hTd2s_Js6cAh5c() {
    assertEquals(
      "3s7hTd2s QdQh2dQs Th8h5s4s Js6cAh5c 3dKh3cTc",
      Solver.process("omaha-holdem 7c9cJdQcTs Th8h5s4s 3dKh3cTc QdQh2dQs 3s7hTd2s Js6cAh5c"));
  }

  @Test
  public void test_omaha_holdem_6203_6c7s8cAcAs_8d5hJh8h_9c7c4hTd() {
    assertEquals(
      "9c7c4hTd 8d5hJh8h",
      Solver.process("omaha-holdem 6c7s8cAcAs 8d5hJh8h 9c7c4hTd"));
  }

  @Test
  public void test_omaha_holdem_6204_3c9c9sQhTc_Jc2cAh5s_8s4hQcJd_3d3hAd4s_2s6hKdTs_7hKc5h4d_5d8d6dKs() {
    assertEquals(
      "7hKc5h4d 5d8d6dKs 2s6hKdTs 8s4hQcJd Jc2cAh5s 3d3hAd4s",
      Solver.process("omaha-holdem 3c9c9sQhTc Jc2cAh5s 8s4hQcJd 3d3hAd4s 2s6hKdTs 7hKc5h4d 5d8d6dKs"));
  }

  @Test
  public void test_omaha_holdem_6205_3c4cKcThTs_6sQsAc2c_4h8c7dJc() {
    assertEquals(
      "4h8c7dJc 6sQsAc2c",
      Solver.process("omaha-holdem 3c4cKcThTs 6sQsAc2c 4h8c7dJc"));
  }

  @Test
  public void test_omaha_holdem_6206_7c9dKhQhTc_6c2c5h8s_Ks2h2dJd_Js2s3s9s() {
    assertEquals(
      "6c2c5h8s Js2s3s9s=Ks2h2dJd",
      Solver.process("omaha-holdem 7c9dKhQhTc 6c2c5h8s Ks2h2dJd Js2s3s9s"));
  }

  @Test
  public void test_omaha_holdem_6207_2h2s5c8cJc_JhQhKcQs_2c5sQcJs_5d7s6dAc_Tc9sKh9c_6sJdTs3d_8h9h9d4s_3c3sTdTh_Ad4h5h4d_4cAsQd6c() {
    assertEquals(
      "5d7s6dAc=Ad4h5h4d 8h9h9d4s 3c3sTdTh 6sJdTs3d JhQhKcQs 4cAsQd6c Tc9sKh9c 2c5sQcJs",
      Solver.process("omaha-holdem 2h2s5c8cJc JhQhKcQs 2c5sQcJs 5d7s6dAc Tc9sKh9c 6sJdTs3d 8h9h9d4s 3c3sTdTh Ad4h5h4d 4cAsQd6c"));
  }

  @Test
  public void test_omaha_holdem_6208_4d6h6sAsKh_Jc8dAc7d_Js4s3d9c_7cAh7h9d_Qd5h5dKc_2dKd2c2s_8s7s5c6c_2h9hQsQh() {
    assertEquals(
      "Js4s3d9c 2h9hQsQh 2dKd2c2s Qd5h5dKc 7cAh7h9d Jc8dAc7d 8s7s5c6c",
      Solver.process("omaha-holdem 4d6h6sAsKh Jc8dAc7d Js4s3d9c 7cAh7h9d Qd5h5dKc 2dKd2c2s 8s7s5c6c 2h9hQsQh"));
  }

  @Test
  public void test_omaha_holdem_6209_4s6hKhKsTs_9d2h9cJd_2s7s3dJh_8c2d7c4d() {
    assertEquals(
      "8c2d7c4d 9d2h9cJd 2s7s3dJh",
      Solver.process("omaha-holdem 4s6hKhKsTs 9d2h9cJd 2s7s3dJh 8c2d7c4d"));
  }

  @Test
  public void test_omaha_holdem_6210_2c4c4sAhJs_9cTc5s4h_9dAs7dQh_8c2dAcKd() {
    assertEquals(
      "9dAs7dQh 8c2dAcKd 9cTc5s4h",
      Solver.process("omaha-holdem 2c4c4sAhJs 9cTc5s4h 9dAs7dQh 8c2dAcKd"));
  }

  @Test
  public void test_omaha_holdem_6211_7d9c9dAcJc_Kc8hAd6s_6c8sTsTd_ThTc2dAs_9h7h2h4h_Jd7s2cKh_8c5c5h6d_3h3s4dKd_Js9s6h2s_4sQs8dQd() {
    assertEquals(
      "3h3s4dKd Jd7s2cKh 4sQs8dQd ThTc2dAs Kc8hAd6s 6c8sTsTd 8c5c5h6d 9h7h2h4h Js9s6h2s",
      Solver.process("omaha-holdem 7d9c9dAcJc Kc8hAd6s 6c8sTsTd ThTc2dAs 9h7h2h4h Jd7s2cKh 8c5c5h6d 3h3s4dKd Js9s6h2s 4sQs8dQd"));
  }

  @Test
  public void test_omaha_holdem_6212_3d7s8d9dKh_Ac9s3h2d_4hQh7d5h_Ks4sQd2c_4c8h4dKd_Kc6d7h5s_8c8s7c2h_Td6h5d6s() {
    assertEquals(
      "4hQh7d5h Ks4sQd2c Ac9s3h2d 8c8s7c2h Kc6d7h5s Td6h5d6s 4c8h4dKd",
      Solver.process("omaha-holdem 3d7s8d9dKh Ac9s3h2d 4hQh7d5h Ks4sQd2c 4c8h4dKd Kc6d7h5s 8c8s7c2h Td6h5d6s"));
  }

  @Test
  public void test_omaha_holdem_6213_2c5cAsJcQc_Qh8s2h4c_Qs9cAhTh_Ts3d5hKh_9h6d8dKs_Kc6h2sAc_Kd4s8c3c_2dAd7c6c_5s8hTc6s() {
    assertEquals(
      "9h6d8dKs 5s8hTc6s Qh8s2h4c Qs9cAhTh Ts3d5hKh 2dAd7c6c Kd4s8c3c Kc6h2sAc",
      Solver.process("omaha-holdem 2c5cAsJcQc Qh8s2h4c Qs9cAhTh Ts3d5hKh 9h6d8dKs Kc6h2sAc Kd4s8c3c 2dAd7c6c 5s8hTc6s"));
  }

  @Test
  public void test_omaha_holdem_6214_2h5d8c8sQs_4hQd3s7c_3d8hAh4d_Ts6c6dTh_JsQcAd5h_9d4cTdKh_7d3h3c2s_5s8d6hJc_5cAs7sKc_Ks2cTcJh() {
    assertEquals(
      "9d4cTdKh Ks2cTcJh 7d3h3c2s 5cAs7sKc Ts6c6dTh 4hQd3s7c JsQcAd5h 3d8hAh4d 5s8d6hJc",
      Solver.process("omaha-holdem 2h5d8c8sQs 4hQd3s7c 3d8hAh4d Ts6c6dTh JsQcAd5h 9d4cTdKh 7d3h3c2s 5s8d6hJc 5cAs7sKc Ks2cTcJh"));
  }

  @Test
  public void test_omaha_holdem_6215_3s4c6sJhKs_5d8hJd9h_7d4hTd5c_JsKh5s7h() {
    assertEquals(
      "5d8hJd9h 7d4hTd5c JsKh5s7h",
      Solver.process("omaha-holdem 3s4c6sJhKs 5d8hJd9h 7d4hTd5c JsKh5s7h"));
  }

  @Test
  public void test_omaha_holdem_6216_4d5c6hJcKs_ThAdQc5d_3c7c3s9s_AcKh2sQs_JhKc9d7s_8sJs7d2h() {
    assertEquals(
      "ThAdQc5d AcKh2sQs JhKc9d7s 3c7c3s9s 8sJs7d2h",
      Solver.process("omaha-holdem 4d5c6hJcKs ThAdQc5d 3c7c3s9s AcKh2sQs JhKc9d7s 8sJs7d2h"));
  }

  @Test
  public void test_omaha_holdem_6217_2h5h5s9sKh_6dKd4cAs_9d7hQcJc_Js8dTs8s_Ac9c5c2d_8hJh7dQd_3c2s3sTc_Qh3d7cAd_Kc6c8c6s() {
    assertEquals(
      "Qh3d7cAd 3c2s3sTc Js8dTs8s 9d7hQcJc Kc6c8c6s 6dKd4cAs 8hJh7dQd Ac9c5c2d",
      Solver.process("omaha-holdem 2h5h5s9sKh 6dKd4cAs 9d7hQcJc Js8dTs8s Ac9c5c2d 8hJh7dQd 3c2s3sTc Qh3d7cAd Kc6c8c6s"));
  }

  @Test
  public void test_omaha_holdem_6218_6h8dJhKhQc_7h5cTs5h_6c9s8c2s_2h8h2d3s_3h6s3cQh_TdQdTh7c_3d9cAhKc_4dAcAdKs_4s5d7dJc_Kd7sTcQs() {
    assertEquals(
      "4s5d7dJc TdQdTh7c 3d9cAhKc 4dAcAdKs 6c9s8c2s Kd7sTcQs 7h5cTs5h 2h8h2d3s 3h6s3cQh",
      Solver.process("omaha-holdem 6h8dJhKhQc 7h5cTs5h 6c9s8c2s 2h8h2d3s 3h6s3cQh TdQdTh7c 3d9cAhKc 4dAcAdKs 4s5d7dJc Kd7sTcQs"));
  }

  @Test
  public void test_omaha_holdem_6219_5hJhKdTcTd_Qc6hJd7c_5s5cAd3h_7sQs8d8c_2s6s8h7h_9d4c4hQh_2c5dAs9h() {
    assertEquals(
      "2s6s8h7h 2c5dAs9h 7sQs8d8c Qc6hJd7c 9d4c4hQh 5s5cAd3h",
      Solver.process("omaha-holdem 5hJhKdTcTd Qc6hJd7c 5s5cAd3h 7sQs8d8c 2s6s8h7h 9d4c4hQh 2c5dAs9h"));
  }

  @Test
  public void test_omaha_holdem_6220_2s4d5dJdTh_7cAd2cQh_6sKs6h9d_AsAc5h8d_3sQcJc4h() {
    assertEquals(
      "7cAd2cQh 6sKs6h9d AsAc5h8d 3sQcJc4h",
      Solver.process("omaha-holdem 2s4d5dJdTh 7cAd2cQh 6sKs6h9d AsAc5h8d 3sQcJc4h"));
  }

  @Test
  public void test_omaha_holdem_6221_3h4d5c9sAs_8s6c8c3d_4s7hAhQd_JhTs7sKd_6hAdJs6s_8d7c5d9d_TdQc2d8h_2hTc6d3c() {
    assertEquals(
      "TdQc2d8h JhTs7sKd 8s6c8c3d 6hAdJs6s 8d7c5d9d 4s7hAhQd 2hTc6d3c",
      Solver.process("omaha-holdem 3h4d5c9sAs 8s6c8c3d 4s7hAhQd JhTs7sKd 6hAdJs6s 8d7c5d9d TdQc2d8h 2hTc6d3c"));
  }

  @Test
  public void test_omaha_holdem_6222_2c6hKdKsTd_5cTh6d3s_8dJs3h7h_Qd2hAd4c_6cKhQsTc_5s8cKcJd_As8hJcQh_4d9cQc9s() {
    assertEquals(
      "8dJs3h7h As8hJcQh Qd2hAd4c 4d9cQc9s 5cTh6d3s 5s8cKcJd 6cKhQsTc",
      Solver.process("omaha-holdem 2c6hKdKsTd 5cTh6d3s 8dJs3h7h Qd2hAd4c 6cKhQsTc 5s8cKcJd As8hJcQh 4d9cQc9s"));
  }

  @Test
  public void test_omaha_holdem_6223_2c3s7hQdTc_6c3cJcTh_Td9hAdQs() {
    assertEquals(
      "6c3cJcTh Td9hAdQs",
      Solver.process("omaha-holdem 2c3s7hQdTc 6c3cJcTh Td9hAdQs"));
  }

  @Test
  public void test_omaha_holdem_6224_2c5h8dJhQd_Th3dQs4h_6cTcKdKs_3hAdAh6s_Td5dQc7s_8c8s7cJd_6hJs5c9s_4s7d2sAc_9hTs3c4d_8h7hJcAs() {
    assertEquals(
      "4s7d2sAc Th3dQs4h 6cTcKdKs 3hAdAh6s 6hJs5c9s 8h7hJcAs Td5dQc7s 8c8s7cJd 9hTs3c4d",
      Solver.process("omaha-holdem 2c5h8dJhQd Th3dQs4h 6cTcKdKs 3hAdAh6s Td5dQc7s 8c8s7cJd 6hJs5c9s 4s7d2sAc 9hTs3c4d 8h7hJcAs"));
  }

  @Test
  public void test_omaha_holdem_6225_8h8s9c9sAs_3s5dTsQs_JhAc7s6s_3c3h2d7h_2c7dThKd_4dTd5hKh_TcJd6c3d() {
    assertEquals(
      "TcJd6c3d 2c7dThKd=4dTd5hKh 3c3h2d7h JhAc7s6s 3s5dTsQs",
      Solver.process("omaha-holdem 8h8s9c9sAs 3s5dTsQs JhAc7s6s 3c3h2d7h 2c7dThKd 4dTd5hKh TcJd6c3d"));
  }

  @Test
  public void test_omaha_holdem_6226_3c4h6c8s9s_AcAhKsQc_2h8hKd5c_3s4c7sQh_Tc9d8d7c_3h6hAs6s_2dTsQsKc_Jh4sTh9h_Td7h7dJs_Qd5sKhJd() {
    assertEquals(
      "2dTsQsKc=Qd5sKhJd AcAhKsQc 3s4c7sQh Jh4sTh9h 3h6hAs6s 2h8hKd5c Tc9d8d7c=Td7h7dJs",
      Solver.process("omaha-holdem 3c4h6c8s9s AcAhKsQc 2h8hKd5c 3s4c7sQh Tc9d8d7c 3h6hAs6s 2dTsQsKc Jh4sTh9h Td7h7dJs Qd5sKhJd"));
  }

  @Test
  public void test_omaha_holdem_6227_AdAhAsKcTh_3d7hKd4h_9dQh6cJs_TsJc5cTc_Td6d5hKs_6s8c4dQd_Qs9h4c3s() {
    assertEquals(
      "6s8c4dQd Qs9h4c3s 3d7hKd4h Td6d5hKs 9dQh6cJs TsJc5cTc",
      Solver.process("omaha-holdem AdAhAsKcTh 3d7hKd4h 9dQh6cJs TsJc5cTc Td6d5hKs 6s8c4dQd Qs9h4c3s"));
  }

  @Test
  public void test_omaha_holdem_6228_2s4h6h8cQs_Qc4d7cAc_JhTs7dKc_KsAh2c3h_Js8sQhAs_TdJd9d6c_6d9h6s4s_8h5s3d7h_5d9s2h7s_Qd5hAd3s() {
    assertEquals(
      "JhTs7dKc KsAh2c3h TdJd9d6c Qc4d7cAc Js8sQhAs 6d9h6s4s Qd5hAd3s 5d9s2h7s=8h5s3d7h",
      Solver.process("omaha-holdem 2s4h6h8cQs Qc4d7cAc JhTs7dKc KsAh2c3h Js8sQhAs TdJd9d6c 6d9h6s4s 8h5s3d7h 5d9s2h7s Qd5hAd3s"));
  }

  @Test
  public void test_omaha_holdem_6229_2c6c7cJcQs_Jh3dKhTd_Qh5h9sTc_Kd3c6d4c_4hQc3hJs_8hQd2sTh_9cAd2d8c_Ts7d5c3s() {
    assertEquals(
      "Ts7d5c3s Jh3dKhTd Qh5h9sTc 8hQd2sTh 4hQc3hJs Kd3c6d4c 9cAd2d8c",
      Solver.process("omaha-holdem 2c6c7cJcQs Jh3dKhTd Qh5h9sTc Kd3c6d4c 4hQc3hJs 8hQd2sTh 9cAd2d8c Ts7d5c3s"));
  }

  @Test
  public void test_omaha_holdem_6230_2s3sAhAsJd_8h8d4s3d_Kh9sTdJc_Ac6c6h2h_Ts9d9h4h_Jh8c5dKs() {
    assertEquals(
      "8h8d4s3d Ts9d9h4h Jh8c5dKs=Kh9sTdJc Ac6c6h2h",
      Solver.process("omaha-holdem 2s3sAhAsJd 8h8d4s3d Kh9sTdJc Ac6c6h2h Ts9d9h4h Jh8c5dKs"));
  }

  @Test
  public void test_omaha_holdem_6231_2h7c7hJdKs_Th8d5c6c_7d4c6s2d_3cJhKd8c_Ad3h6h5s_Jc8h8s9h_4hAcAs4s() {
    assertEquals(
      "Th8d5c6c Ad3h6h5s Jc8h8s9h 3cJhKd8c 4hAcAs4s 7d4c6s2d",
      Solver.process("omaha-holdem 2h7c7hJdKs Th8d5c6c 7d4c6s2d 3cJhKd8c Ad3h6h5s Jc8h8s9h 4hAcAs4s"));
  }

  @Test
  public void test_omaha_holdem_6232_2d2s3h8dTc_2c7sAh4c_6h5c6d5d_AcJs7c5h_JcJh9c7h_Kd2h6s8c_Qd4h6c9h_9d8s9sQc_Th4sQhJd() {
    assertEquals(
      "Qd4h6c9h AcJs7c5h 6h5c6d5d 9d8s9sQc Th4sQhJd JcJh9c7h 2c7sAh4c Kd2h6s8c",
      Solver.process("omaha-holdem 2d2s3h8dTc 2c7sAh4c 6h5c6d5d AcJs7c5h JcJh9c7h Kd2h6s8c Qd4h6c9h 9d8s9sQc Th4sQhJd"));
  }

  @Test
  public void test_omaha_holdem_6233_3h7c8dJhTs_5h6c2hAd_4d4sJd6d_4hQh5s8c_Jc3c2c6s_9hKh3d5d_9d5c9sKd_6h7s7h2s() {
    assertEquals(
      "5h6c2hAd 9hKh3d5d 4hQh5s8c 9d5c9sKd 4d4sJd6d Jc3c2c6s 6h7s7h2s",
      Solver.process("omaha-holdem 3h7c8dJhTs 5h6c2hAd 4d4sJd6d 4hQh5s8c Jc3c2c6s 9hKh3d5d 9d5c9sKd 6h7s7h2s"));
  }

  @Test
  public void test_omaha_holdem_6234_4d6d8c8sQc_TsTc2hKs_Ah3dTh9s_5h5sKh3s_JhQh7s6c_9d3h2s9h() {
    assertEquals(
      "Ah3dTh9s 5h5sKh3s 9d3h2s9h TsTc2hKs JhQh7s6c",
      Solver.process("omaha-holdem 4d6d8c8sQc TsTc2hKs Ah3dTh9s 5h5sKh3s JhQh7s6c 9d3h2s9h"));
  }

  @Test
  public void test_omaha_holdem_6235_4s9sAcAdTc_9h8d3sJs_9cKh4h6d() {
    assertEquals(
      "9h8d3sJs 9cKh4h6d",
      Solver.process("omaha-holdem 4s9sAcAdTc 9h8d3sJs 9cKh4h6d"));
  }

  @Test
  public void test_omaha_holdem_6236_5s6dAhJsTc_Jh4d4c3d_9sTh2s3s_Td7s5dQd_4s7cAd8h_5cKhQc9c_7d5hQhAs_8d8c7h9h_Jd4h6h2h() {
    assertEquals(
      "8d8c7h9h 9sTh2s3s Jh4d4c3d 4s7cAd8h Td7s5dQd Jd4h6h2h 7d5hQhAs 5cKhQc9c",
      Solver.process("omaha-holdem 5s6dAhJsTc Jh4d4c3d 9sTh2s3s Td7s5dQd 4s7cAd8h 5cKhQc9c 7d5hQhAs 8d8c7h9h Jd4h6h2h"));
  }

  @Test
  public void test_omaha_holdem_6237_2h2sAhKhTc_7d9sKs3c_2d5h5s8h() {
    assertEquals(
      "7d9sKs3c 2d5h5s8h",
      Solver.process("omaha-holdem 2h2sAhKhTc 7d9sKs3c 2d5h5s8h"));
  }

  @Test
  public void test_omaha_holdem_6238_4c5sKdKhTs_7cJd7d8h_KcTdQc4s_4d4h3cAs_2dQs5d6s_2hAc6h8d_5h9cAh9h_Qh8c9s5c() {
    assertEquals(
      "2hAc6h8d 2dQs5d6s=Qh8c9s5c 7cJd7d8h 5h9cAh9h 4d4h3cAs KcTdQc4s",
      Solver.process("omaha-holdem 4c5sKdKhTs 7cJd7d8h KcTdQc4s 4d4h3cAs 2dQs5d6s 2hAc6h8d 5h9cAh9h Qh8c9s5c"));
  }

  @Test
  public void test_omaha_holdem_6239_5h6c9cAdJh_Tc8dTs4s_6hQc7hAs_2sTh9d6s() {
    assertEquals(
      "Tc8dTs4s 2sTh9d6s 6hQc7hAs",
      Solver.process("omaha-holdem 5h6c9cAdJh Tc8dTs4s 6hQc7hAs 2sTh9d6s"));
  }

  @Test
  public void test_omaha_holdem_6240_3h8sJcKsQc_QdKh6d2c_AsAc5h8h_Ts3s3dAd_2h8d7h4d_Jh7c7d3c() {
    assertEquals(
      "2h8d7h4d AsAc5h8h Jh7c7d3c QdKh6d2c Ts3s3dAd",
      Solver.process("omaha-holdem 3h8sJcKsQc QdKh6d2c AsAc5h8h Ts3s3dAd 2h8d7h4d Jh7c7d3c"));
  }

  @Test
  public void test_omaha_holdem_6241_3c7s8hKcTd_KsAd4s6s_7h9h8sKd_Qd3s4c2h_Qs3h4d5c_Jd8c4hTc() {
    assertEquals(
      "Qd3s4c2h=Qs3h4d5c KsAd4s6s Jd8c4hTc 7h9h8sKd",
      Solver.process("omaha-holdem 3c7s8hKcTd KsAd4s6s 7h9h8sKd Qd3s4c2h Qs3h4d5c Jd8c4hTc"));
  }

  @Test
  public void test_omaha_holdem_6242_3d4s5c6dTh_5d7hAhQh_TdKc9c2c_8c7s7cKd_4h9dJsAs_Jc9h2hKs_3h9sQs2d_6cQcQd6h() {
    assertEquals(
      "Jc9h2hKs 4h9dJsAs TdKc9c2c 6cQcQd6h 3h9sQs2d 5d7hAhQh 8c7s7cKd",
      Solver.process("omaha-holdem 3d4s5c6dTh 5d7hAhQh TdKc9c2c 8c7s7cKd 4h9dJsAs Jc9h2hKs 3h9sQs2d 6cQcQd6h"));
  }

  @Test
  public void test_omaha_holdem_6243_7sAhKcKsTh_Qc8h7h3h_2c5c3cKh_5d4h6cQh() {
    assertEquals(
      "5d4h6cQh Qc8h7h3h 2c5c3cKh",
      Solver.process("omaha-holdem 7sAhKcKsTh Qc8h7h3h 2c5c3cKh 5d4h6cQh"));
  }

  @Test
  public void test_omaha_holdem_6244_3c6h8sJsKh_Td9h7dQh_Qc8cKc2s_6cKsAsAc_5cJh5dTc_QdJd9c6d_Kd2h9sTh_Ad6s2d5h_3h7s9d8h() {
    assertEquals(
      "Td9h7dQh Ad6s2d5h 5cJh5dTc Kd2h9sTh 3h7s9d8h QdJd9c6d 6cKsAsAc Qc8cKc2s",
      Solver.process("omaha-holdem 3c6h8sJsKh Td9h7dQh Qc8cKc2s 6cKsAsAc 5cJh5dTc QdJd9c6d Kd2h9sTh Ad6s2d5h 3h7s9d8h"));
  }

  @Test
  public void test_omaha_holdem_6245_2h3sAdKcTh_2dQhKsQd_7d9hQsAs_9cKh6s8h_7h5hTcTs_Td6h9sAh_4s5s4h6d_JsJc2s4c_KdAc8d4d() {
    assertEquals(
      "JsJc2s4c 9cKh6s8h 7d9hQsAs 2dQhKsQd Td6h9sAh KdAc8d4d 7h5hTcTs 4s5s4h6d",
      Solver.process("omaha-holdem 2h3sAdKcTh 2dQhKsQd 7d9hQsAs 9cKh6s8h 7h5hTcTs Td6h9sAh 4s5s4h6d JsJc2s4c KdAc8d4d"));
  }

  @Test
  public void test_omaha_holdem_6246_3d6c6s7hQs_3sQcTs2s_7dKdJcJd_8d5d9h4s_KcAs9s3h_3cJh4dAh_6h9cKh7c_QdQh2c8h_4hTcJs9d_2d5s5h8c() {
    assertEquals(
      "4hTcJs9d 3cJh4dAh=KcAs9s3h 2d5s5h8c 7dKdJcJd 3sQcTs2s 8d5d9h4s 6h9cKh7c QdQh2c8h",
      Solver.process("omaha-holdem 3d6c6s7hQs 3sQcTs2s 7dKdJcJd 8d5d9h4s KcAs9s3h 3cJh4dAh 6h9cKh7c QdQh2c8h 4hTcJs9d 2d5s5h8c"));
  }

  @Test
  public void test_omaha_holdem_6247_5h6c9cAhJc_6d6s5d4c_Qd2hJsTs_3sTc3h9d_Jd8dKdJh_Qc4s5sQs() {
    assertEquals(
      "3sTc3h9d Qd2hJsTs Qc4s5sQs 6d6s5d4c Jd8dKdJh",
      Solver.process("omaha-holdem 5h6c9cAhJc 6d6s5d4c Qd2hJsTs 3sTc3h9d Jd8dKdJh Qc4s5sQs"));
  }

  @Test
  public void test_omaha_holdem_6248_5h8c8sAdTs_5sQs2s7c_4c9cTc3d_9d8d6s5d_9h4d2h8h() {
    assertEquals(
      "5sQs2s7c 4c9cTc3d 9h4d2h8h 9d8d6s5d",
      Solver.process("omaha-holdem 5h8c8sAdTs 5sQs2s7c 4c9cTc3d 9d8d6s5d 9h4d2h8h"));
  }

  @Test
  public void test_omaha_holdem_6249_3c5d6c6d6h_QhTdJd2d_4h4d7h8h_9dKhQdTs_8c3h2c5c_Jh9cJc5s_8dAd4sAh() {
    assertEquals(
      "8c3h2c5c QhTdJd2d 9dKhQdTs 4h4d7h8h Jh9cJc5s 8dAd4sAh",
      Solver.process("omaha-holdem 3c5d6c6d6h QhTdJd2d 4h4d7h8h 9dKhQdTs 8c3h2c5c Jh9cJc5s 8dAd4sAh"));
  }

}
