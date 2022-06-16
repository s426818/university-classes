
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OmahaHoldemSolver39HiddenTest {


  @Test
  public void test_omaha_holdem_9750_2d4h8dAcTh_6dAsQcQs_Js2s9hQd_7s3sKs2c_Kh4sKdJd_2h6hKc3h() {
    assertEquals(
      "Js2s9hQd 2h6hKc3h=7s3sKs2c Kh4sKdJd 6dAsQcQs",
      Solver.process("omaha-holdem 2d4h8dAcTh 6dAsQcQs Js2s9hQd 7s3sKs2c Kh4sKdJd 2h6hKc3h"));
  }

  @Test
  public void test_omaha_holdem_9751_2s3s6c7dKh_Kd5d6hJc_9h4s7c7h() {
    assertEquals(
      "Kd5d6hJc 9h4s7c7h",
      Solver.process("omaha-holdem 2s3s6c7dKh Kd5d6hJc 9h4s7c7h"));
  }

  @Test
  public void test_omaha_holdem_9752_4s5s8hJcJs_Kc7dJh5h_9dTd6s3d_8d7s2cTc_2d3c8s4h() {
    assertEquals(
      "9dTd6s3d 2d3c8s4h 8d7s2cTc Kc7dJh5h",
      Solver.process("omaha-holdem 4s5s8hJcJs Kc7dJh5h 9dTd6s3d 8d7s2cTc 2d3c8s4h"));
  }

  @Test
  public void test_omaha_holdem_9753_6s7cJdTcTh_2dAd9d8c_Jh8d5s4h_6h4s5hKc_5c3s9h2h_Qs2c4dQc_3dQhJc8s_6c9c9sKh_KdTdJs8h_KsAhTs5d() {
    assertEquals(
      "5c3s9h2h 6h4s5hKc 6c9c9sKh Jh8d5s4h 3dQhJc8s Qs2c4dQc KsAhTs5d 2dAd9d8c KdTdJs8h",
      Solver.process("omaha-holdem 6s7cJdTcTh 2dAd9d8c Jh8d5s4h 6h4s5hKc 5c3s9h2h Qs2c4dQc 3dQhJc8s 6c9c9sKh KdTdJs8h KsAhTs5d"));
  }

  @Test
  public void test_omaha_holdem_9754_2h5h7sKcTh_2d4s5sAd_3cKs2c8s() {
    assertEquals(
      "2d4s5sAd 3cKs2c8s",
      Solver.process("omaha-holdem 2h5h7sKcTh 2d4s5sAd 3cKs2c8s"));
  }

  @Test
  public void test_omaha_holdem_9755_8sJcKsQcQh_9d6d5d2s_Ts4s3sAh_6s3hKcAs_QsTd2c2h_5h8c8hTh_7cTc4c3d_Jd3c9s8d() {
    assertEquals(
      "9d6d5d2s 7cTc4c3d Jd3c9s8d 6s3hKcAs QsTd2c2h Ts4s3sAh 5h8c8hTh",
      Solver.process("omaha-holdem 8sJcKsQcQh 9d6d5d2s Ts4s3sAh 6s3hKcAs QsTd2c2h 5h8c8hTh 7cTc4c3d Jd3c9s8d"));
  }

  @Test
  public void test_omaha_holdem_9756_6c6s9cAhAs_2cJsKc8h_2d5hAdJh_JdJc8dKh_QdTd7sTc_4d7h2hQc_Ac9s5s9d_4s4cQsTh_8c2s9h3h_3d8s3s6d() {
    assertEquals(
      "4d7h2hQc 2cJsKc8h 4s4cQsTh 8c2s9h3h QdTd7sTc JdJc8dKh 3d8s3s6d 2d5hAdJh Ac9s5s9d",
      Solver.process("omaha-holdem 6c6s9cAhAs 2cJsKc8h 2d5hAdJh JdJc8dKh QdTd7sTc 4d7h2hQc Ac9s5s9d 4s4cQsTh 8c2s9h3h 3d8s3s6d"));
  }

  @Test
  public void test_omaha_holdem_9757_2s4s7hAsJc_Jd7sJs7c_KdTs2c8c_4c3s7dJh() {
    assertEquals(
      "KdTs2c8c 4c3s7dJh Jd7sJs7c",
      Solver.process("omaha-holdem 2s4s7hAsJc Jd7sJs7c KdTs2c8c 4c3s7dJh"));
  }

  @Test
  public void test_omaha_holdem_9758_3h4d6d8c9s_Jh2sQcKd_5h3sAd2h() {
    assertEquals(
      "Jh2sQcKd 5h3sAd2h",
      Solver.process("omaha-holdem 3h4d6d8c9s Jh2sQcKd 5h3sAd2h"));
  }

  @Test
  public void test_omaha_holdem_9759_2h6s7dJcQs_Js3dAhJh_7sTh8dAd_As8s8cKh_2dAcKcQc_5c4c3cQd_Jd7c6h5d() {
    assertEquals(
      "7sTh8dAd As8s8cKh 5c4c3cQd Jd7c6h5d 2dAcKcQc Js3dAhJh",
      Solver.process("omaha-holdem 2h6s7dJcQs Js3dAhJh 7sTh8dAd As8s8cKh 2dAcKcQc 5c4c3cQd Jd7c6h5d"));
  }

  @Test
  public void test_omaha_holdem_9760_2s3d3h8cAd_Tc8hJh2d_2h3cQh6s() {
    assertEquals(
      "Tc8hJh2d 2h3cQh6s",
      Solver.process("omaha-holdem 2s3d3h8cAd Tc8hJh2d 2h3cQh6s"));
  }

  @Test
  public void test_omaha_holdem_9761_2h4s6c8s9h_9s3sJh5c_4h4c5s9c_Tc6d5h2s_Kh9d8dTh_Ah6hJc3c_Ad4d7cJd_8h2dKc3h_6sAs5dQs_QcQh3dTs() {
    assertEquals(
      "Ad4d7cJd 6sAs5dQs=Ah6hJc3c QcQh3dTs Tc6d5h2s 8h2dKc3h Kh9d8dTh 4h4c5s9c 9s3sJh5c",
      Solver.process("omaha-holdem 2h4s6c8s9h 9s3sJh5c 4h4c5s9c Tc6d5h2s Kh9d8dTh Ah6hJc3c Ad4d7cJd 8h2dKc3h 6sAs5dQs QcQh3dTs"));
  }

  @Test
  public void test_omaha_holdem_9762_2c7sJhThTs_9d8cAs3s_4cQc6hAc_8sTd9sJd_2sQs7c3c() {
    assertEquals(
      "4cQc6hAc 2sQs7c3c 9d8cAs3s 8sTd9sJd",
      Solver.process("omaha-holdem 2c7sJhThTs 9d8cAs3s 4cQc6hAc 8sTd9sJd 2sQs7c3c"));
  }

  @Test
  public void test_omaha_holdem_9763_3s4c7d7sAc_2dAh4d5c_Jd3h7h8s_Qh5s9h2c_6dKs4h8c_Th9c3d6c_8dQdQsQc_KdAd5d8h() {
    assertEquals(
      "Th9c3d6c 6dKs4h8c 8dQdQsQc KdAd5d8h 2dAh4d5c=Qh5s9h2c Jd3h7h8s",
      Solver.process("omaha-holdem 3s4c7d7sAc 2dAh4d5c Jd3h7h8s Qh5s9h2c 6dKs4h8c Th9c3d6c 8dQdQsQc KdAd5d8h"));
  }

  @Test
  public void test_omaha_holdem_9764_2s4d9dAhKc_7s2c9s8c_Qd4s7h9c_TdAs5c4h_TsKsJdJh() {
    assertEquals(
      "TsKsJdJh 7s2c9s8c Qd4s7h9c TdAs5c4h",
      Solver.process("omaha-holdem 2s4d9dAhKc 7s2c9s8c Qd4s7h9c TdAs5c4h TsKsJdJh"));
  }

  @Test
  public void test_omaha_holdem_9765_5d6h9dAcTs_JhAhAdKs_2dKc9h4d() {
    assertEquals(
      "2dKc9h4d JhAhAdKs",
      Solver.process("omaha-holdem 5d6h9dAcTs JhAhAdKs 2dKc9h4d"));
  }

  @Test
  public void test_omaha_holdem_9766_2c4c4hAsQs_6dTh9d3s_3c5s6sJh_Jd8cTdKh_5c8sKdQc() {
    assertEquals(
      "6dTh9d3s Jd8cTdKh 5c8sKdQc 3c5s6sJh",
      Solver.process("omaha-holdem 2c4c4hAsQs 6dTh9d3s 3c5s6sJh Jd8cTdKh 5c8sKdQc"));
  }

  @Test
  public void test_omaha_holdem_9767_2d6d7cJcTc_5s2h3dTd_4d6s4h4s_8h9sQc5d_8dKs3h6h() {
    assertEquals(
      "4d6s4h4s 8dKs3h6h 5s2h3dTd 8h9sQc5d",
      Solver.process("omaha-holdem 2d6d7cJcTc 5s2h3dTd 4d6s4h4s 8h9sQc5d 8dKs3h6h"));
  }

  @Test
  public void test_omaha_holdem_9768_2d2h8dAcAs_6cThKdTd_8hQh3cQs() {
    assertEquals(
      "6cThKdTd 8hQh3cQs",
      Solver.process("omaha-holdem 2d2h8dAcAs 6cThKdTd 8hQh3cQs"));
  }

  @Test
  public void test_omaha_holdem_9769_3d6c8hJcJh_6h5sKs9d_8s9hQs9s_Ts4c4d2h_Td7hAh4h_2cAc7c7d_KhKdKc8c() {
    assertEquals(
      "Td7hAh4h Ts4c4d2h 6h5sKs9d 2cAc7c7d 8s9hQs9s KhKdKc8c",
      Solver.process("omaha-holdem 3d6c8hJcJh 6h5sKs9d 8s9hQs9s Ts4c4d2h Td7hAh4h 2cAc7c7d KhKdKc8c"));
  }

  @Test
  public void test_omaha_holdem_9770_9sAdAsJcKs_Qs9h5h8s_4h4sThJh_Jd6hQd3c() {
    assertEquals(
      "4h4sThJh Jd6hQd3c Qs9h5h8s",
      Solver.process("omaha-holdem 9sAdAsJcKs Qs9h5h8s 4h4sThJh Jd6hQd3c"));
  }

  @Test
  public void test_omaha_holdem_9771_2s4d7cQcTd_KsKcJd4h_3dQh6h2c_QdTc9d3s_8cQs5s9h_Ad8h2hKh_3h7dAcJs_4sJh7sTs_6s4c2d8d() {
    assertEquals(
      "Ad8h2hKh 3h7dAcJs 8cQs5s9h KsKcJd4h 6s4c2d8d 4sJh7sTs 3dQh6h2c QdTc9d3s",
      Solver.process("omaha-holdem 2s4d7cQcTd KsKcJd4h 3dQh6h2c QdTc9d3s 8cQs5s9h Ad8h2hKh 3h7dAcJs 4sJh7sTs 6s4c2d8d"));
  }

  @Test
  public void test_omaha_holdem_9772_3h4h5d7hJc_QhAd2s5h_7sAh5c4s() {
    assertEquals(
      "7sAh5c4s QhAd2s5h",
      Solver.process("omaha-holdem 3h4h5d7hJc QhAd2s5h 7sAh5c4s"));
  }

  @Test
  public void test_omaha_holdem_9773_2c2s5sQcTd_4h5hJh6h_3sThJcAd_6cKd5c7s_3h4d8h3c_Ah6s5d7h_TcTs9cQh() {
    assertEquals(
      "3h4d8h3c 4h5hJh6h 6cKd5c7s Ah6s5d7h 3sThJcAd TcTs9cQh",
      Solver.process("omaha-holdem 2c2s5sQcTd 4h5hJh6h 3sThJcAd 6cKd5c7s 3h4d8h3c Ah6s5d7h TcTs9cQh"));
  }

  @Test
  public void test_omaha_holdem_9774_5d5hKcQhTc_Ad8s2c9c_8h3sAcQc_4s4dJhJd() {
    assertEquals(
      "Ad8s2c9c 4s4dJhJd 8h3sAcQc",
      Solver.process("omaha-holdem 5d5hKcQhTc Ad8s2c9c 8h3sAcQc 4s4dJhJd"));
  }

  @Test
  public void test_omaha_holdem_9775_2h3h7h8sQs_4cJc4s2c_6dAd4d4h_QhJdJhAc_9sKs5c6h_Ah9h7d7s_As8dKd9d() {
    assertEquals(
      "9sKs5c6h 4cJc4s2c=6dAd4d4h As8dKd9d QhJdJhAc Ah9h7d7s",
      Solver.process("omaha-holdem 2h3h7h8sQs 4cJc4s2c 6dAd4d4h QhJdJhAc 9sKs5c6h Ah9h7d7s As8dKd9d"));
  }

  @Test
  public void test_omaha_holdem_9776_5s7d8c9sJh_3dQh2c4d_5h7h8s6s_5c3h3s4h_Qd8dTs7c() {
    assertEquals(
      "3dQh2c4d 5c3h3s4h 5h7h8s6s Qd8dTs7c",
      Solver.process("omaha-holdem 5s7d8c9sJh 3dQh2c4d 5h7h8s6s 5c3h3s4h Qd8dTs7c"));
  }

  @Test
  public void test_omaha_holdem_9777_3d7d8c8dTd_KhQd6cAs_3s2d2sQc_5cQhTs2h_Jd4s2c8h_Th3h6s5s() {
    assertEquals(
      "KhQd6cAs 3s2d2sQc Th3h6s5s 5cQhTs2h Jd4s2c8h",
      Solver.process("omaha-holdem 3d7d8c8dTd KhQd6cAs 3s2d2sQc 5cQhTs2h Jd4s2c8h Th3h6s5s"));
  }

  @Test
  public void test_omaha_holdem_9778_3sJcKhQhTs_Ad4cJd8c_5sJh2h6c_6sKs2s7s_QsKd3h8d_9c6hAc7c_8s5c3dAs() {
    assertEquals(
      "9c6hAc7c 8s5c3dAs 5sJh2h6c 6sKs2s7s QsKd3h8d Ad4cJd8c",
      Solver.process("omaha-holdem 3sJcKhQhTs Ad4cJd8c 5sJh2h6c 6sKs2s7s QsKd3h8d 9c6hAc7c 8s5c3dAs"));
  }

  @Test
  public void test_omaha_holdem_9779_5h6s8cKcTc_7c9cQh8h_3cJdAc4h_AdKh7s7d_2h5s8d8s_9h9dQc4s_2sKs6cJh() {
    assertEquals(
      "9h9dQc4s AdKh7s7d 2sKs6cJh 2h5s8d8s 7c9cQh8h 3cJdAc4h",
      Solver.process("omaha-holdem 5h6s8cKcTc 7c9cQh8h 3cJdAc4h AdKh7s7d 2h5s8d8s 9h9dQc4s 2sKs6cJh"));
  }

  @Test
  public void test_omaha_holdem_9780_6c8s9dAcQs_8h5d6dJh_8dAdJdAs() {
    assertEquals(
      "8h5d6dJh 8dAdJdAs",
      Solver.process("omaha-holdem 6c8s9dAcQs 8h5d6dJh 8dAdJdAs"));
  }

  @Test
  public void test_omaha_holdem_9781_4d9cQcQdQh_3s5cTh7d_7s5s2s9d_5h4c5dTd_Kd9hAc3c_Jd4s6sKs_6h8cJc6c_7c8h6d4h() {
    assertEquals(
      "7c8h6d4h 7s5s2s9d 3s5cTh7d Jd4s6sKs Kd9hAc3c 5h4c5dTd 6h8cJc6c",
      Solver.process("omaha-holdem 4d9cQcQdQh 3s5cTh7d 7s5s2s9d 5h4c5dTd Kd9hAc3c Jd4s6sKs 6h8cJc6c 7c8h6d4h"));
  }

  @Test
  public void test_omaha_holdem_9782_5d5s8s9hKs_Td9d7cKc_3hJd2h4s_Js3sTh2d_8cAh7sAs_7h4cJh6c_3cTs5c9s_8h8dQd4h() {
    assertEquals(
      "3hJd2h4s Td9d7cKc 7h4cJh6c Js3sTh2d 8cAh7sAs 3cTs5c9s 8h8dQd4h",
      Solver.process("omaha-holdem 5d5s8s9hKs Td9d7cKc 3hJd2h4s Js3sTh2d 8cAh7sAs 7h4cJh6c 3cTs5c9s 8h8dQd4h"));
  }

  @Test
  public void test_omaha_holdem_9783_2d6h9dKcTh_7sAcAd2c_QdJcQcQs_4s3sAsTd() {
    assertEquals(
      "4s3sAsTd 7sAcAd2c QdJcQcQs",
      Solver.process("omaha-holdem 2d6h9dKcTh 7sAcAd2c QdJcQcQs 4s3sAsTd"));
  }

  @Test
  public void test_omaha_holdem_9784_3h6d8dKsTc_5d9c6s2s_7dQc7c7s_Kh5c2dQs() {
    assertEquals(
      "5d9c6s2s 7dQc7c7s Kh5c2dQs",
      Solver.process("omaha-holdem 3h6d8dKsTc 5d9c6s2s 7dQc7c7s Kh5c2dQs"));
  }

  @Test
  public void test_omaha_holdem_9785_2s5s8cKdQd_AdTdJhAh_4s6h8sAs() {
    assertEquals(
      "4s6h8sAs AdTdJhAh",
      Solver.process("omaha-holdem 2s5s8cKdQd AdTdJhAh 4s6h8sAs"));
  }

  @Test
  public void test_omaha_holdem_9786_5d5sJcQsTh_8d3d6cQh_2s3hQc4d_5h6h5cAc_8sQdKsKc_9c7h4c3s_JdTd8h7d() {
    assertEquals(
      "9c7h4c3s JdTd8h7d 2s3hQc4d 8d3d6cQh 8sQdKsKc 5h6h5cAc",
      Solver.process("omaha-holdem 5d5sJcQsTh 8d3d6cQh 2s3hQc4d 5h6h5cAc 8sQdKsKc 9c7h4c3s JdTd8h7d"));
  }

  @Test
  public void test_omaha_holdem_9787_2s4d9cJdTh_Ad7d5h4c_Ts9sJs3d_Ah5s5c2h_3s9hQh8c_AcQdKdTc_6dKcTd5d_2d9dKh3c_Qc7s8h3h() {
    assertEquals(
      "Ad7d5h4c Ah5s5c2h 6dKcTd5d 2d9dKh3c Ts9sJs3d 3s9hQh8c=Qc7s8h3h AcQdKdTc",
      Solver.process("omaha-holdem 2s4d9cJdTh Ad7d5h4c Ts9sJs3d Ah5s5c2h 3s9hQh8c AcQdKdTc 6dKcTd5d 2d9dKh3c Qc7s8h3h"));
  }

  @Test
  public void test_omaha_holdem_9788_3c6s9dJhKc_KdQs7h5c_JcJdQhQc_4s2dTc4d_5s7cQd2c_4cAc3sKh_5d6c9hAh() {
    assertEquals(
      "5s7cQd2c 4s2dTc4d KdQs7h5c 5d6c9hAh 4cAc3sKh JcJdQhQc",
      Solver.process("omaha-holdem 3c6s9dJhKc KdQs7h5c JcJdQhQc 4s2dTc4d 5s7cQd2c 4cAc3sKh 5d6c9hAh"));
  }

  @Test
  public void test_omaha_holdem_9789_3c4d4s5s7s_4h2s4c5d_KdAdQd7d_2h2cQc6h_9dKh8dQh_9s8h2d3d_7cKs8sTc() {
    assertEquals(
      "9dKh8dQh 9s8h2d3d KdAdQd7d 2h2cQc6h 7cKs8sTc 4h2s4c5d",
      Solver.process("omaha-holdem 3c4d4s5s7s 4h2s4c5d KdAdQd7d 2h2cQc6h 9dKh8dQh 9s8h2d3d 7cKs8sTc"));
  }

  @Test
  public void test_omaha_holdem_9790_2s4s5s7h7s_6dJhKdTs_QsKc9d2c() {
    assertEquals(
      "6dJhKdTs QsKc9d2c",
      Solver.process("omaha-holdem 2s4s5s7h7s 6dJhKdTs QsKc9d2c"));
  }

  @Test
  public void test_omaha_holdem_9791_4hJcKsQsTc_7d3dQhJh_Th3h7s8c_Ad2d4dAc() {
    assertEquals(
      "Th3h7s8c Ad2d4dAc 7d3dQhJh",
      Solver.process("omaha-holdem 4hJcKsQsTc 7d3dQhJh Th3h7s8c Ad2d4dAc"));
  }

  @Test
  public void test_omaha_holdem_9792_3cJsKdKsQh_6d7s3s9c_6cKh7dAd_Jc5cAcTc_7hTd8h6s_5d9d8cQs_5h8d4dAh() {
    assertEquals(
      "7hTd8h6s 5h8d4dAh 6d7s3s9c 5d9d8cQs 6cKh7dAd Jc5cAcTc",
      Solver.process("omaha-holdem 3cJsKdKsQh 6d7s3s9c 6cKh7dAd Jc5cAcTc 7hTd8h6s 5d9d8cQs 5h8d4dAh"));
  }

  @Test
  public void test_omaha_holdem_9793_4s9cJcQcQh_Ac5hKc7s_5d4dJd4c_Qs7d5sTh_8s2h3dAs() {
    assertEquals(
      "8s2h3dAs Qs7d5sTh Ac5hKc7s 5d4dJd4c",
      Solver.process("omaha-holdem 4s9cJcQcQh Ac5hKc7s 5d4dJd4c Qs7d5sTh 8s2h3dAs"));
  }

  @Test
  public void test_omaha_holdem_9794_2d5c6c6dJc_Td8dKd5h_2c3h4cAc_Th6sTc9c_5sJsKsJh_8hQc9d7c() {
    assertEquals(
      "Td8dKd5h Th6sTc9c 8hQc9d7c 2c3h4cAc 5sJsKsJh",
      Solver.process("omaha-holdem 2d5c6c6dJc Td8dKd5h 2c3h4cAc Th6sTc9c 5sJsKsJh 8hQc9d7c"));
  }

  @Test
  public void test_omaha_holdem_9795_3h4d7d8hJc_Ks5cTs8d_AsQs6d4c_5sTd6s3c() {
    assertEquals(
      "AsQs6d4c Ks5cTs8d 5sTd6s3c",
      Solver.process("omaha-holdem 3h4d7d8hJc Ks5cTs8d AsQs6d4c 5sTd6s3c"));
  }

  @Test
  public void test_omaha_holdem_9796_2c2h7h7s9d_TcQh9h6d_JdJcJs4s_3dTd9sKh_5h6s3cAc_7d5dKc4c_8d6c5c4h_2sAs4dAh_Ts8sQs2d_Qd6hJh8c() {
    assertEquals(
      "8d6c5c4h Qd6hJh8c 5h6s3cAc TcQh9h6d 3dTd9sKh JdJcJs4s Ts8sQs2d 2sAs4dAh 7d5dKc4c",
      Solver.process("omaha-holdem 2c2h7h7s9d TcQh9h6d JdJcJs4s 3dTd9sKh 5h6s3cAc 7d5dKc4c 8d6c5c4h 2sAs4dAh Ts8sQs2d Qd6hJh8c"));
  }

  @Test
  public void test_omaha_holdem_9797_2c5s6sJcKd_Ts3s3d2h_5d9h8dAc_7sKs3h4d_9sKc2d8s() {
    assertEquals(
      "Ts3s3d2h 5d9h8dAc 9sKc2d8s 7sKs3h4d",
      Solver.process("omaha-holdem 2c5s6sJcKd Ts3s3d2h 5d9h8dAc 7sKs3h4d 9sKc2d8s"));
  }

  @Test
  public void test_omaha_holdem_9798_2s4h5c7hKs_Jd5s4sAd_8c8d5hTs_Jh2hKh3h_6sQc5dQs_8h9d7dQd_Tc3s3cJs_8s7c2c4d_4cTd6h9s_As9cJcKc() {
    assertEquals(
      "Tc3s3cJs 4cTd6h9s 8h9d7dQd 8c8d5hTs 6sQc5dQs As9cJcKc Jd5s4sAd 8s7c2c4d Jh2hKh3h",
      Solver.process("omaha-holdem 2s4h5c7hKs Jd5s4sAd 8c8d5hTs Jh2hKh3h 6sQc5dQs 8h9d7dQd Tc3s3cJs 8s7c2c4d 4cTd6h9s As9cJcKc"));
  }

  @Test
  public void test_omaha_holdem_9799_4s5sAcKhKs_6cQsAh3h_7c8dJcJd_7h6s6hTd_Qh2c8cJs_9sAd9h7s_2sJh3dQd_5h8h7dKc_4c2hTc5c() {
    assertEquals(
      "Qh2c8cJs 4c2hTc5c 7h6s6hTd 7c8dJcJd 6cQsAh3h 2sJh3dQd 9sAd9h7s 5h8h7dKc",
      Solver.process("omaha-holdem 4s5sAcKhKs 6cQsAh3h 7c8dJcJd 7h6s6hTd Qh2c8cJs 9sAd9h7s 2sJh3dQd 5h8h7dKc 4c2hTc5c"));
  }

  @Test
  public void test_omaha_holdem_9800_3c3hAcKcQc_3s7dQs8c_Jh7hKs6c_6sQd7c9h_Js5cQhTd_9c8dAh8h_AdTh2d5s_Jd4d3d6d() {
    assertEquals(
      "6sQd7c9h Jh7hKs6c 9c8dAh8h AdTh2d5s Jd4d3d6d Js5cQhTd 3s7dQs8c",
      Solver.process("omaha-holdem 3c3hAcKcQc 3s7dQs8c Jh7hKs6c 6sQd7c9h Js5cQhTd 9c8dAh8h AdTh2d5s Jd4d3d6d"));
  }

  @Test
  public void test_omaha_holdem_9801_5h9hJsQsTc_8cJd2s8s_7d7h4dTh_9d3cKdAc() {
    assertEquals(
      "7d7h4dTh 8cJd2s8s 9d3cKdAc",
      Solver.process("omaha-holdem 5h9hJsQsTc 8cJd2s8s 7d7h4dTh 9d3cKdAc"));
  }

  @Test
  public void test_omaha_holdem_9802_2h6s7dQcQd_AdJs3hKc_8cAh7c8d_5hQs3sTs_2c4d6d3d_6h4cTh4s_2s5s9cTc_Kh8sQh3c_Ac7hTdKd_5d4h5cAs() {
    assertEquals(
      "AdJs3hKc 2s5s9cTc 5d4h5cAs 2c4d6d3d 6h4cTh4s Ac7hTdKd 8cAh7c8d 5hQs3sTs Kh8sQh3c",
      Solver.process("omaha-holdem 2h6s7dQcQd AdJs3hKc 8cAh7c8d 5hQs3sTs 2c4d6d3d 6h4cTh4s 2s5s9cTc Kh8sQh3c Ac7hTdKd 5d4h5cAs"));
  }

  @Test
  public void test_omaha_holdem_9803_3c5h7cKdQs_Ac6h5c6s_Ks8dTcAd_Kh5d9cAh_ThJcJs6d_9s8s4c8h_9d4s5s8c() {
    assertEquals(
      "9d4s5s8c Ac6h5c6s 9s8s4c8h ThJcJs6d Ks8dTcAd Kh5d9cAh",
      Solver.process("omaha-holdem 3c5h7cKdQs Ac6h5c6s Ks8dTcAd Kh5d9cAh ThJcJs6d 9s8s4c8h 9d4s5s8c"));
  }

  @Test
  public void test_omaha_holdem_9804_3dJsKcKdKh_6s5s2c7h_AcQh7dAd_Ks4d9h7s_8dAs4s9c_3s9sJdTd_Th5c2sQd() {
    assertEquals(
      "6s5s2c7h 3s9sJdTd Th5c2sQd 8dAs4s9c AcQh7dAd Ks4d9h7s",
      Solver.process("omaha-holdem 3dJsKcKdKh 6s5s2c7h AcQh7dAd Ks4d9h7s 8dAs4s9c 3s9sJdTd Th5c2sQd"));
  }

  @Test
  public void test_omaha_holdem_9805_5d7d8dAcTc_6dAd7h4s_6c7c4hTh_3sKdKcAs_8c3d8s6h_3h2c7sTs_5c4dQd9s_9dKs4c8h() {
    assertEquals(
      "9dKs4c8h 3sKdKcAs 3h2c7sTs 8c3d8s6h 6c7c4hTh 5c4dQd9s 6dAd7h4s",
      Solver.process("omaha-holdem 5d7d8dAcTc 6dAd7h4s 6c7c4hTh 3sKdKcAs 8c3d8s6h 3h2c7sTs 5c4dQd9s 9dKs4c8h"));
  }

  @Test
  public void test_omaha_holdem_9806_5c7d7s8cTc_Kh3d6s6d_5d5h8dQc_6h2hJdTd() {
    assertEquals(
      "Kh3d6s6d 6h2hJdTd 5d5h8dQc",
      Solver.process("omaha-holdem 5c7d7s8cTc Kh3d6s6d 5d5h8dQc 6h2hJdTd"));
  }

  @Test
  public void test_omaha_holdem_9807_3h4c8cAsKh_5h9cJs9s_7s3dKdQd_Jh6c2c2d() {
    assertEquals(
      "Jh6c2c2d 5h9cJs9s 7s3dKdQd",
      Solver.process("omaha-holdem 3h4c8cAsKh 5h9cJs9s 7s3dKdQd Jh6c2c2d"));
  }

  @Test
  public void test_omaha_holdem_9808_2d3s4c4sAh_ThJd9c6c_QcJc6hKc_Ad7s3d3h_8h6dKs8d() {
    assertEquals(
      "ThJd9c6c QcJc6hKc 8h6dKs8d Ad7s3d3h",
      Solver.process("omaha-holdem 2d3s4c4sAh ThJd9c6c QcJc6hKc Ad7s3d3h 8h6dKs8d"));
  }

  @Test
  public void test_omaha_holdem_9809_2h3hJdJhQd_3cJs9c4s_2sQs6d8h() {
    assertEquals(
      "2sQs6d8h 3cJs9c4s",
      Solver.process("omaha-holdem 2h3hJdJhQd 3cJs9c4s 2sQs6d8h"));
  }

  @Test
  public void test_omaha_holdem_9810_2h5s9sKcTs_4h6s5h7d_Jd3sQsKd_KsQd7h4s_8sJcTc9d() {
    assertEquals(
      "4h6s5h7d 8sJcTc9d Jd3sQsKd KsQd7h4s",
      Solver.process("omaha-holdem 2h5s9sKcTs 4h6s5h7d Jd3sQsKd KsQd7h4s 8sJcTc9d"));
  }

  @Test
  public void test_omaha_holdem_9811_2hAcQsTcTh_Qc6h8c4d_Jh8d9c7d_5c8s5d8h_9d6c3sKc_QdTsJsKh_4c4h4s3c_Ah2c9sAs() {
    assertEquals(
      "Jh8d9c7d 9d6c3sKc 4c4h4s3c 5c8s5d8h Qc6h8c4d QdTsJsKh Ah2c9sAs",
      Solver.process("omaha-holdem 2hAcQsTcTh Qc6h8c4d Jh8d9c7d 5c8s5d8h 9d6c3sKc QdTsJsKh 4c4h4s3c Ah2c9sAs"));
  }

  @Test
  public void test_omaha_holdem_9812_2h4h7h9cAd_8c7d6h8h_2sJdAhTc_QhAc9h4d_Jh3hQs8s_8d5d6cTd_Qc7c4c2c_3s5h2dQd_4s3d9sTh_Js7sKs3c() {
    assertEquals(
      "8d5d6cTd Js7sKs3c Qc7c4c2c 4s3d9sTh 2sJdAhTc 3s5h2dQd 8c7d6h8h Jh3hQs8s QhAc9h4d",
      Solver.process("omaha-holdem 2h4h7h9cAd 8c7d6h8h 2sJdAhTc QhAc9h4d Jh3hQs8s 8d5d6cTd Qc7c4c2c 3s5h2dQd 4s3d9sTh Js7sKs3c"));
  }

  @Test
  public void test_omaha_holdem_9813_2d3s8dJcJd_9h3d5s6s_4hQs9cAs_7cTs3c5h_Kc4dAcKd_TcAd8c2h_ThAhQc3h_6dKh7dJs() {
    assertEquals(
      "4hQs9cAs 9h3d5s6s 7cTs3c5h ThAhQc3h TcAd8c2h 6dKh7dJs Kc4dAcKd",
      Solver.process("omaha-holdem 2d3s8dJcJd 9h3d5s6s 4hQs9cAs 7cTs3c5h Kc4dAcKd TcAd8c2h ThAhQc3h 6dKh7dJs"));
  }

  @Test
  public void test_omaha_holdem_9814_3s6sQdThTs_9hQhQc3h_3d8hJs8d_2cTcJhJd() {
    assertEquals(
      "3d8hJs8d 2cTcJhJd 9hQhQc3h",
      Solver.process("omaha-holdem 3s6sQdThTs 9hQhQc3h 3d8hJs8d 2cTcJhJd"));
  }

  @Test
  public void test_omaha_holdem_9815_3c3d6d8cJc_JsKcKd7d_6cTcTsAs_3s7c9d2h_4sQcQs5c_6s2s8d5h_TdAdQd7h_Jh9c5s8h() {
    assertEquals(
      "TdAdQd7h 6s2s8d5h Jh9c5s8h JsKcKd7d 3s7c9d2h 6cTcTsAs 4sQcQs5c",
      Solver.process("omaha-holdem 3c3d6d8cJc JsKcKd7d 6cTcTsAs 3s7c9d2h 4sQcQs5c 6s2s8d5h TdAdQd7h Jh9c5s8h"));
  }

  @Test
  public void test_omaha_holdem_9816_3d7dKhTcTd_3c2d5d7s_6h5cJdQs_4cTh8cAd_Kc9s3h6c_8h4h5s7c_Ks4s6s7h() {
    assertEquals(
      "6h5cJdQs 8h4h5s7c Ks4s6s7h Kc9s3h6c 4cTh8cAd 3c2d5d7s",
      Solver.process("omaha-holdem 3d7dKhTcTd 3c2d5d7s 6h5cJdQs 4cTh8cAd Kc9s3h6c 8h4h5s7c Ks4s6s7h"));
  }

  @Test
  public void test_omaha_holdem_9817_2d6hAdQcQs_6sAs3s7c_2h9cKd8s_4s5hKh5s() {
    assertEquals(
      "2h9cKd8s 4s5hKh5s 6sAs3s7c",
      Solver.process("omaha-holdem 2d6hAdQcQs 6sAs3s7c 2h9cKd8s 4s5hKh5s"));
  }

  @Test
  public void test_omaha_holdem_9818_2h3h4c5dKc_6c9cAsTs_Th4s6hQd_8cQc3c2s_7hJh7s6d_Td4dAc2d_9s5hAhKs_AdJs8s7d_Kh3s4h9d_2c5cQs6s() {
    assertEquals(
      "6c9cAsTs AdJs8s7d 8cQc3c2s Kh3s4h9d 9s5hAhKs=Td4dAc2d 2c5cQs6s=Th4s6hQd 7hJh7s6d",
      Solver.process("omaha-holdem 2h3h4c5dKc 6c9cAsTs Th4s6hQd 8cQc3c2s 7hJh7s6d Td4dAc2d 9s5hAhKs AdJs8s7d Kh3s4h9d 2c5cQs6s"));
  }

  @Test
  public void test_omaha_holdem_9819_4h7h7s8cKs_9d4s3c2h_Tc6d2d6c() {
    assertEquals(
      "9d4s3c2h Tc6d2d6c",
      Solver.process("omaha-holdem 4h7h7s8cKs 9d4s3c2h Tc6d2d6c"));
  }

  @Test
  public void test_omaha_holdem_9820_2d3h6sJsTh_Qs7h5dAh_Qc7s7c2h_Ad9s9h6c_5s9cJd2c_3c3sKsKc_Ac2s8dTc() {
    assertEquals(
      "Qs7h5dAh Qc7s7c2h Ad9s9h6c Ac2s8dTc 5s9cJd2c 3c3sKsKc",
      Solver.process("omaha-holdem 2d3h6sJsTh Qs7h5dAh Qc7s7c2h Ad9s9h6c 5s9cJd2c 3c3sKsKc Ac2s8dTc"));
  }

  @Test
  public void test_omaha_holdem_9821_2c2h4h7dQs_4dQd8c6h_3sKcAh9c_3d8dKh5c_5hThJh2s_Ks9sAdAc_Qh8hJsQc_Jc3h2dTd_6s4s3c7s_AsTc4cKd() {
    assertEquals(
      "3d8dKh5c 3sKcAh9c AsTc4cKd 6s4s3c7s 4dQd8c6h Ks9sAdAc 5hThJh2s=Jc3h2dTd Qh8hJsQc",
      Solver.process("omaha-holdem 2c2h4h7dQs 4dQd8c6h 3sKcAh9c 3d8dKh5c 5hThJh2s Ks9sAdAc Qh8hJsQc Jc3h2dTd 6s4s3c7s AsTc4cKd"));
  }

  @Test
  public void test_omaha_holdem_9822_5h7sAsJdKh_4h5s2c2d_8d7dJs6c() {
    assertEquals(
      "4h5s2c2d 8d7dJs6c",
      Solver.process("omaha-holdem 5h7sAsJdKh 4h5s2c2d 8d7dJs6c"));
  }

  @Test
  public void test_omaha_holdem_9823_2d2s7d9cKd_4h7cJh3s_5hQcAs6c() {
    assertEquals(
      "5hQcAs6c 4h7cJh3s",
      Solver.process("omaha-holdem 2d2s7d9cKd 4h7cJh3s 5hQcAs6c"));
  }

  @Test
  public void test_omaha_holdem_9824_2c4cAcAdJs_4h4dTcTs_4s9hJc6d_Qd6h8d7d() {
    assertEquals(
      "Qd6h8d7d 4s9hJc6d 4h4dTcTs",
      Solver.process("omaha-holdem 2c4cAcAdJs 4h4dTcTs 4s9hJc6d Qd6h8d7d"));
  }

  @Test
  public void test_omaha_holdem_9825_2c4c5s9dJc_6dKd9cJs_2d8sKh4d_5cKs6cJd_8d3c7cTd_7dQh8c6h_QdTs4hJh_3sAcTh2h() {
    assertEquals(
      "7dQh8c6h 2d8sKh4d QdTs4hJh 6dKd9cJs 3sAcTh2h 5cKs6cJd 8d3c7cTd",
      Solver.process("omaha-holdem 2c4c5s9dJc 6dKd9cJs 2d8sKh4d 5cKs6cJd 8d3c7cTd 7dQh8c6h QdTs4hJh 3sAcTh2h"));
  }

  @Test
  public void test_omaha_holdem_9826_4h4s6c6d6h_5hJc5sAs_KcQcQh3c_AhKhAc8c_Jd5d9dJh() {
    assertEquals(
      "5hJc5sAs Jd5d9dJh KcQcQh3c AhKhAc8c",
      Solver.process("omaha-holdem 4h4s6c6d6h 5hJc5sAs KcQcQh3c AhKhAc8c Jd5d9dJh"));
  }

  @Test
  public void test_omaha_holdem_9827_3d7hKhQcTh_2s6dQh3c_4d8d7c3s_4c2h9sAh_5c6h5sQd() {
    assertEquals(
      "5c6h5sQd 4d8d7c3s 2s6dQh3c 4c2h9sAh",
      Solver.process("omaha-holdem 3d7hKhQcTh 2s6dQh3c 4d8d7c3s 4c2h9sAh 5c6h5sQd"));
  }

  @Test
  public void test_omaha_holdem_9828_3s8hAdJsKh_6sQs6c3d_9h6dQd7s_Qh5sTdAs_8sAc2s4d_2c2hJhKc_JcTcKs3c_4s5hJd8c_7c4c6h9d() {
    assertEquals(
      "7c4c6h9d 9h6dQd7s 6sQs6c3d 4s5hJd8c 2c2hJhKc=JcTcKs3c 8sAc2s4d Qh5sTdAs",
      Solver.process("omaha-holdem 3s8hAdJsKh 6sQs6c3d 9h6dQd7s Qh5sTdAs 8sAc2s4d 2c2hJhKc JcTcKs3c 4s5hJd8c 7c4c6h9d"));
  }

  @Test
  public void test_omaha_holdem_9829_5s7d9dKhTs_2d8hAdQs_9s7sKs4c_6dJsJc5c_7c8s2c2h_AsKc3s5d_3hJh8d3c() {
    assertEquals(
      "2d8hAdQs 7c8s2c2h 6dJsJc5c AsKc3s5d 9s7sKs4c 3hJh8d3c",
      Solver.process("omaha-holdem 5s7d9dKhTs 2d8hAdQs 9s7sKs4c 6dJsJc5c 7c8s2c2h AsKc3s5d 3hJh8d3c"));
  }

  @Test
  public void test_omaha_holdem_9830_2d8d9sAdAh_4s2cKh8s_Kc6hJc3h_4d7dKsQs_Td5h6d5c_Qc9cAsTh_AcJh7hJd() {
    assertEquals(
      "Kc6hJc3h 4s2cKh8s AcJh7hJd 4d7dKsQs Td5h6d5c Qc9cAsTh",
      Solver.process("omaha-holdem 2d8d9sAdAh 4s2cKh8s Kc6hJc3h 4d7dKsQs Td5h6d5c Qc9cAsTh AcJh7hJd"));
  }

  @Test
  public void test_omaha_holdem_9831_4h5c5sJcTh_As4c3s3d_7sKcQcAc_5d6s8s7h_3h9h8h9c_6cTc3c7d_KhQs9sTd() {
    assertEquals(
      "7sKcQcAc As4c3s3d 3h9h8h9c 6cTc3c7d KhQs9sTd 5d6s8s7h",
      Solver.process("omaha-holdem 4h5c5sJcTh As4c3s3d 7sKcQcAc 5d6s8s7h 3h9h8h9c 6cTc3c7d KhQs9sTd"));
  }

  @Test
  public void test_omaha_holdem_9832_4d5c6c8sKd_5d6hAs7d_KhJcQh2h_Ks9d9h8d_8hTd7c3h_4sTh3dQs_5h7h9s8c_5s7sAdTc() {
    assertEquals(
      "4sTh3dQs KhJcQh2h Ks9d9h8d 5d6hAs7d=5s7sAdTc=8hTd7c3h 5h7h9s8c",
      Solver.process("omaha-holdem 4d5c6c8sKd 5d6hAs7d KhJcQh2h Ks9d9h8d 8hTd7c3h 4sTh3dQs 5h7h9s8c 5s7sAdTc"));
  }

  @Test
  public void test_omaha_holdem_9833_2d3d3h9cAc_KsJdAs3c_4hQd5c6d_9h6c9s3s_5d2cAd7d_8sQcJs5h_8dJc6hKd_8c6s5s8h_Kc7cTd2h_Kh9d4s7h() {
    assertEquals(
      "8sQcJs5h 8dJc6hKd Kc7cTd2h 8c6s5s8h Kh9d4s7h 5d2cAd7d 4hQd5c6d KsJdAs3c 9h6c9s3s",
      Solver.process("omaha-holdem 2d3d3h9cAc KsJdAs3c 4hQd5c6d 9h6c9s3s 5d2cAd7d 8sQcJs5h 8dJc6hKd 8c6s5s8h Kc7cTd2h Kh9d4s7h"));
  }

  @Test
  public void test_omaha_holdem_9834_2d6dAdAsJs_6sQh5hKs_3hKd4cTd_Qs4d3d8d_4hTh5s9s_Kh8h4sQc_AhTs8s5d_Qd3cTc2s_7d2cJd2h_8c7h3s7s() {
    assertEquals(
      "4hTh5s9s Kh8h4sQc Qd3cTc2s 6sQh5hKs 8c7h3s7s AhTs8s5d Qs4d3d8d 3hKd4cTd 7d2cJd2h",
      Solver.process("omaha-holdem 2d6dAdAsJs 6sQh5hKs 3hKd4cTd Qs4d3d8d 4hTh5s9s Kh8h4sQc AhTs8s5d Qd3cTc2s 7d2cJd2h 8c7h3s7s"));
  }

  @Test
  public void test_omaha_holdem_9835_3c7c9sJcKd_Qh6h9hTc_Jh9cKs2d() {
    assertEquals(
      "Jh9cKs2d Qh6h9hTc",
      Solver.process("omaha-holdem 3c7c9sJcKd Qh6h9hTc Jh9cKs2d"));
  }

  @Test
  public void test_omaha_holdem_9836_3h9h9sKhTh_6h9d4s2c_AsKc8sAh_Qs7dJd2s_5c7c8d4c_7sJhTdQh() {
    assertEquals(
      "5c7c8d4c AsKc8sAh 6h9d4s2c Qs7dJd2s 7sJhTdQh",
      Solver.process("omaha-holdem 3h9h9sKhTh 6h9d4s2c AsKc8sAh Qs7dJd2s 5c7c8d4c 7sJhTdQh"));
  }

  @Test
  public void test_omaha_holdem_9837_7s8hAdQhTc_5cTdJc7d_4s4h7hKh_Kd9cKs5d_Qc8s3d6d_9d6s4d4c_3s3cTh3h() {
    assertEquals(
      "4s4h7hKh 3s3cTh3h Kd9cKs5d 5cTdJc7d Qc8s3d6d 9d6s4d4c",
      Solver.process("omaha-holdem 7s8hAdQhTc 5cTdJc7d 4s4h7hKh Kd9cKs5d Qc8s3d6d 9d6s4d4c 3s3cTh3h"));
  }

  @Test
  public void test_omaha_holdem_9838_2c3s5h7cKs_7dJs7hAd_9cKhQh3h_8c4h4s4c_6hKdTcQs_6dJdKc8h_JcQc5d4d() {
    assertEquals(
      "8c4h4s4c JcQc5d4d 6dJdKc8h 6hKdTcQs 9cKhQh3h 7dJs7hAd",
      Solver.process("omaha-holdem 2c3s5h7cKs 7dJs7hAd 9cKhQh3h 8c4h4s4c 6hKdTcQs 6dJdKc8h JcQc5d4d"));
  }

  @Test
  public void test_omaha_holdem_9839_3d9sAcAhKc_7sJd5s6s_2d6c2cKs_2s6hJc4s_TcJh4hAd_6dQh7cAs_3h8dKd4c_9cTd7hTs_Qd5hQcKh() {
    assertEquals(
      "2s6hJc4s 7sJd5s6s 9cTd7hTs 2d6c2cKs 3h8dKd4c Qd5hQcKh TcJh4hAd 6dQh7cAs",
      Solver.process("omaha-holdem 3d9sAcAhKc 7sJd5s6s 2d6c2cKs 2s6hJc4s TcJh4hAd 6dQh7cAs 3h8dKd4c 9cTd7hTs Qd5hQcKh"));
  }

  @Test
  public void test_omaha_holdem_9840_6c6hAdJdKd_6d7cAcTs_KcJsJcKh() {
    assertEquals(
      "6d7cAcTs KcJsJcKh",
      Solver.process("omaha-holdem 6c6hAdJdKd 6d7cAcTs KcJsJcKh"));
  }

  @Test
  public void test_omaha_holdem_9841_2sAdJcJsKh_7sQs4h4c_7d2dJdKd_2cTc3c6c_5c5s3d8d_Ac5dThQc_5h9h9dAs_4s9s7hKs_3h6d8s6s() {
    assertEquals(
      "2cTc3c6c 7sQs4h4c 5c5s3d8d 3h6d8s6s 4s9s7hKs 5h9h9dAs Ac5dThQc 7d2dJdKd",
      Solver.process("omaha-holdem 2sAdJcJsKh 7sQs4h4c 7d2dJdKd 2cTc3c6c 5c5s3d8d Ac5dThQc 5h9h9dAs 4s9s7hKs 3h6d8s6s"));
  }

  @Test
  public void test_omaha_holdem_9842_2s6h8hQdTd_7dAh8s3h_3d5hQhKd() {
    assertEquals(
      "7dAh8s3h 3d5hQhKd",
      Solver.process("omaha-holdem 2s6h8hQdTd 7dAh8s3h 3d5hQhKd"));
  }

  @Test
  public void test_omaha_holdem_9843_4h5h5s7d8c_Ks6sQsAs_4s9cThQd_6cTdKd3s_7s2dJd7c() {
    assertEquals(
      "Ks6sQsAs 4s9cThQd 6cTdKd3s 7s2dJd7c",
      Solver.process("omaha-holdem 4h5h5s7d8c Ks6sQsAs 4s9cThQd 6cTdKd3s 7s2dJd7c"));
  }

  @Test
  public void test_omaha_holdem_9844_7sAdAsQcTc_3c4sThAh_3d9cKcKh_Qd6c3h9s_Td6d3sJd_5s2d8d7c_7d9h8sQh() {
    assertEquals(
      "5s2d8d7c Td6d3sJd 7d9h8sQh=Qd6c3h9s 3d9cKcKh 3c4sThAh",
      Solver.process("omaha-holdem 7sAdAsQcTc 3c4sThAh 3d9cKcKh Qd6c3h9s Td6d3sJd 5s2d8d7c 7d9h8sQh"));
  }

  @Test
  public void test_omaha_holdem_9845_8cJcQdQsTs_3h7dAsTc_4d6sQh9s_7hQc3c3d_5d9cTd9d_7c6d6h5c_Th8s8h3s() {
    assertEquals(
      "7c6d6h5c 3h7dAsTc 7hQc3c3d 4d6sQh9s=5d9cTd9d Th8s8h3s",
      Solver.process("omaha-holdem 8cJcQdQsTs 3h7dAsTc 4d6sQh9s 7hQc3c3d 5d9cTd9d 7c6d6h5c Th8s8h3s"));
  }

  @Test
  public void test_omaha_holdem_9846_3d7d8d9dJc_6cKh4s6h_AcQs7hTc_7sKc2d4c_3sJh4h5h_8cAhQc8h_AdTh8s9h() {
    assertEquals(
      "6cKh4s6h 7sKc2d4c 3sJh4h5h 8cAhQc8h AdTh8s9h AcQs7hTc",
      Solver.process("omaha-holdem 3d7d8d9dJc 6cKh4s6h AcQs7hTc 7sKc2d4c 3sJh4h5h 8cAhQc8h AdTh8s9h"));
  }

  @Test
  public void test_omaha_holdem_9847_6c6h9hJdKc_2d9c2c9d_7s3d5c5d_5sAhTcQh_8c3cKs3s_Kh2hQd7c_KdAc4s8s() {
    assertEquals(
      "7s3d5c5d 8c3cKs3s Kh2hQd7c KdAc4s8s 5sAhTcQh 2d9c2c9d",
      Solver.process("omaha-holdem 6c6h9hJdKc 2d9c2c9d 7s3d5c5d 5sAhTcQh 8c3cKs3s Kh2hQd7c KdAc4s8s"));
  }

  @Test
  public void test_omaha_holdem_9848_3h5c6dAhKh_4d7s6h8d_Jh7d5hJd_TdAc8h8s_8c2s2h9s() {
    assertEquals(
      "8c2s2h9s TdAc8h8s 4d7s6h8d Jh7d5hJd",
      Solver.process("omaha-holdem 3h5c6dAhKh 4d7s6h8d Jh7d5hJd TdAc8h8s 8c2s2h9s"));
  }

  @Test
  public void test_omaha_holdem_9849_5c5s6s8dJs_2h7s9s5d_4h3d9c9h_8sKd8hJd_Th2cQhKh_Tc4c6h9d_7hQd7c6c_3cAsAd3h_4dJhAh6d() {
    assertEquals(
      "Th2cQhKh Tc4c6h9d 7hQd7c6c 4h3d9c9h 4dJhAh6d 3cAsAd3h 2h7s9s5d 8sKd8hJd",
      Solver.process("omaha-holdem 5c5s6s8dJs 2h7s9s5d 4h3d9c9h 8sKd8hJd Th2cQhKh Tc4c6h9d 7hQd7c6c 3cAsAd3h 4dJhAh6d"));
  }

  @Test
  public void test_omaha_holdem_9850_2d3d3h4cTc_QhJs2c5d_JdJh2s9h_7sAs7hAd_7d8dKc8h_6h3sAhJc_6s6dQdAc_5sTdTsTh() {
    assertEquals(
      "QhJs2c5d 6s6dQdAc 7d8dKc8h JdJh2s9h 7sAs7hAd 6h3sAhJc 5sTdTsTh",
      Solver.process("omaha-holdem 2d3d3h4cTc QhJs2c5d JdJh2s9h 7sAs7hAd 7d8dKc8h 6h3sAhJc 6s6dQdAc 5sTdTsTh"));
  }

  @Test
  public void test_omaha_holdem_9851_2s3d6c6s9h_7cQs2c5d_JsAsAhQh() {
    assertEquals(
      "7cQs2c5d JsAsAhQh",
      Solver.process("omaha-holdem 2s3d6c6s9h 7cQs2c5d JsAsAhQh"));
  }

  @Test
  public void test_omaha_holdem_9852_2c3s7d8dKs_5d9h2hTc_3hQc9sTs_JcKh4hQs_9d6cJd5s_Qh8h8c5c_Kd8s2s3d_Kc6d6sAh() {
    assertEquals(
      "9d6cJd5s 5d9h2hTc 3hQc9sTs JcKh4hQs Kc6d6sAh Kd8s2s3d Qh8h8c5c",
      Solver.process("omaha-holdem 2c3s7d8dKs 5d9h2hTc 3hQc9sTs JcKh4hQs 9d6cJd5s Qh8h8c5c Kd8s2s3d Kc6d6sAh"));
  }

  @Test
  public void test_omaha_holdem_9853_AsJdJhKcKd_7c4dAd4c_Ah5d7s3c_5h3dTs6h_8s4h8dQc_5c9s3s2c_QdQh3h7d() {
    assertEquals(
      "5c9s3s2c 5h3dTs6h 8s4h8dQc QdQh3h7d 7c4dAd4c=Ah5d7s3c",
      Solver.process("omaha-holdem AsJdJhKcKd 7c4dAd4c Ah5d7s3c 5h3dTs6h 8s4h8dQc 5c9s3s2c QdQh3h7d"));
  }

  @Test
  public void test_omaha_holdem_9854_2d5s6s9c9d_4d9h8h6d_JsTd4s7h_Qh8c2cTh_Jd7dAs6h_3d5h4hQd() {
    assertEquals(
      "JsTd4s7h Qh8c2cTh Jd7dAs6h 3d5h4hQd 4d9h8h6d",
      Solver.process("omaha-holdem 2d5s6s9c9d 4d9h8h6d JsTd4s7h Qh8c2cTh Jd7dAs6h 3d5h4hQd"));
  }

  @Test
  public void test_omaha_holdem_9855_3c3d5sAcJc_JsQsAs2h_2c6d6c3s() {
    assertEquals(
      "JsQsAs2h 2c6d6c3s",
      Solver.process("omaha-holdem 3c3d5sAcJc JsQsAs2h 2c6d6c3s"));
  }

  @Test
  public void test_omaha_holdem_9856_3sAhKsThTs_9c7c5s9s_QcKcQd8h_5d6d4cAc_9d3h2cTd_8sKhTc2h_7h2s4d5h() {
    assertEquals(
      "7h2s4d5h QcKcQd8h 5d6d4cAc 9c7c5s9s 9d3h2cTd 8sKhTc2h",
      Solver.process("omaha-holdem 3sAhKsThTs 9c7c5s9s QcKcQd8h 5d6d4cAc 9d3h2cTd 8sKhTc2h 7h2s4d5h"));
  }

  @Test
  public void test_omaha_holdem_9857_2s6h9cKcQc_QdTs9d5s_7cQsKd2c_8s9h2hJh_4s9s4h8c_Ad6c6s2d_Jc3dTc3s_KhQh4d5h_7s7hAs5d() {
    assertEquals(
      "7s7hAs5d 4s9s4h8c 8s9h2hJh QdTs9d5s KhQh4d5h Ad6c6s2d 7cQsKd2c Jc3dTc3s",
      Solver.process("omaha-holdem 2s6h9cKcQc QdTs9d5s 7cQsKd2c 8s9h2hJh 4s9s4h8c Ad6c6s2d Jc3dTc3s KhQh4d5h 7s7hAs5d"));
  }

  @Test
  public void test_omaha_holdem_9858_4s5c5s8d9d_ThJcTc7h_6hAs2s7s_9s2cKh2d() {
    assertEquals(
      "9s2cKh2d ThJcTc7h 6hAs2s7s",
      Solver.process("omaha-holdem 4s5c5s8d9d ThJcTc7h 6hAs2s7s 9s2cKh2d"));
  }

  @Test
  public void test_omaha_holdem_9859_2d3h5sAcQh_3d7sKh2h_Jh9s8d6s() {
    assertEquals(
      "Jh9s8d6s 3d7sKh2h",
      Solver.process("omaha-holdem 2d3h5sAcQh 3d7sKh2h Jh9s8d6s"));
  }

  @Test
  public void test_omaha_holdem_9860_4c5c5d9hKc_9c7d4h9s_3h8s6d3s() {
    assertEquals(
      "3h8s6d3s 9c7d4h9s",
      Solver.process("omaha-holdem 4c5c5d9hKc 9c7d4h9s 3h8s6d3s"));
  }

  @Test
  public void test_omaha_holdem_9861_6d7h8sKdQd_Qc3d4h2c_Jd5hAh8c_KsQhThKc() {
    assertEquals(
      "Jd5hAh8c Qc3d4h2c KsQhThKc",
      Solver.process("omaha-holdem 6d7h8sKdQd Qc3d4h2c Jd5hAh8c KsQhThKc"));
  }

  @Test
  public void test_omaha_holdem_9862_4c4h4sKhQc_Jh3s2cTs_8hAc6dKc_8c5s7d5c_7hQhQs6s_7s9s7cTc_8d2d2s8s() {
    assertEquals(
      "Jh3s2cTs 8hAc6dKc 8c5s7d5c 7s9s7cTc 8d2d2s8s 7hQhQs6s",
      Solver.process("omaha-holdem 4c4h4sKhQc Jh3s2cTs 8hAc6dKc 8c5s7d5c 7hQhQs6s 7s9s7cTc 8d2d2s8s"));
  }

  @Test
  public void test_omaha_holdem_9863_3h4h6c6dTh_4c2s7s8d_KsAc2d2c_Qs4dKd9d_7cJhTdTc_AsAd7d5h_Qh5d9sTs() {
    assertEquals(
      "KsAc2d2c 4c2s7s8d Qs4dKd9d Qh5d9sTs AsAd7d5h 7cJhTdTc",
      Solver.process("omaha-holdem 3h4h6c6dTh 4c2s7s8d KsAc2d2c Qs4dKd9d 7cJhTdTc AsAd7d5h Qh5d9sTs"));
  }

  @Test
  public void test_omaha_holdem_9864_2h6c8dAcTd_Qs3dKd7d_TsTh5sQd() {
    assertEquals(
      "Qs3dKd7d TsTh5sQd",
      Solver.process("omaha-holdem 2h6c8dAcTd Qs3dKd7d TsTh5sQd"));
  }

  @Test
  public void test_omaha_holdem_9865_2h3s8s9cAd_3cKdQh8c_5dKc4hAh_AsQs3dJc() {
    assertEquals(
      "3cKdQh8c AsQs3dJc 5dKc4hAh",
      Solver.process("omaha-holdem 2h3s8s9cAd 3cKdQh8c 5dKc4hAh AsQs3dJc"));
  }

  @Test
  public void test_omaha_holdem_9866_3s5c6c6dQh_5h7c2h2d_3hAc8dTc() {
    assertEquals(
      "3hAc8dTc 5h7c2h2d",
      Solver.process("omaha-holdem 3s5c6c6dQh 5h7c2h2d 3hAc8dTc"));
  }

  @Test
  public void test_omaha_holdem_9867_2h4s6s8s9s_8hJd5hJs_6c2d2cKd_Qs6d5c8d_9h7dQcQh_AcAh4hJh() {
    assertEquals(
      "8hJd5hJs 9h7dQcQh AcAh4hJh Qs6d5c8d 6c2d2cKd",
      Solver.process("omaha-holdem 2h4s6s8s9s 8hJd5hJs 6c2d2cKd Qs6d5c8d 9h7dQcQh AcAh4hJh"));
  }

  @Test
  public void test_omaha_holdem_9868_6c6sJsQdTh_TdAsKd7c_9s6dQh2d_6h7hTs3h_5hAcTc2c_5c3c8s9c_Ks3s5dJd_8cQs4c9h() {
    assertEquals(
      "5hAcTc2c Ks3s5dJd 5c3c8s9c=8cQs4c9h TdAsKd7c 6h7hTs3h 9s6dQh2d",
      Solver.process("omaha-holdem 6c6sJsQdTh TdAsKd7c 9s6dQh2d 6h7hTs3h 5hAcTc2c 5c3c8s9c Ks3s5dJd 8cQs4c9h"));
  }

  @Test
  public void test_omaha_holdem_9869_2d5d6h7hKd_JsTc4h4s_5s8h2s6d_Td9c9sKs_6c9dTsQc_4dJc8sJd_Jh5h8d3h_2h3cQdAs_7c7dKcQs() {
    assertEquals(
      "2h3cQdAs JsTc4h4s Jh5h8d3h 6c9dTsQc Td9c9sKs 5s8h2s6d 7c7dKcQs 4dJc8sJd",
      Solver.process("omaha-holdem 2d5d6h7hKd JsTc4h4s 5s8h2s6d Td9c9sKs 6c9dTsQc 4dJc8sJd Jh5h8d3h 2h3cQdAs 7c7dKcQs"));
  }

  @Test
  public void test_omaha_holdem_9870_2c6d6s8hJd_Td6h9dJs_AsJhAd5c_4cKc3c6c_3sKd7c2s_TsQs7h7d_3d2h4dQd_8dQc8s3h_Th4s9cAh() {
    assertEquals(
      "Th4s9cAh 3d2h4dQd 3sKd7c2s TsQs7h7d AsJhAd5c 4cKc3c6c Td6h9dJs 8dQc8s3h",
      Solver.process("omaha-holdem 2c6d6s8hJd Td6h9dJs AsJhAd5c 4cKc3c6c 3sKd7c2s TsQs7h7d 3d2h4dQd 8dQc8s3h Th4s9cAh"));
  }

  @Test
  public void test_omaha_holdem_9871_4c5s6sAhJs_7s7hTcJd_9c4d2h4s_3dQd5h3s_7d3c5dTd_JhAs6hAc_2dTs6d2s() {
    assertEquals(
      "3dQd5h3s 7s7hTcJd 9c4d2h4s JhAs6hAc 7d3c5dTd 2dTs6d2s",
      Solver.process("omaha-holdem 4c5s6sAhJs 7s7hTcJd 9c4d2h4s 3dQd5h3s 7d3c5dTd JhAs6hAc 2dTs6d2s"));
  }

  @Test
  public void test_omaha_holdem_9872_4h5d9sTcTs_Td2c6d5s_Ad6c7hQc_JdJsQh9d_7s9c8sAh_Qs3hKdKc_3d7d8hKh_9h6sKs2h() {
    assertEquals(
      "3d7d8hKh Ad6c7hQc 9h6sKs2h 7s9c8sAh JdJsQh9d Qs3hKdKc Td2c6d5s",
      Solver.process("omaha-holdem 4h5d9sTcTs Td2c6d5s Ad6c7hQc JdJsQh9d 7s9c8sAh Qs3hKdKc 3d7d8hKh 9h6sKs2h"));
  }

  @Test
  public void test_omaha_holdem_9873_3sKdKhQhTs_6dAd3dQd_8cTcAc2c_7d8h5c7c_2d6h9sKc_3cJhQs4d() {
    assertEquals(
      "7d8h5c7c 8cTcAc2c 3cJhQs4d 6dAd3dQd 2d6h9sKc",
      Solver.process("omaha-holdem 3sKdKhQhTs 6dAd3dQd 8cTcAc2c 7d8h5c7c 2d6h9sKc 3cJhQs4d"));
  }

  @Test
  public void test_omaha_holdem_9874_4d6s8c8hQs_Kh6hJhJd_4c2s3dKs_7c9c3cAc_6d9d2hAh_Jc3h4h5c_Ad5s5h4s_QdKd9s7d_7s2c5dKc() {
    assertEquals(
      "7c9c3cAc Jc3h4h5c 4c2s3dKs Ad5s5h4s 6d9d2hAh Kh6hJhJd QdKd9s7d 7s2c5dKc",
      Solver.process("omaha-holdem 4d6s8c8hQs Kh6hJhJd 4c2s3dKs 7c9c3cAc 6d9d2hAh Jc3h4h5c Ad5s5h4s QdKd9s7d 7s2c5dKc"));
  }

  @Test
  public void test_omaha_holdem_9875_6s8sAsJcKh_JdQs7cAc_5h9d4d9h_9s7sTc5s_7h2d5cKs_3d6dTs5d_6cQh8h4h() {
    assertEquals(
      "3d6dTs5d 5h9d4d9h 7h2d5cKs 6cQh8h4h JdQs7cAc 9s7sTc5s",
      Solver.process("omaha-holdem 6s8sAsJcKh JdQs7cAc 5h9d4d9h 9s7sTc5s 7h2d5cKs 3d6dTs5d 6cQh8h4h"));
  }

  @Test
  public void test_omaha_holdem_9876_2h5d9dAdTc_9h6s4h7h_2dQhKsTd_8d6c2cJs_4d8h3c5s_QcJcQs5h() {
    assertEquals(
      "8d6c2cJs 9h6s4h7h QcJcQs5h 4d8h3c5s 2dQhKsTd",
      Solver.process("omaha-holdem 2h5d9dAdTc 9h6s4h7h 2dQhKsTd 8d6c2cJs 4d8h3c5s QcJcQs5h"));
  }

  @Test
  public void test_omaha_holdem_9877_3s4s5c9cKd_Kc2d3h8h_TsTd2hQd_9d7d8dJc_KsQcJd4d_As5h6s4c_Ah2c8c9h_6c7hJsTc() {
    assertEquals(
      "9d7d8dJc TsTd2hQd As5h6s4c Kc2d3h8h KsQcJd4d Ah2c8c9h 6c7hJsTc",
      Solver.process("omaha-holdem 3s4s5c9cKd Kc2d3h8h TsTd2hQd 9d7d8dJc KsQcJd4d As5h6s4c Ah2c8c9h 6c7hJsTc"));
  }

  @Test
  public void test_omaha_holdem_9878_3s5d5s7hAc_Kh6s6cKd_4dTs3h3d_9sJdTdJc_6hKc8s2h_7sJs9d4s() {
    assertEquals(
      "6hKc8s2h 7sJs9d4s 9sJdTdJc Kh6s6cKd 4dTs3h3d",
      Solver.process("omaha-holdem 3s5d5s7hAc Kh6s6cKd 4dTs3h3d 9sJdTdJc 6hKc8s2h 7sJs9d4s"));
  }

  @Test
  public void test_omaha_holdem_9879_2c6d8sJcQs_Td9sAs9c_7cKh4c5s_7dQhKs8h() {
    assertEquals(
      "7cKh4c5s 7dQhKs8h Td9sAs9c",
      Solver.process("omaha-holdem 2c6d8sJcQs Td9sAs9c 7cKh4c5s 7dQhKs8h"));
  }

  @Test
  public void test_omaha_holdem_9880_3s5c7cJsKh_AhAdJh2s_6s9hAs8s_5s3c2c6d_8cAcKsJd_6c4dQd7s_5hQcTd2d() {
    assertEquals(
      "6s9hAs8s 5hQcTd2d AhAdJh2s 5s3c2c6d 8cAcKsJd 6c4dQd7s",
      Solver.process("omaha-holdem 3s5c7cJsKh AhAdJh2s 6s9hAs8s 5s3c2c6d 8cAcKsJd 6c4dQd7s 5hQcTd2d"));
  }

  @Test
  public void test_omaha_holdem_9881_5d5h6hAsKc_Ad7h9sKh_Jc6dQs7d() {
    assertEquals(
      "Jc6dQs7d Ad7h9sKh",
      Solver.process("omaha-holdem 5d5h6hAsKc Ad7h9sKh Jc6dQs7d"));
  }

  @Test
  public void test_omaha_holdem_9882_2s8h8sJhKs_JsAs4c3d_QsTsThAd_QcAh5c9c() {
    assertEquals(
      "QcAh5c9c QsTsThAd JsAs4c3d",
      Solver.process("omaha-holdem 2s8h8sJhKs JsAs4c3d QsTsThAd QcAh5c9c"));
  }

  @Test
  public void test_omaha_holdem_9883_2h5c5hJdKd_4c3c9c6d_Ks5sQh2d_8dQd8hTh_7dKcKh4h_AdAsTd2s_9dTs7cQs() {
    assertEquals(
      "4c3c9c6d 9dTs7cQs 8dQd8hTh AdAsTd2s Ks5sQh2d 7dKcKh4h",
      Solver.process("omaha-holdem 2h5c5hJdKd 4c3c9c6d Ks5sQh2d 8dQd8hTh 7dKcKh4h AdAsTd2s 9dTs7cQs"));
  }

  @Test
  public void test_omaha_holdem_9884_AdAhAsJsTs_2h5s5d4s_4cTc4hJh_2dJdJc7c_2cQs5c9h_3dAcTd8c_3cKh7s6s() {
    assertEquals(
      "2cQs5c9h 3cKh7s6s 4cTc4hJh 2h5s5d4s 2dJdJc7c 3dAcTd8c",
      Solver.process("omaha-holdem AdAhAsJsTs 2h5s5d4s 4cTc4hJh 2dJdJc7c 2cQs5c9h 3dAcTd8c 3cKh7s6s"));
  }

  @Test
  public void test_omaha_holdem_9885_2c3c5cQdTh_8c9c7d4d_3dAc6h8h_Jd4c2s8s_3sJh7c6d() {
    assertEquals(
      "Jd4c2s8s 3sJh7c6d 3dAc6h8h 8c9c7d4d",
      Solver.process("omaha-holdem 2c3c5cQdTh 8c9c7d4d 3dAc6h8h Jd4c2s8s 3sJh7c6d"));
  }

  @Test
  public void test_omaha_holdem_9886_3cAcAsKsQc_Tc6dQd3s_5sKc7d6c_3hJc7h5d_Qs5hTh8d_8h2c9s3d_2hJs2dKd_AhJh7s9d() {
    assertEquals(
      "8h2c9s3d 3hJc7h5d Qs5hTh8d=Tc6dQd3s 2hJs2dKd AhJh7s9d 5sKc7d6c",
      Solver.process("omaha-holdem 3cAcAsKsQc Tc6dQd3s 5sKc7d6c 3hJc7h5d Qs5hTh8d 8h2c9s3d 2hJs2dKd AhJh7s9d"));
  }

  @Test
  public void test_omaha_holdem_9887_7c8d8hAsTs_2c4dTcAd_KsQc5c7h_4s6h4hQh() {
    assertEquals(
      "4s6h4hQh KsQc5c7h 2c4dTcAd",
      Solver.process("omaha-holdem 7c8d8hAsTs 2c4dTcAd KsQc5c7h 4s6h4hQh"));
  }

  @Test
  public void test_omaha_holdem_9888_3d7c8cKcQd_2hAd5s5c_Ah2c8hQc_Jd7dTh7s_9s3s2s7h_4c4s8dTs_4hQhQs8s_6d5dJs4d_KsKh6s5h_6h9c6cAc() {
    assertEquals(
      "6d5dJs4d 2hAd5s5c 4c4s8dTs 9s3s2s7h Jd7dTh7s 4hQhQs8s KsKh6s5h Ah2c8hQc 6h9c6cAc",
      Solver.process("omaha-holdem 3d7c8cKcQd 2hAd5s5c Ah2c8hQc Jd7dTh7s 9s3s2s7h 4c4s8dTs 4hQhQs8s 6d5dJs4d KsKh6s5h 6h9c6cAc"));
  }

  @Test
  public void test_omaha_holdem_9889_2s4h6c9hTh_9c5c3h7s_9d6dJhQd_8dAdQh2d_3s3c7h8c_Ks7cTd8h() {
    assertEquals(
      "8dAdQh2d 9d6dJhQd 9c5c3h7s 3s3c7h8c=Ks7cTd8h",
      Solver.process("omaha-holdem 2s4h6c9hTh 9c5c3h7s 9d6dJhQd 8dAdQh2d 3s3c7h8c Ks7cTd8h"));
  }

  @Test
  public void test_omaha_holdem_9890_6s9d9hJcJh_5s6c9s7c_2c3h7h3d_4cQc8s7s_5cJd4s8c_5d3cAh6h_2d8dAc3s() {
    assertEquals(
      "4cQc8s7s 2d8dAc3s 2c3h7h3d 5d3cAh6h 5cJd4s8c 5s6c9s7c",
      Solver.process("omaha-holdem 6s9d9hJcJh 5s6c9s7c 2c3h7h3d 4cQc8s7s 5cJd4s8c 5d3cAh6h 2d8dAc3s"));
  }

  @Test
  public void test_omaha_holdem_9891_5s6hJdQhTs_JsKc8hTh_AcAs2c5h_8c9h4dKd_3c7d7cQc_8s5c3dTd() {
    assertEquals(
      "3c7d7cQc AcAs2c5h 8s5c3dTd JsKc8hTh 8c9h4dKd",
      Solver.process("omaha-holdem 5s6hJdQhTs JsKc8hTh AcAs2c5h 8c9h4dKd 3c7d7cQc 8s5c3dTd"));
  }

  @Test
  public void test_omaha_holdem_9892_2d8s9dKcQh_Ac8cAd8d_7h6dTc4s_9s6h3c9h_Kd3hAh4d_3dJc5sQc() {
    assertEquals(
      "7h6dTc4s 3dJc5sQc Kd3hAh4d Ac8cAd8d 9s6h3c9h",
      Solver.process("omaha-holdem 2d8s9dKcQh Ac8cAd8d 7h6dTc4s 9s6h3c9h Kd3hAh4d 3dJc5sQc"));
  }

  @Test
  public void test_omaha_holdem_9893_2s4h5c6sJc_3cAh5sJs_TdAd8cQh_Kc9d2dQc() {
    assertEquals(
      "TdAd8cQh Kc9d2dQc 3cAh5sJs",
      Solver.process("omaha-holdem 2s4h5c6sJc 3cAh5sJs TdAd8cQh Kc9d2dQc"));
  }

  @Test
  public void test_omaha_holdem_9894_2h6s9hJsTs_9c2sTd6h_7cJd2d5d_6dJh3dKc_9d7s5cTh_Kd3s8cAc_8sKh4dKs_3h4h5h5s() {
    assertEquals(
      "Kd3s8cAc 3h4h5h5s 9c2sTd6h=9d7s5cTh 7cJd2d5d 6dJh3dKc 8sKh4dKs",
      Solver.process("omaha-holdem 2h6s9hJsTs 9c2sTd6h 7cJd2d5d 6dJh3dKc 9d7s5cTh Kd3s8cAc 8sKh4dKs 3h4h5h5s"));
  }

  @Test
  public void test_omaha_holdem_9895_5h6h7cAsKd_Js6d2h4s_2cTs9d3c_8sQh7dKs_Ac5cKc4h_9s9c6sQd_3hTc2d5s_Ad7hJh3d_9h2s8dQs() {
    assertEquals(
      "2cTs9d3c 3hTc2d5s Js6d2h4s 9s9c6sQd 8sQh7dKs Ad7hJh3d Ac5cKc4h 9h2s8dQs",
      Solver.process("omaha-holdem 5h6h7cAsKd Js6d2h4s 2cTs9d3c 8sQh7dKs Ac5cKc4h 9s9c6sQd 3hTc2d5s Ad7hJh3d 9h2s8dQs"));
  }

  @Test
  public void test_omaha_holdem_9896_2s4d9hAdAs_4sTs9d4c_8d7c7d2h_JhKd3c5d() {
    assertEquals(
      "8d7c7d2h JhKd3c5d 4sTs9d4c",
      Solver.process("omaha-holdem 2s4d9hAdAs 4sTs9d4c 8d7c7d2h JhKd3c5d"));
  }

  @Test
  public void test_omaha_holdem_9897_2d8dJhKsQc_TcJcKd4s_2h9s8h8s_7hQsThKh_5dKc2cJs_8c6d7d9d_Ah3s4c6c() {
    assertEquals(
      "Ah3s4c6c 8c6d7d9d 5dKc2cJs=TcJcKd4s 7hQsThKh 2h9s8h8s",
      Solver.process("omaha-holdem 2d8dJhKsQc TcJcKd4s 2h9s8h8s 7hQsThKh 5dKc2cJs 8c6d7d9d Ah3s4c6c"));
  }

  @Test
  public void test_omaha_holdem_9898_8d9dJcTdTh_As6sKc2h_AcJd8c7h() {
    assertEquals(
      "As6sKc2h AcJd8c7h",
      Solver.process("omaha-holdem 8d9dJcTdTh As6sKc2h AcJd8c7h"));
  }

  @Test
  public void test_omaha_holdem_9899_2d8d9hJhTh_3dJd7s8s_4h2cQh9s_2s6h3hAd_5d6c9d5s_TdAs7d2h_9c8c6dKc_6sKsQdJc_TcTs4sQs() {
    assertEquals(
      "5d6c9d5s 9c8c6dKc 3dJd7s8s=TdAs7d2h TcTs4sQs 6sKsQdJc 2s6h3hAd 4h2cQh9s",
      Solver.process("omaha-holdem 2d8d9hJhTh 3dJd7s8s 4h2cQh9s 2s6h3hAd 5d6c9d5s TdAs7d2h 9c8c6dKc 6sKsQdJc TcTs4sQs"));
  }

  @Test
  public void test_omaha_holdem_9900_5h6c7hTdTh_Kc3d8cKd_AhAs4dJh_4h4cTcQh() {
    assertEquals(
      "Kc3d8cKd 4h4cTcQh AhAs4dJh",
      Solver.process("omaha-holdem 5h6c7hTdTh Kc3d8cKd AhAs4dJh 4h4cTcQh"));
  }

  @Test
  public void test_omaha_holdem_9901_4h4sJhJsTh_3d3h2hQc_9s8hQd6c_9cAh5h2c() {
    assertEquals(
      "9s8hQd6c 3d3h2hQc 9cAh5h2c",
      Solver.process("omaha-holdem 4h4sJhJsTh 3d3h2hQc 9s8hQd6c 9cAh5h2c"));
  }

  @Test
  public void test_omaha_holdem_9902_6c6s7h8sAh_KhKsKdQs_4cJdAs3s_Ts8d8cJs_3d9sTd6h() {
    assertEquals(
      "KhKsKdQs 4cJdAs3s 3d9sTd6h Ts8d8cJs",
      Solver.process("omaha-holdem 6c6s7h8sAh KhKsKdQs 4cJdAs3s Ts8d8cJs 3d9sTd6h"));
  }

  @Test
  public void test_omaha_holdem_9903_2d4h4s5d7s_Qs7hKh3c_6dJh6h8s_5h7cAd8d_2c9hAh4c_Tc2hTd3d_8cJc4dKs_5sTh2s5c() {
    assertEquals(
      "Qs7hKh3c 5h7cAd8d Tc2hTd3d 8cJc4dKs 6dJh6h8s 2c9hAh4c 5sTh2s5c",
      Solver.process("omaha-holdem 2d4h4s5d7s Qs7hKh3c 6dJh6h8s 5h7cAd8d 2c9hAh4c Tc2hTd3d 8cJc4dKs 5sTh2s5c"));
  }

  @Test
  public void test_omaha_holdem_9904_3h5c7sAsQd_5s2d9c8d_Ts5hAd9h_Qs6h2hQc_6d8s4c2s() {
    assertEquals(
      "5s2d9c8d Ts5hAd9h Qs6h2hQc 6d8s4c2s",
      Solver.process("omaha-holdem 3h5c7sAsQd 5s2d9c8d Ts5hAd9h Qs6h2hQc 6d8s4c2s"));
  }

  @Test
  public void test_omaha_holdem_9905_3h6dAhJsTd_4c9h3sAc_5sJh8d2h_6sKsQs4s_Kd9c2sQd_4d5cKhTh_8h5dTcAs_Qc9d3d8s_5h3cJc2c() {
    assertEquals(
      "Qc9d3d8s 4d5cKhTh 5sJh8d2h 5h3cJc2c 4c9h3sAc 8h5dTcAs 6sKsQs4s=Kd9c2sQd",
      Solver.process("omaha-holdem 3h6dAhJsTd 4c9h3sAc 5sJh8d2h 6sKsQs4s Kd9c2sQd 4d5cKhTh 8h5dTcAs Qc9d3d8s 5h3cJc2c"));
  }

  @Test
  public void test_omaha_holdem_9906_2c2h5c7s8h_7hTh4sJh_5s6c9hQh_QcKc6d8d() {
    assertEquals(
      "7hTh4sJh QcKc6d8d 5s6c9hQh",
      Solver.process("omaha-holdem 2c2h5c7s8h 7hTh4sJh 5s6c9hQh QcKc6d8d"));
  }

  @Test
  public void test_omaha_holdem_9907_3d3h5s7s8d_ThTs5h4c_TdJs4hKd_6h8c9h9s_9c8h6sKs_5dAc2d4d_Jc8s2h7c() {
    assertEquals(
      "TdJs4hKd 5dAc2d4d Jc8s2h7c ThTs5h4c 6h8c9h9s=9c8h6sKs",
      Solver.process("omaha-holdem 3d3h5s7s8d ThTs5h4c TdJs4hKd 6h8c9h9s 9c8h6sKs 5dAc2d4d Jc8s2h7c"));
  }

  @Test
  public void test_omaha_holdem_9908_2c3s5d6sTs_AcJd7hQd_Td6cAsAd_9sJc6hKd_6dTc8d2h_Qs7sJs5c_Kh9c8h8s() {
    assertEquals(
      "AcJd7hQd 9sJc6hKd Kh9c8h8s 6dTc8d2h=Td6cAsAd Qs7sJs5c",
      Solver.process("omaha-holdem 2c3s5d6sTs AcJd7hQd Td6cAsAd 9sJc6hKd 6dTc8d2h Qs7sJs5c Kh9c8h8s"));
  }

  @Test
  public void test_omaha_holdem_9909_3h5h7d7hTs_2sKc9c6d_KhAcAd8d() {
    assertEquals(
      "2sKc9c6d KhAcAd8d",
      Solver.process("omaha-holdem 3h5h7d7hTs 2sKc9c6d KhAcAd8d"));
  }

  @Test
  public void test_omaha_holdem_9910_2h3h9dAcJd_6s4dKh5c_Tc8c8h3c_4c7dJc7s_TdAh8s5h_2c6d9c2s_Th6hAs9h_3sQcKs9s() {
    assertEquals(
      "Tc8c8h3c 4c7dJc7s TdAh8s5h 3sQcKs9s Th6hAs9h 2c6d9c2s 6s4dKh5c",
      Solver.process("omaha-holdem 2h3h9dAcJd 6s4dKh5c Tc8c8h3c 4c7dJc7s TdAh8s5h 2c6d9c2s Th6hAs9h 3sQcKs9s"));
  }

  @Test
  public void test_omaha_holdem_9911_4h4s9sJhKs_8cAd4d7h_QsTc5s3h_3dAh6cJd_2c3c8h9h_KhTsKd9c_2hKc8dAs_4c2sJc6d() {
    assertEquals(
      "2c3c8h9h 3dAh6cJd 2hKc8dAs 8cAd4d7h QsTc5s3h 4c2sJc6d KhTsKd9c",
      Solver.process("omaha-holdem 4h4s9sJhKs 8cAd4d7h QsTc5s3h 3dAh6cJd 2c3c8h9h KhTsKd9c 2hKc8dAs 4c2sJc6d"));
  }

  @Test
  public void test_omaha_holdem_9912_3d9hAcJdKc_2c7hTc5c_2dTh5dAh_As7d8s6h_QsJhJc9c_5sAdKsKh_8d3sJsTd_Qh2sKdQc() {
    assertEquals(
      "2c7hTc5c Qh2sKdQc As7d8s6h 2dTh5dAh 8d3sJsTd QsJhJc9c 5sAdKsKh",
      Solver.process("omaha-holdem 3d9hAcJdKc 2c7hTc5c 2dTh5dAh As7d8s6h QsJhJc9c 5sAdKsKh 8d3sJsTd Qh2sKdQc"));
  }

  @Test
  public void test_omaha_holdem_9913_5h8dKcQsTd_Jd2s4dJh_4s9cQc2d_8sTc3c4c() {
    assertEquals(
      "Jd2s4dJh 4s9cQc2d 8sTc3c4c",
      Solver.process("omaha-holdem 5h8dKcQsTd Jd2s4dJh 4s9cQc2d 8sTc3c4c"));
  }

  @Test
  public void test_omaha_holdem_9914_7h9h9sAdQc_8hJdKs7s_8s6sKh4c_QsAhQd5h_6c3c6hTc_Qh5c3hAs() {
    assertEquals(
      "8s6sKh4c 6c3c6hTc 8hJdKs7s Qh5c3hAs QsAhQd5h",
      Solver.process("omaha-holdem 7h9h9sAdQc 8hJdKs7s 8s6sKh4c QsAhQd5h 6c3c6hTc Qh5c3hAs"));
  }

  @Test
  public void test_omaha_holdem_9915_4c4s8sQcTd_8h5cQs3s_Qh2dTc9s_3h6d6hAd_9dJs2h9c_5d6s9h5h_3c5sAsKc() {
    assertEquals(
      "3c5sAsKc 5d6s9h5h 3h6d6hAd 8h5cQs3s Qh2dTc9s 9dJs2h9c",
      Solver.process("omaha-holdem 4c4s8sQcTd 8h5cQs3s Qh2dTc9s 3h6d6hAd 9dJs2h9c 5d6s9h5h 3c5sAsKc"));
  }

  @Test
  public void test_omaha_holdem_9916_2s6h9cAcTs_5d3d3sJc_Jd7c5h5s_9sAsAd4s() {
    assertEquals(
      "5d3d3sJc Jd7c5h5s 9sAsAd4s",
      Solver.process("omaha-holdem 2s6h9cAcTs 5d3d3sJc Jd7c5h5s 9sAsAd4s"));
  }

  @Test
  public void test_omaha_holdem_9917_4s6h7s8h9d_AdJc3c6c_Js9c5c5s_Qd2c6s5d_KhQhTc2h_8s4hTsQs_6dAsKc9s() {
    assertEquals(
      "KhQhTc2h AdJc3c6c 6dAsKc9s Js9c5c5s=Qd2c6s5d 8s4hTsQs",
      Solver.process("omaha-holdem 4s6h7s8h9d AdJc3c6c Js9c5c5s Qd2c6s5d KhQhTc2h 8s4hTsQs 6dAsKc9s"));
  }

  @Test
  public void test_omaha_holdem_9918_2h3d3h5d6h_6s4cJhTc_Qh9cAs7d_QsTsKc8d_2cQcAcJc() {
    assertEquals(
      "QsTsKc8d Qh9cAs7d 2cQcAcJc 6s4cJhTc",
      Solver.process("omaha-holdem 2h3d3h5d6h 6s4cJhTc Qh9cAs7d QsTsKc8d 2cQcAcJc"));
  }

  @Test
  public void test_omaha_holdem_9919_2c2h9sKcQh_TdJs3h4h_7c8sKs8c_6dKd3c6h_JdAs4s9d_3d2d4cKh() {
    assertEquals(
      "JdAs4s9d 6dKd3c6h 7c8sKs8c TdJs3h4h 3d2d4cKh",
      Solver.process("omaha-holdem 2c2h9sKcQh TdJs3h4h 7c8sKs8c 6dKd3c6h JdAs4s9d 3d2d4cKh"));
  }

  @Test
  public void test_omaha_holdem_9920_5dJhQcQdQs_Kc6sAh8d_Ks4d5s7s_7cTs4sTd_8h7dAd8s() {
    assertEquals(
      "Ks4d5s7s Kc6sAh8d 8h7dAd8s 7cTs4sTd",
      Solver.process("omaha-holdem 5dJhQcQdQs Kc6sAh8d Ks4d5s7s 7cTs4sTd 8h7dAd8s"));
  }

  @Test
  public void test_omaha_holdem_9921_4c5d5hQcTh_AsJs8d5c_2cAd7d4h_9h6cTdAh_6h9c9dKh_8cKs7h4d_3hTs3cJd() {
    assertEquals(
      "8cKs7h4d 2cAd7d4h 6h9c9dKh 3hTs3cJd 9h6cTdAh AsJs8d5c",
      Solver.process("omaha-holdem 4c5d5hQcTh AsJs8d5c 2cAd7d4h 9h6cTdAh 6h9c9dKh 8cKs7h4d 3hTs3cJd"));
  }

  @Test
  public void test_omaha_holdem_9922_2c4h9dJdJs_3h3c9h6s_6c5hTdAc_7s7cTc9s_6dKs7d5d_QdKd3sKh_4d7h8cTs_AsAhAd8d() {
    assertEquals(
      "6dKs7d5d 6c5hTdAc 4d7h8cTs 3h3c9h6s 7s7cTc9s QdKd3sKh AsAhAd8d",
      Solver.process("omaha-holdem 2c4h9dJdJs 3h3c9h6s 6c5hTdAc 7s7cTc9s 6dKs7d5d QdKd3sKh 4d7h8cTs AsAhAd8d"));
  }

  @Test
  public void test_omaha_holdem_9923_4d8h9hAhTd_QcAc2hKs_7s2dTh4h_7c9d7hKd_7d3cJh3h_TsQd5dJc_3dQsJs3s_Jd6h8sTc_2s5hAsAd_Qh5c6s5s() {
    assertEquals(
      "Qh5c6s5s 7c9d7hKd QcAc2hKs Jd6h8sTc 2s5hAsAd 3dQsJs3s=TsQd5dJc 7s2dTh4h 7d3cJh3h",
      Solver.process("omaha-holdem 4d8h9hAhTd QcAc2hKs 7s2dTh4h 7c9d7hKd 7d3cJh3h TsQd5dJc 3dQsJs3s Jd6h8sTc 2s5hAsAd Qh5c6s5s"));
  }

  @Test
  public void test_omaha_holdem_9924_4h7c8hAcJs_TdTs3s7d_6sQsTc9c_2d2s5dAh_Kh8dJd8c_2hKc6d4d_4c5hQd7h_QcJh8s9h_6hKsThQh_7s3c3hKd() {
    assertEquals(
      "6hKsThQh 2hKc6d4d 7s3c3hKd TdTs3s7d 2d2s5dAh 4c5hQd7h QcJh8s9h Kh8dJd8c 6sQsTc9c",
      Solver.process("omaha-holdem 4h7c8hAcJs TdTs3s7d 6sQsTc9c 2d2s5dAh Kh8dJd8c 2hKc6d4d 4c5hQd7h QcJh8s9h 6hKsThQh 7s3c3hKd"));
  }

  @Test
  public void test_omaha_holdem_9925_4d5d6h9hTc_9c4h3c3h_As7sKhJc_KsQd8s8d_Qh2d3sKd_Js6s4cAc_4sQc3d2h() {
    assertEquals(
      "As7sKhJc KsQd8s8d Js6s4cAc 9c4h3c3h 4sQc3d2h=Qh2d3sKd",
      Solver.process("omaha-holdem 4d5d6h9hTc 9c4h3c3h As7sKhJc KsQd8s8d Qh2d3sKd Js6s4cAc 4sQc3d2h"));
  }

  @Test
  public void test_omaha_holdem_9926_4c6s8dJhKd_6h8s5cQc_8hKs6dJd_3s9h9s2h_Kh4hQd2d_3c4dQh7c_Jc2c5s2s_TdAhJsQs_3hAd8c9c() {
    assertEquals(
      "3c4dQh7c 3hAd8c9c 3s9h9s2h Jc2c5s2s TdAhJsQs 6h8s5cQc Kh4hQd2d 8hKs6dJd",
      Solver.process("omaha-holdem 4c6s8dJhKd 6h8s5cQc 8hKs6dJd 3s9h9s2h Kh4hQd2d 3c4dQh7c Jc2c5s2s TdAhJsQs 3hAd8c9c"));
  }

  @Test
  public void test_omaha_holdem_9927_2c3d3h4dTh_9d8dAd9s_7hJcAh2s() {
    assertEquals(
      "7hJcAh2s 9d8dAd9s",
      Solver.process("omaha-holdem 2c3d3h4dTh 9d8dAd9s 7hJcAh2s"));
  }

  @Test
  public void test_omaha_holdem_9928_2s3h8c8hKh_TsQcKsJd_QsAh9sJc_8s5s6c4h() {
    assertEquals(
      "QsAh9sJc TsQcKsJd 8s5s6c4h",
      Solver.process("omaha-holdem 2s3h8c8hKh TsQcKsJd QsAh9sJc 8s5s6c4h"));
  }

  @Test
  public void test_omaha_holdem_9929_2s7h8h9h9s_9cTcKdKc_3hQs8dQd_8cJdJhKs_ThAh6s4h_5d6d5h4c() {
    assertEquals(
      "8cJdJhKs 3hQs8dQd 9cTcKdKc 5d6d5h4c ThAh6s4h",
      Solver.process("omaha-holdem 2s7h8h9h9s 9cTcKdKc 3hQs8dQd 8cJdJhKs ThAh6s4h 5d6d5h4c"));
  }

  @Test
  public void test_omaha_holdem_9930_2s9sKhKsQh_Th5s6sTs_4dAd4sAc_3d3h9hJh_3c8sTd6h_7c4hQc8c_2hJs2d5h_5d7h9d9c() {
    assertEquals(
      "3c8sTd6h 3d3h9hJh 7c4hQc8c 4dAd4sAc Th5s6sTs 2hJs2d5h 5d7h9d9c",
      Solver.process("omaha-holdem 2s9sKhKsQh Th5s6sTs 4dAd4sAc 3d3h9hJh 3c8sTd6h 7c4hQc8c 2hJs2d5h 5d7h9d9c"));
  }

  @Test
  public void test_omaha_holdem_9931_2c4c6sAsTs_3d9sKc5d_2s3s3c7d_3hAcJs9c() {
    assertEquals(
      "3hAcJs9c 3d9sKc5d 2s3s3c7d",
      Solver.process("omaha-holdem 2c4c6sAsTs 3d9sKc5d 2s3s3c7d 3hAcJs9c"));
  }

  @Test
  public void test_omaha_holdem_9932_2s3h5d8cQc_Jd7sAhJc_Jh7hAs9c_7c5c4hTs() {
    assertEquals(
      "Jh7hAs9c 7c5c4hTs Jd7sAhJc",
      Solver.process("omaha-holdem 2s3h5d8cQc Jd7sAhJc Jh7hAs9c 7c5c4hTs"));
  }

  @Test
  public void test_omaha_holdem_9933_2h4d4s5d7s_9cAh2sAc_9sQd3s3d_6s8h7c5c_JdJh8cTh_2dTc6d4h_Ad6c7hAs_Qh6hJcKc_Ks4c5h2c_3c9d3h8d() {
    assertEquals(
      "Qh6hJcKc 3c9d3h8d=9sQd3s3d JdJh8cTh 9cAh2sAc=Ad6c7hAs 6s8h7c5c 2dTc6d4h Ks4c5h2c",
      Solver.process("omaha-holdem 2h4d4s5d7s 9cAh2sAc 9sQd3s3d 6s8h7c5c JdJh8cTh 2dTc6d4h Ad6c7hAs Qh6hJcKc Ks4c5h2c 3c9d3h8d"));
  }

  @Test
  public void test_omaha_holdem_9934_2h6h6s9hJh_6cQc3s5s_8cKcJsJd_TdQd6d2s_7c8s3d7s_Tc5hAc5d_2c8dQh4d_Ad7hKhKs() {
    assertEquals(
      "2c8dQh4d Tc5hAc5d 7c8s3d7s 6cQc3s5s Ad7hKhKs TdQd6d2s 8cKcJsJd",
      Solver.process("omaha-holdem 2h6h6s9hJh 6cQc3s5s 8cKcJsJd TdQd6d2s 7c8s3d7s Tc5hAc5d 2c8dQh4d Ad7hKhKs"));
  }

  @Test
  public void test_omaha_holdem_9935_2d4sKcQcTd_Js9s3h9h_5h7hQh6d() {
    assertEquals(
      "5h7hQh6d Js9s3h9h",
      Solver.process("omaha-holdem 2d4sKcQcTd Js9s3h9h 5h7hQh6d"));
  }

  @Test
  public void test_omaha_holdem_9936_4h7s9hQcQs_Jc6c3h7c_TcQd8s9s_4cAhKdAs_Qh2sJs9c_4d5cKs4s_Th8h5hTs() {
    assertEquals(
      "Jc6c3h7c Th8h5hTs 4cAhKdAs 4d5cKs4s Qh2sJs9c=TcQd8s9s",
      Solver.process("omaha-holdem 4h7s9hQcQs Jc6c3h7c TcQd8s9s 4cAhKdAs Qh2sJs9c 4d5cKs4s Th8h5hTs"));
  }

  @Test
  public void test_omaha_holdem_9937_3d8d8s9d9h_JcKc8c7c_5c4dQs8h_2cAd7sTd_2s2dTsKh_Kd5s6d6s() {
    assertEquals(
      "2s2dTsKh 5c4dQs8h JcKc8c7c Kd5s6d6s 2cAd7sTd",
      Solver.process("omaha-holdem 3d8d8s9d9h JcKc8c7c 5c4dQs8h 2cAd7sTd 2s2dTsKh Kd5s6d6s"));
  }

  @Test
  public void test_omaha_holdem_9938_7c7h9hAdKc_9sQs6cKh_TcJh2hTh_3dQh8dJs_Jd8h8cTd_2d3sQc4h_5d9c3c7d_6s5hTs8s_6hKs2s9d() {
    assertEquals(
      "6s5hTs8s 2d3sQc4h 3dQh8dJs Jd8h8cTd TcJh2hTh 6hKs2s9d=9sQs6cKh 5d9c3c7d",
      Solver.process("omaha-holdem 7c7h9hAdKc 9sQs6cKh TcJh2hTh 3dQh8dJs Jd8h8cTd 2d3sQc4h 5d9c3c7d 6s5hTs8s 6hKs2s9d"));
  }

  @Test
  public void test_omaha_holdem_9939_2d3hJcJdQs_9sJs6d6c_JhQc2hAd_As8d9cAh_8c3sKsTc_KhTh4d6h_2s3d6s8h_9dKd2cQd_5sTd7d8s() {
    assertEquals(
      "5sTd7d8s KhTh4d6h 2s3d6s8h 8c3sKsTc 9dKd2cQd As8d9cAh 9sJs6d6c JhQc2hAd",
      Solver.process("omaha-holdem 2d3hJcJdQs 9sJs6d6c JhQc2hAd As8d9cAh 8c3sKsTc KhTh4d6h 2s3d6s8h 9dKd2cQd 5sTd7d8s"));
  }

  @Test
  public void test_omaha_holdem_9940_2h6h7hKdTs_2sQd9cKs_8h5cJcJh() {
    assertEquals(
      "2sQd9cKs 8h5cJcJh",
      Solver.process("omaha-holdem 2h6h7hKdTs 2sQd9cKs 8h5cJcJh"));
  }

  @Test
  public void test_omaha_holdem_9941_4s8sJsQhTd_As2sJdKc_KdQs4c7c() {
    assertEquals(
      "KdQs4c7c As2sJdKc",
      Solver.process("omaha-holdem 4s8sJsQhTd As2sJdKc KdQs4c7c"));
  }

  @Test
  public void test_omaha_holdem_9942_2c6c9cKcKh_3sAhKs3c_Qh8d5d2s_8h3d2hAc_Jh8sJc4c_Ts6sJdKd_7c9d6dTd_4h6h9h4s_QdJs9s5h_QcTh8cAd() {
    assertEquals(
      "Qh8d5d2s 8h3d2hAc 4h6h9h4s 7c9d6dTd QdJs9s5h 3sAhKs3c Jh8sJc4c QcTh8cAd Ts6sJdKd",
      Solver.process("omaha-holdem 2c6c9cKcKh 3sAhKs3c Qh8d5d2s 8h3d2hAc Jh8sJc4c Ts6sJdKd 7c9d6dTd 4h6h9h4s QdJs9s5h QcTh8cAd"));
  }

  @Test
  public void test_omaha_holdem_9943_3h4h6dJsQc_2s2c8c7c_Kd9sTdKc_8dAhTh3c_Qh2dAc5c_AdQd5d9c_7h6h4d5h_9h6s2hQs_9d4sJc8s() {
    assertEquals(
      "2s2c8c7c 8dAhTh3c AdQd5d9c Kd9sTdKc 9d4sJc8s 9h6s2hQs Qh2dAc5c 7h6h4d5h",
      Solver.process("omaha-holdem 3h4h6dJsQc 2s2c8c7c Kd9sTdKc 8dAhTh3c Qh2dAc5c AdQd5d9c 7h6h4d5h 9h6s2hQs 9d4sJc8s"));
  }

  @Test
  public void test_omaha_holdem_9944_5c8hAcJhTh_Jd7dQcTs_QhQs6c2s_KhQd3s8d_4cJsAsTd_2h6h9h3h_7sTc7hKs_5h8s5s4s_JcAd7cAh_4h6dKd3d() {
    assertEquals(
      "4h6dKd3d 7sTc7hKs QhQs6c2s Jd7dQcTs 4cJsAsTd 5h8s5s4s JcAd7cAh KhQd3s8d 2h6h9h3h",
      Solver.process("omaha-holdem 5c8hAcJhTh Jd7dQcTs QhQs6c2s KhQd3s8d 4cJsAsTd 2h6h9h3h 7sTc7hKs 5h8s5s4s JcAd7cAh 4h6dKd3d"));
  }

  @Test
  public void test_omaha_holdem_9945_2c2h9dJcTh_7sAhJdQs_Ad7dQcTd_Js6h9cTs_Ks8h6c9s_6s3dKdAs_AcQh9h5s_3hQd3cTc_8sKc2d5d() {
    assertEquals(
      "6s3dKdAs Ks8h6c9s AcQh9h5s 3hQd3cTc Ad7dQcTd 7sAhJdQs Js6h9cTs 8sKc2d5d",
      Solver.process("omaha-holdem 2c2h9dJcTh 7sAhJdQs Ad7dQcTd Js6h9cTs Ks8h6c9s 6s3dKdAs AcQh9h5s 3hQd3cTc 8sKc2d5d"));
  }

  @Test
  public void test_omaha_holdem_9946_2d5h5s6dJd_Jh7dKd4s_Qc9cKs8s_2h5cJc4h_6hAcTs6s_Js4c8dAh_7hQhQs9s_TdKh7s7c() {
    assertEquals(
      "Qc9cKs8s TdKh7s7c Js4c8dAh 7hQhQs9s Jh7dKd4s 2h5cJc4h 6hAcTs6s",
      Solver.process("omaha-holdem 2d5h5s6dJd Jh7dKd4s Qc9cKs8s 2h5cJc4h 6hAcTs6s Js4c8dAh 7hQhQs9s TdKh7s7c"));
  }

  @Test
  public void test_omaha_holdem_9947_2s4s6s8cJh_5sKc5h4h_9c2h8h8s_Js5c3d7s_Qh6dTcAs_2c4dTd9h_Th3sJc9d_7hAhAc6h() {
    assertEquals(
      "5sKc5h4h Qh6dTcAs Th3sJc9d 7hAhAc6h 2c4dTd9h 9c2h8h8s Js5c3d7s",
      Solver.process("omaha-holdem 2s4s6s8cJh 5sKc5h4h 9c2h8h8s Js5c3d7s Qh6dTcAs 2c4dTd9h Th3sJc9d 7hAhAc6h"));
  }

  @Test
  public void test_omaha_holdem_9948_2h6h7d9dQc_KcQs5cTd_Ac2d3s7h_7s6c2c7c_Kh8h5s9s_ThKd3d4h() {
    assertEquals(
      "ThKd3d4h KcQs5cTd Ac2d3s7h 7s6c2c7c Kh8h5s9s",
      Solver.process("omaha-holdem 2h6h7d9dQc KcQs5cTd Ac2d3s7h 7s6c2c7c Kh8h5s9s ThKd3d4h"));
  }

  @Test
  public void test_omaha_holdem_9949_3h5c7dJcJs_Jh5dQh9h_6h4d6d8s_2h5s6c9d_3s8cJdTc() {
    assertEquals(
      "2h5s6c9d 6h4d6d8s 3s8cJdTc Jh5dQh9h",
      Solver.process("omaha-holdem 3h5c7dJcJs Jh5dQh9h 6h4d6d8s 2h5s6c9d 3s8cJdTc"));
  }

  @Test
  public void test_omaha_holdem_9950_2d4h5d5sKh_3s7hQh4d_9d8d9h2c() {
    assertEquals(
      "3s7hQh4d 9d8d9h2c",
      Solver.process("omaha-holdem 2d4h5d5sKh 3s7hQh4d 9d8d9h2c"));
  }

  @Test
  public void test_omaha_holdem_9951_3h7d8dKsQd_2d8sKdQh_4h8c4d7h_8h9sKh7c_Ad6c5c5d_9h6h2sKc_TdAc3d9c_Jh9dQs3s_2cAs4sTs() {
    assertEquals(
      "2cAs4sTs 9h6h2sKc 4h8c4d7h Jh9dQs3s 8h9sKh7c TdAc3d9c 2d8sKdQh Ad6c5c5d",
      Solver.process("omaha-holdem 3h7d8dKsQd 2d8sKdQh 4h8c4d7h 8h9sKh7c Ad6c5c5d 9h6h2sKc TdAc3d9c Jh9dQs3s 2cAs4sTs"));
  }

  @Test
  public void test_omaha_holdem_9952_4c5c7s9cTs_4d5d2h6d_As4hQcJc_3hKdTh8d_Qh7dAcTd() {
    assertEquals(
      "3hKdTh8d 4d5d2h6d Qh7dAcTd As4hQcJc",
      Solver.process("omaha-holdem 4c5c7s9cTs 4d5d2h6d As4hQcJc 3hKdTh8d Qh7dAcTd"));
  }

  @Test
  public void test_omaha_holdem_9953_4d5c8cKcTs_9h3c7c3s_4sQsAd7s_2sJs9sQd_QcThKsAc_9cTd6d4c_2dQhAhTc_9d2c5d6h_Jc7h8s6c_8d3dKh5h() {
    assertEquals(
      "2sJs9sQd 4sQsAd7s 9d2c5d6h 2dQhAhTc 8d3dKh5h 9h3c7c3s 9cTd6d4c Jc7h8s6c QcThKsAc",
      Solver.process("omaha-holdem 4d5c8cKcTs 9h3c7c3s 4sQsAd7s 2sJs9sQd QcThKsAc 9cTd6d4c 2dQhAhTc 9d2c5d6h Jc7h8s6c 8d3dKh5h"));
  }

  @Test
  public void test_omaha_holdem_9954_4h8hJcKdTd_9s6d3sJd_2d8d7cTc_As2c8s7d_Ts5dKs4d_8c4cTh7s_6sKh7h6c() {
    assertEquals(
      "As2c8s7d 9s6d3sJd 6sKh7h6c 2d8d7cTc=8c4cTh7s Ts5dKs4d",
      Solver.process("omaha-holdem 4h8hJcKdTd 9s6d3sJd 2d8d7cTc As2c8s7d Ts5dKs4d 8c4cTh7s 6sKh7h6c"));
  }

  @Test
  public void test_omaha_holdem_9955_9c9sKhQcQh_8c4h4s7c_Qs2s5h2d_3hTcAh7d_3dJsTdAc_Kc4dJcAd_6h2c6s9h_Qd5c8hKs_As2h8dTs_Kd4c9dTh() {
    assertEquals(
      "3hTcAh7d=As2h8dTs 8c4h4s7c Kc4dJcAd 6h2c6s9h Qs2s5h2d 3dJsTdAc Kd4c9dTh Qd5c8hKs",
      Solver.process("omaha-holdem 9c9sKhQcQh 8c4h4s7c Qs2s5h2d 3hTcAh7d 3dJsTdAc Kc4dJcAd 6h2c6s9h Qd5c8hKs As2h8dTs Kd4c9dTh"));
  }

  @Test
  public void test_omaha_holdem_9956_3d7c7sAdQc_2d4c7h6h_2h5sJdAs_4dQsQd3c_2c6cTd5h_8h8sKc4h_3hKdJcKs_JsAcTs2s_5d9d6d8c() {
    assertEquals(
      "5d9d6d8c 2c6cTd5h 8h8sKc4h 3hKdJcKs 2h5sJdAs=JsAcTs2s 2d4c7h6h 4dQsQd3c",
      Solver.process("omaha-holdem 3d7c7sAdQc 2d4c7h6h 2h5sJdAs 4dQsQd3c 2c6cTd5h 8h8sKc4h 3hKdJcKs JsAcTs2s 5d9d6d8c"));
  }

  @Test
  public void test_omaha_holdem_9957_3d6c6h9c9h_7h8s3hJs_9d8h5cJd_Tc5d4sQs_7c9s6dQd_Ac6s4cKd() {
    assertEquals(
      "Tc5d4sQs 7h8s3hJs Ac6s4cKd 9d8h5cJd 7c9s6dQd",
      Solver.process("omaha-holdem 3d6c6h9c9h 7h8s3hJs 9d8h5cJd Tc5d4sQs 7c9s6dQd Ac6s4cKd"));
  }

  @Test
  public void test_omaha_holdem_9958_3h5c6c8sAs_9h4d9d8h_5dKs6s2s_6hQh6dJs_7s3sQc5s_JhJcAhTd_Kc4cKdAd_9cTs7h8d_8cKhQs7c_4h3d2dQd() {
    assertEquals(
      "8cKhQs7c 9h4d9d8h JhJcAhTd Kc4cKdAd 7s3sQc5s 5dKs6s2s 6hQh6dJs 4h3d2dQd 9cTs7h8d",
      Solver.process("omaha-holdem 3h5c6c8sAs 9h4d9d8h 5dKs6s2s 6hQh6dJs 7s3sQc5s JhJcAhTd Kc4cKdAd 9cTs7h8d 8cKhQs7c 4h3d2dQd"));
  }

  @Test
  public void test_omaha_holdem_9959_2d3c4h5dJd_5c6cKh9d_5sAc3hJs_7c9h9s2c_2s6s3sAs_TsJh8h3d_8c9cTc7d_5hJc8dKd_2h7sThQd_Kc7h4dAd() {
    assertEquals(
      "8c9cTc7d 2h7sThQd 7c9h9s2c TsJh8h3d 5sAc3hJs 2s6s3sAs=5c6cKh9d 5hJc8dKd Kc7h4dAd",
      Solver.process("omaha-holdem 2d3c4h5dJd 5c6cKh9d 5sAc3hJs 7c9h9s2c 2s6s3sAs TsJh8h3d 8c9cTc7d 5hJc8dKd 2h7sThQd Kc7h4dAd"));
  }

  @Test
  public void test_omaha_holdem_9960_2s3h4h5dJs_Qc4cTsTd_2c5h2d7d_9c5sAh6c_9sJcAd5c_3s4d3d2h_QsAcTh6h_9d9hQh7c_8dKs8h8c_4s7hQdTc() {
    assertEquals(
      "QsAcTh6h 4s7hQdTc 8dKs8h8c 9d9hQh7c Qc4cTsTd 2c5h2d7d 3s4d3d2h 9sJcAd5c 9c5sAh6c",
      Solver.process("omaha-holdem 2s3h4h5dJs Qc4cTsTd 2c5h2d7d 9c5sAh6c 9sJcAd5c 3s4d3d2h QsAcTh6h 9d9hQh7c 8dKs8h8c 4s7hQdTc"));
  }

  @Test
  public void test_omaha_holdem_9961_9h9sAsTdTs_Jd4c5sJc_9c3d9dJh_5hAdKc2c_QdTc4h7h_Qs6s2d2h_6cKs8c7s_4sQc6hKd_JsTh3c5d_Ah5c3hAc() {
    assertEquals(
      "4sQc6hKd Jd4c5sJc 5hAdKc2c JsTh3c5d QdTc4h7h Qs6s2d2h 6cKs8c7s Ah5c3hAc 9c3d9dJh",
      Solver.process("omaha-holdem 9h9sAsTdTs Jd4c5sJc 9c3d9dJh 5hAdKc2c QdTc4h7h Qs6s2d2h 6cKs8c7s 4sQc6hKd JsTh3c5d Ah5c3hAc"));
  }

  @Test
  public void test_omaha_holdem_9962_5d7h9d9sJs_6c9c3cJh_Jd8c5h2d_2h2sQd7d_Kh6h4sKs() {
    assertEquals(
      "2h2sQd7d Jd8c5h2d Kh6h4sKs 6c9c3cJh",
      Solver.process("omaha-holdem 5d7h9d9sJs 6c9c3cJh Jd8c5h2d 2h2sQd7d Kh6h4sKs"));
  }

  @Test
  public void test_omaha_holdem_9963_2s8s9hAsJs_8d9sAc7d_Jd4s8cKh_7cJc5d8h_6cTd2h6s_Jh5hAd4d_4h9cQd5s() {
    assertEquals(
      "6cTd2h6s 4h9cQd5s 7cJc5d8h=Jd4s8cKh 8d9sAc7d Jh5hAd4d",
      Solver.process("omaha-holdem 2s8s9hAsJs 8d9sAc7d Jd4s8cKh 7cJc5d8h 6cTd2h6s Jh5hAd4d 4h9cQd5s"));
  }

  @Test
  public void test_omaha_holdem_9964_3s9d9hAhJc_KsAs8h7d_5hAdKdQs() {
    assertEquals(
      "5hAdKdQs=KsAs8h7d",
      Solver.process("omaha-holdem 3s9d9hAhJc KsAs8h7d 5hAdKdQs"));
  }

  @Test
  public void test_omaha_holdem_9965_5c7c8d9cTc_3s6h8hAh_2d7hJdTs_6s9hKcQs_ThKs6c2c_4s6dJhAs() {
    assertEquals(
      "4s6dJhAs 3s6h8hAh=6s9hKcQs 2d7hJdTs ThKs6c2c",
      Solver.process("omaha-holdem 5c7c8d9cTc 3s6h8hAh 2d7hJdTs 6s9hKcQs ThKs6c2c 4s6dJhAs"));
  }

  @Test
  public void test_omaha_holdem_9966_5c8d8h9hKs_6h7h4d5h_7cQd6s6c_3h3cTs4h_5sJc6dTd() {
    assertEquals(
      "3h3cTs4h 5sJc6dTd 6h7h4d5h=7cQd6s6c",
      Solver.process("omaha-holdem 5c8d8h9hKs 6h7h4d5h 7cQd6s6c 3h3cTs4h 5sJc6dTd"));
  }

  @Test
  public void test_omaha_holdem_9967_3c4c6h7s9s_4hTc6s5c_KcTdKhQs_8dAh6cJd_7c2h8c8h_9c3d3sAd_Qh9d2dTh_Qc5dJs3h() {
    assertEquals(
      "8dAh6cJd 7c2h8c8h Qh9d2dTh KcTdKhQs 9c3d3sAd 4hTc6s5c=Qc5dJs3h",
      Solver.process("omaha-holdem 3c4c6h7s9s 4hTc6s5c KcTdKhQs 8dAh6cJd 7c2h8c8h 9c3d3sAd Qh9d2dTh Qc5dJs3h"));
  }

  @Test
  public void test_omaha_holdem_9968_4sQcQsTcTd_4h7d3c9h_KcKh2hTs() {
    assertEquals(
      "4h7d3c9h KcKh2hTs",
      Solver.process("omaha-holdem 4sQcQsTcTd 4h7d3c9h KcKh2hTs"));
  }

  @Test
  public void test_omaha_holdem_9969_4s7h8hJcTd_AcTh3dQh_9cTs2h9d_Qc4h3s8s_TcKc7s3c_9h6s6hQs_KdAd5h9s_As2d5s8c_5cKs5dJd() {
    assertEquals(
      "KdAd5h9s As2d5s8c AcTh3dQh 5cKs5dJd Qc4h3s8s TcKc7s3c 9cTs2h9d 9h6s6hQs",
      Solver.process("omaha-holdem 4s7h8hJcTd AcTh3dQh 9cTs2h9d Qc4h3s8s TcKc7s3c 9h6s6hQs KdAd5h9s As2d5s8c 5cKs5dJd"));
  }

  @Test
  public void test_omaha_holdem_9970_2d5c8dJcJd_5d5sQh9h_8h6h5hKh_2s6s7h9d_7c3dAc9s_4d2c8cTd() {
    assertEquals(
      "7c3dAc9s 2s6s7h9d 8h6h5hKh 4d2c8cTd 5d5sQh9h",
      Solver.process("omaha-holdem 2d5c8dJcJd 5d5sQh9h 8h6h5hKh 2s6s7h9d 7c3dAc9s 4d2c8cTd"));
  }

  @Test
  public void test_omaha_holdem_9971_5c9hJhKhTs_3c6hAdTh_7s7d9cKd_3s6s3d4d_Kc8s5s2h_6c2s2c4s() {
    assertEquals(
      "6c2s2c4s 3s6s3d4d Kc8s5s2h 7s7d9cKd 3c6hAdTh",
      Solver.process("omaha-holdem 5c9hJhKhTs 3c6hAdTh 7s7d9cKd 3s6s3d4d Kc8s5s2h 6c2s2c4s"));
  }

  @Test
  public void test_omaha_holdem_9972_4d5h6hQcQs_Js3h3sAs_Kh7sTd8s() {
    assertEquals(
      "Js3h3sAs Kh7sTd8s",
      Solver.process("omaha-holdem 4d5h6hQcQs Js3h3sAs Kh7sTd8s"));
  }

  @Test
  public void test_omaha_holdem_9973_3c4d6c7d9s_As8dTsQs_8s7sKd6s_7hQd9dAd() {
    assertEquals(
      "8s7sKd6s 7hQd9dAd As8dTsQs",
      Solver.process("omaha-holdem 3c4d6c7d9s As8dTsQs 8s7sKd6s 7hQd9dAd"));
  }

  @Test
  public void test_omaha_holdem_9974_3c3h7hKhTs_Qd9s2s9c_7c7sThKd() {
    assertEquals(
      "Qd9s2s9c 7c7sThKd",
      Solver.process("omaha-holdem 3c3h7hKhTs Qd9s2s9c 7c7sThKd"));
  }

  @Test
  public void test_omaha_holdem_9975_4h5h6hAcQh_Qd9d2h8c_KhQs6c5s() {
    assertEquals(
      "Qd9d2h8c KhQs6c5s",
      Solver.process("omaha-holdem 4h5h6hAcQh Qd9d2h8c KhQs6c5s"));
  }

  @Test
  public void test_omaha_holdem_9976_3d9hJdKcTc_Qh2h6s7s_Kd6dKhAd() {
    assertEquals(
      "Qh2h6s7s Kd6dKhAd",
      Solver.process("omaha-holdem 3d9hJdKcTc Qh2h6s7s Kd6dKhAd"));
  }

  @Test
  public void test_omaha_holdem_9977_2d3c9hQsTs_4hKhAsKc_5c8h7dAd_Ah3dKs2s_6d7h8dJc_2cTh3s4d_9d9sQh5h_Ac4cTc7c_8cQdJs4s() {
    assertEquals(
      "5c8h7dAd Ac4cTc7c 4hKhAsKc Ah3dKs2s 2cTh3s4d 9d9sQh5h 6d7h8dJc=8cQdJs4s",
      Solver.process("omaha-holdem 2d3c9hQsTs 4hKhAsKc 5c8h7dAd Ah3dKs2s 6d7h8dJc 2cTh3s4d 9d9sQh5h Ac4cTc7c 8cQdJs4s"));
  }

  @Test
  public void test_omaha_holdem_9978_6h7s8sAcJs_9hAsJh4d_KhQd8d4h_Td7c3sAh_7h2hQc9d_2d7d8hQh() {
    assertEquals(
      "7h2hQc9d KhQd8d4h 2d7d8hQh Td7c3sAh 9hAsJh4d",
      Solver.process("omaha-holdem 6h7s8sAcJs 9hAsJh4d KhQd8d4h Td7c3sAh 7h2hQc9d 2d7d8hQh"));
  }

  @Test
  public void test_omaha_holdem_9979_7d8sAhJcTs_8cJhQsTc_Td5dTh9d_3s8hQc5s_JdKcAdAc_3d5h4h2c_2sQh9sKs() {
    assertEquals(
      "3d5h4h2c 3s8hQc5s 8cJhQsTc JdKcAdAc Td5dTh9d 2sQh9sKs",
      Solver.process("omaha-holdem 7d8sAhJcTs 8cJhQsTc Td5dTh9d 3s8hQc5s JdKcAdAc 3d5h4h2c 2sQh9sKs"));
  }

  @Test
  public void test_omaha_holdem_9980_2h5c9sAcKc_2dThTsJs_9cKs4d4s_Qc2c5d7s_6h3hQhQs_Tc5sJd6c_8c6d5h3d_6s7dKd3c_Kh4h7c7h_3sJcAs9d() {
    assertEquals(
      "8c6d5h3d 2dThTsJs 6h3hQhQs 6s7dKd3c=Kh4h7c7h 9cKs4d4s 3sJcAs9d Tc5sJd6c Qc2c5d7s",
      Solver.process("omaha-holdem 2h5c9sAcKc 2dThTsJs 9cKs4d4s Qc2c5d7s 6h3hQhQs Tc5sJd6c 8c6d5h3d 6s7dKd3c Kh4h7c7h 3sJcAs9d"));
  }

  @Test
  public void test_omaha_holdem_9981_2d2hAsJdQh_3d5sAh8s_Kh3cJh9c_3s4cJs9s_Kc8hJcTd_Tc9d7cQc_Ac6d7h5h_6sKs7s2s_QdTh8c6c_5dAd6h4d() {
    assertEquals(
      "3s4cJs9s Kh3cJh9c QdTh8c6c=Tc9d7cQc 5dAd6h4d Ac6d7h5h 3d5sAh8s 6sKs7s2s Kc8hJcTd",
      Solver.process("omaha-holdem 2d2hAsJdQh 3d5sAh8s Kh3cJh9c 3s4cJs9s Kc8hJcTd Tc9d7cQc Ac6d7h5h 6sKs7s2s QdTh8c6c 5dAd6h4d"));
  }

  @Test
  public void test_omaha_holdem_9982_2d2s7sKdQh_2c6sQc7h_6hKhQs8d() {
    assertEquals(
      "6hKhQs8d 2c6sQc7h",
      Solver.process("omaha-holdem 2d2s7sKdQh 2c6sQc7h 6hKhQs8d"));
  }

  @Test
  public void test_omaha_holdem_9983_4h6s7cJhKc_2sAdJsTh_7s5c8dJc() {
    assertEquals(
      "2sAdJsTh 7s5c8dJc",
      Solver.process("omaha-holdem 4h6s7cJhKc 2sAdJsTh 7s5c8dJc"));
  }

  @Test
  public void test_omaha_holdem_9984_7h9cKcTcTd_9sKhAdQc_7s3s7c6h_3h9hTs2d_QhJs8h6s() {
    assertEquals(
      "9sKhAdQc QhJs8h6s 7s3s7c6h 3h9hTs2d",
      Solver.process("omaha-holdem 7h9cKcTcTd 9sKhAdQc 7s3s7c6h 3h9hTs2d QhJs8h6s"));
  }

  @Test
  public void test_omaha_holdem_9985_AhJdKcKdTs_Qh5s8sAc_8c6d7sQs() {
    assertEquals(
      "8c6d7sQs Qh5s8sAc",
      Solver.process("omaha-holdem AhJdKcKdTs Qh5s8sAc 8c6d7sQs"));
  }

  @Test
  public void test_omaha_holdem_9986_5c6d6s8cQh_QdJdQsAh_Kc9c3dJh_6cTh8h6h_5hAc2hTs_KsKd4d4s() {
    assertEquals(
      "Kc9c3dJh 5hAc2hTs KsKd4d4s QdJdQsAh 6cTh8h6h",
      Solver.process("omaha-holdem 5c6d6s8cQh QdJdQsAh Kc9c3dJh 6cTh8h6h 5hAc2hTs KsKd4d4s"));
  }

  @Test
  public void test_omaha_holdem_9987_2d4s7h9hKc_4c5hJs4d_8c7s5d3d_6dJc5s3c_Jd7cKhTs_2c2hQcAd_9cTd3s9s_4h8s8dQd() {
    assertEquals(
      "6dJc5s3c 8c7s5d3d 4h8s8dQd Jd7cKhTs 2c2hQcAd 4c5hJs4d 9cTd3s9s",
      Solver.process("omaha-holdem 2d4s7h9hKc 4c5hJs4d 8c7s5d3d 6dJc5s3c Jd7cKhTs 2c2hQcAd 9cTd3s9s 4h8s8dQd"));
  }

  @Test
  public void test_omaha_holdem_9988_3h7c9cKsTh_JdJhQh4h_6c2d9h5s_7s8sTc9d_TsAcKc2h_2s3c6sTd_6hJc9s3d_2c3sQd4s() {
    assertEquals(
      "2c3sQd4s 6c2d9h5s 6hJc9s3d 2s3c6sTd 7s8sTc9d TsAcKc2h JdJhQh4h",
      Solver.process("omaha-holdem 3h7c9cKsTh JdJhQh4h 6c2d9h5s 7s8sTc9d TsAcKc2h 2s3c6sTd 6hJc9s3d 2c3sQd4s"));
  }

  @Test
  public void test_omaha_holdem_9989_2c7c7dAdJh_6hJs9hQc_5c8s3sQh_3hTd2s5d_6sQdTc6c_5h8dAc4h_8hTs9d2d() {
    assertEquals(
      "5c8s3sQh 3hTd2s5d=8hTs9d2d 6sQdTc6c 6hJs9hQc 5h8dAc4h",
      Solver.process("omaha-holdem 2c7c7dAdJh 6hJs9hQc 5c8s3sQh 3hTd2s5d 6sQdTc6c 5h8dAc4h 8hTs9d2d"));
  }

  @Test
  public void test_omaha_holdem_9990_5d6cAcKcTh_KhAdQc3c_As9h7d9c_2c4c9sJh_8d5c2d7s_Qd6h7c3s_2s6d7h8h() {
    assertEquals(
      "8d5c2d7s 2s6d7h8h Qd6h7c3s As9h7d9c 2c4c9sJh KhAdQc3c",
      Solver.process("omaha-holdem 5d6cAcKcTh KhAdQc3c As9h7d9c 2c4c9sJh 8d5c2d7s Qd6h7c3s 2s6d7h8h"));
  }

  @Test
  public void test_omaha_holdem_9991_2c7d9dQdTd_4d5h4cQc_AsJcJsKc_9s6s6d7s_Kh2d6hAh_9h2s8h4s_5s3sTsKs_4hJh8sAd_5c5d2hJd() {
    assertEquals(
      "Kh2d6hAh 5s3sTsKs 4d5h4cQc 9h2s8h4s 9s6s6d7s 4hJh8sAd AsJcJsKc 5c5d2hJd",
      Solver.process("omaha-holdem 2c7d9dQdTd 4d5h4cQc AsJcJsKc 9s6s6d7s Kh2d6hAh 9h2s8h4s 5s3sTsKs 4hJh8sAd 5c5d2hJd"));
  }

  @Test
  public void test_omaha_holdem_9992_3dJdJsKhTc_6c3cTs2d_Ks8s3h8d_Ad4h7c4s_2h9h2c4d() {
    assertEquals(
      "2h9h2c4d Ad4h7c4s 6c3cTs2d Ks8s3h8d",
      Solver.process("omaha-holdem 3dJdJsKhTc 6c3cTs2d Ks8s3h8d Ad4h7c4s 2h9h2c4d"));
  }

  @Test
  public void test_omaha_holdem_9993_7s8s9sAhJh_8d2s5hTh_Qs2c6dTs_7d7c3sTd_5sJsKhQc() {
    assertEquals(
      "7d7c3sTd=8d2s5hTh 5sJsKhQc Qs2c6dTs",
      Solver.process("omaha-holdem 7s8s9sAhJh 8d2s5hTh Qs2c6dTs 7d7c3sTd 5sJsKhQc"));
  }

  @Test
  public void test_omaha_holdem_9994_4h7d8d8hJd_2c4cThKs_3dQd6c3h_KcQcKd7c_7sAsAh9c_5sAd8c4d_AcQh2hJc_JsTdTs5h_Tc3s9d5c() {
    assertEquals(
      "2c4cThKs JsTdTs5h AcQh2hJc KcQcKd7c 7sAsAh9c Tc3s9d5c 3dQd6c3h 5sAd8c4d",
      Solver.process("omaha-holdem 4h7d8d8hJd 2c4cThKs 3dQd6c3h KcQcKd7c 7sAsAh9c 5sAd8c4d AcQh2hJc JsTdTs5h Tc3s9d5c"));
  }

  @Test
  public void test_omaha_holdem_9995_2d4c8cJcTs_Kh7s4hTc_2c7hKd5h_4dJd6d7d_Jh5d9s8s_7c5sQc3h_Ks5c9c6s() {
    assertEquals(
      "2c7hKd5h Kh7s4hTc 4dJd6d7d Jh5d9s8s Ks5c9c6s 7c5sQc3h",
      Solver.process("omaha-holdem 2d4c8cJcTs Kh7s4hTc 2c7hKd5h 4dJd6d7d Jh5d9s8s 7c5sQc3h Ks5c9c6s"));
  }

  @Test
  public void test_omaha_holdem_9996_5c5h8d8sAh_9dKdTd9s_JcAd2cKc_Qc7s4h5d_6hAcKs4c() {
    assertEquals(
      "9dKdTd9s 6hAcKs4c=JcAd2cKc Qc7s4h5d",
      Solver.process("omaha-holdem 5c5h8d8sAh 9dKdTd9s JcAd2cKc Qc7s4h5d 6hAcKs4c"));
  }

  @Test
  public void test_omaha_holdem_9997_2h7cAhKcTh_JdTc5cKd_7dTdKh4c_3s5d7hQs_8dJc4s3d_2sAc5s3h_7s8s9c8h_6c6s5h4d_6d2dTs6h() {
    assertEquals(
      "8dJc4s3d 6c6s5h4d 3s5d7hQs 7s8s9c8h 6d2dTs6h 7dTdKh4c=JdTc5cKd 2sAc5s3h",
      Solver.process("omaha-holdem 2h7cAhKcTh JdTc5cKd 7dTdKh4c 3s5d7hQs 8dJc4s3d 2sAc5s3h 7s8s9c8h 6c6s5h4d 6d2dTs6h"));
  }

  @Test
  public void test_omaha_holdem_9998_4s5s6cKdQc_Kc6d5h2c_9dTs6h9c_Tc2d8sQs_JdQdTd9s_4d3s2hJh_Ad6sAcQh_Ks8d2s3h_3d3c7c8h() {
    assertEquals(
      "9dTs6h9c Tc2d8sQs JdQdTd9s Ad6sAcQh Kc6d5h2c 4d3s2hJh=Ks8d2s3h 3d3c7c8h",
      Solver.process("omaha-holdem 4s5s6cKdQc Kc6d5h2c 9dTs6h9c Tc2d8sQs JdQdTd9s 4d3s2hJh Ad6sAcQh Ks8d2s3h 3d3c7c8h"));
  }

  @Test
  public void test_omaha_holdem_9999_2d3c3d4d5c_8hTh4s9s_6c8dKc5s_Qh8c7h7s_AhJhKh9d_Tc2c4h5d() {
    assertEquals(
      "AhJhKh9d 8hTh4s9s Tc2c4h5d Qh8c7h7s 6c8dKc5s",
      Solver.process("omaha-holdem 2d3c3d4d5c 8hTh4s9s 6c8dKc5s Qh8c7h7s AhJhKh9d Tc2c4h5d"));
  }

}
